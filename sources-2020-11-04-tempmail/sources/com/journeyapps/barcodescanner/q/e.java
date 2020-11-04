package com.journeyapps.barcodescanner.q;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.view.SurfaceHolder;
import java.io.IOException;

/* compiled from: CameraSurface */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private SurfaceHolder f12799a;

    /* renamed from: b  reason: collision with root package name */
    private SurfaceTexture f12800b;

    public e(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != null) {
            this.f12799a = surfaceHolder;
            return;
        }
        throw new IllegalArgumentException("surfaceHolder may not be null");
    }

    public void a(Camera camera) throws IOException {
        SurfaceHolder surfaceHolder = this.f12799a;
        if (surfaceHolder != null) {
            camera.setPreviewDisplay(surfaceHolder);
        } else {
            camera.setPreviewTexture(this.f12800b);
        }
    }

    public e(SurfaceTexture surfaceTexture) {
        if (surfaceTexture != null) {
            this.f12800b = surfaceTexture;
            return;
        }
        throw new IllegalArgumentException("surfaceTexture may not be null");
    }
}
