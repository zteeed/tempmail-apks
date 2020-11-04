package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import com.google.android.gms.internal.measurement.zzh;

/* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
public final class zzkf extends m7 {

    /* renamed from: d  reason: collision with root package name */
    private final AlarmManager f10500d = ((AlarmManager) f().getSystemService("alarm"));

    /* renamed from: e  reason: collision with root package name */
    private final f f10501e;

    /* renamed from: f  reason: collision with root package name */
    private Integer f10502f;

    protected zzkf(zzkj zzkj) {
        super(zzkj);
        this.f10501e = new l7(this, zzkj.g0(), zzkj);
    }

    @TargetApi(24)
    private final void x() {
        ((JobScheduler) f().getSystemService("jobscheduler")).cancel(y());
    }

    private final int y() {
        if (this.f10502f == null) {
            String valueOf = String.valueOf(f().getPackageName());
            this.f10502f = Integer.valueOf((valueOf.length() != 0 ? "measurement".concat(valueOf) : new String("measurement")).hashCode());
        }
        return this.f10502f.intValue();
    }

    private final PendingIntent z() {
        Context f2 = f();
        return PendingIntent.getBroadcast(f2, 0, new Intent().setClassName(f2, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), 0);
    }

    /* access modifiers changed from: protected */
    public final boolean u() {
        this.f10500d.cancel(z());
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        x();
        return false;
    }

    public final void v(long j) {
        s();
        m();
        Context f2 = f();
        if (!zzfq.b(f2)) {
            h().N().a("Receiver not registered/enabled");
        }
        if (!zzkr.Y(f2, false)) {
            h().N().a("Service not registered/enabled");
        }
        w();
        h().O().b("Scheduling upload, millis", Long.valueOf(j));
        long b2 = n().b() + j;
        if (j < Math.max(0, zzaq.x.a(null).longValue()) && !this.f10501e.d()) {
            this.f10501e.c(j);
        }
        m();
        if (Build.VERSION.SDK_INT >= 24) {
            Context f3 = f();
            ComponentName componentName = new ComponentName(f3, "com.google.android.gms.measurement.AppMeasurementJobService");
            int y = y();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
            zzh.b(f3, new JobInfo.Builder(y, componentName).setMinimumLatency(j).setOverrideDeadline(j << 1).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
            return;
        }
        this.f10500d.setInexactRepeating(2, b2, Math.max(zzaq.s.a(null).longValue(), j), z());
    }

    public final void w() {
        s();
        h().O().a("Unscheduling upload");
        this.f10500d.cancel(z());
        this.f10501e.e();
        if (Build.VERSION.SDK_INT >= 24) {
            x();
        }
    }
}
