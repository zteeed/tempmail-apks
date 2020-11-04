package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.internal.zaj;
import com.google.android.gms.signin.zad;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

public final class zaak implements zabd {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final zabe f2837a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Lock f2838b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Context f2839c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final GoogleApiAvailabilityLight f2840d;

    /* renamed from: e  reason: collision with root package name */
    private ConnectionResult f2841e;

    /* renamed from: f  reason: collision with root package name */
    private int f2842f;
    private int g = 0;
    private int h;
    private final Bundle i = new Bundle();
    private final Set<Api.AnyClientKey> j = new HashSet();
    /* access modifiers changed from: private */
    public zad k;
    private boolean l;
    /* access modifiers changed from: private */
    public boolean m;
    private boolean n;
    /* access modifiers changed from: private */
    public IAccountAccessor o;
    private boolean p;
    private boolean q;
    /* access modifiers changed from: private */
    public final ClientSettings r;
    private final Map<Api<?>, Boolean> s;
    private final Api.AbstractClientBuilder<? extends zad, SignInOptions> t;
    private ArrayList<Future<?>> u = new ArrayList<>();

    public zaak(zabe zabe, ClientSettings clientSettings, Map<Api<?>, Boolean> map, GoogleApiAvailabilityLight googleApiAvailabilityLight, Api.AbstractClientBuilder<? extends zad, SignInOptions> abstractClientBuilder, Lock lock, Context context) {
        this.f2837a = zabe;
        this.r = clientSettings;
        this.s = map;
        this.f2840d = googleApiAvailabilityLight;
        this.t = abstractClientBuilder;
        this.f2838b = lock;
        this.f2839c = context;
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    public final void e(zaj zaj) {
        if (r(0)) {
            ConnectionResult u2 = zaj.u();
            if (u2.G()) {
                ResolveAccountResponse v = zaj.v();
                ConnectionResult v2 = v.v();
                if (!v2.G()) {
                    String valueOf = String.valueOf(v2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                    sb.append("Sign-in succeeded with resolve account failure: ");
                    sb.append(valueOf);
                    Log.wtf("GoogleApiClientConnecting", sb.toString(), new Exception());
                    v(v2);
                    return;
                }
                this.n = true;
                this.o = v.u();
                this.p = v.A();
                this.q = v.B();
                h();
            } else if (u(u2)) {
                j();
                h();
            } else {
                v(u2);
            }
        }
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    public final boolean g() {
        int i2 = this.h - 1;
        this.h = i2;
        if (i2 > 0) {
            return false;
        }
        if (i2 < 0) {
            Log.w("GoogleApiClientConnecting", this.f2837a.o.r());
            Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            v(new ConnectionResult(8, (PendingIntent) null));
            return false;
        }
        ConnectionResult connectionResult = this.f2841e;
        if (connectionResult == null) {
            return true;
        }
        this.f2837a.n = this.f2842f;
        v(connectionResult);
        return false;
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    public final void h() {
        if (this.h == 0) {
            if (!this.m || this.n) {
                ArrayList arrayList = new ArrayList();
                this.g = 1;
                this.h = this.f2837a.g.size();
                for (Api.AnyClientKey next : this.f2837a.g.keySet()) {
                    if (!this.f2837a.h.containsKey(next)) {
                        arrayList.add(this.f2837a.g.get(next));
                    } else if (g()) {
                        i();
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.u.add(zabh.a().submit(new l(this, arrayList)));
                }
            }
        }
    }

    @GuardedBy("mLock")
    private final void i() {
        this.f2837a.h();
        zabh.a().execute(new g(this));
        zad zad = this.k;
        if (zad != null) {
            if (this.p) {
                zad.a(this.o, this.q);
            }
            o(false);
        }
        for (Api.AnyClientKey<?> anyClientKey : this.f2837a.h.keySet()) {
            this.f2837a.g.get(anyClientKey).disconnect();
        }
        this.f2837a.p.b(this.i.isEmpty() ? null : this.i);
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    public final void j() {
        this.m = false;
        this.f2837a.o.p = Collections.emptySet();
        for (Api.AnyClientKey next : this.j) {
            if (!this.f2837a.h.containsKey(next)) {
                this.f2837a.h.put(next, new ConnectionResult(17, (PendingIntent) null));
            }
        }
    }

    private final void k() {
        ArrayList<Future<?>> arrayList = this.u;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Future<?> future = arrayList.get(i2);
            i2++;
            future.cancel(true);
        }
        this.u.clear();
    }

    /* access modifiers changed from: private */
    public final Set<Scope> l() {
        if (this.r == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(this.r.i());
        Map<Api<?>, ClientSettings.OptionalApiSettings> f2 = this.r.f();
        for (Api next : f2.keySet()) {
            if (!this.f2837a.h.containsKey(next.a())) {
                hashSet.addAll(f2.get(next).f2990a);
            }
        }
        return hashSet;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        if (r7 != false) goto L_0x0024;
     */
    @javax.annotation.concurrent.GuardedBy("mLock")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n(com.google.android.gms.common.ConnectionResult r5, com.google.android.gms.common.api.Api<?> r6, boolean r7) {
        /*
            r4 = this;
            com.google.android.gms.common.api.Api$BaseClientBuilder r0 = r6.c()
            int r0 = r0.a()
            r1 = 0
            r2 = 1
            if (r7 == 0) goto L_0x0024
            boolean r7 = r5.B()
            if (r7 == 0) goto L_0x0014
        L_0x0012:
            r7 = 1
            goto L_0x0022
        L_0x0014:
            com.google.android.gms.common.GoogleApiAvailabilityLight r7 = r4.f2840d
            int r3 = r5.u()
            android.content.Intent r7 = r7.c(r3)
            if (r7 == 0) goto L_0x0021
            goto L_0x0012
        L_0x0021:
            r7 = 0
        L_0x0022:
            if (r7 == 0) goto L_0x002d
        L_0x0024:
            com.google.android.gms.common.ConnectionResult r7 = r4.f2841e
            if (r7 == 0) goto L_0x002c
            int r7 = r4.f2842f
            if (r0 >= r7) goto L_0x002d
        L_0x002c:
            r1 = 1
        L_0x002d:
            if (r1 == 0) goto L_0x0033
            r4.f2841e = r5
            r4.f2842f = r0
        L_0x0033:
            com.google.android.gms.common.api.internal.zabe r7 = r4.f2837a
            java.util.Map<com.google.android.gms.common.api.Api$AnyClientKey<?>, com.google.android.gms.common.ConnectionResult> r7 = r7.h
            com.google.android.gms.common.api.Api$AnyClientKey r6 = r6.a()
            r7.put(r6, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zaak.n(com.google.android.gms.common.ConnectionResult, com.google.android.gms.common.api.Api, boolean):void");
    }

    @GuardedBy("mLock")
    private final void o(boolean z) {
        zad zad = this.k;
        if (zad != null) {
            if (zad.isConnected() && z) {
                this.k.b();
            }
            this.k.disconnect();
            if (this.r.k()) {
                this.k = null;
            }
            this.o = null;
        }
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    public final boolean r(int i2) {
        if (this.g == i2) {
            return true;
        }
        Log.w("GoogleApiClientConnecting", this.f2837a.o.r());
        String valueOf = String.valueOf(this);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("Unexpected callback in ");
        sb.append(valueOf);
        Log.w("GoogleApiClientConnecting", sb.toString());
        int i3 = this.h;
        StringBuilder sb2 = new StringBuilder(33);
        sb2.append("mRemainingConnections=");
        sb2.append(i3);
        Log.w("GoogleApiClientConnecting", sb2.toString());
        String t2 = t(this.g);
        String t3 = t(i2);
        StringBuilder sb3 = new StringBuilder(String.valueOf(t2).length() + 70 + String.valueOf(t3).length());
        sb3.append("GoogleApiClient connecting is in step ");
        sb3.append(t2);
        sb3.append(" but received callback for step ");
        sb3.append(t3);
        Log.wtf("GoogleApiClientConnecting", sb3.toString(), new Exception());
        v(new ConnectionResult(8, (PendingIntent) null));
        return false;
    }

    private static String t(int i2) {
        return i2 != 0 ? i2 != 1 ? "UNKNOWN" : "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    public final boolean u(ConnectionResult connectionResult) {
        return this.l && !connectionResult.B();
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    public final void v(ConnectionResult connectionResult) {
        k();
        o(!connectionResult.B());
        this.f2837a.i(connectionResult);
        this.f2837a.p.a(connectionResult);
    }

    @GuardedBy("mLock")
    public final void E(Bundle bundle) {
        if (r(1)) {
            if (bundle != null) {
                this.i.putAll(bundle);
            }
            if (g()) {
                i();
            }
        }
    }

    @GuardedBy("mLock")
    public final void P(ConnectionResult connectionResult, Api<?> api, boolean z) {
        if (r(1)) {
            n(connectionResult, api, z);
            if (g()) {
                i();
            }
        }
    }

    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T Q(T t2) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @GuardedBy("mLock")
    public final void R() {
        this.f2837a.h.clear();
        this.m = false;
        this.f2841e = null;
        this.g = 0;
        this.l = true;
        this.n = false;
        this.p = false;
        HashMap hashMap = new HashMap();
        boolean z = false;
        for (Api next : this.s.keySet()) {
            Api.Client client = this.f2837a.g.get(next.a());
            z |= next.c().a() == 1;
            boolean booleanValue = this.s.get(next).booleanValue();
            if (client.requiresSignIn()) {
                this.m = true;
                if (booleanValue) {
                    this.j.add(next.a());
                } else {
                    this.l = false;
                }
            }
            hashMap.put(client, new h(this, next, booleanValue));
        }
        if (z) {
            this.m = false;
        }
        if (this.m) {
            this.r.l(Integer.valueOf(System.identityHashCode(this.f2837a.o)));
            o oVar = new o(this, (g) null);
            Api.AbstractClientBuilder<? extends zad, SignInOptions> abstractClientBuilder = this.t;
            Context context = this.f2839c;
            Looper k2 = this.f2837a.o.k();
            ClientSettings clientSettings = this.r;
            this.k = (zad) abstractClientBuilder.b(context, k2, clientSettings, clientSettings.j(), oVar, oVar);
        }
        this.h = this.f2837a.g.size();
        this.u.add(zabh.a().submit(new i(this, hashMap)));
    }

    public final void connect() {
    }

    @GuardedBy("mLock")
    public final boolean disconnect() {
        k();
        o(true);
        this.f2837a.i((ConnectionResult) null);
        return true;
    }

    @GuardedBy("mLock")
    public final void y(int i2) {
        v(new ConnectionResult(8, (PendingIntent) null));
    }
}
