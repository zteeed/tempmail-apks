package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcvt<AdT> implements zzcqt<AdT> {

    /* renamed from: a  reason: collision with root package name */
    private final zzabo f7610a;

    /* renamed from: b  reason: collision with root package name */
    private final zzdvi f7611b;

    /* renamed from: c  reason: collision with root package name */
    private final zzdou f7612c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final zzcvu<AdT> f7613d;

    public zzcvt(zzdou zzdou, zzdvi zzdvi, zzabo zzabo, zzcvu<AdT> zzcvu) {
        this.f7612c = zzdou;
        this.f7611b = zzdvi;
        this.f7610a = zzabo;
        this.f7613d = zzcvu;
    }

    public final zzdvf<AdT> a(zzdkw zzdkw, zzdkk zzdkk) {
        zzbbn zzbbn = new zzbbn();
        zzcwb zzcwb = new zzcwb();
        zzcwb.a(new qp(this, zzbbn, zzdkw, zzdkk, zzcwb));
        zzdko zzdko = zzdkk.p;
        return this.f7612c.g(zzdor.CUSTOM_RENDER_SYN).a(new pp(this, new zzabl(zzcwb, zzdko.f8145b, zzdko.f8144a)), this.f7611b).j(zzdor.CUSTOM_RENDER_ACK).h(zzbbn).f();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.p;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(com.google.android.gms.internal.ads.zzdkw r1, com.google.android.gms.internal.ads.zzdkk r2) {
        /*
            r0 = this;
            com.google.android.gms.internal.ads.zzabo r1 = r0.f7610a
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcvt.b(com.google.android.gms.internal.ads.zzdkw, com.google.android.gms.internal.ads.zzdkk):boolean");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d(zzabl zzabl) throws Exception {
        this.f7610a.k2(zzabl);
    }
}
