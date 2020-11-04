package com.google.android.material.behavior;

import a.h.k.t;
import a.j.a.c;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    a.j.a.c f10671a;

    /* renamed from: b  reason: collision with root package name */
    b f10672b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f10673c;

    /* renamed from: d  reason: collision with root package name */
    private float f10674d = 0.0f;

    /* renamed from: e  reason: collision with root package name */
    private boolean f10675e;

    /* renamed from: f  reason: collision with root package name */
    int f10676f = 2;
    float g = 0.5f;
    float h = 0.0f;
    float i = 0.5f;
    private final c.C0019c j = new a();

    class a extends c.C0019c {

        /* renamed from: a  reason: collision with root package name */
        private int f10677a;

        /* renamed from: b  reason: collision with root package name */
        private int f10678b = -1;

        a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0023 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0030 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean n(android.view.View r7, float r8) {
            /*
                r6 = this;
                r0 = 0
                r1 = 0
                r2 = 1
                int r3 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r3 == 0) goto L_0x0032
                int r7 = a.h.k.t.t(r7)
                if (r7 != r2) goto L_0x000f
                r7 = 1
                goto L_0x0010
            L_0x000f:
                r7 = 0
            L_0x0010:
                com.google.android.material.behavior.SwipeDismissBehavior r4 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r4 = r4.f10676f
                r5 = 2
                if (r4 != r5) goto L_0x0018
                return r2
            L_0x0018:
                if (r4 != 0) goto L_0x0025
                if (r7 == 0) goto L_0x0021
                int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r7 >= 0) goto L_0x0024
                goto L_0x0023
            L_0x0021:
                if (r3 <= 0) goto L_0x0024
            L_0x0023:
                r1 = 1
            L_0x0024:
                return r1
            L_0x0025:
                if (r4 != r2) goto L_0x0031
                if (r7 == 0) goto L_0x002c
                if (r3 <= 0) goto L_0x0031
                goto L_0x0030
            L_0x002c:
                int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r7 >= 0) goto L_0x0031
            L_0x0030:
                r1 = 1
            L_0x0031:
                return r1
            L_0x0032:
                int r8 = r7.getLeft()
                int r0 = r6.f10677a
                int r8 = r8 - r0
                int r7 = r7.getWidth()
                float r7 = (float) r7
                com.google.android.material.behavior.SwipeDismissBehavior r0 = com.google.android.material.behavior.SwipeDismissBehavior.this
                float r0 = r0.g
                float r7 = r7 * r0
                int r7 = java.lang.Math.round(r7)
                int r8 = java.lang.Math.abs(r8)
                if (r8 < r7) goto L_0x004f
                r1 = 1
            L_0x004f:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.n(android.view.View, float):boolean");
        }

        public int a(View view, int i, int i2) {
            int i3;
            int i4;
            int width;
            boolean z = t.t(view) == 1;
            int i5 = SwipeDismissBehavior.this.f10676f;
            if (i5 != 0) {
                if (i5 != 1) {
                    i3 = this.f10677a - view.getWidth();
                    i4 = view.getWidth() + this.f10677a;
                } else if (z) {
                    i3 = this.f10677a;
                    width = view.getWidth();
                } else {
                    i3 = this.f10677a - view.getWidth();
                    i4 = this.f10677a;
                }
                return SwipeDismissBehavior.F(i3, i, i4);
            } else if (z) {
                i3 = this.f10677a - view.getWidth();
                i4 = this.f10677a;
                return SwipeDismissBehavior.F(i3, i, i4);
            } else {
                i3 = this.f10677a;
                width = view.getWidth();
            }
            i4 = width + i3;
            return SwipeDismissBehavior.F(i3, i, i4);
        }

        public int b(View view, int i, int i2) {
            return view.getTop();
        }

        public int d(View view) {
            return view.getWidth();
        }

        public void i(View view, int i) {
            this.f10678b = i;
            this.f10677a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        public void j(int i) {
            b bVar = SwipeDismissBehavior.this.f10672b;
            if (bVar != null) {
                bVar.b(i);
            }
        }

        public void k(View view, int i, int i2, int i3, int i4) {
            float width = ((float) this.f10677a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.h);
            float width2 = ((float) this.f10677a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.i);
            float f2 = (float) i;
            if (f2 <= width) {
                view.setAlpha(1.0f);
            } else if (f2 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.E(0.0f, 1.0f - SwipeDismissBehavior.H(width, width2, f2), 1.0f));
            }
        }

        public void l(View view, float f2, float f3) {
            boolean z;
            int i;
            b bVar;
            this.f10678b = -1;
            int width = view.getWidth();
            if (n(view, f2)) {
                int left = view.getLeft();
                int i2 = this.f10677a;
                i = left < i2 ? i2 - width : i2 + width;
                z = true;
            } else {
                i = this.f10677a;
                z = false;
            }
            if (SwipeDismissBehavior.this.f10671a.N(i, view.getTop())) {
                t.V(view, new c(view, z));
            } else if (z && (bVar = SwipeDismissBehavior.this.f10672b) != null) {
                bVar.a(view);
            }
        }

        public boolean m(View view, int i) {
            return this.f10678b == -1 && SwipeDismissBehavior.this.D(view);
        }
    }

    public interface b {
        void a(View view);

        void b(int i);
    }

    private class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final View f10680b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f10681c;

        c(View view, boolean z) {
            this.f10680b = view;
            this.f10681c = z;
        }

        public void run() {
            b bVar;
            a.j.a.c cVar = SwipeDismissBehavior.this.f10671a;
            if (cVar != null && cVar.n(true)) {
                t.V(this.f10680b, this);
            } else if (this.f10681c && (bVar = SwipeDismissBehavior.this.f10672b) != null) {
                bVar.a(this.f10680b);
            }
        }
    }

    static float E(float f2, float f3, float f4) {
        return Math.min(Math.max(f2, f3), f4);
    }

    static int F(int i2, int i3, int i4) {
        return Math.min(Math.max(i2, i3), i4);
    }

    private void G(ViewGroup viewGroup) {
        a.j.a.c cVar;
        if (this.f10671a == null) {
            if (this.f10675e) {
                cVar = a.j.a.c.o(viewGroup, this.f10674d, this.j);
            } else {
                cVar = a.j.a.c.p(viewGroup, this.j);
            }
            this.f10671a = cVar;
        }
    }

    static float H(float f2, float f3, float f4) {
        return (f4 - f2) / (f3 - f2);
    }

    public boolean C(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        a.j.a.c cVar = this.f10671a;
        if (cVar == null) {
            return false;
        }
        cVar.F(motionEvent);
        return true;
    }

    public boolean D(View view) {
        return true;
    }

    public void I(float f2) {
        this.i = E(0.0f, f2, 1.0f);
    }

    public void J(float f2) {
        this.h = E(0.0f, f2, 1.0f);
    }

    public void K(int i2) {
        this.f10676f = i2;
    }

    public boolean k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.f10673c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.F(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f10673c = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f10673c = false;
        }
        if (!z) {
            return false;
        }
        G(coordinatorLayout);
        return this.f10671a.O(motionEvent);
    }
}
