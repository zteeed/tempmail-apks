package d.a.a0.d;

import d.a.a0.j.e;
import d.a.a0.j.j;
import d.a.s;
import d.a.y.b;
import java.util.concurrent.CountDownLatch;

/* compiled from: BlockingBaseObserver */
public abstract class d<T> extends CountDownLatch implements s<T>, b {

    /* renamed from: b  reason: collision with root package name */
    T f13216b;

    /* renamed from: c  reason: collision with root package name */
    Throwable f13217c;

    /* renamed from: d  reason: collision with root package name */
    b f13218d;

    /* renamed from: e  reason: collision with root package name */
    volatile boolean f13219e;

    public d() {
        super(1);
    }

    public final T a() {
        if (getCount() != 0) {
            try {
                e.b();
                await();
            } catch (InterruptedException e2) {
                dispose();
                throw j.d(e2);
            }
        }
        Throwable th = this.f13217c;
        if (th == null) {
            return this.f13216b;
        }
        throw j.d(th);
    }

    public final void dispose() {
        this.f13219e = true;
        b bVar = this.f13218d;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    public final void onComplete() {
        countDown();
    }

    public final void onSubscribe(b bVar) {
        this.f13218d = bVar;
        if (this.f13219e) {
            bVar.dispose();
        }
    }
}
