package com.tempmail.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.f;
import org.greenrobot.greendao.g.c;

public class PurchaseTableDao extends a<PurchaseTable, Long> {
    public static final String TABLENAME = "PURCHASE_TABLE";

    public static class Properties {
        public static final f Id = new f(0, Long.class, "id", true, "_id");
        public static final f OriginalJson = new f(1, String.class, "originalJson", false, "ORIGINAL_JSON");
        public static final f Signature = new f(2, String.class, "signature", false, "SIGNATURE");
    }

    public PurchaseTableDao(org.greenrobot.greendao.i.a aVar) {
        super(aVar);
    }

    public static void createTable(org.greenrobot.greendao.g.a aVar, boolean z) {
        String str = z ? "IF NOT EXISTS " : "";
        aVar.b("CREATE TABLE " + str + "\"PURCHASE_TABLE\" (\"_id\" INTEGER PRIMARY KEY ,\"ORIGINAL_JSON\" TEXT UNIQUE ,\"SIGNATURE\" TEXT);");
    }

    public static void dropTable(org.greenrobot.greendao.g.a aVar, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"PURCHASE_TABLE\"");
        aVar.b(sb.toString());
    }

    /* access modifiers changed from: protected */
    public final boolean isEntityUpdateable() {
        return true;
    }

    public PurchaseTableDao(org.greenrobot.greendao.i.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    public Long getKey(PurchaseTable purchaseTable) {
        if (purchaseTable != null) {
            return purchaseTable.getId();
        }
        return null;
    }

    public boolean hasKey(PurchaseTable purchaseTable) {
        return purchaseTable.getId() != null;
    }

    public Long readKey(Cursor cursor, int i) {
        int i2 = i + 0;
        if (cursor.isNull(i2)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i2));
    }

    /* access modifiers changed from: protected */
    public final Long updateKeyAfterInsert(PurchaseTable purchaseTable, long j) {
        purchaseTable.setId(Long.valueOf(j));
        return Long.valueOf(j);
    }

    /* access modifiers changed from: protected */
    public final void bindValues(c cVar, PurchaseTable purchaseTable) {
        cVar.e();
        Long id = purchaseTable.getId();
        if (id != null) {
            cVar.d(1, id.longValue());
        }
        String originalJson = purchaseTable.getOriginalJson();
        if (originalJson != null) {
            cVar.b(2, originalJson);
        }
        String signature = purchaseTable.getSignature();
        if (signature != null) {
            cVar.b(3, signature);
        }
    }

    public PurchaseTable readEntity(Cursor cursor, int i) {
        int i2 = i + 0;
        String str = null;
        Long valueOf = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        String string = cursor.isNull(i3) ? null : cursor.getString(i3);
        int i4 = i + 2;
        if (!cursor.isNull(i4)) {
            str = cursor.getString(i4);
        }
        return new PurchaseTable(valueOf, string, str);
    }

    public void readEntity(Cursor cursor, PurchaseTable purchaseTable, int i) {
        int i2 = i + 0;
        String str = null;
        purchaseTable.setId(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)));
        int i3 = i + 1;
        purchaseTable.setOriginalJson(cursor.isNull(i3) ? null : cursor.getString(i3));
        int i4 = i + 2;
        if (!cursor.isNull(i4)) {
            str = cursor.getString(i4);
        }
        purchaseTable.setSignature(str);
    }

    /* access modifiers changed from: protected */
    public final void bindValues(SQLiteStatement sQLiteStatement, PurchaseTable purchaseTable) {
        sQLiteStatement.clearBindings();
        Long id = purchaseTable.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        String originalJson = purchaseTable.getOriginalJson();
        if (originalJson != null) {
            sQLiteStatement.bindString(2, originalJson);
        }
        String signature = purchaseTable.getSignature();
        if (signature != null) {
            sQLiteStatement.bindString(3, signature);
        }
    }
}
