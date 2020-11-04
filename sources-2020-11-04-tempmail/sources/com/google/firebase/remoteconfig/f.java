package com.google.firebase.remoteconfig;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.abt.AbtException;
import com.google.firebase.abt.b;
import com.google.firebase.c;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.remoteconfig.internal.e;
import com.google.firebase.remoteconfig.internal.f;
import com.google.firebase.remoteconfig.internal.k;
import com.google.firebase.remoteconfig.internal.l;
import com.google.firebase.remoteconfig.internal.m;
import com.google.firebase.remoteconfig.internal.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-config@@19.1.4 */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private final Context f11998a;

    /* renamed from: b  reason: collision with root package name */
    private final b f11999b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f12000c;

    /* renamed from: d  reason: collision with root package name */
    private final e f12001d;

    /* renamed from: e  reason: collision with root package name */
    private final e f12002e;

    /* renamed from: f  reason: collision with root package name */
    private final e f12003f;
    private final k g;
    private final l h;
    private final m i;

    f(Context context, c cVar, FirebaseInstanceId firebaseInstanceId, b bVar, Executor executor, e eVar, e eVar2, e eVar3, k kVar, l lVar, m mVar) {
        this.f11998a = context;
        this.f11999b = bVar;
        this.f12000c = executor;
        this.f12001d = eVar;
        this.f12002e = eVar2;
        this.f12003f = eVar3;
        this.g = kVar;
        this.h = lVar;
        this.i = mVar;
    }

    public static f f() {
        return g(c.h());
    }

    public static f g(c cVar) {
        return ((j) cVar.f(j.class)).e();
    }

    private static boolean j(com.google.firebase.remoteconfig.internal.f fVar, com.google.firebase.remoteconfig.internal.f fVar2) {
        return fVar2 == null || !fVar.e().equals(fVar2.e());
    }

    static /* synthetic */ Task k(f fVar, Task task, Task task2, Task task3) throws Exception {
        if (!task.r() || task.n() == null) {
            return Tasks.e(Boolean.FALSE);
        }
        com.google.firebase.remoteconfig.internal.f fVar2 = (com.google.firebase.remoteconfig.internal.f) task.n();
        if (!task2.r() || j(fVar2, (com.google.firebase.remoteconfig.internal.f) task2.n())) {
            return fVar.f12002e.i(fVar2).j(fVar.f12000c, b.a(fVar));
        }
        return Tasks.e(Boolean.FALSE);
    }

    /* access modifiers changed from: private */
    public boolean o(Task<com.google.firebase.remoteconfig.internal.f> task) {
        if (!task.r()) {
            return false;
        }
        this.f12001d.b();
        if (task.n() != null) {
            u(task.n().c());
            return true;
        }
        Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
        return true;
    }

    private Task<Void> r(Map<String, String> map) {
        try {
            f.b f2 = com.google.firebase.remoteconfig.internal.f.f();
            f2.b(map);
            return this.f12003f.i(f2.a()).s(a.a());
        } catch (JSONException e2) {
            Log.e("FirebaseRemoteConfig", "The provided defaults map could not be processed.", e2);
            return Tasks.e(null);
        }
    }

    static List<Map<String, String>> t(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    public Task<Boolean> b() {
        Task<com.google.firebase.remoteconfig.internal.f> c2 = this.f12001d.c();
        Task<com.google.firebase.remoteconfig.internal.f> c3 = this.f12002e.c();
        return Tasks.i(c2, c3).l(this.f12000c, c.a(this, c2, c3));
    }

    public Task<Void> c(long j) {
        return this.g.d(j).s(d.a());
    }

    public boolean d(String str) {
        return this.h.a(str);
    }

    public double e(String str) {
        return this.h.c(str);
    }

    public long h(String str) {
        return this.h.e(str);
    }

    public String i(String str) {
        return this.h.g(str);
    }

    public Task<Void> p(g gVar) {
        return Tasks.c(this.f12000c, e.a(this, gVar));
    }

    public Task<Void> q(int i2) {
        return r(o.a(this.f11998a, i2));
    }

    /* access modifiers changed from: package-private */
    public void s() {
        this.f12002e.c();
        this.f12003f.c();
        this.f12001d.c();
    }

    /* access modifiers changed from: package-private */
    public void u(JSONArray jSONArray) {
        if (this.f11999b != null) {
            try {
                this.f11999b.k(t(jSONArray));
            } catch (JSONException e2) {
                Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e2);
            } catch (AbtException e3) {
                Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e3);
            }
        }
    }
}
