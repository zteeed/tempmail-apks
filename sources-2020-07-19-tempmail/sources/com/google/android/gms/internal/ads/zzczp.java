package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzczp implements zzddz<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f7751a;

    private zzczp(Bundle bundle) {
        this.f7751a = bundle;
    }

    public final /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (!this.f7751a.isEmpty()) {
            bundle.putBundle("installed_adapter_data", this.f7751a);
        }
    }
}
