package com.android.billingclient.api;

import android.content.Context;
import android.content.IntentFilter;

/* compiled from: com.android.billingclient:billing@@3.0.0 */
final class f0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2516a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final g0 f2517b;

    f0(Context context, m mVar) {
        this.f2516a = context;
        this.f2517b = new g0(this, mVar);
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        this.f2517b.c(this.f2516a, new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED"));
    }

    /* access modifiers changed from: package-private */
    public final m c() {
        return this.f2517b.f2522a;
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        this.f2517b.b(this.f2516a);
    }
}
