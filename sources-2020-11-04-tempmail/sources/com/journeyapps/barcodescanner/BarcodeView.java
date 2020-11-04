package com.journeyapps.barcodescanner;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import com.google.zxing.d;
import com.google.zxing.s.a.g;
import java.util.HashMap;
import java.util.List;

public class BarcodeView extends CameraPreview {
    /* access modifiers changed from: private */
    public b C = b.NONE;
    /* access modifiers changed from: private */
    public a D = null;
    private h E;
    private f F;
    private Handler G;
    private final Handler.Callback H = new a();

    class a implements Handler.Callback {
        a() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == g.zxing_decode_succeeded) {
                c cVar = (c) message.obj;
                if (!(cVar == null || BarcodeView.this.D == null || BarcodeView.this.C == b.NONE)) {
                    BarcodeView.this.D.b(cVar);
                    if (BarcodeView.this.C == b.SINGLE) {
                        BarcodeView.this.N();
                    }
                }
                return true;
            } else if (i == g.zxing_decode_failed) {
                return true;
            } else {
                if (i != g.zxing_possible_result_points) {
                    return false;
                }
                List list = (List) message.obj;
                if (!(BarcodeView.this.D == null || BarcodeView.this.C == b.NONE)) {
                    BarcodeView.this.D.a(list);
                }
                return true;
            }
        }
    }

    private enum b {
        NONE,
        SINGLE,
        CONTINUOUS
    }

    public BarcodeView(Context context) {
        super(context);
        K();
    }

    private e G() {
        if (this.F == null) {
            this.F = H();
        }
        g gVar = new g();
        HashMap hashMap = new HashMap();
        hashMap.put(d.NEED_RESULT_POINT_CALLBACK, gVar);
        e a2 = this.F.a(hashMap);
        gVar.b(a2);
        return a2;
    }

    private void K() {
        this.F = new i();
        this.G = new Handler(this.H);
    }

    private void L() {
        M();
        if (this.C != b.NONE && t()) {
            h hVar = new h(getCameraInstance(), G(), this.G);
            this.E = hVar;
            hVar.i(getPreviewFramingRect());
            this.E.k();
        }
    }

    private void M() {
        h hVar = this.E;
        if (hVar != null) {
            hVar.l();
            this.E = null;
        }
    }

    /* access modifiers changed from: protected */
    public f H() {
        return new i();
    }

    public void I(a aVar) {
        this.C = b.CONTINUOUS;
        this.D = aVar;
        L();
    }

    public void J(a aVar) {
        this.C = b.SINGLE;
        this.D = aVar;
        L();
    }

    public void N() {
        this.C = b.NONE;
        this.D = null;
        M();
    }

    public f getDecoderFactory() {
        return this.F;
    }

    public void setDecoderFactory(f fVar) {
        p.a();
        this.F = fVar;
        h hVar = this.E;
        if (hVar != null) {
            hVar.j(G());
        }
    }

    public void u() {
        M();
        super.u();
    }

    /* access modifiers changed from: protected */
    public void x() {
        super.x();
        L();
    }

    public BarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        K();
    }

    public BarcodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        K();
    }
}
