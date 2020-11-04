package com.android.billingclient.api;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.android.billingclient:billing@@3.0.0 */
final class i0 implements Callable<Void> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f2527b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ List f2528c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f2529d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ p f2530e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ d f2531f;

    i0(d dVar, String str, List list, String str2, p pVar) {
        this.f2531f = dVar;
        this.f2527b = str;
        this.f2528c = list;
        this.f2529d = str2;
        this.f2530e = pVar;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.f2531f.y(new k0(this, this.f2531f.p(this.f2527b, this.f2528c, this.f2529d)));
        return null;
    }
}
