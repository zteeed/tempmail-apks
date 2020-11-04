package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.appcompat.view.menu.s;

/* compiled from: ForwardingListener */
public abstract class r implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: b  reason: collision with root package name */
    private final float f1149b;

    /* renamed from: c  reason: collision with root package name */
    private final int f1150c;

    /* renamed from: d  reason: collision with root package name */
    private final int f1151d;

    /* renamed from: e  reason: collision with root package name */
    final View f1152e;

    /* renamed from: f  reason: collision with root package name */
    private Runnable f1153f;
    private Runnable g;
    private boolean h;
    private int i;
    private final int[] j = new int[2];

    /* compiled from: ForwardingListener */
    private class a implements Runnable {
        a() {
        }

        public void run() {
            ViewParent parent = r.this.f1152e.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* compiled from: ForwardingListener */
    private class b implements Runnable {
        b() {
        }

        public void run() {
            r.this.e();
        }
    }

    public r(View view) {
        this.f1152e = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1149b = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1150c = tapTimeout;
        this.f1151d = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private void a() {
        Runnable runnable = this.g;
        if (runnable != null) {
            this.f1152e.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f1153f;
        if (runnable2 != null) {
            this.f1152e.removeCallbacks(runnable2);
        }
    }

    private boolean f(MotionEvent motionEvent) {
        p pVar;
        View view = this.f1152e;
        s b2 = b();
        if (b2 == null || !b2.b() || (pVar = (p) b2.d()) == null || !pVar.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        i(view, obtainNoHistory);
        j(pVar, obtainNoHistory);
        boolean e2 = pVar.e(obtainNoHistory, this.i);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        boolean z = (actionMasked == 1 || actionMasked == 3) ? false : true;
        if (!e2 || !z) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r1 != 3) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f1152e
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L_0x0041
            r3 = 1
            if (r1 == r3) goto L_0x003d
            r4 = 2
            if (r1 == r4) goto L_0x001a
            r6 = 3
            if (r1 == r6) goto L_0x003d
            goto L_0x006d
        L_0x001a:
            int r1 = r5.i
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L_0x006d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f1149b
            boolean r6 = h(r0, r4, r6, r1)
            if (r6 != 0) goto L_0x006d
            r5.a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L_0x003d:
            r5.a()
            goto L_0x006d
        L_0x0041:
            int r6 = r6.getPointerId(r2)
            r5.i = r6
            java.lang.Runnable r6 = r5.f1153f
            if (r6 != 0) goto L_0x0052
            androidx.appcompat.widget.r$a r6 = new androidx.appcompat.widget.r$a
            r6.<init>()
            r5.f1153f = r6
        L_0x0052:
            java.lang.Runnable r6 = r5.f1153f
            int r1 = r5.f1150c
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.g
            if (r6 != 0) goto L_0x0065
            androidx.appcompat.widget.r$b r6 = new androidx.appcompat.widget.r$b
            r6.<init>()
            r5.g = r6
        L_0x0065:
            java.lang.Runnable r6 = r5.g
            int r1 = r5.f1151d
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.r.g(android.view.MotionEvent):boolean");
    }

    private static boolean h(View view, float f2, float f3, float f4) {
        float f5 = -f4;
        return f2 >= f5 && f3 >= f5 && f2 < ((float) (view.getRight() - view.getLeft())) + f4 && f3 < ((float) (view.getBottom() - view.getTop())) + f4;
    }

    private boolean i(View view, MotionEvent motionEvent) {
        int[] iArr = this.j;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
        return true;
    }

    private boolean j(View view, MotionEvent motionEvent) {
        int[] iArr = this.j;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
        return true;
    }

    public abstract s b();

    /* access modifiers changed from: protected */
    public abstract boolean c();

    /* access modifiers changed from: protected */
    public boolean d() {
        s b2 = b();
        if (b2 == null || !b2.b()) {
            return true;
        }
        b2.dismiss();
        return true;
    }

    /* access modifiers changed from: package-private */
    public void e() {
        a();
        View view = this.f1152e;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.h = true;
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.h;
        if (z2) {
            z = f(motionEvent) || !d();
        } else {
            z = g(motionEvent) && c();
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f1152e.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.h = z;
        if (z || z2) {
            return true;
        }
        return false;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.h = false;
        this.i = -1;
        Runnable runnable = this.f1153f;
        if (runnable != null) {
            this.f1152e.removeCallbacks(runnable);
        }
    }
}
