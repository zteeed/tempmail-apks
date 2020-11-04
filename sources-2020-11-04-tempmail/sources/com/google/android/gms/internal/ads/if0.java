package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class if0 implements BaseGmsClient.BaseOnConnectionFailedListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzbbn f4234a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzte f4235b;

    if0(zzte zzte, zzbbn zzbbn) {
        this.f4235b = zzte;
        this.f4234a = zzbbn;
    }

    public final void h0(ConnectionResult connectionResult) {
        synchronized (this.f4235b.f9291d) {
            this.f4234a.c(new RuntimeException("Connection failed."));
        }
    }
}
