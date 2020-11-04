package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.firebase.crashlytics.internal.common.AbstractSpiCall;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.f;
import com.google.firebase.remoteconfig.internal.k;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-config@@19.1.4 */
public class ConfigFetchHttpClient {
    private static final Pattern h = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a  reason: collision with root package name */
    private final Context f11463a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11464b;

    /* renamed from: c  reason: collision with root package name */
    private final String f11465c;

    /* renamed from: d  reason: collision with root package name */
    private final String f11466d;

    /* renamed from: e  reason: collision with root package name */
    private final String f11467e;

    /* renamed from: f  reason: collision with root package name */
    private final long f11468f;
    private final long g;

    public ConfigFetchHttpClient(Context context, String str, String str2, String str3, long j, long j2) {
        this.f11463a = context;
        this.f11464b = str;
        this.f11465c = str2;
        this.f11466d = e(str);
        this.f11467e = str3;
        this.f11468f = j;
        this.g = j2;
    }

    private boolean a(JSONObject jSONObject) {
        try {
            return !jSONObject.get("state").equals("NO_CHANGE");
        } catch (JSONException unused) {
            return true;
        }
    }

    private JSONObject b(String str, String str2, Map<String, String> map) throws FirebaseRemoteConfigClientException {
        String str3;
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("appInstanceId", str);
            hashMap.put("appInstanceIdToken", str2);
            hashMap.put("appId", this.f11464b);
            Locale locale = this.f11463a.getResources().getConfiguration().locale;
            hashMap.put("countryCode", locale.getCountry());
            if (Build.VERSION.SDK_INT >= 21) {
                str3 = locale.toLanguageTag();
            } else {
                str3 = locale.toString();
            }
            hashMap.put("languageCode", str3);
            hashMap.put("platformVersion", Integer.toString(Build.VERSION.SDK_INT));
            hashMap.put("timeZone", TimeZone.getDefault().getID());
            try {
                PackageInfo packageInfo = this.f11463a.getPackageManager().getPackageInfo(this.f11463a.getPackageName(), 0);
                if (packageInfo != null) {
                    hashMap.put("appVersion", packageInfo.versionName);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            hashMap.put("packageName", this.f11463a.getPackageName());
            hashMap.put("sdkVersion", "19.1.4");
            hashMap.put("analyticsUserProperties", new JSONObject(map));
            return new JSONObject(hashMap);
        }
        throw new FirebaseRemoteConfigClientException("Fetch failed: Firebase instance id is null.");
    }

    private static f d(JSONObject jSONObject, Date date) throws FirebaseRemoteConfigClientException {
        JSONObject jSONObject2;
        try {
            f.b f2 = f.f();
            f2.e(date);
            JSONArray jSONArray = null;
            try {
                jSONObject2 = jSONObject.getJSONObject("entries");
            } catch (JSONException unused) {
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                f2.c(jSONObject2);
            }
            try {
                jSONArray = jSONObject.getJSONArray("experimentDescriptions");
            } catch (JSONException unused2) {
            }
            if (jSONArray != null) {
                f2.d(jSONArray);
            }
            return f2.a();
        } catch (JSONException e2) {
            throw new FirebaseRemoteConfigClientException("Fetch failed: fetch response could not be parsed.", e2);
        }
    }

    private static String e(String str) {
        Matcher matcher = h.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    private JSONObject f(URLConnection uRLConnection) throws IOException, JSONException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream(), "utf-8"));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = bufferedReader.read();
            if (read == -1) {
                return new JSONObject(sb.toString());
            }
            sb.append((char) read);
        }
    }

    private String g(String str, String str2) {
        return String.format("https://firebaseremoteconfig.googleapis.com/v1/projects/%s/namespaces/%s:fetch", new Object[]{str, str2});
    }

    private String h() {
        try {
            byte[] a2 = AndroidUtilsLight.a(this.f11463a, this.f11463a.getPackageName());
            if (a2 != null) {
                return Hex.b(a2, false);
            }
            Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + this.f11463a.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("FirebaseRemoteConfig", "No such package: " + this.f11463a.getPackageName(), e2);
            return null;
        }
    }

    private void i(HttpURLConnection httpURLConnection) {
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.f11465c);
        httpURLConnection.setRequestProperty("X-Android-Package", this.f11463a.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", h());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("Content-Type", AbstractSpiCall.ACCEPT_JSON_VALUE);
        httpURLConnection.setRequestProperty(AbstractSpiCall.HEADER_ACCEPT, AbstractSpiCall.ACCEPT_JSON_VALUE);
    }

    private void j(HttpURLConnection httpURLConnection, Map<String, String> map) {
        for (Map.Entry next : map.entrySet()) {
            httpURLConnection.setRequestProperty((String) next.getKey(), (String) next.getValue());
        }
    }

    private void k(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    private void l(HttpURLConnection httpURLConnection, String str, Map<String, String> map) {
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setConnectTimeout((int) TimeUnit.SECONDS.toMillis(this.f11468f));
        httpURLConnection.setReadTimeout((int) TimeUnit.SECONDS.toMillis(this.g));
        httpURLConnection.setRequestProperty("If-None-Match", str);
        i(httpURLConnection);
        j(httpURLConnection, map);
    }

    /* access modifiers changed from: package-private */
    public HttpURLConnection c() throws FirebaseRemoteConfigException {
        try {
            return (HttpURLConnection) new URL(g(this.f11466d, this.f11467e)).openConnection();
        } catch (IOException e2) {
            throw new FirebaseRemoteConfigException(e2.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    @Keep
    public k.a fetch(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map, String str3, Map<String, String> map2, Date date) throws FirebaseRemoteConfigException {
        l(httpURLConnection, str3, map2);
        try {
            k(httpURLConnection, b(str, str2, map).toString().getBytes("utf-8"));
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                String headerField = httpURLConnection.getHeaderField("ETag");
                JSONObject f2 = f(httpURLConnection);
                httpURLConnection.disconnect();
                try {
                    httpURLConnection.getInputStream().close();
                } catch (IOException unused) {
                }
                if (!a(f2)) {
                    return k.a.a(date);
                }
                return k.a.b(d(f2, date), headerField);
            }
            throw new FirebaseRemoteConfigServerException(responseCode, httpURLConnection.getResponseMessage());
        } catch (IOException | JSONException e2) {
            throw new FirebaseRemoteConfigClientException("The client had an error while calling the backend!", e2);
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }
}
