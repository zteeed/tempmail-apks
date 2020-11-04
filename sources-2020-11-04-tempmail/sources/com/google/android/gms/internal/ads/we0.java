package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class we0 implements ValueCallback<String> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ te0 f5416a;

    we0(te0 te0) {
        this.f5416a = te0;
    }

    public final /* synthetic */ void onReceiveValue(Object obj) {
        te0 te0 = this.f5416a;
        te0.f5165f.c(te0.f5162c, te0.f5163d, (String) obj, te0.f5164e);
    }
}
