package com.journeyapps.barcodescanner.q;

import android.content.Context;
import android.hardware.Camera;
import android.os.Build;
import android.util.Log;
import com.journeyapps.barcodescanner.n;
import com.journeyapps.barcodescanner.o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CameraManager */
public final class c {
    /* access modifiers changed from: private */
    public static final String n = "c";

    /* renamed from: a  reason: collision with root package name */
    private Camera f12779a;

    /* renamed from: b  reason: collision with root package name */
    private Camera.CameraInfo f12780b;

    /* renamed from: c  reason: collision with root package name */
    private a f12781c;

    /* renamed from: d  reason: collision with root package name */
    private com.google.zxing.s.a.a f12782d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f12783e;

    /* renamed from: f  reason: collision with root package name */
    private String f12784f;
    private d g = new d();
    private h h;
    private n i;
    private n j;
    private int k = -1;
    private Context l;
    private final a m;

    /* compiled from: CameraManager */
    private final class a implements Camera.PreviewCallback {

        /* renamed from: a  reason: collision with root package name */
        private k f12785a;

        /* renamed from: b  reason: collision with root package name */
        private n f12786b;

        public a() {
        }

        public void a(k kVar) {
            this.f12785a = kVar;
        }

        public void b(n nVar) {
            this.f12786b = nVar;
        }

        public void onPreviewFrame(byte[] bArr, Camera camera) {
            n nVar = this.f12786b;
            k kVar = this.f12785a;
            if (nVar == null || kVar == null) {
                Log.d(c.n, "Got preview callback, but no handler or resolution available");
                if (kVar != null) {
                    kVar.a(new Exception("No resolution available"));
                }
            } else if (bArr != null) {
                try {
                    byte[] bArr2 = bArr;
                    kVar.b(new o(bArr2, nVar.f12747b, nVar.f12748c, camera.getParameters().getPreviewFormat(), c.this.e()));
                } catch (RuntimeException e2) {
                    Log.e(c.n, "Camera preview failed", e2);
                    kVar.a(e2);
                }
            } else {
                throw new NullPointerException("No preview data received");
            }
        }
    }

    public c(Context context) {
        this.l = context;
        this.m = new a();
    }

    private int b() {
        int i2;
        int c2 = this.h.c();
        int i3 = 0;
        if (c2 != 0) {
            if (c2 == 1) {
                i3 = 90;
            } else if (c2 == 2) {
                i3 = 180;
            } else if (c2 == 3) {
                i3 = 270;
            }
        }
        Camera.CameraInfo cameraInfo = this.f12780b;
        if (cameraInfo.facing == 1) {
            i2 = (360 - ((cameraInfo.orientation + i3) % 360)) % 360;
        } else {
            i2 = ((cameraInfo.orientation - i3) + 360) % 360;
        }
        String str = n;
        Log.i(str, "Camera Display Orientation: " + i2);
        return i2;
    }

    private Camera.Parameters f() {
        Camera.Parameters parameters = this.f12779a.getParameters();
        String str = this.f12784f;
        if (str == null) {
            this.f12784f = parameters.flatten();
        } else {
            parameters.unflatten(str);
        }
        return parameters;
    }

    private static List<n> h(Camera.Parameters parameters) {
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        ArrayList arrayList = new ArrayList();
        if (supportedPreviewSizes == null) {
            Camera.Size previewSize = parameters.getPreviewSize();
            if (previewSize != null) {
                arrayList.add(new n(previewSize.width, previewSize.height));
            }
            return arrayList;
        }
        for (Camera.Size next : supportedPreviewSizes) {
            arrayList.add(new n(next.width, next.height));
        }
        return arrayList;
    }

    private void m(int i2) {
        this.f12779a.setDisplayOrientation(i2);
    }

    private void o(boolean z) {
        Camera.Parameters f2 = f();
        if (f2 == null) {
            Log.w(n, "Device error: no camera parameters are available. Proceeding without configuration.");
            return;
        }
        String str = n;
        Log.i(str, "Initial camera parameters: " + f2.flatten());
        if (z) {
            Log.w(n, "In camera config safe mode -- most settings will not be honored");
        }
        com.google.zxing.s.a.l.a.g(f2, this.g.a(), z);
        if (!z) {
            com.google.zxing.s.a.l.a.k(f2, false);
            if (this.g.h()) {
                com.google.zxing.s.a.l.a.i(f2);
            }
            if (this.g.e()) {
                com.google.zxing.s.a.l.a.c(f2);
            }
            if (this.g.g() && Build.VERSION.SDK_INT >= 15) {
                com.google.zxing.s.a.l.a.l(f2);
                com.google.zxing.s.a.l.a.h(f2);
                com.google.zxing.s.a.l.a.j(f2);
            }
        }
        List<n> h2 = h(f2);
        if (h2.size() == 0) {
            this.i = null;
        } else {
            n a2 = this.h.a(h2, i());
            this.i = a2;
            f2.setPreviewSize(a2.f12747b, a2.f12748c);
        }
        if (Build.DEVICE.equals("glass-1")) {
            com.google.zxing.s.a.l.a.e(f2);
        }
        String str2 = n;
        Log.i(str2, "Final camera parameters: " + f2.flatten());
        this.f12779a.setParameters(f2);
    }

    private void q() {
        try {
            int b2 = b();
            this.k = b2;
            m(b2);
        } catch (Exception unused) {
            Log.w(n, "Failed to set rotation.");
        }
        try {
            o(false);
        } catch (Exception unused2) {
            try {
                o(true);
            } catch (Exception unused3) {
                Log.w(n, "Camera rejected even safe-mode parameters! No configuration");
            }
        }
        Camera.Size previewSize = this.f12779a.getParameters().getPreviewSize();
        if (previewSize == null) {
            this.j = this.i;
        } else {
            this.j = new n(previewSize.width, previewSize.height);
        }
        this.m.b(this.j);
    }

    public void c() {
        Camera camera = this.f12779a;
        if (camera != null) {
            camera.release();
            this.f12779a = null;
        }
    }

    public void d() {
        if (this.f12779a != null) {
            q();
            return;
        }
        throw new RuntimeException("Camera not open");
    }

    public int e() {
        return this.k;
    }

    public n g() {
        if (this.j == null) {
            return null;
        }
        if (i()) {
            return this.j.g();
        }
        return this.j;
    }

    public boolean i() {
        int i2 = this.k;
        if (i2 != -1) {
            return i2 % 180 != 0;
        }
        throw new IllegalStateException("Rotation not calculated yet. Call configure() first.");
    }

    public boolean j() {
        String flashMode;
        Camera.Parameters parameters = this.f12779a.getParameters();
        if (parameters == null || (flashMode = parameters.getFlashMode()) == null) {
            return false;
        }
        if ("on".equals(flashMode) || "torch".equals(flashMode)) {
            return true;
        }
        return false;
    }

    public void k() {
        Camera b2 = com.google.zxing.s.a.l.b.a.b(this.g.b());
        this.f12779a = b2;
        if (b2 != null) {
            int a2 = com.google.zxing.s.a.l.b.a.a(this.g.b());
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            this.f12780b = cameraInfo;
            Camera.getCameraInfo(a2, cameraInfo);
            return;
        }
        throw new RuntimeException("Failed to open camera");
    }

    public void l(k kVar) {
        Camera camera = this.f12779a;
        if (camera != null && this.f12783e) {
            this.m.a(kVar);
            camera.setOneShotPreviewCallback(this.m);
        }
    }

    public void n(d dVar) {
        this.g = dVar;
    }

    public void p(h hVar) {
        this.h = hVar;
    }

    public void r(e eVar) throws IOException {
        eVar.a(this.f12779a);
    }

    public void s(boolean z) {
        if (this.f12779a != null) {
            try {
                if (z != j()) {
                    if (this.f12781c != null) {
                        this.f12781c.j();
                    }
                    Camera.Parameters parameters = this.f12779a.getParameters();
                    com.google.zxing.s.a.l.a.k(parameters, z);
                    if (this.g.f()) {
                        com.google.zxing.s.a.l.a.d(parameters, z);
                    }
                    this.f12779a.setParameters(parameters);
                    if (this.f12781c != null) {
                        this.f12781c.i();
                    }
                }
            } catch (RuntimeException e2) {
                Log.e(n, "Failed to set torch", e2);
            }
        }
    }

    public void t() {
        Camera camera = this.f12779a;
        if (camera != null && !this.f12783e) {
            camera.startPreview();
            this.f12783e = true;
            this.f12781c = new a(this.f12779a, this.g);
            com.google.zxing.s.a.a aVar = new com.google.zxing.s.a.a(this.l, this, this.g);
            this.f12782d = aVar;
            aVar.c();
        }
    }

    public void u() {
        a aVar = this.f12781c;
        if (aVar != null) {
            aVar.j();
            this.f12781c = null;
        }
        com.google.zxing.s.a.a aVar2 = this.f12782d;
        if (aVar2 != null) {
            aVar2.d();
            this.f12782d = null;
        }
        Camera camera = this.f12779a;
        if (camera != null && this.f12783e) {
            camera.stopPreview();
            this.m.a((k) null);
            this.f12783e = false;
        }
    }
}
