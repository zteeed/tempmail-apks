package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class v00<V> implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final Future<V> f5090b;

    /* renamed from: c  reason: collision with root package name */
    private final zzduu<? super V> f5091c;

    v00(Future<V> future, zzduu<? super V> zzduu) {
        this.f5090b = future;
        this.f5091c = zzduu;
    }

    public final void run() {
        Throwable a2;
        Future<V> future = this.f5090b;
        if (!(future instanceof zzdwa) || (a2 = zzdvz.a((zzdwa) future)) == null) {
            try {
                this.f5091c.onSuccess(zzdux.e(this.f5090b));
            } catch (ExecutionException e2) {
                this.f5091c.a(e2.getCause());
            } catch (Error | RuntimeException e3) {
                this.f5091c.a(e3);
            }
        } else {
            this.f5091c.a(a2);
        }
    }

    public final String toString() {
        zzdsc a2 = zzdsa.a(this);
        a2.a(this.f5091c);
        return a2.toString();
    }
}
