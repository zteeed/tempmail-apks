package d.a.a0.e.d;

import d.a.a0.a.d;
import d.a.a0.b.b;
import d.a.a0.e.d.m2;
import d.a.q;
import d.a.u;
import d.a.v;
import d.a.z.c;
import io.reactivex.exceptions.a;
import java.util.concurrent.Callable;

/* compiled from: ObservableReduceWithSingle */
public final class n2<T, R> extends u<R> {

    /* renamed from: a  reason: collision with root package name */
    final q<T> f13869a;

    /* renamed from: b  reason: collision with root package name */
    final Callable<R> f13870b;

    /* renamed from: c  reason: collision with root package name */
    final c<R, ? super T, R> f13871c;

    public n2(q<T> qVar, Callable<R> callable, c<R, ? super T, R> cVar) {
        this.f13869a = qVar;
        this.f13870b = callable;
        this.f13871c = cVar;
    }

    /* access modifiers changed from: protected */
    public void e(v<? super R> vVar) {
        try {
            R call = this.f13870b.call();
            b.e(call, "The seedSupplier returned a null value");
            this.f13869a.subscribe(new m2.a(vVar, this.f13871c, call));
        } catch (Throwable th) {
            a.b(th);
            d.n(th, vVar);
        }
    }
}
