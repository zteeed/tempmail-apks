package com.google.android.material.transformation;

import a.h.k.t;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.c.a.d.f;
import b.c.a.d.l.h;
import b.c.a.d.l.i;
import b.c.a.d.l.j;
import com.google.android.material.circularreveal.c;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;

public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c  reason: collision with root package name */
    private final Rect f10962c = new Rect();

    /* renamed from: d  reason: collision with root package name */
    private final RectF f10963d = new RectF();

    /* renamed from: e  reason: collision with root package name */
    private final RectF f10964e = new RectF();

    /* renamed from: f  reason: collision with root package name */
    private final int[] f10965f = new int[2];

    class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f10966a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f10967b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f10968c;

        a(FabTransformationBehavior fabTransformationBehavior, boolean z, View view, View view2) {
            this.f10966a = z;
            this.f10967b = view;
            this.f10968c = view2;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f10966a) {
                this.f10967b.setVisibility(4);
                this.f10968c.setAlpha(1.0f);
                this.f10968c.setVisibility(0);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.f10966a) {
                this.f10967b.setVisibility(0);
                this.f10968c.setAlpha(0.0f);
                this.f10968c.setVisibility(4);
            }
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f10969a;

        b(FabTransformationBehavior fabTransformationBehavior, View view) {
            this.f10969a = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f10969a.invalidate();
        }
    }

    class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.google.android.material.circularreveal.c f10970a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Drawable f10971b;

        c(FabTransformationBehavior fabTransformationBehavior, com.google.android.material.circularreveal.c cVar, Drawable drawable) {
            this.f10970a = cVar;
            this.f10971b = drawable;
        }

        public void onAnimationEnd(Animator animator) {
            this.f10970a.setCircularRevealOverlayDrawable((Drawable) null);
        }

        public void onAnimationStart(Animator animator) {
            this.f10970a.setCircularRevealOverlayDrawable(this.f10971b);
        }
    }

    class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.google.android.material.circularreveal.c f10972a;

        d(FabTransformationBehavior fabTransformationBehavior, com.google.android.material.circularreveal.c cVar) {
            this.f10972a = cVar;
        }

        public void onAnimationEnd(Animator animator) {
            c.e revealInfo = this.f10972a.getRevealInfo();
            revealInfo.f10781c = Float.MAX_VALUE;
            this.f10972a.setRevealInfo(revealInfo);
        }
    }

    protected static class e {

        /* renamed from: a  reason: collision with root package name */
        public h f10973a;

        /* renamed from: b  reason: collision with root package name */
        public j f10974b;

        protected e() {
        }
    }

    public FabTransformationBehavior() {
    }

    private ViewGroup J(View view) {
        View findViewById = view.findViewById(f.mtrl_child_content_container);
        if (findViewById != null) {
            return b0(findViewById);
        }
        if ((view instanceof TransformationChildLayout) || (view instanceof TransformationChildCard)) {
            return b0(((ViewGroup) view).getChildAt(0));
        }
        return b0(view);
    }

    private void K(View view, e eVar, i iVar, i iVar2, float f2, float f3, float f4, float f5, RectF rectF) {
        float P = P(eVar, iVar, f2, f4);
        float P2 = P(eVar, iVar2, f3, f5);
        Rect rect = this.f10962c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f10963d;
        rectF2.set(rect);
        RectF rectF3 = this.f10964e;
        Q(view, rectF3);
        rectF3.offset(P, P2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    private float L(View view, View view2, j jVar) {
        RectF rectF = this.f10963d;
        RectF rectF2 = this.f10964e;
        Q(view, rectF);
        Q(view2, rectF2);
        rectF2.offset(-N(view, view2, jVar), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    private float M(View view, View view2, j jVar) {
        RectF rectF = this.f10963d;
        RectF rectF2 = this.f10964e;
        Q(view, rectF);
        Q(view2, rectF2);
        rectF2.offset(0.0f, -O(view, view2, jVar));
        return rectF.centerY() - rectF2.top;
    }

    private float N(View view, View view2, j jVar) {
        float f2;
        float f3;
        float f4;
        RectF rectF = this.f10963d;
        RectF rectF2 = this.f10964e;
        Q(view, rectF);
        Q(view2, rectF2);
        int i = jVar.f2284a & 7;
        if (i == 1) {
            f4 = rectF2.centerX();
            f3 = rectF.centerX();
        } else if (i == 3) {
            f4 = rectF2.left;
            f3 = rectF.left;
        } else if (i != 5) {
            f2 = 0.0f;
            return f2 + jVar.f2285b;
        } else {
            f4 = rectF2.right;
            f3 = rectF.right;
        }
        f2 = f4 - f3;
        return f2 + jVar.f2285b;
    }

    private float O(View view, View view2, j jVar) {
        float f2;
        float f3;
        float f4;
        RectF rectF = this.f10963d;
        RectF rectF2 = this.f10964e;
        Q(view, rectF);
        Q(view2, rectF2);
        int i = jVar.f2284a & 112;
        if (i == 16) {
            f4 = rectF2.centerY();
            f3 = rectF.centerY();
        } else if (i == 48) {
            f4 = rectF2.top;
            f3 = rectF.top;
        } else if (i != 80) {
            f2 = 0.0f;
            return f2 + jVar.f2286c;
        } else {
            f4 = rectF2.bottom;
            f3 = rectF.bottom;
        }
        f2 = f4 - f3;
        return f2 + jVar.f2286c;
    }

    private float P(e eVar, i iVar, float f2, float f3) {
        long c2 = iVar.c();
        long d2 = iVar.d();
        i e2 = eVar.f10973a.e("expansion");
        return b.c.a.d.l.a.a(f2, f3, iVar.e().getInterpolation(((float) (((e2.c() + e2.d()) + 17) - c2)) / ((float) d2)));
    }

    private void Q(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.f10965f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    private void R(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup J;
        ObjectAnimator objectAnimator;
        if (view2 instanceof ViewGroup) {
            if ((!(view2 instanceof com.google.android.material.circularreveal.c) || com.google.android.material.circularreveal.b.j != 0) && (J = J(view2)) != null) {
                if (z) {
                    if (!z2) {
                        b.c.a.d.l.d.f2271a.set(J, Float.valueOf(0.0f));
                    }
                    objectAnimator = ObjectAnimator.ofFloat(J, b.c.a.d.l.d.f2271a, new float[]{1.0f});
                } else {
                    objectAnimator = ObjectAnimator.ofFloat(J, b.c.a.d.l.d.f2271a, new float[]{0.0f});
                }
                eVar.f10973a.e("contentFade").a(objectAnimator);
                list.add(objectAnimator);
            }
        }
    }

    private void S(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if (view2 instanceof com.google.android.material.circularreveal.c) {
            com.google.android.material.circularreveal.c cVar = (com.google.android.material.circularreveal.c) view2;
            int Z = Z(view);
            int i = 16777215 & Z;
            if (z) {
                if (!z2) {
                    cVar.setCircularRevealScrimColor(Z);
                }
                objectAnimator = ObjectAnimator.ofInt(cVar, c.d.f10778a, new int[]{i});
            } else {
                objectAnimator = ObjectAnimator.ofInt(cVar, c.d.f10778a, new int[]{Z});
            }
            objectAnimator.setEvaluator(b.c.a.d.l.c.b());
            eVar.f10973a.e("color").a(objectAnimator);
            list.add(objectAnimator);
        }
    }

    @TargetApi(21)
    private void T(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        float o = t.o(view2) - t.o(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-o);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{0.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{-o});
        }
        eVar.f10973a.e("elevation").a(objectAnimator);
        list.add(objectAnimator);
    }

    private void U(View view, View view2, boolean z, boolean z2, e eVar, float f2, float f3, List<Animator> list, List<Animator.AnimatorListener> list2) {
        Animator animator;
        View view3 = view;
        View view4 = view2;
        e eVar2 = eVar;
        if (view4 instanceof com.google.android.material.circularreveal.c) {
            com.google.android.material.circularreveal.c cVar = (com.google.android.material.circularreveal.c) view4;
            float L = L(view3, view4, eVar2.f10974b);
            float M = M(view3, view4, eVar2.f10974b);
            ((FloatingActionButton) view3).h(this.f10962c);
            float width = ((float) this.f10962c.width()) / 2.0f;
            i e2 = eVar2.f10973a.e("expansion");
            if (z) {
                if (!z2) {
                    cVar.setRevealInfo(new c.e(L, M, width));
                }
                if (z2) {
                    width = cVar.getRevealInfo().f10781c;
                }
                animator = com.google.android.material.circularreveal.a.a(cVar, L, M, b.c.a.d.p.a.b(L, M, 0.0f, 0.0f, f2, f3));
                animator.addListener(new d(this, cVar));
                X(view2, e2.c(), (int) L, (int) M, width, list);
            } else {
                float f4 = cVar.getRevealInfo().f10781c;
                Animator a2 = com.google.android.material.circularreveal.a.a(cVar, L, M, width);
                int i = (int) L;
                int i2 = (int) M;
                View view5 = view2;
                X(view5, e2.c(), i, i2, f4, list);
                long c2 = e2.c();
                long d2 = e2.d();
                long f5 = eVar2.f10973a.f();
                W(view5, c2, d2, f5, i, i2, width, list);
                animator = a2;
            }
            e2.a(animator);
            list.add(animator);
            list2.add(com.google.android.material.circularreveal.a.b(cVar));
        }
    }

    private void V(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if ((view2 instanceof com.google.android.material.circularreveal.c) && (view instanceof ImageView)) {
            com.google.android.material.circularreveal.c cVar = (com.google.android.material.circularreveal.c) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (z) {
                    if (!z2) {
                        drawable.setAlpha(255);
                    }
                    objectAnimator = ObjectAnimator.ofInt(drawable, b.c.a.d.l.e.f2272b, new int[]{0});
                } else {
                    objectAnimator = ObjectAnimator.ofInt(drawable, b.c.a.d.l.e.f2272b, new int[]{255});
                }
                objectAnimator.addUpdateListener(new b(this, view2));
                eVar.f10973a.e("iconFade").a(objectAnimator);
                list.add(objectAnimator);
                list2.add(new c(this, cVar, drawable));
            }
        }
    }

    private void W(View view, long j, long j2, long j3, int i, int i2, float f2, List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21) {
            long j4 = j + j2;
            if (j4 < j3) {
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f2, f2);
                createCircularReveal.setStartDelay(j4);
                createCircularReveal.setDuration(j3 - j4);
                list.add(createCircularReveal);
            }
        }
    }

    private void X(View view, long j, int i, int i2, float f2, List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21 && j > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f2, f2);
            createCircularReveal.setStartDelay(0);
            createCircularReveal.setDuration(j);
            list.add(createCircularReveal);
        }
    }

    private void Y(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2, RectF rectF) {
        i iVar;
        i iVar2;
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        int i;
        View view3 = view;
        View view4 = view2;
        e eVar2 = eVar;
        List<Animator> list3 = list;
        float N = N(view3, view4, eVar2.f10974b);
        float O = O(view3, view4, eVar2.f10974b);
        if (N == 0.0f || O == 0.0f) {
            iVar2 = eVar2.f10973a.e("translationXLinear");
            iVar = eVar2.f10973a.e("translationYLinear");
        } else if ((!z || O >= 0.0f) && (z || i <= 0)) {
            iVar2 = eVar2.f10973a.e("translationXCurveDownwards");
            iVar = eVar2.f10973a.e("translationYCurveDownwards");
        } else {
            iVar2 = eVar2.f10973a.e("translationXCurveUpwards");
            iVar = eVar2.f10973a.e("translationYCurveUpwards");
        }
        i iVar3 = iVar2;
        i iVar4 = iVar;
        if (z) {
            if (!z2) {
                view4.setTranslationX(-N);
                view4.setTranslationY(-O);
            }
            objectAnimator2 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_X, new float[]{0.0f});
            objectAnimator = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Y, new float[]{0.0f});
            K(view2, eVar, iVar3, iVar4, -N, -O, 0.0f, 0.0f, rectF);
        } else {
            objectAnimator2 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_X, new float[]{-N});
            objectAnimator = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Y, new float[]{-O});
        }
        iVar3.a(objectAnimator2);
        iVar4.a(objectAnimator);
        list3.add(objectAnimator2);
        list3.add(objectAnimator);
    }

    private int Z(View view) {
        ColorStateList k = t.k(view);
        if (k != null) {
            return k.getColorForState(view.getDrawableState(), k.getDefaultColor());
        }
        return 0;
    }

    private ViewGroup b0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public AnimatorSet I(View view, View view2, boolean z, boolean z2) {
        boolean z3 = z;
        e a0 = a0(view2.getContext(), z3);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (Build.VERSION.SDK_INT >= 21) {
            T(view, view2, z, z2, a0, arrayList, arrayList2);
        }
        RectF rectF = this.f10963d;
        View view3 = view;
        View view4 = view2;
        boolean z4 = z;
        boolean z5 = z2;
        e eVar = a0;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        Y(view3, view4, z4, z5, eVar, arrayList3, arrayList4, rectF);
        float width = rectF.width();
        float height = rectF.height();
        V(view3, view4, z4, z5, eVar, arrayList3, arrayList4);
        U(view3, view4, z4, z5, eVar, width, height, arrayList, arrayList2);
        ArrayList arrayList5 = arrayList;
        ArrayList arrayList6 = arrayList2;
        S(view3, view4, z4, z5, eVar, arrayList5, arrayList6);
        R(view3, view4, z4, z5, eVar, arrayList5, arrayList6);
        AnimatorSet animatorSet = new AnimatorSet();
        b.c.a.d.l.b.a(animatorSet, arrayList);
        animatorSet.addListener(new a(this, z3, view2, view));
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i));
        }
        return animatorSet;
    }

    /* access modifiers changed from: protected */
    public abstract e a0(Context context, boolean z);

    public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            if (expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId()) {
                return true;
            }
            return false;
        }
    }

    public void g(CoordinatorLayout.f fVar) {
        if (fVar.h == 0) {
            fVar.h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
