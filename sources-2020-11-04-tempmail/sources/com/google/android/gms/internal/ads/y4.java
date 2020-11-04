package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class y4 extends zzaxr {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzaxh f5532a;

    y4(zzaxh zzaxh) {
        this.f5532a = zzaxh;
    }

    public final void zzut() {
        zzaaz zzaaz = new zzaaz(this.f5532a.f6203e, this.f5532a.f6204f.f6314b);
        synchronized (this.f5532a.f6199a) {
            try {
                zzq.zzlf();
                zzaba.a(this.f5532a.g, zzaaz);
            } catch (IllegalArgumentException e2) {
                zzbba.d("Cannot config CSI reporter.", e2);
            }
        }
    }
}
