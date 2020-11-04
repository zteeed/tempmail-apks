package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.util.concurrent.HandlerExecutor;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zad;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

public final class zax implements zabs {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Map<Api.AnyClientKey<?>, zaw<?>> f3096b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Map<Api.AnyClientKey<?>, zaw<?>> f3097c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Map<Api<?>, Boolean> f3098d;

    /* renamed from: e  reason: collision with root package name */
    private final GoogleApiManager f3099e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final zaaw f3100f;
    /* access modifiers changed from: private */
    public final Lock g;
    private final Looper h;
    private final GoogleApiAvailabilityLight i;
    /* access modifiers changed from: private */
    public final Condition j;
    private final ClientSettings k;
    private final boolean l;
    /* access modifiers changed from: private */
    public final boolean m;
    private final Queue<BaseImplementation.ApiMethodImpl<?, ?>> n = new LinkedList();
    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    public boolean o;
    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    public Map<zai<?>, ConnectionResult> p;
    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    public Map<zai<?>, ConnectionResult> q;
    @GuardedBy("mLock")
    private a r;
    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    public ConnectionResult s;

    public zax(Context context, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map<Api.AnyClientKey<?>, Api.Client> map, ClientSettings clientSettings, Map<Api<?>, Boolean> map2, Api.AbstractClientBuilder<? extends zad, SignInOptions> abstractClientBuilder, ArrayList<zaq> arrayList, zaaw zaaw, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        this.g = lock;
        this.h = looper;
        this.j = lock.newCondition();
        this.i = googleApiAvailabilityLight;
        this.f3100f = zaaw;
        this.f3098d = map2;
        this.k = clientSettings;
        this.l = z;
        HashMap hashMap = new HashMap();
        for (Api next : map2.keySet()) {
            hashMap.put(next.a(), next);
        }
        HashMap hashMap2 = new HashMap();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            zaq zaq = arrayList.get(i2);
            i2++;
            zaq zaq2 = zaq;
            hashMap2.put(zaq2.f3093b, zaq2);
        }
        boolean z5 = false;
        boolean z6 = true;
        boolean z7 = false;
        for (Map.Entry next2 : map.entrySet()) {
            Api api = (Api) hashMap.get(next2.getKey());
            Api.Client client = (Api.Client) next2.getValue();
            if (client.requiresGooglePlayServices()) {
                z3 = z6;
                if (!this.f3098d.get(api).booleanValue()) {
                    z4 = true;
                    z2 = true;
                } else {
                    z2 = z7;
                    z4 = true;
                }
            } else {
                z4 = z5;
                z2 = z7;
                z3 = false;
            }
            zaw zaw = r1;
            zaw zaw2 = new zaw(context, api, looper, client, (zaq) hashMap2.get(api), clientSettings, abstractClientBuilder);
            this.f3096b.put((Api.AnyClientKey) next2.getKey(), zaw);
            if (client.requiresSignIn()) {
                this.f3097c.put((Api.AnyClientKey) next2.getKey(), zaw);
            }
            z5 = z4;
            z6 = z3;
            z7 = z2;
        }
        this.m = z5 && !z6 && !z7;
        this.f3099e = GoogleApiManager.m();
    }

    private final ConnectionResult c(Api.AnyClientKey<?> anyClientKey) {
        this.g.lock();
        try {
            zaw zaw = this.f3096b.get(anyClientKey);
            if (this.p != null && zaw != null) {
                return this.p.get(zaw.j());
            }
            this.g.unlock();
            return null;
        } finally {
            this.g.unlock();
        }
    }

    /* access modifiers changed from: private */
    public final boolean g(zaw<?> zaw, ConnectionResult connectionResult) {
        return !connectionResult.G() && !connectionResult.B() && this.f3098d.get(zaw.d()).booleanValue() && zaw.k().requiresGooglePlayServices() && this.i.m(connectionResult.u());
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    public final void j() {
        if (this.k == null) {
            this.f3100f.p = Collections.emptySet();
            return;
        }
        HashSet hashSet = new HashSet(this.k.i());
        Map<Api<?>, ClientSettings.OptionalApiSettings> f2 = this.k.f();
        for (Api next : f2.keySet()) {
            ConnectionResult b2 = b(next);
            if (b2 != null && b2.G()) {
                hashSet.addAll(f2.get(next).f3178a);
            }
        }
        this.f3100f.p = hashSet;
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    public final void k() {
        while (!this.n.isEmpty()) {
            W(this.n.remove());
        }
        this.f3100f.b((Bundle) null);
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    public final ConnectionResult l() {
        int i2 = 0;
        ConnectionResult connectionResult = null;
        ConnectionResult connectionResult2 = null;
        int i3 = 0;
        for (zaw next : this.f3096b.values()) {
            Api d2 = next.d();
            ConnectionResult connectionResult3 = this.p.get(next.j());
            if (!connectionResult3.G() && (!this.f3098d.get(d2).booleanValue() || connectionResult3.B() || this.i.m(connectionResult3.u()))) {
                if (connectionResult3.u() != 4 || !this.l) {
                    int a2 = d2.c().a();
                    if (connectionResult == null || i2 > a2) {
                        connectionResult = connectionResult3;
                        i2 = a2;
                    }
                } else {
                    int a3 = d2.c().a();
                    if (connectionResult2 == null || i3 > a3) {
                        connectionResult2 = connectionResult3;
                        i3 = a3;
                    }
                }
            }
        }
        return (connectionResult == null || connectionResult2 == null || i2 <= i3) ? connectionResult : connectionResult2;
    }

    private final <T extends BaseImplementation.ApiMethodImpl<? extends Result, ? extends Api.AnyClient>> boolean m(T t) {
        Api.AnyClientKey t2 = t.t();
        ConnectionResult c2 = c(t2);
        if (c2 == null || c2.u() != 4) {
            return false;
        }
        t.x(new Status(4, (String) null, this.f3099e.a(this.f3096b.get(t2).j(), System.identityHashCode(this.f3100f))));
        return true;
    }

    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T W(T t) {
        Api.AnyClientKey t2 = t.t();
        if (this.l && m(t)) {
            return t;
        }
        this.f3100f.x.b(t);
        this.f3096b.get(t2).b(t);
        return t;
    }

    public final void a() {
    }

    public final ConnectionResult b(Api<?> api) {
        return c(api.a());
    }

    public final void connect() {
        this.g.lock();
        try {
            if (!this.o) {
                this.o = true;
                this.p = null;
                this.q = null;
                this.r = null;
                this.s = null;
                this.f3099e.z();
                this.f3099e.c(this.f3096b.values()).d(new HandlerExecutor(this.h), new s0(this));
                this.g.unlock();
            }
        } finally {
            this.g.unlock();
        }
    }

    public final void disconnect() {
        this.g.lock();
        try {
            this.o = false;
            this.p = null;
            this.q = null;
            if (this.r == null) {
                this.s = null;
                while (!this.n.isEmpty()) {
                    BaseImplementation.ApiMethodImpl remove = this.n.remove();
                    remove.l((h0) null);
                    remove.b();
                }
                this.j.signalAll();
                return;
            }
            this.r.b();
            throw null;
        } finally {
            this.g.unlock();
        }
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}
