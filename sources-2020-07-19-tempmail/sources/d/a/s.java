package d.a;

import d.a.y.b;

/* compiled from: Observer */
public interface s<T> {
    void onComplete();

    void onError(Throwable th);

    void onNext(T t);

    void onSubscribe(b bVar);
}
