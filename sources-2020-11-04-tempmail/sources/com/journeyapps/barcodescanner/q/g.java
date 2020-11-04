package com.journeyapps.barcodescanner.q;

import android.graphics.Rect;
import android.util.Log;
import com.journeyapps.barcodescanner.n;

/* compiled from: CenterCropStrategy */
public class g extends l {

    /* renamed from: b  reason: collision with root package name */
    private static final String f12806b = "g";

    /* access modifiers changed from: protected */
    public float c(n nVar, n nVar2) {
        if (nVar.f12747b <= 0 || nVar.f12748c <= 0) {
            return 0.0f;
        }
        n h = nVar.h(nVar2);
        float f2 = (((float) h.f12747b) * 1.0f) / ((float) nVar.f12747b);
        if (f2 > 1.0f) {
            f2 = (float) Math.pow((double) (1.0f / f2), 1.1d);
        }
        float f3 = ((((float) h.f12747b) * 1.0f) / ((float) nVar2.f12747b)) + ((((float) h.f12748c) * 1.0f) / ((float) nVar2.f12748c));
        return f2 * ((1.0f / f3) / f3);
    }

    public Rect d(n nVar, n nVar2) {
        n h = nVar.h(nVar2);
        String str = f12806b;
        Log.i(str, "Preview: " + nVar + "; Scaled: " + h + "; Want: " + nVar2);
        int i = (h.f12747b - nVar2.f12747b) / 2;
        int i2 = (h.f12748c - nVar2.f12748c) / 2;
        return new Rect(-i, -i2, h.f12747b - i, h.f12748c - i2);
    }
}
