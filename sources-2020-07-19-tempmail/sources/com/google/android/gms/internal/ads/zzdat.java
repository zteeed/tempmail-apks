package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdat implements zzdec<zzddz<Bundle>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzdhv f7801a;

    zzdat(zzdhv zzdhv) {
        this.f7801a = zzdhv;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Bundle bundle) {
        bundle.putString("key_schema", this.f7801a.a());
    }

    public final zzdvf<zzddz<Bundle>> b() {
        zzdhv zzdhv = this.f7801a;
        return zzdux.g((zzdhv == null || zzdhv.a() == null || this.f7801a.a().isEmpty()) ? null : new yr(this));
    }
}
