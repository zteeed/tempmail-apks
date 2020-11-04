package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import b.c.a.b.i.m;
import b.c.a.b.i.r;
import b.c.a.b.i.y.a;

public class JobInfoSchedulerService extends JobService {
    public boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        r.f(getApplicationContext());
        m.a a2 = m.a();
        a2.b(string);
        a2.d(a.b(i));
        if (string2 != null) {
            a2.c(Base64.decode(string2, 0));
        }
        r.c().e().g(a2.a(), i2, f.a(this, jobParameters));
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
