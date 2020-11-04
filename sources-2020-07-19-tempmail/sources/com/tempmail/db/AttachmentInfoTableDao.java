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

public class AttachmentInfoTableDao extends a<a, Long> {
    public static final String TABLENAME = "ATTACHMENT_INFO_TABLE";
    private g<a> h;

    public static class Properties {
        public static final f AttachmentId = new f(3, Integer.class, "attachmentId", false, "ATTACHMENT_ID");
        public static final f Cid = new f(6, String.class, "cid", false, "CID");
        public static final f Eid = new f(1, String.class, "eid", false, "EID");
        public static final f Filename = new f(2, String.class, "filename", false, "FILENAME");
        public static final f Id = new f(0, Long.class, "id", true, "_id");
        public static final f MimeType = new f(5, String.class, "mimeType", false, "MIME_TYPE");
        public static final f Size = new f(4, Long.class, "size", false, "SIZE");
    }

    public AttachmentInfoTableDao(org.greenrobot.greendao.i.a aVar, c cVar) {
        super(aVar, cVar);
    }

    public static void P(org.greenrobot.greendao.g.a aVar, boolean z) {
        String str = z ? "IF NOT EXISTS " : "";
        aVar.b("CREATE TABLE " + str + "\"ATTACHMENT_INFO_TABLE\" (\"_id\" INTEGER PRIMARY KEY ,\"EID\" TEXT,\"FILENAME\" TEXT,\"ATTACHMENT_ID\" INTEGER,\"SIZE\" INTEGER,\"MIME_TYPE\" TEXT,\"CID\" TEXT);");
    }

    public List<a> M(String str) {
        synchronized (this) {
            if (this.h == null) {
                h E = E();
                E.p(Properties.Eid.a((Object) null), new j[0]);
                this.h = E.c();
            }
        }
        g<a> f2 = this.h.f();
        f2.h(0, str);
        return f2.g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public final void d(SQLiteStatement sQLiteStatement, a aVar) {
        sQLiteStatement.clearBindings();
        Long e2 = aVar.e();
        if (e2 != null) {
            sQLiteStatement.bindLong(1, e2.longValue());
        }
        String c2 = aVar.c();
        if (c2 != null) {
            sQLiteStatement.bindString(2, c2);
        }
        String d2 = aVar.d();
        if (d2 != null) {
            sQLiteStatement.bindString(3, d2);
        }
        Integer a2 = aVar.a();
        if (a2 != null) {
            sQLiteStatement.bindLong(4, (long) a2.intValue());
        }
        Long h2 = aVar.h();
        if (h2 != null) {
            sQLiteStatement.bindLong(5, h2.longValue());
        }
        String g = aVar.g();
        if (g != null) {
            sQLiteStatement.bindString(6, g);
        }
        String b2 = aVar.b();
        if (b2 != null) {
            sQLiteStatement.bindString(7, b2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public final void e(c cVar, a aVar) {
        cVar.d();
        Long e2 = aVar.e();
        if (e2 != null) {
            cVar.c(1, e2.longValue());
        }
        String c2 = aVar.c();
        if (c2 != null) {
            cVar.a(2, c2);
        }
        String d2 = aVar.d();
        if (d2 != null) {
            cVar.a(3, d2);
        }
        Integer a2 = aVar.a();
        if (a2 != null) {
            cVar.c(4, (long) a2.intValue());
        }
        Long h2 = aVar.h();
        if (h2 != null) {
            cVar.c(5, h2.longValue());
        }
        String g = aVar.g();
        if (g != null) {
            cVar.a(6, g);
        }
        String b2 = aVar.b();
        if (b2 != null) {
            cVar.a(7, b2);
        }
    }

    /* renamed from: Q */
    public Long p(a aVar) {
        if (aVar != null) {
            return aVar.e();
        }
        return null;
    }

    /* renamed from: R */
    public a F(Cursor cursor, int i) {
        int i2 = i + 0;
        Long valueOf = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        String string = cursor.isNull(i3) ? null : cursor.getString(i3);
        int i4 = i + 2;
        String string2 = cursor.isNull(i4) ? null : cursor.getString(i4);
        int i5 = i + 3;
        Integer valueOf2 = cursor.isNull(i5) ? null : Integer.valueOf(cursor.getInt(i5));
        int i6 = i + 4;
        Long valueOf3 = cursor.isNull(i6) ? null : Long.valueOf(cursor.getLong(i6));
        int i7 = i + 5;
        int i8 = i + 6;
        return new a(valueOf, string, string2, valueOf2, valueOf3, cursor.isNull(i7) ? null : cursor.getString(i7), cursor.isNull(i8) ? null : cursor.getString(i8));
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
    public final Long K(a aVar, long j) {
        aVar.j(Long.valueOf(j));
        return Long.valueOf(j);
    }

    /* access modifiers changed from: protected */
    public final boolean x() {
        return true;
    }
}
