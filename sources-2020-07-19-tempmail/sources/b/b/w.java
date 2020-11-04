package b.b;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class w implements SensorEventListener {

    /* renamed from: a  reason: collision with root package name */
    private final int f2084a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2085b;

    /* renamed from: c  reason: collision with root package name */
    private final String f2086c;

    /* renamed from: d  reason: collision with root package name */
    private final float[][] f2087d = new float[2][];

    /* renamed from: e  reason: collision with root package name */
    private final long[] f2088e = new long[2];

    /* renamed from: f  reason: collision with root package name */
    private final int f2089f;
    private double g;
    private long h;

    private w(int i, String str, String str2) {
        this.f2084a = i;
        this.f2085b = str == null ? "" : str;
        str2 = str2 == null ? "" : str2;
        this.f2086c = str2;
        this.f2089f = ((((i + 31) * 31) + this.f2085b.hashCode()) * 31) + str2.hashCode();
    }

    static w b(Sensor sensor) {
        return new w(sensor.getType(), sensor.getName(), sensor.getVendor());
    }

    private static double c(float[] fArr, float[] fArr2) {
        int min = Math.min(fArr.length, fArr2.length);
        double d2 = 0.0d;
        for (int i = 0; i < min; i++) {
            d2 += StrictMath.pow((double) (fArr[i] - fArr2[i]), 2.0d);
        }
        return Math.sqrt(d2);
    }

    private static List<Float> d(float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float valueOf : fArr) {
            arrayList.add(Float.valueOf(valueOf));
        }
        return arrayList;
    }

    private boolean e(int i, String str, String str2) {
        return this.f2084a == i && this.f2085b.equals(str) && this.f2086c.equals(str2);
    }

    private void f() {
        for (int i = 0; i < 2; i++) {
            this.f2087d[i] = null;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            this.f2088e[i2] = 0;
        }
        this.g = 0.0d;
        this.h = 0;
    }

    private Map<String, Object> h() {
        HashMap hashMap = new HashMap(7);
        hashMap.put("sT", Integer.valueOf(this.f2084a));
        hashMap.put("sN", this.f2085b);
        hashMap.put("sV", this.f2086c);
        float[] fArr = this.f2087d[0];
        if (fArr != null) {
            hashMap.put("sVS", d(fArr));
        }
        float[] fArr2 = this.f2087d[1];
        if (fArr2 != null) {
            hashMap.put("sVE", d(fArr2));
        }
        return hashMap;
    }

    private void i(Map<w, Map<String, Object>> map, boolean z) {
        boolean z2 = false;
        if (this.f2087d[0] != null) {
            z2 = true;
        }
        if (z2) {
            map.put(this, h());
            if (z) {
                f();
            }
        } else if (!map.containsKey(this)) {
            map.put(this, h());
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Map<w, Map<String, Object>> map) {
        i(map, true);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return e(wVar.f2084a, wVar.f2085b, wVar.f2086c);
    }

    public final void g(Map<w, Map<String, Object>> map) {
        i(map, false);
    }

    public final int hashCode() {
        return this.f2089f;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent != null && sensorEvent.values != null) {
            Sensor sensor = sensorEvent.sensor;
            if ((sensor == null || sensor.getName() == null || sensor.getVendor() == null) ? false : true) {
                int type = sensorEvent.sensor.getType();
                String name = sensorEvent.sensor.getName();
                String vendor = sensorEvent.sensor.getVendor();
                long j = sensorEvent.timestamp;
                float[] fArr = sensorEvent.values;
                if (e(type, name, vendor)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    float[][] fArr2 = this.f2087d;
                    float[] fArr3 = fArr2[0];
                    if (fArr3 == null) {
                        fArr2[0] = Arrays.copyOf(fArr, fArr.length);
                        this.f2088e[0] = currentTimeMillis;
                        return;
                    }
                    float[] fArr4 = fArr2[1];
                    if (fArr4 == null) {
                        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
                        this.f2087d[1] = copyOf;
                        this.f2088e[1] = currentTimeMillis;
                        this.g = c(fArr3, copyOf);
                    } else if (50000000 <= j - this.h) {
                        this.h = j;
                        if (Arrays.equals(fArr4, fArr)) {
                            this.f2088e[1] = currentTimeMillis;
                            return;
                        }
                        double c2 = c(fArr3, fArr);
                        if (c2 > this.g) {
                            this.f2087d[1] = Arrays.copyOf(fArr, fArr.length);
                            this.f2088e[1] = currentTimeMillis;
                            this.g = c2;
                        }
                    }
                }
            }
        }
    }
}
