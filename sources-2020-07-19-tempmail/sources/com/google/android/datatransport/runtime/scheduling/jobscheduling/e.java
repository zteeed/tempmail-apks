package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import b.c.a.b.i.m;
import b.c.a.b.i.u.a;
import b.c.a.b.i.w.j.c;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;

/* compiled from: JobInfoScheduler */
public class e implements s {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2578a;

    /* renamed from: b  reason: collision with root package name */
    private final c f2579b;

    /* renamed from: c  reason: collision with root package name */
    private final g f2580c;

    public e(Context context, c cVar, g gVar) {
        this.f2578a = context;
        this.f2579b = cVar;
        this.f2580c = gVar;
    }

    private boolean c(JobScheduler jobScheduler, int i, int i2) {
        for (JobInfo next : jobScheduler.getAllPendingJobs()) {
            int i3 = next.getExtras().getInt("attemptNumber");
            if (next.getId() == i) {
                if (i3 >= i2) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public void a(m mVar, int i) {
        ComponentName componentName = new ComponentName(this.f2578a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f2578a.getSystemService("jobscheduler");
        int b2 = b(mVar);
        if (c(jobScheduler, b2, i)) {
            a.a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", mVar);
            return;
        }
        long C = this.f2579b.C(mVar);
        g gVar = this.f2580c;
        JobInfo.Builder builder = new JobInfo.Builder(b2, componentName);
        gVar.b(builder, mVar.d(), C, i);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i);
        persistableBundle.putString("backendName", mVar.b());
        persistableBundle.putInt("priority", b.c.a.b.i.y.a.a(mVar.d()));
        if (mVar.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(mVar.c(), 0));
        }
        builder.setExtras(persistableBundle);
        a.b("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", mVar, Integer.valueOf(b2), Long.valueOf(this.f2580c.f(mVar.d(), C, i)), Long.valueOf(C), Integer.valueOf(i));
        jobScheduler.schedule(builder.build());
    }

    /* access modifiers changed from: package-private */
    public int b(m mVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f2578a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(mVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(b.c.a.b.i.y.a.a(mVar.d())).array());
        if (mVar.c() != null) {
            adler32.update(mVar.c());
        }
        return (int) adler32.getValue();
    }
}
