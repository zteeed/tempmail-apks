package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzae;
import com.google.android.gms.measurement.internal.zzjs;

/* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
public final class zzjo<T extends Context & zzjs> {

    /* renamed from: a  reason: collision with root package name */
    private final T f10681a;

    public zzjo(T t) {
        Preconditions.k(t);
        this.f10681a = t;
    }

    private final void f(Runnable runnable) {
        zzkj c2 = zzkj.c(this.f10681a);
        c2.g().z(new a7(this, c2, runnable));
    }

    private final zzeu j() {
        return zzfy.a(this.f10681a, (zzae) null, (Long) null).h();
    }

    public final int a(Intent intent, int i, int i2) {
        zzfy a2 = zzfy.a(this.f10681a, (zzae) null, (Long) null);
        zzeu h = a2.h();
        if (intent == null) {
            h.J().a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        a2.m();
        h.O().c("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            f(new z6(this, i2, h, intent));
        }
        return 2;
    }

    public final IBinder b(Intent intent) {
        if (intent == null) {
            j().G().a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new zzgd(zzkj.c(this.f10681a));
        }
        j().J().b("onBind received unknown action", action);
        return null;
    }

    public final void c() {
        zzfy a2 = zzfy.a(this.f10681a, (zzae) null, (Long) null);
        zzeu h = a2.h();
        a2.m();
        h.O().a("Local AppMeasurementService is starting up");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d(int i, zzeu zzeu, Intent intent) {
        if (((zzjs) this.f10681a).f(i)) {
            zzeu.O().b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            j().O().a("Completed wakeful intent.");
            ((zzjs) this.f10681a).a(intent);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void e(zzeu zzeu, JobParameters jobParameters) {
        zzeu.O().a("AppMeasurementJobService processed last upload request.");
        ((zzjs) this.f10681a).b(jobParameters, false);
    }

    @TargetApi(24)
    public final boolean g(JobParameters jobParameters) {
        zzfy a2 = zzfy.a(this.f10681a, (zzae) null, (Long) null);
        zzeu h = a2.h();
        String string = jobParameters.getExtras().getString("action");
        a2.m();
        h.O().b("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        f(new y6(this, h, jobParameters));
        return true;
    }

    public final void h() {
        zzfy a2 = zzfy.a(this.f10681a, (zzae) null, (Long) null);
        zzeu h = a2.h();
        a2.m();
        h.O().a("Local AppMeasurementService is shutting down");
    }

    public final boolean i(Intent intent) {
        if (intent == null) {
            j().G().a("onUnbind called with null intent");
            return true;
        }
        j().O().b("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    public final void k(Intent intent) {
        if (intent == null) {
            j().G().a("onRebind called with null intent");
            return;
        }
        j().O().b("onRebind called. action", intent.getAction());
    }
}
