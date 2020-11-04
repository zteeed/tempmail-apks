package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzla;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class a5 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ long f10097b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzhc f10098c;

    a5(zzhc zzhc, long j) {
        this.f10098c = zzhc;
        this.f10097b = j;
    }

    public final void run() {
        zzhc zzhc = this.f10098c;
        long j = this.f10097b;
        zzhc.c();
        zzhc.a();
        zzhc.y();
        zzhc.h().N().a("Resetting analytics data (FE)");
        zzjv v = zzhc.v();
        v.c();
        v.f10684e.a();
        boolean p = zzhc.f10357a.p();
        q3 k = zzhc.k();
        k.j.b(j);
        if (!TextUtils.isEmpty(k.k().z.a())) {
            k.z.b((String) null);
        }
        if (zzla.b() && k.l().t(zzaq.w0)) {
            k.u.b(0);
        }
        if (!k.l().H()) {
            k.A(!p);
        }
        k.A.b((String) null);
        k.B.b(0);
        k.C.b((Bundle) null);
        zzhc.s().Y();
        if (zzla.b() && zzhc.l().t(zzaq.w0)) {
            zzhc.v().f10683d.a();
        }
        zzhc.i = !p;
        this.f10098c.s().T(new AtomicReference());
    }
}
