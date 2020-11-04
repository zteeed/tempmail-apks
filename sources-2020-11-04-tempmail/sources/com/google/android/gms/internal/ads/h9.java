package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class h9 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ View f4127b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzavr f4128c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ int f4129d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ zzbfq f4130e;

    h9(zzbfq zzbfq, View view, zzavr zzavr, int i) {
        this.f4130e = zzbfq;
        this.f4127b = view;
        this.f4128c = zzavr;
        this.f4129d = i;
    }

    public final void run() {
        this.f4130e.r(this.f4127b, this.f4128c, this.f4129d - 1);
    }
}
