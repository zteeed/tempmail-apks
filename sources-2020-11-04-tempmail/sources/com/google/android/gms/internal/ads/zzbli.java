package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbli implements zzbtg {

    /* renamed from: b  reason: collision with root package name */
    private final zzdlm f6499b;

    public zzbli(zzdlm zzdlm) {
        this.f6499b = zzdlm;
    }

    public final void f(Context context) {
        try {
            this.f6499b.a();
        } catch (zzdlg e2) {
            zzbba.d("Cannot invoke onDestroy for the mediation adapter.", e2);
        }
    }

    public final void k(Context context) {
        try {
            this.f6499b.g();
            if (context != null) {
                this.f6499b.e(context);
            }
        } catch (zzdlg e2) {
            zzbba.d("Cannot invoke onResume for the mediation adapter.", e2);
        }
    }

    public final void r(Context context) {
        try {
            this.f6499b.f();
        } catch (zzdlg e2) {
            zzbba.d("Cannot invoke onPause for the mediation adapter.", e2);
        }
    }
}
