package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class sc0 {

    /* renamed from: a  reason: collision with root package name */
    public lc0 f5077a;

    /* renamed from: b  reason: collision with root package name */
    public long f5078b;

    /* renamed from: c  reason: collision with root package name */
    public long f5079c;

    /* renamed from: d  reason: collision with root package name */
    public long f5080d;

    /* renamed from: e  reason: collision with root package name */
    public int f5081e;

    /* renamed from: f  reason: collision with root package name */
    public int f5082f;
    public long[] g;
    public int[] h;
    public int[] i;
    public int[] j;
    public long[] k;
    public boolean[] l;
    public boolean m;
    public boolean[] n;
    public zzlo o;
    public int p;
    public zzpi q;
    public boolean r;
    public long s;

    sc0() {
    }

    public final void a(int i2) {
        zzpi zzpi = this.q;
        if (zzpi == null || zzpi.c() < i2) {
            this.q = new zzpi(i2);
        }
        this.p = i2;
        this.m = true;
        this.r = true;
    }

    public final long b(int i2) {
        return this.k[i2] + ((long) this.j[i2]);
    }
}
