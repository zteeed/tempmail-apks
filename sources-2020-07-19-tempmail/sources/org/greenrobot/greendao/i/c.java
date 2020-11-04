package org.greenrobot.greendao.i;

import java.util.Arrays;

/* compiled from: LongHashMap */
public final class c<T> {

    /* renamed from: a  reason: collision with root package name */
    private a<T>[] f14531a;

    /* renamed from: b  reason: collision with root package name */
    private int f14532b;

    /* renamed from: c  reason: collision with root package name */
    private int f14533c;

    /* renamed from: d  reason: collision with root package name */
    private int f14534d;

    /* compiled from: LongHashMap */
    static final class a<T> {

        /* renamed from: a  reason: collision with root package name */
        final long f14535a;

        /* renamed from: b  reason: collision with root package name */
        T f14536b;

        /* renamed from: c  reason: collision with root package name */
        a<T> f14537c;

        a(long j, T t, a<T> aVar) {
            this.f14535a = j;
            this.f14536b = t;
            this.f14537c = aVar;
        }
    }

    public c() {
        this(16);
    }

    public void a() {
        this.f14534d = 0;
        Arrays.fill(this.f14531a, (Object) null);
    }

    public T b(long j) {
        for (a<T> aVar = this.f14531a[((((int) j) ^ ((int) (j >>> 32))) & Integer.MAX_VALUE) % this.f14532b]; aVar != null; aVar = aVar.f14537c) {
            if (aVar.f14535a == j) {
                return aVar.f14536b;
            }
        }
        return null;
    }

    public T c(long j, T t) {
        int i = ((((int) j) ^ ((int) (j >>> 32))) & Integer.MAX_VALUE) % this.f14532b;
        a<T> aVar = this.f14531a[i];
        for (a<T> aVar2 = aVar; aVar2 != null; aVar2 = aVar2.f14537c) {
            if (aVar2.f14535a == j) {
                T t2 = aVar2.f14536b;
                aVar2.f14536b = t;
                return t2;
            }
        }
        this.f14531a[i] = new a<>(j, t, aVar);
        int i2 = this.f14534d + 1;
        this.f14534d = i2;
        if (i2 <= this.f14533c) {
            return null;
        }
        f(this.f14532b * 2);
        return null;
    }

    public T d(long j) {
        int i = ((((int) j) ^ ((int) (j >>> 32))) & Integer.MAX_VALUE) % this.f14532b;
        a<T> aVar = this.f14531a[i];
        a<T> aVar2 = null;
        while (aVar != null) {
            a<T> aVar3 = aVar.f14537c;
            if (aVar.f14535a == j) {
                if (aVar2 == null) {
                    this.f14531a[i] = aVar3;
                } else {
                    aVar2.f14537c = aVar3;
                }
                this.f14534d--;
                return aVar.f14536b;
            }
            aVar2 = aVar;
            aVar = aVar3;
        }
        return null;
    }

    public void e(int i) {
        f((i * 5) / 3);
    }

    public void f(int i) {
        a<T>[] aVarArr = new a[i];
        for (a<T> aVar : this.f14531a) {
            while (aVar != null) {
                long j = aVar.f14535a;
                int i2 = ((((int) (j >>> 32)) ^ ((int) j)) & Integer.MAX_VALUE) % i;
                a<T> aVar2 = aVar.f14537c;
                aVar.f14537c = aVarArr[i2];
                aVarArr[i2] = aVar;
                aVar = aVar2;
            }
        }
        this.f14531a = aVarArr;
        this.f14532b = i;
        this.f14533c = (i * 4) / 3;
    }

    public c(int i) {
        this.f14532b = i;
        this.f14533c = (i * 4) / 3;
        this.f14531a = new a[i];
    }
}
