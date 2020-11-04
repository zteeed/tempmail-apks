package org.greenrobot.greendao.i;

import java.util.Arrays;

/* compiled from: LongHashMap */
public final class c<T> {

    /* renamed from: a  reason: collision with root package name */
    private a<T>[] f15100a;

    /* renamed from: b  reason: collision with root package name */
    private int f15101b;

    /* renamed from: c  reason: collision with root package name */
    private int f15102c;

    /* renamed from: d  reason: collision with root package name */
    private int f15103d;

    /* compiled from: LongHashMap */
    static final class a<T> {

        /* renamed from: a  reason: collision with root package name */
        final long f15104a;

        /* renamed from: b  reason: collision with root package name */
        T f15105b;

        /* renamed from: c  reason: collision with root package name */
        a<T> f15106c;

        a(long j, T t, a<T> aVar) {
            this.f15104a = j;
            this.f15105b = t;
            this.f15106c = aVar;
        }
    }

    public c() {
        this(16);
    }

    public void a() {
        this.f15103d = 0;
        Arrays.fill(this.f15100a, (Object) null);
    }

    public T b(long j) {
        for (a<T> aVar = this.f15100a[((((int) j) ^ ((int) (j >>> 32))) & Integer.MAX_VALUE) % this.f15101b]; aVar != null; aVar = aVar.f15106c) {
            if (aVar.f15104a == j) {
                return aVar.f15105b;
            }
        }
        return null;
    }

    public T c(long j, T t) {
        int i = ((((int) j) ^ ((int) (j >>> 32))) & Integer.MAX_VALUE) % this.f15101b;
        a<T> aVar = this.f15100a[i];
        for (a<T> aVar2 = aVar; aVar2 != null; aVar2 = aVar2.f15106c) {
            if (aVar2.f15104a == j) {
                T t2 = aVar2.f15105b;
                aVar2.f15105b = t;
                return t2;
            }
        }
        this.f15100a[i] = new a<>(j, t, aVar);
        int i2 = this.f15103d + 1;
        this.f15103d = i2;
        if (i2 <= this.f15102c) {
            return null;
        }
        f(this.f15101b * 2);
        return null;
    }

    public T d(long j) {
        int i = ((((int) j) ^ ((int) (j >>> 32))) & Integer.MAX_VALUE) % this.f15101b;
        a<T> aVar = this.f15100a[i];
        a<T> aVar2 = null;
        while (aVar != null) {
            a<T> aVar3 = aVar.f15106c;
            if (aVar.f15104a == j) {
                if (aVar2 == null) {
                    this.f15100a[i] = aVar3;
                } else {
                    aVar2.f15106c = aVar3;
                }
                this.f15103d--;
                return aVar.f15105b;
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
        for (a<T> aVar : this.f15100a) {
            while (aVar != null) {
                long j = aVar.f15104a;
                int i2 = ((((int) (j >>> 32)) ^ ((int) j)) & Integer.MAX_VALUE) % i;
                a<T> aVar2 = aVar.f15106c;
                aVar.f15106c = aVarArr[i2];
                aVarArr[i2] = aVar;
                aVar = aVar2;
            }
        }
        this.f15100a = aVarArr;
        this.f15101b = i;
        this.f15102c = (i * 4) / 3;
    }

    public c(int i) {
        this.f15101b = i;
        this.f15102c = (i * 4) / 3;
        this.f15100a = new a[i];
    }
}
