package com.google.android.gms.internal.measurement;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public abstract class zzcv<T> {

    /* renamed from: f  reason: collision with root package name */
    private static final Object f9591f = new Object();
    @SuppressLint({"StaticFieldLeak"})
    private static volatile Context g;
    private static volatile zzdj<zzdi<zzcr>> h;
    private static final AtomicInteger i = new AtomicInteger();

    /* renamed from: a  reason: collision with root package name */
    private final zzdb f9592a;

    /* renamed from: b  reason: collision with root package name */
    private final String f9593b;

    /* renamed from: c  reason: collision with root package name */
    private final T f9594c;

    /* renamed from: d  reason: collision with root package name */
    private volatile int f9595d;

    /* renamed from: e  reason: collision with root package name */
    private volatile T f9596e;

    static {
        new AtomicReference();
    }

    private zzcv(zzdb zzdb, String str, T t, boolean z) {
        this.f9595d = -1;
        if (zzdb.f9598a != null) {
            this.f9592a = zzdb;
            this.f9593b = str;
            this.f9594c = t;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    private final String f(String str) {
        if (str != null && str.isEmpty()) {
            return this.f9593b;
        }
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf(this.f9593b);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    static void g() {
        i.incrementAndGet();
    }

    @Deprecated
    public static void h(Context context) {
        synchronized (f9591f) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (g != context) {
                zzch.d();
                zzde.b();
                n0.b();
                h = zzdm.a(q0.f9474b);
                g = context;
                i.incrementAndGet();
            }
        }
    }

    /* access modifiers changed from: private */
    public static zzcv<Double> i(zzdb zzdb, String str, double d2, boolean z) {
        return new r0(zzdb, str, Double.valueOf(d2), true);
    }

    /* access modifiers changed from: private */
    public static zzcv<Long> j(zzdb zzdb, String str, long j, boolean z) {
        return new p0(zzdb, str, Long.valueOf(j), true);
    }

    /* access modifiers changed from: private */
    public static zzcv<String> k(zzdb zzdb, String str, String str2, boolean z) {
        return new t0(zzdb, str, str2, true);
    }

    /* access modifiers changed from: private */
    public static zzcv<Boolean> l(zzdb zzdb, String str, boolean z, boolean z2) {
        return new s0(zzdb, str, Boolean.valueOf(z), true);
    }

    static final /* synthetic */ zzdi o() {
        new zzcu();
        return zzcu.b(g);
    }

    /* access modifiers changed from: package-private */
    public abstract T e(Object obj);

    public final String m() {
        return f(this.f9592a.f9600c);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T n() {
        /*
            r6 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = i
            int r0 = r0.get()
            int r1 = r6.f9595d
            if (r1 >= r0) goto L_0x00f8
            monitor-enter(r6)
            int r1 = r6.f9595d     // Catch:{ all -> 0x00f5 }
            if (r1 >= r0) goto L_0x00f3
            android.content.Context r1 = g     // Catch:{ all -> 0x00f5 }
            if (r1 == 0) goto L_0x00eb
            android.content.Context r1 = g     // Catch:{ all -> 0x00f5 }
            com.google.android.gms.internal.measurement.n0 r1 = com.google.android.gms.internal.measurement.n0.a(r1)     // Catch:{ all -> 0x00f5 }
            java.lang.String r2 = "gms:phenotype:phenotype_flag:debug_bypass_phenotype"
            java.lang.Object r1 = r1.g(r2)     // Catch:{ all -> 0x00f5 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00f5 }
            if (r1 == 0) goto L_0x0031
            java.util.regex.Pattern r2 = com.google.android.gms.internal.measurement.zzcg.f9576c     // Catch:{ all -> 0x00f5 }
            java.util.regex.Matcher r1 = r2.matcher(r1)     // Catch:{ all -> 0x00f5 }
            boolean r1 = r1.matches()     // Catch:{ all -> 0x00f5 }
            if (r1 == 0) goto L_0x0031
            r1 = 1
            goto L_0x0032
        L_0x0031:
            r1 = 0
        L_0x0032:
            r2 = 0
            if (r1 != 0) goto L_0x006f
            com.google.android.gms.internal.measurement.zzdb r1 = r6.f9592a     // Catch:{ all -> 0x00f5 }
            android.net.Uri r1 = r1.f9598a     // Catch:{ all -> 0x00f5 }
            if (r1 == 0) goto L_0x0058
            android.content.Context r1 = g     // Catch:{ all -> 0x00f5 }
            com.google.android.gms.internal.measurement.zzdb r3 = r6.f9592a     // Catch:{ all -> 0x00f5 }
            android.net.Uri r3 = r3.f9598a     // Catch:{ all -> 0x00f5 }
            boolean r1 = com.google.android.gms.internal.measurement.zzct.b(r1, r3)     // Catch:{ all -> 0x00f5 }
            if (r1 == 0) goto L_0x0056
            android.content.Context r1 = g     // Catch:{ all -> 0x00f5 }
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ all -> 0x00f5 }
            com.google.android.gms.internal.measurement.zzdb r3 = r6.f9592a     // Catch:{ all -> 0x00f5 }
            android.net.Uri r3 = r3.f9598a     // Catch:{ all -> 0x00f5 }
            com.google.android.gms.internal.measurement.zzch r1 = com.google.android.gms.internal.measurement.zzch.a(r1, r3)     // Catch:{ all -> 0x00f5 }
            goto L_0x005e
        L_0x0056:
            r1 = r2
            goto L_0x005e
        L_0x0058:
            android.content.Context r1 = g     // Catch:{ all -> 0x00f5 }
            com.google.android.gms.internal.measurement.zzde r1 = com.google.android.gms.internal.measurement.zzde.a(r1, r2)     // Catch:{ all -> 0x00f5 }
        L_0x005e:
            if (r1 == 0) goto L_0x0098
            java.lang.String r3 = r6.m()     // Catch:{ all -> 0x00f5 }
            java.lang.Object r1 = r1.g(r3)     // Catch:{ all -> 0x00f5 }
            if (r1 == 0) goto L_0x0098
            java.lang.Object r1 = r6.e(r1)     // Catch:{ all -> 0x00f5 }
            goto L_0x0099
        L_0x006f:
            java.lang.String r1 = "PhenotypeFlag"
            r3 = 3
            boolean r1 = android.util.Log.isLoggable(r1, r3)     // Catch:{ all -> 0x00f5 }
            if (r1 == 0) goto L_0x0098
            java.lang.String r1 = "PhenotypeFlag"
            java.lang.String r3 = "Bypass reading Phenotype values for flag: "
            java.lang.String r4 = r6.m()     // Catch:{ all -> 0x00f5 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x00f5 }
            int r5 = r4.length()     // Catch:{ all -> 0x00f5 }
            if (r5 == 0) goto L_0x008f
            java.lang.String r3 = r3.concat(r4)     // Catch:{ all -> 0x00f5 }
            goto L_0x0095
        L_0x008f:
            java.lang.String r4 = new java.lang.String     // Catch:{ all -> 0x00f5 }
            r4.<init>(r3)     // Catch:{ all -> 0x00f5 }
            r3 = r4
        L_0x0095:
            android.util.Log.d(r1, r3)     // Catch:{ all -> 0x00f5 }
        L_0x0098:
            r1 = r2
        L_0x0099:
            if (r1 == 0) goto L_0x009c
            goto L_0x00bb
        L_0x009c:
            android.content.Context r1 = g     // Catch:{ all -> 0x00f5 }
            com.google.android.gms.internal.measurement.n0 r1 = com.google.android.gms.internal.measurement.n0.a(r1)     // Catch:{ all -> 0x00f5 }
            com.google.android.gms.internal.measurement.zzdb r3 = r6.f9592a     // Catch:{ all -> 0x00f5 }
            java.lang.String r3 = r3.f9599b     // Catch:{ all -> 0x00f5 }
            java.lang.String r3 = r6.f(r3)     // Catch:{ all -> 0x00f5 }
            java.lang.Object r1 = r1.g(r3)     // Catch:{ all -> 0x00f5 }
            if (r1 == 0) goto L_0x00b5
            java.lang.Object r1 = r6.e(r1)     // Catch:{ all -> 0x00f5 }
            goto L_0x00b6
        L_0x00b5:
            r1 = r2
        L_0x00b6:
            if (r1 == 0) goto L_0x00b9
            goto L_0x00bb
        L_0x00b9:
            T r1 = r6.f9594c     // Catch:{ all -> 0x00f5 }
        L_0x00bb:
            com.google.android.gms.internal.measurement.zzdj<com.google.android.gms.internal.measurement.zzdi<com.google.android.gms.internal.measurement.zzcr>> r3 = h     // Catch:{ all -> 0x00f5 }
            java.lang.Object r3 = r3.a()     // Catch:{ all -> 0x00f5 }
            com.google.android.gms.internal.measurement.zzdi r3 = (com.google.android.gms.internal.measurement.zzdi) r3     // Catch:{ all -> 0x00f5 }
            boolean r4 = r3.b()     // Catch:{ all -> 0x00f5 }
            if (r4 == 0) goto L_0x00e6
            java.lang.Object r1 = r3.c()     // Catch:{ all -> 0x00f5 }
            com.google.android.gms.internal.measurement.zzcr r1 = (com.google.android.gms.internal.measurement.zzcr) r1     // Catch:{ all -> 0x00f5 }
            com.google.android.gms.internal.measurement.zzdb r3 = r6.f9592a     // Catch:{ all -> 0x00f5 }
            android.net.Uri r3 = r3.f9598a     // Catch:{ all -> 0x00f5 }
            com.google.android.gms.internal.measurement.zzdb r4 = r6.f9592a     // Catch:{ all -> 0x00f5 }
            java.lang.String r4 = r4.f9600c     // Catch:{ all -> 0x00f5 }
            java.lang.String r5 = r6.f9593b     // Catch:{ all -> 0x00f5 }
            java.lang.String r1 = r1.a(r3, r2, r4, r5)     // Catch:{ all -> 0x00f5 }
            if (r1 != 0) goto L_0x00e2
            T r1 = r6.f9594c     // Catch:{ all -> 0x00f5 }
            goto L_0x00e6
        L_0x00e2:
            java.lang.Object r1 = r6.e(r1)     // Catch:{ all -> 0x00f5 }
        L_0x00e6:
            r6.f9596e = r1     // Catch:{ all -> 0x00f5 }
            r6.f9595d = r0     // Catch:{ all -> 0x00f5 }
            goto L_0x00f3
        L_0x00eb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00f5 }
            java.lang.String r1 = "Must call PhenotypeFlag.init() first"
            r0.<init>(r1)     // Catch:{ all -> 0x00f5 }
            throw r0     // Catch:{ all -> 0x00f5 }
        L_0x00f3:
            monitor-exit(r6)     // Catch:{ all -> 0x00f5 }
            goto L_0x00f8
        L_0x00f5:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00f5 }
            throw r0
        L_0x00f8:
            T r0 = r6.f9596e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzcv.n():java.lang.Object");
    }

    /* synthetic */ zzcv(zzdb zzdb, String str, Object obj, boolean z, p0 p0Var) {
        this(zzdb, str, obj, z);
    }
}
