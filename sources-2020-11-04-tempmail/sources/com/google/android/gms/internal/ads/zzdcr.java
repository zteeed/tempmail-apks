package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdcr implements zzddz<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f8054a;

    public zzdcr(Bundle bundle) {
        this.f8054a = bundle;
    }

    public final /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle bundle2 = this.f8054a;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }
}
