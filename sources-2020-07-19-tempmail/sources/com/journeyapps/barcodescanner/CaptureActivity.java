package com.journeyapps.barcodescanner;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import com.google.zxing.s.a.g;
import com.google.zxing.s.a.h;

public class CaptureActivity extends Activity {

    /* renamed from: b  reason: collision with root package name */
    private d f12147b;

    /* renamed from: c  reason: collision with root package name */
    private DecoratedBarcodeView f12148c;

    /* access modifiers changed from: protected */
    public DecoratedBarcodeView a() {
        setContentView(h.zxing_capture);
        return (DecoratedBarcodeView) findViewById(g.zxing_barcode_scanner);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f12148c = a();
        d dVar = new d(this, this.f12148c);
        this.f12147b = dVar;
        dVar.l(getIntent(), bundle);
        this.f12147b.h();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f12147b.n();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.f12148c.onKeyDown(i, keyEvent) || super.onKeyDown(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f12147b.o();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f12147b.p(i, strArr, iArr);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f12147b.q();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f12147b.r(bundle);
    }
}
