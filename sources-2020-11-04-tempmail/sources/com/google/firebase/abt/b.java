package com.google.firebase.abt;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.analytics.a.a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.firebase:firebase-abt@@19.0.1 */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final a f11538a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11539b;

    /* renamed from: c  reason: collision with root package name */
    private Integer f11540c = null;

    public b(Context context, a aVar, String str) {
        this.f11538a = aVar;
        this.f11539b = str;
    }

    private void a(a.c cVar) {
        this.f11538a.b(cVar);
    }

    private void b(List<a> list) {
        ArrayDeque arrayDeque = new ArrayDeque(d());
        int g = g();
        for (a next : list) {
            while (arrayDeque.size() >= g) {
                i(((a.c) arrayDeque.pollFirst()).f11548b);
            }
            a.c d2 = next.d(this.f11539b);
            a(d2);
            arrayDeque.offer(d2);
        }
    }

    private static List<a> c(List<Map<String, String>> list) throws AbtException {
        ArrayList arrayList = new ArrayList();
        for (Map<String, String> a2 : list) {
            arrayList.add(a.a(a2));
        }
        return arrayList;
    }

    private List<a.c> d() {
        return this.f11538a.d0(this.f11539b, "");
    }

    private ArrayList<a> e(List<a> list, Set<String> set) {
        ArrayList<a> arrayList = new ArrayList<>();
        for (a next : list) {
            if (!set.contains(next.b())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    private ArrayList<a.c> f(List<a.c> list, Set<String> set) {
        ArrayList<a.c> arrayList = new ArrayList<>();
        for (a.c next : list) {
            if (!set.contains(next.f11548b)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    private int g() {
        if (this.f11540c == null) {
            this.f11540c = Integer.valueOf(this.f11538a.Z(this.f11539b));
        }
        return this.f11540c.intValue();
    }

    private void i(String str) {
        this.f11538a.clearConditionalUserProperty(str, (String) null, (Bundle) null);
    }

    private void j(Collection<a.c> collection) {
        for (a.c cVar : collection) {
            i(cVar.f11548b);
        }
    }

    private void l(List<a> list) throws AbtException {
        if (list.isEmpty()) {
            h();
            return;
        }
        HashSet hashSet = new HashSet();
        for (a b2 : list) {
            hashSet.add(b2.b());
        }
        List<a.c> d2 = d();
        HashSet hashSet2 = new HashSet();
        for (a.c cVar : d2) {
            hashSet2.add(cVar.f11548b);
        }
        j(f(d2, hashSet));
        b(e(list, hashSet2));
    }

    private void m() throws AbtException {
        if (this.f11538a == null) {
            throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }

    public void h() throws AbtException {
        m();
        j(d());
    }

    public void k(List<Map<String, String>> list) throws AbtException {
        m();
        if (list != null) {
            l(c(list));
            return;
        }
        throw new IllegalArgumentException("The replacementExperiments list is null.");
    }
}
