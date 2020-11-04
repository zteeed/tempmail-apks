package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
abstract class a10<T> extends AtomicReference<Runnable> implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private static final Runnable f3512b = new b10();

    /* renamed from: c  reason: collision with root package name */
    private static final Runnable f3513c = new b10();

    /* renamed from: d  reason: collision with root package name */
    private static final Runnable f3514d = new b10();

    a10() {
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        Runnable runnable = (Runnable) get();
        if ((runnable instanceof Thread) && compareAndSet(runnable, f3513c)) {
            try {
                ((Thread) runnable).interrupt();
            } finally {
                if (((Runnable) getAndSet(f3512b)) == f3514d) {
                    LockSupport.unpark((Thread) runnable);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public abstract boolean b();

    /* access modifiers changed from: package-private */
    public abstract T c() throws Exception;

    /* access modifiers changed from: package-private */
    public abstract String d();

    /* access modifiers changed from: package-private */
    public abstract void e(@NullableDecl T t, @NullableDecl Throwable th);

    public final void run() {
        Object obj;
        Thread currentThread = Thread.currentThread();
        if (compareAndSet((Object) null, currentThread)) {
            boolean z = !b();
            if (z) {
                try {
                    obj = c();
                } catch (Throwable th) {
                    if (!compareAndSet(currentThread, f3512b)) {
                        Runnable runnable = (Runnable) get();
                        boolean z2 = false;
                        int i = 0;
                        while (true) {
                            if (runnable != f3513c && runnable != f3514d) {
                                break;
                            }
                            i++;
                            if (i > 1000) {
                                Runnable runnable2 = f3514d;
                                if (runnable == runnable2 || compareAndSet(f3513c, runnable2)) {
                                    z2 = Thread.interrupted() || z2;
                                    LockSupport.park(this);
                                }
                            } else {
                                Thread.yield();
                            }
                            runnable = (Runnable) get();
                        }
                        if (z2) {
                            currentThread.interrupt();
                        }
                    }
                    if (z) {
                        e((Object) null, th);
                        return;
                    }
                    return;
                }
            } else {
                obj = null;
            }
            if (!compareAndSet(currentThread, f3512b)) {
                Runnable runnable3 = (Runnable) get();
                boolean z3 = false;
                int i2 = 0;
                while (true) {
                    if (runnable3 != f3513c && runnable3 != f3514d) {
                        break;
                    }
                    i2++;
                    if (i2 > 1000) {
                        Runnable runnable4 = f3514d;
                        if (runnable3 == runnable4 || compareAndSet(f3513c, runnable4)) {
                            z3 = Thread.interrupted() || z3;
                            LockSupport.park(this);
                        }
                    } else {
                        Thread.yield();
                    }
                    runnable3 = (Runnable) get();
                }
                if (z3) {
                    currentThread.interrupt();
                }
            }
            if (z) {
                e(obj, (Throwable) null);
            }
        }
    }

    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f3512b) {
            str = "running=[DONE]";
        } else if (runnable == f3513c) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 21);
            sb.append("running=[RUNNING ON ");
            sb.append(name);
            sb.append("]");
            str = sb.toString();
        } else {
            str = "running=[NOT STARTED YET]";
        }
        String d2 = d();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(d2).length());
        sb2.append(str);
        sb2.append(", ");
        sb2.append(d2);
        return sb2.toString();
    }
}
