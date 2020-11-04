package b.b;

import java.io.IOException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;

public abstract class n implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    String f2152b;

    public static class a {
        static HttpsURLConnection a(String str) throws IOException {
            return (HttpsURLConnection) new URL(str).openConnection();
        }
    }

    n(i iVar) {
    }

    public void a(a aVar) {
    }

    /* access modifiers changed from: package-private */
    public abstract void b();

    /* access modifiers changed from: package-private */
    public abstract void c(HttpsURLConnection httpsURLConnection) throws JSONException, IOException;

    /* access modifiers changed from: package-private */
    public abstract void d(String str);

    /* access modifiers changed from: package-private */
    public abstract String e();

    /* JADX WARNING: Removed duplicated region for block: B:15:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r9 = this;
            java.lang.String r0 = ""
            long r1 = java.lang.System.currentTimeMillis()
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            java.lang.String r3 = r9.e()
            java.lang.String r4 = java.lang.String.valueOf(r3)
            java.lang.String r5 = "oneLinkUrl: "
            java.lang.String r4 = r5.concat(r4)
            b.b.e.e(r4)
            javax.net.ssl.HttpsURLConnection r4 = b.b.n.a.a(r3)     // Catch:{ all -> 0x0086 }
            java.lang.String r5 = "content-type"
            java.lang.String r6 = "application/json"
            r4.addRequestProperty(r5, r6)     // Catch:{ all -> 0x0086 }
            java.lang.String r5 = "authorization"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0086 }
            r6.<init>()     // Catch:{ all -> 0x0086 }
            b.b.j r7 = b.b.j.b()     // Catch:{ all -> 0x0086 }
            java.lang.String r8 = "AppsFlyerKey"
            java.lang.String r7 = r7.g(r8)     // Catch:{ all -> 0x0086 }
            r6.append(r7)     // Catch:{ all -> 0x0086 }
            r6.append(r1)     // Catch:{ all -> 0x0086 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0086 }
            java.lang.String r6 = b.b.e0.a(r6)     // Catch:{ all -> 0x0086 }
            r4.addRequestProperty(r5, r6)     // Catch:{ all -> 0x0086 }
            java.lang.String r5 = "af-timestamp"
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0086 }
            r4.addRequestProperty(r5, r1)     // Catch:{ all -> 0x0086 }
            r1 = 3000(0xbb8, float:4.204E-42)
            r4.setReadTimeout(r1)     // Catch:{ all -> 0x0086 }
            r4.setConnectTimeout(r1)     // Catch:{ all -> 0x0086 }
            r9.c(r4)     // Catch:{ all -> 0x0086 }
            int r1 = r4.getResponseCode()     // Catch:{ all -> 0x0086 }
            java.lang.String r2 = b.b.i.P(r4)     // Catch:{ all -> 0x0086 }
            r4 = 200(0xc8, float:2.8E-43)
            if (r1 != r4) goto L_0x006d
            java.lang.String r1 = "Status 200 ok"
            b.b.e.c(r1)     // Catch:{ all -> 0x0084 }
            goto L_0x00ae
        L_0x006d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0084 }
            java.lang.String r4 = "Response code = "
            r0.<init>(r4)     // Catch:{ all -> 0x0084 }
            r0.append(r1)     // Catch:{ all -> 0x0084 }
            java.lang.String r1 = " content = "
            r0.append(r1)     // Catch:{ all -> 0x0084 }
            r0.append(r2)     // Catch:{ all -> 0x0084 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0084 }
            goto L_0x00ae
        L_0x0084:
            r0 = move-exception
            goto L_0x0089
        L_0x0086:
            r1 = move-exception
            r2 = r0
            r0 = r1
        L_0x0089:
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "Error while calling "
            java.lang.String r1 = r4.concat(r1)
            b.b.e.b(r1, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r4)
            r1.append(r3)
            java.lang.String r3 = " stacktrace: "
            r1.append(r3)
            java.lang.String r0 = r0.toString()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00ae:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x00c5
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.lang.String r1 = "Connection call succeeded: "
            java.lang.String r0 = r1.concat(r0)
            b.b.e.c(r0)
            r9.d(r2)
            return
        L_0x00c5:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Connection error: "
            java.lang.String r0 = r1.concat(r0)
            b.b.e.f(r0)
            r9.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.n.run():void");
    }
}
