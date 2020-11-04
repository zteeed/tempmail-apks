package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzoo implements zzoi {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f8944a;

    /* renamed from: b  reason: collision with root package name */
    private final int f8945b;

    /* renamed from: c  reason: collision with root package name */
    private final zzoj[] f8946c;

    /* renamed from: d  reason: collision with root package name */
    private int f8947d;

    /* renamed from: e  reason: collision with root package name */
    private int f8948e;

    /* renamed from: f  reason: collision with root package name */
    private int f8949f;
    private zzoj[] g;

    public zzoo(boolean z, int i) {
        this(true, 65536, 0);
    }

    public final synchronized void a() {
        if (this.f8944a) {
            b(0);
        }
    }

    public final synchronized void b(int i) {
        boolean z = i < this.f8947d;
        this.f8947d = i;
        if (z) {
            f();
        }
    }

    public final synchronized int c() {
        return this.f8948e * this.f8945b;
    }

    public final synchronized void f() {
        int max = Math.max(0, zzpo.q(this.f8947d, this.f8945b) - this.f8948e);
        if (max < this.f8949f) {
            Arrays.fill(this.g, max, this.f8949f, (Object) null);
            this.f8949f = max;
        }
    }

    public final synchronized zzoj g() {
        zzoj zzoj;
        this.f8948e++;
        if (this.f8949f > 0) {
            zzoj[] zzojArr = this.g;
            int i = this.f8949f - 1;
            this.f8949f = i;
            zzoj = zzojArr[i];
            this.g[i] = null;
        } else {
            zzoj = new zzoj(new byte[this.f8945b], 0);
        }
        return zzoj;
    }

    public final int h() {
        return this.f8945b;
    }

    public final synchronized void i(zzoj[] zzojArr) {
        boolean z;
        if (this.f8949f + zzojArr.length >= this.g.length) {
            this.g = (zzoj[]) Arrays.copyOf(this.g, Math.max(this.g.length << 1, this.f8949f + zzojArr.length));
        }
        for (zzoj zzoj : zzojArr) {
            if (zzoj.f8938a != null) {
                if (zzoj.f8938a.length != this.f8945b) {
                    z = false;
                    zzpb.a(z);
                    zzoj[] zzojArr2 = this.g;
                    int i = this.f8949f;
                    this.f8949f = i + 1;
                    zzojArr2[i] = zzoj;
                }
            }
            z = true;
            zzpb.a(z);
            zzoj[] zzojArr22 = this.g;
            int i2 = this.f8949f;
            this.f8949f = i2 + 1;
            zzojArr22[i2] = zzoj;
        }
        this.f8948e -= zzojArr.length;
        notifyAll();
    }

    public final synchronized void j(zzoj zzoj) {
        this.f8946c[0] = zzoj;
        i(this.f8946c);
    }

    private zzoo(boolean z, int i, int i2) {
        zzpb.a(true);
        zzpb.a(true);
        this.f8944a = true;
        this.f8945b = 65536;
        this.f8949f = 0;
        this.g = new zzoj[100];
        this.f8946c = new zzoj[1];
    }
}
