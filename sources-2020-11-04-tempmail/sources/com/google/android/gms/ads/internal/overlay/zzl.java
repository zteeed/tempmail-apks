package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.graphics.Bitmap;
import com.google.android.gms.ads.internal.zzg;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.internal.ads.zzaxr;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzayj;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class zzl extends zzaxr {
    final /* synthetic */ zzc zzdoc;

    private zzl(zzc zzc) {
        this.zzdoc = zzc;
    }

    public final void zzut() {
        Bitmap a2 = zzq.zzlp().a(Integer.valueOf(this.zzdoc.zzdnb.zzdol.zzboo));
        if (a2 != null) {
            zzayj zzky = zzq.zzky();
            zzc zzc = this.zzdoc;
            Activity activity = zzc.zzaar;
            zzg zzg = zzc.zzdnb.zzdol;
            zzaye.h.post(new zzk(this, zzky.d(activity, a2, zzg.zzbom, zzg.zzbon)));
        }
    }
}
