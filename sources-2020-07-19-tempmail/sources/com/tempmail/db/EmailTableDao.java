package com.tempmail.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import java.util.List;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.f;
import org.greenrobot.greendao.g.c;
import org.greenrobot.greendao.j.g;
import org.greenrobot.greendao.j.h;
import org.greenrobot.greendao.j.j;

public class EmailTableDao extends a<f, Long> {
    public static final String TABLENAME = "EMAIL_TABLE";
    private c h;
    private g<f> i;

    public static class Properties {
        public static final f Eid = new f(3, String.class, "eid", false, "EID");
        public static final f EmailAddress = new f(1, String.class, "emailAddress", false, "EMAIL_ADDRESS");
        public static final f EmailAddressId = new f(2, Long.class, "emailAddressId", false, "EMAIL_ADDRESS_ID");
        public static final f FromField = new f(5, String.class, "fromField", false, "FROM_FIELD");
        public static final f Id = new f(0, Long.class, "id", true, "_id");
        public static final f IsChecked = new f(4, Boolean.class, "isChecked", false, "IS_CHECKED");
        public static final f IsDeleted = new f(8, Boolean.class, "isDeleted", false, "IS_DELETED");
        public static final f Subject = new f(6, String.class, "subject", false, "SUBJECT");
        public static final f Timestamp = new f(7, Double.class, "timestamp", false, "TIMESTAMP");
    }

    public EmailTableDao(org.greenrobot.greendao.i.a aVar, c cVar) {
        super(aVar, cVar);
        this.h = cVar;
    }

    public static void Q(org.greenrobot.greendao.g.a aVar, boolean z) {
        String str = z ? "IF NOT EXISTS " : "";
        aVar.b("CREATE TABLE " + str + "\"EMAIL_TABLE\" (\"_id\" INTEGER PRIMARY KEY ,\"EMAIL_ADDRESS\" TEXT,\"EMAIL_ADDRESS_ID\" INTEGER,\"EID\" TEXT,\"IS_CHECKED\" INTEGER,\"FROM_FIELD\" TEXT,\"SUBJECT\" TEXT,\"TIMESTAMP\" REAL,\"IS_DELETED\" INTEGER);");
    }

    public List<f> M(String str) {
        synchronized (this) {
            if (this.i == null) {
                h E = E();
                E.p(Properties.EmailAddress.a((Object) null), new j[0]);
                this.i = E.c();
            }
        }
        g<f> f2 = this.i.f();
        f2.h(0, str);
        return f2.g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public final void b(f fVar) {
        super.b(fVar);
        fVar.a(this.h);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public final void d(SQLiteStatement sQLiteStatement, f fVar) {
        sQLiteStatement.clearBindings();
        Long i2 = fVar.i();
        if (i2 != null) {
            sQLiteStatement.bindLong(1, i2.longValue());
        }
        String e2 = fVar.e();
        if (e2 != null) {
            sQLiteStatement.bindString(2, e2);
        }
        Long f2 = fVar.f();
        if (f2 != null) {
            sQLiteStatement.bindLong(3, f2.longValue());
        }
        String d2 = fVar.d();
        if (d2 != null) {
            sQLiteStatement.bindString(4, d2);
        }
        Boolean j = fVar.j();
        long j2 = 1;
        if (j != null) {
            sQLiteStatement.bindLong(5, j.booleanValue() ? 1 : 0);
        }
        String g = fVar.g();
        if (g != null) {
            sQLiteStatement.bindString(6, g);
        }
        String l = fVar.l();
        if (l != null) {
            sQLiteStatement.bindString(7, l);
        }
        Double o = fVar.o();
        if (o != null) {
            sQLiteStatement.bindDouble(8, o.doubleValue());
        }
        Boolean k = fVar.k();
        if (k != null) {
            if (!k.booleanValue()) {
                j2 = 0;
            }
            sQLiteStatement.bindLong(9, j2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public final void e(c cVar, f fVar) {
        cVar.d();
        Long i2 = fVar.i();
        if (i2 != null) {
            cVar.c(1, i2.longValue());
        }
        String e2 = fVar.e();
        if (e2 != null) {
            cVar.a(2, e2);
        }
        Long f2 = fVar.f();
        if (f2 != null) {
            cVar.c(3, f2.longValue());
        }
        String d2 = fVar.d();
        if (d2 != null) {
            cVar.a(4, d2);
        }
        Boolean j = fVar.j();
        long j2 = 1;
        if (j != null) {
            cVar.c(5, j.booleanValue() ? 1 : 0);
        }
        String g = fVar.g();
        if (g != null) {
            cVar.a(6, g);
        }
        String l = fVar.l();
        if (l != null) {
            cVar.a(7, l);
        }
        Double o = fVar.o();
        if (o != null) {
            cVar.b(8, o.doubleValue());
        }
        Boolean k = fVar.k();
        if (k != null) {
            if (!k.booleanValue()) {
                j2 = 0;
            }
            cVar.c(9, j2);
        }
    }

    /* renamed from: R */
    public Long p(f fVar) {
        if (fVar != null) {
            return fVar.i();
        }
        return null;
    }

    /* renamed from: S */
    public f F(Cursor cursor, int i2) {
        Boolean bool;
        Boolean bool2;
        Cursor cursor2 = cursor;
        int i3 = i2 + 0;
        Long valueOf = cursor2.isNull(i3) ? null : Long.valueOf(cursor2.getLong(i3));
        int i4 = i2 + 1;
        String string = cursor2.isNull(i4) ? null : cursor2.getString(i4);
        int i5 = i2 + 2;
        Long valueOf2 = cursor2.isNull(i5) ? null : Long.valueOf(cursor2.getLong(i5));
        int i6 = i2 + 3;
        String string2 = cursor2.isNull(i6) ? null : cursor2.getString(i6);
        int i7 = i2 + 4;
        boolean z = true;
        if (cursor2.isNull(i7)) {
            bool = null;
        } else {
            bool = Boolean.valueOf(cursor2.getShort(i7) != 0);
        }
        int i8 = i2 + 5;
        String string3 = cursor2.isNull(i8) ? null : cursor2.getString(i8);
        int i9 = i2 + 6;
        String string4 = cursor2.isNull(i9) ? null : cursor2.getString(i9);
        int i10 = i2 + 7;
        Double valueOf3 = cursor2.isNull(i10) ? null : Double.valueOf(cursor2.getDouble(i10));
        int i11 = i2 + 8;
        if (cursor2.isNull(i11)) {
            bool2 = null;
        } else {
            if (cursor2.getShort(i11) == 0) {
                z = false;
            }
            bool2 = Boolean.valueOf(z);
        }
        return new f(valueOf, string, valueOf2, string2, bool, string3, string4, valueOf3, bool2);
    }

    /* renamed from: T */
    public Long G(Cursor cursor, int i2) {
        int i3 = i2 + 0;
        if (cursor.isNull(i3)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i3));
    }

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public final Long K(f fVar, long j) {
        fVar.p(Long.valueOf(j));
        return Long.valueOf(j);
    }

    /* access modifiers changed from: protected */
    public final boolean x() {
        return true;
    }
}
