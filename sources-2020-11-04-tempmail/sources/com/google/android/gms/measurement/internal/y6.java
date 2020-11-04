package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;

/* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
final /* synthetic */ class y6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final zzjo f10524b;

    /* renamed from: c  reason: collision with root package name */
    private final zzeu f10525c;

    /* renamed from: d  reason: collision with root package name */
    private final JobParameters f10526d;

    y6(zzjo zzjo, zzeu zzeu, JobParameters jobParameters) {
        this.f10524b = zzjo;
        this.f10525c = zzeu;
        this.f10526d = jobParameters;
    }

    public final void run() {
        this.f10524b.e(this.f10525c, this.f10526d);
    }
}
