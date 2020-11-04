package b.b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class j {

    /* renamed from: d  reason: collision with root package name */
    private static j f2048d = new j();

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Object> f2049a = Collections.synchronizedMap(new HashMap());

    /* renamed from: b  reason: collision with root package name */
    private String f2050b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f2051c = false;

    private j() {
    }

    public static j b() {
        return f2048d;
    }

    public boolean a(String str, boolean z) {
        String g = g(str);
        if (g == null) {
            return z;
        }
        return Boolean.valueOf(g).booleanValue();
    }

    public int c(String str, int i) {
        String g = g(str);
        if (g == null) {
            return i;
        }
        return Integer.valueOf(g).intValue();
    }

    public long d(String str, long j) {
        String g = g(str);
        if (g == null) {
            return j;
        }
        return Long.valueOf(g).longValue();
    }

    public Object e(String str) {
        return this.f2049a.get(str);
    }

    public String f(Context context) {
        String str = this.f2050b;
        if (str != null) {
            return str;
        }
        if (g("AF_REFERRER") != null) {
            return g("AF_REFERRER");
        }
        if (context == null) {
            return null;
        }
        return i.M(context).getString("referrer", (String) null);
    }

    public String g(String str) {
        return (String) this.f2049a.get(str);
    }

    public boolean h() {
        return a("disableLogs", false);
    }

    public boolean i() {
        return a("disableOtherSdk", false);
    }

    public void j(Context context) {
        String string;
        if (!this.f2051c && (string = i.M(context).getString("savedProperties", (String) null)) != null) {
            e.a("Loading properties..");
            try {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (this.f2049a.get(next) == null) {
                        this.f2049a.put(next, jSONObject.getString(next));
                    }
                }
                this.f2051c = true;
            } catch (JSONException e2) {
                e.b("Failed loading properties", e2);
            }
            StringBuilder sb = new StringBuilder("Done loading properties: ");
            sb.append(this.f2051c);
            e.a(sb.toString());
        }
    }

    @SuppressLint({"CommitPrefEdits"})
    public void k(SharedPreferences sharedPreferences) {
        String jSONObject = new JSONObject(this.f2049a).toString();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("savedProperties", jSONObject);
        if (Build.VERSION.SDK_INT >= 9) {
            edit.apply();
        } else {
            edit.commit();
        }
    }

    public void l(String str, int i) {
        this.f2049a.put(str, Integer.toString(i));
    }

    public void m(String str, long j) {
        this.f2049a.put(str, Long.toString(j));
    }

    public void n(String str, String str2) {
        this.f2049a.put(str, str2);
    }

    /* access modifiers changed from: protected */
    public void o() {
    }
}
