package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class v5 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzij f10466b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzij f10467c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ long f10468d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ boolean f10469e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ zzii f10470f;

    v5(zzii zzii, zzij zzij, zzij zzij2, long j, boolean z) {
        this.f10470f = zzii;
        this.f10466b = zzij;
        this.f10467c = zzij2;
        this.f10468d = j;
        this.f10469e = z;
    }

    public final void run() {
        this.f10470f.Q(this.f10466b, this.f10467c, this.f10468d, this.f10469e, (Bundle) null);
    }
}
