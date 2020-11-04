package com.google.android.gms.measurement;

import a.m.a.a;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.zzfq;
import com.google.android.gms.measurement.internal.zzft;

/* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
public final class AppMeasurementReceiver extends a implements zzft {

    /* renamed from: c  reason: collision with root package name */
    private zzfq f10083c;

    public final void a(Context context, Intent intent) {
        a.c(context, intent);
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.f10083c == null) {
            this.f10083c = new zzfq(this);
        }
        this.f10083c.a(context, intent);
    }
}
