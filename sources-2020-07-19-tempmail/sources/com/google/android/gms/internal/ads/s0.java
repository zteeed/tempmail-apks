package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class s0 implements BaseGmsClient.BaseOnConnectionFailedListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzbbn f4853a;

    s0(zzahw zzahw, zzbbn zzbbn) {
        this.f4853a = zzbbn;
    }

    public final void b0(ConnectionResult connectionResult) {
        this.f4853a.c(new RuntimeException("Connection failed."));
    }
}
