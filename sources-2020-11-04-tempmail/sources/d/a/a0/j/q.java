package d.a.a0.j;

import d.a.a0.c.e;
import d.a.a0.c.f;
import d.a.a0.f.c;
import d.a.s;
import d.a.y.b;

/* compiled from: QueueDrainHelper */
public final class q {
    public static <T, U> boolean a(boolean z, boolean z2, s<?> sVar, boolean z3, f<?> fVar, b bVar, n<T, U> nVar) {
        if (nVar.b()) {
            fVar.clear();
            bVar.dispose();
            return true;
        } else if (!z) {
            return false;
        } else {
            if (!z3) {
                Throwable d2 = nVar.d();
                if (d2 != null) {
                    fVar.clear();
                    if (bVar != null) {
                        bVar.dispose();
                    }
                    sVar.onError(d2);
                    return true;
                } else if (!z2) {
                    return false;
                } else {
                    if (bVar != null) {
                        bVar.dispose();
                    }
                    sVar.onComplete();
                    return true;
                }
            } else if (!z2) {
                return false;
            } else {
                if (bVar != null) {
                    bVar.dispose();
                }
                Throwable d3 = nVar.d();
                if (d3 != null) {
                    sVar.onError(d3);
                } else {
                    sVar.onComplete();
                }
                return true;
            }
        }
    }

    public static <T> f<T> b(int i) {
        if (i < 0) {
            return new c(-i);
        }
        return new d.a.a0.f.b(i);
    }

    public static <T, U> void c(e<T> eVar, s<? super U> sVar, boolean z, b bVar, n<T, U> nVar) {
        int i = 1;
        while (!a(nVar.a(), eVar.isEmpty(), sVar, z, eVar, bVar, nVar)) {
            while (true) {
                boolean a2 = nVar.a();
                T poll = eVar.poll();
                boolean z2 = poll == null;
                if (!a(a2, z2, sVar, z, eVar, bVar, nVar)) {
                    if (z2) {
                        i = nVar.e(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        nVar.c(sVar, poll);
                    }
                } else {
                    return;
                }
            }
        }
    }
}
