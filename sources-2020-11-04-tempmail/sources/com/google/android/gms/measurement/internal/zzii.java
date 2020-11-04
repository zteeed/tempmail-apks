package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzkt;
import com.google.android.gms.internal.measurement.zzlf;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzii extends x3 {

    /* renamed from: c  reason: collision with root package name */
    private volatile zzij f10665c;

    /* renamed from: d  reason: collision with root package name */
    private zzij f10666d;
    @VisibleForTesting

    /* renamed from: e  reason: collision with root package name */
    protected zzij f10667e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<Activity, zzij> f10668f = new ConcurrentHashMap();
    private Activity g;
    private volatile boolean h;
    private volatile zzij i;
    /* access modifiers changed from: private */
    public zzij j;
    private boolean k;
    private final Object l = new Object();
    private String m;

    public zzii(zzfy zzfy) {
        super(zzfy);
    }

    @VisibleForTesting
    private static String F(String str) {
        String[] split = str.split("\\.");
        String str2 = split.length > 0 ? split[split.length - 1] : "";
        return str2.length() > 100 ? str2.substring(0, 100) : str2;
    }

    private final void I(Activity activity, zzij zzij, boolean z) {
        zzij zzij2;
        zzij zzij3 = this.f10665c == null ? this.f10666d : this.f10665c;
        if (zzij.f10670b == null) {
            zzij2 = new zzij(zzij.f10669a, activity != null ? F(activity.getClass().getCanonicalName()) : null, zzij.f10671c, zzij.f10673e);
        } else {
            zzij2 = zzij;
        }
        this.f10666d = this.f10665c;
        this.f10665c = zzij2;
        g().z(new v5(this, zzij2, zzij3, n().b(), z));
    }

    /* access modifiers changed from: private */
    public final void L(Bundle bundle, zzij zzij, zzij zzij2, long j2) {
        if (bundle != null) {
            bundle.remove("screen_name");
            bundle.remove("screen_class");
        }
        Q(zzij, zzij2, j2, true, j().C((String) null, "screen_view", bundle, (List<String>) null, true, true));
    }

    public static void P(zzij zzij, Bundle bundle, boolean z) {
        if (bundle != null && zzij != null && (!bundle.containsKey("_sc") || z)) {
            String str = zzij.f10669a;
            if (str != null) {
                bundle.putString("_sn", str);
            } else {
                bundle.remove("_sn");
            }
            String str2 = zzij.f10670b;
            if (str2 != null) {
                bundle.putString("_sc", str2);
            } else {
                bundle.remove("_sc");
            }
            bundle.putLong("_si", zzij.f10671c);
        } else if (bundle != null && zzij == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    /* access modifiers changed from: private */
    public final void Q(zzij zzij, zzij zzij2, long j2, boolean z, Bundle bundle) {
        boolean z2;
        long j3;
        zzij zzij3;
        c();
        boolean z3 = false;
        if (l().t(zzaq.U)) {
            z2 = z && this.f10667e != null;
            if (z2) {
                R(this.f10667e, true, j2);
            }
        } else {
            if (z && (zzij3 = this.f10667e) != null) {
                R(zzij3, true, j2);
            }
            z2 = false;
        }
        if (zzij2 == null || zzij2.f10671c != zzij.f10671c || !zzkr.A0(zzij2.f10670b, zzij.f10670b) || !zzkr.A0(zzij2.f10669a, zzij.f10669a)) {
            z3 = true;
        }
        if (z3) {
            Bundle bundle2 = new Bundle();
            if (l().t(zzaq.D0)) {
                bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            }
            P(zzij, bundle2, true);
            if (zzij2 != null) {
                String str = zzij2.f10669a;
                if (str != null) {
                    bundle2.putString("_pn", str);
                }
                String str2 = zzij2.f10670b;
                if (str2 != null) {
                    bundle2.putString("_pc", str2);
                }
                bundle2.putLong("_pi", zzij2.f10671c);
            }
            if (l().t(zzaq.U) && z2) {
                if (!zzlf.b() || !l().t(zzaq.W) || !zzkt.b() || !l().t(zzaq.A0)) {
                    j3 = v().f10684e.e();
                } else {
                    j3 = v().C(j2);
                }
                if (j3 > 0) {
                    j().L(bundle2, j3);
                }
            }
            String str3 = "auto";
            if (l().t(zzaq.D0)) {
                if (!l().L().booleanValue()) {
                    bundle2.putLong("_mt", 1);
                }
                if (zzij.f10673e) {
                    str3 = "app";
                }
            }
            q().r0(str3, "_vs", bundle2);
        }
        this.f10667e = zzij;
        if (l().t(zzaq.D0) && zzij.f10673e) {
            this.j = zzij;
        }
        s().O(zzij);
    }

    /* access modifiers changed from: private */
    public final void R(zzij zzij, boolean z, long j2) {
        p().w(n().b());
        if (v().F(zzij != null && zzij.f10672d, z, j2) && zzij != null) {
            zzij.f10672d = false;
        }
    }

    private final zzij X(Activity activity) {
        Preconditions.k(activity);
        zzij zzij = this.f10668f.get(activity);
        if (zzij == null) {
            zzij zzij2 = new zzij((String) null, F(activity.getClass().getCanonicalName()), j().E0());
            this.f10668f.put(activity, zzij2);
            zzij = zzij2;
        }
        return (l().t(zzaq.D0) && this.i != null) ? this.i : zzij;
    }

    /* access modifiers changed from: protected */
    public final boolean B() {
        return false;
    }

    public final zzij E(boolean z) {
        y();
        c();
        if (!l().t(zzaq.D0) || !z) {
            return this.f10667e;
        }
        zzij zzij = this.f10667e;
        return zzij != null ? zzij : this.j;
    }

    public final void G(Activity activity) {
        if (l().t(zzaq.D0)) {
            synchronized (this.l) {
                this.k = true;
                if (activity != this.g) {
                    synchronized (this.l) {
                        this.g = activity;
                        this.h = false;
                    }
                    if (l().t(zzaq.C0) && l().L().booleanValue()) {
                        this.i = null;
                        g().z(new z5(this));
                    }
                }
            }
        }
        if (!l().t(zzaq.C0) || l().L().booleanValue()) {
            I(activity, X(activity), false);
            zza p = p();
            p.g().z(new u2(p, p.n().b()));
            return;
        }
        this.f10665c = this.i;
        g().z(new y5(this));
    }

    public final void H(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (l().L().booleanValue() && bundle != null && (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) != null) {
            this.f10668f.put(activity, new zzij(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
        }
    }

    public final void J(Activity activity, String str, String str2) {
        if (!l().L().booleanValue()) {
            h().L().a("setCurrentScreen cannot be called while screen reporting is disabled.");
        } else if (this.f10665c == null) {
            h().L().a("setCurrentScreen cannot be called while no activity active");
        } else if (this.f10668f.get(activity) == null) {
            h().L().a("setCurrentScreen must be called with an activity in the activity lifecycle");
        } else {
            if (str2 == null) {
                str2 = F(activity.getClass().getCanonicalName());
            }
            boolean A0 = zzkr.A0(this.f10665c.f10670b, str2);
            boolean A02 = zzkr.A0(this.f10665c.f10669a, str);
            if (A0 && A02) {
                h().L().a("setCurrentScreen cannot be called with the same class and name");
            } else if (str != null && (str.length() <= 0 || str.length() > 100)) {
                h().L().b("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            } else if (str2 == null || (str2.length() > 0 && str2.length() <= 100)) {
                h().O().c("Setting current screen to name, class", str == null ? "null" : str, str2);
                zzij zzij = new zzij(str, str2, j().E0());
                this.f10668f.put(activity, zzij);
                I(activity, zzij, true);
            } else {
                h().L().b("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d7, code lost:
        r0 = h().O();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e1, code lost:
        if (r3 != null) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e3, code lost:
        r2 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e6, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e7, code lost:
        if (r4 != null) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e9, code lost:
        r5 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ec, code lost:
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ed, code lost:
        r0.c("Logging screen view with name, class", r2, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f2, code lost:
        if (r13.f10665c != null) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f4, code lost:
        r0 = r13.f10666d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00f7, code lost:
        r0 = r13.f10665c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00f9, code lost:
        r9 = r0;
        r2 = new com.google.android.gms.measurement.internal.zzij(r3, r4, j().E0(), true);
        r13.f10665c = r2;
        r13.f10666d = r9;
        r13.i = r2;
        g().z(new com.google.android.gms.measurement.internal.w5(r13, r14, r2, r9, n().b()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0126, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void K(android.os.Bundle r14) {
        /*
            r13 = this;
            com.google.android.gms.measurement.internal.zzy r0 = r13.l()
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.zzaq.D0
            boolean r0 = r0.t(r1)
            if (r0 != 0) goto L_0x001a
            com.google.android.gms.measurement.internal.zzeu r14 = r13.h()
            com.google.android.gms.measurement.internal.zzew r14 = r14.L()
            java.lang.String r0 = "Manual screen reporting is disabled."
            r14.a(r0)
            return
        L_0x001a:
            java.lang.Object r0 = r13.l
            monitor-enter(r0)
            boolean r1 = r13.k     // Catch:{ all -> 0x0127 }
            if (r1 != 0) goto L_0x0030
            com.google.android.gms.measurement.internal.zzeu r14 = r13.h()     // Catch:{ all -> 0x0127 }
            com.google.android.gms.measurement.internal.zzew r14 = r14.L()     // Catch:{ all -> 0x0127 }
            java.lang.String r1 = "Cannot log screen view event when the app is in the background."
            r14.a(r1)     // Catch:{ all -> 0x0127 }
            monitor-exit(r0)     // Catch:{ all -> 0x0127 }
            return
        L_0x0030:
            r1 = 0
            if (r14 == 0) goto L_0x008f
            java.lang.String r1 = "screen_name"
            java.lang.String r1 = r14.getString(r1)     // Catch:{ all -> 0x0127 }
            r2 = 100
            if (r1 == 0) goto L_0x0060
            int r3 = r1.length()     // Catch:{ all -> 0x0127 }
            if (r3 <= 0) goto L_0x0049
            int r3 = r1.length()     // Catch:{ all -> 0x0127 }
            if (r3 <= r2) goto L_0x0060
        L_0x0049:
            com.google.android.gms.measurement.internal.zzeu r14 = r13.h()     // Catch:{ all -> 0x0127 }
            com.google.android.gms.measurement.internal.zzew r14 = r14.L()     // Catch:{ all -> 0x0127 }
            java.lang.String r2 = "Invalid screen name length for screen view. Length"
            int r1 = r1.length()     // Catch:{ all -> 0x0127 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0127 }
            r14.b(r2, r1)     // Catch:{ all -> 0x0127 }
            monitor-exit(r0)     // Catch:{ all -> 0x0127 }
            return
        L_0x0060:
            java.lang.String r3 = "screen_class"
            java.lang.String r3 = r14.getString(r3)     // Catch:{ all -> 0x0127 }
            if (r3 == 0) goto L_0x008b
            int r4 = r3.length()     // Catch:{ all -> 0x0127 }
            if (r4 <= 0) goto L_0x0074
            int r4 = r3.length()     // Catch:{ all -> 0x0127 }
            if (r4 <= r2) goto L_0x008b
        L_0x0074:
            com.google.android.gms.measurement.internal.zzeu r14 = r13.h()     // Catch:{ all -> 0x0127 }
            com.google.android.gms.measurement.internal.zzew r14 = r14.L()     // Catch:{ all -> 0x0127 }
            java.lang.String r1 = "Invalid screen class length for screen view. Length"
            int r2 = r3.length()     // Catch:{ all -> 0x0127 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0127 }
            r14.b(r1, r2)     // Catch:{ all -> 0x0127 }
            monitor-exit(r0)     // Catch:{ all -> 0x0127 }
            return
        L_0x008b:
            r12 = r3
            r3 = r1
            r1 = r12
            goto L_0x0090
        L_0x008f:
            r3 = r1
        L_0x0090:
            if (r1 != 0) goto L_0x00a7
            android.app.Activity r1 = r13.g     // Catch:{ all -> 0x0127 }
            if (r1 == 0) goto L_0x00a5
            android.app.Activity r1 = r13.g     // Catch:{ all -> 0x0127 }
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x0127 }
            java.lang.String r1 = r1.getCanonicalName()     // Catch:{ all -> 0x0127 }
            java.lang.String r1 = F(r1)     // Catch:{ all -> 0x0127 }
            goto L_0x00a7
        L_0x00a5:
            java.lang.String r1 = "Activity"
        L_0x00a7:
            r4 = r1
            boolean r1 = r13.h     // Catch:{ all -> 0x0127 }
            if (r1 == 0) goto L_0x00d6
            com.google.android.gms.measurement.internal.zzij r1 = r13.f10665c     // Catch:{ all -> 0x0127 }
            if (r1 == 0) goto L_0x00d6
            r1 = 0
            r13.h = r1     // Catch:{ all -> 0x0127 }
            com.google.android.gms.measurement.internal.zzij r1 = r13.f10665c     // Catch:{ all -> 0x0127 }
            java.lang.String r1 = r1.f10670b     // Catch:{ all -> 0x0127 }
            boolean r1 = com.google.android.gms.measurement.internal.zzkr.A0(r1, r4)     // Catch:{ all -> 0x0127 }
            com.google.android.gms.measurement.internal.zzij r2 = r13.f10665c     // Catch:{ all -> 0x0127 }
            java.lang.String r2 = r2.f10669a     // Catch:{ all -> 0x0127 }
            boolean r2 = com.google.android.gms.measurement.internal.zzkr.A0(r2, r3)     // Catch:{ all -> 0x0127 }
            if (r1 == 0) goto L_0x00d6
            if (r2 == 0) goto L_0x00d6
            com.google.android.gms.measurement.internal.zzeu r14 = r13.h()     // Catch:{ all -> 0x0127 }
            com.google.android.gms.measurement.internal.zzew r14 = r14.L()     // Catch:{ all -> 0x0127 }
            java.lang.String r1 = "Ignoring call to log screen view event with duplicate parameters."
            r14.a(r1)     // Catch:{ all -> 0x0127 }
            monitor-exit(r0)     // Catch:{ all -> 0x0127 }
            return
        L_0x00d6:
            monitor-exit(r0)     // Catch:{ all -> 0x0127 }
            com.google.android.gms.measurement.internal.zzeu r0 = r13.h()
            com.google.android.gms.measurement.internal.zzew r0 = r0.O()
            java.lang.String r1 = "Logging screen view with name, class"
            if (r3 != 0) goto L_0x00e6
            java.lang.String r2 = "null"
            goto L_0x00e7
        L_0x00e6:
            r2 = r3
        L_0x00e7:
            if (r4 != 0) goto L_0x00ec
            java.lang.String r5 = "null"
            goto L_0x00ed
        L_0x00ec:
            r5 = r4
        L_0x00ed:
            r0.c(r1, r2, r5)
            com.google.android.gms.measurement.internal.zzij r0 = r13.f10665c
            if (r0 != 0) goto L_0x00f7
            com.google.android.gms.measurement.internal.zzij r0 = r13.f10666d
            goto L_0x00f9
        L_0x00f7:
            com.google.android.gms.measurement.internal.zzij r0 = r13.f10665c
        L_0x00f9:
            r9 = r0
            com.google.android.gms.measurement.internal.zzij r8 = new com.google.android.gms.measurement.internal.zzij
            com.google.android.gms.measurement.internal.zzkr r0 = r13.j()
            long r5 = r0.E0()
            r7 = 1
            r2 = r8
            r2.<init>(r3, r4, r5, r7)
            r13.f10665c = r8
            r13.f10666d = r9
            r13.i = r8
            com.google.android.gms.common.util.Clock r0 = r13.n()
            long r10 = r0.b()
            com.google.android.gms.measurement.internal.zzfv r0 = r13.g()
            com.google.android.gms.measurement.internal.w5 r1 = new com.google.android.gms.measurement.internal.w5
            r5 = r1
            r6 = r13
            r7 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            r0.z(r1)
            return
        L_0x0127:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0127 }
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzii.K(android.os.Bundle):void");
    }

    public final void S(String str, zzij zzij) {
        c();
        synchronized (this) {
            if (this.m == null || this.m.equals(str) || zzij != null) {
                this.m = str;
            }
        }
    }

    public final zzij T() {
        a();
        return this.f10665c;
    }

    public final void U(Activity activity) {
        if (l().t(zzaq.D0)) {
            synchronized (this.l) {
                this.k = false;
                this.h = true;
            }
        }
        long b2 = n().b();
        if (!l().t(zzaq.C0) || l().L().booleanValue()) {
            zzij X = X(activity);
            this.f10666d = this.f10665c;
            this.f10665c = null;
            g().z(new a6(this, X, b2));
            return;
        }
        this.f10665c = null;
        g().z(new x5(this, b2));
    }

    public final void V(Activity activity, Bundle bundle) {
        zzij zzij;
        if (l().L().booleanValue() && bundle != null && (zzij = this.f10668f.get(activity)) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("id", zzij.f10671c);
            bundle2.putString("name", zzij.f10669a);
            bundle2.putString("referrer_name", zzij.f10670b);
            bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
        }
    }

    public final void W(Activity activity) {
        synchronized (this.l) {
            if (activity == this.g) {
                this.g = null;
            }
        }
        if (l().L().booleanValue()) {
            this.f10668f.remove(activity);
        }
    }
}
