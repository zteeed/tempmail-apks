package d.a.a0.e.c;

import d.a.a0.b.b;
import d.a.c;
import d.a.d;
import d.a.j;
import d.a.s;
import d.a.w;
import d.a.z.n;
import io.reactivex.exceptions.a;
import java.util.concurrent.Callable;

/* compiled from: ScalarXMapZHelper */
final class g {
    static <T> boolean a(Object obj, n<? super T, ? extends d> nVar, c cVar) {
        if (!(obj instanceof Callable)) {
            return false;
        }
        d dVar = null;
        try {
            Object call = ((Callable) obj).call();
            if (call != null) {
                Object apply = nVar.apply(call);
                b.e(apply, "The mapper returned a null CompletableSource");
                dVar = (d) apply;
            }
            if (dVar == null) {
                d.a.a0.a.d.f(cVar);
            } else {
                dVar.b(cVar);
            }
            return true;
        } catch (Throwable th) {
            a.b(th);
            d.a.a0.a.d.k(th, cVar);
            return true;
        }
    }

    static <T, R> boolean b(Object obj, n<? super T, ? extends j<? extends R>> nVar, s<? super R> sVar) {
        if (!(obj instanceof Callable)) {
            return false;
        }
        j jVar = null;
        try {
            Object call = ((Callable) obj).call();
            if (call != null) {
                Object apply = nVar.apply(call);
                b.e(apply, "The mapper returned a null MaybeSource");
                jVar = (j) apply;
            }
            if (jVar == null) {
                d.a.a0.a.d.h(sVar);
            } else {
                jVar.b(d.a.a0.e.b.a.d(sVar));
            }
            return true;
        } catch (Throwable th) {
            a.b(th);
            d.a.a0.a.d.m(th, sVar);
            return true;
        }
    }

    static <T, R> boolean c(Object obj, n<? super T, ? extends w<? extends R>> nVar, s<? super R> sVar) {
        if (!(obj instanceof Callable)) {
            return false;
        }
        w wVar = null;
        try {
            Object call = ((Callable) obj).call();
            if (call != null) {
                Object apply = nVar.apply(call);
                b.e(apply, "The mapper returned a null SingleSource");
                wVar = (w) apply;
            }
            if (wVar == null) {
                d.a.a0.a.d.h(sVar);
            } else {
                wVar.b(d.a.a0.e.e.b.d(sVar));
            }
            return true;
        } catch (Throwable th) {
            a.b(th);
            d.a.a0.a.d.m(th, sVar);
            return true;
        }
    }
}
