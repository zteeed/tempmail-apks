package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzasy extends zzata {

    /* renamed from: a  reason: collision with root package name */
    private final Object f6117a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final Context f6118b;

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences f6119c;

    /* renamed from: d  reason: collision with root package name */
    private final zzalj<JSONObject, JSONObject> f6120d;

    public zzasy(Context context, zzalj<JSONObject, JSONObject> zzalj) {
        this.f6118b = context.getApplicationContext();
        this.f6120d = zzalj;
    }

    public static JSONObject c(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", zzbbd.u().f6314b);
            jSONObject.put("mf", zzacl.f5779a.a());
            jSONObject.put("cl", "312401170");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", 20360);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.c(context, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", 12451009);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final zzdvf<Void> a() {
        synchronized (this.f6117a) {
            if (this.f6119c == null) {
                this.f6119c = this.f6118b.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        if (zzq.zzld().a() - this.f6119c.getLong("js_last_update", 0) < zzacl.f5780b.a().longValue()) {
            return zzdux.g(null);
        }
        return zzdux.i(this.f6120d.a(c(this.f6118b)), new w3(this), zzbbf.f6325f);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void b(JSONObject jSONObject) {
        zzaav.b(this.f6118b, 1, jSONObject);
        this.f6119c.edit().putLong("js_last_update", zzq.zzld().a()).apply();
        return null;
    }
}
