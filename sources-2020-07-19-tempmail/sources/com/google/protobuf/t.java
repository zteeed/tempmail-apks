package com.google.protobuf;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: UnknownFieldSetLite */
public final class t {

    /* renamed from: e  reason: collision with root package name */
    private static final t f11621e = new t(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    private int f11622a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f11623b;

    /* renamed from: c  reason: collision with root package name */
    private Object[] f11624c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f11625d;

    private t() {
        this(0, new int[8], new Object[8], true);
    }

    private void b() {
        int i = this.f11622a;
        if (i == this.f11623b.length) {
            int i2 = this.f11622a + (i < 4 ? 8 : i >> 1);
            this.f11623b = Arrays.copyOf(this.f11623b, i2);
            this.f11624c = Arrays.copyOf(this.f11624c, i2);
        }
    }

    public static t c() {
        return f11621e;
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
        int i = tVar.f11622a + tVar2.f11622a;
        int[] copyOf = Arrays.copyOf(tVar.f11623b, i);
        System.arraycopy(tVar2.f11623b, 0, copyOf, tVar.f11622a, tVar2.f11622a);
        Object[] copyOf2 = Arrays.copyOf(tVar.f11624c, i);
        System.arraycopy(tVar2.f11624c, 0, copyOf2, tVar.f11622a, tVar2.f11622a);
        return new t(i, copyOf, copyOf2, true);
    }

    static t i() {
        return new t();
    }

    private void k(int i, Object obj) {
        b();
        int[] iArr = this.f11623b;
        int i2 = this.f11622a;
        iArr[i2] = i;
        this.f11624c[i2] = obj;
        this.f11622a = i2 + 1;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (!this.f11625d) {
            throw new UnsupportedOperationException();
        }
    }

    public void d() {
        this.f11625d = false;
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
        return this.f11622a == tVar.f11622a && Arrays.equals(this.f11623b, tVar.f11623b) && Arrays.deepEquals(this.f11624c, tVar.f11624c);
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
        return ((((527 + this.f11622a) * 31) + Arrays.hashCode(this.f11623b)) * 31) + Arrays.deepHashCode(this.f11624c);
    }

    /* access modifiers changed from: package-private */
    public final void j(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f11622a; i2++) {
            o.c(sb, i, String.valueOf(w.a(this.f11623b[i2])), this.f11624c[i2]);
        }
    }

    private t(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f11622a = i;
        this.f11623b = iArr;
        this.f11624c = objArr;
        this.f11625d = z;
    }
}
