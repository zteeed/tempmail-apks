package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class ho implements zzcam {

    /* renamed from: a  reason: collision with root package name */
    private final zzcqv f3983a;

    ho(zzcqv zzcqv) {
        this.f3983a = zzcqv;
    }

    public final void a(boolean z, Context context) {
        zzcqv zzcqv = this.f3983a;
        try {
            ((zzdlm) zzcqv.f7383b).h(z);
            ((zzdlm) zzcqv.f7383b).i();
        } catch (zzdlg e2) {
            zzbba.h("Cannot show interstitial.");
            throw new zzcap(e2.getCause());
        }
    }
}
