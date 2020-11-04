package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzbt;
import com.google.android.gms.internal.measurement.zzcb;
import com.google.android.gms.internal.measurement.zzfb;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzfw;
import com.google.android.gms.internal.measurement.zzgz;
import com.google.android.gms.internal.measurement.zzjw;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
public final class zzkn extends m7 {
    zzkn(zzkj zzkj) {
        super(zzkj);
    }

    static <Builder extends zzgz> Builder A(Builder builder, byte[] bArr) throws zzfw {
        zzfb c2 = zzfb.c();
        if (c2 != null) {
            return builder.B(bArr, c2);
        }
        return builder.A(bArr);
    }

    private static String E(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    static List<Long> F(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i << 6) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    private static List<zzcb.zze> H(Bundle[] bundleArr) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : bundleArr) {
            if (bundle != null) {
                zzcb.zze.zza g0 = zzcb.zze.g0();
                for (String str : bundle.keySet()) {
                    zzcb.zze.zza g02 = zzcb.zze.g0();
                    g02.I(str);
                    Object obj = bundle.get(str);
                    if (obj instanceof Long) {
                        g02.E(((Long) obj).longValue());
                    } else if (obj instanceof String) {
                        g02.M((String) obj);
                    } else if (obj instanceof Double) {
                        g02.D(((Double) obj).doubleValue());
                    }
                    g0.F(g02);
                }
                if (g0.Q() > 0) {
                    arrayList.add((zzcb.zze) ((zzfo) g0.q()));
                }
            }
        }
        return arrayList;
    }

    private static void L(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    private final void M(StringBuilder sb, int i, zzbt.zzc zzc) {
        if (zzc != null) {
            L(sb, i);
            sb.append("filter {\n");
            if (zzc.J()) {
                P(sb, i, "complement", Boolean.valueOf(zzc.K()));
            }
            if (zzc.L()) {
                P(sb, i, "param_name", e().z(zzc.M()));
            }
            if (zzc.F()) {
                int i2 = i + 1;
                zzbt.zzf G = zzc.G();
                if (G != null) {
                    L(sb, i2);
                    sb.append("string_filter");
                    sb.append(" {\n");
                    if (G.D()) {
                        P(sb, i2, "match_type", G.E().name());
                    }
                    if (G.F()) {
                        P(sb, i2, "expression", G.G());
                    }
                    if (G.H()) {
                        P(sb, i2, "case_sensitive", Boolean.valueOf(G.I()));
                    }
                    if (G.K() > 0) {
                        L(sb, i2 + 1);
                        sb.append("expression_list {\n");
                        for (String append : G.J()) {
                            L(sb, i2 + 2);
                            sb.append(append);
                            sb.append("\n");
                        }
                        sb.append("}\n");
                    }
                    L(sb, i2);
                    sb.append("}\n");
                }
            }
            if (zzc.H()) {
                N(sb, i + 1, "number_filter", zzc.I());
            }
            L(sb, i);
            sb.append("}\n");
        }
    }

    private final void N(StringBuilder sb, int i, String str, zzbt.zzd zzd) {
        if (zzd != null) {
            L(sb, i);
            sb.append(str);
            sb.append(" {\n");
            if (zzd.D()) {
                P(sb, i, "comparison_type", zzd.E().name());
            }
            if (zzd.F()) {
                P(sb, i, "match_as_float", Boolean.valueOf(zzd.G()));
            }
            if (zzd.H()) {
                P(sb, i, "comparison_value", zzd.I());
            }
            if (zzd.J()) {
                P(sb, i, "min_comparison_value", zzd.K());
            }
            if (zzd.L()) {
                P(sb, i, "max_comparison_value", zzd.M());
            }
            L(sb, i);
            sb.append("}\n");
        }
    }

    private static void O(StringBuilder sb, int i, String str, zzcb.zzi zzi, String str2) {
        if (zzi != null) {
            L(sb, 3);
            sb.append(str);
            sb.append(" {\n");
            if (zzi.T() != 0) {
                L(sb, 4);
                sb.append("results: ");
                int i2 = 0;
                for (Long next : zzi.Q()) {
                    int i3 = i2 + 1;
                    if (i2 != 0) {
                        sb.append(", ");
                    }
                    sb.append(next);
                    i2 = i3;
                }
                sb.append(10);
            }
            if (zzi.J() != 0) {
                L(sb, 4);
                sb.append("status: ");
                int i4 = 0;
                for (Long next2 : zzi.E()) {
                    int i5 = i4 + 1;
                    if (i4 != 0) {
                        sb.append(", ");
                    }
                    sb.append(next2);
                    i4 = i5;
                }
                sb.append(10);
            }
            if (zzi.Z() != 0) {
                L(sb, 4);
                sb.append("dynamic_filter_timestamps: {");
                int i6 = 0;
                for (zzcb.zzb next3 : zzi.X()) {
                    int i7 = i6 + 1;
                    if (i6 != 0) {
                        sb.append(", ");
                    }
                    sb.append(next3.H() ? Integer.valueOf(next3.I()) : null);
                    sb.append(":");
                    sb.append(next3.J() ? Long.valueOf(next3.K()) : null);
                    i6 = i7;
                }
                sb.append("}\n");
            }
            if (zzi.b0() != 0) {
                L(sb, 4);
                sb.append("sequence_filter_timestamps: {");
                int i8 = 0;
                for (zzcb.zzj next4 : zzi.a0()) {
                    int i9 = i8 + 1;
                    if (i8 != 0) {
                        sb.append(", ");
                    }
                    sb.append(next4.H() ? Integer.valueOf(next4.I()) : null);
                    sb.append(": [");
                    int i10 = 0;
                    for (Long longValue : next4.K()) {
                        long longValue2 = longValue.longValue();
                        int i11 = i10 + 1;
                        if (i10 != 0) {
                            sb.append(", ");
                        }
                        sb.append(longValue2);
                        i10 = i11;
                    }
                    sb.append("]");
                    i8 = i9;
                }
                sb.append("}\n");
            }
            L(sb, 3);
            sb.append("}\n");
        }
    }

    private static void P(StringBuilder sb, int i, String str, Object obj) {
        if (obj != null) {
            L(sb, i + 1);
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append(10);
        }
    }

    private final void Q(StringBuilder sb, int i, List<zzcb.zze> list) {
        if (list != null) {
            int i2 = i + 1;
            for (zzcb.zze next : list) {
                if (next != null) {
                    L(sb, i2);
                    sb.append("param {\n");
                    Double d2 = null;
                    if (!zzjw.b() || !l().t(zzaq.E0)) {
                        P(sb, i2, "name", e().z(next.P()));
                        P(sb, i2, "string_value", next.V());
                        P(sb, i2, "int_value", next.Y() ? Long.valueOf(next.Z()) : null);
                        if (next.c0()) {
                            d2 = Double.valueOf(next.d0());
                        }
                        P(sb, i2, "double_value", d2);
                    } else {
                        P(sb, i2, "name", next.O() ? e().z(next.P()) : null);
                        P(sb, i2, "string_value", next.U() ? next.V() : null);
                        P(sb, i2, "int_value", next.Y() ? Long.valueOf(next.Z()) : null);
                        if (next.c0()) {
                            d2 = Double.valueOf(next.d0());
                        }
                        P(sb, i2, "double_value", d2);
                        if (next.f0() > 0) {
                            Q(sb, i2, next.e0());
                        }
                    }
                    L(sb, i2);
                    sb.append("}\n");
                }
            }
        }
    }

    static boolean S(zzao zzao, zzn zzn) {
        Preconditions.k(zzao);
        Preconditions.k(zzn);
        return !TextUtils.isEmpty(zzn.f10710c) || !TextUtils.isEmpty(zzn.s);
    }

    static boolean T(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    static boolean U(List<Long> list, int i) {
        if (i >= (list.size() << 6)) {
            return false;
        }
        return ((1 << (i % 64)) & list.get(i / 64).longValue()) != 0;
    }

    static int v(zzcb.zzg.zza zza, String str) {
        if (zza == null) {
            return -1;
        }
        for (int i = 0; i < zza.h0(); i++) {
            if (str.equals(zza.f0(i).S())) {
                return i;
            }
        }
        return -1;
    }

    static zzcb.zze z(zzcb.zzc zzc, String str) {
        for (zzcb.zze next : zzc.E()) {
            if (next.P().equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final String B(zzbt.zzb zzb) {
        if (zzb == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (zzb.I()) {
            P(sb, 0, "filter_id", Integer.valueOf(zzb.J()));
        }
        P(sb, 0, "event_name", e().w(zzb.K()));
        String E = E(zzb.Q(), zzb.R(), zzb.T());
        if (!E.isEmpty()) {
            P(sb, 0, "filter_type", E);
        }
        if (zzb.O()) {
            N(sb, 1, "event_count_filter", zzb.P());
        }
        if (zzb.M() > 0) {
            sb.append("  filters {\n");
            for (zzbt.zzc M : zzb.L()) {
                M(sb, 2, M);
            }
        }
        L(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final String C(zzbt.zze zze) {
        if (zze == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (zze.F()) {
            P(sb, 0, "filter_id", Integer.valueOf(zze.G()));
        }
        P(sb, 0, "property_name", e().A(zze.H()));
        String E = E(zze.J(), zze.K(), zze.M());
        if (!E.isEmpty()) {
            P(sb, 0, "filter_type", E);
        }
        M(sb, 1, zze.I());
        sb.append("}\n");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final String D(zzcb.zzf zzf) {
        if (zzf == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (zzcb.zzg next : zzf.E()) {
            if (next != null) {
                L(sb, 1);
                sb.append("bundle {\n");
                if (next.X()) {
                    P(sb, 1, "protocol_version", Integer.valueOf(next.y0()));
                }
                P(sb, 1, "platform", next.B2());
                if (next.K2()) {
                    P(sb, 1, "gmp_version", Long.valueOf(next.Y()));
                }
                if (next.Z()) {
                    P(sb, 1, "uploading_gmp_version", Long.valueOf(next.a0()));
                }
                if (next.K0()) {
                    P(sb, 1, "dynamite_version", Long.valueOf(next.L0()));
                }
                if (next.s0()) {
                    P(sb, 1, "config_version", Long.valueOf(next.t0()));
                }
                P(sb, 1, "gmp_app_id", next.k0());
                P(sb, 1, "admob_app_id", next.J0());
                P(sb, 1, "app_id", next.I2());
                P(sb, 1, "app_version", next.J2());
                if (next.p0()) {
                    P(sb, 1, "app_version_major", Integer.valueOf(next.q0()));
                }
                P(sb, 1, "firebase_instance_id", next.o0());
                if (next.f0()) {
                    P(sb, 1, "dev_cert_hash", Long.valueOf(next.g0()));
                }
                P(sb, 1, "app_store", next.H2());
                if (next.M1()) {
                    P(sb, 1, "upload_timestamp_millis", Long.valueOf(next.N1()));
                }
                if (next.Y1()) {
                    P(sb, 1, "start_timestamp_millis", Long.valueOf(next.Z1()));
                }
                if (next.j2()) {
                    P(sb, 1, "end_timestamp_millis", Long.valueOf(next.k2()));
                }
                if (next.r2()) {
                    P(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(next.s2()));
                }
                if (next.x2()) {
                    P(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(next.y2()));
                }
                P(sb, 1, "app_instance_id", next.e0());
                P(sb, 1, "resettable_device_id", next.b0());
                P(sb, 1, "device_id", next.r0());
                P(sb, 1, "ds_id", next.w0());
                if (next.c0()) {
                    P(sb, 1, "limited_ad_tracking", Boolean.valueOf(next.d0()));
                }
                P(sb, 1, "os_version", next.C2());
                P(sb, 1, "device_model", next.D2());
                P(sb, 1, "user_default_language", next.E2());
                if (next.F2()) {
                    P(sb, 1, "time_zone_offset_minutes", Integer.valueOf(next.G2()));
                }
                if (next.h0()) {
                    P(sb, 1, "bundle_sequential_index", Integer.valueOf(next.i0()));
                }
                if (next.l0()) {
                    P(sb, 1, "service_upload", Boolean.valueOf(next.m0()));
                }
                P(sb, 1, "health_monitor", next.j0());
                if (!l().t(zzaq.M0) && next.u0() && next.v0() != 0) {
                    P(sb, 1, "android_id", Long.valueOf(next.v0()));
                }
                if (next.x0()) {
                    P(sb, 1, "retry_counter", Integer.valueOf(next.I0()));
                }
                List<zzcb.zzk> q1 = next.q1();
                if (q1 != null) {
                    for (zzcb.zzk next2 : q1) {
                        if (next2 != null) {
                            L(sb, 2);
                            sb.append("user_property {\n");
                            Double d2 = null;
                            P(sb, 2, "set_timestamp_millis", next2.K() ? Long.valueOf(next2.L()) : null);
                            P(sb, 2, "name", e().A(next2.S()));
                            P(sb, 2, "string_value", next2.V());
                            P(sb, 2, "int_value", next2.W() ? Long.valueOf(next2.X()) : null);
                            if (next2.Y()) {
                                d2 = Double.valueOf(next2.Z());
                            }
                            P(sb, 2, "double_value", d2);
                            L(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<zzcb.zza> n0 = next.n0();
                String I2 = next.I2();
                if (n0 != null) {
                    for (zzcb.zza next3 : n0) {
                        if (next3 != null) {
                            L(sb, 2);
                            sb.append("audience_membership {\n");
                            if (next3.J()) {
                                P(sb, 2, "audience_id", Integer.valueOf(next3.K()));
                            }
                            if (next3.R()) {
                                P(sb, 2, "new_audience", Boolean.valueOf(next3.S()));
                            }
                            O(sb, 2, "current_data", next3.O(), I2);
                            if (next3.P()) {
                                O(sb, 2, "previous_data", next3.Q(), I2);
                            }
                            L(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<zzcb.zzc> X0 = next.X0();
                if (X0 != null) {
                    for (zzcb.zzc next4 : X0) {
                        if (next4 != null) {
                            L(sb, 2);
                            sb.append("event {\n");
                            P(sb, 2, "name", e().w(next4.W()));
                            if (next4.X()) {
                                P(sb, 2, "timestamp_millis", Long.valueOf(next4.Y()));
                            }
                            if (next4.Z()) {
                                P(sb, 2, "previous_timestamp_millis", Long.valueOf(next4.a0()));
                            }
                            if (next4.b0()) {
                                P(sb, 2, "count", Integer.valueOf(next4.c0()));
                            }
                            if (next4.S() != 0) {
                                Q(sb, 2, next4.E());
                            }
                            L(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                L(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final List<Long> G(List<Long> list, List<Integer> list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        for (Integer next : list2) {
            if (next.intValue() < 0) {
                h().J().b("Ignoring negative bit index to be cleared", next);
            } else {
                int intValue = next.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    h().J().c("Ignoring bit index greater than bitSet size", next, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (next.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size >= 0 && ((Long) arrayList.get(size)).longValue() == 0) {
                size2 = size - 1;
            }
        }
        return arrayList.subList(0, i);
    }

    /* access modifiers changed from: package-private */
    public final void I(zzcb.zzc.zza zza, String str, Object obj) {
        List<zzcb.zze> P = zza.P();
        int i = 0;
        while (true) {
            if (i >= P.size()) {
                i = -1;
                break;
            } else if (str.equals(P.get(i).P())) {
                break;
            } else {
                i++;
            }
        }
        zzcb.zze.zza g0 = zzcb.zze.g0();
        g0.I(str);
        if (obj instanceof Long) {
            g0.E(((Long) obj).longValue());
        } else if (obj instanceof String) {
            g0.M((String) obj);
        } else if (obj instanceof Double) {
            g0.D(((Double) obj).doubleValue());
        } else if (zzjw.b() && l().t(zzaq.G0) && (obj instanceof Bundle[])) {
            g0.H(H((Bundle[]) obj));
        }
        if (i >= 0) {
            zza.C(i, g0);
        } else {
            zza.F(g0);
        }
    }

    /* access modifiers changed from: package-private */
    public final void J(zzcb.zze.zza zza, Object obj) {
        Preconditions.k(obj);
        zza.C();
        zza.L();
        zza.P();
        zza.R();
        if (obj instanceof String) {
            zza.M((String) obj);
        } else if (obj instanceof Long) {
            zza.E(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zza.D(((Double) obj).doubleValue());
        } else if (!zzjw.b() || !l().t(zzaq.G0) || !(obj instanceof Bundle[])) {
            h().G().b("Ignoring invalid (type) event param value", obj);
        } else {
            zza.H(H((Bundle[]) obj));
        }
    }

    /* access modifiers changed from: package-private */
    public final void K(zzcb.zzk.zza zza, Object obj) {
        Preconditions.k(obj);
        zza.C();
        zza.H();
        zza.M();
        if (obj instanceof String) {
            zza.L((String) obj);
        } else if (obj instanceof Long) {
            zza.I(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zza.D(((Double) obj).doubleValue());
        } else {
            h().G().b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean R(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(n().a() - j) > j2;
    }

    /* access modifiers changed from: package-private */
    public final Object V(zzcb.zzc zzc, String str) {
        zzcb.zze z = z(zzc, str);
        if (z == null) {
            return null;
        }
        if (z.U()) {
            return z.V();
        }
        if (z.Y()) {
            return Long.valueOf(z.Z());
        }
        if (z.c0()) {
            return Double.valueOf(z.d0());
        }
        if (!zzjw.b() || !l().t(zzaq.G0) || z.f0() <= 0) {
            return null;
        }
        List<zzcb.zze> e0 = z.e0();
        ArrayList arrayList = new ArrayList();
        for (zzcb.zze next : e0) {
            if (next != null) {
                Bundle bundle = new Bundle();
                for (zzcb.zze next2 : next.e0()) {
                    if (next2.U()) {
                        bundle.putString(next2.P(), next2.V());
                    } else if (next2.Y()) {
                        bundle.putLong(next2.P(), next2.Z());
                    } else if (next2.c0()) {
                        bundle.putDouble(next2.P(), next2.d0());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* access modifiers changed from: package-private */
    public final byte[] W(byte[] bArr) throws IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e2) {
            h().G().b("Failed to ungzip content", e2);
            throw e2;
        }
    }

    /* access modifiers changed from: package-private */
    public final byte[] X(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            h().G().b("Failed to gzip content", e2);
            throw e2;
        }
    }

    /* access modifiers changed from: package-private */
    public final List<Integer> Y() {
        Map<String, String> c2 = zzaq.c(this.f10329b.f());
        if (c2 == null || c2.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int intValue = zzaq.P.a(null).intValue();
        Iterator<Map.Entry<String, String>> it = c2.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry next = it.next();
            if (((String) next.getKey()).startsWith("measurement.id.")) {
                try {
                    int parseInt = Integer.parseInt((String) next.getValue());
                    if (parseInt != 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                        if (arrayList.size() >= intValue) {
                            h().J().b("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e2) {
                    h().J().b("Experiment ID NumberFormatException", e2);
                }
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public final boolean u() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final long w(byte[] bArr) {
        Preconditions.k(bArr);
        j().c();
        MessageDigest J0 = zzkr.J0();
        if (J0 != null) {
            return zzkr.z(J0.digest(bArr));
        }
        h().G().a("Failed to get MD5");
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        h().G().a("Failed to load parcelable from buffer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T extends android.os.Parcelable> T x(byte[] r5, android.os.Parcelable.Creator<T> r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            int r2 = r5.length     // Catch:{ ParseException -> 0x001c }
            r3 = 0
            r1.unmarshall(r5, r3, r2)     // Catch:{ ParseException -> 0x001c }
            r1.setDataPosition(r3)     // Catch:{ ParseException -> 0x001c }
            java.lang.Object r5 = r6.createFromParcel(r1)     // Catch:{ ParseException -> 0x001c }
            android.os.Parcelable r5 = (android.os.Parcelable) r5     // Catch:{ ParseException -> 0x001c }
            r1.recycle()
            return r5
        L_0x001a:
            r5 = move-exception
            goto L_0x002d
        L_0x001c:
            com.google.android.gms.measurement.internal.zzeu r5 = r4.h()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.zzew r5 = r5.G()     // Catch:{ all -> 0x001a }
            java.lang.String r6 = "Failed to load parcelable from buffer"
            r5.a(r6)     // Catch:{ all -> 0x001a }
            r1.recycle()
            return r0
        L_0x002d:
            r1.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkn.x(byte[], android.os.Parcelable$Creator):android.os.Parcelable");
    }

    /* access modifiers changed from: package-private */
    public final zzcb.zzc y(zzal zzal) {
        zzcb.zzc.zza d0 = zzcb.zzc.d0();
        d0.S(zzal.f10560e);
        Iterator<String> it = zzal.f10561f.iterator();
        while (it.hasNext()) {
            String next = it.next();
            zzcb.zze.zza g0 = zzcb.zze.g0();
            g0.I(next);
            J(g0, zzal.f10561f.A(next));
            d0.F(g0);
        }
        return (zzcb.zzc) ((zzfo) d0.q());
    }
}
