package d.a.y;

/* compiled from: RunnableDisposable */
final class e extends d<Runnable> {
    private static final long serialVersionUID = -8219729196779211169L;

    e(Runnable runnable) {
        super(runnable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void b(Runnable runnable) {
        runnable.run();
    }

    public String toString() {
        return "RunnableDisposable(disposed=" + a() + ", " + get() + ")";
    }
}
