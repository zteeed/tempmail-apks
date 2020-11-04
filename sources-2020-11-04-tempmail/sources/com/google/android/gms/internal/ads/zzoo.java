package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzoo implements zzoi {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f9127a;

    /* renamed from: b  reason: collision with root package name */
    private final int f9128b;

    /* renamed from: c  reason: collision with root package name */
    private final zzoj[] f9129c;

    /* renamed from: d  reason: collision with root package name */
    private int f9130d;

    /* renamed from: e  reason: collision with root package name */
    private int f9131e;

    /* renamed from: f  reason: collision with root package name */
    private int f9132f;
    private zzoj[] g;

    public zzoo(boolean z, int i) {
        this(true, 65536, 0);
    }

    public final synchronized void a() {
        if (this.f9127a) {
            b(0);
        }
    }

    public final synchronized void b(int i) {
        boolean z = i < this.f9130d;
        this.f9130d = i;
        if (z) {
            f();
        }
    }

    public final synchronized int c() {
        return this.f9131e * this.f9128b;
    }

    public final synchronized void f() {
        int max = Math.max(0, zzpo.q(this.f9130d, this.f9128b) - this.f9131e);
        if (max < this.f9132f) {
            Arrays.fill(this.g, max, this.f9132f, (Object) null);
            this.f9132f = max;
        }
    }

    public final synchronized zzoj g() {
        zzoj zzoj;
        this.f9131e++;
        if (this.f9132f > 0) {
            zzoj[] zzojArr = this.g;
            int i = this.f9132f - 1;
            this.f9132f = i;
            zzoj = zzojArr[i];
            this.g[i] = null;
        } else {
            zzoj = new zzoj(new byte[this.f9128b], 0);
        }
        return zzoj;
    }

    public final int h() {
        return this.f9128b;
    }

    public final synchronized void i(zzoj[] zzojArr) {
        boolean z;
        if (this.f9132f + zzojArr.length >= this.g.length) {
            this.g = (zzoj[]) Arrays.copyOf(this.g, Math.max(this.g.length << 1, this.f9132f + zzojArr.length));
        }
        for (zzoj zzoj : zzojArr) {
            if (zzoj.f9121a != null) {
                if (zzoj.f9121a.length != this.f9128b) {
                    z = false;
                    zzpb.a(z);
                    zzoj[] zzojArr2 = this.g;
                    int i = this.f9132f;
                    this.f9132f = i + 1;
                    zzojArr2[i] = zzoj;
                }
            }
            z = true;
            zzpb.a(z);
            zzoj[] zzojArr22 = this.g;
            int i2 = this.f9132f;
            this.f9132f = i2 + 1;
            zzojArr22[i2] = zzoj;
        }
        this.f9131e -= zzojArr.length;
        notifyAll();
    }

    public final synchronized void j(zzoj zzoj) {
        this.f9129c[0] = zzoj;
        i(this.f9129c);
    }

    private zzoo(boolean z, int i, int i2) {
        zzpb.a(true);
        zzpb.a(true);
        this.f9127a = true;
        this.f9128b = 65536;
        this.f9132f = 0;
        this.g = new zzoj[100];
        this.f9129c = new zzoj[1];
    }
}
