package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdda implements zzdec<zzddz<Bundle>> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f8064a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8065b;

    zzdda(Context context, String str) {
        this.f8064a = context;
        this.f8065b = str;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Bundle bundle) {
        bundle.putString("rewarded_sku_package", this.f8064a.getPackageName());
    }

    public final zzdvf<zzddz<Bundle>> b() {
        ss ssVar;
        if (this.f8065b == null) {
            ssVar = null;
        } else {
            ssVar = new ss(this);
        }
        return zzdux.g(ssVar);
    }
}
