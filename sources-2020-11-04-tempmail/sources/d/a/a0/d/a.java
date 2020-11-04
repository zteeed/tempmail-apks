package d.a.a0.d;

import d.a.a0.a.c;
import d.a.a0.c.b;
import d.a.s;

/* compiled from: BasicFuseableObserver */
public abstract class a<T, R> implements s<T>, b<R> {

    /* renamed from: b  reason: collision with root package name */
    protected final s<? super R> f13211b;

    /* renamed from: c  reason: collision with root package name */
    protected d.a.y.b f13212c;

    /* renamed from: d  reason: collision with root package name */
    protected b<T> f13213d;

    /* renamed from: e  reason: collision with root package name */
    protected boolean f13214e;

    /* renamed from: f  reason: collision with root package name */
    protected int f13215f;

    public a(s<? super R> sVar) {
        this.f13211b = sVar;
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
        this.f13212c.dispose();
        onError(th);
    }

    public void clear() {
        this.f13213d.clear();
    }

    /* access modifiers changed from: protected */
    public final int d(int i) {
        b<T> bVar = this.f13213d;
        if (bVar == null || (i & 4) != 0) {
            return 0;
        }
        int g = bVar.g(i);
        if (g != 0) {
            this.f13215f = g;
        }
        return g;
    }

    public void dispose() {
        this.f13212c.dispose();
    }

    public boolean isEmpty() {
        return this.f13213d.isEmpty();
    }

    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public void onComplete() {
        if (!this.f13214e) {
            this.f13214e = true;
            this.f13211b.onComplete();
        }
    }

    public void onError(Throwable th) {
        if (this.f13214e) {
            d.a.d0.a.s(th);
            return;
        }
        this.f13214e = true;
        this.f13211b.onError(th);
    }

    public final void onSubscribe(d.a.y.b bVar) {
        if (c.p(this.f13212c, bVar)) {
            this.f13212c = bVar;
            if (bVar instanceof b) {
                this.f13213d = (b) bVar;
            }
            if (b()) {
                this.f13211b.onSubscribe(this);
                a();
            }
        }
    }
}
