package e.m0;

/* compiled from: NamedRunnable */
public abstract class d implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    protected final String f14666b;

    public d(String str, Object... objArr) {
        this.f14666b = e.p(str, objArr);
    }

    /* access modifiers changed from: protected */
    public abstract void k();

    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f14666b);
        try {
            k();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
