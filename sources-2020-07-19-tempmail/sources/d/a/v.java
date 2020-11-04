package d.a;

import d.a.y.b;

/* compiled from: SingleObserver */
public interface v<T> {
    void onError(Throwable th);

    void onSubscribe(b bVar);

    void onSuccess(T t);
}
