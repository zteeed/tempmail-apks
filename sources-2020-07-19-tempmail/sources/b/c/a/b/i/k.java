package b.c.a.b.i;

import java.util.concurrent.Executor;

/* compiled from: SafeLoggingExecutor */
class k implements Executor {

    /* renamed from: b  reason: collision with root package name */
    private final Executor f2152b;

    /* compiled from: SafeLoggingExecutor */
    static class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final Runnable f2153b;

        a(Runnable runnable) {
            this.f2153b = runnable;
        }

        public void run() {
            try {
                this.f2153b.run();
            } catch (Exception e2) {
                b.c.a.b.i.u.a.c("Executor", "Background execution failure.", e2);
            }
        }
    }

    k(Executor executor) {
        this.f2152b = executor;
    }

    public void execute(Runnable runnable) {
        this.f2152b.execute(new a(runnable));
    }
}
