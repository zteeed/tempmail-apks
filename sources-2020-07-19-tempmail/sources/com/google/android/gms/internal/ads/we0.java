package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class we0 implements ValueCallback<String> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ te0 f5233a;

    we0(te0 te0) {
        this.f5233a = te0;
    }

    public final /* synthetic */ void onReceiveValue(Object obj) {
        te0 te0 = this.f5233a;
        te0.f4982f.c(te0.f4979c, te0.f4980d, (String) obj, te0.f4981e);
    }
}
