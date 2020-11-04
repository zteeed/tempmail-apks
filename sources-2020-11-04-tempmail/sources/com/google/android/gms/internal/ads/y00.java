package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdtu;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
class y00<V> implements zzdvf<V> {

    /* renamed from: c  reason: collision with root package name */
    static final zzdvf<?> f5523c = new y00((Object) null);

    /* renamed from: d  reason: collision with root package name */
    private static final Logger f5524d = Logger.getLogger(y00.class.getName());
    @NullableDecl

    /* renamed from: b  reason: collision with root package name */
    private final V f5525b;

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    static final class a<V> extends zzdtu.k<V> {
        a(Throwable th) {
            j(th);
        }
    }

    y00(@NullableDecl V v) {
        this.f5525b = v;
    }

    public boolean cancel(boolean z) {
        return false;
    }

    public void f(Runnable runnable, Executor executor) {
        zzdsh.c(runnable, "Runnable was null.");
        zzdsh.c(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Logger logger = f5524d;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57 + String.valueOf(valueOf2).length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            logger.logp(level, "com.google.common.util.concurrent.ImmediateFuture", "addListener", sb.toString(), e2);
        }
    }

    public V get() {
        return this.f5525b;
    }

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return true;
    }

    public String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.f5525b);
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 27 + String.valueOf(valueOf).length());
        sb.append(obj);
        sb.append("[status=SUCCESS, result=[");
        sb.append(valueOf);
        sb.append("]]");
        return sb.toString();
    }

    public V get(long j, TimeUnit timeUnit) throws ExecutionException {
        zzdsh.b(timeUnit);
        return get();
    }
}
