package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class w5 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Bundle f10300b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzij f10301c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzij f10302d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ long f10303e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ zzii f10304f;

    w5(zzii zzii, Bundle bundle, zzij zzij, zzij zzij2, long j) {
        this.f10304f = zzii;
        this.f10300b = bundle;
        this.f10301c = zzij;
        this.f10302d = zzij2;
        this.f10303e = j;
    }

    public final void run() {
        this.f10304f.L(this.f10300b, this.f10301c, this.f10302d, this.f10303e);
    }
}
