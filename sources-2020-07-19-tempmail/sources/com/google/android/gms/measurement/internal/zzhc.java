package com.google.android.gms.measurement.internal;

import a.e.a;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzko;
import com.google.android.gms.internal.measurement.zzla;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsConnectorReceiver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzhc extends x3 {
    @VisibleForTesting

    /* renamed from: c  reason: collision with root package name */
    protected n5 f10468c;

    /* renamed from: d  reason: collision with root package name */
    private zzhb f10469d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<zzha> f10470e = new CopyOnWriteArraySet();

    /* renamed from: f  reason: collision with root package name */
    private boolean f10471f;
    private final AtomicReference<String> g = new AtomicReference<>();
    final zzp h;
    @VisibleForTesting
    protected boolean i = true;

    protected zzhc(zzfy zzfy) {
        super(zzfy);
        this.h = new zzp(zzfy);
    }

    private final void Q(String str, String str2, long j, Object obj) {
        g().z(new y4(this, str, str2, obj, j));
    }

    /* access modifiers changed from: private */
    public final void j0() {
        c();
        String a2 = k().s.a();
        if (a2 != null) {
            if ("unset".equals(a2)) {
                T("app", "_npa", (Object) null, n().a());
            } else {
                T("app", "_npa", Long.valueOf("true".equals(a2) ? 1 : 0), n().a());
            }
        }
        if (!this.f10171a.p() || !this.i) {
            h().N().a("Updating Scion state (FE)");
            s().X();
            return;
        }
        h().N().a("Recording app launch after enabling measurement for the first time (FE)");
        f0();
        if (zzla.b() && l().t(zzaq.w0)) {
            v().f10497d.a();
        }
        if (zzko.b() && l().t(zzaq.B0)) {
            if (!(this.f10171a.D().f10441a.A().k.a() > 0)) {
                zzfp D = this.f10171a.D();
                D.f10441a.r();
                D.b(D.f10441a.f().getPackageName());
            }
        }
        if (l().t(zzaq.R0)) {
            g().z(new l5(this));
        }
    }

    @VisibleForTesting
    private final ArrayList<Bundle> k0(String str, String str2, String str3) {
        if (g().H()) {
            h().G().a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        } else if (zzx.a()) {
            h().G().a("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            this.f10171a.g().v(atomicReference, 5000, "get conditional user properties", new g5(this, atomicReference, str, str2, str3));
            List list = (List) atomicReference.get();
            if (list != null) {
                return zzkr.r0(list);
            }
            h().G().b("Timed out waiting for get conditional user properties", str);
            return new ArrayList<>();
        }
    }

    @VisibleForTesting
    private final Map<String, Object> l0(String str, String str2, String str3, boolean z) {
        if (g().H()) {
            h().G().a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        } else if (zzx.a()) {
            h().G().a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        } else {
            AtomicReference atomicReference = new AtomicReference();
            this.f10171a.g().v(atomicReference, 5000, "get user properties", new f5(this, atomicReference, str, str2, str3, z));
            List<zzkq> list = (List) atomicReference.get();
            if (list == null) {
                h().G().b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
                return Collections.emptyMap();
            }
            a aVar = new a(list.size());
            for (zzkq zzkq : list) {
                aVar.put(zzkq.f10515c, zzkq.u());
            }
            return aVar;
        }
    }

    private final void n0(Bundle bundle, long j) {
        Class<Long> cls = Long.class;
        Class<String> cls2 = String.class;
        Preconditions.k(bundle);
        zzgx.a(bundle, "app_id", cls2, null);
        zzgx.a(bundle, "origin", cls2, null);
        zzgx.a(bundle, AnalyticsConnectorReceiver.EVENT_NAME_KEY, cls2, null);
        zzgx.a(bundle, "value", Object.class, null);
        zzgx.a(bundle, "trigger_event_name", cls2, null);
        zzgx.a(bundle, "trigger_timeout", cls, 0L);
        zzgx.a(bundle, "timed_out_event_name", cls2, null);
        zzgx.a(bundle, "timed_out_event_params", Bundle.class, null);
        zzgx.a(bundle, "triggered_event_name", cls2, null);
        zzgx.a(bundle, "triggered_event_params", Bundle.class, null);
        zzgx.a(bundle, "time_to_live", cls, 0L);
        zzgx.a(bundle, "expired_event_name", cls2, null);
        zzgx.a(bundle, "expired_event_params", Bundle.class, null);
        Preconditions.g(bundle.getString(AnalyticsConnectorReceiver.EVENT_NAME_KEY));
        Preconditions.g(bundle.getString("origin"));
        Preconditions.k(bundle.get("value"));
        bundle.putLong("creation_timestamp", j);
        String string = bundle.getString(AnalyticsConnectorReceiver.EVENT_NAME_KEY);
        Object obj = bundle.get("value");
        if (j().x0(string) != 0) {
            h().G().b("Invalid conditional user property name", e().A(string));
        } else if (j().p0(string, obj) != 0) {
            h().G().c("Invalid conditional user property value", e().A(string), obj);
        } else {
            Object y0 = j().y0(string, obj);
            if (y0 == null) {
                h().G().c("Unable to normalize conditional user property value", e().A(string), obj);
                return;
            }
            zzgx.b(bundle, y0);
            long j2 = bundle.getLong("trigger_timeout");
            if (TextUtils.isEmpty(bundle.getString("trigger_event_name")) || (j2 <= 15552000000L && j2 >= 1)) {
                long j3 = bundle.getLong("time_to_live");
                if (j3 > 15552000000L || j3 < 1) {
                    h().G().c("Invalid conditional user property time to live", e().A(string), Long.valueOf(j3));
                } else {
                    g().z(new b5(this, bundle));
                }
            } else {
                h().G().c("Invalid conditional user property timeout", e().A(string), Long.valueOf(j2));
            }
        }
    }

    private final void q0(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        g().z(new z4(this, str, str2, j, zzkr.q0(bundle), z, z2, z3, str3));
    }

    private final void s0(String str, String str2, String str3, Bundle bundle) {
        long a2 = n().a();
        Preconditions.g(str2);
        Bundle bundle2 = new Bundle();
        if (str != null) {
            bundle2.putString("app_id", str);
        }
        bundle2.putString(AnalyticsConnectorReceiver.EVENT_NAME_KEY, str2);
        bundle2.putLong("creation_timestamp", a2);
        if (str3 != null) {
            bundle2.putString("expired_event_name", str3);
            bundle2.putBundle("expired_event_params", bundle);
        }
        g().z(new e5(this, bundle2));
    }

    /* access modifiers changed from: private */
    public final void t0(Bundle bundle) {
        Bundle bundle2 = bundle;
        c();
        y();
        Preconditions.k(bundle);
        Preconditions.g(bundle2.getString(AnalyticsConnectorReceiver.EVENT_NAME_KEY));
        Preconditions.g(bundle2.getString("origin"));
        Preconditions.k(bundle2.get("value"));
        if (!this.f10171a.p()) {
            h().O().a("Conditional property not set since app measurement is disabled");
            return;
        }
        zzkq zzkq = new zzkq(bundle2.getString(AnalyticsConnectorReceiver.EVENT_NAME_KEY), bundle2.getLong("triggered_timestamp"), bundle2.get("value"), bundle2.getString("origin"));
        try {
            zzao E = j().E(bundle2.getString("app_id"), bundle2.getString("triggered_event_name"), bundle2.getBundle("triggered_event_params"), bundle2.getString("origin"), 0, true, false);
            s().R(new zzw(bundle2.getString("app_id"), bundle2.getString("origin"), zzkq, bundle2.getLong("creation_timestamp"), false, bundle2.getString("trigger_event_name"), j().E(bundle2.getString("app_id"), bundle2.getString("timed_out_event_name"), bundle2.getBundle("timed_out_event_params"), bundle2.getString("origin"), 0, true, false), bundle2.getLong("trigger_timeout"), E, bundle2.getLong("time_to_live"), j().E(bundle2.getString("app_id"), bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), bundle2.getString("origin"), 0, true, false)));
        } catch (IllegalArgumentException unused) {
        }
    }

    /* access modifiers changed from: private */
    public final void v0(boolean z) {
        c();
        a();
        y();
        h().N().b("Setting app measurement enabled (FE)", Boolean.valueOf(z));
        k().y(z);
        j0();
    }

    /* access modifiers changed from: private */
    public final void w0(Bundle bundle) {
        Bundle bundle2 = bundle;
        c();
        y();
        Preconditions.k(bundle);
        Preconditions.g(bundle2.getString(AnalyticsConnectorReceiver.EVENT_NAME_KEY));
        if (!this.f10171a.p()) {
            h().O().a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        zzkq zzkq = new zzkq(bundle2.getString(AnalyticsConnectorReceiver.EVENT_NAME_KEY), 0, (Object) null, (String) null);
        try {
            zzao E = j().E(bundle2.getString("app_id"), bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), bundle2.getString("origin"), bundle2.getLong("creation_timestamp"), true, false);
            zzkq zzkq2 = zzkq;
            s().R(new zzw(bundle2.getString("app_id"), bundle2.getString("origin"), zzkq2, bundle2.getLong("creation_timestamp"), bundle2.getBoolean("active"), bundle2.getString("trigger_event_name"), (zzao) null, bundle2.getLong("trigger_timeout"), (zzao) null, bundle2.getLong("time_to_live"), E));
        } catch (IllegalArgumentException unused) {
        }
    }

    /* access modifiers changed from: protected */
    public final boolean B() {
        return false;
    }

    public final ArrayList<Bundle> C(String str, String str2) {
        a();
        return k0((String) null, str, str2);
    }

    public final ArrayList<Bundle> D(String str, String str2, String str3) {
        Preconditions.g(str);
        o();
        throw null;
    }

    public final Map<String, Object> E(String str, String str2, String str3, boolean z) {
        Preconditions.g(str);
        o();
        throw null;
    }

    public final Map<String, Object> F(String str, String str2, boolean z) {
        a();
        return l0((String) null, str, str2, z);
    }

    public final void G(Bundle bundle) {
        H(bundle, n().a());
    }

    public final void H(Bundle bundle, long j) {
        Preconditions.k(bundle);
        a();
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            h().J().a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        n0(bundle2, j);
    }

    public final void I(zzha zzha) {
        a();
        y();
        Preconditions.k(zzha);
        if (!this.f10470e.add(zzha)) {
            h().J().a("OnEventListener already registered");
        }
    }

    public final void J(zzhb zzhb) {
        zzhb zzhb2;
        c();
        a();
        y();
        if (!(zzhb == null || zzhb == (zzhb2 = this.f10469d))) {
            Preconditions.o(zzhb2 == null, "EventInterceptor already set.");
        }
        this.f10469d = zzhb;
    }

    /* access modifiers changed from: package-private */
    public final void N(String str) {
        this.g.set(str);
    }

    /* access modifiers changed from: package-private */
    public final void O(String str, String str2, long j, Bundle bundle) {
        a();
        c();
        P(str, str2, j, bundle, true, this.f10469d == null || zzkr.C0(str2), false, (String) null);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02d5  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0316  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x03c9  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x03e3  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0415  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0436  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x04f9  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0574  */
    /* JADX WARNING: Removed duplicated region for block: B:211:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void P(java.lang.String r28, java.lang.String r29, long r30, android.os.Bundle r32, boolean r33, boolean r34, boolean r35, java.lang.String r36) {
        /*
            r27 = this;
            r7 = r27
            r8 = r28
            r15 = r29
            r13 = r30
            r12 = r32
            java.lang.String r0 = "com.google.android.gms.tagmanager.TagManagerService"
            com.google.android.gms.common.internal.Preconditions.g(r28)
            com.google.android.gms.common.internal.Preconditions.k(r32)
            r27.c()
            r27.y()
            com.google.android.gms.measurement.internal.zzfy r1 = r7.f10171a
            boolean r1 = r1.p()
            if (r1 != 0) goto L_0x002e
            com.google.android.gms.measurement.internal.zzeu r0 = r27.h()
            com.google.android.gms.measurement.internal.zzew r0 = r0.N()
            java.lang.String r1 = "Event not sent since app measurement is disabled"
            r0.a(r1)
            return
        L_0x002e:
            com.google.android.gms.measurement.internal.zzy r1 = r27.l()
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.zzaq.c0
            boolean r1 = r1.t(r2)
            if (r1 == 0) goto L_0x0058
            com.google.android.gms.measurement.internal.zzer r1 = r27.r()
            java.util.List r1 = r1.J()
            if (r1 == 0) goto L_0x0058
            boolean r1 = r1.contains(r15)
            if (r1 != 0) goto L_0x0058
            com.google.android.gms.measurement.internal.zzeu r0 = r27.h()
            com.google.android.gms.measurement.internal.zzew r0 = r0.N()
            java.lang.String r1 = "Dropping non-safelisted event. event name, origin"
            r0.c(r1, r15, r8)
            return
        L_0x0058:
            boolean r1 = r7.f10471f
            r11 = 0
            r10 = 0
            r9 = 1
            if (r1 != 0) goto L_0x00ae
            r7.f10471f = r9
            com.google.android.gms.measurement.internal.zzfy r1 = r7.f10171a     // Catch:{ ClassNotFoundException -> 0x00a1 }
            boolean r1 = r1.N()     // Catch:{ ClassNotFoundException -> 0x00a1 }
            if (r1 != 0) goto L_0x0076
            android.content.Context r1 = r27.f()     // Catch:{ ClassNotFoundException -> 0x00a1 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00a1 }
            java.lang.Class r0 = java.lang.Class.forName(r0, r9, r1)     // Catch:{ ClassNotFoundException -> 0x00a1 }
            goto L_0x007a
        L_0x0076:
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x00a1 }
        L_0x007a:
            java.lang.String r1 = "initialize"
            java.lang.Class[] r2 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x0092 }
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r2[r10] = r3     // Catch:{ Exception -> 0x0092 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch:{ Exception -> 0x0092 }
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x0092 }
            android.content.Context r2 = r27.f()     // Catch:{ Exception -> 0x0092 }
            r1[r10] = r2     // Catch:{ Exception -> 0x0092 }
            r0.invoke(r11, r1)     // Catch:{ Exception -> 0x0092 }
            goto L_0x00ae
        L_0x0092:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzeu r1 = r27.h()     // Catch:{ ClassNotFoundException -> 0x00a1 }
            com.google.android.gms.measurement.internal.zzew r1 = r1.J()     // Catch:{ ClassNotFoundException -> 0x00a1 }
            java.lang.String r2 = "Failed to invoke Tag Manager's initialize() method"
            r1.b(r2, r0)     // Catch:{ ClassNotFoundException -> 0x00a1 }
            goto L_0x00ae
        L_0x00a1:
            com.google.android.gms.measurement.internal.zzeu r0 = r27.h()
            com.google.android.gms.measurement.internal.zzew r0 = r0.M()
            java.lang.String r1 = "Tag Manager is not found and thus will not be used"
            r0.a(r1)
        L_0x00ae:
            com.google.android.gms.measurement.internal.zzy r0 = r27.l()
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.zzaq.i0
            boolean r0 = r0.t(r1)
            if (r0 == 0) goto L_0x00df
            java.lang.String r0 = "_cmp"
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L_0x00df
            java.lang.String r0 = "gclid"
            boolean r1 = r12.containsKey(r0)
            if (r1 == 0) goto L_0x00df
            java.lang.String r4 = r12.getString(r0)
            com.google.android.gms.common.util.Clock r0 = r27.n()
            long r5 = r0.a()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_lgclid"
            r1 = r27
            r1.T(r2, r3, r4, r5)
        L_0x00df:
            boolean r0 = com.google.android.gms.internal.measurement.zzlr.b()
            if (r0 == 0) goto L_0x010d
            com.google.android.gms.measurement.internal.zzy r0 = r27.l()
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.zzaq.N0
            boolean r0 = r0.t(r1)
            if (r0 == 0) goto L_0x010d
            r27.m()
            if (r33 == 0) goto L_0x010d
            boolean r0 = com.google.android.gms.measurement.internal.zzkr.F0(r29)
            if (r0 == 0) goto L_0x010d
            com.google.android.gms.measurement.internal.zzkr r0 = r27.j()
            com.google.android.gms.measurement.internal.q3 r1 = r27.k()
            com.google.android.gms.measurement.internal.zzfl r1 = r1.C
            android.os.Bundle r1 = r1.a()
            r0.M(r12, r1)
        L_0x010d:
            r0 = 40
            if (r35 == 0) goto L_0x0171
            r27.m()
            java.lang.String r1 = "_iap"
            boolean r1 = r1.equals(r15)
            if (r1 != 0) goto L_0x0171
            com.google.android.gms.measurement.internal.zzfy r1 = r7.f10171a
            com.google.android.gms.measurement.internal.zzkr r1 = r1.G()
            java.lang.String r2 = "event"
            boolean r3 = r1.g0(r2, r15)
            r4 = 2
            if (r3 != 0) goto L_0x012c
            goto L_0x013f
        L_0x012c:
            java.lang.String[] r3 = com.google.android.gms.measurement.internal.zzgw.f10459a
            boolean r3 = r1.l0(r2, r3, r15)
            if (r3 != 0) goto L_0x0137
            r4 = 13
            goto L_0x013f
        L_0x0137:
            boolean r1 = r1.f0(r2, r0, r15)
            if (r1 != 0) goto L_0x013e
            goto L_0x013f
        L_0x013e:
            r4 = 0
        L_0x013f:
            if (r4 == 0) goto L_0x0171
            com.google.android.gms.measurement.internal.zzeu r1 = r27.h()
            com.google.android.gms.measurement.internal.zzew r1 = r1.I()
            com.google.android.gms.measurement.internal.zzes r2 = r27.e()
            java.lang.String r2 = r2.w(r15)
            java.lang.String r3 = "Invalid public event name. Event will not be logged (FE)"
            r1.b(r3, r2)
            com.google.android.gms.measurement.internal.zzfy r1 = r7.f10171a
            r1.G()
            java.lang.String r0 = com.google.android.gms.measurement.internal.zzkr.H(r15, r0, r9)
            if (r15 == 0) goto L_0x0165
            int r10 = r29.length()
        L_0x0165:
            com.google.android.gms.measurement.internal.zzfy r1 = r7.f10171a
            com.google.android.gms.measurement.internal.zzkr r1 = r1.G()
            java.lang.String r2 = "_ev"
            r1.J(r4, r2, r0, r10)
            return
        L_0x0171:
            r27.m()
            com.google.android.gms.measurement.internal.zzii r1 = r27.t()
            com.google.android.gms.measurement.internal.zzij r1 = r1.E(r10)
            java.lang.String r2 = "_sc"
            if (r1 == 0) goto L_0x0188
            boolean r3 = r12.containsKey(r2)
            if (r3 != 0) goto L_0x0188
            r1.f10486d = r9
        L_0x0188:
            if (r33 == 0) goto L_0x018e
            if (r35 == 0) goto L_0x018e
            r3 = 1
            goto L_0x018f
        L_0x018e:
            r3 = 0
        L_0x018f:
            com.google.android.gms.measurement.internal.zzii.P(r1, r12, r3)
            java.lang.String r3 = "am"
            boolean r16 = r3.equals(r8)
            boolean r3 = com.google.android.gms.measurement.internal.zzkr.C0(r29)
            if (r33 == 0) goto L_0x01d1
            com.google.android.gms.measurement.internal.zzhb r4 = r7.f10469d
            if (r4 == 0) goto L_0x01d1
            if (r3 != 0) goto L_0x01d1
            if (r16 != 0) goto L_0x01d1
            com.google.android.gms.measurement.internal.zzeu r0 = r27.h()
            com.google.android.gms.measurement.internal.zzew r0 = r0.N()
            com.google.android.gms.measurement.internal.zzes r1 = r27.e()
            java.lang.String r1 = r1.w(r15)
            com.google.android.gms.measurement.internal.zzes r2 = r27.e()
            java.lang.String r2 = r2.u(r12)
            java.lang.String r3 = "Passing event to registered event handler (FE)"
            r0.c(r3, r1, r2)
            com.google.android.gms.measurement.internal.zzhb r1 = r7.f10469d
            r2 = r28
            r3 = r29
            r4 = r32
            r5 = r30
            r1.a(r2, r3, r4, r5)
            return
        L_0x01d1:
            com.google.android.gms.measurement.internal.zzfy r3 = r7.f10171a
            boolean r3 = r3.u()
            if (r3 != 0) goto L_0x01da
            return
        L_0x01da:
            com.google.android.gms.measurement.internal.zzkr r3 = r27.j()
            int r3 = r3.o0(r15)
            if (r3 == 0) goto L_0x021e
            com.google.android.gms.measurement.internal.zzeu r1 = r27.h()
            com.google.android.gms.measurement.internal.zzew r1 = r1.I()
            com.google.android.gms.measurement.internal.zzes r2 = r27.e()
            java.lang.String r2 = r2.w(r15)
            java.lang.String r4 = "Invalid event name. Event will not be logged (FE)"
            r1.b(r4, r2)
            r27.j()
            java.lang.String r0 = com.google.android.gms.measurement.internal.zzkr.H(r15, r0, r9)
            if (r15 == 0) goto L_0x0206
            int r10 = r29.length()
        L_0x0206:
            com.google.android.gms.measurement.internal.zzfy r1 = r7.f10171a
            com.google.android.gms.measurement.internal.zzkr r1 = r1.G()
            java.lang.String r2 = "_ev"
            r28 = r1
            r29 = r36
            r30 = r3
            r31 = r2
            r32 = r0
            r33 = r10
            r28.W(r29, r30, r31, r32, r33)
            return
        L_0x021e:
            java.lang.String r0 = "_o"
            java.lang.String r3 = "_sn"
            java.lang.String r4 = "_si"
            java.lang.String[] r5 = new java.lang.String[]{r0, r3, r2, r4}
            java.util.List r17 = com.google.android.gms.common.util.CollectionUtils.d(r5)
            com.google.android.gms.measurement.internal.zzkr r5 = r27.j()
            r6 = 1
            r9 = r5
            r5 = 0
            r10 = r36
            r19 = r11
            r11 = r29
            r12 = r32
            r13 = r17
            r14 = r35
            r15 = r6
            android.os.Bundle r15 = r9.C(r10, r11, r12, r13, r14, r15)
            if (r15 == 0) goto L_0x026d
            boolean r6 = r15.containsKey(r2)
            if (r6 == 0) goto L_0x026d
            boolean r6 = r15.containsKey(r4)
            if (r6 != 0) goto L_0x0253
            goto L_0x026d
        L_0x0253:
            java.lang.String r3 = r15.getString(r3)
            java.lang.String r2 = r15.getString(r2)
            long r9 = r15.getLong(r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r9)
            com.google.android.gms.measurement.internal.zzij r11 = new com.google.android.gms.measurement.internal.zzij
            long r9 = r4.longValue()
            r11.<init>(r3, r2, r9)
            goto L_0x026f
        L_0x026d:
            r11 = r19
        L_0x026f:
            if (r11 != 0) goto L_0x0273
            r14 = r1
            goto L_0x0274
        L_0x0273:
            r14 = r11
        L_0x0274:
            com.google.android.gms.measurement.internal.zzy r1 = r27.l()
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.zzaq.U
            boolean r1 = r1.t(r2)
            java.lang.String r13 = "_ae"
            r9 = 0
            if (r1 == 0) goto L_0x02af
            r27.m()
            com.google.android.gms.measurement.internal.zzii r1 = r27.t()
            com.google.android.gms.measurement.internal.zzij r1 = r1.E(r5)
            if (r1 == 0) goto L_0x02af
            r12 = r29
            boolean r1 = r13.equals(r12)
            if (r1 == 0) goto L_0x02b1
            com.google.android.gms.measurement.internal.zzjv r1 = r27.v()
            com.google.android.gms.measurement.internal.i7 r1 = r1.f10498e
            long r1 = r1.e()
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 <= 0) goto L_0x02b1
            com.google.android.gms.measurement.internal.zzkr r3 = r27.j()
            r3.L(r15, r1)
            goto L_0x02b1
        L_0x02af:
            r12 = r29
        L_0x02b1:
            boolean r1 = com.google.android.gms.internal.measurement.zzkh.b()
            if (r1 == 0) goto L_0x0333
            com.google.android.gms.measurement.internal.zzy r1 = r27.l()
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.zzaq.v0
            boolean r1 = r1.t(r2)
            if (r1 == 0) goto L_0x0333
            java.lang.String r1 = "auto"
            boolean r1 = r1.equals(r8)
            java.lang.String r2 = "_ffr"
            if (r1 != 0) goto L_0x0316
            java.lang.String r1 = "_ssr"
            boolean r1 = r1.equals(r12)
            if (r1 == 0) goto L_0x0316
            com.google.android.gms.measurement.internal.zzkr r1 = r27.j()
            java.lang.String r2 = r15.getString(r2)
            boolean r3 = com.google.android.gms.common.util.Strings.a(r2)
            if (r3 == 0) goto L_0x02e6
            r11 = r19
            goto L_0x02ea
        L_0x02e6:
            java.lang.String r11 = r2.trim()
        L_0x02ea:
            com.google.android.gms.measurement.internal.q3 r2 = r1.k()
            com.google.android.gms.measurement.internal.zzfm r2 = r2.z
            java.lang.String r2 = r2.a()
            boolean r2 = com.google.android.gms.measurement.internal.zzkr.A0(r11, r2)
            if (r2 == 0) goto L_0x0309
            com.google.android.gms.measurement.internal.zzeu r1 = r1.h()
            com.google.android.gms.measurement.internal.zzew r1 = r1.N()
            java.lang.String r2 = "Not logging duplicate session_start_with_rollout event"
            r1.a(r2)
            r1 = 0
            goto L_0x0313
        L_0x0309:
            com.google.android.gms.measurement.internal.q3 r1 = r1.k()
            com.google.android.gms.measurement.internal.zzfm r1 = r1.z
            r1.b(r11)
            r1 = 1
        L_0x0313:
            if (r1 != 0) goto L_0x0333
            return
        L_0x0316:
            boolean r1 = r13.equals(r12)
            if (r1 == 0) goto L_0x0333
            com.google.android.gms.measurement.internal.zzkr r1 = r27.j()
            com.google.android.gms.measurement.internal.q3 r1 = r1.k()
            com.google.android.gms.measurement.internal.zzfm r1 = r1.z
            java.lang.String r1 = r1.a()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x0333
            r15.putString(r2, r1)
        L_0x0333:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r11.add(r15)
            com.google.android.gms.measurement.internal.zzkr r1 = r27.j()
            java.security.SecureRandom r1 = r1.H0()
            long r3 = r1.nextLong()
            com.google.android.gms.measurement.internal.q3 r1 = r27.k()
            com.google.android.gms.measurement.internal.zzfk r1 = r1.u
            long r1 = r1.a()
            int r6 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r6 <= 0) goto L_0x03b7
            com.google.android.gms.measurement.internal.q3 r1 = r27.k()
            r9 = r30
            boolean r1 = r1.w(r9)
            if (r1 == 0) goto L_0x03b9
            com.google.android.gms.measurement.internal.q3 r1 = r27.k()
            com.google.android.gms.measurement.internal.zzfi r1 = r1.w
            boolean r1 = r1.b()
            if (r1 == 0) goto L_0x03b9
            com.google.android.gms.measurement.internal.zzeu r1 = r27.h()
            com.google.android.gms.measurement.internal.zzew r1 = r1.O()
            java.lang.String r2 = "Current session is expired, remove the session number, ID, and engagement time"
            r1.a(r2)
            r6 = 0
            com.google.android.gms.common.util.Clock r1 = r27.n()
            long r19 = r1.a()
            java.lang.String r2 = "auto"
            java.lang.String r21 = "_sid"
            r1 = r27
            r22 = r3
            r3 = r21
            r4 = r6
            r5 = r19
            r1.T(r2, r3, r4, r5)
            r4 = 0
            com.google.android.gms.common.util.Clock r1 = r27.n()
            long r5 = r1.a()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_sno"
            r1 = r27
            r1.T(r2, r3, r4, r5)
            com.google.android.gms.common.util.Clock r1 = r27.n()
            long r5 = r1.a()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_se"
            r1 = r27
            r1.T(r2, r3, r4, r5)
            goto L_0x03bb
        L_0x03b7:
            r9 = r30
        L_0x03b9:
            r22 = r3
        L_0x03bb:
            java.lang.String r1 = "extend_session"
            r2 = 0
            long r1 = r15.getLong(r1, r2)
            r3 = 1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x03e3
            com.google.android.gms.measurement.internal.zzeu r1 = r27.h()
            com.google.android.gms.measurement.internal.zzew r1 = r1.O()
            java.lang.String r2 = "EXTEND_SESSION param attached: initiate a new session or extend the current active session"
            r1.a(r2)
            com.google.android.gms.measurement.internal.zzfy r1 = r7.f10171a
            com.google.android.gms.measurement.internal.zzjv r1 = r1.C()
            com.google.android.gms.measurement.internal.k7 r1 = r1.f10497d
            r5 = 1
            r1.b(r9, r5)
            goto L_0x03e4
        L_0x03e3:
            r5 = 1
        L_0x03e4:
            java.util.Set r1 = r15.keySet()
            int r2 = r15.size()
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.util.Arrays.sort(r1)
            boolean r2 = com.google.android.gms.internal.measurement.zzjw.b()
            if (r2 == 0) goto L_0x0436
            com.google.android.gms.measurement.internal.zzy r2 = r27.l()
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.zzaq.H0
            boolean r2 = r2.t(r3)
            if (r2 == 0) goto L_0x0436
            com.google.android.gms.measurement.internal.zzy r2 = r27.l()
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.zzaq.G0
            boolean r2 = r2.t(r3)
            if (r2 == 0) goto L_0x0436
            int r2 = r1.length
            r3 = 0
        L_0x0417:
            if (r3 >= r2) goto L_0x042e
            r4 = r1[r3]
            r27.j()
            java.lang.Object r6 = r15.get(r4)
            android.os.Bundle[] r6 = com.google.android.gms.measurement.internal.zzkr.w0(r6)
            if (r6 == 0) goto L_0x042b
            r15.putParcelableArray(r4, r6)
        L_0x042b:
            int r3 = r3 + 1
            goto L_0x0417
        L_0x042e:
            r10 = r11
            r11 = r12
            r26 = r13
            r24 = 1
            goto L_0x04f2
        L_0x0436:
            int r2 = r1.length
            r3 = 0
            r4 = 0
        L_0x0439:
            java.lang.String r6 = "_eid"
            if (r3 >= r2) goto L_0x04df
            r5 = r1[r3]
            java.lang.Object r19 = r15.get(r5)
            r27.j()
            r32 = r1
            android.os.Bundle[] r1 = com.google.android.gms.measurement.internal.zzkr.w0(r19)
            r19 = r2
            if (r1 == 0) goto L_0x04be
            int r2 = r1.length
            r15.putInt(r5, r2)
            r2 = 0
        L_0x0455:
            int r9 = r1.length
            if (r2 >= r9) goto L_0x04b0
            r10 = r1[r2]
            r9 = 1
            com.google.android.gms.measurement.internal.zzii.P(r14, r10, r9)
            com.google.android.gms.measurement.internal.zzkr r18 = r27.j()
            r20 = 0
            java.lang.String r21 = "_ep"
            r24 = 1
            r9 = r18
            r18 = r10
            r10 = r36
            r25 = r11
            r11 = r21
            r12 = r18
            r26 = r13
            r13 = r17
            r18 = r14
            r14 = r35
            r7 = r15
            r15 = r20
            android.os.Bundle r9 = r9.C(r10, r11, r12, r13, r14, r15)
            java.lang.String r10 = "_en"
            r11 = r29
            r9.putString(r10, r11)
            r12 = r22
            r9.putLong(r6, r12)
            java.lang.String r10 = "_gn"
            r9.putString(r10, r5)
            int r10 = r1.length
            java.lang.String r14 = "_ll"
            r9.putInt(r14, r10)
            java.lang.String r10 = "_i"
            r9.putInt(r10, r2)
            r10 = r25
            r10.add(r9)
            int r2 = r2 + 1
            r15 = r7
            r14 = r18
            r13 = r26
            r7 = r27
            r12 = r11
            r11 = r10
            goto L_0x0455
        L_0x04b0:
            r10 = r11
            r11 = r12
            r26 = r13
            r18 = r14
            r7 = r15
            r12 = r22
            r24 = 1
            int r1 = r1.length
            int r4 = r4 + r1
            goto L_0x04c9
        L_0x04be:
            r10 = r11
            r11 = r12
            r26 = r13
            r18 = r14
            r7 = r15
            r12 = r22
            r24 = 1
        L_0x04c9:
            int r3 = r3 + 1
            r1 = r32
            r15 = r7
            r22 = r12
            r14 = r18
            r2 = r19
            r13 = r26
            r5 = 1
            r7 = r27
            r12 = r11
            r11 = r10
            r9 = r30
            goto L_0x0439
        L_0x04df:
            r10 = r11
            r11 = r12
            r26 = r13
            r7 = r15
            r12 = r22
            r24 = 1
            if (r4 == 0) goto L_0x04f2
            r7.putLong(r6, r12)
            java.lang.String r1 = "_epc"
            r7.putInt(r1, r4)
        L_0x04f2:
            r7 = 0
        L_0x04f3:
            int r1 = r10.size()
            if (r7 >= r1) goto L_0x055b
            java.lang.Object r1 = r10.get(r7)
            android.os.Bundle r1 = (android.os.Bundle) r1
            if (r7 == 0) goto L_0x0503
            r2 = 1
            goto L_0x0504
        L_0x0503:
            r2 = 0
        L_0x0504:
            if (r2 == 0) goto L_0x0509
            java.lang.String r2 = "_ep"
            goto L_0x050a
        L_0x0509:
            r2 = r11
        L_0x050a:
            r1.putString(r0, r8)
            if (r34 == 0) goto L_0x0517
            com.google.android.gms.measurement.internal.zzkr r3 = r27.j()
            android.os.Bundle r1 = r3.B(r1)
        L_0x0517:
            r9 = r1
            com.google.android.gms.measurement.internal.zzao r12 = new com.google.android.gms.measurement.internal.zzao
            com.google.android.gms.measurement.internal.zzan r3 = new com.google.android.gms.measurement.internal.zzan
            r3.<init>(r9)
            r1 = r12
            r4 = r28
            r13 = 1
            r5 = r30
            r1.<init>(r2, r3, r4, r5)
            com.google.android.gms.measurement.internal.zzir r1 = r27.s()
            r14 = r36
            r1.L(r12, r14)
            r12 = r27
            if (r16 != 0) goto L_0x0556
            java.util.Set<com.google.android.gms.measurement.internal.zzha> r1 = r12.f10470e
            java.util.Iterator r15 = r1.iterator()
        L_0x053b:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x0556
            java.lang.Object r1 = r15.next()
            com.google.android.gms.measurement.internal.zzha r1 = (com.google.android.gms.measurement.internal.zzha) r1
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>(r9)
            r2 = r28
            r3 = r29
            r5 = r30
            r1.a(r2, r3, r4, r5)
            goto L_0x053b
        L_0x0556:
            int r7 = r7 + 1
            r24 = 1
            goto L_0x04f3
        L_0x055b:
            r12 = r27
            r13 = 1
            r27.m()
            com.google.android.gms.measurement.internal.zzii r0 = r27.t()
            r1 = 0
            com.google.android.gms.measurement.internal.zzij r0 = r0.E(r1)
            if (r0 == 0) goto L_0x0583
            r0 = r26
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x0583
            com.google.android.gms.measurement.internal.zzjv r0 = r27.v()
            com.google.android.gms.common.util.Clock r1 = r27.n()
            long r1 = r1.b()
            r0.F(r13, r13, r1)
        L_0x0583:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzhc.P(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    public final void R(String str, String str2, Bundle bundle) {
        S(str, str2, bundle, true, true, n().a());
    }

    public final void S(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        a();
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (l().t(zzaq.D0)) {
            String str4 = str2;
            if (zzkr.A0(str2, "screen_view")) {
                t().K(bundle2);
                return;
            }
        } else {
            String str5 = str2;
        }
        q0(str3, str2, j, bundle2, z2, !z2 || this.f10469d == null || zzkr.C0(str2), !z, (String) null);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void T(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            com.google.android.gms.common.internal.Preconditions.g(r9)
            com.google.android.gms.common.internal.Preconditions.g(r10)
            r8.c()
            r8.a()
            r8.y()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L_0x0063
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L_0x0053
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x0053
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.lang.String r10 = r0.toLowerCase(r10)
            java.lang.String r11 = "false"
            boolean r10 = r11.equals(r10)
            r2 = 1
            if (r10 == 0) goto L_0x0038
            r4 = r2
            goto L_0x003a
        L_0x0038:
            r4 = 0
        L_0x003a:
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            com.google.android.gms.measurement.internal.q3 r0 = r8.k()
            com.google.android.gms.measurement.internal.zzfm r0 = r0.s
            long r4 = r10.longValue()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x004e
            java.lang.String r11 = "true"
        L_0x004e:
            r0.b(r11)
            r6 = r10
            goto L_0x0061
        L_0x0053:
            if (r11 != 0) goto L_0x0063
            com.google.android.gms.measurement.internal.q3 r10 = r8.k()
            com.google.android.gms.measurement.internal.zzfm r10 = r10.s
            java.lang.String r0 = "unset"
            r10.b(r0)
            r6 = r11
        L_0x0061:
            r3 = r1
            goto L_0x0065
        L_0x0063:
            r3 = r10
            r6 = r11
        L_0x0065:
            com.google.android.gms.measurement.internal.zzfy r10 = r8.f10171a
            boolean r10 = r10.p()
            if (r10 != 0) goto L_0x007b
            com.google.android.gms.measurement.internal.zzeu r9 = r8.h()
            com.google.android.gms.measurement.internal.zzew r9 = r9.O()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.a(r10)
            return
        L_0x007b:
            com.google.android.gms.measurement.internal.zzfy r10 = r8.f10171a
            boolean r10 = r10.u()
            if (r10 != 0) goto L_0x0084
            return
        L_0x0084:
            com.google.android.gms.measurement.internal.zzkq r10 = new com.google.android.gms.measurement.internal.zzkq
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            com.google.android.gms.measurement.internal.zzir r9 = r8.s()
            r9.Q(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzhc.T(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    public final void U(String str, String str2, Object obj, boolean z) {
        V(str, str2, obj, true, n().a());
    }

    public final void V(String str, String str2, Object obj, boolean z, long j) {
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        int i2 = 6;
        int i3 = 0;
        if (z) {
            i2 = j().x0(str2);
        } else {
            zzkr j2 = j();
            if (j2.g0("user property", str2)) {
                if (!j2.l0("user property", zzgy.f10462a, str2)) {
                    i2 = 15;
                } else if (j2.f0("user property", 24, str2)) {
                    i2 = 0;
                }
            }
        }
        if (i2 != 0) {
            j();
            String H = zzkr.H(str2, 24, true);
            if (str2 != null) {
                i3 = str2.length();
            }
            this.f10171a.G().J(i2, "_ev", H, i3);
        } else if (obj != null) {
            int p0 = j().p0(str2, obj);
            if (p0 != 0) {
                j();
                String H2 = zzkr.H(str2, 24, true);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    i3 = String.valueOf(obj).length();
                }
                this.f10171a.G().J(p0, "_ev", H2, i3);
                return;
            }
            Object y0 = j().y0(str2, obj);
            if (y0 != null) {
                Q(str3, str2, j, y0);
            }
        } else {
            Q(str3, str2, j, (Object) null);
        }
    }

    public final void W(String str, String str2, String str3, Bundle bundle) {
        Preconditions.g(str);
        o();
        throw null;
    }

    public final void X(boolean z) {
        y();
        a();
        g().z(new j5(this, z));
    }

    public final void Y() {
        if (f().getApplicationContext() instanceof Application) {
            ((Application) f().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f10468c);
        }
    }

    public final Boolean Z() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) g().v(atomicReference, 15000, "boolean test flag value", new x4(this, atomicReference));
    }

    public final String a0() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) g().v(atomicReference, 15000, "String test flag value", new d5(this, atomicReference));
    }

    public final Long b0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) g().v(atomicReference, 15000, "long test flag value", new i5(this, atomicReference));
    }

    public final Integer c0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) g().v(atomicReference, 15000, "int test flag value", new h5(this, atomicReference));
    }

    public final Double d0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) g().v(atomicReference, 15000, "double test flag value", new k5(this, atomicReference));
    }

    public final String e0() {
        a();
        return this.g.get();
    }

    public final void f0() {
        c();
        a();
        y();
        if (this.f10171a.u()) {
            if (l().t(zzaq.h0)) {
                zzy l = l();
                l.m();
                Boolean B = l.B("google_analytics_deferred_deep_link_enabled");
                if (B != null && B.booleanValue()) {
                    h().N().a("Deferred Deep Link feature enabled.");
                    g().z(new u4(this));
                }
            }
            s().Z();
            this.i = false;
            String I = k().I();
            if (!TextUtils.isEmpty(I)) {
                d().p();
                if (!I.equals(Build.VERSION.RELEASE)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", I);
                    R("auto", "_ou", bundle);
                }
            }
        }
    }

    public final String g0() {
        zzij T = this.f10171a.O().T();
        if (T != null) {
            return T.f10483a;
        }
        return null;
    }

    public final String h0() {
        zzij T = this.f10171a.O().T();
        if (T != null) {
            return T.f10484b;
        }
        return null;
    }

    public final String i0() {
        if (this.f10171a.K() != null) {
            return this.f10171a.K();
        }
        try {
            return new StringResourceValueReader(f()).a("google_app_id");
        } catch (IllegalStateException e2) {
            this.f10171a.h().G().b("getGoogleAppId failed with exception", e2);
            return null;
        }
    }

    public final void m0(Bundle bundle) {
        Preconditions.k(bundle);
        Preconditions.g(bundle.getString("app_id"));
        o();
        throw null;
    }

    public final void o0(zzha zzha) {
        a();
        y();
        Preconditions.k(zzha);
        if (!this.f10470e.remove(zzha)) {
            h().J().a("OnEventListener had not been registered");
        }
    }

    /* access modifiers changed from: package-private */
    public final void r0(String str, String str2, Bundle bundle) {
        a();
        c();
        O(str, str2, n().a(), bundle);
    }

    public final void u0(String str, String str2, Bundle bundle) {
        a();
        s0((String) null, str, str2, bundle);
    }
}
