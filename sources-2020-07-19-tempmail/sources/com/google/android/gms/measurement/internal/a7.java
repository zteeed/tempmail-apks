package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
final class a7 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzkj f9916b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Runnable f9917c;

    a7(zzjo zzjo, zzkj zzkj, Runnable runnable) {
        this.f9916b = zzkj;
        this.f9917c = runnable;
    }

    public final void run() {
        this.f9916b.e0();
        this.f9916b.z(this.f9917c);
        this.f9916b.d0();
    }
}
