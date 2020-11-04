package d.a.a0.j;

import d.a.a0.g.g;
import d.a.d0.a;
import d.a.y.b;
import java.util.concurrent.CountDownLatch;

/* compiled from: BlockingHelper */
public final class e {
    public static void a(CountDownLatch countDownLatch, b bVar) {
        if (countDownLatch.getCount() != 0) {
            try {
                b();
                countDownLatch.await();
            } catch (InterruptedException e2) {
                bVar.dispose();
                Thread.currentThread().interrupt();
                throw new IllegalStateException("Interrupted while waiting for subscription to complete.", e2);
            }
        }
    }

    public static void b() {
        if (!a.j()) {
            return;
        }
        if ((Thread.currentThread() instanceof g) || a.q()) {
            throw new IllegalStateException("Attempt to block on a Scheduler " + Thread.currentThread().getName() + " that doesn't support blocking operators as they may lead to deadlock");
        }
    }
}
