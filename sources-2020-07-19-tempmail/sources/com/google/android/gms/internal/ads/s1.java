package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class s1 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final zzaju f4854b;

    private s1(zzaju zzaju) {
        this.f4854b = zzaju;
    }

    static Runnable a(zzaju zzaju) {
        return new s1(zzaju);
    }

    public final void run() {
        this.f4854b.destroy();
    }
}
