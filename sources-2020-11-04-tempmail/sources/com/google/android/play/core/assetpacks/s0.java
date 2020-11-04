package com.google.android.play.core.assetpacks;

import java.io.InputStream;

final class s0 extends o1 {

    /* renamed from: c  reason: collision with root package name */
    final int f11384c;

    /* renamed from: d  reason: collision with root package name */
    final long f11385d;

    /* renamed from: e  reason: collision with root package name */
    final String f11386e;

    /* renamed from: f  reason: collision with root package name */
    final int f11387f;
    final int g;
    final int h;
    final long i;
    final int j;
    final InputStream k;

    s0(int i2, String str, int i3, long j2, String str2, int i4, int i5, int i6, long j3, int i7, InputStream inputStream) {
        super(i2, str);
        this.f11384c = i3;
        this.f11385d = j2;
        this.f11386e = str2;
        this.f11387f = i4;
        this.g = i5;
        this.h = i6;
        this.i = j3;
        this.j = i7;
        this.k = inputStream;
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        return this.g + 1 == this.h;
    }
}
