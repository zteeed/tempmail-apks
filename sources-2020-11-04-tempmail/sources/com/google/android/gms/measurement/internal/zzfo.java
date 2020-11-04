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
    public final String f10625a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzfp f10626b;

    zzfo(zzfp zzfp, String str) {
        this.f10626b = zzfp;
        this.f10625a = str;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f10626b.f10627a.h().J().a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            zzd B = zzg.B(iBinder);
            if (B == null) {
                this.f10626b.f10627a.h().J().a("Install Referrer Service implementation was not found");
                return;
            }
            this.f10626b.f10627a.h().O().a("Install Referrer Service connected");
            this.f10626b.f10627a.g().z(new t3(this, B, this));
        } catch (Exception e2) {
            this.f10626b.f10627a.h().J().b("Exception occurred while calling Install Referrer API", e2);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f10626b.f10627a.h().O().a("Install Referrer Service disconnected");
    }
}
