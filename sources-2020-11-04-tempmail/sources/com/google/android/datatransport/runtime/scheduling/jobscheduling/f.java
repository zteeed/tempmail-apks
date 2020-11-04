package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;

/* compiled from: JobInfoSchedulerService */
final /* synthetic */ class f implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final JobInfoSchedulerService f2769b;

    /* renamed from: c  reason: collision with root package name */
    private final JobParameters f2770c;

    private f(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        this.f2769b = jobInfoSchedulerService;
        this.f2770c = jobParameters;
    }

    public static Runnable a(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        return new f(jobInfoSchedulerService, jobParameters);
    }

    public void run() {
        this.f2769b.jobFinished(this.f2770c, false);
    }
}
