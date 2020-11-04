package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class gs implements zzddz<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final String f4094a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4095b;

    /* renamed from: c  reason: collision with root package name */
    private final Bundle f4096c;

    private gs(String str, String str2, Bundle bundle) {
        this.f4094a = str;
        this.f4095b = str2;
        this.f4096c = bundle;
    }

    public final /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("consent_string", this.f4094a);
        bundle.putString("fc_consent", this.f4095b);
        bundle.putBundle("iab_consent_info", this.f4096c);
    }
}
