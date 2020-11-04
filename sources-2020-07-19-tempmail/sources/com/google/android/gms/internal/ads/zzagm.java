package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.tempmail.l.c;
import com.tempmail.s.m;
import com.tempmail.utils.i;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzagm {

    /* renamed from: a  reason: collision with root package name */
    public static final zzahc<zzbfn> f5690a = z.f5426a;

    /* renamed from: b  reason: collision with root package name */
    public static final zzahc<zzbfn> f5691b = y.f5338a;

    /* renamed from: c  reason: collision with root package name */
    public static final zzahc<zzbfn> f5692c = b0.f3412a;

    /* renamed from: d  reason: collision with root package name */
    public static final zzahc<zzbfn> f5693d = a0.f3327a;

    /* renamed from: e  reason: collision with root package name */
    public static final zzahc<zzbfn> f5694e = new f0();

    /* renamed from: f  reason: collision with root package name */
    public static final zzahc<zzbfn> f5695f = new e0();
    public static final zzahc<zzbfn> g = d0.f3588a;
    public static final zzahc<Object> h = new h0();
    public static final zzahc<zzbfn> i = new g0();
    public static final zzahc<zzbfn> j = c0.f3506a;
    public static final zzahc<zzbfn> k = new j0();
    public static final zzahc<zzbfn> l = new i0();
    public static final zzahc<zzbdb> m = new zzbel();
    public static final zzahc<zzbdb> n = new zzbeo();
    public static final zzahc<zzbfn> o = new zzagn();
    public static final zzahi p = new zzahi();
    public static final zzahc<zzbfn> q = new l0();
    public static final zzahc<zzbfn> r = new k0();
    public static final zzahc<zzbfn> s = new m0();

    static final /* synthetic */ void a(zzajh zzajh, Map map) {
        String str = (String) map.get("u");
        if (str == null) {
            zzbba.i("URL missing from click GMSG.");
            return;
        }
        Uri parse = Uri.parse(str);
        try {
            zzeg d2 = ((zzbgy) zzajh).d();
            if (d2 != null && d2.f(parse)) {
                parse = d2.b(parse, ((zzbgq) zzajh).getContext(), ((zzbha) zzajh).getView(), ((zzbgq) zzajh).b());
            }
        } catch (zzef unused) {
            String valueOf = String.valueOf(str);
            zzbba.i(valueOf.length() != 0 ? "Unable to append parameter to URL: ".concat(valueOf) : new String("Unable to append parameter to URL: "));
        }
        zzbgq zzbgq = (zzbgq) zzajh;
        new zzbad(zzbgq.getContext(), ((zzbgx) zzajh).a().f6131b, zzawn.b(parse, zzbgq.getContext())).zzwq();
    }

    static final /* synthetic */ void b(zzbgq zzbgq, Map map) {
        String str = (String) map.get("u");
        if (str == null) {
            zzbba.i("URL missing from httpTrack GMSG.");
        } else {
            new zzbad(zzbgq.getContext(), ((zzbgx) zzbgq).a().f6131b, str).zzwq();
        }
    }

    static final /* synthetic */ void c(zzbgy zzbgy, Map map) {
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int parseInt = Integer.parseInt(str);
            int parseInt2 = Integer.parseInt(str2);
            int parseInt3 = Integer.parseInt(str3);
            zzeg d2 = zzbgy.d();
            if (d2 != null) {
                d2.h().zza(parseInt, parseInt2, parseInt3);
            }
        } catch (NumberFormatException unused) {
            zzbba.i("Could not parse touch parameters from gmsg.");
        }
    }

    static final /* synthetic */ void d(zzbgq zzbgq, Map map) {
        PackageManager packageManager = zzbgq.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                        String optString = jSONObject2.optString("id");
                        String optString2 = jSONObject2.optString("u");
                        String optString3 = jSONObject2.optString(i.f12574a);
                        String optString4 = jSONObject2.optString(m.f12494f);
                        String optString5 = jSONObject2.optString("p");
                        String optString6 = jSONObject2.optString(c.f12425e);
                        String optString7 = jSONObject2.optString("intent_url");
                        Intent intent = null;
                        if (!TextUtils.isEmpty(optString7)) {
                            try {
                                intent = Intent.parseUri(optString7, 0);
                            } catch (URISyntaxException e2) {
                                URISyntaxException uRISyntaxException = e2;
                                String valueOf = String.valueOf(optString7);
                                zzbba.c(valueOf.length() != 0 ? "Error parsing the url: ".concat(valueOf) : new String("Error parsing the url: "), uRISyntaxException);
                            }
                        }
                        boolean z = true;
                        if (intent == null) {
                            intent = new Intent();
                            if (!TextUtils.isEmpty(optString2)) {
                                intent.setData(Uri.parse(optString2));
                            }
                            if (!TextUtils.isEmpty(optString3)) {
                                intent.setAction(optString3);
                            }
                            if (!TextUtils.isEmpty(optString4)) {
                                intent.setType(optString4);
                            }
                            if (!TextUtils.isEmpty(optString5)) {
                                intent.setPackage(optString5);
                            }
                            if (!TextUtils.isEmpty(optString6)) {
                                String[] split = optString6.split("/", 2);
                                if (split.length == 2) {
                                    intent.setComponent(new ComponentName(split[0], split[1]));
                                }
                            }
                        }
                        if (packageManager.resolveActivity(intent, 65536) == null) {
                            z = false;
                        }
                        try {
                            jSONObject.put(optString, z);
                        } catch (JSONException e3) {
                            zzbba.c("Error constructing openable urls response.", e3);
                        }
                    } catch (JSONException e4) {
                        zzbba.c("Error parsing the intent data.", e4);
                    }
                }
                ((zzajh) zzbgq).k("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((zzajh) zzbgq).k("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((zzajh) zzbgq).k("openableIntents", new JSONObject());
        }
    }

    static final /* synthetic */ void e(zzbgq zzbgq, Map map) {
        if (!((Boolean) zzwg.e().c(zzaav.c4)).booleanValue()) {
            zzbba.i("canOpenAppGmsgHandler disabled.");
            return;
        }
        String str = (String) map.get("package_name");
        if (TextUtils.isEmpty(str)) {
            zzbba.i("Package name missing in canOpenApp GMSG.");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(str, Boolean.valueOf(zzbgq.getContext().getPackageManager().getLaunchIntentForPackage(str) != null));
        ((zzajh) zzbgq).z("openableApp", hashMap);
    }

    static final /* synthetic */ void f(zzbgq zzbgq, Map map) {
        String str = (String) map.get("urls");
        if (TextUtils.isEmpty(str)) {
            zzbba.i("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] split = str.split(",");
        HashMap hashMap = new HashMap();
        PackageManager packageManager = zzbgq.getContext().getPackageManager();
        for (String str2 : split) {
            String[] split2 = str2.split(";", 2);
            boolean z = true;
            if (packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) == null) {
                z = false;
            }
            hashMap.put(str2, Boolean.valueOf(z));
        }
        ((zzajh) zzbgq).z("openableURLs", hashMap);
    }
}
