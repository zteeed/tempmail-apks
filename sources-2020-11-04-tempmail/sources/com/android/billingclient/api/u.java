package com.android.billingclient.api;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* compiled from: com.android.billingclient:billing@@3.0.0 */
final class u implements Callable<Bundle> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ n f2583b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f2584c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ d f2585d;

    u(d dVar, n nVar, String str) {
        this.f2585d = dVar;
        this.f2583b = nVar;
        this.f2584c = str;
    }

    public final /* synthetic */ Object call() throws Exception {
        return this.f2585d.f2497f.p6(3, this.f2585d.f2496e.getPackageName(), this.f2583b.f(), this.f2584c, (String) null);
    }
}
