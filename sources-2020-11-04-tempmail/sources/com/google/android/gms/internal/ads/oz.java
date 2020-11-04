package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
final class oz extends zzdss<E> {

    /* renamed from: d  reason: collision with root package name */
    private final transient int f4774d;

    /* renamed from: e  reason: collision with root package name */
    private final transient int f4775e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ zzdss f4776f;

    oz(zzdss zzdss, int i, int i2) {
        this.f4776f = zzdss;
        this.f4774d = i;
        this.f4775e = i2;
    }

    /* renamed from: A */
    public final zzdss<E> subList(int i, int i2) {
        zzdsh.f(i, i2, this.f4775e);
        zzdss zzdss = this.f4776f;
        int i3 = this.f4774d;
        return (zzdss) zzdss.subList(i + i3, i2 + i3);
    }

    public final E get(int i) {
        zzdsh.g(i, this.f4775e);
        return this.f4776f.get(i + this.f4774d);
    }

    /* access modifiers changed from: package-private */
    public final Object[] i() {
        return this.f4776f.i();
    }

    /* access modifiers changed from: package-private */
    public final int j() {
        return this.f4776f.j() + this.f4774d;
    }

    /* access modifiers changed from: package-private */
    public final int l() {
        return this.f4776f.j() + this.f4774d + this.f4775e;
    }

    /* access modifiers changed from: package-private */
    public final boolean q() {
        return true;
    }

    public final int size() {
        return this.f4775e;
    }
}
