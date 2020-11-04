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
import com.tempmail.utils.w;
import java.util.Arrays;
import java.util.List;

public class ScanActivity extends f {
    /* access modifiers changed from: private */
    public static final String C = ScanActivity.class.getSimpleName();
    /* access modifiers changed from: private */
    public String A;
    private com.journeyapps.barcodescanner.a B = new a();
    private DecoratedBarcodeView y;
    /* access modifiers changed from: private */
    public b z;

    class a implements com.journeyapps.barcodescanner.a {
        a() {
        }

        public void a(List<o> list) {
        }

        public void b(c cVar) {
            if (cVar.e() != null && !cVar.e().equals(ScanActivity.this.A)) {
                String unused = ScanActivity.this.A = cVar.e();
                ScanActivity.this.z.c();
                String U0 = ScanActivity.C;
                m.b(U0, "result " + cVar.e());
                Uri d2 = u.d(cVar.e());
                String str = null;
                if (d2 != null) {
                    m.b(ScanActivity.C, "uri!=null");
                    String U02 = ScanActivity.C;
                    m.b(U02, "uri " + d2.toString());
                    String U03 = ScanActivity.C;
                    m.b(U03, "uri path" + d2.getPath());
                    String z = e.z(d2);
                    if (z != null) {
                        str = e.E(u.d(z));
                    }
                    String U04 = ScanActivity.C;
                    m.b(U04, "ots " + str);
                } else {
                    m.b(ScanActivity.C, "uri==null");
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

    public void V0() {
        Log.d(C, "before request permission");
        if (shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
            Log.d(C, "shouldShowRequestPermissionRationale");
            requestPermissions(new String[]{"android.permission.CAMERA"}, 4);
            return;
        }
        Log.d(C, "requestPermissions");
        requestPermissions(new String[]{"android.permission.CAMERA"}, 4);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_scan);
        com.tempmail.m.c cVar = (com.tempmail.m.c) f.f(this, R.layout.activity_scan);
        if (!w.v(this)) {
            V0();
        }
        this.y = (DecoratedBarcodeView) findViewById(R.id.barcode_scanner);
        this.y.getBarcodeView().setDecoderFactory(new i(Arrays.asList(new com.google.zxing.a[]{com.google.zxing.a.QR_CODE, com.google.zxing.a.CODE_39})));
        this.y.f(getIntent());
        this.y.b(this.B);
        this.z = new b(this);
        cVar.s.setText(u.a(this, R.string.scan_qr_subtitle, getString(R.string.premium_web_link)));
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.y.onKeyDown(i, keyEvent) || super.onKeyDown(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.y.g();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        String str = C;
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
        this.y.i();
    }

    public void pause(View view) {
        this.y.g();
    }

    public void resume(View view) {
        this.y.i();
    }

    public void triggerScan(View view) {
        this.y.c(this.B);
    }
}
