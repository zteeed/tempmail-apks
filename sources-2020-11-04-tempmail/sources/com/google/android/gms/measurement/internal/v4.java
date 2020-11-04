package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzlr;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final /* synthetic */ class v4 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final zzhc f10464b;

    /* renamed from: c  reason: collision with root package name */
    private final Bundle f10465c;

    v4(zzhc zzhc, Bundle bundle) {
        this.f10464b = zzhc;
        this.f10465c = bundle;
    }

    public final void run() {
        zzhc zzhc = this.f10464b;
        Bundle bundle = this.f10465c;
        if (zzlr.b() && zzhc.l().t(zzaq.N0)) {
            if (bundle == null) {
                zzhc.k().C.b(new Bundle());
                return;
            }
            Bundle a2 = zzhc.k().C.a();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                    zzhc.j();
                    if (zzkr.c0(obj)) {
                        zzhc.j().J(27, (String) null, (String) null, 0);
                    }
                    zzhc.h().L().c("Invalid default event parameter type. Name, value", str, obj);
                } else if (zzkr.C0(str)) {
                    zzhc.h().L().b("Invalid default event parameter name. Name", str);
                } else if (obj == null) {
                    a2.remove(str);
                } else if (zzhc.j().h0("param", str, 100, obj)) {
                    zzhc.j().N(a2, str, obj);
                }
            }
            zzhc.j();
            if (zzkr.a0(a2, zzhc.l().A())) {
                zzhc.j().J(26, (String) null, (String) null, 0);
                zzhc.h().L().a("Too many default event parameters set. Discarding beyond event parameter limit");
            }
            zzhc.k().C.b(a2);
            zzhc.s().G(a2);
        }
    }
}
