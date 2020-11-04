package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbex implements zzahc<zzbdb> {
    private static Integer b(Map<String, String> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(map.get(str)));
        } catch (NumberFormatException unused) {
            String str2 = map.get(str);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 39 + String.valueOf(str2).length());
            sb.append("Precache invalid numeric parameter '");
            sb.append(str);
            sb.append("': ");
            sb.append(str2);
            zzbba.i(sb.toString());
            return null;
        }
    }

    public final /* synthetic */ void a(Object obj, Map map) {
        zzbes zzbes;
        zzbdb zzbdb = (zzbdb) obj;
        if (zzbba.a(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String valueOf = String.valueOf(jSONObject);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
            sb.append("Precache GMSG: ");
            sb.append(valueOf);
            zzbba.f(sb.toString());
        }
        zzq.zzls();
        if (!map.containsKey("abort")) {
            String str = (String) map.get("src");
            if (str != null) {
                String[] strArr = {str};
                String str2 = (String) map.get("demuxed");
                if (str2 != null) {
                    try {
                        JSONArray jSONArray = new JSONArray(str2);
                        String[] strArr2 = new String[jSONArray.length()];
                        for (int i = 0; i < jSONArray.length(); i++) {
                            strArr2[i] = jSONArray.getString(i);
                        }
                        strArr = strArr2;
                    } catch (JSONException unused) {
                        String valueOf2 = String.valueOf(str2);
                        zzbba.i(valueOf2.length() != 0 ? "Malformed demuxed URL list for precache: ".concat(valueOf2) : new String("Malformed demuxed URL list for precache: "));
                        strArr = null;
                    }
                }
                if (strArr == null) {
                    strArr = new String[]{str};
                }
                if (zzbep.j(zzbdb) != null) {
                    zzbba.i("Precache task is already running.");
                    return;
                } else if (zzbdb.j() == null) {
                    zzbba.i("Precache requires a dependency provider.");
                    return;
                } else {
                    zzbdc zzbdc = new zzbdc((String) map.get("flags"));
                    Integer b2 = b(map, "player");
                    if (b2 == null) {
                        b2 = 0;
                    }
                    zzbes = zzbdb.j().zzbny.a(zzbdb, b2.intValue(), (String) null, zzbdc);
                    new zzben(zzbdb, zzbes, str, strArr).zzwq();
                }
            } else {
                zzben j = zzbep.j(zzbdb);
                if (j != null) {
                    zzbes = j.f6211b;
                } else {
                    zzbba.i("Precache must specify a source.");
                    return;
                }
            }
            Integer b3 = b(map, "minBufferMs");
            if (b3 != null) {
                zzbes.p(b3.intValue());
            }
            Integer b4 = b(map, "maxBufferMs");
            if (b4 != null) {
                zzbes.r(b4.intValue());
            }
            Integer b5 = b(map, "bufferForPlaybackMs");
            if (b5 != null) {
                zzbes.s(b5.intValue());
            }
            Integer b6 = b(map, "bufferForPlaybackAfterRebufferMs");
            if (b6 != null) {
                zzbes.t(b6.intValue());
            }
        } else if (!zzbep.i(zzbdb)) {
            zzbba.i("Precache abort but no precache task running.");
        }
    }
}
