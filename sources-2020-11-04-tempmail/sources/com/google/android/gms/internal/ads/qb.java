package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class qb implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final zzbkg f4894b;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f4895c;

    qb(zzbkg zzbkg, Runnable runnable) {
        this.f4894b = zzbkg;
        this.f4895c = runnable;
    }

    public final void run() {
        zzbbf.f6324e.execute(new pb(this.f4894b, this.f4895c));
    }
}
