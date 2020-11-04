package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdcu implements zzdec<zzdcr> {

    /* renamed from: a  reason: collision with root package name */
    private final zzdvi f7874a;

    /* renamed from: b  reason: collision with root package name */
    private final Bundle f7875b;

    public zzdcu(zzdvi zzdvi, Bundle bundle) {
        this.f7874a = zzdvi;
        this.f7875b = bundle;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdcr a() throws Exception {
        return new zzdcr(this.f7875b);
    }

    public final zzdvf<zzdcr> b() {
        return this.f7874a.f(new rs(this));
    }
}
