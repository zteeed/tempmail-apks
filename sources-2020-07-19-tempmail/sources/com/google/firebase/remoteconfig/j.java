package com.google.firebase.remoteconfig;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.abt.b;
import com.google.firebase.analytics.a.a;
import com.google.firebase.c;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.google.firebase.remoteconfig.internal.e;
import com.google.firebase.remoteconfig.internal.k;
import com.google.firebase.remoteconfig.internal.l;
import com.google.firebase.remoteconfig.internal.m;
import com.google.firebase.remoteconfig.internal.n;
import com.google.firebase.remoteconfig.internal.p;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@KeepForSdk
/* compiled from: com.google.firebase:firebase-config@@19.1.4 */
public class j {
    private static final Clock j = DefaultClock.d();
    private static final Random k = new Random();

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, f> f11528a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f11529b;

    /* renamed from: c  reason: collision with root package name */
    private final ExecutorService f11530c;

    /* renamed from: d  reason: collision with root package name */
    private final c f11531d;

    /* renamed from: e  reason: collision with root package name */
    private final FirebaseInstanceId f11532e;

    /* renamed from: f  reason: collision with root package name */
    private final b f11533f;
    private final a g;
    private final String h;
    private Map<String, String> i;

    j(Context context, c cVar, FirebaseInstanceId firebaseInstanceId, b bVar, a aVar) {
        this(context, Executors.newCachedThreadPool(), cVar, firebaseInstanceId, bVar, aVar, new p(context, cVar.j().c()), true);
    }

    public static e c(Context context, String str, String str2, String str3) {
        return e.f(Executors.newCachedThreadPool(), n.c(context, String.format("%s_%s_%s_%s.json", new Object[]{"frc", str, str2, str3})));
    }

    private e d(String str, String str2) {
        return c(this.f11529b, this.h, str, str2);
    }

    private l h(e eVar, e eVar2) {
        return new l(eVar, eVar2);
    }

    static m i(Context context, String str, String str2) {
        return new m(context.getSharedPreferences(String.format("%s_%s_%s_%s", new Object[]{"frc", str, str2, "settings"}), 0));
    }

    private static boolean j(c cVar, String str) {
        return str.equals("firebase") && k(cVar);
    }

    private static boolean k(c cVar) {
        return cVar.i().equals("[DEFAULT]");
    }

    /* access modifiers changed from: package-private */
    public synchronized f a(c cVar, String str, FirebaseInstanceId firebaseInstanceId, b bVar, Executor executor, e eVar, e eVar2, e eVar3, k kVar, l lVar, m mVar) {
        f fVar;
        String str2 = str;
        synchronized (this) {
            if (!this.f11528a.containsKey(str2)) {
                f fVar2 = new f(this.f11529b, cVar, firebaseInstanceId, j(cVar, str) ? bVar : null, executor, eVar, eVar2, eVar3, kVar, lVar, mVar);
                fVar2.s();
                this.f11528a.put(str2, fVar2);
            }
            fVar = this.f11528a.get(str2);
        }
        return fVar;
    }

    @KeepForSdk
    public synchronized f b(String str) {
        e d2;
        e d3;
        e d4;
        m i2;
        d2 = d(str, "fetch");
        d3 = d(str, "activate");
        d4 = d(str, "defaults");
        i2 = i(this.f11529b, this.h, str);
        return a(this.f11531d, str, this.f11532e, this.f11533f, this.f11530c, d2, d3, d4, f(str, d2, i2), h(d3, d4), i2);
    }

    /* access modifiers changed from: package-private */
    public f e() {
        return b("firebase");
    }

    /* access modifiers changed from: package-private */
    public synchronized k f(String str, e eVar, m mVar) {
        return new k(this.f11532e, k(this.f11531d) ? this.g : null, this.f11530c, j, k, eVar, g(this.f11531d.j().b(), str, mVar), mVar, this.i);
    }

    /* access modifiers changed from: package-private */
    public ConfigFetchHttpClient g(String str, String str2, m mVar) {
        return new ConfigFetchHttpClient(this.f11529b, this.f11531d.j().c(), str, str2, mVar.b(), mVar.b());
    }

    protected j(Context context, ExecutorService executorService, c cVar, FirebaseInstanceId firebaseInstanceId, b bVar, a aVar, p pVar, boolean z) {
        this.f11528a = new HashMap();
        this.i = new HashMap();
        this.f11529b = context;
        this.f11530c = executorService;
        this.f11531d = cVar;
        this.f11532e = firebaseInstanceId;
        this.f11533f = bVar;
        this.g = aVar;
        this.h = cVar.j().c();
        if (z) {
            Tasks.c(executorService, h.a(this));
            pVar.getClass();
            Tasks.c(executorService, i.a(pVar));
        }
    }
}
