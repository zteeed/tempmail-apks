package com.google.zxing.y.c;

import com.google.zxing.o;

/* compiled from: QRCodeDecoderMetaData */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f12083a;

    i(boolean z) {
        this.f12083a = z;
    }

    public void a(o[] oVarArr) {
        if (this.f12083a && oVarArr != null && oVarArr.length >= 3) {
            o oVar = oVarArr[0];
            oVarArr[0] = oVarArr[2];
            oVarArr[2] = oVar;
        }
    }
}
