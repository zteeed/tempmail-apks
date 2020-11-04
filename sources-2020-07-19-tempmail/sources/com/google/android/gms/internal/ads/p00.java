package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.h00;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class p00<V> extends h00<Object, V> {
    /* access modifiers changed from: private */
    public r00<?> q;

    p00(zzdsr<? extends zzdvf<?>> zzdsr, boolean z, Executor executor, Callable<V> callable) {
        super(zzdsr, z, false);
        this.q = new o00(this, callable, executor);
        P();
    }

    /* access modifiers changed from: package-private */
    public final void M(h00.a aVar) {
        super.M(aVar);
        if (aVar == h00.a.OUTPUT_FUTURE_DONE) {
            this.q = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void Q() {
        r00<?> r00 = this.q;
        if (r00 != null) {
            r00.f();
        }
    }

    /* access modifiers changed from: package-private */
    public final void R(int i, @NullableDecl Object obj) {
    }

    /* access modifiers changed from: protected */
    public final void e() {
        r00<?> r00 = this.q;
        if (r00 != null) {
            r00.a();
        }
    }
}
