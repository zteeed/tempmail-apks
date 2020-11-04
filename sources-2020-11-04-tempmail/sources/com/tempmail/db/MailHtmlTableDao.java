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

public class MailHtmlTableDao extends a<MailHtmlTable, Void> {
    public static final String TABLENAME = "MAIL_HTML_TABLE";
    private g<MailHtmlTable> emailTable_HtmlListQuery;

    public static class Properties {
        public static final f Eid = new f(1, String.class, "eid", false, "EID");
        public static final f Text = new f(0, String.class, "text", false, "TEXT");
    }

    public MailHtmlTableDao(org.greenrobot.greendao.i.a aVar) {
        super(aVar);
    }

    public static void createTable(org.greenrobot.greendao.g.a aVar, boolean z) {
        String str = z ? "IF NOT EXISTS " : "";
        aVar.b("CREATE TABLE " + str + "\"MAIL_HTML_TABLE\" (\"TEXT\" TEXT,\"EID\" TEXT);");
    }

    public static void dropTable(org.greenrobot.greendao.g.a aVar, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"MAIL_HTML_TABLE\"");
        aVar.b(sb.toString());
    }

    public List<MailHtmlTable> _queryEmailTable_HtmlList(String str) {
        synchronized (this) {
            if (this.emailTable_HtmlListQuery == null) {
                h queryBuilder = queryBuilder();
                queryBuilder.p(Properties.Eid.a((Object) null), new j[0]);
                this.emailTable_HtmlListQuery = queryBuilder.c();
            }
        }
        g<MailHtmlTable> f2 = this.emailTable_HtmlListQuery.f();
        f2.i(0, str);
        return f2.h();
    }

    public Void getKey(MailHtmlTable mailHtmlTable) {
        return null;
    }

    public boolean hasKey(MailHtmlTable mailHtmlTable) {
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
    public final Void updateKeyAfterInsert(MailHtmlTable mailHtmlTable, long j) {
        return null;
    }

    public MailHtmlTableDao(org.greenrobot.greendao.i.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    /* access modifiers changed from: protected */
    public final void bindValues(c cVar, MailHtmlTable mailHtmlTable) {
        cVar.e();
        String text = mailHtmlTable.getText();
        if (text != null) {
            cVar.b(1, text);
        }
        String eid = mailHtmlTable.getEid();
        if (eid != null) {
            cVar.b(2, eid);
        }
    }

    public MailHtmlTable readEntity(Cursor cursor, int i) {
        int i2 = i + 0;
        String str = null;
        String string = cursor.isNull(i2) ? null : cursor.getString(i2);
        int i3 = i + 1;
        if (!cursor.isNull(i3)) {
            str = cursor.getString(i3);
        }
        return new MailHtmlTable(string, str);
    }

    public void readEntity(Cursor cursor, MailHtmlTable mailHtmlTable, int i) {
        int i2 = i + 0;
        String str = null;
        mailHtmlTable.setText(cursor.isNull(i2) ? null : cursor.getString(i2));
        int i3 = i + 1;
        if (!cursor.isNull(i3)) {
            str = cursor.getString(i3);
        }
        mailHtmlTable.setEid(str);
    }

    /* access modifiers changed from: protected */
    public final void bindValues(SQLiteStatement sQLiteStatement, MailHtmlTable mailHtmlTable) {
        sQLiteStatement.clearBindings();
        String text = mailHtmlTable.getText();
        if (text != null) {
            sQLiteStatement.bindString(1, text);
        }
        String eid = mailHtmlTable.getEid();
        if (eid != null) {
            sQLiteStatement.bindString(2, eid);
        }
    }
}
