package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
final class xz extends zzdss<Object> {

    /* renamed from: d  reason: collision with root package name */
    private final transient Object[] f5335d;

    /* renamed from: e  reason: collision with root package name */
    private final transient int f5336e;

    /* renamed from: f  reason: collision with root package name */
    private final transient int f5337f;

    xz(Object[] objArr, int i, int i2) {
        this.f5335d = objArr;
        this.f5336e = i;
        this.f5337f = i2;
    }

    public final Object get(int i) {
        zzdsh.g(i, this.f5337f);
        return this.f5335d[(i * 2) + this.f5336e];
    }

    /* access modifiers changed from: package-private */
    public final boolean q() {
        return true;
    }

    public final int size() {
        return this.f5337f;
    }
}
