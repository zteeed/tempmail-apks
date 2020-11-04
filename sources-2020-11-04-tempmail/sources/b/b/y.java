package b.b;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class y {
    private static final BitSet k = new BitSet(6);
    private static final Handler l = new Handler(Looper.getMainLooper());
    private static volatile y m;

    /* renamed from: a  reason: collision with root package name */
    final Handler f2194a;

    /* renamed from: b  reason: collision with root package name */
    final Object f2195b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final Map<w, w> f2196c = new HashMap(k.size());

    /* renamed from: d  reason: collision with root package name */
    private final Map<w, Map<String, Object>> f2197d = new HashMap(k.size());

    /* renamed from: e  reason: collision with root package name */
    private final SensorManager f2198e;

    /* renamed from: f  reason: collision with root package name */
    boolean f2199f;
    private boolean g;
    final Runnable h = new a();
    final Runnable i = new b();
    final Runnable j = new c();

    class a implements Runnable {
        a() {
        }

        public final void run() {
            synchronized (y.this.f2195b) {
                y.this.d();
                y.this.f2194a.postDelayed(y.this.i, 1800000);
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        public final void run() {
            synchronized (y.this.f2195b) {
                y.this.e();
                y.this.f2194a.postDelayed(y.this.h, 500);
                y.this.f2199f = true;
            }
        }
    }

    class c implements Runnable {
        c() {
        }

        public final void run() {
            synchronized (y.this.f2195b) {
                if (y.this.f2199f) {
                    y.this.f2194a.removeCallbacks(y.this.i);
                    y.this.f2194a.removeCallbacks(y.this.h);
                    y.this.d();
                    y.this.f2199f = false;
                }
            }
        }
    }

    static {
        k.set(1);
        k.set(2);
        k.set(4);
    }

    private y(SensorManager sensorManager, Handler handler) {
        this.f2198e = sensorManager;
        this.f2194a = handler;
    }

    private static y a(SensorManager sensorManager, Handler handler) {
        if (m == null) {
            synchronized (y.class) {
                if (m == null) {
                    m = new y(sensorManager, handler);
                }
            }
        }
        return m;
    }

    static y c(Context context) {
        return a((SensorManager) context.getApplicationContext().getSystemService("sensor"), l);
    }

    /* access modifiers changed from: package-private */
    public final List<Map<String, Object>> b() {
        synchronized (this.f2195b) {
            if (!this.f2196c.isEmpty() && this.g) {
                for (w g2 : this.f2196c.values()) {
                    g2.g(this.f2197d);
                }
            }
            if (this.f2197d.isEmpty()) {
                List<Map<String, Object>> emptyList = Collections.emptyList();
                return emptyList;
            }
            ArrayList arrayList = new ArrayList(this.f2197d.values());
            return arrayList;
        }
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        try {
            if (!this.f2196c.isEmpty()) {
                for (w next : this.f2196c.values()) {
                    this.f2198e.unregisterListener(next);
                    next.a(this.f2197d);
                }
            }
        } catch (Throwable unused) {
        }
        this.g = false;
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        try {
            for (Sensor next : this.f2198e.getSensorList(-1)) {
                int type = next.getType();
                if (type >= 0 && k.get(type)) {
                    w b2 = w.b(next);
                    if (!this.f2196c.containsKey(b2)) {
                        this.f2196c.put(b2, b2);
                    }
                    this.f2198e.registerListener(this.f2196c.get(b2), next, 0);
                }
            }
        } catch (Throwable unused) {
        }
        this.g = true;
    }
}