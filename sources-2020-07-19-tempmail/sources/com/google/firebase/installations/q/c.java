package com.google.firebase.installations.q;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsConnectorReceiver;
import com.google.firebase.crashlytics.internal.common.AbstractSpiCall;
import com.google.firebase.g.c;
import com.google.firebase.installations.q.d;
import com.google.firebase.installations.q.e;
import com.google.firebase.j.h;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FirebaseInstallationServiceClient */
public class c {

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f11347d = Pattern.compile("[0-9]+s");

    /* renamed from: e  reason: collision with root package name */
    private static final Charset f11348e = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    private final Context f11349a;

    /* renamed from: b  reason: collision with root package name */
    private final h f11350b;

    /* renamed from: c  reason: collision with root package name */
    private final com.google.firebase.g.c f11351c;

    public c(Context context, h hVar, com.google.firebase.g.c cVar) {
        this.f11349a = context;
        this.f11350b = hVar;
        this.f11351c = cVar;
    }

    private static String a(String str, String str2, String str3) {
        String str4;
        Object[] objArr = new Object[3];
        objArr[0] = str2;
        objArr[1] = str3;
        if (TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            str4 = ", " + str;
        }
        objArr[2] = str4;
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr);
    }

    private static JSONObject b(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:16.3.1");
            return jSONObject;
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private static JSONObject c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:16.3.1");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private String f() {
        try {
            byte[] a2 = AndroidUtilsLight.a(this.f11349a, this.f11349a.getPackageName());
            if (a2 != null) {
                return Hex.b(a2, false);
            }
            Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.f11349a.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("ContentValues", "No such package: " + this.f11349a.getPackageName(), e2);
            return null;
        }
    }

    private static byte[] g(JSONObject jSONObject) throws IOException {
        return jSONObject.toString().getBytes("UTF-8");
    }

    private static void h() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    private static void i(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        String m = m(httpURLConnection);
        if (!TextUtils.isEmpty(m)) {
            Log.w("Firebase-Installations", m);
            Log.w("Firebase-Installations", a(str, str2, str3));
        }
    }

    private HttpURLConnection j(URL url, String str) throws IOException {
        c.a a2;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(10000);
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.addRequestProperty("Content-Type", AbstractSpiCall.ACCEPT_JSON_VALUE);
        httpURLConnection.addRequestProperty(AbstractSpiCall.HEADER_ACCEPT, AbstractSpiCall.ACCEPT_JSON_VALUE);
        httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.addRequestProperty("X-Android-Package", this.f11349a.getPackageName());
        com.google.firebase.g.c cVar = this.f11351c;
        if (!(cVar == null || this.f11350b == null || (a2 = cVar.a("fire-installations-id")) == c.a.NONE)) {
            httpURLConnection.addRequestProperty("x-firebase-client", this.f11350b.a());
            httpURLConnection.addRequestProperty("x-firebase-client-log-type", Integer.toString(a2.f()));
        }
        httpURLConnection.addRequestProperty("X-Android-Cert", f());
        httpURLConnection.addRequestProperty("x-goog-api-key", str);
        return httpURLConnection;
    }

    @VisibleForTesting
    static long k(String str) {
        Preconditions.b(f11347d.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    private d l(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f11348e));
        e.a a2 = e.a();
        d.a a3 = d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals(AnalyticsConnectorReceiver.EVENT_NAME_KEY)) {
                a3.f(jsonReader.nextString());
            } else if (nextName.equals("fid")) {
                a3.c(jsonReader.nextString());
            } else if (nextName.equals("refreshToken")) {
                a3.d(jsonReader.nextString());
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        a2.c(jsonReader.nextString());
                    } else if (nextName2.equals("expiresIn")) {
                        a2.d(k(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                a3.b(a2.a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        a3.e(d.b.OK);
        return a3.a();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m(java.net.HttpURLConnection r7) {
        /*
            java.io.InputStream r0 = r7.getErrorStream()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.io.BufferedReader r2 = new java.io.BufferedReader
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            java.nio.charset.Charset r4 = f11348e
            r3.<init>(r0, r4)
            r2.<init>(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r0.<init>()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
        L_0x0019:
            java.lang.String r3 = r2.readLine()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            if (r3 == 0) goto L_0x0028
            r0.append(r3)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r3 = 10
            r0.append(r3)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            goto L_0x0019
        L_0x0028:
            java.lang.String r3 = "Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r5 = 0
            int r6 = r7.getResponseCode()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r4[r5] = r6     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r5 = 1
            java.lang.String r7 = r7.getResponseMessage()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r4[r5] = r7     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r7 = 2
            r4[r7] = r0     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            java.lang.String r7 = java.lang.String.format(r3, r4)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r2.close()     // Catch:{ IOException -> 0x0049 }
        L_0x0049:
            return r7
        L_0x004a:
            r7 = move-exception
            r2.close()     // Catch:{ IOException -> 0x004e }
        L_0x004e:
            throw r7
        L_0x004f:
            r2.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.q.c.m(java.net.HttpURLConnection):java.lang.String");
    }

    private e n(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f11348e));
        e.a a2 = e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                a2.c(jsonReader.nextString());
            } else if (nextName.equals("expiresIn")) {
                a2.d(k(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        a2.b(e.b.OK);
        return a2.a();
    }

    private void o(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        q(httpURLConnection, g(b(str, str2)));
    }

    private void p(HttpURLConnection httpURLConnection) throws IOException {
        q(httpURLConnection, g(c()));
    }

    private static void q(URLConnection uRLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused) {
                }
            }
        } else {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
    }

    public d d(String str, String str2, String str3, String str4, String str5) throws IOException {
        int i = 0;
        URL url = new URL(String.format("https://%s/%s/%s", new Object[]{"firebaseinstallations.googleapis.com", "v1", String.format("projects/%s/installations", new Object[]{str3})}));
        while (i <= 1) {
            HttpURLConnection j = j(url, str);
            try {
                j.setRequestMethod("POST");
                j.setDoOutput(true);
                if (str5 != null) {
                    j.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                }
                o(j, str2, str4);
                int responseCode = j.getResponseCode();
                if (responseCode == 200) {
                    d l = l(j);
                    j.disconnect();
                    return l;
                }
                i(j, str4, str, str3);
                if (responseCode != 429) {
                    if (responseCode < 500 || responseCode >= 600) {
                        h();
                        d.a a2 = d.a();
                        a2.e(d.b.BAD_CONFIG);
                        d a3 = a2.a();
                        j.disconnect();
                        return a3;
                    }
                }
                i++;
            } finally {
                j.disconnect();
            }
        }
        throw new IOException();
    }

    public e e(String str, String str2, String str3, String str4) throws IOException {
        int i = 0;
        URL url = new URL(String.format("https://%s/%s/%s", new Object[]{"firebaseinstallations.googleapis.com", "v1", String.format("projects/%s/installations/%s/authTokens:generate", new Object[]{str3, str2})}));
        while (i <= 1) {
            HttpURLConnection j = j(url, str);
            try {
                j.setRequestMethod("POST");
                j.addRequestProperty("Authorization", "FIS_v2 " + str4);
                p(j);
                int responseCode = j.getResponseCode();
                if (responseCode == 200) {
                    e n = n(j);
                    j.disconnect();
                    return n;
                }
                i(j, (String) null, str, str3);
                if (responseCode != 401) {
                    if (responseCode != 404) {
                        if (responseCode != 429) {
                            if (responseCode < 500 || responseCode >= 600) {
                                h();
                                e.a a2 = e.a();
                                a2.b(e.b.BAD_CONFIG);
                                e a3 = a2.a();
                                j.disconnect();
                                return a3;
                            }
                        }
                        i++;
                    }
                }
                e.a a4 = e.a();
                a4.b(e.b.AUTH_ERROR);
                e a5 = a4.a();
                j.disconnect();
                return a5;
            } finally {
                j.disconnect();
            }
        }
        throw new IOException();
    }
}
