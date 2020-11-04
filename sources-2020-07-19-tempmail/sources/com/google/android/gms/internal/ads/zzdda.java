package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdda implements zzdec<zzddz<Bundle>> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7881a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7882b;

    zzdda(Context context, String str) {
        this.f7881a = context;
        this.f7882b = str;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Bundle bundle) {
        bundle.putString("rewarded_sku_package", this.f7881a.getPackageName());
    }

    public final zzdvf<zzddz<Bundle>> b() {
        ss ssVar;
        if (this.f7882b == null) {
            ssVar = null;
        } else {
            ssVar = new ss(this);
        }
        return zzdux.g(ssVar);
    }
}
