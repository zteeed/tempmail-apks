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

    public DomainTableDao(org.greenrobot.greendao.i.a aVar) {
        super(aVar);
    }

    public static void createTable(org.greenrobot.greendao.g.a aVar, boolean z) {
        String str = z ? "IF NOT EXISTS " : "";
        aVar.b("CREATE TABLE " + str + "\"DOMAIN_TABLE\" (\"_id\" INTEGER PRIMARY KEY ,\"DOMAIN\" TEXT,\"EXPIRATION_TIMESTAMP\" INTEGER);");
    }

    public static void dropTable(org.greenrobot.greendao.g.a aVar, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"DOMAIN_TABLE\"");
        aVar.b(sb.toString());
    }

    /* access modifiers changed from: protected */
    public final boolean isEntityUpdateable() {
        return true;
    }

    public DomainTableDao(org.greenrobot.greendao.i.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    public Long getKey(DomainTable domainTable) {
        if (domainTable != null) {
            return domainTable.getId();
        }
        return null;
    }

    public boolean hasKey(DomainTable domainTable) {
        return domainTable.getId() != null;
    }

    public Long readKey(Cursor cursor, int i) {
        int i2 = i + 0;
        if (cursor.isNull(i2)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i2));
    }

    /* access modifiers changed from: protected */
    public final Long updateKeyAfterInsert(DomainTable domainTable, long j) {
        domainTable.setId(Long.valueOf(j));
        return Long.valueOf(j);
    }

    /* access modifiers changed from: protected */
    public final void bindValues(c cVar, DomainTable domainTable) {
        cVar.e();
        Long id = domainTable.getId();
        if (id != null) {
            cVar.d(1, id.longValue());
        }
        String domain = domainTable.getDomain();
        if (domain != null) {
            cVar.b(2, domain);
        }
        Long expirationTimestamp = domainTable.getExpirationTimestamp();
        if (expirationTimestamp != null) {
            cVar.d(3, expirationTimestamp.longValue());
        }
    }

    public DomainTable readEntity(Cursor cursor, int i) {
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

    public void readEntity(Cursor cursor, DomainTable domainTable, int i) {
        int i2 = i + 0;
        Long l = null;
        domainTable.setId(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)));
        int i3 = i + 1;
        domainTable.setDomain(cursor.isNull(i3) ? null : cursor.getString(i3));
        int i4 = i + 2;
        if (!cursor.isNull(i4)) {
            l = Long.valueOf(cursor.getLong(i4));
        }
        domainTable.setExpirationTimestamp(l);
    }

    /* access modifiers changed from: protected */
    public final void bindValues(SQLiteStatement sQLiteStatement, DomainTable domainTable) {
        sQLiteStatement.clearBindings();
        Long id = domainTable.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        String domain = domainTable.getDomain();
        if (domain != null) {
            sQLiteStatement.bindString(2, domain);
        }
        Long expirationTimestamp = domainTable.getExpirationTimestamp();
        if (expirationTimestamp != null) {
            sQLiteStatement.bindLong(3, expirationTimestamp.longValue());
        }
    }
}
