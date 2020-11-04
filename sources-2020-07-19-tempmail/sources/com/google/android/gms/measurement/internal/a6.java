package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class a6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzij f9913b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ long f9914c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzii f9915d;

    a6(zzii zzii, zzij zzij, long j) {
        this.f9915d = zzii;
        this.f9913b = zzij;
        this.f9914c = j;
    }

    public final void run() {
        this.f9915d.R(this.f9913b, false, this.f9914c);
        zzii zzii = this.f9915d;
        zzii.f10481e = null;
        zzii.s().O((zzij) null);
    }
}
