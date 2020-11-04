package com.tempmail.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.f;
import org.greenrobot.greendao.g.c;

public class PurchaseTableDao extends a<j, Long> {
    public static final String TABLENAME = "PURCHASE_TABLE";

    public static class Properties {
        public static final f Id = new f(0, Long.class, "id", true, "_id");
        public static final f OriginalJson = new f(1, String.class, "originalJson", false, "ORIGINAL_JSON");
        public static final f Signature = new f(2, String.class, "signature", false, "SIGNATURE");
    }

    public PurchaseTableDao(org.greenrobot.greendao.i.a aVar, c cVar) {
        super(aVar, cVar);
    }

    public static void O(org.greenrobot.greendao.g.a aVar, boolean z) {
        String str = z ? "IF NOT EXISTS " : "";
        aVar.b("CREATE TABLE " + str + "\"PURCHASE_TABLE\" (\"_id\" INTEGER PRIMARY KEY ,\"ORIGINAL_JSON\" TEXT UNIQUE ,\"SIGNATURE\" TEXT);");
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public final void d(SQLiteStatement sQLiteStatement, j jVar) {
        sQLiteStatement.clearBindings();
        Long a2 = jVar.a();
        if (a2 != null) {
            sQLiteStatement.bindLong(1, a2.longValue());
        }
        String b2 = jVar.b();
        if (b2 != null) {
            sQLiteStatement.bindString(2, b2);
        }
        String c2 = jVar.c();
        if (c2 != null) {
            sQLiteStatement.bindString(3, c2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public final void e(c cVar, j jVar) {
        cVar.d();
        Long a2 = jVar.a();
        if (a2 != null) {
            cVar.c(1, a2.longValue());
        }
        String b2 = jVar.b();
        if (b2 != null) {
            cVar.a(2, b2);
        }
        String c2 = jVar.c();
        if (c2 != null) {
            cVar.a(3, c2);
        }
    }

    /* renamed from: P */
    public Long p(j jVar) {
        if (jVar != null) {
            return jVar.a();
        }
        return null;
    }

    /* renamed from: Q */
    public j F(Cursor cursor, int i) {
        int i2 = i + 0;
        String str = null;
        Long valueOf = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        String string = cursor.isNull(i3) ? null : cursor.getString(i3);
        int i4 = i + 2;
        if (!cursor.isNull(i4)) {
            str = cursor.getString(i4);
        }
        return new j(valueOf, string, str);
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
    public final Long K(j jVar, long j) {
        jVar.d(Long.valueOf(j));
        return Long.valueOf(j);
    }

    /* access modifiers changed from: protected */
    public final boolean x() {
        return true;
    }
}
