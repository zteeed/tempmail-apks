package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
final class rz<E> extends zzdss<E> {

    /* renamed from: f  reason: collision with root package name */
    static final zzdss<Object> f5033f = new rz(new Object[0], 0);

    /* renamed from: d  reason: collision with root package name */
    private final transient Object[] f5034d;

    /* renamed from: e  reason: collision with root package name */
    private final transient int f5035e;

    rz(Object[] objArr, int i) {
        this.f5034d = objArr;
        this.f5035e = i;
    }

    /* access modifiers changed from: package-private */
    public final int c(Object[] objArr, int i) {
        System.arraycopy(this.f5034d, 0, objArr, i, this.f5035e);
        return i + this.f5035e;
    }

    public final E get(int i) {
        zzdsh.g(i, this.f5035e);
        return this.f5034d[i];
    }

    /* access modifiers changed from: package-private */
    public final Object[] i() {
        return this.f5034d;
    }

    /* access modifiers changed from: package-private */
    public final int j() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final int l() {
        return this.f5035e;
    }

    /* access modifiers changed from: package-private */
    public final boolean q() {
        return false;
    }

    public final int size() {
        return this.f5035e;
    }
}
