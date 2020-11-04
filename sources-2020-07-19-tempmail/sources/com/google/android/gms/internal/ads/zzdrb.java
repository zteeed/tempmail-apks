package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.File;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
public final class zzdrb {

    /* renamed from: a  reason: collision with root package name */
    private final File f8328a;
    @VisibleForTesting

    /* renamed from: b  reason: collision with root package name */
    private final File f8329b;

    /* renamed from: c  reason: collision with root package name */
    private final SharedPreferences f8330c;

    /* renamed from: d  reason: collision with root package name */
    private final zzgo f8331d;

    public zzdrb(Context context, zzgo zzgo) {
        this.f8330c = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        zzdre.a(dir, false);
        this.f8328a = dir;
        File dir2 = context.getDir("tmppccache", 0);
        zzdre.a(dir2, true);
        this.f8329b = dir2;
        this.f8331d = zzgo;
    }

    @VisibleForTesting
    private static String a(zzgr zzgr) {
        return Hex.a(zzgr.e().c());
    }

    private final File c() {
        File file = new File(this.f8328a, Integer.toString(this.f8331d.i()));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String d() {
        int i = this.f8331d.i();
        StringBuilder sb = new StringBuilder(17);
        sb.append("FBAMTD");
        sb.append(i);
        return sb.toString();
    }

    private final String e() {
        int i = this.f8331d.i();
        StringBuilder sb = new StringBuilder(17);
        sb.append("LATMTD");
        sb.append(i);
        return sb.toString();
    }

    @VisibleForTesting
    private final zzgr g(int i) {
        String str;
        if (i == zzdrk.f8346a) {
            str = this.f8330c.getString(e(), (String) null);
        } else {
            str = i == zzdrk.f8347b ? this.f8330c.getString(d(), (String) null) : null;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            zzgr b0 = zzgr.b0(zzeer.U(Hex.c(str)));
            String R = b0.R();
            if (zzdre.c(R, "pcam", c()).exists() && zzdre.c(R, "pcbc", c()).exists()) {
                return b0;
            }
            return null;
        } catch (zzegl unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x013b, code lost:
        if (r0.commit() != false) goto L_0x013f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x016d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(com.google.android.gms.internal.ads.zzgq r9, com.google.android.gms.internal.ads.zzdrh r10) {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zzgr r0 = r9.H()
            java.lang.String r0 = r0.R()
            com.google.android.gms.internal.ads.zzeer r1 = r9.I()
            byte[] r1 = r1.c()
            com.google.android.gms.internal.ads.zzeer r2 = r9.L()
            byte[] r2 = r2.c()
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r4 = "pcbc"
            java.lang.String r5 = "pcam"
            r6 = 0
            if (r3 != 0) goto L_0x0059
            if (r2 == 0) goto L_0x0059
            int r3 = r2.length
            if (r3 != 0) goto L_0x0029
            goto L_0x0059
        L_0x0029:
            java.io.File r3 = r8.f8329b
            com.google.android.gms.internal.ads.zzdre.e(r3)
            java.io.File r3 = r8.f8329b
            r3.mkdirs()
            java.io.File r3 = r8.f8329b
            java.io.File r3 = com.google.android.gms.internal.ads.zzdre.b(r0, r3)
            r3.mkdirs()
            java.io.File r3 = r8.f8329b
            java.io.File r3 = com.google.android.gms.internal.ads.zzdre.c(r0, r5, r3)
            if (r1 == 0) goto L_0x004e
            int r7 = r1.length
            if (r7 <= 0) goto L_0x004e
            boolean r1 = com.google.android.gms.internal.ads.zzdre.d(r3, r1)
            if (r1 != 0) goto L_0x004e
            goto L_0x0059
        L_0x004e:
            java.io.File r1 = r8.f8329b
            java.io.File r0 = com.google.android.gms.internal.ads.zzdre.c(r0, r4, r1)
            boolean r0 = com.google.android.gms.internal.ads.zzdre.d(r0, r2)
            goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            if (r0 != 0) goto L_0x005d
            return r6
        L_0x005d:
            com.google.android.gms.internal.ads.zzgr r0 = r9.H()
            java.lang.String r0 = r0.R()
            java.io.File r1 = r8.f8329b
            java.io.File r0 = com.google.android.gms.internal.ads.zzdre.c(r0, r5, r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L_0x007a
            if (r10 == 0) goto L_0x007a
            boolean r10 = r10.a(r0)
            if (r10 != 0) goto L_0x007a
            return r6
        L_0x007a:
            com.google.android.gms.internal.ads.zzgr r10 = r9.H()
            java.lang.String r10 = r10.R()
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            r1 = 1
            if (r0 != 0) goto L_0x00bf
            java.io.File r0 = r8.f8329b
            java.io.File r0 = com.google.android.gms.internal.ads.zzdre.c(r10, r5, r0)
            java.io.File r2 = r8.f8329b
            java.io.File r2 = com.google.android.gms.internal.ads.zzdre.c(r10, r4, r2)
            java.io.File r3 = r8.c()
            java.io.File r3 = com.google.android.gms.internal.ads.zzdre.c(r10, r5, r3)
            java.io.File r5 = r8.c()
            java.io.File r10 = com.google.android.gms.internal.ads.zzdre.c(r10, r4, r5)
            boolean r4 = r0.exists()
            if (r4 == 0) goto L_0x00b1
            boolean r0 = r0.renameTo(r3)
            if (r0 == 0) goto L_0x00bf
        L_0x00b1:
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x00bf
            boolean r10 = r2.renameTo(r10)
            if (r10 == 0) goto L_0x00bf
            r10 = 1
            goto L_0x00c0
        L_0x00bf:
            r10 = 0
        L_0x00c0:
            if (r10 == 0) goto L_0x013e
            com.google.android.gms.internal.ads.zzgr$zza r10 = com.google.android.gms.internal.ads.zzgr.Y()
            com.google.android.gms.internal.ads.zzgr r0 = r9.H()
            java.lang.String r0 = r0.R()
            r10.w(r0)
            com.google.android.gms.internal.ads.zzgr r0 = r9.H()
            java.lang.String r0 = r0.T()
            r10.x(r0)
            com.google.android.gms.internal.ads.zzgr r0 = r9.H()
            long r2 = r0.W()
            r10.z(r2)
            com.google.android.gms.internal.ads.zzgr r0 = r9.H()
            long r2 = r0.X()
            r10.C(r2)
            com.google.android.gms.internal.ads.zzgr r9 = r9.H()
            long r2 = r9.V()
            r10.y(r2)
            com.google.android.gms.internal.ads.zzehl r9 = r10.O()
            com.google.android.gms.internal.ads.zzegb r9 = (com.google.android.gms.internal.ads.zzegb) r9
            com.google.android.gms.internal.ads.zzgr r9 = (com.google.android.gms.internal.ads.zzgr) r9
            int r10 = com.google.android.gms.internal.ads.zzdrk.f8346a
            com.google.android.gms.internal.ads.zzgr r10 = r8.g(r10)
            android.content.SharedPreferences r0 = r8.f8330c
            android.content.SharedPreferences$Editor r0 = r0.edit()
            if (r10 == 0) goto L_0x012c
            java.lang.String r2 = r9.R()
            java.lang.String r3 = r10.R()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x012c
            java.lang.String r2 = r8.d()
            java.lang.String r10 = a(r10)
            r0.putString(r2, r10)
        L_0x012c:
            java.lang.String r10 = r8.e()
            java.lang.String r9 = a(r9)
            r0.putString(r10, r9)
            boolean r9 = r0.commit()
            if (r9 == 0) goto L_0x013e
            goto L_0x013f
        L_0x013e:
            r1 = 0
        L_0x013f:
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            int r10 = com.google.android.gms.internal.ads.zzdrk.f8346a
            com.google.android.gms.internal.ads.zzgr r10 = r8.g(r10)
            if (r10 == 0) goto L_0x0153
            java.lang.String r10 = r10.R()
            r9.add(r10)
        L_0x0153:
            int r10 = com.google.android.gms.internal.ads.zzdrk.f8347b
            com.google.android.gms.internal.ads.zzgr r10 = r8.g(r10)
            if (r10 == 0) goto L_0x0162
            java.lang.String r10 = r10.R()
            r9.add(r10)
        L_0x0162:
            java.io.File r10 = r8.c()
            java.io.File[] r10 = r10.listFiles()
            int r0 = r10.length
        L_0x016b:
            if (r6 >= r0) goto L_0x0187
            r2 = r10[r6]
            java.lang.String r2 = r2.getName()
            boolean r3 = r9.contains(r2)
            if (r3 != 0) goto L_0x0184
            java.io.File r3 = r8.c()
            java.io.File r2 = com.google.android.gms.internal.ads.zzdre.b(r2, r3)
            com.google.android.gms.internal.ads.zzdre.e(r2)
        L_0x0184:
            int r6 = r6 + 1
            goto L_0x016b
        L_0x0187:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdrb.b(com.google.android.gms.internal.ads.zzgq, com.google.android.gms.internal.ads.zzdrh):boolean");
    }

    public final zzdrc f(int i) {
        zzgr g = g(i);
        if (g == null) {
            return null;
        }
        String R = g.R();
        return new zzdrc(g, zzdre.c(R, "pcam", c()), zzdre.c(R, "pcbc", c()), zzdre.c(R, "pcopt", c()));
    }
}
