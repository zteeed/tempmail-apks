package d.a.a0.j;

import d.a.c;
import d.a.d0.a;
import d.a.i;
import d.a.s;
import d.a.v;
import d.a.y.b;

/* compiled from: EmptyComponent */
public enum g implements d.a.g<Object>, s<Object>, i<Object>, v<Object>, c, f.a.c, b {
    INSTANCE;

    public static <T> s<T> g() {
        return INSTANCE;
    }

    public void cancel() {
    }

    public void dispose() {
    }

    public void f(f.a.c cVar) {
        cVar.cancel();
    }

    public void onComplete() {
    }

    public void onError(Throwable th) {
        a.s(th);
    }

    public void onNext(Object obj) {
    }

    public void onSubscribe(b bVar) {
        bVar.dispose();
    }

    public void onSuccess(Object obj) {
    }

    public void request(long j) {
    }
}
