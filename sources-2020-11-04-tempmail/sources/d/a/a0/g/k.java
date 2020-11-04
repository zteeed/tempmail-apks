package d.a.a0.g;

import d.a.y.b;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: ScheduledRunnable */
public final class k extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, b {

    /* renamed from: c  reason: collision with root package name */
    static final Object f14427c = new Object();

    /* renamed from: d  reason: collision with root package name */
    static final Object f14428d = new Object();

    /* renamed from: e  reason: collision with root package name */
    static final Object f14429e = new Object();

    /* renamed from: f  reason: collision with root package name */
    static final Object f14430f = new Object();
    private static final long serialVersionUID = -6120223772001106981L;

    /* renamed from: b  reason: collision with root package name */
    final Runnable f14431b;

    public k(Runnable runnable, d.a.a0.a.b bVar) {
        super(3);
        this.f14431b = runnable;
        lazySet(0, bVar);
    }

    public void a(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj != f14430f) {
                if (obj == f14428d) {
                    future.cancel(false);
                    return;
                } else if (obj == f14429e) {
                    future.cancel(true);
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    public Object call() {
        run();
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dispose() {
        /*
            r5 = this;
        L_0x0000:
            r0 = 1
            java.lang.Object r1 = r5.get(r0)
            java.lang.Object r2 = f14430f
            r3 = 0
            if (r1 == r2) goto L_0x0035
            java.lang.Object r2 = f14428d
            if (r1 == r2) goto L_0x0035
            java.lang.Object r2 = f14429e
            if (r1 != r2) goto L_0x0013
            goto L_0x0035
        L_0x0013:
            r2 = 2
            java.lang.Object r2 = r5.get(r2)
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            if (r2 == r4) goto L_0x0020
            r2 = 1
            goto L_0x0021
        L_0x0020:
            r2 = 0
        L_0x0021:
            if (r2 == 0) goto L_0x0026
            java.lang.Object r4 = f14429e
            goto L_0x0028
        L_0x0026:
            java.lang.Object r4 = f14428d
        L_0x0028:
            boolean r0 = r5.compareAndSet(r0, r1, r4)
            if (r0 == 0) goto L_0x0000
            if (r1 == 0) goto L_0x0035
            java.util.concurrent.Future r1 = (java.util.concurrent.Future) r1
            r1.cancel(r2)
        L_0x0035:
            java.lang.Object r0 = r5.get(r3)
            java.lang.Object r1 = f14430f
            if (r0 == r1) goto L_0x004f
            java.lang.Object r1 = f14427c
            if (r0 == r1) goto L_0x004f
            if (r0 != 0) goto L_0x0044
            goto L_0x004f
        L_0x0044:
            boolean r1 = r5.compareAndSet(r3, r0, r1)
            if (r1 == 0) goto L_0x0035
            d.a.a0.a.b r0 = (d.a.a0.a.b) r0
            r0.c(r5)
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.a0.g.k.dispose():void");
    }

    public void run() {
        Object obj;
        Object obj2;
        lazySet(2, Thread.currentThread());
        try {
            this.f14431b.run();
        } catch (Throwable th) {
            lazySet(2, (Object) null);
            Object obj3 = get(0);
            if (!(obj3 == f14427c || !compareAndSet(0, obj3, f14430f) || obj3 == null)) {
                ((d.a.a0.a.b) obj3).c(this);
            }
            do {
                obj2 = get(1);
                if (obj2 == f14428d || obj2 == f14429e || compareAndSet(1, obj2, f14430f)) {
                    throw th;
                }
                obj2 = get(1);
                break;
            } while (compareAndSet(1, obj2, f14430f));
            throw th;
        }
        lazySet(2, (Object) null);
        Object obj4 = get(0);
        if (!(obj4 == f14427c || !compareAndSet(0, obj4, f14430f) || obj4 == null)) {
            ((d.a.a0.a.b) obj4).c(this);
        }
        do {
            obj = get(1);
            if (obj == f14428d || obj == f14429e || compareAndSet(1, obj, f14430f)) {
            }
            obj = get(1);
            return;
        } while (compareAndSet(1, obj, f14430f));
    }
}
