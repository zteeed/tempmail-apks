package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public abstract class zzefc {

    /* renamed from: a  reason: collision with root package name */
    int f8541a;

    /* renamed from: b  reason: collision with root package name */
    int f8542b;

    /* renamed from: c  reason: collision with root package name */
    int f8543c;

    /* renamed from: d  reason: collision with root package name */
    d60 f8544d;

    private zzefc() {
        this.f8542b = 100;
        this.f8543c = Integer.MAX_VALUE;
    }

    public static int A(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    static zzefc d(byte[] bArr, int i, int i2, boolean z) {
        z50 z50 = new z50(bArr, i, i2, z);
        try {
            z50.y(i2);
            return z50;
        } catch (zzegl e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static long v(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public abstract double a() throws IOException;

    public abstract float b() throws IOException;

    public abstract String c() throws IOException;

    public abstract int e() throws IOException;

    public abstract long f() throws IOException;

    public abstract long g() throws IOException;

    public abstract int h() throws IOException;

    public abstract long i() throws IOException;

    public abstract int j() throws IOException;

    public abstract boolean k() throws IOException;

    public abstract String l() throws IOException;

    public abstract zzeer m() throws IOException;

    public abstract int n() throws IOException;

    public abstract int o() throws IOException;

    public abstract int p() throws IOException;

    public abstract long q() throws IOException;

    public abstract int r() throws IOException;

    public abstract long s() throws IOException;

    public abstract boolean t() throws IOException;

    public abstract int u();

    public abstract void w(int i) throws zzegl;

    public abstract boolean x(int i) throws IOException;

    public abstract int y(int i) throws zzegl;

    public abstract void z(int i);
}
