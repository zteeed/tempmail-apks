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

public class MailTextTableDao extends a<MailTextTable, Void> {
    public static final String TABLENAME = "MAIL_TEXT_TABLE";
    private g<MailTextTable> emailTable_TextListQuery;

    public static class Properties {
        public static final f Eid = new f(1, String.class, "eid", false, "EID");
        public static final f Text = new f(0, String.class, "text", false, "TEXT");
    }

    public MailTextTableDao(org.greenrobot.greendao.i.a aVar) {
        super(aVar);
    }

    public static void createTable(org.greenrobot.greendao.g.a aVar, boolean z) {
        String str = z ? "IF NOT EXISTS " : "";
        aVar.b("CREATE TABLE " + str + "\"MAIL_TEXT_TABLE\" (\"TEXT\" TEXT,\"EID\" TEXT);");
    }

    public static void dropTable(org.greenrobot.greendao.g.a aVar, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"MAIL_TEXT_TABLE\"");
        aVar.b(sb.toString());
    }

    public List<MailTextTable> _queryEmailTable_TextList(String str) {
        synchronized (this) {
            if (this.emailTable_TextListQuery == null) {
                h queryBuilder = queryBuilder();
                queryBuilder.p(Properties.Eid.a((Object) null), new j[0]);
                this.emailTable_TextListQuery = queryBuilder.c();
            }
        }
        g<MailTextTable> f2 = this.emailTable_TextListQuery.f();
        f2.i(0, str);
        return f2.h();
    }

    public Void getKey(MailTextTable mailTextTable) {
        return null;
    }

    public boolean hasKey(MailTextTable mailTextTable) {
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean isEntityUpdateable() {
        return true;
    }

    public Void readKey(Cursor cursor, int i) {
        return null;
    }

    /* access modifiers changed from: protected */
    public final Void updateKeyAfterInsert(MailTextTable mailTextTable, long j) {
        return null;
    }

    public MailTextTableDao(org.greenrobot.greendao.i.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    /* access modifiers changed from: protected */
    public final void bindValues(c cVar, MailTextTable mailTextTable) {
        cVar.e();
        String text = mailTextTable.getText();
        if (text != null) {
            cVar.b(1, text);
        }
        String eid = mailTextTable.getEid();
        if (eid != null) {
            cVar.b(2, eid);
        }
    }

    public MailTextTable readEntity(Cursor cursor, int i) {
        int i2 = i + 0;
        String str = null;
        String string = cursor.isNull(i2) ? null : cursor.getString(i2);
        int i3 = i + 1;
        if (!cursor.isNull(i3)) {
            str = cursor.getString(i3);
        }
        return new MailTextTable(string, str);
    }

    public void readEntity(Cursor cursor, MailTextTable mailTextTable, int i) {
        int i2 = i + 0;
        String str = null;
        mailTextTable.setText(cursor.isNull(i2) ? null : cursor.getString(i2));
        int i3 = i + 1;
        if (!cursor.isNull(i3)) {
            str = cursor.getString(i3);
        }
        mailTextTable.setEid(str);
    }

    /* access modifiers changed from: protected */
    public final void bindValues(SQLiteStatement sQLiteStatement, MailTextTable mailTextTable) {
        sQLiteStatement.clearBindings();
        String text = mailTextTable.getText();
        if (text != null) {
            sQLiteStatement.bindString(1, text);
        }
        String eid = mailTextTable.getEid();
        if (eid != null) {
            sQLiteStatement.bindString(2, eid);
        }
    }
}
