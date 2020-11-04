package d.a.a0.d;

/* compiled from: BlockingFirstObserver */
public final class e<T> extends d<T> {
    public void onError(Throwable th) {
        if (this.f12658b == null) {
            this.f12659c = th;
        }
        countDown();
    }

    public void onNext(T t) {
        if (this.f12658b == null) {
            this.f12658b = t;
            this.f12660d.dispose();
            countDown();
        }
    }
}
