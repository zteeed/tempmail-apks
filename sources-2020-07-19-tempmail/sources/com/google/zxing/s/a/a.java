package com.google.zxing.s.a;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import com.journeyapps.barcodescanner.q.c;
import com.journeyapps.barcodescanner.q.d;

/* compiled from: AmbientLightManager */
public final class a implements SensorEventListener {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public c f11740a;

    /* renamed from: b  reason: collision with root package name */
    private d f11741b;

    /* renamed from: c  reason: collision with root package name */
    private Sensor f11742c;

    /* renamed from: d  reason: collision with root package name */
    private Context f11743d;

    /* renamed from: e  reason: collision with root package name */
    private Handler f11744e = new Handler();

    /* renamed from: com.google.zxing.s.a.a$a  reason: collision with other inner class name */
    /* compiled from: AmbientLightManager */
    class C0114a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f11745b;

        C0114a(boolean z) {
            this.f11745b = z;
        }

        public void run() {
            a.this.f11740a.s(this.f11745b);
        }
    }

    public a(Context context, c cVar, d dVar) {
        this.f11743d = context;
        this.f11740a = cVar;
        this.f11741b = dVar;
    }

    private void b(boolean z) {
        this.f11744e.post(new C0114a(z));
    }

    public void c() {
        if (this.f11741b.d()) {
            SensorManager sensorManager = (SensorManager) this.f11743d.getSystemService("sensor");
            Sensor defaultSensor = sensorManager.getDefaultSensor(5);
            this.f11742c = defaultSensor;
            if (defaultSensor != null) {
                sensorManager.registerListener(this, defaultSensor, 3);
            }
        }
    }

    public void d() {
        if (this.f11742c != null) {
            ((SensorManager) this.f11743d.getSystemService("sensor")).unregisterListener(this);
            this.f11742c = null;
        }
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        float f2 = sensorEvent.values[0];
        if (this.f11740a == null) {
            return;
        }
        if (f2 <= 45.0f) {
            b(true);
        } else if (f2 >= 450.0f) {
            b(false);
        }
    }
}
