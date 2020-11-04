package androidx.coordinatorlayout.widget;

import a.h.k.b0;
import a.h.k.m;
import a.h.k.p;
import a.h.k.q;
import a.h.k.t;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoordinatorLayout extends ViewGroup implements m {
    static final String u;
    static final Class<?>[] v = {Context.class, AttributeSet.class};
    static final ThreadLocal<Map<String, Constructor<c>>> w = new ThreadLocal<>();
    static final Comparator<View> x;
    private static final a.h.j.e<Rect> y = new a.h.j.g(12);

    /* renamed from: b  reason: collision with root package name */
    private final List<View> f1235b;

    /* renamed from: c  reason: collision with root package name */
    private final a<View> f1236c;

    /* renamed from: d  reason: collision with root package name */
    private final List<View> f1237d;

    /* renamed from: e  reason: collision with root package name */
    private final List<View> f1238e;

    /* renamed from: f  reason: collision with root package name */
    private final int[] f1239f;
    private Paint g;
    private boolean h;
    private boolean i;
    private int[] j;
    private View k;
    private View l;
    private g m;
    private boolean n;
    private b0 o;
    private boolean p;
    private Drawable q;
    ViewGroup.OnHierarchyChangeListener r;
    private q s;
    private final p t;

    class a implements q {
        a() {
        }

        public b0 a(View view, b0 b0Var) {
            CoordinatorLayout.this.a0(b0Var);
            return b0Var;
        }
    }

    public interface b {
        c getBehavior();
    }

    public static abstract class c<V extends View> {
        public c() {
        }

        @Deprecated
        public void A(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public void B(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                A(coordinatorLayout, v, view);
            }
        }

        public boolean C(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v) {
            return d(coordinatorLayout, v) > 0.0f;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        public int c(CoordinatorLayout coordinatorLayout, V v) {
            return -16777216;
        }

        public float d(CoordinatorLayout coordinatorLayout, V v) {
            return 0.0f;
        }

        public boolean e(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public b0 f(CoordinatorLayout coordinatorLayout, V v, b0 b0Var) {
            return b0Var;
        }

        public void g(f fVar) {
        }

        public boolean h(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public void i(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public void j() {
        }

        public boolean k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean l(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        public boolean m(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        public boolean n(CoordinatorLayout coordinatorLayout, V v, View view, float f2, float f3, boolean z) {
            return false;
        }

        public boolean o(CoordinatorLayout coordinatorLayout, V v, View view, float f2, float f3) {
            return false;
        }

        @Deprecated
        public void p(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        }

        public void q(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                p(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        @Deprecated
        public void r(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        }

        public void s(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                r(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        @Deprecated
        public void t(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        }

        public void u(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                t(coordinatorLayout, v, view, view2, i);
            }
        }

        public boolean v(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        public void w(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        public Parcelable x(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean y(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
            return false;
        }

        public boolean z(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return y(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        public c(Context context, AttributeSet attributeSet) {
        }
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    public @interface d {
        Class<? extends c> value();
    }

    private class e implements ViewGroup.OnHierarchyChangeListener {
        e() {
        }

        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.L(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    class g implements ViewTreeObserver.OnPreDrawListener {
        g() {
        }

        public boolean onPreDraw() {
            CoordinatorLayout.this.L(0);
            return true;
        }
    }

    static class h implements Comparator<View> {
        h() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            float B = t.B(view);
            float B2 = t.B(view2);
            if (B > B2) {
                return -1;
            }
            return B < B2 ? 1 : 0;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.coordinatorlayout.widget.CoordinatorLayout> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.class
            java.lang.Package r0 = r0.getPackage()
            r1 = 0
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = r0.getName()
            goto L_0x000f
        L_0x000e:
            r0 = r1
        L_0x000f:
            u = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r0 < r2) goto L_0x001f
            androidx.coordinatorlayout.widget.CoordinatorLayout$h r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$h
            r0.<init>()
            x = r0
            goto L_0x0021
        L_0x001f:
            x = r1
        L_0x0021:
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            r1 = 1
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r0[r1] = r2
            v = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            w = r0
            a.h.j.g r0 = new a.h.j.g
            r1 = 12
            r0.<init>(r1)
            y = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.<clinit>():void");
    }

    public CoordinatorLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    private int A(int i2) {
        int[] iArr = this.j;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i2);
            return 0;
        } else if (i2 >= 0 && i2 < iArr.length) {
            return iArr[i2];
        } else {
            Log.e("CoordinatorLayout", "Keyline index " + i2 + " out of range for " + this);
            return 0;
        }
    }

    private void D(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        Comparator<View> comparator = x;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    private boolean E(View view) {
        return this.f1236c.j(view);
    }

    private void G(View view, int i2) {
        f fVar = (f) view.getLayoutParams();
        Rect e2 = e();
        e2.set(getPaddingLeft() + fVar.leftMargin, getPaddingTop() + fVar.topMargin, (getWidth() - getPaddingRight()) - fVar.rightMargin, (getHeight() - getPaddingBottom()) - fVar.bottomMargin);
        if (this.o != null && t.q(this) && !t.q(view)) {
            e2.left += this.o.c();
            e2.top += this.o.e();
            e2.right -= this.o.d();
            e2.bottom -= this.o.b();
        }
        Rect e3 = e();
        a.h.k.d.a(W(fVar.f1245c), view.getMeasuredWidth(), view.getMeasuredHeight(), e2, e3, i2);
        view.layout(e3.left, e3.top, e3.right, e3.bottom);
        S(e2);
        S(e3);
    }

    private void H(View view, View view2, int i2) {
        Rect e2 = e();
        Rect e3 = e();
        try {
            x(view2, e2);
            y(view, i2, e2, e3);
            view.layout(e3.left, e3.top, e3.right, e3.bottom);
        } finally {
            S(e2);
            S(e3);
        }
    }

    private void I(View view, int i2, int i3) {
        f fVar = (f) view.getLayoutParams();
        int b2 = a.h.k.d.b(X(fVar.f1245c), i3);
        int i4 = b2 & 7;
        int i5 = b2 & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i3 == 1) {
            i2 = width - i2;
        }
        int A = A(i2) - measuredWidth;
        int i6 = 0;
        if (i4 == 1) {
            A += measuredWidth / 2;
        } else if (i4 == 5) {
            A += measuredWidth;
        }
        if (i5 == 16) {
            i6 = 0 + (measuredHeight / 2);
        } else if (i5 == 80) {
            i6 = measuredHeight + 0;
        }
        int max = Math.max(getPaddingLeft() + fVar.leftMargin, Math.min(A, ((width - getPaddingRight()) - measuredWidth) - fVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + fVar.topMargin, Math.min(i6, ((height - getPaddingBottom()) - measuredHeight) - fVar.bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    private void J(View view, Rect rect, int i2) {
        boolean z;
        boolean z2;
        int width;
        int i3;
        int i4;
        int i5;
        int height;
        int i6;
        int i7;
        int i8;
        if (t.I(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            f fVar = (f) view.getLayoutParams();
            c f2 = fVar.f();
            Rect e2 = e();
            Rect e3 = e();
            e3.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (f2 == null || !f2.b(this, view, e2)) {
                e2.set(e3);
            } else if (!e3.contains(e2)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + e2.toShortString() + " | Bounds:" + e3.toShortString());
            }
            S(e3);
            if (e2.isEmpty()) {
                S(e2);
                return;
            }
            int b2 = a.h.k.d.b(fVar.h, i2);
            boolean z3 = true;
            if ((b2 & 48) != 48 || (i7 = (e2.top - fVar.topMargin) - fVar.j) >= (i8 = rect.top)) {
                z = false;
            } else {
                Z(view, i8 - i7);
                z = true;
            }
            if ((b2 & 80) == 80 && (height = ((getHeight() - e2.bottom) - fVar.bottomMargin) + fVar.j) < (i6 = rect.bottom)) {
                Z(view, height - i6);
                z = true;
            }
            if (!z) {
                Z(view, 0);
            }
            if ((b2 & 3) != 3 || (i4 = (e2.left - fVar.leftMargin) - fVar.i) >= (i5 = rect.left)) {
                z2 = false;
            } else {
                Y(view, i5 - i4);
                z2 = true;
            }
            if ((b2 & 5) != 5 || (width = ((getWidth() - e2.right) - fVar.rightMargin) + fVar.i) >= (i3 = rect.right)) {
                z3 = z2;
            } else {
                Y(view, width - i3);
            }
            if (!z3) {
                Y(view, 0);
            }
            S(e2);
        }
    }

    static c O(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0 && !TextUtils.isEmpty(u)) {
            str = u + '.' + str;
        }
        try {
            Map map = w.get();
            if (map == null) {
                map = new HashMap();
                w.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = context.getClassLoader().loadClass(str).getConstructor(v);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (c) constructor.newInstance(new Object[]{context, attributeSet});
        } catch (Exception e2) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e2);
        }
    }

    private boolean P(MotionEvent motionEvent, int i2) {
        MotionEvent motionEvent2 = motionEvent;
        int i3 = i2;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f1237d;
        D(list);
        int size = list.size();
        MotionEvent motionEvent3 = null;
        boolean z = false;
        boolean z2 = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = list.get(i4);
            f fVar = (f) view.getLayoutParams();
            c f2 = fVar.f();
            if ((!z && !z2) || actionMasked == 0) {
                if (!z && f2 != null) {
                    if (i3 == 0) {
                        z = f2.k(this, view, motionEvent2);
                    } else if (i3 == 1) {
                        z = f2.C(this, view, motionEvent2);
                    }
                    if (z) {
                        this.k = view;
                    }
                }
                boolean c2 = fVar.c();
                boolean i5 = fVar.i(this, view);
                z2 = i5 && !c2;
                if (i5 && !z2) {
                    break;
                }
            } else if (f2 != null) {
                if (motionEvent3 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i3 == 0) {
                    f2.k(this, view, motionEvent3);
                } else if (i3 == 1) {
                    f2.C(this, view, motionEvent3);
                }
            }
        }
        list.clear();
        return z;
    }

    private void Q() {
        this.f1235b.clear();
        this.f1236c.c();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            f C = C(childAt);
            C.d(this, childAt);
            this.f1236c.b(childAt);
            for (int i3 = 0; i3 < childCount; i3++) {
                if (i3 != i2) {
                    View childAt2 = getChildAt(i3);
                    if (C.b(this, childAt, childAt2)) {
                        if (!this.f1236c.d(childAt2)) {
                            this.f1236c.b(childAt2);
                        }
                        this.f1236c.a(childAt2, childAt);
                    }
                }
            }
        }
        this.f1235b.addAll(this.f1236c.i());
        Collections.reverse(this.f1235b);
    }

    private static void S(Rect rect) {
        rect.setEmpty();
        y.a(rect);
    }

    private void U(boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            c f2 = ((f) childAt.getLayoutParams()).f();
            if (f2 != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    f2.k(this, childAt, obtain);
                } else {
                    f2.C(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            ((f) getChildAt(i3).getLayoutParams()).m();
        }
        this.k = null;
        this.h = false;
    }

    private static int V(int i2) {
        if (i2 == 0) {
            return 17;
        }
        return i2;
    }

    private static int W(int i2) {
        if ((i2 & 7) == 0) {
            i2 |= 8388611;
        }
        return (i2 & 112) == 0 ? i2 | 48 : i2;
    }

    private static int X(int i2) {
        if (i2 == 0) {
            return 8388661;
        }
        return i2;
    }

    private void Y(View view, int i2) {
        f fVar = (f) view.getLayoutParams();
        int i3 = fVar.i;
        if (i3 != i2) {
            t.N(view, i2 - i3);
            fVar.i = i2;
        }
    }

    private void Z(View view, int i2) {
        f fVar = (f) view.getLayoutParams();
        int i3 = fVar.j;
        if (i3 != i2) {
            t.O(view, i2 - i3);
            fVar.j = i2;
        }
    }

    private void b0() {
        if (Build.VERSION.SDK_INT >= 21) {
            if (t.q(this)) {
                if (this.s == null) {
                    this.s = new a();
                }
                t.l0(this, this.s);
                setSystemUiVisibility(1280);
                return;
            }
            t.l0(this, (q) null);
        }
    }

    private static Rect e() {
        Rect b2 = y.b();
        return b2 == null ? new Rect() : b2;
    }

    private static int g(int i2, int i3, int i4) {
        return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
    }

    private void n(f fVar, Rect rect, int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + fVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i2) - fVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + fVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i3) - fVar.bottomMargin));
        rect.set(max, max2, i2 + max, i3 + max2);
    }

    private b0 o(b0 b0Var) {
        c f2;
        if (b0Var.g()) {
            return b0Var;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (t.q(childAt) && (f2 = ((f) childAt.getLayoutParams()).f()) != null) {
                f2.f(this, childAt, b0Var);
                if (b0Var.g()) {
                    break;
                }
            }
        }
        return b0Var;
    }

    private void z(View view, int i2, Rect rect, Rect rect2, f fVar, int i3, int i4) {
        int i5;
        int i6;
        int b2 = a.h.k.d.b(V(fVar.f1245c), i2);
        int b3 = a.h.k.d.b(W(fVar.f1246d), i2);
        int i7 = b2 & 7;
        int i8 = b2 & 112;
        int i9 = b3 & 7;
        int i10 = b3 & 112;
        if (i9 == 1) {
            i5 = rect.left + (rect.width() / 2);
        } else if (i9 != 5) {
            i5 = rect.left;
        } else {
            i5 = rect.right;
        }
        if (i10 == 16) {
            i6 = rect.top + (rect.height() / 2);
        } else if (i10 != 80) {
            i6 = rect.top;
        } else {
            i6 = rect.bottom;
        }
        if (i7 == 1) {
            i5 -= i3 / 2;
        } else if (i7 != 5) {
            i5 -= i3;
        }
        if (i8 == 16) {
            i6 -= i4 / 2;
        } else if (i8 != 80) {
            i6 -= i4;
        }
        rect2.set(i5, i6, i3 + i5, i4 + i6);
    }

    /* access modifiers changed from: package-private */
    public void B(View view, Rect rect) {
        rect.set(((f) view.getLayoutParams()).h());
    }

    /* access modifiers changed from: package-private */
    public f C(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f1244b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.o(behavior);
                fVar.f1244b = true;
            } else {
                d dVar = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (d) cls.getAnnotation(d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        fVar.o((c) dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e2) {
                        Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget" + " a default constructor?", e2);
                    }
                }
                fVar.f1244b = true;
            }
        }
        return fVar;
    }

    public boolean F(View view, int i2, int i3) {
        Rect e2 = e();
        x(view, e2);
        try {
            return e2.contains(i2, i3);
        } finally {
            S(e2);
        }
    }

    /* access modifiers changed from: package-private */
    public void K(View view, int i2) {
        c f2;
        View view2 = view;
        f fVar = (f) view.getLayoutParams();
        if (fVar.k != null) {
            Rect e2 = e();
            Rect e3 = e();
            Rect e4 = e();
            x(fVar.k, e2);
            boolean z = false;
            u(view2, false, e3);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i3 = measuredHeight;
            z(view, i2, e2, e4, fVar, measuredWidth, measuredHeight);
            if (!(e4.left == e3.left && e4.top == e3.top)) {
                z = true;
            }
            n(fVar, e4, measuredWidth, i3);
            int i4 = e4.left - e3.left;
            int i5 = e4.top - e3.top;
            if (i4 != 0) {
                t.N(view2, i4);
            }
            if (i5 != 0) {
                t.O(view2, i5);
            }
            if (z && (f2 = fVar.f()) != null) {
                f2.h(this, view2, fVar.k);
            }
            S(e2);
            S(e3);
            S(e4);
        }
    }

    /* access modifiers changed from: package-private */
    public final void L(int i2) {
        boolean z;
        int i3 = i2;
        int t2 = t.t(this);
        int size = this.f1235b.size();
        Rect e2 = e();
        Rect e3 = e();
        Rect e4 = e();
        for (int i4 = 0; i4 < size; i4++) {
            View view = this.f1235b.get(i4);
            f fVar = (f) view.getLayoutParams();
            if (i3 != 0 || view.getVisibility() != 8) {
                for (int i5 = 0; i5 < i4; i5++) {
                    if (fVar.l == this.f1235b.get(i5)) {
                        K(view, t2);
                    }
                }
                u(view, true, e3);
                if (fVar.g != 0 && !e3.isEmpty()) {
                    int b2 = a.h.k.d.b(fVar.g, t2);
                    int i6 = b2 & 112;
                    if (i6 == 48) {
                        e2.top = Math.max(e2.top, e3.bottom);
                    } else if (i6 == 80) {
                        e2.bottom = Math.max(e2.bottom, getHeight() - e3.top);
                    }
                    int i7 = b2 & 7;
                    if (i7 == 3) {
                        e2.left = Math.max(e2.left, e3.right);
                    } else if (i7 == 5) {
                        e2.right = Math.max(e2.right, getWidth() - e3.left);
                    }
                }
                if (fVar.h != 0 && view.getVisibility() == 0) {
                    J(view, e2, t2);
                }
                if (i3 != 2) {
                    B(view, e4);
                    if (!e4.equals(e3)) {
                        R(view, e3);
                    }
                }
                for (int i8 = i4 + 1; i8 < size; i8++) {
                    View view2 = this.f1235b.get(i8);
                    f fVar2 = (f) view2.getLayoutParams();
                    c f2 = fVar2.f();
                    if (f2 != null && f2.e(this, view2, view)) {
                        if (i3 != 0 || !fVar2.g()) {
                            if (i3 != 2) {
                                z = f2.h(this, view2, view);
                            } else {
                                f2.i(this, view2, view);
                                z = true;
                            }
                            if (i3 == 1) {
                                fVar2.p(z);
                            }
                        } else {
                            fVar2.k();
                        }
                    }
                }
            }
        }
        S(e2);
        S(e3);
        S(e4);
    }

    public void M(View view, int i2) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.a()) {
            View view2 = fVar.k;
            if (view2 != null) {
                H(view, view2, i2);
                return;
            }
            int i3 = fVar.f1247e;
            if (i3 >= 0) {
                I(view, i3, i2);
            } else {
                G(view, i2);
            }
        } else {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
    }

    public void N(View view, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    /* access modifiers changed from: package-private */
    public void R(View view, Rect rect) {
        ((f) view.getLayoutParams()).q(rect);
    }

    /* access modifiers changed from: package-private */
    public void T() {
        if (this.i && this.m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.m);
        }
        this.n = false;
    }

    /* access modifiers changed from: package-private */
    public final b0 a0(b0 b0Var) {
        if (!a.h.j.c.a(this.o, b0Var)) {
            this.o = b0Var;
            boolean z = true;
            boolean z2 = b0Var != null && b0Var.e() > 0;
            this.p = z2;
            if (z2 || getBackground() != null) {
                z = false;
            }
            setWillNotDraw(z);
            o(b0Var);
            requestLayout();
        }
        return b0Var;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j2) {
        f fVar = (f) view.getLayoutParams();
        c cVar = fVar.f1243a;
        if (cVar != null) {
            float d2 = cVar.d(this, view);
            if (d2 > 0.0f) {
                if (this.g == null) {
                    this.g = new Paint();
                }
                this.g.setColor(fVar.f1243a.c(this, view));
                this.g.setAlpha(g(Math.round(d2 * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.g);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j2);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.q;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        if (this.i) {
            if (this.m == null) {
                this.m = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.m);
        }
        this.n = true;
    }

    /* access modifiers changed from: package-private */
    public final List<View> getDependencySortedChildren() {
        Q();
        return Collections.unmodifiableList(this.f1235b);
    }

    public final b0 getLastWindowInsets() {
        return this.o;
    }

    public int getNestedScrollAxes() {
        return this.t.a();
    }

    public Drawable getStatusBarBackground() {
        return this.q;
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public void i(View view, int i2, int i3, int i4, int i5, int i6) {
        c f2;
        int childCount = getChildCount();
        boolean z = false;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() == 8) {
                int i8 = i6;
            } else {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i6) && (f2 = fVar.f()) != null) {
                    f2.s(this, childAt, view, i2, i3, i4, i5, i6);
                    z = true;
                }
            }
        }
        if (z) {
            L(1);
        }
    }

    public boolean j(View view, View view2, int i2, int i3) {
        int i4 = i3;
        int childCount = getChildCount();
        boolean z = false;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c f2 = fVar.f();
                if (f2 != null) {
                    boolean z2 = f2.z(this, childAt, view, view2, i2, i3);
                    z |= z2;
                    fVar.r(i4, z2);
                } else {
                    fVar.r(i4, false);
                }
            }
        }
        return z;
    }

    public void k(View view, View view2, int i2, int i3) {
        c f2;
        this.t.c(view, view2, i2, i3);
        this.l = view2;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i3) && (f2 = fVar.f()) != null) {
                f2.u(this, childAt, view, view2, i2, i3);
            }
        }
    }

    public void l(View view, int i2) {
        this.t.e(view, i2);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i2)) {
                c f2 = fVar.f();
                if (f2 != null) {
                    f2.B(this, childAt, view, i2);
                }
                fVar.l(i2);
                fVar.k();
            }
        }
        this.l = null;
    }

    public void m(View view, int i2, int i3, int[] iArr, int i4) {
        c f2;
        int i5;
        int i6;
        int childCount = getChildCount();
        boolean z = false;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() == 8) {
                int i10 = i4;
            } else {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i4) && (f2 = fVar.f()) != null) {
                    int[] iArr2 = this.f1239f;
                    iArr2[1] = 0;
                    iArr2[0] = 0;
                    f2.q(this, childAt, view, i2, i3, iArr2, i4);
                    int[] iArr3 = this.f1239f;
                    if (i2 > 0) {
                        i5 = Math.max(i7, iArr3[0]);
                    } else {
                        i5 = Math.min(i7, iArr3[0]);
                    }
                    i7 = i5;
                    int[] iArr4 = this.f1239f;
                    if (i3 > 0) {
                        i6 = Math.max(i8, iArr4[1]);
                    } else {
                        i6 = Math.min(i8, iArr4[1]);
                    }
                    i8 = i6;
                    z = true;
                }
            }
        }
        iArr[0] = i7;
        iArr[1] = i8;
        if (z) {
            L(1);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        U(false);
        if (this.n) {
            if (this.m == null) {
                this.m = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.m);
        }
        if (this.o == null && t.q(this)) {
            t.X(this);
        }
        this.i = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        U(false);
        if (this.n && this.m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.m);
        }
        View view = this.l;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.i = false;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.p && this.q != null) {
            b0 b0Var = this.o;
            int e2 = b0Var != null ? b0Var.e() : 0;
            if (e2 > 0) {
                this.q.setBounds(0, 0, getWidth(), e2);
                this.q.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            U(true);
        }
        boolean P = P(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            U(true);
        }
        return P;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        c f2;
        int t2 = t.t(this);
        int size = this.f1235b.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = this.f1235b.get(i6);
            if (view.getVisibility() != 8 && ((f2 = ((f) view.getLayoutParams()).f()) == null || !f2.l(this, view, t2))) {
                M(view, t2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011a, code lost:
        if (r0.m(r30, r20, r11, r21, r23, 0) == false) goto L_0x012a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r7 = r30
            r30.Q()
            r30.q()
            int r8 = r30.getPaddingLeft()
            int r0 = r30.getPaddingTop()
            int r9 = r30.getPaddingRight()
            int r1 = r30.getPaddingBottom()
            int r10 = a.h.k.t.t(r30)
            r2 = 1
            if (r10 != r2) goto L_0x0021
            r12 = 1
            goto L_0x0022
        L_0x0021:
            r12 = 0
        L_0x0022:
            int r13 = android.view.View.MeasureSpec.getMode(r31)
            int r14 = android.view.View.MeasureSpec.getSize(r31)
            int r15 = android.view.View.MeasureSpec.getMode(r32)
            int r16 = android.view.View.MeasureSpec.getSize(r32)
            int r17 = r8 + r9
            int r18 = r0 + r1
            int r0 = r30.getSuggestedMinimumWidth()
            int r1 = r30.getSuggestedMinimumHeight()
            a.h.k.b0 r3 = r7.o
            if (r3 == 0) goto L_0x004b
            boolean r3 = a.h.k.t.q(r30)
            if (r3 == 0) goto L_0x004b
            r19 = 1
            goto L_0x004d
        L_0x004b:
            r19 = 0
        L_0x004d:
            java.util.List<android.view.View> r2 = r7.f1235b
            int r6 = r2.size()
            r5 = r0
            r4 = r1
            r2 = 0
            r3 = 0
        L_0x0057:
            if (r3 >= r6) goto L_0x016f
            java.util.List<android.view.View> r0 = r7.f1235b
            java.lang.Object r0 = r0.get(r3)
            r20 = r0
            android.view.View r20 = (android.view.View) r20
            int r0 = r20.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x0073
            r22 = r3
            r29 = r6
            r28 = r8
            goto L_0x0167
        L_0x0073:
            android.view.ViewGroup$LayoutParams r0 = r20.getLayoutParams()
            r1 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r1
            int r0 = r1.f1247e
            if (r0 < 0) goto L_0x00ba
            if (r13 == 0) goto L_0x00ba
            int r0 = r7.A(r0)
            int r11 = r1.f1245c
            int r11 = X(r11)
            int r11 = a.h.k.d.b(r11, r10)
            r11 = r11 & 7
            r22 = r2
            r2 = 3
            if (r11 != r2) goto L_0x0097
            if (r12 == 0) goto L_0x009c
        L_0x0097:
            r2 = 5
            if (r11 != r2) goto L_0x00a8
            if (r12 == 0) goto L_0x00a8
        L_0x009c:
            int r2 = r14 - r9
            int r2 = r2 - r0
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            r21 = r2
            r11 = 0
            goto L_0x00bf
        L_0x00a8:
            if (r11 != r2) goto L_0x00ac
            if (r12 == 0) goto L_0x00b1
        L_0x00ac:
            r2 = 3
            if (r11 != r2) goto L_0x00bc
            if (r12 == 0) goto L_0x00bc
        L_0x00b1:
            int r0 = r0 - r8
            r11 = 0
            int r0 = java.lang.Math.max(r11, r0)
            r21 = r0
            goto L_0x00bf
        L_0x00ba:
            r22 = r2
        L_0x00bc:
            r11 = 0
            r21 = 0
        L_0x00bf:
            if (r19 == 0) goto L_0x00f1
            boolean r0 = a.h.k.t.q(r20)
            if (r0 != 0) goto L_0x00f1
            a.h.k.b0 r0 = r7.o
            int r0 = r0.c()
            a.h.k.b0 r2 = r7.o
            int r2 = r2.d()
            int r0 = r0 + r2
            a.h.k.b0 r2 = r7.o
            int r2 = r2.e()
            a.h.k.b0 r11 = r7.o
            int r11 = r11.b()
            int r2 = r2 + r11
            int r0 = r14 - r0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13)
            int r2 = r16 - r2
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15)
            r11 = r0
            r23 = r2
            goto L_0x00f5
        L_0x00f1:
            r11 = r31
            r23 = r32
        L_0x00f5:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r1.f()
            if (r0 == 0) goto L_0x011d
            r24 = 0
            r2 = r1
            r1 = r30
            r26 = r2
            r25 = r22
            r2 = r20
            r22 = r3
            r3 = r11
            r27 = r4
            r4 = r21
            r28 = r8
            r8 = r5
            r5 = r23
            r29 = r6
            r6 = r24
            boolean r0 = r0.m(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x0137
            goto L_0x012a
        L_0x011d:
            r26 = r1
            r27 = r4
            r29 = r6
            r28 = r8
            r25 = r22
            r22 = r3
            r8 = r5
        L_0x012a:
            r5 = 0
            r0 = r30
            r1 = r20
            r2 = r11
            r3 = r21
            r4 = r23
            r0.N(r1, r2, r3, r4, r5)
        L_0x0137:
            int r0 = r20.getMeasuredWidth()
            int r0 = r17 + r0
            r1 = r26
            int r2 = r1.leftMargin
            int r0 = r0 + r2
            int r2 = r1.rightMargin
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r8, r0)
            int r2 = r20.getMeasuredHeight()
            int r2 = r18 + r2
            int r3 = r1.topMargin
            int r2 = r2 + r3
            int r1 = r1.bottomMargin
            int r2 = r2 + r1
            r1 = r27
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r20.getMeasuredState()
            r11 = r25
            int r2 = android.view.View.combineMeasuredStates(r11, r2)
            r5 = r0
            r4 = r1
        L_0x0167:
            int r3 = r22 + 1
            r8 = r28
            r6 = r29
            goto L_0x0057
        L_0x016f:
            r11 = r2
            r1 = r4
            r8 = r5
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r11
            r2 = r31
            int r0 = android.view.View.resolveSizeAndState(r8, r2, r0)
            int r2 = r11 << 16
            r3 = r32
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r2)
            r7.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        c f4;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(0) && (f4 = fVar.f()) != null) {
                    z2 |= f4.n(this, childAt, view, f2, f3, z);
                }
            }
        }
        if (z2) {
            L(1);
        }
        return z2;
    }

    public boolean onNestedPreFling(View view, float f2, float f3) {
        c f4;
        int childCount = getChildCount();
        boolean z = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(0) && (f4 = fVar.f()) != null) {
                    z |= f4.o(this, childAt, view, f2, f3);
                }
            }
        }
        return z;
    }

    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        m(view, i2, i3, iArr, 0);
    }

    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        i(view, i2, i3, i4, i5, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int i2) {
        k(view, view2, i2, 0);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        SparseArray<Parcelable> sparseArray = savedState.f1240d;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            c f2 = C(childAt).f();
            if (!(id == -1 || f2 == null || (parcelable2 = sparseArray.get(id)) == null)) {
                f2.w(this, childAt, parcelable2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable x2;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            c f2 = ((f) childAt.getLayoutParams()).f();
            if (!(id == -1 || f2 == null || (x2 = f2.x(this, childAt)) == null)) {
                sparseArray.append(id, x2);
            }
        }
        savedState.f1240d = sparseArray;
        return savedState;
    }

    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return j(view, view2, i2, 0);
    }

    public void onStopNestedScroll(View view) {
        l(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.k
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0015
            boolean r3 = r0.P(r1, r4)
            if (r3 == 0) goto L_0x002b
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            android.view.View r6 = r0.k
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.f()
            if (r6 == 0) goto L_0x002b
            android.view.View r7 = r0.k
            boolean r6 = r6.C(r0, r7, r1)
            goto L_0x002c
        L_0x002b:
            r6 = 0
        L_0x002c:
            android.view.View r7 = r0.k
            r8 = 0
            if (r7 != 0) goto L_0x0037
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x004a
        L_0x0037:
            if (r3 == 0) goto L_0x004a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x004a:
            if (r8 == 0) goto L_0x004f
            r8.recycle()
        L_0x004f:
            if (r2 == r4) goto L_0x0054
            r1 = 3
            if (r2 != r1) goto L_0x0057
        L_0x0054:
            r0.U(r5)
        L_0x0057:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void p(View view) {
        List g2 = this.f1236c.g(view);
        if (g2 != null && !g2.isEmpty()) {
            for (int i2 = 0; i2 < g2.size(); i2++) {
                View view2 = (View) g2.get(i2);
                c f2 = ((f) view2.getLayoutParams()).f();
                if (f2 != null) {
                    f2.h(this, view2, view);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void q() {
        int childCount = getChildCount();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            } else if (E(getChildAt(i2))) {
                z = true;
                break;
            } else {
                i2++;
            }
        }
        if (z == this.n) {
            return;
        }
        if (z) {
            f();
        } else {
            T();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public f generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        c f2 = ((f) view.getLayoutParams()).f();
        if (f2 == null || !f2.v(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.h) {
            U(false);
            this.h = true;
        }
    }

    /* renamed from: s */
    public f generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        b0();
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.r = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.q;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.q = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.q.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.a.m(this.q, t.t(this));
                this.q.setVisible(getVisibility() == 0, false);
                this.q.setCallback(this);
            }
            t.T(this);
        }
    }

    public void setStatusBarBackgroundColor(int i2) {
        setStatusBarBackground(new ColorDrawable(i2));
    }

    public void setStatusBarBackgroundResource(int i2) {
        setStatusBarBackground(i2 != 0 ? androidx.core.content.a.f(getContext(), i2) : null);
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.q;
        if (drawable != null && drawable.isVisible() != z) {
            this.q.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new f(layoutParams);
    }

    /* access modifiers changed from: package-private */
    public void u(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            x(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public List<View> v(View view) {
        List<View> h2 = this.f1236c.h(view);
        this.f1238e.clear();
        if (h2 != null) {
            this.f1238e.addAll(h2);
        }
        return this.f1238e;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.q;
    }

    public List<View> w(View view) {
        List g2 = this.f1236c.g(view);
        this.f1238e.clear();
        if (g2 != null) {
            this.f1238e.addAll(g2);
        }
        return this.f1238e;
    }

    /* access modifiers changed from: package-private */
    public void x(View view, Rect rect) {
        b.a(this, view, rect);
    }

    /* access modifiers changed from: package-private */
    public void y(View view, int i2, Rect rect, Rect rect2) {
        f fVar = (f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        z(view, i2, rect, rect2, fVar, measuredWidth, measuredHeight);
        n(fVar, rect2, measuredWidth, measuredHeight);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.g.a.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        TypedArray typedArray;
        this.f1235b = new ArrayList();
        this.f1236c = new a<>();
        this.f1237d = new ArrayList();
        this.f1238e = new ArrayList();
        this.f1239f = new int[2];
        this.t = new p(this);
        if (i2 == 0) {
            typedArray = context.obtainStyledAttributes(attributeSet, a.g.c.CoordinatorLayout, 0, a.g.b.Widget_Support_CoordinatorLayout);
        } else {
            typedArray = context.obtainStyledAttributes(attributeSet, a.g.c.CoordinatorLayout, i2, 0);
        }
        int resourceId = typedArray.getResourceId(a.g.c.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.j = resources.getIntArray(resourceId);
            float f2 = resources.getDisplayMetrics().density;
            int length = this.j.length;
            for (int i3 = 0; i3 < length; i3++) {
                int[] iArr = this.j;
                iArr[i3] = (int) (((float) iArr[i3]) * f2);
            }
        }
        this.q = typedArray.getDrawable(a.g.c.CoordinatorLayout_statusBarBackground);
        typedArray.recycle();
        b0();
        super.setOnHierarchyChangeListener(new e());
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        SparseArray<Parcelable> f1240d;

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
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f1240d = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f1240d.append(iArr[i], readParcelableArray[i]);
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.f1240d;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f1240d.keyAt(i2);
                parcelableArr[i2] = this.f1240d.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        c f1243a;

        /* renamed from: b  reason: collision with root package name */
        boolean f1244b = false;

        /* renamed from: c  reason: collision with root package name */
        public int f1245c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f1246d = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f1247e = -1;

        /* renamed from: f  reason: collision with root package name */
        int f1248f = -1;
        public int g = 0;
        public int h = 0;
        int i;
        int j;
        View k;
        View l;
        private boolean m;
        private boolean n;
        private boolean o;
        private boolean p;
        final Rect q = new Rect();

        public f(int i2, int i3) {
            super(i2, i3);
        }

        private void n(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f1248f);
            this.k = findViewById;
            if (findViewById != null) {
                if (findViewById != coordinatorLayout) {
                    ViewParent parent = findViewById.getParent();
                    while (parent != coordinatorLayout && parent != null) {
                        if (parent != view) {
                            if (parent instanceof View) {
                                findViewById = (View) parent;
                            }
                            parent = parent.getParent();
                        } else if (coordinatorLayout.isInEditMode()) {
                            this.l = null;
                            this.k = null;
                            return;
                        } else {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.l = findViewById;
                } else if (coordinatorLayout.isInEditMode()) {
                    this.l = null;
                    this.k = null;
                } else {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (coordinatorLayout.isInEditMode()) {
                this.l = null;
                this.k = null;
            } else {
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f1248f) + " to anchor view " + view);
            }
        }

        private boolean s(View view, int i2) {
            int b2 = a.h.k.d.b(((f) view.getLayoutParams()).g, i2);
            return b2 != 0 && (a.h.k.d.b(this.h, i2) & b2) == b2;
        }

        private boolean t(View view, CoordinatorLayout coordinatorLayout) {
            if (this.k.getId() != this.f1248f) {
                return false;
            }
            View view2 = this.k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.l = null;
                    this.k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
            this.l = view2;
            return true;
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            return this.k == null && this.f1248f != -1;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
            r0 = r1.f1243a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean b(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4) {
            /*
                r1 = this;
                android.view.View r0 = r1.l
                if (r4 == r0) goto L_0x001b
                int r0 = a.h.k.t.t(r2)
                boolean r0 = r1.s(r4, r0)
                if (r0 != 0) goto L_0x001b
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r1.f1243a
                if (r0 == 0) goto L_0x0019
                boolean r2 = r0.e(r2, r3, r4)
                if (r2 == 0) goto L_0x0019
                goto L_0x001b
            L_0x0019:
                r2 = 0
                goto L_0x001c
            L_0x001b:
                r2 = 1
            L_0x001c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.f.b(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View):boolean");
        }

        /* access modifiers changed from: package-private */
        public boolean c() {
            if (this.f1243a == null) {
                this.m = false;
            }
            return this.m;
        }

        /* access modifiers changed from: package-private */
        public View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f1248f == -1) {
                this.l = null;
                this.k = null;
                return null;
            }
            if (this.k == null || !t(view, coordinatorLayout)) {
                n(view, coordinatorLayout);
            }
            return this.k;
        }

        public int e() {
            return this.f1248f;
        }

        public c f() {
            return this.f1243a;
        }

        /* access modifiers changed from: package-private */
        public boolean g() {
            return this.p;
        }

        /* access modifiers changed from: package-private */
        public Rect h() {
            return this.q;
        }

        /* access modifiers changed from: package-private */
        public boolean i(CoordinatorLayout coordinatorLayout, View view) {
            boolean z = this.m;
            if (z) {
                return true;
            }
            c cVar = this.f1243a;
            boolean a2 = (cVar != null ? cVar.a(coordinatorLayout, view) : false) | z;
            this.m = a2;
            return a2;
        }

        /* access modifiers changed from: package-private */
        public boolean j(int i2) {
            if (i2 == 0) {
                return this.n;
            }
            if (i2 != 1) {
                return false;
            }
            return this.o;
        }

        /* access modifiers changed from: package-private */
        public void k() {
            this.p = false;
        }

        /* access modifiers changed from: package-private */
        public void l(int i2) {
            r(i2, false);
        }

        /* access modifiers changed from: package-private */
        public void m() {
            this.m = false;
        }

        public void o(c cVar) {
            c cVar2 = this.f1243a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.j();
                }
                this.f1243a = cVar;
                this.f1244b = true;
                if (cVar != null) {
                    cVar.g(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void p(boolean z) {
            this.p = z;
        }

        /* access modifiers changed from: package-private */
        public void q(Rect rect) {
            this.q.set(rect);
        }

        /* access modifiers changed from: package-private */
        public void r(int i2, boolean z) {
            if (i2 == 0) {
                this.n = z;
            } else if (i2 == 1) {
                this.o = z;
            }
        }

        f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.g.c.CoordinatorLayout_Layout);
            this.f1245c = obtainStyledAttributes.getInteger(a.g.c.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f1248f = obtainStyledAttributes.getResourceId(a.g.c.CoordinatorLayout_Layout_layout_anchor, -1);
            this.f1246d = obtainStyledAttributes.getInteger(a.g.c.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.f1247e = obtainStyledAttributes.getInteger(a.g.c.CoordinatorLayout_Layout_layout_keyline, -1);
            this.g = obtainStyledAttributes.getInt(a.g.c.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.h = obtainStyledAttributes.getInt(a.g.c.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(a.g.c.CoordinatorLayout_Layout_layout_behavior);
            this.f1244b = hasValue;
            if (hasValue) {
                this.f1243a = CoordinatorLayout.O(context, attributeSet, obtainStyledAttributes.getString(a.g.c.CoordinatorLayout_Layout_layout_behavior));
            }
            obtainStyledAttributes.recycle();
            c cVar = this.f1243a;
            if (cVar != null) {
                cVar.g(this);
            }
        }

        public f(f fVar) {
            super(fVar);
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
