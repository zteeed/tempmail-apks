package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzb;

/* compiled from: com.android.billingclient:billing@@3.0.0 */
final class w0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ i f2594b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ g f2595c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f2596d;

    w0(d dVar, i iVar, g gVar, String str) {
        this.f2594b = iVar;
        this.f2595c = gVar;
        this.f2596d = str;
    }

    public final void run() {
        zzb.i("BillingClient", "Successfully consumed purchase.");
        this.f2594b.a(this.f2595c, this.f2596d);
    }
}
