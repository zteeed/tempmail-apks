package d.a.a0.g;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: RxThreadFactory */
public final class h extends AtomicLong implements ThreadFactory {
    private static final long serialVersionUID = -7789753024099756196L;

    /* renamed from: b  reason: collision with root package name */
    final String f14424b;

    /* renamed from: c  reason: collision with root package name */
    final int f14425c;

    /* renamed from: d  reason: collision with root package name */
    final boolean f14426d;

    /* compiled from: RxThreadFactory */
    static final class a extends Thread implements g {
        a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public h(String str) {
        this(str, 5, false);
    }

    public Thread newThread(Runnable runnable) {
        String str = this.f14424b + '-' + incrementAndGet();
        Thread aVar = this.f14426d ? new a(runnable, str) : new Thread(runnable, str);
        aVar.setPriority(this.f14425c);
        aVar.setDaemon(true);
        return aVar;
    }

    public String toString() {
        return "RxThreadFactory[" + this.f14424b + "]";
    }

    public h(String str, int i) {
        this(str, i, false);
    }

    public h(String str, int i, boolean z) {
        this.f14424b = str;
        this.f14425c = i;
        this.f14426d = z;
    }
}
