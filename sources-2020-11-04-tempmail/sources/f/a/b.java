package f.a;

/* compiled from: Subscriber */
public interface b<T> {
    void f(c cVar);

    void onComplete();

    void onError(Throwable th);

    void onNext(T t);
}
