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
    public final zzkj f10334a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f10335b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f10336c;

    static {
        Class<o3> cls = o3.class;
    }

    o3(zzkj zzkj) {
        Preconditions.k(zzkj);
        this.f10334a = zzkj;
    }

    public final void b() {
        this.f10334a.c0();
        this.f10334a.g().c();
        if (!this.f10335b) {
            this.f10334a.f().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f10336c = this.f10334a.T().y();
            this.f10334a.h().O().b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f10336c));
            this.f10335b = true;
        }
    }

    public final void c() {
        this.f10334a.c0();
        this.f10334a.g().c();
        this.f10334a.g().c();
        if (this.f10335b) {
            this.f10334a.h().O().a("Unregistering connectivity change receiver");
            this.f10335b = false;
            this.f10336c = false;
            try {
                this.f10334a.f().unregisterReceiver(this);
            } catch (IllegalArgumentException e2) {
                this.f10334a.h().G().b("Failed to unregister the network broadcast receiver", e2);
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        this.f10334a.c0();
        String action = intent.getAction();
        this.f10334a.h().O().b("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean y = this.f10334a.T().y();
            if (this.f10336c != y) {
                this.f10336c = y;
                this.f10334a.g().z(new r3(this, y));
                return;
            }
            return;
        }
        this.f10334a.h().J().b("NetworkBroadcastReceiver received unknown action", action);
    }
}
