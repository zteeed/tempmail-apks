package d.a.a0.d;

import d.a.a0.c.e;
import d.a.a0.j.n;
import d.a.a0.j.q;
import d.a.s;
import d.a.y.b;

/* compiled from: QueueDrainObserver */
public abstract class p<T, U, V> extends r implements s<T>, n<U, V> {

    /* renamed from: c  reason: collision with root package name */
    protected final s<? super V> f12690c;

    /* renamed from: d  reason: collision with root package name */
    protected final e<U> f12691d;

    /* renamed from: e  reason: collision with root package name */
    protected volatile boolean f12692e;

    /* renamed from: f  reason: collision with root package name */
    protected volatile boolean f12693f;
    protected Throwable g;

    public p(s<? super V> sVar, e<U> eVar) {
        this.f12690c = sVar;
        this.f12691d = eVar;
    }

    public final boolean a() {
        return this.f12693f;
    }

    public final boolean b() {
        return this.f12692e;
    }

    public void c(s<? super V> sVar, U u) {
    }

    public final Throwable d() {
        return this.g;
    }

    public final int e(int i) {
        return this.f12694b.addAndGet(i);
    }

    public final boolean f() {
        return this.f12694b.getAndIncrement() == 0;
    }

    public final boolean g() {
        return this.f12694b.get() == 0 && this.f12694b.compareAndSet(0, 1);
    }

    /* access modifiers changed from: protected */
    public final void h(U u, boolean z, b bVar) {
        s<? super V> sVar = this.f12690c;
        e<U> eVar = this.f12691d;
        if (this.f12694b.get() != 0 || !this.f12694b.compareAndSet(0, 1)) {
            eVar.offer(u);
            if (!f()) {
                return;
            }
        } else {
            c(sVar, u);
            if (e(-1) == 0) {
                return;
            }
        }
        q.c(eVar, sVar, z, bVar, this);
    }

    /* access modifiers changed from: protected */
    public final void i(U u, boolean z, b bVar) {
        s<? super V> sVar = this.f12690c;
        e<U> eVar = this.f12691d;
        if (this.f12694b.get() != 0 || !this.f12694b.compareAndSet(0, 1)) {
            eVar.offer(u);
            if (!f()) {
                return;
            }
        } else if (eVar.isEmpty()) {
            c(sVar, u);
            if (e(-1) == 0) {
                return;
            }
        } else {
            eVar.offer(u);
        }
        q.c(eVar, sVar, z, bVar, this);
    }
}
