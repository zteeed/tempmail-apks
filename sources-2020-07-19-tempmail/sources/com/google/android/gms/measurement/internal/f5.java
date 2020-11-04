package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class f5 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f9997b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f9998c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f9999d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ String f10000e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ boolean f10001f;
    private final /* synthetic */ zzhc g;

    f5(zzhc zzhc, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.g = zzhc;
        this.f9997b = atomicReference;
        this.f9998c = str;
        this.f9999d = str2;
        this.f10000e = str3;
        this.f10001f = z;
    }

    public final void run() {
        this.g.f10171a.P().V(this.f9997b, this.f9998c, this.f9999d, this.f10000e, this.f10001f);
    }
}
