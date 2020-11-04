package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
final class r7 implements Callable<String> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzn f10405b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzkj f10406c;

    r7(zzkj zzkj, zzn zzn) {
        this.f10406c = zzkj;
        this.f10405b = zzn;
    }

    public final /* synthetic */ Object call() throws Exception {
        k3 Q = this.f10406c.Q(this.f10405b);
        if (Q != null) {
            return Q.x();
        }
        this.f10406c.h().J().a("App info was null when attempting to get app instance id");
        return null;
    }
}
