package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class uo implements zzcam {

    /* renamed from: a  reason: collision with root package name */
    private final zzcqv f5075a;

    uo(zzcqv zzcqv) {
        this.f5075a = zzcqv;
    }

    public final void a(boolean z, Context context) {
        zzcqv zzcqv = this.f5075a;
        try {
            ((zzdlm) zzcqv.f7383b).h(z);
            ((zzdlm) zzcqv.f7383b).v(context);
        } catch (zzdlg e2) {
            throw new zzcap(e2.getCause());
        }
    }
}
