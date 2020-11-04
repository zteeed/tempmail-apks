package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzb;

/* compiled from: com.android.billingclient:billing@@3.0.0 */
final class x0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Exception f2598b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ i f2599c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f2600d;

    x0(d dVar, Exception exc, i iVar, String str) {
        this.f2598b = exc;
        this.f2599c = iVar;
        this.f2600d = str;
    }

    public final void run() {
        String valueOf = String.valueOf(this.f2598b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
        sb.append("Error consuming purchase; ex: ");
        sb.append(valueOf);
        zzb.l("BillingClient", sb.toString());
        this.f2599c.a(a0.m, this.f2600d);
    }
}
