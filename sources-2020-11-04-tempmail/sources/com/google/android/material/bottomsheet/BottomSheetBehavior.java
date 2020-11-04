package com.google.android.material.bottomsheet;

import a.h.k.u;
import a.j.a.c;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import b.c.a.d.d;
import b.c.a.d.k;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public boolean f10911a = true;

    /* renamed from: b  reason: collision with root package name */
    private float f10912b;

    /* renamed from: c  reason: collision with root package name */
    private int f10913c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f10914d;

    /* renamed from: e  reason: collision with root package name */
    private int f10915e;

    /* renamed from: f  reason: collision with root package name */
    private int f10916f;
    int g;
    int h;
    int i;
    boolean j;
    private boolean k;
    int l = 4;
    a.j.a.c m;
    private boolean n;
    private int o;
    private boolean p;
    int q;
    WeakReference<V> r;
    WeakReference<View> s;
    private b t;
    private VelocityTracker u;
    int v;
    private int w;
    boolean x;
    private Map<View, Integer> y;
    private final c.C0019c z = new a();

    class a extends c.C0019c {
        a() {
        }

        public int a(View view, int i, int i2) {
            return view.getLeft();
        }

        public int b(View view, int i, int i2) {
            int E = BottomSheetBehavior.this.I();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return a.h.g.a.b(i, E, bottomSheetBehavior.j ? bottomSheetBehavior.q : bottomSheetBehavior.i);
        }

        public int e(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.j) {
                return bottomSheetBehavior.q;
            }
            return bottomSheetBehavior.i;
        }

        public void j(int i) {
            if (i == 1) {
                BottomSheetBehavior.this.P(1);
            }
        }

        public void k(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.G(i2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:42:0x00d5  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00e6  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void l(android.view.View r8, float r9, float r10) {
            /*
                r7 = this;
                r0 = 0
                r1 = 0
                r2 = 4
                r3 = 6
                r4 = 3
                int r5 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
                if (r5 >= 0) goto L_0x0029
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r9.f10911a
                if (r9 == 0) goto L_0x0018
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r9 = r9.g
                r2 = 3
                goto L_0x00c7
            L_0x0018:
                int r9 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r10 = r10.h
                if (r9 <= r10) goto L_0x0025
                r0 = r10
            L_0x0023:
                r2 = 6
                goto L_0x0026
            L_0x0025:
                r2 = 3
            L_0x0026:
                r9 = r0
                goto L_0x00c7
            L_0x0029:
                com.google.android.material.bottomsheet.BottomSheetBehavior r5 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = r5.j
                if (r6 == 0) goto L_0x0052
                boolean r5 = r5.Q(r8, r10)
                if (r5 == 0) goto L_0x0052
                int r5 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = r6.i
                if (r5 > r6) goto L_0x004b
                float r5 = java.lang.Math.abs(r9)
                float r6 = java.lang.Math.abs(r10)
                int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
                if (r5 >= 0) goto L_0x0052
            L_0x004b:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r9 = r9.q
                r2 = 5
                goto L_0x00c7
            L_0x0052:
                int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
                if (r1 == 0) goto L_0x0068
                float r9 = java.lang.Math.abs(r9)
                float r10 = java.lang.Math.abs(r10)
                int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
                if (r9 <= 0) goto L_0x0063
                goto L_0x0068
            L_0x0063:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r9 = r9.i
                goto L_0x00c7
            L_0x0068:
                int r9 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r10 = r10.f10911a
                if (r10 == 0) goto L_0x0093
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r10 = r10.g
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.i
                int r9 = r9 - r0
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto L_0x008e
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r9.g
                goto L_0x0025
            L_0x008e:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r9.i
                goto L_0x0026
            L_0x0093:
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r1 = r10.h
                if (r9 >= r1) goto L_0x00aa
                int r10 = r10.i
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                if (r9 >= r10) goto L_0x00a4
                goto L_0x0025
            L_0x00a4:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r9.h
                goto L_0x0023
            L_0x00aa:
                int r10 = r9 - r1
                int r10 = java.lang.Math.abs(r10)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.i
                int r9 = r9 - r0
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto L_0x00c1
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r9.h
                goto L_0x0023
            L_0x00c1:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r9.i
                goto L_0x0026
            L_0x00c7:
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                a.j.a.c r10 = r10.m
                int r0 = r8.getLeft()
                boolean r9 = r10.N(r0, r9)
                if (r9 == 0) goto L_0x00e6
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                r10 = 2
                r9.P(r10)
                com.google.android.material.bottomsheet.BottomSheetBehavior$c r9 = new com.google.android.material.bottomsheet.BottomSheetBehavior$c
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                r9.<init>(r8, r2)
                a.h.k.u.V(r8, r9)
                goto L_0x00eb
            L_0x00e6:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                r8.P(r2)
            L_0x00eb:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.a.l(android.view.View, float, float):void");
        }

        public boolean m(View view, int i) {
            WeakReference<V> weakReference;
            View view2;
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.l;
            if (i2 == 1 || bottomSheetBehavior.x) {
                return false;
            }
            if ((i2 != 3 || bottomSheetBehavior.v != i || (view2 = (View) bottomSheetBehavior.s.get()) == null || !view2.canScrollVertically(-1)) && (weakReference = BottomSheetBehavior.this.r) != null && weakReference.get() == view) {
                return true;
            }
            return false;
        }
    }

    public static abstract class b {
        public abstract void a(View view, float f2);

        public abstract void b(View view, int i);
    }

    private class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final View f10919b;

        /* renamed from: c  reason: collision with root package name */
        private final int f10920c;

        c(View view, int i) {
            this.f10919b = view;
            this.f10920c = i;
        }

        public void run() {
            a.j.a.c cVar = BottomSheetBehavior.this.m;
            if (cVar == null || !cVar.n(true)) {
                BottomSheetBehavior.this.P(this.f10920c);
            } else {
                u.V(this.f10919b, this);
            }
        }
    }

    public BottomSheetBehavior() {
    }

    private void F() {
        if (this.f10911a) {
            this.i = Math.max(this.q - this.f10916f, this.g);
        } else {
            this.i = this.q - this.f10916f;
        }
    }

    /* access modifiers changed from: private */
    public int I() {
        if (this.f10911a) {
            return this.g;
        }
        return 0;
    }

    private float J() {
        VelocityTracker velocityTracker = this.u;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f10912b);
        return this.u.getYVelocity(this.v);
    }

    private void K() {
        this.v = -1;
        VelocityTracker velocityTracker = this.u;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.u = null;
        }
    }

    private void R(boolean z2) {
        WeakReference<V> weakReference = this.r;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (Build.VERSION.SDK_INT >= 16 && z2) {
                    if (this.y == null) {
                        this.y = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = coordinatorLayout.getChildAt(i2);
                    if (childAt != this.r.get()) {
                        if (!z2) {
                            Map<View, Integer> map = this.y;
                            if (map != null && map.containsKey(childAt)) {
                                u.i0(childAt, this.y.get(childAt).intValue());
                            }
                        } else {
                            if (Build.VERSION.SDK_INT >= 16) {
                                this.y.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            }
                            u.i0(childAt, 4);
                        }
                    }
                }
                if (!z2) {
                    this.y = null;
                }
            }
        }
    }

    public void B(CoordinatorLayout coordinatorLayout, V v2, View view, int i2) {
        int i3;
        int i4;
        int i5 = 3;
        if (v2.getTop() == I()) {
            P(3);
        } else if (view == this.s.get() && this.p) {
            if (this.o > 0) {
                i3 = I();
            } else if (!this.j || !Q(v2, J())) {
                if (this.o == 0) {
                    int top = v2.getTop();
                    if (!this.f10911a) {
                        int i6 = this.h;
                        if (top < i6) {
                            if (top < Math.abs(top - this.i)) {
                                i3 = 0;
                            } else {
                                i3 = this.h;
                            }
                        } else if (Math.abs(top - i6) < Math.abs(top - this.i)) {
                            i3 = this.h;
                        } else {
                            i4 = this.i;
                        }
                        i5 = 6;
                    } else if (Math.abs(top - this.g) < Math.abs(top - this.i)) {
                        i3 = this.g;
                    } else {
                        i4 = this.i;
                    }
                } else {
                    i4 = this.i;
                }
                i5 = 4;
            } else {
                i3 = this.q;
                i5 = 5;
            }
            if (this.m.P(v2, v2.getLeft(), i3)) {
                P(2);
                u.V(v2, new c(v2, i5));
            } else {
                P(i5);
            }
            this.p = false;
        }
    }

    public boolean C(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        if (!v2.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.l == 1 && actionMasked == 0) {
            return true;
        }
        a.j.a.c cVar = this.m;
        if (cVar != null) {
            cVar.F(motionEvent);
        }
        if (actionMasked == 0) {
            K();
        }
        if (this.u == null) {
            this.u = VelocityTracker.obtain();
        }
        this.u.addMovement(motionEvent);
        if (actionMasked == 2 && !this.n && Math.abs(((float) this.w) - motionEvent.getY()) > ((float) this.m.z())) {
            this.m.c(v2, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.n;
    }

    /* access modifiers changed from: package-private */
    public void G(int i2) {
        b bVar;
        View view = (View) this.r.get();
        if (view != null && (bVar = this.t) != null) {
            int i3 = this.i;
            if (i2 > i3) {
                bVar.a(view, ((float) (i3 - i2)) / ((float) (this.q - i3)));
            } else {
                bVar.a(view, ((float) (i3 - i2)) / ((float) (i3 - I())));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public View H(View view) {
        if (u.J(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View H = H(viewGroup.getChildAt(i2));
            if (H != null) {
                return H;
            }
        }
        return null;
    }

    public void L(boolean z2) {
        if (this.f10911a != z2) {
            this.f10911a = z2;
            if (this.r != null) {
                F();
            }
            P((!this.f10911a || this.l != 6) ? this.l : 3);
        }
    }

    public void M(boolean z2) {
        this.j = z2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void N(int r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.f10914d
            if (r4 != 0) goto L_0x0015
            r3.f10914d = r0
            goto L_0x0024
        L_0x000c:
            boolean r2 = r3.f10914d
            if (r2 != 0) goto L_0x0017
            int r2 = r3.f10913c
            if (r2 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x0024
        L_0x0017:
            r3.f10914d = r1
            int r1 = java.lang.Math.max(r1, r4)
            r3.f10913c = r1
            int r1 = r3.q
            int r1 = r1 - r4
            r3.i = r1
        L_0x0024:
            if (r0 == 0) goto L_0x003a
            int r4 = r3.l
            r0 = 4
            if (r4 != r0) goto L_0x003a
            java.lang.ref.WeakReference<V> r4 = r3.r
            if (r4 == 0) goto L_0x003a
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x003a
            r4.requestLayout()
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.N(int):void");
    }

    public void O(boolean z2) {
        this.k = z2;
    }

    /* access modifiers changed from: package-private */
    public void P(int i2) {
        b bVar;
        if (this.l != i2) {
            this.l = i2;
            if (i2 == 6 || i2 == 3) {
                R(true);
            } else if (i2 == 5 || i2 == 4) {
                R(false);
            }
            View view = (View) this.r.get();
            if (view != null && (bVar = this.t) != null) {
                bVar.b(view, i2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean Q(View view, float f2) {
        if (this.k) {
            return true;
        }
        if (view.getTop() >= this.i && Math.abs((((float) view.getTop()) + (f2 * 0.1f)) - ((float) this.i)) / ((float) this.f10913c) > 0.5f) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean k(androidx.coordinatorlayout.widget.CoordinatorLayout r9, V r10, android.view.MotionEvent r11) {
        /*
            r8 = this;
            boolean r0 = r10.isShown()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x000b
            r8.n = r2
            return r1
        L_0x000b:
            int r0 = r11.getActionMasked()
            if (r0 != 0) goto L_0x0014
            r8.K()
        L_0x0014:
            android.view.VelocityTracker r3 = r8.u
            if (r3 != 0) goto L_0x001e
            android.view.VelocityTracker r3 = android.view.VelocityTracker.obtain()
            r8.u = r3
        L_0x001e:
            android.view.VelocityTracker r3 = r8.u
            r3.addMovement(r11)
            r3 = 0
            r4 = -1
            if (r0 == 0) goto L_0x0038
            if (r0 == r2) goto L_0x002d
            r10 = 3
            if (r0 == r10) goto L_0x002d
            goto L_0x0077
        L_0x002d:
            r8.x = r1
            r8.v = r4
            boolean r10 = r8.n
            if (r10 == 0) goto L_0x0077
            r8.n = r1
            return r1
        L_0x0038:
            float r5 = r11.getX()
            int r5 = (int) r5
            float r6 = r11.getY()
            int r6 = (int) r6
            r8.w = r6
            java.lang.ref.WeakReference<android.view.View> r6 = r8.s
            if (r6 == 0) goto L_0x004f
            java.lang.Object r6 = r6.get()
            android.view.View r6 = (android.view.View) r6
            goto L_0x0050
        L_0x004f:
            r6 = r3
        L_0x0050:
            if (r6 == 0) goto L_0x0066
            int r7 = r8.w
            boolean r6 = r9.F(r6, r5, r7)
            if (r6 == 0) goto L_0x0066
            int r6 = r11.getActionIndex()
            int r6 = r11.getPointerId(r6)
            r8.v = r6
            r8.x = r2
        L_0x0066:
            int r6 = r8.v
            if (r6 != r4) goto L_0x0074
            int r4 = r8.w
            boolean r10 = r9.F(r10, r5, r4)
            if (r10 != 0) goto L_0x0074
            r10 = 1
            goto L_0x0075
        L_0x0074:
            r10 = 0
        L_0x0075:
            r8.n = r10
        L_0x0077:
            boolean r10 = r8.n
            if (r10 != 0) goto L_0x0086
            a.j.a.c r10 = r8.m
            if (r10 == 0) goto L_0x0086
            boolean r10 = r10.O(r11)
            if (r10 == 0) goto L_0x0086
            return r2
        L_0x0086:
            java.lang.ref.WeakReference<android.view.View> r10 = r8.s
            if (r10 == 0) goto L_0x0091
            java.lang.Object r10 = r10.get()
            r3 = r10
            android.view.View r3 = (android.view.View) r3
        L_0x0091:
            r10 = 2
            if (r0 != r10) goto L_0x00ca
            if (r3 == 0) goto L_0x00ca
            boolean r10 = r8.n
            if (r10 != 0) goto L_0x00ca
            int r10 = r8.l
            if (r10 == r2) goto L_0x00ca
            float r10 = r11.getX()
            int r10 = (int) r10
            float r0 = r11.getY()
            int r0 = (int) r0
            boolean r9 = r9.F(r3, r10, r0)
            if (r9 != 0) goto L_0x00ca
            a.j.a.c r9 = r8.m
            if (r9 == 0) goto L_0x00ca
            int r9 = r8.w
            float r9 = (float) r9
            float r10 = r11.getY()
            float r9 = r9 - r10
            float r9 = java.lang.Math.abs(r9)
            a.j.a.c r10 = r8.m
            int r10 = r10.z()
            float r10 = (float) r10
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x00ca
            r1 = 1
        L_0x00ca:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.k(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public boolean l(CoordinatorLayout coordinatorLayout, V v2, int i2) {
        if (u.q(coordinatorLayout) && !u.q(v2)) {
            v2.setFitsSystemWindows(true);
        }
        int top = v2.getTop();
        coordinatorLayout.M(v2, i2);
        this.q = coordinatorLayout.getHeight();
        if (this.f10914d) {
            if (this.f10915e == 0) {
                this.f10915e = coordinatorLayout.getResources().getDimensionPixelSize(d.design_bottom_sheet_peek_height_min);
            }
            this.f10916f = Math.max(this.f10915e, this.q - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            this.f10916f = this.f10913c;
        }
        this.g = Math.max(0, this.q - v2.getHeight());
        this.h = this.q / 2;
        F();
        int i3 = this.l;
        if (i3 == 3) {
            u.O(v2, I());
        } else if (i3 == 6) {
            u.O(v2, this.h);
        } else if (!this.j || i3 != 5) {
            int i4 = this.l;
            if (i4 == 4) {
                u.O(v2, this.i);
            } else if (i4 == 1 || i4 == 2) {
                u.O(v2, top - v2.getTop());
            }
        } else {
            u.O(v2, this.q);
        }
        if (this.m == null) {
            this.m = a.j.a.c.p(coordinatorLayout, this.z);
        }
        this.r = new WeakReference<>(v2);
        this.s = new WeakReference<>(H(v2));
        return true;
    }

    public boolean o(CoordinatorLayout coordinatorLayout, V v2, View view, float f2, float f3) {
        return view == this.s.get() && (this.l != 3 || super.o(coordinatorLayout, v2, view, f2, f3));
    }

    public void q(CoordinatorLayout coordinatorLayout, V v2, View view, int i2, int i3, int[] iArr, int i4) {
        if (i4 != 1 && view == ((View) this.s.get())) {
            int top = v2.getTop();
            int i5 = top - i3;
            if (i3 > 0) {
                if (i5 < I()) {
                    iArr[1] = top - I();
                    u.O(v2, -iArr[1]);
                    P(3);
                } else {
                    iArr[1] = i3;
                    u.O(v2, -i3);
                    P(1);
                }
            } else if (i3 < 0 && !view.canScrollVertically(-1)) {
                int i6 = this.i;
                if (i5 <= i6 || this.j) {
                    iArr[1] = i3;
                    u.O(v2, -i3);
                    P(1);
                } else {
                    iArr[1] = top - i6;
                    u.O(v2, -iArr[1]);
                    P(4);
                }
            }
            G(v2.getTop());
            this.o = i3;
            this.p = true;
        }
    }

    public void w(CoordinatorLayout coordinatorLayout, V v2, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.w(coordinatorLayout, v2, savedState.a());
        int i2 = savedState.f10917d;
        if (i2 == 1 || i2 == 2) {
            this.l = 4;
        } else {
            this.l = i2;
        }
    }

    public Parcelable x(CoordinatorLayout coordinatorLayout, V v2) {
        return new SavedState(super.x(coordinatorLayout, v2), this.l);
    }

    public boolean z(CoordinatorLayout coordinatorLayout, V v2, View view, View view2, int i2, int i3) {
        this.o = 0;
        this.p = false;
        if ((i2 & 2) != 0) {
            return true;
        }
        return false;
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        final int f10917d;

        static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f10917d = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f10917d);
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.f10917d = i;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.BottomSheetBehavior_Layout);
        TypedValue peekValue = obtainStyledAttributes.peekValue(k.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (peekValue == null || (i2 = peekValue.data) != -1) {
            N(obtainStyledAttributes.getDimensionPixelSize(k.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        } else {
            N(i2);
        }
        M(obtainStyledAttributes.getBoolean(k.BottomSheetBehavior_Layout_behavior_hideable, false));
        L(obtainStyledAttributes.getBoolean(k.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        O(obtainStyledAttributes.getBoolean(k.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        obtainStyledAttributes.recycle();
        this.f10912b = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
