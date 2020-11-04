package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzjw;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzes extends s4 {

    /* renamed from: c  reason: collision with root package name */
    private static final AtomicReference<String[]> f10585c = new AtomicReference<>();

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicReference<String[]> f10586d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicReference<String[]> f10587e = new AtomicReference<>();

    zzes(zzfy zzfy) {
        super(zzfy);
    }

    private final boolean B() {
        m();
        return this.f10357a.J() && this.f10357a.h().C(3);
    }

    private static String x(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        Preconditions.k(strArr);
        Preconditions.k(strArr2);
        Preconditions.k(atomicReference);
        Preconditions.a(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (zzkr.A0(str, strArr[i])) {
                synchronized (atomicReference) {
                    String[] strArr3 = atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    if (strArr3[i] == null) {
                        strArr3[i] = strArr2[i] + "(" + strArr[i] + ")";
                    }
                    str2 = strArr3[i];
                }
                return str2;
            }
        }
        return str;
    }

    private final String y(Object[] objArr) {
        String str;
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Bundle bundle : objArr) {
            if (bundle instanceof Bundle) {
                str = u(bundle);
            } else {
                str = String.valueOf(bundle);
            }
            if (str != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(str);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final String A(String str) {
        if (str == null) {
            return null;
        }
        if (!B()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return x(str, zzgy.f10649b, zzgy.f10648a, f10587e);
        }
        return "experiment_id" + "(" + str + ")";
    }

    /* access modifiers changed from: protected */
    public final boolean s() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final String u(Bundle bundle) {
        String str;
        if (bundle == null) {
            return null;
        }
        if (!B()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str2 : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(z(str2));
            sb.append("=");
            if (!zzjw.b() || !l().t(zzaq.E0)) {
                sb.append(bundle.get(str2));
            } else {
                Object obj = bundle.get(str2);
                if (obj instanceof Bundle) {
                    str = y(new Object[]{obj});
                } else if (obj instanceof Object[]) {
                    str = y((Object[]) obj);
                } else if (obj instanceof ArrayList) {
                    str = y(((ArrayList) obj).toArray());
                } else {
                    str = String.valueOf(obj);
                }
                sb.append(str);
            }
        }
        sb.append("}]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final String v(zzao zzao) {
        String str = null;
        if (zzao == null) {
            return null;
        }
        if (!B()) {
            return zzao.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(zzao.f10565d);
        sb.append(",name=");
        sb.append(w(zzao.f10563b));
        sb.append(",params=");
        zzan zzan = zzao.f10564c;
        if (zzan != null) {
            if (!B()) {
                str = zzan.toString();
            } else {
                str = u(zzan.B());
            }
        }
        sb.append(str);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final String w(String str) {
        if (str == null) {
            return null;
        }
        if (!B()) {
            return str;
        }
        return x(str, zzgw.f10646b, zzgw.f10645a, f10585c);
    }

    /* access modifiers changed from: protected */
    public final String z(String str) {
        if (str == null) {
            return null;
        }
        if (!B()) {
            return str;
        }
        return x(str, zzgz.f10651b, zzgz.f10650a, f10586d);
    }
}
