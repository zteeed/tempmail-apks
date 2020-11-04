package com.journeyapps.barcodescanner;

import com.google.zxing.c;
import com.google.zxing.h;
import com.google.zxing.l;
import com.google.zxing.t.j;

/* compiled from: MixedDecoder */
public class k extends e {

    /* renamed from: c  reason: collision with root package name */
    private boolean f12192c = true;

    public k(l lVar) {
        super(lVar);
    }

    /* access modifiers changed from: protected */
    public c e(h hVar) {
        if (this.f12192c) {
            this.f12192c = false;
            return new c(new j(hVar.e()));
        }
        this.f12192c = true;
        return new c(new j(hVar));
    }
}
