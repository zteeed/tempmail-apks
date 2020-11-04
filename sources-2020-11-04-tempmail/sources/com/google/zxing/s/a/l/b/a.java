package com.google.zxing.s.a.l.b;

import android.hardware.Camera;
import android.util.Log;

/* compiled from: OpenCameraInterface */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f12316a = "com.google.zxing.s.a.l.b.a";

    public static int a(int i) {
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras == 0) {
            Log.w(f12316a, "No cameras!");
            return -1;
        }
        boolean z = i >= 0;
        if (!z) {
            i = 0;
            while (i < numberOfCameras) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i, cameraInfo);
                if (cameraInfo.facing == 0) {
                    break;
                }
                i++;
            }
        }
        if (i < numberOfCameras) {
            return i;
        }
        if (z) {
            return -1;
        }
        return 0;
    }

    public static Camera b(int i) {
        int a2 = a(i);
        if (a2 == -1) {
            return null;
        }
        return Camera.open(a2);
    }
}
