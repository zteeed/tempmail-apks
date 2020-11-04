package com.android.billingclient.api;

import com.android.billingclient.api.d;

/* compiled from: com.android.billingclient:billing@@3.0.0 */
final class n0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ d.b f2552b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ o0 f2553c;

    n0(o0 o0Var, d.b bVar) {
        this.f2553c = o0Var;
        this.f2552b = bVar;
    }

    public final void run() {
        this.f2553c.f2560c.a(this.f2552b.a(), this.f2552b.b());
    }
}
