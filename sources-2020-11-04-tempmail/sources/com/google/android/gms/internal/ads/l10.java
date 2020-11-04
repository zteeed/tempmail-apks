package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class l10<V> extends t00<V> implements RunnableFuture<V> {
    private volatile a10<?> i;

    private l10(Callable<V> callable) {
        this.i = new n10(this, callable);
    }

    static <V> l10<V> I(Runnable runnable, @NullableDecl V v) {
        return new l10<>(Executors.callable(runnable, v));
    }

    static <V> l10<V> J(Callable<V> callable) {
        return new l10<>(callable);
    }

    /* access modifiers changed from: protected */
    public final void b() {
        a10<?> a10;
        super.b();
        if (l() && (a10 = this.i) != null) {
            a10.a();
        }
        this.i = null;
    }

    /* access modifiers changed from: protected */
    public final String h() {
        a10<?> a10 = this.i;
        if (a10 == null) {
            return super.h();
        }
        String valueOf = String.valueOf(a10);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 7);
        sb.append("task=[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public final void run() {
        a10<?> a10 = this.i;
        if (a10 != null) {
            a10.run();
        }
        this.i = null;
    }

    l10(zzduf<V> zzduf) {
        this.i = new o10(this, zzduf);
    }
}
