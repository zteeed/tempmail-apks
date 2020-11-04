package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.JsonWriter;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsConnectorReceiver;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzbau {

    /* renamed from: b  reason: collision with root package name */
    private static Object f6121b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static boolean f6122c = false;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f6123d = false;

    /* renamed from: e  reason: collision with root package name */
    private static Clock f6124e = DefaultClock.d();

    /* renamed from: f  reason: collision with root package name */
    private static final Set<String> f6125f = new HashSet(Arrays.asList(new String[0]));

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f6126a;

    public zzbau() {
        this((String) null);
    }

    public static boolean a() {
        boolean z;
        synchronized (f6121b) {
            z = f6122c && f6123d;
        }
        return z;
    }

    static final /* synthetic */ void b(int i, Map map, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value((long) i);
        jsonWriter.endObject();
        c(jsonWriter, map);
        jsonWriter.endObject();
    }

    private static void c(JsonWriter jsonWriter, Map<String, ?> map) throws IOException {
        if (map != null) {
            jsonWriter.name("headers").beginArray();
            Iterator<Map.Entry<String, ?>> it = map.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                String str = (String) next.getKey();
                if (!f6125f.contains(str)) {
                    if (!(next.getValue() instanceof List)) {
                        if (!(next.getValue() instanceof String)) {
                            zzbba.g("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                            break;
                        }
                        jsonWriter.beginObject();
                        jsonWriter.name(AnalyticsConnectorReceiver.EVENT_NAME_KEY).value(str);
                        jsonWriter.name("value").value((String) next.getValue());
                        jsonWriter.endObject();
                    } else {
                        for (String value : (List) next.getValue()) {
                            jsonWriter.beginObject();
                            jsonWriter.name(AnalyticsConnectorReceiver.EVENT_NAME_KEY).value(str);
                            jsonWriter.name("value").value(value);
                            jsonWriter.endObject();
                        }
                    }
                }
            }
            jsonWriter.endArray();
        }
    }

    static final /* synthetic */ void d(String str, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }

    private final void e(String str, n6 n6Var) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(f6124e.a());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            for (String value : this.f6126a) {
                jsonWriter.value(value);
            }
            jsonWriter.endArray();
            n6Var.a(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e2) {
            zzbba.c("unable to log", e2);
        }
        r(stringWriter.toString());
    }

    static final /* synthetic */ void g(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        c(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(Base64Utils.a(bArr));
        }
        jsonWriter.endObject();
    }

    static final /* synthetic */ void k(byte[] bArr, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        int length = bArr.length;
        String a2 = Base64Utils.a(bArr);
        if (length < 10000) {
            jsonWriter.name("body").value(a2);
        } else {
            String v = zzbaq.v(a2);
            if (v != null) {
                jsonWriter.name("bodydigest").value(v);
            }
        }
        jsonWriter.name("bodylength").value((long) length);
        jsonWriter.endObject();
    }

    public static void l(boolean z) {
        synchronized (f6121b) {
            f6122c = true;
            f6123d = z;
        }
    }

    private final void m(String str, String str2, Map<String, ?> map, byte[] bArr) {
        e("onNetworkRequest", new k6(str, str2, map, bArr));
    }

    private final void n(Map<String, ?> map, int i) {
        e("onNetworkResponse", new m6(i, map));
    }

    public static boolean o(Context context) {
        if (Build.VERSION.SDK_INT < 17 || !zzacg.f5583a.a().booleanValue()) {
            return false;
        }
        try {
            if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0) {
                return true;
            }
            return false;
        } catch (Exception e2) {
            zzbba.d("Fail to determine debug setting.", e2);
            return false;
        }
    }

    private final void q(String str) {
        e("onNetworkRequestError", new o6(str));
    }

    private static synchronized void r(String str) {
        synchronized (zzbau.class) {
            zzbba.h("GMA Debug BEGIN");
            int i = 0;
            while (i < str.length()) {
                int i2 = i + 4000;
                String valueOf = String.valueOf(str.substring(i, Math.min(i2, str.length())));
                zzbba.h(valueOf.length() != 0 ? "GMA Debug CONTENT ".concat(valueOf) : new String("GMA Debug CONTENT "));
                i = i2;
            }
            zzbba.h("GMA Debug FINISH");
        }
    }

    public static void t() {
        synchronized (f6121b) {
            f6122c = false;
            f6123d = false;
            zzbba.i("Ad debug logging enablement is out of date.");
        }
    }

    public static boolean u() {
        boolean z;
        synchronized (f6121b) {
            z = f6122c;
        }
        return z;
    }

    public final void f(String str, String str2, Map<String, ?> map, byte[] bArr) {
        if (a()) {
            m(str, str2, map, bArr);
        }
    }

    public final void h(HttpURLConnection httpURLConnection, int i) {
        if (a()) {
            String str = null;
            n(httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()), i);
            if (i < 200 || i >= 300) {
                try {
                    str = httpURLConnection.getResponseMessage();
                } catch (IOException e2) {
                    String valueOf = String.valueOf(e2.getMessage());
                    zzbba.i(valueOf.length() != 0 ? "Can not get error message from error HttpURLConnection\n".concat(valueOf) : new String("Can not get error message from error HttpURLConnection\n"));
                }
                q(str);
            }
        }
    }

    public final void i(HttpURLConnection httpURLConnection, byte[] bArr) {
        HashMap hashMap;
        if (a()) {
            if (httpURLConnection.getRequestProperties() == null) {
                hashMap = null;
            } else {
                hashMap = new HashMap(httpURLConnection.getRequestProperties());
            }
            m(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), hashMap, bArr);
        }
    }

    public final void j(Map<String, ?> map, int i) {
        if (a()) {
            n(map, i);
            if (i < 200 || i >= 300) {
                q((String) null);
            }
        }
    }

    public final void p(String str) {
        if (a() && str != null) {
            s(str.getBytes());
        }
    }

    public final void s(byte[] bArr) {
        e("onNetworkResponseBody", new l6(bArr));
    }

    public zzbau(String str) {
        List<String> list;
        if (!a()) {
            list = new ArrayList<>();
        } else {
            String[] strArr = new String[1];
            String valueOf = String.valueOf(UUID.randomUUID().toString());
            strArr[0] = valueOf.length() != 0 ? "network_request_".concat(valueOf) : new String("network_request_");
            list = Arrays.asList(strArr);
        }
        this.f6126a = list;
    }
}
