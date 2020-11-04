package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbtf extends zzbwv<zzbtg> {
    public zzbtf(Set<zzbyg<zzbtg>> set) {
        super(set);
    }

    public final void C0(zzbyw zzbyw, Executor executor) {
        m0(zzbyg.a(new od(this, zzbyw), executor));
    }

    public final void D0(Context context) {
        k0(new nd(context));
    }

    public final void E0(Context context) {
        k0(new md(context));
    }

    public final void F0(Context context) {
        k0(new pd(context));
    }
}
