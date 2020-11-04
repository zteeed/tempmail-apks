package androidx.databinding;

import android.util.Log;
import android.view.View;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MergedDataBinderMapper */
public class g extends c {

    /* renamed from: a  reason: collision with root package name */
    private Set<Class<? extends c>> f1408a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    private List<c> f1409b = new CopyOnWriteArrayList();

    /* renamed from: c  reason: collision with root package name */
    private List<String> f1410c = new CopyOnWriteArrayList();

    private boolean e() {
        boolean z = false;
        for (String next : this.f1410c) {
            try {
                Class<?> cls = Class.forName(next);
                if (c.class.isAssignableFrom(cls)) {
                    d((c) cls.newInstance());
                    this.f1410c.remove(next);
                    z = true;
                }
            } catch (ClassNotFoundException unused) {
            } catch (IllegalAccessException e2) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + next, e2);
            } catch (InstantiationException e3) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + next, e3);
            }
        }
        return z;
    }

    public ViewDataBinding b(e eVar, View view, int i) {
        for (c b2 : this.f1409b) {
            ViewDataBinding b3 = b2.b(eVar, view, i);
            if (b3 != null) {
                return b3;
            }
        }
        if (e()) {
            return b(eVar, view, i);
        }
        return null;
    }

    public ViewDataBinding c(e eVar, View[] viewArr, int i) {
        for (c c2 : this.f1409b) {
            ViewDataBinding c3 = c2.c(eVar, viewArr, i);
            if (c3 != null) {
                return c3;
            }
        }
        if (e()) {
            return c(eVar, viewArr, i);
        }
        return null;
    }

    public void d(c cVar) {
        if (this.f1408a.add(cVar.getClass())) {
            this.f1409b.add(cVar);
            for (c d2 : cVar.a()) {
                d(d2);
            }
        }
    }
}
