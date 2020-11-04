package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FragmentTransitionCompat21 */
class l extends m {

    /* compiled from: FragmentTransitionCompat21 */
    class a extends Transition.EpicenterCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Rect f1562a;

        a(l lVar, Rect rect) {
            this.f1562a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            return this.f1562a;
        }
    }

    /* compiled from: FragmentTransitionCompat21 */
    class b implements Transition.TransitionListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f1563a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f1564b;

        b(l lVar, View view, ArrayList arrayList) {
            this.f1563a = view;
            this.f1564b = arrayList;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f1563a.setVisibility(8);
            int size = this.f1564b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f1564b.get(i)).setVisibility(0);
            }
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
        }
    }

    /* compiled from: FragmentTransitionCompat21 */
    class c implements Transition.TransitionListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f1565a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f1566b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f1567c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ArrayList f1568d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f1569e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ArrayList f1570f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f1565a = obj;
            this.f1566b = arrayList;
            this.f1567c = obj2;
            this.f1568d = arrayList2;
            this.f1569e = obj3;
            this.f1570f = arrayList3;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
            Object obj = this.f1565a;
            if (obj != null) {
                l.this.q(obj, this.f1566b, (ArrayList<View>) null);
            }
            Object obj2 = this.f1567c;
            if (obj2 != null) {
                l.this.q(obj2, this.f1568d, (ArrayList<View>) null);
            }
            Object obj3 = this.f1569e;
            if (obj3 != null) {
                l.this.q(obj3, this.f1570f, (ArrayList<View>) null);
            }
        }
    }

    /* compiled from: FragmentTransitionCompat21 */
    class d extends Transition.EpicenterCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Rect f1571a;

        d(l lVar, Rect rect) {
            this.f1571a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f1571a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f1571a;
        }
    }

    l() {
    }

    private static boolean B(Transition transition) {
        return !m.l(transition.getTargetIds()) || !m.l(transition.getTargetNames()) || !m.l(transition.getTargetTypes());
    }

    public Object A(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    public void a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    public void b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i < transitionCount) {
                    b(transitionSet.getTransitionAt(i), arrayList);
                    i++;
                }
            } else if (!B(transition) && m.l(transition.getTargets())) {
                int size = arrayList.size();
                while (i < size) {
                    transition.addTarget(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    public void c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    public boolean e(Object obj) {
        return obj instanceof Transition;
    }

    public Object g(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    public Object m(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    public void p(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    public void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        int i;
        Transition transition = (Transition) obj;
        int i2 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i2 < transitionCount) {
                q(transitionSet.getTransitionAt(i2), arrayList, arrayList2);
                i2++;
            }
        } else if (!B(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            if (arrayList2 == null) {
                i = 0;
            } else {
                i = arrayList2.size();
            }
            while (i2 < i) {
                transition.addTarget(arrayList2.get(i2));
                i2++;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                transition.removeTarget(arrayList.get(size));
            }
        }
    }

    public void r(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new b(this, view, arrayList));
    }

    public void t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    public void u(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new d(this, rect));
        }
    }

    public void v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            k(view, rect);
            ((Transition) obj).setEpicenterCallback(new a(this, rect));
        }
    }

    public void y(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            m.d(targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        b(transitionSet, arrayList);
    }

    public void z(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            q(transitionSet, arrayList, arrayList2);
        }
    }
}
