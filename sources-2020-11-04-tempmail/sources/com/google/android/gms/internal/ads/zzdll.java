package com.google.android.gms.internal.ads;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdll<T> {
    @GuardedBy("this")

    /* renamed from: a  reason: collision with root package name */
    private final Deque<zzdvf<T>> f8359a = new LinkedBlockingDeque();

    /* renamed from: b  reason: collision with root package name */
    private final Callable<T> f8360b;

    /* renamed from: c  reason: collision with root package name */
    private final zzdvi f8361c;

    public zzdll(Callable<T> callable, zzdvi zzdvi) {
        this.f8360b = callable;
        this.f8361c = zzdvi;
    }

    public final synchronized zzdvf<T> a() {
        c(1);
        return this.f8359a.poll();
    }

    public final synchronized void b(zzdvf<T> zzdvf) {
        this.f8359a.addFirst(zzdvf);
    }

    public final synchronized void c(int i) {
        int size = i - this.f8359a.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f8359a.add(this.f8361c.f(this.f8360b));
        }
    }
}
