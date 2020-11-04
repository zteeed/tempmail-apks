package androidx.drawerlayout.widget;

import a.h.k.d0.d;
import a.h.k.u;
import a.j.a.c;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.List;

public class DrawerLayout extends ViewGroup {
    private static final int[] L = {16843828};
    static final int[] M = {16842931};
    static final boolean N = (Build.VERSION.SDK_INT >= 19);
    private static final boolean O;
    private CharSequence A;
    private CharSequence B;
    private Object C;
    private boolean D;
    private Drawable E;
    private Drawable F;
    private Drawable G;
    private Drawable H;
    private final ArrayList<View> I;
    private Rect J;
    private Matrix K;

    /* renamed from: b  reason: collision with root package name */
    private final c f1443b;

    /* renamed from: c  reason: collision with root package name */
    private float f1444c;

    /* renamed from: d  reason: collision with root package name */
    private int f1445d;

    /* renamed from: e  reason: collision with root package name */
    private int f1446e;

    /* renamed from: f  reason: collision with root package name */
    private float f1447f;
    private Paint g;
    private final a.j.a.c h;
    private final a.j.a.c i;
    private final f j;
    private final f k;
    private int l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private int r;
    private boolean s;
    private d t;
    private List<d> u;
    private float v;
    private float w;
    private Drawable x;
    private Drawable y;
    private Drawable z;

    class a implements View.OnApplyWindowInsetsListener {
        a() {
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((DrawerLayout) view).setChildInsets(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    class b extends a.h.k.a {

        /* renamed from: d  reason: collision with root package name */
        private final Rect f1452d = new Rect();

        b() {
        }

        private void n(a.h.k.d0.d dVar, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (DrawerLayout.A(childAt)) {
                    dVar.c(childAt);
                }
            }
        }

        private void o(a.h.k.d0.d dVar, a.h.k.d0.d dVar2) {
            Rect rect = this.f1452d;
            dVar2.k(rect);
            dVar.U(rect);
            dVar2.l(rect);
            dVar.V(rect);
            dVar.z0(dVar2.K());
            dVar.o0(dVar2.t());
            dVar.Z(dVar2.n());
            dVar.d0(dVar2.p());
            dVar.g0(dVar2.D());
            dVar.a0(dVar2.C());
            dVar.i0(dVar2.E());
            dVar.j0(dVar2.F());
            dVar.S(dVar2.z());
            dVar.u0(dVar2.J());
            dVar.m0(dVar2.G());
            dVar.a(dVar2.j());
        }

        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            CharSequence s;
            if (accessibilityEvent.getEventType() != 32) {
                return super.a(view, accessibilityEvent);
            }
            List text = accessibilityEvent.getText();
            View p = DrawerLayout.this.p();
            if (p == null || (s = DrawerLayout.this.s(DrawerLayout.this.t(p))) == null) {
                return true;
            }
            text.add(s);
            return true;
        }

        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.class.getName());
        }

        public void g(View view, a.h.k.d0.d dVar) {
            if (DrawerLayout.N) {
                super.g(view, dVar);
            } else {
                a.h.k.d0.d N = a.h.k.d0.d.N(dVar);
                super.g(view, N);
                dVar.w0(view);
                ViewParent y = u.y(view);
                if (y instanceof View) {
                    dVar.q0((View) y);
                }
                o(dVar, N);
                N.P();
                n(dVar, (ViewGroup) view);
            }
            dVar.Z(DrawerLayout.class.getName());
            dVar.i0(false);
            dVar.j0(false);
            dVar.Q(d.a.f382d);
            dVar.Q(d.a.f383e);
        }

        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.N || DrawerLayout.A(view)) {
                return super.i(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    static final class c extends a.h.k.a {
        c() {
        }

        public void g(View view, a.h.k.d0.d dVar) {
            super.g(view, dVar);
            if (!DrawerLayout.A(view)) {
                dVar.q0((View) null);
            }
        }
    }

    public interface d {
        void a(View view);

        void b(View view);

        void c(int i);

        void d(View view, float f2);
    }

    private class f extends c.C0019c {

        /* renamed from: a  reason: collision with root package name */
        private final int f1458a;

        /* renamed from: b  reason: collision with root package name */
        private a.j.a.c f1459b;

        /* renamed from: c  reason: collision with root package name */
        private final Runnable f1460c = new a();

        class a implements Runnable {
            a() {
            }

            public void run() {
                f.this.o();
            }
        }

        f(int i) {
            this.f1458a = i;
        }

        private void n() {
            int i = 3;
            if (this.f1458a == 3) {
                i = 5;
            }
            View n = DrawerLayout.this.n(i);
            if (n != null) {
                DrawerLayout.this.f(n);
            }
        }

        public int a(View view, int i, int i2) {
            if (DrawerLayout.this.c(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i, width));
        }

        public int b(View view, int i, int i2) {
            return view.getTop();
        }

        public int d(View view) {
            if (DrawerLayout.this.E(view)) {
                return view.getWidth();
            }
            return 0;
        }

        public void f(int i, int i2) {
            View view;
            if ((i & 1) == 1) {
                view = DrawerLayout.this.n(3);
            } else {
                view = DrawerLayout.this.n(5);
            }
            if (view != null && DrawerLayout.this.r(view) == 0) {
                this.f1459b.c(view, i2);
            }
        }

        public boolean g(int i) {
            return false;
        }

        public void h(int i, int i2) {
            DrawerLayout.this.postDelayed(this.f1460c, 160);
        }

        public void i(View view, int i) {
            ((e) view.getLayoutParams()).f1456c = false;
            n();
        }

        public void j(int i) {
            DrawerLayout.this.U(this.f1458a, i, this.f1459b.w());
        }

        public void k(View view, int i, int i2, int i3, int i4) {
            float f2;
            int width = view.getWidth();
            if (DrawerLayout.this.c(view, 3)) {
                f2 = (float) (i + width);
            } else {
                f2 = (float) (DrawerLayout.this.getWidth() - i);
            }
            float f3 = f2 / ((float) width);
            DrawerLayout.this.S(view, f3);
            view.setVisibility(f3 == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        public void l(View view, float f2, float f3) {
            int i;
            float u = DrawerLayout.this.u(view);
            int width = view.getWidth();
            if (DrawerLayout.this.c(view, 3)) {
                int i2 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
                i = (i2 > 0 || (i2 == 0 && u > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f2 < 0.0f || (f2 == 0.0f && u > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.f1459b.N(i, view.getTop());
            DrawerLayout.this.invalidate();
        }

        public boolean m(View view, int i) {
            return DrawerLayout.this.E(view) && DrawerLayout.this.c(view, this.f1458a) && DrawerLayout.this.r(view) == 0;
        }

        /* access modifiers changed from: package-private */
        public void o() {
            View view;
            int i;
            int x = this.f1459b.x();
            int i2 = 0;
            boolean z = this.f1458a == 3;
            if (z) {
                view = DrawerLayout.this.n(3);
                if (view != null) {
                    i2 = -view.getWidth();
                }
                i = i2 + x;
            } else {
                view = DrawerLayout.this.n(5);
                i = DrawerLayout.this.getWidth() - x;
            }
            if (view == null) {
                return;
            }
            if (((z && view.getLeft() < i) || (!z && view.getLeft() > i)) && DrawerLayout.this.r(view) == 0) {
                this.f1459b.P(view, i, view.getTop());
                ((e) view.getLayoutParams()).f1456c = true;
                DrawerLayout.this.invalidate();
                n();
                DrawerLayout.this.b();
            }
        }

        public void p() {
            DrawerLayout.this.removeCallbacks(this.f1460c);
        }

        public void q(a.j.a.c cVar) {
            this.f1459b = cVar;
        }
    }

    static {
        boolean z2 = true;
        if (Build.VERSION.SDK_INT < 21) {
            z2 = false;
        }
        O = z2;
    }

    public DrawerLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    static boolean A(View view) {
        return (u.r(view) == 4 || u.r(view) == 2) ? false : true;
    }

    private boolean H(float f2, float f3, View view) {
        if (this.J == null) {
            this.J = new Rect();
        }
        view.getHitRect(this.J);
        return this.J.contains((int) f2, (int) f3);
    }

    private boolean I(Drawable drawable, int i2) {
        if (drawable == null || !androidx.core.graphics.drawable.a.h(drawable)) {
            return false;
        }
        androidx.core.graphics.drawable.a.m(drawable, i2);
        return true;
    }

    private Drawable P() {
        int t2 = u.t(this);
        if (t2 == 0) {
            Drawable drawable = this.E;
            if (drawable != null) {
                I(drawable, t2);
                return this.E;
            }
        } else {
            Drawable drawable2 = this.F;
            if (drawable2 != null) {
                I(drawable2, t2);
                return this.F;
            }
        }
        return this.G;
    }

    private Drawable Q() {
        int t2 = u.t(this);
        if (t2 == 0) {
            Drawable drawable = this.F;
            if (drawable != null) {
                I(drawable, t2);
                return this.F;
            }
        } else {
            Drawable drawable2 = this.E;
            if (drawable2 != null) {
                I(drawable2, t2);
                return this.E;
            }
        }
        return this.H;
    }

    private void R() {
        if (!O) {
            this.y = P();
            this.z = Q();
        }
    }

    private void T(View view, boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((z2 || E(childAt)) && (!z2 || childAt != view)) {
                u.i0(childAt, 4);
            } else {
                u.i0(childAt, 1);
            }
        }
    }

    private boolean m(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent v2 = v(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(v2);
            v2.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = (float) (getScrollX() - view.getLeft());
        float scrollY = (float) (getScrollY() - view.getTop());
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    private MotionEvent v(MotionEvent motionEvent, View view) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation((float) (getScrollX() - view.getLeft()), (float) (getScrollY() - view.getTop()));
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.K == null) {
                this.K = new Matrix();
            }
            matrix.invert(this.K);
            obtain.transform(this.K);
        }
        return obtain;
    }

    static String w(int i2) {
        if ((i2 & 3) == 3) {
            return "LEFT";
        }
        return (i2 & 5) == 5 ? "RIGHT" : Integer.toHexString(i2);
    }

    private static boolean x(View view) {
        Drawable background = view.getBackground();
        if (background == null || background.getOpacity() != -1) {
            return false;
        }
        return true;
    }

    private boolean y() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (((e) getChildAt(i2).getLayoutParams()).f1456c) {
                return true;
            }
        }
        return false;
    }

    private boolean z() {
        return p() != null;
    }

    /* access modifiers changed from: package-private */
    public boolean B(View view) {
        return ((e) view.getLayoutParams()).f1454a == 0;
    }

    public boolean C(int i2) {
        View n2 = n(i2);
        if (n2 != null) {
            return D(n2);
        }
        return false;
    }

    public boolean D(View view) {
        if (E(view)) {
            return (((e) view.getLayoutParams()).f1457d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* access modifiers changed from: package-private */
    public boolean E(View view) {
        int b2 = a.h.k.d.b(((e) view.getLayoutParams()).f1454a, u.t(view));
        return ((b2 & 3) == 0 && (b2 & 5) == 0) ? false : true;
    }

    public boolean F(int i2) {
        View n2 = n(i2);
        if (n2 != null) {
            return G(n2);
        }
        return false;
    }

    public boolean G(View view) {
        if (E(view)) {
            return ((e) view.getLayoutParams()).f1455b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* access modifiers changed from: package-private */
    public void J(View view, float f2) {
        float u2 = u(view);
        float width = (float) view.getWidth();
        int i2 = ((int) (width * f2)) - ((int) (u2 * width));
        if (!c(view, 3)) {
            i2 = -i2;
        }
        view.offsetLeftAndRight(i2);
        S(view, f2);
    }

    public void K(int i2) {
        L(i2, true);
    }

    public void L(int i2, boolean z2) {
        View n2 = n(i2);
        if (n2 != null) {
            N(n2, z2);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + w(i2));
    }

    public void M(View view) {
        N(view, true);
    }

    public void N(View view, boolean z2) {
        if (E(view)) {
            e eVar = (e) view.getLayoutParams();
            if (this.n) {
                eVar.f1455b = 1.0f;
                eVar.f1457d = 1;
                T(view, true);
            } else if (z2) {
                eVar.f1457d |= 2;
                if (c(view, 3)) {
                    this.h.P(view, 0, view.getTop());
                } else {
                    this.i.P(view, getWidth() - view.getWidth(), view.getTop());
                }
            } else {
                J(view, 1.0f);
                U(eVar.f1454a, 0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public void O(d dVar) {
        List<d> list;
        if (dVar != null && (list = this.u) != null) {
            list.remove(dVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void S(View view, float f2) {
        e eVar = (e) view.getLayoutParams();
        if (f2 != eVar.f1455b) {
            eVar.f1455b = f2;
            l(view, f2);
        }
    }

    /* access modifiers changed from: package-private */
    public void U(int i2, int i3, View view) {
        int A2 = this.h.A();
        int A3 = this.i.A();
        int i4 = 2;
        if (A2 == 1 || A3 == 1) {
            i4 = 1;
        } else if (!(A2 == 2 || A3 == 2)) {
            i4 = 0;
        }
        if (view != null && i3 == 0) {
            float f2 = ((e) view.getLayoutParams()).f1455b;
            if (f2 == 0.0f) {
                j(view);
            } else if (f2 == 1.0f) {
                k(view);
            }
        }
        if (i4 != this.l) {
            this.l = i4;
            List<d> list = this.u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.u.get(size).c(i4);
                }
            }
        }
    }

    public void a(d dVar) {
        if (dVar != null) {
            if (this.u == null) {
                this.u = new ArrayList();
            }
            this.u.add(dVar);
        }
    }

    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            boolean z2 = false;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (!E(childAt)) {
                    this.I.add(childAt);
                } else if (D(childAt)) {
                    childAt.addFocusables(arrayList, i2, i3);
                    z2 = true;
                }
            }
            if (!z2) {
                int size = this.I.size();
                for (int i5 = 0; i5 < size; i5++) {
                    View view = this.I.get(i5);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i2, i3);
                    }
                }
            }
            this.I.clear();
        }
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        if (o() != null || E(view)) {
            u.i0(view, 4);
        } else {
            u.i0(view, 1);
        }
        if (!N) {
            u.Z(view, this.f1443b);
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (!this.s) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                getChildAt(i2).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            this.s = true;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean c(View view, int i2) {
        return (t(view) & i2) == i2;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float f2 = 0.0f;
        for (int i2 = 0; i2 < childCount; i2++) {
            f2 = Math.max(f2, ((e) getChildAt(i2).getLayoutParams()).f1455b);
        }
        this.f1447f = f2;
        boolean n2 = this.h.n(true);
        boolean n3 = this.i.n(true);
        if (n2 || n3) {
            u.T(this);
        }
    }

    public void d(int i2) {
        e(i2, true);
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f1447f <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            View childAt = getChildAt(i2);
            if (H(x2, y2, childAt) && !B(childAt) && m(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j2) {
        Canvas canvas2 = canvas;
        View view2 = view;
        int height = getHeight();
        boolean B2 = B(view2);
        int width = getWidth();
        int save = canvas.save();
        int i2 = 0;
        if (B2) {
            int childCount = getChildCount();
            int i3 = 0;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt != view2 && childAt.getVisibility() == 0 && x(childAt) && E(childAt) && childAt.getHeight() >= height) {
                    if (c(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i3) {
                            i3 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i3, 0, width, getHeight());
            i2 = i3;
        }
        boolean drawChild = super.drawChild(canvas, view, j2);
        canvas.restoreToCount(save);
        float f2 = this.f1447f;
        if (f2 > 0.0f && B2) {
            int i5 = this.f1446e;
            this.g.setColor((i5 & 16777215) | (((int) (((float) ((-16777216 & i5) >>> 24)) * f2)) << 24));
            canvas.drawRect((float) i2, 0.0f, (float) width, (float) getHeight(), this.g);
        } else if (this.y != null && c(view2, 3)) {
            int intrinsicWidth = this.y.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = Math.max(0.0f, Math.min(((float) right2) / ((float) this.h.x()), 1.0f));
            this.y.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.y.setAlpha((int) (max * 255.0f));
            this.y.draw(canvas);
        } else if (this.z != null && c(view2, 5)) {
            int intrinsicWidth2 = this.z.getIntrinsicWidth();
            int left2 = view.getLeft();
            float max2 = Math.max(0.0f, Math.min(((float) (getWidth() - left2)) / ((float) this.i.x()), 1.0f));
            this.z.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.z.setAlpha((int) (max2 * 255.0f));
            this.z.draw(canvas);
        }
        return drawChild;
    }

    public void e(int i2, boolean z2) {
        View n2 = n(i2);
        if (n2 != null) {
            g(n2, z2);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + w(i2));
    }

    public void f(View view) {
        g(view, true);
    }

    public void g(View view, boolean z2) {
        if (E(view)) {
            e eVar = (e) view.getLayoutParams();
            if (this.n) {
                eVar.f1455b = 0.0f;
                eVar.f1457d = 0;
            } else if (z2) {
                eVar.f1457d |= 4;
                if (c(view, 3)) {
                    this.h.P(view, -view.getWidth(), view.getTop());
                } else {
                    this.i.P(view, getWidth(), view.getTop());
                }
            } else {
                J(view, 0.0f);
                U(eVar.f1454a, 0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof e) {
            return new e((e) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    public float getDrawerElevation() {
        if (O) {
            return this.f1444c;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.x;
    }

    public void h() {
        i(false);
    }

    /* access modifiers changed from: package-private */
    public void i(boolean z2) {
        boolean z3;
        int childCount = getChildCount();
        boolean z4 = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            e eVar = (e) childAt.getLayoutParams();
            if (E(childAt) && (!z2 || eVar.f1456c)) {
                int width = childAt.getWidth();
                if (c(childAt, 3)) {
                    z3 = this.h.P(childAt, -width, childAt.getTop());
                } else {
                    z3 = this.i.P(childAt, getWidth(), childAt.getTop());
                }
                z4 |= z3;
                eVar.f1456c = false;
            }
        }
        this.j.p();
        this.k.p();
        if (z4) {
            invalidate();
        }
    }

    /* access modifiers changed from: package-private */
    public void j(View view) {
        View rootView;
        e eVar = (e) view.getLayoutParams();
        if ((eVar.f1457d & 1) == 1) {
            eVar.f1457d = 0;
            List<d> list = this.u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.u.get(size).b(view);
                }
            }
            T(view, false);
            if (hasWindowFocus() && (rootView = getRootView()) != null) {
                rootView.sendAccessibilityEvent(32);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void k(View view) {
        e eVar = (e) view.getLayoutParams();
        if ((eVar.f1457d & 1) == 0) {
            eVar.f1457d = 1;
            List<d> list = this.u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.u.get(size).a(view);
                }
            }
            T(view, true);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void l(View view, float f2) {
        List<d> list = this.u;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.u.get(size).d(view, f2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public View n(int i2) {
        int b2 = a.h.k.d.b(i2, u.t(this)) & 7;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if ((t(childAt) & 7) == b2) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public View o() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((((e) childAt.getLayoutParams()).f1457d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.n = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.n = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r4.C;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r5) {
        /*
            r4 = this;
            super.onDraw(r5)
            boolean r0 = r4.D
            if (r0 == 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r4.x
            if (r0 == 0) goto L_0x002e
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            r2 = 0
            if (r0 < r1) goto L_0x001d
            java.lang.Object r0 = r4.C
            if (r0 == 0) goto L_0x001d
            android.view.WindowInsets r0 = (android.view.WindowInsets) r0
            int r0 = r0.getSystemWindowInsetTop()
            goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r1 = r4.x
            int r3 = r4.getWidth()
            r1.setBounds(r2, r2, r3, r0)
            android.graphics.drawable.Drawable r0 = r4.x
            r0.draw(r5)
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onDraw(android.graphics.Canvas):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
        r7 = r6.h.u((int) r0, (int) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r0 != 3) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            a.j.a.c r1 = r6.h
            boolean r1 = r1.O(r7)
            a.j.a.c r2 = r6.i
            boolean r2 = r2.O(r7)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0038
            if (r0 == r2) goto L_0x0031
            r7 = 2
            r4 = 3
            if (r0 == r7) goto L_0x001e
            if (r0 == r4) goto L_0x0031
            goto L_0x0036
        L_0x001e:
            a.j.a.c r7 = r6.h
            boolean r7 = r7.e(r4)
            if (r7 == 0) goto L_0x0036
            androidx.drawerlayout.widget.DrawerLayout$f r7 = r6.j
            r7.p()
            androidx.drawerlayout.widget.DrawerLayout$f r7 = r6.k
            r7.p()
            goto L_0x0036
        L_0x0031:
            r6.i(r2)
            r6.s = r3
        L_0x0036:
            r7 = 0
            goto L_0x0060
        L_0x0038:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.v = r0
            r6.w = r7
            float r4 = r6.f1447f
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x005d
            a.j.a.c r4 = r6.h
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.u(r0, r7)
            if (r7 == 0) goto L_0x005d
            boolean r7 = r6.B(r7)
            if (r7 == 0) goto L_0x005d
            r7 = 1
            goto L_0x005e
        L_0x005d:
            r7 = 0
        L_0x005e:
            r6.s = r3
        L_0x0060:
            if (r1 != 0) goto L_0x0070
            if (r7 != 0) goto L_0x0070
            boolean r7 = r6.y()
            if (r7 != 0) goto L_0x0070
            boolean r7 = r6.s
            if (r7 == 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r2 = 0
        L_0x0070:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 != 4 || !z()) {
            return super.onKeyDown(i2, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (i2 != 4) {
            return super.onKeyUp(i2, keyEvent);
        }
        View p2 = p();
        if (p2 != null && r(p2) == 0) {
            h();
        }
        return p2 != null;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        float f2;
        int i6;
        this.m = true;
        int i7 = i4 - i2;
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (B(childAt)) {
                    int i9 = eVar.leftMargin;
                    childAt.layout(i9, eVar.topMargin, childAt.getMeasuredWidth() + i9, eVar.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (c(childAt, 3)) {
                        float f3 = (float) measuredWidth;
                        i6 = (-measuredWidth) + ((int) (eVar.f1455b * f3));
                        f2 = ((float) (measuredWidth + i6)) / f3;
                    } else {
                        float f4 = (float) measuredWidth;
                        int i10 = i7 - ((int) (eVar.f1455b * f4));
                        f2 = ((float) (i7 - i10)) / f4;
                        i6 = i10;
                    }
                    boolean z3 = f2 != eVar.f1455b;
                    int i11 = eVar.f1454a & 112;
                    if (i11 == 16) {
                        int i12 = i5 - i3;
                        int i13 = (i12 - measuredHeight) / 2;
                        int i14 = eVar.topMargin;
                        if (i13 < i14) {
                            i13 = i14;
                        } else {
                            int i15 = i13 + measuredHeight;
                            int i16 = eVar.bottomMargin;
                            if (i15 > i12 - i16) {
                                i13 = (i12 - i16) - measuredHeight;
                            }
                        }
                        childAt.layout(i6, i13, measuredWidth + i6, measuredHeight + i13);
                    } else if (i11 != 80) {
                        int i17 = eVar.topMargin;
                        childAt.layout(i6, i17, measuredWidth + i6, measuredHeight + i17);
                    } else {
                        int i18 = i5 - i3;
                        childAt.layout(i6, (i18 - eVar.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i6, i18 - eVar.bottomMargin);
                    }
                    if (z3) {
                        S(childAt, f2);
                    }
                    int i19 = eVar.f1455b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i19) {
                        childAt.setVisibility(i19);
                    }
                }
            }
        }
        this.m = false;
        this.n = false;
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"WrongConstant"})
    public void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        if (!(mode == 1073741824 && mode2 == 1073741824)) {
            if (isInEditMode()) {
                if (mode != Integer.MIN_VALUE && mode == 0) {
                    size = 300;
                }
                if (mode2 != Integer.MIN_VALUE && mode2 == 0) {
                    size2 = 300;
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        int i4 = 0;
        boolean z2 = this.C != null && u.q(this);
        int t2 = u.t(this);
        int childCount = getChildCount();
        int i5 = 0;
        boolean z3 = false;
        boolean z4 = false;
        while (i5 < childCount) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (z2) {
                    int b2 = a.h.k.d.b(eVar.f1454a, t2);
                    if (u.q(childAt)) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            WindowInsets windowInsets = (WindowInsets) this.C;
                            if (b2 == 3) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i4, windowInsets.getSystemWindowInsetBottom());
                            } else if (b2 == 5) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(i4, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                            }
                            childAt.dispatchApplyWindowInsets(windowInsets);
                        }
                    } else if (Build.VERSION.SDK_INT >= 21) {
                        WindowInsets windowInsets2 = (WindowInsets) this.C;
                        if (b2 == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), i4, windowInsets2.getSystemWindowInsetBottom());
                        } else if (b2 == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(i4, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        eVar.leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        eVar.topMargin = windowInsets2.getSystemWindowInsetTop();
                        eVar.rightMargin = windowInsets2.getSystemWindowInsetRight();
                        eVar.bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (B(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - eVar.leftMargin) - eVar.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - eVar.topMargin) - eVar.bottomMargin, 1073741824));
                } else if (E(childAt)) {
                    if (O) {
                        float o2 = u.o(childAt);
                        float f2 = this.f1444c;
                        if (o2 != f2) {
                            u.f0(childAt, f2);
                        }
                    }
                    int t3 = t(childAt) & 7;
                    boolean z5 = t3 == 3;
                    if ((!z5 || !z3) && (z5 || !z4)) {
                        if (z5) {
                            z3 = true;
                        } else {
                            z4 = true;
                        }
                        childAt.measure(ViewGroup.getChildMeasureSpec(i2, this.f1445d + eVar.leftMargin + eVar.rightMargin, eVar.width), ViewGroup.getChildMeasureSpec(i3, eVar.topMargin + eVar.bottomMargin, eVar.height));
                        i5++;
                        i4 = 0;
                    } else {
                        throw new IllegalStateException("Child drawer has absolute gravity " + w(t3) + " but this " + "DrawerLayout" + " already has a " + "drawer view along that edge");
                    }
                } else {
                    throw new IllegalStateException("Child " + childAt + " at index " + i5 + " does not have a valid layout_gravity - must be Gravity.LEFT, " + "Gravity.RIGHT or Gravity.NO_GRAVITY");
                }
            }
            int i6 = i2;
            int i7 = i3;
            i5++;
            i4 = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        View n2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        int i2 = savedState.f1448d;
        if (!(i2 == 0 || (n2 = n(i2)) == null)) {
            M(n2);
        }
        int i3 = savedState.f1449e;
        if (i3 != 3) {
            setDrawerLockMode(i3, 3);
        }
        int i4 = savedState.f1450f;
        if (i4 != 3) {
            setDrawerLockMode(i4, 5);
        }
        int i5 = savedState.g;
        if (i5 != 3) {
            setDrawerLockMode(i5, 8388611);
        }
        int i6 = savedState.h;
        if (i6 != 3) {
            setDrawerLockMode(i6, 8388613);
        }
    }

    public void onRtlPropertiesChanged(int i2) {
        R();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            e eVar = (e) getChildAt(i2).getLayoutParams();
            boolean z2 = true;
            boolean z3 = eVar.f1457d == 1;
            if (eVar.f1457d != 2) {
                z2 = false;
            }
            if (z3 || z2) {
                savedState.f1448d = eVar.f1454a;
            } else {
                i2++;
            }
        }
        savedState.f1449e = this.o;
        savedState.f1450f = this.p;
        savedState.g = this.q;
        savedState.h = this.r;
        return savedState;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005b, code lost:
        if (r(r7) != 2) goto L_0x005e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            a.j.a.c r0 = r6.h
            r0.F(r7)
            a.j.a.c r0 = r6.i
            r0.F(r7)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0062
            if (r0 == r2) goto L_0x0020
            r7 = 3
            if (r0 == r7) goto L_0x001a
            goto L_0x0070
        L_0x001a:
            r6.i(r2)
            r6.s = r1
            goto L_0x0070
        L_0x0020:
            float r0 = r7.getX()
            float r7 = r7.getY()
            a.j.a.c r3 = r6.h
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.u(r4, r5)
            if (r3 == 0) goto L_0x005d
            boolean r3 = r6.B(r3)
            if (r3 == 0) goto L_0x005d
            float r3 = r6.v
            float r0 = r0 - r3
            float r3 = r6.w
            float r7 = r7 - r3
            a.j.a.c r3 = r6.h
            int r3 = r3.z()
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r0 = r0 + r7
            int r3 = r3 * r3
            float r7 = (float) r3
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto L_0x005d
            android.view.View r7 = r6.o()
            if (r7 == 0) goto L_0x005d
            int r7 = r6.r(r7)
            r0 = 2
            if (r7 != r0) goto L_0x005e
        L_0x005d:
            r1 = 1
        L_0x005e:
            r6.i(r1)
            goto L_0x0070
        L_0x0062:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.v = r0
            r6.w = r7
            r6.s = r1
        L_0x0070:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public View p() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (E(childAt) && G(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public int q(int i2) {
        int t2 = u.t(this);
        if (i2 == 3) {
            int i3 = this.o;
            if (i3 != 3) {
                return i3;
            }
            int i4 = t2 == 0 ? this.q : this.r;
            if (i4 != 3) {
                return i4;
            }
            return 0;
        } else if (i2 == 5) {
            int i5 = this.p;
            if (i5 != 3) {
                return i5;
            }
            int i6 = t2 == 0 ? this.r : this.q;
            if (i6 != 3) {
                return i6;
            }
            return 0;
        } else if (i2 == 8388611) {
            int i7 = this.q;
            if (i7 != 3) {
                return i7;
            }
            int i8 = t2 == 0 ? this.o : this.p;
            if (i8 != 3) {
                return i8;
            }
            return 0;
        } else if (i2 != 8388613) {
            return 0;
        } else {
            int i9 = this.r;
            if (i9 != 3) {
                return i9;
            }
            int i10 = t2 == 0 ? this.p : this.o;
            if (i10 != 3) {
                return i10;
            }
            return 0;
        }
    }

    public int r(View view) {
        if (E(view)) {
            return q(((e) view.getLayoutParams()).f1454a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (z2) {
            i(true);
        }
    }

    public void requestLayout() {
        if (!this.m) {
            super.requestLayout();
        }
    }

    public CharSequence s(int i2) {
        int b2 = a.h.k.d.b(i2, u.t(this));
        if (b2 == 3) {
            return this.A;
        }
        if (b2 == 5) {
            return this.B;
        }
        return null;
    }

    public void setChildInsets(Object obj, boolean z2) {
        this.C = obj;
        this.D = z2;
        setWillNotDraw(!z2 && getBackground() == null);
        requestLayout();
    }

    public void setDrawerElevation(float f2) {
        this.f1444c = f2;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (E(childAt)) {
                u.f0(childAt, this.f1444c);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(d dVar) {
        d dVar2 = this.t;
        if (dVar2 != null) {
            O(dVar2);
        }
        if (dVar != null) {
            a(dVar);
        }
        this.t = dVar;
    }

    public void setDrawerLockMode(int i2) {
        setDrawerLockMode(i2, 3);
        setDrawerLockMode(i2, 5);
    }

    public void setDrawerShadow(Drawable drawable, int i2) {
        if (!O) {
            if ((i2 & 8388611) == 8388611) {
                this.E = drawable;
            } else if ((i2 & 8388613) == 8388613) {
                this.F = drawable;
            } else if ((i2 & 3) == 3) {
                this.G = drawable;
            } else if ((i2 & 5) == 5) {
                this.H = drawable;
            } else {
                return;
            }
            R();
            invalidate();
        }
    }

    public void setDrawerTitle(int i2, CharSequence charSequence) {
        int b2 = a.h.k.d.b(i2, u.t(this));
        if (b2 == 3) {
            this.A = charSequence;
        } else if (b2 == 5) {
            this.B = charSequence;
        }
    }

    public void setScrimColor(int i2) {
        this.f1446e = i2;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.x = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i2) {
        this.x = new ColorDrawable(i2);
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public int t(View view) {
        return a.h.k.d.b(((e) view.getLayoutParams()).f1454a, u.t(this));
    }

    /* access modifiers changed from: package-private */
    public float u(View view) {
        return ((e) view.getLayoutParams()).f1455b;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f1443b = new c();
        this.f1446e = -1728053248;
        this.g = new Paint();
        this.n = true;
        this.o = 3;
        this.p = 3;
        this.q = 3;
        this.r = 3;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = null;
        setDescendantFocusability(262144);
        float f2 = getResources().getDisplayMetrics().density;
        this.f1445d = (int) ((64.0f * f2) + 0.5f);
        float f3 = 400.0f * f2;
        this.j = new f(3);
        this.k = new f(5);
        a.j.a.c o2 = a.j.a.c.o(this, 1.0f, this.j);
        this.h = o2;
        o2.L(1);
        this.h.M(f3);
        this.j.q(this.h);
        a.j.a.c o3 = a.j.a.c.o(this, 1.0f, this.k);
        this.i = o3;
        o3.L(2);
        this.i.M(f3);
        this.k.q(this.i);
        setFocusableInTouchMode(true);
        u.i0(this, 1);
        u.Z(this, new b());
        setMotionEventSplittingEnabled(false);
        if (u.q(this)) {
            if (Build.VERSION.SDK_INT >= 21) {
                setOnApplyWindowInsetsListener(new a());
                setSystemUiVisibility(1280);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(L);
                try {
                    this.x = obtainStyledAttributes.getDrawable(0);
                } finally {
                    obtainStyledAttributes.recycle();
                }
            } else {
                this.x = null;
            }
        }
        this.f1444c = f2 * 10.0f;
        this.I = new ArrayList<>();
    }

    public void setDrawerLockMode(int i2, int i3) {
        View n2;
        int b2 = a.h.k.d.b(i3, u.t(this));
        if (i3 == 3) {
            this.o = i2;
        } else if (i3 == 5) {
            this.p = i2;
        } else if (i3 == 8388611) {
            this.q = i2;
        } else if (i3 == 8388613) {
            this.r = i2;
        }
        if (i2 != 0) {
            (b2 == 3 ? this.h : this.i).b();
        }
        if (i2 == 1) {
            View n3 = n(b2);
            if (n3 != null) {
                f(n3);
            }
        } else if (i2 == 2 && (n2 = n(b2)) != null) {
            M(n2);
        }
    }

    public void setStatusBarBackground(int i2) {
        this.x = i2 != 0 ? androidx.core.content.a.f(getContext(), i2) : null;
        invalidate();
    }

    public static class e extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f1454a = 0;

        /* renamed from: b  reason: collision with root package name */
        float f1455b;

        /* renamed from: c  reason: collision with root package name */
        boolean f1456c;

        /* renamed from: d  reason: collision with root package name */
        int f1457d;

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.M);
            this.f1454a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public e(int i, int i2) {
            super(i, i2);
        }

        public e(e eVar) {
            super(eVar);
            this.f1454a = eVar.f1454a;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        int f1448d = 0;

        /* renamed from: e  reason: collision with root package name */
        int f1449e;

        /* renamed from: f  reason: collision with root package name */
        int f1450f;
        int g;
        int h;

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
            this.f1448d = parcel.readInt();
            this.f1449e = parcel.readInt();
            this.f1450f = parcel.readInt();
            this.g = parcel.readInt();
            this.h = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1448d);
            parcel.writeInt(this.f1449e);
            parcel.writeInt(this.f1450f);
            parcel.writeInt(this.g);
            parcel.writeInt(this.h);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public void setDrawerShadow(int i2, int i3) {
        setDrawerShadow(androidx.core.content.a.f(getContext(), i2), i3);
    }

    public void setDrawerLockMode(int i2, View view) {
        if (E(view)) {
            setDrawerLockMode(i2, ((e) view.getLayoutParams()).f1454a);
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a " + "drawer with appropriate layout_gravity");
    }
}
