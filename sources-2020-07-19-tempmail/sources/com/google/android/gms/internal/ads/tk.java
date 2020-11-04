package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class tk implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final zzclx f4993b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f4994c;

    /* renamed from: d  reason: collision with root package name */
    private final zzbbn f4995d;

    /* renamed from: e  reason: collision with root package name */
    private final String f4996e;

    /* renamed from: f  reason: collision with root package name */
    private final long f4997f;

    tk(zzclx zzclx, Object obj, zzbbn zzbbn, String str, long j) {
        this.f4993b = zzclx;
        this.f4994c = obj;
        this.f4995d = zzbbn;
        this.f4996e = str;
        this.f4997f = j;
    }

    public final void run() {
        this.f4993b.g(this.f4994c, this.f4995d, this.f4996e, this.f4997f);
    }
}
