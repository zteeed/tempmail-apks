package org.greenrobot.greendao;

import android.database.CrossProcessCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.greendao.g.c;
import org.greenrobot.greendao.h.b;
import org.greenrobot.greendao.i.e;
import org.greenrobot.greendao.j.h;

/* compiled from: AbstractDao */
public abstract class a<T, K> {

    /* renamed from: a  reason: collision with root package name */
    protected final org.greenrobot.greendao.i.a f14499a;

    /* renamed from: b  reason: collision with root package name */
    protected final org.greenrobot.greendao.g.a f14500b;

    /* renamed from: c  reason: collision with root package name */
    protected final boolean f14501c;

    /* renamed from: d  reason: collision with root package name */
    protected final org.greenrobot.greendao.h.a<K, T> f14502d;

    /* renamed from: e  reason: collision with root package name */
    protected final b<T> f14503e;

    /* renamed from: f  reason: collision with root package name */
    protected final e f14504f;
    protected final int g;

    public a(org.greenrobot.greendao.i.a aVar, c cVar) {
        this.f14499a = aVar;
        org.greenrobot.greendao.g.a aVar2 = aVar.f14523b;
        this.f14500b = aVar2;
        this.f14501c = aVar2.d() instanceof SQLiteDatabase;
        org.greenrobot.greendao.h.a<?, ?> d2 = aVar.d();
        this.f14502d = d2;
        if (d2 instanceof b) {
            this.f14503e = (b) d2;
        } else {
            this.f14503e = null;
        }
        this.f14504f = aVar.j;
        f fVar = aVar.h;
        this.g = fVar != null ? fVar.f14509a : -1;
    }

    private void B(Cursor cursor, CursorWindow cursorWindow, List<T> list) {
        int startPosition = cursorWindow.getStartPosition() + cursorWindow.getNumRows();
        int i = 0;
        while (true) {
            list.add(C(cursor, 0, false));
            int i2 = i + 1;
            if (i2 >= startPosition) {
                CursorWindow D = D(cursor);
                if (D != null) {
                    startPosition = D.getStartPosition() + D.getNumRows();
                } else {
                    return;
                }
            } else if (!cursor.moveToNext()) {
                return;
            }
            i = i2 + 1;
        }
    }

    private CursorWindow D(Cursor cursor) {
        CursorWindow cursorWindow;
        this.f14502d.d();
        try {
            if (cursor.moveToNext()) {
                cursorWindow = ((CrossProcessCursor) cursor).getWindow();
            } else {
                cursorWindow = null;
            }
            return cursorWindow;
        } finally {
            this.f14502d.f();
        }
    }

    private void i(K k, c cVar) {
        if (k instanceof Long) {
            cVar.c(1, ((Long) k).longValue());
        } else if (k != null) {
            cVar.a(1, k.toString());
        } else {
            throw new DaoException("Cannot delete entity, key is null");
        }
        cVar.execute();
    }

    private void k(Iterable<T> iterable, Iterable<K> iterable2) {
        ArrayList arrayList;
        a();
        c a2 = this.f14504f.a();
        this.f14500b.a();
        try {
            synchronized (a2) {
                if (this.f14502d != null) {
                    this.f14502d.f();
                    arrayList = new ArrayList();
                } else {
                    arrayList = null;
                }
                if (iterable != null) {
                    try {
                        for (T q : iterable) {
                            Object q2 = q(q);
                            i(q2, a2);
                            if (arrayList != null) {
                                arrayList.add(q2);
                            }
                        }
                    } finally {
                        if (this.f14502d != null) {
                            this.f14502d.d();
                        }
                    }
                }
                if (iterable2 != null) {
                    for (K next : iterable2) {
                        i(next, a2);
                        if (arrayList != null) {
                            arrayList.add(next);
                        }
                    }
                }
                if (this.f14502d != null) {
                    this.f14502d.d();
                }
            }
            this.f14500b.e();
            if (!(arrayList == null || this.f14502d == null)) {
                this.f14502d.e(arrayList);
            }
        } finally {
            this.f14500b.i();
        }
    }

    private long l(T t, c cVar, boolean z) {
        long j;
        if (this.f14500b.h()) {
            j = w(t, cVar);
        } else {
            this.f14500b.a();
            try {
                j = w(t, cVar);
                this.f14500b.e();
            } finally {
                this.f14500b.i();
            }
        }
        if (z) {
            L(t, j, true);
        }
        return j;
    }

    private void m(c cVar, Iterable<T> iterable, boolean z) {
        this.f14500b.a();
        try {
            synchronized (cVar) {
                if (this.f14502d != null) {
                    this.f14502d.f();
                }
                try {
                    if (this.f14501c) {
                        SQLiteStatement sQLiteStatement = (SQLiteStatement) cVar.e();
                        for (T next : iterable) {
                            d(sQLiteStatement, next);
                            if (z) {
                                L(next, sQLiteStatement.executeInsert(), false);
                            } else {
                                sQLiteStatement.execute();
                            }
                        }
                    } else {
                        for (T next2 : iterable) {
                            e(cVar, next2);
                            if (z) {
                                L(next2, cVar.f(), false);
                            } else {
                                cVar.execute();
                            }
                        }
                    }
                } finally {
                    if (this.f14502d != null) {
                        this.f14502d.d();
                    }
                }
            }
            this.f14500b.e();
        } finally {
            this.f14500b.i();
        }
    }

    private long w(T t, c cVar) {
        synchronized (cVar) {
            if (this.f14501c) {
                SQLiteStatement sQLiteStatement = (SQLiteStatement) cVar.e();
                d(sQLiteStatement, t);
                long executeInsert = sQLiteStatement.executeInsert();
                return executeInsert;
            }
            e(cVar, t);
            long f2 = cVar.f();
            return f2;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<T> A(android.database.Cursor r7) {
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
            org.greenrobot.greendao.h.a<K, T> r5 = r6.f14502d
            if (r5 == 0) goto L_0x0060
            r5.f()
            org.greenrobot.greendao.h.a<K, T> r5 = r6.f14502d
            r5.c(r0)
        L_0x0060:
            if (r3 != 0) goto L_0x006c
            if (r2 == 0) goto L_0x006c
            org.greenrobot.greendao.h.a<K, T> r0 = r6.f14502d     // Catch:{ all -> 0x0081 }
            if (r0 == 0) goto L_0x006c
            r6.B(r7, r2, r1)     // Catch:{ all -> 0x0081 }
            goto L_0x0079
        L_0x006c:
            java.lang.Object r0 = r6.C(r7, r4, r4)     // Catch:{ all -> 0x0081 }
            r1.add(r0)     // Catch:{ all -> 0x0081 }
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x0081 }
            if (r0 != 0) goto L_0x006c
        L_0x0079:
            org.greenrobot.greendao.h.a<K, T> r7 = r6.f14502d
            if (r7 == 0) goto L_0x008a
            r7.d()
            goto L_0x008a
        L_0x0081:
            r7 = move-exception
            org.greenrobot.greendao.h.a<K, T> r0 = r6.f14502d
            if (r0 == 0) goto L_0x0089
            r0.d()
        L_0x0089:
            throw r7
        L_0x008a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.greenrobot.greendao.a.A(android.database.Cursor):java.util.List");
    }

    /* access modifiers changed from: protected */
    public final T C(Cursor cursor, int i, boolean z) {
        if (this.f14503e != null) {
            if (i != 0 && cursor.isNull(this.g + i)) {
                return null;
            }
            long j = cursor.getLong(this.g + i);
            b<T> bVar = this.f14503e;
            T h = z ? bVar.h(j) : bVar.i(j);
            if (h != null) {
                return h;
            }
            T F = F(cursor, i);
            b(F);
            if (z) {
                this.f14503e.l(j, F);
            } else {
                this.f14503e.m(j, F);
            }
            return F;
        } else if (this.f14502d != null) {
            Object G = G(cursor, i);
            if (i != 0 && G == null) {
                return null;
            }
            org.greenrobot.greendao.h.a<K, T> aVar = this.f14502d;
            T b2 = z ? aVar.get(G) : aVar.b(G);
            if (b2 != null) {
                return b2;
            }
            T F2 = F(cursor, i);
            c(G, F2, z);
            return F2;
        } else if (i != 0 && G(cursor, i) == null) {
            return null;
        } else {
            T F3 = F(cursor, i);
            b(F3);
            return F3;
        }
    }

    public h<T> E() {
        return h.l(this);
    }

    /* access modifiers changed from: protected */
    public abstract T F(Cursor cursor, int i);

    /* access modifiers changed from: protected */
    public abstract K G(Cursor cursor, int i);

    public void H(T t) {
        a();
        c d2 = this.f14504f.d();
        if (this.f14500b.h()) {
            synchronized (d2) {
                if (this.f14501c) {
                    I(t, (SQLiteStatement) d2.e(), true);
                } else {
                    J(t, d2, true);
                }
            }
            return;
        }
        this.f14500b.a();
        try {
            synchronized (d2) {
                J(t, d2, true);
            }
            this.f14500b.e();
            this.f14500b.i();
        } catch (Throwable th) {
            this.f14500b.i();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public void I(T t, SQLiteStatement sQLiteStatement, boolean z) {
        d(sQLiteStatement, t);
        int length = this.f14499a.f14526e.length + 1;
        Object p = p(t);
        if (p instanceof Long) {
            sQLiteStatement.bindLong(length, ((Long) p).longValue());
        } else if (p != null) {
            sQLiteStatement.bindString(length, p.toString());
        } else {
            throw new DaoException("Cannot update entity without key - was it inserted before?");
        }
        sQLiteStatement.execute();
        c(p, t, z);
    }

    /* access modifiers changed from: protected */
    public void J(T t, c cVar, boolean z) {
        e(cVar, t);
        int length = this.f14499a.f14526e.length + 1;
        Object p = p(t);
        if (p instanceof Long) {
            cVar.c(length, ((Long) p).longValue());
        } else if (p != null) {
            cVar.a(length, p.toString());
        } else {
            throw new DaoException("Cannot update entity without key - was it inserted before?");
        }
        cVar.execute();
        c(p, t, z);
    }

    /* access modifiers changed from: protected */
    public abstract K K(T t, long j);

    /* access modifiers changed from: protected */
    public void L(T t, long j, boolean z) {
        if (j != -1) {
            c(K(t, j), t, z);
        } else {
            d.c("Could not insert row (executeInsert returned -1)");
        }
    }

    /* access modifiers changed from: protected */
    public void a() {
        if (this.f14499a.f14527f.length != 1) {
            throw new DaoException(this + " (" + this.f14499a.f14524c + ") does not have a single-column primary key");
        }
    }

    /* access modifiers changed from: protected */
    public void b(T t) {
    }

    /* access modifiers changed from: protected */
    public final void c(K k, T t, boolean z) {
        b(t);
        org.greenrobot.greendao.h.a<K, T> aVar = this.f14502d;
        if (aVar != null && k != null) {
            if (z) {
                aVar.put(k, t);
            } else {
                aVar.a(k, t);
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract void d(SQLiteStatement sQLiteStatement, T t);

    /* access modifiers changed from: protected */
    public abstract void e(c cVar, T t);

    public void f(T t) {
        a();
        h(q(t));
    }

    public void g() {
        org.greenrobot.greendao.g.a aVar = this.f14500b;
        aVar.b("DELETE FROM '" + this.f14499a.f14524c + "'");
        org.greenrobot.greendao.h.a<K, T> aVar2 = this.f14502d;
        if (aVar2 != null) {
            aVar2.clear();
        }
    }

    public void h(K k) {
        a();
        c a2 = this.f14504f.a();
        if (this.f14500b.h()) {
            synchronized (a2) {
                i(k, a2);
            }
        } else {
            this.f14500b.a();
            try {
                synchronized (a2) {
                    i(k, a2);
                }
                this.f14500b.e();
                this.f14500b.i();
            } catch (Throwable th) {
                this.f14500b.i();
                throw th;
            }
        }
        org.greenrobot.greendao.h.a<K, T> aVar = this.f14502d;
        if (aVar != null) {
            aVar.remove(k);
        }
    }

    public void j(Iterable<T> iterable) {
        k(iterable, (Iterable) null);
    }

    public String[] n() {
        return this.f14499a.f14526e;
    }

    public org.greenrobot.greendao.g.a o() {
        return this.f14500b;
    }

    /* access modifiers changed from: protected */
    public abstract K p(T t);

    /* access modifiers changed from: protected */
    public K q(T t) {
        K p = p(t);
        if (p != null) {
            return p;
        }
        if (t == null) {
            throw new NullPointerException("Entity may not be null");
        }
        throw new DaoException("Entity has no key");
    }

    public f[] r() {
        return this.f14499a.f14525d;
    }

    public String s() {
        return this.f14499a.f14524c;
    }

    public long t(T t) {
        return l(t, this.f14504f.b(), true);
    }

    public void u(Iterable<T> iterable) {
        v(iterable, x());
    }

    public void v(Iterable<T> iterable, boolean z) {
        m(this.f14504f.b(), iterable, z);
    }

    /* access modifiers changed from: protected */
    public abstract boolean x();

    public List<T> y() {
        return z(this.f14500b.f(this.f14504f.c(), (String[]) null));
    }

    /* access modifiers changed from: protected */
    public List<T> z(Cursor cursor) {
        try {
            return A(cursor);
        } finally {
            cursor.close();
        }
    }
}
