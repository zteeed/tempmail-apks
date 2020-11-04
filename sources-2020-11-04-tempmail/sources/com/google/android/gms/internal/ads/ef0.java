package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class ef0 implements BaseGmsClient.BaseConnectionCallbacks {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzsy f3905a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzbbn f3906b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ zzte f3907c;

    ef0(zzte zzte, zzsy zzsy, zzbbn zzbbn) {
        this.f3907c = zzte;
        this.f3905a = zzsy;
        this.f3906b = zzbbn;
    }

    public final void B(int i) {
    }

    public final void H(Bundle bundle) {
        synchronized (this.f3907c.f9291d) {
            if (!this.f3907c.f9289b) {
                boolean unused = this.f3907c.f9289b = true;
                zzsz g = this.f3907c.f9288a;
                if (g != null) {
                    this.f3906b.f(new gf0(this.f3906b, zzbbf.f6320a.g(new hf0(this, g, this.f3905a, this.f3906b))), zzbbf.f6325f);
                }
            }
        }
    }
}
