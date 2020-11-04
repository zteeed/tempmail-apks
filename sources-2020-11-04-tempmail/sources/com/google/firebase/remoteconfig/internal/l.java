package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import org.json.JSONException;

/* compiled from: com.google.firebase:firebase-config@@19.1.4 */
public class l {

    /* renamed from: c  reason: collision with root package name */
    static final Pattern f12055c = Pattern.compile("^(1|true|t|yes|y|on)$", 2);

    /* renamed from: d  reason: collision with root package name */
    static final Pattern f12056d = Pattern.compile("^(0|false|f|no|n|off|)$", 2);

    /* renamed from: a  reason: collision with root package name */
    private final e f12057a;

    /* renamed from: b  reason: collision with root package name */
    private final e f12058b;

    static {
        Charset.forName("UTF-8");
    }

    public l(e eVar, e eVar2) {
        this.f12057a = eVar;
        this.f12058b = eVar2;
    }

    private static f b(e eVar) {
        return eVar.d();
    }

    private static Double d(e eVar, String str) {
        f b2 = b(eVar);
        if (b2 == null) {
            return null;
        }
        try {
            return Double.valueOf(b2.d().getDouble(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    private static Long f(e eVar, String str) {
        f b2 = b(eVar);
        if (b2 == null) {
            return null;
        }
        try {
            return Long.valueOf(b2.d().getLong(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    private static String h(e eVar, String str) {
        f b2 = b(eVar);
        if (b2 == null) {
            return null;
        }
        try {
            return b2.d().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    private static void i(String str, String str2) {
        Log.w("FirebaseRemoteConfig", String.format("No value of type '%s' exists for parameter key '%s'.", new Object[]{str2, str}));
    }

    public boolean a(String str) {
        String h = h(this.f12057a, str);
        if (h != null) {
            if (f12055c.matcher(h).matches()) {
                return true;
            }
            if (f12056d.matcher(h).matches()) {
                return false;
            }
        }
        String h2 = h(this.f12058b, str);
        if (h2 != null) {
            if (f12055c.matcher(h2).matches()) {
                return true;
            }
            if (f12056d.matcher(h2).matches()) {
                return false;
            }
        }
        i(str, "Boolean");
        return false;
    }

    public double c(String str) {
        Double d2 = d(this.f12057a, str);
        if (d2 != null) {
            return d2.doubleValue();
        }
        Double d3 = d(this.f12058b, str);
        if (d3 != null) {
            return d3.doubleValue();
        }
        i(str, "Double");
        return 0.0d;
    }

    public long e(String str) {
        Long f2 = f(this.f12057a, str);
        if (f2 != null) {
            return f2.longValue();
        }
        Long f3 = f(this.f12058b, str);
        if (f3 != null) {
            return f3.longValue();
        }
        i(str, "Long");
        return 0;
    }

    public String g(String str) {
        String h = h(this.f12057a, str);
        if (h != null) {
            return h;
        }
        String h2 = h(this.f12058b, str);
        if (h2 != null) {
            return h2;
        }
        i(str, "String");
        return "";
    }
}
