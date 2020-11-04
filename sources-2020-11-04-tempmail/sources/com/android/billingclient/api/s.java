package com.android.billingclient.api;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* compiled from: com.android.billingclient:billing@@3.0.0 */
final class s implements Callable<Bundle> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ int f2572b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ n f2573c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f2574d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ f f2575e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ Bundle f2576f;
    private final /* synthetic */ d g;

    s(d dVar, int i, n nVar, String str, f fVar, Bundle bundle) {
        this.g = dVar;
        this.f2572b = i;
        this.f2573c = nVar;
        this.f2574d = str;
        this.f2575e = fVar;
        this.f2576f = bundle;
    }

    public final /* synthetic */ Object call() throws Exception {
        return this.g.f2497f.d7(this.f2572b, this.g.f2496e.getPackageName(), this.f2573c.f(), this.f2574d, this.f2575e.r(), this.f2576f);
    }
}
