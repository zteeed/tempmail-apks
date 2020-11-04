package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class if0 implements BaseGmsClient.BaseOnConnectionFailedListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzbbn f4051a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzte f4052b;

    if0(zzte zzte, zzbbn zzbbn) {
        this.f4052b = zzte;
        this.f4051a = zzbbn;
    }

    public final void b0(ConnectionResult connectionResult) {
        synchronized (this.f4052b.f9108d) {
            this.f4051a.c(new RuntimeException("Connection failed."));
        }
    }
}
