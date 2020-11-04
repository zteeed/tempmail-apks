package e.m0;

/* compiled from: NamedRunnable */
public abstract class d implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    protected final String f14103b;

    public d(String str, Object... objArr) {
        this.f14103b = e.p(str, objArr);
    }

    /* access modifiers changed from: protected */
    public abstract void k();

    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f14103b);
        try {
            k();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
