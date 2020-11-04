package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzkh;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class k7 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzjv f10283a;

    k7(zzjv zzjv) {
        this.f10283a = zzjv;
    }

    @VisibleForTesting
    private final void c(long j, boolean z) {
        this.f10283a.c();
        if (this.f10283a.f10357a.p()) {
            this.f10283a.k().u.b(j);
            this.f10283a.h().O().b("Session started, time", Long.valueOf(this.f10283a.n().b()));
            Long valueOf = Long.valueOf(j / 1000);
            this.f10283a.q().T("auto", "_sid", valueOf, j);
            this.f10283a.k().r.a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", valueOf.longValue());
            if (this.f10283a.l().t(zzaq.q0) && z) {
                bundle.putLong("_aib", 1);
            }
            this.f10283a.q().O("auto", "_s", j, bundle);
            if (zzkh.b() && this.f10283a.l().t(zzaq.v0)) {
                String a2 = this.f10283a.k().z.a();
                if (!TextUtils.isEmpty(a2)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_ffr", a2);
                    this.f10283a.q().O("auto", "_ssr", j, bundle2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f10283a.c();
        if (this.f10283a.k().w(this.f10283a.n().a())) {
            this.f10283a.k().r.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f10283a.h().O().a("Detected application was in foreground");
                c(this.f10283a.n().a(), false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(long j, boolean z) {
        this.f10283a.c();
        this.f10283a.G();
        if (this.f10283a.k().w(j)) {
            this.f10283a.k().r.a(true);
        }
        this.f10283a.k().u.b(j);
        if (this.f10283a.k().r.b()) {
            c(j, z);
        }
    }
}
