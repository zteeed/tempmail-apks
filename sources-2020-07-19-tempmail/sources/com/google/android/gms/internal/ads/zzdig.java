package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbrv;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdig<RequestComponentT extends zzbrv<AdT>, AdT> implements zzdil<RequestComponentT, AdT> {

    /* renamed from: a  reason: collision with root package name */
    private final zzdil<RequestComponentT, AdT> f8075a;
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    private RequestComponentT f8076b;

    public zzdig(zzdil<RequestComponentT, AdT> zzdil) {
        this.f8075a = zzdil;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final synchronized RequestComponentT b() {
        return this.f8076b;
    }

    public final synchronized zzdvf<AdT> a(zzdiq zzdiq, zzdin<RequestComponentT> zzdin) {
        if (zzdiq.f8082a != null) {
            RequestComponentT requestcomponentt = (zzbrv) zzdin.a(zzdiq.f8083b).p();
            this.f8076b = requestcomponentt;
            return requestcomponentt.a().i(zzdiq.f8082a);
        }
        zzdvf<AdT> a2 = this.f8075a.a(zzdiq, zzdin);
        this.f8076b = (zzbrv) this.f8075a.b();
        return a2;
    }
}
