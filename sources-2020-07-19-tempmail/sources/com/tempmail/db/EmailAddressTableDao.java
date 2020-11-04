package com.tempmail.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.f;
import org.greenrobot.greendao.g.c;

public class EmailAddressTableDao extends a<e, Long> {
    public static final String TABLENAME = "EMAIL_ADDRESS_TABLE";
    private c h;

    public static class Properties {
        public static final f Domain = new f(3, String.class, "domain", false, "DOMAIN");
        public static final f EmailPrefix = new f(2, String.class, "emailPrefix", false, "EMAIL_PREFIX");
        public static final f EndTime = new f(6, Long.class, "endTime", false, "END_TIME");
        public static final f FullEmailAddress = new f(1, String.class, "fullEmailAddress", false, "FULL_EMAIL_ADDRESS");
        public static final f Id = new f(0, Long.class, "id", true, "_id");
        public static final f IsDefault = new f(4, Boolean.class, "isDefault", false, "IS_DEFAULT");
        public static final f IsInfinity = new f(7, Boolean.class, "isInfinity", false, "IS_INFINITY");
        public static final f StartTime = new f(5, Long.class, "startTime", false, "START_TIME");
    }

    public EmailAddressTableDao(org.greenrobot.greendao.i.a aVar, c cVar) {
        super(aVar, cVar);
        this.h = cVar;
    }

    public static void P(org.greenrobot.greendao.g.a aVar, boolean z) {
        String str = z ? "IF NOT EXISTS " : "";
        aVar.b("CREATE TABLE " + str + "\"EMAIL_ADDRESS_TABLE\" (\"_id\" INTEGER PRIMARY KEY ,\"FULL_EMAIL_ADDRESS\" TEXT,\"EMAIL_PREFIX\" TEXT,\"DOMAIN\" TEXT,\"IS_DEFAULT\" INTEGER,\"START_TIME\" INTEGER,\"END_TIME\" INTEGER,\"IS_INFINITY\" INTEGER);");
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public final void b(e eVar) {
        super.b(eVar);
        eVar.f(this.h);
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public final void d(SQLiteStatement sQLiteStatement, e eVar) {
        sQLiteStatement.clearBindings();
        Long q = eVar.q();
        if (q != null) {
            sQLiteStatement.bindLong(1, q.longValue());
        }
        String p = eVar.p();
        if (p != null) {
            sQLiteStatement.bindString(2, p);
        }
        String n = eVar.n();
        if (n != null) {
            sQLiteStatement.bindString(3, n);
        }
        String k = eVar.k();
        if (k != null) {
            sQLiteStatement.bindString(4, k);
        }
        Boolean r = eVar.r();
        long j = 1;
        if (r != null) {
            sQLiteStatement.bindLong(5, r.booleanValue() ? 1 : 0);
        }
        Long u = eVar.u();
        if (u != null) {
            sQLiteStatement.bindLong(6, u.longValue());
        }
        Long o = eVar.o();
        if (o != null) {
            sQLiteStatement.bindLong(7, o.longValue());
        }
        Boolean t = eVar.t();
        if (t != null) {
            if (!t.booleanValue()) {
                j = 0;
            }
            sQLiteStatement.bindLong(8, j);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public final void e(c cVar, e eVar) {
        cVar.d();
        Long q = eVar.q();
        if (q != null) {
            cVar.c(1, q.longValue());
        }
        String p = eVar.p();
        if (p != null) {
            cVar.a(2, p);
        }
        String n = eVar.n();
        if (n != null) {
            cVar.a(3, n);
        }
        String k = eVar.k();
        if (k != null) {
            cVar.a(4, k);
        }
        Boolean r = eVar.r();
        long j = 1;
        if (r != null) {
            cVar.c(5, r.booleanValue() ? 1 : 0);
        }
        Long u = eVar.u();
        if (u != null) {
            cVar.c(6, u.longValue());
        }
        Long o = eVar.o();
        if (o != null) {
            cVar.c(7, o.longValue());
        }
        Boolean t = eVar.t();
        if (t != null) {
            if (!t.booleanValue()) {
                j = 0;
            }
            cVar.c(8, j);
        }
    }

    /* renamed from: Q */
    public Long p(e eVar) {
        if (eVar != null) {
            return eVar.q();
        }
        return null;
    }

    /* renamed from: R */
    public e F(Cursor cursor, int i) {
        Boolean bool;
        Boolean bool2;
        int i2 = i + 0;
        Long valueOf = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        String string = cursor.isNull(i3) ? null : cursor.getString(i3);
        int i4 = i + 2;
        String string2 = cursor.isNull(i4) ? null : cursor.getString(i4);
        int i5 = i + 3;
        String string3 = cursor.isNull(i5) ? null : cursor.getString(i5);
        int i6 = i + 4;
        boolean z = true;
        if (cursor.isNull(i6)) {
            bool = null;
        } else {
            bool = Boolean.valueOf(cursor.getShort(i6) != 0);
        }
        int i7 = i + 5;
        Long valueOf2 = cursor.isNull(i7) ? null : Long.valueOf(cursor.getLong(i7));
        int i8 = i + 6;
        Long valueOf3 = cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8));
        int i9 = i + 7;
        if (cursor.isNull(i9)) {
            bool2 = null;
        } else {
            if (cursor.getShort(i9) == 0) {
                z = false;
            }
            bool2 = Boolean.valueOf(z);
        }
        return new e(valueOf, string, string2, string3, bool, valueOf2, valueOf3, bool2);
    }

    /* renamed from: S */
    public Long G(Cursor cursor, int i) {
        int i2 = i + 0;
        if (cursor.isNull(i2)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public final Long K(e eVar, long j) {
        eVar.E(Long.valueOf(j));
        return Long.valueOf(j);
    }

    /* access modifiers changed from: protected */
    public final boolean x() {
        return true;
    }
}
