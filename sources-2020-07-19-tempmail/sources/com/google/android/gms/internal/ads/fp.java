package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class fp implements zzbyx {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzdkw f3824a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzdkk f3825b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzcqv f3826c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ zzcuu f3827d;

    fp(zzcuu zzcuu, zzdkw zzdkw, zzdkk zzdkk, zzcqv zzcqv) {
        this.f3827d = zzcuu;
        this.f3824a = zzdkw;
        this.f3825b = zzdkk;
        this.f3826c = zzcqv;
    }

    public final void a(int i) {
        String valueOf = String.valueOf(this.f3826c.f7382a);
        zzbba.i(valueOf.length() != 0 ? "Fail to initialize adapter ".concat(valueOf) : new String("Fail to initialize adapter "));
    }

    public final void onInitializationSucceeded() {
        this.f3827d.f7568b.execute(new ip(this, this.f3824a, this.f3825b, this.f3826c));
    }
}
