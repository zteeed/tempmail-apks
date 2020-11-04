package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.ads.zzty;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcau implements zzbsl, zzbxz {

    /* renamed from: b  reason: collision with root package name */
    private final zzavv f6760b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f6761c;

    /* renamed from: d  reason: collision with root package name */
    private final zzavy f6762d;

    /* renamed from: e  reason: collision with root package name */
    private final View f6763e;

    /* renamed from: f  reason: collision with root package name */
    private String f6764f;
    private final zzty.zza.C0086zza g;

    public zzcau(zzavv zzavv, Context context, zzavy zzavy, View view, zzty.zza.C0086zza zza) {
        this.f6760b = zzavv;
        this.f6761c = context;
        this.f6762d = zzavy;
        this.f6763e = view;
        this.g = zza;
    }

    public final void O() {
        String n = this.f6762d.n(this.f6761c);
        this.f6764f = n;
        String valueOf = String.valueOf(n);
        String str = this.g == zzty.zza.C0086zza.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial";
        this.f6764f = str.length() != 0 ? valueOf.concat(str) : new String(valueOf);
    }

    @ParametersAreNonnullByDefault
    public final void d(zzatg zzatg, String str, String str2) {
        if (this.f6762d.l(this.f6761c)) {
            try {
                this.f6762d.g(this.f6761c, this.f6762d.q(this.f6761c), this.f6760b.f(), zzatg.getType(), zzatg.getAmount());
            } catch (RemoteException e2) {
                zzbba.d("Remote Exception to get reward item.", e2);
            }
        }
    }

    public final void onAdClosed() {
        this.f6760b.k(false);
    }

    public final void onAdLeftApplication() {
    }

    public final void onAdOpened() {
        View view = this.f6763e;
        if (!(view == null || this.f6764f == null)) {
            this.f6762d.w(view.getContext(), this.f6764f);
        }
        this.f6760b.k(true);
    }

    public final void onRewardedVideoCompleted() {
    }

    public final void onRewardedVideoStarted() {
    }
}
