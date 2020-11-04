package com.google.firebase.components;

import com.google.firebase.f.c;
import com.google.firebase.f.d;
import com.google.firebase.h.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-components@@16.0.0 */
public class l extends a {

    /* renamed from: e  reason: collision with root package name */
    private static final a<Set<Object>> f11058e = k.a();

    /* renamed from: a  reason: collision with root package name */
    private final Map<d<?>, q<?>> f11059a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, q<?>> f11060b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Map<Class<?>, q<Set<?>>> f11061c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final p f11062d;

    public l(Executor executor, Iterable<h> iterable, d<?>... dVarArr) {
        this.f11062d = new p(executor);
        ArrayList<d> arrayList = new ArrayList<>();
        arrayList.add(d.n(this.f11062d, p.class, d.class, c.class));
        for (h components : iterable) {
            arrayList.addAll(components.getComponents());
        }
        for (d<?> dVar : dVarArr) {
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        m.a(arrayList);
        for (d dVar2 : arrayList) {
            this.f11059a.put(dVar2, new q(i.a(this, dVar2)));
        }
        h();
        i();
    }

    static /* synthetic */ Set g(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(((q) it.next()).get());
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private void h() {
        for (Map.Entry next : this.f11059a.entrySet()) {
            d dVar = (d) next.getKey();
            if (dVar.k()) {
                q qVar = (q) next.getValue();
                for (Class put : dVar.e()) {
                    this.f11060b.put(put, qVar);
                }
            }
        }
        j();
    }

    private void i() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f11059a.entrySet()) {
            d dVar = (d) next.getKey();
            if (!dVar.k()) {
                q qVar = (q) next.getValue();
                for (Class cls : dVar.e()) {
                    if (!hashMap.containsKey(cls)) {
                        hashMap.put(cls, new HashSet());
                    }
                    ((Set) hashMap.get(cls)).add(qVar);
                }
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            this.f11061c.put((Class) entry.getKey(), new q(j.a((Set) entry.getValue())));
        }
    }

    private void j() {
        for (d next : this.f11059a.keySet()) {
            Iterator<n> it = next.c().iterator();
            while (true) {
                if (it.hasNext()) {
                    n next2 = it.next();
                    if (next2.c() && !this.f11060b.containsKey(next2.a())) {
                        throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", new Object[]{next, next2.a()}));
                    }
                }
            }
        }
    }

    public <T> a<T> b(Class<T> cls) {
        r.c(cls, "Null interface requested.");
        return this.f11060b.get(cls);
    }

    public <T> a<Set<T>> c(Class<T> cls) {
        q qVar = this.f11061c.get(cls);
        if (qVar != null) {
            return qVar;
        }
        return f11058e;
    }

    public void e(boolean z) {
        for (Map.Entry next : this.f11059a.entrySet()) {
            d dVar = (d) next.getKey();
            q qVar = (q) next.getValue();
            if (dVar.i() || (dVar.j() && z)) {
                qVar.get();
            }
        }
        this.f11062d.c();
    }
}
