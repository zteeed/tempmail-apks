package com.google.android.gms.tasks;

final class c implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Task f10767b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ b f10768c;

    c(b bVar, Task task) {
        this.f10768c = bVar;
        this.f10767b = task;
    }

    public final void run() {
        if (this.f10767b.p()) {
            this.f10768c.f10766c.y();
            return;
        }
        try {
            this.f10768c.f10766c.v(this.f10768c.f10765b.then(this.f10767b));
        } catch (RuntimeExecutionException e2) {
            if (e2.getCause() instanceof Exception) {
                this.f10768c.f10766c.u((Exception) e2.getCause());
            } else {
                this.f10768c.f10766c.u(e2);
            }
        } catch (Exception e3) {
            this.f10768c.f10766c.u(e3);
        }
    }
}
