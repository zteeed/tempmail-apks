package com.google.android.play.core.assetpacks;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.play.core.internal.a;
import com.google.android.play.core.internal.c0;
import com.google.android.play.core.internal.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

final class m1 {

    /* renamed from: f  reason: collision with root package name */
    private static final a f11329f = new a("ExtractorSessionStoreView");

    /* renamed from: a  reason: collision with root package name */
    private final b0 f11330a;

    /* renamed from: b  reason: collision with root package name */
    private final y<j3> f11331b;

    /* renamed from: c  reason: collision with root package name */
    private final y0 f11332c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<Integer, j1> f11333d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final ReentrantLock f11334e = new ReentrantLock();

    m1(b0 b0Var, y<j3> yVar, y0 y0Var, y<Executor> yVar2) {
        this.f11330a = b0Var;
        this.f11331b = yVar;
        this.f11332c = y0Var;
    }

    private final <T> T a(l1<T> l1Var) {
        try {
            b();
            return l1Var.d();
        } finally {
            f();
        }
    }

    private final Map<String, j1> o(List<String> list) {
        return (Map) a(new e1(this, list));
    }

    private final j1 q(int i) {
        Map<Integer, j1> map = this.f11333d;
        Integer valueOf = Integer.valueOf(i);
        j1 j1Var = map.get(valueOf);
        if (j1Var != null) {
            return j1Var;
        }
        throw new v0(String.format("Could not find session %d while trying to get it", new Object[]{valueOf}), i);
    }

    private static String r(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        if (stringArrayList != null && !stringArrayList.isEmpty()) {
            return stringArrayList.get(0);
        }
        throw new v0("Session without pack received.");
    }

    private static <T> List<T> s(List<T> list) {
        return list == null ? Collections.emptyList() : list;
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        this.f11334e.lock();
    }

    /* access modifiers changed from: package-private */
    public final void c(int i) {
        a(new g1(this, i));
    }

    /* access modifiers changed from: package-private */
    public final void d(String str, int i, long j) {
        a(new d1(this, str, i, j));
    }

    /* access modifiers changed from: package-private */
    public final boolean e(Bundle bundle) {
        return ((Boolean) a(new b1(this, bundle))).booleanValue();
    }

    /* access modifiers changed from: package-private */
    public final void f() {
        this.f11334e.unlock();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void g(int i) {
        q(i).f11303c.f11287c = 5;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void h(String str, int i, long j) {
        j1 j1Var = o(Arrays.asList(new String[]{str})).get(str);
        if (j1Var == null || w1.f(j1Var.f11303c.f11287c)) {
            f11329f.e(String.format("Could not find pack %s while trying to complete it", new Object[]{str}), new Object[0]);
        }
        this.f11330a.A(str, i, j);
        j1Var.f11303c.f11287c = 4;
    }

    /* access modifiers changed from: package-private */
    public final boolean i(Bundle bundle) {
        return ((Boolean) a(new c1(this, bundle))).booleanValue();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Boolean j(Bundle bundle) {
        int i = bundle.getInt("session_id");
        if (i == 0) {
            return Boolean.TRUE;
        }
        Map<Integer, j1> map = this.f11333d;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            return Boolean.TRUE;
        }
        j1 j1Var = this.f11333d.get(valueOf);
        if (j1Var.f11303c.f11287c == 6) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(!w1.d(j1Var.f11303c.f11287c, bundle.getInt(c0.a("status", r(bundle)))));
    }

    /* access modifiers changed from: package-private */
    public final Map<Integer, j1> k() {
        return this.f11333d;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Map l(List list) {
        HashMap hashMap = new HashMap();
        for (j1 next : this.f11333d.values()) {
            String str = next.f11303c.f11285a;
            if (list.contains(str)) {
                j1 j1Var = (j1) hashMap.get(str);
                if ((j1Var != null ? j1Var.f11301a : -1) < next.f11301a) {
                    hashMap.put(str, next);
                }
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void m(int i) {
        j1 q = q(i);
        if (w1.f(q.f11303c.f11287c)) {
            b0 b0Var = this.f11330a;
            i1 i1Var = q.f11303c;
            b0Var.A(i1Var.f11285a, q.f11302b, i1Var.f11286b);
            i1 i1Var2 = q.f11303c;
            int i2 = i1Var2.f11287c;
            if (i2 == 5 || i2 == 6) {
                this.f11330a.t(i1Var2.f11285a);
                return;
            }
            return;
        }
        throw new v0(String.format("Could not safely delete session %d because it is not in a terminal state.", new Object[]{Integer.valueOf(i)}), i);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Boolean n(Bundle bundle) {
        k1 k1Var;
        Bundle bundle2 = bundle;
        int i = bundle2.getInt("session_id");
        if (i == 0) {
            return Boolean.FALSE;
        }
        Map<Integer, j1> map = this.f11333d;
        Integer valueOf = Integer.valueOf(i);
        boolean z = false;
        if (map.containsKey(valueOf)) {
            j1 q = q(i);
            int i2 = bundle2.getInt(c0.a("status", q.f11303c.f11285a));
            if (w1.d(q.f11303c.f11287c, i2)) {
                f11329f.c("Found stale update for session %s with status %d.", valueOf, Integer.valueOf(q.f11303c.f11287c));
                i1 i1Var = q.f11303c;
                String str = i1Var.f11285a;
                int i3 = i1Var.f11287c;
                if (i3 == 4) {
                    this.f11331b.d().a(i, str);
                } else if (i3 == 5) {
                    this.f11331b.d().S(i);
                } else if (i3 == 6) {
                    this.f11331b.d().K(Arrays.asList(new String[]{str}));
                }
            } else {
                q.f11303c.f11287c = i2;
                if (w1.f(i2)) {
                    c(i);
                    this.f11332c.b(q.f11303c.f11285a);
                } else {
                    List<k1> list = q.f11303c.f11289e;
                    int size = list.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        k1 k1Var2 = list.get(i4);
                        ArrayList parcelableArrayList = bundle2.getParcelableArrayList(c0.b("chunk_intents", q.f11303c.f11285a, k1Var2.f11307a));
                        if (parcelableArrayList != null) {
                            for (int i5 = 0; i5 < parcelableArrayList.size(); i5++) {
                                if (!(parcelableArrayList.get(i5) == null || ((Intent) parcelableArrayList.get(i5)).getData() == null)) {
                                    k1Var2.f11310d.get(i5).f11272a = true;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            String r = r(bundle);
            long j = bundle2.getLong(c0.a("pack_version", r));
            int i6 = bundle2.getInt(c0.a("status", r));
            long j2 = bundle2.getLong(c0.a("total_bytes_to_download", r));
            ArrayList<String> stringArrayList = bundle2.getStringArrayList(c0.a("slice_ids", r));
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = s(stringArrayList).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                ArrayList parcelableArrayList2 = bundle2.getParcelableArrayList(c0.b("chunk_intents", r, str2));
                ArrayList arrayList2 = new ArrayList();
                for (Intent intent : s(parcelableArrayList2)) {
                    Iterator<T> it2 = it;
                    if (intent != null) {
                        z = true;
                    }
                    arrayList2.add(new h1(z));
                    it = it2;
                    z = false;
                }
                Iterator<T> it3 = it;
                String string = bundle2.getString(c0.b("uncompressed_hash_sha256", r, str2));
                long j3 = bundle2.getLong(c0.b("uncompressed_size", r, str2));
                z = false;
                int i7 = bundle2.getInt(c0.b("patch_format", r, str2), 0);
                if (i7 == 0) {
                    k1Var = new k1(str2, string, j3, arrayList2, bundle2.getInt(c0.b("compression_format", r, str2), 0), 0);
                } else {
                    k1Var = new k1(str2, string, j3, arrayList2, 0, i7);
                }
                arrayList.add(k1Var);
                it = it3;
            }
            this.f11333d.put(Integer.valueOf(i), new j1(i, bundle2.getInt("app_version_code"), new i1(r, j, i6, j2, arrayList)));
        }
        return Boolean.TRUE;
    }

    /* access modifiers changed from: package-private */
    public final void p(int i) {
        a(new f1(this, i));
    }
}
