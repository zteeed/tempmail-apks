package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class h3 extends SQLiteOpenHelper {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzeq f10035b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    h3(zzeq zzeq, Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        this.f10035b = zzeq;
    }

    public final SQLiteDatabase getWritableDatabase() throws SQLiteException {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e2) {
            throw e2;
        } catch (SQLiteException unused) {
            this.f10035b.h().G().a("Opening the local database failed, dropping and recreating it");
            if (!this.f10035b.f().getDatabasePath("google_app_measurement_local.db").delete()) {
                this.f10035b.h().G().b("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e3) {
                this.f10035b.h().G().b("Failed to open local database. Events will bypass local storage", e3);
                return null;
            }
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        zzah.b(this.f10035b.h(), sQLiteDatabase);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        zzah.c(this.f10035b.h(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", (String[]) null);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
