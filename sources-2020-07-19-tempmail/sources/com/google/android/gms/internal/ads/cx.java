package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class cx {

    /* renamed from: a  reason: collision with root package name */
    private final zzdmp f3581a = new zzdmp();

    /* renamed from: b  reason: collision with root package name */
    private int f3582b;

    /* renamed from: c  reason: collision with root package name */
    private int f3583c;

    /* renamed from: d  reason: collision with root package name */
    private int f3584d;

    /* renamed from: e  reason: collision with root package name */
    private int f3585e;

    /* renamed from: f  reason: collision with root package name */
    private int f3586f;

    cx() {
    }

    public final void a() {
        this.f3584d++;
    }

    public final void b() {
        this.f3585e++;
    }

    public final void c() {
        this.f3582b++;
        this.f3581a.f8210b = true;
    }

    public final void d() {
        this.f3583c++;
        this.f3581a.f8211c = true;
    }

    public final void e() {
        this.f3586f++;
    }

    public final zzdmp f() {
        zzdmp zzdmp = (zzdmp) this.f3581a.clone();
        zzdmp zzdmp2 = this.f3581a;
        zzdmp2.f8210b = false;
        zzdmp2.f8211c = false;
        return zzdmp;
    }

    public final String g() {
        return "\n\tPool does not exist: " + this.f3584d + "\n\tNew pools created: " + this.f3582b + "\n\tPools removed: " + this.f3583c + "\n\tEntries added: " + this.f3586f + "\n\tNo entries retrieved: " + this.f3585e + "\n";
    }
}
