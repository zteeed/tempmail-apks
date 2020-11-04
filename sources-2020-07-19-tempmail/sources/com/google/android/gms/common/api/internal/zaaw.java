package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClientEventManager;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zad;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

public final class zaaw extends GoogleApiClient implements zabt {

    /* renamed from: a  reason: collision with root package name */
    private final Lock f2844a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f2845b;

    /* renamed from: c  reason: collision with root package name */
    private final GmsClientEventManager f2846c;

    /* renamed from: d  reason: collision with root package name */
    private zabs f2847d;

    /* renamed from: e  reason: collision with root package name */
    private final int f2848e;

    /* renamed from: f  reason: collision with root package name */
    private final Context f2849f;
    private final Looper g;
    @VisibleForTesting
    final Queue<BaseImplementation.ApiMethodImpl<?, ?>> h;
    private volatile boolean i;
    private long j;
    private long k;
    private final q l;
    private final GoogleApiAvailability m;
    @VisibleForTesting
    private zabq n;
    final Map<Api.AnyClientKey<?>, Api.Client> o;
    Set<Scope> p;
    private final ClientSettings q;
    private final Map<Api<?>, Boolean> r;
    private final Api.AbstractClientBuilder<? extends zad, SignInOptions> s;
    private final ListenerHolders t;
    private final ArrayList<zaq> u;
    private Integer v;
    Set<zacm> w;
    final zacp x;

    /* access modifiers changed from: private */
    public final void l() {
        this.f2844a.lock();
        try {
            if (this.i) {
                o();
            }
        } finally {
            this.f2844a.unlock();
        }
    }

    public static int m(Iterable<Api.Client> iterable, boolean z) {
        boolean z2 = false;
        boolean z3 = false;
        for (Api.Client next : iterable) {
            if (next.requiresSignIn()) {
                z2 = true;
            }
            if (next.providesSignIn()) {
                z3 = true;
            }
        }
        if (!z2) {
            return 3;
        }
        if (!z3 || !z) {
            return 1;
        }
        return 2;
    }

    @GuardedBy("mLock")
    private final void o() {
        this.f2846c.b();
        this.f2847d.connect();
    }

    private final void s(int i2) {
        Integer num = this.v;
        if (num == null) {
            this.v = Integer.valueOf(i2);
        } else if (num.intValue() != i2) {
            String t2 = t(i2);
            String t3 = t(this.v.intValue());
            StringBuilder sb = new StringBuilder(String.valueOf(t2).length() + 51 + String.valueOf(t3).length());
            sb.append("Cannot use sign-in mode: ");
            sb.append(t2);
            sb.append(". Mode was already set to ");
            sb.append(t3);
            throw new IllegalStateException(sb.toString());
        }
        if (this.f2847d == null) {
            boolean z = false;
            boolean z2 = false;
            for (Api.Client next : this.o.values()) {
                if (next.requiresSignIn()) {
                    z = true;
                }
                if (next.providesSignIn()) {
                    z2 = true;
                }
            }
            int intValue = this.v.intValue();
            if (intValue != 1) {
                if (intValue == 2 && z) {
                    if (this.f2845b) {
                        this.f2847d = new zax(this.f2849f, this.f2844a, this.g, this.m, this.o, this.q, this.r, this.s, this.u, this, true);
                        return;
                    }
                    this.f2847d = n0.c(this.f2849f, this, this.f2844a, this.g, this.m, this.o, this.q, this.r, this.s, this.u);
                    return;
                }
            } else if (!z) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            } else if (z2) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            if (!this.f2845b || z2) {
                this.f2847d = new zabe(this.f2849f, this, this.f2844a, this.g, this.m, this.o, this.q, this.r, this.s, this.u, this);
                return;
            }
            this.f2847d = new zax(this.f2849f, this.f2844a, this.g, this.m, this.o, this.q, this.r, this.s, this.u, this, false);
        }
    }

    private static String t(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    @GuardedBy("mLock")
    public final void a(ConnectionResult connectionResult) {
        if (!this.m.k(this.f2849f, connectionResult.u())) {
            p();
        }
        if (!this.i) {
            this.f2846c.c(connectionResult);
            this.f2846c.a();
        }
    }

    @GuardedBy("mLock")
    public final void b(Bundle bundle) {
        while (!this.h.isEmpty()) {
            j(this.h.remove());
        }
        this.f2846c.d(bundle);
    }

    @GuardedBy("mLock")
    public final void c(int i2, boolean z) {
        if (i2 == 1 && !z && !this.i) {
            this.i = true;
            if (this.n == null && !ClientLibraryUtils.b()) {
                this.n = this.m.v(this.f2849f.getApplicationContext(), new r(this));
            }
            q qVar = this.l;
            qVar.sendMessageDelayed(qVar.obtainMessage(1), this.j);
            q qVar2 = this.l;
            qVar2.sendMessageDelayed(qVar2.obtainMessage(2), this.k);
        }
        this.x.c();
        this.f2846c.e(i2);
        this.f2846c.a();
        if (i2 == 2) {
            o();
        }
    }

    public final void d() {
        this.f2844a.lock();
        try {
            boolean z = false;
            if (this.f2848e >= 0) {
                if (this.v != null) {
                    z = true;
                }
                Preconditions.o(z, "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.v == null) {
                this.v = Integer.valueOf(m(this.o.values(), false));
            } else if (this.v.intValue() == 2) {
                throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            i(this.v.intValue());
        } finally {
            this.f2844a.unlock();
        }
    }

    public final void e() {
        this.f2844a.lock();
        try {
            this.x.a();
            if (this.f2847d != null) {
                this.f2847d.disconnect();
            }
            this.t.a();
            for (BaseImplementation.ApiMethodImpl apiMethodImpl : this.h) {
                apiMethodImpl.l((h0) null);
                apiMethodImpl.b();
            }
            this.h.clear();
            if (this.f2847d != null) {
                p();
                this.f2846c.a();
                this.f2844a.unlock();
            }
        } finally {
            this.f2844a.unlock();
        }
    }

    public final void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("mContext=").println(this.f2849f);
        printWriter.append(str).append("mResuming=").print(this.i);
        printWriter.append(" mWorkQueue.size()=").print(this.h.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.x.f2878a.size());
        zabs zabs = this.f2847d;
        if (zabs != null) {
            zabs.dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void g(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f2846c.f(onConnectionFailedListener);
    }

    public final void h(zacm zacm) {
        this.f2844a.lock();
        try {
            if (this.w == null) {
                Log.wtf("GoogleApiClientImpl", "Attempted to remove pending transform when no transforms are registered.", new Exception());
            } else if (!this.w.remove(zacm)) {
                Log.wtf("GoogleApiClientImpl", "Failed to remove pending transform - this may lead to memory leaks!", new Exception());
            } else if (!q()) {
                this.f2847d.a();
            }
        } finally {
            this.f2844a.unlock();
        }
    }

    public final void i(int i2) {
        this.f2844a.lock();
        boolean z = true;
        if (!(i2 == 3 || i2 == 1 || i2 == 2)) {
            z = false;
        }
        try {
            StringBuilder sb = new StringBuilder(33);
            sb.append("Illegal sign-in mode: ");
            sb.append(i2);
            Preconditions.b(z, sb.toString());
            s(i2);
            o();
        } finally {
            this.f2844a.unlock();
        }
    }

    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T j(T t2) {
        Preconditions.b(t2.t() != null, "This task can not be executed (it's probably a Batch or malformed)");
        boolean containsKey = this.o.containsKey(t2.t());
        String b2 = t2.s() != null ? t2.s().b() : "the API";
        StringBuilder sb = new StringBuilder(String.valueOf(b2).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(b2);
        sb.append(" required for this call.");
        Preconditions.b(containsKey, sb.toString());
        this.f2844a.lock();
        try {
            if (this.f2847d == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            } else if (this.i) {
                this.h.add(t2);
                while (!this.h.isEmpty()) {
                    BaseImplementation.ApiMethodImpl remove = this.h.remove();
                    this.x.b(remove);
                    remove.x(Status.g);
                }
                return t2;
            } else {
                T Q = this.f2847d.Q(t2);
                this.f2844a.unlock();
                return Q;
            }
        } finally {
            this.f2844a.unlock();
        }
    }

    public final Looper k() {
        return this.g;
    }

    /* access modifiers changed from: package-private */
    @GuardedBy("mLock")
    public final boolean p() {
        if (!this.i) {
            return false;
        }
        this.i = false;
        this.l.removeMessages(2);
        this.l.removeMessages(1);
        zabq zabq = this.n;
        if (zabq != null) {
            zabq.a();
            this.n = null;
        }
        return true;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public final boolean q() {
        this.f2844a.lock();
        try {
            if (this.w == null) {
                this.f2844a.unlock();
                return false;
            }
            boolean z = !this.w.isEmpty();
            this.f2844a.unlock();
            return z;
        } catch (Throwable th) {
            this.f2844a.unlock();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public final String r() {
        StringWriter stringWriter = new StringWriter();
        f("", (FileDescriptor) null, new PrintWriter(stringWriter), (String[]) null);
        return stringWriter.toString();
    }
}
