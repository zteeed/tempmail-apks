package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
final class n4 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f10321b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f10322c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f10323d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ long f10324e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ zzgd f10325f;

    n4(zzgd zzgd, String str, String str2, String str3, long j) {
        this.f10325f = zzgd;
        this.f10321b = str;
        this.f10322c = str2;
        this.f10323d = str3;
        this.f10324e = j;
    }

    public final void run() {
        String str = this.f10321b;
        if (str == null) {
            this.f10325f.f10642b.g0().O().S(this.f10322c, (zzij) null);
            return;
        }
        this.f10325f.f10642b.g0().O().S(this.f10322c, new zzij(this.f10323d, str, this.f10324e));
    }
}
