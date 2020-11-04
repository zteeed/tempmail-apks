package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzq;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzckl implements zzbsp, zzbtd, zzbwk {

    /* renamed from: b  reason: collision with root package name */
    private final Context f7336b;

    /* renamed from: c  reason: collision with root package name */
    private final zzdli f7337c;

    /* renamed from: d  reason: collision with root package name */
    private final zzckx f7338d;

    /* renamed from: e  reason: collision with root package name */
    private final zzdkw f7339e;

    /* renamed from: f  reason: collision with root package name */
    private final zzdkk f7340f;
    private Boolean g;
    private final boolean h = ((Boolean) zzwg.e().c(zzaav.D3)).booleanValue();

    public zzckl(Context context, zzdli zzdli, zzckx zzckx, zzdkw zzdkw, zzdkk zzdkk) {
        this.f7336b = context;
        this.f7337c = zzdli;
        this.f7338d = zzckx;
        this.f7339e = zzdkw;
        this.f7340f = zzdkk;
    }

    private final boolean c() {
        if (this.g == null) {
            synchronized (this) {
                if (this.g == null) {
                    zzaag zzaag = zzaav.N0;
                    zzq.zzkw();
                    this.g = Boolean.valueOf(d((String) zzwg.e().c(zzaag), zzaye.L(this.f7336b)));
                }
            }
        }
        return this.g.booleanValue();
    }

    private static boolean d(String str, String str2) {
        if (!(str == null || str2 == null)) {
            try {
                return Pattern.matches(str, str2);
            } catch (RuntimeException e2) {
                zzq.zzla().e(e2, "CsiActionsListener.isPatternMatched");
            }
        }
        return false;
    }

    private final zzckw e(String str) {
        zzckw b2 = this.f7338d.b();
        b2.b(this.f7339e.f8345b.f8340b);
        b2.f(this.f7340f);
        b2.g("action", str);
        if (!this.f7340f.q.isEmpty()) {
            b2.g("ancn", this.f7340f.q.get(0));
        }
        return b2;
    }

    public final void E(zzcap zzcap) {
        if (this.h) {
            zzckw e2 = e("ifts");
            e2.g("reason", "exception");
            if (!TextUtils.isEmpty(zzcap.getMessage())) {
                e2.g("msg", zzcap.getMessage());
            }
            e2.d();
        }
    }

    public final void P(zzuy zzuy) {
        if (this.h) {
            zzckw e2 = e("ifts");
            e2.g("reason", "adapter");
            int i = zzuy.f9355b;
            if (i >= 0) {
                e2.g("arec", String.valueOf(i));
            }
            String a2 = this.f7337c.a(zzuy.f9356c);
            if (a2 != null) {
                e2.g("areec", a2);
            }
            e2.d();
        }
    }

    public final void a() {
        if (c()) {
            e("adapter_impression").d();
        }
    }

    public final void b() {
        if (c()) {
            e("adapter_shown").d();
        }
    }

    public final void g0() {
        if (this.h) {
            zzckw e2 = e("ifts");
            e2.g("reason", "blocked");
            e2.d();
        }
    }

    public final void onAdImpression() {
        if (c()) {
            e("impression").d();
        }
    }
}
