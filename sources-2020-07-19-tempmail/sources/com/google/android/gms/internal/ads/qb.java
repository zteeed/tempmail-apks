package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class qb implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final zzbkg f4711b;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f4712c;

    qb(zzbkg zzbkg, Runnable runnable) {
        this.f4711b = zzbkg;
        this.f4712c = runnable;
    }

    public final void run() {
        zzbbf.f6141e.execute(new pb(this.f4711b, this.f4712c));
    }
}
