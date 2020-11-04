package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzazq {

    /* renamed from: a  reason: collision with root package name */
    private static zzae f6086a;

    /* renamed from: b  reason: collision with root package name */
    private static final Object f6087b = new Object();

    public zzazq(Context context) {
        b(context.getApplicationContext() != null ? context.getApplicationContext() : context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002c  */
    @com.google.android.gms.common.util.VisibleForTesting
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.ads.zzae b(android.content.Context r3) {
        /*
            java.lang.Object r0 = f6087b
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzae r1 = f6086a     // Catch:{ all -> 0x0036 }
            if (r1 != 0) goto L_0x0032
            com.google.android.gms.internal.ads.zzaav.a(r3)     // Catch:{ all -> 0x0036 }
            boolean r1 = com.google.android.gms.common.util.ClientLibraryUtils.b()     // Catch:{ all -> 0x0036 }
            if (r1 != 0) goto L_0x0024
            com.google.android.gms.internal.ads.zzaag<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.zzaav.S1     // Catch:{ all -> 0x0036 }
            com.google.android.gms.internal.ads.zzaar r2 = com.google.android.gms.internal.ads.zzwg.e()     // Catch:{ all -> 0x0036 }
            java.lang.Object r1 = r2.c(r1)     // Catch:{ all -> 0x0036 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x0036 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0036 }
            if (r1 == 0) goto L_0x0024
            r1 = 1
            goto L_0x0025
        L_0x0024:
            r1 = 0
        L_0x0025:
            if (r1 == 0) goto L_0x002c
            com.google.android.gms.internal.ads.zzae r3 = com.google.android.gms.internal.ads.zzazf.d(r3)     // Catch:{ all -> 0x0036 }
            goto L_0x0030
        L_0x002c:
            com.google.android.gms.internal.ads.zzae r3 = com.google.android.gms.internal.ads.zzbk.a(r3)     // Catch:{ all -> 0x0036 }
        L_0x0030:
            f6086a = r3     // Catch:{ all -> 0x0036 }
        L_0x0032:
            com.google.android.gms.internal.ads.zzae r3 = f6086a     // Catch:{ all -> 0x0036 }
            monitor-exit(r0)     // Catch:{ all -> 0x0036 }
            return r3
        L_0x0036:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0036 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzazq.b(android.content.Context):com.google.android.gms.internal.ads.zzae");
    }

    public static zzdvf<zzy> d(String str) {
        zzbbn zzbbn = new zzbbn();
        f6086a.c(new zzazw(str, zzbbn));
        return zzbbn;
    }

    public final zzdvf<String> a(int i, String str, Map<String, String> map, byte[] bArr) {
        String str2 = str;
        c6 c6Var = new c6((z5) null);
        b6 b6Var = new b6(this, str2, c6Var);
        zzbau zzbau = new zzbau((String) null);
        a6 a6Var = new a6(this, i, str, c6Var, b6Var, bArr, map, zzbau);
        if (zzbau.a()) {
            try {
                zzbau.f(str2, "GET", a6Var.f(), a6Var.H());
            } catch (zzl e2) {
                zzbba.i(e2.getMessage());
            }
        }
        f6086a.c(a6Var);
        return c6Var;
    }

    public final zzdvf<String> c(String str, Map<String, String> map) {
        return a(0, str, map, (byte[]) null);
    }
}
