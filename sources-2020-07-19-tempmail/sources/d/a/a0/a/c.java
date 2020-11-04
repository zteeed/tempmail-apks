package d.a.a0.a;

import d.a.d0.a;
import d.a.y.b;
import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: DisposableHelper */
public enum c implements b {
    DISPOSED;

    public static boolean f(AtomicReference<b> atomicReference) {
        b andSet;
        b bVar = atomicReference.get();
        c cVar = DISPOSED;
        if (bVar == cVar || (andSet = atomicReference.getAndSet(cVar)) == cVar) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.dispose();
        return true;
    }

    public static boolean g(b bVar) {
        return bVar == DISPOSED;
    }

    public static boolean h(AtomicReference<b> atomicReference, b bVar) {
        b bVar2;
        do {
            bVar2 = atomicReference.get();
            if (bVar2 == DISPOSED) {
                if (bVar == null) {
                    return false;
                }
                bVar.dispose();
                return false;
            }
        } while (!atomicReference.compareAndSet(bVar2, bVar));
        return true;
    }

    public static void k() {
        a.s(new ProtocolViolationException("Disposable already set!"));
    }

    public static boolean m(AtomicReference<b> atomicReference, b bVar) {
        b bVar2;
        do {
            bVar2 = atomicReference.get();
            if (bVar2 == DISPOSED) {
                if (bVar == null) {
                    return false;
                }
                bVar.dispose();
                return false;
            }
        } while (!atomicReference.compareAndSet(bVar2, bVar));
        if (bVar2 == null) {
            return true;
        }
        bVar2.dispose();
        return true;
    }

    public static boolean n(AtomicReference<b> atomicReference, b bVar) {
        d.a.a0.b.b.e(bVar, "d is null");
        if (atomicReference.compareAndSet((Object) null, bVar)) {
            return true;
        }
        bVar.dispose();
        if (atomicReference.get() == DISPOSED) {
            return false;
        }
        k();
        return false;
    }

    public static boolean o(AtomicReference<b> atomicReference, b bVar) {
        if (atomicReference.compareAndSet((Object) null, bVar)) {
            return true;
        }
        if (atomicReference.get() != DISPOSED) {
            return false;
        }
        bVar.dispose();
        return false;
    }

    public static boolean p(b bVar, b bVar2) {
        if (bVar2 == null) {
            a.s(new NullPointerException("next is null"));
            return false;
        } else if (bVar == null) {
            return true;
        } else {
            bVar2.dispose();
            k();
            return false;
        }
    }

    public void dispose() {
    }
}
