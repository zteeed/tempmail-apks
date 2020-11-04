package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzb;

/* compiled from: com.android.billingclient:billing@@3.0.0 */
final class v0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ int f2589b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ i f2590c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ g f2591d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ String f2592e;

    v0(d dVar, int i, i iVar, g gVar, String str) {
        this.f2589b = i;
        this.f2590c = iVar;
        this.f2591d = gVar;
        this.f2592e = str;
    }

    public final void run() {
        int i = this.f2589b;
        StringBuilder sb = new StringBuilder(63);
        sb.append("Error consuming purchase with token. Response code: ");
        sb.append(i);
        zzb.l("BillingClient", sb.toString());
        this.f2590c.a(this.f2591d, this.f2592e);
    }
}
