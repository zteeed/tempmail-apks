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
    private final Context f6928b;

    /* renamed from: c  reason: collision with root package name */
    private final zzbfn f6929c;

    /* renamed from: d  reason: collision with root package name */
    private final zzdkk f6930d;

    /* renamed from: e  reason: collision with root package name */
    private final zzbbd f6931e;

    /* renamed from: f  reason: collision with root package name */
    private final zzty.zza.C0085zza f6932f;
    @VisibleForTesting
    private IObjectWrapper g;

    public zzcao(Context context, zzbfn zzbfn, zzdkk zzdkk, zzbbd zzbbd, zzty.zza.C0085zza zza) {
        this.f6928b = context;
        this.f6929c = zzbfn;
        this.f6930d = zzdkk;
        this.f6931e = zzbbd;
        this.f6932f = zza;
    }

    public final void onAdLoaded() {
        zzty.zza.C0085zza zza = this.f6932f;
        if ((zza == zzty.zza.C0085zza.REWARD_BASED_VIDEO_AD || zza == zzty.zza.C0085zza.INTERSTITIAL) && this.f6930d.K && this.f6929c != null && zzq.zzll().h(this.f6928b)) {
            zzbbd zzbbd = this.f6931e;
            int i = zzbbd.f6315c;
            int i2 = zzbbd.f6316d;
            StringBuilder sb = new StringBuilder(23);
            sb.append(i);
            sb.append(".");
            sb.append(i2);
            IObjectWrapper b2 = zzq.zzll().b(sb.toString(), this.f6929c.getWebView(), "", "javascript", this.f6930d.M.optInt("media_type", -1) == 0 ? null : "javascript");
            this.g = b2;
            if (b2 != null && this.f6929c.getView() != null) {
                zzq.zzll().d(this.g, this.f6929c.getView());
                this.f6929c.A(this.g);
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
        if (this.g != null && (zzbfn = this.f6929c) != null) {
            zzbfn.z("onSdkImpression", new HashMap());
        }
    }
}
