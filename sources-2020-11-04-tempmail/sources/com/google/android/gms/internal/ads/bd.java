package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class bd implements zzbtg, zzbua {

    /* renamed from: b  reason: collision with root package name */
    private final Context f3641b;

    /* renamed from: c  reason: collision with root package name */
    private final zzdkk f3642c;

    /* renamed from: d  reason: collision with root package name */
    private final zzaqp f3643d;

    public bd(Context context, zzdkk zzdkk, zzaqp zzaqp) {
        this.f3641b = context;
        this.f3642c = zzdkk;
        this.f3643d = zzaqp;
    }

    public final void f(Context context) {
        this.f3643d.a();
    }

    public final void k(Context context) {
    }

    public final void onAdLoaded() {
        zzaqn zzaqn = this.f3642c.V;
        if (zzaqn != null && zzaqn.f6058a) {
            ArrayList arrayList = new ArrayList();
            if (!this.f3642c.V.f6059b.isEmpty()) {
                arrayList.add(this.f3642c.V.f6059b);
            }
            this.f3643d.b(this.f3641b, arrayList);
        }
    }

    public final void r(Context context) {
    }
}
