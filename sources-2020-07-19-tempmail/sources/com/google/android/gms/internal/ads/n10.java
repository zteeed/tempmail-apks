package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class n10 extends a10<V> {

    /* renamed from: e  reason: collision with root package name */
    private final Callable<V> f4440e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ l10 f4441f;

    n10(l10 l10, Callable<V> callable) {
        this.f4441f = l10;
        zzdsh.b(callable);
        this.f4440e = callable;
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        return this.f4441f.isDone();
    }

    /* access modifiers changed from: package-private */
    public final V c() throws Exception {
        return this.f4440e.call();
    }

    /* access modifiers changed from: package-private */
    public final String d() {
        return this.f4440e.toString();
    }

    /* access modifiers changed from: package-private */
    public final void e(V v, Throwable th) {
        if (th == null) {
            this.f4441f.i(v);
        } else {
            this.f4441f.j(th);
        }
    }
}
