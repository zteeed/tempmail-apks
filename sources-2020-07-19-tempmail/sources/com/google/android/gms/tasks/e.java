package com.google.android.gms.tasks;

final class e implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Task f10586b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ d f10587c;

    e(d dVar, Task task) {
        this.f10587c = dVar;
        this.f10586b = task;
    }

    public final void run() {
        try {
            Task task = (Task) this.f10587c.f10584b.then(this.f10586b);
            if (task == null) {
                this.f10587c.c(new NullPointerException("Continuation returned null"));
                return;
            }
            task.h(TaskExecutors.f10569b, this.f10587c);
            task.f(TaskExecutors.f10569b, this.f10587c);
            task.a(TaskExecutors.f10569b, this.f10587c);
        } catch (RuntimeExecutionException e2) {
            if (e2.getCause() instanceof Exception) {
                this.f10587c.f10585c.u((Exception) e2.getCause());
            } else {
                this.f10587c.f10585c.u(e2);
            }
        } catch (Exception e3) {
            this.f10587c.f10585c.u(e3);
        }
    }
}
