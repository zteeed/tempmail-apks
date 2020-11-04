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
    private final SensorManager f4798a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f4799b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final Display f4800c;

    /* renamed from: d  reason: collision with root package name */
    private final float[] f4801d = new float[9];

    /* renamed from: e  reason: collision with root package name */
    private final float[] f4802e = new float[9];
    @GuardedBy("sensorThreadLock")

    /* renamed from: f  reason: collision with root package name */
    private float[] f4803f;
    private Handler g;
    private q7 h;

    p7(Context context) {
        this.f4798a = (SensorManager) context.getSystemService("sensor");
        this.f4800c = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    private final void e(int i, int i2) {
        float[] fArr = this.f4802e;
        float f2 = fArr[i];
        fArr[i] = fArr[i2];
        fArr[i2] = f2;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (this.g == null) {
            Sensor defaultSensor = this.f4798a.getDefaultSensor(11);
            if (defaultSensor == null) {
                zzbba.g("No Sensor of TYPE_ROTATION_VECTOR");
                return;
            }
            HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
            handlerThread.start();
            zzdrr zzdrr = new zzdrr(handlerThread.getLooper());
            this.g = zzdrr;
            if (!this.f4798a.registerListener(this, defaultSensor, 0, zzdrr)) {
                zzbba.g("SensorManager.registerListener failed.");
                b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        if (this.g != null) {
            this.f4798a.unregisterListener(this);
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
        synchronized (this.f4799b) {
            if (this.f4803f == null) {
                return false;
            }
            System.arraycopy(this.f4803f, 0, fArr, 0, this.f4803f.length);
            return true;
        }
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] != 0.0f || fArr[1] != 0.0f || fArr[2] != 0.0f) {
            synchronized (this.f4799b) {
                if (this.f4803f == null) {
                    this.f4803f = new float[9];
                }
            }
            SensorManager.getRotationMatrixFromVector(this.f4801d, fArr);
            int rotation = this.f4800c.getRotation();
            if (rotation == 1) {
                SensorManager.remapCoordinateSystem(this.f4801d, 2, 129, this.f4802e);
            } else if (rotation == 2) {
                SensorManager.remapCoordinateSystem(this.f4801d, 129, 130, this.f4802e);
            } else if (rotation != 3) {
                System.arraycopy(this.f4801d, 0, this.f4802e, 0, 9);
            } else {
                SensorManager.remapCoordinateSystem(this.f4801d, 130, 1, this.f4802e);
            }
            e(1, 3);
            e(2, 6);
            e(5, 7);
            synchronized (this.f4799b) {
                System.arraycopy(this.f4802e, 0, this.f4803f, 0, 9);
            }
            q7 q7Var = this.h;
            if (q7Var != null) {
                q7Var.a();
            }
        }
    }
}
