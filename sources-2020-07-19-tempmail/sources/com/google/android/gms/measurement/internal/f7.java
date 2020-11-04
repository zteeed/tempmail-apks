package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class f7 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    long f10004b;

    /* renamed from: c  reason: collision with root package name */
    long f10005c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ c7 f10006d;

    f7(c7 c7Var, long j, long j2) {
        this.f10006d = c7Var;
        this.f10004b = j;
        this.f10005c = j2;
    }

    public final void run() {
        this.f10006d.f9950b.g().z(new e7(this));
    }
}
