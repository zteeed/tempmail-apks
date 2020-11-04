package androidx.recyclerview.widget;

import a.h.k.c0.d;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.m;
import com.google.android.gms.ads.AdRequest;
import com.google.firebase.crashlytics.internal.proto.CodedOutputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RecyclerView extends ViewGroup implements a.h.k.j {
    private static final int[] A0 = {16843830};
    private static final int[] B0 = {16842987};
    static final boolean C0;
    static final boolean D0 = (Build.VERSION.SDK_INT >= 23);
    static final boolean E0 = (Build.VERSION.SDK_INT >= 16);
    static final boolean F0 = (Build.VERSION.SDK_INT >= 21);
    private static final boolean G0 = (Build.VERSION.SDK_INT <= 15);
    private static final boolean H0 = (Build.VERSION.SDK_INT <= 15);
    private static final Class<?>[] I0;
    static final Interpolator J0 = new c();
    private int A;
    boolean B;
    private final AccessibilityManager C;
    private List<p> D;
    boolean E;
    boolean F;
    private int G;
    private int H;
    private k I;
    private EdgeEffect J;
    private EdgeEffect K;
    private EdgeEffect L;
    private EdgeEffect M;
    l N;
    private int O;
    private int P;
    private VelocityTracker Q;
    private int R;
    private int S;
    private int T;
    private int U;
    private int V;
    private q W;
    private final int a0;

    /* renamed from: b  reason: collision with root package name */
    private final w f1665b;
    private final int b0;

    /* renamed from: c  reason: collision with root package name */
    final u f1666c;
    private float c0;

    /* renamed from: d  reason: collision with root package name */
    private SavedState f1667d;
    private float d0;

    /* renamed from: e  reason: collision with root package name */
    a f1668e;
    private boolean e0;

    /* renamed from: f  reason: collision with root package name */
    b f1669f;
    final a0 f0;
    final m g;
    e g0;
    boolean h;
    e.b h0;
    final Runnable i;
    final y i0;
    final Rect j;
    private s j0;
    private final Rect k;
    private List<s> k0;
    final RectF l;
    boolean l0;
    g m;
    boolean m0;
    LayoutManager n;
    private l.b n0;
    v o;
    boolean o0;
    final ArrayList<n> p;
    i p0;
    private final ArrayList<r> q;
    private j q0;
    private r r;
    private final int[] r0;
    boolean s;
    private a.h.k.l s0;
    boolean t;
    private final int[] t0;
    boolean u;
    final int[] u0;
    boolean v;
    private final int[] v0;
    private int w;
    final int[] w0;
    boolean x;
    final List<b0> x0;
    boolean y;
    private Runnable y0;
    private boolean z;
    private final m.b z0;

    public static abstract class LayoutManager {

        /* renamed from: a  reason: collision with root package name */
        b f1670a;

        /* renamed from: b  reason: collision with root package name */
        RecyclerView f1671b;

        /* renamed from: c  reason: collision with root package name */
        private final l.b f1672c = new a();

        /* renamed from: d  reason: collision with root package name */
        private final l.b f1673d = new b();

        /* renamed from: e  reason: collision with root package name */
        l f1674e = new l(this.f1672c);

        /* renamed from: f  reason: collision with root package name */
        l f1675f = new l(this.f1673d);
        x g;
        boolean h = false;
        boolean i = false;
        boolean j = false;
        private boolean k = true;
        private boolean l = true;
        int m;
        boolean n;
        private int o;
        private int p;
        private int q;
        private int r;

        public static class Properties {
            public int orientation;
            public boolean reverseLayout;
            public int spanCount;
            public boolean stackFromEnd;
        }

        class a implements l.b {
            a() {
            }

            public View a(int i) {
                return LayoutManager.this.H(i);
            }

            public int b(View view) {
                return LayoutManager.this.P(view) - ((o) view.getLayoutParams()).leftMargin;
            }

            public int c() {
                return LayoutManager.this.c0();
            }

            public int d() {
                return LayoutManager.this.m0() - LayoutManager.this.d0();
            }

            public int e(View view) {
                return LayoutManager.this.S(view) + ((o) view.getLayoutParams()).rightMargin;
            }
        }

        class b implements l.b {
            b() {
            }

            public View a(int i) {
                return LayoutManager.this.H(i);
            }

            public int b(View view) {
                return LayoutManager.this.T(view) - ((o) view.getLayoutParams()).topMargin;
            }

            public int c() {
                return LayoutManager.this.e0();
            }

            public int d() {
                return LayoutManager.this.V() - LayoutManager.this.b0();
            }

            public int e(View view) {
                return LayoutManager.this.N(view) + ((o) view.getLayoutParams()).bottomMargin;
            }
        }

        public interface c {
            void a(int i, int i2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            if (r5 == 1073741824) goto L_0x0021;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int J(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L_0x001a
                if (r7 < 0) goto L_0x0011
                goto L_0x001c
            L_0x0011:
                if (r7 != r1) goto L_0x002f
                if (r5 == r2) goto L_0x0021
                if (r5 == 0) goto L_0x002f
                if (r5 == r3) goto L_0x0021
                goto L_0x002f
            L_0x001a:
                if (r7 < 0) goto L_0x001f
            L_0x001c:
                r5 = 1073741824(0x40000000, float:2.0)
                goto L_0x0031
            L_0x001f:
                if (r7 != r1) goto L_0x0023
            L_0x0021:
                r7 = r4
                goto L_0x0031
            L_0x0023:
                if (r7 != r0) goto L_0x002f
                if (r5 == r2) goto L_0x002c
                if (r5 != r3) goto L_0x002a
                goto L_0x002c
            L_0x002a:
                r5 = 0
                goto L_0x0021
            L_0x002c:
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L_0x0021
            L_0x002f:
                r5 = 0
                r7 = 0
            L_0x0031:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.LayoutManager.J(int, int, int, int, boolean):int");
        }

        private int[] K(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            int[] iArr = new int[2];
            int c0 = c0();
            int e0 = e0();
            int m0 = m0() - d0();
            int V = V() - b0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i2 = left - c0;
            int min = Math.min(0, i2);
            int i3 = top - e0;
            int min2 = Math.min(0, i3);
            int i4 = width - m0;
            int max = Math.max(0, i4);
            int max2 = Math.max(0, height - V);
            if (X() != 1) {
                if (min == 0) {
                    min = Math.min(i2, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i4);
            }
            if (min2 == 0) {
                min2 = Math.min(i3, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        private void e(View view, int i2, boolean z) {
            b0 f0 = RecyclerView.f0(view);
            if (z || f0.u()) {
                this.f1671b.g.b(f0);
            } else {
                this.f1671b.g.p(f0);
            }
            o oVar = (o) view.getLayoutParams();
            if (f0.K() || f0.v()) {
                if (f0.v()) {
                    f0.J();
                } else {
                    f0.e();
                }
                this.f1670a.c(view, i2, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f1671b) {
                int m2 = this.f1670a.m(view);
                if (i2 == -1) {
                    i2 = this.f1670a.g();
                }
                if (m2 == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f1671b.indexOfChild(view) + this.f1671b.R());
                } else if (m2 != i2) {
                    this.f1671b.n.z0(m2, i2);
                }
            } else {
                this.f1670a.a(view, i2, false);
                oVar.f1708c = true;
                x xVar = this.g;
                if (xVar != null && xVar.c()) {
                    this.g.e(view);
                }
            }
            if (oVar.f1709d) {
                f0.f1686a.invalidate();
                oVar.f1709d = false;
            }
        }

        public static Properties g0(Context context, AttributeSet attributeSet, int i2, int i3) {
            Properties properties = new Properties();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.b.RecyclerView, i2, i3);
            properties.orientation = obtainStyledAttributes.getInt(a.o.b.RecyclerView_android_orientation, 1);
            properties.spanCount = obtainStyledAttributes.getInt(a.o.b.RecyclerView_spanCount, 1);
            properties.reverseLayout = obtainStyledAttributes.getBoolean(a.o.b.RecyclerView_reverseLayout, false);
            properties.stackFromEnd = obtainStyledAttributes.getBoolean(a.o.b.RecyclerView_stackFromEnd, false);
            obtainStyledAttributes.recycle();
            return properties;
        }

        public static int m(int i2, int i3, int i4) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i3, i4) : size;
            }
            return Math.min(size, Math.max(i3, i4));
        }

        private boolean r0(RecyclerView recyclerView, int i2, int i3) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int c0 = c0();
            int e0 = e0();
            int m0 = m0() - d0();
            int V = V() - b0();
            Rect rect = this.f1671b.j;
            O(focusedChild, rect);
            if (rect.left - i2 >= m0 || rect.right - i2 <= c0 || rect.top - i3 >= V || rect.bottom - i3 <= e0) {
                return false;
            }
            return true;
        }

        private void s1(u uVar, int i2, View view) {
            b0 f0 = RecyclerView.f0(view);
            if (!f0.I()) {
                if (!f0.s() || f0.u() || this.f1671b.m.f()) {
                    w(i2);
                    uVar.D(view);
                    this.f1671b.g.k(f0);
                    return;
                }
                n1(i2);
                uVar.C(f0);
            }
        }

        private static boolean u0(int i2, int i3, int i4) {
            int mode = View.MeasureSpec.getMode(i3);
            int size = View.MeasureSpec.getSize(i3);
            if (i4 > 0 && i2 != i4) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i2;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i2;
            }
            return true;
        }

        private void x(int i2, View view) {
            this.f1670a.d(i2);
        }

        public View A(View view) {
            View T;
            RecyclerView recyclerView = this.f1671b;
            if (recyclerView == null || (T = recyclerView.T(view)) == null || this.f1670a.n(T)) {
                return null;
            }
            return T;
        }

        public void A0(int i2) {
            RecyclerView recyclerView = this.f1671b;
            if (recyclerView != null) {
                recyclerView.y0(i2);
            }
        }

        /* access modifiers changed from: package-private */
        public void A1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f1671b = null;
                this.f1670a = null;
                this.q = 0;
                this.r = 0;
            } else {
                this.f1671b = recyclerView;
                this.f1670a = recyclerView.f1669f;
                this.q = recyclerView.getWidth();
                this.r = recyclerView.getHeight();
            }
            this.o = 1073741824;
            this.p = 1073741824;
        }

        public View B(int i2) {
            int I = I();
            for (int i3 = 0; i3 < I; i3++) {
                View H = H(i3);
                b0 f0 = RecyclerView.f0(H);
                if (f0 != null && f0.m() == i2 && !f0.I() && (this.f1671b.i0.e() || !f0.u())) {
                    return H;
                }
            }
            return null;
        }

        public void B0(int i2) {
            RecyclerView recyclerView = this.f1671b;
            if (recyclerView != null) {
                recyclerView.z0(i2);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean B1(View view, int i2, int i3, o oVar) {
            return view.isLayoutRequested() || !this.k || !u0(view.getWidth(), i2, oVar.width) || !u0(view.getHeight(), i3, oVar.height);
        }

        public abstract o C();

        public void C0(g gVar, g gVar2) {
        }

        /* access modifiers changed from: package-private */
        public boolean C1() {
            return false;
        }

        public o D(Context context, AttributeSet attributeSet) {
            return new o(context, attributeSet);
        }

        public boolean D0(RecyclerView recyclerView, ArrayList<View> arrayList, int i2, int i3) {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean D1(View view, int i2, int i3, o oVar) {
            return !this.k || !u0(view.getMeasuredWidth(), i2, oVar.width) || !u0(view.getMeasuredHeight(), i3, oVar.height);
        }

        public o E(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof o) {
                return new o((o) layoutParams);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new o((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new o(layoutParams);
        }

        public void E0(RecyclerView recyclerView) {
        }

        /* access modifiers changed from: package-private */
        public void E1() {
            x xVar = this.g;
            if (xVar != null) {
                xVar.g();
                throw null;
            }
        }

        public int F() {
            return -1;
        }

        @Deprecated
        public void F0(RecyclerView recyclerView) {
        }

        public boolean F1() {
            return false;
        }

        public int G(View view) {
            return ((o) view.getLayoutParams()).f1707b.bottom;
        }

        public void G0(RecyclerView recyclerView, u uVar) {
            F0(recyclerView);
        }

        public View H(int i2) {
            b bVar = this.f1670a;
            if (bVar != null) {
                return bVar.f(i2);
            }
            return null;
        }

        public View H0(View view, int i2, u uVar, y yVar) {
            return null;
        }

        public int I() {
            b bVar = this.f1670a;
            if (bVar != null) {
                return bVar.g();
            }
            return 0;
        }

        public void I0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f1671b;
            J0(recyclerView.f1666c, recyclerView.i0, accessibilityEvent);
        }

        public void J0(u uVar, y yVar, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f1671b;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !this.f1671b.canScrollVertically(-1) && !this.f1671b.canScrollHorizontally(-1) && !this.f1671b.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                g gVar = this.f1671b.m;
                if (gVar != null) {
                    accessibilityEvent.setItemCount(gVar.c());
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void K0(a.h.k.c0.d dVar) {
            RecyclerView recyclerView = this.f1671b;
            L0(recyclerView.f1666c, recyclerView.i0, dVar);
        }

        public boolean L() {
            RecyclerView recyclerView = this.f1671b;
            return recyclerView != null && recyclerView.h;
        }

        public void L0(u uVar, y yVar, a.h.k.c0.d dVar) {
            if (this.f1671b.canScrollVertically(-1) || this.f1671b.canScrollHorizontally(-1)) {
                dVar.a(8192);
                dVar.s0(true);
            }
            if (this.f1671b.canScrollVertically(1) || this.f1671b.canScrollHorizontally(1)) {
                dVar.a(CodedOutputStream.DEFAULT_BUFFER_SIZE);
                dVar.s0(true);
            }
            dVar.b0(d.b.a(i0(uVar, yVar), M(uVar, yVar), t0(uVar, yVar), j0(uVar, yVar)));
        }

        public int M(u uVar, y yVar) {
            RecyclerView recyclerView = this.f1671b;
            if (recyclerView == null || recyclerView.m == null || !j()) {
                return 1;
            }
            return this.f1671b.m.c();
        }

        /* access modifiers changed from: package-private */
        public void M0(View view, a.h.k.c0.d dVar) {
            b0 f0 = RecyclerView.f0(view);
            if (f0 != null && !f0.u() && !this.f1670a.n(f0.f1686a)) {
                RecyclerView recyclerView = this.f1671b;
                N0(recyclerView.f1666c, recyclerView.i0, view, dVar);
            }
        }

        public int N(View view) {
            return view.getBottom() + G(view);
        }

        public void N0(u uVar, y yVar, View view, a.h.k.c0.d dVar) {
            dVar.c0(d.c.a(k() ? f0(view) : 0, 1, j() ? f0(view) : 0, 1, false, false));
        }

        public void O(View view, Rect rect) {
            RecyclerView.g0(view, rect);
        }

        public View O0(View view, int i2) {
            return null;
        }

        public int P(View view) {
            return view.getLeft() - Y(view);
        }

        public void P0(RecyclerView recyclerView, int i2, int i3) {
        }

        public int Q(View view) {
            Rect rect = ((o) view.getLayoutParams()).f1707b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public void Q0(RecyclerView recyclerView) {
        }

        public int R(View view) {
            Rect rect = ((o) view.getLayoutParams()).f1707b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public void R0(RecyclerView recyclerView, int i2, int i3, int i4) {
        }

        public int S(View view) {
            return view.getRight() + h0(view);
        }

        public void S0(RecyclerView recyclerView, int i2, int i3) {
        }

        public int T(View view) {
            return view.getTop() - k0(view);
        }

        public void T0(RecyclerView recyclerView, int i2, int i3) {
        }

        public View U() {
            View focusedChild;
            RecyclerView recyclerView = this.f1671b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f1670a.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void U0(RecyclerView recyclerView, int i2, int i3, Object obj) {
            T0(recyclerView, i2, i3);
        }

        public int V() {
            return this.r;
        }

        public void V0(u uVar, y yVar) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public int W() {
            return this.p;
        }

        public void W0(y yVar) {
        }

        public int X() {
            return a.h.k.t.t(this.f1671b);
        }

        public void X0(u uVar, y yVar, int i2, int i3) {
            this.f1671b.x(i2, i3);
        }

        public int Y(View view) {
            return ((o) view.getLayoutParams()).f1707b.left;
        }

        @Deprecated
        public boolean Y0(RecyclerView recyclerView, View view, View view2) {
            return v0() || recyclerView.u0();
        }

        public int Z() {
            return a.h.k.t.u(this.f1671b);
        }

        public boolean Z0(RecyclerView recyclerView, y yVar, View view, View view2) {
            return Y0(recyclerView, view, view2);
        }

        public void a(View view) {
            b(view, -1);
        }

        public int a0() {
            return a.h.k.t.v(this.f1671b);
        }

        public void a1(Parcelable parcelable) {
        }

        public void b(View view, int i2) {
            e(view, i2, true);
        }

        public int b0() {
            RecyclerView recyclerView = this.f1671b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public Parcelable b1() {
            return null;
        }

        public void c(View view) {
            d(view, -1);
        }

        public int c0() {
            RecyclerView recyclerView = this.f1671b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public void c1(int i2) {
        }

        public void d(View view, int i2) {
            e(view, i2, false);
        }

        public int d0() {
            RecyclerView recyclerView = this.f1671b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        public boolean d1(int i2, Bundle bundle) {
            RecyclerView recyclerView = this.f1671b;
            return e1(recyclerView.f1666c, recyclerView.i0, i2, bundle);
        }

        public int e0() {
            RecyclerView recyclerView = this.f1671b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0070 A[ADDED_TO_REGION] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean e1(androidx.recyclerview.widget.RecyclerView.u r2, androidx.recyclerview.widget.RecyclerView.y r3, int r4, android.os.Bundle r5) {
            /*
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r2 = r1.f1671b
                r3 = 0
                if (r2 != 0) goto L_0x0006
                return r3
            L_0x0006:
                r5 = 4096(0x1000, float:5.74E-42)
                r0 = 1
                if (r4 == r5) goto L_0x0042
                r5 = 8192(0x2000, float:1.14794E-41)
                if (r4 == r5) goto L_0x0012
                r2 = 0
            L_0x0010:
                r4 = 0
                goto L_0x006e
            L_0x0012:
                r4 = -1
                boolean r2 = r2.canScrollVertically(r4)
                if (r2 == 0) goto L_0x0029
                int r2 = r1.V()
                int r5 = r1.e0()
                int r2 = r2 - r5
                int r5 = r1.b0()
                int r2 = r2 - r5
                int r2 = -r2
                goto L_0x002a
            L_0x0029:
                r2 = 0
            L_0x002a:
                androidx.recyclerview.widget.RecyclerView r5 = r1.f1671b
                boolean r4 = r5.canScrollHorizontally(r4)
                if (r4 == 0) goto L_0x0010
                int r4 = r1.m0()
                int r5 = r1.c0()
                int r4 = r4 - r5
                int r5 = r1.d0()
                int r4 = r4 - r5
                int r4 = -r4
                goto L_0x006e
            L_0x0042:
                boolean r2 = r2.canScrollVertically(r0)
                if (r2 == 0) goto L_0x0057
                int r2 = r1.V()
                int r4 = r1.e0()
                int r2 = r2 - r4
                int r4 = r1.b0()
                int r2 = r2 - r4
                goto L_0x0058
            L_0x0057:
                r2 = 0
            L_0x0058:
                androidx.recyclerview.widget.RecyclerView r4 = r1.f1671b
                boolean r4 = r4.canScrollHorizontally(r0)
                if (r4 == 0) goto L_0x0010
                int r4 = r1.m0()
                int r5 = r1.c0()
                int r4 = r4 - r5
                int r5 = r1.d0()
                int r4 = r4 - r5
            L_0x006e:
                if (r2 != 0) goto L_0x0073
                if (r4 != 0) goto L_0x0073
                return r3
            L_0x0073:
                androidx.recyclerview.widget.RecyclerView r3 = r1.f1671b
                r3.j1(r4, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.LayoutManager.e1(androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$y, int, android.os.Bundle):boolean");
        }

        public void f(String str) {
            RecyclerView recyclerView = this.f1671b;
            if (recyclerView != null) {
                recyclerView.p(str);
            }
        }

        public int f0(View view) {
            return ((o) view.getLayoutParams()).a();
        }

        /* access modifiers changed from: package-private */
        public boolean f1(View view, int i2, Bundle bundle) {
            RecyclerView recyclerView = this.f1671b;
            return g1(recyclerView.f1666c, recyclerView.i0, view, i2, bundle);
        }

        public void g(View view, int i2) {
            h(view, i2, (o) view.getLayoutParams());
        }

        public boolean g1(u uVar, y yVar, View view, int i2, Bundle bundle) {
            return false;
        }

        public void h(View view, int i2, o oVar) {
            b0 f0 = RecyclerView.f0(view);
            if (f0.u()) {
                this.f1671b.g.b(f0);
            } else {
                this.f1671b.g.p(f0);
            }
            this.f1670a.c(view, i2, oVar, f0.u());
        }

        public int h0(View view) {
            return ((o) view.getLayoutParams()).f1707b.right;
        }

        public void h1(u uVar) {
            for (int I = I() - 1; I >= 0; I--) {
                if (!RecyclerView.f0(H(I)).I()) {
                    k1(I, uVar);
                }
            }
        }

        public void i(View view, Rect rect) {
            RecyclerView recyclerView = this.f1671b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.j0(view));
            }
        }

        public int i0(u uVar, y yVar) {
            RecyclerView recyclerView = this.f1671b;
            if (recyclerView == null || recyclerView.m == null || !k()) {
                return 1;
            }
            return this.f1671b.m.c();
        }

        /* access modifiers changed from: package-private */
        public void i1(u uVar) {
            int j2 = uVar.j();
            for (int i2 = j2 - 1; i2 >= 0; i2--) {
                View n2 = uVar.n(i2);
                b0 f0 = RecyclerView.f0(n2);
                if (!f0.I()) {
                    f0.F(false);
                    if (f0.w()) {
                        this.f1671b.removeDetachedView(n2, false);
                    }
                    l lVar = this.f1671b.N;
                    if (lVar != null) {
                        lVar.j(f0);
                    }
                    f0.F(true);
                    uVar.y(n2);
                }
            }
            uVar.e();
            if (j2 > 0) {
                this.f1671b.invalidate();
            }
        }

        public boolean j() {
            return false;
        }

        public int j0(u uVar, y yVar) {
            return 0;
        }

        public void j1(View view, u uVar) {
            m1(view);
            uVar.B(view);
        }

        public boolean k() {
            return false;
        }

        public int k0(View view) {
            return ((o) view.getLayoutParams()).f1707b.top;
        }

        public void k1(int i2, u uVar) {
            View H = H(i2);
            n1(i2);
            uVar.B(H);
        }

        public boolean l(o oVar) {
            return oVar != null;
        }

        public void l0(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((o) view.getLayoutParams()).f1707b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (!(this.f1671b == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.f1671b.l;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public boolean l1(Runnable runnable) {
            RecyclerView recyclerView = this.f1671b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public int m0() {
            return this.q;
        }

        public void m1(View view) {
            this.f1670a.p(view);
        }

        public void n(int i2, int i3, y yVar, c cVar) {
        }

        public int n0() {
            return this.o;
        }

        public void n1(int i2) {
            if (H(i2) != null) {
                this.f1670a.q(i2);
            }
        }

        public void o(int i2, c cVar) {
        }

        /* access modifiers changed from: package-private */
        public boolean o0() {
            int I = I();
            for (int i2 = 0; i2 < I; i2++) {
                ViewGroup.LayoutParams layoutParams = H(i2).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public boolean o1(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return p1(recyclerView, view, rect, z, false);
        }

        public int p(y yVar) {
            return 0;
        }

        public boolean p0() {
            return this.i;
        }

        public boolean p1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] K = K(recyclerView, view, rect, z);
            int i2 = K[0];
            int i3 = K[1];
            if ((z2 && !r0(recyclerView, i2, i3)) || (i2 == 0 && i3 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i2, i3);
            } else {
                recyclerView.j1(i2, i3);
            }
            return true;
        }

        public int q(y yVar) {
            return 0;
        }

        public boolean q0() {
            return this.j;
        }

        public void q1() {
            RecyclerView recyclerView = this.f1671b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public int r(y yVar) {
            return 0;
        }

        public void r1() {
            this.h = true;
        }

        public int s(y yVar) {
            return 0;
        }

        public final boolean s0() {
            return this.l;
        }

        public int t(y yVar) {
            return 0;
        }

        public boolean t0(u uVar, y yVar) {
            return false;
        }

        public int t1(int i2, u uVar, y yVar) {
            return 0;
        }

        public int u(y yVar) {
            return 0;
        }

        public int u1(int i2, u uVar, y yVar) {
            return 0;
        }

        public void v(u uVar) {
            for (int I = I() - 1; I >= 0; I--) {
                s1(uVar, I, H(I));
            }
        }

        public boolean v0() {
            x xVar = this.g;
            return xVar != null && xVar.c();
        }

        /* access modifiers changed from: package-private */
        public void v1(RecyclerView recyclerView) {
            w1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public void w(int i2) {
            x(i2, H(i2));
        }

        public boolean w0(View view, boolean z, boolean z2) {
            boolean z3 = this.f1674e.b(view, 24579) && this.f1675f.b(view, 24579);
            return z ? z3 : !z3;
        }

        /* access modifiers changed from: package-private */
        public void w1(int i2, int i3) {
            this.q = View.MeasureSpec.getSize(i2);
            int mode = View.MeasureSpec.getMode(i2);
            this.o = mode;
            if (mode == 0 && !RecyclerView.D0) {
                this.q = 0;
            }
            this.r = View.MeasureSpec.getSize(i3);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.p = mode2;
            if (mode2 == 0 && !RecyclerView.D0) {
                this.r = 0;
            }
        }

        public void x0(View view, int i2, int i3, int i4, int i5) {
            o oVar = (o) view.getLayoutParams();
            Rect rect = oVar.f1707b;
            view.layout(i2 + rect.left + oVar.leftMargin, i3 + rect.top + oVar.topMargin, (i4 - rect.right) - oVar.rightMargin, (i5 - rect.bottom) - oVar.bottomMargin);
        }

        public void x1(int i2, int i3) {
            this.f1671b.setMeasuredDimension(i2, i3);
        }

        /* access modifiers changed from: package-private */
        public void y(RecyclerView recyclerView) {
            this.i = true;
            E0(recyclerView);
        }

        public void y0(View view, int i2, int i3) {
            o oVar = (o) view.getLayoutParams();
            Rect j0 = this.f1671b.j0(view);
            int i4 = i2 + j0.left + j0.right;
            int i5 = i3 + j0.top + j0.bottom;
            int J = J(m0(), n0(), c0() + d0() + oVar.leftMargin + oVar.rightMargin + i4, oVar.width, j());
            int J2 = J(V(), W(), e0() + b0() + oVar.topMargin + oVar.bottomMargin + i5, oVar.height, k());
            if (B1(view, J, J2, oVar)) {
                view.measure(J, J2);
            }
        }

        public void y1(Rect rect, int i2, int i3) {
            x1(m(i2, rect.width() + c0() + d0(), a0()), m(i3, rect.height() + e0() + b0(), Z()));
        }

        /* access modifiers changed from: package-private */
        public void z(RecyclerView recyclerView, u uVar) {
            this.i = false;
            G0(recyclerView, uVar);
        }

        public void z0(int i2, int i3) {
            View H = H(i2);
            if (H != null) {
                w(i2);
                g(H, i3);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i2 + this.f1671b.toString());
        }

        /* access modifiers changed from: package-private */
        public void z1(int i2, int i3) {
            int I = I();
            if (I == 0) {
                this.f1671b.x(i2, i3);
                return;
            }
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MAX_VALUE;
            int i7 = Integer.MAX_VALUE;
            for (int i8 = 0; i8 < I; i8++) {
                View H = H(i8);
                Rect rect = this.f1671b.j;
                O(H, rect);
                int i9 = rect.left;
                if (i9 < i6) {
                    i6 = i9;
                }
                int i10 = rect.right;
                if (i10 > i4) {
                    i4 = i10;
                }
                int i11 = rect.top;
                if (i11 < i7) {
                    i7 = i11;
                }
                int i12 = rect.bottom;
                if (i12 > i5) {
                    i5 = i12;
                }
            }
            this.f1671b.j.set(i6, i7, i4, i5);
            y1(this.f1671b.j, i2, i3);
        }
    }

    class a implements Runnable {
        a() {
        }

        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.v && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.s) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.y) {
                    recyclerView2.x = true;
                } else {
                    recyclerView2.v();
                }
            }
        }
    }

    class a0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private int f1680b;

        /* renamed from: c  reason: collision with root package name */
        private int f1681c;

        /* renamed from: d  reason: collision with root package name */
        OverScroller f1682d;

        /* renamed from: e  reason: collision with root package name */
        Interpolator f1683e = RecyclerView.J0;

        /* renamed from: f  reason: collision with root package name */
        private boolean f1684f = false;
        private boolean g = false;

        a0() {
            this.f1682d = new OverScroller(RecyclerView.this.getContext(), RecyclerView.J0);
        }

        private int a(int i, int i2, int i3, int i4) {
            int i5;
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            int sqrt = (int) Math.sqrt((double) ((i3 * i3) + (i4 * i4)));
            int sqrt2 = (int) Math.sqrt((double) ((i * i) + (i2 * i2)));
            RecyclerView recyclerView = RecyclerView.this;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            int i6 = width / 2;
            float f2 = (float) width;
            float f3 = (float) i6;
            float c2 = f3 + (c(Math.min(1.0f, (((float) sqrt2) * 1.0f) / f2)) * f3);
            if (sqrt > 0) {
                i5 = Math.round(Math.abs(c2 / ((float) sqrt)) * 1000.0f) * 4;
            } else {
                if (!z) {
                    abs = abs2;
                }
                i5 = (int) (((((float) abs) / f2) + 1.0f) * 300.0f);
            }
            return Math.min(i5, 2000);
        }

        private void b() {
            this.g = false;
            this.f1684f = true;
        }

        private float c(float f2) {
            return (float) Math.sin((double) ((f2 - 0.5f) * 0.47123894f));
        }

        private void d() {
            this.f1684f = false;
            if (this.g) {
                f();
            }
        }

        public void e(int i, int i2) {
            RecyclerView.this.setScrollState(2);
            this.f1681c = 0;
            this.f1680b = 0;
            this.f1682d.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            f();
        }

        /* access modifiers changed from: package-private */
        public void f() {
            if (this.f1684f) {
                this.g = true;
                return;
            }
            RecyclerView.this.removeCallbacks(this);
            a.h.k.t.V(RecyclerView.this, this);
        }

        public void g(int i, int i2, int i3, Interpolator interpolator) {
            if (this.f1683e != interpolator) {
                this.f1683e = interpolator;
                this.f1682d = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            RecyclerView.this.setScrollState(2);
            this.f1681c = 0;
            this.f1680b = 0;
            this.f1682d.startScroll(0, 0, i, i2, i3);
            if (Build.VERSION.SDK_INT < 23) {
                this.f1682d.computeScrollOffset();
            }
            f();
        }

        public void h(int i, int i2, Interpolator interpolator) {
            int a2 = a(i, i2, 0, 0);
            if (interpolator == null) {
                interpolator = RecyclerView.J0;
            }
            g(i, i2, a2, interpolator);
        }

        public void i() {
            RecyclerView.this.removeCallbacks(this);
            this.f1682d.abortAnimation();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ee, code lost:
            if (r9 > 0) goto L_0x00f2;
         */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00ea  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x00fa  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r23 = this;
                r0 = r23
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r1.n
                if (r1 != 0) goto L_0x000c
                r23.i()
                return
            L_0x000c:
                r23.b()
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                r1.v()
                android.widget.OverScroller r1 = r0.f1682d
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$LayoutManager r2 = r2.n
                androidx.recyclerview.widget.RecyclerView$x r2 = r2.g
                boolean r3 = r1.computeScrollOffset()
                r4 = 0
                r5 = 0
                if (r3 == 0) goto L_0x018e
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                int[] r3 = r3.u0
                int r12 = r1.getCurrX()
                int r13 = r1.getCurrY()
                int r6 = r0.f1680b
                int r14 = r12 - r6
                int r6 = r0.f1681c
                int r15 = r13 - r6
                r0.f1680b = r12
                r0.f1681c = r13
                androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
                r10 = 0
                r11 = 1
                r7 = r14
                r8 = r15
                r9 = r3
                boolean r6 = r6.G(r7, r8, r9, r10, r11)
                r7 = 1
                if (r6 == 0) goto L_0x0050
                r6 = r3[r5]
                int r14 = r14 - r6
                r3 = r3[r7]
                int r15 = r15 - r3
            L_0x0050:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r6 = r3.m
                if (r6 == 0) goto L_0x009d
                int[] r6 = r3.w0
                r3.f1(r14, r15, r6)
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                int[] r3 = r3.w0
                r6 = r3[r5]
                r3 = r3[r7]
                int r8 = r14 - r6
                int r9 = r15 - r3
                if (r2 == 0) goto L_0x00a1
                boolean r10 = r2.b()
                if (r10 != 0) goto L_0x00a1
                boolean r10 = r2.c()
                if (r10 == 0) goto L_0x00a1
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$y r10 = r10.i0
                int r10 = r10.b()
                if (r10 == 0) goto L_0x0099
                int r11 = r2.a()
                if (r11 < r10) goto L_0x0091
                int r10 = r10 - r7
                r2.f(r10)
                int r10 = r14 - r8
                int r11 = r15 - r9
                r2.d(r10, r11)
                goto L_0x00a1
            L_0x0091:
                int r10 = r14 - r8
                int r11 = r15 - r9
                r2.d(r10, r11)
                goto L_0x00a1
            L_0x0099:
                r2.g()
                throw r4
            L_0x009d:
                r3 = 0
                r6 = 0
                r8 = 0
                r9 = 0
            L_0x00a1:
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$n> r10 = r10.p
                boolean r10 = r10.isEmpty()
                if (r10 != 0) goto L_0x00b0
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                r10.invalidate()
            L_0x00b0:
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                int r10 = r10.getOverScrollMode()
                r11 = 2
                if (r10 == r11) goto L_0x00be
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                r10.u(r14, r15)
            L_0x00be:
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                r21 = 0
                r22 = 1
                r16 = r10
                r17 = r6
                r18 = r3
                r19 = r8
                r20 = r9
                boolean r10 = r16.H(r17, r18, r19, r20, r21, r22)
                if (r10 != 0) goto L_0x0116
                if (r8 != 0) goto L_0x00d8
                if (r9 == 0) goto L_0x0116
            L_0x00d8:
                float r10 = r1.getCurrVelocity()
                int r10 = (int) r10
                if (r8 == r12) goto L_0x00e7
                if (r8 >= 0) goto L_0x00e3
                int r4 = -r10
                goto L_0x00e8
            L_0x00e3:
                if (r8 <= 0) goto L_0x00e7
                r4 = r10
                goto L_0x00e8
            L_0x00e7:
                r4 = 0
            L_0x00e8:
                if (r9 == r13) goto L_0x00f1
                if (r9 >= 0) goto L_0x00ee
                int r10 = -r10
                goto L_0x00f2
            L_0x00ee:
                if (r9 <= 0) goto L_0x00f1
                goto L_0x00f2
            L_0x00f1:
                r10 = 0
            L_0x00f2:
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                int r5 = r5.getOverScrollMode()
                if (r5 == r11) goto L_0x00ff
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                r5.c(r4, r10)
            L_0x00ff:
                if (r4 != 0) goto L_0x0109
                if (r8 == r12) goto L_0x0109
                int r4 = r1.getFinalX()
                if (r4 != 0) goto L_0x0116
            L_0x0109:
                if (r10 != 0) goto L_0x0113
                if (r9 == r13) goto L_0x0113
                int r4 = r1.getFinalY()
                if (r4 != 0) goto L_0x0116
            L_0x0113:
                r1.abortAnimation()
            L_0x0116:
                if (r6 != 0) goto L_0x011a
                if (r3 == 0) goto L_0x011f
            L_0x011a:
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                r4.L(r6, r3)
            L_0x011f:
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                boolean r4 = r4.awakenScrollBars()
                if (r4 != 0) goto L_0x012c
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                r4.invalidate()
            L_0x012c:
                if (r15 == 0) goto L_0x013c
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$LayoutManager r4 = r4.n
                boolean r4 = r4.k()
                if (r4 == 0) goto L_0x013c
                if (r3 != r15) goto L_0x013c
                r3 = 1
                goto L_0x013d
            L_0x013c:
                r3 = 0
            L_0x013d:
                if (r14 == 0) goto L_0x014d
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$LayoutManager r4 = r4.n
                boolean r4 = r4.j()
                if (r4 == 0) goto L_0x014d
                if (r6 != r14) goto L_0x014d
                r4 = 1
                goto L_0x014e
            L_0x014d:
                r4 = 0
            L_0x014e:
                if (r14 != 0) goto L_0x0152
                if (r15 == 0) goto L_0x0159
            L_0x0152:
                if (r4 != 0) goto L_0x0159
                if (r3 == 0) goto L_0x0157
                goto L_0x0159
            L_0x0157:
                r3 = 0
                goto L_0x015a
            L_0x0159:
                r3 = 1
            L_0x015a:
                boolean r1 = r1.isFinished()
                if (r1 != 0) goto L_0x0178
                if (r3 != 0) goto L_0x016b
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                boolean r1 = r1.l0(r7)
                if (r1 != 0) goto L_0x016b
                goto L_0x0178
            L_0x016b:
                r23.f()
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.e r3 = r1.g0
                if (r3 == 0) goto L_0x018e
                r3.f(r1, r14, r15)
                goto L_0x018e
            L_0x0178:
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                r3 = 0
                r1.setScrollState(r3)
                boolean r1 = androidx.recyclerview.widget.RecyclerView.F0
                if (r1 == 0) goto L_0x0189
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.e$b r1 = r1.h0
                r1.b()
            L_0x0189:
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                r1.a(r7)
            L_0x018e:
                if (r2 == 0) goto L_0x01a4
                boolean r1 = r2.b()
                if (r1 == 0) goto L_0x019a
                r1 = 0
                r2.d(r1, r1)
            L_0x019a:
                boolean r1 = r0.g
                if (r1 == 0) goto L_0x019f
                goto L_0x01a4
            L_0x019f:
                r2.g()
                r1 = 0
                throw r1
            L_0x01a4:
                r23.d()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.a0.run():void");
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            l lVar = RecyclerView.this.N;
            if (lVar != null) {
                lVar.u();
            }
            RecyclerView.this.o0 = false;
        }
    }

    public static abstract class b0 {
        private static final List<Object> s = Collections.emptyList();

        /* renamed from: a  reason: collision with root package name */
        public final View f1686a;

        /* renamed from: b  reason: collision with root package name */
        WeakReference<RecyclerView> f1687b;

        /* renamed from: c  reason: collision with root package name */
        int f1688c = -1;

        /* renamed from: d  reason: collision with root package name */
        int f1689d = -1;

        /* renamed from: e  reason: collision with root package name */
        long f1690e = -1;

        /* renamed from: f  reason: collision with root package name */
        int f1691f = -1;
        int g = -1;
        b0 h = null;
        b0 i = null;
        int j;
        List<Object> k = null;
        List<Object> l = null;
        private int m = 0;
        u n = null;
        boolean o = false;
        private int p = 0;
        int q = -1;
        RecyclerView r;

        public b0(View view) {
            if (view != null) {
                this.f1686a = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        private void g() {
            if (this.k == null) {
                ArrayList arrayList = new ArrayList();
                this.k = arrayList;
                this.l = Collections.unmodifiableList(arrayList);
            }
        }

        /* access modifiers changed from: package-private */
        public void A(RecyclerView recyclerView) {
            int i2 = this.q;
            if (i2 != -1) {
                this.p = i2;
            } else {
                this.p = a.h.k.t.r(this.f1686a);
            }
            recyclerView.h1(this, 4);
        }

        /* access modifiers changed from: package-private */
        public void B(RecyclerView recyclerView) {
            recyclerView.h1(this, this.p);
            this.p = 0;
        }

        /* access modifiers changed from: package-private */
        public void C() {
            this.j = 0;
            this.f1688c = -1;
            this.f1689d = -1;
            this.f1690e = -1;
            this.g = -1;
            this.m = 0;
            this.h = null;
            this.i = null;
            d();
            this.p = 0;
            this.q = -1;
            RecyclerView.s(this);
        }

        /* access modifiers changed from: package-private */
        public void D() {
            if (this.f1689d == -1) {
                this.f1689d = this.f1688c;
            }
        }

        /* access modifiers changed from: package-private */
        public void E(int i2, int i3) {
            this.j = (i2 & i3) | (this.j & (~i3));
        }

        public final void F(boolean z) {
            int i2 = this.m;
            int i3 = z ? i2 - 1 : i2 + 1;
            this.m = i3;
            if (i3 < 0) {
                this.m = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z && i3 == 1) {
                this.j |= 16;
            } else if (z && this.m == 0) {
                this.j &= -17;
            }
        }

        /* access modifiers changed from: package-private */
        public void G(u uVar, boolean z) {
            this.n = uVar;
            this.o = z;
        }

        /* access modifiers changed from: package-private */
        public boolean H() {
            return (this.j & 16) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean I() {
            return (this.j & 128) != 0;
        }

        /* access modifiers changed from: package-private */
        public void J() {
            this.n.J(this);
        }

        /* access modifiers changed from: package-private */
        public boolean K() {
            return (this.j & 32) != 0;
        }

        /* access modifiers changed from: package-private */
        public void a(Object obj) {
            if (obj == null) {
                b(1024);
            } else if ((1024 & this.j) == 0) {
                g();
                this.k.add(obj);
            }
        }

        /* access modifiers changed from: package-private */
        public void b(int i2) {
            this.j = i2 | this.j;
        }

        /* access modifiers changed from: package-private */
        public void c() {
            this.f1689d = -1;
            this.g = -1;
        }

        /* access modifiers changed from: package-private */
        public void d() {
            List<Object> list = this.k;
            if (list != null) {
                list.clear();
            }
            this.j &= -1025;
        }

        /* access modifiers changed from: package-private */
        public void e() {
            this.j &= -33;
        }

        /* access modifiers changed from: package-private */
        public void f() {
            this.j &= -257;
        }

        /* access modifiers changed from: package-private */
        public boolean h() {
            return (this.j & 16) == 0 && a.h.k.t.F(this.f1686a);
        }

        /* access modifiers changed from: package-private */
        public void i(int i2, int i3, boolean z) {
            b(8);
            z(i3, z);
            this.f1688c = i2;
        }

        public final int j() {
            RecyclerView recyclerView = this.r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.c0(this);
        }

        public final long k() {
            return this.f1690e;
        }

        public final int l() {
            return this.f1691f;
        }

        public final int m() {
            int i2 = this.g;
            return i2 == -1 ? this.f1688c : i2;
        }

        public final int n() {
            return this.f1689d;
        }

        /* access modifiers changed from: package-private */
        public List<Object> o() {
            if ((this.j & 1024) != 0) {
                return s;
            }
            List<Object> list = this.k;
            if (list == null || list.size() == 0) {
                return s;
            }
            return this.l;
        }

        /* access modifiers changed from: package-private */
        public boolean p(int i2) {
            return (i2 & this.j) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean q() {
            return (this.j & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 || s();
        }

        /* access modifiers changed from: package-private */
        public boolean r() {
            return (this.j & 1) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean s() {
            return (this.j & 4) != 0;
        }

        public final boolean t() {
            return (this.j & 16) == 0 && !a.h.k.t.F(this.f1686a);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.f1688c + " id=" + this.f1690e + ", oldPos=" + this.f1689d + ", pLpos:" + this.g);
            if (v()) {
                sb.append(" scrap ");
                sb.append(this.o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (s()) {
                sb.append(" invalid");
            }
            if (!r()) {
                sb.append(" unbound");
            }
            if (y()) {
                sb.append(" update");
            }
            if (u()) {
                sb.append(" removed");
            }
            if (I()) {
                sb.append(" ignored");
            }
            if (w()) {
                sb.append(" tmpDetached");
            }
            if (!t()) {
                sb.append(" not recyclable(" + this.m + ")");
            }
            if (q()) {
                sb.append(" undefined adapter position");
            }
            if (this.f1686a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        /* access modifiers changed from: package-private */
        public boolean u() {
            return (this.j & 8) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean v() {
            return this.n != null;
        }

        /* access modifiers changed from: package-private */
        public boolean w() {
            return (this.j & 256) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean x() {
            return (this.j & 2) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean y() {
            return (this.j & 2) != 0;
        }

        /* access modifiers changed from: package-private */
        public void z(int i2, boolean z) {
            if (this.f1689d == -1) {
                this.f1689d = this.f1688c;
            }
            if (this.g == -1) {
                this.g = this.f1688c;
            }
            if (z) {
                this.g += i2;
            }
            this.f1688c += i2;
            if (this.f1686a.getLayoutParams() != null) {
                ((o) this.f1686a.getLayoutParams()).f1708c = true;
            }
        }
    }

    static class c implements Interpolator {
        c() {
        }

        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }

    class d implements m.b {
        d() {
        }

        public void a(b0 b0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.n.j1(b0Var.f1686a, recyclerView.f1666c);
        }

        public void b(b0 b0Var, l.c cVar, l.c cVar2) {
            RecyclerView.this.m(b0Var, cVar, cVar2);
        }

        public void c(b0 b0Var, l.c cVar, l.c cVar2) {
            RecyclerView.this.f1666c.J(b0Var);
            RecyclerView.this.o(b0Var, cVar, cVar2);
        }

        public void d(b0 b0Var, l.c cVar, l.c cVar2) {
            b0Var.F(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.E) {
                if (recyclerView.N.b(b0Var, b0Var, cVar, cVar2)) {
                    RecyclerView.this.L0();
                }
            } else if (recyclerView.N.d(b0Var, cVar, cVar2)) {
                RecyclerView.this.L0();
            }
        }
    }

    class e implements b.C0048b {
        e() {
        }

        public View a(int i) {
            return RecyclerView.this.getChildAt(i);
        }

        public void b(View view) {
            b0 f0 = RecyclerView.f0(view);
            if (f0 != null) {
                f0.A(RecyclerView.this);
            }
        }

        public int c() {
            return RecyclerView.this.getChildCount();
        }

        public void d() {
            int c2 = c();
            for (int i = 0; i < c2; i++) {
                View a2 = a(i);
                RecyclerView.this.A(a2);
                a2.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        public int e(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        public b0 f(View view) {
            return RecyclerView.f0(view);
        }

        public void g(int i) {
            b0 f0;
            View a2 = a(i);
            if (!(a2 == null || (f0 = RecyclerView.f0(a2)) == null)) {
                if (!f0.w() || f0.I()) {
                    f0.b(256);
                } else {
                    throw new IllegalArgumentException("called detach on an already detached child " + f0 + RecyclerView.this.R());
                }
            }
            RecyclerView.this.detachViewFromParent(i);
        }

        public void h(View view) {
            b0 f0 = RecyclerView.f0(view);
            if (f0 != null) {
                f0.B(RecyclerView.this);
            }
        }

        public void i(View view, int i) {
            RecyclerView.this.addView(view, i);
            RecyclerView.this.z(view);
        }

        public void j(int i) {
            View childAt = RecyclerView.this.getChildAt(i);
            if (childAt != null) {
                RecyclerView.this.A(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i);
        }

        public void k(View view, int i, ViewGroup.LayoutParams layoutParams) {
            b0 f0 = RecyclerView.f0(view);
            if (f0 != null) {
                if (f0.w() || f0.I()) {
                    f0.f();
                } else {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + f0 + RecyclerView.this.R());
                }
            }
            RecyclerView.this.attachViewToParent(view, i, layoutParams);
        }
    }

    class f implements a.C0047a {
        f() {
        }

        public void a(int i, int i2) {
            RecyclerView.this.B0(i, i2);
            RecyclerView.this.l0 = true;
        }

        public void b(a.b bVar) {
            i(bVar);
        }

        public void c(int i, int i2, Object obj) {
            RecyclerView.this.q1(i, i2, obj);
            RecyclerView.this.m0 = true;
        }

        public void d(a.b bVar) {
            i(bVar);
        }

        public b0 e(int i) {
            b0 a0 = RecyclerView.this.a0(i, true);
            if (a0 != null && !RecyclerView.this.f1669f.n(a0.f1686a)) {
                return a0;
            }
            return null;
        }

        public void f(int i, int i2) {
            RecyclerView.this.C0(i, i2, false);
            RecyclerView.this.l0 = true;
        }

        public void g(int i, int i2) {
            RecyclerView.this.A0(i, i2);
            RecyclerView.this.l0 = true;
        }

        public void h(int i, int i2) {
            RecyclerView.this.C0(i, i2, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.l0 = true;
            recyclerView.i0.f1726d += i2;
        }

        /* access modifiers changed from: package-private */
        public void i(a.b bVar) {
            int i = bVar.f1761a;
            if (i == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.n.P0(recyclerView, bVar.f1762b, bVar.f1764d);
            } else if (i == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.n.S0(recyclerView2, bVar.f1762b, bVar.f1764d);
            } else if (i == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.n.U0(recyclerView3, bVar.f1762b, bVar.f1764d, bVar.f1763c);
            } else if (i == 8) {
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.n.R0(recyclerView4, bVar.f1762b, bVar.f1764d, 1);
            }
        }
    }

    public static abstract class g<VH extends b0> {

        /* renamed from: a  reason: collision with root package name */
        private final h f1695a = new h();

        /* renamed from: b  reason: collision with root package name */
        private boolean f1696b = false;

        public final void a(VH vh, int i) {
            vh.f1688c = i;
            if (f()) {
                vh.f1690e = d(i);
            }
            vh.E(1, 519);
            androidx.core.os.a.a("RV OnBindView");
            l(vh, i, vh.o());
            vh.d();
            ViewGroup.LayoutParams layoutParams = vh.f1686a.getLayoutParams();
            if (layoutParams instanceof o) {
                ((o) layoutParams).f1708c = true;
            }
            androidx.core.os.a.b();
        }

        public final VH b(ViewGroup viewGroup, int i) {
            try {
                androidx.core.os.a.a("RV CreateView");
                VH m = m(viewGroup, i);
                if (m.f1686a.getParent() == null) {
                    m.f1691f = i;
                    return m;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                androidx.core.os.a.b();
            }
        }

        public abstract int c();

        public long d(int i) {
            return -1;
        }

        public int e(int i) {
            return 0;
        }

        public final boolean f() {
            return this.f1696b;
        }

        public final void g() {
            this.f1695a.a();
        }

        public final void h(int i) {
            this.f1695a.b(i, 1);
        }

        public final void i(int i) {
            this.f1695a.d(i, 1);
        }

        public void j(RecyclerView recyclerView) {
        }

        public abstract void k(VH vh, int i);

        public void l(VH vh, int i, List<Object> list) {
            k(vh, i);
        }

        public abstract VH m(ViewGroup viewGroup, int i);

        public void n(RecyclerView recyclerView) {
        }

        public boolean o(VH vh) {
            return false;
        }

        public void p(VH vh) {
        }

        public void q(VH vh) {
        }

        public void r(VH vh) {
        }

        public void s(i iVar) {
            this.f1695a.registerObserver(iVar);
        }

        public void t(i iVar) {
            this.f1695a.unregisterObserver(iVar);
        }
    }

    static class h extends Observable<i> {
        h() {
        }

        public void a() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((i) this.mObservers.get(size)).a();
            }
        }

        public void b(int i, int i2) {
            c(i, i2, (Object) null);
        }

        public void c(int i, int i2, Object obj) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((i) this.mObservers.get(size)).c(i, i2, obj);
            }
        }

        public void d(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((i) this.mObservers.get(size)).d(i, i2);
            }
        }
    }

    public static abstract class i {
        public void a() {
        }

        public void b(int i, int i2) {
        }

        public void c(int i, int i2, Object obj) {
            b(i, i2);
        }

        public void d(int i, int i2) {
        }
    }

    public interface j {
        int a(int i, int i2);
    }

    public static class k {
        /* access modifiers changed from: protected */
        public EdgeEffect a(RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class l {

        /* renamed from: a  reason: collision with root package name */
        private b f1697a = null;

        /* renamed from: b  reason: collision with root package name */
        private ArrayList<a> f1698b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        private long f1699c = 120;

        /* renamed from: d  reason: collision with root package name */
        private long f1700d = 120;

        /* renamed from: e  reason: collision with root package name */
        private long f1701e = 250;

        /* renamed from: f  reason: collision with root package name */
        private long f1702f = 250;

        public interface a {
            void a();
        }

        interface b {
            void a(b0 b0Var);
        }

        public static class c {

            /* renamed from: a  reason: collision with root package name */
            public int f1703a;

            /* renamed from: b  reason: collision with root package name */
            public int f1704b;

            public c a(b0 b0Var) {
                b(b0Var, 0);
                return this;
            }

            public c b(b0 b0Var, int i) {
                View view = b0Var.f1686a;
                this.f1703a = view.getLeft();
                this.f1704b = view.getTop();
                view.getRight();
                view.getBottom();
                return this;
            }
        }

        static int e(b0 b0Var) {
            int i = b0Var.j & 14;
            if (b0Var.s()) {
                return 4;
            }
            if ((i & 4) != 0) {
                return i;
            }
            int n = b0Var.n();
            int j = b0Var.j();
            return (n == -1 || j == -1 || n == j) ? i : i | 2048;
        }

        public abstract boolean a(b0 b0Var, c cVar, c cVar2);

        public abstract boolean b(b0 b0Var, b0 b0Var2, c cVar, c cVar2);

        public abstract boolean c(b0 b0Var, c cVar, c cVar2);

        public abstract boolean d(b0 b0Var, c cVar, c cVar2);

        public abstract boolean f(b0 b0Var);

        public boolean g(b0 b0Var, List<Object> list) {
            return f(b0Var);
        }

        public final void h(b0 b0Var) {
            r(b0Var);
            b bVar = this.f1697a;
            if (bVar != null) {
                bVar.a(b0Var);
            }
        }

        public final void i() {
            int size = this.f1698b.size();
            for (int i = 0; i < size; i++) {
                this.f1698b.get(i).a();
            }
            this.f1698b.clear();
        }

        public abstract void j(b0 b0Var);

        public abstract void k();

        public long l() {
            return this.f1699c;
        }

        public long m() {
            return this.f1702f;
        }

        public long n() {
            return this.f1701e;
        }

        public long o() {
            return this.f1700d;
        }

        public abstract boolean p();

        public c q() {
            return new c();
        }

        public void r(b0 b0Var) {
        }

        public c s(y yVar, b0 b0Var) {
            c q = q();
            q.a(b0Var);
            return q;
        }

        public c t(y yVar, b0 b0Var, int i, List<Object> list) {
            c q = q();
            q.a(b0Var);
            return q;
        }

        public abstract void u();

        /* access modifiers changed from: package-private */
        public void v(b bVar) {
            this.f1697a = bVar;
        }
    }

    private class m implements l.b {
        m() {
        }

        public void a(b0 b0Var) {
            b0Var.F(true);
            if (b0Var.h != null && b0Var.i == null) {
                b0Var.h = null;
            }
            b0Var.i = null;
            if (!b0Var.H() && !RecyclerView.this.U0(b0Var.f1686a) && b0Var.w()) {
                RecyclerView.this.removeDetachedView(b0Var.f1686a, false);
            }
        }
    }

    public static abstract class n {
        @Deprecated
        public void d(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void e(Rect rect, View view, RecyclerView recyclerView, y yVar) {
            d(rect, ((o) view.getLayoutParams()).a(), recyclerView);
        }

        @Deprecated
        public void f(Canvas canvas, RecyclerView recyclerView) {
        }

        public void g(Canvas canvas, RecyclerView recyclerView, y yVar) {
            f(canvas, recyclerView);
        }

        @Deprecated
        public void h(Canvas canvas, RecyclerView recyclerView) {
        }

        public void i(Canvas canvas, RecyclerView recyclerView, y yVar) {
            h(canvas, recyclerView);
        }
    }

    public interface p {
        void a(View view);

        void b(View view);
    }

    public static abstract class q {
        public abstract boolean a(int i, int i2);
    }

    public interface r {
        void a(RecyclerView recyclerView, MotionEvent motionEvent);

        boolean b(RecyclerView recyclerView, MotionEvent motionEvent);

        void c(boolean z);
    }

    public static abstract class s {
        public void a(RecyclerView recyclerView, int i) {
        }

        public void b(RecyclerView recyclerView, int i, int i2) {
        }
    }

    public static class t {

        /* renamed from: a  reason: collision with root package name */
        SparseArray<a> f1710a = new SparseArray<>();

        /* renamed from: b  reason: collision with root package name */
        private int f1711b = 0;

        static class a {

            /* renamed from: a  reason: collision with root package name */
            final ArrayList<b0> f1712a = new ArrayList<>();

            /* renamed from: b  reason: collision with root package name */
            int f1713b = 5;

            /* renamed from: c  reason: collision with root package name */
            long f1714c = 0;

            /* renamed from: d  reason: collision with root package name */
            long f1715d = 0;

            a() {
            }
        }

        private a g(int i) {
            a aVar = this.f1710a.get(i);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f1710a.put(i, aVar2);
            return aVar2;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f1711b++;
        }

        public void b() {
            for (int i = 0; i < this.f1710a.size(); i++) {
                this.f1710a.valueAt(i).f1712a.clear();
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            this.f1711b--;
        }

        /* access modifiers changed from: package-private */
        public void d(int i, long j) {
            a g = g(i);
            g.f1715d = j(g.f1715d, j);
        }

        /* access modifiers changed from: package-private */
        public void e(int i, long j) {
            a g = g(i);
            g.f1714c = j(g.f1714c, j);
        }

        public b0 f(int i) {
            a aVar = this.f1710a.get(i);
            if (aVar == null || aVar.f1712a.isEmpty()) {
                return null;
            }
            ArrayList<b0> arrayList = aVar.f1712a;
            return arrayList.remove(arrayList.size() - 1);
        }

        /* access modifiers changed from: package-private */
        public void h(g gVar, g gVar2, boolean z) {
            if (gVar != null) {
                c();
            }
            if (!z && this.f1711b == 0) {
                b();
            }
            if (gVar2 != null) {
                a();
            }
        }

        public void i(b0 b0Var) {
            int l = b0Var.l();
            ArrayList<b0> arrayList = g(l).f1712a;
            if (this.f1710a.get(l).f1713b > arrayList.size()) {
                b0Var.C();
                arrayList.add(b0Var);
            }
        }

        /* access modifiers changed from: package-private */
        public long j(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        /* access modifiers changed from: package-private */
        public boolean k(int i, long j, long j2) {
            long j3 = g(i).f1715d;
            return j3 == 0 || j + j3 < j2;
        }

        /* access modifiers changed from: package-private */
        public boolean l(int i, long j, long j2) {
            long j3 = g(i).f1714c;
            return j3 == 0 || j + j3 < j2;
        }
    }

    public final class u {

        /* renamed from: a  reason: collision with root package name */
        final ArrayList<b0> f1716a = new ArrayList<>();

        /* renamed from: b  reason: collision with root package name */
        ArrayList<b0> f1717b = null;

        /* renamed from: c  reason: collision with root package name */
        final ArrayList<b0> f1718c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        private final List<b0> f1719d = Collections.unmodifiableList(this.f1716a);

        /* renamed from: e  reason: collision with root package name */
        private int f1720e = 2;

        /* renamed from: f  reason: collision with root package name */
        int f1721f = 2;
        t g;
        private z h;

        public u() {
        }

        private boolean H(b0 b0Var, int i2, int i3, long j) {
            b0Var.r = RecyclerView.this;
            int l = b0Var.l();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j != Long.MAX_VALUE && !this.g.k(l, nanoTime, j)) {
                return false;
            }
            RecyclerView.this.m.a(b0Var, i2);
            this.g.d(b0Var.l(), RecyclerView.this.getNanoTime() - nanoTime);
            b(b0Var);
            if (!RecyclerView.this.i0.e()) {
                return true;
            }
            b0Var.g = i3;
            return true;
        }

        private void b(b0 b0Var) {
            if (RecyclerView.this.t0()) {
                View view = b0Var.f1686a;
                if (a.h.k.t.r(view) == 0) {
                    a.h.k.t.i0(view, 1);
                }
                if (!a.h.k.t.C(view)) {
                    b0Var.b(16384);
                    a.h.k.t.Z(view, RecyclerView.this.p0.n());
                }
            }
        }

        private void q(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    q((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        private void r(b0 b0Var) {
            View view = b0Var.f1686a;
            if (view instanceof ViewGroup) {
                q((ViewGroup) view, false);
            }
        }

        /* access modifiers changed from: package-private */
        public void A(int i2) {
            a(this.f1718c.get(i2), true);
            this.f1718c.remove(i2);
        }

        public void B(View view) {
            b0 f0 = RecyclerView.f0(view);
            if (f0.w()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (f0.v()) {
                f0.J();
            } else if (f0.K()) {
                f0.e();
            }
            C(f0);
        }

        /* access modifiers changed from: package-private */
        public void C(b0 b0Var) {
            boolean z;
            boolean z2 = false;
            boolean z3 = true;
            if (b0Var.v() || b0Var.f1686a.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(b0Var.v());
                sb.append(" isAttached:");
                if (b0Var.f1686a.getParent() != null) {
                    z2 = true;
                }
                sb.append(z2);
                sb.append(RecyclerView.this.R());
                throw new IllegalArgumentException(sb.toString());
            } else if (b0Var.w()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + b0Var + RecyclerView.this.R());
            } else if (!b0Var.I()) {
                boolean h2 = b0Var.h();
                g gVar = RecyclerView.this.m;
                if ((gVar != null && h2 && gVar.o(b0Var)) || b0Var.t()) {
                    if (this.f1721f <= 0 || b0Var.p(526)) {
                        z = false;
                    } else {
                        int size = this.f1718c.size();
                        if (size >= this.f1721f && size > 0) {
                            A(0);
                            size--;
                        }
                        if (RecyclerView.F0 && size > 0 && !RecyclerView.this.h0.d(b0Var.f1688c)) {
                            int i2 = size - 1;
                            while (i2 >= 0) {
                                if (!RecyclerView.this.h0.d(this.f1718c.get(i2).f1688c)) {
                                    break;
                                }
                                i2--;
                            }
                            size = i2 + 1;
                        }
                        this.f1718c.add(size, b0Var);
                        z = true;
                    }
                    if (!z) {
                        a(b0Var, true);
                        z2 = z;
                        RecyclerView.this.g.q(b0Var);
                        if (!z2 && !z3 && h2) {
                            b0Var.r = null;
                            return;
                        }
                        return;
                    }
                    z2 = z;
                }
                z3 = false;
                RecyclerView.this.g.q(b0Var);
                if (!z2) {
                }
            } else {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.R());
            }
        }

        /* access modifiers changed from: package-private */
        public void D(View view) {
            b0 f0 = RecyclerView.f0(view);
            if (!f0.p(12) && f0.x() && !RecyclerView.this.q(f0)) {
                if (this.f1717b == null) {
                    this.f1717b = new ArrayList<>();
                }
                f0.G(this, true);
                this.f1717b.add(f0);
            } else if (!f0.s() || f0.u() || RecyclerView.this.m.f()) {
                f0.G(this, false);
                this.f1716a.add(f0);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.R());
            }
        }

        /* access modifiers changed from: package-private */
        public void E(t tVar) {
            t tVar2 = this.g;
            if (tVar2 != null) {
                tVar2.c();
            }
            this.g = tVar;
            if (tVar != null && RecyclerView.this.getAdapter() != null) {
                this.g.a();
            }
        }

        /* access modifiers changed from: package-private */
        public void F(z zVar) {
            this.h = zVar;
        }

        public void G(int i2) {
            this.f1720e = i2;
            K();
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x01a7  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x01d0  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x01d3  */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x0203  */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x0211  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.recyclerview.widget.RecyclerView.b0 I(int r17, boolean r18, long r19) {
            /*
                r16 = this;
                r6 = r16
                r3 = r17
                r0 = r18
                if (r3 < 0) goto L_0x0234
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$y r1 = r1.i0
                int r1 = r1.b()
                if (r3 >= r1) goto L_0x0234
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$y r1 = r1.i0
                boolean r1 = r1.e()
                r2 = 0
                r7 = 1
                r8 = 0
                if (r1 == 0) goto L_0x0027
                androidx.recyclerview.widget.RecyclerView$b0 r1 = r16.h(r17)
                if (r1 == 0) goto L_0x0028
                r4 = 1
                goto L_0x0029
            L_0x0027:
                r1 = r2
            L_0x0028:
                r4 = 0
            L_0x0029:
                if (r1 != 0) goto L_0x005d
                androidx.recyclerview.widget.RecyclerView$b0 r1 = r16.m(r17, r18)
                if (r1 == 0) goto L_0x005d
                boolean r5 = r6.L(r1)
                if (r5 != 0) goto L_0x005c
                if (r0 != 0) goto L_0x005a
                r5 = 4
                r1.b(r5)
                boolean r5 = r1.v()
                if (r5 == 0) goto L_0x004e
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r9 = r1.f1686a
                r5.removeDetachedView(r9, r8)
                r1.J()
                goto L_0x0057
            L_0x004e:
                boolean r5 = r1.K()
                if (r5 == 0) goto L_0x0057
                r1.e()
            L_0x0057:
                r6.C(r1)
            L_0x005a:
                r1 = r2
                goto L_0x005d
            L_0x005c:
                r4 = 1
            L_0x005d:
                if (r1 != 0) goto L_0x0186
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r5 = r5.f1668e
                int r5 = r5.m(r3)
                if (r5 < 0) goto L_0x0149
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r9 = r9.m
                int r9 = r9.c()
                if (r5 >= r9) goto L_0x0149
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r9 = r9.m
                int r9 = r9.e(r5)
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r10 = r10.m
                boolean r10 = r10.f()
                if (r10 == 0) goto L_0x0096
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r1 = r1.m
                long r10 = r1.d(r5)
                androidx.recyclerview.widget.RecyclerView$b0 r1 = r6.l(r10, r9, r0)
                if (r1 == 0) goto L_0x0096
                r1.f1688c = r5
                r4 = 1
            L_0x0096:
                if (r1 != 0) goto L_0x00eb
                androidx.recyclerview.widget.RecyclerView$z r0 = r6.h
                if (r0 == 0) goto L_0x00eb
                android.view.View r0 = r0.a(r6, r3, r9)
                if (r0 == 0) goto L_0x00eb
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$b0 r1 = r1.e0(r0)
                if (r1 == 0) goto L_0x00ce
                boolean r0 = r1.I()
                if (r0 != 0) goto L_0x00b1
                goto L_0x00eb
            L_0x00b1:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view."
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.R()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00ce:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getViewForPositionAndType returned a view which does not have a ViewHolder"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.R()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00eb:
                if (r1 != 0) goto L_0x0102
                androidx.recyclerview.widget.RecyclerView$t r0 = r16.i()
                androidx.recyclerview.widget.RecyclerView$b0 r0 = r0.f(r9)
                if (r0 == 0) goto L_0x0101
                r0.C()
                boolean r1 = androidx.recyclerview.widget.RecyclerView.C0
                if (r1 == 0) goto L_0x0101
                r6.r(r0)
            L_0x0101:
                r1 = r0
            L_0x0102:
                if (r1 != 0) goto L_0x0186
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                long r0 = r0.getNanoTime()
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
                if (r5 == 0) goto L_0x0120
                androidx.recyclerview.widget.RecyclerView$t r10 = r6.g
                r11 = r9
                r12 = r0
                r14 = r19
                boolean r5 = r10.l(r11, r12, r14)
                if (r5 != 0) goto L_0x0120
                return r2
            L_0x0120:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r5 = r2.m
                androidx.recyclerview.widget.RecyclerView$b0 r2 = r5.b(r2, r9)
                boolean r5 = androidx.recyclerview.widget.RecyclerView.F0
                if (r5 == 0) goto L_0x013b
                android.view.View r5 = r2.f1686a
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.W(r5)
                if (r5 == 0) goto L_0x013b
                java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference
                r10.<init>(r5)
                r2.f1687b = r10
            L_0x013b:
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                long r10 = r5.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$t r5 = r6.g
                long r10 = r10 - r0
                r5.e(r9, r10)
                r9 = r2
                goto L_0x0187
            L_0x0149:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Inconsistency detected. Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "(offset:"
                r1.append(r2)
                r1.append(r5)
                java.lang.String r2 = ")."
                r1.append(r2)
                java.lang.String r2 = "state:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$y r2 = r2.i0
                int r2 = r2.b()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.R()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0186:
                r9 = r1
            L_0x0187:
                r10 = r4
                if (r10 == 0) goto L_0x01c0
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$y r0 = r0.i0
                boolean r0 = r0.e()
                if (r0 != 0) goto L_0x01c0
                r0 = 8192(0x2000, float:1.14794E-41)
                boolean r1 = r9.p(r0)
                if (r1 == 0) goto L_0x01c0
                r9.E(r8, r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$y r0 = r0.i0
                boolean r0 = r0.k
                if (r0 == 0) goto L_0x01c0
                int r0 = androidx.recyclerview.widget.RecyclerView.l.e(r9)
                r0 = r0 | 4096(0x1000, float:5.74E-42)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$l r2 = r1.N
                androidx.recyclerview.widget.RecyclerView$y r1 = r1.i0
                java.util.List r4 = r9.o()
                androidx.recyclerview.widget.RecyclerView$l$c r0 = r2.t(r1, r9, r0, r4)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                r1.Q0(r9, r0)
            L_0x01c0:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$y r0 = r0.i0
                boolean r0 = r0.e()
                if (r0 == 0) goto L_0x01d3
                boolean r0 = r9.r()
                if (r0 == 0) goto L_0x01d3
                r9.g = r3
                goto L_0x01e6
            L_0x01d3:
                boolean r0 = r9.r()
                if (r0 == 0) goto L_0x01e8
                boolean r0 = r9.y()
                if (r0 != 0) goto L_0x01e8
                boolean r0 = r9.s()
                if (r0 == 0) goto L_0x01e6
                goto L_0x01e8
            L_0x01e6:
                r0 = 0
                goto L_0x01fb
            L_0x01e8:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r0 = r0.f1668e
                int r2 = r0.m(r3)
                r0 = r16
                r1 = r9
                r3 = r17
                r4 = r19
                boolean r0 = r0.H(r1, r2, r3, r4)
            L_0x01fb:
                android.view.View r1 = r9.f1686a
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                if (r1 != 0) goto L_0x0211
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r1.generateDefaultLayoutParams()
                androidx.recyclerview.widget.RecyclerView$o r1 = (androidx.recyclerview.widget.RecyclerView.o) r1
                android.view.View r2 = r9.f1686a
                r2.setLayoutParams(r1)
                goto L_0x0229
            L_0x0211:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                boolean r2 = r2.checkLayoutParams(r1)
                if (r2 != 0) goto L_0x0227
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r2.generateLayoutParams((android.view.ViewGroup.LayoutParams) r1)
                androidx.recyclerview.widget.RecyclerView$o r1 = (androidx.recyclerview.widget.RecyclerView.o) r1
                android.view.View r2 = r9.f1686a
                r2.setLayoutParams(r1)
                goto L_0x0229
            L_0x0227:
                androidx.recyclerview.widget.RecyclerView$o r1 = (androidx.recyclerview.widget.RecyclerView.o) r1
            L_0x0229:
                r1.f1706a = r9
                if (r10 == 0) goto L_0x0230
                if (r0 == 0) goto L_0x0230
                goto L_0x0231
            L_0x0230:
                r7 = 0
            L_0x0231:
                r1.f1709d = r7
                return r9
            L_0x0234:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "("
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "). Item count:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$y r2 = r2.i0
                int r2 = r2.b()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.R()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.u.I(int, boolean, long):androidx.recyclerview.widget.RecyclerView$b0");
        }

        /* access modifiers changed from: package-private */
        public void J(b0 b0Var) {
            if (b0Var.o) {
                this.f1717b.remove(b0Var);
            } else {
                this.f1716a.remove(b0Var);
            }
            b0Var.n = null;
            b0Var.o = false;
            b0Var.e();
        }

        /* access modifiers changed from: package-private */
        public void K() {
            LayoutManager layoutManager = RecyclerView.this.n;
            this.f1721f = this.f1720e + (layoutManager != null ? layoutManager.m : 0);
            for (int size = this.f1718c.size() - 1; size >= 0 && this.f1718c.size() > this.f1721f; size--) {
                A(size);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean L(b0 b0Var) {
            if (b0Var.u()) {
                return RecyclerView.this.i0.e();
            }
            int i2 = b0Var.f1688c;
            if (i2 < 0 || i2 >= RecyclerView.this.m.c()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + b0Var + RecyclerView.this.R());
            } else if (!RecyclerView.this.i0.e() && RecyclerView.this.m.e(b0Var.f1688c) != b0Var.l()) {
                return false;
            } else {
                if (!RecyclerView.this.m.f() || b0Var.k() == RecyclerView.this.m.d(b0Var.f1688c)) {
                    return true;
                }
                return false;
            }
        }

        /* access modifiers changed from: package-private */
        public void M(int i2, int i3) {
            int i4;
            int i5 = i3 + i2;
            for (int size = this.f1718c.size() - 1; size >= 0; size--) {
                b0 b0Var = this.f1718c.get(size);
                if (b0Var != null && (i4 = b0Var.f1688c) >= i2 && i4 < i5) {
                    b0Var.b(2);
                    A(size);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a(b0 b0Var, boolean z) {
            RecyclerView.s(b0Var);
            if (b0Var.p(16384)) {
                b0Var.E(0, 16384);
                a.h.k.t.Z(b0Var.f1686a, (a.h.k.a) null);
            }
            if (z) {
                g(b0Var);
            }
            b0Var.r = null;
            i().i(b0Var);
        }

        public void c() {
            this.f1716a.clear();
            z();
        }

        /* access modifiers changed from: package-private */
        public void d() {
            int size = this.f1718c.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f1718c.get(i2).c();
            }
            int size2 = this.f1716a.size();
            for (int i3 = 0; i3 < size2; i3++) {
                this.f1716a.get(i3).c();
            }
            ArrayList<b0> arrayList = this.f1717b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    this.f1717b.get(i4).c();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void e() {
            this.f1716a.clear();
            ArrayList<b0> arrayList = this.f1717b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int f(int i2) {
            if (i2 < 0 || i2 >= RecyclerView.this.i0.b()) {
                throw new IndexOutOfBoundsException("invalid position " + i2 + ". State " + "item count is " + RecyclerView.this.i0.b() + RecyclerView.this.R());
            } else if (!RecyclerView.this.i0.e()) {
                return i2;
            } else {
                return RecyclerView.this.f1668e.m(i2);
            }
        }

        /* access modifiers changed from: package-private */
        public void g(b0 b0Var) {
            v vVar = RecyclerView.this.o;
            if (vVar != null) {
                vVar.a(b0Var);
            }
            g gVar = RecyclerView.this.m;
            if (gVar != null) {
                gVar.r(b0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.i0 != null) {
                recyclerView.g.q(b0Var);
            }
        }

        /* access modifiers changed from: package-private */
        public b0 h(int i2) {
            int size;
            int m;
            ArrayList<b0> arrayList = this.f1717b;
            if (!(arrayList == null || (size = arrayList.size()) == 0)) {
                int i3 = 0;
                int i4 = 0;
                while (i4 < size) {
                    b0 b0Var = this.f1717b.get(i4);
                    if (b0Var.K() || b0Var.m() != i2) {
                        i4++;
                    } else {
                        b0Var.b(32);
                        return b0Var;
                    }
                }
                if (RecyclerView.this.m.f() && (m = RecyclerView.this.f1668e.m(i2)) > 0 && m < RecyclerView.this.m.c()) {
                    long d2 = RecyclerView.this.m.d(m);
                    while (i3 < size) {
                        b0 b0Var2 = this.f1717b.get(i3);
                        if (b0Var2.K() || b0Var2.k() != d2) {
                            i3++;
                        } else {
                            b0Var2.b(32);
                            return b0Var2;
                        }
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public t i() {
            if (this.g == null) {
                this.g = new t();
            }
            return this.g;
        }

        /* access modifiers changed from: package-private */
        public int j() {
            return this.f1716a.size();
        }

        public List<b0> k() {
            return this.f1719d;
        }

        /* access modifiers changed from: package-private */
        public b0 l(long j, int i2, boolean z) {
            for (int size = this.f1716a.size() - 1; size >= 0; size--) {
                b0 b0Var = this.f1716a.get(size);
                if (b0Var.k() == j && !b0Var.K()) {
                    if (i2 == b0Var.l()) {
                        b0Var.b(32);
                        if (b0Var.u() && !RecyclerView.this.i0.e()) {
                            b0Var.E(2, 14);
                        }
                        return b0Var;
                    } else if (!z) {
                        this.f1716a.remove(size);
                        RecyclerView.this.removeDetachedView(b0Var.f1686a, false);
                        y(b0Var.f1686a);
                    }
                }
            }
            int size2 = this.f1718c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                b0 b0Var2 = this.f1718c.get(size2);
                if (b0Var2.k() == j) {
                    if (i2 == b0Var2.l()) {
                        if (!z) {
                            this.f1718c.remove(size2);
                        }
                        return b0Var2;
                    } else if (!z) {
                        A(size2);
                        return null;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public b0 m(int i2, boolean z) {
            View e2;
            int size = this.f1716a.size();
            int i3 = 0;
            int i4 = 0;
            while (i4 < size) {
                b0 b0Var = this.f1716a.get(i4);
                if (b0Var.K() || b0Var.m() != i2 || b0Var.s() || (!RecyclerView.this.i0.h && b0Var.u())) {
                    i4++;
                } else {
                    b0Var.b(32);
                    return b0Var;
                }
            }
            if (z || (e2 = RecyclerView.this.f1669f.e(i2)) == null) {
                int size2 = this.f1718c.size();
                while (i3 < size2) {
                    b0 b0Var2 = this.f1718c.get(i3);
                    if (b0Var2.s() || b0Var2.m() != i2) {
                        i3++;
                    } else {
                        if (!z) {
                            this.f1718c.remove(i3);
                        }
                        return b0Var2;
                    }
                }
                return null;
            }
            b0 f0 = RecyclerView.f0(e2);
            RecyclerView.this.f1669f.s(e2);
            int m = RecyclerView.this.f1669f.m(e2);
            if (m != -1) {
                RecyclerView.this.f1669f.d(m);
                D(e2);
                f0.b(8224);
                return f0;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + f0 + RecyclerView.this.R());
        }

        /* access modifiers changed from: package-private */
        public View n(int i2) {
            return this.f1716a.get(i2).f1686a;
        }

        public View o(int i2) {
            return p(i2, false);
        }

        /* access modifiers changed from: package-private */
        public View p(int i2, boolean z) {
            return I(i2, z, Long.MAX_VALUE).f1686a;
        }

        /* access modifiers changed from: package-private */
        public void s() {
            int size = this.f1718c.size();
            for (int i2 = 0; i2 < size; i2++) {
                o oVar = (o) this.f1718c.get(i2).f1686a.getLayoutParams();
                if (oVar != null) {
                    oVar.f1708c = true;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void t() {
            int size = this.f1718c.size();
            for (int i2 = 0; i2 < size; i2++) {
                b0 b0Var = this.f1718c.get(i2);
                if (b0Var != null) {
                    b0Var.b(6);
                    b0Var.a((Object) null);
                }
            }
            g gVar = RecyclerView.this.m;
            if (gVar == null || !gVar.f()) {
                z();
            }
        }

        /* access modifiers changed from: package-private */
        public void u(int i2, int i3) {
            int size = this.f1718c.size();
            for (int i4 = 0; i4 < size; i4++) {
                b0 b0Var = this.f1718c.get(i4);
                if (b0Var != null && b0Var.f1688c >= i2) {
                    b0Var.z(i3, true);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void v(int i2, int i3) {
            int i4;
            int i5;
            int i6;
            int i7;
            if (i2 < i3) {
                i6 = -1;
                i5 = i2;
                i4 = i3;
            } else {
                i6 = 1;
                i4 = i2;
                i5 = i3;
            }
            int size = this.f1718c.size();
            for (int i8 = 0; i8 < size; i8++) {
                b0 b0Var = this.f1718c.get(i8);
                if (b0Var != null && (i7 = b0Var.f1688c) >= i5 && i7 <= i4) {
                    if (i7 == i2) {
                        b0Var.z(i3 - i2, false);
                    } else {
                        b0Var.z(i6, false);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void w(int i2, int i3, boolean z) {
            int i4 = i2 + i3;
            for (int size = this.f1718c.size() - 1; size >= 0; size--) {
                b0 b0Var = this.f1718c.get(size);
                if (b0Var != null) {
                    int i5 = b0Var.f1688c;
                    if (i5 >= i4) {
                        b0Var.z(-i3, z);
                    } else if (i5 >= i2) {
                        b0Var.b(8);
                        A(size);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void x(g gVar, g gVar2, boolean z) {
            c();
            i().h(gVar, gVar2, z);
        }

        /* access modifiers changed from: package-private */
        public void y(View view) {
            b0 f0 = RecyclerView.f0(view);
            f0.n = null;
            f0.o = false;
            f0.e();
            C(f0);
        }

        /* access modifiers changed from: package-private */
        public void z() {
            for (int size = this.f1718c.size() - 1; size >= 0; size--) {
                A(size);
            }
            this.f1718c.clear();
            if (RecyclerView.F0) {
                RecyclerView.this.h0.b();
            }
        }
    }

    public interface v {
        void a(b0 b0Var);
    }

    private class w extends i {
        w() {
        }

        public void a() {
            RecyclerView.this.p((String) null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.i0.g = true;
            recyclerView.O0(true);
            if (!RecyclerView.this.f1668e.p()) {
                RecyclerView.this.requestLayout();
            }
        }

        public void c(int i, int i2, Object obj) {
            RecyclerView.this.p((String) null);
            if (RecyclerView.this.f1668e.r(i, i2, obj)) {
                e();
            }
        }

        public void d(int i, int i2) {
            RecyclerView.this.p((String) null);
            if (RecyclerView.this.f1668e.s(i, i2)) {
                e();
            }
        }

        /* access modifiers changed from: package-private */
        public void e() {
            if (RecyclerView.E0) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.t && recyclerView.s) {
                    a.h.k.t.V(recyclerView, recyclerView.i);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.B = true;
            recyclerView2.requestLayout();
        }
    }

    public static abstract class x {
        public abstract int a();

        public abstract boolean b();

        public abstract boolean c();

        /* access modifiers changed from: package-private */
        public abstract void d(int i, int i2);

        /* access modifiers changed from: protected */
        public abstract void e(View view);

        public abstract void f(int i);

        /* access modifiers changed from: protected */
        public final void g() {
            throw null;
        }
    }

    public static class y {

        /* renamed from: a  reason: collision with root package name */
        int f1723a = -1;

        /* renamed from: b  reason: collision with root package name */
        private SparseArray<Object> f1724b;

        /* renamed from: c  reason: collision with root package name */
        int f1725c = 0;

        /* renamed from: d  reason: collision with root package name */
        int f1726d = 0;

        /* renamed from: e  reason: collision with root package name */
        int f1727e = 1;

        /* renamed from: f  reason: collision with root package name */
        int f1728f = 0;
        boolean g = false;
        boolean h = false;
        boolean i = false;
        boolean j = false;
        boolean k = false;
        boolean l = false;
        int m;
        long n;
        int o;
        int p;
        int q;

        /* access modifiers changed from: package-private */
        public void a(int i2) {
            if ((this.f1727e & i2) == 0) {
                throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i2) + " but it is " + Integer.toBinaryString(this.f1727e));
            }
        }

        public int b() {
            return this.h ? this.f1725c - this.f1726d : this.f1728f;
        }

        public int c() {
            return this.f1723a;
        }

        public boolean d() {
            return this.f1723a != -1;
        }

        public boolean e() {
            return this.h;
        }

        /* access modifiers changed from: package-private */
        public void f(g gVar) {
            this.f1727e = 1;
            this.f1728f = gVar.c();
            this.h = false;
            this.i = false;
            this.j = false;
        }

        public boolean g() {
            return this.l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f1723a + ", mData=" + this.f1724b + ", mItemCount=" + this.f1728f + ", mIsMeasuring=" + this.j + ", mPreviousLayoutItemCount=" + this.f1725c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f1726d + ", mStructureChanged=" + this.g + ", mInPreLayout=" + this.h + ", mRunSimpleAnimations=" + this.k + ", mRunPredictiveAnimations=" + this.l + '}';
        }
    }

    public static abstract class z {
        public abstract View a(u uVar, int i, int i2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 16843830(0x1010436, float:2.369658E-38)
            r3 = 0
            r1[r3] = r2
            A0 = r1
            int[] r1 = new int[r0]
            r2 = 16842987(0x10100eb, float:2.3694217E-38)
            r1[r3] = r2
            B0 = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 18
            if (r1 == r2) goto L_0x0025
            r2 = 19
            if (r1 == r2) goto L_0x0025
            r2 = 20
            if (r1 != r2) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r1 = 0
            goto L_0x0026
        L_0x0025:
            r1 = 1
        L_0x0026:
            C0 = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 < r2) goto L_0x0030
            r1 = 1
            goto L_0x0031
        L_0x0030:
            r1 = 0
        L_0x0031:
            D0 = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 16
            if (r1 < r2) goto L_0x003b
            r1 = 1
            goto L_0x003c
        L_0x003b:
            r1 = 0
        L_0x003c:
            E0 = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L_0x0046
            r1 = 1
            goto L_0x0047
        L_0x0046:
            r1 = 0
        L_0x0047:
            F0 = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 15
            if (r1 > r2) goto L_0x0051
            r1 = 1
            goto L_0x0052
        L_0x0051:
            r1 = 0
        L_0x0052:
            G0 = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 > r2) goto L_0x005a
            r1 = 1
            goto L_0x005b
        L_0x005a:
            r1 = 0
        L_0x005b:
            H0 = r1
            r1 = 4
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r1[r3] = r2
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r1[r0] = r2
            r0 = 2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r0] = r2
            r0 = 3
            r1[r0] = r2
            I0 = r1
            androidx.recyclerview.widget.RecyclerView$c r0 = new androidx.recyclerview.widget.RecyclerView$c
            r0.<init>()
            J0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<clinit>():void");
    }

    public RecyclerView(Context context) {
        this(context, (AttributeSet) null);
    }

    private void B() {
        int i2 = this.A;
        this.A = 0;
        if (i2 != 0 && t0()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            a.h.k.c0.b.b(obtain, i2);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    private void D() {
        boolean z2 = true;
        this.i0.a(1);
        S(this.i0);
        this.i0.j = false;
        l1();
        this.g.f();
        F0();
        N0();
        c1();
        y yVar = this.i0;
        if (!yVar.k || !this.m0) {
            z2 = false;
        }
        yVar.i = z2;
        this.m0 = false;
        this.l0 = false;
        y yVar2 = this.i0;
        yVar2.h = yVar2.l;
        yVar2.f1728f = this.m.c();
        V(this.r0);
        if (this.i0.k) {
            int g2 = this.f1669f.g();
            for (int i2 = 0; i2 < g2; i2++) {
                b0 f02 = f0(this.f1669f.f(i2));
                if (!f02.I() && (!f02.s() || this.m.f())) {
                    this.g.e(f02, this.N.t(this.i0, f02, l.e(f02), f02.o()));
                    if (this.i0.i && f02.x() && !f02.u() && !f02.I() && !f02.s()) {
                        this.g.c(d0(f02), f02);
                    }
                }
            }
        }
        if (this.i0.l) {
            d1();
            y yVar3 = this.i0;
            boolean z3 = yVar3.g;
            yVar3.g = false;
            this.n.V0(this.f1666c, yVar3);
            this.i0.g = z3;
            for (int i3 = 0; i3 < this.f1669f.g(); i3++) {
                b0 f03 = f0(this.f1669f.f(i3));
                if (!f03.I() && !this.g.i(f03)) {
                    int e2 = l.e(f03);
                    boolean p2 = f03.p(8192);
                    if (!p2) {
                        e2 |= CodedOutputStream.DEFAULT_BUFFER_SIZE;
                    }
                    l.c t2 = this.N.t(this.i0, f03, e2, f03.o());
                    if (p2) {
                        Q0(f03, t2);
                    } else {
                        this.g.a(f03, t2);
                    }
                }
            }
            t();
        } else {
            t();
        }
        G0();
        n1(false);
        this.i0.f1727e = 2;
    }

    private void E() {
        l1();
        F0();
        this.i0.a(6);
        this.f1668e.j();
        this.i0.f1728f = this.m.c();
        y yVar = this.i0;
        yVar.f1726d = 0;
        yVar.h = false;
        this.n.V0(this.f1666c, yVar);
        y yVar2 = this.i0;
        yVar2.g = false;
        this.f1667d = null;
        yVar2.k = yVar2.k && this.N != null;
        this.i0.f1727e = 4;
        G0();
        n1(false);
    }

    private void F() {
        this.i0.a(4);
        l1();
        F0();
        y yVar = this.i0;
        yVar.f1727e = 1;
        if (yVar.k) {
            for (int g2 = this.f1669f.g() - 1; g2 >= 0; g2--) {
                b0 f02 = f0(this.f1669f.f(g2));
                if (!f02.I()) {
                    long d02 = d0(f02);
                    l.c s2 = this.N.s(this.i0, f02);
                    b0 g3 = this.g.g(d02);
                    if (g3 == null || g3.I()) {
                        this.g.d(f02, s2);
                    } else {
                        boolean h2 = this.g.h(g3);
                        boolean h3 = this.g.h(f02);
                        if (!h2 || g3 != f02) {
                            l.c n2 = this.g.n(g3);
                            this.g.d(f02, s2);
                            l.c m2 = this.g.m(f02);
                            if (n2 == null) {
                                k0(d02, f02, g3);
                            } else {
                                n(g3, f02, n2, m2, h2, h3);
                            }
                        } else {
                            this.g.d(f02, s2);
                        }
                    }
                }
            }
            this.g.o(this.z0);
        }
        this.n.i1(this.f1666c);
        y yVar2 = this.i0;
        yVar2.f1725c = yVar2.f1728f;
        this.E = false;
        this.F = false;
        yVar2.k = false;
        yVar2.l = false;
        this.n.h = false;
        ArrayList<b0> arrayList = this.f1666c.f1717b;
        if (arrayList != null) {
            arrayList.clear();
        }
        LayoutManager layoutManager = this.n;
        if (layoutManager.n) {
            layoutManager.m = 0;
            layoutManager.n = false;
            this.f1666c.K();
        }
        this.n.W0(this.i0);
        G0();
        n1(false);
        this.g.f();
        int[] iArr = this.r0;
        if (y(iArr[0], iArr[1])) {
            L(0, 0);
        }
        R0();
        a1();
    }

    private boolean I(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        r rVar = this.r;
        if (rVar != null) {
            if (action == 0) {
                this.r = null;
            } else {
                rVar.a(this, motionEvent);
                if (action == 3 || action == 1) {
                    this.r = null;
                }
                return true;
            }
        }
        if (action != 0) {
            int size = this.q.size();
            for (int i2 = 0; i2 < size; i2++) {
                r rVar2 = this.q.get(i2);
                if (rVar2.b(this, motionEvent)) {
                    this.r = rVar2;
                    return true;
                }
            }
        }
        return false;
    }

    private void I0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.P) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.P = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.T = x2;
            this.R = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.U = y2;
            this.S = y2;
        }
    }

    private boolean J(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.r = null;
        }
        int size = this.q.size();
        int i2 = 0;
        while (i2 < size) {
            r rVar = this.q.get(i2);
            if (!rVar.b(this, motionEvent) || action == 3) {
                i2++;
            } else {
                this.r = rVar;
                return true;
            }
        }
        return false;
    }

    private boolean M0() {
        return this.N != null && this.n.F1();
    }

    private void N0() {
        if (this.E) {
            this.f1668e.w();
            if (this.F) {
                this.n.Q0(this);
            }
        }
        if (M0()) {
            this.f1668e.u();
        } else {
            this.f1668e.j();
        }
        boolean z2 = false;
        boolean z3 = this.l0 || this.m0;
        this.i0.k = this.v && this.N != null && (this.E || z3 || this.n.h) && (!this.E || this.m.f());
        y yVar = this.i0;
        if (yVar.k && z3 && !this.E && M0()) {
            z2 = true;
        }
        yVar.l = z2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void P0(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0021
            r6.O()
            android.widget.EdgeEffect r3 = r6.J
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
            androidx.core.widget.d.a(r3, r4, r9)
        L_0x001f:
            r9 = 1
            goto L_0x003c
        L_0x0021:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x003b
            r6.P()
            android.widget.EdgeEffect r3 = r6.L
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            androidx.core.widget.d.a(r3, r4, r9)
            goto L_0x001f
        L_0x003b:
            r9 = 0
        L_0x003c:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0056
            r6.Q()
            android.widget.EdgeEffect r9 = r6.K
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            androidx.core.widget.d.a(r9, r0, r7)
            goto L_0x0072
        L_0x0056:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x0071
            r6.N()
            android.widget.EdgeEffect r9 = r6.M
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            androidx.core.widget.d.a(r9, r3, r0)
            goto L_0x0072
        L_0x0071:
            r1 = r9
        L_0x0072:
            if (r1 != 0) goto L_0x007c
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x007c
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x007f
        L_0x007c:
            a.h.k.t.T(r6)
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.P0(float, float, float, float):void");
    }

    private void R0() {
        View findViewById;
        if (this.e0 && this.m != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                if (!isFocused()) {
                    View focusedChild = getFocusedChild();
                    if (!H0 || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                        if (!this.f1669f.n(focusedChild)) {
                            return;
                        }
                    } else if (this.f1669f.g() == 0) {
                        requestFocus();
                        return;
                    }
                }
                View view = null;
                b0 Z = (this.i0.n == -1 || !this.m.f()) ? null : Z(this.i0.n);
                if (Z != null && !this.f1669f.n(Z.f1686a) && Z.f1686a.hasFocusable()) {
                    view = Z.f1686a;
                } else if (this.f1669f.g() > 0) {
                    view = X();
                }
                if (view != null) {
                    int i2 = this.i0.o;
                    if (!(((long) i2) == -1 || (findViewById = view.findViewById(i2)) == null || !findViewById.isFocusable())) {
                        view = findViewById;
                    }
                    view.requestFocus();
                }
            }
        }
    }

    private void S0() {
        boolean z2;
        EdgeEffect edgeEffect = this.J;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.J.isFinished();
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = this.K;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.K.isFinished();
        }
        EdgeEffect edgeEffect3 = this.L;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.L.isFinished();
        }
        EdgeEffect edgeEffect4 = this.M;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.M.isFinished();
        }
        if (z2) {
            a.h.k.t.T(this);
        }
    }

    private void V(int[] iArr) {
        int g2 = this.f1669f.g();
        if (g2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < g2; i4++) {
            b0 f02 = f0(this.f1669f.f(i4));
            if (!f02.I()) {
                int m2 = f02.m();
                if (m2 < i2) {
                    i2 = m2;
                }
                if (m2 > i3) {
                    i3 = m2;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    static RecyclerView W(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView W2 = W(viewGroup.getChildAt(i2));
            if (W2 != null) {
                return W2;
            }
        }
        return null;
    }

    private View X() {
        b0 Y;
        int i2 = this.i0.m;
        if (i2 == -1) {
            i2 = 0;
        }
        int b2 = this.i0.b();
        int i3 = i2;
        while (i3 < b2) {
            b0 Y2 = Y(i3);
            if (Y2 == null) {
                break;
            } else if (Y2.f1686a.hasFocusable()) {
                return Y2.f1686a;
            } else {
                i3++;
            }
        }
        int min = Math.min(b2, i2);
        while (true) {
            min--;
            if (min < 0 || (Y = Y(min)) == null) {
                return null;
            }
            if (Y.f1686a.hasFocusable()) {
                return Y.f1686a;
            }
        }
    }

    private void Z0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.j.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof o) {
            o oVar = (o) layoutParams;
            if (!oVar.f1708c) {
                Rect rect = oVar.f1707b;
                Rect rect2 = this.j;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.j);
            offsetRectIntoDescendantCoords(view, this.j);
        }
        this.n.p1(this, view, this.j, !this.v, view2 == null);
    }

    private void a1() {
        y yVar = this.i0;
        yVar.n = -1;
        yVar.m = -1;
        yVar.o = -1;
    }

    private void b1() {
        VelocityTracker velocityTracker = this.Q;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        a(0);
        S0();
    }

    private void c1() {
        int i2;
        b0 b0Var = null;
        View focusedChild = (!this.e0 || !hasFocus() || this.m == null) ? null : getFocusedChild();
        if (focusedChild != null) {
            b0Var = U(focusedChild);
        }
        if (b0Var == null) {
            a1();
            return;
        }
        this.i0.n = this.m.f() ? b0Var.k() : -1;
        y yVar = this.i0;
        if (this.E) {
            i2 = -1;
        } else if (b0Var.u()) {
            i2 = b0Var.f1689d;
        } else {
            i2 = b0Var.j();
        }
        yVar.m = i2;
        this.i0.o = h0(b0Var.f1686a);
    }

    static b0 f0(View view) {
        if (view == null) {
            return null;
        }
        return ((o) view.getLayoutParams()).f1706a;
    }

    static void g0(View view, Rect rect) {
        o oVar = (o) view.getLayoutParams();
        Rect rect2 = oVar.f1707b;
        rect.set((view.getLeft() - rect2.left) - oVar.leftMargin, (view.getTop() - rect2.top) - oVar.topMargin, view.getRight() + rect2.right + oVar.rightMargin, view.getBottom() + rect2.bottom + oVar.bottomMargin);
    }

    private void g1(g gVar, boolean z2, boolean z3) {
        g gVar2 = this.m;
        if (gVar2 != null) {
            gVar2.t(this.f1665b);
            this.m.n(this);
        }
        if (!z2 || z3) {
            T0();
        }
        this.f1668e.w();
        g gVar3 = this.m;
        this.m = gVar;
        if (gVar != null) {
            gVar.s(this.f1665b);
            gVar.j(this);
        }
        LayoutManager layoutManager = this.n;
        if (layoutManager != null) {
            layoutManager.C0(gVar3, this.m);
        }
        this.f1666c.x(gVar3, this.m, z2);
        this.i0.g = true;
    }

    private a.h.k.l getScrollingChildHelper() {
        if (this.s0 == null) {
            this.s0 = new a.h.k.l(this);
        }
        return this.s0;
    }

    private void h(b0 b0Var) {
        View view = b0Var.f1686a;
        boolean z2 = view.getParent() == this;
        this.f1666c.J(e0(view));
        if (b0Var.w()) {
            this.f1669f.c(view, -1, view.getLayoutParams(), true);
        } else if (!z2) {
            this.f1669f.b(view, true);
        } else {
            this.f1669f.k(view);
        }
    }

    private int h0(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    private String i0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(".")) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + str;
        }
    }

    private void k0(long j2, b0 b0Var, b0 b0Var2) {
        int g2 = this.f1669f.g();
        for (int i2 = 0; i2 < g2; i2++) {
            b0 f02 = f0(this.f1669f.f(i2));
            if (f02 != b0Var && d0(f02) == j2) {
                g gVar = this.m;
                if (gVar == null || !gVar.f()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + f02 + " \n View Holder 2:" + b0Var + R());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + f02 + " \n View Holder 2:" + b0Var + R());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + b0Var2 + " cannot be found but it is necessary for " + b0Var + R());
    }

    private void n(b0 b0Var, b0 b0Var2, l.c cVar, l.c cVar2, boolean z2, boolean z3) {
        b0Var.F(false);
        if (z2) {
            h(b0Var);
        }
        if (b0Var != b0Var2) {
            if (z3) {
                h(b0Var2);
            }
            b0Var.h = b0Var2;
            h(b0Var);
            this.f1666c.J(b0Var);
            b0Var2.F(false);
            b0Var2.i = b0Var;
        }
        if (this.N.b(b0Var, b0Var2, cVar, cVar2)) {
            L0();
        }
    }

    private boolean n0() {
        int g2 = this.f1669f.g();
        for (int i2 = 0; i2 < g2; i2++) {
            b0 f02 = f0(this.f1669f.f(i2));
            if (f02 != null && !f02.I() && f02.x()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    private void p0() {
        if (a.h.k.t.s(this) == 0) {
            a.h.k.t.j0(this, 8);
        }
    }

    private void p1() {
        this.f0.i();
        LayoutManager layoutManager = this.n;
        if (layoutManager != null) {
            layoutManager.E1();
        }
    }

    private void q0() {
        this.f1669f = new b(new e());
    }

    private void r() {
        b1();
        setScrollState(0);
    }

    static void s(b0 b0Var) {
        WeakReference<RecyclerView> weakReference = b0Var.f1687b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view != b0Var.f1686a) {
                    ViewParent parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                } else {
                    return;
                }
            }
            b0Var.f1687b = null;
        }
    }

    private boolean v0(View view, View view2, int i2) {
        int i3;
        if (view2 == null || view2 == this || T(view2) == null) {
            return false;
        }
        if (view == null || T(view) == null) {
            return true;
        }
        this.j.set(0, 0, view.getWidth(), view.getHeight());
        this.k.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.j);
        offsetDescendantRectToMyCoords(view2, this.k);
        char c2 = 65535;
        int i4 = this.n.X() == 1 ? -1 : 1;
        Rect rect = this.j;
        int i5 = rect.left;
        int i6 = this.k.left;
        if ((i5 < i6 || rect.right <= i6) && this.j.right < this.k.right) {
            i3 = 1;
        } else {
            Rect rect2 = this.j;
            int i7 = rect2.right;
            int i8 = this.k.right;
            i3 = ((i7 > i8 || rect2.left >= i8) && this.j.left > this.k.left) ? -1 : 0;
        }
        Rect rect3 = this.j;
        int i9 = rect3.top;
        int i10 = this.k.top;
        if ((i9 < i10 || rect3.bottom <= i10) && this.j.bottom < this.k.bottom) {
            c2 = 1;
        } else {
            Rect rect4 = this.j;
            int i11 = rect4.bottom;
            int i12 = this.k.bottom;
            if ((i11 <= i12 && rect4.top < i12) || this.j.top <= this.k.top) {
                c2 = 0;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 17) {
                    if (i2 != 33) {
                        if (i2 != 66) {
                            if (i2 != 130) {
                                throw new IllegalArgumentException("Invalid direction: " + i2 + R());
                            } else if (c2 > 0) {
                                return true;
                            } else {
                                return false;
                            }
                        } else if (i3 > 0) {
                            return true;
                        } else {
                            return false;
                        }
                    } else if (c2 < 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else if (i3 < 0) {
                    return true;
                } else {
                    return false;
                }
            } else if (c2 > 0 || (c2 == 0 && i3 * i4 >= 0)) {
                return true;
            } else {
                return false;
            }
        } else if (c2 < 0 || (c2 == 0 && i3 * i4 <= 0)) {
            return true;
        } else {
            return false;
        }
    }

    private void w(Context context, String str, AttributeSet attributeSet, int i2, int i3) {
        ClassLoader classLoader;
        Constructor<? extends U> constructor;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String i02 = i0(context, trim);
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = classLoader.loadClass(i02).asSubclass(LayoutManager.class);
                    Object[] objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(I0);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i2), Integer.valueOf(i3)};
                    } catch (NoSuchMethodException e2) {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((LayoutManager) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e3) {
                    e3.initCause(e2);
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + i02, e3);
                } catch (ClassNotFoundException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + i02, e4);
                } catch (InvocationTargetException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + i02, e5);
                } catch (InstantiationException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + i02, e6);
                } catch (IllegalAccessException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + i02, e7);
                } catch (ClassCastException e8) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + i02, e8);
                }
            }
        }
    }

    private boolean y(int i2, int i3) {
        V(this.r0);
        int[] iArr = this.r0;
        return (iArr[0] == i2 && iArr[1] == i3) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public void A(View view) {
        b0 f02 = f0(view);
        E0(view);
        g gVar = this.m;
        if (!(gVar == null || f02 == null)) {
            gVar.q(f02);
        }
        List<p> list = this.D;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.D.get(size).a(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void A0(int i2, int i3) {
        int j2 = this.f1669f.j();
        for (int i4 = 0; i4 < j2; i4++) {
            b0 f02 = f0(this.f1669f.i(i4));
            if (f02 != null && !f02.I() && f02.f1688c >= i2) {
                f02.z(i3, false);
                this.i0.g = true;
            }
        }
        this.f1666c.u(i2, i3);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void B0(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int j2 = this.f1669f.j();
        if (i2 < i3) {
            i6 = -1;
            i5 = i2;
            i4 = i3;
        } else {
            i4 = i2;
            i5 = i3;
            i6 = 1;
        }
        for (int i8 = 0; i8 < j2; i8++) {
            b0 f02 = f0(this.f1669f.i(i8));
            if (f02 != null && (i7 = f02.f1688c) >= i5 && i7 <= i4) {
                if (i7 == i2) {
                    f02.z(i3 - i2, false);
                } else {
                    f02.z(i6, false);
                }
                this.i0.g = true;
            }
        }
        this.f1666c.v(i2, i3);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void C() {
        if (this.m == null) {
            Log.e("RecyclerView", "No adapter attached; skipping layout");
        } else if (this.n == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
        } else {
            y yVar = this.i0;
            yVar.j = false;
            if (yVar.f1727e == 1) {
                D();
                this.n.v1(this);
                E();
            } else if (!this.f1668e.q() && this.n.m0() == getWidth() && this.n.V() == getHeight()) {
                this.n.v1(this);
            } else {
                this.n.v1(this);
                E();
            }
            F();
        }
    }

    /* access modifiers changed from: package-private */
    public void C0(int i2, int i3, boolean z2) {
        int i4 = i2 + i3;
        int j2 = this.f1669f.j();
        for (int i5 = 0; i5 < j2; i5++) {
            b0 f02 = f0(this.f1669f.i(i5));
            if (f02 != null && !f02.I()) {
                int i6 = f02.f1688c;
                if (i6 >= i4) {
                    f02.z(-i3, z2);
                    this.i0.g = true;
                } else if (i6 >= i2) {
                    f02.i(i2 - 1, -i3, z2);
                    this.i0.g = true;
                }
            }
        }
        this.f1666c.w(i2, i3, z2);
        requestLayout();
    }

    public void D0(View view) {
    }

    public void E0(View view) {
    }

    /* access modifiers changed from: package-private */
    public void F0() {
        this.G++;
    }

    public boolean G(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().d(i2, i3, iArr, iArr2, i4);
    }

    /* access modifiers changed from: package-private */
    public void G0() {
        H0(true);
    }

    public boolean H(int i2, int i3, int i4, int i5, int[] iArr, int i6) {
        return getScrollingChildHelper().g(i2, i3, i4, i5, iArr, i6);
    }

    /* access modifiers changed from: package-private */
    public void H0(boolean z2) {
        int i2 = this.G - 1;
        this.G = i2;
        if (i2 < 1) {
            this.G = 0;
            if (z2) {
                B();
                M();
            }
        }
    }

    public void J0(int i2) {
    }

    /* access modifiers changed from: package-private */
    public void K(int i2) {
        LayoutManager layoutManager = this.n;
        if (layoutManager != null) {
            layoutManager.c1(i2);
        }
        J0(i2);
        s sVar = this.j0;
        if (sVar != null) {
            sVar.a(this, i2);
        }
        List<s> list = this.k0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.k0.get(size).a(this, i2);
            }
        }
    }

    public void K0(int i2, int i3) {
    }

    /* access modifiers changed from: package-private */
    public void L(int i2, int i3) {
        this.H++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX, scrollY);
        K0(i2, i3);
        s sVar = this.j0;
        if (sVar != null) {
            sVar.b(this, i2, i3);
        }
        List<s> list = this.k0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.k0.get(size).b(this, i2, i3);
            }
        }
        this.H--;
    }

    /* access modifiers changed from: package-private */
    public void L0() {
        if (!this.o0 && this.s) {
            a.h.k.t.V(this, this.y0);
            this.o0 = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void M() {
        int i2;
        for (int size = this.x0.size() - 1; size >= 0; size--) {
            b0 b0Var = this.x0.get(size);
            if (b0Var.f1686a.getParent() == this && !b0Var.I() && (i2 = b0Var.q) != -1) {
                a.h.k.t.i0(b0Var.f1686a, i2);
                b0Var.q = -1;
            }
        }
        this.x0.clear();
    }

    /* access modifiers changed from: package-private */
    public void N() {
        if (this.M == null) {
            EdgeEffect a2 = this.I.a(this, 3);
            this.M = a2;
            if (this.h) {
                a2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a2.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void O() {
        if (this.J == null) {
            EdgeEffect a2 = this.I.a(this, 0);
            this.J = a2;
            if (this.h) {
                a2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a2.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void O0(boolean z2) {
        this.F = z2 | this.F;
        this.E = true;
        x0();
    }

    /* access modifiers changed from: package-private */
    public void P() {
        if (this.L == null) {
            EdgeEffect a2 = this.I.a(this, 2);
            this.L = a2;
            if (this.h) {
                a2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a2.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void Q() {
        if (this.K == null) {
            EdgeEffect a2 = this.I.a(this, 1);
            this.K = a2;
            if (this.h) {
                a2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a2.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void Q0(b0 b0Var, l.c cVar) {
        b0Var.E(0, 8192);
        if (this.i0.i && b0Var.x() && !b0Var.u() && !b0Var.I()) {
            this.g.c(d0(b0Var), b0Var);
        }
        this.g.e(b0Var, cVar);
    }

    /* access modifiers changed from: package-private */
    public String R() {
        return " " + super.toString() + ", adapter:" + this.m + ", layout:" + this.n + ", context:" + getContext();
    }

    /* access modifiers changed from: package-private */
    public final void S(y yVar) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f0.f1682d;
            yVar.p = overScroller.getFinalX() - overScroller.getCurrX();
            yVar.q = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        yVar.p = 0;
        yVar.q = 0;
    }

    public View T(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void T0() {
        l lVar = this.N;
        if (lVar != null) {
            lVar.k();
        }
        LayoutManager layoutManager = this.n;
        if (layoutManager != null) {
            layoutManager.h1(this.f1666c);
            this.n.i1(this.f1666c);
        }
        this.f1666c.c();
    }

    public b0 U(View view) {
        View T2 = T(view);
        if (T2 == null) {
            return null;
        }
        return e0(T2);
    }

    /* access modifiers changed from: package-private */
    public boolean U0(View view) {
        l1();
        boolean r2 = this.f1669f.r(view);
        if (r2) {
            b0 f02 = f0(view);
            this.f1666c.J(f02);
            this.f1666c.C(f02);
        }
        n1(!r2);
        return r2;
    }

    public void V0(n nVar) {
        LayoutManager layoutManager = this.n;
        if (layoutManager != null) {
            layoutManager.f("Cannot remove item decoration during a scroll  or layout");
        }
        this.p.remove(nVar);
        if (this.p.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        w0();
        requestLayout();
    }

    public void W0(r rVar) {
        this.q.remove(rVar);
        if (this.r == rVar) {
            this.r = null;
        }
    }

    public void X0(s sVar) {
        List<s> list = this.k0;
        if (list != null) {
            list.remove(sVar);
        }
    }

    public b0 Y(int i2) {
        b0 b0Var = null;
        if (this.E) {
            return null;
        }
        int j2 = this.f1669f.j();
        for (int i3 = 0; i3 < j2; i3++) {
            b0 f02 = f0(this.f1669f.i(i3));
            if (f02 != null && !f02.u() && c0(f02) == i2) {
                if (!this.f1669f.n(f02.f1686a)) {
                    return f02;
                }
                b0Var = f02;
            }
        }
        return b0Var;
    }

    /* access modifiers changed from: package-private */
    public void Y0() {
        b0 b0Var;
        int g2 = this.f1669f.g();
        for (int i2 = 0; i2 < g2; i2++) {
            View f2 = this.f1669f.f(i2);
            b0 e02 = e0(f2);
            if (!(e02 == null || (b0Var = e02.i) == null)) {
                View view = b0Var.f1686a;
                int left = f2.getLeft();
                int top = f2.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    public b0 Z(long j2) {
        g gVar = this.m;
        b0 b0Var = null;
        if (gVar != null && gVar.f()) {
            int j3 = this.f1669f.j();
            for (int i2 = 0; i2 < j3; i2++) {
                b0 f02 = f0(this.f1669f.i(i2));
                if (f02 != null && !f02.u() && f02.k() == j2) {
                    if (!this.f1669f.n(f02.f1686a)) {
                        return f02;
                    }
                    b0Var = f02;
                }
            }
        }
        return b0Var;
    }

    public void a(int i2) {
        getScrollingChildHelper().s(i2);
    }

    /* access modifiers changed from: package-private */
    public b0 a0(int i2, boolean z2) {
        int j2 = this.f1669f.j();
        b0 b0Var = null;
        for (int i3 = 0; i3 < j2; i3++) {
            b0 f02 = f0(this.f1669f.i(i3));
            if (f02 != null && !f02.u()) {
                if (z2) {
                    if (f02.f1688c != i2) {
                        continue;
                    }
                } else if (f02.m() != i2) {
                    continue;
                }
                if (!this.f1669f.n(f02.f1686a)) {
                    return f02;
                }
                b0Var = f02;
            }
        }
        return b0Var;
    }

    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        LayoutManager layoutManager = this.n;
        if (layoutManager == null || !layoutManager.D0(this, arrayList, i2, i3)) {
            super.addFocusables(arrayList, i2, i3);
        }
    }

    public boolean b0(int i2, int i3) {
        LayoutManager layoutManager = this.n;
        int i4 = 0;
        if (layoutManager == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.y) {
            return false;
        } else {
            boolean j2 = layoutManager.j();
            boolean k2 = this.n.k();
            if (!j2 || Math.abs(i2) < this.a0) {
                i2 = 0;
            }
            if (!k2 || Math.abs(i3) < this.a0) {
                i3 = 0;
            }
            if (i2 == 0 && i3 == 0) {
                return false;
            }
            float f2 = (float) i2;
            float f3 = (float) i3;
            if (!dispatchNestedPreFling(f2, f3)) {
                boolean z2 = j2 || k2;
                dispatchNestedFling(f2, f3, z2);
                q qVar = this.W;
                if (qVar != null && qVar.a(i2, i3)) {
                    return true;
                }
                if (z2) {
                    if (j2) {
                        i4 = 1;
                    }
                    if (k2) {
                        i4 |= 2;
                    }
                    m1(i4, 1);
                    int i5 = this.b0;
                    int max = Math.max(-i5, Math.min(i2, i5));
                    int i6 = this.b0;
                    this.f0.e(max, Math.max(-i6, Math.min(i3, i6)));
                    return true;
                }
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public void c(int i2, int i3) {
        if (i2 < 0) {
            O();
            this.J.onAbsorb(-i2);
        } else if (i2 > 0) {
            P();
            this.L.onAbsorb(i2);
        }
        if (i3 < 0) {
            Q();
            this.K.onAbsorb(-i3);
        } else if (i3 > 0) {
            N();
            this.M.onAbsorb(i3);
        }
        if (i2 != 0 || i3 != 0) {
            a.h.k.t.T(this);
        }
    }

    /* access modifiers changed from: package-private */
    public int c0(b0 b0Var) {
        if (b0Var.p(524) || !b0Var.r()) {
            return -1;
        }
        return this.f1668e.e(b0Var.f1688c);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof o) && this.n.l((o) layoutParams);
    }

    public int computeHorizontalScrollExtent() {
        LayoutManager layoutManager = this.n;
        if (layoutManager != null && layoutManager.j()) {
            return this.n.p(this.i0);
        }
        return 0;
    }

    public int computeHorizontalScrollOffset() {
        LayoutManager layoutManager = this.n;
        if (layoutManager != null && layoutManager.j()) {
            return this.n.q(this.i0);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        LayoutManager layoutManager = this.n;
        if (layoutManager != null && layoutManager.j()) {
            return this.n.r(this.i0);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        LayoutManager layoutManager = this.n;
        if (layoutManager != null && layoutManager.k()) {
            return this.n.s(this.i0);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        LayoutManager layoutManager = this.n;
        if (layoutManager != null && layoutManager.k()) {
            return this.n.t(this.i0);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        LayoutManager layoutManager = this.n;
        if (layoutManager != null && layoutManager.k()) {
            return this.n.u(this.i0);
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public long d0(b0 b0Var) {
        return this.m.f() ? b0Var.k() : (long) b0Var.f1688c;
    }

    /* access modifiers changed from: package-private */
    public void d1() {
        int j2 = this.f1669f.j();
        for (int i2 = 0; i2 < j2; i2++) {
            b0 f02 = f0(this.f1669f.i(i2));
            if (!f02.I()) {
                f02.D();
            }
        }
    }

    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return getScrollingChildHelper().a(f2, f3, z2);
    }

    public boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().b(f2, f3);
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().f(i2, i3, i4, i5, iArr);
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z2;
        super.draw(canvas);
        int size = this.p.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            this.p.get(i2).i(canvas, this, this.i0);
        }
        EdgeEffect edgeEffect = this.J;
        boolean z4 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.J;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.K;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.h) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.K;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.L;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) (-paddingTop), (float) (-width));
            EdgeEffect edgeEffect6 = this.L;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.M;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.h) {
                canvas.translate((float) ((-getWidth()) + getPaddingRight()), (float) ((-getHeight()) + getPaddingBottom()));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect8 = this.M;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(save4);
        }
        if (z2 || this.N == null || this.p.size() <= 0 || !this.N.p()) {
            z4 = z2;
        }
        if (z4) {
            a.h.k.t.T(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public b0 e0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return f0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* access modifiers changed from: package-private */
    public boolean e1(int i2, int i3, MotionEvent motionEvent) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = i2;
        int i9 = i3;
        MotionEvent motionEvent2 = motionEvent;
        v();
        if (this.m != null) {
            f1(i8, i9, this.w0);
            int[] iArr = this.w0;
            int i10 = iArr[0];
            int i11 = iArr[1];
            i6 = i11;
            i5 = i10;
            i4 = i8 - i10;
            i7 = i9 - i11;
        } else {
            i7 = 0;
            i6 = 0;
            i5 = 0;
            i4 = 0;
        }
        if (!this.p.isEmpty()) {
            invalidate();
        }
        int i12 = i7;
        if (H(i5, i6, i4, i7, this.t0, 0)) {
            int i13 = this.T;
            int[] iArr2 = this.t0;
            this.T = i13 - iArr2[0];
            this.U -= iArr2[1];
            if (motionEvent2 != null) {
                motionEvent2.offsetLocation((float) iArr2[0], (float) iArr2[1]);
            }
            int[] iArr3 = this.v0;
            int i14 = iArr3[0];
            int[] iArr4 = this.t0;
            iArr3[0] = i14 + iArr4[0];
            iArr3[1] = iArr3[1] + iArr4[1];
        } else if (getOverScrollMode() != 2) {
            if (motionEvent2 != null && !a.h.k.i.a(motionEvent2, 8194)) {
                P0(motionEvent.getX(), (float) i4, motionEvent.getY(), (float) i12);
            }
            u(i2, i3);
        }
        if (!(i5 == 0 && i6 == 0)) {
            L(i5, i6);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (i5 == 0 && i6 == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void f1(int i2, int i3, int[] iArr) {
        l1();
        F0();
        androidx.core.os.a.a("RV Scroll");
        S(this.i0);
        int t1 = i2 != 0 ? this.n.t1(i2, this.f1666c, this.i0) : 0;
        int u1 = i3 != 0 ? this.n.u1(i3, this.f1666c, this.i0) : 0;
        androidx.core.os.a.b();
        Y0();
        G0();
        n1(false);
        if (iArr != null) {
            iArr[0] = t1;
            iArr[1] = u1;
        }
    }

    public View focusSearch(View view, int i2) {
        View view2;
        boolean z2;
        View O0 = this.n.O0(view, i2);
        if (O0 != null) {
            return O0;
        }
        boolean z3 = true;
        boolean z4 = this.m != null && this.n != null && !u0() && !this.y;
        FocusFinder instance = FocusFinder.getInstance();
        if (!z4 || !(i2 == 2 || i2 == 1)) {
            View findNextFocus = instance.findNextFocus(this, view, i2);
            if (findNextFocus != null || !z4) {
                view2 = findNextFocus;
            } else {
                v();
                if (T(view) == null) {
                    return null;
                }
                l1();
                view2 = this.n.H0(view, i2, this.f1666c, this.i0);
                n1(false);
            }
        } else {
            if (this.n.k()) {
                int i3 = i2 == 2 ? 130 : 33;
                z2 = instance.findNextFocus(this, view, i3) == null;
                if (G0) {
                    i2 = i3;
                }
            } else {
                z2 = false;
            }
            if (!z2 && this.n.j()) {
                int i4 = (this.n.X() == 1) ^ (i2 == 2) ? 66 : 17;
                if (instance.findNextFocus(this, view, i4) != null) {
                    z3 = false;
                }
                if (G0) {
                    i2 = i4;
                }
                z2 = z3;
            }
            if (z2) {
                v();
                if (T(view) == null) {
                    return null;
                }
                l1();
                this.n.H0(view, i2, this.f1666c, this.i0);
                n1(false);
            }
            view2 = instance.findNextFocus(this, view, i2);
        }
        if (view2 == null || view2.hasFocusable()) {
            return v0(view, view2, i2) ? view2 : super.focusSearch(view, i2);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i2);
        }
        Z0(view2, (View) null);
        return view;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutManager layoutManager = this.n;
        if (layoutManager != null) {
            return layoutManager.C();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + R());
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        LayoutManager layoutManager = this.n;
        if (layoutManager != null) {
            return layoutManager.D(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + R());
    }

    public g getAdapter() {
        return this.m;
    }

    public int getBaseline() {
        LayoutManager layoutManager = this.n;
        if (layoutManager != null) {
            return layoutManager.F();
        }
        return super.getBaseline();
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i2, int i3) {
        j jVar = this.q0;
        if (jVar == null) {
            return super.getChildDrawingOrder(i2, i3);
        }
        return jVar.a(i2, i3);
    }

    public boolean getClipToPadding() {
        return this.h;
    }

    public i getCompatAccessibilityDelegate() {
        return this.p0;
    }

    public k getEdgeEffectFactory() {
        return this.I;
    }

    public l getItemAnimator() {
        return this.N;
    }

    public int getItemDecorationCount() {
        return this.p.size();
    }

    public LayoutManager getLayoutManager() {
        return this.n;
    }

    public int getMaxFlingVelocity() {
        return this.b0;
    }

    public int getMinFlingVelocity() {
        return this.a0;
    }

    /* access modifiers changed from: package-private */
    public long getNanoTime() {
        if (F0) {
            return System.nanoTime();
        }
        return 0;
    }

    public q getOnFlingListener() {
        return this.W;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.e0;
    }

    public t getRecycledViewPool() {
        return this.f1666c.i();
    }

    public int getScrollState() {
        return this.O;
    }

    /* access modifiers changed from: package-private */
    public boolean h1(b0 b0Var, int i2) {
        if (u0()) {
            b0Var.q = i2;
            this.x0.add(b0Var);
            return false;
        }
        a.h.k.t.i0(b0Var.f1686a, i2);
        return true;
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().k();
    }

    public void i(n nVar) {
        j(nVar, -1);
    }

    /* access modifiers changed from: package-private */
    public boolean i1(AccessibilityEvent accessibilityEvent) {
        int i2 = 0;
        if (!u0()) {
            return false;
        }
        int a2 = accessibilityEvent != null ? a.h.k.c0.b.a(accessibilityEvent) : 0;
        if (a2 != 0) {
            i2 = a2;
        }
        this.A |= i2;
        return true;
    }

    public boolean isAttachedToWindow() {
        return this.s;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().m();
    }

    public void j(n nVar, int i2) {
        LayoutManager layoutManager = this.n;
        if (layoutManager != null) {
            layoutManager.f("Cannot add item decoration during a scroll  or layout");
        }
        if (this.p.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i2 < 0) {
            this.p.add(nVar);
        } else {
            this.p.add(i2, nVar);
        }
        w0();
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public Rect j0(View view) {
        o oVar = (o) view.getLayoutParams();
        if (!oVar.f1708c) {
            return oVar.f1707b;
        }
        if (this.i0.e() && (oVar.b() || oVar.d())) {
            return oVar.f1707b;
        }
        Rect rect = oVar.f1707b;
        rect.set(0, 0, 0, 0);
        int size = this.p.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.j.set(0, 0, 0, 0);
            this.p.get(i2).e(this.j, view, this, this.i0);
            int i3 = rect.left;
            Rect rect2 = this.j;
            rect.left = i3 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        oVar.f1708c = false;
        return rect;
    }

    public void j1(int i2, int i3) {
        k1(i2, i3, (Interpolator) null);
    }

    public void k(r rVar) {
        this.q.add(rVar);
    }

    public void k1(int i2, int i3, Interpolator interpolator) {
        LayoutManager layoutManager = this.n;
        if (layoutManager == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.y) {
            if (!layoutManager.j()) {
                i2 = 0;
            }
            if (!this.n.k()) {
                i3 = 0;
            }
            if (i2 != 0 || i3 != 0) {
                this.f0.h(i2, i3, interpolator);
            }
        }
    }

    public void l(s sVar) {
        if (this.k0 == null) {
            this.k0 = new ArrayList();
        }
        this.k0.add(sVar);
    }

    public boolean l0(int i2) {
        return getScrollingChildHelper().l(i2);
    }

    /* access modifiers changed from: package-private */
    public void l1() {
        int i2 = this.w + 1;
        this.w = i2;
        if (i2 == 1 && !this.y) {
            this.x = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void m(b0 b0Var, l.c cVar, l.c cVar2) {
        b0Var.F(false);
        if (this.N.a(b0Var, cVar, cVar2)) {
            L0();
        }
    }

    public boolean m0() {
        return !this.v || this.E || this.f1668e.p();
    }

    public boolean m1(int i2, int i3) {
        return getScrollingChildHelper().q(i2, i3);
    }

    /* access modifiers changed from: package-private */
    public void n1(boolean z2) {
        if (this.w < 1) {
            this.w = 1;
        }
        if (!z2 && !this.y) {
            this.x = false;
        }
        if (this.w == 1) {
            if (z2 && this.x && !this.y && this.n != null && this.m != null) {
                C();
            }
            if (!this.y) {
                this.x = false;
            }
        }
        this.w--;
    }

    /* access modifiers changed from: package-private */
    public void o(b0 b0Var, l.c cVar, l.c cVar2) {
        h(b0Var);
        b0Var.F(false);
        if (this.N.c(b0Var, cVar, cVar2)) {
            L0();
        }
    }

    /* access modifiers changed from: package-private */
    public void o0() {
        this.f1668e = new a(new f());
    }

    public void o1() {
        setScrollState(0);
        p1();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.G = 0;
        boolean z2 = true;
        this.s = true;
        if (!this.v || isLayoutRequested()) {
            z2 = false;
        }
        this.v = z2;
        LayoutManager layoutManager = this.n;
        if (layoutManager != null) {
            layoutManager.y(this);
        }
        this.o0 = false;
        if (F0) {
            e eVar = e.f1820f.get();
            this.g0 = eVar;
            if (eVar == null) {
                this.g0 = new e();
                Display n2 = a.h.k.t.n(this);
                float f2 = 60.0f;
                if (!isInEditMode() && n2 != null) {
                    float refreshRate = n2.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f2 = refreshRate;
                    }
                }
                e eVar2 = this.g0;
                eVar2.f1823d = (long) (1.0E9f / f2);
                e.f1820f.set(eVar2);
            }
            this.g0.a(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        e eVar;
        super.onDetachedFromWindow();
        l lVar = this.N;
        if (lVar != null) {
            lVar.k();
        }
        o1();
        this.s = false;
        LayoutManager layoutManager = this.n;
        if (layoutManager != null) {
            layoutManager.z(this, this.f1666c);
        }
        this.x0.clear();
        removeCallbacks(this.y0);
        this.g.j();
        if (F0 && (eVar = this.g0) != null) {
            eVar.j(this);
            this.g0 = null;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.p.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.p.get(i2).g(canvas, this, this.i0);
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f2;
        float f3;
        if (this.n != null && !this.y && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f3 = this.n.k() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.n.j()) {
                    f2 = motionEvent.getAxisValue(10);
                    if (!(f3 == 0.0f && f2 == 0.0f)) {
                        e1((int) (f2 * this.c0), (int) (f3 * this.d0), motionEvent);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.n.k()) {
                        f3 = -axisValue;
                    } else if (this.n.j()) {
                        f2 = axisValue;
                        f3 = 0.0f;
                        e1((int) (f2 * this.c0), (int) (f3 * this.d0), motionEvent);
                    }
                }
                f3 = 0.0f;
            }
            f2 = 0.0f;
            e1((int) (f2 * this.c0), (int) (f3 * this.d0), motionEvent);
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (this.y) {
            return false;
        }
        if (J(motionEvent)) {
            r();
            return true;
        }
        LayoutManager layoutManager = this.n;
        if (layoutManager == null) {
            return false;
        }
        boolean j2 = layoutManager.j();
        boolean k2 = this.n.k();
        if (this.Q == null) {
            this.Q = VelocityTracker.obtain();
        }
        this.Q.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.z) {
                this.z = false;
            }
            this.P = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.T = x2;
            this.R = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.U = y2;
            this.S = y2;
            if (this.O == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
            }
            int[] iArr = this.v0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i2 = j2 ? 1 : 0;
            if (k2) {
                i2 |= 2;
            }
            m1(i2, 0);
        } else if (actionMasked == 1) {
            this.Q.clear();
            a(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.P);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.P + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.O != 1) {
                int i3 = x3 - this.R;
                int i4 = y3 - this.S;
                if (!j2 || Math.abs(i3) <= this.V) {
                    z2 = false;
                } else {
                    this.T = x3;
                    z2 = true;
                }
                if (k2 && Math.abs(i4) > this.V) {
                    this.U = y3;
                    z2 = true;
                }
                if (z2) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            r();
        } else if (actionMasked == 5) {
            this.P = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.T = x4;
            this.R = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.U = y4;
            this.S = y4;
        } else if (actionMasked == 6) {
            I0(motionEvent);
        }
        if (this.O == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        androidx.core.os.a.a("RV OnLayout");
        C();
        androidx.core.os.a.b();
        this.v = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        LayoutManager layoutManager = this.n;
        if (layoutManager == null) {
            x(i2, i3);
            return;
        }
        boolean z2 = false;
        if (layoutManager.q0()) {
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.n.X0(this.f1666c, this.i0, i2, i3);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z2 = true;
            }
            if (!z2 && this.m != null) {
                if (this.i0.f1727e == 1) {
                    D();
                }
                this.n.w1(i2, i3);
                this.i0.j = true;
                E();
                this.n.z1(i2, i3);
                if (this.n.C1()) {
                    this.n.w1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.i0.j = true;
                    E();
                    this.n.z1(i2, i3);
                }
            }
        } else if (this.t) {
            this.n.X0(this.f1666c, this.i0, i2, i3);
        } else {
            if (this.B) {
                l1();
                F0();
                N0();
                G0();
                y yVar = this.i0;
                if (yVar.l) {
                    yVar.h = true;
                } else {
                    this.f1668e.j();
                    this.i0.h = false;
                }
                this.B = false;
                n1(false);
            } else if (this.i0.l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            g gVar = this.m;
            if (gVar != null) {
                this.i0.f1728f = gVar.c();
            } else {
                this.i0.f1728f = 0;
            }
            l1();
            this.n.X0(this.f1666c, this.i0, i2, i3);
            n1(false);
            this.i0.h = false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (u0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f1667d = savedState;
        super.onRestoreInstanceState(savedState.a());
        LayoutManager layoutManager = this.n;
        if (layoutManager != null && (parcelable2 = this.f1667d.f1678d) != null) {
            layoutManager.a1(parcelable2);
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.f1667d;
        if (savedState2 != null) {
            savedState.b(savedState2);
        } else {
            LayoutManager layoutManager = this.n;
            if (layoutManager != null) {
                savedState.f1678d = layoutManager.b1();
            } else {
                savedState.f1678d = null;
            }
        }
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4 || i3 != i5) {
            s0();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i2;
        int i3;
        boolean z2;
        int i4;
        int i5;
        boolean z3 = false;
        if (this.y || this.z) {
            return false;
        }
        if (I(motionEvent)) {
            r();
            return true;
        }
        LayoutManager layoutManager = this.n;
        if (layoutManager == null) {
            return false;
        }
        boolean j2 = layoutManager.j();
        boolean k2 = this.n.k();
        if (this.Q == null) {
            this.Q = VelocityTracker.obtain();
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.v0;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        int[] iArr2 = this.v0;
        obtain.offsetLocation((float) iArr2[0], (float) iArr2[1]);
        if (actionMasked == 0) {
            this.P = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.T = x2;
            this.R = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.U = y2;
            this.S = y2;
            int i6 = j2 ? 1 : 0;
            if (k2) {
                i6 |= 2;
            }
            m1(i6, 0);
        } else if (actionMasked == 1) {
            this.Q.addMovement(obtain);
            this.Q.computeCurrentVelocity(1000, (float) this.b0);
            float f2 = j2 ? -this.Q.getXVelocity(this.P) : 0.0f;
            float f3 = k2 ? -this.Q.getYVelocity(this.P) : 0.0f;
            if ((f2 == 0.0f && f3 == 0.0f) || !b0((int) f2, (int) f3)) {
                setScrollState(0);
            }
            b1();
            z3 = true;
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.P);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.P + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            int i7 = this.T - x3;
            int i8 = this.U - y3;
            if (G(i7, i8, this.u0, this.t0, 0)) {
                int[] iArr3 = this.u0;
                i7 -= iArr3[0];
                i8 -= iArr3[1];
                int[] iArr4 = this.t0;
                obtain.offsetLocation((float) iArr4[0], (float) iArr4[1]);
                int[] iArr5 = this.v0;
                int i9 = iArr5[0];
                int[] iArr6 = this.t0;
                iArr5[0] = i9 + iArr6[0];
                iArr5[1] = iArr5[1] + iArr6[1];
            }
            if (this.O != 1) {
                if (!j2 || Math.abs(i3) <= (i5 = this.V)) {
                    z2 = false;
                } else {
                    i3 = i3 > 0 ? i3 - i5 : i3 + i5;
                    z2 = true;
                }
                if (k2 && Math.abs(i2) > (i4 = this.V)) {
                    i2 = i2 > 0 ? i2 - i4 : i2 + i4;
                    z2 = true;
                }
                if (z2) {
                    setScrollState(1);
                }
            }
            if (this.O == 1) {
                int[] iArr7 = this.t0;
                this.T = x3 - iArr7[0];
                this.U = y3 - iArr7[1];
                if (e1(j2 ? i3 : 0, k2 ? i2 : 0, obtain)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (!(this.g0 == null || (i3 == 0 && i2 == 0))) {
                    this.g0.f(this, i3, i2);
                }
            }
        } else if (actionMasked == 3) {
            r();
        } else if (actionMasked == 5) {
            this.P = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.T = x4;
            this.R = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.U = y4;
            this.S = y4;
        } else if (actionMasked == 6) {
            I0(motionEvent);
        }
        if (!z3) {
            this.Q.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    /* access modifiers changed from: package-private */
    public void p(String str) {
        if (u0()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + R());
            }
            throw new IllegalStateException(str);
        } else if (this.H > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + R()));
        }
    }

    /* access modifiers changed from: package-private */
    public boolean q(b0 b0Var) {
        l lVar = this.N;
        return lVar == null || lVar.g(b0Var, b0Var.o());
    }

    /* access modifiers changed from: package-private */
    public void q1(int i2, int i3, Object obj) {
        int i4;
        int j2 = this.f1669f.j();
        int i5 = i2 + i3;
        for (int i6 = 0; i6 < j2; i6++) {
            View i7 = this.f1669f.i(i6);
            b0 f02 = f0(i7);
            if (f02 != null && !f02.I() && (i4 = f02.f1688c) >= i2 && i4 < i5) {
                f02.b(2);
                f02.a(obj);
                ((o) i7.getLayoutParams()).f1708c = true;
            }
        }
        this.f1666c.M(i2, i3);
    }

    /* access modifiers changed from: package-private */
    public void r0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + R());
        }
        Resources resources = getContext().getResources();
        new d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(a.o.a.fastscroll_default_thickness), resources.getDimensionPixelSize(a.o.a.fastscroll_minimum_range), resources.getDimensionPixelOffset(a.o.a.fastscroll_margin));
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z2) {
        b0 f02 = f0(view);
        if (f02 != null) {
            if (f02.w()) {
                f02.f();
            } else if (!f02.I()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + f02 + R());
            }
        }
        view.clearAnimation();
        A(view);
        super.removeDetachedView(view, z2);
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.n.Z0(this, this.i0, view, view2) && view2 != null) {
            Z0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.n.o1(this, view, rect, z2);
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        int size = this.q.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.q.get(i2).c(z2);
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    public void requestLayout() {
        if (this.w != 0 || this.y) {
            this.x = true;
        } else {
            super.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public void s0() {
        this.M = null;
        this.K = null;
        this.L = null;
        this.J = null;
    }

    public void scrollBy(int i2, int i3) {
        LayoutManager layoutManager = this.n;
        if (layoutManager == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.y) {
            boolean j2 = layoutManager.j();
            boolean k2 = this.n.k();
            if (j2 || k2) {
                if (!j2) {
                    i2 = 0;
                }
                if (!k2) {
                    i3 = 0;
                }
                e1(i2, i3, (MotionEvent) null);
            }
        }
    }

    public void scrollTo(int i2, int i3) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!i1(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(i iVar) {
        this.p0 = iVar;
        a.h.k.t.Z(this, iVar);
    }

    public void setAdapter(g gVar) {
        setLayoutFrozen(false);
        g1(gVar, false, true);
        O0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(j jVar) {
        if (jVar != this.q0) {
            this.q0 = jVar;
            setChildrenDrawingOrderEnabled(jVar != null);
        }
    }

    public void setClipToPadding(boolean z2) {
        if (z2 != this.h) {
            s0();
        }
        this.h = z2;
        super.setClipToPadding(z2);
        if (this.v) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(k kVar) {
        a.h.j.h.b(kVar);
        this.I = kVar;
        s0();
    }

    public void setHasFixedSize(boolean z2) {
        this.t = z2;
    }

    public void setItemAnimator(l lVar) {
        l lVar2 = this.N;
        if (lVar2 != null) {
            lVar2.k();
            this.N.v((l.b) null);
        }
        this.N = lVar;
        if (lVar != null) {
            lVar.v(this.n0);
        }
    }

    public void setItemViewCacheSize(int i2) {
        this.f1666c.G(i2);
    }

    public void setLayoutFrozen(boolean z2) {
        if (z2 != this.y) {
            p("Do not setLayoutFrozen in layout or scroll");
            if (!z2) {
                this.y = false;
                if (!(!this.x || this.n == null || this.m == null)) {
                    requestLayout();
                }
                this.x = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.y = true;
            this.z = true;
            o1();
        }
    }

    public void setLayoutManager(LayoutManager layoutManager) {
        if (layoutManager != this.n) {
            o1();
            if (this.n != null) {
                l lVar = this.N;
                if (lVar != null) {
                    lVar.k();
                }
                this.n.h1(this.f1666c);
                this.n.i1(this.f1666c);
                this.f1666c.c();
                if (this.s) {
                    this.n.z(this, this.f1666c);
                }
                this.n.A1((RecyclerView) null);
                this.n = null;
            } else {
                this.f1666c.c();
            }
            this.f1669f.o();
            this.n = layoutManager;
            if (layoutManager != null) {
                if (layoutManager.f1671b == null) {
                    layoutManager.A1(this);
                    if (this.s) {
                        this.n.y(this);
                    }
                } else {
                    throw new IllegalArgumentException("LayoutManager " + layoutManager + " is already attached to a RecyclerView:" + layoutManager.f1671b.R());
                }
            }
            this.f1666c.K();
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z2) {
        getScrollingChildHelper().n(z2);
    }

    public void setOnFlingListener(q qVar) {
        this.W = qVar;
    }

    @Deprecated
    public void setOnScrollListener(s sVar) {
        this.j0 = sVar;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.e0 = z2;
    }

    public void setRecycledViewPool(t tVar) {
        this.f1666c.E(tVar);
    }

    public void setRecyclerListener(v vVar) {
        this.o = vVar;
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i2) {
        if (i2 != this.O) {
            this.O = i2;
            if (i2 != 2) {
                p1();
            }
            K(i2);
        }
    }

    public void setScrollingTouchSlop(int i2) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 0) {
            if (i2 != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i2 + "; using default value");
            } else {
                this.V = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.V = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(z zVar) {
        this.f1666c.F(zVar);
    }

    public boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().p(i2);
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().r();
    }

    /* access modifiers changed from: package-private */
    public void t() {
        int j2 = this.f1669f.j();
        for (int i2 = 0; i2 < j2; i2++) {
            b0 f02 = f0(this.f1669f.i(i2));
            if (!f02.I()) {
                f02.c();
            }
        }
        this.f1666c.d();
    }

    /* access modifiers changed from: package-private */
    public boolean t0() {
        AccessibilityManager accessibilityManager = this.C;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    /* access modifiers changed from: package-private */
    public void u(int i2, int i3) {
        boolean z2;
        EdgeEffect edgeEffect = this.J;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            z2 = false;
        } else {
            this.J.onRelease();
            z2 = this.J.isFinished();
        }
        EdgeEffect edgeEffect2 = this.L;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.L.onRelease();
            z2 |= this.L.isFinished();
        }
        EdgeEffect edgeEffect3 = this.K;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.K.onRelease();
            z2 |= this.K.isFinished();
        }
        EdgeEffect edgeEffect4 = this.M;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.M.onRelease();
            z2 |= this.M.isFinished();
        }
        if (z2) {
            a.h.k.t.T(this);
        }
    }

    public boolean u0() {
        return this.G > 0;
    }

    /* access modifiers changed from: package-private */
    public void v() {
        if (!this.v || this.E) {
            androidx.core.os.a.a("RV FullInvalidate");
            C();
            androidx.core.os.a.b();
        } else if (this.f1668e.p()) {
            if (this.f1668e.o(4) && !this.f1668e.o(11)) {
                androidx.core.os.a.a("RV PartialInvalidate");
                l1();
                F0();
                this.f1668e.u();
                if (!this.x) {
                    if (n0()) {
                        C();
                    } else {
                        this.f1668e.i();
                    }
                }
                n1(true);
                G0();
                androidx.core.os.a.b();
            } else if (this.f1668e.p()) {
                androidx.core.os.a.a("RV FullInvalidate");
                C();
                androidx.core.os.a.b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void w0() {
        int j2 = this.f1669f.j();
        for (int i2 = 0; i2 < j2; i2++) {
            ((o) this.f1669f.i(i2).getLayoutParams()).f1708c = true;
        }
        this.f1666c.s();
    }

    /* access modifiers changed from: package-private */
    public void x(int i2, int i3) {
        setMeasuredDimension(LayoutManager.m(i2, getPaddingLeft() + getPaddingRight(), a.h.k.t.v(this)), LayoutManager.m(i3, getPaddingTop() + getPaddingBottom(), a.h.k.t.u(this)));
    }

    /* access modifiers changed from: package-private */
    public void x0() {
        int j2 = this.f1669f.j();
        for (int i2 = 0; i2 < j2; i2++) {
            b0 f02 = f0(this.f1669f.i(i2));
            if (f02 != null && !f02.I()) {
                f02.b(6);
            }
        }
        w0();
        this.f1666c.t();
    }

    public void y0(int i2) {
        int g2 = this.f1669f.g();
        for (int i3 = 0; i3 < g2; i3++) {
            this.f1669f.f(i3).offsetLeftAndRight(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void z(View view) {
        b0 f02 = f0(view);
        D0(view);
        g gVar = this.m;
        if (!(gVar == null || f02 == null)) {
            gVar.p(f02);
        }
        List<p> list = this.D;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.D.get(size).b(view);
            }
        }
    }

    public void z0(int i2) {
        int g2 = this.f1669f.g();
        for (int i3 = 0; i3 < g2; i3++) {
            this.f1669f.f(i3).offsetTopAndBottom(i2);
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f1665b = new w();
        this.f1666c = new u();
        this.g = new m();
        this.i = new a();
        this.j = new Rect();
        this.k = new Rect();
        this.l = new RectF();
        this.p = new ArrayList<>();
        this.q = new ArrayList<>();
        this.w = 0;
        this.E = false;
        this.F = false;
        this.G = 0;
        this.H = 0;
        this.I = new k();
        this.N = new c();
        this.O = 0;
        this.P = -1;
        this.c0 = Float.MIN_VALUE;
        this.d0 = Float.MIN_VALUE;
        boolean z2 = true;
        this.e0 = true;
        this.f0 = new a0();
        this.h0 = F0 ? new e.b() : null;
        this.i0 = new y();
        this.l0 = false;
        this.m0 = false;
        this.n0 = new m();
        this.o0 = false;
        this.r0 = new int[2];
        this.t0 = new int[2];
        this.u0 = new int[2];
        this.v0 = new int[2];
        this.w0 = new int[2];
        this.x0 = new ArrayList();
        this.y0 = new b();
        this.z0 = new d();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, B0, i2, 0);
            this.h = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.h = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.V = viewConfiguration.getScaledTouchSlop();
        this.c0 = a.h.k.u.b(viewConfiguration, context);
        this.d0 = a.h.k.u.d(viewConfiguration, context);
        this.a0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.b0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.N.v(this.n0);
        o0();
        q0();
        p0();
        if (a.h.k.t.r(this) == 0) {
            a.h.k.t.i0(this, 1);
        }
        this.C = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new i(this));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, a.o.b.RecyclerView, i2, 0);
            String string = obtainStyledAttributes2.getString(a.o.b.RecyclerView_layoutManager);
            if (obtainStyledAttributes2.getInt(a.o.b.RecyclerView_android_descendantFocusability, -1) == -1) {
                setDescendantFocusability(262144);
            }
            boolean z3 = obtainStyledAttributes2.getBoolean(a.o.b.RecyclerView_fastScrollEnabled, false);
            this.u = z3;
            if (z3) {
                r0((StateListDrawable) obtainStyledAttributes2.getDrawable(a.o.b.RecyclerView_fastScrollVerticalThumbDrawable), obtainStyledAttributes2.getDrawable(a.o.b.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) obtainStyledAttributes2.getDrawable(a.o.b.RecyclerView_fastScrollHorizontalThumbDrawable), obtainStyledAttributes2.getDrawable(a.o.b.RecyclerView_fastScrollHorizontalTrackDrawable));
            }
            obtainStyledAttributes2.recycle();
            w(context, string, attributeSet, i2, 0);
            if (Build.VERSION.SDK_INT >= 21) {
                TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, A0, i2, 0);
                boolean z4 = obtainStyledAttributes3.getBoolean(0, true);
                obtainStyledAttributes3.recycle();
                z2 = z4;
            }
        } else {
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(z2);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        Parcelable f1678d;

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

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1678d = parcel.readParcelable(classLoader == null ? LayoutManager.class.getClassLoader() : classLoader);
        }

        /* access modifiers changed from: package-private */
        public void b(SavedState savedState) {
            this.f1678d = savedState.f1678d;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f1678d, 0);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class o extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        b0 f1706a;

        /* renamed from: b  reason: collision with root package name */
        final Rect f1707b = new Rect();

        /* renamed from: c  reason: collision with root package name */
        boolean f1708c = true;

        /* renamed from: d  reason: collision with root package name */
        boolean f1709d = false;

        public o(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public int a() {
            return this.f1706a.m();
        }

        public boolean b() {
            return this.f1706a.x();
        }

        public boolean c() {
            return this.f1706a.u();
        }

        public boolean d() {
            return this.f1706a.s();
        }

        public o(int i, int i2) {
            super(i, i2);
        }

        public o(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public o(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public o(o oVar) {
            super(oVar);
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        LayoutManager layoutManager = this.n;
        if (layoutManager != null) {
            return layoutManager.E(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + R());
    }
}
