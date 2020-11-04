package d.a.a0.i;

import d.a.a0.j.d;
import d.a.d0.a;
import f.a.c;
import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SubscriptionHelper */
public enum b implements c {
    CANCELLED;

    public static boolean f(AtomicReference<c> atomicReference) {
        c andSet;
        b bVar = CANCELLED;
        if (atomicReference.get() == bVar || (andSet = atomicReference.getAndSet(bVar)) == bVar) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.cancel();
        return true;
    }

    public static void g(AtomicReference<c> atomicReference, AtomicLong atomicLong, long j) {
        c cVar = atomicReference.get();
        if (cVar != null) {
            cVar.request(j);
        } else if (n(j)) {
            d.a(atomicLong, j);
            c cVar2 = atomicReference.get();
            if (cVar2 != null) {
                long andSet = atomicLong.getAndSet(0);
                if (andSet != 0) {
                    cVar2.request(andSet);
                }
            }
        }
    }

    public static boolean h(AtomicReference<c> atomicReference, AtomicLong atomicLong, c cVar) {
        if (!m(atomicReference, cVar)) {
            return false;
        }
        long andSet = atomicLong.getAndSet(0);
        if (andSet == 0) {
            return true;
        }
        cVar.request(andSet);
        return true;
    }

    public static void k() {
        a.s(new ProtocolViolationException("Subscription already set!"));
    }

    public static boolean m(AtomicReference<c> atomicReference, c cVar) {
        d.a.a0.b.b.e(cVar, "s is null");
        if (atomicReference.compareAndSet((Object) null, cVar)) {
            return true;
        }
        cVar.cancel();
        if (atomicReference.get() == CANCELLED) {
            return false;
        }
        k();
        return false;
    }

    public static boolean n(long j) {
        if (j > 0) {
            return true;
        }
        a.s(new IllegalArgumentException("n > 0 required but it was " + j));
        return false;
    }

    public static boolean o(c cVar, c cVar2) {
        if (cVar2 == null) {
            a.s(new NullPointerException("next is null"));
            return false;
        } else if (cVar == null) {
            return true;
        } else {
            cVar2.cancel();
            k();
            return false;
        }
    }

    public void cancel() {
    }

    public void request(long j) {
    }
}
