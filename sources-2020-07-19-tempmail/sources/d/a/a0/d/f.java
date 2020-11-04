package d.a.a0.d;

/* compiled from: BlockingLastObserver */
public final class f<T> extends d<T> {
    public void onError(Throwable th) {
        this.f12658b = null;
        this.f12659c = th;
        countDown();
    }

    public void onNext(T t) {
        this.f12658b = t;
    }
}
