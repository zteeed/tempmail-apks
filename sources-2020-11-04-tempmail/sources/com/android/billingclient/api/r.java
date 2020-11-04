package com.android.billingclient.api;

import android.os.Bundle;
import java.util.Arrays;
import java.util.concurrent.Callable;

/* compiled from: com.android.billingclient:billing@@3.0.0 */
final class r implements Callable<Bundle> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ f f2566b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ n f2567c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ d f2568d;

    r(d dVar, f fVar, n nVar) {
        this.f2568d = dVar;
        this.f2566b = fVar;
        this.f2567c = nVar;
    }

    public final /* synthetic */ Object call() throws Exception {
        return this.f2568d.f2497f.F2(5, this.f2568d.f2496e.getPackageName(), Arrays.asList(new String[]{this.f2566b.a()}), this.f2567c.f(), "subs", (String) null);
    }
}
