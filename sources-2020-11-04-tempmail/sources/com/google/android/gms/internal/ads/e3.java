package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class e3 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AdOverlayInfoParcel f3860b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzapn f3861c;

    e3(zzapn zzapn, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f3861c = zzapn;
        this.f3860b = adOverlayInfoParcel;
    }

    public final void run() {
        zzq.zzkv();
        zzn.zza(this.f3861c.f6016a, this.f3860b, true);
    }
}
