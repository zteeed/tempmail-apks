package a.p;

import a.h.k.t;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* compiled from: ChangeBounds */
public class c extends m {
    private static final String[] N = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property<Drawable, PointF> O = new b(PointF.class, "boundsOrigin");
    private static final Property<k, PointF> P = new C0026c(PointF.class, "topLeft");
    private static final Property<k, PointF> Q = new d(PointF.class, "bottomRight");
    private static final Property<View, PointF> R = new e(PointF.class, "bottomRight");
    private static final Property<View, PointF> S = new f(PointF.class, "topLeft");
    private static final Property<View, PointF> T = new g(PointF.class, "position");
    private static k U = new k();
    private int[] K = new int[2];
    private boolean L = false;
    private boolean M = false;

    /* compiled from: ChangeBounds */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f491a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BitmapDrawable f492b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f493c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f494d;

        a(c cVar, ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f2) {
            this.f491a = viewGroup;
            this.f492b = bitmapDrawable;
            this.f493c = view;
            this.f494d = f2;
        }

        public void onAnimationEnd(Animator animator) {
            d0.c(this.f491a).b(this.f492b);
            d0.h(this.f493c, this.f494d);
        }
    }

    /* compiled from: ChangeBounds */
    static class b extends Property<Drawable, PointF> {

        /* renamed from: a  reason: collision with root package name */
        private Rect f495a = new Rect();

        b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f495a);
            Rect rect = this.f495a;
            return new PointF((float) rect.left, (float) rect.top);
        }

        /* renamed from: b */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f495a);
            this.f495a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f495a);
        }
    }

    /* renamed from: a.p.c$c  reason: collision with other inner class name */
    /* compiled from: ChangeBounds */
    static class C0026c extends Property<k, PointF> {
        C0026c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(k kVar) {
            return null;
        }

        /* renamed from: b */
        public void set(k kVar, PointF pointF) {
            kVar.c(pointF);
        }
    }

    /* compiled from: ChangeBounds */
    static class d extends Property<k, PointF> {
        d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(k kVar) {
            return null;
        }

        /* renamed from: b */
        public void set(k kVar, PointF pointF) {
            kVar.a(pointF);
        }
    }

    /* compiled from: ChangeBounds */
    static class e extends Property<View, PointF> {
        e(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            d0.g(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* compiled from: ChangeBounds */
    static class f extends Property<View, PointF> {
        f(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            d0.g(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* compiled from: ChangeBounds */
    static class g extends Property<View, PointF> {
        g(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            d0.g(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* compiled from: ChangeBounds */
    class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f496a;
        private k mViewBounds = this.f496a;

        h(c cVar, k kVar) {
            this.f496a = kVar;
        }
    }

    /* compiled from: ChangeBounds */
    class i extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private boolean f497a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f498b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Rect f499c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f500d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f501e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f502f;
        final /* synthetic */ int g;

        i(c cVar, View view, Rect rect, int i, int i2, int i3, int i4) {
            this.f498b = view;
            this.f499c = rect;
            this.f500d = i;
            this.f501e = i2;
            this.f502f = i3;
            this.g = i4;
        }

        public void onAnimationCancel(Animator animator) {
            this.f497a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f497a) {
                t.e0(this.f498b, this.f499c);
                d0.g(this.f498b, this.f500d, this.f501e, this.f502f, this.g);
            }
        }
    }

    /* compiled from: ChangeBounds */
    class j extends n {

        /* renamed from: a  reason: collision with root package name */
        boolean f503a = false;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup f504b;

        j(c cVar, ViewGroup viewGroup) {
            this.f504b = viewGroup;
        }

        public void b(m mVar) {
            x.b(this.f504b, false);
        }

        public void c(m mVar) {
            if (!this.f503a) {
                x.b(this.f504b, false);
            }
            mVar.b0(this);
        }

        public void d(m mVar) {
            x.b(this.f504b, true);
        }
    }

    /* compiled from: ChangeBounds */
    private static class k {

        /* renamed from: a  reason: collision with root package name */
        private int f505a;

        /* renamed from: b  reason: collision with root package name */
        private int f506b;

        /* renamed from: c  reason: collision with root package name */
        private int f507c;

        /* renamed from: d  reason: collision with root package name */
        private int f508d;

        /* renamed from: e  reason: collision with root package name */
        private View f509e;

        /* renamed from: f  reason: collision with root package name */
        private int f510f;
        private int g;

        k(View view) {
            this.f509e = view;
        }

        private void b() {
            d0.g(this.f509e, this.f505a, this.f506b, this.f507c, this.f508d);
            this.f510f = 0;
            this.g = 0;
        }

        /* access modifiers changed from: package-private */
        public void a(PointF pointF) {
            this.f507c = Math.round(pointF.x);
            this.f508d = Math.round(pointF.y);
            int i = this.g + 1;
            this.g = i;
            if (this.f510f == i) {
                b();
            }
        }

        /* access modifiers changed from: package-private */
        public void c(PointF pointF) {
            this.f505a = Math.round(pointF.x);
            this.f506b = Math.round(pointF.y);
            int i = this.f510f + 1;
            this.f510f = i;
            if (i == this.g) {
                b();
            }
        }
    }

    private void o0(s sVar) {
        View view = sVar.f585b;
        if (t.I(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            sVar.f584a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            sVar.f584a.put("android:changeBounds:parent", sVar.f585b.getParent());
            if (this.M) {
                sVar.f585b.getLocationInWindow(this.K);
                sVar.f584a.put("android:changeBounds:windowX", Integer.valueOf(this.K[0]));
                sVar.f584a.put("android:changeBounds:windowY", Integer.valueOf(this.K[1]));
            }
            if (this.L) {
                sVar.f584a.put("android:changeBounds:clip", t.m(view));
            }
        }
    }

    private boolean p0(View view, View view2) {
        if (!this.M) {
            return true;
        }
        s y = y(view, true);
        if (y == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == y.f585b) {
            return true;
        }
        return false;
    }

    public String[] P() {
        return N;
    }

    public void g(s sVar) {
        o0(sVar);
    }

    public void k(s sVar) {
        o0(sVar);
    }

    public Animator p(ViewGroup viewGroup, s sVar, s sVar2) {
        int i2;
        View view;
        Animator animator;
        ObjectAnimator objectAnimator;
        int i3;
        Rect rect;
        ObjectAnimator objectAnimator2;
        s sVar3 = sVar;
        s sVar4 = sVar2;
        if (sVar3 == null || sVar4 == null) {
            return null;
        }
        Map<String, Object> map = sVar3.f584a;
        Map<String, Object> map2 = sVar4.f584a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = sVar4.f585b;
        if (p0(viewGroup2, viewGroup3)) {
            Rect rect2 = (Rect) sVar3.f584a.get("android:changeBounds:bounds");
            Rect rect3 = (Rect) sVar4.f584a.get("android:changeBounds:bounds");
            int i4 = rect2.left;
            int i5 = rect3.left;
            int i6 = rect2.top;
            int i7 = rect3.top;
            int i8 = rect2.right;
            int i9 = rect3.right;
            int i10 = rect2.bottom;
            int i11 = rect3.bottom;
            int i12 = i8 - i4;
            int i13 = i10 - i6;
            int i14 = i9 - i5;
            int i15 = i11 - i7;
            View view3 = view2;
            Rect rect4 = (Rect) sVar3.f584a.get("android:changeBounds:clip");
            Rect rect5 = (Rect) sVar4.f584a.get("android:changeBounds:clip");
            if ((i12 == 0 || i13 == 0) && (i14 == 0 || i15 == 0)) {
                i2 = 0;
            } else {
                i2 = (i4 == i5 && i6 == i7) ? 0 : 1;
                if (!(i8 == i9 && i10 == i11)) {
                    i2++;
                }
            }
            if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
                i2++;
            }
            if (i2 <= 0) {
                return null;
            }
            Rect rect6 = rect5;
            Rect rect7 = rect4;
            if (!this.L) {
                view = view3;
                d0.g(view, i4, i6, i8, i10);
                if (i2 == 2) {
                    if (i12 == i14 && i13 == i15) {
                        animator = f.a(view, T, C().a((float) i4, (float) i6, (float) i5, (float) i7));
                    } else {
                        k kVar = new k(view);
                        ObjectAnimator a2 = f.a(kVar, P, C().a((float) i4, (float) i6, (float) i5, (float) i7));
                        ObjectAnimator a3 = f.a(kVar, Q, C().a((float) i8, (float) i10, (float) i9, (float) i11));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(new Animator[]{a2, a3});
                        animatorSet.addListener(new h(this, kVar));
                        animator = animatorSet;
                    }
                } else if (i4 == i5 && i6 == i7) {
                    animator = f.a(view, R, C().a((float) i8, (float) i10, (float) i9, (float) i11));
                } else {
                    animator = f.a(view, S, C().a((float) i4, (float) i6, (float) i5, (float) i7));
                }
            } else {
                view = view3;
                d0.g(view, i4, i6, Math.max(i12, i14) + i4, Math.max(i13, i15) + i6);
                if (i4 == i5 && i6 == i7) {
                    objectAnimator = null;
                } else {
                    objectAnimator = f.a(view, T, C().a((float) i4, (float) i6, (float) i5, (float) i7));
                }
                if (rect7 == null) {
                    i3 = 0;
                    rect = new Rect(0, 0, i12, i13);
                } else {
                    i3 = 0;
                    rect = rect7;
                }
                Rect rect8 = rect6 == null ? new Rect(i3, i3, i14, i15) : rect6;
                if (!rect.equals(rect8)) {
                    t.e0(view, rect);
                    k kVar2 = U;
                    Object[] objArr = new Object[2];
                    objArr[i3] = rect;
                    objArr[1] = rect8;
                    ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", kVar2, objArr);
                    ofObject.addListener(new i(this, view, rect6, i5, i7, i9, i11));
                    objectAnimator2 = ofObject;
                } else {
                    objectAnimator2 = null;
                }
                animator = r.c(objectAnimator, objectAnimator2);
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                x.b(viewGroup4, true);
                b(new j(this, viewGroup4));
            }
            return animator;
        }
        int intValue = ((Integer) sVar3.f584a.get("android:changeBounds:windowX")).intValue();
        int intValue2 = ((Integer) sVar3.f584a.get("android:changeBounds:windowY")).intValue();
        int intValue3 = ((Integer) sVar4.f584a.get("android:changeBounds:windowX")).intValue();
        int intValue4 = ((Integer) sVar4.f584a.get("android:changeBounds:windowY")).intValue();
        if (intValue == intValue3 && intValue2 == intValue4) {
            return null;
        }
        viewGroup.getLocationInWindow(this.K);
        Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
        view2.draw(new Canvas(createBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
        float d2 = d0.d(view2);
        d0.h(view2, 0.0f);
        d0.c(viewGroup).a(bitmapDrawable);
        g C = C();
        int[] iArr = this.K;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, new PropertyValuesHolder[]{i.a(O, C.a((float) (intValue - iArr[0]), (float) (intValue2 - iArr[1]), (float) (intValue3 - iArr[0]), (float) (intValue4 - iArr[1])))});
        ofPropertyValuesHolder.addListener(new a(this, viewGroup, bitmapDrawable, view2, d2));
        return ofPropertyValuesHolder;
    }
}
