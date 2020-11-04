package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.measurement.internal.zzgw;
import com.google.android.gms.measurement.internal.zzgx;
import com.google.android.gms.measurement.internal.zzgy;
import com.google.android.gms.measurement.internal.zzig;
import com.google.firebase.analytics.a.a;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement-api@@17.4.3 */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final Set<String> f11559a = new HashSet(Arrays.asList(new String[]{"_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}));

    /* renamed from: b  reason: collision with root package name */
    private static final List<String> f11560b = Arrays.asList(new String[]{"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"});

    /* renamed from: c  reason: collision with root package name */
    private static final List<String> f11561c = Arrays.asList(new String[]{"auto", "app", "am"});

    /* renamed from: d  reason: collision with root package name */
    private static final List<String> f11562d = Arrays.asList(new String[]{"_r", "_dbg"});

    /* renamed from: e  reason: collision with root package name */
    private static final List<String> f11563e = Arrays.asList((String[]) ArrayUtils.a(zzgy.f10648a, zzgy.f10649b));

    /* renamed from: f  reason: collision with root package name */
    private static final List<String> f11564f = Arrays.asList(new String[]{"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"});

    public static a.c a(Bundle bundle) {
        Class cls = Long.class;
        Class cls2 = String.class;
        Preconditions.k(bundle);
        a.c cVar = new a.c();
        cVar.f11547a = (String) zzgx.a(bundle, "origin", cls2, null);
        cVar.f11548b = (String) zzgx.a(bundle, "name", cls2, null);
        cVar.f11549c = zzgx.a(bundle, "value", Object.class, null);
        cVar.f11550d = (String) zzgx.a(bundle, "trigger_event_name", cls2, null);
        cVar.f11551e = ((Long) zzgx.a(bundle, "trigger_timeout", cls, 0L)).longValue();
        cVar.f11552f = (String) zzgx.a(bundle, "timed_out_event_name", cls2, null);
        cVar.g = (Bundle) zzgx.a(bundle, "timed_out_event_params", Bundle.class, null);
        cVar.h = (String) zzgx.a(bundle, "triggered_event_name", cls2, null);
        cVar.i = (Bundle) zzgx.a(bundle, "triggered_event_params", Bundle.class, null);
        cVar.j = ((Long) zzgx.a(bundle, "time_to_live", cls, 0L)).longValue();
        cVar.k = (String) zzgx.a(bundle, "expired_event_name", cls2, null);
        cVar.l = (Bundle) zzgx.a(bundle, "expired_event_params", Bundle.class, null);
        cVar.n = ((Boolean) zzgx.a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
        cVar.m = ((Long) zzgx.a(bundle, "creation_timestamp", cls, 0L)).longValue();
        cVar.o = ((Long) zzgx.a(bundle, "triggered_timestamp", cls, 0L)).longValue();
        return cVar;
    }

    public static boolean b(a.c cVar) {
        String str;
        if (cVar == null || (str = cVar.f11547a) == null || str.isEmpty()) {
            return false;
        }
        Object obj = cVar.f11549c;
        if ((obj != null && zzig.a(obj) == null) || !c(str) || !e(str, cVar.f11548b)) {
            return false;
        }
        String str2 = cVar.k;
        if (str2 != null && (!d(str2, cVar.l) || !f(str, cVar.k, cVar.l))) {
            return false;
        }
        String str3 = cVar.h;
        if (str3 != null && (!d(str3, cVar.i) || !f(str, cVar.h, cVar.i))) {
            return false;
        }
        String str4 = cVar.f11552f;
        if (str4 == null) {
            return true;
        }
        if (d(str4, cVar.g) && f(str, cVar.f11552f, cVar.g)) {
            return true;
        }
        return false;
    }

    public static boolean c(String str) {
        return !f11561c.contains(str);
    }

    public static boolean d(String str, Bundle bundle) {
        if (f11560b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        for (String containsKey : f11562d) {
            if (bundle.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    public static boolean e(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        }
        if (f11563e.contains(str2)) {
            return false;
        }
        for (String matches : f11564f) {
            if (str2.matches(matches)) {
                return false;
            }
        }
        return true;
    }

    public static boolean f(String str, String str2, Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!c(str) || bundle == null) {
            return false;
        }
        for (String containsKey : f11562d) {
            if (bundle.containsKey(containsKey)) {
                return false;
            }
        }
        char c2 = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 101200) {
            if (hashCode != 101230) {
                if (hashCode == 3142703 && str.equals("fiam")) {
                    c2 = 2;
                }
            } else if (str.equals("fdl")) {
                c2 = 1;
            }
        } else if (str.equals("fcm")) {
            c2 = 0;
        }
        if (c2 == 0) {
            bundle.putString("_cis", "fcm_integration");
            return true;
        } else if (c2 == 1) {
            bundle.putString("_cis", "fdl_integration");
            return true;
        } else if (c2 != 2) {
            return false;
        } else {
            bundle.putString("_cis", "fiam_integration");
            return true;
        }
    }

    public static Bundle g(a.c cVar) {
        Bundle bundle = new Bundle();
        String str = cVar.f11547a;
        if (str != null) {
            bundle.putString("origin", str);
        }
        String str2 = cVar.f11548b;
        if (str2 != null) {
            bundle.putString("name", str2);
        }
        Object obj = cVar.f11549c;
        if (obj != null) {
            zzgx.b(bundle, obj);
        }
        String str3 = cVar.f11550d;
        if (str3 != null) {
            bundle.putString("trigger_event_name", str3);
        }
        bundle.putLong("trigger_timeout", cVar.f11551e);
        String str4 = cVar.f11552f;
        if (str4 != null) {
            bundle.putString("timed_out_event_name", str4);
        }
        Bundle bundle2 = cVar.g;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str5 = cVar.h;
        if (str5 != null) {
            bundle.putString("triggered_event_name", str5);
        }
        Bundle bundle3 = cVar.i;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", cVar.j);
        String str6 = cVar.k;
        if (str6 != null) {
            bundle.putString("expired_event_name", str6);
        }
        Bundle bundle4 = cVar.l;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", cVar.m);
        bundle.putBoolean("active", cVar.n);
        bundle.putLong("triggered_timestamp", cVar.o);
        return bundle;
    }

    public static void h(String str, String str2, Bundle bundle) {
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1);
        }
    }

    public static boolean i(String str) {
        return !f11559a.contains(str);
    }

    public static String j(String str) {
        String a2 = zzgw.a(str);
        return a2 != null ? a2 : str;
    }
}
