package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class ix {

    /* renamed from: a  reason: collision with root package name */
    private final long f4266a;

    /* renamed from: b  reason: collision with root package name */
    private final zzdnm f4267b = new zzdnm();

    /* renamed from: c  reason: collision with root package name */
    private long f4268c;

    /* renamed from: d  reason: collision with root package name */
    private int f4269d = 0;

    /* renamed from: e  reason: collision with root package name */
    private int f4270e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f4271f = 0;

    public ix() {
        long a2 = zzq.zzld().a();
        this.f4266a = a2;
        this.f4268c = a2;
    }

    public final long a() {
        return this.f4266a;
    }

    public final long b() {
        return this.f4268c;
    }

    public final int c() {
        return this.f4269d;
    }

    public final String d() {
        return "Created: " + this.f4266a + " Last accessed: " + this.f4268c + " Accesses: " + this.f4269d + "\nEntries retrieved: Valid: " + this.f4270e + " Stale: " + this.f4271f;
    }

    public final void e() {
        this.f4268c = zzq.zzld().a();
        this.f4269d++;
    }

    public final void f() {
        this.f4270e++;
        this.f4267b.f8427b = true;
    }

    public final void g() {
        this.f4271f++;
        this.f4267b.f8428c++;
    }

    public final zzdnm h() {
        zzdnm zzdnm = (zzdnm) this.f4267b.clone();
        zzdnm zzdnm2 = this.f4267b;
        zzdnm2.f8427b = false;
        zzdnm2.f8428c = 0;
        return zzdnm;
    }
}
