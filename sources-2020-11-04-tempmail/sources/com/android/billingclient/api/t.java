package com.android.billingclient.api;

import com.android.billingclient.api.j;
import java.util.concurrent.Callable;

/* compiled from: com.android.billingclient:billing@@3.0.0 */
final class t implements Callable<j.a> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f2579b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ d f2580c;

    t(d dVar, String str) {
        this.f2580c = dVar;
        this.f2579b = str;
    }

    public final /* synthetic */ Object call() throws Exception {
        return this.f2580c.E(this.f2579b);
    }
}
