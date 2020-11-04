package androidx.core.widget;

import a.h.k.t;
import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* compiled from: AutoScrollHelper */
public abstract class a implements View.OnTouchListener {
    private static final int s = ViewConfiguration.getTapTimeout();

    /* renamed from: b  reason: collision with root package name */
    final C0042a f1361b = new C0042a();

    /* renamed from: c  reason: collision with root package name */
    private final Interpolator f1362c = new AccelerateInterpolator();

    /* renamed from: d  reason: collision with root package name */
    final View f1363d;

    /* renamed from: e  reason: collision with root package name */
    private Runnable f1364e;

    /* renamed from: f  reason: collision with root package name */
    private float[] f1365f = {0.0f, 0.0f};
    private float[] g = {Float.MAX_VALUE, Float.MAX_VALUE};
    private int h;
    private int i;
    private float[] j = {0.0f, 0.0f};
    private float[] k = {0.0f, 0.0f};
    private float[] l = {Float.MAX_VALUE, Float.MAX_VALUE};
    private boolean m;
    boolean n;
    boolean o;
    boolean p;
    private boolean q;
    private boolean r;

    /* renamed from: androidx.core.widget.a$a  reason: collision with other inner class name */
    /* compiled from: AutoScrollHelper */
    private static class C0042a {

        /* renamed from: a  reason: collision with root package name */
        private int f1366a;

        /* renamed from: b  reason: collision with root package name */
        private int f1367b;

        /* renamed from: c  reason: collision with root package name */
        private float f1368c;

        /* renamed from: d  reason: collision with root package name */
        private float f1369d;

        /* renamed from: e  reason: collision with root package name */
        private long f1370e = Long.MIN_VALUE;

        /* renamed from: f  reason: collision with root package name */
        private long f1371f = 0;
        private int g = 0;
        private int h = 0;
        private long i = -1;
        private float j;
        private int k;

        C0042a() {
        }

        private float e(long j2) {
            if (j2 < this.f1370e) {
                return 0.0f;
            }
            long j3 = this.i;
            if (j3 < 0 || j2 < j3) {
                return a.e(((float) (j2 - this.f1370e)) / ((float) this.f1366a), 0.0f, 1.0f) * 0.5f;
            }
            long j4 = j2 - j3;
            float f2 = this.j;
            return (1.0f - f2) + (f2 * a.e(((float) j4) / ((float) this.k), 0.0f, 1.0f));
        }

        private float g(float f2) {
            return (-4.0f * f2 * f2) + (f2 * 4.0f);
        }

        public void a() {
            if (this.f1371f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float g2 = g(e(currentAnimationTimeMillis));
                this.f1371f = currentAnimationTimeMillis;
                float f2 = ((float) (currentAnimationTimeMillis - this.f1371f)) * g2;
                this.g = (int) (this.f1368c * f2);
                this.h = (int) (f2 * this.f1369d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        public int b() {
            return this.g;
        }

        public int c() {
            return this.h;
        }

        public int d() {
            float f2 = this.f1368c;
            return (int) (f2 / Math.abs(f2));
        }

        public int f() {
            float f2 = this.f1369d;
            return (int) (f2 / Math.abs(f2));
        }

        public boolean h() {
            return this.i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.i + ((long) this.k);
        }

        public void i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.k = a.f((int) (currentAnimationTimeMillis - this.f1370e), 0, this.f1367b);
            this.j = e(currentAnimationTimeMillis);
            this.i = currentAnimationTimeMillis;
        }

        public void j(int i2) {
            this.f1367b = i2;
        }

        public void k(int i2) {
            this.f1366a = i2;
        }

        public void l(float f2, float f3) {
            this.f1368c = f2;
            this.f1369d = f3;
        }

        public void m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f1370e = currentAnimationTimeMillis;
            this.i = -1;
            this.f1371f = currentAnimationTimeMillis;
            this.j = 0.5f;
            this.g = 0;
            this.h = 0;
        }
    }

    /* compiled from: AutoScrollHelper */
    private class b implements Runnable {
        b() {
        }

        public void run() {
            a aVar = a.this;
            if (aVar.p) {
                if (aVar.n) {
                    aVar.n = false;
                    aVar.f1361b.m();
                }
                C0042a aVar2 = a.this.f1361b;
                if (aVar2.h() || !a.this.u()) {
                    a.this.p = false;
                    return;
                }
                a aVar3 = a.this;
                if (aVar3.o) {
                    aVar3.o = false;
                    aVar3.c();
                }
                aVar2.a();
                a.this.j(aVar2.b(), aVar2.c());
                t.V(a.this.f1363d, this);
            }
        }
    }

    public a(View view) {
        this.f1363d = view;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float f3 = (float) ((int) ((1575.0f * f2) + 0.5f));
        o(f3, f3);
        float f4 = (float) ((int) ((f2 * 315.0f) + 0.5f));
        p(f4, f4);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(s);
        r(500);
        q(500);
    }

    private float d(int i2, float f2, float f3, float f4) {
        float h2 = h(this.f1365f[i2], f3, this.g[i2], f2);
        int i3 = (h2 > 0.0f ? 1 : (h2 == 0.0f ? 0 : -1));
        if (i3 == 0) {
            return 0.0f;
        }
        float f5 = this.j[i2];
        float f6 = this.k[i2];
        float f7 = this.l[i2];
        float f8 = f5 * f4;
        if (i3 > 0) {
            return e(h2 * f8, f6, f7);
        }
        return -e((-h2) * f8, f6, f7);
    }

    static float e(float f2, float f3, float f4) {
        return f2 > f4 ? f4 : f2 < f3 ? f3 : f2;
    }

    static int f(int i2, int i3, int i4) {
        return i2 > i4 ? i4 : i2 < i3 ? i3 : i2;
    }

    private float g(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        int i2 = this.h;
        if (i2 == 0 || i2 == 1) {
            if (f2 < f3) {
                if (f2 >= 0.0f) {
                    return 1.0f - (f2 / f3);
                }
                return (!this.p || this.h != 1) ? 0.0f : 1.0f;
            }
        } else if (i2 == 2 && f2 < 0.0f) {
            return f2 / (-f3);
        }
    }

    private float h(float f2, float f3, float f4, float f5) {
        float f6;
        float e2 = e(f2 * f3, 0.0f, f4);
        float g2 = g(f3 - f5, e2) - g(f5, e2);
        if (g2 < 0.0f) {
            f6 = -this.f1362c.getInterpolation(-g2);
        } else if (g2 <= 0.0f) {
            return 0.0f;
        } else {
            f6 = this.f1362c.getInterpolation(g2);
        }
        return e(f6, -1.0f, 1.0f);
    }

    private void i() {
        if (this.n) {
            this.p = false;
        } else {
            this.f1361b.i();
        }
    }

    private void v() {
        int i2;
        if (this.f1364e == null) {
            this.f1364e = new b();
        }
        this.p = true;
        this.n = true;
        if (this.m || (i2 = this.i) <= 0) {
            this.f1364e.run();
        } else {
            t.W(this.f1363d, this.f1364e, (long) i2);
        }
        this.m = true;
    }

    public abstract boolean a(int i2);

    public abstract boolean b(int i2);

    /* access modifiers changed from: package-private */
    public void c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f1363d.onTouchEvent(obtain);
        obtain.recycle();
    }

    public abstract void j(int i2, int i3);

    public a k(int i2) {
        this.i = i2;
        return this;
    }

    public a l(int i2) {
        this.h = i2;
        return this;
    }

    public a m(boolean z) {
        if (this.q && !z) {
            i();
        }
        this.q = z;
        return this;
    }

    public a n(float f2, float f3) {
        float[] fArr = this.g;
        fArr[0] = f2;
        fArr[1] = f3;
        return this;
    }

    public a o(float f2, float f3) {
        float[] fArr = this.l;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.q
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x0058
        L_0x0016:
            r5.i()
            goto L_0x0058
        L_0x001a:
            r5.o = r2
            r5.m = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f1363d
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f1363d
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f1361b
            r7.l(r0, r6)
            boolean r6 = r5.p
            if (r6 != 0) goto L_0x0058
            boolean r6 = r5.u()
            if (r6 == 0) goto L_0x0058
            r5.v()
        L_0x0058:
            boolean r6 = r5.r
            if (r6 == 0) goto L_0x0061
            boolean r6 = r5.p
            if (r6 == 0) goto L_0x0061
            r1 = 1
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public a p(float f2, float f3) {
        float[] fArr = this.k;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
        return this;
    }

    public a q(int i2) {
        this.f1361b.j(i2);
        return this;
    }

    public a r(int i2) {
        this.f1361b.k(i2);
        return this;
    }

    public a s(float f2, float f3) {
        float[] fArr = this.f1365f;
        fArr[0] = f2;
        fArr[1] = f3;
        return this;
    }

    public a t(float f2, float f3) {
        float[] fArr = this.j;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
        return this;
    }

    /* access modifiers changed from: package-private */
    public boolean u() {
        C0042a aVar = this.f1361b;
        int f2 = aVar.f();
        int d2 = aVar.d();
        return (f2 != 0 && b(f2)) || (d2 != 0 && a(d2));
    }
}
