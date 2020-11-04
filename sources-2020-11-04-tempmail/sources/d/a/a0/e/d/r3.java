package d.a.a0.e.d;

import d.a.a0.f.c;
import d.a.q;
import d.a.s;
import d.a.t;
import d.a.y.b;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: ObservableTakeLastTimed */
public final class r3<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final long f14017c;

    /* renamed from: d  reason: collision with root package name */
    final long f14018d;

    /* renamed from: e  reason: collision with root package name */
    final TimeUnit f14019e;

    /* renamed from: f  reason: collision with root package name */
    final t f14020f;
    final int g;
    final boolean h;

    /* compiled from: ObservableTakeLastTimed */
    static final class a<T> extends AtomicBoolean implements s<T>, b {
        private static final long serialVersionUID = -5677354903406201275L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f14021b;

        /* renamed from: c  reason: collision with root package name */
        final long f14022c;

        /* renamed from: d  reason: collision with root package name */
        final long f14023d;

        /* renamed from: e  reason: collision with root package name */
        final TimeUnit f14024e;

        /* renamed from: f  reason: collision with root package name */
        final t f14025f;
        final c<Object> g;
        final boolean h;
        b i;
        volatile boolean j;
        Throwable k;

        a(s<? super T> sVar, long j2, long j3, TimeUnit timeUnit, t tVar, int i2, boolean z) {
            this.f14021b = sVar;
            this.f14022c = j2;
            this.f14023d = j3;
            this.f14024e = timeUnit;
            this.f14025f = tVar;
            this.g = new c<>(i2);
            this.h = z;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            Throwable th;
            if (compareAndSet(false, true)) {
                s<? super T> sVar = this.f14021b;
                c<Object> cVar = this.g;
                boolean z = this.h;
                long b2 = this.f14025f.b(this.f14024e) - this.f14023d;
                while (!this.j) {
                    if (z || (th = this.k) == null) {
                        Object poll = cVar.poll();
                        if (poll == null) {
                            Throwable th2 = this.k;
                            if (th2 != null) {
                                sVar.onError(th2);
                                return;
                            } else {
                                sVar.onComplete();
                                return;
                            }
                        } else {
                            Object poll2 = cVar.poll();
                            if (((Long) poll).longValue() >= b2) {
                                sVar.onNext(poll2);
                            }
                        }
                    } else {
                        cVar.clear();
                        sVar.onError(th);
                        return;
                    }
                }
                cVar.clear();
            }
        }

        public void dispose() {
            if (!this.j) {
                this.j = true;
                this.i.dispose();
                if (compareAndSet(false, true)) {
                    this.g.clear();
                }
            }
        }

        public void onComplete() {
            a();
        }

        public void onError(Throwable th) {
            this.k = th;
            a();
        }

        public void onNext(T t) {
            c<Object> cVar = this.g;
            long b2 = this.f14025f.b(this.f14024e);
            long j2 = this.f14023d;
            long j3 = this.f14022c;
            boolean z = j3 == Long.MAX_VALUE;
            cVar.m(Long.valueOf(b2), t);
            while (!cVar.isEmpty()) {
                if (((Long) cVar.n()).longValue() <= b2 - j2 || (!z && ((long) (cVar.p() >> 1)) > j3)) {
                    cVar.poll();
                    cVar.poll();
                } else {
                    return;
                }
            }
        }

        public void onSubscribe(b bVar) {
            if (d.a.a0.a.c.p(this.i, bVar)) {
                this.i = bVar;
                this.f14021b.onSubscribe(this);
            }
        }
    }

    public r3(q<T> qVar, long j, long j2, TimeUnit timeUnit, t tVar, int i, boolean z) {
        super(qVar);
        this.f14017c = j;
        this.f14018d = j2;
        this.f14019e = timeUnit;
        this.f14020f = tVar;
        this.g = i;
        this.h = z;
    }

    public void subscribeActual(s<? super T> sVar) {
        this.f13338b.subscribe(new a(sVar, this.f14017c, this.f14018d, this.f14019e, this.f14020f, this.g, this.h));
    }
}
