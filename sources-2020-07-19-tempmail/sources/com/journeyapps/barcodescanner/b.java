package com.journeyapps.barcodescanner;

import android.graphics.Bitmap;
import com.google.zxing.WriterException;
import com.google.zxing.a;
import com.google.zxing.j;

/* compiled from: BarcodeEncoder */
public class b {
    public Bitmap a(com.google.zxing.t.b bVar) {
        int n = bVar.n();
        int j = bVar.j();
        int[] iArr = new int[(n * j)];
        for (int i = 0; i < j; i++) {
            int i2 = i * n;
            for (int i3 = 0; i3 < n; i3++) {
                iArr[i2 + i3] = bVar.f(i3, i) ? -16777216 : -1;
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(n, j, Bitmap.Config.ARGB_8888);
        createBitmap.setPixels(iArr, 0, n, 0, 0, n, j);
        return createBitmap;
    }

    public com.google.zxing.t.b b(String str, a aVar, int i, int i2) throws WriterException {
        try {
            return new j().b(str, aVar, i, i2);
        } catch (WriterException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new WriterException((Throwable) e3);
        }
    }

    public Bitmap c(String str, a aVar, int i, int i2) throws WriterException {
        return a(b(str, aVar, i, i2));
    }
}
