package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzddj implements zzdec<zzddk> {

    /* renamed from: a  reason: collision with root package name */
    private final zzavy f7898a;

    /* renamed from: b  reason: collision with root package name */
    private final zzdvi f7899b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f7900c;

    public zzddj(zzavy zzavy, zzdvi zzdvi, Context context) {
        this.f7898a = zzavy;
        this.f7899b = zzdvi;
        this.f7900c = context;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzddk a() throws Exception {
        String str;
        String str2;
        String str3;
        if (!this.f7898a.l(this.f7900c)) {
            return new zzddk((String) null, (String) null, (String) null, (String) null, (Long) null);
        }
        String o = this.f7898a.o(this.f7900c);
        String str4 = o == null ? "" : o;
        String p = this.f7898a.p(this.f7900c);
        if (p == null) {
            str = "";
        } else {
            str = p;
        }
        String q = this.f7898a.q(this.f7900c);
        if (q == null) {
            str2 = "";
        } else {
            str2 = q;
        }
        String r = this.f7898a.r(this.f7900c);
        if (r == null) {
            str3 = "";
        } else {
            str3 = r;
        }
        return new zzddk(str4, str, str2, str3, "TIME_OUT".equals(str) ? (Long) zzwg.e().c(zzaav.W) : null);
    }

    public final zzdvf<zzddk> b() {
        return this.f7899b.f(new ys(this));
    }
}
