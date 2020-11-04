package androidx.core.widget;

import a.h.k.d0.d;
import a.h.k.d0.f;
import a.h.k.j;
import a.h.k.l;
import a.h.k.n;
import a.h.k.p;
import a.h.k.u;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.google.firebase.crashlytics.internal.proto.CodedOutputStream;
import java.util.ArrayList;

public class NestedScrollView extends FrameLayout implements n, j {
    private static final a B = new a();
    private static final int[] C = {16843130};
    private b A;

    /* renamed from: b  reason: collision with root package name */
    private long f1386b;

    /* renamed from: c  reason: collision with root package name */
    private final Rect f1387c;

    /* renamed from: d  reason: collision with root package name */
    private OverScroller f1388d;

    /* renamed from: e  reason: collision with root package name */
    private EdgeEffect f1389e;

    /* renamed from: f  reason: collision with root package name */
    private EdgeEffect f1390f;
    private int g;
    private boolean h;
    private boolean i;
    private View j;
    private boolean k;
    private VelocityTracker l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private int r;
    private final int[] s;
    private final int[] t;
    private int u;
    private int v;
    private SavedState w;
    private final p x;
    private final l y;
    private float z;

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        public int f1391b;

        static class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f1391b + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1391b);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f1391b = parcel.readInt();
        }
    }

    static class a extends a.h.k.a {
        a() {
        }

        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            f.a(accessibilityEvent, nestedScrollView.getScrollX());
            f.b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        public void g(View view, d dVar) {
            int scrollRange;
            super.g(view, dVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            dVar.Z(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                dVar.t0(true);
                if (nestedScrollView.getScrollY() > 0) {
                    dVar.a(8192);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    dVar.a(CodedOutputStream.DEFAULT_BUFFER_SIZE);
                }
            }
        }

        public boolean j(View view, int i, Bundle bundle) {
            if (super.j(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i == 4096) {
                int min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                if (min == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.N(0, min);
                return true;
            } else if (i != 8192) {
                return false;
            } else {
                int max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (max == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.N(0, max);
                return true;
            }
        }
    }

    public interface b {
        void a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    public NestedScrollView(Context context) {
        this(context, (AttributeSet) null);
    }

    private boolean A(View view) {
        return !C(view, 0, getHeight());
    }

    private static boolean B(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !B((View) parent, view2)) {
            return false;
        }
        return true;
    }

    private boolean C(View view, int i2, int i3) {
        view.getDrawingRect(this.f1387c);
        offsetDescendantRectToMyCoords(view, this.f1387c);
        return this.f1387c.bottom + i2 >= getScrollY() && this.f1387c.top - i2 <= getScrollY() + i3;
    }

    private void D(int i2, int i3, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i2);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.y.e(0, scrollY2, 0, i2 - scrollY2, (int[]) null, i3, iArr);
    }

    private void E(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.r) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.g = (int) motionEvent.getY(i2);
            this.r = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void H() {
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.l = null;
        }
    }

    private void I(boolean z2) {
        if (z2) {
            O(2, 1);
        } else {
            a(1);
        }
        this.v = getScrollY();
        u.T(this);
    }

    private boolean J(int i2, int i3, int i4) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = height + scrollY;
        boolean z2 = false;
        boolean z3 = i2 == 33;
        View s2 = s(z3, i3, i4);
        if (s2 == null) {
            s2 = this;
        }
        if (i3 < scrollY || i4 > i5) {
            o(z3 ? i3 - scrollY : i4 - i5);
            z2 = true;
        }
        if (s2 != findFocus()) {
            s2.requestFocus(i2);
        }
        return z2;
    }

    private void K(View view) {
        view.getDrawingRect(this.f1387c);
        offsetDescendantRectToMyCoords(view, this.f1387c);
        int f2 = f(this.f1387c);
        if (f2 != 0) {
            scrollBy(0, f2);
        }
    }

    private boolean L(Rect rect, boolean z2) {
        int f2 = f(rect);
        boolean z3 = f2 != 0;
        if (z3) {
            if (z2) {
                scrollBy(0, f2);
            } else {
                M(0, f2);
            }
        }
        return z3;
    }

    private void b() {
        this.f1388d.abortAnimation();
        a(1);
    }

    private boolean d() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
            return true;
        }
        return false;
    }

    private static int e(int i2, int i3, int i4) {
        if (i3 >= i4 || i2 < 0) {
            return 0;
        }
        return i3 + i2 > i4 ? i4 - i3 : i2;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.z = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.z;
    }

    private void o(int i2) {
        if (i2 == 0) {
            return;
        }
        if (this.n) {
            M(0, i2);
        } else {
            scrollBy(0, i2);
        }
    }

    private void p() {
        this.k = false;
        H();
        a(0);
        EdgeEffect edgeEffect = this.f1389e;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f1390f.onRelease();
        }
    }

    private void q() {
        if (getOverScrollMode() == 2) {
            this.f1389e = null;
            this.f1390f = null;
        } else if (this.f1389e == null) {
            Context context = getContext();
            this.f1389e = new EdgeEffect(context);
            this.f1390f = new EdgeEffect(context);
        }
    }

    private View s(boolean z2, int i2, int i3) {
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z3 = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = (View) focusables.get(i4);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 < bottom && top < i3) {
                boolean z4 = i2 < top && bottom < i3;
                if (view == null) {
                    view = view2;
                    z3 = z4;
                } else {
                    boolean z5 = (z2 && top < view.getTop()) || (!z2 && bottom > view.getBottom());
                    if (z3) {
                        if (z4) {
                            if (!z5) {
                            }
                        }
                    } else if (z4) {
                        view = view2;
                        z3 = true;
                    } else if (!z5) {
                    }
                    view = view2;
                }
            }
        }
        return view;
    }

    private boolean w(int i2, int i3) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        if (i3 < childAt.getTop() - scrollY || i3 >= childAt.getBottom() - scrollY || i2 < childAt.getLeft() || i2 >= childAt.getRight()) {
            return false;
        }
        return true;
    }

    private void x() {
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker == null) {
            this.l = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void y() {
        this.f1388d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.o = viewConfiguration.getScaledTouchSlop();
        this.p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.q = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void z() {
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0083 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean F(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
        /*
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L_0x0013
            r2 = 1
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = 0
        L_0x0021:
            if (r1 == 0) goto L_0x002a
            if (r1 != r5) goto L_0x0028
            if (r2 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r2 = 0
            goto L_0x002b
        L_0x002a:
            r2 = 1
        L_0x002b:
            if (r1 == 0) goto L_0x0034
            if (r1 != r5) goto L_0x0032
            if (r3 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r1 = 0
            goto L_0x0035
        L_0x0034:
            r1 = 1
        L_0x0035:
            int r3 = r15 + r13
            if (r2 != 0) goto L_0x003b
            r2 = 0
            goto L_0x003d
        L_0x003b:
            r2 = r19
        L_0x003d:
            int r6 = r16 + r14
            if (r1 != 0) goto L_0x0043
            r1 = 0
            goto L_0x0045
        L_0x0043:
            r1 = r20
        L_0x0045:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L_0x0050
            r3 = r2
        L_0x004e:
            r2 = 1
            goto L_0x0055
        L_0x0050:
            if (r3 >= r7) goto L_0x0054
            r3 = r7
            goto L_0x004e
        L_0x0054:
            r2 = 0
        L_0x0055:
            if (r6 <= r1) goto L_0x005a
            r6 = r1
        L_0x0058:
            r1 = 1
            goto L_0x005f
        L_0x005a:
            if (r6 >= r8) goto L_0x005e
            r6 = r8
            goto L_0x0058
        L_0x005e:
            r1 = 0
        L_0x005f:
            if (r1 == 0) goto L_0x007e
            boolean r7 = r12.v(r5)
            if (r7 != 0) goto L_0x007e
            android.widget.OverScroller r7 = r0.f1388d
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r7
            r14 = r3
            r15 = r6
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L_0x007e:
            r12.onOverScrolled(r3, r6, r2, r1)
            if (r2 != 0) goto L_0x0085
            if (r1 == 0) goto L_0x0086
        L_0x0085:
            r4 = 1
        L_0x0086:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.F(int, int, int, int, int, int, int, int, boolean):boolean");
    }

    public boolean G(int i2) {
        boolean z2 = i2 == 130;
        int height = getHeight();
        if (z2) {
            this.f1387c.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f1387c;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f1387c.top = getScrollY() - height;
            Rect rect2 = this.f1387c;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f1387c;
        int i3 = rect3.top;
        int i4 = height + i3;
        rect3.bottom = i4;
        return J(i2, i3, i4);
    }

    public final void M(int i2, int i3) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f1386b > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int scrollY = getScrollY();
                OverScroller overScroller = this.f1388d;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i3 + scrollY, Math.max(0, height - height2))) - scrollY);
                I(false);
            } else {
                if (!this.f1388d.isFinished()) {
                    b();
                }
                scrollBy(i2, i3);
            }
            this.f1386b = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    public final void N(int i2, int i3) {
        M(i2 - getScrollX(), i3 - getScrollY());
    }

    public boolean O(int i2, int i3) {
        return this.y.q(i2, i3);
    }

    public void a(int i2) {
        this.y.s(i2);
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public boolean c(int i2) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i2);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !C(findNextFocus, maxScrollAmount, getHeight())) {
            if (i2 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i2 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i2 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            o(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f1387c);
            offsetDescendantRectToMyCoords(findNextFocus, this.f1387c);
            o(f(this.f1387c));
            findNextFocus.requestFocus(i2);
        }
        if (findFocus == null || !findFocus.isFocused() || !A(findFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        if (!this.f1388d.isFinished()) {
            this.f1388d.computeScrollOffset();
            int currY = this.f1388d.getCurrY();
            int i2 = currY - this.v;
            this.v = currY;
            int[] iArr = this.t;
            boolean z2 = true;
            iArr[1] = 0;
            g(0, i2, iArr, (int[]) null, 1);
            int i3 = i2 - this.t[1];
            int scrollRange = getScrollRange();
            if (i3 != 0) {
                int scrollY = getScrollY();
                F(0, i3, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
                int scrollY2 = getScrollY() - scrollY;
                int i4 = i3 - scrollY2;
                int[] iArr2 = this.t;
                iArr2[1] = 0;
                n(0, scrollY2, 0, i4, this.s, 1, iArr2);
                i3 = i4 - this.t[1];
            }
            if (i3 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode != 0 && (overScrollMode != 1 || scrollRange <= 0)) {
                    z2 = false;
                }
                if (z2) {
                    q();
                    if (i3 < 0) {
                        if (this.f1389e.isFinished()) {
                            this.f1389e.onAbsorb((int) this.f1388d.getCurrVelocity());
                        }
                    } else if (this.f1390f.isFinished()) {
                        this.f1390f.onAbsorb((int) this.f1388d.getCurrVelocity());
                    }
                }
                b();
            }
            if (!this.f1388d.isFinished()) {
                u.T(this);
            }
        }
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || r(keyEvent);
    }

    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return this.y.a(f2, f3, z2);
    }

    public boolean dispatchNestedPreFling(float f2, float f3) {
        return this.y.b(f2, f3);
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return g(i2, i3, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.y.f(i2, i3, i4, i5, iArr);
    }

    public void draw(Canvas canvas) {
        int i2;
        super.draw(canvas);
        if (this.f1389e != null) {
            int scrollY = getScrollY();
            int i3 = 0;
            if (!this.f1389e.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                if (Build.VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    i2 = getPaddingLeft() + 0;
                } else {
                    i2 = 0;
                }
                if (Build.VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    min += getPaddingTop();
                }
                canvas.translate((float) i2, (float) min);
                this.f1389e.setSize(width, height);
                if (this.f1389e.draw(canvas)) {
                    u.T(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.f1390f.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int max = Math.max(getScrollRange(), scrollY) + height2;
                if (Build.VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width2 -= getPaddingLeft() + getPaddingRight();
                    i3 = 0 + getPaddingLeft();
                }
                if (Build.VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height2 -= getPaddingTop() + getPaddingBottom();
                    max -= getPaddingBottom();
                }
                canvas.translate((float) (i3 - width2), (float) max);
                canvas.rotate(180.0f, (float) width2, 0.0f);
                this.f1390f.setSize(width2, height2);
                if (this.f1390f.draw(canvas)) {
                    u.T(this);
                }
                canvas.restoreToCount(save2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public int f(Rect rect) {
        int i2;
        int i3;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i5 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i4 - verticalFadingEdgeLength : i4;
        if (rect.bottom > i5 && rect.top > scrollY) {
            if (rect.height() > height) {
                i3 = rect.top - scrollY;
            } else {
                i3 = rect.bottom - i5;
            }
            return Math.min(i3 + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i4);
        } else if (rect.top >= scrollY || rect.bottom >= i5) {
            return 0;
        } else {
            if (rect.height() > height) {
                i2 = 0 - (i5 - rect.bottom);
            } else {
                i2 = 0 - (scrollY - rect.top);
            }
            return Math.max(i2, -getScrollY());
        }
    }

    public boolean g(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return this.y.d(i2, i3, iArr, iArr2, i4);
    }

    /* access modifiers changed from: protected */
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        return this.x.a();
    }

    /* access modifiers changed from: package-private */
    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    /* access modifiers changed from: protected */
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public void h(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        D(i5, i6, iArr);
    }

    public boolean hasNestedScrollingParent() {
        return v(0);
    }

    public void i(View view, int i2, int i3, int i4, int i5, int i6) {
        D(i5, i6, (int[]) null);
    }

    public boolean isNestedScrollingEnabled() {
        return this.y.m();
    }

    public boolean j(View view, View view2, int i2, int i3) {
        return (i2 & 2) != 0;
    }

    public void k(View view, View view2, int i2, int i3) {
        this.x.c(view, view2, i2, i3);
        O(2, i3);
    }

    public void l(View view, int i2) {
        this.x.e(view, i2);
        a(i2);
    }

    public void m(View view, int i2, int i3, int[] iArr, int i4) {
        g(i2, i3, iArr, (int[]) null, i4);
    }

    /* access modifiers changed from: protected */
    public void measureChild(View view, int i2, int i3) {
        view.measure(FrameLayout.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* access modifiers changed from: protected */
    public void measureChildWithMargins(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public void n(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        this.y.e(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.i = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.k) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int verticalScrollFactorCompat = scrollY - ((int) (axisValue * getVerticalScrollFactorCompat()));
                if (verticalScrollFactorCompat < 0) {
                    scrollRange = 0;
                } else if (verticalScrollFactorCompat <= scrollRange) {
                    scrollRange = verticalScrollFactorCompat;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.k) {
            return true;
        }
        int i2 = action & 255;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    int i3 = this.r;
                    if (i3 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i3);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i3 + " in onInterceptTouchEvent");
                        } else {
                            int y2 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y2 - this.g) > this.o && (2 & getNestedScrollAxes()) == 0) {
                                this.k = true;
                                this.g = y2;
                                z();
                                this.l.addMovement(motionEvent);
                                this.u = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i2 != 3) {
                    if (i2 == 6) {
                        E(motionEvent);
                    }
                }
            }
            this.k = false;
            this.r = -1;
            H();
            if (this.f1388d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                u.T(this);
            }
            a(0);
        } else {
            int y3 = (int) motionEvent.getY();
            if (!w((int) motionEvent.getX(), y3)) {
                this.k = false;
                H();
            } else {
                this.g = y3;
                this.r = motionEvent.getPointerId(0);
                x();
                this.l.addMovement(motionEvent);
                this.f1388d.computeScrollOffset();
                this.k = !this.f1388d.isFinished();
                O(2, 0);
            }
        }
        return this.k;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        int i6 = 0;
        this.h = false;
        View view = this.j;
        if (view != null && B(view, this)) {
            K(this.j);
        }
        this.j = null;
        if (!this.i) {
            if (this.w != null) {
                scrollTo(getScrollX(), this.w.f1391b);
                this.w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i6 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int e2 = e(scrollY, paddingTop, i6);
            if (e2 != scrollY) {
                scrollTo(getScrollX(), e2);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.i = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.m && View.MeasureSpec.getMode(i3) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (z2) {
            return false;
        }
        dispatchNestedFling(0.0f, f3, true);
        t((int) f3);
        return true;
    }

    public boolean onNestedPreFling(View view, float f2, float f3) {
        return dispatchNestedPreFling(f2, f3);
    }

    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        m(view, i2, i3, iArr, 0);
    }

    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        D(i5, 0, (int[]) null);
    }

    public void onNestedScrollAccepted(View view, View view2, int i2) {
        k(view, view2, i2, 0);
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i2, int i3, boolean z2, boolean z3) {
        super.scrollTo(i2, i3);
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        View view;
        if (i2 == 2) {
            i2 = 130;
        } else if (i2 == 1) {
            i2 = 33;
        }
        if (rect == null) {
            view = FocusFinder.getInstance().findNextFocus(this, (View) null, i2);
        } else {
            view = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i2);
        }
        if (view != null && !A(view)) {
            return view.requestFocus(i2, rect);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.w = savedState;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1391b = getScrollY();
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        b bVar = this.A;
        if (bVar != null) {
            bVar.a(this, i2, i3, i4, i5);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && C(findFocus, 0, i5)) {
            findFocus.getDrawingRect(this.f1387c);
            offsetDescendantRectToMyCoords(findFocus, this.f1387c);
            o(f(this.f1387c));
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return j(view, view2, i2, 0);
    }

    public void onStopNestedScroll(View view) {
        l(view, 0);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        MotionEvent motionEvent2 = motionEvent;
        z();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.u = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(0.0f, (float) this.u);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.l;
                velocityTracker.computeCurrentVelocity(1000, (float) this.q);
                int yVelocity = (int) velocityTracker.getYVelocity(this.r);
                if (Math.abs(yVelocity) > this.p) {
                    int i2 = -yVelocity;
                    float f2 = (float) i2;
                    if (!dispatchNestedPreFling(0.0f, f2)) {
                        dispatchNestedFling(0.0f, f2, true);
                        t(i2);
                    }
                } else if (this.f1388d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    u.T(this);
                }
                this.r = -1;
                p();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent2.findPointerIndex(this.r);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.r + " in onTouchEvent");
                } else {
                    int y2 = (int) motionEvent2.getY(findPointerIndex);
                    int i3 = this.g - y2;
                    if (g(0, i3, this.t, this.s, 0)) {
                        i3 -= this.t[1];
                        this.u += this.s[1];
                    }
                    if (!this.k && Math.abs(i3) > this.o) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.k = true;
                        if (i3 > 0) {
                            i3 -= this.o;
                        } else {
                            i3 += this.o;
                        }
                    }
                    int i4 = i3;
                    if (this.k) {
                        this.g = y2 - this.s[1];
                        int scrollY = getScrollY();
                        int scrollRange = getScrollRange();
                        int overScrollMode = getOverScrollMode();
                        boolean z2 = overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0);
                        int i5 = scrollRange;
                        if (F(0, i4, 0, getScrollY(), 0, scrollRange, 0, 0, true) && !v(0)) {
                            this.l.clear();
                        }
                        int scrollY2 = getScrollY() - scrollY;
                        int[] iArr = this.t;
                        iArr[1] = 0;
                        n(0, scrollY2, 0, i4 - scrollY2, this.s, 0, iArr);
                        int i6 = this.g;
                        int[] iArr2 = this.s;
                        this.g = i6 - iArr2[1];
                        this.u += iArr2[1];
                        if (z2) {
                            int i7 = i4 - this.t[1];
                            q();
                            int i8 = scrollY + i7;
                            if (i8 < 0) {
                                d.a(this.f1389e, ((float) i7) / ((float) getHeight()), motionEvent2.getX(findPointerIndex) / ((float) getWidth()));
                                if (!this.f1390f.isFinished()) {
                                    this.f1390f.onRelease();
                                }
                            } else if (i8 > i5) {
                                d.a(this.f1390f, ((float) i7) / ((float) getHeight()), 1.0f - (motionEvent2.getX(findPointerIndex) / ((float) getWidth())));
                                if (!this.f1389e.isFinished()) {
                                    this.f1389e.onRelease();
                                }
                            }
                            EdgeEffect edgeEffect = this.f1389e;
                            if (edgeEffect != null && (!edgeEffect.isFinished() || !this.f1390f.isFinished())) {
                                u.T(this);
                            }
                        }
                    }
                }
            } else if (actionMasked == 3) {
                if (this.k && getChildCount() > 0 && this.f1388d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    u.T(this);
                }
                this.r = -1;
                p();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.g = (int) motionEvent2.getY(actionIndex);
                this.r = motionEvent2.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                E(motionEvent);
                this.g = (int) motionEvent2.getY(motionEvent2.findPointerIndex(this.r));
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            boolean z3 = !this.f1388d.isFinished();
            this.k = z3;
            if (z3 && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f1388d.isFinished()) {
                b();
            }
            this.g = (int) motionEvent.getY();
            this.r = motionEvent2.getPointerId(0);
            O(2, 0);
        }
        VelocityTracker velocityTracker2 = this.l;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public boolean r(KeyEvent keyEvent) {
        this.f1387c.setEmpty();
        int i2 = 130;
        if (!d()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) {
                return false;
            }
            return true;
        } else if (keyEvent.getAction() != 0) {
            return false;
        } else {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 19) {
                if (keyCode != 20) {
                    if (keyCode != 62) {
                        return false;
                    }
                    if (keyEvent.isShiftPressed()) {
                        i2 = 33;
                    }
                    G(i2);
                    return false;
                } else if (!keyEvent.isAltPressed()) {
                    return c(130);
                } else {
                    return u(130);
                }
            } else if (!keyEvent.isAltPressed()) {
                return c(33);
            } else {
                return u(33);
            }
        }
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.h) {
            K(view2);
        } else {
            this.j = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return L(rect, z2);
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        if (z2) {
            H();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    public void requestLayout() {
        this.h = true;
        super.requestLayout();
    }

    public void scrollTo(int i2, int i3) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int e2 = e(i2, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int e3 = e(i3, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (e2 != getScrollX() || e3 != getScrollY()) {
                super.scrollTo(e2, e3);
            }
        }
    }

    public void setFillViewport(boolean z2) {
        if (z2 != this.m) {
            this.m = z2;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z2) {
        this.y.n(z2);
    }

    public void setOnScrollChangeListener(b bVar) {
        this.A = bVar;
    }

    public void setSmoothScrollingEnabled(boolean z2) {
        this.n = z2;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i2) {
        return O(i2, 0);
    }

    public void stopNestedScroll() {
        a(0);
    }

    public void t(int i2) {
        if (getChildCount() > 0) {
            this.f1388d.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            I(true);
        }
    }

    public boolean u(int i2) {
        int childCount;
        boolean z2 = i2 == 130;
        int height = getHeight();
        Rect rect = this.f1387c;
        rect.top = 0;
        rect.bottom = height;
        if (z2 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f1387c.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f1387c;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f1387c;
        return J(i2, rect3.top, rect3.bottom);
    }

    public boolean v(int i2) {
        return this.y.l(i2);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f1387c = new Rect();
        this.h = true;
        this.i = false;
        this.j = null;
        this.k = false;
        this.n = true;
        this.r = -1;
        this.s = new int[2];
        this.t = new int[2];
        y();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C, i2, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.x = new p(this);
        this.y = new l(this);
        setNestedScrollingEnabled(true);
        u.Z(this, B);
    }

    public void addView(View view, int i2) {
        if (getChildCount() <= 0) {
            super.addView(view, i2);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
