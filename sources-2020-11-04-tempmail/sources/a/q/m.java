package a.q;

import a.e.g;
import a.h.k.u;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Transition */
public abstract class m implements Cloneable {
    private static final int[] H = {2, 1, 3, 4};
    private static final g I = new a();
    private static ThreadLocal<a.e.a<Animator, d>> J = new ThreadLocal<>();
    private boolean A = false;
    private ArrayList<f> B = null;
    private ArrayList<Animator> C = new ArrayList<>();
    p D;
    private e E;
    private a.e.a<String, String> F;
    private g G = I;

    /* renamed from: b  reason: collision with root package name */
    private String f563b = getClass().getName();

    /* renamed from: c  reason: collision with root package name */
    private long f564c = -1;

    /* renamed from: d  reason: collision with root package name */
    long f565d = -1;

    /* renamed from: e  reason: collision with root package name */
    private TimeInterpolator f566e = null;

    /* renamed from: f  reason: collision with root package name */
    ArrayList<Integer> f567f = new ArrayList<>();
    ArrayList<View> g = new ArrayList<>();
    private ArrayList<String> h = null;
    private ArrayList<Class> i = null;
    private ArrayList<Integer> j = null;
    private ArrayList<View> k = null;
    private ArrayList<Class> l = null;
    private ArrayList<String> m = null;
    private ArrayList<Integer> n = null;
    private ArrayList<View> o = null;
    private ArrayList<Class> p = null;
    private t q = new t();
    private t r = new t();
    q s = null;
    private int[] t = H;
    private ArrayList<s> u;
    private ArrayList<s> v;
    boolean w = false;
    ArrayList<Animator> x = new ArrayList<>();
    private int y = 0;
    private boolean z = false;

    /* compiled from: Transition */
    static class a extends g {
        a() {
        }

        public Path a(float f2, float f3, float f4, float f5) {
            Path path = new Path();
            path.moveTo(f2, f3);
            path.lineTo(f4, f5);
            return path;
        }
    }

    /* compiled from: Transition */
    class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a.e.a f568a;

        b(a.e.a aVar) {
            this.f568a = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f568a.remove(animator);
            m.this.x.remove(animator);
        }

        public void onAnimationStart(Animator animator) {
            m.this.x.add(animator);
        }
    }

    /* compiled from: Transition */
    class c extends AnimatorListenerAdapter {
        c() {
        }

        public void onAnimationEnd(Animator animator) {
            m.this.s();
            animator.removeListener(this);
        }
    }

    /* compiled from: Transition */
    private static class d {

        /* renamed from: a  reason: collision with root package name */
        View f571a;

        /* renamed from: b  reason: collision with root package name */
        String f572b;

        /* renamed from: c  reason: collision with root package name */
        s f573c;

        /* renamed from: d  reason: collision with root package name */
        l0 f574d;

        /* renamed from: e  reason: collision with root package name */
        m f575e;

        d(View view, String str, m mVar, l0 l0Var, s sVar) {
            this.f571a = view;
            this.f572b = str;
            this.f573c = sVar;
            this.f574d = l0Var;
            this.f575e = mVar;
        }
    }

    /* compiled from: Transition */
    public static abstract class e {
    }

    /* compiled from: Transition */
    public interface f {
        void a(m mVar);

        void b(m mVar);

        void c(m mVar);

        void d(m mVar);
    }

    private static a.e.a<Animator, d> E() {
        a.e.a<Animator, d> aVar = J.get();
        if (aVar != null) {
            return aVar;
        }
        a.e.a<Animator, d> aVar2 = new a.e.a<>();
        J.set(aVar2);
        return aVar2;
    }

    private static boolean T(s sVar, s sVar2, String str) {
        Object obj = sVar.f588a.get(str);
        Object obj2 = sVar2.f588a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    private void U(a.e.a<View, s> aVar, a.e.a<View, s> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            View valueAt = sparseArray.valueAt(i2);
            if (valueAt != null && S(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i2))) != null && S(view)) {
                s sVar = aVar.get(valueAt);
                s sVar2 = aVar2.get(view);
                if (!(sVar == null || sVar2 == null)) {
                    this.u.add(sVar);
                    this.v.add(sVar2);
                    aVar.remove(valueAt);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void V(a.e.a<View, s> aVar, a.e.a<View, s> aVar2) {
        s remove;
        View view;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View i2 = aVar.i(size);
            if (!(i2 == null || !S(i2) || (remove = aVar2.remove(i2)) == null || (view = remove.f589b) == null || !S(view))) {
                this.u.add(aVar.k(size));
                this.v.add(remove);
            }
        }
    }

    private void W(a.e.a<View, s> aVar, a.e.a<View, s> aVar2, a.e.d<View> dVar, a.e.d<View> dVar2) {
        View i2;
        int r2 = dVar.r();
        for (int i3 = 0; i3 < r2; i3++) {
            View s2 = dVar.s(i3);
            if (s2 != null && S(s2) && (i2 = dVar2.i(dVar.l(i3))) != null && S(i2)) {
                s sVar = aVar.get(s2);
                s sVar2 = aVar2.get(i2);
                if (!(sVar == null || sVar2 == null)) {
                    this.u.add(sVar);
                    this.v.add(sVar2);
                    aVar.remove(s2);
                    aVar2.remove(i2);
                }
            }
        }
    }

    private void X(a.e.a<View, s> aVar, a.e.a<View, s> aVar2, a.e.a<String, View> aVar3, a.e.a<String, View> aVar4) {
        View view;
        int size = aVar3.size();
        for (int i2 = 0; i2 < size; i2++) {
            View m2 = aVar3.m(i2);
            if (m2 != null && S(m2) && (view = aVar4.get(aVar3.i(i2))) != null && S(view)) {
                s sVar = aVar.get(m2);
                s sVar2 = aVar2.get(view);
                if (!(sVar == null || sVar2 == null)) {
                    this.u.add(sVar);
                    this.v.add(sVar2);
                    aVar.remove(m2);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void Y(t tVar, t tVar2) {
        a.e.a aVar = new a.e.a((g) tVar.f591a);
        a.e.a aVar2 = new a.e.a((g) tVar2.f591a);
        int i2 = 0;
        while (true) {
            int[] iArr = this.t;
            if (i2 < iArr.length) {
                int i3 = iArr[i2];
                if (i3 == 1) {
                    V(aVar, aVar2);
                } else if (i3 == 2) {
                    X(aVar, aVar2, tVar.f594d, tVar2.f594d);
                } else if (i3 == 3) {
                    U(aVar, aVar2, tVar.f592b, tVar2.f592b);
                } else if (i3 == 4) {
                    W(aVar, aVar2, tVar.f593c, tVar2.f593c);
                }
                i2++;
            } else {
                d(aVar, aVar2);
                return;
            }
        }
    }

    private void d(a.e.a<View, s> aVar, a.e.a<View, s> aVar2) {
        for (int i2 = 0; i2 < aVar.size(); i2++) {
            s m2 = aVar.m(i2);
            if (S(m2.f589b)) {
                this.u.add(m2);
                this.v.add((Object) null);
            }
        }
        for (int i3 = 0; i3 < aVar2.size(); i3++) {
            s m3 = aVar2.m(i3);
            if (S(m3.f589b)) {
                this.v.add(m3);
                this.u.add((Object) null);
            }
        }
    }

    private static void e(t tVar, View view, s sVar) {
        tVar.f591a.put(view, sVar);
        int id = view.getId();
        if (id >= 0) {
            if (tVar.f592b.indexOfKey(id) >= 0) {
                tVar.f592b.put(id, (Object) null);
            } else {
                tVar.f592b.put(id, view);
            }
        }
        String z2 = u.z(view);
        if (z2 != null) {
            if (tVar.f594d.containsKey(z2)) {
                tVar.f594d.put(z2, null);
            } else {
                tVar.f594d.put(z2, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (tVar.f593c.k(itemIdAtPosition) >= 0) {
                    View i2 = tVar.f593c.i(itemIdAtPosition);
                    if (i2 != null) {
                        u.h0(i2, false);
                        tVar.f593c.n(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                u.h0(view, true);
                tVar.f593c.n(itemIdAtPosition, view);
            }
        }
    }

    private void e0(Animator animator, a.e.a<Animator, d> aVar) {
        if (animator != null) {
            animator.addListener(new b(aVar));
            f(animator);
        }
    }

    private void i(View view, boolean z2) {
        if (view != null) {
            int id = view.getId();
            ArrayList<Integer> arrayList = this.j;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
                ArrayList<View> arrayList2 = this.k;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ArrayList<Class> arrayList3 = this.l;
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        int i2 = 0;
                        while (i2 < size) {
                            if (!this.l.get(i2).isInstance(view)) {
                                i2++;
                            } else {
                                return;
                            }
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        s sVar = new s();
                        sVar.f589b = view;
                        if (z2) {
                            k(sVar);
                        } else {
                            g(sVar);
                        }
                        sVar.f590c.add(this);
                        j(sVar);
                        if (z2) {
                            e(this.q, view, sVar);
                        } else {
                            e(this.r, view, sVar);
                        }
                    }
                    if (view instanceof ViewGroup) {
                        ArrayList<Integer> arrayList4 = this.n;
                        if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                            ArrayList<View> arrayList5 = this.o;
                            if (arrayList5 == null || !arrayList5.contains(view)) {
                                ArrayList<Class> arrayList6 = this.p;
                                if (arrayList6 != null) {
                                    int size2 = arrayList6.size();
                                    int i3 = 0;
                                    while (i3 < size2) {
                                        if (!this.p.get(i3).isInstance(view)) {
                                            i3++;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                ViewGroup viewGroup = (ViewGroup) view;
                                for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                                    i(viewGroup.getChildAt(i4), z2);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public g C() {
        return this.G;
    }

    public p D() {
        return this.D;
    }

    public long F() {
        return this.f564c;
    }

    public List<Integer> H() {
        return this.f567f;
    }

    public List<String> I() {
        return this.h;
    }

    public List<Class> L() {
        return this.i;
    }

    public List<View> M() {
        return this.g;
    }

    public String[] P() {
        return null;
    }

    public s Q(View view, boolean z2) {
        q qVar = this.s;
        if (qVar != null) {
            return qVar.Q(view, z2);
        }
        return (z2 ? this.q : this.r).f591a.get(view);
    }

    public boolean R(s sVar, s sVar2) {
        if (sVar == null || sVar2 == null) {
            return false;
        }
        String[] P = P();
        if (P != null) {
            int length = P.length;
            int i2 = 0;
            while (i2 < length) {
                if (!T(sVar, sVar2, P[i2])) {
                    i2++;
                }
            }
            return false;
        }
        for (String T : sVar.f588a.keySet()) {
            if (T(sVar, sVar2, T)) {
            }
        }
        return false;
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean S(View view) {
        ArrayList<Class> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.j;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.k;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class> arrayList5 = this.l;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (this.l.get(i2).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.m != null && u.z(view) != null && this.m.contains(u.z(view))) {
            return false;
        }
        if ((this.f567f.size() == 0 && this.g.size() == 0 && (((arrayList = this.i) == null || arrayList.isEmpty()) && ((arrayList2 = this.h) == null || arrayList2.isEmpty()))) || this.f567f.contains(Integer.valueOf(id)) || this.g.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.h;
        if (arrayList6 != null && arrayList6.contains(u.z(view))) {
            return true;
        }
        if (this.i != null) {
            for (int i3 = 0; i3 < this.i.size(); i3++) {
                if (this.i.get(i3).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void Z(View view) {
        if (!this.A) {
            a.e.a<Animator, d> E2 = E();
            int size = E2.size();
            l0 e2 = d0.e(view);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                d m2 = E2.m(i2);
                if (m2.f571a != null && e2.equals(m2.f574d)) {
                    a.b(E2.i(i2));
                }
            }
            ArrayList<f> arrayList = this.B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.B.clone();
                int size2 = arrayList2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ((f) arrayList2.get(i3)).b(this);
                }
            }
            this.z = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void a0(ViewGroup viewGroup) {
        d dVar;
        this.u = new ArrayList<>();
        this.v = new ArrayList<>();
        Y(this.q, this.r);
        a.e.a<Animator, d> E2 = E();
        int size = E2.size();
        l0 e2 = d0.e(viewGroup);
        for (int i2 = size - 1; i2 >= 0; i2--) {
            Animator i3 = E2.i(i2);
            if (!(i3 == null || (dVar = E2.get(i3)) == null || dVar.f571a == null || !e2.equals(dVar.f574d))) {
                s sVar = dVar.f573c;
                View view = dVar.f571a;
                s Q = Q(view, true);
                s y2 = y(view, true);
                if (!(Q == null && y2 == null) && dVar.f575e.R(sVar, y2)) {
                    if (i3.isRunning() || i3.isStarted()) {
                        i3.cancel();
                    } else {
                        E2.remove(i3);
                    }
                }
            }
        }
        r(viewGroup, this.q, this.r, this.u, this.v);
        f0();
    }

    public m b(f fVar) {
        if (this.B == null) {
            this.B = new ArrayList<>();
        }
        this.B.add(fVar);
        return this;
    }

    public m b0(f fVar) {
        ArrayList<f> arrayList = this.B;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.B.size() == 0) {
            this.B = null;
        }
        return this;
    }

    public m c(View view) {
        this.g.add(view);
        return this;
    }

    public m c0(View view) {
        this.g.remove(view);
        return this;
    }

    public void d0(View view) {
        if (this.z) {
            if (!this.A) {
                a.e.a<Animator, d> E2 = E();
                int size = E2.size();
                l0 e2 = d0.e(view);
                for (int i2 = size - 1; i2 >= 0; i2--) {
                    d m2 = E2.m(i2);
                    if (m2.f571a != null && e2.equals(m2.f574d)) {
                        a.c(E2.i(i2));
                    }
                }
                ArrayList<f> arrayList = this.B;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.B.clone();
                    int size2 = arrayList2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        ((f) arrayList2.get(i3)).d(this);
                    }
                }
            }
            this.z = false;
        }
    }

    /* access modifiers changed from: protected */
    public void f(Animator animator) {
        if (animator == null) {
            s();
            return;
        }
        if (t() >= 0) {
            animator.setDuration(t());
        }
        if (F() >= 0) {
            animator.setStartDelay(F());
        }
        if (x() != null) {
            animator.setInterpolator(x());
        }
        animator.addListener(new c());
        animator.start();
    }

    /* access modifiers changed from: protected */
    public void f0() {
        m0();
        a.e.a<Animator, d> E2 = E();
        Iterator<Animator> it = this.C.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (E2.containsKey(next)) {
                m0();
                e0(next, E2);
            }
        }
        this.C.clear();
        s();
    }

    public abstract void g(s sVar);

    public m g0(long j2) {
        this.f565d = j2;
        return this;
    }

    public void h0(e eVar) {
        this.E = eVar;
    }

    public m i0(TimeInterpolator timeInterpolator) {
        this.f566e = timeInterpolator;
        return this;
    }

    /* access modifiers changed from: package-private */
    public void j(s sVar) {
        String[] b2;
        if (this.D != null && !sVar.f588a.isEmpty() && (b2 = this.D.b()) != null) {
            boolean z2 = false;
            int i2 = 0;
            while (true) {
                if (i2 >= b2.length) {
                    z2 = true;
                    break;
                } else if (!sVar.f588a.containsKey(b2[i2])) {
                    break;
                } else {
                    i2++;
                }
            }
            if (!z2) {
                this.D.a(sVar);
            }
        }
    }

    public void j0(g gVar) {
        if (gVar == null) {
            this.G = I;
        } else {
            this.G = gVar;
        }
    }

    public abstract void k(s sVar);

    public void k0(p pVar) {
        this.D = pVar;
    }

    /* access modifiers changed from: package-private */
    public void l(ViewGroup viewGroup, boolean z2) {
        a.e.a<String, String> aVar;
        ArrayList<String> arrayList;
        ArrayList<Class> arrayList2;
        n(z2);
        if ((this.f567f.size() > 0 || this.g.size() > 0) && (((arrayList = this.h) == null || arrayList.isEmpty()) && ((arrayList2 = this.i) == null || arrayList2.isEmpty()))) {
            for (int i2 = 0; i2 < this.f567f.size(); i2++) {
                View findViewById = viewGroup.findViewById(this.f567f.get(i2).intValue());
                if (findViewById != null) {
                    s sVar = new s();
                    sVar.f589b = findViewById;
                    if (z2) {
                        k(sVar);
                    } else {
                        g(sVar);
                    }
                    sVar.f590c.add(this);
                    j(sVar);
                    if (z2) {
                        e(this.q, findViewById, sVar);
                    } else {
                        e(this.r, findViewById, sVar);
                    }
                }
            }
            for (int i3 = 0; i3 < this.g.size(); i3++) {
                View view = this.g.get(i3);
                s sVar2 = new s();
                sVar2.f589b = view;
                if (z2) {
                    k(sVar2);
                } else {
                    g(sVar2);
                }
                sVar2.f590c.add(this);
                j(sVar2);
                if (z2) {
                    e(this.q, view, sVar2);
                } else {
                    e(this.r, view, sVar2);
                }
            }
        } else {
            i(viewGroup, z2);
        }
        if (!z2 && (aVar = this.F) != null) {
            int size = aVar.size();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i4 = 0; i4 < size; i4++) {
                arrayList3.add(this.q.f594d.remove(this.F.i(i4)));
            }
            for (int i5 = 0; i5 < size; i5++) {
                View view2 = (View) arrayList3.get(i5);
                if (view2 != null) {
                    this.q.f594d.put(this.F.m(i5), view2);
                }
            }
        }
    }

    public m l0(long j2) {
        this.f564c = j2;
        return this;
    }

    /* access modifiers changed from: protected */
    public void m0() {
        if (this.y == 0) {
            ArrayList<f> arrayList = this.B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.B.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((f) arrayList2.get(i2)).a(this);
                }
            }
            this.A = false;
        }
        this.y++;
    }

    /* access modifiers changed from: package-private */
    public void n(boolean z2) {
        if (z2) {
            this.q.f591a.clear();
            this.q.f592b.clear();
            this.q.f593c.c();
            return;
        }
        this.r.f591a.clear();
        this.r.f592b.clear();
        this.r.f593c.c();
    }

    /* access modifiers changed from: package-private */
    public String n0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f565d != -1) {
            str2 = str2 + "dur(" + this.f565d + ") ";
        }
        if (this.f564c != -1) {
            str2 = str2 + "dly(" + this.f564c + ") ";
        }
        if (this.f566e != null) {
            str2 = str2 + "interp(" + this.f566e + ") ";
        }
        if (this.f567f.size() <= 0 && this.g.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f567f.size() > 0) {
            for (int i2 = 0; i2 < this.f567f.size(); i2++) {
                if (i2 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f567f.get(i2);
            }
        }
        if (this.g.size() > 0) {
            for (int i3 = 0; i3 < this.g.size(); i3++) {
                if (i3 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.g.get(i3);
            }
        }
        return str3 + ")";
    }

    /* renamed from: o */
    public m clone() {
        try {
            m mVar = (m) super.clone();
            mVar.C = new ArrayList<>();
            mVar.q = new t();
            mVar.r = new t();
            mVar.u = null;
            mVar.v = null;
            return mVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator p(ViewGroup viewGroup, s sVar, s sVar2) {
        return null;
    }

    /* access modifiers changed from: protected */
    public void r(ViewGroup viewGroup, t tVar, t tVar2, ArrayList<s> arrayList, ArrayList<s> arrayList2) {
        int i2;
        int i3;
        Animator p2;
        View view;
        Animator animator;
        s sVar;
        s sVar2;
        Animator animator2;
        ViewGroup viewGroup2 = viewGroup;
        a.e.a<Animator, d> E2 = E();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j2 = Long.MAX_VALUE;
        int i4 = 0;
        while (i4 < size) {
            s sVar3 = arrayList.get(i4);
            s sVar4 = arrayList2.get(i4);
            if (sVar3 != null && !sVar3.f590c.contains(this)) {
                sVar3 = null;
            }
            if (sVar4 != null && !sVar4.f590c.contains(this)) {
                sVar4 = null;
            }
            if (!(sVar3 == null && sVar4 == null)) {
                if ((sVar3 == null || sVar4 == null || R(sVar3, sVar4)) && (p2 = p(viewGroup2, sVar3, sVar4)) != null) {
                    if (sVar4 != null) {
                        view = sVar4.f589b;
                        String[] P = P();
                        if (view != null && P != null && P.length > 0) {
                            sVar2 = new s();
                            sVar2.f589b = view;
                            Animator animator3 = p2;
                            i3 = size;
                            s sVar5 = tVar2.f591a.get(view);
                            if (sVar5 != null) {
                                int i5 = 0;
                                while (i5 < P.length) {
                                    sVar2.f588a.put(P[i5], sVar5.f588a.get(P[i5]));
                                    i5++;
                                    ArrayList<s> arrayList3 = arrayList2;
                                    i4 = i4;
                                    sVar5 = sVar5;
                                }
                            }
                            i2 = i4;
                            int size2 = E2.size();
                            int i6 = 0;
                            while (true) {
                                if (i6 >= size2) {
                                    animator2 = animator3;
                                    break;
                                }
                                d dVar = E2.get(E2.i(i6));
                                if (dVar.f573c != null && dVar.f571a == view && dVar.f572b.equals(z()) && dVar.f573c.equals(sVar2)) {
                                    animator2 = null;
                                    break;
                                }
                                i6++;
                            }
                        } else {
                            i3 = size;
                            i2 = i4;
                            animator2 = p2;
                            sVar2 = null;
                        }
                        animator = animator2;
                        sVar = sVar2;
                    } else {
                        i3 = size;
                        i2 = i4;
                        view = sVar3.f589b;
                        animator = p2;
                        sVar = null;
                    }
                    if (animator != null) {
                        p pVar = this.D;
                        if (pVar != null) {
                            long c2 = pVar.c(viewGroup2, this, sVar3, sVar4);
                            sparseIntArray.put(this.C.size(), (int) c2);
                            j2 = Math.min(c2, j2);
                        }
                        E2.put(animator, new d(view, z(), this, d0.e(viewGroup), sVar));
                        this.C.add(animator);
                        j2 = j2;
                    }
                    i4 = i2 + 1;
                    size = i3;
                }
            }
            i3 = size;
            i2 = i4;
            i4 = i2 + 1;
            size = i3;
        }
        if (j2 != 0) {
            for (int i7 = 0; i7 < sparseIntArray.size(); i7++) {
                Animator animator4 = this.C.get(sparseIntArray.keyAt(i7));
                animator4.setStartDelay((((long) sparseIntArray.valueAt(i7)) - j2) + animator4.getStartDelay());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void s() {
        int i2 = this.y - 1;
        this.y = i2;
        if (i2 == 0) {
            ArrayList<f> arrayList = this.B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.B.clone();
                int size = arrayList2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((f) arrayList2.get(i3)).c(this);
                }
            }
            for (int i4 = 0; i4 < this.q.f593c.r(); i4++) {
                View s2 = this.q.f593c.s(i4);
                if (s2 != null) {
                    u.h0(s2, false);
                }
            }
            for (int i5 = 0; i5 < this.r.f593c.r(); i5++) {
                View s3 = this.r.f593c.s(i5);
                if (s3 != null) {
                    u.h0(s3, false);
                }
            }
            this.A = true;
        }
    }

    public long t() {
        return this.f565d;
    }

    public String toString() {
        return n0("");
    }

    public e w() {
        return this.E;
    }

    public TimeInterpolator x() {
        return this.f566e;
    }

    /* access modifiers changed from: package-private */
    public s y(View view, boolean z2) {
        q qVar = this.s;
        if (qVar != null) {
            return qVar.y(view, z2);
        }
        ArrayList<s> arrayList = z2 ? this.u : this.v;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i2 = -1;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            s sVar = arrayList.get(i3);
            if (sVar == null) {
                return null;
            }
            if (sVar.f589b == view) {
                i2 = i3;
                break;
            }
            i3++;
        }
        if (i2 < 0) {
            return null;
        }
        return (z2 ? this.v : this.u).get(i2);
    }

    public String z() {
        return this.f563b;
    }
}
