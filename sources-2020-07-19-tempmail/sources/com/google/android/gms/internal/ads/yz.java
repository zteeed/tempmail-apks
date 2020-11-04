package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
final class yz<E> extends zzdsz<E> {

    /* renamed from: d  reason: collision with root package name */
    private final transient E f5424d;

    /* renamed from: e  reason: collision with root package name */
    private transient int f5425e;

    yz(E e2) {
        zzdsh.b(e2);
        this.f5424d = e2;
    }

    /* access modifiers changed from: package-private */
    public final int c(Object[] objArr, int i) {
        objArr[i] = this.f5424d;
        return i + 1;
    }

    public final boolean contains(Object obj) {
        return this.f5424d.equals(obj);
    }

    /* renamed from: h */
    public final zzdtn<E> iterator() {
        return new qz(this.f5424d);
    }

    public final int hashCode() {
        int i = this.f5425e;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f5424d.hashCode();
        this.f5425e = hashCode;
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
        String obj = this.f5424d.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final boolean w() {
        return this.f5425e != 0;
    }

    /* access modifiers changed from: package-private */
    public final zzdss<E> y() {
        return zzdss.s(this.f5424d);
    }

    yz(E e2, int i) {
        this.f5424d = e2;
        this.f5425e = i;
    }
}
