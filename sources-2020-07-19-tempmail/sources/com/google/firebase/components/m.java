package com.google.firebase.components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.firebase:firebase-components@@16.0.0 */
class m {

    /* compiled from: com.google.firebase:firebase-components@@16.0.0 */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        private final d<?> f11063a;

        /* renamed from: b  reason: collision with root package name */
        private final Set<b> f11064b = new HashSet();

        /* renamed from: c  reason: collision with root package name */
        private final Set<b> f11065c = new HashSet();

        b(d<?> dVar) {
            this.f11063a = dVar;
        }

        /* access modifiers changed from: package-private */
        public void a(b bVar) {
            this.f11064b.add(bVar);
        }

        /* access modifiers changed from: package-private */
        public void b(b bVar) {
            this.f11065c.add(bVar);
        }

        /* access modifiers changed from: package-private */
        public d<?> c() {
            return this.f11063a;
        }

        /* access modifiers changed from: package-private */
        public Set<b> d() {
            return this.f11064b;
        }

        /* access modifiers changed from: package-private */
        public boolean e() {
            return this.f11064b.isEmpty();
        }

        /* access modifiers changed from: package-private */
        public boolean f() {
            return this.f11065c.isEmpty();
        }

        /* access modifiers changed from: package-private */
        public void g(b bVar) {
            this.f11065c.remove(bVar);
        }
    }

    /* compiled from: com.google.firebase:firebase-components@@16.0.0 */
    private static class c {

        /* renamed from: a  reason: collision with root package name */
        private final Class<?> f11066a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final boolean f11067b;

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!cVar.f11066a.equals(this.f11066a) || cVar.f11067b != this.f11067b) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return ((this.f11066a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f11067b).hashCode();
        }

        private c(Class<?> cls, boolean z) {
            this.f11066a = cls;
            this.f11067b = z;
        }
    }

    static void a(List<d<?>> list) {
        Set<b> c2 = c(list);
        Set<b> b2 = b(c2);
        int i = 0;
        while (!b2.isEmpty()) {
            b next = b2.iterator().next();
            b2.remove(next);
            i++;
            for (b next2 : next.d()) {
                next2.g(next);
                if (next2.f()) {
                    b2.add(next2);
                }
            }
        }
        if (i != list.size()) {
            ArrayList arrayList = new ArrayList();
            for (b next3 : c2) {
                if (!next3.f() && !next3.e()) {
                    arrayList.add(next3.c());
                }
            }
            throw new DependencyCycleException(arrayList);
        }
    }

    private static Set<b> b(Set<b> set) {
        HashSet hashSet = new HashSet();
        for (b next : set) {
            if (next.f()) {
                hashSet.add(next);
            }
        }
        return hashSet;
    }

    private static Set<b> c(List<d<?>> list) {
        Set<b> set;
        HashMap hashMap = new HashMap(list.size());
        for (d next : list) {
            b bVar = new b(next);
            Iterator it = next.e().iterator();
            while (true) {
                if (it.hasNext()) {
                    Class cls = (Class) it.next();
                    c cVar = new c(cls, !next.k());
                    if (!hashMap.containsKey(cVar)) {
                        hashMap.put(cVar, new HashSet());
                    }
                    Set set2 = (Set) hashMap.get(cVar);
                    if (set2.isEmpty() || cVar.f11067b) {
                        set2.add(bVar);
                    } else {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[]{cls}));
                    }
                }
            }
        }
        for (Set<b> it2 : hashMap.values()) {
            for (b bVar2 : it2) {
                for (n next2 : bVar2.c().c()) {
                    if (next2.b() && (set = (Set) hashMap.get(new c(next2.a(), next2.d()))) != null) {
                        for (b bVar3 : set) {
                            bVar2.a(bVar3);
                            bVar3.b(bVar2);
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set addAll : hashMap.values()) {
            hashSet.addAll(addAll);
        }
        return hashSet;
    }
}
