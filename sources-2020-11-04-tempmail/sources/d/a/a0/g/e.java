package d.a.a0.g;

import d.a.t;
import java.util.concurrent.ThreadFactory;

/* compiled from: NewThreadScheduler */
public final class e extends t {

    /* renamed from: c  reason: collision with root package name */
    private static final h f14420c = new h("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));

    /* renamed from: b  reason: collision with root package name */
    final ThreadFactory f14421b;

    public e() {
        this(f14420c);
    }

    public t.c a() {
        return new f(this.f14421b);
    }

    public e(ThreadFactory threadFactory) {
        this.f14421b = threadFactory;
    }
}
