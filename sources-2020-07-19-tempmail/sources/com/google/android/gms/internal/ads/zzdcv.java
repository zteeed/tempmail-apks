package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdcv implements zzddz<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private String f7876a;

    public zzdcv(String str) {
        this.f7876a = str;
    }

    public final /* synthetic */ void a(Object obj) {
        ((Bundle) obj).putString("request_id", this.f7876a);
    }
}
