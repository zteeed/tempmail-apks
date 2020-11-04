package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class p7 implements SensorEventListener {

    /* renamed from: a  reason: collision with root package name */
    private final SensorManager f4615a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f4616b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final Display f4617c;

    /* renamed from: d  reason: collision with root package name */
    private final float[] f4618d = new float[9];

    /* renamed from: e  reason: collision with root package name */
    private final float[] f4619e = new float[9];
    @GuardedBy("sensorThreadLock")

    /* renamed from: f  reason: collision with root package name */
    private float[] f4620f;
    private Handler g;
    private q7 h;

    p7(Context context) {
        this.f4615a = (SensorManager) context.getSystemService("sensor");
        this.f4617c = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    private final void e(int i, int i2) {
        float[] fArr = this.f4619e;
        float f2 = fArr[i];
        fArr[i] = fArr[i2];
        fArr[i2] = f2;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (this.g == null) {
            Sensor defaultSensor = this.f4615a.getDefaultSensor(11);
            if (defaultSensor == null) {
                zzbba.g("No Sensor of TYPE_ROTATION_VECTOR");
                return;
            }
            HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
            handlerThread.start();
            zzdrr zzdrr = new zzdrr(handlerThread.getLooper());
            this.g = zzdrr;
            if (!this.f4615a.registerListener(this, defaultSensor, 0, zzdrr)) {
                zzbba.g("SensorManager.registerListener failed.");
                b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        if (this.g != null) {
            this.f4615a.unregisterListener(this);
            this.g.post(new o7(this));
            this.g = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(q7 q7Var) {
        this.h = q7Var;
    }

    /* access modifiers changed from: package-private */
    public final boolean d(float[] fArr) {
        synchronized (this.f4616b) {
            if (this.f4620f == null) {
                return false;
            }
            System.arraycopy(this.f4620f, 0, fArr, 0, this.f4620f.length);
            return true;
        }
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] != 0.0f || fArr[1] != 0.0f || fArr[2] != 0.0f) {
            synchronized (this.f4616b) {
                if (this.f4620f == null) {
                    this.f4620f = new float[9];
                }
            }
            SensorManager.getRotationMatrixFromVector(this.f4618d, fArr);
            int rotation = this.f4617c.getRotation();
            if (rotation == 1) {
                SensorManager.remapCoordinateSystem(this.f4618d, 2, 129, this.f4619e);
            } else if (rotation == 2) {
                SensorManager.remapCoordinateSystem(this.f4618d, 129, 130, this.f4619e);
            } else if (rotation != 3) {
                System.arraycopy(this.f4618d, 0, this.f4619e, 0, 9);
            } else {
                SensorManager.remapCoordinateSystem(this.f4618d, 130, 1, this.f4619e);
            }
            e(1, 3);
            e(2, 6);
            e(5, 7);
            synchronized (this.f4616b) {
                System.arraycopy(this.f4619e, 0, this.f4620f, 0, 9);
            }
            q7 q7Var = this.h;
            if (q7Var != null) {
                q7Var.a();
            }
        }
    }
}
