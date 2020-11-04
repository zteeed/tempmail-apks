package com.google.zxing.r;

import com.google.zxing.o;
import com.google.zxing.t.b;
import com.google.zxing.t.g;

/* compiled from: AztecDetectorResult */
public final class a extends g {

    /* renamed from: c  reason: collision with root package name */
    private final boolean f12248c;

    /* renamed from: d  reason: collision with root package name */
    private final int f12249d;

    /* renamed from: e  reason: collision with root package name */
    private final int f12250e;

    public a(b bVar, o[] oVarArr, boolean z, int i, int i2) {
        super(bVar, oVarArr);
        this.f12248c = z;
        this.f12249d = i;
        this.f12250e = i2;
    }

    public int c() {
        return this.f12249d;
    }

    public int d() {
        return this.f12250e;
    }

    public boolean e() {
        return this.f12248c;
    }
}
