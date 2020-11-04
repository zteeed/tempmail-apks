package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.reward.AdMetadataListener;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbuz extends AdMetadataListener implements AppEventListener, zzbsl, zzbsz, zzbtd, zzbuf, zzbup, zzuu {

    /* renamed from: b  reason: collision with root package name */
    private final zzbvy f6650b = new zzbvy(this);
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public zzcxb f6651c;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public zzcwy f6652d;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public zzcxa f6653e;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public zzcww f6654f;
    /* access modifiers changed from: private */
    @Nullable
    public zzdhi g;
    /* access modifiers changed from: private */
    @Nullable
    public zzdiu h;

    private static <T> void k(T t, gf<T> gfVar) {
        if (t != null) {
            gfVar.a(t);
        }
    }

    public final void U0() {
        k(this.g, ve.f5139a);
    }

    public final void a(zzvj zzvj) {
        k(this.f6654f, new qe(zzvj));
        k(this.h, new te(zzvj));
    }

    public final void c(zzuy zzuy) {
        k(this.h, new we(zzuy));
    }

    public final void d(zzatg zzatg, String str, String str2) {
        k(this.f6651c, new cf(zzatg, str, str2));
        k(this.h, new ff(zzatg, str, str2));
    }

    public final zzbvy l() {
        return this.f6650b;
    }

    public final void onAdClicked() {
        k(this.f6651c, pe.f4636a);
        k(this.f6652d, oe.f4552a);
    }

    public final void onAdClosed() {
        k(this.f6651c, xe.f5306a);
        k(this.h, ze.f5461a);
    }

    public final void onAdImpression() {
        k(this.f6651c, se.f4903a);
    }

    public final void onAdLeftApplication() {
        k(this.f6651c, ye.f5384a);
        k(this.h, bf.f3464a);
    }

    public final void onAdMetadataChanged() {
        k(this.h, ue.f5062a);
    }

    public final void onAdOpened() {
        k(this.f6651c, le.f4301a);
        k(this.h, ke.f4212a);
    }

    public final void onAppEvent(String str, String str2) {
        k(this.f6653e, new re(str, str2));
    }

    public final void onRewardedVideoCompleted() {
        k(this.f6651c, ne.f4486a);
        k(this.h, me.f4388a);
    }

    public final void onRewardedVideoStarted() {
        k(this.f6651c, af.f3376a);
        k(this.h, df.f3643a);
    }
}
