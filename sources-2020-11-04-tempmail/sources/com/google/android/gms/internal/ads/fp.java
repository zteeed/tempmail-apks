package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class fp implements zzbyx {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzdkw f4007a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzdkk f4008b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzcqv f4009c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ zzcuu f4010d;

    fp(zzcuu zzcuu, zzdkw zzdkw, zzdkk zzdkk, zzcqv zzcqv) {
        this.f4010d = zzcuu;
        this.f4007a = zzdkw;
        this.f4008b = zzdkk;
        this.f4009c = zzcqv;
    }

    public final void a(int i) {
        String valueOf = String.valueOf(this.f4009c.f7565a);
        zzbba.i(valueOf.length() != 0 ? "Fail to initialize adapter ".concat(valueOf) : new String("Fail to initialize adapter "));
    }

    public final void onInitializationSucceeded() {
        this.f4010d.f7751b.execute(new ip(this, this.f4007a, this.f4008b, this.f4009c));
    }
}
