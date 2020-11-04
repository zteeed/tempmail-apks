package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcvk implements zzcqt<zzbnc> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7589a;

    /* renamed from: b  reason: collision with root package name */
    private final zzbny f7590b;

    /* renamed from: c  reason: collision with root package name */
    private final zzabo f7591c;

    /* renamed from: d  reason: collision with root package name */
    private final zzdvi f7592d;

    /* renamed from: e  reason: collision with root package name */
    private final zzdou f7593e;

    public zzcvk(Context context, zzbny zzbny, zzdou zzdou, zzdvi zzdvi, zzabo zzabo) {
        this.f7589a = context;
        this.f7590b = zzbny;
        this.f7593e = zzdou;
        this.f7592d = zzdvi;
        this.f7591c = zzabo;
    }

    public final zzdvf<zzbnc> a(zzdkw zzdkw, zzdkk zzdkk) {
        zzbnf a2 = this.f7590b.a(new zzbpr(zzdkw, zzdkk, (String) null), new op(this, new View(this.f7589a), (zzbfn) null, np.f4501a, zzdkk.r.get(0)));
        zzcvo k = a2.k();
        zzdko zzdko = zzdkk.p;
        return this.f7593e.g(zzdor.CUSTOM_RENDER_SYN).a(new mp(this, new zzabl(k, zzdko.f8145b, zzdko.f8144a)), this.f7592d).j(zzdor.CUSTOM_RENDER_ACK).h(zzdux.g(a2.i())).f();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.p;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(com.google.android.gms.internal.ads.zzdkw r1, com.google.android.gms.internal.ads.zzdkk r2) {
        /*
            r0 = this;
            com.google.android.gms.internal.ads.zzabo r1 = r0.f7591c
            if (r1 == 0) goto L_0x000e
            com.google.android.gms.internal.ads.zzdko r1 = r2.p
            if (r1 == 0) goto L_0x000e
            java.lang.String r1 = r1.f8144a
            if (r1 == 0) goto L_0x000e
            r1 = 1
            return r1
        L_0x000e:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcvk.b(com.google.android.gms.internal.ads.zzdkw, com.google.android.gms.internal.ads.zzdkk):boolean");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c(zzabl zzabl) throws Exception {
        this.f7591c.k2(zzabl);
    }
}
