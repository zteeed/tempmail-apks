package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class cx {

    /* renamed from: a  reason: collision with root package name */
    private final zzdmp f3764a = new zzdmp();

    /* renamed from: b  reason: collision with root package name */
    private int f3765b;

    /* renamed from: c  reason: collision with root package name */
    private int f3766c;

    /* renamed from: d  reason: collision with root package name */
    private int f3767d;

    /* renamed from: e  reason: collision with root package name */
    private int f3768e;

    /* renamed from: f  reason: collision with root package name */
    private int f3769f;

    cx() {
    }

    public final void a() {
        this.f3767d++;
    }

    public final void b() {
        this.f3768e++;
    }

    public final void c() {
        this.f3765b++;
        this.f3764a.f8393b = true;
    }

    public final void d() {
        this.f3766c++;
        this.f3764a.f8394c = true;
    }

    public final void e() {
        this.f3769f++;
    }

    public final zzdmp f() {
        zzdmp zzdmp = (zzdmp) this.f3764a.clone();
        zzdmp zzdmp2 = this.f3764a;
        zzdmp2.f8393b = false;
        zzdmp2.f8394c = false;
        return zzdmp;
    }

    public final String g() {
        return "\n\tPool does not exist: " + this.f3767d + "\n\tNew pools created: " + this.f3765b + "\n\tPools removed: " + this.f3766c + "\n\tEntries added: " + this.f3769f + "\n\tNo entries retrieved: " + this.f3768e + "\n";
    }
}
