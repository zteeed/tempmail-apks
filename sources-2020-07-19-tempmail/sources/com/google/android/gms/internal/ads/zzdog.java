package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public abstract class zzdog<E> {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final zzdvf<?> f8250d = zzdux.g(null);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final zzdvi f8251a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final ScheduledExecutorService f8252b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final zzdos<E> f8253c;

    public zzdog(zzdvi zzdvi, ScheduledExecutorService scheduledExecutorService, zzdos<E> zzdos) {
        this.f8251a = zzdvi;
        this.f8252b = scheduledExecutorService;
        this.f8253c = zzdos;
    }

    public final zzdoi a(E e2, zzdvf<?>... zzdvfArr) {
        return new zzdoi(this, e2, Arrays.asList(zzdvfArr));
    }

    public final <I> zzdom<I> b(E e2, zzdvf<I> zzdvf) {
        return new zzdom(this, e2, (String) null, zzdvf, Collections.singletonList(zzdvf), zzdvf, (sx) null);
    }

    public final zzdok g(E e2) {
        return new zzdok(this, e2);
    }

    /* access modifiers changed from: protected */
    public abstract String h(E e2);
}
