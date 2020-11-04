package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbrv;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdig<RequestComponentT extends zzbrv<AdT>, AdT> implements zzdil<RequestComponentT, AdT> {

    /* renamed from: a  reason: collision with root package name */
    private final zzdil<RequestComponentT, AdT> f8258a;
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    private RequestComponentT f8259b;

    public zzdig(zzdil<RequestComponentT, AdT> zzdil) {
        this.f8258a = zzdil;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final synchronized RequestComponentT b() {
        return this.f8259b;
    }

    public final synchronized zzdvf<AdT> a(zzdiq zzdiq, zzdin<RequestComponentT> zzdin) {
        if (zzdiq.f8265a != null) {
            RequestComponentT requestcomponentt = (zzbrv) zzdin.a(zzdiq.f8266b).p();
            this.f8259b = requestcomponentt;
            return requestcomponentt.a().i(zzdiq.f8265a);
        }
        zzdvf<AdT> a2 = this.f8258a.a(zzdiq, zzdin);
        this.f8259b = (zzbrv) this.f8258a.b();
        return a2;
    }
}
