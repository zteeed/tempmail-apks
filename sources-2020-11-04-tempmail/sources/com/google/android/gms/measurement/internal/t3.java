package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.internal.measurement.zzko;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class t3 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzd f10432b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ ServiceConnection f10433c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzfo f10434d;

    t3(zzfo zzfo, zzd zzd, ServiceConnection serviceConnection) {
        this.f10434d = zzfo;
        this.f10432b = zzd;
        this.f10433c = serviceConnection;
    }

    public final void run() {
        zzfo zzfo = this.f10434d;
        zzfp zzfp = zzfo.f10626b;
        String a2 = zzfo.f10625a;
        zzd zzd = this.f10432b;
        ServiceConnection serviceConnection = this.f10433c;
        Bundle a3 = zzfp.a(a2, zzd);
        zzfp.f10627a.g().c();
        if (a3 != null) {
            long j = a3.getLong("install_begin_timestamp_seconds", 0) * 1000;
            if (j == 0) {
                zzfp.f10627a.h().J().a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = a3.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    zzfp.f10627a.h().G().a("No referrer defined in Install Referrer response");
                } else {
                    zzfp.f10627a.h().O().b("InstallReferrer API result", string);
                    zzkr G = zzfp.f10627a.G();
                    String valueOf = String.valueOf(string);
                    Bundle A = G.A(Uri.parse(valueOf.length() != 0 ? "?".concat(valueOf) : new String("?")));
                    if (A == null) {
                        zzfp.f10627a.h().G().a("No campaign params defined in Install Referrer result");
                    } else {
                        String string2 = A.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j2 = a3.getLong("referrer_click_timestamp_seconds", 0) * 1000;
                            if (j2 == 0) {
                                zzfp.f10627a.h().G().a("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                A.putLong("click_timestamp", j2);
                            }
                        }
                        if (j == zzfp.f10627a.A().k.a()) {
                            zzfp.f10627a.m();
                            zzfp.f10627a.h().O().a("Install Referrer campaign has already been logged");
                        } else if (!zzko.b() || !zzfp.f10627a.x().t(zzaq.B0) || zzfp.f10627a.p()) {
                            zzfp.f10627a.A().k.b(j);
                            zzfp.f10627a.m();
                            zzfp.f10627a.h().O().b("Logging Install Referrer campaign from sdk with ", "referrer API");
                            A.putString("_cis", "referrer API");
                            zzfp.f10627a.F().R("auto", "_cmp", A);
                        }
                    }
                }
            }
        }
        if (serviceConnection != null) {
            ConnectionTracker.b().c(zzfp.f10627a.f(), serviceConnection);
        }
    }
}
