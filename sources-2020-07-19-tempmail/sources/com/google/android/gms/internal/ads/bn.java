package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class bn implements zzduu<SQLiteDatabase> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzdob f3484a;

    bn(zzcpz zzcpz, zzdob zzdob) {
        this.f3484a = zzdob;
    }

    public final void a(Throwable th) {
        String valueOf = String.valueOf(th.getMessage());
        zzbba.g(valueOf.length() != 0 ? "Failed to get offline signal database: ".concat(valueOf) : new String("Failed to get offline signal database: "));
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        try {
            this.f3484a.apply((SQLiteDatabase) obj);
        } catch (Exception e2) {
            String valueOf = String.valueOf(e2.getMessage());
            zzbba.g(valueOf.length() != 0 ? "Error executing function on offline signal database: ".concat(valueOf) : new String("Error executing function on offline signal database: "));
        }
    }
}
