package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class f5 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f10183b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f10184c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f10185d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ String f10186e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ boolean f10187f;
    private final /* synthetic */ zzhc g;

    f5(zzhc zzhc, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.g = zzhc;
        this.f10183b = atomicReference;
        this.f10184c = str;
        this.f10185d = str2;
        this.f10186e = str3;
        this.f10187f = z;
    }

    public final void run() {
        this.g.f10357a.P().V(this.f10183b, this.f10184c, this.f10185d, this.f10186e, this.f10187f);
    }
}
