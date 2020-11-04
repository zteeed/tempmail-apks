package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class go implements zzcam {

    /* renamed from: a  reason: collision with root package name */
    private final zzdkk f4086a;

    /* renamed from: b  reason: collision with root package name */
    private final zzaox f4087b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f4088c;

    /* renamed from: d  reason: collision with root package name */
    private zzbtc f4089d = null;

    go(zzdkk zzdkk, zzaox zzaox, boolean z) {
        this.f4086a = zzdkk;
        this.f4087b = zzaox;
        this.f4088c = z;
    }

    public final void a(boolean z, Context context) throws zzcap {
        boolean z2;
        try {
            if (this.f4088c) {
                z2 = this.f4087b.C6(ObjectWrapper.h0(context));
            } else {
                z2 = this.f4087b.I2(ObjectWrapper.h0(context));
            }
            if (z2) {
                zzbtc zzbtc = this.f4089d;
                if (zzbtc != null && this.f4086a.P == 2) {
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
        this.f4089d = zzbtc;
    }
}
