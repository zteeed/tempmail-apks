package androidx.fragment.app;

import a.h.k.t;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.g;
import androidx.lifecycle.r;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: FragmentManager */
final class h extends g implements LayoutInflater.Factory2 {
    static boolean F = false;
    static Field G;
    static final Interpolator H = new DecelerateInterpolator(2.5f);
    static final Interpolator I = new DecelerateInterpolator(1.5f);
    Bundle A = null;
    SparseArray<Parcelable> B = null;
    ArrayList<n> C;
    i D;
    Runnable E = new a();

    /* renamed from: b  reason: collision with root package name */
    ArrayList<l> f1496b;

    /* renamed from: c  reason: collision with root package name */
    boolean f1497c;

    /* renamed from: d  reason: collision with root package name */
    int f1498d = 0;

    /* renamed from: e  reason: collision with root package name */
    final ArrayList<Fragment> f1499e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    SparseArray<Fragment> f1500f;
    ArrayList<a> g;
    ArrayList<Fragment> h;
    ArrayList<a> i;
    ArrayList<Integer> j;
    ArrayList<g.b> k;
    private final CopyOnWriteArrayList<j> l = new CopyOnWriteArrayList<>();
    int m = 0;
    f n;
    d o;
    Fragment p;
    Fragment q;
    boolean r;
    boolean s;
    boolean t;
    boolean u;
    String v;
    boolean w;
    ArrayList<a> x;
    ArrayList<Boolean> y;
    ArrayList<Fragment> z;

    /* compiled from: FragmentManager */
    class a implements Runnable {
        a() {
        }

        public void run() {
            h.this.k0();
        }
    }

    /* compiled from: FragmentManager */
    class b extends f {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup f1502b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Fragment f1503c;

        /* compiled from: FragmentManager */
        class a implements Runnable {
            a() {
            }

            public void run() {
                if (b.this.f1503c.z() != null) {
                    b.this.f1503c.M1((View) null);
                    b bVar = b.this;
                    h hVar = h.this;
                    Fragment fragment = bVar.f1503c;
                    hVar.K0(fragment, fragment.g0(), 0, 0, false);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Animation.AnimationListener animationListener, ViewGroup viewGroup, Fragment fragment) {
            super(animationListener);
            this.f1502b = viewGroup;
            this.f1503c = fragment;
        }

        public void onAnimationEnd(Animation animation) {
            super.onAnimationEnd(animation);
            this.f1502b.post(new a());
        }
    }

    /* compiled from: FragmentManager */
    class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f1506a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f1507b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Fragment f1508c;

        c(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f1506a = viewGroup;
            this.f1507b = view;
            this.f1508c = fragment;
        }

        public void onAnimationEnd(Animator animator) {
            this.f1506a.endViewTransition(this.f1507b);
            Animator A = this.f1508c.A();
            this.f1508c.N1((Animator) null);
            if (A != null && this.f1506a.indexOfChild(this.f1507b) < 0) {
                h hVar = h.this;
                Fragment fragment = this.f1508c;
                hVar.K0(fragment, fragment.g0(), 0, 0, false);
            }
        }
    }

    /* compiled from: FragmentManager */
    class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f1510a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f1511b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Fragment f1512c;

        d(h hVar, ViewGroup viewGroup, View view, Fragment fragment) {
            this.f1510a = viewGroup;
            this.f1511b = view;
            this.f1512c = fragment;
        }

        public void onAnimationEnd(Animator animator) {
            this.f1510a.endViewTransition(this.f1511b);
            animator.removeListener(this);
            View view = this.f1512c.J;
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }

    /* compiled from: FragmentManager */
    private static class e extends f {

        /* renamed from: b  reason: collision with root package name */
        View f1513b;

        /* compiled from: FragmentManager */
        class a implements Runnable {
            a() {
            }

            public void run() {
                e.this.f1513b.setLayerType(0, (Paint) null);
            }
        }

        e(View view, Animation.AnimationListener animationListener) {
            super(animationListener);
            this.f1513b = view;
        }

        public void onAnimationEnd(Animation animation) {
            if (t.H(this.f1513b) || Build.VERSION.SDK_INT >= 24) {
                this.f1513b.post(new a());
            } else {
                this.f1513b.setLayerType(0, (Paint) null);
            }
            super.onAnimationEnd(animation);
        }
    }

    /* compiled from: FragmentManager */
    private static class f implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        private final Animation.AnimationListener f1515a;

        f(Animation.AnimationListener animationListener) {
            this.f1515a = animationListener;
        }

        public void onAnimationEnd(Animation animation) {
            Animation.AnimationListener animationListener = this.f1515a;
            if (animationListener != null) {
                animationListener.onAnimationEnd(animation);
            }
        }

        public void onAnimationRepeat(Animation animation) {
            Animation.AnimationListener animationListener = this.f1515a;
            if (animationListener != null) {
                animationListener.onAnimationRepeat(animation);
            }
        }

        public void onAnimationStart(Animation animation) {
            Animation.AnimationListener animationListener = this.f1515a;
            if (animationListener != null) {
                animationListener.onAnimationStart(animation);
            }
        }
    }

    /* renamed from: androidx.fragment.app.h$h  reason: collision with other inner class name */
    /* compiled from: FragmentManager */
    private static class C0045h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        View f1518a;

        C0045h(View view) {
            this.f1518a = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f1518a.setLayerType(0, (Paint) null);
            animator.removeListener(this);
        }

        public void onAnimationStart(Animator animator) {
            this.f1518a.setLayerType(2, (Paint) null);
        }
    }

    /* compiled from: FragmentManager */
    private static final class j {

        /* renamed from: a  reason: collision with root package name */
        final g.a f1524a;

        /* renamed from: b  reason: collision with root package name */
        final boolean f1525b;
    }

    /* compiled from: FragmentManager */
    static class k {

        /* renamed from: a  reason: collision with root package name */
        public static final int[] f1526a = {16842755, 16842960, 16842961};
    }

    /* compiled from: FragmentManager */
    interface l {
        boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* compiled from: FragmentManager */
    private class m implements l {

        /* renamed from: a  reason: collision with root package name */
        final String f1527a;

        /* renamed from: b  reason: collision with root package name */
        final int f1528b;

        /* renamed from: c  reason: collision with root package name */
        final int f1529c;

        m(String str, int i, int i2) {
            this.f1527a = str;
            this.f1528b = i;
            this.f1529c = i2;
        }

        public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
            g l1;
            Fragment fragment = h.this.q;
            if (fragment != null && this.f1528b < 0 && this.f1527a == null && (l1 = fragment.l1()) != null && l1.l()) {
                return false;
            }
            return h.this.O0(arrayList, arrayList2, this.f1527a, this.f1528b, this.f1529c);
        }
    }

    /* compiled from: FragmentManager */
    static class n implements Fragment.e {

        /* renamed from: a  reason: collision with root package name */
        final boolean f1531a;

        /* renamed from: b  reason: collision with root package name */
        final a f1532b;

        /* renamed from: c  reason: collision with root package name */
        private int f1533c;

        n(a aVar, boolean z) {
            this.f1531a = z;
            this.f1532b = aVar;
        }

        public void a() {
            this.f1533c++;
        }

        public void b() {
            int i = this.f1533c - 1;
            this.f1533c = i;
            if (i == 0) {
                this.f1532b.f1471a.b1();
            }
        }

        public void c() {
            a aVar = this.f1532b;
            aVar.f1471a.w(aVar, this.f1531a, false, false);
        }

        public void d() {
            boolean z = this.f1533c > 0;
            h hVar = this.f1532b.f1471a;
            int size = hVar.f1499e.size();
            for (int i = 0; i < size; i++) {
                Fragment fragment = hVar.f1499e.get(i);
                fragment.W1((Fragment.e) null);
                if (z && fragment.w0()) {
                    fragment.f2();
                }
            }
            a aVar = this.f1532b;
            aVar.f1471a.w(aVar, this.f1531a, !z, true);
        }

        public boolean e() {
            return this.f1533c == 0;
        }
    }

    static {
        new AccelerateInterpolator(2.5f);
        new AccelerateInterpolator(1.5f);
    }

    h() {
    }

    static g B0(Context context, float f2, float f3) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f2, f3);
        alphaAnimation.setInterpolator(I);
        alphaAnimation.setDuration(220);
        return new g((Animation) alphaAnimation);
    }

    static g D0(Context context, float f2, float f3, float f4, float f5) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f2, f3, f2, f3, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(H);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f4, f5);
        alphaAnimation.setInterpolator(I);
        alphaAnimation.setDuration(220);
        animationSet.addAnimation(alphaAnimation);
        return new g((Animation) animationSet);
    }

    private void E0(a.e.b<Fragment> bVar) {
        int size = bVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment s2 = bVar.s(i2);
            if (!s2.l) {
                View m0 = s2.m0();
                s2.Q = m0.getAlpha();
                m0.setAlpha(0.0f);
            }
        }
    }

    static boolean F0(Animator animator) {
        if (animator == null) {
            return false;
        }
        if (animator instanceof ValueAnimator) {
            PropertyValuesHolder[] values = ((ValueAnimator) animator).getValues();
            for (PropertyValuesHolder propertyName : values) {
                if ("alpha".equals(propertyName.getPropertyName())) {
                    return true;
                }
            }
        } else if (animator instanceof AnimatorSet) {
            ArrayList<Animator> childAnimations = ((AnimatorSet) animator).getChildAnimations();
            for (int i2 = 0; i2 < childAnimations.size(); i2++) {
                if (F0(childAnimations.get(i2))) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean G0(g gVar) {
        Animation animation = gVar.f1516a;
        if (animation instanceof AlphaAnimation) {
            return true;
        }
        if (!(animation instanceof AnimationSet)) {
            return F0(gVar.f1517b);
        }
        List<Animation> animations = ((AnimationSet) animation).getAnimations();
        for (int i2 = 0; i2 < animations.size(); i2++) {
            if (animations.get(i2) instanceof AlphaAnimation) {
                return true;
            }
        }
        return false;
    }

    private boolean N0(String str, int i2, int i3) {
        g l1;
        k0();
        i0(true);
        Fragment fragment = this.q;
        if (fragment != null && i2 < 0 && str == null && (l1 = fragment.l1()) != null && l1.l()) {
            return true;
        }
        boolean O0 = O0(this.x, this.y, str, i2, i3);
        if (O0) {
            this.f1497c = true;
            try {
                S0(this.x, this.y);
            } finally {
                v();
            }
        }
        f0();
        t();
        return O0;
    }

    private int P0(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3, a.e.b<Fragment> bVar) {
        int i4 = i3;
        for (int i5 = i3 - 1; i5 >= i2; i5--) {
            a aVar = arrayList.get(i5);
            boolean booleanValue = arrayList2.get(i5).booleanValue();
            if (aVar.y() && !aVar.w(arrayList, i5 + 1, i3)) {
                if (this.C == null) {
                    this.C = new ArrayList<>();
                }
                n nVar = new n(aVar, booleanValue);
                this.C.add(nVar);
                aVar.B(nVar);
                if (booleanValue) {
                    aVar.r();
                } else {
                    aVar.s(false);
                }
                i4--;
                if (i5 != i4) {
                    arrayList.remove(i5);
                    arrayList.add(i4, aVar);
                }
                m(bVar);
            }
        }
        return i4;
    }

    private void S0(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList != null && !arrayList.isEmpty()) {
            if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
                throw new IllegalStateException("Internal error with the back stack records");
            }
            n0(arrayList, arrayList2);
            int size = arrayList.size();
            int i2 = 0;
            int i3 = 0;
            while (i2 < size) {
                if (!arrayList.get(i2).t) {
                    if (i3 != i2) {
                        m0(arrayList, arrayList2, i3, i2);
                    }
                    i3 = i2 + 1;
                    if (arrayList2.get(i2).booleanValue()) {
                        while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).t) {
                            i3++;
                        }
                    }
                    m0(arrayList, arrayList2, i2, i3);
                    i2 = i3 - 1;
                }
                i2++;
            }
            if (i3 != size) {
                m0(arrayList, arrayList2, i3, size);
            }
        }
    }

    public static int W0(int i2) {
        if (i2 == 4097) {
            return 8194;
        }
        if (i2 != 4099) {
            return i2 != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    /* JADX INFO: finally extract failed */
    private void d0(int i2) {
        try {
            this.f1497c = true;
            I0(i2, false);
            this.f1497c = false;
            k0();
        } catch (Throwable th) {
            this.f1497c = false;
            throw th;
        }
    }

    private static void d1(View view, g gVar) {
        if (view != null && gVar != null && g1(view, gVar)) {
            Animator animator = gVar.f1517b;
            if (animator != null) {
                animator.addListener(new C0045h(view));
                return;
            }
            Animation.AnimationListener t0 = t0(gVar.f1516a);
            view.setLayerType(2, (Paint) null);
            gVar.f1516a.setAnimationListener(new e(view, t0));
        }
    }

    private static void f1(i iVar) {
        if (iVar != null) {
            List<Fragment> b2 = iVar.b();
            if (b2 != null) {
                for (Fragment fragment : b2) {
                    fragment.E = true;
                }
            }
            List<i> a2 = iVar.a();
            if (a2 != null) {
                for (i f1 : a2) {
                    f1(f1);
                }
            }
        }
    }

    private void g0() {
        SparseArray<Fragment> sparseArray = this.f1500f;
        int size = sparseArray == null ? 0 : sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment valueAt = this.f1500f.valueAt(i2);
            if (valueAt != null) {
                if (valueAt.z() != null) {
                    int g0 = valueAt.g0();
                    View z2 = valueAt.z();
                    Animation animation = z2.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        z2.clearAnimation();
                    }
                    valueAt.M1((View) null);
                    K0(valueAt, g0, 0, 0, false);
                } else if (valueAt.A() != null) {
                    valueAt.A().end();
                }
            }
        }
    }

    static boolean g1(View view, g gVar) {
        if (view == null || gVar == null || Build.VERSION.SDK_INT < 19 || view.getLayerType() != 0 || !t.E(view) || !G0(gVar)) {
            return false;
        }
        return true;
    }

    private void i0(boolean z2) {
        if (this.f1497c) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.n == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        } else if (Looper.myLooper() == this.n.g().getLooper()) {
            if (!z2) {
                u();
            }
            if (this.x == null) {
                this.x = new ArrayList<>();
                this.y = new ArrayList<>();
            }
            this.f1497c = true;
            try {
                n0((ArrayList<a>) null, (ArrayList<Boolean>) null);
            } finally {
                this.f1497c = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    private void j1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new a.h.j.b("FragmentManager"));
        f fVar = this.n;
        if (fVar != null) {
            try {
                fVar.i("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        } else {
            try {
                c("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e3) {
                Log.e("FragmentManager", "Failed dumping state", e3);
            }
        }
        throw runtimeException;
    }

    public static int k1(int i2, boolean z2) {
        if (i2 == 4097) {
            return z2 ? 1 : 2;
        }
        if (i2 == 4099) {
            return z2 ? 5 : 6;
        }
        if (i2 != 8194) {
            return -1;
        }
        return z2 ? 3 : 4;
    }

    private static void l0(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        while (i2 < i3) {
            a aVar = arrayList.get(i2);
            boolean z2 = true;
            if (arrayList2.get(i2).booleanValue()) {
                aVar.m(-1);
                if (i2 != i3 - 1) {
                    z2 = false;
                }
                aVar.s(z2);
            } else {
                aVar.m(1);
                aVar.r();
            }
            i2++;
        }
    }

    private void m(a.e.b<Fragment> bVar) {
        int i2 = this.m;
        if (i2 >= 1) {
            int min = Math.min(i2, 3);
            int size = this.f1499e.size();
            for (int i3 = 0; i3 < size; i3++) {
                Fragment fragment = this.f1499e.get(i3);
                if (fragment.f1437b < min) {
                    K0(fragment, min, fragment.S(), fragment.V(), false);
                    if (fragment.J != null && !fragment.B && fragment.O) {
                        bVar.add(fragment);
                    }
                }
            }
        }
    }

    private void m0(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        int i4;
        int i5;
        ArrayList<a> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        int i6 = i2;
        int i7 = i3;
        boolean z2 = arrayList3.get(i6).t;
        ArrayList<Fragment> arrayList5 = this.z;
        if (arrayList5 == null) {
            this.z = new ArrayList<>();
        } else {
            arrayList5.clear();
        }
        this.z.addAll(this.f1499e);
        Fragment w0 = w0();
        boolean z3 = false;
        for (int i8 = i6; i8 < i7; i8++) {
            a aVar = arrayList3.get(i8);
            if (!arrayList4.get(i8).booleanValue()) {
                w0 = aVar.t(this.z, w0);
            } else {
                w0 = aVar.C(this.z, w0);
            }
            z3 = z3 || aVar.i;
        }
        this.z.clear();
        if (!z2) {
            k.C(this, arrayList, arrayList2, i2, i3, false);
        }
        l0(arrayList, arrayList2, i2, i3);
        if (z2) {
            a.e.b bVar = new a.e.b();
            m(bVar);
            int P0 = P0(arrayList, arrayList2, i2, i3, bVar);
            E0(bVar);
            i4 = P0;
        } else {
            i4 = i7;
        }
        if (i4 != i6 && z2) {
            k.C(this, arrayList, arrayList2, i2, i4, true);
            I0(this.m, true);
        }
        while (i6 < i7) {
            a aVar2 = arrayList3.get(i6);
            if (arrayList4.get(i6).booleanValue() && (i5 = aVar2.m) >= 0) {
                r0(i5);
                aVar2.m = -1;
            }
            aVar2.A();
            i6++;
        }
        if (z3) {
            T0();
        }
    }

    private void n0(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<n> arrayList3 = this.C;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            n nVar = this.C.get(i2);
            if (arrayList != null && !nVar.f1531a && (indexOf2 = arrayList.indexOf(nVar.f1532b)) != -1 && arrayList2.get(indexOf2).booleanValue()) {
                nVar.c();
            } else if (nVar.e() || (arrayList != null && nVar.f1532b.w(arrayList, 0, arrayList.size()))) {
                this.C.remove(i2);
                i2--;
                size--;
                if (arrayList == null || nVar.f1531a || (indexOf = arrayList.indexOf(nVar.f1532b)) == -1 || !arrayList2.get(indexOf).booleanValue()) {
                    nVar.d();
                } else {
                    nVar.c();
                }
            }
            i2++;
        }
    }

    private Fragment p0(Fragment fragment) {
        ViewGroup viewGroup = fragment.I;
        View view = fragment.J;
        if (!(viewGroup == null || view == null)) {
            for (int indexOf = this.f1499e.indexOf(fragment) - 1; indexOf >= 0; indexOf--) {
                Fragment fragment2 = this.f1499e.get(indexOf);
                if (fragment2.I == viewGroup && fragment2.J != null) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    private void q(Fragment fragment, g gVar, int i2) {
        View view = fragment.J;
        ViewGroup viewGroup = fragment.I;
        viewGroup.startViewTransition(view);
        fragment.Y1(i2);
        if (gVar.f1516a != null) {
            i iVar = new i(gVar.f1516a, viewGroup, view);
            fragment.M1(fragment.J);
            iVar.setAnimationListener(new b(t0(iVar), viewGroup, fragment));
            d1(view, gVar);
            fragment.J.startAnimation(iVar);
            return;
        }
        Animator animator = gVar.f1517b;
        fragment.N1(animator);
        animator.addListener(new c(viewGroup, view, fragment));
        animator.setTarget(fragment.J);
        d1(fragment.J, gVar);
        animator.start();
    }

    private void q0() {
        if (this.C != null) {
            while (!this.C.isEmpty()) {
                this.C.remove(0).d();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean s0(java.util.ArrayList<androidx.fragment.app.a> r5, java.util.ArrayList<java.lang.Boolean> r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList<androidx.fragment.app.h$l> r0 = r4.f1496b     // Catch:{ all -> 0x003c }
            r1 = 0
            if (r0 == 0) goto L_0x003a
            java.util.ArrayList<androidx.fragment.app.h$l> r0 = r4.f1496b     // Catch:{ all -> 0x003c }
            int r0 = r0.size()     // Catch:{ all -> 0x003c }
            if (r0 != 0) goto L_0x000f
            goto L_0x003a
        L_0x000f:
            java.util.ArrayList<androidx.fragment.app.h$l> r0 = r4.f1496b     // Catch:{ all -> 0x003c }
            int r0 = r0.size()     // Catch:{ all -> 0x003c }
            r2 = 0
        L_0x0016:
            if (r1 >= r0) goto L_0x0028
            java.util.ArrayList<androidx.fragment.app.h$l> r3 = r4.f1496b     // Catch:{ all -> 0x003c }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x003c }
            androidx.fragment.app.h$l r3 = (androidx.fragment.app.h.l) r3     // Catch:{ all -> 0x003c }
            boolean r3 = r3.a(r5, r6)     // Catch:{ all -> 0x003c }
            r2 = r2 | r3
            int r1 = r1 + 1
            goto L_0x0016
        L_0x0028:
            java.util.ArrayList<androidx.fragment.app.h$l> r5 = r4.f1496b     // Catch:{ all -> 0x003c }
            r5.clear()     // Catch:{ all -> 0x003c }
            androidx.fragment.app.f r5 = r4.n     // Catch:{ all -> 0x003c }
            android.os.Handler r5 = r5.g()     // Catch:{ all -> 0x003c }
            java.lang.Runnable r6 = r4.E     // Catch:{ all -> 0x003c }
            r5.removeCallbacks(r6)     // Catch:{ all -> 0x003c }
            monitor-exit(r4)     // Catch:{ all -> 0x003c }
            return r2
        L_0x003a:
            monitor-exit(r4)     // Catch:{ all -> 0x003c }
            return r1
        L_0x003c:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003c }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.h.s0(java.util.ArrayList, java.util.ArrayList):boolean");
    }

    private void t() {
        SparseArray<Fragment> sparseArray = this.f1500f;
        if (sparseArray != null) {
            for (int size = sparseArray.size() - 1; size >= 0; size--) {
                if (this.f1500f.valueAt(size) == null) {
                    SparseArray<Fragment> sparseArray2 = this.f1500f;
                    sparseArray2.delete(sparseArray2.keyAt(size));
                }
            }
        }
    }

    private static Animation.AnimationListener t0(Animation animation) {
        try {
            if (G == null) {
                Field declaredField = Animation.class.getDeclaredField("mListener");
                G = declaredField;
                declaredField.setAccessible(true);
            }
            return (Animation.AnimationListener) G.get(animation);
        } catch (NoSuchFieldException e2) {
            Log.e("FragmentManager", "No field with the name mListener is found in Animation class", e2);
            return null;
        } catch (IllegalAccessException e3) {
            Log.e("FragmentManager", "Cannot access Animation's mListener field", e3);
            return null;
        }
    }

    private void u() {
        if (i()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        } else if (this.v != null) {
            throw new IllegalStateException("Can not perform this action inside of " + this.v);
        }
    }

    private void v() {
        this.f1497c = false;
        this.y.clear();
        this.x.clear();
    }

    public void A(Configuration configuration) {
        for (int i2 = 0; i2 < this.f1499e.size(); i2++) {
            Fragment fragment = this.f1499e.get(i2);
            if (fragment != null) {
                fragment.n1(configuration);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void A0(Fragment fragment) {
        if (fragment.f1441f < 0) {
            int i2 = this.f1498d;
            this.f1498d = i2 + 1;
            fragment.R1(i2, this.p);
            if (this.f1500f == null) {
                this.f1500f = new SparseArray<>();
            }
            this.f1500f.put(fragment.f1441f, fragment);
            if (F) {
                Log.v("FragmentManager", "Allocated fragment index " + fragment);
            }
        }
    }

    public boolean B(MenuItem menuItem) {
        if (this.m < 1) {
            return false;
        }
        for (int i2 = 0; i2 < this.f1499e.size(); i2++) {
            Fragment fragment = this.f1499e.get(i2);
            if (fragment != null && fragment.o1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void C() {
        this.s = false;
        this.t = false;
        d0(1);
    }

    /* access modifiers changed from: package-private */
    public void C0(Fragment fragment) {
        if (fragment.f1441f >= 0) {
            if (F) {
                Log.v("FragmentManager", "Freeing fragment index " + fragment);
            }
            this.f1500f.put(fragment.f1441f, (Object) null);
            fragment.n0();
        }
    }

    public boolean D(Menu menu, MenuInflater menuInflater) {
        if (this.m < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z2 = false;
        for (int i2 = 0; i2 < this.f1499e.size(); i2++) {
            Fragment fragment = this.f1499e.get(i2);
            if (fragment != null && fragment.q1(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z2 = true;
            }
        }
        if (this.h != null) {
            for (int i3 = 0; i3 < this.h.size(); i3++) {
                Fragment fragment2 = this.h.get(i3);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.P0();
                }
            }
        }
        this.h = arrayList;
        return z2;
    }

    public void E() {
        this.u = true;
        k0();
        d0(0);
        this.n = null;
        this.o = null;
        this.p = null;
    }

    public void F() {
        d0(1);
    }

    public void G() {
        for (int i2 = 0; i2 < this.f1499e.size(); i2++) {
            Fragment fragment = this.f1499e.get(i2);
            if (fragment != null) {
                fragment.w1();
            }
        }
    }

    public void H(boolean z2) {
        int size = this.f1499e.size();
        while (true) {
            size--;
            if (size >= 0) {
                Fragment fragment = this.f1499e.get(size);
                if (fragment != null) {
                    fragment.x1(z2);
                }
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        r0 = r0.J;
        r1 = r11.I;
        r0 = r1.indexOfChild(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void H0(androidx.fragment.app.Fragment r11) {
        /*
            r10 = this;
            if (r11 != 0) goto L_0x0003
            return
        L_0x0003:
            int r0 = r10.m
            boolean r1 = r11.m
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001a
            boolean r1 = r11.u0()
            if (r1 == 0) goto L_0x0016
            int r0 = java.lang.Math.min(r0, r2)
            goto L_0x001a
        L_0x0016:
            int r0 = java.lang.Math.min(r0, r3)
        L_0x001a:
            r6 = r0
            int r7 = r11.V()
            int r8 = r11.W()
            r9 = 0
            r4 = r10
            r5 = r11
            r4.K0(r5, r6, r7, r8, r9)
            android.view.View r0 = r11.J
            if (r0 == 0) goto L_0x008c
            androidx.fragment.app.Fragment r0 = r10.p0(r11)
            if (r0 == 0) goto L_0x004b
            android.view.View r0 = r0.J
            android.view.ViewGroup r1 = r11.I
            int r0 = r1.indexOfChild(r0)
            android.view.View r4 = r11.J
            int r4 = r1.indexOfChild(r4)
            if (r4 >= r0) goto L_0x004b
            r1.removeViewAt(r4)
            android.view.View r4 = r11.J
            r1.addView(r4, r0)
        L_0x004b:
            boolean r0 = r11.O
            if (r0 == 0) goto L_0x008c
            android.view.ViewGroup r0 = r11.I
            if (r0 == 0) goto L_0x008c
            float r0 = r11.Q
            r1 = 0
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x005f
            android.view.View r4 = r11.J
            r4.setAlpha(r0)
        L_0x005f:
            r11.Q = r1
            r11.O = r3
            int r0 = r11.V()
            int r1 = r11.W()
            androidx.fragment.app.h$g r0 = r10.z0(r11, r0, r2, r1)
            if (r0 == 0) goto L_0x008c
            android.view.View r1 = r11.J
            d1(r1, r0)
            android.view.animation.Animation r1 = r0.f1516a
            if (r1 == 0) goto L_0x0080
            android.view.View r0 = r11.J
            r0.startAnimation(r1)
            goto L_0x008c
        L_0x0080:
            android.animation.Animator r1 = r0.f1517b
            android.view.View r2 = r11.J
            r1.setTarget(r2)
            android.animation.Animator r0 = r0.f1517b
            r0.start()
        L_0x008c:
            boolean r0 = r11.P
            if (r0 == 0) goto L_0x0093
            r10.x(r11)
        L_0x0093:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.h.H0(androidx.fragment.app.Fragment):void");
    }

    /* access modifiers changed from: package-private */
    public void I(Fragment fragment, Bundle bundle, boolean z2) {
        Fragment fragment2 = this.p;
        if (fragment2 != null) {
            g N = fragment2.N();
            if (N instanceof h) {
                ((h) N).I(fragment, bundle, true);
            }
        }
        Iterator<j> it = this.l.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (!z2 || next.f1525b) {
                next.f1524a.a(this, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void I0(int i2, boolean z2) {
        f fVar;
        if (this.n == null && i2 != 0) {
            throw new IllegalStateException("No activity");
        } else if (z2 || i2 != this.m) {
            this.m = i2;
            if (this.f1500f != null) {
                int size = this.f1499e.size();
                for (int i3 = 0; i3 < size; i3++) {
                    H0(this.f1499e.get(i3));
                }
                int size2 = this.f1500f.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    Fragment valueAt = this.f1500f.valueAt(i4);
                    if (valueAt != null && ((valueAt.m || valueAt.C) && !valueAt.O)) {
                        H0(valueAt);
                    }
                }
                i1();
                if (this.r && (fVar = this.n) != null && this.m == 4) {
                    fVar.q();
                    this.r = false;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void J(Fragment fragment, Context context, boolean z2) {
        Fragment fragment2 = this.p;
        if (fragment2 != null) {
            g N = fragment2.N();
            if (N instanceof h) {
                ((h) N).J(fragment, context, true);
            }
        }
        Iterator<j> it = this.l.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (!z2 || next.f1525b) {
                next.f1524a.b(this, fragment, context);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void J0(Fragment fragment) {
        K0(fragment, this.m, 0, 0, false);
    }

    /* access modifiers changed from: package-private */
    public void K(Fragment fragment, Bundle bundle, boolean z2) {
        Fragment fragment2 = this.p;
        if (fragment2 != null) {
            g N = fragment2.N();
            if (N instanceof h) {
                ((h) N).K(fragment, bundle, true);
            }
        }
        Iterator<j> it = this.l.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (!z2 || next.f1525b) {
                next.f1524a.c(this, fragment, bundle);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: int} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0072, code lost:
        if (r0 != 3) goto L_0x0418;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x041d  */
    /* JADX WARNING: Removed duplicated region for block: B:216:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void K0(androidx.fragment.app.Fragment r17, int r18, int r19, int r20, boolean r21) {
        /*
            r16 = this;
            r6 = r16
            r7 = r17
            boolean r0 = r7.l
            r8 = 1
            if (r0 == 0) goto L_0x0011
            boolean r0 = r7.C
            if (r0 == 0) goto L_0x000e
            goto L_0x0011
        L_0x000e:
            r0 = r18
            goto L_0x0016
        L_0x0011:
            r0 = r18
            if (r0 <= r8) goto L_0x0016
            r0 = 1
        L_0x0016:
            boolean r1 = r7.m
            if (r1 == 0) goto L_0x002a
            int r1 = r7.f1437b
            if (r0 <= r1) goto L_0x002a
            if (r1 != 0) goto L_0x0028
            boolean r0 = r17.u0()
            if (r0 == 0) goto L_0x0028
            r0 = 1
            goto L_0x002a
        L_0x0028:
            int r0 = r7.f1437b
        L_0x002a:
            boolean r1 = r7.L
            r9 = 3
            r10 = 2
            if (r1 == 0) goto L_0x0038
            int r1 = r7.f1437b
            if (r1 >= r9) goto L_0x0038
            if (r0 <= r10) goto L_0x0038
            r11 = 2
            goto L_0x0039
        L_0x0038:
            r11 = r0
        L_0x0039:
            int r0 = r7.f1437b
            java.lang.String r12 = "FragmentManager"
            r13 = 0
            r14 = 0
            if (r0 > r11) goto L_0x02d6
            boolean r0 = r7.n
            if (r0 == 0) goto L_0x004a
            boolean r0 = r7.o
            if (r0 != 0) goto L_0x004a
            return
        L_0x004a:
            android.view.View r0 = r17.z()
            if (r0 != 0) goto L_0x0056
            android.animation.Animator r0 = r17.A()
            if (r0 == 0) goto L_0x006a
        L_0x0056:
            r7.M1(r14)
            r7.N1(r14)
            int r2 = r17.g0()
            r3 = 0
            r4 = 0
            r5 = 1
            r0 = r16
            r1 = r17
            r0.K0(r1, r2, r3, r4, r5)
        L_0x006a:
            int r0 = r7.f1437b
            if (r0 == 0) goto L_0x0076
            if (r0 == r8) goto L_0x019e
            if (r0 == r10) goto L_0x0290
            if (r0 == r9) goto L_0x02b0
            goto L_0x0418
        L_0x0076:
            if (r11 <= 0) goto L_0x019e
            boolean r0 = F
            if (r0 == 0) goto L_0x0090
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto CREATED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x0090:
            android.os.Bundle r0 = r7.f1438c
            if (r0 == 0) goto L_0x00e1
            androidx.fragment.app.f r1 = r6.n
            android.content.Context r1 = r1.e()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r0.setClassLoader(r1)
            android.os.Bundle r0 = r7.f1438c
            java.lang.String r1 = "android:view_state"
            android.util.SparseArray r0 = r0.getSparseParcelableArray(r1)
            r7.f1439d = r0
            android.os.Bundle r0 = r7.f1438c
            java.lang.String r1 = "android:target_state"
            androidx.fragment.app.Fragment r0 = r6.u0(r0, r1)
            r7.i = r0
            if (r0 == 0) goto L_0x00c1
            android.os.Bundle r0 = r7.f1438c
            java.lang.String r1 = "android:target_req_state"
            int r0 = r0.getInt(r1, r13)
            r7.k = r0
        L_0x00c1:
            java.lang.Boolean r0 = r7.f1440e
            if (r0 == 0) goto L_0x00ce
            boolean r0 = r0.booleanValue()
            r7.M = r0
            r7.f1440e = r14
            goto L_0x00d8
        L_0x00ce:
            android.os.Bundle r0 = r7.f1438c
            java.lang.String r1 = "android:user_visible_hint"
            boolean r0 = r0.getBoolean(r1, r8)
            r7.M = r0
        L_0x00d8:
            boolean r0 = r7.M
            if (r0 != 0) goto L_0x00e1
            r7.L = r8
            if (r11 <= r10) goto L_0x00e1
            r11 = 2
        L_0x00e1:
            androidx.fragment.app.f r0 = r6.n
            r7.t = r0
            androidx.fragment.app.Fragment r1 = r6.p
            r7.x = r1
            if (r1 == 0) goto L_0x00ee
            androidx.fragment.app.h r0 = r1.u
            goto L_0x00f2
        L_0x00ee:
            androidx.fragment.app.h r0 = r0.f()
        L_0x00f2:
            r7.s = r0
            androidx.fragment.app.Fragment r0 = r7.i
            java.lang.String r15 = "Fragment "
            if (r0 == 0) goto L_0x0138
            android.util.SparseArray<androidx.fragment.app.Fragment> r1 = r6.f1500f
            int r0 = r0.f1441f
            java.lang.Object r0 = r1.get(r0)
            androidx.fragment.app.Fragment r1 = r7.i
            if (r0 != r1) goto L_0x0114
            int r0 = r1.f1437b
            if (r0 >= r8) goto L_0x0138
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 1
            r0 = r16
            r0.K0(r1, r2, r3, r4, r5)
            goto L_0x0138
        L_0x0114:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r15)
            r1.append(r7)
            java.lang.String r2 = " declared target fragment "
            r1.append(r2)
            androidx.fragment.app.Fragment r2 = r7.i
            r1.append(r2)
            java.lang.String r2 = " that does not belong to this FragmentManager!"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0138:
            androidx.fragment.app.f r0 = r6.n
            android.content.Context r0 = r0.e()
            r6.O(r7, r0, r13)
            r7.H = r13
            androidx.fragment.app.f r0 = r6.n
            android.content.Context r0 = r0.e()
            r7.G0(r0)
            boolean r0 = r7.H
            if (r0 == 0) goto L_0x0184
            androidx.fragment.app.Fragment r0 = r7.x
            if (r0 != 0) goto L_0x015a
            androidx.fragment.app.f r0 = r6.n
            r0.h(r7)
            goto L_0x015d
        L_0x015a:
            r0.H0(r7)
        L_0x015d:
            androidx.fragment.app.f r0 = r6.n
            android.content.Context r0 = r0.e()
            r6.J(r7, r0, r13)
            boolean r0 = r7.S
            if (r0 != 0) goto L_0x017a
            android.os.Bundle r0 = r7.f1438c
            r6.P(r7, r0, r13)
            android.os.Bundle r0 = r7.f1438c
            r7.p1(r0)
            android.os.Bundle r0 = r7.f1438c
            r6.K(r7, r0, r13)
            goto L_0x0181
        L_0x017a:
            android.os.Bundle r0 = r7.f1438c
            r7.K1(r0)
            r7.f1437b = r8
        L_0x0181:
            r7.E = r13
            goto L_0x019e
        L_0x0184:
            androidx.fragment.app.o r0 = new androidx.fragment.app.o
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r15)
            r1.append(r7)
            java.lang.String r2 = " did not call through to super.onAttach()"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x019e:
            r16.j0(r17)
            if (r11 <= r8) goto L_0x0290
            boolean r0 = F
            if (r0 == 0) goto L_0x01bb
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto ACTIVITY_CREATED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x01bb:
            boolean r0 = r7.n
            if (r0 != 0) goto L_0x027b
            int r0 = r7.z
            if (r0 == 0) goto L_0x0231
            r1 = -1
            if (r0 == r1) goto L_0x0212
            androidx.fragment.app.d r1 = r6.o
            android.view.View r0 = r1.b(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 != 0) goto L_0x0232
            boolean r1 = r7.p
            if (r1 == 0) goto L_0x01d5
            goto L_0x0232
        L_0x01d5:
            android.content.res.Resources r0 = r17.a0()     // Catch:{ NotFoundException -> 0x01e0 }
            int r1 = r7.z     // Catch:{ NotFoundException -> 0x01e0 }
            java.lang.String r0 = r0.getResourceName(r1)     // Catch:{ NotFoundException -> 0x01e0 }
            goto L_0x01e2
        L_0x01e0:
            java.lang.String r0 = "unknown"
        L_0x01e2:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "No view found for id 0x"
            r2.append(r3)
            int r3 = r7.z
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r3 = " ("
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ") for fragment "
            r2.append(r0)
            r2.append(r7)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            r6.j1(r1)
            throw r14
        L_0x0212:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot create fragment "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = " for a container view with no id"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r6.j1(r0)
            throw r14
        L_0x0231:
            r0 = r14
        L_0x0232:
            r7.I = r0
            android.os.Bundle r1 = r7.f1438c
            android.view.LayoutInflater r1 = r7.v1(r1)
            android.os.Bundle r2 = r7.f1438c
            r7.r1(r1, r0, r2)
            android.view.View r1 = r7.J
            if (r1 == 0) goto L_0x0279
            r7.K = r1
            r1.setSaveFromParentEnabled(r13)
            if (r0 == 0) goto L_0x024f
            android.view.View r1 = r7.J
            r0.addView(r1)
        L_0x024f:
            boolean r0 = r7.B
            if (r0 == 0) goto L_0x025a
            android.view.View r0 = r7.J
            r1 = 8
            r0.setVisibility(r1)
        L_0x025a:
            android.view.View r0 = r7.J
            android.os.Bundle r1 = r7.f1438c
            r7.j1(r0, r1)
            android.view.View r0 = r7.J
            android.os.Bundle r1 = r7.f1438c
            r6.U(r7, r0, r1, r13)
            android.view.View r0 = r7.J
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0275
            android.view.ViewGroup r0 = r7.I
            if (r0 == 0) goto L_0x0275
            goto L_0x0276
        L_0x0275:
            r8 = 0
        L_0x0276:
            r7.O = r8
            goto L_0x027b
        L_0x0279:
            r7.K = r14
        L_0x027b:
            android.os.Bundle r0 = r7.f1438c
            r7.m1(r0)
            android.os.Bundle r0 = r7.f1438c
            r6.I(r7, r0, r13)
            android.view.View r0 = r7.J
            if (r0 == 0) goto L_0x028e
            android.os.Bundle r0 = r7.f1438c
            r7.L1(r0)
        L_0x028e:
            r7.f1438c = r14
        L_0x0290:
            if (r11 <= r10) goto L_0x02b0
            boolean r0 = F
            if (r0 == 0) goto L_0x02aa
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto STARTED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x02aa:
            r17.F1()
            r6.S(r7, r13)
        L_0x02b0:
            if (r11 <= r9) goto L_0x0418
            boolean r0 = F
            if (r0 == 0) goto L_0x02ca
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto RESUMED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x02ca:
            r17.D1()
            r6.Q(r7, r13)
            r7.f1438c = r14
            r7.f1439d = r14
            goto L_0x0418
        L_0x02d6:
            if (r0 <= r11) goto L_0x0418
            if (r0 == r8) goto L_0x03a4
            if (r0 == r10) goto L_0x0323
            if (r0 == r9) goto L_0x0303
            r1 = 4
            if (r0 == r1) goto L_0x02e3
            goto L_0x0418
        L_0x02e3:
            if (r11 >= r1) goto L_0x0303
            boolean r0 = F
            if (r0 == 0) goto L_0x02fd
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom RESUMED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x02fd:
            r17.A1()
            r6.N(r7, r13)
        L_0x0303:
            if (r11 >= r9) goto L_0x0323
            boolean r0 = F
            if (r0 == 0) goto L_0x031d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom STARTED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x031d:
            r17.G1()
            r6.T(r7, r13)
        L_0x0323:
            if (r11 >= r10) goto L_0x03a4
            boolean r0 = F
            if (r0 == 0) goto L_0x033d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom ACTIVITY_CREATED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x033d:
            android.view.View r0 = r7.J
            if (r0 == 0) goto L_0x0350
            androidx.fragment.app.f r0 = r6.n
            boolean r0 = r0.n(r7)
            if (r0 == 0) goto L_0x0350
            android.util.SparseArray<android.os.Parcelable> r0 = r7.f1439d
            if (r0 != 0) goto L_0x0350
            r16.Z0(r17)
        L_0x0350:
            r17.t1()
            r6.V(r7, r13)
            android.view.View r0 = r7.J
            if (r0 == 0) goto L_0x0395
            android.view.ViewGroup r1 = r7.I
            if (r1 == 0) goto L_0x0395
            r1.endViewTransition(r0)
            android.view.View r0 = r7.J
            r0.clearAnimation()
            int r0 = r6.m
            r1 = 0
            if (r0 <= 0) goto L_0x0386
            boolean r0 = r6.u
            if (r0 != 0) goto L_0x0386
            android.view.View r0 = r7.J
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0386
            float r0 = r7.Q
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0386
            r0 = r19
            r2 = r20
            androidx.fragment.app.h$g r0 = r6.z0(r7, r0, r13, r2)
            goto L_0x0387
        L_0x0386:
            r0 = r14
        L_0x0387:
            r7.Q = r1
            if (r0 == 0) goto L_0x038e
            r6.q(r7, r0, r11)
        L_0x038e:
            android.view.ViewGroup r0 = r7.I
            android.view.View r1 = r7.J
            r0.removeView(r1)
        L_0x0395:
            r7.I = r14
            r7.J = r14
            r7.V = r14
            androidx.lifecycle.l<androidx.lifecycle.g> r0 = r7.W
            r0.j(r14)
            r7.K = r14
            r7.o = r13
        L_0x03a4:
            if (r11 >= r8) goto L_0x0418
            boolean r0 = r6.u
            if (r0 == 0) goto L_0x03cb
            android.view.View r0 = r17.z()
            if (r0 == 0) goto L_0x03bb
            android.view.View r0 = r17.z()
            r7.M1(r14)
            r0.clearAnimation()
            goto L_0x03cb
        L_0x03bb:
            android.animation.Animator r0 = r17.A()
            if (r0 == 0) goto L_0x03cb
            android.animation.Animator r0 = r17.A()
            r7.N1(r14)
            r0.cancel()
        L_0x03cb:
            android.view.View r0 = r17.z()
            if (r0 != 0) goto L_0x0414
            android.animation.Animator r0 = r17.A()
            if (r0 == 0) goto L_0x03d8
            goto L_0x0414
        L_0x03d8:
            boolean r0 = F
            if (r0 == 0) goto L_0x03f0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom CREATED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x03f0:
            boolean r0 = r7.E
            if (r0 != 0) goto L_0x03fb
            r17.s1()
            r6.L(r7, r13)
            goto L_0x03fd
        L_0x03fb:
            r7.f1437b = r13
        L_0x03fd:
            r17.u1()
            r6.M(r7, r13)
            if (r21 != 0) goto L_0x0418
            boolean r0 = r7.E
            if (r0 != 0) goto L_0x040d
            r16.C0(r17)
            goto L_0x0418
        L_0x040d:
            r7.t = r14
            r7.x = r14
            r7.s = r14
            goto L_0x0418
        L_0x0414:
            r7.Y1(r11)
            goto L_0x0419
        L_0x0418:
            r8 = r11
        L_0x0419:
            int r0 = r7.f1437b
            if (r0 == r8) goto L_0x044a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveToState: Fragment state for "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = " not updated inline; "
            r0.append(r1)
            java.lang.String r1 = "expected state "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r1 = " found "
            r0.append(r1)
            int r1 = r7.f1437b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r12, r0)
            r7.f1437b = r8
        L_0x044a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.h.K0(androidx.fragment.app.Fragment, int, int, int, boolean):void");
    }

    /* access modifiers changed from: package-private */
    public void L(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.p;
        if (fragment2 != null) {
            g N = fragment2.N();
            if (N instanceof h) {
                ((h) N).L(fragment, true);
            }
        }
        Iterator<j> it = this.l.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (!z2 || next.f1525b) {
                next.f1524a.d(this, fragment);
            }
        }
    }

    public void L0() {
        this.D = null;
        this.s = false;
        this.t = false;
        int size = this.f1499e.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.f1499e.get(i2);
            if (fragment != null) {
                fragment.C0();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void M(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.p;
        if (fragment2 != null) {
            g N = fragment2.N();
            if (N instanceof h) {
                ((h) N).M(fragment, true);
            }
        }
        Iterator<j> it = this.l.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (!z2 || next.f1525b) {
                next.f1524a.e(this, fragment);
            }
        }
    }

    public void M0(Fragment fragment) {
        if (!fragment.L) {
            return;
        }
        if (this.f1497c) {
            this.w = true;
            return;
        }
        fragment.L = false;
        K0(fragment, this.m, 0, 0, false);
    }

    /* access modifiers changed from: package-private */
    public void N(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.p;
        if (fragment2 != null) {
            g N = fragment2.N();
            if (N instanceof h) {
                ((h) N).N(fragment, true);
            }
        }
        Iterator<j> it = this.l.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (!z2 || next.f1525b) {
                next.f1524a.f(this, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void O(Fragment fragment, Context context, boolean z2) {
        Fragment fragment2 = this.p;
        if (fragment2 != null) {
            g N = fragment2.N();
            if (N instanceof h) {
                ((h) N).O(fragment, context, true);
            }
        }
        Iterator<j> it = this.l.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (!z2 || next.f1525b) {
                next.f1524a.g(this, fragment, context);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean O0(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        int i4;
        ArrayList<a> arrayList3 = this.g;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i2 < 0 && (i3 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.g.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i2 >= 0) {
                int size2 = this.g.size() - 1;
                while (size2 >= 0) {
                    a aVar = this.g.get(size2);
                    if ((str != null && str.equals(aVar.u())) || (i2 >= 0 && i2 == aVar.m)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i3 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        a aVar2 = this.g.get(size2);
                        if ((str == null || !str.equals(aVar2.u())) && (i2 < 0 || i2 != aVar2.m)) {
                            break;
                        }
                    }
                }
                i4 = size2;
            } else {
                i4 = -1;
            }
            if (i4 == this.g.size() - 1) {
                return false;
            }
            for (int size3 = this.g.size() - 1; size3 > i4; size3--) {
                arrayList.add(this.g.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void P(Fragment fragment, Bundle bundle, boolean z2) {
        Fragment fragment2 = this.p;
        if (fragment2 != null) {
            g N = fragment2.N();
            if (N instanceof h) {
                ((h) N).P(fragment, bundle, true);
            }
        }
        Iterator<j> it = this.l.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (!z2 || next.f1525b) {
                next.f1524a.h(this, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void Q(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.p;
        if (fragment2 != null) {
            g N = fragment2.N();
            if (N instanceof h) {
                ((h) N).Q(fragment, true);
            }
        }
        Iterator<j> it = this.l.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (!z2 || next.f1525b) {
                next.f1524a.i(this, fragment);
            }
        }
    }

    public void Q0(Bundle bundle, String str, Fragment fragment) {
        int i2 = fragment.f1441f;
        if (i2 >= 0) {
            bundle.putInt(str, i2);
            return;
        }
        j1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        throw null;
    }

    /* access modifiers changed from: package-private */
    public void R(Fragment fragment, Bundle bundle, boolean z2) {
        Fragment fragment2 = this.p;
        if (fragment2 != null) {
            g N = fragment2.N();
            if (N instanceof h) {
                ((h) N).R(fragment, bundle, true);
            }
        }
        Iterator<j> it = this.l.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (!z2 || next.f1525b) {
                next.f1524a.j(this, fragment, bundle);
            }
        }
    }

    public void R0(Fragment fragment) {
        if (F) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.r);
        }
        boolean z2 = !fragment.u0();
        if (!fragment.C || z2) {
            synchronized (this.f1499e) {
                this.f1499e.remove(fragment);
            }
            if (fragment.F && fragment.G) {
                this.r = true;
            }
            fragment.l = false;
            fragment.m = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void S(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.p;
        if (fragment2 != null) {
            g N = fragment2.N();
            if (N instanceof h) {
                ((h) N).S(fragment, true);
            }
        }
        Iterator<j> it = this.l.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (!z2 || next.f1525b) {
                next.f1524a.k(this, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void T(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.p;
        if (fragment2 != null) {
            g N = fragment2.N();
            if (N instanceof h) {
                ((h) N).T(fragment, true);
            }
        }
        Iterator<j> it = this.l.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (!z2 || next.f1525b) {
                next.f1524a.l(this, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void T0() {
        if (this.k != null) {
            for (int i2 = 0; i2 < this.k.size(); i2++) {
                this.k.get(i2).a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void U(Fragment fragment, View view, Bundle bundle, boolean z2) {
        Fragment fragment2 = this.p;
        if (fragment2 != null) {
            g N = fragment2.N();
            if (N instanceof h) {
                ((h) N).U(fragment, view, bundle, true);
            }
        }
        Iterator<j> it = this.l.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (!z2 || next.f1525b) {
                next.f1524a.m(this, fragment, view, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void U0(Parcelable parcelable, i iVar) {
        List<r> list;
        List<i> list2;
        if (parcelable != null) {
            FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
            if (fragmentManagerState.f1451b != null) {
                if (iVar != null) {
                    List<Fragment> b2 = iVar.b();
                    list2 = iVar.a();
                    list = iVar.c();
                    int size = b2 != null ? b2.size() : 0;
                    int i2 = 0;
                    while (i2 < size) {
                        Fragment fragment = b2.get(i2);
                        if (F) {
                            Log.v("FragmentManager", "restoreAllState: re-attaching retained " + fragment);
                        }
                        int i3 = 0;
                        while (true) {
                            FragmentState[] fragmentStateArr = fragmentManagerState.f1451b;
                            if (i3 >= fragmentStateArr.length || fragmentStateArr[i3].f1457c == fragment.f1441f) {
                                FragmentState[] fragmentStateArr2 = fragmentManagerState.f1451b;
                            } else {
                                i3++;
                            }
                        }
                        FragmentState[] fragmentStateArr22 = fragmentManagerState.f1451b;
                        if (i3 != fragmentStateArr22.length) {
                            FragmentState fragmentState = fragmentStateArr22[i3];
                            fragmentState.m = fragment;
                            fragment.f1439d = null;
                            fragment.r = 0;
                            fragment.o = false;
                            fragment.l = false;
                            fragment.i = null;
                            Bundle bundle = fragmentState.l;
                            if (bundle != null) {
                                bundle.setClassLoader(this.n.e().getClassLoader());
                                fragment.f1439d = fragmentState.l.getSparseParcelableArray("android:view_state");
                                fragment.f1438c = fragmentState.l;
                            }
                            i2++;
                        } else {
                            j1(new IllegalStateException("Could not find active fragment with index " + fragment.f1441f));
                            throw null;
                        }
                    }
                } else {
                    list2 = null;
                    list = null;
                }
                this.f1500f = new SparseArray<>(fragmentManagerState.f1451b.length);
                int i4 = 0;
                while (true) {
                    FragmentState[] fragmentStateArr3 = fragmentManagerState.f1451b;
                    if (i4 >= fragmentStateArr3.length) {
                        break;
                    }
                    FragmentState fragmentState2 = fragmentStateArr3[i4];
                    if (fragmentState2 != null) {
                        Fragment a2 = fragmentState2.a(this.n, this.o, this.p, (list2 == null || i4 >= list2.size()) ? null : list2.get(i4), (list == null || i4 >= list.size()) ? null : list.get(i4));
                        if (F) {
                            Log.v("FragmentManager", "restoreAllState: active #" + i4 + ": " + a2);
                        }
                        this.f1500f.put(a2.f1441f, a2);
                        fragmentState2.m = null;
                    }
                    i4++;
                }
                if (iVar != null) {
                    List<Fragment> b3 = iVar.b();
                    int size2 = b3 != null ? b3.size() : 0;
                    for (int i5 = 0; i5 < size2; i5++) {
                        Fragment fragment2 = b3.get(i5);
                        int i6 = fragment2.j;
                        if (i6 >= 0) {
                            Fragment fragment3 = this.f1500f.get(i6);
                            fragment2.i = fragment3;
                            if (fragment3 == null) {
                                Log.w("FragmentManager", "Re-attaching retained fragment " + fragment2 + " target no longer exists: " + fragment2.j);
                            }
                        }
                    }
                }
                this.f1499e.clear();
                if (fragmentManagerState.f1452c != null) {
                    int i7 = 0;
                    while (true) {
                        int[] iArr = fragmentManagerState.f1452c;
                        if (i7 >= iArr.length) {
                            break;
                        }
                        Fragment fragment4 = this.f1500f.get(iArr[i7]);
                        if (fragment4 != null) {
                            fragment4.l = true;
                            if (F) {
                                Log.v("FragmentManager", "restoreAllState: added #" + i7 + ": " + fragment4);
                            }
                            if (!this.f1499e.contains(fragment4)) {
                                synchronized (this.f1499e) {
                                    this.f1499e.add(fragment4);
                                }
                                i7++;
                            } else {
                                throw new IllegalStateException("Already added!");
                            }
                        } else {
                            j1(new IllegalStateException("No instantiated fragment for index #" + fragmentManagerState.f1452c[i7]));
                            throw null;
                        }
                    }
                }
                if (fragmentManagerState.f1453d != null) {
                    this.g = new ArrayList<>(fragmentManagerState.f1453d.length);
                    int i8 = 0;
                    while (true) {
                        BackStackState[] backStackStateArr = fragmentManagerState.f1453d;
                        if (i8 >= backStackStateArr.length) {
                            break;
                        }
                        a a3 = backStackStateArr[i8].a(this);
                        if (F) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i8 + " (index " + a3.m + "): " + a3);
                            PrintWriter printWriter = new PrintWriter(new a.h.j.b("FragmentManager"));
                            a3.q("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.g.add(a3);
                        int i9 = a3.m;
                        if (i9 >= 0) {
                            c1(i9, a3);
                        }
                        i8++;
                    }
                } else {
                    this.g = null;
                }
                int i10 = fragmentManagerState.f1454e;
                if (i10 >= 0) {
                    this.q = this.f1500f.get(i10);
                }
                this.f1498d = fragmentManagerState.f1455f;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void V(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.p;
        if (fragment2 != null) {
            g N = fragment2.N();
            if (N instanceof h) {
                ((h) N).V(fragment, true);
            }
        }
        Iterator<j> it = this.l.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (!z2 || next.f1525b) {
                next.f1524a.n(this, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public i V0() {
        f1(this.D);
        return this.D;
    }

    public boolean W(MenuItem menuItem) {
        if (this.m < 1) {
            return false;
        }
        for (int i2 = 0; i2 < this.f1499e.size(); i2++) {
            Fragment fragment = this.f1499e.get(i2);
            if (fragment != null && fragment.y1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void X(Menu menu) {
        if (this.m >= 1) {
            for (int i2 = 0; i2 < this.f1499e.size(); i2++) {
                Fragment fragment = this.f1499e.get(i2);
                if (fragment != null) {
                    fragment.z1(menu);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Parcelable X0() {
        int[] iArr;
        int size;
        q0();
        g0();
        k0();
        this.s = true;
        BackStackState[] backStackStateArr = null;
        this.D = null;
        SparseArray<Fragment> sparseArray = this.f1500f;
        if (sparseArray == null || sparseArray.size() <= 0) {
            return null;
        }
        int size2 = this.f1500f.size();
        FragmentState[] fragmentStateArr = new FragmentState[size2];
        boolean z2 = false;
        for (int i2 = 0; i2 < size2; i2++) {
            Fragment valueAt = this.f1500f.valueAt(i2);
            if (valueAt != null) {
                if (valueAt.f1441f >= 0) {
                    FragmentState fragmentState = new FragmentState(valueAt);
                    fragmentStateArr[i2] = fragmentState;
                    if (valueAt.f1437b <= 0 || fragmentState.l != null) {
                        fragmentState.l = valueAt.f1438c;
                    } else {
                        Bundle Y0 = Y0(valueAt);
                        fragmentState.l = Y0;
                        Fragment fragment = valueAt.i;
                        if (fragment != null) {
                            if (fragment.f1441f >= 0) {
                                if (Y0 == null) {
                                    fragmentState.l = new Bundle();
                                }
                                Q0(fragmentState.l, "android:target_state", valueAt.i);
                                int i3 = valueAt.k;
                                if (i3 != 0) {
                                    fragmentState.l.putInt("android:target_req_state", i3);
                                }
                            } else {
                                j1(new IllegalStateException("Failure saving state: " + valueAt + " has target not in fragment manager: " + valueAt.i));
                                throw null;
                            }
                        }
                    }
                    if (F) {
                        Log.v("FragmentManager", "Saved state of " + valueAt + ": " + fragmentState.l);
                    }
                    z2 = true;
                } else {
                    j1(new IllegalStateException("Failure saving state: active " + valueAt + " has cleared index: " + valueAt.f1441f));
                    throw null;
                }
            }
        }
        if (!z2) {
            if (F) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        int size3 = this.f1499e.size();
        if (size3 > 0) {
            iArr = new int[size3];
            int i4 = 0;
            while (i4 < size3) {
                iArr[i4] = this.f1499e.get(i4).f1441f;
                if (iArr[i4] >= 0) {
                    if (F) {
                        Log.v("FragmentManager", "saveAllState: adding fragment #" + i4 + ": " + this.f1499e.get(i4));
                    }
                    i4++;
                } else {
                    j1(new IllegalStateException("Failure saving state: active " + this.f1499e.get(i4) + " has cleared index: " + iArr[i4]));
                    throw null;
                }
            }
        } else {
            iArr = null;
        }
        ArrayList<a> arrayList = this.g;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            backStackStateArr = new BackStackState[size];
            for (int i5 = 0; i5 < size; i5++) {
                backStackStateArr[i5] = new BackStackState(this.g.get(i5));
                if (F) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i5 + ": " + this.g.get(i5));
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.f1451b = fragmentStateArr;
        fragmentManagerState.f1452c = iArr;
        fragmentManagerState.f1453d = backStackStateArr;
        Fragment fragment2 = this.q;
        if (fragment2 != null) {
            fragmentManagerState.f1454e = fragment2.f1441f;
        }
        fragmentManagerState.f1455f = this.f1498d;
        a1();
        return fragmentManagerState;
    }

    public void Y() {
        d0(3);
    }

    /* access modifiers changed from: package-private */
    public Bundle Y0(Fragment fragment) {
        if (this.A == null) {
            this.A = new Bundle();
        }
        fragment.E1(this.A);
        R(fragment, this.A, false);
        Bundle bundle = null;
        if (!this.A.isEmpty()) {
            Bundle bundle2 = this.A;
            this.A = null;
            bundle = bundle2;
        }
        if (fragment.J != null) {
            Z0(fragment);
        }
        if (fragment.f1439d != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.f1439d);
        }
        if (!fragment.M) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", fragment.M);
        }
        return bundle;
    }

    public void Z(boolean z2) {
        int size = this.f1499e.size();
        while (true) {
            size--;
            if (size >= 0) {
                Fragment fragment = this.f1499e.get(size);
                if (fragment != null) {
                    fragment.B1(z2);
                }
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void Z0(Fragment fragment) {
        if (fragment.K != null) {
            SparseArray<Parcelable> sparseArray = this.B;
            if (sparseArray == null) {
                this.B = new SparseArray<>();
            } else {
                sparseArray.clear();
            }
            fragment.K.saveHierarchyState(this.B);
            if (this.B.size() > 0) {
                fragment.f1439d = this.B;
                this.B = null;
            }
        }
    }

    public void a(g.b bVar) {
        if (this.k == null) {
            this.k = new ArrayList<>();
        }
        this.k.add(bVar);
    }

    public boolean a0(Menu menu) {
        if (this.m < 1) {
            return false;
        }
        boolean z2 = false;
        for (int i2 = 0; i2 < this.f1499e.size(); i2++) {
            Fragment fragment = this.f1499e.get(i2);
            if (fragment != null && fragment.C1(menu)) {
                z2 = true;
            }
        }
        return z2;
    }

    /* access modifiers changed from: package-private */
    public void a1() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        i iVar;
        if (this.f1500f != null) {
            arrayList3 = null;
            arrayList2 = null;
            arrayList = null;
            for (int i2 = 0; i2 < this.f1500f.size(); i2++) {
                Fragment valueAt = this.f1500f.valueAt(i2);
                if (valueAt != null) {
                    if (valueAt.D) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList3.add(valueAt);
                        Fragment fragment = valueAt.i;
                        valueAt.j = fragment != null ? fragment.f1441f : -1;
                        if (F) {
                            Log.v("FragmentManager", "retainNonConfig: keeping retained " + valueAt);
                        }
                    }
                    h hVar = valueAt.u;
                    if (hVar != null) {
                        hVar.a1();
                        iVar = valueAt.u.D;
                    } else {
                        iVar = valueAt.v;
                    }
                    if (arrayList2 == null && iVar != null) {
                        arrayList2 = new ArrayList(this.f1500f.size());
                        for (int i3 = 0; i3 < i2; i3++) {
                            arrayList2.add((Object) null);
                        }
                    }
                    if (arrayList2 != null) {
                        arrayList2.add(iVar);
                    }
                    if (arrayList == null && valueAt.w != null) {
                        arrayList = new ArrayList(this.f1500f.size());
                        for (int i4 = 0; i4 < i2; i4++) {
                            arrayList.add((Object) null);
                        }
                    }
                    if (arrayList != null) {
                        arrayList.add(valueAt.w);
                    }
                }
            }
        } else {
            arrayList3 = null;
            arrayList2 = null;
            arrayList = null;
        }
        if (arrayList3 == null && arrayList2 == null && arrayList == null) {
            this.D = null;
        } else {
            this.D = new i(arrayList3, arrayList2, arrayList);
        }
    }

    public j b() {
        return new a(this);
    }

    public void b0() {
        this.s = false;
        this.t = false;
        d0(4);
    }

    /* access modifiers changed from: package-private */
    public void b1() {
        synchronized (this) {
            boolean z2 = false;
            boolean z3 = this.C != null && !this.C.isEmpty();
            if (this.f1496b != null && this.f1496b.size() == 1) {
                z2 = true;
            }
            if (z3 || z2) {
                this.n.g().removeCallbacks(this.E);
                this.n.g().post(this.E);
            }
        }
    }

    public void c(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        int size4;
        int size5;
        String str2 = str + "    ";
        SparseArray<Fragment> sparseArray = this.f1500f;
        if (sparseArray != null && (size5 = sparseArray.size()) > 0) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (int i2 = 0; i2 < size5; i2++) {
                Fragment valueAt = this.f1500f.valueAt(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(valueAt);
                if (valueAt != null) {
                    valueAt.r(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        int size6 = this.f1499e.size();
        if (size6 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i3 = 0; i3 < size6; i3++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(this.f1499e.get(i3).toString());
            }
        }
        ArrayList<Fragment> arrayList = this.h;
        if (arrayList != null && (size4 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i4 = 0; i4 < size4; i4++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(this.h.get(i4).toString());
            }
        }
        ArrayList<a> arrayList2 = this.g;
        if (arrayList2 != null && (size3 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i5 = 0; i5 < size3; i5++) {
                a aVar = this.g.get(i5);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i5);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.p(str2, fileDescriptor, printWriter, strArr);
            }
        }
        synchronized (this) {
            if (this.i != null && (size2 = this.i.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int i6 = 0; i6 < size2; i6++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i6);
                    printWriter.print(": ");
                    printWriter.println(this.i.get(i6));
                }
            }
            if (this.j != null && this.j.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.j.toArray()));
            }
        }
        ArrayList<l> arrayList3 = this.f1496b;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Pending Actions:");
            for (int i7 = 0; i7 < size; i7++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i7);
                printWriter.print(": ");
                printWriter.println(this.f1496b.get(i7));
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.n);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.o);
        if (this.p != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.p);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.m);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.s);
        printWriter.print(" mStopped=");
        printWriter.print(this.t);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.u);
        if (this.r) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.r);
        }
        if (this.v != null) {
            printWriter.print(str);
            printWriter.print("  mNoTransactionsBecause=");
            printWriter.println(this.v);
        }
    }

    public void c0() {
        this.s = false;
        this.t = false;
        d0(3);
    }

    public void c1(int i2, a aVar) {
        synchronized (this) {
            if (this.i == null) {
                this.i = new ArrayList<>();
            }
            int size = this.i.size();
            if (i2 < size) {
                if (F) {
                    Log.v("FragmentManager", "Setting back stack index " + i2 + " to " + aVar);
                }
                this.i.set(i2, aVar);
            } else {
                while (size < i2) {
                    this.i.add((Object) null);
                    if (this.j == null) {
                        this.j = new ArrayList<>();
                    }
                    if (F) {
                        Log.v("FragmentManager", "Adding available back stack index " + size);
                    }
                    this.j.add(Integer.valueOf(size));
                    size++;
                }
                if (F) {
                    Log.v("FragmentManager", "Adding back stack index " + i2 + " with " + aVar);
                }
                this.i.add(aVar);
            }
        }
    }

    public boolean d() {
        boolean k0 = k0();
        q0();
        return k0;
    }

    public Fragment e(int i2) {
        for (int size = this.f1499e.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f1499e.get(size);
            if (fragment != null && fragment.y == i2) {
                return fragment;
            }
        }
        SparseArray<Fragment> sparseArray = this.f1500f;
        if (sparseArray == null) {
            return null;
        }
        for (int size2 = sparseArray.size() - 1; size2 >= 0; size2--) {
            Fragment valueAt = this.f1500f.valueAt(size2);
            if (valueAt != null && valueAt.y == i2) {
                return valueAt;
            }
        }
        return null;
    }

    public void e0() {
        this.t = true;
        d0(2);
    }

    public void e1(Fragment fragment) {
        if (fragment == null || (this.f1500f.get(fragment.f1441f) == fragment && (fragment.t == null || fragment.N() == this))) {
            this.q = fragment;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public Fragment f(String str) {
        if (str != null) {
            for (int size = this.f1499e.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f1499e.get(size);
                if (fragment != null && str.equals(fragment.A)) {
                    return fragment;
                }
            }
        }
        SparseArray<Fragment> sparseArray = this.f1500f;
        if (sparseArray == null || str == null) {
            return null;
        }
        for (int size2 = sparseArray.size() - 1; size2 >= 0; size2--) {
            Fragment valueAt = this.f1500f.valueAt(size2);
            if (valueAt != null && str.equals(valueAt.A)) {
                return valueAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void f0() {
        if (this.w) {
            this.w = false;
            i1();
        }
    }

    public int g() {
        ArrayList<a> arrayList = this.g;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public List<Fragment> h() {
        List<Fragment> list;
        if (this.f1499e.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f1499e) {
            list = (List) this.f1499e.clone();
        }
        return list;
    }

    public void h0(l lVar, boolean z2) {
        if (!z2) {
            u();
        }
        synchronized (this) {
            if (!this.u) {
                if (this.n != null) {
                    if (this.f1496b == null) {
                        this.f1496b = new ArrayList<>();
                    }
                    this.f1496b.add(lVar);
                    b1();
                    return;
                }
            }
            if (!z2) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    public void h1(Fragment fragment) {
        if (F) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.B) {
            fragment.B = false;
            fragment.P = !fragment.P;
        }
    }

    public boolean i() {
        return this.s || this.t;
    }

    /* access modifiers changed from: package-private */
    public void i1() {
        if (this.f1500f != null) {
            for (int i2 = 0; i2 < this.f1500f.size(); i2++) {
                Fragment valueAt = this.f1500f.valueAt(i2);
                if (valueAt != null) {
                    M0(valueAt);
                }
            }
        }
    }

    public void j() {
        h0(new m((String) null, -1, 0), false);
    }

    /* access modifiers changed from: package-private */
    public void j0(Fragment fragment) {
        if (fragment.n && !fragment.q) {
            fragment.r1(fragment.v1(fragment.f1438c), (ViewGroup) null, fragment.f1438c);
            View view = fragment.J;
            if (view != null) {
                fragment.K = view;
                view.setSaveFromParentEnabled(false);
                if (fragment.B) {
                    fragment.J.setVisibility(8);
                }
                fragment.j1(fragment.J, fragment.f1438c);
                U(fragment, fragment.J, fragment.f1438c, false);
                return;
            }
            fragment.K = null;
        }
    }

    public void k(int i2, int i3) {
        if (i2 >= 0) {
            h0(new m((String) null, i2, i3), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i2);
    }

    /* JADX INFO: finally extract failed */
    public boolean k0() {
        i0(true);
        boolean z2 = false;
        while (s0(this.x, this.y)) {
            this.f1497c = true;
            try {
                S0(this.x, this.y);
                v();
                z2 = true;
            } catch (Throwable th) {
                v();
                throw th;
            }
        }
        f0();
        t();
        return z2;
    }

    public boolean l() {
        u();
        return N0((String) null, -1, 0);
    }

    /* access modifiers changed from: package-private */
    public void n(a aVar) {
        if (this.g == null) {
            this.g = new ArrayList<>();
        }
        this.g.add(aVar);
    }

    public void o(Fragment fragment, boolean z2) {
        if (F) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        A0(fragment);
        if (fragment.C) {
            return;
        }
        if (!this.f1499e.contains(fragment)) {
            synchronized (this.f1499e) {
                this.f1499e.add(fragment);
            }
            fragment.l = true;
            fragment.m = false;
            if (fragment.J == null) {
                fragment.P = false;
            }
            if (fragment.F && fragment.G) {
                this.r = true;
            }
            if (z2) {
                J0(fragment);
                return;
            }
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    public Fragment o0(String str) {
        Fragment t2;
        SparseArray<Fragment> sparseArray = this.f1500f;
        if (sparseArray == null || str == null) {
            return null;
        }
        for (int size = sparseArray.size() - 1; size >= 0; size--) {
            Fragment valueAt = this.f1500f.valueAt(size);
            if (valueAt != null && (t2 = valueAt.t(str)) != null) {
                return t2;
            }
        }
        return null;
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        String str2 = str;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet2.getAttributeValue((String) null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet2, k.f1526a);
        int i2 = 0;
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        String str3 = attributeValue;
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (!Fragment.A0(this.n.e(), str3)) {
            return null;
        }
        if (view != null) {
            i2 = view.getId();
        }
        if (i2 == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + str3);
        }
        Fragment e2 = resourceId != -1 ? e(resourceId) : null;
        if (e2 == null && string != null) {
            e2 = f(string);
        }
        if (e2 == null && i2 != -1) {
            e2 = e(i2);
        }
        if (F) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + str3 + " existing=" + e2);
        }
        if (e2 == null) {
            e2 = this.o.a(context, str3, (Bundle) null);
            e2.n = true;
            e2.y = resourceId != 0 ? resourceId : i2;
            e2.z = i2;
            e2.A = string;
            e2.o = true;
            e2.s = this;
            f fVar = this.n;
            e2.t = fVar;
            e2.V0(fVar.e(), attributeSet2, e2.f1438c);
            o(e2, true);
        } else if (!e2.o) {
            e2.o = true;
            f fVar2 = this.n;
            e2.t = fVar2;
            if (!e2.E) {
                e2.V0(fVar2.e(), attributeSet2, e2.f1438c);
            }
        } else {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(i2) + " with another fragment for " + str3);
        }
        Fragment fragment = e2;
        if (this.m >= 1 || !fragment.n) {
            J0(fragment);
        } else {
            K0(fragment, 1, 0, 0, false);
        }
        View view2 = fragment.J;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragment.J.getTag() == null) {
                fragment.J.setTag(string);
            }
            return fragment.J;
        }
        throw new IllegalStateException("Fragment " + str3 + " did not create a view.");
    }

    public int p(a aVar) {
        synchronized (this) {
            if (this.j != null) {
                if (this.j.size() > 0) {
                    int intValue = this.j.remove(this.j.size() - 1).intValue();
                    if (F) {
                        Log.v("FragmentManager", "Adding back stack index " + intValue + " with " + aVar);
                    }
                    this.i.set(intValue, aVar);
                    return intValue;
                }
            }
            if (this.i == null) {
                this.i = new ArrayList<>();
            }
            int size = this.i.size();
            if (F) {
                Log.v("FragmentManager", "Setting back stack index " + size + " to " + aVar);
            }
            this.i.add(aVar);
            return size;
        }
    }

    public void r(f fVar, d dVar, Fragment fragment) {
        if (this.n == null) {
            this.n = fVar;
            this.o = dVar;
            this.p = fragment;
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    public void r0(int i2) {
        synchronized (this) {
            this.i.set(i2, (Object) null);
            if (this.j == null) {
                this.j = new ArrayList<>();
            }
            if (F) {
                Log.v("FragmentManager", "Freeing back stack index " + i2);
            }
            this.j.add(Integer.valueOf(i2));
        }
    }

    public void s(Fragment fragment) {
        if (F) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.C) {
            fragment.C = false;
            if (fragment.l) {
                return;
            }
            if (!this.f1499e.contains(fragment)) {
                if (F) {
                    Log.v("FragmentManager", "add from attach: " + fragment);
                }
                synchronized (this.f1499e) {
                    this.f1499e.add(fragment);
                }
                fragment.l = true;
                if (fragment.F && fragment.G) {
                    this.r = true;
                    return;
                }
                return;
            }
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.p;
        if (fragment != null) {
            a.h.j.a.a(fragment, sb);
        } else {
            a.h.j.a.a(this.n, sb);
        }
        sb.append("}}");
        return sb.toString();
    }

    public Fragment u0(Bundle bundle, String str) {
        int i2 = bundle.getInt(str, -1);
        if (i2 == -1) {
            return null;
        }
        Fragment fragment = this.f1500f.get(i2);
        if (fragment != null) {
            return fragment;
        }
        j1(new IllegalStateException("Fragment no longer exists for key " + str + ": index " + i2));
        throw null;
    }

    /* access modifiers changed from: package-private */
    public LayoutInflater.Factory2 v0() {
        return this;
    }

    /* access modifiers changed from: package-private */
    public void w(a aVar, boolean z2, boolean z3, boolean z4) {
        if (z2) {
            aVar.s(z4);
        } else {
            aVar.r();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z2));
        if (z3) {
            k.C(this, arrayList, arrayList2, 0, 1, true);
        }
        if (z4) {
            I0(this.m, true);
        }
        SparseArray<Fragment> sparseArray = this.f1500f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                Fragment valueAt = this.f1500f.valueAt(i2);
                if (valueAt != null && valueAt.J != null && valueAt.O && aVar.v(valueAt.z)) {
                    float f2 = valueAt.Q;
                    if (f2 > 0.0f) {
                        valueAt.J.setAlpha(f2);
                    }
                    if (z4) {
                        valueAt.Q = 0.0f;
                    } else {
                        valueAt.Q = -1.0f;
                        valueAt.O = false;
                    }
                }
            }
        }
    }

    public Fragment w0() {
        return this.q;
    }

    /* access modifiers changed from: package-private */
    public void x(Fragment fragment) {
        Animator animator;
        if (fragment.J != null) {
            g z0 = z0(fragment, fragment.V(), !fragment.B, fragment.W());
            if (z0 == null || (animator = z0.f1517b) == null) {
                if (z0 != null) {
                    d1(fragment.J, z0);
                    fragment.J.startAnimation(z0.f1516a);
                    z0.f1516a.start();
                }
                fragment.J.setVisibility((!fragment.B || fragment.t0()) ? 0 : 8);
                if (fragment.t0()) {
                    fragment.Q1(false);
                }
            } else {
                animator.setTarget(fragment.J);
                if (!fragment.B) {
                    fragment.J.setVisibility(0);
                } else if (fragment.t0()) {
                    fragment.Q1(false);
                } else {
                    ViewGroup viewGroup = fragment.I;
                    View view = fragment.J;
                    viewGroup.startViewTransition(view);
                    z0.f1517b.addListener(new d(this, viewGroup, view, fragment));
                }
                d1(fragment.J, z0);
                z0.f1517b.start();
            }
        }
        if (fragment.l && fragment.F && fragment.G) {
            this.r = true;
        }
        fragment.P = false;
        fragment.T0(fragment.B);
    }

    public void x0(Fragment fragment) {
        if (F) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.B) {
            fragment.B = true;
            fragment.P = true ^ fragment.P;
        }
    }

    public void y(Fragment fragment) {
        if (F) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.C) {
            fragment.C = true;
            if (fragment.l) {
                if (F) {
                    Log.v("FragmentManager", "remove from detach: " + fragment);
                }
                synchronized (this.f1499e) {
                    this.f1499e.remove(fragment);
                }
                if (fragment.F && fragment.G) {
                    this.r = true;
                }
                fragment.l = false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean y0(int i2) {
        return this.m >= i2;
    }

    public void z() {
        this.s = false;
        this.t = false;
        d0(2);
    }

    /* access modifiers changed from: package-private */
    public g z0(Fragment fragment, int i2, boolean z2, int i3) {
        int k1;
        int S = fragment.S();
        Animation K0 = fragment.K0(i2, z2, S);
        if (K0 != null) {
            return new g(K0);
        }
        Animator L0 = fragment.L0(i2, z2, S);
        if (L0 != null) {
            return new g(L0);
        }
        if (S != 0) {
            boolean equals = "anim".equals(this.n.e().getResources().getResourceTypeName(S));
            boolean z3 = false;
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(this.n.e(), S);
                    if (loadAnimation != null) {
                        return new g(loadAnimation);
                    }
                    z3 = true;
                } catch (Resources.NotFoundException e2) {
                    throw e2;
                } catch (RuntimeException unused) {
                }
            }
            if (!z3) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(this.n.e(), S);
                    if (loadAnimator != null) {
                        return new g(loadAnimator);
                    }
                } catch (RuntimeException e3) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(this.n.e(), S);
                        if (loadAnimation2 != null) {
                            return new g(loadAnimation2);
                        }
                    } else {
                        throw e3;
                    }
                }
            }
        }
        if (i2 == 0 || (k1 = k1(i2, z2)) < 0) {
            return null;
        }
        switch (k1) {
            case 1:
                return D0(this.n.e(), 1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return D0(this.n.e(), 1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return D0(this.n.e(), 0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return D0(this.n.e(), 1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                return B0(this.n.e(), 0.0f, 1.0f);
            case 6:
                return B0(this.n.e(), 1.0f, 0.0f);
            default:
                if (i3 == 0 && this.n.l()) {
                    i3 = this.n.k();
                }
                if (i3 == 0) {
                }
                return null;
        }
    }

    /* compiled from: FragmentManager */
    private static class g {

        /* renamed from: a  reason: collision with root package name */
        public final Animation f1516a;

        /* renamed from: b  reason: collision with root package name */
        public final Animator f1517b;

        g(Animation animation) {
            this.f1516a = animation;
            this.f1517b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        g(Animator animator) {
            this.f1516a = null;
            this.f1517b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* compiled from: FragmentManager */
    private static class i extends AnimationSet implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final ViewGroup f1519b;

        /* renamed from: c  reason: collision with root package name */
        private final View f1520c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f1521d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f1522e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f1523f = true;

        i(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f1519b = viewGroup;
            this.f1520c = view;
            addAnimation(animation);
            this.f1519b.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation) {
            this.f1523f = true;
            if (this.f1521d) {
                return !this.f1522e;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f1521d = true;
                n.a(this.f1519b, this);
            }
            return true;
        }

        public void run() {
            if (this.f1521d || !this.f1523f) {
                this.f1519b.endViewTransition(this.f1520c);
                this.f1522e = true;
                return;
            }
            this.f1523f = false;
            this.f1519b.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation, float f2) {
            this.f1523f = true;
            if (this.f1521d) {
                return !this.f1522e;
            }
            if (!super.getTransformation(j, transformation, f2)) {
                this.f1521d = true;
                n.a(this.f1519b, this);
            }
            return true;
        }
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }
}
