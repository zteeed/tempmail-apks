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

public class MailTextOnlyTableDao extends a<MailTextOnlyTable, Void> {
    public static final String TABLENAME = "MAIL_TEXT_ONLY_TABLE";
    private g<MailTextOnlyTable> emailTable_TextOnlyListQuery;

    public static class Properties {
        public static final f Eid = new f(1, String.class, "eid", false, "EID");
        public static final f Text = new f(0, String.class, "text", false, "TEXT");
    }

    public MailTextOnlyTableDao(org.greenrobot.greendao.i.a aVar) {
        super(aVar);
    }

    public static void createTable(org.greenrobot.greendao.g.a aVar, boolean z) {
        String str = z ? "IF NOT EXISTS " : "";
        aVar.b("CREATE TABLE " + str + "\"MAIL_TEXT_ONLY_TABLE\" (\"TEXT\" TEXT,\"EID\" TEXT);");
    }

    public static void dropTable(org.greenrobot.greendao.g.a aVar, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"MAIL_TEXT_ONLY_TABLE\"");
        aVar.b(sb.toString());
    }

    public List<MailTextOnlyTable> _queryEmailTable_TextOnlyList(String str) {
        synchronized (this) {
            if (this.emailTable_TextOnlyListQuery == null) {
                h queryBuilder = queryBuilder();
                queryBuilder.p(Properties.Eid.a((Object) null), new j[0]);
                this.emailTable_TextOnlyListQuery = queryBuilder.c();
            }
        }
        g<MailTextOnlyTable> f2 = this.emailTable_TextOnlyListQuery.f();
        f2.i(0, str);
        return f2.h();
    }

    public Void getKey(MailTextOnlyTable mailTextOnlyTable) {
        return null;
    }

    public boolean hasKey(MailTextOnlyTable mailTextOnlyTable) {
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
    public final Void updateKeyAfterInsert(MailTextOnlyTable mailTextOnlyTable, long j) {
        return null;
    }

    public MailTextOnlyTableDao(org.greenrobot.greendao.i.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    /* access modifiers changed from: protected */
    public final void bindValues(c cVar, MailTextOnlyTable mailTextOnlyTable) {
        cVar.e();
        String text = mailTextOnlyTable.getText();
        if (text != null) {
            cVar.b(1, text);
        }
        String eid = mailTextOnlyTable.getEid();
        if (eid != null) {
            cVar.b(2, eid);
        }
    }

    public MailTextOnlyTable readEntity(Cursor cursor, int i) {
        int i2 = i + 0;
        String str = null;
        String string = cursor.isNull(i2) ? null : cursor.getString(i2);
        int i3 = i + 1;
        if (!cursor.isNull(i3)) {
            str = cursor.getString(i3);
        }
        return new MailTextOnlyTable(string, str);
    }

    public void readEntity(Cursor cursor, MailTextOnlyTable mailTextOnlyTable, int i) {
        int i2 = i + 0;
        String str = null;
        mailTextOnlyTable.setText(cursor.isNull(i2) ? null : cursor.getString(i2));
        int i3 = i + 1;
        if (!cursor.isNull(i3)) {
            str = cursor.getString(i3);
        }
        mailTextOnlyTable.setEid(str);
    }

    /* access modifiers changed from: protected */
    public final void bindValues(SQLiteStatement sQLiteStatement, MailTextOnlyTable mailTextOnlyTable) {
        sQLiteStatement.clearBindings();
        String text = mailTextOnlyTable.getText();
        if (text != null) {
            sQLiteStatement.bindString(1, text);
        }
        String eid = mailTextOnlyTable.getEid();
        if (eid != null) {
            sQLiteStatement.bindString(2, eid);
        }
    }
}
