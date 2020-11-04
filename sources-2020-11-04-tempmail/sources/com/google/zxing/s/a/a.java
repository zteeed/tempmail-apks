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
    public c f12289a;

    /* renamed from: b  reason: collision with root package name */
    private d f12290b;

    /* renamed from: c  reason: collision with root package name */
    private Sensor f12291c;

    /* renamed from: d  reason: collision with root package name */
    private Context f12292d;

    /* renamed from: e  reason: collision with root package name */
    private Handler f12293e = new Handler();

    /* renamed from: com.google.zxing.s.a.a$a  reason: collision with other inner class name */
    /* compiled from: AmbientLightManager */
    class C0114a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f12294b;

        C0114a(boolean z) {
            this.f12294b = z;
        }

        public void run() {
            a.this.f12289a.s(this.f12294b);
        }
    }

    public a(Context context, c cVar, d dVar) {
        this.f12292d = context;
        this.f12289a = cVar;
        this.f12290b = dVar;
    }

    private void b(boolean z) {
        this.f12293e.post(new C0114a(z));
    }

    public void c() {
        if (this.f12290b.d()) {
            SensorManager sensorManager = (SensorManager) this.f12292d.getSystemService("sensor");
            Sensor defaultSensor = sensorManager.getDefaultSensor(5);
            this.f12291c = defaultSensor;
            if (defaultSensor != null) {
                sensorManager.registerListener(this, defaultSensor, 3);
            }
        }
    }

    public void d() {
        if (this.f12291c != null) {
            ((SensorManager) this.f12292d.getSystemService("sensor")).unregisterListener(this);
            this.f12291c = null;
        }
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        float f2 = sensorEvent.values[0];
        if (this.f12289a == null) {
            return;
        }
        if (f2 <= 45.0f) {
            b(true);
        } else if (f2 >= 450.0f) {
            b(false);
        }
    }
}
