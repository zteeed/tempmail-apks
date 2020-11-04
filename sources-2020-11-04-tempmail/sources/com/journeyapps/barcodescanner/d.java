package com.journeyapps.barcodescanner;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.google.zxing.n;
import com.google.zxing.o;
import com.google.zxing.s.a.j;
import com.journeyapps.barcodescanner.CameraPreview;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: CaptureManager */
public class d {
    /* access modifiers changed from: private */
    public static final String m = "d";
    private static int n = 250;

    /* renamed from: a  reason: collision with root package name */
    private Activity f12712a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public DecoratedBarcodeView f12713b;

    /* renamed from: c  reason: collision with root package name */
    private int f12714c = -1;

    /* renamed from: d  reason: collision with root package name */
    private boolean f12715d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f12716e = false;

    /* renamed from: f  reason: collision with root package name */
    private com.google.zxing.s.a.e f12717f;
    /* access modifiers changed from: private */
    public com.google.zxing.s.a.b g;
    /* access modifiers changed from: private */
    public Handler h;
    /* access modifiers changed from: private */
    public boolean i = false;
    private a j = new a();
    private final CameraPreview.f k = new b();
    private boolean l = false;

    /* compiled from: CaptureManager */
    class a implements a {

        /* renamed from: com.journeyapps.barcodescanner.d$a$a  reason: collision with other inner class name */
        /* compiled from: CaptureManager */
        class C0118a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ c f12719b;

            C0118a(c cVar) {
                this.f12719b = cVar;
            }

            public void run() {
                d.this.u(this.f12719b);
            }
        }

        a() {
        }

        public void a(List<o> list) {
        }

        public void b(c cVar) {
            d.this.f12713b.g();
            d.this.g.c();
            d.this.h.post(new C0118a(cVar));
        }
    }

    /* compiled from: CaptureManager */
    class b implements CameraPreview.f {
        b() {
        }

        public void a() {
        }

        public void b(Exception exc) {
            d.this.i();
        }

        public void c() {
        }

        public void d() {
            if (d.this.i) {
                Log.d(d.m, "Camera closed; finishing activity");
                d.this.j();
            }
        }

        public void e() {
        }
    }

    /* compiled from: CaptureManager */
    class c implements Runnable {
        c() {
        }

        public void run() {
            Log.d(d.m, "Finishing due to inactivity");
            d.this.j();
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.d$d  reason: collision with other inner class name */
    /* compiled from: CaptureManager */
    class C0119d implements Runnable {
        C0119d() {
        }

        public void run() {
            d.this.v();
        }
    }

    /* compiled from: CaptureManager */
    class e implements DialogInterface.OnClickListener {
        e() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            d.this.j();
        }
    }

    /* compiled from: CaptureManager */
    class f implements DialogInterface.OnCancelListener {
        f() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            d.this.j();
        }
    }

    public d(Activity activity, DecoratedBarcodeView decoratedBarcodeView) {
        this.f12712a = activity;
        this.f12713b = decoratedBarcodeView;
        decoratedBarcodeView.getBarcodeView().i(this.k);
        this.h = new Handler();
        this.f12717f = new com.google.zxing.s.a.e(activity, new c());
        this.g = new com.google.zxing.s.a.b(activity);
    }

    /* access modifiers changed from: private */
    public void j() {
        this.f12712a.finish();
    }

    private String k(c cVar) {
        if (this.f12715d) {
            Bitmap b2 = cVar.b();
            try {
                File createTempFile = File.createTempFile("barcodeimage", ".jpg", this.f12712a.getCacheDir());
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                b2.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.close();
                return createTempFile.getAbsolutePath();
            } catch (IOException e2) {
                String str = m;
                Log.w(str, "Unable to create temporary file and store bitmap! " + e2);
            }
        }
        return null;
    }

    @TargetApi(23)
    private void s() {
        if (androidx.core.content.a.a(this.f12712a, "android.permission.CAMERA") == 0) {
            this.f12713b.i();
        } else if (!this.l) {
            androidx.core.app.a.o(this.f12712a, new String[]{"android.permission.CAMERA"}, n);
            this.l = true;
        }
    }

    public static Intent t(c cVar, String str) {
        Intent intent = new Intent("com.google.zxing.client.android.SCAN");
        intent.addFlags(524288);
        intent.putExtra("SCAN_RESULT", cVar.toString());
        intent.putExtra("SCAN_RESULT_FORMAT", cVar.a().toString());
        byte[] c2 = cVar.c();
        if (c2 != null && c2.length > 0) {
            intent.putExtra("SCAN_RESULT_BYTES", c2);
        }
        Map<n, Object> d2 = cVar.d();
        if (d2 != null) {
            if (d2.containsKey(n.UPC_EAN_EXTENSION)) {
                intent.putExtra("SCAN_RESULT_UPC_EAN_EXTENSION", d2.get(n.UPC_EAN_EXTENSION).toString());
            }
            Number number = (Number) d2.get(n.ORIENTATION);
            if (number != null) {
                intent.putExtra("SCAN_RESULT_ORIENTATION", number.intValue());
            }
            String str2 = (String) d2.get(n.ERROR_CORRECTION_LEVEL);
            if (str2 != null) {
                intent.putExtra("SCAN_RESULT_ERROR_CORRECTION_LEVEL", str2);
            }
            Iterable<byte[]> iterable = (Iterable) d2.get(n.BYTE_SEGMENTS);
            if (iterable != null) {
                int i2 = 0;
                for (byte[] putExtra : iterable) {
                    intent.putExtra("SCAN_RESULT_BYTE_SEGMENTS_" + i2, putExtra);
                    i2++;
                }
            }
        }
        if (str != null) {
            intent.putExtra("SCAN_RESULT_IMAGE_PATH", str);
        }
        return intent;
    }

    /* access modifiers changed from: protected */
    public void g() {
        if (this.f12713b.getBarcodeView().s()) {
            j();
        } else {
            this.i = true;
        }
        this.f12713b.g();
        this.f12717f.d();
    }

    public void h() {
        this.f12713b.c(this.j);
    }

    /* access modifiers changed from: protected */
    public void i() {
        if (!this.f12712a.isFinishing() && !this.f12716e && !this.i) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f12712a);
            builder.setTitle(this.f12712a.getString(j.zxing_app_name));
            builder.setMessage(this.f12712a.getString(j.zxing_msg_camera_framework_bug));
            builder.setPositiveButton(j.zxing_button_ok, new e());
            builder.setOnCancelListener(new f());
            builder.show();
        }
    }

    public void l(Intent intent, Bundle bundle) {
        this.f12712a.getWindow().addFlags(128);
        if (bundle != null) {
            this.f12714c = bundle.getInt("SAVED_ORIENTATION_LOCK", -1);
        }
        if (intent != null) {
            if (intent.getBooleanExtra("SCAN_ORIENTATION_LOCKED", true)) {
                m();
            }
            if ("com.google.zxing.client.android.SCAN".equals(intent.getAction())) {
                this.f12713b.f(intent);
            }
            if (!intent.getBooleanExtra("BEEP_ENABLED", true)) {
                this.g.d(false);
            }
            if (intent.hasExtra("TIMEOUT")) {
                this.h.postDelayed(new C0119d(), intent.getLongExtra("TIMEOUT", 0));
            }
            if (intent.getBooleanExtra("BARCODE_IMAGE_ENABLED", false)) {
                this.f12715d = true;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void m() {
        if (this.f12714c == -1) {
            int rotation = this.f12712a.getWindowManager().getDefaultDisplay().getRotation();
            int i2 = this.f12712a.getResources().getConfiguration().orientation;
            int i3 = 0;
            if (i2 == 2) {
                if (!(rotation == 0 || rotation == 1)) {
                    i3 = 8;
                }
            } else if (i2 == 1) {
                i3 = (rotation == 0 || rotation == 3) ? 1 : 9;
            }
            this.f12714c = i3;
        }
        this.f12712a.setRequestedOrientation(this.f12714c);
    }

    public void n() {
        this.f12716e = true;
        this.f12717f.d();
        this.h.removeCallbacksAndMessages((Object) null);
    }

    public void o() {
        this.f12717f.d();
        this.f12713b.h();
    }

    public void p(int i2, String[] strArr, int[] iArr) {
        if (i2 != n) {
            return;
        }
        if (iArr.length <= 0 || iArr[0] != 0) {
            i();
        } else {
            this.f12713b.i();
        }
    }

    public void q() {
        if (Build.VERSION.SDK_INT >= 23) {
            s();
        } else {
            this.f12713b.i();
        }
        this.f12717f.h();
    }

    public void r(Bundle bundle) {
        bundle.putInt("SAVED_ORIENTATION_LOCK", this.f12714c);
    }

    /* access modifiers changed from: protected */
    public void u(c cVar) {
        this.f12712a.setResult(-1, t(cVar, k(cVar)));
        g();
    }

    /* access modifiers changed from: protected */
    public void v() {
        Intent intent = new Intent("com.google.zxing.client.android.SCAN");
        intent.putExtra("TIMEOUT", true);
        this.f12712a.setResult(0, intent);
        g();
    }
}
