package a.q;

import a.q.a;
import a.q.m;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: Visibility */
public abstract class i0 extends m {
    private static final String[] L = {"android:visibility:visibility", "android:visibility:parent"};
    private int K = 3;

    /* compiled from: Visibility */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w f544a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f545b;

        a(i0 i0Var, w wVar, View view) {
            this.f544a = wVar;
            this.f545b = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f544a.d(this.f545b);
        }
    }

    /* compiled from: Visibility */
    private static class b extends AnimatorListenerAdapter implements m.f, a.C0025a {

        /* renamed from: a  reason: collision with root package name */
        private final View f546a;

        /* renamed from: b  reason: collision with root package name */
        private final int f547b;

        /* renamed from: c  reason: collision with root package name */
        private final ViewGroup f548c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f549d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f550e;

        /* renamed from: f  reason: collision with root package name */
        boolean f551f = false;

        b(View view, int i, boolean z) {
            this.f546a = view;
            this.f547b = i;
            this.f548c = (ViewGroup) view.getParent();
            this.f549d = z;
            f(true);
        }

        private void e() {
            if (!this.f551f) {
                d0.i(this.f546a, this.f547b);
                ViewGroup viewGroup = this.f548c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            f(false);
        }

        private void f(boolean z) {
            ViewGroup viewGroup;
            if (this.f549d && this.f550e != z && (viewGroup = this.f548c) != null) {
                this.f550e = z;
                x.b(viewGroup, z);
            }
        }

        public void a(m mVar) {
        }

        public void b(m mVar) {
            f(false);
        }

        public void c(m mVar) {
            e();
            mVar.b0(this);
        }

        public void d(m mVar) {
            f(true);
        }

        public void onAnimationCancel(Animator animator) {
            this.f551f = true;
        }

        public void onAnimationEnd(Animator animator) {
            e();
        }

        public void onAnimationPause(Animator animator) {
            if (!this.f551f) {
                d0.i(this.f546a, this.f547b);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationResume(Animator animator) {
            if (!this.f551f) {
                d0.i(this.f546a, 0);
            }
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* compiled from: Visibility */
    private static class c {

        /* renamed from: a  reason: collision with root package name */
        boolean f552a;

        /* renamed from: b  reason: collision with root package name */
        boolean f553b;

        /* renamed from: c  reason: collision with root package name */
        int f554c;

        /* renamed from: d  reason: collision with root package name */
        int f555d;

        /* renamed from: e  reason: collision with root package name */
        ViewGroup f556e;

        /* renamed from: f  reason: collision with root package name */
        ViewGroup f557f;

        c() {
        }
    }

    private void o0(s sVar) {
        sVar.f588a.put("android:visibility:visibility", Integer.valueOf(sVar.f589b.getVisibility()));
        sVar.f588a.put("android:visibility:parent", sVar.f589b.getParent());
        int[] iArr = new int[2];
        sVar.f589b.getLocationOnScreen(iArr);
        sVar.f588a.put("android:visibility:screenLocation", iArr);
    }

    private c p0(s sVar, s sVar2) {
        c cVar = new c();
        cVar.f552a = false;
        cVar.f553b = false;
        if (sVar == null || !sVar.f588a.containsKey("android:visibility:visibility")) {
            cVar.f554c = -1;
            cVar.f556e = null;
        } else {
            cVar.f554c = ((Integer) sVar.f588a.get("android:visibility:visibility")).intValue();
            cVar.f556e = (ViewGroup) sVar.f588a.get("android:visibility:parent");
        }
        if (sVar2 == null || !sVar2.f588a.containsKey("android:visibility:visibility")) {
            cVar.f555d = -1;
            cVar.f557f = null;
        } else {
            cVar.f555d = ((Integer) sVar2.f588a.get("android:visibility:visibility")).intValue();
            cVar.f557f = (ViewGroup) sVar2.f588a.get("android:visibility:parent");
        }
        if (sVar == null || sVar2 == null) {
            if (sVar == null && cVar.f555d == 0) {
                cVar.f553b = true;
                cVar.f552a = true;
            } else if (sVar2 == null && cVar.f554c == 0) {
                cVar.f553b = false;
                cVar.f552a = true;
            }
        } else if (cVar.f554c == cVar.f555d && cVar.f556e == cVar.f557f) {
            return cVar;
        } else {
            int i = cVar.f554c;
            int i2 = cVar.f555d;
            if (i != i2) {
                if (i == 0) {
                    cVar.f553b = false;
                    cVar.f552a = true;
                } else if (i2 == 0) {
                    cVar.f553b = true;
                    cVar.f552a = true;
                }
            } else if (cVar.f557f == null) {
                cVar.f553b = false;
                cVar.f552a = true;
            } else if (cVar.f556e == null) {
                cVar.f553b = true;
                cVar.f552a = true;
            }
        }
        return cVar;
    }

    public String[] P() {
        return L;
    }

    public boolean R(s sVar, s sVar2) {
        if (sVar == null && sVar2 == null) {
            return false;
        }
        if (sVar != null && sVar2 != null && sVar2.f588a.containsKey("android:visibility:visibility") != sVar.f588a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c p0 = p0(sVar, sVar2);
        if (!p0.f552a) {
            return false;
        }
        if (p0.f554c == 0 || p0.f555d == 0) {
            return true;
        }
        return false;
    }

    public void g(s sVar) {
        o0(sVar);
    }

    public void k(s sVar) {
        o0(sVar);
    }

    public Animator p(ViewGroup viewGroup, s sVar, s sVar2) {
        c p0 = p0(sVar, sVar2);
        if (!p0.f552a) {
            return null;
        }
        if (p0.f556e == null && p0.f557f == null) {
            return null;
        }
        if (p0.f553b) {
            return r0(viewGroup, sVar, p0.f554c, sVar2, p0.f555d);
        }
        return t0(viewGroup, sVar, p0.f554c, sVar2, p0.f555d);
    }

    public abstract Animator q0(ViewGroup viewGroup, View view, s sVar, s sVar2);

    public Animator r0(ViewGroup viewGroup, s sVar, int i, s sVar2, int i2) {
        if ((this.K & 1) != 1 || sVar2 == null) {
            return null;
        }
        if (sVar == null) {
            View view = (View) sVar2.f589b.getParent();
            if (p0(y(view, false), Q(view, false)).f552a) {
                return null;
            }
        }
        return q0(viewGroup, sVar2.f589b, sVar, sVar2);
    }

    public abstract Animator s0(ViewGroup viewGroup, View view, s sVar, s sVar2);

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0087 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ee A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator t0(android.view.ViewGroup r7, a.q.s r8, int r9, a.q.s r10, int r11) {
        /*
            r6 = this;
            int r9 = r6.K
            r0 = 2
            r9 = r9 & r0
            r1 = 0
            if (r9 == r0) goto L_0x0008
            return r1
        L_0x0008:
            if (r8 == 0) goto L_0x000d
            android.view.View r9 = r8.f589b
            goto L_0x000e
        L_0x000d:
            r9 = r1
        L_0x000e:
            if (r10 == 0) goto L_0x0013
            android.view.View r2 = r10.f589b
            goto L_0x0014
        L_0x0013:
            r2 = r1
        L_0x0014:
            r3 = 1
            if (r2 == 0) goto L_0x0037
            android.view.ViewParent r4 = r2.getParent()
            if (r4 != 0) goto L_0x001e
            goto L_0x0037
        L_0x001e:
            r4 = 4
            if (r11 != r4) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            if (r9 != r2) goto L_0x0027
        L_0x0024:
            r9 = r1
            goto L_0x0084
        L_0x0027:
            boolean r2 = r6.w
            if (r2 == 0) goto L_0x002c
            goto L_0x0044
        L_0x002c:
            android.view.ViewParent r2 = r9.getParent()
            android.view.View r2 = (android.view.View) r2
            android.view.View r9 = a.q.r.a(r7, r9, r2)
            goto L_0x003a
        L_0x0037:
            if (r2 == 0) goto L_0x003c
            r9 = r2
        L_0x003a:
            r2 = r1
            goto L_0x0084
        L_0x003c:
            if (r9 == 0) goto L_0x0082
            android.view.ViewParent r2 = r9.getParent()
            if (r2 != 0) goto L_0x0045
        L_0x0044:
            goto L_0x003a
        L_0x0045:
            android.view.ViewParent r2 = r9.getParent()
            boolean r2 = r2 instanceof android.view.View
            if (r2 == 0) goto L_0x0082
            android.view.ViewParent r2 = r9.getParent()
            android.view.View r2 = (android.view.View) r2
            a.q.s r4 = r6.Q(r2, r3)
            a.q.s r5 = r6.y(r2, r3)
            a.q.i0$c r4 = r6.p0(r4, r5)
            boolean r4 = r4.f552a
            if (r4 != 0) goto L_0x0068
            android.view.View r9 = a.q.r.a(r7, r9, r2)
            goto L_0x003a
        L_0x0068:
            android.view.ViewParent r4 = r2.getParent()
            if (r4 != 0) goto L_0x0080
            int r2 = r2.getId()
            r4 = -1
            if (r2 == r4) goto L_0x0080
            android.view.View r2 = r7.findViewById(r2)
            if (r2 == 0) goto L_0x0080
            boolean r2 = r6.w
            if (r2 == 0) goto L_0x0080
            goto L_0x003a
        L_0x0080:
            r9 = r1
            goto L_0x003a
        L_0x0082:
            r9 = r1
            r2 = r9
        L_0x0084:
            r4 = 0
            if (r9 == 0) goto L_0x00cc
            if (r8 == 0) goto L_0x00cc
            java.util.Map<java.lang.String, java.lang.Object> r11 = r8.f588a
            java.lang.String r1 = "android:visibility:screenLocation"
            java.lang.Object r11 = r11.get(r1)
            int[] r11 = (int[]) r11
            r1 = r11[r4]
            r11 = r11[r3]
            int[] r0 = new int[r0]
            r7.getLocationOnScreen(r0)
            r2 = r0[r4]
            int r1 = r1 - r2
            int r2 = r9.getLeft()
            int r1 = r1 - r2
            r9.offsetLeftAndRight(r1)
            r0 = r0[r3]
            int r11 = r11 - r0
            int r0 = r9.getTop()
            int r11 = r11 - r0
            r9.offsetTopAndBottom(r11)
            a.q.w r11 = a.q.x.a(r7)
            r11.c(r9)
            android.animation.Animator r7 = r6.s0(r7, r9, r8, r10)
            if (r7 != 0) goto L_0x00c3
            r11.d(r9)
            goto L_0x00cb
        L_0x00c3:
            a.q.i0$a r8 = new a.q.i0$a
            r8.<init>(r6, r11, r9)
            r7.addListener(r8)
        L_0x00cb:
            return r7
        L_0x00cc:
            if (r2 == 0) goto L_0x00ee
            int r9 = r2.getVisibility()
            a.q.d0.i(r2, r4)
            android.animation.Animator r7 = r6.s0(r7, r2, r8, r10)
            if (r7 == 0) goto L_0x00ea
            a.q.i0$b r8 = new a.q.i0$b
            r8.<init>(r2, r11, r3)
            r7.addListener(r8)
            a.q.a.a(r7, r8)
            r6.b(r8)
            goto L_0x00ed
        L_0x00ea:
            a.q.d0.i(r2, r9)
        L_0x00ed:
            return r7
        L_0x00ee:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a.q.i0.t0(android.view.ViewGroup, a.q.s, int, a.q.s, int):android.animation.Animator");
    }

    public void u0(int i) {
        if ((i & -4) == 0) {
            this.K = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }
}
