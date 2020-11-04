package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdas implements zzdec<zzdap> {

    /* renamed from: a  reason: collision with root package name */
    private final zzdvi f7982a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f7983b;

    public zzdas(zzdvi zzdvi, Context context) {
        this.f7982a = zzdvi;
        this.f7983b = context;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdap a() throws Exception {
        double d2;
        Intent registerReceiver = this.f7983b.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            d2 = ((double) registerReceiver.getIntExtra("level", -1)) / ((double) registerReceiver.getIntExtra("scale", -1));
            if (intExtra == 2 || intExtra == 5) {
                z = true;
            }
        } else {
            d2 = -1.0d;
        }
        return new zzdap(d2, z);
    }

    public final zzdvf<zzdap> b() {
        return this.f7982a.f(new xr(this));
    }
}
