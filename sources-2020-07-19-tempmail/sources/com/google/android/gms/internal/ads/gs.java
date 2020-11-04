package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class gs implements zzddz<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final String f3911a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3912b;

    /* renamed from: c  reason: collision with root package name */
    private final Bundle f3913c;

    private gs(String str, String str2, Bundle bundle) {
        this.f3911a = str;
        this.f3912b = str2;
        this.f3913c = bundle;
    }

    public final /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("consent_string", this.f3911a);
        bundle.putString("fc_consent", this.f3912b);
        bundle.putBundle("iab_consent_info", this.f3913c);
    }
}
