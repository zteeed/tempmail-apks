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
    private final Context f8303a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f8304b;

    /* renamed from: c  reason: collision with root package name */
    private final zzdpm f8305c;

    /* renamed from: d  reason: collision with root package name */
    private final zzdpn f8306d;

    /* renamed from: e  reason: collision with root package name */
    private final ty f8307e;

    /* renamed from: f  reason: collision with root package name */
    private final ty f8308f;
    private Task<zzcf.zza> g;
    private Task<zzcf.zza> h;

    @VisibleForTesting
    private zzdpz(Context context, Executor executor, zzdpm zzdpm, zzdpn zzdpn, ry ryVar, uy uyVar) {
        this.f8303a = context;
        this.f8304b = executor;
        this.f8305c = zzdpm;
        this.f8306d = zzdpn;
        this.f8307e = ryVar;
        this.f8308f = uyVar;
    }

    private static zzcf.zza a(Task<zzcf.zza> task, zzcf.zza zza) {
        if (!task.r()) {
            return zza;
        }
        return task.n();
    }

    public static zzdpz b(Context context, Executor executor, zzdpm zzdpm, zzdpn zzdpn) {
        zzdpz zzdpz = new zzdpz(context, executor, zzdpm, zzdpn, new ry(), new uy());
        if (zzdpz.f8306d.b()) {
            zzdpz.g = zzdpz.h(new qy(zzdpz));
        } else {
            zzdpz.g = Tasks.e(zzdpz.f8307e.a());
        }
        zzdpz.h = zzdpz.h(new py(zzdpz));
        return zzdpz;
    }

    private final Task<zzcf.zza> h(Callable<zzcf.zza> callable) {
        Task<zzcf.zza> c2 = Tasks.c(this.f8304b, callable);
        c2.f(this.f8304b, new sy(this));
        return c2;
    }

    public final zzcf.zza c() {
        return a(this.g, this.f8307e.a());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzcf.zza d() throws Exception {
        return this.f8308f.b(this.f8303a);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzcf.zza e() throws Exception {
        return this.f8307e.b(this.f8303a);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void f(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.f8305c.b(2025, -1, exc);
    }

    public final zzcf.zza g() {
        return a(this.h, this.f8308f.a());
    }
}
