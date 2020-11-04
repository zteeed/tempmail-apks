package com.tempmail;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Toast;
import androidx.databinding.f;
import com.google.zxing.o;
import com.google.zxing.s.a.b;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import com.journeyapps.barcodescanner.c;
import com.journeyapps.barcodescanner.i;
import com.tempmail.utils.e;
import com.tempmail.utils.m;
import com.tempmail.utils.u;
import com.tempmail.utils.x;
import java.util.Arrays;
import java.util.List;

public class ScanActivity extends h {
    /* access modifiers changed from: private */
    public static final String I = ScanActivity.class.getSimpleName();
    private DecoratedBarcodeView E;
    /* access modifiers changed from: private */
    public b F;
    /* access modifiers changed from: private */
    public String G;
    private com.journeyapps.barcodescanner.a H = new a();

    class a implements com.journeyapps.barcodescanner.a {
        a() {
        }

        public void a(List<o> list) {
        }

        public void b(c cVar) {
            if (cVar.e() != null && !cVar.e().equals(ScanActivity.this.G)) {
                String unused = ScanActivity.this.G = cVar.e();
                ScanActivity.this.F.c();
                String S0 = ScanActivity.I;
                m.b(S0, "result " + cVar.e());
                Uri f2 = u.f(cVar.e());
                String str = null;
                if (f2 != null) {
                    m.b(ScanActivity.I, "uri!=null");
                    String S02 = ScanActivity.I;
                    m.b(S02, "uri " + f2.toString());
                    String S03 = ScanActivity.I;
                    m.b(S03, "uri path" + f2.getPath());
                    String z = e.z(f2);
                    if (z != null) {
                        str = e.F(u.f(z));
                    }
                    String S04 = ScanActivity.I;
                    m.b(S04, "ots " + str);
                } else {
                    m.b(ScanActivity.I, "uri==null");
                }
                if (str != null) {
                    Intent intent = new Intent();
                    intent.putExtra("extra_deep_link_ots", str);
                    ScanActivity.this.setResult(-1, intent);
                    ScanActivity.this.finish();
                    return;
                }
                ScanActivity scanActivity = ScanActivity.this;
                Toast.makeText(ScanActivity.this, u.a(scanActivity, R.string.message_wrong_qr, scanActivity.getString(R.string.premium_web_link)), 1).show();
            }
        }
    }

    public void T0() {
        Log.d(I, "before request permission");
        if (shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
            Log.d(I, "shouldShowRequestPermissionRationale");
            requestPermissions(new String[]{"android.permission.CAMERA"}, 4);
            return;
        }
        Log.d(I, "requestPermissions");
        requestPermissions(new String[]{"android.permission.CAMERA"}, 4);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_scan);
        com.tempmail.n.c cVar = (com.tempmail.n.c) f.f(this, R.layout.activity_scan);
        if (!x.x(this)) {
            T0();
        }
        this.E = (DecoratedBarcodeView) findViewById(R.id.barcode_scanner);
        this.E.getBarcodeView().setDecoderFactory(new i(Arrays.asList(new com.google.zxing.a[]{com.google.zxing.a.QR_CODE, com.google.zxing.a.CODE_39})));
        this.E.f(getIntent());
        this.E.b(this.H);
        this.F = new b(this);
        cVar.s.setText(u.a(this, R.string.scan_qr_subtitle, getString(R.string.premium_web_link)));
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.E.onKeyDown(i, keyEvent) || super.onKeyDown(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.E.g();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        String str = I;
        StringBuilder sb = new StringBuilder();
        sb.append("onRequestPermissionsResult  ");
        sb.append(i);
        sb.append(" granted ");
        sb.append(iArr.length > 0 && iArr[0] == 0);
        Log.d(str, sb.toString());
        if (i != 4) {
            return;
        }
        if (iArr.length <= 0 || iArr[0] != 0) {
            Toast.makeText(this, R.string.camera_permission_denied_tip, 1).show();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.E.i();
    }

    public void pause(View view) {
        this.E.g();
    }

    public void resume(View view) {
        this.E.i();
    }

    public void triggerScan(View view) {
        this.E.c(this.H);
    }
}
