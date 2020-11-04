package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class q0 implements BaseGmsClient.BaseConnectionCallbacks {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzbbn f4670a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzahw f4671b;

    q0(zzahw zzahw, zzbbn zzbbn) {
        this.f4671b = zzahw;
        this.f4670a = zzbbn;
    }

    public final void E(Bundle bundle) {
        try {
            this.f4670a.a(this.f4671b.f5717a.e());
        } catch (DeadObjectException e2) {
            this.f4670a.c(e2);
        }
    }

    public final void y(int i) {
        zzbbn zzbbn = this.f4670a;
        StringBuilder sb = new StringBuilder(34);
        sb.append("onConnectionSuspended: ");
        sb.append(i);
        zzbbn.c(new RuntimeException(sb.toString()));
    }
}
