package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.ads.zzty;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcau implements zzbsl, zzbxz {

    /* renamed from: b  reason: collision with root package name */
    private final zzavv f6943b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f6944c;

    /* renamed from: d  reason: collision with root package name */
    private final zzavy f6945d;

    /* renamed from: e  reason: collision with root package name */
    private final View f6946e;

    /* renamed from: f  reason: collision with root package name */
    private String f6947f;
    private final zzty.zza.C0085zza g;

    public zzcau(zzavv zzavv, Context context, zzavy zzavy, View view, zzty.zza.C0085zza zza) {
        this.f6943b = zzavv;
        this.f6944c = context;
        this.f6945d = zzavy;
        this.f6946e = view;
        this.g = zza;
    }

    public final void O() {
        String n = this.f6945d.n(this.f6944c);
        this.f6947f = n;
        String valueOf = String.valueOf(n);
        String str = this.g == zzty.zza.C0085zza.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial";
        this.f6947f = str.length() != 0 ? valueOf.concat(str) : new String(valueOf);
    }

    @ParametersAreNonnullByDefault
    public final void d(zzatg zzatg, String str, String str2) {
        if (this.f6945d.l(this.f6944c)) {
            try {
                this.f6945d.g(this.f6944c, this.f6945d.q(this.f6944c), this.f6943b.f(), zzatg.getType(), zzatg.getAmount());
            } catch (RemoteException e2) {
                zzbba.d("Remote Exception to get reward item.", e2);
            }
        }
    }

    public final void onAdClosed() {
        this.f6943b.k(false);
    }

    public final void onAdLeftApplication() {
    }

    public final void onAdOpened() {
        View view = this.f6946e;
        if (!(view == null || this.f6947f == null)) {
            this.f6945d.w(view.getContext(), this.f6947f);
        }
        this.f6943b.k(true);
    }

    public final void onRewardedVideoCompleted() {
    }

    public final void onRewardedVideoStarted() {
    }
}
