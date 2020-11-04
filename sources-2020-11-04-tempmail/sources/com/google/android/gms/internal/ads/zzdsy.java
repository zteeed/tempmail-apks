package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
public final class zzdsy<E> extends mz<E> {
    @NullableDecl

    /* renamed from: d  reason: collision with root package name */
    private Object[] f8554d;

    /* renamed from: e  reason: collision with root package name */
    private int f8555e;

    public zzdsy() {
        super(4);
    }

    public final /* synthetic */ zzdst b(Object obj) {
        zzdsh.b(obj);
        if (this.f8554d != null) {
            int A = zzdsz.A(this.f4617b);
            Object[] objArr = this.f8554d;
            if (A <= objArr.length) {
                int length = objArr.length - 1;
                int hashCode = obj.hashCode();
                int a2 = lz.a(hashCode);
                while (true) {
                    int i = a2 & length;
                    Object[] objArr2 = this.f8554d;
                    Object obj2 = objArr2[i];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            break;
                        }
                        a2 = i + 1;
                    } else {
                        objArr2[i] = obj;
                        this.f8555e += hashCode;
                        super.d(obj);
                        break;
                    }
                }
                return this;
            }
        }
        this.f8554d = null;
        super.d(obj);
        return this;
    }

    public final /* synthetic */ zzdst c(Iterable iterable) {
        zzdsh.b(iterable);
        if (this.f8554d != null) {
            for (Object b2 : iterable) {
                b(b2);
            }
        } else {
            super.c(iterable);
        }
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: com.google.android.gms.internal.ads.wz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: com.google.android.gms.internal.ads.zzdsz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: com.google.android.gms.internal.ads.wz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: com.google.android.gms.internal.ads.wz} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzdsz<E> f() {
        /*
            r8 = this;
            int r0 = r8.f4617b
            if (r0 == 0) goto L_0x0059
            r1 = 1
            if (r0 == r1) goto L_0x004f
            java.lang.Object[] r2 = r8.f8554d
            if (r2 == 0) goto L_0x003b
            int r0 = com.google.android.gms.internal.ads.zzdsz.A(r0)
            java.lang.Object[] r2 = r8.f8554d
            int r2 = r2.length
            if (r0 != r2) goto L_0x003b
            int r0 = r8.f4617b
            java.lang.Object[] r2 = r8.f4616a
            int r2 = r2.length
            boolean r0 = com.google.android.gms.internal.ads.zzdsz.C(r0, r2)
            if (r0 == 0) goto L_0x0028
            java.lang.Object[] r0 = r8.f4616a
            int r2 = r8.f4617b
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            goto L_0x002a
        L_0x0028:
            java.lang.Object[] r0 = r8.f4616a
        L_0x002a:
            r3 = r0
            com.google.android.gms.internal.ads.wz r0 = new com.google.android.gms.internal.ads.wz
            int r4 = r8.f8555e
            java.lang.Object[] r5 = r8.f8554d
            int r2 = r5.length
            int r6 = r2 + -1
            int r7 = r8.f4617b
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x0049
        L_0x003b:
            int r0 = r8.f4617b
            java.lang.Object[] r2 = r8.f4616a
            com.google.android.gms.internal.ads.zzdsz r0 = com.google.android.gms.internal.ads.zzdsz.s(r0, r2)
            int r2 = r0.size()
            r8.f4617b = r2
        L_0x0049:
            r8.f4618c = r1
            r1 = 0
            r8.f8554d = r1
            return r0
        L_0x004f:
            java.lang.Object[] r0 = r8.f4616a
            r1 = 0
            r0 = r0[r1]
            com.google.android.gms.internal.ads.zzdsz r0 = com.google.android.gms.internal.ads.zzdsz.v(r0)
            return r0
        L_0x0059:
            com.google.android.gms.internal.ads.wz<java.lang.Object> r0 = com.google.android.gms.internal.ads.wz.i
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdsy.f():com.google.android.gms.internal.ads.zzdsz");
    }

    zzdsy(int i) {
        super(i);
        this.f8554d = new Object[zzdsz.A(i)];
    }
}
