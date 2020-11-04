package com.google.android.gms.tasks;

final class e implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Task f10772b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ d f10773c;

    e(d dVar, Task task) {
        this.f10773c = dVar;
        this.f10772b = task;
    }

    public final void run() {
        try {
            Task task = (Task) this.f10773c.f10770b.then(this.f10772b);
            if (task == null) {
                this.f10773c.b(new NullPointerException("Continuation returned null"));
                return;
            }
            task.h(TaskExecutors.f10755b, this.f10773c);
            task.f(TaskExecutors.f10755b, this.f10773c);
            task.a(TaskExecutors.f10755b, this.f10773c);
        } catch (RuntimeExecutionException e2) {
            if (e2.getCause() instanceof Exception) {
                this.f10773c.f10771c.u((Exception) e2.getCause());
            } else {
                this.f10773c.f10771c.u(e2);
            }
        } catch (Exception e3) {
            this.f10773c.f10771c.u(e3);
        }
    }
}
