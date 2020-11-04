package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzty;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcao implements zzo, zzbua {

    /* renamed from: b  reason: collision with root package name */
    private final Context f6745b;

    /* renamed from: c  reason: collision with root package name */
    private final zzbfn f6746c;

    /* renamed from: d  reason: collision with root package name */
    private final zzdkk f6747d;

    /* renamed from: e  reason: collision with root package name */
    private final zzbbd f6748e;

    /* renamed from: f  reason: collision with root package name */
    private final zzty.zza.C0086zza f6749f;
    @VisibleForTesting
    private IObjectWrapper g;

    public zzcao(Context context, zzbfn zzbfn, zzdkk zzdkk, zzbbd zzbbd, zzty.zza.C0086zza zza) {
        this.f6745b = context;
        this.f6746c = zzbfn;
        this.f6747d = zzdkk;
        this.f6748e = zzbbd;
        this.f6749f = zza;
    }

    public final void onAdLoaded() {
        zzty.zza.C0086zza zza = this.f6749f;
        if ((zza == zzty.zza.C0086zza.REWARD_BASED_VIDEO_AD || zza == zzty.zza.C0086zza.INTERSTITIAL) && this.f6747d.K && this.f6746c != null && zzq.zzll().h(this.f6745b)) {
            zzbbd zzbbd = this.f6748e;
            int i = zzbbd.f6132c;
            int i2 = zzbbd.f6133d;
            StringBuilder sb = new StringBuilder(23);
            sb.append(i);
            sb.append(".");
            sb.append(i2);
            IObjectWrapper b2 = zzq.zzll().b(sb.toString(), this.f6746c.getWebView(), "", "javascript", this.f6747d.M.optInt("media_type", -1) == 0 ? null : "javascript");
            this.g = b2;
            if (b2 != null && this.f6746c.getView() != null) {
                zzq.zzll().d(this.g, this.f6746c.getView());
                this.f6746c.A(this.g);
                zzq.zzll().e(this.g);
            }
        }
    }

    public final void onPause() {
    }

    public final void onResume() {
    }

    public final void zzud() {
        this.g = null;
    }

    public final void zzue() {
        zzbfn zzbfn;
        if (this.g != null && (zzbfn = this.f6746c) != null) {
            zzbfn.z("onSdkImpression", new HashMap());
        }
    }
}
