package com.google.zxing.r;

import com.google.zxing.o;
import com.google.zxing.t.b;
import com.google.zxing.t.g;

/* compiled from: AztecDetectorResult */
public final class a extends g {

    /* renamed from: c  reason: collision with root package name */
    private final boolean f11699c;

    /* renamed from: d  reason: collision with root package name */
    private final int f11700d;

    /* renamed from: e  reason: collision with root package name */
    private final int f11701e;

    public a(b bVar, o[] oVarArr, boolean z, int i, int i2) {
        super(bVar, oVarArr);
        this.f11699c = z;
        this.f11700d = i;
        this.f11701e = i2;
    }

    public int c() {
        return this.f11700d;
    }

    public int d() {
        return this.f11701e;
    }

    public boolean e() {
        return this.f11699c;
    }
}
