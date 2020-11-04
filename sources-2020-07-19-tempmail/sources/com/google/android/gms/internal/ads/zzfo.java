package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzby;
import com.google.android.gms.internal.ads.zzcf;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzfo extends zzgm {
    private static final zzgl<zzcy> k = new zzgl<>();
    private final Context i;
    private zzby.zza j = null;

    public zzfo(zzex zzex, String str, String str2, zzcf.zza.C0074zza zza, int i2, int i3, Context context, zzby.zza zza2) {
        super(zzex, str, str2, zza, i2, 27);
        this.i = context;
        this.j = zza2;
    }

    private static String c(zzby.zza zza) {
        if (zza == null || !zza.G() || zzfg.f(zza.H().G())) {
            return null;
        }
        return zza.H().G();
    }

    private final String d() {
        try {
            if (this.f8700b.A() != null) {
                this.f8700b.A().get();
            }
            zzcf.zza z = this.f8700b.z();
            if (z == null || !z.j0()) {
                return null;
            }
            return z.c0();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zzgl<com.google.android.gms.internal.ads.zzcy> r0 = k
            android.content.Context r1 = r8.i
            java.lang.String r1 = r1.getPackageName()
            java.util.concurrent.atomic.AtomicReference r0 = r0.a(r1)
            monitor-enter(r0)
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x011e }
            com.google.android.gms.internal.ads.zzcy r1 = (com.google.android.gms.internal.ads.zzcy) r1     // Catch:{ all -> 0x011e }
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0036
            java.lang.String r4 = r1.f7693b     // Catch:{ all -> 0x011e }
            boolean r4 = com.google.android.gms.internal.ads.zzfg.f(r4)     // Catch:{ all -> 0x011e }
            if (r4 != 0) goto L_0x0036
            java.lang.String r4 = r1.f7693b     // Catch:{ all -> 0x011e }
            java.lang.String r5 = "E"
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x011e }
            if (r4 != 0) goto L_0x0036
            java.lang.String r1 = r1.f7693b     // Catch:{ all -> 0x011e }
            java.lang.String r4 = "0000000000000000000000000000000000000000000000000000000000000000"
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x011e }
            if (r1 == 0) goto L_0x0034
            goto L_0x0036
        L_0x0034:
            r1 = 0
            goto L_0x0037
        L_0x0036:
            r1 = 1
        L_0x0037:
            if (r1 == 0) goto L_0x00ea
            com.google.android.gms.internal.ads.zzby$zza r1 = r8.j     // Catch:{ all -> 0x011e }
            java.lang.String r1 = c(r1)     // Catch:{ all -> 0x011e }
            boolean r1 = com.google.android.gms.internal.ads.zzfg.f(r1)     // Catch:{ all -> 0x011e }
            if (r1 != 0) goto L_0x0048
            com.google.android.gms.internal.ads.zzcb r1 = com.google.android.gms.internal.ads.zzcb.ENUM_SIGNAL_SOURCE_CALLER_PROVIDED     // Catch:{ all -> 0x011e }
            goto L_0x0082
        L_0x0048:
            com.google.android.gms.internal.ads.zzby$zza r1 = r8.j     // Catch:{ all -> 0x011e }
            java.lang.String r4 = c(r1)     // Catch:{ all -> 0x011e }
            boolean r4 = com.google.android.gms.internal.ads.zzfg.f(r4)     // Catch:{ all -> 0x011e }
            if (r4 == 0) goto L_0x006a
            if (r1 == 0) goto L_0x006a
            boolean r4 = r1.L()     // Catch:{ all -> 0x011e }
            if (r4 == 0) goto L_0x006a
            com.google.android.gms.internal.ads.zzby$zzb r1 = r1.M()     // Catch:{ all -> 0x011e }
            com.google.android.gms.internal.ads.zzcb r1 = r1.G()     // Catch:{ all -> 0x011e }
            com.google.android.gms.internal.ads.zzcb r4 = com.google.android.gms.internal.ads.zzcb.ENUM_SIGNAL_SOURCE_GASS     // Catch:{ all -> 0x011e }
            if (r1 != r4) goto L_0x006a
            r1 = 1
            goto L_0x006b
        L_0x006a:
            r1 = 0
        L_0x006b:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x011e }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x011e }
            if (r1 == 0) goto L_0x0080
            com.google.android.gms.internal.ads.zzex r1 = r8.f8700b     // Catch:{ all -> 0x011e }
            boolean r1 = r1.x()     // Catch:{ all -> 0x011e }
            if (r1 == 0) goto L_0x0080
            com.google.android.gms.internal.ads.zzcb r1 = com.google.android.gms.internal.ads.zzcb.ENUM_SIGNAL_SOURCE_GASS     // Catch:{ all -> 0x011e }
            goto L_0x0082
        L_0x0080:
            com.google.android.gms.internal.ads.zzcb r1 = com.google.android.gms.internal.ads.zzcb.ENUM_SIGNAL_SOURCE_ADSHIELD     // Catch:{ all -> 0x011e }
        L_0x0082:
            java.lang.reflect.Method r4 = r8.f8704f     // Catch:{ all -> 0x011e }
            r5 = 0
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x011e }
            android.content.Context r7 = r8.i     // Catch:{ all -> 0x011e }
            r6[r2] = r7     // Catch:{ all -> 0x011e }
            com.google.android.gms.internal.ads.zzcb r7 = com.google.android.gms.internal.ads.zzcb.ENUM_SIGNAL_SOURCE_ADSHIELD     // Catch:{ all -> 0x011e }
            if (r1 != r7) goto L_0x0091
            r2 = 1
        L_0x0091:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x011e }
            r6[r3] = r2     // Catch:{ all -> 0x011e }
            com.google.android.gms.internal.ads.zzaag<java.lang.Boolean> r2 = com.google.android.gms.internal.ads.zzaav.e1     // Catch:{ all -> 0x011e }
            com.google.android.gms.internal.ads.zzaar r7 = com.google.android.gms.internal.ads.zzwg.e()     // Catch:{ all -> 0x011e }
            java.lang.Object r2 = r7.c(r2)     // Catch:{ all -> 0x011e }
            r7 = 2
            r6[r7] = r2     // Catch:{ all -> 0x011e }
            java.lang.Object r2 = r4.invoke(r5, r6)     // Catch:{ all -> 0x011e }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x011e }
            com.google.android.gms.internal.ads.zzcy r4 = new com.google.android.gms.internal.ads.zzcy     // Catch:{ all -> 0x011e }
            r4.<init>(r2)     // Catch:{ all -> 0x011e }
            java.lang.String r2 = r4.f7693b     // Catch:{ all -> 0x011e }
            boolean r2 = com.google.android.gms.internal.ads.zzfg.f(r2)     // Catch:{ all -> 0x011e }
            if (r2 != 0) goto L_0x00c1
            java.lang.String r2 = r4.f7693b     // Catch:{ all -> 0x011e }
            java.lang.String r5 = "E"
            boolean r2 = r2.equals(r5)     // Catch:{ all -> 0x011e }
            if (r2 == 0) goto L_0x00e7
        L_0x00c1:
            int[] r2 = com.google.android.gms.internal.ads.ka0.f4192a     // Catch:{ all -> 0x011e }
            int r1 = r1.ordinal()     // Catch:{ all -> 0x011e }
            r1 = r2[r1]     // Catch:{ all -> 0x011e }
            if (r1 == r3) goto L_0x00db
            if (r1 == r7) goto L_0x00ce
            goto L_0x00e7
        L_0x00ce:
            java.lang.String r1 = r8.d()     // Catch:{ all -> 0x011e }
            boolean r2 = com.google.android.gms.internal.ads.zzfg.f(r1)     // Catch:{ all -> 0x011e }
            if (r2 != 0) goto L_0x00e7
            r4.f7693b = r1     // Catch:{ all -> 0x011e }
            goto L_0x00e7
        L_0x00db:
            com.google.android.gms.internal.ads.zzby$zza r1 = r8.j     // Catch:{ all -> 0x011e }
            com.google.android.gms.internal.ads.zzby$zzc r1 = r1.H()     // Catch:{ all -> 0x011e }
            java.lang.String r1 = r1.G()     // Catch:{ all -> 0x011e }
            r4.f7693b = r1     // Catch:{ all -> 0x011e }
        L_0x00e7:
            r0.set(r4)     // Catch:{ all -> 0x011e }
        L_0x00ea:
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x011e }
            com.google.android.gms.internal.ads.zzcy r1 = (com.google.android.gms.internal.ads.zzcy) r1     // Catch:{ all -> 0x011e }
            monitor-exit(r0)     // Catch:{ all -> 0x011e }
            com.google.android.gms.internal.ads.zzcf$zza$zza r2 = r8.f8703e
            monitor-enter(r2)
            if (r1 == 0) goto L_0x0119
            com.google.android.gms.internal.ads.zzcf$zza$zza r0 = r8.f8703e     // Catch:{ all -> 0x011b }
            java.lang.String r3 = r1.f7693b     // Catch:{ all -> 0x011b }
            r0.v0(r3)     // Catch:{ all -> 0x011b }
            com.google.android.gms.internal.ads.zzcf$zza$zza r0 = r8.f8703e     // Catch:{ all -> 0x011b }
            long r3 = r1.f7694c     // Catch:{ all -> 0x011b }
            r0.q0(r3)     // Catch:{ all -> 0x011b }
            com.google.android.gms.internal.ads.zzcf$zza$zza r0 = r8.f8703e     // Catch:{ all -> 0x011b }
            java.lang.String r3 = r1.f7695d     // Catch:{ all -> 0x011b }
            r0.z0(r3)     // Catch:{ all -> 0x011b }
            com.google.android.gms.internal.ads.zzcf$zza$zza r0 = r8.f8703e     // Catch:{ all -> 0x011b }
            java.lang.String r3 = r1.f7696e     // Catch:{ all -> 0x011b }
            r0.B0(r3)     // Catch:{ all -> 0x011b }
            com.google.android.gms.internal.ads.zzcf$zza$zza r0 = r8.f8703e     // Catch:{ all -> 0x011b }
            java.lang.String r1 = r1.f7697f     // Catch:{ all -> 0x011b }
            r0.D0(r1)     // Catch:{ all -> 0x011b }
        L_0x0119:
            monitor-exit(r2)     // Catch:{ all -> 0x011b }
            return
        L_0x011b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x011b }
            throw r0
        L_0x011e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x011e }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfo.a():void");
    }
}
