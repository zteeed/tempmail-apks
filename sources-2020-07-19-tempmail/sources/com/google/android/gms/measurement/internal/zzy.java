package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzjq;
import com.google.android.gms.internal.measurement.zzmd;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzy extends p4 {

    /* renamed from: b  reason: collision with root package name */
    private Boolean f10534b;

    /* renamed from: c  reason: collision with root package name */
    private a f10535c = b.f9922a;

    /* renamed from: d  reason: collision with root package name */
    private Boolean f10536d;

    zzy(zzfy zzfy) {
        super(zzfy);
    }

    public static long N() {
        return zzaq.D.a(null).longValue();
    }

    public static long O() {
        return zzaq.f10384d.a(null).longValue();
    }

    @VisibleForTesting
    private final Bundle S() {
        try {
            if (f().getPackageManager() == null) {
                h().G().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo c2 = Wrappers.a(f()).c(f().getPackageName(), 128);
            if (c2 != null) {
                return c2.metaData;
            }
            h().G().a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            h().G().b("Failed to load metadata: Package name not found", e2);
            return null;
        }
    }

    private final String i(String str, String str2) {
        Class<String> cls = String.class;
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{cls, cls}).invoke((Object) null, new Object[]{str, str2});
        } catch (ClassNotFoundException e2) {
            h().G().b("Could not find SystemProperties class", e2);
            return str2;
        } catch (NoSuchMethodException e3) {
            h().G().b("Could not find SystemProperties.get() method", e3);
            return str2;
        } catch (IllegalAccessException e4) {
            h().G().b("Could not access SystemProperties.get()", e4);
            return str2;
        } catch (InvocationTargetException e5) {
            h().G().b("SystemProperties.get() threw an exception", e5);
            return str2;
        }
    }

    private final int p(String str, zzen<Integer> zzen, int i, int i2) {
        return Math.max(Math.min(v(str, zzen), i2), i);
    }

    public final int A() {
        if (!zzjq.b() || !l().z((String) null, zzaq.L0) || j().K0() < 201500) {
            return 25;
        }
        return 100;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final Boolean B(String str) {
        Preconditions.g(str);
        Bundle S = S();
        if (S == null) {
            h().G().a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (!S.containsKey(str)) {
            return null;
        } else {
            return Boolean.valueOf(S.getBoolean(str));
        }
    }

    public final boolean C(String str, zzen<Boolean> zzen) {
        return z(str, zzen);
    }

    public final long D() {
        m();
        return 29000;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b A[SYNTHETIC, Splitter:B:9:0x002b] */
    @com.google.android.gms.common.util.VisibleForTesting
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.String> E(java.lang.String r4) {
        /*
            r3 = this;
            com.google.android.gms.common.internal.Preconditions.g(r4)
            android.os.Bundle r0 = r3.S()
            r1 = 0
            if (r0 != 0) goto L_0x0019
            com.google.android.gms.measurement.internal.zzeu r4 = r3.h()
            com.google.android.gms.measurement.internal.zzew r4 = r4.G()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.a(r0)
        L_0x0017:
            r4 = r1
            goto L_0x0028
        L_0x0019:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L_0x0020
            goto L_0x0017
        L_0x0020:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L_0x0028:
            if (r4 != 0) goto L_0x002b
            return r1
        L_0x002b:
            android.content.Context r0 = r3.f()     // Catch:{ NotFoundException -> 0x0043 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ NotFoundException -> 0x0043 }
            int r4 = r4.intValue()     // Catch:{ NotFoundException -> 0x0043 }
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch:{ NotFoundException -> 0x0043 }
            if (r4 != 0) goto L_0x003e
            return r1
        L_0x003e:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch:{ NotFoundException -> 0x0043 }
            return r4
        L_0x0043:
            r4 = move-exception
            com.google.android.gms.measurement.internal.zzeu r0 = r3.h()
            com.google.android.gms.measurement.internal.zzew r0 = r0.G()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.b(r2, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzy.E(java.lang.String):java.util.List");
    }

    public final boolean F() {
        if (this.f10536d == null) {
            synchronized (this) {
                if (this.f10536d == null) {
                    ApplicationInfo applicationInfo = f().getApplicationInfo();
                    String a2 = ProcessUtils.a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        this.f10536d = Boolean.valueOf(str != null && str.equals(a2));
                    }
                    if (this.f10536d == null) {
                        this.f10536d = Boolean.TRUE;
                        h().G().a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f10536d.booleanValue();
    }

    public final boolean G(String str) {
        return "1".equals(this.f10535c.i(str, "gaia_collection_enabled"));
    }

    public final boolean H() {
        m();
        Boolean B = B("firebase_analytics_collection_deactivated");
        return B != null && B.booleanValue();
    }

    public final boolean I(String str) {
        return "1".equals(this.f10535c.i(str, "measurement.event_sampling_enabled"));
    }

    public final Boolean J() {
        a();
        Boolean B = B("google_analytics_adid_collection_enabled");
        return Boolean.valueOf(B == null || B.booleanValue());
    }

    /* access modifiers changed from: package-private */
    public final boolean K(String str) {
        return z(str, zzaq.K);
    }

    public final Boolean L() {
        a();
        if (!zzmd.b() || !t(zzaq.C0)) {
            return Boolean.TRUE;
        }
        Boolean B = B("google_analytics_automatic_screen_reporting_enabled");
        return Boolean.valueOf(B == null || B.booleanValue());
    }

    /* access modifiers changed from: package-private */
    public final String M(String str) {
        zzen<String> zzen = zzaq.L;
        if (str == null) {
            return zzen.a(null);
        }
        return zzen.a(this.f10535c.i(str, zzen.b()));
    }

    public final String P() {
        return i("debug.firebase.analytics.app", "");
    }

    public final String Q() {
        return i("debug.deferred.deeplink", "");
    }

    /* access modifiers changed from: package-private */
    public final boolean R() {
        if (this.f10534b == null) {
            Boolean B = B("app_measurement_lite");
            this.f10534b = B;
            if (B == null) {
                this.f10534b = Boolean.FALSE;
            }
        }
        return this.f10534b.booleanValue() || !this.f10171a.N();
    }

    public final int o(String str) {
        return p(str, zzaq.I, 25, 100);
    }

    public final long q(String str, zzen<Long> zzen) {
        if (str == null) {
            return zzen.a(null).longValue();
        }
        String i = this.f10535c.i(str, zzen.b());
        if (TextUtils.isEmpty(i)) {
            return zzen.a(null).longValue();
        }
        try {
            return zzen.a(Long.valueOf(Long.parseLong(i))).longValue();
        } catch (NumberFormatException unused) {
            return zzen.a(null).longValue();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002d, code lost:
        if (android.text.TextUtils.isEmpty(r1) != false) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String r(com.google.android.gms.measurement.internal.k3 r6) {
        /*
            r5 = this;
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            java.lang.String r1 = r6.A()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x0033
            boolean r1 = com.google.android.gms.internal.measurement.zzlm.b()
            if (r1 == 0) goto L_0x002f
            com.google.android.gms.measurement.internal.zzy r1 = r5.l()
            java.lang.String r2 = r6.t()
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.zzaq.o0
            boolean r1 = r1.z(r2, r3)
            if (r1 == 0) goto L_0x002f
            java.lang.String r1 = r6.G()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x0033
        L_0x002f:
            java.lang.String r1 = r6.D()
        L_0x0033:
            com.google.android.gms.measurement.internal.zzen<java.lang.String> r2 = com.google.android.gms.measurement.internal.zzaq.f10385e
            r3 = 0
            java.lang.Object r2 = r2.a(r3)
            java.lang.String r2 = (java.lang.String) r2
            android.net.Uri$Builder r2 = r0.scheme(r2)
            com.google.android.gms.measurement.internal.zzen<java.lang.String> r4 = com.google.android.gms.measurement.internal.zzaq.f10386f
            java.lang.Object r3 = r4.a(r3)
            java.lang.String r3 = (java.lang.String) r3
            android.net.Uri$Builder r2 = r2.encodedAuthority(r3)
            java.lang.String r3 = "config/app/"
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r4 = r1.length()
            if (r4 == 0) goto L_0x005d
            java.lang.String r1 = r3.concat(r1)
            goto L_0x0062
        L_0x005d:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r3)
        L_0x0062:
            android.net.Uri$Builder r1 = r2.path(r1)
            java.lang.String r6 = r6.x()
            java.lang.String r2 = "app_instance_id"
            android.net.Uri$Builder r6 = r1.appendQueryParameter(r2, r6)
            java.lang.String r1 = "platform"
            java.lang.String r2 = "android"
            android.net.Uri$Builder r6 = r6.appendQueryParameter(r1, r2)
            long r1 = r5.D()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "gmp_version"
            r6.appendQueryParameter(r2, r1)
            android.net.Uri r6 = r0.build()
            java.lang.String r6 = r6.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzy.r(com.google.android.gms.measurement.internal.k3):java.lang.String");
    }

    /* access modifiers changed from: package-private */
    public final void s(a aVar) {
        this.f10535c = aVar;
    }

    public final boolean t(zzen<Boolean> zzen) {
        return z((String) null, zzen);
    }

    /* access modifiers changed from: package-private */
    public final int u(String str) {
        if (!zzjq.b() || !z((String) null, zzaq.K0)) {
            return 500;
        }
        return p(str, zzaq.H, 500, 2000);
    }

    public final int v(String str, zzen<Integer> zzen) {
        if (str == null) {
            return zzen.a(null).intValue();
        }
        String i = this.f10535c.i(str, zzen.b());
        if (TextUtils.isEmpty(i)) {
            return zzen.a(null).intValue();
        }
        try {
            return zzen.a(Integer.valueOf(Integer.parseInt(i))).intValue();
        } catch (NumberFormatException unused) {
            return zzen.a(null).intValue();
        }
    }

    public final double w(String str, zzen<Double> zzen) {
        if (str == null) {
            return zzen.a(null).doubleValue();
        }
        String i = this.f10535c.i(str, zzen.b());
        if (TextUtils.isEmpty(i)) {
            return zzen.a(null).doubleValue();
        }
        try {
            return zzen.a(Double.valueOf(Double.parseDouble(i))).doubleValue();
        } catch (NumberFormatException unused) {
            return zzen.a(null).doubleValue();
        }
    }

    public final int x(String str) {
        return v(str, zzaq.o);
    }

    /* access modifiers changed from: package-private */
    public final int y(String str) {
        if (!zzjq.b() || !z((String) null, zzaq.K0)) {
            return 25;
        }
        return p(str, zzaq.G, 25, 100);
    }

    public final boolean z(String str, zzen<Boolean> zzen) {
        if (str == null) {
            return zzen.a(null).booleanValue();
        }
        String i = this.f10535c.i(str, zzen.b());
        if (TextUtils.isEmpty(i)) {
            return zzen.a(null).booleanValue();
        }
        return zzen.a(Boolean.valueOf(Boolean.parseBoolean(i))).booleanValue();
    }
}
