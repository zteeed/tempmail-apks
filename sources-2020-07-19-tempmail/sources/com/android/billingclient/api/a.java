package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: BillingBroadcastManager */
class a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2380a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final b f2381b;

    /* compiled from: BillingBroadcastManager */
    private class b extends BroadcastReceiver {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final f f2382a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f2383b;

        public void b(Context context, IntentFilter intentFilter) {
            if (!this.f2383b) {
                context.registerReceiver(a.this.f2381b, intentFilter);
                this.f2383b = true;
            }
        }

        public void onReceive(Context context, Intent intent) {
            this.f2382a.a(b.a.a.a.a.d(intent, "BillingBroadcastManager"), b.a.a.a.a.b(intent.getExtras()));
        }

        private b(f fVar) {
            this.f2382a = fVar;
        }
    }

    a(Context context, f fVar) {
        this.f2380a = context;
        this.f2381b = new b(fVar);
    }

    /* access modifiers changed from: package-private */
    public f b() {
        return this.f2381b.f2382a;
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.f2381b.b(this.f2380a, new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED"));
    }
}
