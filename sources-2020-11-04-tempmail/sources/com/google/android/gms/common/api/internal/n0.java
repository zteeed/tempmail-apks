package com.google.android.gms.common.api.internal;

import a.e.a;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zad;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

final class n0 implements zabs {

    /* renamed from: b  reason: collision with root package name */
    private final Context f2994b;

    /* renamed from: c  reason: collision with root package name */
    private final zaaw f2995c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final zabe f2996d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final zabe f2997e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<Api.AnyClientKey<?>, zabe> f2998f;
    private final Set<SignInConnectionListener> g = Collections.newSetFromMap(new WeakHashMap());
    private final Api.Client h;
    private Bundle i;
    /* access modifiers changed from: private */
    public ConnectionResult j = null;
    /* access modifiers changed from: private */
    public ConnectionResult k = null;
    /* access modifiers changed from: private */
    public boolean l = false;
    /* access modifiers changed from: private */
    public final Lock m;
    @GuardedBy("mLock")
    private int n = 0;

    private n0(Context context, zaaw zaaw, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map<Api.AnyClientKey<?>, Api.Client> map, Map<Api.AnyClientKey<?>, Api.Client> map2, ClientSettings clientSettings, Api.AbstractClientBuilder<? extends zad, SignInOptions> abstractClientBuilder, Api.Client client, ArrayList<zaq> arrayList, ArrayList<zaq> arrayList2, Map<Api<?>, Boolean> map3, Map<Api<?>, Boolean> map4) {
        this.f2994b = context;
        zaaw zaaw2 = zaaw;
        this.f2995c = zaaw2;
        this.m = lock;
        this.h = client;
        Context context2 = context;
        Lock lock2 = lock;
        Looper looper2 = looper;
        GoogleApiAvailabilityLight googleApiAvailabilityLight2 = googleApiAvailabilityLight;
        zabe zabe = r3;
        zabe zabe2 = new zabe(context2, zaaw2, lock2, looper2, googleApiAvailabilityLight2, map2, (ClientSettings) null, map4, (Api.AbstractClientBuilder<? extends zad, SignInOptions>) null, arrayList2, new p0(this, (o0) null));
        this.f2996d = zabe;
        this.f2997e = new zabe(context2, this.f2995c, lock2, looper2, googleApiAvailabilityLight2, map, clientSettings, map3, abstractClientBuilder, arrayList, new q0(this, (o0) null));
        a aVar = new a();
        for (Api.AnyClientKey<?> put : map2.keySet()) {
            aVar.put(put, this.f2996d);
        }
        for (Api.AnyClientKey<?> put2 : map.keySet()) {
            aVar.put(put2, this.f2997e);
        }
        this.f2998f = Collections.unmodifiableMap(aVar);
    }

    public static n0 c(Context context, zaaw zaaw, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map<Api.AnyClientKey<?>, Api.Client> map, ClientSettings clientSettings, Map<Api<?>, Boolean> map2, Api.AbstractClientBuilder<? extends zad, SignInOptions> abstractClientBuilder, ArrayList<zaq> arrayList) {
        Map<Api<?>, Boolean> map3 = map2;
        a aVar = new a();
        a aVar2 = new a();
        Api.Client client = null;
        for (Map.Entry next : map.entrySet()) {
            Api.Client client2 = (Api.Client) next.getValue();
            if (client2.providesSignIn()) {
                client = client2;
            }
            if (client2.requiresSignIn()) {
                aVar.put((Api.AnyClientKey) next.getKey(), client2);
            } else {
                aVar2.put((Api.AnyClientKey) next.getKey(), client2);
            }
        }
        Preconditions.o(!aVar.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        a aVar3 = new a();
        a aVar4 = new a();
        for (Api next2 : map2.keySet()) {
            Api.AnyClientKey<?> a2 = next2.a();
            if (aVar.containsKey(a2)) {
                aVar3.put(next2, map3.get(next2));
            } else if (aVar2.containsKey(a2)) {
                aVar4.put(next2, map3.get(next2));
            } else {
                throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            zaq zaq = arrayList.get(i2);
            i2++;
            zaq zaq2 = zaq;
            if (aVar3.containsKey(zaq2.f3093b)) {
                arrayList2.add(zaq2);
            } else if (aVar4.containsKey(zaq2.f3093b)) {
                arrayList3.add(zaq2);
            } else {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
            }
        }
        return new n0(context, zaaw, lock, looper, googleApiAvailabilityLight, aVar, aVar2, clientSettings, abstractClientBuilder, client, arrayList2, arrayList3, aVar3, aVar4);
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    public final void e(int i2, boolean z) {
        this.f2995c.c(i2, z);
        this.k = null;
        this.j = null;
    }

    /* access modifiers changed from: private */
    public final void f(Bundle bundle) {
        Bundle bundle2 = this.i;
        if (bundle2 == null) {
            this.i = bundle;
        } else if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    @GuardedBy("mLock")
    private final void g(ConnectionResult connectionResult) {
        int i2 = this.n;
        if (i2 != 1) {
            if (i2 != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.n = 0;
            }
            this.f2995c.a(connectionResult);
        }
        u();
        this.n = 0;
    }

    private final boolean j(BaseImplementation.ApiMethodImpl<? extends Result, ? extends Api.AnyClient> apiMethodImpl) {
        Api.AnyClientKey<? extends Api.AnyClient> t = apiMethodImpl.t();
        Preconditions.b(this.f2998f.containsKey(t), "GoogleApiClient is not configured to use the API required for this call.");
        return this.f2998f.get(t).equals(this.f2997e);
    }

    private final PendingIntent l() {
        if (this.h == null) {
            return null;
        }
        return PendingIntent.getActivity(this.f2994b, System.identityHashCode(this.f2995c), this.h.getSignInIntent(), 134217728);
    }

    private static boolean o(ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.G();
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    public final void t() {
        ConnectionResult connectionResult;
        if (o(this.j)) {
            if (o(this.k) || v()) {
                int i2 = this.n;
                if (i2 != 1) {
                    if (i2 != 2) {
                        Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                        this.n = 0;
                        return;
                    }
                    this.f2995c.b(this.i);
                }
                u();
                this.n = 0;
                return;
            }
            ConnectionResult connectionResult2 = this.k;
            if (connectionResult2 == null) {
                return;
            }
            if (this.n == 1) {
                u();
                return;
            }
            g(connectionResult2);
            this.f2996d.disconnect();
        } else if (this.j == null || !o(this.k)) {
            ConnectionResult connectionResult3 = this.j;
            if (connectionResult3 != null && (connectionResult = this.k) != null) {
                if (this.f2997e.n < this.f2996d.n) {
                    connectionResult3 = connectionResult;
                }
                g(connectionResult3);
            }
        } else {
            this.f2997e.disconnect();
            g(this.j);
        }
    }

    @GuardedBy("mLock")
    private final void u() {
        for (SignInConnectionListener onComplete : this.g) {
            onComplete.onComplete();
        }
        this.g.clear();
    }

    @GuardedBy("mLock")
    private final boolean v() {
        ConnectionResult connectionResult = this.k;
        return connectionResult != null && connectionResult.u() == 4;
    }

    @GuardedBy("mLock")
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T W(T t) {
        if (!j(t)) {
            return this.f2996d.W(t);
        }
        if (!v()) {
            return this.f2997e.W(t);
        }
        t.x(new Status(4, (String) null, l()));
        return t;
    }

    @GuardedBy("mLock")
    public final void a() {
        this.f2996d.a();
        this.f2997e.a();
    }

    @GuardedBy("mLock")
    public final void connect() {
        this.n = 2;
        this.l = false;
        this.k = null;
        this.j = null;
        this.f2996d.connect();
        this.f2997e.connect();
    }

    @GuardedBy("mLock")
    public final void disconnect() {
        this.k = null;
        this.j = null;
        this.n = 0;
        this.f2996d.disconnect();
        this.f2997e.disconnect();
        u();
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("authClient").println(":");
        this.f2997e.dump(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append(str).append("anonClient").println(":");
        this.f2996d.dump(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }
}
