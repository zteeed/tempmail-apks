package com.google.android.material.tabs;

import a.h.k.r;
import a.h.k.t;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.d0;
import androidx.viewpager.widget.ViewPager;
import b.c.a.d.j;
import com.google.android.material.internal.k;
import com.google.android.material.internal.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

@ViewPager.e
public class TabLayout extends HorizontalScrollView {
    private static final a.h.j.e<f> P = new a.h.j.g(16);
    int A;
    boolean B;
    boolean C;
    boolean D;
    private c E;
    private final ArrayList<c> F;
    private c G;
    private ValueAnimator H;
    ViewPager I;
    private androidx.viewpager.widget.a J;
    private DataSetObserver K;
    private g L;
    private b M;
    private boolean N;
    private final a.h.j.e<h> O;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<f> f10894b;

    /* renamed from: c  reason: collision with root package name */
    private f f10895c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final RectF f10896d;

    /* renamed from: e  reason: collision with root package name */
    private final e f10897e;

    /* renamed from: f  reason: collision with root package name */
    int f10898f;
    int g;
    int h;
    int i;
    int j;
    ColorStateList k;
    ColorStateList l;
    ColorStateList m;
    Drawable n;
    PorterDuff.Mode o;
    float p;
    float q;
    final int r;
    int s;
    private final int t;
    private final int u;
    private final int v;
    private int w;
    int x;
    int y;
    int z;

    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    private class b implements ViewPager.i {

        /* renamed from: a  reason: collision with root package name */
        private boolean f10900a;

        b() {
        }

        /* access modifiers changed from: package-private */
        public void a(boolean z) {
            this.f10900a = z;
        }

        public void b(ViewPager viewPager, androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.I == viewPager) {
                tabLayout.E(aVar2, this.f10900a);
            }
        }
    }

    public interface c<T extends f> {
        void a(T t);

        void b(T t);

        void c(T t);
    }

    private class d extends DataSetObserver {
        d() {
        }

        public void onChanged() {
            TabLayout.this.x();
        }

        public void onInvalidated() {
            TabLayout.this.x();
        }
    }

    private class e extends LinearLayout {

        /* renamed from: b  reason: collision with root package name */
        private int f10903b;

        /* renamed from: c  reason: collision with root package name */
        private final Paint f10904c;

        /* renamed from: d  reason: collision with root package name */
        private final GradientDrawable f10905d;

        /* renamed from: e  reason: collision with root package name */
        int f10906e = -1;

        /* renamed from: f  reason: collision with root package name */
        float f10907f;
        private int g = -1;
        private int h = -1;
        private int i = -1;
        private ValueAnimator j;

        class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f10908a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f10909b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f10910c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f10911d;

            a(int i, int i2, int i3, int i4) {
                this.f10908a = i;
                this.f10909b = i2;
                this.f10910c = i3;
                this.f10911d = i4;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float animatedFraction = valueAnimator.getAnimatedFraction();
                e.this.d(b.c.a.d.l.a.b(this.f10908a, this.f10909b, animatedFraction), b.c.a.d.l.a.b(this.f10910c, this.f10911d, animatedFraction));
            }
        }

        class b extends AnimatorListenerAdapter {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f10913a;

            b(int i) {
                this.f10913a = i;
            }

            public void onAnimationEnd(Animator animator) {
                e eVar = e.this;
                eVar.f10906e = this.f10913a;
                eVar.f10907f = 0.0f;
            }
        }

        e(Context context) {
            super(context);
            setWillNotDraw(false);
            this.f10904c = new Paint();
            this.f10905d = new GradientDrawable();
        }

        private void b(h hVar, RectF rectF) {
            int c2 = hVar.f();
            if (c2 < TabLayout.this.t(24)) {
                c2 = TabLayout.this.t(24);
            }
            int left = (hVar.getLeft() + hVar.getRight()) / 2;
            int i2 = c2 / 2;
            rectF.set((float) (left - i2), 0.0f, (float) (left + i2), 0.0f);
        }

        private void h() {
            int i2;
            int i3;
            View childAt = getChildAt(this.f10906e);
            if (childAt == null || childAt.getWidth() <= 0) {
                i3 = -1;
                i2 = -1;
            } else {
                i3 = childAt.getLeft();
                i2 = childAt.getRight();
                TabLayout tabLayout = TabLayout.this;
                if (!tabLayout.C && (childAt instanceof h)) {
                    b((h) childAt, tabLayout.f10896d);
                    i3 = (int) TabLayout.this.f10896d.left;
                    i2 = (int) TabLayout.this.f10896d.right;
                }
                if (this.f10907f > 0.0f && this.f10906e < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.f10906e + 1);
                    int left = childAt2.getLeft();
                    int right = childAt2.getRight();
                    TabLayout tabLayout2 = TabLayout.this;
                    if (!tabLayout2.C && (childAt2 instanceof h)) {
                        b((h) childAt2, tabLayout2.f10896d);
                        left = (int) TabLayout.this.f10896d.left;
                        right = (int) TabLayout.this.f10896d.right;
                    }
                    float f2 = this.f10907f;
                    i3 = (int) ((((float) left) * f2) + ((1.0f - f2) * ((float) i3)));
                    i2 = (int) ((((float) right) * f2) + ((1.0f - f2) * ((float) i2)));
                }
            }
            d(i3, i2);
        }

        /* access modifiers changed from: package-private */
        public void a(int i2, int i3) {
            ValueAnimator valueAnimator = this.j;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.j.cancel();
            }
            View childAt = getChildAt(i2);
            if (childAt == null) {
                h();
                return;
            }
            int left = childAt.getLeft();
            int right = childAt.getRight();
            TabLayout tabLayout = TabLayout.this;
            if (!tabLayout.C && (childAt instanceof h)) {
                b((h) childAt, tabLayout.f10896d);
                left = (int) TabLayout.this.f10896d.left;
                right = (int) TabLayout.this.f10896d.right;
            }
            int i4 = left;
            int i5 = right;
            int i6 = this.h;
            int i7 = this.i;
            if (i6 != i4 || i7 != i5) {
                ValueAnimator valueAnimator2 = new ValueAnimator();
                this.j = valueAnimator2;
                valueAnimator2.setInterpolator(b.c.a.d.l.a.f2266b);
                valueAnimator2.setDuration((long) i3);
                valueAnimator2.setFloatValues(new float[]{0.0f, 1.0f});
                valueAnimator2.addUpdateListener(new a(i6, i4, i7, i5));
                valueAnimator2.addListener(new b(i2));
                valueAnimator2.start();
            }
        }

        /* access modifiers changed from: package-private */
        public boolean c() {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (getChildAt(i2).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public void d(int i2, int i3) {
            if (i2 != this.h || i3 != this.i) {
                this.h = i2;
                this.i = i3;
                t.T(this);
            }
        }

        public void draw(Canvas canvas) {
            Drawable drawable = TabLayout.this.n;
            int i2 = 0;
            int intrinsicHeight = drawable != null ? drawable.getIntrinsicHeight() : 0;
            int i3 = this.f10903b;
            if (i3 >= 0) {
                intrinsicHeight = i3;
            }
            int i4 = TabLayout.this.z;
            if (i4 == 0) {
                i2 = getHeight() - intrinsicHeight;
                intrinsicHeight = getHeight();
            } else if (i4 == 1) {
                i2 = (getHeight() - intrinsicHeight) / 2;
                intrinsicHeight = (getHeight() + intrinsicHeight) / 2;
            } else if (i4 != 2) {
                if (i4 != 3) {
                    intrinsicHeight = 0;
                } else {
                    intrinsicHeight = getHeight();
                }
            }
            int i5 = this.h;
            if (i5 >= 0 && this.i > i5) {
                Drawable drawable2 = TabLayout.this.n;
                if (drawable2 == null) {
                    drawable2 = this.f10905d;
                }
                Drawable r = androidx.core.graphics.drawable.a.r(drawable2);
                r.setBounds(this.h, i2, this.i, intrinsicHeight);
                Paint paint = this.f10904c;
                if (paint != null) {
                    if (Build.VERSION.SDK_INT == 21) {
                        r.setColorFilter(paint.getColor(), PorterDuff.Mode.SRC_IN);
                    } else {
                        androidx.core.graphics.drawable.a.n(r, paint.getColor());
                    }
                }
                r.draw(canvas);
            }
            super.draw(canvas);
        }

        /* access modifiers changed from: package-private */
        public void e(int i2, float f2) {
            ValueAnimator valueAnimator = this.j;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.j.cancel();
            }
            this.f10906e = i2;
            this.f10907f = f2;
            h();
        }

        /* access modifiers changed from: package-private */
        public void f(int i2) {
            if (this.f10904c.getColor() != i2) {
                this.f10904c.setColor(i2);
                t.T(this);
            }
        }

        /* access modifiers changed from: package-private */
        public void g(int i2) {
            if (this.f10903b != i2) {
                this.f10903b = i2;
                t.T(this);
            }
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
            super.onLayout(z, i2, i3, i4, i5);
            ValueAnimator valueAnimator = this.j;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                h();
                return;
            }
            this.j.cancel();
            a(this.f10906e, Math.round((1.0f - this.j.getAnimatedFraction()) * ((float) this.j.getDuration())));
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int i2, int i3) {
            super.onMeasure(i2, i3);
            if (View.MeasureSpec.getMode(i2) == 1073741824) {
                TabLayout tabLayout = TabLayout.this;
                boolean z = true;
                if (tabLayout.A == 1 && tabLayout.x == 1) {
                    int childCount = getChildCount();
                    int i4 = 0;
                    for (int i5 = 0; i5 < childCount; i5++) {
                        View childAt = getChildAt(i5);
                        if (childAt.getVisibility() == 0) {
                            i4 = Math.max(i4, childAt.getMeasuredWidth());
                        }
                    }
                    if (i4 > 0) {
                        if (i4 * childCount <= getMeasuredWidth() - (TabLayout.this.t(16) * 2)) {
                            boolean z2 = false;
                            for (int i6 = 0; i6 < childCount; i6++) {
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i6).getLayoutParams();
                                if (layoutParams.width != i4 || layoutParams.weight != 0.0f) {
                                    layoutParams.width = i4;
                                    layoutParams.weight = 0.0f;
                                    z2 = true;
                                }
                            }
                            z = z2;
                        } else {
                            TabLayout tabLayout2 = TabLayout.this;
                            tabLayout2.x = 0;
                            tabLayout2.J(false);
                        }
                        if (z) {
                            super.onMeasure(i2, i3);
                        }
                    }
                }
            }
        }

        public void onRtlPropertiesChanged(int i2) {
            super.onRtlPropertiesChanged(i2);
            if (Build.VERSION.SDK_INT < 23 && this.g != i2) {
                requestLayout();
                this.g = i2;
            }
        }
    }

    public static class f {

        /* renamed from: a  reason: collision with root package name */
        private Drawable f10915a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public CharSequence f10916b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f10917c;

        /* renamed from: d  reason: collision with root package name */
        private int f10918d = -1;

        /* renamed from: e  reason: collision with root package name */
        private View f10919e;

        /* renamed from: f  reason: collision with root package name */
        public TabLayout f10920f;
        public h g;

        public View c() {
            return this.f10919e;
        }

        public Drawable d() {
            return this.f10915a;
        }

        public int e() {
            return this.f10918d;
        }

        public CharSequence f() {
            return this.f10916b;
        }

        public boolean g() {
            TabLayout tabLayout = this.f10920f;
            if (tabLayout != null) {
                return tabLayout.getSelectedTabPosition() == this.f10918d;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* access modifiers changed from: package-private */
        public void h() {
            this.f10920f = null;
            this.g = null;
            this.f10915a = null;
            this.f10916b = null;
            this.f10917c = null;
            this.f10918d = -1;
            this.f10919e = null;
        }

        public void i() {
            TabLayout tabLayout = this.f10920f;
            if (tabLayout != null) {
                tabLayout.C(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public f j(CharSequence charSequence) {
            this.f10917c = charSequence;
            p();
            return this;
        }

        public f k(int i) {
            l(LayoutInflater.from(this.g.getContext()).inflate(i, this.g, false));
            return this;
        }

        public f l(View view) {
            this.f10919e = view;
            p();
            return this;
        }

        public f m(Drawable drawable) {
            this.f10915a = drawable;
            p();
            return this;
        }

        /* access modifiers changed from: package-private */
        public void n(int i) {
            this.f10918d = i;
        }

        public f o(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f10917c) && !TextUtils.isEmpty(charSequence)) {
                this.g.setContentDescription(charSequence);
            }
            this.f10916b = charSequence;
            p();
            return this;
        }

        /* access modifiers changed from: package-private */
        public void p() {
            h hVar = this.g;
            if (hVar != null) {
                hVar.i();
            }
        }
    }

    public static class g implements ViewPager.j {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<TabLayout> f10921a;

        /* renamed from: b  reason: collision with root package name */
        private int f10922b;

        /* renamed from: c  reason: collision with root package name */
        private int f10923c;

        public g(TabLayout tabLayout) {
            this.f10921a = new WeakReference<>(tabLayout);
        }

        public void a(int i, float f2, int i2) {
            TabLayout tabLayout = (TabLayout) this.f10921a.get();
            if (tabLayout != null) {
                boolean z = false;
                boolean z2 = this.f10923c != 2 || this.f10922b == 1;
                if (!(this.f10923c == 2 && this.f10922b == 0)) {
                    z = true;
                }
                tabLayout.F(i, f2, z2, z);
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            this.f10923c = 0;
            this.f10922b = 0;
        }

        public void c(int i) {
            this.f10922b = this.f10923c;
            this.f10923c = i;
        }

        public void d(int i) {
            TabLayout tabLayout = (TabLayout) this.f10921a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                int i2 = this.f10923c;
                tabLayout.D(tabLayout.v(i), i2 == 0 || (i2 == 2 && this.f10922b == 0));
            }
        }
    }

    class h extends LinearLayout {

        /* renamed from: b  reason: collision with root package name */
        private f f10924b;

        /* renamed from: c  reason: collision with root package name */
        private TextView f10925c;

        /* renamed from: d  reason: collision with root package name */
        private ImageView f10926d;

        /* renamed from: e  reason: collision with root package name */
        private View f10927e;

        /* renamed from: f  reason: collision with root package name */
        private TextView f10928f;
        private ImageView g;
        private Drawable h;
        private int i = 2;

        public h(Context context) {
            super(context);
            j(context);
            t.m0(this, TabLayout.this.f10898f, TabLayout.this.g, TabLayout.this.h, TabLayout.this.i);
            setGravity(17);
            setOrientation(TabLayout.this.B ^ true ? 1 : 0);
            setClickable(true);
            t.n0(this, r.b(getContext(), 1002));
        }

        private float d(Layout layout, int i2, float f2) {
            return layout.getLineWidth(i2) * (f2 / layout.getPaint().getTextSize());
        }

        /* access modifiers changed from: private */
        public void e(Canvas canvas) {
            Drawable drawable = this.h;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.h.draw(canvas);
            }
        }

        /* access modifiers changed from: private */
        public int f() {
            View[] viewArr = {this.f10925c, this.f10926d, this.f10927e};
            int i2 = 0;
            int i3 = 0;
            boolean z = false;
            for (int i4 = 0; i4 < 3; i4++) {
                View view = viewArr[i4];
                if (view != null && view.getVisibility() == 0) {
                    i3 = z ? Math.min(i3, view.getLeft()) : view.getLeft();
                    i2 = z ? Math.max(i2, view.getRight()) : view.getRight();
                    z = true;
                }
            }
            return i2 - i3;
        }

        /* JADX WARNING: type inference failed for: r2v3, types: [android.graphics.drawable.LayerDrawable] */
        /* JADX WARNING: type inference failed for: r0v3, types: [android.graphics.drawable.RippleDrawable] */
        /* access modifiers changed from: private */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void j(android.content.Context r7) {
            /*
                r6 = this;
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                int r0 = r0.r
                r1 = 0
                if (r0 == 0) goto L_0x001f
                android.graphics.drawable.Drawable r7 = a.a.k.a.a.d(r7, r0)
                r6.h = r7
                if (r7 == 0) goto L_0x0021
                boolean r7 = r7.isStateful()
                if (r7 == 0) goto L_0x0021
                android.graphics.drawable.Drawable r7 = r6.h
                int[] r0 = r6.getDrawableState()
                r7.setState(r0)
                goto L_0x0021
            L_0x001f:
                r6.h = r1
            L_0x0021:
                android.graphics.drawable.GradientDrawable r7 = new android.graphics.drawable.GradientDrawable
                r7.<init>()
                r0 = 0
                r7.setColor(r0)
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r2 = r2.m
                if (r2 == 0) goto L_0x0078
                android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
                r2.<init>()
                r3 = 925353388(0x3727c5ac, float:1.0E-5)
                r2.setCornerRadius(r3)
                r3 = -1
                r2.setColor(r3)
                com.google.android.material.tabs.TabLayout r3 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r3 = r3.m
                android.content.res.ColorStateList r3 = b.c.a.d.r.a.a(r3)
                int r4 = android.os.Build.VERSION.SDK_INT
                r5 = 21
                if (r4 < r5) goto L_0x0063
                android.graphics.drawable.RippleDrawable r0 = new android.graphics.drawable.RippleDrawable
                com.google.android.material.tabs.TabLayout r4 = com.google.android.material.tabs.TabLayout.this
                boolean r4 = r4.D
                if (r4 == 0) goto L_0x0056
                r7 = r1
            L_0x0056:
                com.google.android.material.tabs.TabLayout r4 = com.google.android.material.tabs.TabLayout.this
                boolean r4 = r4.D
                if (r4 == 0) goto L_0x005d
                goto L_0x005e
            L_0x005d:
                r1 = r2
            L_0x005e:
                r0.<init>(r3, r7, r1)
                r7 = r0
                goto L_0x0078
            L_0x0063:
                android.graphics.drawable.Drawable r1 = androidx.core.graphics.drawable.a.r(r2)
                androidx.core.graphics.drawable.a.o(r1, r3)
                android.graphics.drawable.LayerDrawable r2 = new android.graphics.drawable.LayerDrawable
                r3 = 2
                android.graphics.drawable.Drawable[] r3 = new android.graphics.drawable.Drawable[r3]
                r3[r0] = r7
                r7 = 1
                r3[r7] = r1
                r2.<init>(r3)
                r7 = r2
            L_0x0078:
                a.h.k.t.b0(r6, r7)
                com.google.android.material.tabs.TabLayout r7 = com.google.android.material.tabs.TabLayout.this
                r7.invalidate()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.h.j(android.content.Context):void");
        }

        private void l(TextView textView, ImageView imageView) {
            f fVar = this.f10924b;
            CharSequence charSequence = null;
            Drawable mutate = (fVar == null || fVar.d() == null) ? null : androidx.core.graphics.drawable.a.r(this.f10924b.d()).mutate();
            f fVar2 = this.f10924b;
            CharSequence f2 = fVar2 != null ? fVar2.f() : null;
            if (imageView != null) {
                if (mutate != null) {
                    imageView.setImageDrawable(mutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable((Drawable) null);
                }
            }
            boolean z = !TextUtils.isEmpty(f2);
            if (textView != null) {
                if (z) {
                    textView.setText(f2);
                    textView.setVisibility(0);
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int t = (!z || imageView.getVisibility() != 0) ? 0 : TabLayout.this.t(8);
                if (TabLayout.this.B) {
                    if (t != a.h.k.g.a(marginLayoutParams)) {
                        a.h.k.g.c(marginLayoutParams, t);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (t != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = t;
                    a.h.k.g.c(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            f fVar3 = this.f10924b;
            CharSequence a2 = fVar3 != null ? fVar3.f10917c : null;
            if (!z) {
                charSequence = a2;
            }
            d0.a(this, charSequence);
        }

        /* access modifiers changed from: protected */
        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.h;
            boolean z = false;
            if (drawable != null && drawable.isStateful()) {
                z = false | this.h.setState(drawableState);
            }
            if (z) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        /* access modifiers changed from: package-private */
        public void g() {
            h((f) null);
            setSelected(false);
        }

        /* access modifiers changed from: package-private */
        public void h(f fVar) {
            if (fVar != this.f10924b) {
                this.f10924b = fVar;
                i();
            }
        }

        /* access modifiers changed from: package-private */
        public final void i() {
            f fVar = this.f10924b;
            Drawable drawable = null;
            View c2 = fVar != null ? fVar.c() : null;
            if (c2 != null) {
                ViewParent parent = c2.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(c2);
                    }
                    addView(c2);
                }
                this.f10927e = c2;
                TextView textView = this.f10925c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f10926d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f10926d.setImageDrawable((Drawable) null);
                }
                TextView textView2 = (TextView) c2.findViewById(16908308);
                this.f10928f = textView2;
                if (textView2 != null) {
                    this.i = androidx.core.widget.i.d(textView2);
                }
                this.g = (ImageView) c2.findViewById(16908294);
            } else {
                View view = this.f10927e;
                if (view != null) {
                    removeView(view);
                    this.f10927e = null;
                }
                this.f10928f = null;
                this.g = null;
            }
            boolean z = false;
            if (this.f10927e == null) {
                if (this.f10926d == null) {
                    ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(b.c.a.d.h.design_layout_tab_icon, this, false);
                    addView(imageView2, 0);
                    this.f10926d = imageView2;
                }
                if (!(fVar == null || fVar.d() == null)) {
                    drawable = androidx.core.graphics.drawable.a.r(fVar.d()).mutate();
                }
                if (drawable != null) {
                    androidx.core.graphics.drawable.a.o(drawable, TabLayout.this.l);
                    PorterDuff.Mode mode = TabLayout.this.o;
                    if (mode != null) {
                        androidx.core.graphics.drawable.a.p(drawable, mode);
                    }
                }
                if (this.f10925c == null) {
                    TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(b.c.a.d.h.design_layout_tab_text, this, false);
                    addView(textView3);
                    this.f10925c = textView3;
                    this.i = androidx.core.widget.i.d(textView3);
                }
                androidx.core.widget.i.o(this.f10925c, TabLayout.this.j);
                ColorStateList colorStateList = TabLayout.this.k;
                if (colorStateList != null) {
                    this.f10925c.setTextColor(colorStateList);
                }
                l(this.f10925c, this.f10926d);
            } else if (!(this.f10928f == null && this.g == null)) {
                l(this.f10928f, this.g);
            }
            if (fVar != null && !TextUtils.isEmpty(fVar.f10917c)) {
                setContentDescription(fVar.f10917c);
            }
            if (fVar != null && fVar.g()) {
                z = true;
            }
            setSelected(z);
        }

        /* access modifiers changed from: package-private */
        public final void k() {
            setOrientation(TabLayout.this.B ^ true ? 1 : 0);
            if (this.f10928f == null && this.g == null) {
                l(this.f10925c, this.f10926d);
            } else {
                l(this.f10928f, this.g);
            }
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(a.c.class.getName());
        }

        @TargetApi(14)
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(a.c.class.getName());
        }

        public void onMeasure(int i2, int i3) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i2);
            int mode = View.MeasureSpec.getMode(i2);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i2 = View.MeasureSpec.makeMeasureSpec(TabLayout.this.s, Integer.MIN_VALUE);
            }
            super.onMeasure(i2, i3);
            if (this.f10925c != null) {
                float f2 = TabLayout.this.p;
                int i4 = this.i;
                ImageView imageView = this.f10926d;
                boolean z = true;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f10925c;
                    if (textView != null && textView.getLineCount() > 1) {
                        f2 = TabLayout.this.q;
                    }
                } else {
                    i4 = 1;
                }
                float textSize = this.f10925c.getTextSize();
                int lineCount = this.f10925c.getLineCount();
                int d2 = androidx.core.widget.i.d(this.f10925c);
                int i5 = (f2 > textSize ? 1 : (f2 == textSize ? 0 : -1));
                if (i5 != 0 || (d2 >= 0 && i4 != d2)) {
                    if (TabLayout.this.A == 1 && i5 > 0 && lineCount == 1 && ((layout = this.f10925c.getLayout()) == null || d(layout, 0, f2) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())))) {
                        z = false;
                    }
                    if (z) {
                        this.f10925c.setTextSize(0, f2);
                        this.f10925c.setMaxLines(i4);
                        super.onMeasure(i2, i3);
                    }
                }
            }
        }

        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f10924b == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            this.f10924b.i();
            return true;
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z && Build.VERSION.SDK_INT < 16) {
                sendAccessibilityEvent(4);
            }
            TextView textView = this.f10925c;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.f10926d;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.f10927e;
            if (view != null) {
                view.setSelected(z);
            }
        }
    }

    public static class i implements c {

        /* renamed from: a  reason: collision with root package name */
        private final ViewPager f10929a;

        public i(ViewPager viewPager) {
            this.f10929a = viewPager;
        }

        public void a(f fVar) {
        }

        public void b(f fVar) {
            this.f10929a.setCurrentItem(fVar.e());
        }

        public void c(f fVar) {
        }
    }

    public TabLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    private void B(int i2) {
        h hVar = (h) this.f10897e.getChildAt(i2);
        this.f10897e.removeViewAt(i2);
        if (hVar != null) {
            hVar.g();
            this.O.a(hVar);
        }
        requestLayout();
    }

    private void G(ViewPager viewPager, boolean z2, boolean z3) {
        ViewPager viewPager2 = this.I;
        if (viewPager2 != null) {
            g gVar = this.L;
            if (gVar != null) {
                viewPager2.J(gVar);
            }
            b bVar = this.M;
            if (bVar != null) {
                this.I.I(bVar);
            }
        }
        c cVar = this.G;
        if (cVar != null) {
            A(cVar);
            this.G = null;
        }
        if (viewPager != null) {
            this.I = viewPager;
            if (this.L == null) {
                this.L = new g(this);
            }
            this.L.b();
            viewPager.c(this.L);
            i iVar = new i(viewPager);
            this.G = iVar;
            b(iVar);
            androidx.viewpager.widget.a adapter = viewPager.getAdapter();
            if (adapter != null) {
                E(adapter, z2);
            }
            if (this.M == null) {
                this.M = new b();
            }
            this.M.a(z2);
            viewPager.b(this.M);
            setScrollPosition(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.I = null;
            E((androidx.viewpager.widget.a) null, false);
        }
        this.N = z3;
    }

    private void H() {
        int size = this.f10894b.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f10894b.get(i2).p();
        }
    }

    private void I(LinearLayout.LayoutParams layoutParams) {
        if (this.A == 1 && this.x == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            return;
        }
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
    }

    private void f(TabItem tabItem) {
        f w2 = w();
        CharSequence charSequence = tabItem.f10891b;
        if (charSequence != null) {
            w2.o(charSequence);
        }
        Drawable drawable = tabItem.f10892c;
        if (drawable != null) {
            w2.m(drawable);
        }
        int i2 = tabItem.f10893d;
        if (i2 != 0) {
            w2.k(i2);
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            w2.j(tabItem.getContentDescription());
        }
        c(w2);
    }

    private void g(f fVar) {
        this.f10897e.addView(fVar.g, fVar.e(), n());
    }

    private int getDefaultHeight() {
        int size = this.f10894b.size();
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                f fVar = this.f10894b.get(i2);
                if (fVar != null && fVar.d() != null && !TextUtils.isEmpty(fVar.f())) {
                    z2 = true;
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        return (!z2 || this.B) ? 48 : 72;
    }

    private int getTabMinWidth() {
        int i2 = this.t;
        if (i2 != -1) {
            return i2;
        }
        if (this.A == 0) {
            return this.v;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f10897e.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void h(View view) {
        if (view instanceof TabItem) {
            f((TabItem) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    private void i(int i2) {
        if (i2 != -1) {
            if (getWindowToken() == null || !t.I(this) || this.f10897e.c()) {
                setScrollPosition(i2, 0.0f, true);
                return;
            }
            int scrollX = getScrollX();
            int k2 = k(i2, 0.0f);
            if (scrollX != k2) {
                u();
                this.H.setIntValues(new int[]{scrollX, k2});
                this.H.start();
            }
            this.f10897e.a(i2, this.y);
        }
    }

    private void j() {
        t.m0(this.f10897e, this.A == 0 ? Math.max(0, this.w - this.f10898f) : 0, 0, 0, 0);
        int i2 = this.A;
        if (i2 == 0) {
            this.f10897e.setGravity(8388611);
        } else if (i2 == 1) {
            this.f10897e.setGravity(1);
        }
        J(true);
    }

    private int k(int i2, float f2) {
        int i3 = 0;
        if (this.A != 0) {
            return 0;
        }
        View childAt = this.f10897e.getChildAt(i2);
        int i4 = i2 + 1;
        View childAt2 = i4 < this.f10897e.getChildCount() ? this.f10897e.getChildAt(i4) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        if (childAt2 != null) {
            i3 = childAt2.getWidth();
        }
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i5 = (int) (((float) (width + i3)) * 0.5f * f2);
        return t.t(this) == 0 ? left + i5 : left - i5;
    }

    private void l(f fVar, int i2) {
        fVar.n(i2);
        this.f10894b.add(i2, fVar);
        int size = this.f10894b.size();
        while (true) {
            i2++;
            if (i2 < size) {
                this.f10894b.get(i2).n(i2);
            } else {
                return;
            }
        }
    }

    private static ColorStateList m(int i2, int i3) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i3, i2});
    }

    private LinearLayout.LayoutParams n() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        I(layoutParams);
        return layoutParams;
    }

    private h p(f fVar) {
        a.h.j.e<h> eVar = this.O;
        h b2 = eVar != null ? eVar.b() : null;
        if (b2 == null) {
            b2 = new h(getContext());
        }
        b2.h(fVar);
        b2.setFocusable(true);
        b2.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(fVar.f10917c)) {
            b2.setContentDescription(fVar.f10916b);
        } else {
            b2.setContentDescription(fVar.f10917c);
        }
        return b2;
    }

    private void q(f fVar) {
        for (int size = this.F.size() - 1; size >= 0; size--) {
            this.F.get(size).a(fVar);
        }
    }

    private void r(f fVar) {
        for (int size = this.F.size() - 1; size >= 0; size--) {
            this.F.get(size).b(fVar);
        }
    }

    private void s(f fVar) {
        for (int size = this.F.size() - 1; size >= 0; size--) {
            this.F.get(size).c(fVar);
        }
    }

    private void setSelectedTabView(int i2) {
        int childCount = this.f10897e.getChildCount();
        if (i2 < childCount) {
            int i3 = 0;
            while (i3 < childCount) {
                View childAt = this.f10897e.getChildAt(i3);
                boolean z2 = true;
                childAt.setSelected(i3 == i2);
                if (i3 != i2) {
                    z2 = false;
                }
                childAt.setActivated(z2);
                i3++;
            }
        }
    }

    private void u() {
        if (this.H == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.H = valueAnimator;
            valueAnimator.setInterpolator(b.c.a.d.l.a.f2266b);
            this.H.setDuration((long) this.y);
            this.H.addUpdateListener(new a());
        }
    }

    public void A(c cVar) {
        this.F.remove(cVar);
    }

    /* access modifiers changed from: package-private */
    public void C(f fVar) {
        D(fVar, true);
    }

    /* access modifiers changed from: package-private */
    public void D(f fVar, boolean z2) {
        f fVar2 = this.f10895c;
        if (fVar2 != fVar) {
            int e2 = fVar != null ? fVar.e() : -1;
            if (z2) {
                if ((fVar2 == null || fVar2.e() == -1) && e2 != -1) {
                    setScrollPosition(e2, 0.0f, true);
                } else {
                    i(e2);
                }
                if (e2 != -1) {
                    setSelectedTabView(e2);
                }
            }
            this.f10895c = fVar;
            if (fVar2 != null) {
                s(fVar2);
            }
            if (fVar != null) {
                r(fVar);
            }
        } else if (fVar2 != null) {
            q(fVar);
            i(fVar.e());
        }
    }

    /* access modifiers changed from: package-private */
    public void E(androidx.viewpager.widget.a aVar, boolean z2) {
        DataSetObserver dataSetObserver;
        androidx.viewpager.widget.a aVar2 = this.J;
        if (!(aVar2 == null || (dataSetObserver = this.K) == null)) {
            aVar2.t(dataSetObserver);
        }
        this.J = aVar;
        if (z2 && aVar != null) {
            if (this.K == null) {
                this.K = new d();
            }
            aVar.l(this.K);
        }
        x();
    }

    /* access modifiers changed from: package-private */
    public void F(int i2, float f2, boolean z2, boolean z3) {
        int round = Math.round(((float) i2) + f2);
        if (round >= 0 && round < this.f10897e.getChildCount()) {
            if (z3) {
                this.f10897e.e(i2, f2);
            }
            ValueAnimator valueAnimator = this.H;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.H.cancel();
            }
            scrollTo(k(i2, f2), 0);
            if (z2) {
                setSelectedTabView(round);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void J(boolean z2) {
        for (int i2 = 0; i2 < this.f10897e.getChildCount(); i2++) {
            View childAt = this.f10897e.getChildAt(i2);
            childAt.setMinimumWidth(getTabMinWidth());
            I((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z2) {
                childAt.requestLayout();
            }
        }
    }

    public void addView(View view) {
        h(view);
    }

    public void b(c cVar) {
        if (!this.F.contains(cVar)) {
            this.F.add(cVar);
        }
    }

    public void c(f fVar) {
        e(fVar, this.f10894b.isEmpty());
    }

    public void d(f fVar, int i2, boolean z2) {
        if (fVar.f10920f == this) {
            l(fVar, i2);
            g(fVar);
            if (z2) {
                fVar.i();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    public void e(f fVar, boolean z2) {
        d(fVar, this.f10894b.size(), z2);
    }

    public int getSelectedTabPosition() {
        f fVar = this.f10895c;
        if (fVar != null) {
            return fVar.e();
        }
        return -1;
    }

    public int getTabCount() {
        return this.f10894b.size();
    }

    public int getTabGravity() {
        return this.x;
    }

    public ColorStateList getTabIconTint() {
        return this.l;
    }

    public int getTabIndicatorGravity() {
        return this.z;
    }

    /* access modifiers changed from: package-private */
    public int getTabMaxWidth() {
        return this.s;
    }

    public int getTabMode() {
        return this.A;
    }

    public ColorStateList getTabRippleColor() {
        return this.m;
    }

    public Drawable getTabSelectedIndicator() {
        return this.n;
    }

    public ColorStateList getTabTextColors() {
        return this.k;
    }

    /* access modifiers changed from: protected */
    public f o() {
        f b2 = P.b();
        return b2 == null ? new f() : b2;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.I == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                G((ViewPager) parent, true, true);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.N) {
            setupWithViewPager((ViewPager) null);
            this.N = false;
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        for (int i2 = 0; i2 < this.f10897e.getChildCount(); i2++) {
            View childAt = this.f10897e.getChildAt(i2);
            if (childAt instanceof h) {
                ((h) childAt).e(canvas);
            }
        }
        super.onDraw(canvas);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0067, code lost:
        if (r1.getMeasuredWidth() != getMeasuredWidth()) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0072, code lost:
        if (r1.getMeasuredWidth() < getMeasuredWidth()) goto L_0x0076;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.getDefaultHeight()
            int r0 = r5.t(r0)
            int r1 = r5.getPaddingTop()
            int r0 = r0 + r1
            int r1 = r5.getPaddingBottom()
            int r0 = r0 + r1
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r1 == r2) goto L_0x0024
            if (r1 == 0) goto L_0x001f
            goto L_0x0030
        L_0x001f:
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L_0x0030
        L_0x0024:
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            int r7 = java.lang.Math.min(r0, r7)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r3)
        L_0x0030:
            int r0 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r6)
            if (r1 == 0) goto L_0x0049
            int r1 = r5.u
            if (r1 <= 0) goto L_0x003f
            goto L_0x0047
        L_0x003f:
            r1 = 56
            int r1 = r5.t(r1)
            int r1 = r0 - r1
        L_0x0047:
            r5.s = r1
        L_0x0049:
            super.onMeasure(r6, r7)
            int r6 = r5.getChildCount()
            r0 = 1
            if (r6 != r0) goto L_0x0097
            r6 = 0
            android.view.View r1 = r5.getChildAt(r6)
            int r2 = r5.A
            if (r2 == 0) goto L_0x006a
            if (r2 == r0) goto L_0x005f
            goto L_0x0077
        L_0x005f:
            int r2 = r1.getMeasuredWidth()
            int r4 = r5.getMeasuredWidth()
            if (r2 == r4) goto L_0x0075
            goto L_0x0076
        L_0x006a:
            int r2 = r1.getMeasuredWidth()
            int r4 = r5.getMeasuredWidth()
            if (r2 >= r4) goto L_0x0075
            goto L_0x0076
        L_0x0075:
            r0 = 0
        L_0x0076:
            r6 = r0
        L_0x0077:
            if (r6 == 0) goto L_0x0097
            int r6 = r5.getPaddingTop()
            int r0 = r5.getPaddingBottom()
            int r6 = r6 + r0
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            int r0 = r0.height
            int r6 = android.widget.HorizontalScrollView.getChildMeasureSpec(r7, r6, r0)
            int r7 = r5.getMeasuredWidth()
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r3)
            r1.measure(r7, r6)
        L_0x0097:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    public void setInlineLabel(boolean z2) {
        if (this.B != z2) {
            this.B = z2;
            for (int i2 = 0; i2 < this.f10897e.getChildCount(); i2++) {
                View childAt = this.f10897e.getChildAt(i2);
                if (childAt instanceof h) {
                    ((h) childAt).k();
                }
            }
            j();
        }
    }

    public void setInlineLabelResource(int i2) {
        setInlineLabel(getResources().getBoolean(i2));
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        c cVar2 = this.E;
        if (cVar2 != null) {
            A(cVar2);
        }
        this.E = cVar;
        if (cVar != null) {
            b(cVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        u();
        this.H.addListener(animatorListener);
    }

    public void setScrollPosition(int i2, float f2, boolean z2) {
        F(i2, f2, z2, true);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.n != drawable) {
            this.n = drawable;
            t.T(this.f10897e);
        }
    }

    public void setSelectedTabIndicatorColor(int i2) {
        this.f10897e.f(i2);
    }

    public void setSelectedTabIndicatorGravity(int i2) {
        if (this.z != i2) {
            this.z = i2;
            t.T(this.f10897e);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i2) {
        this.f10897e.g(i2);
    }

    public void setTabGravity(int i2) {
        if (this.x != i2) {
            this.x = i2;
            j();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            H();
        }
    }

    public void setTabIconTintResource(int i2) {
        setTabIconTint(a.a.k.a.a.c(getContext(), i2));
    }

    public void setTabIndicatorFullWidth(boolean z2) {
        this.C = z2;
        t.T(this.f10897e);
    }

    public void setTabMode(int i2) {
        if (i2 != this.A) {
            this.A = i2;
            j();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.m != colorStateList) {
            this.m = colorStateList;
            for (int i2 = 0; i2 < this.f10897e.getChildCount(); i2++) {
                View childAt = this.f10897e.getChildAt(i2);
                if (childAt instanceof h) {
                    ((h) childAt).j(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i2) {
        setTabRippleColor(a.a.k.a.a.c(getContext(), i2));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.k != colorStateList) {
            this.k = colorStateList;
            H();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(androidx.viewpager.widget.a aVar) {
        E(aVar, false);
    }

    public void setUnboundedRipple(boolean z2) {
        if (this.D != z2) {
            this.D = z2;
            for (int i2 = 0; i2 < this.f10897e.getChildCount(); i2++) {
                View childAt = this.f10897e.getChildAt(i2);
                if (childAt instanceof h) {
                    ((h) childAt).j(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i2) {
        setUnboundedRipple(getResources().getBoolean(i2));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        setupWithViewPager(viewPager, true);
    }

    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    /* access modifiers changed from: package-private */
    public int t(int i2) {
        return Math.round(getResources().getDisplayMetrics().density * ((float) i2));
    }

    public f v(int i2) {
        if (i2 < 0 || i2 >= getTabCount()) {
            return null;
        }
        return this.f10894b.get(i2);
    }

    public f w() {
        f o2 = o();
        o2.f10920f = this;
        o2.g = p(o2);
        return o2;
    }

    /* access modifiers changed from: package-private */
    public void x() {
        int currentItem;
        z();
        androidx.viewpager.widget.a aVar = this.J;
        if (aVar != null) {
            int e2 = aVar.e();
            for (int i2 = 0; i2 < e2; i2++) {
                f w2 = w();
                w2.o(this.J.g(i2));
                e(w2, false);
            }
            ViewPager viewPager = this.I;
            if (viewPager != null && e2 > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                C(v(currentItem));
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean y(f fVar) {
        return P.a(fVar);
    }

    public void z() {
        for (int childCount = this.f10897e.getChildCount() - 1; childCount >= 0; childCount--) {
            B(childCount);
        }
        Iterator<f> it = this.f10894b.iterator();
        while (it.hasNext()) {
            f next = it.next();
            it.remove();
            next.h();
            y(next);
        }
        this.f10895c = null;
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.c.a.d.b.tabStyle);
    }

    public void addView(View view, int i2) {
        h(view);
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public void setupWithViewPager(ViewPager viewPager, boolean z2) {
        G(viewPager, z2, false);
    }

    /* JADX INFO: finally extract failed */
    public TabLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f10894b = new ArrayList<>();
        this.f10896d = new RectF();
        this.s = Integer.MAX_VALUE;
        this.F = new ArrayList<>();
        this.O = new a.h.j.f(12);
        setHorizontalScrollBarEnabled(false);
        e eVar = new e(context);
        this.f10897e = eVar;
        super.addView(eVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray h2 = k.h(context, attributeSet, b.c.a.d.k.TabLayout, i2, j.Widget_Design_TabLayout, b.c.a.d.k.TabLayout_tabTextAppearance);
        this.f10897e.g(h2.getDimensionPixelSize(b.c.a.d.k.TabLayout_tabIndicatorHeight, -1));
        this.f10897e.f(h2.getColor(b.c.a.d.k.TabLayout_tabIndicatorColor, 0));
        setSelectedTabIndicator(b.c.a.d.q.a.b(context, h2, b.c.a.d.k.TabLayout_tabIndicator));
        setSelectedTabIndicatorGravity(h2.getInt(b.c.a.d.k.TabLayout_tabIndicatorGravity, 0));
        setTabIndicatorFullWidth(h2.getBoolean(b.c.a.d.k.TabLayout_tabIndicatorFullWidth, true));
        int dimensionPixelSize = h2.getDimensionPixelSize(b.c.a.d.k.TabLayout_tabPadding, 0);
        this.i = dimensionPixelSize;
        this.h = dimensionPixelSize;
        this.g = dimensionPixelSize;
        this.f10898f = dimensionPixelSize;
        this.f10898f = h2.getDimensionPixelSize(b.c.a.d.k.TabLayout_tabPaddingStart, dimensionPixelSize);
        this.g = h2.getDimensionPixelSize(b.c.a.d.k.TabLayout_tabPaddingTop, this.g);
        this.h = h2.getDimensionPixelSize(b.c.a.d.k.TabLayout_tabPaddingEnd, this.h);
        this.i = h2.getDimensionPixelSize(b.c.a.d.k.TabLayout_tabPaddingBottom, this.i);
        int resourceId = h2.getResourceId(b.c.a.d.k.TabLayout_tabTextAppearance, j.TextAppearance_Design_Tab);
        this.j = resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId, a.a.j.TextAppearance);
        try {
            this.p = (float) obtainStyledAttributes.getDimensionPixelSize(a.a.j.TextAppearance_android_textSize, 0);
            this.k = b.c.a.d.q.a.a(context, obtainStyledAttributes, a.a.j.TextAppearance_android_textColor);
            obtainStyledAttributes.recycle();
            if (h2.hasValue(b.c.a.d.k.TabLayout_tabTextColor)) {
                this.k = b.c.a.d.q.a.a(context, h2, b.c.a.d.k.TabLayout_tabTextColor);
            }
            if (h2.hasValue(b.c.a.d.k.TabLayout_tabSelectedTextColor)) {
                this.k = m(this.k.getDefaultColor(), h2.getColor(b.c.a.d.k.TabLayout_tabSelectedTextColor, 0));
            }
            this.l = b.c.a.d.q.a.a(context, h2, b.c.a.d.k.TabLayout_tabIconTint);
            this.o = l.b(h2.getInt(b.c.a.d.k.TabLayout_tabIconTintMode, -1), (PorterDuff.Mode) null);
            this.m = b.c.a.d.q.a.a(context, h2, b.c.a.d.k.TabLayout_tabRippleColor);
            this.y = h2.getInt(b.c.a.d.k.TabLayout_tabIndicatorAnimationDuration, 300);
            this.t = h2.getDimensionPixelSize(b.c.a.d.k.TabLayout_tabMinWidth, -1);
            this.u = h2.getDimensionPixelSize(b.c.a.d.k.TabLayout_tabMaxWidth, -1);
            this.r = h2.getResourceId(b.c.a.d.k.TabLayout_tabBackground, 0);
            this.w = h2.getDimensionPixelSize(b.c.a.d.k.TabLayout_tabContentStart, 0);
            this.A = h2.getInt(b.c.a.d.k.TabLayout_tabMode, 1);
            this.x = h2.getInt(b.c.a.d.k.TabLayout_tabGravity, 0);
            this.B = h2.getBoolean(b.c.a.d.k.TabLayout_tabInlineLabel, false);
            this.D = h2.getBoolean(b.c.a.d.k.TabLayout_tabUnboundedRipple, false);
            h2.recycle();
            Resources resources = getResources();
            this.q = (float) resources.getDimensionPixelSize(b.c.a.d.d.design_tab_text_size_2line);
            this.v = resources.getDimensionPixelSize(b.c.a.d.d.design_tab_scrollable_min_width);
            j();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        h(view);
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        h(view);
    }

    public void setSelectedTabIndicator(int i2) {
        if (i2 != 0) {
            setSelectedTabIndicator(a.a.k.a.a.d(getContext(), i2));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    public void setTabTextColors(int i2, int i3) {
        setTabTextColors(m(i2, i3));
    }
}
