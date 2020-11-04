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
    private final a f10986a;

    /* renamed from: b  reason: collision with root package name */
    private final String f10987b;

    /* renamed from: c  reason: collision with root package name */
    private Integer f10988c = null;

    public b(Context context, a aVar, String str) {
        this.f10986a = aVar;
        this.f10987b = str;
    }

    private void a(a.c cVar) {
        this.f10986a.b(cVar);
    }

    private void b(List<a> list) {
        ArrayDeque arrayDeque = new ArrayDeque(d());
        int g = g();
        for (a next : list) {
            while (arrayDeque.size() >= g) {
                i(((a.c) arrayDeque.pollFirst()).f10996b);
            }
            a.c d2 = next.d(this.f10987b);
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
        return this.f10986a.X(this.f10987b, "");
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
            if (!set.contains(next.f10996b)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    private int g() {
        if (this.f10988c == null) {
            this.f10988c = Integer.valueOf(this.f10986a.T(this.f10987b));
        }
        return this.f10988c.intValue();
    }

    private void i(String str) {
        this.f10986a.clearConditionalUserProperty(str, (String) null, (Bundle) null);
    }

    private void j(Collection<a.c> collection) {
        for (a.c cVar : collection) {
            i(cVar.f10996b);
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
            hashSet2.add(cVar.f10996b);
        }
        j(f(d2, hashSet));
        b(e(list, hashSet2));
    }

    private void m() throws AbtException {
        if (this.f10986a == null) {
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
