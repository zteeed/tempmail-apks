package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzb;
import java.util.concurrent.Future;

/* compiled from: com.android.billingclient:billing@@3.0.0 */
final class t0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Future f2581b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Runnable f2582c;

    t0(d dVar, Future future, Runnable runnable) {
        this.f2581b = future;
        this.f2582c = runnable;
    }

    public final void run() {
        if (!this.f2581b.isDone() && !this.f2581b.isCancelled()) {
            this.f2581b.cancel(true);
            zzb.l("BillingClient", "Async task is taking too long, cancel it!");
            Runnable runnable = this.f2582c;
            if (runnable != null) {
                runnable.run();
            }
        }
    }
}
