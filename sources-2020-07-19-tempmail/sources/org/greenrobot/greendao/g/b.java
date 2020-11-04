package org.greenrobot.greendao.g;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* compiled from: DatabaseOpenHelper */
public abstract class b extends SQLiteOpenHelper {
    public b(Context context, String str, int i) {
        this(context, str, (SQLiteDatabase.CursorFactory) null, i);
    }

    public abstract void a(a aVar);

    public void b(a aVar) {
    }

    public void d(a aVar, int i, int i2) {
    }

    /* access modifiers changed from: protected */
    public a e(SQLiteDatabase sQLiteDatabase) {
        return new d(sQLiteDatabase);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        a(e(sQLiteDatabase));
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        b(e(sQLiteDatabase));
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        d(e(sQLiteDatabase), i, i2);
    }

    public b(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context, str, cursorFactory, i);
    }
}
