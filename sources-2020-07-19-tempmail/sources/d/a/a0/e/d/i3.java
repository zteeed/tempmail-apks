package d.a.a0.e.d;

import d.a.a0.f.c;
import d.a.q;
import d.a.s;
import d.a.t;
import d.a.y.b;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ObservableSkipLastTimed */
public final class i3<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final long f13097c;

    /* renamed from: d  reason: collision with root package name */
    final TimeUnit f13098d;

    /* renamed from: e  reason: collision with root package name */
    final t f13099e;

    /* renamed from: f  reason: collision with root package name */
    final int f13100f;
    final boolean g;

    /* compiled from: ObservableSkipLastTimed */
    static final class a<T> extends AtomicInteger implements s<T>, b {
        private static final long serialVersionUID = -5677354903406201275L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13101b;

        /* renamed from: c  reason: collision with root package name */
        final long f13102c;

        /* renamed from: d  reason: collision with root package name */
        final TimeUnit f13103d;

        /* renamed from: e  reason: collision with root package name */
        final t f13104e;

        /* renamed from: f  reason: collision with root package name */
        final c<Object> f13105f;
        final boolean g;
        b h;
        volatile boolean i;
        volatile boolean j;
        Throwable k;

        a(s<? super T> sVar, long j2, TimeUnit timeUnit, t tVar, int i2, boolean z) {
            this.f13101b = sVar;
            this.f13102c = j2;
            this.f13103d = timeUnit;
            this.f13104e = tVar;
            this.f13105f = new c<>(i2);
            this.g = z;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (getAndIncrement() == 0) {
                s<? super T> sVar = this.f13101b;
                c<Object> cVar = this.f13105f;
                boolean z = this.g;
                TimeUnit timeUnit = this.f13103d;
                t tVar = this.f13104e;
                long j2 = this.f13102c;
                int i2 = 1;
                while (!this.i) {
                    boolean z2 = this.j;
                    Long l = (Long) cVar.n();
                    boolean z3 = l == null;
                    long b2 = tVar.b(timeUnit);
                    if (!z3 && l.longValue() > b2 - j2) {
                        z3 = true;
                    }
                    if (z2) {
                        if (!z) {
                            Throwable th = this.k;
                            if (th != null) {
                                this.f13105f.clear();
                                sVar.onError(th);
                                return;
                            } else if (z3) {
                                sVar.onComplete();
                                return;
                            }
                        } else if (z3) {
                            Throwable th2 = this.k;
                            if (th2 != null) {
                                sVar.onError(th2);
                                return;
                            } else {
                                sVar.onComplete();
                                return;
                            }
                        }
                    }
                    if (z3) {
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else {
                        cVar.poll();
                        sVar.onNext(cVar.poll());
                    }
                }
                this.f13105f.clear();
            }
        }

        public void dispose() {
            if (!this.i) {
                this.i = true;
                this.h.dispose();
                if (getAndIncrement() == 0) {
                    this.f13105f.clear();
                }
            }
        }

        public void onComplete() {
            this.j = true;
            a();
        }

        public void onError(Throwable th) {
            this.k = th;
            this.j = true;
            a();
        }

        public void onNext(T t) {
            this.f13105f.m(Long.valueOf(this.f13104e.b(this.f13103d)), t);
            a();
        }

        public void onSubscribe(b bVar) {
            if (d.a.a0.a.c.p(this.h, bVar)) {
                this.h = bVar;
                this.f13101b.onSubscribe(this);
            }
        }
    }

    public i3(q<T> qVar, long j, TimeUnit timeUnit, t tVar, int i, boolean z) {
        super(qVar);
        this.f13097c = j;
        this.f13098d = timeUnit;
        this.f13099e = tVar;
        this.f13100f = i;
        this.g = z;
    }

    public void subscribeActual(s<? super T> sVar) {
        this.f12780b.subscribe(new a(sVar, this.f13097c, this.f13098d, this.f13099e, this.f13100f, this.g));
    }
}
