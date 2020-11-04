package com.android.billingclient.api;

import android.os.Bundle;
import com.google.android.gms.internal.play_billing.zzb;
import java.util.concurrent.Callable;

/* compiled from: com.android.billingclient:billing@@3.0.0 */
final class p0 implements Callable<Void> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ a f2562b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ b f2563c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ d f2564d;

    p0(d dVar, a aVar, b bVar) {
        this.f2564d = dVar;
        this.f2562b = aVar;
        this.f2563c = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Void call() {
        try {
            Bundle T6 = this.f2564d.f2497f.T6(9, this.f2564d.f2496e.getPackageName(), this.f2562b.a(), zzb.c(this.f2562b, this.f2564d.f2493b));
            this.f2564d.y(new r0(this, zzb.b(T6, "BillingClient"), zzb.k(T6, "BillingClient")));
            return null;
        } catch (Exception e2) {
            this.f2564d.y(new s0(this, e2));
            return null;
        }
    }
}
