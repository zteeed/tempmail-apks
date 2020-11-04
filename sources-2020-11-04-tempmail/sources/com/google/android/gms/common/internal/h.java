package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.HashSet;
import java.util.Set;

final class h implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    private final Set<ServiceConnection> f3236a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    private int f3237b = 2;

    /* renamed from: c  reason: collision with root package name */
    private boolean f3238c;

    /* renamed from: d  reason: collision with root package name */
    private IBinder f3239d;

    /* renamed from: e  reason: collision with root package name */
    private final GmsClientSupervisor.zza f3240e;

    /* renamed from: f  reason: collision with root package name */
    private ComponentName f3241f;
    private final /* synthetic */ g g;

    public h(g gVar, GmsClientSupervisor.zza zza) {
        this.g = gVar;
        this.f3240e = zza;
    }

    public final IBinder a() {
        return this.f3239d;
    }

    public final ComponentName b() {
        return this.f3241f;
    }

    public final int c() {
        return this.f3237b;
    }

    public final boolean d() {
        return this.f3238c;
    }

    public final void e(ServiceConnection serviceConnection, String str) {
        ConnectionTracker unused = this.g.g;
        Context unused2 = this.g.f3234e;
        this.f3240e.c(this.g.f3234e);
        this.f3236a.add(serviceConnection);
    }

    public final boolean f(ServiceConnection serviceConnection) {
        return this.f3236a.contains(serviceConnection);
    }

    public final void g(ServiceConnection serviceConnection, String str) {
        ConnectionTracker unused = this.g.g;
        Context unused2 = this.g.f3234e;
        this.f3236a.remove(serviceConnection);
    }

    public final void h(String str) {
        this.f3237b = 3;
        boolean d2 = this.g.g.d(this.g.f3234e, str, this.f3240e.c(this.g.f3234e), this, this.f3240e.d());
        this.f3238c = d2;
        if (d2) {
            this.g.f3235f.sendMessageDelayed(this.g.f3235f.obtainMessage(1, this.f3240e), this.g.i);
            return;
        }
        this.f3237b = 2;
        try {
            this.g.g.c(this.g.f3234e, this);
        } catch (IllegalArgumentException unused) {
        }
    }

    public final void i(String str) {
        this.g.f3235f.removeMessages(1, this.f3240e);
        this.g.g.c(this.g.f3234e, this);
        this.f3238c = false;
        this.f3237b = 2;
    }

    public final boolean j() {
        return this.f3236a.isEmpty();
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.g.f3233d) {
            this.g.f3235f.removeMessages(1, this.f3240e);
            this.f3239d = iBinder;
            this.f3241f = componentName;
            for (ServiceConnection onServiceConnected : this.f3236a) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.f3237b = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.g.f3233d) {
            this.g.f3235f.removeMessages(1, this.f3240e);
            this.f3239d = null;
            this.f3241f = componentName;
            for (ServiceConnection onServiceDisconnected : this.f3236a) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.f3237b = 2;
        }
    }
}
