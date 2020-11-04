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
    private final Object f5934a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final Context f5935b;

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences f5936c;

    /* renamed from: d  reason: collision with root package name */
    private final zzalj<JSONObject, JSONObject> f5937d;

    public zzasy(Context context, zzalj<JSONObject, JSONObject> zzalj) {
        this.f5935b = context.getApplicationContext();
        this.f5937d = zzalj;
    }

    public static JSONObject c(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", zzbbd.u().f6131b);
            jSONObject.put("mf", zzacl.f5596a.a());
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
        synchronized (this.f5934a) {
            if (this.f5936c == null) {
                this.f5936c = this.f5935b.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        if (zzq.zzld().a() - this.f5936c.getLong("js_last_update", 0) < zzacl.f5597b.a().longValue()) {
            return zzdux.g(null);
        }
        return zzdux.i(this.f5937d.a(c(this.f5935b)), new w3(this), zzbbf.f6142f);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void b(JSONObject jSONObject) {
        zzaav.b(this.f5935b, 1, jSONObject);
        this.f5936c.edit().putLong("js_last_update", zzq.zzld().a()).apply();
        return null;
    }
}
