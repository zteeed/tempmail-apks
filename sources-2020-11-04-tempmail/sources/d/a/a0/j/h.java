package d.a.a0.j;

import d.a.a0.a.c;
import d.a.d0.a;
import d.a.y.b;
import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: EndConsumerHelper */
public final class h {
    public static String a(String str) {
        return "It is not allowed to subscribe with a(n) " + str + " multiple times. Please create a fresh instance of " + str + " and subscribe that to the target source instead.";
    }

    public static void b(Class<?> cls) {
        a.s(new ProtocolViolationException(a(cls.getName())));
    }

    public static boolean c(AtomicReference<b> atomicReference, b bVar, Class<?> cls) {
        d.a.a0.b.b.e(bVar, "next is null");
        if (atomicReference.compareAndSet((Object) null, bVar)) {
            return true;
        }
        bVar.dispose();
        if (atomicReference.get() == c.DISPOSED) {
            return false;
        }
        b(cls);
        return false;
    }

    public static boolean d(b bVar, b bVar2, Class<?> cls) {
        d.a.a0.b.b.e(bVar2, "next is null");
        if (bVar == null) {
            return true;
        }
        bVar2.dispose();
        if (bVar == c.DISPOSED) {
            return false;
        }
        b(cls);
        return false;
    }
}
