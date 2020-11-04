package d.a.a0.d;

/* compiled from: BlockingLastObserver */
public final class f<T> extends d<T> {
    public void onError(Throwable th) {
        this.f13216b = null;
        this.f13217c = th;
        countDown();
    }

    public void onNext(T t) {
        this.f13216b = t;
    }
}
