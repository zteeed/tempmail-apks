package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
class o3 extends BroadcastReceiver {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final zzkj f10148a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f10149b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f10150c;

    static {
        Class<o3> cls = o3.class;
    }

    o3(zzkj zzkj) {
        Preconditions.k(zzkj);
        this.f10148a = zzkj;
    }

    public final void b() {
        this.f10148a.c0();
        this.f10148a.g().c();
        if (!this.f10149b) {
            this.f10148a.f().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f10150c = this.f10148a.T().y();
            this.f10148a.h().O().b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f10150c));
            this.f10149b = true;
        }
    }

    public final void c() {
        this.f10148a.c0();
        this.f10148a.g().c();
        this.f10148a.g().c();
        if (this.f10149b) {
            this.f10148a.h().O().a("Unregistering connectivity change receiver");
            this.f10149b = false;
            this.f10150c = false;
            try {
                this.f10148a.f().unregisterReceiver(this);
            } catch (IllegalArgumentException e2) {
                this.f10148a.h().G().b("Failed to unregister the network broadcast receiver", e2);
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        this.f10148a.c0();
        String action = intent.getAction();
        this.f10148a.h().O().b("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean y = this.f10148a.T().y();
            if (this.f10150c != y) {
                this.f10150c = y;
                this.f10148a.g().z(new r3(this, y));
                return;
            }
            return;
        }
        this.f10148a.h().J().b("NetworkBroadcastReceiver received unknown action", action);
    }
}
