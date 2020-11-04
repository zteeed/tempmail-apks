package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcqd implements zzbsq, zzbua {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f7538c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static int f7539d;

    /* renamed from: b  reason: collision with root package name */
    private final zzcqi f7540b;

    public zzcqd(zzcqi zzcqi) {
        this.f7540b = zzcqi;
    }

    private static void a() {
        synchronized (f7538c) {
            f7539d++;
        }
    }

    private static boolean b() {
        boolean z;
        synchronized (f7538c) {
            z = f7539d < ((Integer) zzwg.e().c(zzaav.c3)).intValue();
        }
        return z;
    }

    public final void onAdFailedToLoad(int i) {
        if (((Boolean) zzwg.e().c(zzaav.b3)).booleanValue() && b()) {
            this.f7540b.g(false);
            a();
        }
    }

    public final void onAdLoaded() {
        if (((Boolean) zzwg.e().c(zzaav.b3)).booleanValue() && b()) {
            this.f7540b.g(true);
            a();
        }
    }
}
