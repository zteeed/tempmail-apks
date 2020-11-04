package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class y4 extends zzaxr {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzaxh f5349a;

    y4(zzaxh zzaxh) {
        this.f5349a = zzaxh;
    }

    public final void zzut() {
        zzaaz zzaaz = new zzaaz(this.f5349a.f6020e, this.f5349a.f6021f.f6131b);
        synchronized (this.f5349a.f6016a) {
            try {
                zzq.zzlf();
                zzaba.a(this.f5349a.g, zzaaz);
            } catch (IllegalArgumentException e2) {
                zzbba.d("Cannot config CSI reporter.", e2);
            }
        }
    }
}
