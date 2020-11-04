package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class o1 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final zzaju f4699b;

    private o1(zzaju zzaju) {
        this.f4699b = zzaju;
    }

    static Runnable a(zzaju zzaju) {
        return new o1(zzaju);
    }

    public final void run() {
        this.f4699b.destroy();
    }
}
