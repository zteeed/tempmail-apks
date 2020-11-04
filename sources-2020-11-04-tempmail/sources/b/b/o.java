package b.b;

import org.json.JSONException;
import org.json.JSONObject;

public class o {
    public static String a(String str) {
        return String.format(str, new Object[]{i.e().d(), i.e().c()});
    }

    static JSONObject b(String str) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            try {
                if (jSONObject2.optBoolean("monitor", false)) {
                    h0.m().j();
                    return jSONObject2;
                }
                h0.m().f();
                h0.m().c();
                return jSONObject2;
            } catch (JSONException unused) {
                jSONObject = jSONObject2;
                h0.m().f();
                h0.m().c();
                return jSONObject;
            } catch (Throwable th) {
                th = th;
                jSONObject = jSONObject2;
                e.b(th.getMessage(), th);
                h0.m().f();
                h0.m().c();
                return jSONObject;
            }
        } catch (JSONException unused2) {
            h0.m().f();
            h0.m().c();
            return jSONObject;
        } catch (Throwable th2) {
            th = th2;
            e.b(th.getMessage(), th);
            h0.m().f();
            h0.m().c();
            return jSONObject;
        }
    }
}
