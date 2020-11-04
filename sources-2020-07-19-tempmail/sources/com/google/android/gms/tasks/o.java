package com.google.android.gms.tasks;

import java.util.concurrent.CancellationException;

final class o implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Task f10610b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ n f10611c;

    o(n nVar, Task task) {
        this.f10611c = nVar;
        this.f10610b = task;
    }

    public final void run() {
        try {
            Task then = this.f10611c.f10608b.then(this.f10610b.n());
            if (then == null) {
                this.f10611c.c(new NullPointerException("Continuation returned null"));
                return;
            }
            then.h(TaskExecutors.f10569b, this.f10611c);
            then.f(TaskExecutors.f10569b, this.f10611c);
            then.a(TaskExecutors.f10569b, this.f10611c);
        } catch (RuntimeExecutionException e2) {
            if (e2.getCause() instanceof Exception) {
                this.f10611c.c((Exception) e2.getCause());
            } else {
                this.f10611c.c(e2);
            }
        } catch (CancellationException unused) {
            this.f10611c.b();
        } catch (Exception e3) {
            this.f10611c.c(e3);
        }
    }
}
