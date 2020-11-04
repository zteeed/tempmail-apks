package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class go implements zzcam {

    /* renamed from: a  reason: collision with root package name */
    private final zzdkk f3903a;

    /* renamed from: b  reason: collision with root package name */
    private final zzaox f3904b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f3905c;

    /* renamed from: d  reason: collision with root package name */
    private zzbtc f3906d = null;

    go(zzdkk zzdkk, zzaox zzaox, boolean z) {
        this.f3903a = zzdkk;
        this.f3904b = zzaox;
        this.f3905c = z;
    }

    public final void a(boolean z, Context context) throws zzcap {
        boolean z2;
        try {
            if (this.f3905c) {
                z2 = this.f3904b.c6(ObjectWrapper.b0(context));
            } else {
                z2 = this.f3904b.v2(ObjectWrapper.b0(context));
            }
            if (z2) {
                zzbtc zzbtc = this.f3906d;
                if (zzbtc != null && this.f3903a.P == 2) {
                    zzbtc.onAdImpression();
                    return;
                }
                return;
            }
            throw new zzcap("Adapter failed to show.");
        } catch (Throwable th) {
            throw new zzcap(th);
        }
    }

    public final void b(zzbtc zzbtc) {
        this.f3906d = zzbtc;
    }
}
