package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
final class wz<E> extends zzdsz<E> {
    static final wz<Object> i = new wz(new Object[0], 0, (Object[]) null, 0, 0);

    /* renamed from: d  reason: collision with root package name */
    private final transient Object[] f5266d;

    /* renamed from: e  reason: collision with root package name */
    private final transient Object[] f5267e;

    /* renamed from: f  reason: collision with root package name */
    private final transient int f5268f;
    private final transient int g;
    private final transient int h;

    wz(Object[] objArr, int i2, Object[] objArr2, int i3, int i4) {
        this.f5266d = objArr;
        this.f5267e = objArr2;
        this.f5268f = i3;
        this.g = i2;
        this.h = i4;
    }

    /* access modifiers changed from: package-private */
    public final int c(Object[] objArr, int i2) {
        System.arraycopy(this.f5266d, 0, objArr, i2, this.h);
        return i2 + this.h;
    }

    public final boolean contains(@NullableDecl Object obj) {
        int i2;
        Object[] objArr = this.f5267e;
        if (obj == null || objArr == null) {
            return false;
        }
        if (obj == null) {
            i2 = 0;
        } else {
            i2 = obj.hashCode();
        }
        int a2 = lz.a(i2);
        while (true) {
            int i3 = a2 & this.f5268f;
            Object obj2 = objArr[i3];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            a2 = i3 + 1;
        }
    }

    /* renamed from: h */
    public final zzdtn<E> iterator() {
        return (zzdtn) m().iterator();
    }

    public final int hashCode() {
        return this.g;
    }

    /* access modifiers changed from: package-private */
    public final Object[] i() {
        return this.f5266d;
    }

    /* access modifiers changed from: package-private */
    public final int j() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final int l() {
        return this.h;
    }

    /* access modifiers changed from: package-private */
    public final boolean q() {
        return false;
    }

    public final int size() {
        return this.h;
    }

    /* access modifiers changed from: package-private */
    public final boolean w() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final zzdss<E> y() {
        return zzdss.w(this.f5266d, this.h);
    }
}
