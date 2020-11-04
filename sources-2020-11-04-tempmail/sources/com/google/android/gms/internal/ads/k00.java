package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdtu;
import com.tempmail.utils.i;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
abstract class k00<OutputT> extends zzdtu.k<OutputT> {
    private static final b k;
    private static final Logger l = Logger.getLogger(k00.class.getName());
    /* access modifiers changed from: private */
    public volatile Set<Throwable> i = null;
    private volatile int j;

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    static final class a extends b {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicReferenceFieldUpdater<k00, Set<Throwable>> f4355a;

        /* renamed from: b  reason: collision with root package name */
        private final AtomicIntegerFieldUpdater<k00> f4356b;

        a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
            super();
            this.f4355a = atomicReferenceFieldUpdater;
            this.f4356b = atomicIntegerFieldUpdater;
        }

        /* access modifiers changed from: package-private */
        public final void a(k00 k00, Set<Throwable> set, Set<Throwable> set2) {
            this.f4355a.compareAndSet(k00, (Object) null, set2);
        }

        /* access modifiers changed from: package-private */
        public final int b(k00 k00) {
            return this.f4356b.decrementAndGet(k00);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    static abstract class b {
        private b() {
        }

        /* access modifiers changed from: package-private */
        public abstract void a(k00 k00, Set<Throwable> set, Set<Throwable> set2);

        /* access modifiers changed from: package-private */
        public abstract int b(k00 k00);
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    static final class c extends b {
        private c() {
            super();
        }

        /* access modifiers changed from: package-private */
        public final void a(k00 k00, Set<Throwable> set, Set<Throwable> set2) {
            synchronized (k00) {
                if (k00.i == null) {
                    Set unused = k00.i = set2;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final int b(k00 k00) {
            int H;
            synchronized (k00) {
                H = k00.H(k00);
            }
            return H;
        }
    }

    static {
        Throwable th;
        b bVar;
        try {
            bVar = new a(AtomicReferenceFieldUpdater.newUpdater(k00.class, Set.class, i.f13118a), AtomicIntegerFieldUpdater.newUpdater(k00.class, "j"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            bVar = new c();
        }
        k = bVar;
        if (th != null) {
            l.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    k00(int i2) {
        this.j = i2;
    }

    static /* synthetic */ int H(k00 k00) {
        int i2 = k00.j - 1;
        k00.j = i2;
        return i2;
    }

    /* access modifiers changed from: package-private */
    public final Set<Throwable> E() {
        Set<Throwable> set = this.i;
        if (set != null) {
            return set;
        }
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        I(newSetFromMap);
        k.a(this, (Set<Throwable>) null, newSetFromMap);
        return this.i;
    }

    /* access modifiers changed from: package-private */
    public final int F() {
        return k.b(this);
    }

    /* access modifiers changed from: package-private */
    public final void G() {
        this.i = null;
    }

    /* access modifiers changed from: package-private */
    public abstract void I(Set<Throwable> set);
}
