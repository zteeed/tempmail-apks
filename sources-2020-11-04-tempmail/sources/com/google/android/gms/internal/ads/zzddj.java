package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzddj implements zzdec<zzddk> {

    /* renamed from: a  reason: collision with root package name */
    private final zzavy f8081a;

    /* renamed from: b  reason: collision with root package name */
    private final zzdvi f8082b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f8083c;

    public zzddj(zzavy zzavy, zzdvi zzdvi, Context context) {
        this.f8081a = zzavy;
        this.f8082b = zzdvi;
        this.f8083c = context;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzddk a() throws Exception {
        String str;
        String str2;
        String str3;
        if (!this.f8081a.l(this.f8083c)) {
            return new zzddk((String) null, (String) null, (String) null, (String) null, (Long) null);
        }
        String o = this.f8081a.o(this.f8083c);
        String str4 = o == null ? "" : o;
        String p = this.f8081a.p(this.f8083c);
        if (p == null) {
            str = "";
        } else {
            str = p;
        }
        String q = this.f8081a.q(this.f8083c);
        if (q == null) {
            str2 = "";
        } else {
            str2 = q;
        }
        String r = this.f8081a.r(this.f8083c);
        if (r == null) {
            str3 = "";
        } else {
            str3 = r;
        }
        return new zzddk(str4, str, str2, str3, "TIME_OUT".equals(str) ? (Long) zzwg.e().c(zzaav.W) : null);
    }

    public final zzdvf<zzddk> b() {
        return this.f8082b.f(new ys(this));
    }
}
