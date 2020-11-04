package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class mc implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final zzboi f4560b;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f4561c;

    mc(zzboi zzboi, Runnable runnable) {
        this.f4560b = zzboi;
        this.f4561c = runnable;
    }

    public final void run() {
        this.f4560b.n(this.f4561c);
    }
}
