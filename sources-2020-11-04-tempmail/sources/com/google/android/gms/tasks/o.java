package com.google.android.gms.tasks;

import java.util.concurrent.CancellationException;

final class o implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Task f10796b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ n f10797c;

    o(n nVar, Task task) {
        this.f10797c = nVar;
        this.f10796b = task;
    }

    public final void run() {
        try {
            Task then = this.f10797c.f10794b.then(this.f10796b.n());
            if (then == null) {
                this.f10797c.b(new NullPointerException("Continuation returned null"));
                return;
            }
            then.h(TaskExecutors.f10755b, this.f10797c);
            then.f(TaskExecutors.f10755b, this.f10797c);
            then.a(TaskExecutors.f10755b, this.f10797c);
        } catch (RuntimeExecutionException e2) {
            if (e2.getCause() instanceof Exception) {
                this.f10797c.b((Exception) e2.getCause());
            } else {
                this.f10797c.b(e2);
            }
        } catch (CancellationException unused) {
            this.f10797c.c();
        } catch (Exception e3) {
            this.f10797c.b(e3);
        }
    }
}
