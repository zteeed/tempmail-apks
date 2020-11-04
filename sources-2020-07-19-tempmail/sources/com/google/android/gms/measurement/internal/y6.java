package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;

/* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
final /* synthetic */ class y6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final zzjo f10338b;

    /* renamed from: c  reason: collision with root package name */
    private final zzeu f10339c;

    /* renamed from: d  reason: collision with root package name */
    private final JobParameters f10340d;

    y6(zzjo zzjo, zzeu zzeu, JobParameters jobParameters) {
        this.f10338b = zzjo;
        this.f10339c = zzeu;
        this.f10340d = jobParameters;
    }

    public final void run() {
        this.f10338b.e(this.f10339c, this.f10340d);
    }
}
