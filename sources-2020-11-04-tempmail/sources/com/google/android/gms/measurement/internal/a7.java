package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
final class a7 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzkj f10102b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Runnable f10103c;

    a7(zzjo zzjo, zzkj zzkj, Runnable runnable) {
        this.f10102b = zzkj;
        this.f10103c = runnable;
    }

    public final void run() {
        this.f10102b.e0();
        this.f10102b.z(this.f10103c);
        this.f10102b.d0();
    }
}
