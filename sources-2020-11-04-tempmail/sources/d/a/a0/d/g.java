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
    T f13220b;

    /* renamed from: c  reason: collision with root package name */
    Throwable f13221c;

    /* renamed from: d  reason: collision with root package name */
    b f13222d;

    /* renamed from: e  reason: collision with root package name */
    volatile boolean f13223e;

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
        Throwable th = this.f13221c;
        if (th == null) {
            return this.f13220b;
        }
        throw j.d(th);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.f13223e = true;
        b bVar = this.f13222d;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    public void onComplete() {
        countDown();
    }

    public void onError(Throwable th) {
        this.f13221c = th;
        countDown();
    }

    public void onSubscribe(b bVar) {
        this.f13222d = bVar;
        if (this.f13223e) {
            bVar.dispose();
        }
    }

    public void onSuccess(T t) {
        this.f13220b = t;
        countDown();
    }
}
