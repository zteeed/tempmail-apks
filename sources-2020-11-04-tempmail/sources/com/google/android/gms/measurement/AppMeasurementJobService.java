package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.zzjo;
import com.google.android.gms.measurement.internal.zzjs;

@TargetApi(24)
/* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
public final class AppMeasurementJobService extends JobService implements zzjs {

    /* renamed from: b  reason: collision with root package name */
    private zzjo<AppMeasurementJobService> f10082b;

    private final zzjo<AppMeasurementJobService> c() {
        if (this.f10082b == null) {
            this.f10082b = new zzjo<>(this);
        }
        return this.f10082b;
    }

    public final void a(Intent intent) {
    }

    @TargetApi(24)
    public final void b(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    public final boolean f(int i) {
        throw new UnsupportedOperationException();
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

    public final boolean onStartJob(JobParameters jobParameters) {
        return c().g(jobParameters);
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public final boolean onUnbind(Intent intent) {
        return c().i(intent);
    }
}
