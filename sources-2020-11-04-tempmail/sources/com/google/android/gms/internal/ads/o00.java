package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class o00 extends r00<V> {
    private final Callable<V> h;
    private final /* synthetic */ p00 i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    o00(p00 p00, Callable<V> callable, Executor executor) {
        super(p00, executor);
        this.i = p00;
        zzdsh.b(callable);
        this.h = callable;
    }

    /* access modifiers changed from: package-private */
    public final V c() throws Exception {
        this.f4951f = false;
        return this.h.call();
    }

    /* access modifiers changed from: package-private */
    public final String d() {
        return this.h.toString();
    }

    /* access modifiers changed from: package-private */
    public final void g(V v) {
        this.i.i(v);
    }
}
