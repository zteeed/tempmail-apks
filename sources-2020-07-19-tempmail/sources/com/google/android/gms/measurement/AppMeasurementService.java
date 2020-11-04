package com.google.android.gms.measurement;

import a.l.a.a;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.zzjo;
import com.google.android.gms.measurement.internal.zzjs;

/* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
public final class AppMeasurementService extends Service implements zzjs {

    /* renamed from: b  reason: collision with root package name */
    private zzjo<AppMeasurementService> f9898b;

    private final zzjo<AppMeasurementService> c() {
        if (this.f9898b == null) {
            this.f9898b = new zzjo<>(this);
        }
        return this.f9898b;
    }

    public final void a(Intent intent) {
        a.b(intent);
    }

    public final void b(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    public final boolean f(int i) {
        return stopSelfResult(i);
    }

    public final IBinder onBind(Intent intent) {
        return c().b(intent);
    }

    public final void onCreate() {
        super.onCreate();
        c().c();
    }

    public final void onDestroy() {
        c().h();
        super.onDestroy();
    }

    public final void onRebind(Intent intent) {
        c().k(intent);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        return c().a(intent, i, i2);
    }

    public final boolean onUnbind(Intent intent) {
        return c().i(intent);
    }
}
