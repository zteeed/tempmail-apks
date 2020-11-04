package b.c.a.b.i.w.j;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import b.c.a.b.i.g;
import b.c.a.b.i.h;
import b.c.a.b.i.m;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.android.datatransport.runtime.synchronization.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
/* compiled from: SQLiteEventStore */
public class b0 implements c, com.google.android.datatransport.runtime.synchronization.a {

    /* renamed from: f  reason: collision with root package name */
    private static final b.c.a.b.b f2309f = b.c.a.b.b.b("proto");

    /* renamed from: b  reason: collision with root package name */
    private final h0 f2310b;

    /* renamed from: c  reason: collision with root package name */
    private final b.c.a.b.i.x.a f2311c;

    /* renamed from: d  reason: collision with root package name */
    private final b.c.a.b.i.x.a f2312d;

    /* renamed from: e  reason: collision with root package name */
    private final d f2313e;

    /* compiled from: SQLiteEventStore */
    interface b<T, U> {
        U apply(T t);
    }

    /* compiled from: SQLiteEventStore */
    private static class c {

        /* renamed from: a  reason: collision with root package name */
        final String f2314a;

        /* renamed from: b  reason: collision with root package name */
        final String f2315b;

        private c(String str, String str2) {
            this.f2314a = str;
            this.f2315b = str2;
        }
    }

    /* compiled from: SQLiteEventStore */
    interface d<T> {
        T a();
    }

    @Inject
    b0(b.c.a.b.i.x.a aVar, b.c.a.b.i.x.a aVar2, d dVar, h0 h0Var) {
        this.f2310b = h0Var;
        this.f2311c = aVar;
        this.f2312d = aVar2;
        this.f2313e = dVar;
    }

    static /* synthetic */ List A(SQLiteDatabase sQLiteDatabase) {
        return (List) S(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), t.a());
    }

    static /* synthetic */ List B(b0 b0Var, m mVar, SQLiteDatabase sQLiteDatabase) {
        List<i> K = b0Var.K(sQLiteDatabase, mVar);
        b0Var.n(K, b0Var.L(sQLiteDatabase, K));
        return K;
    }

    static /* synthetic */ Object D(b0 b0Var, List list, m mVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            boolean z = false;
            long j = cursor.getLong(0);
            if (cursor.getInt(7) != 0) {
                z = true;
            }
            h.a a2 = h.a();
            a2.j(cursor.getString(1));
            a2.i(cursor.getLong(2));
            a2.k(cursor.getLong(3));
            if (z) {
                a2.h(new g(Q(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                a2.h(new g(Q(cursor.getString(4)), b0Var.O(j)));
            }
            if (!cursor.isNull(6)) {
                a2.g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(i.a(j, mVar, a2.d()));
        }
        return null;
    }

    static /* synthetic */ Object E(Map map, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j), set);
            }
            set.add(new c(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    static /* synthetic */ Long G(b0 b0Var, m mVar, h hVar, SQLiteDatabase sQLiteDatabase) {
        if (b0Var.m()) {
            return -1L;
        }
        long d2 = b0Var.d(sQLiteDatabase, mVar);
        int e2 = b0Var.f2313e.e();
        byte[] a2 = hVar.e().a();
        boolean z = a2.length <= e2;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(d2));
        contentValues.put("transport_name", hVar.j());
        contentValues.put("timestamp_ms", Long.valueOf(hVar.f()));
        contentValues.put("uptime_ms", Long.valueOf(hVar.k()));
        contentValues.put("payload_encoding", hVar.e().b().a());
        contentValues.put("code", hVar.d());
        contentValues.put("num_attempts", 0);
        contentValues.put("inline", Boolean.valueOf(z));
        contentValues.put("payload", z ? a2 : new byte[0]);
        long insert = sQLiteDatabase.insert("events", (String) null, contentValues);
        if (!z) {
            int ceil = (int) Math.ceil(((double) a2.length) / ((double) e2));
            for (int i = 1; i <= ceil; i++) {
                byte[] copyOfRange = Arrays.copyOfRange(a2, (i - 1) * e2, Math.min(i * e2, a2.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", (String) null, contentValues2);
            }
        }
        for (Map.Entry next : hVar.i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put("name", (String) next.getKey());
            contentValues3.put("value", (String) next.getValue());
            sQLiteDatabase.insert("event_metadata", (String) null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    static /* synthetic */ byte[] H(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i += blob.length;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            byte[] bArr2 = (byte[]) arrayList.get(i3);
            System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
            i2 += bArr2.length;
        }
        return bArr;
    }

    static /* synthetic */ Object I(String str, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 10").execute();
        return null;
    }

    static /* synthetic */ Object J(long j, m mVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{mVar.b(), String.valueOf(b.c.a.b.i.y.a.a(mVar.d()))}) < 1) {
            contentValues.put("backend_name", mVar.b());
            contentValues.put("priority", Integer.valueOf(b.c.a.b.i.y.a.a(mVar.d())));
            sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
        }
        return null;
    }

    private List<i> K(SQLiteDatabase sQLiteDatabase, m mVar) {
        ArrayList arrayList = new ArrayList();
        Long h = h(sQLiteDatabase, mVar);
        if (h == null) {
            return arrayList;
        }
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        S(sQLiteDatabase2.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{h.toString()}, (String) null, (String) null, (String) null, String.valueOf(this.f2313e.d())), n.a(this, arrayList, mVar));
        return arrayList;
    }

    private Map<Long, Set<c>> L(SQLiteDatabase sQLiteDatabase, List<i> list) {
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).c());
            if (i < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        S(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), (String[]) null, (String) null, (String) null, (String) null), p.a(hashMap));
        return hashMap;
    }

    private static byte[] N(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    private byte[] O(long j) {
        return (byte[]) S(e().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, (String) null, (String) null, "sequence_num"), o.a());
    }

    private <T> T P(d<T> dVar, b<Throwable, T> bVar) {
        long a2 = this.f2312d.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e2) {
                if (this.f2312d.a() >= ((long) this.f2313e.b()) + a2) {
                    return bVar.apply(e2);
                }
                SystemClock.sleep(50);
            }
        }
    }

    private static b.c.a.b.b Q(String str) {
        if (str == null) {
            return f2309f;
        }
        return b.c.a.b.b.b(str);
    }

    private static String R(Iterable<i> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<i> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().c());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    private static <T> T S(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    private void b(SQLiteDatabase sQLiteDatabase) {
        P(q.b(sQLiteDatabase), r.a());
    }

    private long d(SQLiteDatabase sQLiteDatabase, m mVar) {
        Long h = h(sQLiteDatabase, mVar);
        if (h != null) {
            return h.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", mVar.b());
        contentValues.put("priority", Integer.valueOf(b.c.a.b.i.y.a.a(mVar.d())));
        contentValues.put("next_request_ms", 0);
        if (mVar.c() != null) {
            contentValues.put("extras", Base64.encodeToString(mVar.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
    }

    private long f() {
        return e().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    private long g() {
        return e().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    private Long h(SQLiteDatabase sQLiteDatabase, m mVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{mVar.b(), String.valueOf(b.c.a.b.i.y.a.a(mVar.d()))}));
        if (mVar.c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(mVar.c(), 0));
        }
        return (Long) S(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), (String) null, (String) null, (String) null), x.a());
    }

    private <T> T k(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase e2 = e();
        e2.beginTransaction();
        try {
            T apply = bVar.apply(e2);
            e2.setTransactionSuccessful();
            return apply;
        } finally {
            e2.endTransaction();
        }
    }

    private boolean m() {
        return f() * g() >= this.f2313e.f();
    }

    private List<i> n(List<i> list, Map<Long, Set<c>> map) {
        ListIterator<i> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            i next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.c()))) {
                h.a l = next.b().l();
                for (c cVar : map.get(Long.valueOf(next.c()))) {
                    l.c(cVar.f2314a, cVar.f2315b);
                }
                listIterator.set(i.a(next.c(), next.d(), l.d()));
            }
        }
        return list;
    }

    static /* synthetic */ Object q(Throwable th) {
        throw new SynchronizationException("Timed out while trying to acquire the lock.", th);
    }

    static /* synthetic */ SQLiteDatabase r(Throwable th) {
        throw new SynchronizationException("Timed out while trying to open db.", th);
    }

    static /* synthetic */ Long t(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    static /* synthetic */ Long u(Cursor cursor) {
        if (!cursor.moveToNext()) {
            return null;
        }
        return Long.valueOf(cursor.getLong(0));
    }

    static /* synthetic */ Boolean v(b0 b0Var, m mVar, SQLiteDatabase sQLiteDatabase) {
        Long h = b0Var.h(sQLiteDatabase, mVar);
        if (h == null) {
            return Boolean.FALSE;
        }
        return (Boolean) S(b0Var.e().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{h.toString()}), u.a());
    }

    static /* synthetic */ List x(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            m.a a2 = m.a();
            a2.b(cursor.getString(1));
            a2.d(b.c.a.b.i.y.a.b(cursor.getInt(2)));
            a2.c(N(cursor.getString(3)));
            arrayList.add(a2.a());
        }
        return arrayList;
    }

    public long C(m mVar) {
        return ((Long) S(e().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{mVar.b(), String.valueOf(b.c.a.b.i.y.a.a(mVar.d()))}), z.a())).longValue();
    }

    public boolean F(m mVar) {
        return ((Boolean) k(a0.a(this, mVar))).booleanValue();
    }

    public void M(Iterable<i> iterable) {
        if (iterable.iterator().hasNext()) {
            k(y.a("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + R(iterable)));
        }
    }

    public <T> T a(a.C0069a<T> aVar) {
        SQLiteDatabase e2 = e();
        b(e2);
        try {
            T execute = aVar.execute();
            e2.setTransactionSuccessful();
            return execute;
        } finally {
            e2.endTransaction();
        }
    }

    public int c() {
        return ((Integer) k(m.a(this.f2311c.a() - this.f2313e.c()))).intValue();
    }

    public void close() {
        this.f2310b.close();
    }

    /* access modifiers changed from: package-private */
    public SQLiteDatabase e() {
        h0 h0Var = this.f2310b;
        h0Var.getClass();
        return (SQLiteDatabase) P(s.b(h0Var), v.a());
    }

    public void i(Iterable<i> iterable) {
        if (iterable.iterator().hasNext()) {
            e().compileStatement("DELETE FROM events WHERE _id in " + R(iterable)).execute();
        }
    }

    public Iterable<i> j(m mVar) {
        return (Iterable) k(k.a(this, mVar));
    }

    public void l(m mVar, long j) {
        k(j.a(j, mVar));
    }

    public Iterable<m> w() {
        return (Iterable) k(l.a());
    }

    public i z(m mVar, h hVar) {
        b.c.a.b.i.u.a.b("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", mVar.d(), hVar.j(), mVar.b());
        long longValue = ((Long) k(w.a(this, mVar, hVar))).longValue();
        if (longValue < 1) {
            return null;
        }
        return i.a(longValue, mVar, hVar);
    }
}
