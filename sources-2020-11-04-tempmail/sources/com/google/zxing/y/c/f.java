package com.google.zxing.y.c;

/* compiled from: ErrorCorrectionLevel */
public enum f {
    L(1),
    M(0),
    Q(3),
    H(2);
    
    private static final f[] g = null;

    /* renamed from: b  reason: collision with root package name */
    private final int f12623b;

    static {
        f fVar;
        f fVar2;
        f fVar3;
        f fVar4;
        g = new f[]{fVar3, fVar2, fVar, fVar4};
    }

    private f(int i) {
        this.f12623b = i;
    }

    public static f f(int i) {
        if (i >= 0) {
            f[] fVarArr = g;
            if (i < fVarArr.length) {
                return fVarArr[i];
            }
        }
        throw new IllegalArgumentException();
    }

    public int g() {
        return this.f12623b;
    }
}
