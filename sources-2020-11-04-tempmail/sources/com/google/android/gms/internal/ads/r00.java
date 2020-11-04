package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
abstract class r00<T> extends a10<T> {

    /* renamed from: e  reason: collision with root package name */
    private final Executor f4950e;

    /* renamed from: f  reason: collision with root package name */
    boolean f4951f = true;
    private final /* synthetic */ p00 g;

    r00(p00 p00, Executor executor) {
        this.g = p00;
        zzdsh.b(executor);
        this.f4950e = executor;
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        return this.g.isDone();
    }

    /* access modifiers changed from: package-private */
    public final void e(T t, Throwable th) {
        r00 unused = this.g.q = null;
        if (th == null) {
            g(t);
        } else if (th instanceof ExecutionException) {
            this.g.j(th.getCause());
        } else if (th instanceof CancellationException) {
            this.g.cancel(false);
        } else {
            this.g.j(th);
        }
    }

    /* access modifiers changed from: package-private */
    public final void f() {
        try {
            this.f4950e.execute(this);
        } catch (RejectedExecutionException e2) {
            if (this.f4951f) {
                this.g.j(e2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public abstract void g(T t);
}
