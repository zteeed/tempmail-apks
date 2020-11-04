package d.a.a0.g;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: RxThreadFactory */
public final class h extends AtomicLong implements ThreadFactory {
    private static final long serialVersionUID = -7789753024099756196L;

    /* renamed from: b  reason: collision with root package name */
    final String f13828b;

    /* renamed from: c  reason: collision with root package name */
    final int f13829c;

    /* renamed from: d  reason: collision with root package name */
    final boolean f13830d;

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
        String str = this.f13828b + '-' + incrementAndGet();
        Thread aVar = this.f13830d ? new a(runnable, str) : new Thread(runnable, str);
        aVar.setPriority(this.f13829c);
        aVar.setDaemon(true);
        return aVar;
    }

    public String toString() {
        return "RxThreadFactory[" + this.f13828b + "]";
    }

    public h(String str, int i) {
        this(str, i, false);
    }

    public h(String str, int i, boolean z) {
        this.f13828b = str;
        this.f13829c = i;
        this.f13830d = z;
    }
}
