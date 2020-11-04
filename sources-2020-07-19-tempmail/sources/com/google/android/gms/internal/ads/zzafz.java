package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzafz {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener f5680a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final NativeCustomTemplateAd.OnCustomClickListener f5681b;

    /* renamed from: c  reason: collision with root package name */
    private NativeCustomTemplateAd f5682c;

    public zzafz(NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener) {
        this.f5680a = onCustomTemplateAdLoadedListener;
        this.f5681b = onCustomClickListener;
    }

    /* access modifiers changed from: private */
    public final synchronized NativeCustomTemplateAd d(zzaep zzaep) {
        if (this.f5682c != null) {
            return this.f5682c;
        }
        zzaeq zzaeq = new zzaeq(zzaep);
        this.f5682c = zzaeq;
        return zzaeq;
    }

    public final zzafa e() {
        return new v(this);
    }

    public final zzaez f() {
        if (this.f5681b == null) {
            return null;
        }
        return new w(this);
    }
}
