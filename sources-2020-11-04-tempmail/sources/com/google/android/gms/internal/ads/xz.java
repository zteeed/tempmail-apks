package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
final class xz extends zzdss<Object> {

    /* renamed from: d  reason: collision with root package name */
    private final transient Object[] f5518d;

    /* renamed from: e  reason: collision with root package name */
    private final transient int f5519e;

    /* renamed from: f  reason: collision with root package name */
    private final transient int f5520f;

    xz(Object[] objArr, int i, int i2) {
        this.f5518d = objArr;
        this.f5519e = i;
        this.f5520f = i2;
    }

    public final Object get(int i) {
        zzdsh.g(i, this.f5520f);
        return this.f5518d[(i * 2) + this.f5519e];
    }

    /* access modifiers changed from: package-private */
    public final boolean q() {
        return true;
    }

    public final int size() {
        return this.f5520f;
    }
}
