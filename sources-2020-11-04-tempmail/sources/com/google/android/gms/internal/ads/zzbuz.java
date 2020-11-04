package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.reward.AdMetadataListener;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbuz extends AdMetadataListener implements AppEventListener, zzbsl, zzbsz, zzbtd, zzbuf, zzbup, zzuu {

    /* renamed from: b  reason: collision with root package name */
    private final zzbvy f6833b = new zzbvy(this);
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public zzcxb f6834c;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public zzcwy f6835d;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public zzcxa f6836e;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public zzcww f6837f;
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

    public final void a(zzvj zzvj) {
        k(this.f6837f, new qe(zzvj));
        k(this.h, new te(zzvj));
    }

    public final void a1() {
        k(this.g, ve.f5322a);
    }

    public final void c(zzuy zzuy) {
        k(this.h, new we(zzuy));
    }

    public final void d(zzatg zzatg, String str, String str2) {
        k(this.f6834c, new cf(zzatg, str, str2));
        k(this.h, new ff(zzatg, str, str2));
    }

    public final zzbvy l() {
        return this.f6833b;
    }

    public final void onAdClicked() {
        k(this.f6834c, pe.f4819a);
        k(this.f6835d, oe.f4735a);
    }

    public final void onAdClosed() {
        k(this.f6834c, xe.f5489a);
        k(this.h, ze.f5644a);
    }

    public final void onAdImpression() {
        k(this.f6834c, se.f5086a);
    }

    public final void onAdLeftApplication() {
        k(this.f6834c, ye.f5567a);
        k(this.h, bf.f3647a);
    }

    public final void onAdMetadataChanged() {
        k(this.h, ue.f5245a);
    }

    public final void onAdOpened() {
        k(this.f6834c, le.f4484a);
        k(this.h, ke.f4395a);
    }

    public final void onAppEvent(String str, String str2) {
        k(this.f6836e, new re(str, str2));
    }

    public final void onRewardedVideoCompleted() {
        k(this.f6834c, ne.f4669a);
        k(this.h, me.f4571a);
    }

    public final void onRewardedVideoStarted() {
        k(this.f6834c, af.f3559a);
        k(this.h, df.f3826a);
    }
}
