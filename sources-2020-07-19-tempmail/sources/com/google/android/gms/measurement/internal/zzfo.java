package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.internal.measurement.zzg;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzfo implements ServiceConnection {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final String f10439a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzfp f10440b;

    zzfo(zzfp zzfp, String str) {
        this.f10440b = zzfp;
        this.f10439a = str;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f10440b.f10441a.h().J().a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            zzd y = zzg.y(iBinder);
            if (y == null) {
                this.f10440b.f10441a.h().J().a("Install Referrer Service implementation was not found");
                return;
            }
            this.f10440b.f10441a.h().O().a("Install Referrer Service connected");
            this.f10440b.f10441a.g().z(new t3(this, y, this));
        } catch (Exception e2) {
            this.f10440b.f10441a.h().J().b("Exception occurred while calling Install Referrer API", e2);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f10440b.f10441a.h().O().a("Install Referrer Service disconnected");
    }
}
