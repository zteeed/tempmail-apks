package d.a.a0.e.d;

import d.a.a0.b.b;
import d.a.p;
import d.a.q;
import d.a.s;
import io.reactivex.exceptions.a;

/* compiled from: ObservableLift */
public final class u1<R, T> extends a<T, R> {

    /* renamed from: c  reason: collision with root package name */
    final p<? extends R, ? super T> f14127c;

    public u1(q<T> qVar, p<? extends R, ? super T> pVar) {
        super(qVar);
        this.f14127c = pVar;
    }

    public void subscribeActual(s<? super R> sVar) {
        try {
            s<? super Object> a2 = this.f14127c.a(sVar);
            b.e(a2, "Operator " + this.f14127c + " returned a null Observer");
            this.f13338b.subscribe(a2);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            a.b(th);
            d.a.d0.a.s(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}
