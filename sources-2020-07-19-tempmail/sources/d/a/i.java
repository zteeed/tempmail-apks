package d.a;

import d.a.y.b;

/* compiled from: MaybeObserver */
public interface i<T> {
    void onComplete();

    void onError(Throwable th);

    void onSubscribe(b bVar);

    void onSuccess(T t);
}
