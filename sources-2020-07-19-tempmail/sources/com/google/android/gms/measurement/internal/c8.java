package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzbt;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
abstract class c8 {

    /* renamed from: a  reason: collision with root package name */
    String f9951a;

    /* renamed from: b  reason: collision with root package name */
    int f9952b;

    /* renamed from: c  reason: collision with root package name */
    Boolean f9953c;

    /* renamed from: d  reason: collision with root package name */
    Boolean f9954d;

    /* renamed from: e  reason: collision with root package name */
    Long f9955e;

    /* renamed from: f  reason: collision with root package name */
    Long f9956f;

    c8(String str, int i) {
        this.f9951a = str;
        this.f9952b = i;
    }

    static Boolean b(double d2, zzbt.zzd zzd) {
        try {
            return h(new BigDecimal(d2), zzd, Math.ulp(d2));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean c(long j, zzbt.zzd zzd) {
        try {
            return h(new BigDecimal(j), zzd, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @VisibleForTesting
    static Boolean d(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    static Boolean e(String str, zzbt.zzd zzd) {
        if (!zzkn.T(str)) {
            return null;
        }
        try {
            return h(new BigDecimal(str), zzd, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static Boolean f(String str, zzbt.zzf.zzb zzb, boolean z, String str2, List<String> list, String str3, zzeu zzeu) {
        if (str == null) {
            return null;
        }
        if (zzb == zzbt.zzf.zzb.IN_LIST) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && zzb != zzbt.zzf.zzb.REGEXP) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (y7.f10341a[zzb.ordinal()]) {
            case 1:
                try {
                    return Boolean.valueOf(Pattern.compile(str3, z ? 0 : 66).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (zzeu != null) {
                        zzeu.J().b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case 5:
                return Boolean.valueOf(str.equals(str2));
            case 6:
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    @VisibleForTesting
    static Boolean g(String str, zzbt.zzf zzf, zzeu zzeu) {
        String str2;
        List<String> list;
        Preconditions.k(zzf);
        if (str == null || !zzf.D() || zzf.E() == zzbt.zzf.zzb.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        if (zzf.E() == zzbt.zzf.zzb.IN_LIST) {
            if (zzf.K() == 0) {
                return null;
            }
        } else if (!zzf.F()) {
            return null;
        }
        zzbt.zzf.zzb E = zzf.E();
        boolean I = zzf.I();
        if (I || E == zzbt.zzf.zzb.REGEXP || E == zzbt.zzf.zzb.IN_LIST) {
            str2 = zzf.G();
        } else {
            str2 = zzf.G().toUpperCase(Locale.ENGLISH);
        }
        String str3 = str2;
        if (zzf.K() == 0) {
            list = null;
        } else {
            List<String> J = zzf.J();
            if (!I) {
                ArrayList arrayList = new ArrayList(J.size());
                for (String upperCase : J) {
                    arrayList.add(upperCase.toUpperCase(Locale.ENGLISH));
                }
                J = Collections.unmodifiableList(arrayList);
            }
            list = J;
        }
        return f(str, E, I, str3, list, E == zzbt.zzf.zzb.REGEXP ? str3 : null, zzeu);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0085, code lost:
        if (r2 != null) goto L_0x0087;
     */
    @com.google.android.gms.common.util.VisibleForTesting
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Boolean h(java.math.BigDecimal r9, com.google.android.gms.internal.measurement.zzbt.zzd r10, double r11) {
        /*
            com.google.android.gms.common.internal.Preconditions.k(r10)
            boolean r0 = r10.D()
            r1 = 0
            if (r0 == 0) goto L_0x0110
            com.google.android.gms.internal.measurement.zzbt$zzd$zza r0 = r10.E()
            com.google.android.gms.internal.measurement.zzbt$zzd$zza r2 = com.google.android.gms.internal.measurement.zzbt.zzd.zza.UNKNOWN_COMPARISON_TYPE
            if (r0 != r2) goto L_0x0014
            goto L_0x0110
        L_0x0014:
            com.google.android.gms.internal.measurement.zzbt$zzd$zza r0 = r10.E()
            com.google.android.gms.internal.measurement.zzbt$zzd$zza r2 = com.google.android.gms.internal.measurement.zzbt.zzd.zza.BETWEEN
            if (r0 != r2) goto L_0x0029
            boolean r0 = r10.J()
            if (r0 == 0) goto L_0x0028
            boolean r0 = r10.L()
            if (r0 != 0) goto L_0x0030
        L_0x0028:
            return r1
        L_0x0029:
            boolean r0 = r10.H()
            if (r0 != 0) goto L_0x0030
            return r1
        L_0x0030:
            com.google.android.gms.internal.measurement.zzbt$zzd$zza r0 = r10.E()
            com.google.android.gms.internal.measurement.zzbt$zzd$zza r2 = r10.E()
            com.google.android.gms.internal.measurement.zzbt$zzd$zza r3 = com.google.android.gms.internal.measurement.zzbt.zzd.zza.BETWEEN
            if (r2 != r3) goto L_0x0067
            java.lang.String r2 = r10.K()
            boolean r2 = com.google.android.gms.measurement.internal.zzkn.T(r2)
            if (r2 == 0) goto L_0x0066
            java.lang.String r2 = r10.M()
            boolean r2 = com.google.android.gms.measurement.internal.zzkn.T(r2)
            if (r2 != 0) goto L_0x0051
            goto L_0x0066
        L_0x0051:
            java.math.BigDecimal r2 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0066 }
            java.lang.String r3 = r10.K()     // Catch:{ NumberFormatException -> 0x0066 }
            r2.<init>(r3)     // Catch:{ NumberFormatException -> 0x0066 }
            java.math.BigDecimal r3 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0066 }
            java.lang.String r10 = r10.M()     // Catch:{ NumberFormatException -> 0x0066 }
            r3.<init>(r10)     // Catch:{ NumberFormatException -> 0x0066 }
            r10 = r2
            r2 = r1
            goto L_0x007d
        L_0x0066:
            return r1
        L_0x0067:
            java.lang.String r2 = r10.I()
            boolean r2 = com.google.android.gms.measurement.internal.zzkn.T(r2)
            if (r2 != 0) goto L_0x0072
            return r1
        L_0x0072:
            java.math.BigDecimal r2 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0110 }
            java.lang.String r10 = r10.I()     // Catch:{ NumberFormatException -> 0x0110 }
            r2.<init>(r10)     // Catch:{ NumberFormatException -> 0x0110 }
            r10 = r1
            r3 = r10
        L_0x007d:
            com.google.android.gms.internal.measurement.zzbt$zzd$zza r4 = com.google.android.gms.internal.measurement.zzbt.zzd.zza.BETWEEN
            if (r0 != r4) goto L_0x0085
            if (r10 == 0) goto L_0x0084
            goto L_0x0087
        L_0x0084:
            return r1
        L_0x0085:
            if (r2 == 0) goto L_0x0110
        L_0x0087:
            int[] r4 = com.google.android.gms.measurement.internal.y7.f10342b
            int r0 = r0.ordinal()
            r0 = r4[r0]
            r4 = -1
            r5 = 0
            r6 = 1
            if (r0 == r6) goto L_0x0104
            r7 = 2
            if (r0 == r7) goto L_0x00f8
            r8 = 3
            if (r0 == r8) goto L_0x00b0
            r11 = 4
            if (r0 == r11) goto L_0x009e
            goto L_0x0110
        L_0x009e:
            int r10 = r9.compareTo(r10)
            if (r10 == r4) goto L_0x00ab
            int r9 = r9.compareTo(r3)
            if (r9 == r6) goto L_0x00ab
            r5 = 1
        L_0x00ab:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        L_0x00b0:
            r0 = 0
            int r10 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r10 == 0) goto L_0x00ec
            java.math.BigDecimal r10 = new java.math.BigDecimal
            r10.<init>(r11)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r7)
            java.math.BigDecimal r10 = r10.multiply(r0)
            java.math.BigDecimal r10 = r2.subtract(r10)
            int r10 = r9.compareTo(r10)
            if (r10 != r6) goto L_0x00e7
            java.math.BigDecimal r10 = new java.math.BigDecimal
            r10.<init>(r11)
            java.math.BigDecimal r11 = new java.math.BigDecimal
            r11.<init>(r7)
            java.math.BigDecimal r10 = r10.multiply(r11)
            java.math.BigDecimal r10 = r2.add(r10)
            int r9 = r9.compareTo(r10)
            if (r9 != r4) goto L_0x00e7
            r5 = 1
        L_0x00e7:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        L_0x00ec:
            int r9 = r9.compareTo(r2)
            if (r9 != 0) goto L_0x00f3
            r5 = 1
        L_0x00f3:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        L_0x00f8:
            int r9 = r9.compareTo(r2)
            if (r9 != r6) goto L_0x00ff
            r5 = 1
        L_0x00ff:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        L_0x0104:
            int r9 = r9.compareTo(r2)
            if (r9 != r4) goto L_0x010b
            r5 = 1
        L_0x010b:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        L_0x0110:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.c8.h(java.math.BigDecimal, com.google.android.gms.internal.measurement.zzbt$zzd, double):java.lang.Boolean");
    }

    /* access modifiers changed from: package-private */
    public abstract int a();

    /* access modifiers changed from: package-private */
    public abstract boolean i();

    /* access modifiers changed from: package-private */
    public abstract boolean j();
}
