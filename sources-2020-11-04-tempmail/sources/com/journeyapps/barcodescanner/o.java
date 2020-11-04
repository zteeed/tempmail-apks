package com.journeyapps.barcodescanner;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import com.google.zxing.k;
import com.tempmail.utils.x;
import java.io.ByteArrayOutputStream;

/* compiled from: SourceData */
public class o {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f12749a;

    /* renamed from: b  reason: collision with root package name */
    private int f12750b;

    /* renamed from: c  reason: collision with root package name */
    private int f12751c;

    /* renamed from: d  reason: collision with root package name */
    private int f12752d;

    /* renamed from: e  reason: collision with root package name */
    private int f12753e;

    /* renamed from: f  reason: collision with root package name */
    private Rect f12754f;

    public o(byte[] bArr, int i, int i2, int i3, int i4) {
        this.f12749a = bArr;
        this.f12750b = i;
        this.f12751c = i2;
        this.f12753e = i4;
        this.f12752d = i3;
        if (i * i2 > bArr.length) {
            throw new IllegalArgumentException("Image data does not match the resolution. " + i + x.f13134a + i2 + " > " + bArr.length);
        }
    }

    private Bitmap c(Rect rect, int i) {
        if (d()) {
            rect = new Rect(rect.top, rect.left, rect.bottom, rect.right);
        }
        YuvImage yuvImage = new YuvImage(this.f12749a, this.f12752d, this.f12750b, this.f12751c, (int[]) null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(rect, 90, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = i;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
        if (this.f12753e == 0) {
            return decodeByteArray;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate((float) this.f12753e);
        return Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, false);
    }

    public static byte[] e(byte[] bArr, int i, int i2) {
        int i3 = i * i2;
        byte[] bArr2 = new byte[i3];
        int i4 = i3 - 1;
        for (int i5 = 0; i5 < i3; i5++) {
            bArr2[i4] = bArr[i5];
            i4--;
        }
        return bArr2;
    }

    public static byte[] f(byte[] bArr, int i, int i2) {
        int i3 = i * i2;
        byte[] bArr2 = new byte[i3];
        int i4 = i3 - 1;
        for (int i5 = 0; i5 < i; i5++) {
            for (int i6 = i2 - 1; i6 >= 0; i6--) {
                bArr2[i4] = bArr[(i6 * i) + i5];
                i4--;
            }
        }
        return bArr2;
    }

    public static byte[] g(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[(i * i2)];
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            for (int i5 = i2 - 1; i5 >= 0; i5--) {
                bArr2[i3] = bArr[(i5 * i) + i4];
                i3++;
            }
        }
        return bArr2;
    }

    public static byte[] h(int i, byte[] bArr, int i2, int i3) {
        if (i == 90) {
            return g(bArr, i2, i3);
        }
        if (i != 180) {
            return i != 270 ? bArr : f(bArr, i2, i3);
        }
        return e(bArr, i2, i3);
    }

    public k a() {
        byte[] h = h(this.f12753e, this.f12749a, this.f12750b, this.f12751c);
        if (d()) {
            int i = this.f12751c;
            int i2 = this.f12750b;
            Rect rect = this.f12754f;
            return new k(h, i, i2, rect.left, rect.top, rect.width(), this.f12754f.height(), false);
        }
        int i3 = this.f12750b;
        int i4 = this.f12751c;
        Rect rect2 = this.f12754f;
        return new k(h, i3, i4, rect2.left, rect2.top, rect2.width(), this.f12754f.height(), false);
    }

    public Bitmap b(int i) {
        return c(this.f12754f, i);
    }

    public boolean d() {
        return this.f12753e % 180 != 0;
    }

    public void i(Rect rect) {
        this.f12754f = rect;
    }
}
