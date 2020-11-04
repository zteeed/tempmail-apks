package androidx.viewpager.widget;

import a.h.k.b0;
import a.h.k.q;
import a.h.k.t;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.customview.view.AbsSavedState;
import com.google.firebase.crashlytics.internal.proto.CodedOutputStream;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ViewPager extends ViewGroup {
    static final int[] g0 = {16842931};
    private static final Comparator<f> h0 = new a();
    private static final Interpolator i0 = new b();
    private static final m j0 = new m();
    private int A;
    private int B;
    private int C;
    private float D;
    private float E;
    private float F;
    private float G;
    private int H = -1;
    private VelocityTracker I;
    private int J;
    private int K;
    private int L;
    private int M;
    private boolean N;
    private EdgeEffect O;
    private EdgeEffect P;
    private boolean Q = true;
    private boolean R;
    private int S;
    private List<j> T;
    private j U;
    private j V;
    private List<i> W;
    private k a0;

    /* renamed from: b  reason: collision with root package name */
    private int f1928b;
    private int b0;

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<f> f1929c = new ArrayList<>();
    private int c0;

    /* renamed from: d  reason: collision with root package name */
    private final f f1930d = new f();
    private ArrayList<View> d0;

    /* renamed from: e  reason: collision with root package name */
    private final Rect f1931e = new Rect();
    private final Runnable e0 = new c();

    /* renamed from: f  reason: collision with root package name */
    a f1932f;
    private int f0 = 0;
    int g;
    private int h = -1;
    private Parcelable i = null;
    private ClassLoader j = null;
    private Scroller k;
    private boolean l;
    private l m;
    private int n;
    private Drawable o;
    private int p;
    private int q;
    private float r = -3.4028235E38f;
    private float s = Float.MAX_VALUE;
    private int t;
    private boolean u;
    private boolean v;
    private boolean w;
    private int x = 1;
    private boolean y;
    private boolean z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        int f1933d;

        /* renamed from: e  reason: collision with root package name */
        Parcelable f1934e;

        /* renamed from: f  reason: collision with root package name */
        ClassLoader f1935f;

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

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f1933d + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1933d);
            parcel.writeParcelable(this.f1934e, i);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? SavedState.class.getClassLoader() : classLoader;
            this.f1933d = parcel.readInt();
            this.f1934e = parcel.readParcelable(classLoader);
            this.f1935f = classLoader;
        }
    }

    static class a implements Comparator<f> {
        a() {
        }

        /* renamed from: a */
        public int compare(f fVar, f fVar2) {
            return fVar.f1940b - fVar2.f1940b;
        }
    }

    static class b implements Interpolator {
        b() {
        }

        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.E();
        }
    }

    class d implements q {

        /* renamed from: a  reason: collision with root package name */
        private final Rect f1937a = new Rect();

        d() {
        }

        public b0 a(View view, b0 b0Var) {
            b0 P = t.P(view, b0Var);
            if (P.g()) {
                return P;
            }
            Rect rect = this.f1937a;
            rect.left = P.c();
            rect.top = P.e();
            rect.right = P.d();
            rect.bottom = P.b();
            int childCount = ViewPager.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                b0 e2 = t.e(ViewPager.this.getChildAt(i), P);
                rect.left = Math.min(e2.c(), rect.left);
                rect.top = Math.min(e2.e(), rect.top);
                rect.right = Math.min(e2.d(), rect.right);
                rect.bottom = Math.min(e2.b(), rect.bottom);
            }
            return P.h(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Inherited
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface e {
    }

    static class f {

        /* renamed from: a  reason: collision with root package name */
        Object f1939a;

        /* renamed from: b  reason: collision with root package name */
        int f1940b;

        /* renamed from: c  reason: collision with root package name */
        boolean f1941c;

        /* renamed from: d  reason: collision with root package name */
        float f1942d;

        /* renamed from: e  reason: collision with root package name */
        float f1943e;

        f() {
        }
    }

    class h extends a.h.k.a {
        h() {
        }

        private boolean n() {
            a aVar = ViewPager.this.f1932f;
            return aVar != null && aVar.e() > 1;
        }

        public void f(View view, AccessibilityEvent accessibilityEvent) {
            a aVar;
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(n());
            if (accessibilityEvent.getEventType() == 4096 && (aVar = ViewPager.this.f1932f) != null) {
                accessibilityEvent.setItemCount(aVar.e());
                accessibilityEvent.setFromIndex(ViewPager.this.g);
                accessibilityEvent.setToIndex(ViewPager.this.g);
            }
        }

        public void g(View view, a.h.k.c0.d dVar) {
            super.g(view, dVar);
            dVar.Z(ViewPager.class.getName());
            dVar.s0(n());
            if (ViewPager.this.canScrollHorizontally(1)) {
                dVar.a(CodedOutputStream.DEFAULT_BUFFER_SIZE);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                dVar.a(8192);
            }
        }

        public boolean j(View view, int i, Bundle bundle) {
            if (super.j(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.g - 1);
                return true;
            } else if (!ViewPager.this.canScrollHorizontally(1)) {
                return false;
            } else {
                ViewPager viewPager2 = ViewPager.this;
                viewPager2.setCurrentItem(viewPager2.g + 1);
                return true;
            }
        }
    }

    public interface i {
        void b(ViewPager viewPager, a aVar, a aVar2);
    }

    public interface j {
        void a(int i, float f2, int i2);

        void c(int i);

        void d(int i);
    }

    public interface k {
        void a(View view, float f2);
    }

    private class l extends DataSetObserver {
        l() {
        }

        public void onChanged() {
            ViewPager.this.h();
        }

        public void onInvalidated() {
            ViewPager.this.h();
        }
    }

    static class m implements Comparator<View> {
        m() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            g gVar = (g) view.getLayoutParams();
            g gVar2 = (g) view2.getLayoutParams();
            boolean z = gVar.f1944a;
            if (z != gVar2.f1944a) {
                return z ? 1 : -1;
            }
            return gVar.f1948e - gVar2.f1948e;
        }
    }

    public ViewPager(Context context) {
        super(context);
        v();
    }

    private boolean C(int i2) {
        if (this.f1929c.size() != 0) {
            f t2 = t();
            int clientWidth = getClientWidth();
            int i3 = this.n;
            int i4 = clientWidth + i3;
            float f2 = (float) clientWidth;
            int i5 = t2.f1940b;
            float f3 = ((((float) i2) / f2) - t2.f1943e) / (t2.f1942d + (((float) i3) / f2));
            this.R = false;
            y(i5, f3, (int) (((float) i4) * f3));
            if (this.R) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.Q) {
            return false;
        } else {
            this.R = false;
            y(0, 0.0f, 0);
            if (this.R) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    private boolean D(float f2) {
        boolean z2;
        boolean z3;
        float f3 = this.D - f2;
        this.D = f2;
        float scrollX = ((float) getScrollX()) + f3;
        float clientWidth = (float) getClientWidth();
        float f4 = this.r * clientWidth;
        float f5 = this.s * clientWidth;
        boolean z4 = false;
        f fVar = this.f1929c.get(0);
        ArrayList<f> arrayList = this.f1929c;
        f fVar2 = arrayList.get(arrayList.size() - 1);
        if (fVar.f1940b != 0) {
            f4 = fVar.f1943e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (fVar2.f1940b != this.f1932f.e() - 1) {
            f5 = fVar2.f1943e * clientWidth;
            z3 = false;
        } else {
            z3 = true;
        }
        if (scrollX < f4) {
            if (z2) {
                this.O.onPull(Math.abs(f4 - scrollX) / clientWidth);
                z4 = true;
            }
            scrollX = f4;
        } else if (scrollX > f5) {
            if (z3) {
                this.P.onPull(Math.abs(scrollX - f5) / clientWidth);
                z4 = true;
            }
            scrollX = f5;
        }
        int i2 = (int) scrollX;
        this.D += scrollX - ((float) i2);
        scrollTo(i2, getScrollY());
        C(i2);
        return z4;
    }

    private void G(int i2, int i3, int i4, int i5) {
        if (i3 <= 0 || this.f1929c.isEmpty()) {
            f u2 = u(this.g);
            int min = (int) ((u2 != null ? Math.min(u2.f1943e, this.s) : 0.0f) * ((float) ((i2 - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                g(false);
                scrollTo(min, getScrollY());
            }
        } else if (!this.k.isFinished()) {
            this.k.setFinalX(getCurrentItem() * getClientWidth());
        } else {
            scrollTo((int) ((((float) getScrollX()) / ((float) (((i3 - getPaddingLeft()) - getPaddingRight()) + i5))) * ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))), getScrollY());
        }
    }

    private void H() {
        int i2 = 0;
        while (i2 < getChildCount()) {
            if (!((g) getChildAt(i2).getLayoutParams()).f1944a) {
                removeViewAt(i2);
                i2--;
            }
            i2++;
        }
    }

    private void K(boolean z2) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z2);
        }
    }

    private boolean L() {
        this.H = -1;
        o();
        this.O.onRelease();
        this.P.onRelease();
        return this.O.isFinished() || this.P.isFinished();
    }

    private void M(int i2, boolean z2, int i3, boolean z3) {
        f u2 = u(i2);
        int clientWidth = u2 != null ? (int) (((float) getClientWidth()) * Math.max(this.r, Math.min(u2.f1943e, this.s))) : 0;
        if (z2) {
            Q(clientWidth, 0, i3);
            if (z3) {
                k(i2);
                return;
            }
            return;
        }
        if (z3) {
            k(i2);
        }
        g(false);
        scrollTo(clientWidth, 0);
        C(clientWidth);
    }

    private void R() {
        if (this.c0 != 0) {
            ArrayList<View> arrayList = this.d0;
            if (arrayList == null) {
                this.d0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                this.d0.add(getChildAt(i2));
            }
            Collections.sort(this.d0, j0);
        }
    }

    private void e(f fVar, int i2, f fVar2) {
        int i3;
        int i4;
        f fVar3;
        f fVar4;
        int e2 = this.f1932f.e();
        int clientWidth = getClientWidth();
        float f2 = clientWidth > 0 ? ((float) this.n) / ((float) clientWidth) : 0.0f;
        if (fVar2 != null) {
            int i5 = fVar2.f1940b;
            int i6 = fVar.f1940b;
            if (i5 < i6) {
                int i7 = 0;
                float f3 = fVar2.f1943e + fVar2.f1942d + f2;
                while (true) {
                    i5++;
                    if (i5 > fVar.f1940b || i7 >= this.f1929c.size()) {
                        break;
                    }
                    Object obj = this.f1929c.get(i7);
                    while (true) {
                        fVar4 = (f) obj;
                        if (i5 > fVar4.f1940b && i7 < this.f1929c.size() - 1) {
                            i7++;
                            obj = this.f1929c.get(i7);
                        }
                    }
                    while (i5 < fVar4.f1940b) {
                        f3 += this.f1932f.h(i5) + f2;
                        i5++;
                    }
                    fVar4.f1943e = f3;
                    f3 += fVar4.f1942d + f2;
                }
            } else if (i5 > i6) {
                int size = this.f1929c.size() - 1;
                float f4 = fVar2.f1943e;
                while (true) {
                    int i8 = i5 - 1;
                    if (i8 < fVar.f1940b || size < 0) {
                        break;
                    }
                    Object obj2 = this.f1929c.get(size);
                    while (true) {
                        fVar3 = (f) obj2;
                        if (i8 < fVar3.f1940b && size > 0) {
                            size--;
                            obj2 = this.f1929c.get(size);
                        }
                    }
                    while (i5 > fVar3.f1940b) {
                        f4 -= this.f1932f.h(i5) + f2;
                        i8 = i5 - 1;
                    }
                    f4 -= fVar3.f1942d + f2;
                    fVar3.f1943e = f4;
                }
            }
        }
        int size2 = this.f1929c.size();
        float f5 = fVar.f1943e;
        int i9 = fVar.f1940b;
        int i10 = i9 - 1;
        this.r = i9 == 0 ? f5 : -3.4028235E38f;
        int i11 = e2 - 1;
        this.s = fVar.f1940b == i11 ? (fVar.f1943e + fVar.f1942d) - 1.0f : Float.MAX_VALUE;
        int i12 = i2 - 1;
        while (i12 >= 0) {
            f fVar5 = this.f1929c.get(i12);
            while (true) {
                i4 = fVar5.f1940b;
                if (i10 <= i4) {
                    break;
                }
                f5 -= this.f1932f.h(i10) + f2;
                i10--;
            }
            f5 -= fVar5.f1942d + f2;
            fVar5.f1943e = f5;
            if (i4 == 0) {
                this.r = f5;
            }
            i12--;
            i10--;
        }
        float f6 = fVar.f1943e + fVar.f1942d + f2;
        int i13 = fVar.f1940b + 1;
        int i14 = i2 + 1;
        while (i14 < size2) {
            f fVar6 = this.f1929c.get(i14);
            while (true) {
                i3 = fVar6.f1940b;
                if (i13 >= i3) {
                    break;
                }
                f6 += this.f1932f.h(i13) + f2;
                i13++;
            }
            if (i3 == i11) {
                this.s = (fVar6.f1942d + f6) - 1.0f;
            }
            fVar6.f1943e = f6;
            f6 += fVar6.f1942d + f2;
            i14++;
            i13++;
        }
    }

    private void g(boolean z2) {
        boolean z3 = this.f0 == 2;
        if (z3) {
            setScrollingCacheEnabled(false);
            if (!this.k.isFinished()) {
                this.k.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.k.getCurrX();
                int currY = this.k.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        C(currX);
                    }
                }
            }
        }
        this.w = false;
        for (int i2 = 0; i2 < this.f1929c.size(); i2++) {
            f fVar = this.f1929c.get(i2);
            if (fVar.f1941c) {
                fVar.f1941c = false;
                z3 = true;
            }
        }
        if (!z3) {
            return;
        }
        if (z2) {
            t.V(this, this.e0);
        } else {
            this.e0.run();
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private int i(int i2, float f2, int i3, int i4) {
        if (Math.abs(i4) <= this.L || Math.abs(i3) <= this.J) {
            i2 += (int) (f2 + (i2 >= this.g ? 0.4f : 0.6f));
        } else if (i3 <= 0) {
            i2++;
        }
        if (this.f1929c.size() <= 0) {
            return i2;
        }
        ArrayList<f> arrayList = this.f1929c;
        return Math.max(this.f1929c.get(0).f1940b, Math.min(i2, arrayList.get(arrayList.size() - 1).f1940b));
    }

    private void j(int i2, float f2, int i3) {
        j jVar = this.U;
        if (jVar != null) {
            jVar.a(i2, f2, i3);
        }
        List<j> list = this.T;
        if (list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                j jVar2 = this.T.get(i4);
                if (jVar2 != null) {
                    jVar2.a(i2, f2, i3);
                }
            }
        }
        j jVar3 = this.V;
        if (jVar3 != null) {
            jVar3.a(i2, f2, i3);
        }
    }

    private void k(int i2) {
        j jVar = this.U;
        if (jVar != null) {
            jVar.d(i2);
        }
        List<j> list = this.T;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                j jVar2 = this.T.get(i3);
                if (jVar2 != null) {
                    jVar2.d(i2);
                }
            }
        }
        j jVar3 = this.V;
        if (jVar3 != null) {
            jVar3.d(i2);
        }
    }

    private void l(int i2) {
        j jVar = this.U;
        if (jVar != null) {
            jVar.c(i2);
        }
        List<j> list = this.T;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                j jVar2 = this.T.get(i3);
                if (jVar2 != null) {
                    jVar2.c(i2);
                }
            }
        }
        j jVar3 = this.V;
        if (jVar3 != null) {
            jVar3.c(i2);
        }
    }

    private void n(boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            getChildAt(i2).setLayerType(z2 ? this.b0 : 0, (Paint) null);
        }
    }

    private void o() {
        this.y = false;
        this.z = false;
        VelocityTracker velocityTracker = this.I;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.I = null;
        }
    }

    private Rect q(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private void setScrollingCacheEnabled(boolean z2) {
        if (this.v != z2) {
            this.v = z2;
        }
    }

    private f t() {
        int i2;
        int clientWidth = getClientWidth();
        float f2 = 0.0f;
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        float f3 = clientWidth > 0 ? ((float) this.n) / ((float) clientWidth) : 0.0f;
        f fVar = null;
        float f4 = 0.0f;
        int i3 = -1;
        int i4 = 0;
        boolean z2 = true;
        while (i4 < this.f1929c.size()) {
            f fVar2 = this.f1929c.get(i4);
            if (!z2 && fVar2.f1940b != (i2 = i3 + 1)) {
                fVar2 = this.f1930d;
                fVar2.f1943e = f2 + f4 + f3;
                fVar2.f1940b = i2;
                fVar2.f1942d = this.f1932f.h(i2);
                i4--;
            }
            f2 = fVar2.f1943e;
            float f5 = fVar2.f1942d + f2 + f3;
            if (!z2 && scrollX < f2) {
                return fVar;
            }
            if (scrollX < f5 || i4 == this.f1929c.size() - 1) {
                return fVar2;
            }
            i3 = fVar2.f1940b;
            f4 = fVar2.f1942d;
            i4++;
            fVar = fVar2;
            z2 = false;
        }
        return fVar;
    }

    private static boolean w(View view) {
        return view.getClass().getAnnotation(e.class) != null;
    }

    private boolean x(float f2, float f3) {
        return (f2 < ((float) this.B) && f3 > 0.0f) || (f2 > ((float) (getWidth() - this.B)) && f3 < 0.0f);
    }

    private void z(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.H) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.D = motionEvent.getX(i2);
            this.H = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.I;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean A() {
        int i2 = this.g;
        if (i2 <= 0) {
            return false;
        }
        setCurrentItem(i2 - 1, true);
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean B() {
        a aVar = this.f1932f;
        if (aVar == null || this.g >= aVar.e() - 1) {
            return false;
        }
        setCurrentItem(this.g + 1, true);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void E() {
        F(this.g);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0061, code lost:
        if (r9 == r10) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0067, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x014c, code lost:
        throw null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void F(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.g
            r3 = 0
            if (r2 == r1) goto L_0x0010
            androidx.viewpager.widget.ViewPager$f r2 = r0.u(r2)
            r0.g = r1
            goto L_0x0011
        L_0x0010:
            r2 = r3
        L_0x0011:
            androidx.viewpager.widget.a r1 = r0.f1932f
            if (r1 != 0) goto L_0x0019
            r17.R()
            return
        L_0x0019:
            boolean r1 = r0.w
            if (r1 == 0) goto L_0x0021
            r17.R()
            return
        L_0x0021:
            android.os.IBinder r1 = r17.getWindowToken()
            if (r1 != 0) goto L_0x0028
            return
        L_0x0028:
            androidx.viewpager.widget.a r1 = r0.f1932f
            r1.s(r0)
            int r1 = r0.x
            int r4 = r0.g
            int r4 = r4 - r1
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
            androidx.viewpager.widget.a r6 = r0.f1932f
            int r6 = r6.e()
            int r7 = r6 + -1
            int r8 = r0.g
            int r8 = r8 + r1
            int r1 = java.lang.Math.min(r7, r8)
            int r7 = r0.f1928b
            if (r6 != r7) goto L_0x01cd
            r7 = 0
        L_0x004b:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r8 = r0.f1929c
            int r8 = r8.size()
            if (r7 >= r8) goto L_0x0067
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r8 = r0.f1929c
            java.lang.Object r8 = r8.get(r7)
            androidx.viewpager.widget.ViewPager$f r8 = (androidx.viewpager.widget.ViewPager.f) r8
            int r9 = r8.f1940b
            int r10 = r0.g
            if (r9 < r10) goto L_0x0064
            if (r9 != r10) goto L_0x0067
            goto L_0x0068
        L_0x0064:
            int r7 = r7 + 1
            goto L_0x004b
        L_0x0067:
            r8 = r3
        L_0x0068:
            if (r8 != 0) goto L_0x0073
            if (r6 > 0) goto L_0x006d
            goto L_0x0073
        L_0x006d:
            int r1 = r0.g
            r0.a(r1, r7)
            throw r3
        L_0x0073:
            if (r8 == 0) goto L_0x0159
            int r10 = r7 + -1
            if (r10 < 0) goto L_0x0082
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r11 = r0.f1929c
            java.lang.Object r11 = r11.get(r10)
            androidx.viewpager.widget.ViewPager$f r11 = (androidx.viewpager.widget.ViewPager.f) r11
            goto L_0x0083
        L_0x0082:
            r11 = r3
        L_0x0083:
            int r12 = r17.getClientWidth()
            r13 = 1073741824(0x40000000, float:2.0)
            if (r12 > 0) goto L_0x008d
            r14 = 0
            goto L_0x0099
        L_0x008d:
            float r14 = r8.f1942d
            float r14 = r13 - r14
            int r15 = r17.getPaddingLeft()
            float r15 = (float) r15
            float r5 = (float) r12
            float r15 = r15 / r5
            float r14 = r14 + r15
        L_0x0099:
            int r5 = r0.g
            int r5 = r5 + -1
            r15 = 0
        L_0x009e:
            if (r5 < 0) goto L_0x00e0
            int r16 = (r15 > r14 ? 1 : (r15 == r14 ? 0 : -1))
            if (r16 < 0) goto L_0x00bf
            if (r5 >= r4) goto L_0x00bf
            if (r11 != 0) goto L_0x00a9
            goto L_0x00e0
        L_0x00a9:
            int r9 = r11.f1940b
            if (r5 != r9) goto L_0x00d7
            boolean r9 = r11.f1941c
            if (r9 == 0) goto L_0x00b2
            goto L_0x00d7
        L_0x00b2:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r1 = r0.f1929c
            r1.remove(r10)
            androidx.viewpager.widget.a r1 = r0.f1932f
            java.lang.Object r2 = r11.f1939a
            r1.b(r0, r5, r2)
            throw r3
        L_0x00bf:
            if (r11 == 0) goto L_0x00da
            int r9 = r11.f1940b
            if (r5 != r9) goto L_0x00da
            float r9 = r11.f1942d
            float r15 = r15 + r9
            int r10 = r10 + -1
            if (r10 < 0) goto L_0x00d5
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r9 = r0.f1929c
            java.lang.Object r9 = r9.get(r10)
            androidx.viewpager.widget.ViewPager$f r9 = (androidx.viewpager.widget.ViewPager.f) r9
            goto L_0x00d6
        L_0x00d5:
            r9 = r3
        L_0x00d6:
            r11 = r9
        L_0x00d7:
            int r5 = r5 + -1
            goto L_0x009e
        L_0x00da:
            int r10 = r10 + 1
            r0.a(r5, r10)
            throw r3
        L_0x00e0:
            float r4 = r8.f1942d
            int r5 = r7 + 1
            int r9 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r9 >= 0) goto L_0x014d
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r9 = r0.f1929c
            int r9 = r9.size()
            if (r5 >= r9) goto L_0x00f9
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r9 = r0.f1929c
            java.lang.Object r9 = r9.get(r5)
            androidx.viewpager.widget.ViewPager$f r9 = (androidx.viewpager.widget.ViewPager.f) r9
            goto L_0x00fa
        L_0x00f9:
            r9 = r3
        L_0x00fa:
            if (r12 > 0) goto L_0x00fe
            r10 = 0
            goto L_0x0106
        L_0x00fe:
            int r10 = r17.getPaddingRight()
            float r10 = (float) r10
            float r11 = (float) r12
            float r10 = r10 / r11
            float r10 = r10 + r13
        L_0x0106:
            int r11 = r0.g
        L_0x0108:
            int r11 = r11 + 1
            if (r11 >= r6) goto L_0x014d
            int r12 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r12 < 0) goto L_0x012b
            if (r11 <= r1) goto L_0x012b
            if (r9 != 0) goto L_0x0115
            goto L_0x014d
        L_0x0115:
            int r12 = r9.f1940b
            if (r11 != r12) goto L_0x0148
            boolean r12 = r9.f1941c
            if (r12 == 0) goto L_0x011e
            goto L_0x0148
        L_0x011e:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r1 = r0.f1929c
            r1.remove(r5)
            androidx.viewpager.widget.a r1 = r0.f1932f
            java.lang.Object r2 = r9.f1939a
            r1.b(r0, r11, r2)
            throw r3
        L_0x012b:
            if (r9 == 0) goto L_0x0149
            int r12 = r9.f1940b
            if (r11 != r12) goto L_0x0149
            float r9 = r9.f1942d
            float r4 = r4 + r9
            int r5 = r5 + 1
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r9 = r0.f1929c
            int r9 = r9.size()
            if (r5 >= r9) goto L_0x0147
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r9 = r0.f1929c
            java.lang.Object r9 = r9.get(r5)
            androidx.viewpager.widget.ViewPager$f r9 = (androidx.viewpager.widget.ViewPager.f) r9
            goto L_0x0148
        L_0x0147:
            r9 = r3
        L_0x0148:
            goto L_0x0108
        L_0x0149:
            r0.a(r11, r5)
            throw r3
        L_0x014d:
            r0.e(r8, r7, r2)
            androidx.viewpager.widget.a r1 = r0.f1932f
            int r2 = r0.g
            java.lang.Object r4 = r8.f1939a
            r1.p(r0, r2, r4)
        L_0x0159:
            androidx.viewpager.widget.a r1 = r0.f1932f
            r1.d(r0)
            int r1 = r17.getChildCount()
            r2 = 0
        L_0x0163:
            if (r2 >= r1) goto L_0x018f
            android.view.View r4 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r5 = (androidx.viewpager.widget.ViewPager.g) r5
            r5.f1949f = r2
            boolean r6 = r5.f1944a
            if (r6 != 0) goto L_0x018b
            float r6 = r5.f1946c
            r7 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x018c
            androidx.viewpager.widget.ViewPager$f r4 = r0.s(r4)
            if (r4 == 0) goto L_0x018c
            float r6 = r4.f1942d
            r5.f1946c = r6
            int r4 = r4.f1940b
            r5.f1948e = r4
            goto L_0x018c
        L_0x018b:
            r7 = 0
        L_0x018c:
            int r2 = r2 + 1
            goto L_0x0163
        L_0x018f:
            r17.R()
            boolean r1 = r17.hasFocus()
            if (r1 == 0) goto L_0x01cc
            android.view.View r1 = r17.findFocus()
            if (r1 == 0) goto L_0x01a2
            androidx.viewpager.widget.ViewPager$f r3 = r0.r(r1)
        L_0x01a2:
            if (r3 == 0) goto L_0x01aa
            int r1 = r3.f1940b
            int r2 = r0.g
            if (r1 == r2) goto L_0x01cc
        L_0x01aa:
            r5 = 0
        L_0x01ab:
            int r1 = r17.getChildCount()
            if (r5 >= r1) goto L_0x01cc
            android.view.View r1 = r0.getChildAt(r5)
            androidx.viewpager.widget.ViewPager$f r2 = r0.s(r1)
            if (r2 == 0) goto L_0x01c9
            int r2 = r2.f1940b
            int r3 = r0.g
            if (r2 != r3) goto L_0x01c9
            r2 = 2
            boolean r1 = r1.requestFocus(r2)
            if (r1 == 0) goto L_0x01c9
            goto L_0x01cc
        L_0x01c9:
            int r5 = r5 + 1
            goto L_0x01ab
        L_0x01cc:
            return
        L_0x01cd:
            android.content.res.Resources r1 = r17.getResources()     // Catch:{ NotFoundException -> 0x01da }
            int r2 = r17.getId()     // Catch:{ NotFoundException -> 0x01da }
            java.lang.String r1 = r1.getResourceName(r2)     // Catch:{ NotFoundException -> 0x01da }
            goto L_0x01e2
        L_0x01da:
            int r1 = r17.getId()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
        L_0x01e2:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            r3.append(r4)
            int r4 = r0.f1928b
            r3.append(r4)
            java.lang.String r4 = ", found: "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r4 = " Pager id: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " Pager class: "
            r3.append(r1)
            java.lang.Class<androidx.viewpager.widget.ViewPager> r1 = androidx.viewpager.widget.ViewPager.class
            r3.append(r1)
            java.lang.String r1 = " Problematic adapter: "
            r3.append(r1)
            androidx.viewpager.widget.a r1 = r0.f1932f
            java.lang.Class r1 = r1.getClass()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.F(int):void");
    }

    public void I(i iVar) {
        List<i> list = this.W;
        if (list != null) {
            list.remove(iVar);
        }
    }

    public void J(j jVar) {
        List<j> list = this.T;
        if (list != null) {
            list.remove(jVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void N(int i2, boolean z2, boolean z3) {
        O(i2, z2, z3, 0);
    }

    /* access modifiers changed from: package-private */
    public void O(int i2, boolean z2, boolean z3, int i3) {
        a aVar = this.f1932f;
        boolean z4 = false;
        if (aVar == null || aVar.e() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z3 || this.g != i2 || this.f1929c.size() == 0) {
            if (i2 < 0) {
                i2 = 0;
            } else if (i2 >= this.f1932f.e()) {
                i2 = this.f1932f.e() - 1;
            }
            int i4 = this.x;
            int i5 = this.g;
            if (i2 > i5 + i4 || i2 < i5 - i4) {
                for (int i6 = 0; i6 < this.f1929c.size(); i6++) {
                    this.f1929c.get(i6).f1941c = true;
                }
            }
            if (this.g != i2) {
                z4 = true;
            }
            if (this.Q) {
                this.g = i2;
                if (z4) {
                    k(i2);
                }
                requestLayout();
                return;
            }
            F(i2);
            M(i2, z2, i3, z4);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    /* access modifiers changed from: package-private */
    public j P(j jVar) {
        j jVar2 = this.V;
        this.V = jVar;
        return jVar2;
    }

    /* access modifiers changed from: package-private */
    public void Q(int i2, int i3, int i4) {
        int i5;
        int i6;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.k;
        if (scroller != null && !scroller.isFinished()) {
            i5 = this.l ? this.k.getCurrX() : this.k.getStartX();
            this.k.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            i5 = getScrollX();
        }
        int i7 = i5;
        int scrollY = getScrollY();
        int i8 = i2 - i7;
        int i9 = i3 - scrollY;
        if (i8 == 0 && i9 == 0) {
            g(false);
            E();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i10 = clientWidth / 2;
        float f2 = (float) clientWidth;
        float f3 = (float) i10;
        float m2 = f3 + (m(Math.min(1.0f, (((float) Math.abs(i8)) * 1.0f) / f2)) * f3);
        int abs = Math.abs(i4);
        if (abs > 0) {
            i6 = Math.round(Math.abs(m2 / ((float) abs)) * 1000.0f) * 4;
        } else {
            i6 = (int) (((((float) Math.abs(i8)) / ((f2 * this.f1932f.h(this.g)) + ((float) this.n))) + 1.0f) * 100.0f);
        }
        int min = Math.min(i6, 600);
        this.l = false;
        this.k.startScroll(i7, scrollY, i8, i9, min);
        t.T(this);
    }

    /* access modifiers changed from: package-private */
    public f a(int i2, int i3) {
        new f().f1940b = i2;
        this.f1932f.j(this, i2);
        throw null;
    }

    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        f s2;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (s2 = s(childAt)) != null && s2.f1940b == this.g) {
                    childAt.addFocusables(arrayList, i2, i3);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if (((i3 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) && arrayList != null) {
            arrayList.add(this);
        }
    }

    public void addTouchables(ArrayList<View> arrayList) {
        f s2;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (s2 = s(childAt)) != null && s2.f1940b == this.g) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        g gVar = (g) layoutParams;
        boolean w2 = gVar.f1944a | w(view);
        gVar.f1944a = w2;
        if (!this.u) {
            super.addView(view, i2, layoutParams);
        } else if (gVar == null || !w2) {
            gVar.f1947d = true;
            addViewInLayout(view, i2, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    public void b(i iVar) {
        if (this.W == null) {
            this.W = new ArrayList();
        }
        this.W.add(iVar);
    }

    public void c(j jVar) {
        if (this.T == null) {
            this.T = new ArrayList();
        }
        this.T.add(jVar);
    }

    public boolean canScrollHorizontally(int i2) {
        if (this.f1932f == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i2 < 0) {
            if (scrollX > ((int) (((float) clientWidth) * this.r))) {
                return true;
            }
            return false;
        } else if (i2 <= 0 || scrollX >= ((int) (((float) clientWidth) * this.s))) {
            return false;
        } else {
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        this.l = true;
        if (this.k.isFinished() || !this.k.computeScrollOffset()) {
            g(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.k.getCurrX();
        int currY = this.k.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!C(currX)) {
                this.k.abortAnimation();
                scrollTo(0, currY);
            }
        }
        t.T(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean d(int r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.findFocus()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != r6) goto L_0x000b
        L_0x0009:
            r0 = r3
            goto L_0x0069
        L_0x000b:
            if (r0 == 0) goto L_0x0069
            android.view.ViewParent r4 = r0.getParent()
        L_0x0011:
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x001e
            if (r4 != r6) goto L_0x0019
            r4 = 1
            goto L_0x001f
        L_0x0019:
            android.view.ViewParent r4 = r4.getParent()
            goto L_0x0011
        L_0x001e:
            r4 = 0
        L_0x001f:
            if (r4 != 0) goto L_0x0069
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
        L_0x0035:
            boolean r5 = r0 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x004e
            java.lang.String r5 = " => "
            r4.append(r5)
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x0035
        L_0x004e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.append(r5)
            java.lang.String r4 = r4.toString()
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "ViewPager"
            android.util.Log.e(r4, r0)
            goto L_0x0009
        L_0x0069:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r6, r0, r7)
            r4 = 66
            r5 = 17
            if (r3 == 0) goto L_0x00ba
            if (r3 == r0) goto L_0x00ba
            if (r7 != r5) goto L_0x009a
            android.graphics.Rect r1 = r6.f1931e
            android.graphics.Rect r1 = r6.q(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f1931e
            android.graphics.Rect r2 = r6.q(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L_0x0094
            if (r1 < r2) goto L_0x0094
            boolean r0 = r6.A()
            goto L_0x0098
        L_0x0094:
            boolean r0 = r3.requestFocus()
        L_0x0098:
            r2 = r0
            goto L_0x00cd
        L_0x009a:
            if (r7 != r4) goto L_0x00cd
            android.graphics.Rect r1 = r6.f1931e
            android.graphics.Rect r1 = r6.q(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f1931e
            android.graphics.Rect r2 = r6.q(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L_0x00b5
            if (r1 > r2) goto L_0x00b5
            boolean r0 = r6.B()
            goto L_0x0098
        L_0x00b5:
            boolean r0 = r3.requestFocus()
            goto L_0x0098
        L_0x00ba:
            if (r7 == r5) goto L_0x00c9
            if (r7 != r1) goto L_0x00bf
            goto L_0x00c9
        L_0x00bf:
            if (r7 == r4) goto L_0x00c4
            r0 = 2
            if (r7 != r0) goto L_0x00cd
        L_0x00c4:
            boolean r2 = r6.B()
            goto L_0x00cd
        L_0x00c9:
            boolean r2 = r6.A()
        L_0x00cd:
            if (r2 == 0) goto L_0x00d6
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        L_0x00d6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.d(int):boolean");
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || p(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        f s2;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (s2 = s(childAt)) != null && s2.f1940b == this.g && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public void draw(Canvas canvas) {
        a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z2 = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.f1932f) != null && aVar.e() > 1)) {
            if (!this.O.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-height) + getPaddingTop()), this.r * ((float) width));
                this.O.setSize(height, width);
                z2 = false | this.O.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.P.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.s + 1.0f)) * ((float) width2));
                this.P.setSize(height2, width2);
                z2 |= this.P.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.O.finish();
            this.P.finish();
        }
        if (z2) {
            t.T(this);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.o;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* access modifiers changed from: protected */
    public boolean f(View view, boolean z2, int i2, int i3, int i4) {
        int i5;
        View view2 = view;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom()) {
                    if (f(childAt, true, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        if (!z2 || !view.canScrollHorizontally(-i2)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public a getAdapter() {
        return this.f1932f;
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i2, int i3) {
        if (this.c0 == 2) {
            i3 = (i2 - 1) - i3;
        }
        return ((g) this.d0.get(i3).getLayoutParams()).f1949f;
    }

    public int getCurrentItem() {
        return this.g;
    }

    public int getOffscreenPageLimit() {
        return this.x;
    }

    public int getPageMargin() {
        return this.n;
    }

    /* access modifiers changed from: package-private */
    public void h() {
        int e2 = this.f1932f.e();
        this.f1928b = e2;
        boolean z2 = this.f1929c.size() < (this.x * 2) + 1 && this.f1929c.size() < e2;
        int i2 = this.g;
        for (int i3 = 0; i3 < this.f1929c.size(); i3++) {
            f fVar = this.f1929c.get(i3);
            int f2 = this.f1932f.f(fVar.f1939a);
            if (f2 != -1) {
                if (f2 == -2) {
                    this.f1929c.remove(i3);
                    this.f1932f.s(this);
                    this.f1932f.b(this, fVar.f1940b, fVar.f1939a);
                    throw null;
                }
                int i4 = fVar.f1940b;
                if (i4 != f2) {
                    if (i4 == this.g) {
                        i2 = f2;
                    }
                    fVar.f1940b = f2;
                    z2 = true;
                }
            }
        }
        Collections.sort(this.f1929c, h0);
        if (z2) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                g gVar = (g) getChildAt(i5).getLayoutParams();
                if (!gVar.f1944a) {
                    gVar.f1946c = 0.0f;
                }
            }
            N(i2, false, true);
            requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public float m(float f2) {
        return (float) Math.sin((double) ((f2 - 0.5f) * 0.47123894f));
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Q = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.e0);
        Scroller scroller = this.k;
        if (scroller != null && !scroller.isFinished()) {
            this.k.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f2;
        float f3;
        super.onDraw(canvas);
        if (this.n > 0 && this.o != null && this.f1929c.size() > 0 && this.f1932f != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f4 = (float) width;
            float f5 = ((float) this.n) / f4;
            int i2 = 0;
            f fVar = this.f1929c.get(0);
            float f6 = fVar.f1943e;
            int size = this.f1929c.size();
            int i3 = fVar.f1940b;
            int i4 = this.f1929c.get(size - 1).f1940b;
            while (i3 < i4) {
                while (i3 > fVar.f1940b && i2 < size) {
                    i2++;
                    fVar = this.f1929c.get(i2);
                }
                if (i3 == fVar.f1940b) {
                    float f7 = fVar.f1943e;
                    float f8 = fVar.f1942d;
                    f2 = (f7 + f8) * f4;
                    f6 = f7 + f8 + f5;
                } else {
                    float h2 = this.f1932f.h(i3);
                    f2 = (f6 + h2) * f4;
                    f6 += h2 + f5;
                }
                if (((float) this.n) + f2 > ((float) scrollX)) {
                    f3 = f5;
                    this.o.setBounds(Math.round(f2), this.p, Math.round(((float) this.n) + f2), this.q);
                    this.o.draw(canvas);
                } else {
                    Canvas canvas2 = canvas;
                    f3 = f5;
                }
                if (f2 <= ((float) (scrollX + width))) {
                    i3++;
                    f5 = f3;
                } else {
                    return;
                }
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            L();
            return false;
        }
        if (action != 0) {
            if (this.y) {
                return true;
            }
            if (this.z) {
                return false;
            }
        }
        if (action == 0) {
            float x2 = motionEvent.getX();
            this.F = x2;
            this.D = x2;
            float y2 = motionEvent.getY();
            this.G = y2;
            this.E = y2;
            this.H = motionEvent2.getPointerId(0);
            this.z = false;
            this.l = true;
            this.k.computeScrollOffset();
            if (this.f0 != 2 || Math.abs(this.k.getFinalX() - this.k.getCurrX()) <= this.M) {
                g(false);
                this.y = false;
            } else {
                this.k.abortAnimation();
                this.w = false;
                E();
                this.y = true;
                K(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i2 = this.H;
            if (i2 != -1) {
                int findPointerIndex = motionEvent2.findPointerIndex(i2);
                float x3 = motionEvent2.getX(findPointerIndex);
                float f2 = x3 - this.D;
                float abs = Math.abs(f2);
                float y3 = motionEvent2.getY(findPointerIndex);
                float abs2 = Math.abs(y3 - this.G);
                int i3 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
                if (i3 != 0 && !x(this.D, f2)) {
                    if (f(this, false, (int) f2, (int) x3, (int) y3)) {
                        this.D = x3;
                        this.E = y3;
                        this.z = true;
                        return false;
                    }
                }
                if (abs > ((float) this.C) && abs * 0.5f > abs2) {
                    this.y = true;
                    K(true);
                    setScrollState(1);
                    float f3 = this.F;
                    float f4 = (float) this.C;
                    this.D = i3 > 0 ? f3 + f4 : f3 - f4;
                    this.E = y3;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > ((float) this.C)) {
                    this.z = true;
                }
                if (this.y && D(x3)) {
                    t.T(this);
                }
            }
        } else if (action == 6) {
            z(motionEvent);
        }
        if (this.I == null) {
            this.I = VelocityTracker.obtain();
        }
        this.I.addMovement(motionEvent2);
        return this.y;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r18.getChildCount()
            int r2 = r22 - r20
            int r3 = r23 - r21
            int r4 = r18.getPaddingLeft()
            int r5 = r18.getPaddingTop()
            int r6 = r18.getPaddingRight()
            int r7 = r18.getPaddingBottom()
            int r8 = r18.getScrollX()
            r10 = 0
            r11 = 0
        L_0x0020:
            r12 = 8
            if (r10 >= r1) goto L_0x00b6
            android.view.View r13 = r0.getChildAt(r10)
            int r14 = r13.getVisibility()
            if (r14 == r12) goto L_0x00b2
            android.view.ViewGroup$LayoutParams r12 = r13.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r12 = (androidx.viewpager.widget.ViewPager.g) r12
            boolean r14 = r12.f1944a
            if (r14 == 0) goto L_0x00b2
            int r12 = r12.f1945b
            r14 = r12 & 7
            r12 = r12 & 112(0x70, float:1.57E-43)
            r15 = 1
            if (r14 == r15) goto L_0x005c
            r15 = 3
            if (r14 == r15) goto L_0x0056
            r15 = 5
            if (r14 == r15) goto L_0x0049
            r14 = r4
            goto L_0x006d
        L_0x0049:
            int r14 = r2 - r6
            int r15 = r13.getMeasuredWidth()
            int r14 = r14 - r15
            int r15 = r13.getMeasuredWidth()
            int r6 = r6 + r15
            goto L_0x0068
        L_0x0056:
            int r14 = r13.getMeasuredWidth()
            int r14 = r14 + r4
            goto L_0x006d
        L_0x005c:
            int r14 = r13.getMeasuredWidth()
            int r14 = r2 - r14
            int r14 = r14 / 2
            int r14 = java.lang.Math.max(r14, r4)
        L_0x0068:
            r17 = r14
            r14 = r4
            r4 = r17
        L_0x006d:
            r15 = 16
            if (r12 == r15) goto L_0x008e
            r15 = 48
            if (r12 == r15) goto L_0x0088
            r15 = 80
            if (r12 == r15) goto L_0x007b
            r12 = r5
            goto L_0x009f
        L_0x007b:
            int r12 = r3 - r7
            int r15 = r13.getMeasuredHeight()
            int r12 = r12 - r15
            int r15 = r13.getMeasuredHeight()
            int r7 = r7 + r15
            goto L_0x009a
        L_0x0088:
            int r12 = r13.getMeasuredHeight()
            int r12 = r12 + r5
            goto L_0x009f
        L_0x008e:
            int r12 = r13.getMeasuredHeight()
            int r12 = r3 - r12
            int r12 = r12 / 2
            int r12 = java.lang.Math.max(r12, r5)
        L_0x009a:
            r17 = r12
            r12 = r5
            r5 = r17
        L_0x009f:
            int r4 = r4 + r8
            int r15 = r13.getMeasuredWidth()
            int r15 = r15 + r4
            int r16 = r13.getMeasuredHeight()
            int r9 = r5 + r16
            r13.layout(r4, r5, r15, r9)
            int r11 = r11 + 1
            r5 = r12
            r4 = r14
        L_0x00b2:
            int r10 = r10 + 1
            goto L_0x0020
        L_0x00b6:
            int r2 = r2 - r4
            int r2 = r2 - r6
            r6 = 0
        L_0x00b9:
            if (r6 >= r1) goto L_0x0108
            android.view.View r8 = r0.getChildAt(r6)
            int r9 = r8.getVisibility()
            if (r9 == r12) goto L_0x0105
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r9 = (androidx.viewpager.widget.ViewPager.g) r9
            boolean r10 = r9.f1944a
            if (r10 != 0) goto L_0x0105
            androidx.viewpager.widget.ViewPager$f r10 = r0.s(r8)
            if (r10 == 0) goto L_0x0105
            float r13 = (float) r2
            float r10 = r10.f1943e
            float r10 = r10 * r13
            int r10 = (int) r10
            int r10 = r10 + r4
            boolean r14 = r9.f1947d
            if (r14 == 0) goto L_0x00f8
            r14 = 0
            r9.f1947d = r14
            float r9 = r9.f1946c
            float r13 = r13 * r9
            int r9 = (int) r13
            r13 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r13)
            int r14 = r3 - r5
            int r14 = r14 - r7
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r13)
            r8.measure(r9, r13)
        L_0x00f8:
            int r9 = r8.getMeasuredWidth()
            int r9 = r9 + r10
            int r13 = r8.getMeasuredHeight()
            int r13 = r13 + r5
            r8.layout(r10, r5, r9, r13)
        L_0x0105:
            int r6 = r6 + 1
            goto L_0x00b9
        L_0x0108:
            r0.p = r5
            int r3 = r3 - r7
            r0.q = r3
            r0.S = r11
            boolean r1 = r0.Q
            if (r1 == 0) goto L_0x011a
            int r1 = r0.g
            r2 = 0
            r0.M(r1, r2, r2, r2)
            goto L_0x011b
        L_0x011a:
            r2 = 0
        L_0x011b:
            r0.Q = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r14, int r15) {
        /*
            r13 = this;
            r0 = 0
            int r14 = android.view.ViewGroup.getDefaultSize(r0, r14)
            int r15 = android.view.ViewGroup.getDefaultSize(r0, r15)
            r13.setMeasuredDimension(r14, r15)
            int r14 = r13.getMeasuredWidth()
            int r15 = r14 / 10
            int r1 = r13.A
            int r15 = java.lang.Math.min(r15, r1)
            r13.B = r15
            int r15 = r13.getPaddingLeft()
            int r14 = r14 - r15
            int r15 = r13.getPaddingRight()
            int r14 = r14 - r15
            int r15 = r13.getMeasuredHeight()
            int r1 = r13.getPaddingTop()
            int r15 = r15 - r1
            int r1 = r13.getPaddingBottom()
            int r15 = r15 - r1
            int r1 = r13.getChildCount()
            r2 = 0
        L_0x0037:
            r3 = 8
            r4 = 1
            r5 = 1073741824(0x40000000, float:2.0)
            if (r2 >= r1) goto L_0x00b2
            android.view.View r6 = r13.getChildAt(r2)
            int r7 = r6.getVisibility()
            if (r7 == r3) goto L_0x00af
            android.view.ViewGroup$LayoutParams r3 = r6.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r3 = (androidx.viewpager.widget.ViewPager.g) r3
            if (r3 == 0) goto L_0x00af
            boolean r7 = r3.f1944a
            if (r7 == 0) goto L_0x00af
            int r7 = r3.f1945b
            r8 = r7 & 7
            r7 = r7 & 112(0x70, float:1.57E-43)
            r9 = 48
            if (r7 == r9) goto L_0x0065
            r9 = 80
            if (r7 != r9) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            r7 = 0
            goto L_0x0066
        L_0x0065:
            r7 = 1
        L_0x0066:
            r9 = 3
            if (r8 == r9) goto L_0x006e
            r9 = 5
            if (r8 != r9) goto L_0x006d
            goto L_0x006e
        L_0x006d:
            r4 = 0
        L_0x006e:
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 == 0) goto L_0x0075
            r8 = 1073741824(0x40000000, float:2.0)
            goto L_0x007a
        L_0x0075:
            if (r4 == 0) goto L_0x007a
            r9 = 1073741824(0x40000000, float:2.0)
            goto L_0x007c
        L_0x007a:
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x007c:
            int r10 = r3.width
            r11 = -1
            r12 = -2
            if (r10 == r12) goto L_0x0089
            if (r10 == r11) goto L_0x0085
            goto L_0x0086
        L_0x0085:
            r10 = r14
        L_0x0086:
            r8 = 1073741824(0x40000000, float:2.0)
            goto L_0x008a
        L_0x0089:
            r10 = r14
        L_0x008a:
            int r3 = r3.height
            if (r3 == r12) goto L_0x0093
            if (r3 == r11) goto L_0x0091
            goto L_0x0095
        L_0x0091:
            r3 = r15
            goto L_0x0095
        L_0x0093:
            r3 = r15
            r5 = r9
        L_0x0095:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r8)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r5)
            r6.measure(r8, r3)
            if (r7 == 0) goto L_0x00a8
            int r3 = r6.getMeasuredHeight()
            int r15 = r15 - r3
            goto L_0x00af
        L_0x00a8:
            if (r4 == 0) goto L_0x00af
            int r3 = r6.getMeasuredWidth()
            int r14 = r14 - r3
        L_0x00af:
            int r2 = r2 + 1
            goto L_0x0037
        L_0x00b2:
            android.view.View.MeasureSpec.makeMeasureSpec(r14, r5)
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r5)
            r13.t = r15
            r13.u = r4
            r13.E()
            r13.u = r0
            int r15 = r13.getChildCount()
        L_0x00c6:
            if (r0 >= r15) goto L_0x00f0
            android.view.View r1 = r13.getChildAt(r0)
            int r2 = r1.getVisibility()
            if (r2 == r3) goto L_0x00ed
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r2 = (androidx.viewpager.widget.ViewPager.g) r2
            if (r2 == 0) goto L_0x00de
            boolean r4 = r2.f1944a
            if (r4 != 0) goto L_0x00ed
        L_0x00de:
            float r4 = (float) r14
            float r2 = r2.f1946c
            float r4 = r4 * r2
            int r2 = (int) r4
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r5)
            int r4 = r13.t
            r1.measure(r2, r4)
        L_0x00ed:
            int r0 = r0 + 1
            goto L_0x00c6
        L_0x00f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        int i4;
        f s2;
        int childCount = getChildCount();
        int i5 = -1;
        if ((i2 & 2) != 0) {
            i5 = childCount;
            i4 = 0;
            i3 = 1;
        } else {
            i4 = childCount - 1;
            i3 = -1;
        }
        while (i4 != i5) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() == 0 && (s2 = s(childAt)) != null && s2.f1940b == this.g && childAt.requestFocus(i2, rect)) {
                return true;
            }
            i4 += i3;
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        a aVar = this.f1932f;
        if (aVar != null) {
            aVar.m(savedState.f1934e, savedState.f1935f);
            N(savedState.f1933d, false, true);
            return;
        }
        this.h = savedState.f1933d;
        this.i = savedState.f1934e;
        this.j = savedState.f1935f;
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1933d = this.g;
        a aVar = this.f1932f;
        if (aVar != null) {
            savedState.f1934e = aVar.n();
        }
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            int i6 = this.n;
            G(i2, i4, i6, i6);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (this.N) {
            return true;
        }
        boolean z2 = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.f1932f) == null || aVar.e() == 0) {
            return false;
        }
        if (this.I == null) {
            this.I = VelocityTracker.obtain();
        }
        this.I.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.k.abortAnimation();
            this.w = false;
            E();
            float x2 = motionEvent.getX();
            this.F = x2;
            this.D = x2;
            float y2 = motionEvent.getY();
            this.G = y2;
            this.E = y2;
            this.H = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.y) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.H);
                    if (findPointerIndex == -1) {
                        z2 = L();
                    } else {
                        float x3 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x3 - this.D);
                        float y3 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y3 - this.E);
                        if (abs > ((float) this.C) && abs > abs2) {
                            this.y = true;
                            K(true);
                            float f2 = this.F;
                            this.D = x3 - f2 > 0.0f ? f2 + ((float) this.C) : f2 - ((float) this.C);
                            this.E = y3;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.y) {
                    z2 = false | D(motionEvent.getX(motionEvent.findPointerIndex(this.H)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.D = motionEvent.getX(actionIndex);
                    this.H = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    z(motionEvent);
                    this.D = motionEvent.getX(motionEvent.findPointerIndex(this.H));
                }
            } else if (this.y) {
                M(this.g, true, 0, false);
                z2 = L();
            }
        } else if (this.y) {
            VelocityTracker velocityTracker = this.I;
            velocityTracker.computeCurrentVelocity(1000, (float) this.K);
            int xVelocity = (int) velocityTracker.getXVelocity(this.H);
            this.w = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            f t2 = t();
            float f3 = (float) clientWidth;
            O(i(t2.f1940b, ((((float) scrollX) / f3) - t2.f1943e) / (t2.f1942d + (((float) this.n) / f3)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.H)) - this.F)), true, true, xVelocity);
            z2 = L();
        }
        if (z2) {
            t.T(this);
        }
        return true;
    }

    public boolean p(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return d(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return d(1);
                        }
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    return B();
                } else {
                    return d(66);
                }
            } else if (keyEvent.hasModifiers(2)) {
                return A();
            } else {
                return d(17);
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public f r(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return s(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    public void removeView(View view) {
        if (this.u) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* access modifiers changed from: package-private */
    public f s(View view) {
        for (int i2 = 0; i2 < this.f1929c.size(); i2++) {
            f fVar = this.f1929c.get(i2);
            if (this.f1932f.k(view, fVar.f1939a)) {
                return fVar;
            }
        }
        return null;
    }

    public void setAdapter(a aVar) {
        a aVar2 = this.f1932f;
        if (aVar2 != null) {
            aVar2.q((DataSetObserver) null);
            this.f1932f.s(this);
            if (this.f1929c.size() <= 0) {
                this.f1932f.d(this);
                this.f1929c.clear();
                H();
                this.g = 0;
                scrollTo(0, 0);
            } else {
                f fVar = this.f1929c.get(0);
                this.f1932f.b(this, fVar.f1940b, fVar.f1939a);
                throw null;
            }
        }
        a aVar3 = this.f1932f;
        this.f1932f = aVar;
        this.f1928b = 0;
        if (aVar != null) {
            if (this.m == null) {
                this.m = new l();
            }
            this.f1932f.q(this.m);
            this.w = false;
            boolean z2 = this.Q;
            this.Q = true;
            this.f1928b = this.f1932f.e();
            if (this.h >= 0) {
                this.f1932f.m(this.i, this.j);
                N(this.h, false, true);
                this.h = -1;
                this.i = null;
                this.j = null;
            } else if (!z2) {
                E();
            } else {
                requestLayout();
            }
        }
        List<i> list = this.W;
        if (list != null && !list.isEmpty()) {
            int size = this.W.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.W.get(i2).b(this, aVar3, aVar);
            }
        }
    }

    public void setCurrentItem(int i2) {
        this.w = false;
        N(i2, !this.Q, false);
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i2 + " too small; defaulting to " + 1);
            i2 = 1;
        }
        if (i2 != this.x) {
            this.x = i2;
            E();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(j jVar) {
        this.U = jVar;
    }

    public void setPageMargin(int i2) {
        int i3 = this.n;
        this.n = i2;
        int width = getWidth();
        G(width, width, i2, i3);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.o = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageTransformer(boolean z2, k kVar) {
        setPageTransformer(z2, kVar, 2);
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i2) {
        if (this.f0 != i2) {
            this.f0 = i2;
            if (this.a0 != null) {
                n(i2 != 0);
            }
            l(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public f u(int i2) {
        for (int i3 = 0; i3 < this.f1929c.size(); i3++) {
            f fVar = this.f1929c.get(i3);
            if (fVar.f1940b == i2) {
                return fVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void v() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.k = new Scroller(context, i0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.C = viewConfiguration.getScaledPagingTouchSlop();
        this.J = (int) (400.0f * f2);
        this.K = viewConfiguration.getScaledMaximumFlingVelocity();
        this.O = new EdgeEffect(context);
        this.P = new EdgeEffect(context);
        this.L = (int) (25.0f * f2);
        this.M = (int) (2.0f * f2);
        this.A = (int) (f2 * 16.0f);
        t.Z(this, new h());
        if (t.r(this) == 0) {
            t.i0(this, 1);
        }
        t.l0(this, new d());
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.o;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void y(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.S
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L_0x006b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = 0
        L_0x001b:
            if (r7 >= r6) goto L_0x006b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r9 = (androidx.viewpager.widget.ViewPager.g) r9
            boolean r10 = r9.f1944a
            if (r10 != 0) goto L_0x002c
            goto L_0x0068
        L_0x002c:
            int r9 = r9.f1945b
            r9 = r9 & 7
            if (r9 == r2) goto L_0x004d
            r10 = 3
            if (r9 == r10) goto L_0x0047
            r10 = 5
            if (r9 == r10) goto L_0x003a
            r9 = r3
            goto L_0x005c
        L_0x003a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L_0x0059
        L_0x0047:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L_0x005c
        L_0x004d:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L_0x0059:
            r11 = r9
            r9 = r3
            r3 = r11
        L_0x005c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L_0x0067
            r8.offsetLeftAndRight(r3)
        L_0x0067:
            r3 = r9
        L_0x0068:
            int r7 = r7 + 1
            goto L_0x001b
        L_0x006b:
            r12.j(r13, r14, r15)
            androidx.viewpager.widget.ViewPager$k r13 = r12.a0
            if (r13 == 0) goto L_0x009f
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L_0x007a:
            if (r1 >= r14) goto L_0x009f
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r0 = (androidx.viewpager.widget.ViewPager.g) r0
            boolean r0 = r0.f1944a
            if (r0 == 0) goto L_0x008b
            goto L_0x009c
        L_0x008b:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            androidx.viewpager.widget.ViewPager$k r3 = r12.a0
            r3.a(r15, r0)
        L_0x009c:
            int r1 = r1 + 1
            goto L_0x007a
        L_0x009f:
            r12.R = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.y(int, float, int):void");
    }

    public static class g extends ViewGroup.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1944a;

        /* renamed from: b  reason: collision with root package name */
        public int f1945b;

        /* renamed from: c  reason: collision with root package name */
        float f1946c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        boolean f1947d;

        /* renamed from: e  reason: collision with root package name */
        int f1948e;

        /* renamed from: f  reason: collision with root package name */
        int f1949f;

        public g() {
            super(-1, -1);
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.g0);
            this.f1945b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    public void setPageTransformer(boolean z2, k kVar, int i2) {
        int i3 = 1;
        boolean z3 = kVar != null;
        boolean z4 = z3 != (this.a0 != null);
        this.a0 = kVar;
        setChildrenDrawingOrderEnabled(z3);
        if (z3) {
            if (z2) {
                i3 = 2;
            }
            this.c0 = i3;
            this.b0 = i2;
        } else {
            this.c0 = 0;
        }
        if (z4) {
            E();
        }
    }

    public void setCurrentItem(int i2, boolean z2) {
        this.w = false;
        N(i2, z2, false);
    }

    public void setPageMarginDrawable(int i2) {
        setPageMarginDrawable(androidx.core.content.a.f(getContext(), i2));
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        v();
    }
}
