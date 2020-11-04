package e;

import e.f0;
import e.m0.e;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* compiled from: Dispatcher */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    private int f14201a = 64;

    /* renamed from: b  reason: collision with root package name */
    private int f14202b = 5;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    private Runnable f14203c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private ExecutorService f14204d;

    /* renamed from: e  reason: collision with root package name */
    private final Deque<f0.a> f14205e = new ArrayDeque();

    /* renamed from: f  reason: collision with root package name */
    private final Deque<f0.a> f14206f = new ArrayDeque();
    private final Deque<f0> g = new ArrayDeque();

    @Nullable
    private f0.a d(String str) {
        for (f0.a next : this.f14206f) {
            if (next.o().equals(str)) {
                return next;
            }
        }
        for (f0.a next2 : this.f14205e) {
            if (next2.o().equals(str)) {
                return next2;
            }
        }
        return null;
    }

    private <T> void e(Deque<T> deque, T t) {
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t)) {
                runnable = this.f14203c;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (!h() && runnable != null) {
            runnable.run();
        }
    }

    private boolean h() {
        int i;
        boolean z;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<f0.a> it = this.f14205e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                f0.a next = it.next();
                if (this.f14206f.size() >= this.f14201a) {
                    break;
                } else if (next.l().get() < this.f14202b) {
                    it.remove();
                    next.l().incrementAndGet();
                    arrayList.add(next);
                    this.f14206f.add(next);
                }
            }
            z = i() > 0;
        }
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((f0.a) arrayList.get(i)).m(c());
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public void a(f0.a aVar) {
        f0.a d2;
        synchronized (this) {
            this.f14205e.add(aVar);
            if (!aVar.n().f14021e && (d2 = d(aVar.o())) != null) {
                aVar.p(d2);
            }
        }
        h();
    }

    /* access modifiers changed from: package-private */
    public synchronized void b(f0 f0Var) {
        this.g.add(f0Var);
    }

    public synchronized ExecutorService c() {
        if (this.f14204d == null) {
            this.f14204d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), e.H("OkHttp Dispatcher", false));
        }
        return this.f14204d;
    }

    /* access modifiers changed from: package-private */
    public void f(f0.a aVar) {
        aVar.l().decrementAndGet();
        e(this.f14206f, aVar);
    }

    /* access modifiers changed from: package-private */
    public void g(f0 f0Var) {
        e(this.g, f0Var);
    }

    public synchronized int i() {
        return this.f14206f.size() + this.g.size();
    }
}
