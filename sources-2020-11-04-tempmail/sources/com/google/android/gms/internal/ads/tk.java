package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class tk implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final zzclx f5176b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f5177c;

    /* renamed from: d  reason: collision with root package name */
    private final zzbbn f5178d;

    /* renamed from: e  reason: collision with root package name */
    private final String f5179e;

    /* renamed from: f  reason: collision with root package name */
    private final long f5180f;

    tk(zzclx zzclx, Object obj, zzbbn zzbbn, String str, long j) {
        this.f5176b = zzclx;
        this.f5177c = obj;
        this.f5178d = zzbbn;
        this.f5179e = str;
        this.f5180f = j;
    }

    public final void run() {
        this.f5176b.g(this.f5177c, this.f5178d, this.f5179e, this.f5180f);
    }
}
