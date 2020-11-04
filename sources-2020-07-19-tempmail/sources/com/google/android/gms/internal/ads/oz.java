package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
final class oz extends zzdss<E> {

    /* renamed from: d  reason: collision with root package name */
    private final transient int f4591d;

    /* renamed from: e  reason: collision with root package name */
    private final transient int f4592e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ zzdss f4593f;

    oz(zzdss zzdss, int i, int i2) {
        this.f4593f = zzdss;
        this.f4591d = i;
        this.f4592e = i2;
    }

    /* renamed from: A */
    public final zzdss<E> subList(int i, int i2) {
        zzdsh.f(i, i2, this.f4592e);
        zzdss zzdss = this.f4593f;
        int i3 = this.f4591d;
        return (zzdss) zzdss.subList(i + i3, i2 + i3);
    }

    public final E get(int i) {
        zzdsh.g(i, this.f4592e);
        return this.f4593f.get(i + this.f4591d);
    }

    /* access modifiers changed from: package-private */
    public final Object[] i() {
        return this.f4593f.i();
    }

    /* access modifiers changed from: package-private */
    public final int j() {
        return this.f4593f.j() + this.f4591d;
    }

    /* access modifiers changed from: package-private */
    public final int l() {
        return this.f4593f.j() + this.f4591d + this.f4592e;
    }

    /* access modifiers changed from: package-private */
    public final boolean q() {
        return true;
    }

    public final int size() {
        return this.f4592e;
    }
}
