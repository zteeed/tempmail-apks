package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@TargetApi(24)
/* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
public final class zzh {

    /* renamed from: b  reason: collision with root package name */
    private static final Method f9836b = c();

    /* renamed from: c  reason: collision with root package name */
    private static final Method f9837c = d();

    /* renamed from: a  reason: collision with root package name */
    private final JobScheduler f9838a;

    private zzh(JobScheduler jobScheduler) {
        this.f9838a = jobScheduler;
    }

    private final int a(JobInfo jobInfo, String str, int i, String str2) {
        Method method = f9836b;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.f9838a, new Object[]{jobInfo, str, Integer.valueOf(i), str2})).intValue();
            } catch (IllegalAccessException | InvocationTargetException e2) {
                Log.e(str2, "error calling scheduleAsPackage", e2);
            }
        }
        return this.f9838a.schedule(jobInfo);
    }

    public static int b(Context context, JobInfo jobInfo, String str, String str2) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (f9836b == null || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) {
            return jobScheduler.schedule(jobInfo);
        }
        return new zzh(jobScheduler).a(jobInfo, str, e(), str2);
    }

    private static Method c() {
        Class<String> cls = String.class;
        if (Build.VERSION.SDK_INT < 24) {
            return null;
        }
        try {
            return JobScheduler.class.getDeclaredMethod("scheduleAsPackage", new Class[]{JobInfo.class, cls, Integer.TYPE, cls});
        } catch (NoSuchMethodException unused) {
            if (!Log.isLoggable("JobSchedulerCompat", 6)) {
                return null;
            }
            Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
            return null;
        }
    }

    private static Method d() {
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                return UserHandle.class.getDeclaredMethod("myUserId", (Class[]) null);
            } catch (NoSuchMethodException unused) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "No myUserId method available");
                }
            }
        }
        return null;
    }

    private static int e() {
        Method method = f9837c;
        if (method != null) {
            try {
                return ((Integer) method.invoke((Object) null, new Object[0])).intValue();
            } catch (IllegalAccessException | InvocationTargetException e2) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "myUserId invocation illegal", e2);
                }
            }
        }
        return 0;
    }
}
