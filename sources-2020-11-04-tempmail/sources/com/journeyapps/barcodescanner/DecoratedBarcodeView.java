package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.zxing.d;
import com.google.zxing.i;
import com.google.zxing.o;
import com.google.zxing.s.a.c;
import com.google.zxing.s.a.g;
import com.google.zxing.s.a.h;
import com.google.zxing.s.a.k;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DecoratedBarcodeView extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    private BarcodeView f12698b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public ViewfinderView f12699c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f12700d;

    /* renamed from: e  reason: collision with root package name */
    private a f12701e;

    public interface a {
        void a();

        void b();
    }

    private class b implements a {

        /* renamed from: a  reason: collision with root package name */
        private a f12702a;

        public b(a aVar) {
            this.f12702a = aVar;
        }

        public void a(List<o> list) {
            for (o a2 : list) {
                DecoratedBarcodeView.this.f12699c.a(a2);
            }
            this.f12702a.a(list);
        }

        public void b(c cVar) {
            this.f12702a.b(cVar);
        }
    }

    public DecoratedBarcodeView(Context context) {
        super(context);
        d();
    }

    private void d() {
        e((AttributeSet) null);
    }

    private void e(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, k.zxing_view);
        int resourceId = obtainStyledAttributes.getResourceId(k.zxing_view_zxing_scanner_layout, h.zxing_barcode_scanner);
        obtainStyledAttributes.recycle();
        FrameLayout.inflate(getContext(), resourceId, this);
        BarcodeView barcodeView = (BarcodeView) findViewById(g.zxing_barcode_surface);
        this.f12698b = barcodeView;
        if (barcodeView != null) {
            barcodeView.q(attributeSet);
            ViewfinderView viewfinderView = (ViewfinderView) findViewById(g.zxing_viewfinder_view);
            this.f12699c = viewfinderView;
            if (viewfinderView != null) {
                viewfinderView.setCameraPreview(this.f12698b);
                this.f12700d = (TextView) findViewById(g.zxing_status_view);
                return;
            }
            throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.ViewfinderView on provided layout with the id \"zxing_viewfinder_view\".");
        }
        throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.BarcodeView on provided layout with the id \"zxing_barcode_surface\".");
    }

    public void b(a aVar) {
        this.f12698b.I(new b(aVar));
    }

    public void c(a aVar) {
        this.f12698b.J(new b(aVar));
    }

    public void f(Intent intent) {
        int intExtra;
        Set<com.google.zxing.a> a2 = c.a(intent);
        Map<d, Object> a3 = com.google.zxing.s.a.d.a(intent);
        com.journeyapps.barcodescanner.q.d dVar = new com.journeyapps.barcodescanner.q.d();
        if (intent.hasExtra("SCAN_CAMERA_ID") && (intExtra = intent.getIntExtra("SCAN_CAMERA_ID", -1)) >= 0) {
            dVar.i(intExtra);
        }
        String stringExtra = intent.getStringExtra("PROMPT_MESSAGE");
        if (stringExtra != null) {
            setStatusText(stringExtra);
        }
        int intExtra2 = intent.getIntExtra("SCAN_TYPE", 0);
        String stringExtra2 = intent.getStringExtra("CHARACTER_SET");
        new i().f(a3);
        this.f12698b.setCameraSettings(dVar);
        this.f12698b.setDecoderFactory(new i(a2, a3, stringExtra2, intExtra2));
    }

    public void g() {
        this.f12698b.u();
    }

    public BarcodeView getBarcodeView() {
        return (BarcodeView) findViewById(g.zxing_barcode_surface);
    }

    public TextView getStatusView() {
        return this.f12700d;
    }

    public ViewfinderView getViewFinder() {
        return this.f12699c;
    }

    public void h() {
        this.f12698b.v();
    }

    public void i() {
        this.f12698b.y();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 24) {
            setTorchOn();
            return true;
        } else if (i == 25) {
            setTorchOff();
            return true;
        } else if (i == 27 || i == 80) {
            return true;
        } else {
            return super.onKeyDown(i, keyEvent);
        }
    }

    public void setStatusText(String str) {
        TextView textView = this.f12700d;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setTorchListener(a aVar) {
        this.f12701e = aVar;
    }

    public void setTorchOff() {
        this.f12698b.setTorch(false);
        a aVar = this.f12701e;
        if (aVar != null) {
            aVar.a();
        }
    }

    public void setTorchOn() {
        this.f12698b.setTorch(true);
        a aVar = this.f12701e;
        if (aVar != null) {
            aVar.b();
        }
    }

    public DecoratedBarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e(attributeSet);
    }

    public DecoratedBarcodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        e(attributeSet);
    }
}
