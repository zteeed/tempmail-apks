package a.q;

import a.h.k.u;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TransitionManager */
public class o {

    /* renamed from: a  reason: collision with root package name */
    private static m f576a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static ThreadLocal<WeakReference<a.e.a<ViewGroup, ArrayList<m>>>> f577b = new ThreadLocal<>();

    /* renamed from: c  reason: collision with root package name */
    static ArrayList<ViewGroup> f578c = new ArrayList<>();

    /* compiled from: TransitionManager */
    private static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: b  reason: collision with root package name */
        m f579b;

        /* renamed from: c  reason: collision with root package name */
        ViewGroup f580c;

        /* renamed from: a.q.o$a$a  reason: collision with other inner class name */
        /* compiled from: TransitionManager */
        class C0027a extends n {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a.e.a f581a;

            C0027a(a.e.a aVar) {
                this.f581a = aVar;
            }

            public void c(m mVar) {
                ((ArrayList) this.f581a.get(a.this.f580c)).remove(mVar);
            }
        }

        a(m mVar, ViewGroup viewGroup) {
            this.f579b = mVar;
            this.f580c = viewGroup;
        }

        private void a() {
            this.f580c.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f580c.removeOnAttachStateChangeListener(this);
        }

        public boolean onPreDraw() {
            a();
            if (!o.f578c.remove(this.f580c)) {
                return true;
            }
            a.e.a<ViewGroup, ArrayList<m>> b2 = o.b();
            ArrayList arrayList = b2.get(this.f580c);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                b2.put(this.f580c, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f579b);
            this.f579b.b(new C0027a(b2));
            this.f579b.l(this.f580c, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((m) it.next()).d0(this.f580c);
                }
            }
            this.f579b.a0(this.f580c);
            return true;
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            a();
            o.f578c.remove(this.f580c);
            ArrayList arrayList = o.b().get(this.f580c);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((m) it.next()).d0(this.f580c);
                }
            }
            this.f579b.n(true);
        }
    }

    public static void a(ViewGroup viewGroup, m mVar) {
        if (!f578c.contains(viewGroup) && u.I(viewGroup)) {
            f578c.add(viewGroup);
            if (mVar == null) {
                mVar = f576a;
            }
            m o = mVar.clone();
            d(viewGroup, o);
            l.c(viewGroup, (l) null);
            c(viewGroup, o);
        }
    }

    static a.e.a<ViewGroup, ArrayList<m>> b() {
        a.e.a<ViewGroup, ArrayList<m>> aVar;
        WeakReference weakReference = f577b.get();
        if (weakReference != null && (aVar = (a.e.a) weakReference.get()) != null) {
            return aVar;
        }
        a.e.a<ViewGroup, ArrayList<m>> aVar2 = new a.e.a<>();
        f577b.set(new WeakReference(aVar2));
        return aVar2;
    }

    private static void c(ViewGroup viewGroup, m mVar) {
        if (mVar != null && viewGroup != null) {
            a aVar = new a(mVar, viewGroup);
            viewGroup.addOnAttachStateChangeListener(aVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    private static void d(ViewGroup viewGroup, m mVar) {
        ArrayList arrayList = b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((m) it.next()).Z(viewGroup);
            }
        }
        if (mVar != null) {
            mVar.l(viewGroup, true);
        }
        l b2 = l.b(viewGroup);
        if (b2 != null) {
            b2.a();
        }
    }
}
