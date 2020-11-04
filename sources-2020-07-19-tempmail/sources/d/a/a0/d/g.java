package d.a.a0.d;

import d.a.a0.j.e;
import d.a.a0.j.j;
import d.a.c;
import d.a.i;
import d.a.v;
import d.a.y.b;
import java.util.concurrent.CountDownLatch;

/* compiled from: BlockingMultiObserver */
public final class g<T> extends CountDownLatch implements v<T>, c, i<T> {

    /* renamed from: b  reason: collision with root package name */
    T f12662b;

    /* renamed from: c  reason: collision with root package name */
    Throwable f12663c;

    /* renamed from: d  reason: collision with root package name */
    b f12664d;

    /* renamed from: e  reason: collision with root package name */
    volatile boolean f12665e;

    public g() {
        super(1);
    }

    public T a() {
        if (getCount() != 0) {
            try {
                e.b();
                await();
            } catch (InterruptedException e2) {
                b();
                throw j.d(e2);
            }
        }
        Throwable th = this.f12663c;
        if (th == null) {
            return this.f12662b;
        }
        throw j.d(th);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.f12665e = true;
        b bVar = this.f12664d;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    public void onComplete() {
        countDown();
    }

    public void onError(Throwable th) {
        this.f12663c = th;
        countDown();
    }

    public void onSubscribe(b bVar) {
        this.f12664d = bVar;
        if (this.f12665e) {
            bVar.dispose();
        }
    }

    public void onSuccess(T t) {
        this.f12662b = t;
        countDown();
    }
}
