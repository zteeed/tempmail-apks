package d.a.a0.d;

/* compiled from: BlockingFirstObserver */
public final class e<T> extends d<T> {
    public void onError(Throwable th) {
        if (this.f13216b == null) {
            this.f13217c = th;
        }
        countDown();
    }

    public void onNext(T t) {
        if (this.f13216b == null) {
            this.f13216b = t;
            this.f13218d.dispose();
            countDown();
        }
    }
}
