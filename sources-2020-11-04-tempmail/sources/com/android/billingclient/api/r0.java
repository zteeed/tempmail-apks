package com.android.billingclient.api;

import com.android.billingclient.api.g;

/* compiled from: com.android.billingclient:billing@@3.0.0 */
final class r0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ int f2569b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f2570c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ p0 f2571d;

    r0(p0 p0Var, int i, String str) {
        this.f2571d = p0Var;
        this.f2569b = i;
        this.f2570c = str;
    }

    public final void run() {
        b bVar = this.f2571d.f2563c;
        g.a c2 = g.c();
        c2.c(this.f2569b);
        c2.b(this.f2570c);
        bVar.a(c2.a());
    }
}
