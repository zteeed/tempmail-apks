package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzcf;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
public final class zzdpz {

    /* renamed from: a  reason: collision with root package name */
    private final Context f8486a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f8487b;

    /* renamed from: c  reason: collision with root package name */
    private final zzdpm f8488c;

    /* renamed from: d  reason: collision with root package name */
    private final zzdpn f8489d;

    /* renamed from: e  reason: collision with root package name */
    private final ty f8490e;

    /* renamed from: f  reason: collision with root package name */
    private final ty f8491f;
    private Task<zzcf.zza> g;
    private Task<zzcf.zza> h;

    @VisibleForTesting
    private zzdpz(Context context, Executor executor, zzdpm zzdpm, zzdpn zzdpn, ry ryVar, uy uyVar) {
        this.f8486a = context;
        this.f8487b = executor;
        this.f8488c = zzdpm;
        this.f8489d = zzdpn;
        this.f8490e = ryVar;
        this.f8491f = uyVar;
    }

    private static zzcf.zza a(Task<zzcf.zza> task, zzcf.zza zza) {
        if (!task.r()) {
            return zza;
        }
        return task.n();
    }

    public static zzdpz b(Context context, Executor executor, zzdpm zzdpm, zzdpn zzdpn) {
        zzdpz zzdpz = new zzdpz(context, executor, zzdpm, zzdpn, new ry(), new uy());
        if (zzdpz.f8489d.b()) {
            zzdpz.g = zzdpz.h(new qy(zzdpz));
        } else {
            zzdpz.g = Tasks.e(zzdpz.f8490e.a());
        }
        zzdpz.h = zzdpz.h(new py(zzdpz));
        return zzdpz;
    }

    private final Task<zzcf.zza> h(Callable<zzcf.zza> callable) {
        Task<zzcf.zza> c2 = Tasks.c(this.f8487b, callable);
        c2.f(this.f8487b, new sy(this));
        return c2;
    }

    public final zzcf.zza c() {
        return a(this.g, this.f8490e.a());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzcf.zza d() throws Exception {
        return this.f8491f.b(this.f8486a);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzcf.zza e() throws Exception {
        return this.f8490e.b(this.f8486a);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void f(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.f8488c.b(2025, -1, exc);
    }

    public final zzcf.zza g() {
        return a(this.h, this.f8491f.a());
    }
}
