package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.l;
import d.a.n;
import d.a.o;
import d.a.s;
import d.a.y.b;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableCreate */
public final class b0<T> extends l<T> {

    /* renamed from: b  reason: collision with root package name */
    final o<T> f12814b;

    /* compiled from: ObservableCreate */
    static final class a<T> extends AtomicReference<b> implements n<T>, b {
        private static final long serialVersionUID = -3434801548987643227L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f12815b;

        a(s<? super T> sVar) {
            this.f12815b = sVar;
        }

        public boolean a() {
            return c.g((b) get());
        }

        public void b(Throwable th) {
            if (!c(th)) {
                d.a.d0.a.s(th);
            }
        }

        /* JADX INFO: finally extract failed */
        public boolean c(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (a()) {
                return false;
            }
            try {
                this.f12815b.onError(th);
                dispose();
                return true;
            } catch (Throwable th2) {
                dispose();
                throw th2;
            }
        }

        public void dispose() {
            c.f(this);
        }

        public String toString() {
            return String.format("%s{%s}", new Object[]{a.class.getSimpleName(), super.toString()});
        }
    }

    public b0(o<T> oVar) {
        this.f12814b = oVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super T> sVar) {
        a aVar = new a(sVar);
        sVar.onSubscribe(aVar);
        try {
            this.f12814b.a(aVar);
        } catch (Throwable th) {
            io.reactivex.exceptions.a.b(th);
            aVar.b(th);
        }
    }
}
