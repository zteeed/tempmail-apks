package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzi;
import com.google.android.gms.ads.internal.zzq;
import com.tempmail.splash.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcey {

    /* renamed from: a  reason: collision with root package name */
    private final Context f6945a;

    /* renamed from: b  reason: collision with root package name */
    private final zzcet f6946b;

    /* renamed from: c  reason: collision with root package name */
    private final zzeg f6947c;

    /* renamed from: d  reason: collision with root package name */
    private final zzbbd f6948d;

    /* renamed from: e  reason: collision with root package name */
    private final zza f6949e;

    /* renamed from: f  reason: collision with root package name */
    private final zztm f6950f;
    private final Executor g;
    private final zzadj h;
    private final zzcfp i;
    private final ScheduledExecutorService j;

    public zzcey(Context context, zzcet zzcet, zzeg zzeg, zzbbd zzbbd, zza zza, zztm zztm, Executor executor, zzdla zzdla, zzcfp zzcfp, ScheduledExecutorService scheduledExecutorService) {
        this.f6945a = context;
        this.f6946b = zzcet;
        this.f6947c = zzeg;
        this.f6948d = zzbbd;
        this.f6949e = zza;
        this.f6950f = zztm;
        this.g = executor;
        this.h = zzdla.i;
        this.i = zzcfp;
        this.j = scheduledExecutorService;
    }

    private static <T> zzdvf<T> b(zzdvf<T> zzdvf, T t) {
        return zzdux.k(zzdvf, Exception.class, new di((Object) null), zzbbf.f6142f);
    }

    private final zzdvf<List<zzadf>> c(JSONArray jSONArray, boolean z, boolean z2) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zzdux.g(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        for (int i2 = 0; i2 < length; i2++) {
            arrayList.add(d(jSONArray.optJSONObject(i2), z));
        }
        return zzdux.i(zzdux.m(arrayList), ai.f3382a, this.g);
    }

    private final zzdvf<zzadf> d(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return zzdux.g(null);
        }
        String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString)) {
            return zzdux.g(null);
        }
        double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        int optInt = jSONObject.optInt("width", -1);
        int optInt2 = jSONObject.optInt("height", -1);
        if (z) {
            return zzdux.g(new zzadf((Drawable) null, Uri.parse(optString), optDouble, optInt, optInt2));
        }
        return e(jSONObject.optBoolean("require"), zzdux.i(this.f6946b.d(optString, optDouble, optBoolean), new zh(optString, optDouble, optInt, optInt2), this.g), (Object) null);
    }

    private static <T> zzdvf<T> e(boolean z, zzdvf<T> zzdvf, T t) {
        if (z) {
            return zzdux.j(zzdvf, new gi(zzdvf), zzbbf.f6142f);
        }
        return b(zzdvf, (Object) null);
    }

    private static Integer j(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt(g.f12526e), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static List<zzza> k(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("mute");
        if (optJSONObject == null) {
            return Collections.emptyList();
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
            zzza m = m(optJSONArray.optJSONObject(i2));
            if (m != null) {
                arrayList.add(m);
            }
        }
        return arrayList;
    }

    public static zzza l(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("mute");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return m(optJSONObject);
    }

    private static zzza m(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("reason");
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new zzza(optString, optString2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzada a(JSONObject jSONObject, List list) {
        Integer num = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        String optString = jSONObject.optString("text");
        Integer j2 = j(jSONObject, "bg_color");
        Integer j3 = j(jSONObject, "text_color");
        int optInt = jSONObject.optInt("text_size", -1);
        boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int optInt2 = jSONObject.optInt("animation_ms", 1000);
        int optInt3 = jSONObject.optInt("presentation_ms", 4000);
        if (optInt > 0) {
            num = Integer.valueOf(optInt);
        }
        return new zzada(optString, list, j2, j3, num, optInt3 + optInt2, this.h.f5638f, optBoolean);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvf f(String str, Object obj) throws Exception {
        zzq.zzkx();
        zzbfn a2 = zzbfv.a(this.f6945a, zzbhg.b(), "native-omid", false, false, this.f6947c, this.f6948d, (zzabi) null, (zzi) null, this.f6949e, this.f6950f, (zzso) null, false);
        zzbbo e2 = zzbbo.e(a2);
        a2.q().b(new fi(e2));
        a2.loadData(str, "text/html", "UTF-8");
        return e2;
    }

    public final zzdvf<zzadf> g(JSONObject jSONObject, String str) {
        return d(jSONObject.optJSONObject(str), this.h.f5635c);
    }

    public final zzdvf<List<zzadf>> h(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        zzadj zzadj = this.h;
        return c(optJSONArray, zzadj.f5635c, zzadj.f5637e);
    }

    public final zzdvf<zzada> i(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            return zzdux.g(null);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("images");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return e(optJSONObject.optBoolean("require"), zzdux.i(c(optJSONArray, false, true), new ci(this, optJSONObject), this.g), (Object) null);
    }

    public final zzdvf<zzbfn> n(JSONObject jSONObject) {
        JSONObject e2 = zzazy.e(jSONObject, "html_containers", "instream");
        if (e2 == null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("video");
            if (optJSONObject == null) {
                return zzdux.g(null);
            }
            if (TextUtils.isEmpty(optJSONObject.optString("vast_xml"))) {
                zzbba.i("Required field 'vast_xml' is missing");
                return zzdux.g(null);
            }
            return b(zzdux.d(this.i.f(optJSONObject), (long) ((Integer) zzwg.e().c(zzaav.w1)).intValue(), TimeUnit.SECONDS, this.j), (Object) null);
        }
        zzdvf<zzbfn> g2 = this.i.g(e2.optString("base_url"), e2.optString("html"));
        return zzdux.j(g2, new ei(g2), zzbbf.f6142f);
    }
}
