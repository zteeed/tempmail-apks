package org.greenrobot.greendao;

import android.database.CrossProcessCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.greenrobot.greendao.g.c;
import org.greenrobot.greendao.h.b;
import org.greenrobot.greendao.i.e;
import org.greenrobot.greendao.j.g;
import org.greenrobot.greendao.j.h;
import rx.schedulers.Schedulers;

/* compiled from: AbstractDao */
public abstract class a<T, K> {
    protected final org.greenrobot.greendao.i.a config;
    protected final org.greenrobot.greendao.g.a db;
    protected final org.greenrobot.greendao.h.a<K, T> identityScope;
    protected final b<T> identityScopeLong;
    protected final boolean isStandardSQLite;
    protected final int pkOrdinal;
    private volatile org.greenrobot.greendao.k.b<T, K> rxDao;
    private volatile org.greenrobot.greendao.k.b<T, K> rxDaoPlain;
    protected final c session;
    protected final e statements;

    public a(org.greenrobot.greendao.i.a aVar) {
        this(aVar, (c) null);
    }

    private void deleteByKeyInsideSynchronized(K k, c cVar) {
        if (k instanceof Long) {
            cVar.d(1, ((Long) k).longValue());
        } else if (k != null) {
            cVar.b(1, k.toString());
        } else {
            throw new DaoException("Cannot delete entity, key is null");
        }
        cVar.execute();
    }

    private void deleteInTxInternal(Iterable<T> iterable, Iterable<K> iterable2) {
        ArrayList arrayList;
        assertSinglePk();
        c b2 = this.statements.b();
        this.db.a();
        try {
            synchronized (b2) {
                if (this.identityScope != null) {
                    this.identityScope.g();
                    arrayList = new ArrayList();
                } else {
                    arrayList = null;
                }
                if (iterable != null) {
                    try {
                        for (T keyVerified : iterable) {
                            Object keyVerified2 = getKeyVerified(keyVerified);
                            deleteByKeyInsideSynchronized(keyVerified2, b2);
                            if (arrayList != null) {
                                arrayList.add(keyVerified2);
                            }
                        }
                    } finally {
                        if (this.identityScope != null) {
                            this.identityScope.e();
                        }
                    }
                }
                if (iterable2 != null) {
                    for (K next : iterable2) {
                        deleteByKeyInsideSynchronized(next, b2);
                        if (arrayList != null) {
                            arrayList.add(next);
                        }
                    }
                }
                if (this.identityScope != null) {
                    this.identityScope.e();
                }
            }
            this.db.e();
            if (!(arrayList == null || this.identityScope == null)) {
                this.identityScope.f(arrayList);
            }
        } finally {
            this.db.i();
        }
    }

    private long executeInsert(T t, c cVar, boolean z) {
        long j;
        if (this.db.h()) {
            j = insertInsideTx(t, cVar);
        } else {
            this.db.a();
            try {
                j = insertInsideTx(t, cVar);
                this.db.e();
            } finally {
                this.db.i();
            }
        }
        if (z) {
            updateKeyAfterInsertAndAttach(t, j, true);
        }
        return j;
    }

    private void executeInsertInTx(c cVar, Iterable<T> iterable, boolean z) {
        this.db.a();
        try {
            synchronized (cVar) {
                if (this.identityScope != null) {
                    this.identityScope.g();
                }
                try {
                    if (this.isStandardSQLite) {
                        SQLiteStatement sQLiteStatement = (SQLiteStatement) cVar.f();
                        for (T next : iterable) {
                            bindValues(sQLiteStatement, next);
                            if (z) {
                                updateKeyAfterInsertAndAttach(next, sQLiteStatement.executeInsert(), false);
                            } else {
                                sQLiteStatement.execute();
                            }
                        }
                    } else {
                        for (T next2 : iterable) {
                            bindValues(cVar, next2);
                            if (z) {
                                updateKeyAfterInsertAndAttach(next2, cVar.g(), false);
                            } else {
                                cVar.execute();
                            }
                        }
                    }
                } finally {
                    if (this.identityScope != null) {
                        this.identityScope.e();
                    }
                }
            }
            this.db.e();
        } finally {
            this.db.i();
        }
    }

    private long insertInsideTx(T t, c cVar) {
        synchronized (cVar) {
            if (this.isStandardSQLite) {
                SQLiteStatement sQLiteStatement = (SQLiteStatement) cVar.f();
                bindValues(sQLiteStatement, t);
                long executeInsert = sQLiteStatement.executeInsert();
                return executeInsert;
            }
            bindValues(cVar, t);
            long g = cVar.g();
            return g;
        }
    }

    private void loadAllUnlockOnWindowBounds(Cursor cursor, CursorWindow cursorWindow, List<T> list) {
        int startPosition = cursorWindow.getStartPosition() + cursorWindow.getNumRows();
        int i = 0;
        while (true) {
            list.add(loadCurrent(cursor, 0, false));
            int i2 = i + 1;
            if (i2 >= startPosition) {
                CursorWindow moveToNextUnlocked = moveToNextUnlocked(cursor);
                if (moveToNextUnlocked != null) {
                    startPosition = moveToNextUnlocked.getStartPosition() + moveToNextUnlocked.getNumRows();
                } else {
                    return;
                }
            } else if (!cursor.moveToNext()) {
                return;
            }
            i = i2 + 1;
        }
    }

    private CursorWindow moveToNextUnlocked(Cursor cursor) {
        CursorWindow cursorWindow;
        this.identityScope.e();
        try {
            if (cursor.moveToNext()) {
                cursorWindow = ((CrossProcessCursor) cursor).getWindow();
            } else {
                cursorWindow = null;
            }
            return cursorWindow;
        } finally {
            this.identityScope.g();
        }
    }

    /* access modifiers changed from: protected */
    public void assertSinglePk() {
        if (this.config.f15096f.length != 1) {
            throw new DaoException(this + " (" + this.config.f15093c + ") does not have a single-column primary key");
        }
    }

    /* access modifiers changed from: protected */
    public void attachEntity(T t) {
    }

    /* access modifiers changed from: protected */
    public final void attachEntity(K k, T t, boolean z) {
        attachEntity(t);
        org.greenrobot.greendao.h.a<K, T> aVar = this.identityScope;
        if (aVar != null && k != null) {
            if (z) {
                aVar.put(k, t);
            } else {
                aVar.a(k, t);
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract void bindValues(SQLiteStatement sQLiteStatement, T t);

    /* access modifiers changed from: protected */
    public abstract void bindValues(c cVar, T t);

    public long count() {
        return this.statements.a().a();
    }

    public void delete(T t) {
        assertSinglePk();
        deleteByKey(getKeyVerified(t));
    }

    public void deleteAll() {
        org.greenrobot.greendao.g.a aVar = this.db;
        aVar.b("DELETE FROM '" + this.config.f15093c + "'");
        org.greenrobot.greendao.h.a<K, T> aVar2 = this.identityScope;
        if (aVar2 != null) {
            aVar2.clear();
        }
    }

    public void deleteByKey(K k) {
        assertSinglePk();
        c b2 = this.statements.b();
        if (this.db.h()) {
            synchronized (b2) {
                deleteByKeyInsideSynchronized(k, b2);
            }
        } else {
            this.db.a();
            try {
                synchronized (b2) {
                    deleteByKeyInsideSynchronized(k, b2);
                }
                this.db.e();
                this.db.i();
            } catch (Throwable th) {
                this.db.i();
                throw th;
            }
        }
        org.greenrobot.greendao.h.a<K, T> aVar = this.identityScope;
        if (aVar != null) {
            aVar.remove(k);
        }
    }

    public void deleteByKeyInTx(Iterable<K> iterable) {
        deleteInTxInternal((Iterable) null, iterable);
    }

    public void deleteInTx(Iterable<T> iterable) {
        deleteInTxInternal(iterable, (Iterable) null);
    }

    public boolean detach(T t) {
        if (this.identityScope == null) {
            return false;
        }
        return this.identityScope.d(getKeyVerified(t), t);
    }

    public void detachAll() {
        org.greenrobot.greendao.h.a<K, T> aVar = this.identityScope;
        if (aVar != null) {
            aVar.clear();
        }
    }

    public String[] getAllColumns() {
        return this.config.f15095e;
    }

    public org.greenrobot.greendao.g.a getDatabase() {
        return this.db;
    }

    /* access modifiers changed from: protected */
    public abstract K getKey(T t);

    /* access modifiers changed from: protected */
    public K getKeyVerified(T t) {
        K key = getKey(t);
        if (key != null) {
            return key;
        }
        if (t == null) {
            throw new NullPointerException("Entity may not be null");
        }
        throw new DaoException("Entity has no key");
    }

    public String[] getNonPkColumns() {
        return this.config.g;
    }

    public String[] getPkColumns() {
        return this.config.f15096f;
    }

    public f getPkProperty() {
        return this.config.h;
    }

    public f[] getProperties() {
        return this.config.f15094d;
    }

    public c getSession() {
        return this.session;
    }

    /* access modifiers changed from: package-private */
    public e getStatements() {
        return this.config.j;
    }

    public String getTablename() {
        return this.config.f15093c;
    }

    /* access modifiers changed from: protected */
    public abstract boolean hasKey(T t);

    public long insert(T t) {
        return executeInsert(t, this.statements.d(), true);
    }

    public void insertInTx(Iterable<T> iterable) {
        insertInTx(iterable, isEntityUpdateable());
    }

    public long insertOrReplace(T t) {
        return executeInsert(t, this.statements.c(), true);
    }

    public void insertOrReplaceInTx(Iterable<T> iterable, boolean z) {
        executeInsertInTx(this.statements.c(), iterable, z);
    }

    public long insertWithoutSettingPk(T t) {
        return executeInsert(t, this.statements.c(), false);
    }

    /* access modifiers changed from: protected */
    public abstract boolean isEntityUpdateable();

    public T load(K k) {
        T t;
        assertSinglePk();
        if (k == null) {
            return null;
        }
        org.greenrobot.greendao.h.a<K, T> aVar = this.identityScope;
        if (aVar != null && (t = aVar.get(k)) != null) {
            return t;
        }
        return loadUniqueAndCloseCursor(this.db.f(this.statements.f(), new String[]{k.toString()}));
    }

    public List<T> loadAll() {
        return loadAllAndCloseCursor(this.db.f(this.statements.e(), (String[]) null));
    }

    /* access modifiers changed from: protected */
    public List<T> loadAllAndCloseCursor(Cursor cursor) {
        try {
            return loadAllFromCursor(cursor);
        } finally {
            cursor.close();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<T> loadAllFromCursor(android.database.Cursor r7) {
        /*
            r6 = this;
            int r0 = r7.getCount()
            if (r0 != 0) goto L_0x000c
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            return r7
        L_0x000c:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r2 = 0
            boolean r3 = r7 instanceof android.database.CrossProcessCursor
            r4 = 0
            if (r3 == 0) goto L_0x004d
            r2 = r7
            android.database.CrossProcessCursor r2 = (android.database.CrossProcessCursor) r2
            android.database.CursorWindow r2 = r2.getWindow()
            if (r2 == 0) goto L_0x004d
            int r3 = r2.getNumRows()
            if (r3 != r0) goto L_0x002d
            org.greenrobot.greendao.i.b r7 = new org.greenrobot.greendao.i.b
            r7.<init>(r2)
            r3 = 1
            goto L_0x004e
        L_0x002d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Window vs. result size: "
            r3.append(r5)
            int r5 = r2.getNumRows()
            r3.append(r5)
            java.lang.String r5 = "/"
            r3.append(r5)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            org.greenrobot.greendao.d.a(r3)
        L_0x004d:
            r3 = 0
        L_0x004e:
            boolean r5 = r7.moveToFirst()
            if (r5 == 0) goto L_0x008a
            org.greenrobot.greendao.h.a<K, T> r5 = r6.identityScope
            if (r5 == 0) goto L_0x0060
            r5.g()
            org.greenrobot.greendao.h.a<K, T> r5 = r6.identityScope
            r5.c(r0)
        L_0x0060:
            if (r3 != 0) goto L_0x006c
            if (r2 == 0) goto L_0x006c
            org.greenrobot.greendao.h.a<K, T> r0 = r6.identityScope     // Catch:{ all -> 0x0081 }
            if (r0 == 0) goto L_0x006c
            r6.loadAllUnlockOnWindowBounds(r7, r2, r1)     // Catch:{ all -> 0x0081 }
            goto L_0x0079
        L_0x006c:
            java.lang.Object r0 = r6.loadCurrent(r7, r4, r4)     // Catch:{ all -> 0x0081 }
            r1.add(r0)     // Catch:{ all -> 0x0081 }
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x0081 }
            if (r0 != 0) goto L_0x006c
        L_0x0079:
            org.greenrobot.greendao.h.a<K, T> r7 = r6.identityScope
            if (r7 == 0) goto L_0x008a
            r7.e()
            goto L_0x008a
        L_0x0081:
            r7 = move-exception
            org.greenrobot.greendao.h.a<K, T> r0 = r6.identityScope
            if (r0 == 0) goto L_0x0089
            r0.e()
        L_0x0089:
            throw r7
        L_0x008a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.greenrobot.greendao.a.loadAllFromCursor(android.database.Cursor):java.util.List");
    }

    public T loadByRowId(long j) {
        return loadUniqueAndCloseCursor(this.db.f(this.statements.g(), new String[]{Long.toString(j)}));
    }

    /* access modifiers changed from: protected */
    public final T loadCurrent(Cursor cursor, int i, boolean z) {
        if (this.identityScopeLong != null) {
            if (i != 0 && cursor.isNull(this.pkOrdinal + i)) {
                return null;
            }
            long j = cursor.getLong(this.pkOrdinal + i);
            b<T> bVar = this.identityScopeLong;
            T j2 = z ? bVar.j(j) : bVar.k(j);
            if (j2 != null) {
                return j2;
            }
            T readEntity = readEntity(cursor, i);
            attachEntity(readEntity);
            if (z) {
                this.identityScopeLong.n(j, readEntity);
            } else {
                this.identityScopeLong.o(j, readEntity);
            }
            return readEntity;
        } else if (this.identityScope != null) {
            Object readKey = readKey(cursor, i);
            if (i != 0 && readKey == null) {
                return null;
            }
            org.greenrobot.greendao.h.a<K, T> aVar = this.identityScope;
            T b2 = z ? aVar.get(readKey) : aVar.b(readKey);
            if (b2 != null) {
                return b2;
            }
            T readEntity2 = readEntity(cursor, i);
            attachEntity(readKey, readEntity2, z);
            return readEntity2;
        } else if (i != 0 && readKey(cursor, i) == null) {
            return null;
        } else {
            T readEntity3 = readEntity(cursor, i);
            attachEntity(readEntity3);
            return readEntity3;
        }
    }

    /* access modifiers changed from: protected */
    public final <O> O loadCurrentOther(a<O, ?> aVar, Cursor cursor, int i) {
        return aVar.loadCurrent(cursor, i, true);
    }

    /* access modifiers changed from: protected */
    public T loadUnique(Cursor cursor) {
        if (!cursor.moveToFirst()) {
            return null;
        }
        if (cursor.isLast()) {
            return loadCurrent(cursor, 0, true);
        }
        throw new DaoException("Expected unique result, but count was " + cursor.getCount());
    }

    /* access modifiers changed from: protected */
    public T loadUniqueAndCloseCursor(Cursor cursor) {
        try {
            return loadUnique(cursor);
        } finally {
            cursor.close();
        }
    }

    public h<T> queryBuilder() {
        return h.l(this);
    }

    public List<T> queryRaw(String str, String... strArr) {
        org.greenrobot.greendao.g.a aVar = this.db;
        return loadAllAndCloseCursor(aVar.f(this.statements.e() + str, strArr));
    }

    public g<T> queryRawCreate(String str, Object... objArr) {
        return queryRawCreateListArgs(str, Arrays.asList(objArr));
    }

    public g<T> queryRawCreateListArgs(String str, Collection<Object> collection) {
        return g.g(this, this.statements.e() + str, collection.toArray());
    }

    /* access modifiers changed from: protected */
    public abstract T readEntity(Cursor cursor, int i);

    /* access modifiers changed from: protected */
    public abstract void readEntity(Cursor cursor, T t, int i);

    /* access modifiers changed from: protected */
    public abstract K readKey(Cursor cursor, int i);

    public void refresh(T t) {
        assertSinglePk();
        Object keyVerified = getKeyVerified(t);
        Cursor f2 = this.db.f(this.statements.f(), new String[]{keyVerified.toString()});
        try {
            if (!f2.moveToFirst()) {
                throw new DaoException("Entity does not exist in the database anymore: " + t.getClass() + " with key " + keyVerified);
            } else if (f2.isLast()) {
                readEntity(f2, t, 0);
                attachEntity(keyVerified, t, true);
            } else {
                throw new DaoException("Expected unique result, but count was " + f2.getCount());
            }
        } finally {
            f2.close();
        }
    }

    public org.greenrobot.greendao.k.b<T, K> rx() {
        if (this.rxDao == null) {
            this.rxDao = new org.greenrobot.greendao.k.b<>(this, Schedulers.io());
        }
        return this.rxDao;
    }

    public org.greenrobot.greendao.k.b<T, K> rxPlain() {
        if (this.rxDaoPlain == null) {
            this.rxDaoPlain = new org.greenrobot.greendao.k.b<>(this);
        }
        return this.rxDaoPlain;
    }

    public void save(T t) {
        if (hasKey(t)) {
            update(t);
        } else {
            insert(t);
        }
    }

    public void saveInTx(T... tArr) {
        saveInTx(Arrays.asList(tArr));
    }

    public void update(T t) {
        assertSinglePk();
        c h = this.statements.h();
        if (this.db.h()) {
            synchronized (h) {
                if (this.isStandardSQLite) {
                    updateInsideSynchronized(t, (SQLiteStatement) h.f(), true);
                } else {
                    updateInsideSynchronized(t, h, true);
                }
            }
            return;
        }
        this.db.a();
        try {
            synchronized (h) {
                updateInsideSynchronized(t, h, true);
            }
            this.db.e();
            this.db.i();
        } catch (Throwable th) {
            this.db.i();
            throw th;
        }
    }

    public void updateInTx(Iterable<T> iterable) {
        c h = this.statements.h();
        this.db.a();
        try {
            synchronized (h) {
                if (this.identityScope != null) {
                    this.identityScope.g();
                }
                try {
                    if (this.isStandardSQLite) {
                        SQLiteStatement sQLiteStatement = (SQLiteStatement) h.f();
                        for (T updateInsideSynchronized : iterable) {
                            updateInsideSynchronized(updateInsideSynchronized, sQLiteStatement, false);
                        }
                    } else {
                        for (T updateInsideSynchronized2 : iterable) {
                            updateInsideSynchronized(updateInsideSynchronized2, h, false);
                        }
                    }
                } finally {
                    if (this.identityScope != null) {
                        this.identityScope.e();
                    }
                }
            }
            this.db.e();
            try {
                this.db.i();
                e = null;
                if (e != null) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                throw e2;
            }
        } catch (RuntimeException e3) {
            e = e3;
            try {
                this.db.i();
            } catch (RuntimeException e4) {
                d.f("Could not end transaction (rethrowing initial exception)", e4);
                throw e;
            }
        } catch (Throwable th) {
            try {
                this.db.i();
                throw th;
            } catch (RuntimeException e5) {
                throw e5;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void updateInsideSynchronized(T t, c cVar, boolean z) {
        bindValues(cVar, t);
        int length = this.config.f15095e.length + 1;
        Object key = getKey(t);
        if (key instanceof Long) {
            cVar.d(length, ((Long) key).longValue());
        } else if (key != null) {
            cVar.b(length, key.toString());
        } else {
            throw new DaoException("Cannot update entity without key - was it inserted before?");
        }
        cVar.execute();
        attachEntity(key, t, z);
    }

    /* access modifiers changed from: protected */
    public abstract K updateKeyAfterInsert(T t, long j);

    /* access modifiers changed from: protected */
    public void updateKeyAfterInsertAndAttach(T t, long j, boolean z) {
        if (j != -1) {
            attachEntity(updateKeyAfterInsert(t, j), t, z);
        } else {
            d.e("Could not insert row (executeInsert returned -1)");
        }
    }

    public a(org.greenrobot.greendao.i.a aVar, c cVar) {
        this.config = aVar;
        this.session = cVar;
        org.greenrobot.greendao.g.a aVar2 = aVar.f15092b;
        this.db = aVar2;
        this.isStandardSQLite = aVar2.d() instanceof SQLiteDatabase;
        org.greenrobot.greendao.h.a<?, ?> d2 = aVar.d();
        this.identityScope = d2;
        if (d2 instanceof b) {
            this.identityScopeLong = (b) d2;
        } else {
            this.identityScopeLong = null;
        }
        this.statements = aVar.j;
        f fVar = aVar.h;
        this.pkOrdinal = fVar != null ? fVar.f15075a : -1;
    }

    public void deleteByKeyInTx(K... kArr) {
        deleteInTxInternal((Iterable) null, Arrays.asList(kArr));
    }

    public void deleteInTx(T... tArr) {
        deleteInTxInternal(Arrays.asList(tArr), (Iterable) null);
    }

    public void insertInTx(T... tArr) {
        insertInTx(Arrays.asList(tArr), isEntityUpdateable());
    }

    public void saveInTx(Iterable<T> iterable) {
        int i = 0;
        int i2 = 0;
        for (T hasKey : iterable) {
            if (hasKey(hasKey)) {
                i++;
            } else {
                i2++;
            }
        }
        if (i > 0 && i2 > 0) {
            ArrayList arrayList = new ArrayList(i);
            ArrayList arrayList2 = new ArrayList(i2);
            for (T next : iterable) {
                if (hasKey(next)) {
                    arrayList.add(next);
                } else {
                    arrayList2.add(next);
                }
            }
            this.db.a();
            try {
                updateInTx(arrayList);
                insertInTx(arrayList2);
                this.db.e();
            } finally {
                this.db.i();
            }
        } else if (i2 > 0) {
            insertInTx(iterable);
        } else if (i > 0) {
            updateInTx(iterable);
        }
    }

    public void insertInTx(Iterable<T> iterable, boolean z) {
        executeInsertInTx(this.statements.d(), iterable, z);
    }

    public void insertOrReplaceInTx(Iterable<T> iterable) {
        insertOrReplaceInTx(iterable, isEntityUpdateable());
    }

    public void insertOrReplaceInTx(T... tArr) {
        insertOrReplaceInTx(Arrays.asList(tArr), isEntityUpdateable());
    }

    /* access modifiers changed from: protected */
    public void updateInsideSynchronized(T t, SQLiteStatement sQLiteStatement, boolean z) {
        bindValues(sQLiteStatement, t);
        int length = this.config.f15095e.length + 1;
        Object key = getKey(t);
        if (key instanceof Long) {
            sQLiteStatement.bindLong(length, ((Long) key).longValue());
        } else if (key != null) {
            sQLiteStatement.bindString(length, key.toString());
        } else {
            throw new DaoException("Cannot update entity without key - was it inserted before?");
        }
        sQLiteStatement.execute();
        attachEntity(key, t, z);
    }

    public void updateInTx(T... tArr) {
        updateInTx(Arrays.asList(tArr));
    }
}
