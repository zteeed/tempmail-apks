package androidx.slidingpanelayout.widget;

import a.h.k.u;
import a.j.a.c;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.customview.view.AbsSavedState;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class SlidingPaneLayout extends ViewGroup {

    /* renamed from: b  reason: collision with root package name */
    private int f1960b;

    /* renamed from: c  reason: collision with root package name */
    private int f1961c;

    /* renamed from: d  reason: collision with root package name */
    private Drawable f1962d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f1963e;

    /* renamed from: f  reason: collision with root package name */
    private final int f1964f;
    private boolean g;
    View h;
    float i;
    private float j;
    int k;
    boolean l;
    private int m;
    private float n;
    private float o;
    private e p;
    final a.j.a.c q;
    boolean r;
    private boolean s;
    private final Rect t;
    final ArrayList<b> u;
    private Method v;
    private Field w;
    private boolean x;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        boolean f1965d;

        static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1965d ? 1 : 0);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1965d = parcel.readInt() != 0;
        }
    }

    class a extends a.h.k.a {

        /* renamed from: d  reason: collision with root package name */
        private final Rect f1966d = new Rect();

        a() {
        }

        private void n(a.h.k.d0.d dVar, a.h.k.d0.d dVar2) {
            Rect rect = this.f1966d;
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
            dVar.n0(dVar2.r());
        }

        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
        }

        public void g(View view, a.h.k.d0.d dVar) {
            a.h.k.d0.d N = a.h.k.d0.d.N(dVar);
            super.g(view, N);
            n(dVar, N);
            N.P();
            dVar.Z(SlidingPaneLayout.class.getName());
            dVar.w0(view);
            ViewParent y = u.y(view);
            if (y instanceof View) {
                dVar.q0((View) y);
            }
            int childCount = SlidingPaneLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = SlidingPaneLayout.this.getChildAt(i);
                if (!o(childAt) && childAt.getVisibility() == 0) {
                    u.i0(childAt, 1);
                    dVar.c(childAt);
                }
            }
        }

        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (!o(view)) {
                return super.i(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        public boolean o(View view) {
            return SlidingPaneLayout.this.h(view);
        }
    }

    private class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final View f1968b;

        b(View view) {
            this.f1968b = view;
        }

        public void run() {
            if (this.f1968b.getParent() == SlidingPaneLayout.this) {
                this.f1968b.setLayerType(0, (Paint) null);
                SlidingPaneLayout.this.g(this.f1968b);
            }
            SlidingPaneLayout.this.u.remove(this);
        }
    }

    private class c extends c.C0019c {
        c() {
        }

        public int a(View view, int i, int i2) {
            d dVar = (d) SlidingPaneLayout.this.h.getLayoutParams();
            if (SlidingPaneLayout.this.i()) {
                int width = SlidingPaneLayout.this.getWidth() - ((SlidingPaneLayout.this.getPaddingRight() + dVar.rightMargin) + SlidingPaneLayout.this.h.getWidth());
                return Math.max(Math.min(i, width), width - SlidingPaneLayout.this.k);
            }
            int paddingLeft = SlidingPaneLayout.this.getPaddingLeft() + dVar.leftMargin;
            return Math.min(Math.max(i, paddingLeft), SlidingPaneLayout.this.k + paddingLeft);
        }

        public int b(View view, int i, int i2) {
            return view.getTop();
        }

        public int d(View view) {
            return SlidingPaneLayout.this.k;
        }

        public void f(int i, int i2) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            slidingPaneLayout.q.c(slidingPaneLayout.h, i2);
        }

        public void i(View view, int i) {
            SlidingPaneLayout.this.p();
        }

        public void j(int i) {
            if (SlidingPaneLayout.this.q.A() == 0) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                if (slidingPaneLayout.i == 0.0f) {
                    slidingPaneLayout.r(slidingPaneLayout.h);
                    SlidingPaneLayout slidingPaneLayout2 = SlidingPaneLayout.this;
                    slidingPaneLayout2.d(slidingPaneLayout2.h);
                    SlidingPaneLayout.this.r = false;
                    return;
                }
                slidingPaneLayout.e(slidingPaneLayout.h);
                SlidingPaneLayout.this.r = true;
            }
        }

        public void k(View view, int i, int i2, int i3, int i4) {
            SlidingPaneLayout.this.l(i);
            SlidingPaneLayout.this.invalidate();
        }

        public void l(View view, float f2, float f3) {
            int i;
            d dVar = (d) view.getLayoutParams();
            if (SlidingPaneLayout.this.i()) {
                int paddingRight = SlidingPaneLayout.this.getPaddingRight() + dVar.rightMargin;
                if (f2 < 0.0f || (f2 == 0.0f && SlidingPaneLayout.this.i > 0.5f)) {
                    paddingRight += SlidingPaneLayout.this.k;
                }
                i = (SlidingPaneLayout.this.getWidth() - paddingRight) - SlidingPaneLayout.this.h.getWidth();
            } else {
                i = dVar.leftMargin + SlidingPaneLayout.this.getPaddingLeft();
                int i2 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
                if (i2 > 0 || (i2 == 0 && SlidingPaneLayout.this.i > 0.5f)) {
                    i += SlidingPaneLayout.this.k;
                }
            }
            SlidingPaneLayout.this.q.N(i, view.getTop());
            SlidingPaneLayout.this.invalidate();
        }

        public boolean m(View view, int i) {
            if (SlidingPaneLayout.this.l) {
                return false;
            }
            return ((d) view.getLayoutParams()).f1973b;
        }
    }

    public interface e {
        void a(View view, float f2);

        void b(View view);

        void c(View view);
    }

    public SlidingPaneLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    private boolean b(View view, int i2) {
        if (!this.s && !q(0.0f, i2)) {
            return false;
        }
        this.r = false;
        return true;
    }

    private void c(View view, float f2, int i2) {
        d dVar = (d) view.getLayoutParams();
        if (f2 > 0.0f && i2 != 0) {
            int i3 = (((int) (((float) ((-16777216 & i2) >>> 24)) * f2)) << 24) | (i2 & 16777215);
            if (dVar.f1975d == null) {
                dVar.f1975d = new Paint();
            }
            dVar.f1975d.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_OVER));
            if (view.getLayerType() != 2) {
                view.setLayerType(2, dVar.f1975d);
            }
            g(view);
        } else if (view.getLayerType() != 0) {
            Paint paint = dVar.f1975d;
            if (paint != null) {
                paint.setColorFilter((ColorFilter) null);
            }
            b bVar = new b(view);
            this.u.add(bVar);
            u.V(this, bVar);
        }
    }

    private boolean n(View view, int i2) {
        if (!this.s && !q(1.0f, i2)) {
            return false;
        }
        this.r = true;
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void o(float r10) {
        /*
            r9 = this;
            boolean r0 = r9.i()
            android.view.View r1 = r9.h
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.slidingpanelayout.widget.SlidingPaneLayout$d r1 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.d) r1
            boolean r2 = r1.f1974c
            r3 = 0
            if (r2 == 0) goto L_0x001c
            if (r0 == 0) goto L_0x0016
            int r1 = r1.rightMargin
            goto L_0x0018
        L_0x0016:
            int r1 = r1.leftMargin
        L_0x0018:
            if (r1 > 0) goto L_0x001c
            r1 = 1
            goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            int r2 = r9.getChildCount()
        L_0x0021:
            if (r3 >= r2) goto L_0x0059
            android.view.View r4 = r9.getChildAt(r3)
            android.view.View r5 = r9.h
            if (r4 != r5) goto L_0x002c
            goto L_0x0056
        L_0x002c:
            float r5 = r9.j
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r6 - r5
            int r7 = r9.m
            float r8 = (float) r7
            float r5 = r5 * r8
            int r5 = (int) r5
            r9.j = r10
            float r8 = r6 - r10
            float r7 = (float) r7
            float r8 = r8 * r7
            int r7 = (int) r8
            int r5 = r5 - r7
            if (r0 == 0) goto L_0x0044
            int r5 = -r5
        L_0x0044:
            r4.offsetLeftAndRight(r5)
            if (r1 == 0) goto L_0x0056
            float r5 = r9.j
            if (r0 == 0) goto L_0x004f
            float r5 = r5 - r6
            goto L_0x0051
        L_0x004f:
            float r5 = r6 - r5
        L_0x0051:
            int r6 = r9.f1961c
            r9.c(r4, r5, r6)
        L_0x0056:
            int r3 = r3 + 1
            goto L_0x0021
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.o(float):void");
    }

    private static boolean s(View view) {
        Drawable background;
        if (view.isOpaque()) {
            return true;
        }
        if (Build.VERSION.SDK_INT < 18 && (background = view.getBackground()) != null && background.getOpacity() == -1) {
            return true;
        }
        return false;
    }

    public boolean a() {
        return b(this.h, 0);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof d) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        if (!this.q.n(true)) {
            return;
        }
        if (!this.g) {
            this.q.a();
        } else {
            u.T(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void d(View view) {
        e eVar = this.p;
        if (eVar != null) {
            eVar.c(view);
        }
        sendAccessibilityEvent(32);
    }

    public void draw(Canvas canvas) {
        Drawable drawable;
        int i2;
        int i3;
        super.draw(canvas);
        if (i()) {
            drawable = this.f1963e;
        } else {
            drawable = this.f1962d;
        }
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt != null && drawable != null) {
            int top = childAt.getTop();
            int bottom = childAt.getBottom();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (i()) {
                i3 = childAt.getRight();
                i2 = intrinsicWidth + i3;
            } else {
                int left = childAt.getLeft();
                int i4 = left - intrinsicWidth;
                i2 = left;
                i3 = i4;
            }
            drawable.setBounds(i3, top, i2, bottom);
            drawable.draw(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j2) {
        d dVar = (d) view.getLayoutParams();
        int save = canvas.save();
        if (this.g && !dVar.f1973b && this.h != null) {
            canvas.getClipBounds(this.t);
            if (i()) {
                Rect rect = this.t;
                rect.left = Math.max(rect.left, this.h.getRight());
            } else {
                Rect rect2 = this.t;
                rect2.right = Math.min(rect2.right, this.h.getLeft());
            }
            canvas.clipRect(this.t);
        }
        boolean drawChild = super.drawChild(canvas, view, j2);
        canvas.restoreToCount(save);
        return drawChild;
    }

    /* access modifiers changed from: package-private */
    public void e(View view) {
        e eVar = this.p;
        if (eVar != null) {
            eVar.b(view);
        }
        sendAccessibilityEvent(32);
    }

    /* access modifiers changed from: package-private */
    public void f(View view) {
        e eVar = this.p;
        if (eVar != null) {
            eVar.a(view, this.i);
        }
    }

    /* access modifiers changed from: package-private */
    public void g(View view) {
        Field field;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 17) {
            u.k0(view, ((d) view.getLayoutParams()).f1975d);
            return;
        }
        if (i2 >= 16) {
            if (!this.x) {
                try {
                    this.v = View.class.getDeclaredMethod("getDisplayList", (Class[]) null);
                } catch (NoSuchMethodException e2) {
                    Log.e("SlidingPaneLayout", "Couldn't fetch getDisplayList method; dimming won't work right.", e2);
                }
                try {
                    Field declaredField = View.class.getDeclaredField("mRecreateDisplayList");
                    this.w = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e3) {
                    Log.e("SlidingPaneLayout", "Couldn't fetch mRecreateDisplayList field; dimming will be slow.", e3);
                }
                this.x = true;
            }
            if (this.v == null || (field = this.w) == null) {
                view.invalidate();
                return;
            }
            try {
                field.setBoolean(view, true);
                this.v.invoke(view, (Object[]) null);
            } catch (Exception e4) {
                Log.e("SlidingPaneLayout", "Error refreshing display list state", e4);
            }
        }
        u.U(this, view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new d();
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new d((ViewGroup.MarginLayoutParams) layoutParams) : new d(layoutParams);
    }

    public int getCoveredFadeColor() {
        return this.f1961c;
    }

    public int getParallaxDistance() {
        return this.m;
    }

    public int getSliderFadeColor() {
        return this.f1960b;
    }

    /* access modifiers changed from: package-private */
    public boolean h(View view) {
        if (view == null) {
            return false;
        }
        d dVar = (d) view.getLayoutParams();
        if (!this.g || !dVar.f1974c || this.i <= 0.0f) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean i() {
        return u.t(this) == 1;
    }

    public boolean j() {
        return !this.g || this.i == 1.0f;
    }

    public boolean k() {
        return this.g;
    }

    /* access modifiers changed from: package-private */
    public void l(int i2) {
        if (this.h == null) {
            this.i = 0.0f;
            return;
        }
        boolean i3 = i();
        d dVar = (d) this.h.getLayoutParams();
        int width = this.h.getWidth();
        if (i3) {
            i2 = (getWidth() - i2) - width;
        }
        float paddingRight = ((float) (i2 - ((i3 ? getPaddingRight() : getPaddingLeft()) + (i3 ? dVar.rightMargin : dVar.leftMargin)))) / ((float) this.k);
        this.i = paddingRight;
        if (this.m != 0) {
            o(paddingRight);
        }
        if (dVar.f1974c) {
            c(this.h, this.i, this.f1960b);
        }
        f(this.h);
    }

    public boolean m() {
        return n(this.h, 0);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.s = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.s = true;
        int size = this.u.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.u.get(i2).run();
        }
        this.u.clear();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        if (!this.g && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.r = !this.q.E(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (!this.g || (this.l && actionMasked != 0)) {
            this.q.b();
            return super.onInterceptTouchEvent(motionEvent);
        } else if (actionMasked == 3 || actionMasked == 1) {
            this.q.b();
            return false;
        } else {
            if (actionMasked == 0) {
                this.l = false;
                float x2 = motionEvent.getX();
                float y = motionEvent.getY();
                this.n = x2;
                this.o = y;
                if (this.q.E(this.h, (int) x2, (int) y) && h(this.h)) {
                    z = true;
                    if (this.q.O(motionEvent) && !z) {
                        return false;
                    }
                }
            } else if (actionMasked == 2) {
                float x3 = motionEvent.getX();
                float y2 = motionEvent.getY();
                float abs = Math.abs(x3 - this.n);
                float abs2 = Math.abs(y2 - this.o);
                if (abs > ((float) this.q.z()) && abs2 > abs) {
                    this.q.b();
                    this.l = true;
                    return false;
                }
            }
            z = false;
            return this.q.O(motionEvent) ? true : true;
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        boolean i10 = i();
        if (i10) {
            this.q.L(2);
        } else {
            this.q.L(1);
        }
        int i11 = i4 - i2;
        int paddingRight = i10 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = i10 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.s) {
            this.i = (!this.g || !this.r) ? 0.0f : 1.0f;
        }
        int i12 = paddingRight;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (dVar.f1973b) {
                    int i14 = i11 - paddingLeft;
                    int min = (Math.min(paddingRight, i14 - this.f1964f) - i12) - (dVar.leftMargin + dVar.rightMargin);
                    this.k = min;
                    int i15 = i10 ? dVar.rightMargin : dVar.leftMargin;
                    dVar.f1974c = ((i12 + i15) + min) + (measuredWidth / 2) > i14;
                    int i16 = (int) (((float) min) * this.i);
                    i12 += i15 + i16;
                    this.i = ((float) i16) / ((float) this.k);
                    i6 = 0;
                } else if (!this.g || (i9 = this.m) == 0) {
                    i12 = paddingRight;
                    i6 = 0;
                } else {
                    i6 = (int) ((1.0f - this.i) * ((float) i9));
                    i12 = paddingRight;
                }
                if (i10) {
                    i7 = (i11 - i12) + i6;
                    i8 = i7 - measuredWidth;
                } else {
                    i8 = i12 - i6;
                    i7 = i8 + measuredWidth;
                }
                childAt.layout(i8, paddingTop, i7, childAt.getMeasuredHeight() + paddingTop);
                paddingRight += childAt.getWidth();
            }
        }
        if (this.s) {
            if (this.g) {
                if (this.m != 0) {
                    o(this.i);
                }
                if (((d) this.h.getLayoutParams()).f1974c) {
                    c(this.h, this.i, this.f1960b);
                }
            } else {
                for (int i17 = 0; i17 < childCount; i17++) {
                    c(getChildAt(i17), 0.0f, this.f1960b);
                }
            }
            r(this.h);
        }
        this.s = false;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        float f2;
        int i12;
        int i13;
        int i14;
        int i15;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
            } else if (mode != Integer.MIN_VALUE && mode == 0) {
                size = 300;
            }
        } else if (mode2 == 0) {
            if (!isInEditMode()) {
                throw new IllegalStateException("Height must not be UNSPECIFIED");
            } else if (mode2 == 0) {
                mode2 = Integer.MIN_VALUE;
                size2 = 300;
            }
        }
        boolean z = false;
        if (mode2 == Integer.MIN_VALUE) {
            i4 = (size2 - getPaddingTop()) - getPaddingBottom();
            i5 = 0;
        } else if (mode2 != 1073741824) {
            i5 = 0;
            i4 = 0;
        } else {
            i5 = (size2 - getPaddingTop()) - getPaddingBottom();
            i4 = i5;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        if (childCount > 2) {
            Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
        }
        this.h = null;
        int i16 = paddingLeft;
        int i17 = 0;
        boolean z2 = false;
        float f3 = 0.0f;
        while (true) {
            i6 = 8;
            if (i17 >= childCount) {
                break;
            }
            View childAt = getChildAt(i17);
            d dVar = (d) childAt.getLayoutParams();
            if (childAt.getVisibility() == 8) {
                dVar.f1974c = z;
            } else {
                float f4 = dVar.f1972a;
                if (f4 > 0.0f) {
                    f3 += f4;
                    if (dVar.width == 0) {
                    }
                }
                int i18 = dVar.leftMargin + dVar.rightMargin;
                int i19 = dVar.width;
                if (i19 == -2) {
                    i12 = View.MeasureSpec.makeMeasureSpec(paddingLeft - i18, Integer.MIN_VALUE);
                    f2 = f3;
                    i13 = Integer.MIN_VALUE;
                } else {
                    f2 = f3;
                    i13 = Integer.MIN_VALUE;
                    if (i19 == -1) {
                        i12 = View.MeasureSpec.makeMeasureSpec(paddingLeft - i18, 1073741824);
                    } else {
                        i12 = View.MeasureSpec.makeMeasureSpec(i19, 1073741824);
                    }
                }
                int i20 = dVar.height;
                if (i20 == -2) {
                    i14 = View.MeasureSpec.makeMeasureSpec(i4, i13);
                } else {
                    if (i20 == -1) {
                        i15 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                    } else {
                        i15 = View.MeasureSpec.makeMeasureSpec(i20, 1073741824);
                    }
                    i14 = i15;
                }
                childAt.measure(i12, i14);
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (mode2 == i13 && measuredHeight > i5) {
                    i5 = Math.min(measuredHeight, i4);
                }
                i16 -= measuredWidth;
                boolean z3 = i16 < 0;
                dVar.f1973b = z3;
                z2 |= z3;
                if (z3) {
                    this.h = childAt;
                }
                f3 = f2;
            }
            i17++;
            z = false;
        }
        if (z2 || f3 > 0.0f) {
            int i21 = paddingLeft - this.f1964f;
            int i22 = 0;
            while (i22 < childCount) {
                View childAt2 = getChildAt(i22);
                if (childAt2.getVisibility() != i6) {
                    d dVar2 = (d) childAt2.getLayoutParams();
                    if (childAt2.getVisibility() != i6) {
                        boolean z4 = dVar2.width == 0 && dVar2.f1972a > 0.0f;
                        if (z4) {
                            i8 = 0;
                        } else {
                            i8 = childAt2.getMeasuredWidth();
                        }
                        if (!z2 || childAt2 == this.h) {
                            if (dVar2.f1972a > 0.0f) {
                                if (dVar2.width == 0) {
                                    int i23 = dVar2.height;
                                    if (i23 == -2) {
                                        i9 = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
                                    } else if (i23 == -1) {
                                        i9 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                                    } else {
                                        i9 = View.MeasureSpec.makeMeasureSpec(i23, 1073741824);
                                    }
                                } else {
                                    i9 = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                                }
                                if (z2) {
                                    int i24 = paddingLeft - (dVar2.leftMargin + dVar2.rightMargin);
                                    i7 = i21;
                                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i24, 1073741824);
                                    if (i8 != i24) {
                                        childAt2.measure(makeMeasureSpec, i9);
                                    }
                                    i22++;
                                    i21 = i7;
                                    i6 = 8;
                                } else {
                                    i7 = i21;
                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i8 + ((int) ((dVar2.f1972a * ((float) Math.max(0, i16))) / f3)), 1073741824), i9);
                                    i22++;
                                    i21 = i7;
                                    i6 = 8;
                                }
                            }
                        } else if (dVar2.width < 0 && (i8 > i21 || dVar2.f1972a > 0.0f)) {
                            if (z4) {
                                int i25 = dVar2.height;
                                if (i25 == -2) {
                                    i11 = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
                                    i10 = 1073741824;
                                } else if (i25 == -1) {
                                    i10 = 1073741824;
                                    i11 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                                } else {
                                    i10 = 1073741824;
                                    i11 = View.MeasureSpec.makeMeasureSpec(i25, 1073741824);
                                }
                            } else {
                                i10 = 1073741824;
                                i11 = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                            }
                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(i21, i10), i11);
                        }
                    }
                }
                i7 = i21;
                i22++;
                i21 = i7;
                i6 = 8;
            }
        }
        setMeasuredDimension(size, i5 + getPaddingTop() + getPaddingBottom());
        this.g = z2;
        if (this.q.A() != 0 && !z2) {
            this.q.a();
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        if (savedState.f1965d) {
            m();
        } else {
            a();
        }
        this.r = savedState.f1965d;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1965d = k() ? j() : this.r;
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            this.s = true;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.g) {
            return super.onTouchEvent(motionEvent);
        }
        this.q.F(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x2 = motionEvent.getX();
            float y = motionEvent.getY();
            this.n = x2;
            this.o = y;
        } else if (actionMasked == 1 && h(this.h)) {
            float x3 = motionEvent.getX();
            float y2 = motionEvent.getY();
            float f2 = x3 - this.n;
            float f3 = y2 - this.o;
            int z = this.q.z();
            if ((f2 * f2) + (f3 * f3) < ((float) (z * z)) && this.q.E(this.h, (int) x3, (int) y2)) {
                b(this.h, 0);
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void p() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean q(float f2, int i2) {
        int i3;
        if (!this.g) {
            return false;
        }
        boolean i4 = i();
        d dVar = (d) this.h.getLayoutParams();
        if (i4) {
            i3 = (int) (((float) getWidth()) - ((((float) (getPaddingRight() + dVar.rightMargin)) + (f2 * ((float) this.k))) + ((float) this.h.getWidth())));
        } else {
            i3 = (int) (((float) (getPaddingLeft() + dVar.leftMargin)) + (f2 * ((float) this.k)));
        }
        a.j.a.c cVar = this.q;
        View view = this.h;
        if (!cVar.P(view, i3, view.getTop())) {
            return false;
        }
        p();
        u.T(this);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void r(View view) {
        int i2;
        int i3;
        int i4;
        int i5;
        View childAt;
        boolean z;
        View view2 = view;
        boolean i6 = i();
        int width = i6 ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = i6 ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !s(view)) {
            i5 = 0;
            i4 = 0;
            i3 = 0;
            i2 = 0;
        } else {
            i5 = view.getLeft();
            i4 = view.getRight();
            i3 = view.getTop();
            i2 = view.getBottom();
        }
        int childCount = getChildCount();
        int i7 = 0;
        while (true) {
            if (i7 < childCount && (childAt = getChildAt(i7)) != view2) {
                if (childAt.getVisibility() == 8) {
                    z = i6;
                } else {
                    z = i6;
                    childAt.setVisibility((Math.max(i6 ? paddingLeft : width, childAt.getLeft()) < i5 || Math.max(paddingTop, childAt.getTop()) < i3 || Math.min(i6 ? width : paddingLeft, childAt.getRight()) > i4 || Math.min(height, childAt.getBottom()) > i2) ? 0 : 4);
                }
                i7++;
                view2 = view;
                i6 = z;
            } else {
                return;
            }
        }
    }

    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && !this.g) {
            this.r = view == this.h;
        }
    }

    public void setCoveredFadeColor(int i2) {
        this.f1961c = i2;
    }

    public void setPanelSlideListener(e eVar) {
        this.p = eVar;
    }

    public void setParallaxDistance(int i2) {
        this.m = i2;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable) {
        this.f1962d = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable) {
        this.f1963e = drawable;
    }

    @Deprecated
    public void setShadowResource(int i2) {
        setShadowDrawable(getResources().getDrawable(i2));
    }

    public void setShadowResourceLeft(int i2) {
        setShadowDrawableLeft(androidx.core.content.a.f(getContext(), i2));
    }

    public void setShadowResourceRight(int i2) {
        setShadowDrawableRight(androidx.core.content.a.f(getContext(), i2));
    }

    public void setSliderFadeColor(int i2) {
        this.f1960b = i2;
    }

    public static class d extends ViewGroup.MarginLayoutParams {

        /* renamed from: e  reason: collision with root package name */
        private static final int[] f1971e = {16843137};

        /* renamed from: a  reason: collision with root package name */
        public float f1972a = 0.0f;

        /* renamed from: b  reason: collision with root package name */
        boolean f1973b;

        /* renamed from: c  reason: collision with root package name */
        boolean f1974c;

        /* renamed from: d  reason: collision with root package name */
        Paint f1975d;

        public d() {
            super(-1, -1);
        }

        public d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1971e);
            this.f1972a = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f1960b = -858993460;
        this.s = true;
        this.t = new Rect();
        this.u = new ArrayList<>();
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f1964f = (int) ((32.0f * f2) + 0.5f);
        setWillNotDraw(false);
        u.Z(this, new a());
        u.i0(this, 1);
        a.j.a.c o2 = a.j.a.c.o(this, 0.5f, new c());
        this.q = o2;
        o2.M(f2 * 400.0f);
    }
}
