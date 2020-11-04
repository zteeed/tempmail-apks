package d.a.a0.a;

import d.a.a0.c.b;
import d.a.c;
import d.a.s;
import d.a.v;

/* compiled from: EmptyDisposable */
public enum d implements b<Object> {
    INSTANCE,
    NEVER;

    public static void f(c cVar) {
        cVar.onSubscribe(INSTANCE);
        cVar.onComplete();
    }

    public static void h(s<?> sVar) {
        sVar.onSubscribe(INSTANCE);
        sVar.onComplete();
    }

    public static void k(Throwable th, c cVar) {
        cVar.onSubscribe(INSTANCE);
        cVar.onError(th);
    }

    public static void m(Throwable th, s<?> sVar) {
        sVar.onSubscribe(INSTANCE);
        sVar.onError(th);
    }

    public static void n(Throwable th, v<?> vVar) {
        vVar.onSubscribe(INSTANCE);
        vVar.onError(th);
    }

    public void clear() {
    }

    public void dispose() {
    }

    public int g(int i) {
        return i & 2;
    }

    public boolean isEmpty() {
        return true;
    }

    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public Object poll() throws Exception {
        return null;
    }
}
