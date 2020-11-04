package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class ix {

    /* renamed from: a  reason: collision with root package name */
    private final long f4083a;

    /* renamed from: b  reason: collision with root package name */
    private final zzdnm f4084b = new zzdnm();

    /* renamed from: c  reason: collision with root package name */
    private long f4085c;

    /* renamed from: d  reason: collision with root package name */
    private int f4086d = 0;

    /* renamed from: e  reason: collision with root package name */
    private int f4087e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f4088f = 0;

    public ix() {
        long a2 = zzq.zzld().a();
        this.f4083a = a2;
        this.f4085c = a2;
    }

    public final long a() {
        return this.f4083a;
    }

    public final long b() {
        return this.f4085c;
    }

    public final int c() {
        return this.f4086d;
    }

    public final String d() {
        return "Created: " + this.f4083a + " Last accessed: " + this.f4085c + " Accesses: " + this.f4086d + "\nEntries retrieved: Valid: " + this.f4087e + " Stale: " + this.f4088f;
    }

    public final void e() {
        this.f4085c = zzq.zzld().a();
        this.f4086d++;
    }

    public final void f() {
        this.f4087e++;
        this.f4084b.f8244b = true;
    }

    public final void g() {
        this.f4088f++;
        this.f4084b.f8245c++;
    }

    public final zzdnm h() {
        zzdnm zzdnm = (zzdnm) this.f4084b.clone();
        zzdnm zzdnm2 = this.f4084b;
        zzdnm2.f8244b = false;
        zzdnm2.f8245c = 0;
        return zzdnm;
    }
}
