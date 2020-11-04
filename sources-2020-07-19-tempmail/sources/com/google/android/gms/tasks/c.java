package com.google.android.gms.tasks;

final class c implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Task f10581b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ b f10582c;

    c(b bVar, Task task) {
        this.f10582c = bVar;
        this.f10581b = task;
    }

    public final void run() {
        if (this.f10581b.p()) {
            this.f10582c.f10580c.y();
            return;
        }
        try {
            this.f10582c.f10580c.v(this.f10582c.f10579b.then(this.f10581b));
        } catch (RuntimeExecutionException e2) {
            if (e2.getCause() instanceof Exception) {
                this.f10582c.f10580c.u((Exception) e2.getCause());
            } else {
                this.f10582c.f10580c.u(e2);
            }
        } catch (Exception e3) {
            this.f10582c.f10580c.u(e3);
        }
    }
}
