package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.common.zze;
import java.util.HashMap;
import javax.annotation.concurrent.GuardedBy;

final class g extends GmsClientSupervisor implements Handler.Callback {
    /* access modifiers changed from: private */
    @GuardedBy("mConnectionStatus")

    /* renamed from: d  reason: collision with root package name */
    public final HashMap<GmsClientSupervisor.zza, h> f3050d = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final Context f3051e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final Handler f3052f;
    /* access modifiers changed from: private */
    public final ConnectionTracker g;
    private final long h;
    /* access modifiers changed from: private */
    public final long i;

    g(Context context) {
        this.f3051e = context.getApplicationContext();
        this.f3052f = new zze(context.getMainLooper(), this);
        this.g = ConnectionTracker.b();
        this.h = 5000;
        this.i = 300000;
    }

    /* access modifiers changed from: protected */
    public final boolean c(GmsClientSupervisor.zza zza, ServiceConnection serviceConnection, String str) {
        boolean d2;
        Preconditions.l(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f3050d) {
            h hVar = this.f3050d.get(zza);
            if (hVar == null) {
                hVar = new h(this, zza);
                hVar.e(serviceConnection, str);
                hVar.h(str);
                this.f3050d.put(zza, hVar);
            } else {
                this.f3052f.removeMessages(0, zza);
                if (!hVar.f(serviceConnection)) {
                    hVar.e(serviceConnection, str);
                    int c2 = hVar.c();
                    if (c2 == 1) {
                        serviceConnection.onServiceConnected(hVar.b(), hVar.a());
                    } else if (c2 == 2) {
                        hVar.h(str);
                    }
                } else {
                    String valueOf = String.valueOf(zza);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            }
            d2 = hVar.d();
        }
        return d2;
    }

    /* access modifiers changed from: protected */
    public final void d(GmsClientSupervisor.zza zza, ServiceConnection serviceConnection, String str) {
        Preconditions.l(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f3050d) {
            h hVar = this.f3050d.get(zza);
            if (hVar == null) {
                String valueOf = String.valueOf(zza);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            } else if (hVar.f(serviceConnection)) {
                hVar.g(serviceConnection, str);
                if (hVar.j()) {
                    this.f3052f.sendMessageDelayed(this.f3052f.obtainMessage(0, zza), this.h);
                }
            } else {
                String valueOf2 = String.valueOf(zza);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(valueOf2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            synchronized (this.f3050d) {
                GmsClientSupervisor.zza zza = (GmsClientSupervisor.zza) message.obj;
                h hVar = this.f3050d.get(zza);
                if (hVar != null && hVar.j()) {
                    if (hVar.d()) {
                        hVar.i("GmsClientSupervisor");
                    }
                    this.f3050d.remove(zza);
                }
            }
            return true;
        } else if (i2 != 1) {
            return false;
        } else {
            synchronized (this.f3050d) {
                GmsClientSupervisor.zza zza2 = (GmsClientSupervisor.zza) message.obj;
                h hVar2 = this.f3050d.get(zza2);
                if (hVar2 != null && hVar2.c() == 3) {
                    String valueOf = String.valueOf(zza2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName b2 = hVar2.b();
                    if (b2 == null) {
                        b2 = zza2.a();
                    }
                    if (b2 == null) {
                        b2 = new ComponentName(zza2.b(), "unknown");
                    }
                    hVar2.onServiceDisconnected(b2);
                }
            }
            return true;
        }
    }
}
