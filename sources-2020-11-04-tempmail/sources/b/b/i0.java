package b.b;

import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

final class i0 extends n {

    /* renamed from: e  reason: collision with root package name */
    private static List<String> f2143e = Arrays.asList(new String[]{"onelink.me", "onelnk.com", "app.aflink.com"});

    /* renamed from: c  reason: collision with root package name */
    private a f2144c;

    /* renamed from: d  reason: collision with root package name */
    private String f2145d;

    interface a {
        void a(String str);

        void b(Map<String, String> map);
    }

    i0(Uri uri, i iVar) {
        super(iVar);
        if (!TextUtils.isEmpty(uri.getHost()) && !TextUtils.isEmpty(uri.getPath())) {
            boolean z = false;
            for (String contains : f2143e) {
                if (uri.getHost().contains(contains)) {
                    z = true;
                }
            }
            String[] split = uri.getPath().split("/");
            if (z && split.length == 3) {
                this.f2152b = split[1];
                this.f2145d = split[2];
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        this.f2144c.a("Can't get one link data");
    }

    /* access modifiers changed from: package-private */
    public final void c(HttpsURLConnection httpsURLConnection) throws JSONException, IOException {
        httpsURLConnection.setRequestMethod("GET");
    }

    /* access modifiers changed from: package-private */
    public final void d(String str) {
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.optString(next));
            }
            this.f2144c.b(hashMap);
        } catch (JSONException e2) {
            this.f2144c.a("Can't parse one link data");
            e.b("Error while parsing to json ".concat(String.valueOf(str)), e2);
        }
    }

    /* access modifiers changed from: package-private */
    public final String e() {
        StringBuilder sb = new StringBuilder();
        sb.append(o.a("https://%sonelink.%s/shortlink-sdk/v1"));
        sb.append("/");
        sb.append(this.f2152b);
        sb.append("?id=");
        sb.append(this.f2145d);
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final void f(a aVar) {
        this.f2144c = aVar;
    }

    /* access modifiers changed from: package-private */
    public final boolean g() {
        return !TextUtils.isEmpty(this.f2152b) && !TextUtils.isEmpty(this.f2145d);
    }
}
