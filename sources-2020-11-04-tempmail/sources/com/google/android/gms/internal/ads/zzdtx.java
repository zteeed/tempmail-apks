package com.google.android.gms.internal.ads;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public abstract class zzdtx extends AbstractExecutorService implements zzdvi {
    /* renamed from: f */
    public final <T> zzdvf<T> submit(Callable<T> callable) {
        return (zzdvf) super.submit(callable);
    }

    /* renamed from: g */
    public final zzdvf<?> submit(Runnable runnable) {
        return (zzdvf) super.submit(runnable);
    }

    /* access modifiers changed from: protected */
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return l10.I(runnable, t);
    }

    /* access modifiers changed from: protected */
    public final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return l10.J(callable);
    }

    public /* synthetic */ Future submit(Runnable runnable, @NullableDecl Object obj) {
        return (zzdvf) super.submit(runnable, obj);
    }
}
