package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzb;

/* compiled from: com.android.billingclient:billing@@3.0.0 */
final class s0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Exception f2577b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ p0 f2578c;

    s0(p0 p0Var, Exception exc) {
        this.f2578c = p0Var;
        this.f2577b = exc;
    }

    public final void run() {
        String valueOf = String.valueOf(this.f2577b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
        sb.append("Error acknowledge purchase; ex: ");
        sb.append(valueOf);
        zzb.l("BillingClient", sb.toString());
        this.f2578c.f2563c.a(a0.m);
    }
}
