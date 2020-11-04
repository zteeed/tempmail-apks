package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbrv;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdid<RequestComponentT extends zzbrv<AdT>, AdT> implements zzdil<RequestComponentT, AdT> {
    @GuardedBy("this")

    /* renamed from: a  reason: collision with root package name */
    private RequestComponentT f8074a;

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final synchronized RequestComponentT b() {
        return this.f8074a;
    }

    public final synchronized zzdvf<AdT> a(zzdiq zzdiq, zzdin<RequestComponentT> zzdin) {
        RequestComponentT requestcomponentt;
        requestcomponentt = (zzbrv) zzdin.a(zzdiq.f8083b).p();
        this.f8074a = requestcomponentt;
        return requestcomponentt.a().g();
    }
}
