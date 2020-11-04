package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzlr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
public final class zzgd extends zzep {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final zzkj f10642b;

    /* renamed from: c  reason: collision with root package name */
    private Boolean f10643c;

    /* renamed from: d  reason: collision with root package name */
    private String f10644d;

    public zzgd(zzkj zzkj) {
        this(zzkj, (String) null);
    }

    @VisibleForTesting
    private final void V(Runnable runnable) {
        Preconditions.k(runnable);
        if (this.f10642b.g().H()) {
            runnable.run();
        } else {
            this.f10642b.g().z(runnable);
        }
    }

    private final void g1(zzn zzn, boolean z) {
        Preconditions.k(zzn);
        h0(zzn.f10709b, false);
        this.f10642b.b0().i0(zzn.f10710c, zzn.s, zzn.w);
    }

    private final void h0(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.f10643c == null) {
                        if (!"com.google.android.gms".equals(this.f10644d) && !UidVerifier.a(this.f10642b.f(), Binder.getCallingUid())) {
                            if (!GoogleSignatureVerifier.a(this.f10642b.f()).c(Binder.getCallingUid())) {
                                z2 = false;
                                this.f10643c = Boolean.valueOf(z2);
                            }
                        }
                        z2 = true;
                        this.f10643c = Boolean.valueOf(z2);
                    }
                    if (this.f10643c.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e2) {
                    this.f10642b.h().G().b("Measurement Service called with invalid calling package. appId", zzeu.x(str));
                    throw e2;
                }
            }
            if (this.f10644d == null && GooglePlayServicesUtilLight.uidHasPackageName(this.f10642b.f(), Binder.getCallingUid(), str)) {
                this.f10644d = str;
            }
            if (!str.equals(this.f10644d)) {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[]{str}));
            }
            return;
        }
        this.f10642b.h().G().a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void H(zzn zzn, Bundle bundle) {
        this.f10642b.V().W(zzn.f10709b, bundle);
    }

    public final void K4(zzao zzao, String str, String str2) {
        Preconditions.k(zzao);
        Preconditions.g(str);
        h0(str, true);
        V(new k4(this, zzao, str));
    }

    public final List<zzkq> P3(String str, String str2, boolean z, zzn zzn) {
        g1(zzn, false);
        try {
            List<s7> list = (List) this.f10642b.g().w(new e4(this, zzn, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (s7 s7Var : list) {
                if (z || !zzkr.C0(s7Var.f10426c)) {
                    arrayList.add(new zzkq(s7Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e2) {
            this.f10642b.h().G().c("Failed to query user properties. appId", zzeu.x(zzn.f10709b), e2);
            return Collections.emptyList();
        }
    }

    public final List<zzkq> Q3(zzn zzn, boolean z) {
        g1(zzn, false);
        try {
            List<s7> list = (List) this.f10642b.g().w(new l4(this, zzn)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (s7 s7Var : list) {
                if (z || !zzkr.C0(s7Var.f10426c)) {
                    arrayList.add(new zzkq(s7Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e2) {
            this.f10642b.h().G().c("Failed to get user properties. appId", zzeu.x(zzn.f10709b), e2);
            return null;
        }
    }

    public final void S4(zzn zzn) {
        g1(zzn, false);
        V(new c4(this, zzn));
    }

    public final void T3(zzn zzn) {
        g1(zzn, false);
        V(new o4(this, zzn));
    }

    public final void Y5(Bundle bundle, zzn zzn) {
        if (zzlr.b() && this.f10642b.H().t(zzaq.O0)) {
            g1(zzn, false);
            V(new a4(this, zzn, bundle));
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final zzao a1(zzao zzao, zzn zzn) {
        zzan zzan;
        boolean z = false;
        if (!(!"_cmp".equals(zzao.f10563b) || (zzan = zzao.f10564c) == null || zzan.u() == 0)) {
            String K = zzao.f10564c.K("_cis");
            if (!TextUtils.isEmpty(K) && (("referrer broadcast".equals(K) || "referrer API".equals(K)) && this.f10642b.H().C(zzn.f10709b, zzaq.S))) {
                z = true;
            }
        }
        if (!z) {
            return zzao;
        }
        this.f10642b.h().M().b("Event has been filtered ", zzao.toString());
        return new zzao("_cmpx", zzao.f10564c, zzao.f10565d, zzao.f10566e);
    }

    public final void a3(long j, String str, String str2, String str3) {
        V(new n4(this, str2, str3, str, j));
    }

    public final byte[] f6(zzao zzao, String str) {
        Preconditions.g(str);
        Preconditions.k(zzao);
        h0(str, true);
        this.f10642b.h().N().b("Log and bundle. event", this.f10642b.a0().w(zzao.f10563b));
        long c2 = this.f10642b.n().c() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f10642b.g().B(new j4(this, zzao, str)).get();
            if (bArr == null) {
                this.f10642b.h().G().b("Log and bundle returned null. appId", zzeu.x(str));
                bArr = new byte[0];
            }
            this.f10642b.h().N().d("Log and bundle processed. event, size, time_ms", this.f10642b.a0().w(zzao.f10563b), Integer.valueOf(bArr.length), Long.valueOf((this.f10642b.n().c() / 1000000) - c2));
            return bArr;
        } catch (InterruptedException | ExecutionException e2) {
            this.f10642b.h().G().d("Failed to log and bundle. appId, event, error", zzeu.x(str), this.f10642b.a0().w(zzao.f10563b), e2);
            return null;
        }
    }

    public final void i3(zzn zzn) {
        h0(zzn.f10709b, false);
        V(new i4(this, zzn));
    }

    public final List<zzw> j3(String str, String str2, String str3) {
        h0(str, true);
        try {
            return (List) this.f10642b.g().w(new f4(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e2) {
            this.f10642b.h().G().b("Failed to get conditional user properties as", e2);
            return Collections.emptyList();
        }
    }

    public final List<zzw> l3(String str, String str2, zzn zzn) {
        g1(zzn, false);
        try {
            return (List) this.f10642b.g().w(new g4(this, zzn, str, str2)).get();
        } catch (InterruptedException | ExecutionException e2) {
            this.f10642b.h().G().b("Failed to get conditional user properties", e2);
            return Collections.emptyList();
        }
    }

    public final String m2(zzn zzn) {
        g1(zzn, false);
        return this.f10642b.U(zzn);
    }

    public final void r0(zzw zzw, zzn zzn) {
        Preconditions.k(zzw);
        Preconditions.k(zzw.f10717d);
        g1(zzn, false);
        zzw zzw2 = new zzw(zzw);
        zzw2.f10715b = zzn.f10709b;
        V(new q4(this, zzw2, zzn));
    }

    public final List<zzkq> v1(String str, String str2, String str3, boolean z) {
        h0(str, true);
        try {
            List<s7> list = (List) this.f10642b.g().w(new d4(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (s7 s7Var : list) {
                if (z || !zzkr.C0(s7Var.f10426c)) {
                    arrayList.add(new zzkq(s7Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e2) {
            this.f10642b.h().G().c("Failed to get user properties as. appId", zzeu.x(str), e2);
            return Collections.emptyList();
        }
    }

    public final void w4(zzw zzw) {
        Preconditions.k(zzw);
        Preconditions.k(zzw.f10717d);
        h0(zzw.f10715b, true);
        V(new b4(this, new zzw(zzw)));
    }

    public final void x4(zzao zzao, zzn zzn) {
        Preconditions.k(zzao);
        g1(zzn, false);
        V(new h4(this, zzao, zzn));
    }

    public final void y3(zzkq zzkq, zzn zzn) {
        Preconditions.k(zzkq);
        g1(zzn, false);
        V(new m4(this, zzkq, zzn));
    }

    private zzgd(zzkj zzkj, String str) {
        Preconditions.k(zzkj);
        this.f10642b = zzkj;
        this.f10644d = null;
    }
}
