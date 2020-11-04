package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.GoogleApiAvailabilityCache;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.SimpleClientAdapter;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.base.zap;
import com.google.android.gms.signin.zad;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;

@KeepForSdk
public class GoogleApiManager implements Handler.Callback {
    public static final Status o = new Status(4, "Sign-out occurred while this API call was in progress.");
    /* access modifiers changed from: private */
    public static final Status p = new Status(4, "The user must be signed in to make this API call.");
    /* access modifiers changed from: private */
    public static final Object q = new Object();
    @GuardedBy("lock")
    private static GoogleApiManager r;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public long f2918b = 5000;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public long f2919c = 120000;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public long f2920d = 10000;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final Context f2921e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final GoogleApiAvailability f2922f;
    /* access modifiers changed from: private */
    public final GoogleApiAvailabilityCache g;
    private final AtomicInteger h = new AtomicInteger(1);
    private final AtomicInteger i = new AtomicInteger(0);
    /* access modifiers changed from: private */
    public final Map<zai<?>, zaa<?>> j = new ConcurrentHashMap(5, 0.75f, 1);
    /* access modifiers changed from: private */
    @GuardedBy("lock")
    public zaae k = null;
    /* access modifiers changed from: private */
    @GuardedBy("lock")
    public final Set<zai<?>> l = new a.e.b();
    private final Set<zai<?>> m = new a.e.b();
    /* access modifiers changed from: private */
    public final Handler n;

    private class b implements zach, BaseGmsClient.ConnectionProgressReportCallbacks {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final Api.Client f2925a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final zai<?> f2926b;

        /* renamed from: c  reason: collision with root package name */
        private IAccountAccessor f2927c = null;

        /* renamed from: d  reason: collision with root package name */
        private Set<Scope> f2928d = null;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public boolean f2929e = false;

        public b(Api.Client client, zai<?> zai) {
            this.f2925a = client;
            this.f2926b = zai;
        }

        /* access modifiers changed from: private */
        public final void g() {
            IAccountAccessor iAccountAccessor;
            if (this.f2929e && (iAccountAccessor = this.f2927c) != null) {
                this.f2925a.getRemoteService(iAccountAccessor, this.f2928d);
            }
        }

        public final void a(ConnectionResult connectionResult) {
            GoogleApiManager.this.n.post(new a0(this, connectionResult));
        }

        public final void b(IAccountAccessor iAccountAccessor, Set<Scope> set) {
            if (iAccountAccessor == null || set == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                c(new ConnectionResult(4));
                return;
            }
            this.f2927c = iAccountAccessor;
            this.f2928d = set;
            g();
        }

        public final void c(ConnectionResult connectionResult) {
            ((zaa) GoogleApiManager.this.j.get(this.f2926b)).J(connectionResult);
        }
    }

    public class zaa<O extends Api.ApiOptions> implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, zar {

        /* renamed from: b  reason: collision with root package name */
        private final Queue<zab> f2931b = new LinkedList();
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final Api.Client f2932c;

        /* renamed from: d  reason: collision with root package name */
        private final Api.AnyClient f2933d;

        /* renamed from: e  reason: collision with root package name */
        private final zai<O> f2934e;

        /* renamed from: f  reason: collision with root package name */
        private final zaab f2935f;
        private final Set<zak> g = new HashSet();
        private final Map<ListenerHolder.ListenerKey<?>, zabw> h = new HashMap();
        private final int i;
        private final zace j;
        private boolean k;
        private final List<a> l = new ArrayList();
        private ConnectionResult m = null;

        public zaa(GoogleApi<O> googleApi) {
            Api.Client f2 = googleApi.f(GoogleApiManager.this.n.getLooper(), this);
            this.f2932c = f2;
            if (f2 instanceof SimpleClientAdapter) {
                this.f2933d = ((SimpleClientAdapter) f2).i();
            } else {
                this.f2933d = f2;
            }
            this.f2934e = googleApi.j();
            this.f2935f = new zaab();
            this.i = googleApi.e();
            if (this.f2932c.requiresSignIn()) {
                this.j = googleApi.h(GoogleApiManager.this.f2921e, GoogleApiManager.this.n);
            } else {
                this.j = null;
            }
        }

        private final void D(zab zab) {
            zab.d(this.f2935f, d());
            try {
                zab.c(this);
            } catch (DeadObjectException unused) {
                B(1);
                this.f2932c.disconnect();
            }
        }

        /* access modifiers changed from: private */
        public final boolean E(boolean z) {
            Preconditions.d(GoogleApiManager.this.n);
            if (!this.f2932c.isConnected() || this.h.size() != 0) {
                return false;
            }
            if (this.f2935f.e()) {
                if (z) {
                    y();
                }
                return false;
            }
            this.f2932c.disconnect();
            return true;
        }

        private final boolean K(ConnectionResult connectionResult) {
            synchronized (GoogleApiManager.q) {
                if (GoogleApiManager.this.k == null || !GoogleApiManager.this.l.contains(this.f2934e)) {
                    return false;
                }
                GoogleApiManager.this.k.n(connectionResult, this.i);
                return true;
            }
        }

        private final void L(ConnectionResult connectionResult) {
            for (zak next : this.g) {
                String str = null;
                if (Objects.a(connectionResult, ConnectionResult.f2841f)) {
                    str = this.f2932c.getEndpointPackageName();
                }
                next.b(this.f2934e, connectionResult, str);
            }
            this.g.clear();
        }

        private final Feature f(Feature[] featureArr) {
            if (!(featureArr == null || featureArr.length == 0)) {
                Feature[] availableFeatures = this.f2932c.getAvailableFeatures();
                if (availableFeatures == null) {
                    availableFeatures = new Feature[0];
                }
                a.e.a aVar = new a.e.a(availableFeatures.length);
                for (Feature feature : availableFeatures) {
                    aVar.put(feature.u(), Long.valueOf(feature.v()));
                }
                for (Feature feature2 : featureArr) {
                    if (!aVar.containsKey(feature2.u()) || ((Long) aVar.get(feature2.u())).longValue() < feature2.v()) {
                        return feature2;
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: private */
        public final void h(a aVar) {
            if (!this.l.contains(aVar) || this.k) {
                return;
            }
            if (!this.f2932c.isConnected()) {
                a();
            } else {
                s();
            }
        }

        /* access modifiers changed from: private */
        public final void o(a aVar) {
            Feature[] g2;
            if (this.l.remove(aVar)) {
                GoogleApiManager.this.n.removeMessages(15, aVar);
                GoogleApiManager.this.n.removeMessages(16, aVar);
                Feature b2 = aVar.f2924b;
                ArrayList arrayList = new ArrayList(this.f2931b.size());
                for (zab zab : this.f2931b) {
                    if ((zab instanceof zac) && (g2 = ((zac) zab).g(this)) != null && ArrayUtils.b(g2, b2)) {
                        arrayList.add(zab);
                    }
                }
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    zab zab2 = (zab) obj;
                    this.f2931b.remove(zab2);
                    zab2.e(new UnsupportedApiCallException(b2));
                }
            }
        }

        private final boolean p(zab zab) {
            if (!(zab instanceof zac)) {
                D(zab);
                return true;
            }
            zac zac = (zac) zab;
            Feature f2 = f(zac.g(this));
            if (f2 == null) {
                D(zab);
                return true;
            } else if (zac.h(this)) {
                a aVar = new a(this.f2934e, f2, (u) null);
                int indexOf = this.l.indexOf(aVar);
                if (indexOf >= 0) {
                    a aVar2 = this.l.get(indexOf);
                    GoogleApiManager.this.n.removeMessages(15, aVar2);
                    GoogleApiManager.this.n.sendMessageDelayed(Message.obtain(GoogleApiManager.this.n, 15, aVar2), GoogleApiManager.this.f2918b);
                    return false;
                }
                this.l.add(aVar);
                GoogleApiManager.this.n.sendMessageDelayed(Message.obtain(GoogleApiManager.this.n, 15, aVar), GoogleApiManager.this.f2918b);
                GoogleApiManager.this.n.sendMessageDelayed(Message.obtain(GoogleApiManager.this.n, 16, aVar), GoogleApiManager.this.f2919c);
                ConnectionResult connectionResult = new ConnectionResult(2, (PendingIntent) null);
                if (K(connectionResult)) {
                    return false;
                }
                GoogleApiManager.this.r(connectionResult, this.i);
                return false;
            } else {
                zac.e(new UnsupportedApiCallException(f2));
                return false;
            }
        }

        /* access modifiers changed from: private */
        public final void q() {
            v();
            L(ConnectionResult.f2841f);
            x();
            Iterator<zabw> it = this.h.values().iterator();
            while (it.hasNext()) {
                zabw next = it.next();
                if (f(next.f3050a.c()) != null) {
                    it.remove();
                } else {
                    try {
                        next.f3050a.d(this.f2933d, new TaskCompletionSource());
                    } catch (DeadObjectException unused) {
                        B(1);
                        this.f2932c.disconnect();
                    } catch (RemoteException unused2) {
                        it.remove();
                    }
                }
            }
            s();
            y();
        }

        /* access modifiers changed from: private */
        public final void r() {
            v();
            this.k = true;
            this.f2935f.g();
            GoogleApiManager.this.n.sendMessageDelayed(Message.obtain(GoogleApiManager.this.n, 9, this.f2934e), GoogleApiManager.this.f2918b);
            GoogleApiManager.this.n.sendMessageDelayed(Message.obtain(GoogleApiManager.this.n, 11, this.f2934e), GoogleApiManager.this.f2919c);
            GoogleApiManager.this.g.a();
        }

        private final void s() {
            ArrayList arrayList = new ArrayList(this.f2931b);
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                zab zab = (zab) obj;
                if (!this.f2932c.isConnected()) {
                    return;
                }
                if (p(zab)) {
                    this.f2931b.remove(zab);
                }
            }
        }

        private final void x() {
            if (this.k) {
                GoogleApiManager.this.n.removeMessages(11, this.f2934e);
                GoogleApiManager.this.n.removeMessages(9, this.f2934e);
                this.k = false;
            }
        }

        private final void y() {
            GoogleApiManager.this.n.removeMessages(12, this.f2934e);
            GoogleApiManager.this.n.sendMessageDelayed(GoogleApiManager.this.n.obtainMessage(12, this.f2934e), GoogleApiManager.this.f2920d);
        }

        /* access modifiers changed from: package-private */
        public final zad A() {
            zace zace = this.j;
            if (zace == null) {
                return null;
            }
            return zace.Y2();
        }

        public final void B(int i2) {
            if (Looper.myLooper() == GoogleApiManager.this.n.getLooper()) {
                r();
            } else {
                GoogleApiManager.this.n.post(new w(this));
            }
        }

        public final void C(Status status) {
            Preconditions.d(GoogleApiManager.this.n);
            for (zab b2 : this.f2931b) {
                b2.b(status);
            }
            this.f2931b.clear();
        }

        public final void H(Bundle bundle) {
            if (Looper.myLooper() == GoogleApiManager.this.n.getLooper()) {
                q();
            } else {
                GoogleApiManager.this.n.post(new v(this));
            }
        }

        public final void J(ConnectionResult connectionResult) {
            Preconditions.d(GoogleApiManager.this.n);
            this.f2932c.disconnect();
            h0(connectionResult);
        }

        public final void V(ConnectionResult connectionResult, Api<?> api, boolean z) {
            if (Looper.myLooper() == GoogleApiManager.this.n.getLooper()) {
                h0(connectionResult);
            } else {
                GoogleApiManager.this.n.post(new x(this, connectionResult));
            }
        }

        public final void a() {
            Preconditions.d(GoogleApiManager.this.n);
            if (!this.f2932c.isConnected() && !this.f2932c.isConnecting()) {
                int b2 = GoogleApiManager.this.g.b(GoogleApiManager.this.f2921e, this.f2932c);
                if (b2 != 0) {
                    h0(new ConnectionResult(b2, (PendingIntent) null));
                    return;
                }
                b bVar = new b(this.f2932c, this.f2934e);
                if (this.f2932c.requiresSignIn()) {
                    this.j.d2(bVar);
                }
                this.f2932c.connect(bVar);
            }
        }

        public final int b() {
            return this.i;
        }

        /* access modifiers changed from: package-private */
        public final boolean c() {
            return this.f2932c.isConnected();
        }

        public final boolean d() {
            return this.f2932c.requiresSignIn();
        }

        public final void e() {
            Preconditions.d(GoogleApiManager.this.n);
            if (this.k) {
                a();
            }
        }

        public final void h0(ConnectionResult connectionResult) {
            Preconditions.d(GoogleApiManager.this.n);
            zace zace = this.j;
            if (zace != null) {
                zace.z3();
            }
            v();
            GoogleApiManager.this.g.a();
            L(connectionResult);
            if (connectionResult.u() == 4) {
                C(GoogleApiManager.p);
            } else if (this.f2931b.isEmpty()) {
                this.m = connectionResult;
            } else if (!K(connectionResult) && !GoogleApiManager.this.r(connectionResult, this.i)) {
                if (connectionResult.u() == 18) {
                    this.k = true;
                }
                if (this.k) {
                    GoogleApiManager.this.n.sendMessageDelayed(Message.obtain(GoogleApiManager.this.n, 9, this.f2934e), GoogleApiManager.this.f2918b);
                    return;
                }
                String c2 = this.f2934e.c();
                StringBuilder sb = new StringBuilder(String.valueOf(c2).length() + 38);
                sb.append("API: ");
                sb.append(c2);
                sb.append(" is not available on this device.");
                C(new Status(17, sb.toString()));
            }
        }

        public final void i(zab zab) {
            Preconditions.d(GoogleApiManager.this.n);
            if (!this.f2932c.isConnected()) {
                this.f2931b.add(zab);
                ConnectionResult connectionResult = this.m;
                if (connectionResult == null || !connectionResult.B()) {
                    a();
                } else {
                    h0(this.m);
                }
            } else if (p(zab)) {
                y();
            } else {
                this.f2931b.add(zab);
            }
        }

        public final void j(zak zak) {
            Preconditions.d(GoogleApiManager.this.n);
            this.g.add(zak);
        }

        public final Api.Client l() {
            return this.f2932c;
        }

        public final void m() {
            Status status;
            Preconditions.d(GoogleApiManager.this.n);
            if (this.k) {
                x();
                if (GoogleApiManager.this.f2922f.i(GoogleApiManager.this.f2921e) == 18) {
                    status = new Status(8, "Connection timed out while waiting for Google Play services update to complete.");
                } else {
                    status = new Status(8, "API failed to connect while resuming due to an unknown error.");
                }
                C(status);
                this.f2932c.disconnect();
            }
        }

        public final void t() {
            Preconditions.d(GoogleApiManager.this.n);
            C(GoogleApiManager.o);
            this.f2935f.f();
            for (ListenerHolder.ListenerKey zah : (ListenerHolder.ListenerKey[]) this.h.keySet().toArray(new ListenerHolder.ListenerKey[this.h.size()])) {
                i(new zah(zah, new TaskCompletionSource()));
            }
            L(new ConnectionResult(4));
            if (this.f2932c.isConnected()) {
                this.f2932c.onUserSignOut(new y(this));
            }
        }

        public final Map<ListenerHolder.ListenerKey<?>, zabw> u() {
            return this.h;
        }

        public final void v() {
            Preconditions.d(GoogleApiManager.this.n);
            this.m = null;
        }

        public final ConnectionResult w() {
            Preconditions.d(GoogleApiManager.this.n);
            return this.m;
        }

        public final boolean z() {
            return E(true);
        }
    }

    @KeepForSdk
    private GoogleApiManager(Context context, Looper looper, GoogleApiAvailability googleApiAvailability) {
        this.f2921e = context;
        this.n = new zap(looper, this);
        this.f2922f = googleApiAvailability;
        this.g = new GoogleApiAvailabilityCache(googleApiAvailability);
        Handler handler = this.n;
        handler.sendMessage(handler.obtainMessage(6));
    }

    public static GoogleApiManager j(Context context) {
        GoogleApiManager googleApiManager;
        synchronized (q) {
            if (r == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                r = new GoogleApiManager(context.getApplicationContext(), handlerThread.getLooper(), GoogleApiAvailability.q());
            }
            googleApiManager = r;
        }
        return googleApiManager;
    }

    private final void k(GoogleApi<?> googleApi) {
        zai<?> j2 = googleApi.j();
        zaa zaa2 = this.j.get(j2);
        if (zaa2 == null) {
            zaa2 = new zaa(googleApi);
            this.j.put(j2, zaa2);
        }
        if (zaa2.d()) {
            this.m.add(j2);
        }
        zaa2.a();
    }

    public static GoogleApiManager m() {
        GoogleApiManager googleApiManager;
        synchronized (q) {
            Preconditions.l(r, "Must guarantee manager is non-null before using getInstance");
            googleApiManager = r;
        }
        return googleApiManager;
    }

    /* access modifiers changed from: package-private */
    public final PendingIntent a(zai<?> zai, int i2) {
        zad A;
        zaa zaa2 = this.j.get(zai);
        if (zaa2 == null || (A = zaa2.A()) == null) {
            return null;
        }
        return PendingIntent.getActivity(this.f2921e, i2, A.getSignInIntent(), 134217728);
    }

    public final Task<Map<zai<?>, String>> c(Iterable<? extends GoogleApi<?>> iterable) {
        zak zak = new zak(iterable);
        Handler handler = this.n;
        handler.sendMessage(handler.obtainMessage(2, zak));
        return zak.a();
    }

    public final void d(ConnectionResult connectionResult, int i2) {
        if (!r(connectionResult, i2)) {
            Handler handler = this.n;
            handler.sendMessage(handler.obtainMessage(5, i2, 0, connectionResult));
        }
    }

    public final void e(GoogleApi<?> googleApi) {
        Handler handler = this.n;
        handler.sendMessage(handler.obtainMessage(7, googleApi));
    }

    public final <O extends Api.ApiOptions> void f(GoogleApi<O> googleApi, int i2, BaseImplementation.ApiMethodImpl<? extends Result, Api.AnyClient> apiMethodImpl) {
        zae zae = new zae(i2, apiMethodImpl);
        Handler handler = this.n;
        handler.sendMessage(handler.obtainMessage(4, new zabv(zae, this.i.get(), googleApi)));
    }

    public final <O extends Api.ApiOptions, ResultT> void g(GoogleApi<O> googleApi, int i2, TaskApiCall<Api.AnyClient, ResultT> taskApiCall, TaskCompletionSource<ResultT> taskCompletionSource, StatusExceptionMapper statusExceptionMapper) {
        zag zag = new zag(i2, taskApiCall, taskCompletionSource, statusExceptionMapper);
        Handler handler = this.n;
        handler.sendMessage(handler.obtainMessage(4, new zabv(zag, this.i.get(), googleApi)));
    }

    public final void h(zaae zaae) {
        synchronized (q) {
            if (this.k != zaae) {
                this.k = zaae;
                this.l.clear();
            }
            this.l.addAll(zaae.q());
        }
    }

    public boolean handleMessage(Message message) {
        int i2 = message.what;
        long j2 = 300000;
        zaa zaa2 = null;
        switch (i2) {
            case 1:
                if (((Boolean) message.obj).booleanValue()) {
                    j2 = 10000;
                }
                this.f2920d = j2;
                this.n.removeMessages(12);
                for (zai<?> obtainMessage : this.j.keySet()) {
                    Handler handler = this.n;
                    handler.sendMessageDelayed(handler.obtainMessage(12, obtainMessage), this.f2920d);
                }
                break;
            case 2:
                zak zak = (zak) message.obj;
                Iterator<zai<?>> it = zak.c().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        zai next = it.next();
                        zaa zaa3 = this.j.get(next);
                        if (zaa3 == null) {
                            zak.b(next, new ConnectionResult(13), (String) null);
                            break;
                        } else if (zaa3.c()) {
                            zak.b(next, ConnectionResult.f2841f, zaa3.l().getEndpointPackageName());
                        } else if (zaa3.w() != null) {
                            zak.b(next, zaa3.w(), (String) null);
                        } else {
                            zaa3.j(zak);
                            zaa3.a();
                        }
                    }
                }
            case 3:
                for (zaa next2 : this.j.values()) {
                    next2.v();
                    next2.a();
                }
                break;
            case 4:
            case 8:
            case 13:
                zabv zabv = (zabv) message.obj;
                zaa zaa4 = this.j.get(zabv.f3049c.j());
                if (zaa4 == null) {
                    k(zabv.f3049c);
                    zaa4 = this.j.get(zabv.f3049c.j());
                }
                if (zaa4.d() && this.i.get() != zabv.f3048b) {
                    zabv.f3047a.b(o);
                    zaa4.t();
                    break;
                } else {
                    zaa4.i(zabv.f3047a);
                    break;
                }
                break;
            case 5:
                int i3 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator<zaa<?>> it2 = this.j.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        zaa next3 = it2.next();
                        if (next3.b() == i3) {
                            zaa2 = next3;
                        }
                    }
                }
                if (zaa2 == null) {
                    StringBuilder sb = new StringBuilder(76);
                    sb.append("Could not find API instance ");
                    sb.append(i3);
                    sb.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb.toString(), new Exception());
                    break;
                } else {
                    String g2 = this.f2922f.g(connectionResult.u());
                    String v = connectionResult.v();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(g2).length() + 69 + String.valueOf(v).length());
                    sb2.append("Error resolution was canceled by the user, original error message: ");
                    sb2.append(g2);
                    sb2.append(": ");
                    sb2.append(v);
                    zaa2.C(new Status(17, sb2.toString()));
                    break;
                }
            case 6:
                if (PlatformVersion.a() && (this.f2921e.getApplicationContext() instanceof Application)) {
                    BackgroundDetector.c((Application) this.f2921e.getApplicationContext());
                    BackgroundDetector.b().a(new u(this));
                    if (!BackgroundDetector.b().f(true)) {
                        this.f2920d = 300000;
                        break;
                    }
                }
                break;
            case 7:
                k((GoogleApi) message.obj);
                break;
            case 9:
                if (this.j.containsKey(message.obj)) {
                    this.j.get(message.obj).e();
                    break;
                }
                break;
            case 10:
                for (zai<?> remove : this.m) {
                    this.j.remove(remove).t();
                }
                this.m.clear();
                break;
            case 11:
                if (this.j.containsKey(message.obj)) {
                    this.j.get(message.obj).m();
                    break;
                }
                break;
            case 12:
                if (this.j.containsKey(message.obj)) {
                    this.j.get(message.obj).z();
                    break;
                }
                break;
            case 14:
                d dVar = (d) message.obj;
                zai<?> b2 = dVar.b();
                if (this.j.containsKey(b2)) {
                    dVar.a().c(Boolean.valueOf(this.j.get(b2).E(false)));
                    break;
                } else {
                    dVar.a().c(Boolean.FALSE);
                    break;
                }
            case 15:
                a aVar = (a) message.obj;
                if (this.j.containsKey(aVar.f2923a)) {
                    this.j.get(aVar.f2923a).h(aVar);
                    break;
                }
                break;
            case 16:
                a aVar2 = (a) message.obj;
                if (this.j.containsKey(aVar2.f2923a)) {
                    this.j.get(aVar2.f2923a).o(aVar2);
                    break;
                }
                break;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i2);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void l(zaae zaae) {
        synchronized (q) {
            if (this.k == zaae) {
                this.k = null;
                this.l.clear();
            }
        }
    }

    public final int n() {
        return this.h.getAndIncrement();
    }

    /* access modifiers changed from: package-private */
    public final boolean r(ConnectionResult connectionResult, int i2) {
        return this.f2922f.A(this.f2921e, connectionResult, i2);
    }

    public final void z() {
        Handler handler = this.n;
        handler.sendMessage(handler.obtainMessage(3));
    }

    private static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final zai<?> f2923a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final Feature f2924b;

        private a(zai<?> zai, Feature feature) {
            this.f2923a = zai;
            this.f2924b = feature;
        }

        public final boolean equals(Object obj) {
            if (obj != null && (obj instanceof a)) {
                a aVar = (a) obj;
                if (!Objects.a(this.f2923a, aVar.f2923a) || !Objects.a(this.f2924b, aVar.f2924b)) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Objects.b(this.f2923a, this.f2924b);
        }

        public final String toString() {
            Objects.ToStringHelper c2 = Objects.c(this);
            c2.a("key", this.f2923a);
            c2.a("feature", this.f2924b);
            return c2.toString();
        }

        /* synthetic */ a(zai zai, Feature feature, u uVar) {
            this(zai, feature);
        }
    }
}
