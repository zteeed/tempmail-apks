package com.journeyapps.barcodescanner.q;

import android.graphics.Rect;
import android.util.Log;
import com.journeyapps.barcodescanner.n;

/* compiled from: FitCenterStrategy */
public class i extends l {

    /* renamed from: b  reason: collision with root package name */
    private static final String f12261b = "i";

    /* access modifiers changed from: protected */
    public float c(n nVar, n nVar2) {
        if (nVar.f12198b <= 0 || nVar.f12199c <= 0) {
            return 0.0f;
        }
        n k = nVar.k(nVar2);
        float f2 = (((float) k.f12198b) * 1.0f) / ((float) nVar.f12198b);
        if (f2 > 1.0f) {
            f2 = (float) Math.pow((double) (1.0f / f2), 1.1d);
        }
        float f3 = ((((float) nVar2.f12198b) * 1.0f) / ((float) k.f12198b)) * ((((float) nVar2.f12199c) * 1.0f) / ((float) k.f12199c));
        return f2 * (((1.0f / f3) / f3) / f3);
    }

    public Rect d(n nVar, n nVar2) {
        n k = nVar.k(nVar2);
        String str = f12261b;
        Log.i(str, "Preview: " + nVar + "; Scaled: " + k + "; Want: " + nVar2);
        int i = (k.f12198b - nVar2.f12198b) / 2;
        int i2 = (k.f12199c - nVar2.f12199c) / 2;
        return new Rect(-i, -i2, k.f12198b - i, k.f12199c - i2);
    }
}
