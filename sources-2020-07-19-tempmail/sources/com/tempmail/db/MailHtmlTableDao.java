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

public class MailHtmlTableDao extends a<g, Void> {
    public static final String TABLENAME = "MAIL_HTML_TABLE";
    private g<g> h;

    public static class Properties {
        public static final f Eid = new f(1, String.class, "eid", false, "EID");
        public static final f Text = new f(0, String.class, "text", false, "TEXT");
    }

    public MailHtmlTableDao(org.greenrobot.greendao.i.a aVar, c cVar) {
        super(aVar, cVar);
    }

    public static void P(org.greenrobot.greendao.g.a aVar, boolean z) {
        String str = z ? "IF NOT EXISTS " : "";
        aVar.b("CREATE TABLE " + str + "\"MAIL_HTML_TABLE\" (\"TEXT\" TEXT,\"EID\" TEXT);");
    }

    public List<g> M(String str) {
        synchronized (this) {
            if (this.h == null) {
                h E = E();
                E.p(Properties.Eid.a((Object) null), new j[0]);
                this.h = E.c();
            }
        }
        g<g> f2 = this.h.f();
        f2.h(0, str);
        return f2.g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public final void d(SQLiteStatement sQLiteStatement, g gVar) {
        sQLiteStatement.clearBindings();
        String b2 = gVar.b();
        if (b2 != null) {
            sQLiteStatement.bindString(1, b2);
        }
        String a2 = gVar.a();
        if (a2 != null) {
            sQLiteStatement.bindString(2, a2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public final void e(c cVar, g gVar) {
        cVar.d();
        String b2 = gVar.b();
        if (b2 != null) {
            cVar.a(1, b2);
        }
        String a2 = gVar.a();
        if (a2 != null) {
            cVar.a(2, a2);
        }
    }

    /* renamed from: Q */
    public Void p(g gVar) {
        return null;
    }

    /* renamed from: R */
    public g F(Cursor cursor, int i) {
        int i2 = i + 0;
        String str = null;
        String string = cursor.isNull(i2) ? null : cursor.getString(i2);
        int i3 = i + 1;
        if (!cursor.isNull(i3)) {
            str = cursor.getString(i3);
        }
        return new g(string, str);
    }

    /* renamed from: S */
    public Void G(Cursor cursor, int i) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public final Void K(g gVar, long j) {
        return null;
    }

    /* access modifiers changed from: protected */
    public final boolean x() {
        return true;
    }
}
