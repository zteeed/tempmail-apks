package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzlm;
import com.google.android.gms.internal.measurement.zznh;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzer extends x3 {

    /* renamed from: c  reason: collision with root package name */
    private String f10581c;

    /* renamed from: d  reason: collision with root package name */
    private String f10582d;

    /* renamed from: e  reason: collision with root package name */
    private int f10583e;

    /* renamed from: f  reason: collision with root package name */
    private String f10584f;
    private long g;
    private long h;
    private List<String> i;
    private int j;
    private String k;
    private String l;
    private String m;

    zzer(zzfy zzfy, long j2) {
        super(zzfy);
        this.h = j2;
    }

    @VisibleForTesting
    private final String K() {
        if (!zznh.b() || !l().t(zzaq.r0)) {
            try {
                Class<?> loadClass = f().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                if (loadClass == null) {
                    return null;
                }
                try {
                    Object invoke = loadClass.getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{f()});
                    if (invoke == null) {
                        return null;
                    }
                    try {
                        return (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(invoke, new Object[0]);
                    } catch (Exception unused) {
                        h().L().a("Failed to retrieve Firebase Instance Id");
                        return null;
                    }
                } catch (Exception unused2) {
                    h().K().a("Failed to obtain Firebase Analytics instance");
                    return null;
                }
            } catch (ClassNotFoundException unused3) {
                return null;
            }
        } else {
            h().O().a("Disabled IID for tests.");
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final boolean B() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final zzn C(String str) {
        String str2;
        long j2;
        boolean z;
        Boolean bool;
        c();
        a();
        String D = D();
        String E = E();
        y();
        String str3 = this.f10582d;
        long H = (long) H();
        y();
        String str4 = this.f10584f;
        long D2 = l().D();
        y();
        c();
        if (this.g == 0) {
            this.g = this.f10357a.G().x(f(), f().getPackageName());
        }
        long j3 = this.g;
        boolean p = this.f10357a.p();
        boolean z2 = !k().v;
        c();
        a();
        if (!this.f10357a.p()) {
            str2 = null;
        } else {
            str2 = K();
        }
        zzfy zzfy = this.f10357a;
        Long valueOf = Long.valueOf(zzfy.A().j.a());
        if (valueOf.longValue() == 0) {
            j2 = zzfy.F;
            z = p;
        } else {
            z = p;
            j2 = Math.min(zzfy.F, valueOf.longValue());
        }
        int I = I();
        boolean booleanValue = l().J().booleanValue();
        zzy l2 = l();
        l2.a();
        Boolean B = l2.B("google_analytics_ssaid_collection_enabled");
        boolean booleanValue2 = Boolean.valueOf(B == null || B.booleanValue()).booleanValue();
        q3 k2 = k();
        k2.c();
        boolean z3 = k2.C().getBoolean("deferred_analytics_collection", false);
        String F = F();
        Boolean B2 = l().B("google_analytics_default_allow_ad_personalization_signals");
        if (B2 == null) {
            bool = null;
        } else {
            bool = Boolean.valueOf(!B2.booleanValue());
        }
        return new zzn(D, E, str3, H, str4, D2, j3, str, z, z2, str2, 0, j2, I, booleanValue, booleanValue2, z3, F, bool, this.h, l().t(zzaq.c0) ? this.i : null, (!zzlm.b() || !l().t(zzaq.o0)) ? null : G());
    }

    /* access modifiers changed from: package-private */
    public final String D() {
        y();
        return this.f10581c;
    }

    /* access modifiers changed from: package-private */
    public final String E() {
        y();
        return this.k;
    }

    /* access modifiers changed from: package-private */
    public final String F() {
        y();
        return this.l;
    }

    /* access modifiers changed from: package-private */
    public final String G() {
        y();
        return this.m;
    }

    /* access modifiers changed from: package-private */
    public final int H() {
        y();
        return this.f10583e;
    }

    /* access modifiers changed from: package-private */
    public final int I() {
        y();
        return this.j;
    }

    /* access modifiers changed from: package-private */
    public final List<String> J() {
        return this.i;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02b7  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02c7  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01b8 A[Catch:{ IllegalStateException -> 0x024b }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01c8 A[Catch:{ IllegalStateException -> 0x024b }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01d2 A[Catch:{ IllegalStateException -> 0x024b }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01d4 A[Catch:{ IllegalStateException -> 0x024b }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01df A[SYNTHETIC, Splitter:B:75:0x01df] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x021d A[Catch:{ IllegalStateException -> 0x024b }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x022e A[Catch:{ IllegalStateException -> 0x024b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void w() {
        /*
            r11 = this;
            android.content.Context r0 = r11.f()
            java.lang.String r0 = r0.getPackageName()
            android.content.Context r1 = r11.f()
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r2 = "Unknown"
            java.lang.String r3 = ""
            r4 = 0
            java.lang.String r5 = "unknown"
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != 0) goto L_0x002d
            com.google.android.gms.measurement.internal.zzeu r7 = r11.h()
            com.google.android.gms.measurement.internal.zzew r7 = r7.G()
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzeu.x(r0)
            java.lang.String r9 = "PackageManager is null, app identity information might be inaccurate. appId"
            r7.b(r9, r8)
            goto L_0x008c
        L_0x002d:
            java.lang.String r5 = r1.getInstallerPackageName(r0)     // Catch:{ IllegalArgumentException -> 0x0032 }
            goto L_0x0043
        L_0x0032:
            com.google.android.gms.measurement.internal.zzeu r7 = r11.h()
            com.google.android.gms.measurement.internal.zzew r7 = r7.G()
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzeu.x(r0)
            java.lang.String r9 = "Error retrieving app installer package name. appId"
            r7.b(r9, r8)
        L_0x0043:
            if (r5 != 0) goto L_0x0048
            java.lang.String r5 = "manual_install"
            goto L_0x0051
        L_0x0048:
            java.lang.String r7 = "com.android.vending"
            boolean r7 = r7.equals(r5)
            if (r7 == 0) goto L_0x0051
            r5 = r3
        L_0x0051:
            android.content.Context r7 = r11.f()     // Catch:{ NameNotFoundException -> 0x0079 }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x0079 }
            android.content.pm.PackageInfo r7 = r1.getPackageInfo(r7, r4)     // Catch:{ NameNotFoundException -> 0x0079 }
            if (r7 == 0) goto L_0x008c
            android.content.pm.ApplicationInfo r8 = r7.applicationInfo     // Catch:{ NameNotFoundException -> 0x0079 }
            java.lang.CharSequence r8 = r1.getApplicationLabel(r8)     // Catch:{ NameNotFoundException -> 0x0079 }
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ NameNotFoundException -> 0x0079 }
            if (r9 != 0) goto L_0x0070
            java.lang.String r8 = r8.toString()     // Catch:{ NameNotFoundException -> 0x0079 }
            goto L_0x0071
        L_0x0070:
            r8 = r2
        L_0x0071:
            java.lang.String r2 = r7.versionName     // Catch:{ NameNotFoundException -> 0x0076 }
            int r6 = r7.versionCode     // Catch:{ NameNotFoundException -> 0x0076 }
            goto L_0x008c
        L_0x0076:
            r7 = r2
            r2 = r8
            goto L_0x007a
        L_0x0079:
            r7 = r2
        L_0x007a:
            com.google.android.gms.measurement.internal.zzeu r8 = r11.h()
            com.google.android.gms.measurement.internal.zzew r8 = r8.G()
            java.lang.Object r9 = com.google.android.gms.measurement.internal.zzeu.x(r0)
            java.lang.String r10 = "Error retrieving package info. appId, appName"
            r8.c(r10, r9, r2)
            r2 = r7
        L_0x008c:
            r11.f10581c = r0
            r11.f10584f = r5
            r11.f10582d = r2
            r11.f10583e = r6
            r5 = 0
            r11.g = r5
            r11.m()
            android.content.Context r2 = r11.f()
            com.google.android.gms.common.api.Status r2 = com.google.android.gms.common.api.internal.GoogleServices.c(r2)
            r5 = 1
            if (r2 == 0) goto L_0x00ae
            boolean r6 = r2.B()
            if (r6 == 0) goto L_0x00ae
            r6 = 1
            goto L_0x00af
        L_0x00ae:
            r6 = 0
        L_0x00af:
            com.google.android.gms.measurement.internal.zzfy r7 = r11.f10357a
            java.lang.String r7 = r7.K()
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L_0x00cb
            com.google.android.gms.measurement.internal.zzfy r7 = r11.f10357a
            java.lang.String r7 = r7.L()
            java.lang.String r8 = "am"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x00cb
            r7 = 1
            goto L_0x00cc
        L_0x00cb:
            r7 = 0
        L_0x00cc:
            r6 = r6 | r7
            if (r6 != 0) goto L_0x00f8
            if (r2 != 0) goto L_0x00df
            com.google.android.gms.measurement.internal.zzeu r2 = r11.h()
            com.google.android.gms.measurement.internal.zzew r2 = r2.H()
            java.lang.String r8 = "GoogleService failed to initialize (no status)"
            r2.a(r8)
            goto L_0x00f8
        L_0x00df:
            com.google.android.gms.measurement.internal.zzeu r8 = r11.h()
            com.google.android.gms.measurement.internal.zzew r8 = r8.H()
            int r9 = r2.u()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r2 = r2.v()
            java.lang.String r10 = "GoogleService failed to initialize, status"
            r8.c(r10, r9, r2)
        L_0x00f8:
            if (r6 == 0) goto L_0x0192
            com.google.android.gms.measurement.internal.zzfy r2 = r11.f10357a
            int r2 = r2.q()
            switch(r2) {
                case 0: goto L_0x0181;
                case 1: goto L_0x0173;
                case 2: goto L_0x0165;
                case 3: goto L_0x0157;
                case 4: goto L_0x0149;
                case 5: goto L_0x013b;
                case 6: goto L_0x012d;
                case 7: goto L_0x011f;
                default: goto L_0x0103;
            }
        L_0x0103:
            com.google.android.gms.measurement.internal.zzeu r6 = r11.h()
            com.google.android.gms.measurement.internal.zzew r6 = r6.M()
            java.lang.String r8 = "App measurement disabled"
            r6.a(r8)
            com.google.android.gms.measurement.internal.zzeu r6 = r11.h()
            com.google.android.gms.measurement.internal.zzew r6 = r6.H()
            java.lang.String r8 = "Invalid scion state in identity"
            r6.a(r8)
            goto L_0x018e
        L_0x011f:
            com.google.android.gms.measurement.internal.zzeu r6 = r11.h()
            com.google.android.gms.measurement.internal.zzew r6 = r6.M()
            java.lang.String r8 = "App measurement disabled via the global data collection setting"
            r6.a(r8)
            goto L_0x018e
        L_0x012d:
            com.google.android.gms.measurement.internal.zzeu r6 = r11.h()
            com.google.android.gms.measurement.internal.zzew r6 = r6.L()
            java.lang.String r8 = "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics"
            r6.a(r8)
            goto L_0x018e
        L_0x013b:
            com.google.android.gms.measurement.internal.zzeu r6 = r11.h()
            com.google.android.gms.measurement.internal.zzew r6 = r6.O()
            java.lang.String r8 = "App measurement disabled via the init parameters"
            r6.a(r8)
            goto L_0x018e
        L_0x0149:
            com.google.android.gms.measurement.internal.zzeu r6 = r11.h()
            com.google.android.gms.measurement.internal.zzew r6 = r6.M()
            java.lang.String r8 = "App measurement disabled via the manifest"
            r6.a(r8)
            goto L_0x018e
        L_0x0157:
            com.google.android.gms.measurement.internal.zzeu r6 = r11.h()
            com.google.android.gms.measurement.internal.zzew r6 = r6.M()
            java.lang.String r8 = "App measurement disabled by setAnalyticsCollectionEnabled(false)"
            r6.a(r8)
            goto L_0x018e
        L_0x0165:
            com.google.android.gms.measurement.internal.zzeu r6 = r11.h()
            com.google.android.gms.measurement.internal.zzew r6 = r6.O()
            java.lang.String r8 = "App measurement deactivated via the init parameters"
            r6.a(r8)
            goto L_0x018e
        L_0x0173:
            com.google.android.gms.measurement.internal.zzeu r6 = r11.h()
            com.google.android.gms.measurement.internal.zzew r6 = r6.M()
            java.lang.String r8 = "App measurement deactivated via the manifest"
            r6.a(r8)
            goto L_0x018e
        L_0x0181:
            com.google.android.gms.measurement.internal.zzeu r6 = r11.h()
            com.google.android.gms.measurement.internal.zzew r6 = r6.O()
            java.lang.String r8 = "App measurement collection enabled"
            r6.a(r8)
        L_0x018e:
            if (r2 != 0) goto L_0x0192
            r2 = 1
            goto L_0x0193
        L_0x0192:
            r2 = 0
        L_0x0193:
            r11.k = r3
            r11.l = r3
            r11.m = r3
            r11.m()
            if (r7 == 0) goto L_0x01a6
            com.google.android.gms.measurement.internal.zzfy r6 = r11.f10357a
            java.lang.String r6 = r6.K()
            r11.l = r6
        L_0x01a6:
            boolean r6 = com.google.android.gms.internal.measurement.zznb.b()     // Catch:{ IllegalStateException -> 0x024b }
            if (r6 == 0) goto L_0x01c8
            com.google.android.gms.measurement.internal.zzy r6 = r11.l()     // Catch:{ IllegalStateException -> 0x024b }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.zzaq.Q0     // Catch:{ IllegalStateException -> 0x024b }
            boolean r6 = r6.t(r7)     // Catch:{ IllegalStateException -> 0x024b }
            if (r6 == 0) goto L_0x01c8
            android.content.Context r6 = r11.f()     // Catch:{ IllegalStateException -> 0x024b }
            java.lang.String r7 = "google_app_id"
            com.google.android.gms.common.internal.StringResourceValueReader r8 = new com.google.android.gms.common.internal.StringResourceValueReader     // Catch:{ IllegalStateException -> 0x024b }
            r8.<init>(r6)     // Catch:{ IllegalStateException -> 0x024b }
            java.lang.String r6 = r8.a(r7)     // Catch:{ IllegalStateException -> 0x024b }
            goto L_0x01cc
        L_0x01c8:
            java.lang.String r6 = com.google.android.gms.common.api.internal.GoogleServices.b()     // Catch:{ IllegalStateException -> 0x024b }
        L_0x01cc:
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ IllegalStateException -> 0x024b }
            if (r7 == 0) goto L_0x01d4
            r7 = r3
            goto L_0x01d5
        L_0x01d4:
            r7 = r6
        L_0x01d5:
            r11.k = r7     // Catch:{ IllegalStateException -> 0x024b }
            boolean r7 = com.google.android.gms.internal.measurement.zzlm.b()     // Catch:{ IllegalStateException -> 0x024b }
            java.lang.String r8 = "admob_app_id"
            if (r7 == 0) goto L_0x0217
            com.google.android.gms.measurement.internal.zzy r7 = r11.l()     // Catch:{ IllegalStateException -> 0x024b }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r9 = com.google.android.gms.measurement.internal.zzaq.o0     // Catch:{ IllegalStateException -> 0x024b }
            boolean r7 = r7.t(r9)     // Catch:{ IllegalStateException -> 0x024b }
            if (r7 == 0) goto L_0x0217
            com.google.android.gms.common.internal.StringResourceValueReader r7 = new com.google.android.gms.common.internal.StringResourceValueReader     // Catch:{ IllegalStateException -> 0x024b }
            android.content.Context r9 = r11.f()     // Catch:{ IllegalStateException -> 0x024b }
            r7.<init>(r9)     // Catch:{ IllegalStateException -> 0x024b }
            java.lang.String r9 = "ga_app_id"
            java.lang.String r9 = r7.a(r9)     // Catch:{ IllegalStateException -> 0x024b }
            boolean r10 = android.text.TextUtils.isEmpty(r9)     // Catch:{ IllegalStateException -> 0x024b }
            if (r10 == 0) goto L_0x0201
            goto L_0x0202
        L_0x0201:
            r3 = r9
        L_0x0202:
            r11.m = r3     // Catch:{ IllegalStateException -> 0x024b }
            boolean r3 = android.text.TextUtils.isEmpty(r6)     // Catch:{ IllegalStateException -> 0x024b }
            if (r3 == 0) goto L_0x0210
            boolean r3 = android.text.TextUtils.isEmpty(r9)     // Catch:{ IllegalStateException -> 0x024b }
            if (r3 != 0) goto L_0x022c
        L_0x0210:
            java.lang.String r3 = r7.a(r8)     // Catch:{ IllegalStateException -> 0x024b }
            r11.l = r3     // Catch:{ IllegalStateException -> 0x024b }
            goto L_0x022c
        L_0x0217:
            boolean r3 = android.text.TextUtils.isEmpty(r6)     // Catch:{ IllegalStateException -> 0x024b }
            if (r3 != 0) goto L_0x022c
            com.google.android.gms.common.internal.StringResourceValueReader r3 = new com.google.android.gms.common.internal.StringResourceValueReader     // Catch:{ IllegalStateException -> 0x024b }
            android.content.Context r6 = r11.f()     // Catch:{ IllegalStateException -> 0x024b }
            r3.<init>(r6)     // Catch:{ IllegalStateException -> 0x024b }
            java.lang.String r3 = r3.a(r8)     // Catch:{ IllegalStateException -> 0x024b }
            r11.l = r3     // Catch:{ IllegalStateException -> 0x024b }
        L_0x022c:
            if (r2 == 0) goto L_0x025d
            com.google.android.gms.measurement.internal.zzeu r2 = r11.h()     // Catch:{ IllegalStateException -> 0x024b }
            com.google.android.gms.measurement.internal.zzew r2 = r2.O()     // Catch:{ IllegalStateException -> 0x024b }
            java.lang.String r3 = "App measurement enabled for app package, google app id"
            java.lang.String r6 = r11.f10581c     // Catch:{ IllegalStateException -> 0x024b }
            java.lang.String r7 = r11.k     // Catch:{ IllegalStateException -> 0x024b }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IllegalStateException -> 0x024b }
            if (r7 == 0) goto L_0x0245
            java.lang.String r7 = r11.l     // Catch:{ IllegalStateException -> 0x024b }
            goto L_0x0247
        L_0x0245:
            java.lang.String r7 = r11.k     // Catch:{ IllegalStateException -> 0x024b }
        L_0x0247:
            r2.c(r3, r6, r7)     // Catch:{ IllegalStateException -> 0x024b }
            goto L_0x025d
        L_0x024b:
            r2 = move-exception
            com.google.android.gms.measurement.internal.zzeu r3 = r11.h()
            com.google.android.gms.measurement.internal.zzew r3 = r3.G()
            java.lang.Object r0 = com.google.android.gms.measurement.internal.zzeu.x(r0)
            java.lang.String r6 = "Fetching Google App Id failed with exception. appId"
            r3.c(r6, r0, r2)
        L_0x025d:
            r0 = 0
            r11.i = r0
            com.google.android.gms.measurement.internal.zzy r0 = r11.l()
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.zzaq.c0
            boolean r0 = r0.t(r2)
            if (r0 == 0) goto L_0x02b1
            r11.m()
            com.google.android.gms.measurement.internal.zzy r0 = r11.l()
            java.lang.String r2 = "analytics.safelisted_events"
            java.util.List r0 = r0.E(r2)
            if (r0 == 0) goto L_0x02ad
            int r2 = r0.size()
            if (r2 != 0) goto L_0x0290
            com.google.android.gms.measurement.internal.zzeu r2 = r11.h()
            com.google.android.gms.measurement.internal.zzew r2 = r2.L()
            java.lang.String r3 = "Safelisted event list is empty. Ignoring"
            r2.a(r3)
        L_0x028e:
            r5 = 0
            goto L_0x02ad
        L_0x0290:
            java.util.Iterator r2 = r0.iterator()
        L_0x0294:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x02ad
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            com.google.android.gms.measurement.internal.zzkr r6 = r11.j()
            java.lang.String r7 = "safelisted event"
            boolean r3 = r6.u0(r7, r3)
            if (r3 != 0) goto L_0x0294
            goto L_0x028e
        L_0x02ad:
            if (r5 == 0) goto L_0x02b1
            r11.i = r0
        L_0x02b1:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 16
            if (r0 < r2) goto L_0x02c7
            if (r1 == 0) goto L_0x02c4
            android.content.Context r0 = r11.f()
            boolean r0 = com.google.android.gms.common.wrappers.InstantApps.a(r0)
            r11.j = r0
            return
        L_0x02c4:
            r11.j = r4
            return
        L_0x02c7:
            r11.j = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzer.w():void");
    }
}
