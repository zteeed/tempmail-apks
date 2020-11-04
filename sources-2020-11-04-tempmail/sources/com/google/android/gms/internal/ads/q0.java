package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class q0 implements BaseGmsClient.BaseConnectionCallbacks {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzbbn f4853a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzahw f4854b;

    q0(zzahw zzahw, zzbbn zzbbn) {
        this.f4854b = zzahw;
        this.f4853a = zzbbn;
    }

    public final void B(int i) {
        zzbbn zzbbn = this.f4853a;
        StringBuilder sb = new StringBuilder(34);
        sb.append("onConnectionSuspended: ");
        sb.append(i);
        zzbbn.c(new RuntimeException(sb.toString()));
    }

    public final void H(Bundle bundle) {
        try {
            this.f4853a.a(this.f4854b.f5900a.e());
        } catch (DeadObjectException e2) {
            this.f4853a.c(e2);
        }
    }
}
