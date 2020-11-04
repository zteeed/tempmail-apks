package com.android.billingclient.api;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.android.billingclient.api.g;
import com.google.android.gms.internal.play_billing.zzb;
import java.util.List;

/* compiled from: com.android.billingclient:billing@@3.0.0 */
final class zzh extends ResultReceiver {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ d f2601b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzh(d dVar, Handler handler) {
        super(handler);
        this.f2601b = dVar;
    }

    public final void onReceiveResult(int i, Bundle bundle) {
        m c2 = this.f2601b.f2495d.c();
        if (c2 == null) {
            zzb.l("BillingClient", "PurchasesUpdatedListener is null - no way to return the response.");
            return;
        }
        List<j> h = zzb.h(bundle);
        g.a c3 = g.c();
        c3.c(i);
        c3.b(zzb.k(bundle, "BillingClient"));
        c2.h(c3.a(), h);
    }
}
