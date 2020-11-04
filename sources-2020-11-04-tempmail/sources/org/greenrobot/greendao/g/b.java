package org.greenrobot.greendao.g;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import net.sqlcipher.database.SQLiteDatabase;

/* compiled from: DatabaseOpenHelper */
public abstract class b extends SQLiteOpenHelper {
    private final Context context;
    private a encryptedHelper;
    private boolean loadSQLCipherNativeLibs;
    private final String name;
    private final int version;

    /* compiled from: DatabaseOpenHelper */
    private class a extends net.sqlcipher.database.SQLiteOpenHelper {
        public a(Context context, String str, int i, boolean z) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, i);
            if (z) {
                SQLiteDatabase.loadLibs(context);
            }
        }

        /* access modifiers changed from: protected */
        public a a(SQLiteDatabase sQLiteDatabase) {
            return new d(sQLiteDatabase);
        }
    }

    public b(Context context2, String str, int i) {
        this(context2, str, (SQLiteDatabase.CursorFactory) null, i);
    }

    private a checkEncryptedHelper() {
        if (this.encryptedHelper == null) {
            this.encryptedHelper = new a(this.context, this.name, this.version, this.loadSQLCipherNativeLibs);
        }
        return this.encryptedHelper;
    }

    public a getEncryptedReadableDb(String str) {
        a checkEncryptedHelper = checkEncryptedHelper();
        return checkEncryptedHelper.a(checkEncryptedHelper.getReadableDatabase(str));
    }

    public a getEncryptedWritableDb(String str) {
        a checkEncryptedHelper = checkEncryptedHelper();
        return checkEncryptedHelper.a(checkEncryptedHelper.getWritableDatabase(str));
    }

    public a getReadableDb() {
        return wrap(getReadableDatabase());
    }

    public a getWritableDb() {
        return wrap(getWritableDatabase());
    }

    public void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        onCreate(wrap(sQLiteDatabase));
    }

    public abstract void onCreate(a aVar);

    public void onOpen(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        onOpen(wrap(sQLiteDatabase));
    }

    public void onOpen(a aVar) {
    }

    public void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
        onUpgrade(wrap(sQLiteDatabase), i, i2);
    }

    public void onUpgrade(a aVar, int i, int i2) {
    }

    public void setLoadSQLCipherNativeLibs(boolean z) {
        this.loadSQLCipherNativeLibs = z;
    }

    /* access modifiers changed from: protected */
    public a wrap(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        return new f(sQLiteDatabase);
    }

    public b(Context context2, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context2, str, cursorFactory, i);
        this.loadSQLCipherNativeLibs = true;
        this.context = context2;
        this.name = str;
        this.version = i;
    }

    public a getEncryptedReadableDb(char[] cArr) {
        a checkEncryptedHelper = checkEncryptedHelper();
        return checkEncryptedHelper.a(checkEncryptedHelper.getReadableDatabase(cArr));
    }

    public a getEncryptedWritableDb(char[] cArr) {
        a checkEncryptedHelper = checkEncryptedHelper();
        return checkEncryptedHelper.a(checkEncryptedHelper.getWritableDatabase(cArr));
    }
}
