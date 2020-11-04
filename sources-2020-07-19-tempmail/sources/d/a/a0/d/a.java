package d.a.a0.d;

import d.a.a0.a.c;
import d.a.a0.c.b;
import d.a.s;

/* compiled from: BasicFuseableObserver */
public abstract class a<T, R> implements s<T>, b<R> {

    /* renamed from: b  reason: collision with root package name */
    protected final s<? super R> f12653b;

    /* renamed from: c  reason: collision with root package name */
    protected d.a.y.b f12654c;

    /* renamed from: d  reason: collision with root package name */
    protected b<T> f12655d;

    /* renamed from: e  reason: collision with root package name */
    protected boolean f12656e;

    /* renamed from: f  reason: collision with root package name */
    protected int f12657f;

    public a(s<? super R> sVar) {
        this.f12653b = sVar;
    }

    /* access modifiers changed from: protected */
    public void a() {
    }

    /* access modifiers changed from: protected */
    public boolean b() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final void c(Throwable th) {
        io.reactivex.exceptions.a.b(th);
        this.f12654c.dispose();
        onError(th);
    }

    public void clear() {
        this.f12655d.clear();
    }

    /* access modifiers changed from: protected */
    public final int d(int i) {
        b<T> bVar = this.f12655d;
        if (bVar == null || (i & 4) != 0) {
            return 0;
        }
        int g = bVar.g(i);
        if (g != 0) {
            this.f12657f = g;
        }
        return g;
    }

    public void dispose() {
        this.f12654c.dispose();
    }

    public boolean isEmpty() {
        return this.f12655d.isEmpty();
    }

    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public void onComplete() {
        if (!this.f12656e) {
            this.f12656e = true;
            this.f12653b.onComplete();
        }
    }

    public void onError(Throwable th) {
        if (this.f12656e) {
            d.a.d0.a.s(th);
            return;
        }
        this.f12656e = true;
        this.f12653b.onError(th);
    }

    public final void onSubscribe(d.a.y.b bVar) {
        if (c.p(this.f12654c, bVar)) {
            this.f12654c = bVar;
            if (bVar instanceof b) {
                this.f12655d = (b) bVar;
            }
            if (b()) {
                this.f12653b.onSubscribe(this);
                a();
            }
        }
    }
}
