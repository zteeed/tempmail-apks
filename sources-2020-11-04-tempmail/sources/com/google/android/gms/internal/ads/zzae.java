package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzae {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicInteger f5832a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<zzaa<?>> f5833b;

    /* renamed from: c  reason: collision with root package name */
    private final PriorityBlockingQueue<zzaa<?>> f5834c;

    /* renamed from: d  reason: collision with root package name */
    private final PriorityBlockingQueue<zzaa<?>> f5835d;

    /* renamed from: e  reason: collision with root package name */
    private final zzk f5836e;

    /* renamed from: f  reason: collision with root package name */
    private final zzx f5837f;
    private final zzak g;
    private final zzw[] h;
    private zzm i;
    private final List<zzag> j;
    private final List<zzah> k;

    private zzae(zzk zzk, zzx zzx, int i2, zzak zzak) {
        this.f5832a = new AtomicInteger();
        this.f5833b = new HashSet();
        this.f5834c = new PriorityBlockingQueue<>();
        this.f5835d = new PriorityBlockingQueue<>();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.f5836e = zzk;
        this.f5837f = zzx;
        this.h = new zzw[4];
        this.g = zzak;
    }

    public final void a() {
        zzm zzm = this.i;
        if (zzm != null) {
            zzm.b();
        }
        for (zzw zzw : this.h) {
            if (zzw != null) {
                zzw.b();
            }
        }
        zzm zzm2 = new zzm(this.f5834c, this.f5835d, this.f5836e, this.g);
        this.i = zzm2;
        zzm2.start();
        for (int i2 = 0; i2 < this.h.length; i2++) {
            zzw zzw2 = new zzw(this.f5835d, this.f5837f, this.f5836e, this.g);
            this.h[i2] = zzw2;
            zzw2.start();
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(zzaa<?> zzaa, int i2) {
        synchronized (this.k) {
            for (zzah a2 : this.k) {
                a2.a(zzaa, i2);
            }
        }
    }

    public final <T> zzaa<T> c(zzaa<T> zzaa) {
        zzaa.m(this);
        synchronized (this.f5833b) {
            this.f5833b.add(zzaa);
        }
        zzaa.D(this.f5832a.incrementAndGet());
        zzaa.u("add-to-queue");
        b(zzaa, 0);
        if (!zzaa.I()) {
            this.f5835d.add(zzaa);
            return zzaa;
        }
        this.f5834c.add(zzaa);
        return zzaa;
    }

    /* access modifiers changed from: package-private */
    public final <T> void d(zzaa<T> zzaa) {
        synchronized (this.f5833b) {
            this.f5833b.remove(zzaa);
        }
        synchronized (this.j) {
            for (zzag a2 : this.j) {
                a2.a(zzaa);
            }
        }
        b(zzaa, 5);
    }

    private zzae(zzk zzk, zzx zzx, int i2) {
        this(zzk, zzx, 4, new zzt(new Handler(Looper.getMainLooper())));
    }

    public zzae(zzk zzk, zzx zzx) {
        this(zzk, zzx, 4);
    }
}
