package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public abstract class zzdus<V> extends zzdut<V> implements zzdvf<V> {
    protected zzdus() {
    }

    public void f(Runnable runnable, Executor executor) {
        h().f(runnable, executor);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract zzdvf<? extends V> h();
}
