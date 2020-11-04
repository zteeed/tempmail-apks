package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class w5 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Bundle f10486b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzij f10487c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzij f10488d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ long f10489e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ zzii f10490f;

    w5(zzii zzii, Bundle bundle, zzij zzij, zzij zzij2, long j) {
        this.f10490f = zzii;
        this.f10486b = bundle;
        this.f10487c = zzij;
        this.f10488d = zzij2;
        this.f10489e = j;
    }

    public final void run() {
        this.f10490f.L(this.f10486b, this.f10487c, this.f10488d, this.f10489e);
    }
}
