package com.google.protobuf;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: UnknownFieldSetLite */
public final class t {

    /* renamed from: e  reason: collision with root package name */
    private static final t f12170e = new t(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    private int f12171a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f12172b;

    /* renamed from: c  reason: collision with root package name */
    private Object[] f12173c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f12174d;

    private t() {
        this(0, new int[8], new Object[8], true);
    }

    private void b() {
        int i = this.f12171a;
        if (i == this.f12172b.length) {
            int i2 = this.f12171a + (i < 4 ? 8 : i >> 1);
            this.f12172b = Arrays.copyOf(this.f12172b, i2);
            this.f12173c = Arrays.copyOf(this.f12173c, i2);
        }
    }

    public static t c() {
        return f12170e;
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    private com.google.protobuf.t f(com.google.protobuf.e r2) throws java.io.IOException {
        /*
            r1 = this;
        L_0x0000:
            int r0 = r2.z()
            if (r0 == 0) goto L_0x000c
            boolean r0 = r1.e(r0, r2)
            if (r0 != 0) goto L_0x0000
        L_0x000c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.t.f(com.google.protobuf.e):com.google.protobuf.t");
    }

    static t h(t tVar, t tVar2) {
        int i = tVar.f12171a + tVar2.f12171a;
        int[] copyOf = Arrays.copyOf(tVar.f12172b, i);
        System.arraycopy(tVar2.f12172b, 0, copyOf, tVar.f12171a, tVar2.f12171a);
        Object[] copyOf2 = Arrays.copyOf(tVar.f12173c, i);
        System.arraycopy(tVar2.f12173c, 0, copyOf2, tVar.f12171a, tVar2.f12171a);
        return new t(i, copyOf, copyOf2, true);
    }

    static t i() {
        return new t();
    }

    private void k(int i, Object obj) {
        b();
        int[] iArr = this.f12172b;
        int i2 = this.f12171a;
        iArr[i2] = i;
        this.f12173c[i2] = obj;
        this.f12171a = i2 + 1;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (!this.f12174d) {
            throw new UnsupportedOperationException();
        }
    }

    public void d() {
        this.f12174d = false;
    }

    /* access modifiers changed from: package-private */
    public boolean e(int i, e eVar) throws IOException {
        a();
        int a2 = w.a(i);
        int b2 = w.b(i);
        if (b2 == 0) {
            k(i, Long.valueOf(eVar.o()));
            return true;
        } else if (b2 == 1) {
            k(i, Long.valueOf(eVar.m()));
            return true;
        } else if (b2 == 2) {
            k(i, eVar.j());
            return true;
        } else if (b2 == 3) {
            t tVar = new t();
            tVar.f(eVar);
            eVar.a(w.c(a2, 4));
            k(i, tVar);
            return true;
        } else if (b2 == 4) {
            return false;
        } else {
            if (b2 == 5) {
                k(i, Integer.valueOf(eVar.l()));
                return true;
            }
            throw InvalidProtocolBufferException.d();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f12171a == tVar.f12171a && Arrays.equals(this.f12172b, tVar.f12172b) && Arrays.deepEquals(this.f12173c, tVar.f12173c);
    }

    /* access modifiers changed from: package-private */
    public t g(int i, int i2) {
        a();
        if (i != 0) {
            k(w.c(i, 0), Long.valueOf((long) i2));
            return this;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    public int hashCode() {
        return ((((527 + this.f12171a) * 31) + Arrays.hashCode(this.f12172b)) * 31) + Arrays.deepHashCode(this.f12173c);
    }

    /* access modifiers changed from: package-private */
    public final void j(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f12171a; i2++) {
            o.c(sb, i, String.valueOf(w.a(this.f12172b[i2])), this.f12173c[i2]);
        }
    }

    private t(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f12171a = i;
        this.f12172b = iArr;
        this.f12173c = objArr;
        this.f12174d = z;
    }
}
