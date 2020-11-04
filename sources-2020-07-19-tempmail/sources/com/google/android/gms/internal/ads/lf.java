package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class lf implements zzbwx {

    /* renamed from: a  reason: collision with root package name */
    private final String f4303a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4304b;

    lf(String str, String str2) {
        this.f4303a = str;
        this.f4304b = str2;
    }

    public final void a(Object obj) {
        ((AppEventListener) obj).onAppEvent(this.f4303a, this.f4304b);
    }
}
