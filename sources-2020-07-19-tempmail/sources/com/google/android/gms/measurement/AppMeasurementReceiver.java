package com.google.android.gms.measurement;

import a.l.a.a;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.zzfq;
import com.google.android.gms.measurement.internal.zzft;

/* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
public final class AppMeasurementReceiver extends a implements zzft {

    /* renamed from: c  reason: collision with root package name */
    private zzfq f9897c;

    public final void a(Context context, Intent intent) {
        a.c(context, intent);
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.f9897c == null) {
            this.f9897c = new zzfq(this);
        }
        this.f9897c.a(context, intent);
    }
}
