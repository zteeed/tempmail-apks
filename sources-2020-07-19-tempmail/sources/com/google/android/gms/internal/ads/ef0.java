package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class ef0 implements BaseGmsClient.BaseConnectionCallbacks {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzsy f3722a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzbbn f3723b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ zzte f3724c;

    ef0(zzte zzte, zzsy zzsy, zzbbn zzbbn) {
        this.f3724c = zzte;
        this.f3722a = zzsy;
        this.f3723b = zzbbn;
    }

    public final void E(Bundle bundle) {
        synchronized (this.f3724c.f9108d) {
            if (!this.f3724c.f9106b) {
                boolean unused = this.f3724c.f9106b = true;
                zzsz g = this.f3724c.f9105a;
                if (g != null) {
                    this.f3723b.f(new gf0(this.f3723b, zzbbf.f6137a.g(new hf0(this, g, this.f3722a, this.f3723b))), zzbbf.f6142f);
                }
            }
        }
    }

    public final void y(int i) {
    }
}
