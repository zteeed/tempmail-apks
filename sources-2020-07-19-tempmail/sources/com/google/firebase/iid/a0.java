package com.google.firebase.iid;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-iid@@20.2.0 */
final class a0 {

    /* renamed from: d  reason: collision with root package name */
    private static final long f11154d = TimeUnit.DAYS.toMillis(7);

    /* renamed from: a  reason: collision with root package name */
    final String f11155a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11156b;

    /* renamed from: c  reason: collision with root package name */
    private final long f11157c;

    private a0(String str, String str2, long j) {
        this.f11155a = str;
        this.f11156b = str2;
        this.f11157c = j;
    }

    static a0 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new a0(str, (String) null, 0);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new a0(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("Failed to parse token: ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    static String b(String str, String str2, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (JSONException e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
            sb.append("Failed to encode token: ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean c(String str) {
        return System.currentTimeMillis() > this.f11157c + f11154d || !str.equals(this.f11156b);
    }
}
