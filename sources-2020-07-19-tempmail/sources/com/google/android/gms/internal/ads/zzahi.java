package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzq;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzahi implements zzahc<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final Object f5703a = new Object();
    @GuardedBy("lock")

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, zzahk> f5704b = new HashMap();

    public final void a(Object obj, Map<String, String> map) {
        String str;
        String str2 = map.get("id");
        String str3 = map.get("fail");
        String str4 = map.get("fail_reason");
        String str5 = map.get("fail_stack");
        String str6 = map.get("result");
        if (TextUtils.isEmpty(str5)) {
            str4 = "Unknown Fail Reason.";
        }
        if (TextUtils.isEmpty(str5)) {
            str = "";
        } else {
            String valueOf = String.valueOf(str5);
            str = valueOf.length() != 0 ? "\n".concat(valueOf) : new String("\n");
        }
        synchronized (this.f5703a) {
            zzahk remove = this.f5704b.remove(str2);
            if (remove == null) {
                String valueOf2 = String.valueOf(str2);
                zzbba.i(valueOf2.length() != 0 ? "Received result for unexpected method invocation: ".concat(valueOf2) : new String("Received result for unexpected method invocation: "));
            } else if (!TextUtils.isEmpty(str3)) {
                String valueOf3 = String.valueOf(str4);
                String valueOf4 = String.valueOf(str);
                remove.onFailure(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3));
            } else if (str6 == null) {
                remove.a((JSONObject) null);
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str6);
                    if (zzaxv.n()) {
                        String valueOf5 = String.valueOf(jSONObject.toString(2));
                        zzaxv.m(valueOf5.length() != 0 ? "Result GMSG: ".concat(valueOf5) : new String("Result GMSG: "));
                    }
                    remove.a(jSONObject);
                } catch (JSONException e2) {
                    remove.onFailure(e2.getMessage());
                }
            }
        }
    }

    public final <EngineT extends zzake> zzdvf<JSONObject> b(EngineT enginet, String str, JSONObject jSONObject) {
        zzbbn zzbbn = new zzbbn();
        zzq.zzkw();
        String q0 = zzaye.q0();
        c(q0, new n0(this, zzbbn));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", q0);
            jSONObject2.put("args", jSONObject);
            enginet.e0(str, jSONObject2);
        } catch (Exception e2) {
            zzbbn.c(e2);
        }
        return zzbbn;
    }

    public final void c(String str, zzahk zzahk) {
        synchronized (this.f5703a) {
            this.f5704b.put(str, zzahk);
        }
    }
}
