package com.google.android.material.bottomappbar;

import a.h.k.u;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import b.c.a.d.j;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.k;
import java.util.ArrayList;
import java.util.List;

public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {
    private final int Q;
    /* access modifiers changed from: private */
    public final b.c.a.d.t.c R;
    /* access modifiers changed from: private */
    public final a S;
    /* access modifiers changed from: private */
    public Animator T;
    /* access modifiers changed from: private */
    public Animator U;
    /* access modifiers changed from: private */
    public Animator V;
    /* access modifiers changed from: private */
    public int W;
    private boolean a0;
    /* access modifiers changed from: private */
    public boolean b0;
    AnimatorListenerAdapter c0;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        int f10870d;

        /* renamed from: e  reason: collision with root package name */
        boolean f10871e;

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

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f10870d);
            parcel.writeInt(this.f10871e ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f10870d = parcel.readInt();
            this.f10871e = parcel.readInt() != 0;
        }
    }

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationEnd(Animator animator) {
            Animator unused = BottomAppBar.this.U = null;
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BottomAppBar.this.S.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
            BottomAppBar.this.R.invalidateSelf();
        }
    }

    class c extends AnimatorListenerAdapter {
        c() {
        }

        public void onAnimationEnd(Animator animator) {
            Animator unused = BottomAppBar.this.V = null;
        }
    }

    class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public boolean f10875a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ActionMenuView f10876b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f10877c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f10878d;

        d(ActionMenuView actionMenuView, int i, boolean z) {
            this.f10876b = actionMenuView;
            this.f10877c = i;
            this.f10878d = z;
        }

        public void onAnimationCancel(Animator animator) {
            this.f10875a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f10875a) {
                BottomAppBar.this.p0(this.f10876b, this.f10877c, this.f10878d);
            }
        }
    }

    class e extends AnimatorListenerAdapter {
        e() {
        }

        public void onAnimationEnd(Animator animator) {
            Animator unused = BottomAppBar.this.T = null;
        }
    }

    class f implements ValueAnimator.AnimatorUpdateListener {
        f() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BottomAppBar.this.R.o(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    class g extends AnimatorListenerAdapter {
        g() {
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.k0(bottomAppBar.b0);
            BottomAppBar bottomAppBar2 = BottomAppBar.this;
            bottomAppBar2.l0(bottomAppBar2.W, BottomAppBar.this.b0);
        }
    }

    public BottomAppBar(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    /* access modifiers changed from: private */
    public void Y(FloatingActionButton floatingActionButton) {
        n0(floatingActionButton);
        floatingActionButton.e(this.c0);
        floatingActionButton.f(this.c0);
    }

    private void Z() {
        Animator animator = this.T;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.V;
        if (animator2 != null) {
            animator2.cancel();
        }
        Animator animator3 = this.U;
        if (animator3 != null) {
            animator3.cancel();
        }
    }

    private void a0(boolean z, List<Animator> list) {
        if (z) {
            this.S.k(getFabTranslationX());
        }
        float[] fArr = new float[2];
        fArr[0] = this.R.h();
        fArr[1] = z ? 1.0f : 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.addUpdateListener(new f());
        ofFloat.setDuration(300);
        list.add(ofFloat);
    }

    private void b0(int i, List<Animator> list) {
        if (this.b0) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.S.f(), (float) g0(i)});
            ofFloat.addUpdateListener(new b());
            ofFloat.setDuration(300);
            list.add(ofFloat);
        }
    }

    private void c0(int i, List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(f0(), "translationX", new float[]{(float) g0(i)});
        ofFloat.setDuration(300);
        list.add(ofFloat);
    }

    private void d0(boolean z, List<Animator> list) {
        FloatingActionButton f0 = f0();
        if (f0 != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(f0, "translationY", new float[]{h0(z)});
            ofFloat.setDuration(300);
            list.add(ofFloat);
        }
    }

    private void e0(int i, boolean z, List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{1.0f});
            if ((this.b0 || (z && j0())) && (this.W == 1 || i == 1)) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{0.0f});
                ofFloat2.addListener(new d(actionMenuView, i, z));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(150);
                animatorSet.playSequentially(new Animator[]{ofFloat2, ofFloat});
                list.add(animatorSet);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                list.add(ofFloat);
            }
        }
    }

    /* access modifiers changed from: private */
    public FloatingActionButton f0() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View next : ((CoordinatorLayout) getParent()).w(this)) {
            if (next instanceof FloatingActionButton) {
                return (FloatingActionButton) next;
            }
        }
        return null;
    }

    private int g0(int i) {
        int i2 = 1;
        boolean z = u.t(this) == 1;
        if (i != 1) {
            return 0;
        }
        int measuredWidth = (getMeasuredWidth() / 2) - this.Q;
        if (z) {
            i2 = -1;
        }
        return measuredWidth * i2;
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    private float getFabTranslationX() {
        return (float) g0(this.W);
    }

    /* access modifiers changed from: private */
    public float getFabTranslationY() {
        return h0(this.b0);
    }

    private float h0(boolean z) {
        FloatingActionButton f0 = f0();
        if (f0 == null) {
            return 0.0f;
        }
        Rect rect = new Rect();
        f0.h(rect);
        float height = (float) rect.height();
        if (height == 0.0f) {
            height = (float) f0.getMeasuredHeight();
        }
        float height2 = (float) (f0.getHeight() - rect.height());
        float height3 = (-getCradleVerticalOffset()) + (height / 2.0f) + ((float) (f0.getHeight() - rect.bottom));
        float paddingBottom = height2 - ((float) f0.getPaddingBottom());
        float f2 = (float) (-getMeasuredHeight());
        if (!z) {
            height3 = paddingBottom;
        }
        return f2 + height3;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.V;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        r0 = r1.U;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean i0() {
        /*
            r1 = this;
            android.animation.Animator r0 = r1.T
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto L_0x001e
        L_0x000a:
            android.animation.Animator r0 = r1.V
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto L_0x001e
        L_0x0014:
            android.animation.Animator r0 = r1.U
            if (r0 == 0) goto L_0x0020
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x0020
        L_0x001e:
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.i0():boolean");
    }

    private boolean j0() {
        FloatingActionButton f0 = f0();
        return f0 != null && f0.l();
    }

    /* access modifiers changed from: private */
    public void k0(boolean z) {
        if (u.I(this)) {
            Animator animator = this.T;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            a0(z && j0(), arrayList);
            d0(z, arrayList);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.T = animatorSet;
            animatorSet.addListener(new e());
            this.T.start();
        }
    }

    /* access modifiers changed from: private */
    public void l0(int i, boolean z) {
        if (u.I(this)) {
            Animator animator = this.V;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (!j0()) {
                i = 0;
                z = false;
            }
            e0(i, z, arrayList);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.V = animatorSet;
            animatorSet.addListener(new c());
            this.V.start();
        }
    }

    private void m0(int i) {
        if (this.W != i && u.I(this)) {
            Animator animator = this.U;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            b0(i, arrayList);
            c0(i, arrayList);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.U = animatorSet;
            animatorSet.addListener(new a());
            this.U.start();
        }
    }

    private void n0(FloatingActionButton floatingActionButton) {
        floatingActionButton.o(this.c0);
        floatingActionButton.p(this.c0);
    }

    /* access modifiers changed from: private */
    public void o0() {
        this.S.k(getFabTranslationX());
        FloatingActionButton f0 = f0();
        this.R.o((!this.b0 || !j0()) ? 0.0f : 1.0f);
        if (f0 != null) {
            f0.setTranslationY(getFabTranslationY());
            f0.setTranslationX(getFabTranslationX());
        }
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            actionMenuView.setAlpha(1.0f);
            if (!j0()) {
                p0(actionMenuView, 0, false);
            } else {
                p0(actionMenuView, this.W, this.b0);
            }
        }
    }

    /* access modifiers changed from: private */
    public void p0(ActionMenuView actionMenuView, int i, boolean z) {
        boolean z2 = u.t(this) == 1;
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if ((childAt.getLayoutParams() instanceof Toolbar.e) && (((Toolbar.e) childAt.getLayoutParams()).f726a & 8388615) == 8388611) {
                i2 = Math.max(i2, z2 ? childAt.getLeft() : childAt.getRight());
            }
        }
        actionMenuView.setTranslationX((i != 1 || !z) ? 0.0f : (float) (i2 - (z2 ? actionMenuView.getRight() : actionMenuView.getLeft())));
    }

    public ColorStateList getBackgroundTint() {
        return this.R.k();
    }

    public CoordinatorLayout.c<BottomAppBar> getBehavior() {
        return new Behavior();
    }

    public float getCradleVerticalOffset() {
        return this.S.b();
    }

    public int getFabAlignmentMode() {
        return this.W;
    }

    public float getFabCradleMargin() {
        return this.S.c();
    }

    public float getFabCradleRoundedCornerRadius() {
        return this.S.d();
    }

    public boolean getHideOnScroll() {
        return this.a0;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Z();
        o0();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        this.W = savedState.f10870d;
        this.b0 = savedState.f10871e;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f10870d = this.W;
        savedState.f10871e = this.b0;
        return savedState;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        androidx.core.graphics.drawable.a.o(this.R, colorStateList);
    }

    public void setCradleVerticalOffset(float f2) {
        if (f2 != getCradleVerticalOffset()) {
            this.S.g(f2);
            this.R.invalidateSelf();
        }
    }

    public void setFabAlignmentMode(int i) {
        m0(i);
        l0(i, this.b0);
        this.W = i;
    }

    public void setFabCradleMargin(float f2) {
        if (f2 != getFabCradleMargin()) {
            this.S.h(f2);
            this.R.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f2) {
        if (f2 != getFabCradleRoundedCornerRadius()) {
            this.S.i(f2);
            this.R.invalidateSelf();
        }
    }

    /* access modifiers changed from: package-private */
    public void setFabDiameter(int i) {
        float f2 = (float) i;
        if (f2 != this.S.e()) {
            this.S.j(f2);
            this.R.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.a0 = z;
    }

    public void setSubtitle(CharSequence charSequence) {
    }

    public void setTitle(CharSequence charSequence) {
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: d  reason: collision with root package name */
        private final Rect f10869d = new Rect();

        public Behavior() {
        }

        private boolean L(FloatingActionButton floatingActionButton, BottomAppBar bottomAppBar) {
            ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).f1273d = 17;
            bottomAppBar.Y(floatingActionButton);
            return true;
        }

        /* renamed from: H */
        public boolean l(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i) {
            FloatingActionButton M = bottomAppBar.f0();
            if (M != null) {
                L(M, bottomAppBar);
                M.i(this.f10869d);
                bottomAppBar.setFabDiameter(this.f10869d.height());
            }
            if (!bottomAppBar.i0()) {
                bottomAppBar.o0();
            }
            coordinatorLayout.M(bottomAppBar, i);
            return super.l(coordinatorLayout, bottomAppBar, i);
        }

        /* renamed from: I */
        public boolean z(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i, int i2) {
            return bottomAppBar.getHideOnScroll() && super.z(coordinatorLayout, bottomAppBar, view, view2, i, i2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: J */
        public void F(BottomAppBar bottomAppBar) {
            super.F(bottomAppBar);
            FloatingActionButton M = bottomAppBar.f0();
            if (M != null) {
                M.h(this.f10869d);
                M.clearAnimation();
                M.animate().translationY(((float) (-M.getPaddingBottom())) + ((float) (M.getMeasuredHeight() - this.f10869d.height()))).setInterpolator(b.c.a.d.l.a.f2365c).setDuration(175);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: K */
        public void G(BottomAppBar bottomAppBar) {
            super.G(bottomAppBar);
            FloatingActionButton M = bottomAppBar.f0();
            if (M != null) {
                M.clearAnimation();
                M.animate().translationY(bottomAppBar.getFabTranslationY()).setInterpolator(b.c.a.d.l.a.f2366d).setDuration(225);
            }
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public BottomAppBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.c.a.d.b.bottomAppBarStyle);
    }

    public BottomAppBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b0 = true;
        this.c0 = new g();
        TypedArray h = k.h(context, attributeSet, b.c.a.d.k.BottomAppBar, i, j.Widget_MaterialComponents_BottomAppBar, new int[0]);
        ColorStateList a2 = b.c.a.d.q.a.a(context, h, b.c.a.d.k.BottomAppBar_backgroundTint);
        this.W = h.getInt(b.c.a.d.k.BottomAppBar_fabAlignmentMode, 0);
        this.a0 = h.getBoolean(b.c.a.d.k.BottomAppBar_hideOnScroll, false);
        h.recycle();
        this.Q = getResources().getDimensionPixelOffset(b.c.a.d.d.mtrl_bottomappbar_fabOffsetEndMode);
        this.S = new a((float) h.getDimensionPixelOffset(b.c.a.d.k.BottomAppBar_fabCradleMargin, 0), (float) h.getDimensionPixelOffset(b.c.a.d.k.BottomAppBar_fabCradleRoundedCornerRadius, 0), (float) h.getDimensionPixelOffset(b.c.a.d.k.BottomAppBar_fabCradleVerticalOffset, 0));
        b.c.a.d.t.e eVar = new b.c.a.d.t.e();
        eVar.i(this.S);
        b.c.a.d.t.c cVar = new b.c.a.d.t.c(eVar);
        this.R = cVar;
        cVar.q(true);
        this.R.p(Paint.Style.FILL);
        androidx.core.graphics.drawable.a.o(this.R, a2);
        u.b0(this, this.R);
    }
}
