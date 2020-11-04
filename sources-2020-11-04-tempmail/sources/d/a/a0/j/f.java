package d.a.a0.j;

import d.a.z.a;
import java.util.concurrent.CountDownLatch;

/* compiled from: BlockingIgnoringReceiver */
public final class f extends CountDownLatch implements d.a.z.f<Throwable>, a {

    /* renamed from: b  reason: collision with root package name */
    public Throwable f14469b;

    public f() {
        super(1);
    }

    /* renamed from: b */
    public void a(Throwable th) {
        this.f14469b = th;
        countDown();
    }

    public void run() {
        countDown();
    }
}
