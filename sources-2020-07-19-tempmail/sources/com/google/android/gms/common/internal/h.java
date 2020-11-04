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
    private final Set<ServiceConnection> f3053a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    private int f3054b = 2;

    /* renamed from: c  reason: collision with root package name */
    private boolean f3055c;

    /* renamed from: d  reason: collision with root package name */
    private IBinder f3056d;

    /* renamed from: e  reason: collision with root package name */
    private final GmsClientSupervisor.zza f3057e;

    /* renamed from: f  reason: collision with root package name */
    private ComponentName f3058f;
    private final /* synthetic */ g g;

    public h(g gVar, GmsClientSupervisor.zza zza) {
        this.g = gVar;
        this.f3057e = zza;
    }

    public final IBinder a() {
        return this.f3056d;
    }

    public final ComponentName b() {
        return this.f3058f;
    }

    public final int c() {
        return this.f3054b;
    }

    public final boolean d() {
        return this.f3055c;
    }

    public final void e(ServiceConnection serviceConnection, String str) {
        ConnectionTracker unused = this.g.g;
        Context unused2 = this.g.f3051e;
        this.f3057e.c(this.g.f3051e);
        this.f3053a.add(serviceConnection);
    }

    public final boolean f(ServiceConnection serviceConnection) {
        return this.f3053a.contains(serviceConnection);
    }

    public final void g(ServiceConnection serviceConnection, String str) {
        ConnectionTracker unused = this.g.g;
        Context unused2 = this.g.f3051e;
        this.f3053a.remove(serviceConnection);
    }

    public final void h(String str) {
        this.f3054b = 3;
        boolean d2 = this.g.g.d(this.g.f3051e, str, this.f3057e.c(this.g.f3051e), this, this.f3057e.d());
        this.f3055c = d2;
        if (d2) {
            this.g.f3052f.sendMessageDelayed(this.g.f3052f.obtainMessage(1, this.f3057e), this.g.i);
            return;
        }
        this.f3054b = 2;
        try {
            this.g.g.c(this.g.f3051e, this);
        } catch (IllegalArgumentException unused) {
        }
    }

    public final void i(String str) {
        this.g.f3052f.removeMessages(1, this.f3057e);
        this.g.g.c(this.g.f3051e, this);
        this.f3055c = false;
        this.f3054b = 2;
    }

    public final boolean j() {
        return this.f3053a.isEmpty();
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.g.f3050d) {
            this.g.f3052f.removeMessages(1, this.f3057e);
            this.f3056d = iBinder;
            this.f3058f = componentName;
            for (ServiceConnection onServiceConnected : this.f3053a) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.f3054b = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.g.f3050d) {
            this.g.f3052f.removeMessages(1, this.f3057e);
            this.f3056d = null;
            this.f3058f = componentName;
            for (ServiceConnection onServiceDisconnected : this.f3053a) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.f3054b = 2;
        }
    }
}
