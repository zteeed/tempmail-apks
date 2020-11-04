package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
public abstract class zzes {

    /* renamed from: a  reason: collision with root package name */
    int f9794a;

    /* renamed from: b  reason: collision with root package name */
    int f9795b;

    /* renamed from: c  reason: collision with root package name */
    u1 f9796c;

    private zzes() {
        this.f9795b = 100;
    }

    public static long b(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    static zzes c(byte[] bArr, int i, int i2, boolean z) {
        v1 v1Var = new v1(bArr, 0, i2, false);
        try {
            v1Var.h(i2);
            return v1Var;
        } catch (zzfw e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static int k(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public abstract int A();

    public abstract int a() throws IOException;

    public abstract void d(int i) throws zzfw;

    public abstract double e() throws IOException;

    public abstract boolean f(int i) throws IOException;

    public abstract float g() throws IOException;

    public abstract int h(int i) throws zzfw;

    public abstract long i() throws IOException;

    public abstract void j(int i);

    public abstract long l() throws IOException;

    public abstract int m() throws IOException;

    public abstract long n() throws IOException;

    public abstract int o() throws IOException;

    public abstract boolean p() throws IOException;

    public abstract String q() throws IOException;

    public abstract String r() throws IOException;

    public abstract zzeg s() throws IOException;

    public abstract int t() throws IOException;

    public abstract int u() throws IOException;

    public abstract int v() throws IOException;

    public abstract long w() throws IOException;

    public abstract int x() throws IOException;

    public abstract long y() throws IOException;

    public abstract boolean z() throws IOException;
}
