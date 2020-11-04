package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzq;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class hs implements Callable {

    /* renamed from: b  reason: collision with root package name */
    private final zzdbn f4173b;

    hs(zzdbn zzdbn) {
        this.f4173b = zzdbn;
    }

    public final Object call() {
        String str;
        String str2;
        String str3;
        zzq.zzkw();
        zzri A = zzq.zzla().r().A();
        Bundle bundle = null;
        if (!(A == null || A == null || (zzq.zzla().r().w() && zzq.zzla().r().q()))) {
            if (A.i()) {
                A.a();
            }
            zzrc g = A.g();
            if (g != null) {
                str2 = g.i();
                str = g.j();
                str3 = g.k();
                if (str2 != null) {
                    zzq.zzla().r().m(str2);
                }
                if (str3 != null) {
                    zzq.zzla().r().B(str3);
                }
            } else {
                str2 = zzq.zzla().r().t();
                str3 = zzq.zzla().r().n();
                str = null;
            }
            Bundle bundle2 = new Bundle(1);
            if (!zzq.zzla().r().q()) {
                if (str3 == null || TextUtils.isEmpty(str3)) {
                    bundle2.putString("v_fp_vertical", "no_hash");
                } else {
                    bundle2.putString("v_fp_vertical", str3);
                }
            }
            if (str2 != null && !zzq.zzla().r().w()) {
                bundle2.putString("fingerprint", str2);
                if (!str2.equals(str)) {
                    bundle2.putString("v_fp", str);
                }
            }
            if (!bundle2.isEmpty()) {
                bundle = bundle2;
            }
        }
        return new zzdbo(bundle);
    }
}
