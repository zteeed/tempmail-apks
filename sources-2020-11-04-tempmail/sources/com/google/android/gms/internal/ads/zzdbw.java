package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdbw implements zzddz<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f8021a;

    public zzdbw(Bundle bundle) {
        this.f8021a = bundle;
    }

    public final /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle a2 = zzdlf.a(bundle, "device");
        a2.putBundle("android_mem_info", this.f8021a);
        bundle.putBundle("device", a2);
    }
}
