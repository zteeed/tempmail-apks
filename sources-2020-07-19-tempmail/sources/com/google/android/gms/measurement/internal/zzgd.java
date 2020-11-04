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
    public final zzkj f10456b;

    /* renamed from: c  reason: collision with root package name */
    private Boolean f10457c;

    /* renamed from: d  reason: collision with root package name */
    private String f10458d;

    public zzgd(zzkj zzkj) {
        this(zzkj, (String) null);
    }

    @VisibleForTesting
    private final void P(Runnable runnable) {
        Preconditions.k(runnable);
        if (this.f10456b.g().H()) {
            runnable.run();
        } else {
            this.f10456b.g().z(runnable);
        }
    }

    private final void a1(zzn zzn, boolean z) {
        Preconditions.k(zzn);
        b0(zzn.f10523b, false);
        this.f10456b.b0().i0(zzn.f10524c, zzn.s, zzn.w);
    }

    private final void b0(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.f10457c == null) {
                        if (!"com.google.android.gms".equals(this.f10458d) && !UidVerifier.a(this.f10456b.f(), Binder.getCallingUid())) {
                            if (!GoogleSignatureVerifier.a(this.f10456b.f()).c(Binder.getCallingUid())) {
                                z2 = false;
                                this.f10457c = Boolean.valueOf(z2);
                            }
                        }
                        z2 = true;
                        this.f10457c = Boolean.valueOf(z2);
                    }
                    if (this.f10457c.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e2) {
                    this.f10456b.h().G().b("Measurement Service called with invalid calling package. appId", zzeu.x(str));
                    throw e2;
                }
            }
            if (this.f10458d == null && GooglePlayServicesUtilLight.uidHasPackageName(this.f10456b.f(), Binder.getCallingUid(), str)) {
                this.f10458d = str;
            }
            if (!str.equals(this.f10458d)) {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[]{str}));
            }
            return;
        }
        this.f10456b.h().G().a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    public final void A5(Bundle bundle, zzn zzn) {
        if (zzlr.b() && this.f10456b.H().t(zzaq.O0)) {
            a1(zzn, false);
            P(new a4(this, zzn, bundle));
        }
    }

    public final List<zzkq> B3(String str, String str2, boolean z, zzn zzn) {
        a1(zzn, false);
        try {
            List<s7> list = (List) this.f10456b.g().w(new e4(this, zzn, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (s7 s7Var : list) {
                if (z || !zzkr.C0(s7Var.f10240c)) {
                    arrayList.add(new zzkq(s7Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e2) {
            this.f10456b.h().G().c("Failed to query user properties. appId", zzeu.x(zzn.f10523b), e2);
            return Collections.emptyList();
        }
    }

    public final List<zzkq> C3(zzn zzn, boolean z) {
        a1(zzn, false);
        try {
            List<s7> list = (List) this.f10456b.g().w(new l4(this, zzn)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (s7 s7Var : list) {
                if (z || !zzkr.C0(s7Var.f10240c)) {
                    arrayList.add(new zzkq(s7Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e2) {
            this.f10456b.h().G().c("Failed to get user properties. appId", zzeu.x(zzn.f10523b), e2);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void E(zzn zzn, Bundle bundle) {
        this.f10456b.V().W(zzn.f10523b, bundle);
    }

    public final void F3(zzn zzn) {
        a1(zzn, false);
        P(new o4(this, zzn));
    }

    public final byte[] H5(zzao zzao, String str) {
        Preconditions.g(str);
        Preconditions.k(zzao);
        b0(str, true);
        this.f10456b.h().N().b("Log and bundle. event", this.f10456b.a0().w(zzao.f10377b));
        long c2 = this.f10456b.n().c() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f10456b.g().B(new j4(this, zzao, str)).get();
            if (bArr == null) {
                this.f10456b.h().G().b("Log and bundle returned null. appId", zzeu.x(str));
                bArr = new byte[0];
            }
            this.f10456b.h().N().d("Log and bundle processed. event, size, time_ms", this.f10456b.a0().w(zzao.f10377b), Integer.valueOf(bArr.length), Long.valueOf((this.f10456b.n().c() / 1000000) - c2));
            return bArr;
        } catch (InterruptedException | ExecutionException e2) {
            this.f10456b.h().G().d("Failed to log and bundle. appId, event, error", zzeu.x(str), this.f10456b.a0().w(zzao.f10377b), e2);
            return null;
        }
    }

    public final void O2(long j, String str, String str2, String str3) {
        P(new n4(this, str2, str3, str, j));
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final zzao U0(zzao zzao, zzn zzn) {
        zzan zzan;
        boolean z = false;
        if (!(!"_cmp".equals(zzao.f10377b) || (zzan = zzao.f10378c) == null || zzan.u() == 0)) {
            String K = zzao.f10378c.K("_cis");
            if (!TextUtils.isEmpty(K) && (("referrer broadcast".equals(K) || "referrer API".equals(K)) && this.f10456b.H().C(zzn.f10523b, zzaq.S))) {
                z = true;
            }
        }
        if (!z) {
            return zzao;
        }
        this.f10456b.h().M().b("Event has been filtered ", zzao.toString());
        return new zzao("_cmpx", zzao.f10378c, zzao.f10379d, zzao.f10380e);
    }

    public final void W2(zzn zzn) {
        b0(zzn.f10523b, false);
        P(new i4(this, zzn));
    }

    public final List<zzw> X2(String str, String str2, String str3) {
        b0(str, true);
        try {
            return (List) this.f10456b.g().w(new f4(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e2) {
            this.f10456b.h().G().b("Failed to get conditional user properties as", e2);
            return Collections.emptyList();
        }
    }

    public final List<zzw> Z2(String str, String str2, zzn zzn) {
        a1(zzn, false);
        try {
            return (List) this.f10456b.g().w(new g4(this, zzn, str, str2)).get();
        } catch (InterruptedException | ExecutionException e2) {
            this.f10456b.h().G().b("Failed to get conditional user properties", e2);
            return Collections.emptyList();
        }
    }

    public final String c2(zzn zzn) {
        a1(zzn, false);
        return this.f10456b.U(zzn);
    }

    public final void c4(zzw zzw) {
        Preconditions.k(zzw);
        Preconditions.k(zzw.f10531d);
        b0(zzw.f10529b, true);
        P(new b4(this, new zzw(zzw)));
    }

    public final void d4(zzao zzao, zzn zzn) {
        Preconditions.k(zzao);
        a1(zzn, false);
        P(new h4(this, zzao, zzn));
    }

    public final void i3(zzkq zzkq, zzn zzn) {
        Preconditions.k(zzkq);
        a1(zzn, false);
        P(new m4(this, zzkq, zzn));
    }

    public final void l0(zzw zzw, zzn zzn) {
        Preconditions.k(zzw);
        Preconditions.k(zzw.f10531d);
        a1(zzn, false);
        zzw zzw2 = new zzw(zzw);
        zzw2.f10529b = zzn.f10523b;
        P(new q4(this, zzw2, zzn));
    }

    public final List<zzkq> o1(String str, String str2, String str3, boolean z) {
        b0(str, true);
        try {
            List<s7> list = (List) this.f10456b.g().w(new d4(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (s7 s7Var : list) {
                if (z || !zzkr.C0(s7Var.f10240c)) {
                    arrayList.add(new zzkq(s7Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e2) {
            this.f10456b.h().G().c("Failed to get user properties as. appId", zzeu.x(str), e2);
            return Collections.emptyList();
        }
    }

    public final void q4(zzao zzao, String str, String str2) {
        Preconditions.k(zzao);
        Preconditions.g(str);
        b0(str, true);
        P(new k4(this, zzao, str));
    }

    public final void y4(zzn zzn) {
        a1(zzn, false);
        P(new c4(this, zzn));
    }

    private zzgd(zzkj zzkj, String str) {
        Preconditions.k(zzkj);
        this.f10456b = zzkj;
        this.f10458d = null;
    }
}
