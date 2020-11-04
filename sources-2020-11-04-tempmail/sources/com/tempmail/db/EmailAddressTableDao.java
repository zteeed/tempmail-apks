package com.tempmail.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.f;
import org.greenrobot.greendao.g.c;

public class EmailAddressTableDao extends a<EmailAddressTable, Long> {
    public static final String TABLENAME = "EMAIL_ADDRESS_TABLE";
    private DaoSession daoSession;

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

    public EmailAddressTableDao(org.greenrobot.greendao.i.a aVar) {
        super(aVar);
    }

    public static void createTable(org.greenrobot.greendao.g.a aVar, boolean z) {
        String str = z ? "IF NOT EXISTS " : "";
        aVar.b("CREATE TABLE " + str + "\"EMAIL_ADDRESS_TABLE\" (\"_id\" INTEGER PRIMARY KEY ,\"FULL_EMAIL_ADDRESS\" TEXT,\"EMAIL_PREFIX\" TEXT,\"DOMAIN\" TEXT,\"IS_DEFAULT\" INTEGER,\"START_TIME\" INTEGER,\"END_TIME\" INTEGER,\"IS_INFINITY\" INTEGER);");
    }

    public static void dropTable(org.greenrobot.greendao.g.a aVar, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"EMAIL_ADDRESS_TABLE\"");
        aVar.b(sb.toString());
    }

    /* access modifiers changed from: protected */
    public final boolean isEntityUpdateable() {
        return true;
    }

    public EmailAddressTableDao(org.greenrobot.greendao.i.a aVar, DaoSession daoSession2) {
        super(aVar, daoSession2);
        this.daoSession = daoSession2;
    }

    /* access modifiers changed from: protected */
    public final void attachEntity(EmailAddressTable emailAddressTable) {
        super.attachEntity(emailAddressTable);
        emailAddressTable.__setDaoSession(this.daoSession);
    }

    public Long getKey(EmailAddressTable emailAddressTable) {
        if (emailAddressTable != null) {
            return emailAddressTable.getId();
        }
        return null;
    }

    public boolean hasKey(EmailAddressTable emailAddressTable) {
        return emailAddressTable.getId() != null;
    }

    public Long readKey(Cursor cursor, int i) {
        int i2 = i + 0;
        if (cursor.isNull(i2)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i2));
    }

    /* access modifiers changed from: protected */
    public final Long updateKeyAfterInsert(EmailAddressTable emailAddressTable, long j) {
        emailAddressTable.setId(Long.valueOf(j));
        return Long.valueOf(j);
    }

    /* access modifiers changed from: protected */
    public final void bindValues(c cVar, EmailAddressTable emailAddressTable) {
        cVar.e();
        Long id = emailAddressTable.getId();
        if (id != null) {
            cVar.d(1, id.longValue());
        }
        String fullEmailAddress = emailAddressTable.getFullEmailAddress();
        if (fullEmailAddress != null) {
            cVar.b(2, fullEmailAddress);
        }
        String emailPrefix = emailAddressTable.getEmailPrefix();
        if (emailPrefix != null) {
            cVar.b(3, emailPrefix);
        }
        String domain = emailAddressTable.getDomain();
        if (domain != null) {
            cVar.b(4, domain);
        }
        Boolean isDefault = emailAddressTable.getIsDefault();
        long j = 1;
        if (isDefault != null) {
            cVar.d(5, isDefault.booleanValue() ? 1 : 0);
        }
        Long startTime = emailAddressTable.getStartTime();
        if (startTime != null) {
            cVar.d(6, startTime.longValue());
        }
        Long endTime = emailAddressTable.getEndTime();
        if (endTime != null) {
            cVar.d(7, endTime.longValue());
        }
        Boolean isInfinity = emailAddressTable.getIsInfinity();
        if (isInfinity != null) {
            if (!isInfinity.booleanValue()) {
                j = 0;
            }
            cVar.d(8, j);
        }
    }

    public EmailAddressTable readEntity(Cursor cursor, int i) {
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
        return new EmailAddressTable(valueOf, string, string2, string3, bool, valueOf2, valueOf3, bool2);
    }

    public void readEntity(Cursor cursor, EmailAddressTable emailAddressTable, int i) {
        Boolean bool;
        int i2 = i + 0;
        Boolean bool2 = null;
        emailAddressTable.setId(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)));
        int i3 = i + 1;
        emailAddressTable.setFullEmailAddress(cursor.isNull(i3) ? null : cursor.getString(i3));
        int i4 = i + 2;
        emailAddressTable.setEmailPrefix(cursor.isNull(i4) ? null : cursor.getString(i4));
        int i5 = i + 3;
        emailAddressTable.setDomain(cursor.isNull(i5) ? null : cursor.getString(i5));
        int i6 = i + 4;
        boolean z = true;
        if (cursor.isNull(i6)) {
            bool = null;
        } else {
            bool = Boolean.valueOf(cursor.getShort(i6) != 0);
        }
        emailAddressTable.setIsDefault(bool);
        int i7 = i + 5;
        emailAddressTable.setStartTime(cursor.isNull(i7) ? null : Long.valueOf(cursor.getLong(i7)));
        int i8 = i + 6;
        emailAddressTable.setEndTime(cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8)));
        int i9 = i + 7;
        if (!cursor.isNull(i9)) {
            if (cursor.getShort(i9) == 0) {
                z = false;
            }
            bool2 = Boolean.valueOf(z);
        }
        emailAddressTable.setIsInfinity(bool2);
    }

    /* access modifiers changed from: protected */
    public final void bindValues(SQLiteStatement sQLiteStatement, EmailAddressTable emailAddressTable) {
        sQLiteStatement.clearBindings();
        Long id = emailAddressTable.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        String fullEmailAddress = emailAddressTable.getFullEmailAddress();
        if (fullEmailAddress != null) {
            sQLiteStatement.bindString(2, fullEmailAddress);
        }
        String emailPrefix = emailAddressTable.getEmailPrefix();
        if (emailPrefix != null) {
            sQLiteStatement.bindString(3, emailPrefix);
        }
        String domain = emailAddressTable.getDomain();
        if (domain != null) {
            sQLiteStatement.bindString(4, domain);
        }
        Boolean isDefault = emailAddressTable.getIsDefault();
        long j = 1;
        if (isDefault != null) {
            sQLiteStatement.bindLong(5, isDefault.booleanValue() ? 1 : 0);
        }
        Long startTime = emailAddressTable.getStartTime();
        if (startTime != null) {
            sQLiteStatement.bindLong(6, startTime.longValue());
        }
        Long endTime = emailAddressTable.getEndTime();
        if (endTime != null) {
            sQLiteStatement.bindLong(7, endTime.longValue());
        }
        Boolean isInfinity = emailAddressTable.getIsInfinity();
        if (isInfinity != null) {
            if (!isInfinity.booleanValue()) {
                j = 0;
            }
            sQLiteStatement.bindLong(8, j);
        }
    }
}
