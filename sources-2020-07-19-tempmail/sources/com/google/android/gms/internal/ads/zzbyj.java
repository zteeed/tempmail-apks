package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbyj extends zzbwv<zzqs> implements zzqs {
    @GuardedBy("this")

    /* renamed from: c  reason: collision with root package name */
    private Map<View, zzqo> f6699c = new WeakHashMap(1);

    /* renamed from: d  reason: collision with root package name */
    private final Context f6700d;

    /* renamed from: e  reason: collision with root package name */
    private final zzdkk f6701e;

    public zzbyj(Context context, Set<zzbyg<zzqs>> set, zzdkk zzdkk) {
        super(set);
        this.f6700d = context;
        this.f6701e = zzdkk;
    }

    public final synchronized void C0(View view) {
        zzqo zzqo = this.f6699c.get(view);
        if (zzqo == null) {
            zzqo = new zzqo(this.f6700d, view);
            zzqo.d(this);
            this.f6699c.put(view, zzqo);
        }
        if (this.f6701e != null && this.f6701e.O) {
            if (((Boolean) zzwg.e().c(zzaav.G0)).booleanValue()) {
                zzqo.i(((Long) zzwg.e().c(zzaav.F0)).longValue());
                return;
            }
        }
        zzqo.m();
    }

    public final synchronized void D0(View view) {
        if (this.f6699c.containsKey(view)) {
            this.f6699c.get(view).e(this);
            this.f6699c.remove(view);
        }
    }

    public final synchronized void R(zzqt zzqt) {
        k0(new yf(zzqt));
    }
}
