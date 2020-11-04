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
        int i = nVar.f12747b;
        if (i <= 0 || nVar.f12748c <= 0) {
            return 0.0f;
        }
        float e2 = (1.0f / e((((float) i) * 1.0f) / ((float) nVar2.f12747b))) / e((((float) nVar.f12748c) * 1.0f) / ((float) nVar2.f12748c));
        float e3 = e(((((float) nVar.f12747b) * 1.0f) / ((float) nVar.f12748c)) / ((((float) nVar2.f12747b) * 1.0f) / ((float) nVar2.f12748c)));
        return e2 * (((1.0f / e3) / e3) / e3);
    }

    public Rect d(n nVar, n nVar2) {
        return new Rect(0, 0, nVar2.f12747b, nVar2.f12748c);
    }
}
