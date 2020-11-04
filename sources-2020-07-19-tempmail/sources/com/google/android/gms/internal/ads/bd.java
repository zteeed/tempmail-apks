package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class bd implements zzbtg, zzbua {

    /* renamed from: b  reason: collision with root package name */
    private final Context f3458b;

    /* renamed from: c  reason: collision with root package name */
    private final zzdkk f3459c;

    /* renamed from: d  reason: collision with root package name */
    private final zzaqp f3460d;

    public bd(Context context, zzdkk zzdkk, zzaqp zzaqp) {
        this.f3458b = context;
        this.f3459c = zzdkk;
        this.f3460d = zzaqp;
    }

    public final void f(Context context) {
        this.f3460d.a();
    }

    public final void k(Context context) {
    }

    public final void onAdLoaded() {
        zzaqn zzaqn = this.f3459c.V;
        if (zzaqn != null && zzaqn.f5875a) {
            ArrayList arrayList = new ArrayList();
            if (!this.f3459c.V.f5876b.isEmpty()) {
                arrayList.add(this.f3459c.V.f5876b);
            }
            this.f3460d.b(this.f3458b, arrayList);
        }
    }

    public final void r(Context context) {
    }
}
