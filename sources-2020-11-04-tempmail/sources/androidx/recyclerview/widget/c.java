package androidx.recyclerview.widget;

import a.h.k.u;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: DefaultItemAnimator */
public class c extends k {
    private static TimeInterpolator s;
    private ArrayList<RecyclerView.b0> h = new ArrayList<>();
    private ArrayList<RecyclerView.b0> i = new ArrayList<>();
    private ArrayList<j> j = new ArrayList<>();
    private ArrayList<i> k = new ArrayList<>();
    ArrayList<ArrayList<RecyclerView.b0>> l = new ArrayList<>();
    ArrayList<ArrayList<j>> m = new ArrayList<>();
    ArrayList<ArrayList<i>> n = new ArrayList<>();
    ArrayList<RecyclerView.b0> o = new ArrayList<>();
    ArrayList<RecyclerView.b0> p = new ArrayList<>();
    ArrayList<RecyclerView.b0> q = new ArrayList<>();
    ArrayList<RecyclerView.b0> r = new ArrayList<>();

    /* compiled from: DefaultItemAnimator */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f1853b;

        a(ArrayList arrayList) {
            this.f1853b = arrayList;
        }

        public void run() {
            Iterator it = this.f1853b.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                c.this.S(jVar.f1887a, jVar.f1888b, jVar.f1889c, jVar.f1890d, jVar.f1891e);
            }
            this.f1853b.clear();
            c.this.m.remove(this.f1853b);
        }
    }

    /* compiled from: DefaultItemAnimator */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f1855b;

        b(ArrayList arrayList) {
            this.f1855b = arrayList;
        }

        public void run() {
            Iterator it = this.f1855b.iterator();
            while (it.hasNext()) {
                c.this.R((i) it.next());
            }
            this.f1855b.clear();
            c.this.n.remove(this.f1855b);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$c  reason: collision with other inner class name */
    /* compiled from: DefaultItemAnimator */
    class C0049c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f1857b;

        C0049c(ArrayList arrayList) {
            this.f1857b = arrayList;
        }

        public void run() {
            Iterator it = this.f1857b.iterator();
            while (it.hasNext()) {
                c.this.Q((RecyclerView.b0) it.next());
            }
            this.f1857b.clear();
            c.this.l.remove(this.f1857b);
        }
    }

    /* compiled from: DefaultItemAnimator */
    class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecyclerView.b0 f1859a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f1860b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f1861c;

        d(RecyclerView.b0 b0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f1859a = b0Var;
            this.f1860b = viewPropertyAnimator;
            this.f1861c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f1860b.setListener((Animator.AnimatorListener) null);
            this.f1861c.setAlpha(1.0f);
            c.this.G(this.f1859a);
            c.this.q.remove(this.f1859a);
            c.this.V();
        }

        public void onAnimationStart(Animator animator) {
            c.this.H(this.f1859a);
        }
    }

    /* compiled from: DefaultItemAnimator */
    class e extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecyclerView.b0 f1863a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f1864b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f1865c;

        e(RecyclerView.b0 b0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f1863a = b0Var;
            this.f1864b = view;
            this.f1865c = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            this.f1864b.setAlpha(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            this.f1865c.setListener((Animator.AnimatorListener) null);
            c.this.A(this.f1863a);
            c.this.o.remove(this.f1863a);
            c.this.V();
        }

        public void onAnimationStart(Animator animator) {
            c.this.B(this.f1863a);
        }
    }

    /* compiled from: DefaultItemAnimator */
    class f extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecyclerView.b0 f1867a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f1868b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f1869c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f1870d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f1871e;

        f(RecyclerView.b0 b0Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.f1867a = b0Var;
            this.f1868b = i;
            this.f1869c = view;
            this.f1870d = i2;
            this.f1871e = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            if (this.f1868b != 0) {
                this.f1869c.setTranslationX(0.0f);
            }
            if (this.f1870d != 0) {
                this.f1869c.setTranslationY(0.0f);
            }
        }

        public void onAnimationEnd(Animator animator) {
            this.f1871e.setListener((Animator.AnimatorListener) null);
            c.this.E(this.f1867a);
            c.this.p.remove(this.f1867a);
            c.this.V();
        }

        public void onAnimationStart(Animator animator) {
            c.this.F(this.f1867a);
        }
    }

    /* compiled from: DefaultItemAnimator */
    class g extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f1873a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f1874b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f1875c;

        g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f1873a = iVar;
            this.f1874b = viewPropertyAnimator;
            this.f1875c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f1874b.setListener((Animator.AnimatorListener) null);
            this.f1875c.setAlpha(1.0f);
            this.f1875c.setTranslationX(0.0f);
            this.f1875c.setTranslationY(0.0f);
            c.this.C(this.f1873a.f1881a, true);
            c.this.r.remove(this.f1873a.f1881a);
            c.this.V();
        }

        public void onAnimationStart(Animator animator) {
            c.this.D(this.f1873a.f1881a, true);
        }
    }

    /* compiled from: DefaultItemAnimator */
    class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f1877a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f1878b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f1879c;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f1877a = iVar;
            this.f1878b = viewPropertyAnimator;
            this.f1879c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f1878b.setListener((Animator.AnimatorListener) null);
            this.f1879c.setAlpha(1.0f);
            this.f1879c.setTranslationX(0.0f);
            this.f1879c.setTranslationY(0.0f);
            c.this.C(this.f1877a.f1882b, false);
            c.this.r.remove(this.f1877a.f1882b);
            c.this.V();
        }

        public void onAnimationStart(Animator animator) {
            c.this.D(this.f1877a.f1882b, false);
        }
    }

    /* compiled from: DefaultItemAnimator */
    private static class j {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.b0 f1887a;

        /* renamed from: b  reason: collision with root package name */
        public int f1888b;

        /* renamed from: c  reason: collision with root package name */
        public int f1889c;

        /* renamed from: d  reason: collision with root package name */
        public int f1890d;

        /* renamed from: e  reason: collision with root package name */
        public int f1891e;

        j(RecyclerView.b0 b0Var, int i, int i2, int i3, int i4) {
            this.f1887a = b0Var;
            this.f1888b = i;
            this.f1889c = i2;
            this.f1890d = i3;
            this.f1891e = i4;
        }
    }

    private void T(RecyclerView.b0 b0Var) {
        View view = b0Var.f1769a;
        ViewPropertyAnimator animate = view.animate();
        this.q.add(b0Var);
        animate.setDuration(o()).alpha(0.0f).setListener(new d(b0Var, animate, view)).start();
    }

    private void W(List<i> list, RecyclerView.b0 b0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = list.get(size);
            if (Y(iVar, b0Var) && iVar.f1881a == null && iVar.f1882b == null) {
                list.remove(iVar);
            }
        }
    }

    private void X(i iVar) {
        RecyclerView.b0 b0Var = iVar.f1881a;
        if (b0Var != null) {
            Y(iVar, b0Var);
        }
        RecyclerView.b0 b0Var2 = iVar.f1882b;
        if (b0Var2 != null) {
            Y(iVar, b0Var2);
        }
    }

    private boolean Y(i iVar, RecyclerView.b0 b0Var) {
        boolean z = false;
        if (iVar.f1882b == b0Var) {
            iVar.f1882b = null;
        } else if (iVar.f1881a != b0Var) {
            return false;
        } else {
            iVar.f1881a = null;
            z = true;
        }
        b0Var.f1769a.setAlpha(1.0f);
        b0Var.f1769a.setTranslationX(0.0f);
        b0Var.f1769a.setTranslationY(0.0f);
        C(b0Var, z);
        return true;
    }

    private void Z(RecyclerView.b0 b0Var) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        b0Var.f1769a.animate().setInterpolator(s);
        j(b0Var);
    }

    /* access modifiers changed from: package-private */
    public void Q(RecyclerView.b0 b0Var) {
        View view = b0Var.f1769a;
        ViewPropertyAnimator animate = view.animate();
        this.o.add(b0Var);
        animate.alpha(1.0f).setDuration(l()).setListener(new e(b0Var, view, animate)).start();
    }

    /* access modifiers changed from: package-private */
    public void R(i iVar) {
        View view;
        RecyclerView.b0 b0Var = iVar.f1881a;
        View view2 = null;
        if (b0Var == null) {
            view = null;
        } else {
            view = b0Var.f1769a;
        }
        RecyclerView.b0 b0Var2 = iVar.f1882b;
        if (b0Var2 != null) {
            view2 = b0Var2.f1769a;
        }
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m());
            this.r.add(iVar.f1881a);
            duration.translationX((float) (iVar.f1885e - iVar.f1883c));
            duration.translationY((float) (iVar.f1886f - iVar.f1884d));
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.r.add(iVar.f1882b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(m()).alpha(1.0f).setListener(new h(iVar, animate, view2)).start();
        }
    }

    /* access modifiers changed from: package-private */
    public void S(RecyclerView.b0 b0Var, int i2, int i3, int i4, int i5) {
        View view = b0Var.f1769a;
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        if (i6 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i7 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.p.add(b0Var);
        animate.setDuration(n()).setListener(new f(b0Var, i6, view, i7, animate)).start();
    }

    /* access modifiers changed from: package-private */
    public void U(List<RecyclerView.b0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).f1769a.animate().cancel();
        }
    }

    /* access modifiers changed from: package-private */
    public void V() {
        if (!p()) {
            i();
        }
    }

    public boolean g(RecyclerView.b0 b0Var, List<Object> list) {
        return !list.isEmpty() || super.g(b0Var, list);
    }

    public void j(RecyclerView.b0 b0Var) {
        View view = b0Var.f1769a;
        view.animate().cancel();
        int size = this.j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.j.get(size).f1887a == b0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                E(b0Var);
                this.j.remove(size);
            }
        }
        W(this.k, b0Var);
        if (this.h.remove(b0Var)) {
            view.setAlpha(1.0f);
            G(b0Var);
        }
        if (this.i.remove(b0Var)) {
            view.setAlpha(1.0f);
            A(b0Var);
        }
        for (int size2 = this.n.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = this.n.get(size2);
            W(arrayList, b0Var);
            if (arrayList.isEmpty()) {
                this.n.remove(size2);
            }
        }
        for (int size3 = this.m.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = this.m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((j) arrayList2.get(size4)).f1887a == b0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    E(b0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.l.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = this.l.get(size5);
            if (arrayList3.remove(b0Var)) {
                view.setAlpha(1.0f);
                A(b0Var);
                if (arrayList3.isEmpty()) {
                    this.l.remove(size5);
                }
            }
        }
        this.q.remove(b0Var);
        this.o.remove(b0Var);
        this.r.remove(b0Var);
        this.p.remove(b0Var);
        V();
    }

    public void k() {
        int size = this.j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = this.j.get(size);
            View view = jVar.f1887a.f1769a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            E(jVar.f1887a);
            this.j.remove(size);
        }
        for (int size2 = this.h.size() - 1; size2 >= 0; size2--) {
            G(this.h.get(size2));
            this.h.remove(size2);
        }
        int size3 = this.i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.b0 b0Var = this.i.get(size3);
            b0Var.f1769a.setAlpha(1.0f);
            A(b0Var);
            this.i.remove(size3);
        }
        for (int size4 = this.k.size() - 1; size4 >= 0; size4--) {
            X(this.k.get(size4));
        }
        this.k.clear();
        if (p()) {
            for (int size5 = this.m.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = this.m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = (j) arrayList.get(size6);
                    View view2 = jVar2.f1887a.f1769a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    E(jVar2.f1887a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.l.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = this.l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.b0 b0Var2 = (RecyclerView.b0) arrayList2.get(size8);
                    b0Var2.f1769a.setAlpha(1.0f);
                    A(b0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.n.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = this.n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    X((i) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.n.remove(arrayList3);
                    }
                }
            }
            U(this.q);
            U(this.p);
            U(this.o);
            U(this.r);
            i();
        }
    }

    public boolean p() {
        return !this.i.isEmpty() || !this.k.isEmpty() || !this.j.isEmpty() || !this.h.isEmpty() || !this.p.isEmpty() || !this.q.isEmpty() || !this.o.isEmpty() || !this.r.isEmpty() || !this.m.isEmpty() || !this.l.isEmpty() || !this.n.isEmpty();
    }

    public void u() {
        boolean z = !this.h.isEmpty();
        boolean z2 = !this.j.isEmpty();
        boolean z3 = !this.k.isEmpty();
        boolean z4 = !this.i.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.b0> it = this.h.iterator();
            while (it.hasNext()) {
                T(it.next());
            }
            this.h.clear();
            if (z2) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.j);
                this.m.add(arrayList);
                this.j.clear();
                a aVar = new a(arrayList);
                if (z) {
                    u.W(((j) arrayList.get(0)).f1887a.f1769a, aVar, o());
                } else {
                    aVar.run();
                }
            }
            if (z3) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.k);
                this.n.add(arrayList2);
                this.k.clear();
                b bVar = new b(arrayList2);
                if (z) {
                    u.W(((i) arrayList2.get(0)).f1881a.f1769a, bVar, o());
                } else {
                    bVar.run();
                }
            }
            if (z4) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.i);
                this.l.add(arrayList3);
                this.i.clear();
                C0049c cVar = new C0049c(arrayList3);
                if (z || z2 || z3) {
                    long j2 = 0;
                    long o2 = z ? o() : 0;
                    long n2 = z2 ? n() : 0;
                    if (z3) {
                        j2 = m();
                    }
                    u.W(((RecyclerView.b0) arrayList3.get(0)).f1769a, cVar, o2 + Math.max(n2, j2));
                    return;
                }
                cVar.run();
            }
        }
    }

    public boolean w(RecyclerView.b0 b0Var) {
        Z(b0Var);
        b0Var.f1769a.setAlpha(0.0f);
        this.i.add(b0Var);
        return true;
    }

    public boolean x(RecyclerView.b0 b0Var, RecyclerView.b0 b0Var2, int i2, int i3, int i4, int i5) {
        if (b0Var == b0Var2) {
            return y(b0Var, i2, i3, i4, i5);
        }
        float translationX = b0Var.f1769a.getTranslationX();
        float translationY = b0Var.f1769a.getTranslationY();
        float alpha = b0Var.f1769a.getAlpha();
        Z(b0Var);
        int i6 = (int) (((float) (i4 - i2)) - translationX);
        int i7 = (int) (((float) (i5 - i3)) - translationY);
        b0Var.f1769a.setTranslationX(translationX);
        b0Var.f1769a.setTranslationY(translationY);
        b0Var.f1769a.setAlpha(alpha);
        if (b0Var2 != null) {
            Z(b0Var2);
            b0Var2.f1769a.setTranslationX((float) (-i6));
            b0Var2.f1769a.setTranslationY((float) (-i7));
            b0Var2.f1769a.setAlpha(0.0f);
        }
        this.k.add(new i(b0Var, b0Var2, i2, i3, i4, i5));
        return true;
    }

    public boolean y(RecyclerView.b0 b0Var, int i2, int i3, int i4, int i5) {
        View view = b0Var.f1769a;
        int translationX = i2 + ((int) view.getTranslationX());
        int translationY = i3 + ((int) b0Var.f1769a.getTranslationY());
        Z(b0Var);
        int i6 = i4 - translationX;
        int i7 = i5 - translationY;
        if (i6 == 0 && i7 == 0) {
            E(b0Var);
            return false;
        }
        if (i6 != 0) {
            view.setTranslationX((float) (-i6));
        }
        if (i7 != 0) {
            view.setTranslationY((float) (-i7));
        }
        this.j.add(new j(b0Var, translationX, translationY, i4, i5));
        return true;
    }

    public boolean z(RecyclerView.b0 b0Var) {
        Z(b0Var);
        this.h.add(b0Var);
        return true;
    }

    /* compiled from: DefaultItemAnimator */
    private static class i {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.b0 f1881a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.b0 f1882b;

        /* renamed from: c  reason: collision with root package name */
        public int f1883c;

        /* renamed from: d  reason: collision with root package name */
        public int f1884d;

        /* renamed from: e  reason: collision with root package name */
        public int f1885e;

        /* renamed from: f  reason: collision with root package name */
        public int f1886f;

        private i(RecyclerView.b0 b0Var, RecyclerView.b0 b0Var2) {
            this.f1881a = b0Var;
            this.f1882b = b0Var2;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f1881a + ", newHolder=" + this.f1882b + ", fromX=" + this.f1883c + ", fromY=" + this.f1884d + ", toX=" + this.f1885e + ", toY=" + this.f1886f + '}';
        }

        i(RecyclerView.b0 b0Var, RecyclerView.b0 b0Var2, int i, int i2, int i3, int i4) {
            this(b0Var, b0Var2);
            this.f1883c = i;
            this.f1884d = i2;
            this.f1885e = i3;
            this.f1886f = i4;
        }
    }
}
