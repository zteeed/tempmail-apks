package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.google.firebase.crashlytics.internal.settings.model.AppSettingsData;
import com.tempmail.t.y;
import com.tempmail.utils.x;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbel implements zzahc<zzbdb> {

    /* renamed from: a  reason: collision with root package name */
    private boolean f6392a;

    private static int b(Context context, Map<String, String> map, String str, int i) {
        String str2 = map.get(str);
        if (str2 == null) {
            return i;
        }
        try {
            zzwg.a();
            return zzbaq.r(context, Integer.parseInt(str2));
        } catch (NumberFormatException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(str2).length());
            sb.append("Could not parse ");
            sb.append(str);
            sb.append(" in a video GMSG: ");
            sb.append(str2);
            zzbba.i(sb.toString());
            return i;
        }
    }

    private static void c(zzbco zzbco, Map<String, String> map) {
        String str = map.get("minBufferMs");
        String str2 = map.get("maxBufferMs");
        String str3 = map.get("bufferForPlaybackMs");
        String str4 = map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                zzbco.w(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                zzbba.i(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", new Object[]{str, str2}));
                return;
            }
        }
        if (str2 != null) {
            zzbco.x(Integer.parseInt(str2));
        }
        if (str3 != null) {
            zzbco.y(Integer.parseInt(str3));
        }
        if (str4 != null) {
            zzbco.z(Integer.parseInt(str4));
        }
        if (str5 != null) {
            zzbco.A(Integer.parseInt(str5));
        }
    }

    public final /* synthetic */ void a(Object obj, Map map) {
        int i;
        zzbdb zzbdb = (zzbdb) obj;
        String str = (String) map.get("action");
        if (str == null) {
            zzbba.i("Action missing from video GMSG.");
            return;
        }
        if (zzbba.a(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String jSONObject2 = jSONObject.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13 + String.valueOf(jSONObject2).length());
            sb.append("Video GMSG: ");
            sb.append(str);
            sb.append(" ");
            sb.append(jSONObject2);
            zzbba.f(sb.toString());
        }
        if ("background".equals(str)) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                zzbba.i("Color parameter missing from color video GMSG.");
                return;
            }
            try {
                zzbdb.setBackgroundColor(Color.parseColor(str2));
            } catch (IllegalArgumentException unused) {
                zzbba.i("Invalid color parameter in video GMSG.");
            }
        } else {
            if ("decoderProps".equals(str)) {
                String str3 = (String) map.get("mimeTypes");
                if (str3 == null) {
                    zzbba.i("No MIME types specified for decoder properties inspection.");
                    zzbco.p(zzbdb, "missingMimeTypes");
                    return;
                }
                HashMap hashMap = new HashMap();
                for (String str4 : str3.split(",")) {
                    hashMap.put(str4, zzbao.b(str4.trim()));
                }
                zzbco.q(zzbdb, hashMap);
                return;
            }
            zzbcu r = zzbdb.r();
            if (r == null) {
                zzbba.i("Could not get underlay container for a video GMSG.");
                return;
            }
            boolean equals = AppSettingsData.STATUS_NEW.equals(str);
            boolean equals2 = "position".equals(str);
            if (equals || equals2) {
                Context context = zzbdb.getContext();
                int b2 = b(context, map, x.f13134a, 0);
                int b3 = b(context, map, y.f13082d, 0);
                int b4 = b(context, map, "w", -1);
                int b5 = b(context, map, "h", -1);
                int min = Math.min(b4, zzbdb.E() - b2);
                int min2 = Math.min(b5, zzbdb.N() - b3);
                try {
                    i = Integer.parseInt((String) map.get("player"));
                } catch (NumberFormatException unused2) {
                    i = 0;
                }
                boolean parseBoolean = Boolean.parseBoolean((String) map.get("spherical"));
                if (!equals || r.e() != null) {
                    r.d(b2, b3, min, min2);
                    return;
                }
                r.c(b2, b3, min, min2, i, parseBoolean, new zzbdc((String) map.get("flags")));
                zzbco e2 = r.e();
                if (e2 != null) {
                    c(e2, map);
                    return;
                }
                return;
            }
            zzbgh m = zzbdb.m();
            if (m != null) {
                if ("timeupdate".equals(str)) {
                    String str5 = (String) map.get("currentTime");
                    if (str5 == null) {
                        zzbba.i("currentTime parameter missing from timeupdate video GMSG.");
                        return;
                    }
                    try {
                        m.k7(Float.parseFloat(str5));
                        return;
                    } catch (NumberFormatException unused3) {
                        String valueOf = String.valueOf(str5);
                        zzbba.i(valueOf.length() != 0 ? "Could not parse currentTime parameter from timeupdate video GMSG: ".concat(valueOf) : new String("Could not parse currentTime parameter from timeupdate video GMSG: "));
                        return;
                    }
                } else if ("skip".equals(str)) {
                    m.h7();
                    return;
                }
            }
            zzbco e3 = r.e();
            if (e3 == null) {
                zzbco.s(zzbdb);
            } else if ("click".equals(str)) {
                Context context2 = zzbdb.getContext();
                int b6 = b(context2, map, x.f13134a, 0);
                int b7 = b(context2, map, y.f13082d, 0);
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, (float) b6, (float) b7, 0);
                e3.B(obtain);
                obtain.recycle();
            } else if ("currentTime".equals(str)) {
                String str6 = (String) map.get("time");
                if (str6 == null) {
                    zzbba.i("Time parameter missing from currentTime video GMSG.");
                    return;
                }
                try {
                    e3.m((int) (Float.parseFloat(str6) * 1000.0f));
                } catch (NumberFormatException unused4) {
                    String valueOf2 = String.valueOf(str6);
                    zzbba.i(valueOf2.length() != 0 ? "Could not parse time parameter from currentTime video GMSG: ".concat(valueOf2) : new String("Could not parse time parameter from currentTime video GMSG: "));
                }
            } else if ("hide".equals(str)) {
                e3.setVisibility(4);
            } else if ("load".equals(str)) {
                e3.C();
            } else if ("loadControl".equals(str)) {
                c(e3, map);
            } else if ("muted".equals(str)) {
                if (Boolean.parseBoolean((String) map.get("muted"))) {
                    e3.D();
                } else {
                    e3.E();
                }
            } else if ("pause".equals(str)) {
                e3.k();
            } else if ("play".equals(str)) {
                e3.l();
            } else if ("show".equals(str)) {
                e3.setVisibility(0);
            } else if ("src".equals(str)) {
                String str7 = (String) map.get("src");
                String[] strArr = {str7};
                String str8 = (String) map.get("demuxed");
                if (str8 != null) {
                    try {
                        JSONArray jSONArray = new JSONArray(str8);
                        String[] strArr2 = new String[jSONArray.length()];
                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                            strArr2[i2] = jSONArray.getString(i2);
                        }
                        strArr = strArr2;
                    } catch (JSONException unused5) {
                        String valueOf3 = String.valueOf(str8);
                        zzbba.i(valueOf3.length() != 0 ? "Malformed demuxed URL list for playback: ".concat(valueOf3) : new String("Malformed demuxed URL list for playback: "));
                        strArr = new String[]{str7};
                    }
                }
                e3.t(str7, strArr);
            } else if ("touchMove".equals(str)) {
                Context context3 = zzbdb.getContext();
                e3.n((float) b(context3, map, "dx", 0), (float) b(context3, map, "dy", 0));
                if (!this.f6392a) {
                    zzbdb.B();
                    this.f6392a = true;
                }
            } else if ("volume".equals(str)) {
                String str9 = (String) map.get("volume");
                if (str9 == null) {
                    zzbba.i("Level parameter missing from volume video GMSG.");
                    return;
                }
                try {
                    e3.setVolume(Float.parseFloat(str9));
                } catch (NumberFormatException unused6) {
                    String valueOf4 = String.valueOf(str9);
                    zzbba.i(valueOf4.length() != 0 ? "Could not parse volume parameter from volume video GMSG: ".concat(valueOf4) : new String("Could not parse volume parameter from volume video GMSG: "));
                }
            } else if ("watermark".equals(str)) {
                e3.F();
            } else {
                String valueOf5 = String.valueOf(str);
                zzbba.i(valueOf5.length() != 0 ? "Unknown video action: ".concat(valueOf5) : new String("Unknown video action: "));
            }
        }
    }
}
