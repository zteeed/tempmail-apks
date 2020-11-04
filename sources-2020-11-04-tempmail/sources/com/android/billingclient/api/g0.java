package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.internal.play_billing.zzb;

/* compiled from: com.android.billingclient:billing@@3.0.0 */
final class g0 extends BroadcastReceiver {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final m f2522a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f2523b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ f0 f2524c;

    private g0(f0 f0Var, m mVar) {
        this.f2524c = f0Var;
        this.f2522a = mVar;
    }

    public final void b(Context context) {
        if (this.f2523b) {
            context.unregisterReceiver(this.f2524c.f2517b);
            this.f2523b = false;
            return;
        }
        zzb.l("BillingBroadcastManager", "Receiver is not registered.");
    }

    public final void c(Context context, IntentFilter intentFilter) {
        if (!this.f2523b) {
            context.registerReceiver(this.f2524c.f2517b, intentFilter);
            this.f2523b = true;
        }
    }

    public final void onReceive(Context context, Intent intent) {
        this.f2522a.h(zzb.j(intent, "BillingBroadcastManager"), zzb.h(intent.getExtras()));
    }
}
