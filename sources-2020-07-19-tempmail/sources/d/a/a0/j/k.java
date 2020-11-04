package d.a.a0.j;

import d.a.d0.a;
import d.a.s;
import f.a.b;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: HalfSerializer */
public final class k {
    public static void a(s<?> sVar, AtomicInteger atomicInteger, c cVar) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable b2 = cVar.b();
            if (b2 != null) {
                sVar.onError(b2);
            } else {
                sVar.onComplete();
            }
        }
    }

    public static void b(b<?> bVar, AtomicInteger atomicInteger, c cVar) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable b2 = cVar.b();
            if (b2 != null) {
                bVar.onError(b2);
            } else {
                bVar.onComplete();
            }
        }
    }

    public static void c(s<?> sVar, Throwable th, AtomicInteger atomicInteger, c cVar) {
        if (!cVar.a(th)) {
            a.s(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            sVar.onError(cVar.b());
        }
    }

    public static void d(b<?> bVar, Throwable th, AtomicInteger atomicInteger, c cVar) {
        if (!cVar.a(th)) {
            a.s(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            bVar.onError(cVar.b());
        }
    }

    public static <T> void e(s<? super T> sVar, T t, AtomicInteger atomicInteger, c cVar) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            sVar.onNext(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable b2 = cVar.b();
                if (b2 != null) {
                    sVar.onError(b2);
                } else {
                    sVar.onComplete();
                }
            }
        }
    }

    public static <T> void f(b<? super T> bVar, T t, AtomicInteger atomicInteger, c cVar) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            bVar.onNext(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable b2 = cVar.b();
                if (b2 != null) {
                    bVar.onError(b2);
                } else {
                    bVar.onComplete();
                }
            }
        }
    }
}
