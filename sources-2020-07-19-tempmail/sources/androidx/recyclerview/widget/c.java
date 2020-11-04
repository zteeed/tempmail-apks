package androidx.recyclerview.widget;

import a.h.k.t;
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
        final /* synthetic */ ArrayList f1770b;

        a(ArrayList arrayList) {
            this.f1770b = arrayList;
        }

        public void run() {
            Iterator it = this.f1770b.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                c.this.S(jVar.f1804a, jVar.f1805b, jVar.f1806c, jVar.f1807d, jVar.f1808e);
            }
            this.f1770b.clear();
            c.this.m.remove(this.f1770b);
        }
    }

    /* compiled from: DefaultItemAnimator */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f1772b;

        b(ArrayList arrayList) {
            this.f1772b = arrayList;
        }

        public void run() {
            Iterator it = this.f1772b.iterator();
            while (it.hasNext()) {
                c.this.R((i) it.next());
            }
            this.f1772b.clear();
            c.this.n.remove(this.f1772b);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$c  reason: collision with other inner class name */
    /* compiled from: DefaultItemAnimator */
    class C0049c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f1774b;

        C0049c(ArrayList arrayList) {
            this.f1774b = arrayList;
        }

        public void run() {
            Iterator it = this.f1774b.iterator();
            while (it.hasNext()) {
                c.this.Q((RecyclerView.b0) it.next());
            }
            this.f1774b.clear();
            c.this.l.remove(this.f1774b);
        }
    }

    /* compiled from: DefaultItemAnimator */
    class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecyclerView.b0 f1776a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f1777b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f1778c;

        d(RecyclerView.b0 b0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f1776a = b0Var;
            this.f1777b = viewPropertyAnimator;
            this.f1778c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f1777b.setListener((Animator.AnimatorListener) null);
            this.f1778c.setAlpha(1.0f);
            c.this.G(this.f1776a);
            c.this.q.remove(this.f1776a);
            c.this.V();
        }

        public void onAnimationStart(Animator animator) {
            c.this.H(this.f1776a);
        }
    }

    /* compiled from: DefaultItemAnimator */
    class e extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecyclerView.b0 f1780a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f1781b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f1782c;

        e(RecyclerView.b0 b0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f1780a = b0Var;
            this.f1781b = view;
            this.f1782c = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            this.f1781b.setAlpha(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            this.f1782c.setListener((Animator.AnimatorListener) null);
            c.this.A(this.f1780a);
            c.this.o.remove(this.f1780a);
            c.this.V();
        }

        public void onAnimationStart(Animator animator) {
            c.this.B(this.f1780a);
        }
    }

    /* compiled from: DefaultItemAnimator */
    class f extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecyclerView.b0 f1784a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f1785b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f1786c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f1787d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f1788e;

        f(RecyclerView.b0 b0Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.f1784a = b0Var;
            this.f1785b = i;
            this.f1786c = view;
            this.f1787d = i2;
            this.f1788e = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            if (this.f1785b != 0) {
                this.f1786c.setTranslationX(0.0f);
            }
            if (this.f1787d != 0) {
                this.f1786c.setTranslationY(0.0f);
            }
        }

        public void onAnimationEnd(Animator animator) {
            this.f1788e.setListener((Animator.AnimatorListener) null);
            c.this.E(this.f1784a);
            c.this.p.remove(this.f1784a);
            c.this.V();
        }

        public void onAnimationStart(Animator animator) {
            c.this.F(this.f1784a);
        }
    }

    /* compiled from: DefaultItemAnimator */
    class g extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f1790a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f1791b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f1792c;

        g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f1790a = iVar;
            this.f1791b = viewPropertyAnimator;
            this.f1792c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f1791b.setListener((Animator.AnimatorListener) null);
            this.f1792c.setAlpha(1.0f);
            this.f1792c.setTranslationX(0.0f);
            this.f1792c.setTranslationY(0.0f);
            c.this.C(this.f1790a.f1798a, true);
            c.this.r.remove(this.f1790a.f1798a);
            c.this.V();
        }

        public void onAnimationStart(Animator animator) {
            c.this.D(this.f1790a.f1798a, true);
        }
    }

    /* compiled from: DefaultItemAnimator */
    class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f1794a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f1795b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f1796c;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f1794a = iVar;
            this.f1795b = viewPropertyAnimator;
            this.f1796c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f1795b.setListener((Animator.AnimatorListener) null);
            this.f1796c.setAlpha(1.0f);
            this.f1796c.setTranslationX(0.0f);
            this.f1796c.setTranslationY(0.0f);
            c.this.C(this.f1794a.f1799b, false);
            c.this.r.remove(this.f1794a.f1799b);
            c.this.V();
        }

        public void onAnimationStart(Animator animator) {
            c.this.D(this.f1794a.f1799b, false);
        }
    }

    /* compiled from: DefaultItemAnimator */
    private static class j {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.b0 f1804a;

        /* renamed from: b  reason: collision with root package name */
        public int f1805b;

        /* renamed from: c  reason: collision with root package name */
        public int f1806c;

        /* renamed from: d  reason: collision with root package name */
        public int f1807d;

        /* renamed from: e  reason: collision with root package name */
        public int f1808e;

        j(RecyclerView.b0 b0Var, int i, int i2, int i3, int i4) {
            this.f1804a = b0Var;
            this.f1805b = i;
            this.f1806c = i2;
            this.f1807d = i3;
            this.f1808e = i4;
        }
    }

    private void T(RecyclerView.b0 b0Var) {
        View view = b0Var.f1686a;
        ViewPropertyAnimator animate = view.animate();
        this.q.add(b0Var);
        animate.setDuration(o()).alpha(0.0f).setListener(new d(b0Var, animate, view)).start();
    }

    private void W(List<i> list, RecyclerView.b0 b0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = list.get(size);
            if (Y(iVar, b0Var) && iVar.f1798a == null && iVar.f1799b == null) {
                list.remove(iVar);
            }
        }
    }

    private void X(i iVar) {
        RecyclerView.b0 b0Var = iVar.f1798a;
        if (b0Var != null) {
            Y(iVar, b0Var);
        }
        RecyclerView.b0 b0Var2 = iVar.f1799b;
        if (b0Var2 != null) {
            Y(iVar, b0Var2);
        }
    }

    private boolean Y(i iVar, RecyclerView.b0 b0Var) {
        boolean z = false;
        if (iVar.f1799b == b0Var) {
            iVar.f1799b = null;
        } else if (iVar.f1798a != b0Var) {
            return false;
        } else {
            iVar.f1798a = null;
            z = true;
        }
        b0Var.f1686a.setAlpha(1.0f);
        b0Var.f1686a.setTranslationX(0.0f);
        b0Var.f1686a.setTranslationY(0.0f);
        C(b0Var, z);
        return true;
    }

    private void Z(RecyclerView.b0 b0Var) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        b0Var.f1686a.animate().setInterpolator(s);
        j(b0Var);
    }

    /* access modifiers changed from: package-private */
    public void Q(RecyclerView.b0 b0Var) {
        View view = b0Var.f1686a;
        ViewPropertyAnimator animate = view.animate();
        this.o.add(b0Var);
        animate.alpha(1.0f).setDuration(l()).setListener(new e(b0Var, view, animate)).start();
    }

    /* access modifiers changed from: package-private */
    public void R(i iVar) {
        View view;
        RecyclerView.b0 b0Var = iVar.f1798a;
        View view2 = null;
        if (b0Var == null) {
            view = null;
        } else {
            view = b0Var.f1686a;
        }
        RecyclerView.b0 b0Var2 = iVar.f1799b;
        if (b0Var2 != null) {
            view2 = b0Var2.f1686a;
        }
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m());
            this.r.add(iVar.f1798a);
            duration.translationX((float) (iVar.f1802e - iVar.f1800c));
            duration.translationY((float) (iVar.f1803f - iVar.f1801d));
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.r.add(iVar.f1799b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(m()).alpha(1.0f).setListener(new h(iVar, animate, view2)).start();
        }
    }

    /* access modifiers changed from: package-private */
    public void S(RecyclerView.b0 b0Var, int i2, int i3, int i4, int i5) {
        View view = b0Var.f1686a;
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
            list.get(size).f1686a.animate().cancel();
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
        View view = b0Var.f1686a;
        view.animate().cancel();
        int size = this.j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.j.get(size).f1804a == b0Var) {
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
                } else if (((j) arrayList2.get(size4)).f1804a == b0Var) {
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
            View view = jVar.f1804a.f1686a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            E(jVar.f1804a);
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
            b0Var.f1686a.setAlpha(1.0f);
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
                    View view2 = jVar2.f1804a.f1686a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    E(jVar2.f1804a);
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
                    b0Var2.f1686a.setAlpha(1.0f);
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
                    t.W(((j) arrayList.get(0)).f1804a.f1686a, aVar, o());
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
                    t.W(((i) arrayList2.get(0)).f1798a.f1686a, bVar, o());
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
                    t.W(((RecyclerView.b0) arrayList3.get(0)).f1686a, cVar, o2 + Math.max(n2, j2));
                    return;
                }
                cVar.run();
            }
        }
    }

    public boolean w(RecyclerView.b0 b0Var) {
        Z(b0Var);
        b0Var.f1686a.setAlpha(0.0f);
        this.i.add(b0Var);
        return true;
    }

    public boolean x(RecyclerView.b0 b0Var, RecyclerView.b0 b0Var2, int i2, int i3, int i4, int i5) {
        if (b0Var == b0Var2) {
            return y(b0Var, i2, i3, i4, i5);
        }
        float translationX = b0Var.f1686a.getTranslationX();
        float translationY = b0Var.f1686a.getTranslationY();
        float alpha = b0Var.f1686a.getAlpha();
        Z(b0Var);
        int i6 = (int) (((float) (i4 - i2)) - translationX);
        int i7 = (int) (((float) (i5 - i3)) - translationY);
        b0Var.f1686a.setTranslationX(translationX);
        b0Var.f1686a.setTranslationY(translationY);
        b0Var.f1686a.setAlpha(alpha);
        if (b0Var2 != null) {
            Z(b0Var2);
            b0Var2.f1686a.setTranslationX((float) (-i6));
            b0Var2.f1686a.setTranslationY((float) (-i7));
            b0Var2.f1686a.setAlpha(0.0f);
        }
        this.k.add(new i(b0Var, b0Var2, i2, i3, i4, i5));
        return true;
    }

    public boolean y(RecyclerView.b0 b0Var, int i2, int i3, int i4, int i5) {
        View view = b0Var.f1686a;
        int translationX = i2 + ((int) view.getTranslationX());
        int translationY = i3 + ((int) b0Var.f1686a.getTranslationY());
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
        public RecyclerView.b0 f1798a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.b0 f1799b;

        /* renamed from: c  reason: collision with root package name */
        public int f1800c;

        /* renamed from: d  reason: collision with root package name */
        public int f1801d;

        /* renamed from: e  reason: collision with root package name */
        public int f1802e;

        /* renamed from: f  reason: collision with root package name */
        public int f1803f;

        private i(RecyclerView.b0 b0Var, RecyclerView.b0 b0Var2) {
            this.f1798a = b0Var;
            this.f1799b = b0Var2;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f1798a + ", newHolder=" + this.f1799b + ", fromX=" + this.f1800c + ", fromY=" + this.f1801d + ", toX=" + this.f1802e + ", toY=" + this.f1803f + '}';
        }

        i(RecyclerView.b0 b0Var, RecyclerView.b0 b0Var2, int i, int i2, int i3, int i4) {
            this(b0Var, b0Var2);
            this.f1800c = i;
            this.f1801d = i2;
            this.f1802e = i3;
            this.f1803f = i4;
        }
    }
}
