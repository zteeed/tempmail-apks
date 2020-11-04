package d.a.a0.e.d;

import d.a.q;
import d.a.s;
import d.a.z.o;

/* compiled from: ObservableFilter */
public final class u0<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final o<? super T> f13568c;

    /* compiled from: ObservableFilter */
    static final class a<T> extends d.a.a0.d.a<T, T> {
        final o<? super T> g;

        a(s<? super T> sVar, o<? super T> oVar) {
            super(sVar);
            this.g = oVar;
        }

        public int g(int i) {
            return d(i);
        }

        public void onNext(T t) {
            if (this.f12657f == 0) {
                try {
                    if (this.g.a(t)) {
                        this.f12653b.onNext(t);
                    }
                } catch (Throwable th) {
                    c(th);
                }
            } else {
                this.f12653b.onNext(null);
            }
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        public T poll() throws java.lang.Exception {
            /*
                r2 = this;
            L_0x0000:
                d.a.a0.c.b<T> r0 = r2.f12655d
                java.lang.Object r0 = r0.poll()
                if (r0 == 0) goto L_0x0010
                d.a.z.o<? super T> r1 = r2.g
                boolean r1 = r1.a(r0)
                if (r1 == 0) goto L_0x0000
            L_0x0010:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: d.a.a0.e.d.u0.a.poll():java.lang.Object");
        }
    }

    public u0(q<T> qVar, o<? super T> oVar) {
        super(qVar);
        this.f13568c = oVar;
    }

    public void subscribeActual(s<? super T> sVar) {
        this.f12780b.subscribe(new a(sVar, this.f13568c));
    }
}
