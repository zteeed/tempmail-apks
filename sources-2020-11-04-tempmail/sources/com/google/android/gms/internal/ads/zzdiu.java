package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.reward.AdMetadataListener;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdiu extends AdMetadataListener implements zzbsl, zzbsq, zzbsz, zzbua, zzbup, zzdim {

    /* renamed from: b  reason: collision with root package name */
    private final zzdmi f8270b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicReference<AdMetadataListener> f8271c = new AtomicReference<>();

    /* renamed from: d  reason: collision with root package name */
    private final AtomicReference<zzauq> f8272d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private final AtomicReference<zzauj> f8273e = new AtomicReference<>();

    /* renamed from: f  reason: collision with root package name */
    private final AtomicReference<zzatq> f8274f = new AtomicReference<>();
    private final AtomicReference<zzaur> g = new AtomicReference<>();
    private final AtomicReference<zzath> h = new AtomicReference<>();
    private final AtomicReference<zzyc> i = new AtomicReference<>();
    private zzdiu j = null;

    public zzdiu(zzdmi zzdmi) {
        this.f8270b = zzdmi;
    }

    public static zzdiu f(zzdiu zzdiu) {
        zzdiu zzdiu2 = new zzdiu(zzdiu.f8270b);
        zzdiu2.b(zzdiu);
        return zzdiu2;
    }

    public final void a(zzvj zzvj) {
        zzdiu zzdiu = this;
        while (true) {
            zzdiu zzdiu2 = zzdiu.j;
            if (zzdiu2 != null) {
                zzdiu = zzdiu2;
            } else {
                zzdib.a(zzdiu.i, new sv(zzvj));
                return;
            }
        }
    }

    public final void b(zzdim zzdim) {
        this.j = (zzdiu) zzdim;
    }

    public final void c(zzuy zzuy) {
        zzdiu zzdiu = this;
        while (true) {
            zzdiu zzdiu2 = zzdiu.j;
            if (zzdiu2 != null) {
                zzdiu = zzdiu2;
            } else {
                zzdib.a(zzdiu.f8273e, new rv(zzuy));
                zzdib.a(zzdiu.f8273e, new qv(zzuy));
                return;
            }
        }
    }

    public final void d(zzatg zzatg, String str, String str2) {
        zzdiu zzdiu = this;
        while (true) {
            zzdiu zzdiu2 = zzdiu.j;
            if (zzdiu2 != null) {
                zzdiu = zzdiu2;
            } else {
                zzdib.a(zzdiu.f8273e, new jv(zzatg));
                zzdib.a(zzdiu.g, new mv(zzatg, str, str2));
                zzdib.a(zzdiu.f8274f, new lv(zzatg));
                zzdib.a(zzdiu.h, new pv(zzatg, str, str2));
                return;
            }
        }
    }

    public final void e(AdMetadataListener adMetadataListener) {
        this.f8271c.set(adMetadataListener);
    }

    @Deprecated
    public final void g(zzath zzath) {
        this.h.set(zzath);
    }

    @Deprecated
    public final void h(zzatq zzatq) {
        this.f8274f.set(zzatq);
    }

    public final void i(zzauj zzauj) {
        this.f8273e.set(zzauj);
    }

    public final void j(zzauq zzauq) {
        this.f8272d.set(zzauq);
    }

    public final void k(zzaur zzaur) {
        this.g.set(zzaur);
    }

    public final void l(zzyc zzyc) {
        this.i.set(zzyc);
    }

    public final void onAdClosed() {
        zzdiu zzdiu = this;
        while (true) {
            zzdiu zzdiu2 = zzdiu.j;
            if (zzdiu2 != null) {
                zzdiu = zzdiu2;
            } else {
                zzdiu.f8270b.a();
                zzdib.a(zzdiu.f8273e, zv.f5683a);
                zzdib.a(zzdiu.f8274f, yv.f5602a);
                return;
            }
        }
    }

    public final void onAdFailedToLoad(int i2) {
        zzdiu zzdiu = this;
        while (true) {
            zzdiu zzdiu2 = zzdiu.j;
            if (zzdiu2 != null) {
                zzdiu = zzdiu2;
            } else {
                zzdib.a(zzdiu.f8272d, new vv(i2));
                zzdib.a(zzdiu.f8274f, new uv(i2));
                return;
            }
        }
    }

    public final void onAdLeftApplication() {
        zzdiu zzdiu = this;
        while (true) {
            zzdiu zzdiu2 = zzdiu.j;
            if (zzdiu2 != null) {
                zzdiu = zzdiu2;
            } else {
                zzdib.a(zzdiu.f8274f, bw.f3683a);
                return;
            }
        }
    }

    public final void onAdLoaded() {
        zzdiu zzdiu = this;
        while (true) {
            zzdiu zzdiu2 = zzdiu.j;
            if (zzdiu2 != null) {
                zzdiu = zzdiu2;
            } else {
                zzdib.a(zzdiu.f8272d, iv.f4263a);
                zzdib.a(zzdiu.f8274f, kv.f4426a);
                return;
            }
        }
    }

    public final void onAdMetadataChanged() {
        zzdiu zzdiu = this.j;
        if (zzdiu != null) {
            zzdiu.onAdMetadataChanged();
        } else {
            zzdib.a(this.f8271c, tv.f5199a);
        }
    }

    public final void onAdOpened() {
        zzdiu zzdiu = this;
        while (true) {
            zzdiu zzdiu2 = zzdiu.j;
            if (zzdiu2 != null) {
                zzdiu = zzdiu2;
            } else {
                zzdib.a(zzdiu.f8273e, xv.f5515a);
                zzdib.a(zzdiu.f8274f, wv.f5445a);
                return;
            }
        }
    }

    public final void onRewardedVideoCompleted() {
        zzdiu zzdiu = this;
        while (true) {
            zzdiu zzdiu2 = zzdiu.j;
            if (zzdiu2 != null) {
                zzdiu = zzdiu2;
            } else {
                zzdib.a(zzdiu.f8274f, nv.f4691a);
                return;
            }
        }
    }

    public final void onRewardedVideoStarted() {
        zzdiu zzdiu = this;
        while (true) {
            zzdiu zzdiu2 = zzdiu.j;
            if (zzdiu2 != null) {
                zzdiu = zzdiu2;
            } else {
                zzdib.a(zzdiu.f8274f, aw.f3589a);
                return;
            }
        }
    }
}
