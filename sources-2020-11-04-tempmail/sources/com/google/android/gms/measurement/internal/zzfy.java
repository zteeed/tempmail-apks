package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.api.internal.GoogleServices;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzae;
import com.google.android.gms.internal.measurement.zzcv;
import com.google.android.gms.internal.measurement.zzkh;
import com.google.android.gms.internal.measurement.zzlr;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public class zzfy implements r4 {
    private static volatile zzfy G;
    private volatile Boolean A;
    @VisibleForTesting
    private Boolean B;
    @VisibleForTesting
    private Boolean C;
    private int D;
    private AtomicInteger E = new AtomicInteger(0);
    @VisibleForTesting
    final long F;

    /* renamed from: a  reason: collision with root package name */
    private final Context f10636a;

    /* renamed from: b  reason: collision with root package name */
    private final String f10637b;

    /* renamed from: c  reason: collision with root package name */
    private final String f10638c;

    /* renamed from: d  reason: collision with root package name */
    private final String f10639d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f10640e;

    /* renamed from: f  reason: collision with root package name */
    private final zzx f10641f;
    private final zzy g;
    private final q3 h;
    private final zzeu i;
    private final zzfv j;
    private final zzjv k;
    private final zzkr l;
    private final zzes m;
    private final Clock n;
    private final zzii o;
    private final zzhc p;
    private final zza q;
    private final zzid r;
    private zzeq s;
    private zzir t;
    private zzai u;
    private zzer v;
    private zzfp w;
    private boolean x = false;
    private Boolean y;
    private long z;

    private zzfy(zzhd zzhd) {
        long j2;
        Bundle bundle;
        boolean z2 = false;
        Preconditions.k(zzhd);
        zzx zzx = new zzx(zzhd.f10658a);
        this.f10641f = zzx;
        f3.f10178a = zzx;
        this.f10636a = zzhd.f10658a;
        this.f10637b = zzhd.f10659b;
        this.f10638c = zzhd.f10660c;
        this.f10639d = zzhd.f10661d;
        this.f10640e = zzhd.h;
        this.A = zzhd.f10662e;
        zzae zzae = zzhd.g;
        if (!(zzae == null || (bundle = zzae.h) == null)) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.B = (Boolean) obj;
            }
            Object obj2 = zzae.h.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.C = (Boolean) obj2;
            }
        }
        zzcv.h(this.f10636a);
        Clock d2 = DefaultClock.d();
        this.n = d2;
        Long l2 = zzhd.i;
        if (l2 != null) {
            j2 = l2.longValue();
        } else {
            j2 = d2.a();
        }
        this.F = j2;
        this.g = new zzy(this);
        q3 q3Var = new q3(this);
        q3Var.q();
        this.h = q3Var;
        zzeu zzeu = new zzeu(this);
        zzeu.q();
        this.i = zzeu;
        zzkr zzkr = new zzkr(this);
        zzkr.q();
        this.l = zzkr;
        zzes zzes = new zzes(this);
        zzes.q();
        this.m = zzes;
        this.q = new zza(this);
        zzii zzii = new zzii(this);
        zzii.z();
        this.o = zzii;
        zzhc zzhc = new zzhc(this);
        zzhc.z();
        this.p = zzhc;
        zzjv zzjv = new zzjv(this);
        zzjv.z();
        this.k = zzjv;
        zzid zzid = new zzid(this);
        zzid.q();
        this.r = zzid;
        zzfv zzfv = new zzfv(this);
        zzfv.q();
        this.j = zzfv;
        zzae zzae2 = zzhd.g;
        if (!(zzae2 == null || zzae2.f9726c == 0)) {
            z2 = true;
        }
        boolean z3 = !z2;
        if (this.f10636a.getApplicationContext() instanceof Application) {
            zzhc F2 = F();
            if (F2.f().getApplicationContext() instanceof Application) {
                Application application = (Application) F2.f().getApplicationContext();
                if (F2.f10654c == null) {
                    F2.f10654c = new n5(F2, (x4) null);
                }
                if (z3) {
                    application.unregisterActivityLifecycleCallbacks(F2.f10654c);
                    application.registerActivityLifecycleCallbacks(F2.f10654c);
                    F2.h().O().a("Registered activity lifecycle callback");
                }
            }
        } else {
            h().J().a("Application context is not an Application");
        }
        this.j.z(new y3(this, zzhd));
    }

    public static zzfy a(Context context, zzae zzae, Long l2) {
        Bundle bundle;
        if (zzae != null && (zzae.f9729f == null || zzae.g == null)) {
            zzae = new zzae(zzae.f9725b, zzae.f9726c, zzae.f9727d, zzae.f9728e, (String) null, (String) null, zzae.h);
        }
        Preconditions.k(context);
        Preconditions.k(context.getApplicationContext());
        if (G == null) {
            synchronized (zzfy.class) {
                if (G == null) {
                    G = new zzfy(new zzhd(context, zzae, l2));
                }
            }
        } else if (!(zzae == null || (bundle = zzae.h) == null || !bundle.containsKey("dataCollectionDefaultEnabled"))) {
            G.l(zzae.h.getBoolean("dataCollectionDefaultEnabled"));
        }
        return G;
    }

    private static void e(p4 p4Var) {
        if (p4Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* access modifiers changed from: private */
    public final void j(zzhd zzhd) {
        zzew zzew;
        String str;
        g().c();
        zzai zzai = new zzai(this);
        zzai.q();
        this.u = zzai;
        zzer zzer = new zzer(this, zzhd.f10663f);
        zzer.z();
        this.v = zzer;
        zzeq zzeq = new zzeq(this);
        zzeq.z();
        this.s = zzeq;
        zzir zzir = new zzir(this);
        zzir.z();
        this.t = zzir;
        this.l.r();
        this.h.r();
        this.w = new zzfp(this);
        this.v.A();
        h().M().b("App measurement initialized, version", Long.valueOf(this.g.D()));
        h().M().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String D2 = zzer.D();
        if (TextUtils.isEmpty(this.f10637b)) {
            if (G().D0(D2)) {
                zzew = h().M();
                str = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.";
            } else {
                zzew M = h().M();
                String valueOf = String.valueOf(D2);
                zzew zzew2 = M;
                str = valueOf.length() != 0 ? "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(valueOf) : new String("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ");
                zzew = zzew2;
            }
            zzew.a(str);
        }
        h().N().a("Debug-level message logging enabled");
        if (this.D != this.E.get()) {
            h().G().c("Not all components initialized", Integer.valueOf(this.D), Integer.valueOf(this.E.get()));
        }
        this.x = true;
    }

    private final zzid w() {
        z(this.r);
        return this.r;
    }

    private static void y(x3 x3Var) {
        if (x3Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!x3Var.x()) {
            String valueOf = String.valueOf(x3Var.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    private static void z(s4 s4Var) {
        if (s4Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!s4Var.t()) {
            String valueOf = String.valueOf(s4Var.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    public final q3 A() {
        e(this.h);
        return this.h;
    }

    public final zzeu B() {
        zzeu zzeu = this.i;
        if (zzeu == null || !zzeu.t()) {
            return null;
        }
        return this.i;
    }

    public final zzjv C() {
        y(this.k);
        return this.k;
    }

    public final zzfp D() {
        return this.w;
    }

    /* access modifiers changed from: package-private */
    public final zzfv E() {
        return this.j;
    }

    public final zzhc F() {
        y(this.p);
        return this.p;
    }

    public final zzkr G() {
        e(this.l);
        return this.l;
    }

    public final zzes H() {
        e(this.m);
        return this.m;
    }

    public final zzeq I() {
        y(this.s);
        return this.s;
    }

    public final boolean J() {
        return TextUtils.isEmpty(this.f10637b);
    }

    public final String K() {
        return this.f10637b;
    }

    public final String L() {
        return this.f10638c;
    }

    public final String M() {
        return this.f10639d;
    }

    public final boolean N() {
        return this.f10640e;
    }

    public final zzii O() {
        y(this.o);
        return this.o;
    }

    public final zzir P() {
        y(this.t);
        return this.t;
    }

    public final zzai Q() {
        z(this.u);
        return this.u;
    }

    public final zzer R() {
        y(this.v);
        return this.v;
    }

    public final zza S() {
        zza zza = this.q;
        if (zza != null) {
            return zza;
        }
        throw new IllegalStateException("Component not created");
    }

    /* access modifiers changed from: protected */
    public final void b() {
        g().c();
        if (A().f10375e.a() == 0) {
            A().f10375e.b(this.n.a());
        }
        if (Long.valueOf(A().j.a()).longValue() == 0) {
            h().O().b("Persisting first open", Long.valueOf(this.F));
            A().j.b(this.F);
        }
        if (this.g.t(zzaq.R0)) {
            F().h.c();
        }
        if (u()) {
            if (!TextUtils.isEmpty(R().E()) || !TextUtils.isEmpty(R().F())) {
                G();
                if (zzkr.j0(R().E(), A().D(), R().F(), A().E())) {
                    h().M().a("Rechecking which service to use due to a GMP App Id change");
                    A().G();
                    I().I();
                    this.t.c0();
                    this.t.a0();
                    A().j.b(this.F);
                    A().l.b((String) null);
                }
                A().z(R().E());
                A().B(R().F());
            }
            F().N(A().l.a());
            if (zzkh.b() && this.g.t(zzaq.v0) && !G().O0() && !TextUtils.isEmpty(A().z.a())) {
                h().J().a("Remote config removed with active feature rollouts");
                A().z.b((String) null);
            }
            if (!TextUtils.isEmpty(R().E()) || !TextUtils.isEmpty(R().F())) {
                boolean p2 = p();
                if (!A().J() && !this.g.H()) {
                    A().A(!p2);
                }
                if (p2) {
                    F().f0();
                }
                C().f10683d.a();
                P().T(new AtomicReference());
                if (zzlr.b() && this.g.t(zzaq.N0)) {
                    P().G(A().C.a());
                }
            }
        } else if (p()) {
            if (!G().B0("android.permission.INTERNET")) {
                h().G().a("App is missing INTERNET permission");
            }
            if (!G().B0("android.permission.ACCESS_NETWORK_STATE")) {
                h().G().a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!Wrappers.a(this.f10636a).g() && !this.g.R()) {
                if (!zzfq.b(this.f10636a)) {
                    h().G().a("AppMeasurementReceiver not registered/enabled");
                }
                if (!zzkr.Y(this.f10636a, false)) {
                    h().G().a("AppMeasurementService not registered/enabled");
                }
            }
            h().G().a("Uploading is not possible. App measurement disabled");
        }
        A().t.a(this.g.t(zzaq.a0));
    }

    /* access modifiers changed from: package-private */
    public final void d(x3 x3Var) {
        this.D++;
    }

    public final Context f() {
        return this.f10636a;
    }

    public final zzfv g() {
        z(this.j);
        return this.j;
    }

    public final zzeu h() {
        z(this.i);
        return this.i;
    }

    /* access modifiers changed from: package-private */
    public final void i(s4 s4Var) {
        this.D++;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void k(String str, int i2, Throwable th, byte[] bArr, Map map) {
        List<ResolveInfo> queryIntentActivities;
        boolean z2 = true;
        if (!((i2 == 200 || i2 == 204 || i2 == 304) && th == null)) {
            h().J().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i2), th);
            return;
        }
        A().x.a(true);
        if (bArr.length == 0) {
            h().N().a("Deferred Deep Link response empty.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr));
            String optString = jSONObject.optString("deeplink", "");
            String optString2 = jSONObject.optString("gclid", "");
            double optDouble = jSONObject.optDouble("timestamp", 0.0d);
            if (TextUtils.isEmpty(optString)) {
                h().N().a("Deferred Deep Link is empty.");
                return;
            }
            zzkr G2 = G();
            G2.a();
            if (TextUtils.isEmpty(optString) || (queryIntentActivities = G2.f().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0)) == null || queryIntentActivities.isEmpty()) {
                z2 = false;
            }
            if (!z2) {
                h().J().c("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("gclid", optString2);
            bundle.putString("_cis", "ddp");
            this.p.R("auto", "_cmp", bundle);
            zzkr G3 = G();
            if (!TextUtils.isEmpty(optString) && G3.e0(optString, optDouble)) {
                G3.f().sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
            }
        } catch (JSONException e2) {
            h().G().b("Failed to parse the Deferred Deep Link response. exception", e2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void l(boolean z2) {
        this.A = Boolean.valueOf(z2);
    }

    public final zzx m() {
        return this.f10641f;
    }

    public final Clock n() {
        return this.n;
    }

    public final boolean o() {
        return this.A != null && this.A.booleanValue();
    }

    public final boolean p() {
        return q() == 0;
    }

    public final int q() {
        g().c();
        if (this.g.H()) {
            return 1;
        }
        Boolean bool = this.C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        Boolean H = A().H();
        if (H == null) {
            zzy zzy = this.g;
            zzy.m();
            Boolean B2 = zzy.B("firebase_analytics_collection_enabled");
            if (B2 == null) {
                Boolean bool2 = this.B;
                if (bool2 != null) {
                    if (bool2.booleanValue()) {
                        return 0;
                    }
                    return 5;
                } else if (GoogleServices.d()) {
                    return 6;
                } else {
                    if (!this.g.t(zzaq.T) || this.A == null || this.A.booleanValue()) {
                        return 0;
                    }
                    return 7;
                }
            } else if (B2.booleanValue()) {
                return 0;
            } else {
                return 4;
            }
        } else if (H.booleanValue()) {
            return 0;
        } else {
            return 3;
        }
    }

    /* access modifiers changed from: package-private */
    public final void r() {
    }

    /* access modifiers changed from: package-private */
    public final void s() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* access modifiers changed from: package-private */
    public final void t() {
        this.E.incrementAndGet();
    }

    /* access modifiers changed from: protected */
    public final boolean u() {
        if (this.x) {
            g().c();
            Boolean bool = this.y;
            if (bool == null || this.z == 0 || (bool != null && !bool.booleanValue() && Math.abs(this.n.b() - this.z) > 1000)) {
                this.z = this.n.b();
                boolean z2 = true;
                Boolean valueOf = Boolean.valueOf(G().B0("android.permission.INTERNET") && G().B0("android.permission.ACCESS_NETWORK_STATE") && (Wrappers.a(this.f10636a).g() || this.g.R() || (zzfq.b(this.f10636a) && zzkr.Y(this.f10636a, false))));
                this.y = valueOf;
                if (valueOf.booleanValue()) {
                    if (!G().i0(R().E(), R().F(), R().G()) && TextUtils.isEmpty(R().F())) {
                        z2 = false;
                    }
                    this.y = Boolean.valueOf(z2);
                }
            }
            return this.y.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    public final void v() {
        g().c();
        z(w());
        String D2 = R().D();
        Pair<String, Boolean> u2 = A().u(D2);
        if (!this.g.J().booleanValue() || ((Boolean) u2.second).booleanValue() || TextUtils.isEmpty((CharSequence) u2.first)) {
            h().N().a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
        } else if (!w().x()) {
            h().J().a("Network is not available for Deferred Deep Link request. Skipping");
        } else {
            zzkr G2 = G();
            URL I = G2.I(R().l().D(), D2, (String) u2.first, A().y.a() - 1);
            zzid w2 = w();
            z3 z3Var = new z3(this);
            w2.c();
            w2.p();
            Preconditions.k(I);
            Preconditions.k(z3Var);
            w2.g().C(new t5(w2, D2, I, (byte[]) null, (Map<String, String>) null, z3Var));
        }
    }

    public final zzy x() {
        return this.g;
    }
}
