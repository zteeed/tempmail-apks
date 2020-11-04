package com.journeyapps.barcodescanner;

import android.graphics.Bitmap;
import com.google.zxing.a;
import com.google.zxing.m;
import com.google.zxing.n;
import java.util.Map;

/* compiled from: BarcodeResult */
public class c {

    /* renamed from: a  reason: collision with root package name */
    protected m f12161a;

    /* renamed from: b  reason: collision with root package name */
    protected o f12162b;

    public c(m mVar, o oVar) {
        this.f12161a = mVar;
        this.f12162b = oVar;
    }

    public a a() {
        return this.f12161a.b();
    }

    public Bitmap b() {
        return this.f12162b.b(2);
    }

    public byte[] c() {
        return this.f12161a.c();
    }

    public Map<n, Object> d() {
        return this.f12161a.d();
    }

    public String e() {
        return this.f12161a.f();
    }

    public String toString() {
        return this.f12161a.f();
    }
}
