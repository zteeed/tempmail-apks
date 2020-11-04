package androidx.swiperefreshlayout.widget;

import a.h.k.k;
import a.h.k.l;
import a.h.k.o;
import a.h.k.p;
import a.h.k.t;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import android.widget.ListView;

public class SwipeRefreshLayout extends ViewGroup implements o, k {
    private static final String P = SwipeRefreshLayout.class.getSimpleName();
    private static final int[] Q = {16842766};
    int A;
    int B;
    b C;
    private Animation D;
    private Animation E;
    private Animation F;
    private Animation G;
    private Animation H;
    boolean I;
    private int J;
    boolean K;
    private i L;
    private Animation.AnimationListener M;
    private final Animation N;
    private final Animation O;

    /* renamed from: b  reason: collision with root package name */
    private View f1876b;

    /* renamed from: c  reason: collision with root package name */
    j f1877c;

    /* renamed from: d  reason: collision with root package name */
    boolean f1878d;

    /* renamed from: e  reason: collision with root package name */
    private int f1879e;

    /* renamed from: f  reason: collision with root package name */
    private float f1880f;
    private float g;
    private final p h;
    private final l i;
    private final int[] j;
    private final int[] k;
    private boolean l;
    private int m;
    int n;
    private float o;
    private float p;
    private boolean q;
    private int r;
    boolean s;
    private boolean t;
    private final DecelerateInterpolator u;
    a v;
    private int w;
    protected int x;
    float y;
    protected int z;

    class a implements Animation.AnimationListener {
        a() {
        }

        public void onAnimationEnd(Animation animation) {
            j jVar;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.f1878d) {
                swipeRefreshLayout.C.setAlpha(255);
                SwipeRefreshLayout.this.C.start();
                SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
                if (swipeRefreshLayout2.I && (jVar = swipeRefreshLayout2.f1877c) != null) {
                    jVar.a();
                }
                SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
                swipeRefreshLayout3.n = swipeRefreshLayout3.v.getTop();
                return;
            }
            swipeRefreshLayout.s();
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    class b extends Animation {
        b() {
        }

        public void applyTransformation(float f2, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(f2);
        }
    }

    class c extends Animation {
        c() {
        }

        public void applyTransformation(float f2, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(1.0f - f2);
        }
    }

    class d extends Animation {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f1884b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f1885c;

        d(int i, int i2) {
            this.f1884b = i;
            this.f1885c = i2;
        }

        public void applyTransformation(float f2, Transformation transformation) {
            b bVar = SwipeRefreshLayout.this.C;
            int i = this.f1884b;
            bVar.setAlpha((int) (((float) i) + (((float) (this.f1885c - i)) * f2)));
        }
    }

    class e implements Animation.AnimationListener {
        e() {
        }

        public void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.s) {
                swipeRefreshLayout.y((Animation.AnimationListener) null);
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    class f extends Animation {
        f() {
        }

        public void applyTransformation(float f2, Transformation transformation) {
            int i;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.K) {
                i = swipeRefreshLayout.A - Math.abs(swipeRefreshLayout.z);
            } else {
                i = swipeRefreshLayout.A;
            }
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            int i2 = swipeRefreshLayout2.x;
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((i2 + ((int) (((float) (i - i2)) * f2))) - swipeRefreshLayout2.v.getTop());
            SwipeRefreshLayout.this.C.e(1.0f - f2);
        }
    }

    class g extends Animation {
        g() {
        }

        public void applyTransformation(float f2, Transformation transformation) {
            SwipeRefreshLayout.this.q(f2);
        }
    }

    class h extends Animation {
        h() {
        }

        public void applyTransformation(float f2, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            float f3 = swipeRefreshLayout.y;
            swipeRefreshLayout.setAnimationProgress(f3 + ((-f3) * f2));
            SwipeRefreshLayout.this.q(f2);
        }
    }

    public interface i {
        boolean a(SwipeRefreshLayout swipeRefreshLayout, View view);
    }

    public interface j {
        void a();
    }

    public SwipeRefreshLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    private void A(Animation.AnimationListener animationListener) {
        this.v.setVisibility(0);
        this.C.setAlpha(255);
        b bVar = new b();
        this.D = bVar;
        bVar.setDuration((long) this.m);
        if (animationListener != null) {
            this.v.b(animationListener);
        }
        this.v.clearAnimation();
        this.v.startAnimation(this.D);
    }

    private void b(int i2, Animation.AnimationListener animationListener) {
        this.x = i2;
        this.N.reset();
        this.N.setDuration(200);
        this.N.setInterpolator(this.u);
        if (animationListener != null) {
            this.v.b(animationListener);
        }
        this.v.clearAnimation();
        this.v.startAnimation(this.N);
    }

    private void c(int i2, Animation.AnimationListener animationListener) {
        if (this.s) {
            z(i2, animationListener);
            return;
        }
        this.x = i2;
        this.O.reset();
        this.O.setDuration(200);
        this.O.setInterpolator(this.u);
        if (animationListener != null) {
            this.v.b(animationListener);
        }
        this.v.clearAnimation();
        this.v.startAnimation(this.O);
    }

    private void e() {
        this.v = new a(getContext(), -328966);
        b bVar = new b(getContext());
        this.C = bVar;
        bVar.l(1);
        this.v.setImageDrawable(this.C);
        this.v.setVisibility(8);
        addView(this.v);
    }

    private void f() {
        if (this.f1876b == null) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (!childAt.equals(this.v)) {
                    this.f1876b = childAt;
                    return;
                }
            }
        }
    }

    private void g(float f2) {
        if (f2 > this.f1880f) {
            t(true, true);
            return;
        }
        this.f1878d = false;
        this.C.j(0.0f, 0.0f);
        e eVar = null;
        if (!this.s) {
            eVar = new e();
        }
        c(this.n, eVar);
        this.C.d(false);
    }

    private boolean n(Animation animation) {
        return animation != null && animation.hasStarted() && !animation.hasEnded();
    }

    private void p(float f2) {
        this.C.d(true);
        float min = Math.min(1.0f, Math.abs(f2 / this.f1880f));
        float max = (((float) Math.max(((double) min) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f2) - this.f1880f;
        int i2 = this.B;
        if (i2 <= 0) {
            i2 = this.K ? this.A - this.z : this.A;
        }
        float f3 = (float) i2;
        double max2 = (double) (Math.max(0.0f, Math.min(abs, f3 * 2.0f) / f3) / 4.0f);
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i3 = this.z + ((int) ((f3 * min) + (f3 * pow * 2.0f)));
        if (this.v.getVisibility() != 0) {
            this.v.setVisibility(0);
        }
        if (!this.s) {
            this.v.setScaleX(1.0f);
            this.v.setScaleY(1.0f);
        }
        if (this.s) {
            setAnimationProgress(Math.min(1.0f, f2 / this.f1880f));
        }
        if (f2 < this.f1880f) {
            if (this.C.getAlpha() > 76 && !n(this.F)) {
                x();
            }
        } else if (this.C.getAlpha() < 255 && !n(this.G)) {
            w();
        }
        this.C.j(0.0f, Math.min(0.8f, max * 0.8f));
        this.C.e(Math.min(1.0f, max));
        this.C.g((((max * 0.4f) - 16.0f) + (pow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i3 - this.n);
    }

    private void r(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.r) {
            this.r = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    private void setColorViewAlpha(int i2) {
        this.v.getBackground().setAlpha(i2);
        this.C.setAlpha(i2);
    }

    private void t(boolean z2, boolean z3) {
        if (this.f1878d != z2) {
            this.I = z3;
            f();
            this.f1878d = z2;
            if (z2) {
                b(this.n, this.M);
            } else {
                y(this.M);
            }
        }
    }

    private Animation u(int i2, int i3) {
        d dVar = new d(i2, i3);
        dVar.setDuration(300);
        this.v.b((Animation.AnimationListener) null);
        this.v.clearAnimation();
        this.v.startAnimation(dVar);
        return dVar;
    }

    private void v(float f2) {
        float f3 = this.p;
        int i2 = this.f1879e;
        if (f2 - f3 > ((float) i2) && !this.q) {
            this.o = f3 + ((float) i2);
            this.q = true;
            this.C.setAlpha(76);
        }
    }

    private void w() {
        this.G = u(this.C.getAlpha(), 255);
    }

    private void x() {
        this.F = u(this.C.getAlpha(), 76);
    }

    private void z(int i2, Animation.AnimationListener animationListener) {
        this.x = i2;
        this.y = this.v.getScaleX();
        h hVar = new h();
        this.H = hVar;
        hVar.setDuration(150);
        if (animationListener != null) {
            this.v.b(animationListener);
        }
        this.v.clearAnimation();
        this.v.startAnimation(this.H);
    }

    public boolean d() {
        i iVar = this.L;
        if (iVar != null) {
            return iVar.a(this, this.f1876b);
        }
        View view = this.f1876b;
        if (view instanceof ListView) {
            return androidx.core.widget.g.a((ListView) view, -1);
        }
        return view.canScrollVertically(-1);
    }

    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return this.i.a(f2, f3, z2);
    }

    public boolean dispatchNestedPreFling(float f2, float f3) {
        return this.i.b(f2, f3);
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return this.i.c(i2, i3, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.i.f(i2, i3, i4, i5, iArr);
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i2, int i3) {
        int i4 = this.w;
        if (i4 < 0) {
            return i3;
        }
        if (i3 == i2 - 1) {
            return i4;
        }
        return i3 >= i4 ? i3 + 1 : i3;
    }

    public int getNestedScrollAxes() {
        return this.h.a();
    }

    public int getProgressCircleDiameter() {
        return this.J;
    }

    public int getProgressViewEndOffset() {
        return this.A;
    }

    public int getProgressViewStartOffset() {
        return this.z;
    }

    public boolean hasNestedScrollingParent() {
        return this.i.k();
    }

    public boolean isNestedScrollingEnabled() {
        return this.i.m();
    }

    public boolean o() {
        return this.f1878d;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        s();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        f();
        int actionMasked = motionEvent.getActionMasked();
        if (this.t && actionMasked == 0) {
            this.t = false;
        }
        if (!isEnabled() || this.t || d() || this.f1878d || this.l) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i2 = this.r;
                    if (i2 == -1) {
                        Log.e(P, "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i2);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    v(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        r(motionEvent);
                    }
                }
            }
            this.q = false;
            this.r = -1;
        } else {
            setTargetOffsetTopAndBottom(this.z - this.v.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.r = pointerId;
            this.q = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.p = motionEvent.getY(findPointerIndex2);
        }
        return this.q;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.f1876b == null) {
                f();
            }
            View view = this.f1876b;
            if (view != null) {
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                int measuredWidth2 = this.v.getMeasuredWidth();
                int measuredHeight2 = this.v.getMeasuredHeight();
                int i6 = measuredWidth / 2;
                int i7 = measuredWidth2 / 2;
                int i8 = this.n;
                this.v.layout(i6 - i7, i8, i6 + i7, measuredHeight2 + i8);
            }
        }
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f1876b == null) {
            f();
        }
        View view = this.f1876b;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.v.measure(View.MeasureSpec.makeMeasureSpec(this.J, 1073741824), View.MeasureSpec.makeMeasureSpec(this.J, 1073741824));
            this.w = -1;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                if (getChildAt(i4) == this.v) {
                    this.w = i4;
                    return;
                }
            }
        }
    }

    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        return dispatchNestedFling(f2, f3, z2);
    }

    public boolean onNestedPreFling(View view, float f2, float f3) {
        return dispatchNestedPreFling(f2, f3);
    }

    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        if (i3 > 0) {
            float f2 = this.g;
            if (f2 > 0.0f) {
                float f3 = (float) i3;
                if (f3 > f2) {
                    iArr[1] = i3 - ((int) f2);
                    this.g = 0.0f;
                } else {
                    this.g = f2 - f3;
                    iArr[1] = i3;
                }
                p(this.g);
            }
        }
        if (this.K && i3 > 0 && this.g == 0.0f && Math.abs(i3 - iArr[1]) > 0) {
            this.v.setVisibility(8);
        }
        int[] iArr2 = this.j;
        if (dispatchNestedPreScroll(i2 - iArr[0], i3 - iArr[1], iArr2, (int[]) null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        dispatchNestedScroll(i2, i3, i4, i5, this.k);
        int i6 = i5 + this.k[1];
        if (i6 < 0 && !d()) {
            float abs = this.g + ((float) Math.abs(i6));
            this.g = abs;
            p(abs);
        }
    }

    public void onNestedScrollAccepted(View view, View view2, int i2) {
        this.h.b(view, view2, i2);
        startNestedScroll(i2 & 2);
        this.g = 0.0f;
        this.l = true;
    }

    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return isEnabled() && !this.t && !this.f1878d && (i2 & 2) != 0;
    }

    public void onStopNestedScroll(View view) {
        this.h.d(view);
        this.l = false;
        float f2 = this.g;
        if (f2 > 0.0f) {
            g(f2);
            this.g = 0.0f;
        }
        stopNestedScroll();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.t && actionMasked == 0) {
            this.t = false;
        }
        if (!isEnabled() || this.t || d() || this.f1878d || this.l) {
            return false;
        }
        if (actionMasked == 0) {
            this.r = motionEvent.getPointerId(0);
            this.q = false;
        } else if (actionMasked == 1) {
            int findPointerIndex = motionEvent.findPointerIndex(this.r);
            if (findPointerIndex < 0) {
                Log.e(P, "Got ACTION_UP event but don't have an active pointer id.");
                return false;
            }
            if (this.q) {
                this.q = false;
                g((motionEvent.getY(findPointerIndex) - this.o) * 0.5f);
            }
            this.r = -1;
            return false;
        } else if (actionMasked == 2) {
            int findPointerIndex2 = motionEvent.findPointerIndex(this.r);
            if (findPointerIndex2 < 0) {
                Log.e(P, "Got ACTION_MOVE event but have an invalid active pointer id.");
                return false;
            }
            float y2 = motionEvent.getY(findPointerIndex2);
            v(y2);
            if (this.q) {
                float f2 = (y2 - this.o) * 0.5f;
                if (f2 <= 0.0f) {
                    return false;
                }
                p(f2);
            }
        } else if (actionMasked == 3) {
            return false;
        } else {
            if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex < 0) {
                    Log.e(P, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.r = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                r(motionEvent);
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void q(float f2) {
        int i2 = this.x;
        setTargetOffsetTopAndBottom((i2 + ((int) (((float) (this.z - i2)) * f2))) - this.v.getTop());
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        if (Build.VERSION.SDK_INT >= 21 || !(this.f1876b instanceof AbsListView)) {
            View view = this.f1876b;
            if (view == null || t.J(view)) {
                super.requestDisallowInterceptTouchEvent(z2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void s() {
        this.v.clearAnimation();
        this.C.stop();
        this.v.setVisibility(8);
        setColorViewAlpha(255);
        if (this.s) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.z - this.n);
        }
        this.n = this.v.getTop();
    }

    /* access modifiers changed from: package-private */
    public void setAnimationProgress(float f2) {
        this.v.setScaleX(f2);
        this.v.setScaleY(f2);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        f();
        this.C.f(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr2[i2] = androidx.core.content.a.d(context, iArr[i2]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i2) {
        this.f1880f = (float) i2;
    }

    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        if (!z2) {
            s();
        }
    }

    public void setNestedScrollingEnabled(boolean z2) {
        this.i.n(z2);
    }

    public void setOnChildScrollUpCallback(i iVar) {
        this.L = iVar;
    }

    public void setOnRefreshListener(j jVar) {
        this.f1877c = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i2) {
        setProgressBackgroundColorSchemeResource(i2);
    }

    public void setProgressBackgroundColorSchemeColor(int i2) {
        this.v.setBackgroundColor(i2);
    }

    public void setProgressBackgroundColorSchemeResource(int i2) {
        setProgressBackgroundColorSchemeColor(androidx.core.content.a.d(getContext(), i2));
    }

    public void setProgressViewEndTarget(boolean z2, int i2) {
        this.A = i2;
        this.s = z2;
        this.v.invalidate();
    }

    public void setProgressViewOffset(boolean z2, int i2, int i3) {
        this.s = z2;
        this.z = i2;
        this.A = i3;
        this.K = true;
        s();
        this.f1878d = false;
    }

    public void setRefreshing(boolean z2) {
        int i2;
        if (!z2 || this.f1878d == z2) {
            t(z2, false);
            return;
        }
        this.f1878d = z2;
        if (!this.K) {
            i2 = this.A + this.z;
        } else {
            i2 = this.A;
        }
        setTargetOffsetTopAndBottom(i2 - this.n);
        this.I = false;
        A(this.M);
    }

    public void setSize(int i2) {
        if (i2 == 0 || i2 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i2 == 0) {
                this.J = (int) (displayMetrics.density * 56.0f);
            } else {
                this.J = (int) (displayMetrics.density * 40.0f);
            }
            this.v.setImageDrawable((Drawable) null);
            this.C.l(i2);
            this.v.setImageDrawable(this.C);
        }
    }

    public void setSlingshotDistance(int i2) {
        this.B = i2;
    }

    /* access modifiers changed from: package-private */
    public void setTargetOffsetTopAndBottom(int i2) {
        this.v.bringToFront();
        t.O(this.v, i2);
        this.n = this.v.getTop();
    }

    public boolean startNestedScroll(int i2) {
        return this.i.p(i2);
    }

    public void stopNestedScroll() {
        this.i.r();
    }

    /* access modifiers changed from: package-private */
    public void y(Animation.AnimationListener animationListener) {
        c cVar = new c();
        this.E = cVar;
        cVar.setDuration(150);
        this.v.b(animationListener);
        this.v.clearAnimation();
        this.v.startAnimation(this.E);
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1878d = false;
        this.f1880f = -1.0f;
        this.j = new int[2];
        this.k = new int[2];
        this.r = -1;
        this.w = -1;
        this.M = new a();
        this.N = new f();
        this.O = new g();
        this.f1879e = ViewConfiguration.get(context).getScaledTouchSlop();
        this.m = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.u = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.J = (int) (displayMetrics.density * 40.0f);
        e();
        setChildrenDrawingOrderEnabled(true);
        int i2 = (int) (displayMetrics.density * 64.0f);
        this.A = i2;
        this.f1880f = (float) i2;
        this.h = new p(this);
        this.i = new l(this);
        setNestedScrollingEnabled(true);
        int i3 = -this.J;
        this.n = i3;
        this.z = i3;
        q(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Q);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }
}
