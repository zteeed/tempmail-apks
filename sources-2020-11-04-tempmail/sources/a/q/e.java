package a.q;

import a.q.m;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.t;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FragmentTransitionSupport */
public class e extends t {

    /* compiled from: FragmentTransitionSupport */
    class a extends m.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Rect f522a;

        a(e eVar, Rect rect) {
            this.f522a = rect;
        }
    }

    /* compiled from: FragmentTransitionSupport */
    class b implements m.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f523a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f524b;

        b(e eVar, View view, ArrayList arrayList) {
            this.f523a = view;
            this.f524b = arrayList;
        }

        public void a(m mVar) {
        }

        public void b(m mVar) {
        }

        public void c(m mVar) {
            mVar.b0(this);
            this.f523a.setVisibility(8);
            int size = this.f524b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f524b.get(i)).setVisibility(0);
            }
        }

        public void d(m mVar) {
        }
    }

    /* compiled from: FragmentTransitionSupport */
    class c implements m.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f525a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f526b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f527c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ArrayList f528d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f529e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ArrayList f530f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f525a = obj;
            this.f526b = arrayList;
            this.f527c = obj2;
            this.f528d = arrayList2;
            this.f529e = obj3;
            this.f530f = arrayList3;
        }

        public void a(m mVar) {
            Object obj = this.f525a;
            if (obj != null) {
                e.this.q(obj, this.f526b, (ArrayList<View>) null);
            }
            Object obj2 = this.f527c;
            if (obj2 != null) {
                e.this.q(obj2, this.f528d, (ArrayList<View>) null);
            }
            Object obj3 = this.f529e;
            if (obj3 != null) {
                e.this.q(obj3, this.f530f, (ArrayList<View>) null);
            }
        }

        public void b(m mVar) {
        }

        public void c(m mVar) {
        }

        public void d(m mVar) {
        }
    }

    /* compiled from: FragmentTransitionSupport */
    class d extends m.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Rect f531a;

        d(e eVar, Rect rect) {
            this.f531a = rect;
        }
    }

    private static boolean C(m mVar) {
        return !t.l(mVar.H()) || !t.l(mVar.I()) || !t.l(mVar.L());
    }

    public void A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        q qVar = (q) obj;
        if (qVar != null) {
            qVar.M().clear();
            qVar.M().addAll(arrayList2);
            q(qVar, arrayList, arrayList2);
        }
    }

    public Object B(Object obj) {
        if (obj == null) {
            return null;
        }
        q qVar = new q();
        qVar.q0((m) obj);
        return qVar;
    }

    public void a(Object obj, View view) {
        if (obj != null) {
            ((m) obj).c(view);
        }
    }

    public void b(Object obj, ArrayList<View> arrayList) {
        m mVar = (m) obj;
        if (mVar != null) {
            int i = 0;
            if (mVar instanceof q) {
                q qVar = (q) mVar;
                int s0 = qVar.s0();
                while (i < s0) {
                    b(qVar.r0(i), arrayList);
                    i++;
                }
            } else if (!C(mVar) && t.l(mVar.M())) {
                int size = arrayList.size();
                while (i < size) {
                    mVar.c(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    public void c(ViewGroup viewGroup, Object obj) {
        o.a(viewGroup, (m) obj);
    }

    public boolean e(Object obj) {
        return obj instanceof m;
    }

    public Object g(Object obj) {
        if (obj != null) {
            return ((m) obj).clone();
        }
        return null;
    }

    public Object m(Object obj, Object obj2, Object obj3) {
        m mVar = (m) obj;
        m mVar2 = (m) obj2;
        m mVar3 = (m) obj3;
        if (mVar != null && mVar2 != null) {
            q qVar = new q();
            qVar.q0(mVar);
            qVar.q0(mVar2);
            qVar.x0(1);
            mVar = qVar;
        } else if (mVar == null) {
            mVar = mVar2 != null ? mVar2 : null;
        }
        if (mVar3 == null) {
            return mVar;
        }
        q qVar2 = new q();
        if (mVar != null) {
            qVar2.q0(mVar);
        }
        qVar2.q0(mVar3);
        return qVar2;
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        q qVar = new q();
        if (obj != null) {
            qVar.q0((m) obj);
        }
        if (obj2 != null) {
            qVar.q0((m) obj2);
        }
        if (obj3 != null) {
            qVar.q0((m) obj3);
        }
        return qVar;
    }

    public void p(Object obj, View view) {
        if (obj != null) {
            ((m) obj).c0(view);
        }
    }

    public void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        int i;
        m mVar = (m) obj;
        int i2 = 0;
        if (mVar instanceof q) {
            q qVar = (q) mVar;
            int s0 = qVar.s0();
            while (i2 < s0) {
                q(qVar.r0(i2), arrayList, arrayList2);
                i2++;
            }
        } else if (!C(mVar)) {
            List<View> M = mVar.M();
            if (M.size() == arrayList.size() && M.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    i = 0;
                } else {
                    i = arrayList2.size();
                }
                while (i2 < i) {
                    mVar.c(arrayList2.get(i2));
                    i2++;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    mVar.c0(arrayList.get(size));
                }
            }
        }
    }

    public void r(Object obj, View view, ArrayList<View> arrayList) {
        ((m) obj).b(new b(this, view, arrayList));
    }

    public void t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((m) obj).b(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    public void u(Object obj, Rect rect) {
        if (obj != null) {
            ((m) obj).h0(new d(this, rect));
        }
    }

    public void v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            k(view, rect);
            ((m) obj).h0(new a(this, rect));
        }
    }

    public void z(Object obj, View view, ArrayList<View> arrayList) {
        q qVar = (q) obj;
        List<View> M = qVar.M();
        M.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            t.d(M, arrayList.get(i));
        }
        M.add(view);
        arrayList.add(view);
        b(qVar, arrayList);
    }
}
