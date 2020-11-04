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

public class EmailTableDao extends a<EmailTable, Long> {
    public static final String TABLENAME = "EMAIL_TABLE";
    private DaoSession daoSession;
    private g<EmailTable> emailAddressTable_EmailListQuery;

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

    public EmailTableDao(org.greenrobot.greendao.i.a aVar) {
        super(aVar);
    }

    public static void createTable(org.greenrobot.greendao.g.a aVar, boolean z) {
        String str = z ? "IF NOT EXISTS " : "";
        aVar.b("CREATE TABLE " + str + "\"EMAIL_TABLE\" (\"_id\" INTEGER PRIMARY KEY ,\"EMAIL_ADDRESS\" TEXT,\"EMAIL_ADDRESS_ID\" INTEGER,\"EID\" TEXT,\"IS_CHECKED\" INTEGER,\"FROM_FIELD\" TEXT,\"SUBJECT\" TEXT,\"TIMESTAMP\" REAL,\"IS_DELETED\" INTEGER);");
    }

    public static void dropTable(org.greenrobot.greendao.g.a aVar, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"EMAIL_TABLE\"");
        aVar.b(sb.toString());
    }

    public List<EmailTable> _queryEmailAddressTable_EmailList(String str) {
        synchronized (this) {
            if (this.emailAddressTable_EmailListQuery == null) {
                h queryBuilder = queryBuilder();
                queryBuilder.p(Properties.EmailAddress.a((Object) null), new j[0]);
                this.emailAddressTable_EmailListQuery = queryBuilder.c();
            }
        }
        g<EmailTable> f2 = this.emailAddressTable_EmailListQuery.f();
        f2.i(0, str);
        return f2.h();
    }

    /* access modifiers changed from: protected */
    public final boolean isEntityUpdateable() {
        return true;
    }

    public EmailTableDao(org.greenrobot.greendao.i.a aVar, DaoSession daoSession2) {
        super(aVar, daoSession2);
        this.daoSession = daoSession2;
    }

    /* access modifiers changed from: protected */
    public final void attachEntity(EmailTable emailTable) {
        super.attachEntity(emailTable);
        emailTable.__setDaoSession(this.daoSession);
    }

    public Long getKey(EmailTable emailTable) {
        if (emailTable != null) {
            return emailTable.getId();
        }
        return null;
    }

    public boolean hasKey(EmailTable emailTable) {
        return emailTable.getId() != null;
    }

    public Long readKey(Cursor cursor, int i) {
        int i2 = i + 0;
        if (cursor.isNull(i2)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i2));
    }

    /* access modifiers changed from: protected */
    public final Long updateKeyAfterInsert(EmailTable emailTable, long j) {
        emailTable.setId(Long.valueOf(j));
        return Long.valueOf(j);
    }

    /* access modifiers changed from: protected */
    public final void bindValues(c cVar, EmailTable emailTable) {
        cVar.e();
        Long id = emailTable.getId();
        if (id != null) {
            cVar.d(1, id.longValue());
        }
        String emailAddress = emailTable.getEmailAddress();
        if (emailAddress != null) {
            cVar.b(2, emailAddress);
        }
        Long emailAddressId = emailTable.getEmailAddressId();
        if (emailAddressId != null) {
            cVar.d(3, emailAddressId.longValue());
        }
        String eid = emailTable.getEid();
        if (eid != null) {
            cVar.b(4, eid);
        }
        Boolean isChecked = emailTable.getIsChecked();
        long j = 1;
        if (isChecked != null) {
            cVar.d(5, isChecked.booleanValue() ? 1 : 0);
        }
        String fromField = emailTable.getFromField();
        if (fromField != null) {
            cVar.b(6, fromField);
        }
        String subject = emailTable.getSubject();
        if (subject != null) {
            cVar.b(7, subject);
        }
        Double timestamp = emailTable.getTimestamp();
        if (timestamp != null) {
            cVar.c(8, timestamp.doubleValue());
        }
        Boolean isDeleted = emailTable.getIsDeleted();
        if (isDeleted != null) {
            if (!isDeleted.booleanValue()) {
                j = 0;
            }
            cVar.d(9, j);
        }
    }

    public EmailTable readEntity(Cursor cursor, int i) {
        Boolean bool;
        Boolean bool2;
        Cursor cursor2 = cursor;
        int i2 = i + 0;
        Long valueOf = cursor2.isNull(i2) ? null : Long.valueOf(cursor2.getLong(i2));
        int i3 = i + 1;
        String string = cursor2.isNull(i3) ? null : cursor2.getString(i3);
        int i4 = i + 2;
        Long valueOf2 = cursor2.isNull(i4) ? null : Long.valueOf(cursor2.getLong(i4));
        int i5 = i + 3;
        String string2 = cursor2.isNull(i5) ? null : cursor2.getString(i5);
        int i6 = i + 4;
        boolean z = true;
        if (cursor2.isNull(i6)) {
            bool = null;
        } else {
            bool = Boolean.valueOf(cursor2.getShort(i6) != 0);
        }
        int i7 = i + 5;
        String string3 = cursor2.isNull(i7) ? null : cursor2.getString(i7);
        int i8 = i + 6;
        String string4 = cursor2.isNull(i8) ? null : cursor2.getString(i8);
        int i9 = i + 7;
        Double valueOf3 = cursor2.isNull(i9) ? null : Double.valueOf(cursor2.getDouble(i9));
        int i10 = i + 8;
        if (cursor2.isNull(i10)) {
            bool2 = null;
        } else {
            if (cursor2.getShort(i10) == 0) {
                z = false;
            }
            bool2 = Boolean.valueOf(z);
        }
        return new EmailTable(valueOf, string, valueOf2, string2, bool, string3, string4, valueOf3, bool2);
    }

    public void readEntity(Cursor cursor, EmailTable emailTable, int i) {
        Boolean bool;
        int i2 = i + 0;
        Boolean bool2 = null;
        emailTable.setId(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)));
        int i3 = i + 1;
        emailTable.setEmailAddress(cursor.isNull(i3) ? null : cursor.getString(i3));
        int i4 = i + 2;
        emailTable.setEmailAddressId(cursor.isNull(i4) ? null : Long.valueOf(cursor.getLong(i4)));
        int i5 = i + 3;
        emailTable.setEid(cursor.isNull(i5) ? null : cursor.getString(i5));
        int i6 = i + 4;
        boolean z = true;
        if (cursor.isNull(i6)) {
            bool = null;
        } else {
            bool = Boolean.valueOf(cursor.getShort(i6) != 0);
        }
        emailTable.setIsChecked(bool);
        int i7 = i + 5;
        emailTable.setFromField(cursor.isNull(i7) ? null : cursor.getString(i7));
        int i8 = i + 6;
        emailTable.setSubject(cursor.isNull(i8) ? null : cursor.getString(i8));
        int i9 = i + 7;
        emailTable.setTimestamp(cursor.isNull(i9) ? null : Double.valueOf(cursor.getDouble(i9)));
        int i10 = i + 8;
        if (!cursor.isNull(i10)) {
            if (cursor.getShort(i10) == 0) {
                z = false;
            }
            bool2 = Boolean.valueOf(z);
        }
        emailTable.setIsDeleted(bool2);
    }

    /* access modifiers changed from: protected */
    public final void bindValues(SQLiteStatement sQLiteStatement, EmailTable emailTable) {
        sQLiteStatement.clearBindings();
        Long id = emailTable.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        String emailAddress = emailTable.getEmailAddress();
        if (emailAddress != null) {
            sQLiteStatement.bindString(2, emailAddress);
        }
        Long emailAddressId = emailTable.getEmailAddressId();
        if (emailAddressId != null) {
            sQLiteStatement.bindLong(3, emailAddressId.longValue());
        }
        String eid = emailTable.getEid();
        if (eid != null) {
            sQLiteStatement.bindString(4, eid);
        }
        Boolean isChecked = emailTable.getIsChecked();
        long j = 1;
        if (isChecked != null) {
            sQLiteStatement.bindLong(5, isChecked.booleanValue() ? 1 : 0);
        }
        String fromField = emailTable.getFromField();
        if (fromField != null) {
            sQLiteStatement.bindString(6, fromField);
        }
        String subject = emailTable.getSubject();
        if (subject != null) {
            sQLiteStatement.bindString(7, subject);
        }
        Double timestamp = emailTable.getTimestamp();
        if (timestamp != null) {
            sQLiteStatement.bindDouble(8, timestamp.doubleValue());
        }
        Boolean isDeleted = emailTable.getIsDeleted();
        if (isDeleted != null) {
            if (!isDeleted.booleanValue()) {
                j = 0;
            }
            sQLiteStatement.bindLong(9, j);
        }
    }
}
