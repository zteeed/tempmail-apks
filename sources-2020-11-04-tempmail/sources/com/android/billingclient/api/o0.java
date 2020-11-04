package com.android.billingclient.api;

import java.util.concurrent.Callable;

/* compiled from: com.android.billingclient:billing@@3.0.0 */
final class o0 implements Callable<Void> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f2559b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ l f2560c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ d f2561d;

    o0(d dVar, String str, l lVar) {
        this.f2561d = dVar;
        this.f2559b = str;
        this.f2560c = lVar;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.f2561d.y(new n0(this, this.f2561d.m(this.f2559b)));
        return null;
    }
}
