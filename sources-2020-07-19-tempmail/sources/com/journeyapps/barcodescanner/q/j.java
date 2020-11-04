package com.journeyapps.barcodescanner.q;

import android.graphics.Rect;
import com.journeyapps.barcodescanner.n;

/* compiled from: FitXYStrategy */
public class j extends l {
    private static float e(float f2) {
        return f2 < 1.0f ? 1.0f / f2 : f2;
    }

    /* access modifiers changed from: protected */
    public float c(n nVar, n nVar2) {
        int i = nVar.f12198b;
        if (i <= 0 || nVar.f12199c <= 0) {
            return 0.0f;
        }
        float e2 = (1.0f / e((((float) i) * 1.0f) / ((float) nVar2.f12198b))) / e((((float) nVar.f12199c) * 1.0f) / ((float) nVar2.f12199c));
        float e3 = e(((((float) nVar.f12198b) * 1.0f) / ((float) nVar.f12199c)) / ((((float) nVar2.f12198b) * 1.0f) / ((float) nVar2.f12199c)));
        return e2 * (((1.0f / e3) / e3) / e3);
    }

    public Rect d(n nVar, n nVar2) {
        return new Rect(0, 0, nVar2.f12198b, nVar2.f12199c);
    }
}
