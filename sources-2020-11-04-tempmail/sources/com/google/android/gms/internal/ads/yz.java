package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
final class yz<E> extends zzdsz<E> {

    /* renamed from: d  reason: collision with root package name */
    private final transient E f5607d;

    /* renamed from: e  reason: collision with root package name */
    private transient int f5608e;

    yz(E e2) {
        zzdsh.b(e2);
        this.f5607d = e2;
    }

    /* access modifiers changed from: package-private */
    public final int c(Object[] objArr, int i) {
        objArr[i] = this.f5607d;
        return i + 1;
    }

    public final boolean contains(Object obj) {
        return this.f5607d.equals(obj);
    }

    /* renamed from: h */
    public final zzdtn<E> iterator() {
        return new qz(this.f5607d);
    }

    public final int hashCode() {
        int i = this.f5608e;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f5607d.hashCode();
        this.f5608e = hashCode;
        return hashCode;
    }

    /* access modifiers changed from: package-private */
    public final boolean q() {
        return false;
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        String obj = this.f5607d.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final boolean w() {
        return this.f5608e != 0;
    }

    /* access modifiers changed from: package-private */
    public final zzdss<E> y() {
        return zzdss.s(this.f5607d);
    }

    yz(E e2, int i) {
        this.f5607d = e2;
        this.f5608e = i;
    }
}
