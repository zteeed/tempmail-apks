package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdbs implements zzddz<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final String f8017a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f8018b;

    public zzdbs(String str, boolean z) {
        this.f8017a = str;
        this.f8018b = z;
    }

    public final /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("gct", this.f8017a);
        if (this.f8018b) {
            bundle.putString("de", "1");
        }
    }
}
