package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class gp implements zzcam {

    /* renamed from: a  reason: collision with root package name */
    private final zzcqv f3907a;

    gp(zzcqv zzcqv) {
        this.f3907a = zzcqv;
    }

    public final void a(boolean z, Context context) {
        zzcqv zzcqv = this.f3907a;
        try {
            ((zzdlm) zzcqv.f7383b).h(z);
            ((zzdlm) zzcqv.f7383b).j();
        } catch (zzdlg e2) {
            zzbba.d("Cannot show rewarded video.", e2);
            throw new zzcap(e2.getCause());
        }
    }
}
