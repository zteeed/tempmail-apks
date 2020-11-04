package com.android.billingclient.api;

import com.android.billingclient.api.g;
import com.android.billingclient.api.n;

/* compiled from: com.android.billingclient:billing@@3.0.0 */
final class k0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ n.a f2540b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ i0 f2541c;

    k0(i0 i0Var, n.a aVar) {
        this.f2541c = i0Var;
        this.f2540b = aVar;
    }

    public final void run() {
        p pVar = this.f2541c.f2530e;
        g.a c2 = g.c();
        c2.c(this.f2540b.b());
        c2.b(this.f2540b.c());
        pVar.e(c2.a(), this.f2540b.a());
    }
}
