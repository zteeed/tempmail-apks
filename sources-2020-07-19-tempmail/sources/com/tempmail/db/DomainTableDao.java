package com.tempmail.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.f;
import org.greenrobot.greendao.g.c;

public class DomainTableDao extends a<DomainTable, Long> {
    public static final String TABLENAME = "DOMAIN_TABLE";

    public static class Properties {
        public static final f Domain = new f(1, String.class, "domain", false, "DOMAIN");
        public static final f ExpirationTimestamp = new f(2, Long.class, "expirationTimestamp", false, "EXPIRATION_TIMESTAMP");
        public static final f Id = new f(0, Long.class, "id", true, "_id");
    }

    public DomainTableDao(org.greenrobot.greendao.i.a aVar, c cVar) {
        super(aVar, cVar);
    }

    public static void O(org.greenrobot.greendao.g.a aVar, boolean z) {
        String str = z ? "IF NOT EXISTS " : "";
        aVar.b("CREATE TABLE " + str + "\"DOMAIN_TABLE\" (\"_id\" INTEGER PRIMARY KEY ,\"DOMAIN\" TEXT,\"EXPIRATION_TIMESTAMP\" INTEGER);");
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public final void d(SQLiteStatement sQLiteStatement, DomainTable domainTable) {
        sQLiteStatement.clearBindings();
        Long c2 = domainTable.c();
        if (c2 != null) {
            sQLiteStatement.bindLong(1, c2.longValue());
        }
        String a2 = domainTable.a();
        if (a2 != null) {
            sQLiteStatement.bindString(2, a2);
        }
        Long b2 = domainTable.b();
        if (b2 != null) {
            sQLiteStatement.bindLong(3, b2.longValue());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public final void e(c cVar, DomainTable domainTable) {
        cVar.d();
        Long c2 = domainTable.c();
        if (c2 != null) {
            cVar.c(1, c2.longValue());
        }
        String a2 = domainTable.a();
        if (a2 != null) {
            cVar.a(2, a2);
        }
        Long b2 = domainTable.b();
        if (b2 != null) {
            cVar.c(3, b2.longValue());
        }
    }

    /* renamed from: P */
    public Long p(DomainTable domainTable) {
        if (domainTable != null) {
            return domainTable.c();
        }
        return null;
    }

    /* renamed from: Q */
    public DomainTable F(Cursor cursor, int i) {
        int i2 = i + 0;
        Long l = null;
        Long valueOf = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        String string = cursor.isNull(i3) ? null : cursor.getString(i3);
        int i4 = i + 2;
        if (!cursor.isNull(i4)) {
            l = Long.valueOf(cursor.getLong(i4));
        }
        return new DomainTable(valueOf, string, l);
    }

    /* renamed from: R */
    public Long G(Cursor cursor, int i) {
        int i2 = i + 0;
        if (cursor.isNull(i2)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public final Long K(DomainTable domainTable, long j) {
        domainTable.e(Long.valueOf(j));
        return Long.valueOf(j);
    }

    /* access modifiers changed from: protected */
    public final boolean x() {
        return true;
    }
}
