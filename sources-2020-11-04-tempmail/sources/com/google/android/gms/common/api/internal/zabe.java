package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zad;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

public final class zabe implements zabs, zar {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Lock f3038b;

    /* renamed from: c  reason: collision with root package name */
    private final Condition f3039c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f3040d;

    /* renamed from: e  reason: collision with root package name */
    private final GoogleApiAvailabilityLight f3041e;

    /* renamed from: f  reason: collision with root package name */
    private final t f3042f;
    final Map<Api.AnyClientKey<?>, Api.Client> g;
    final Map<Api.AnyClientKey<?>, ConnectionResult> h = new HashMap();
    private final ClientSettings i;
    private final Map<Api<?>, Boolean> j;
    private final Api.AbstractClientBuilder<? extends zad, SignInOptions> k;
    /* access modifiers changed from: private */
    public volatile zabd l;
    private ConnectionResult m;
    int n;
    final zaaw o;
    final zabt p;

    public zabe(Context context, zaaw zaaw, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map<Api.AnyClientKey<?>, Api.Client> map, ClientSettings clientSettings, Map<Api<?>, Boolean> map2, Api.AbstractClientBuilder<? extends zad, SignInOptions> abstractClientBuilder, ArrayList<zaq> arrayList, zabt zabt) {
        this.f3040d = context;
        this.f3038b = lock;
        this.f3041e = googleApiAvailabilityLight;
        this.g = map;
        this.i = clientSettings;
        this.j = map2;
        this.k = abstractClientBuilder;
        this.o = zaaw;
        this.p = zabt;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            zaq zaq = arrayList.get(i2);
            i2++;
            zaq.a(this);
        }
        this.f3042f = new t(this, looper);
        this.f3039c = lock.newCondition();
        this.l = new zaav(this);
    }

    public final void B(int i2) {
        this.f3038b.lock();
        try {
            this.l.B(i2);
        } finally {
            this.f3038b.unlock();
        }
    }

    public final void H(Bundle bundle) {
        this.f3038b.lock();
        try {
            this.l.H(bundle);
        } finally {
            this.f3038b.unlock();
        }
    }

    public final void V(ConnectionResult connectionResult, Api<?> api, boolean z) {
        this.f3038b.lock();
        try {
            this.l.V(connectionResult, api, z);
        } finally {
            this.f3038b.unlock();
        }
    }

    @GuardedBy("mLock")
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T W(T t) {
        t.q();
        return this.l.W(t);
    }

    @GuardedBy("mLock")
    public final void a() {
        if (b()) {
            ((zaah) this.l).b();
        }
    }

    public final boolean b() {
        return this.l instanceof zaah;
    }

    @GuardedBy("mLock")
    public final void connect() {
        this.l.connect();
    }

    /* access modifiers changed from: package-private */
    public final void d(s sVar) {
        this.f3042f.sendMessage(this.f3042f.obtainMessage(1, sVar));
    }

    @GuardedBy("mLock")
    public final void disconnect() {
        if (this.l.disconnect()) {
            this.h.clear();
        }
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append(str).append("mState=").println(this.l);
        for (Api next : this.j.keySet()) {
            printWriter.append(str).append(next.b()).println(":");
            this.g.get(next.a()).dump(concat, fileDescriptor, printWriter, strArr);
        }
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        this.f3038b.lock();
        try {
            this.l = new zaak(this, this.i, this.j, this.f3041e, this.k, this.f3038b, this.f3040d);
            this.l.X();
            this.f3039c.signalAll();
        } finally {
            this.f3038b.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    public final void g(RuntimeException runtimeException) {
        this.f3042f.sendMessage(this.f3042f.obtainMessage(2, runtimeException));
    }

    /* access modifiers changed from: package-private */
    public final void h() {
        this.f3038b.lock();
        try {
            this.o.p();
            this.l = new zaah(this);
            this.l.X();
            this.f3039c.signalAll();
        } finally {
            this.f3038b.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    public final void i(ConnectionResult connectionResult) {
        this.f3038b.lock();
        try {
            this.m = connectionResult;
            this.l = new zaav(this);
            this.l.X();
            this.f3039c.signalAll();
        } finally {
            this.f3038b.unlock();
        }
    }
}
