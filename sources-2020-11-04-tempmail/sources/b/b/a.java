package b.b;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class a {

    /* renamed from: b  reason: collision with root package name */
    static final int f2061b = ((int) TimeUnit.MILLISECONDS.toMillis(1500));

    /* renamed from: c  reason: collision with root package name */
    static volatile boolean f2062c;

    /* renamed from: d  reason: collision with root package name */
    static String[] f2063d;

    /* renamed from: e  reason: collision with root package name */
    private static a f2064e = null;

    /* renamed from: f  reason: collision with root package name */
    private static Uri f2065f = null;
    private static Uri g = null;

    /* renamed from: a  reason: collision with root package name */
    protected int f2066a = -1;

    /* renamed from: b.b.a$a  reason: collision with other inner class name */
    class C0057a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Uri f2067b;

        /* renamed from: c  reason: collision with root package name */
        private /* synthetic */ Map f2068c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Context f2069d;

        C0057a(a aVar, Uri uri, Map map, Context context) {
            this.f2067b = uri;
            this.f2068c = map;
            this.f2069d = context;
        }

        static void a(Context context) {
            Context applicationContext = context.getApplicationContext();
            e.c("onBecameBackground");
            i.e().m0();
            e.c("callStatsBackground background call");
            i.e().f0(new WeakReference(applicationContext));
            h0 m = h0.m();
            if (m.a()) {
                m.c();
                if (applicationContext != null) {
                    h0.g(applicationContext.getPackageName(), applicationContext.getPackageManager());
                }
                m.r();
            } else {
                e.a("RD status is OFF");
            }
            b.a().e();
        }

        public final void run() {
            long j;
            HashMap hashMap = new HashMap();
            long currentTimeMillis = System.currentTimeMillis();
            Uri uri = null;
            try {
                StringBuilder sb = new StringBuilder("ESP deeplink resoling is started: ");
                sb.append(this.f2067b.toString());
                e.e(sb.toString());
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f2067b.toString()).openConnection();
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setReadTimeout(a.f2061b);
                httpURLConnection.setConnectTimeout(a.f2061b);
                httpURLConnection.setRequestProperty("User-agent", "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)");
                httpURLConnection.connect();
                e.e("ESP deeplink resoling is finished");
                hashMap.put("status", String.valueOf(httpURLConnection.getResponseCode()));
                if (httpURLConnection.getResponseCode() >= 300 && httpURLConnection.getResponseCode() <= 305) {
                    uri = Uri.parse(httpURLConnection.getHeaderField("Location"));
                }
                j = System.currentTimeMillis() - currentTimeMillis;
                httpURLConnection.disconnect();
            } catch (Throwable th) {
                hashMap.put("error", th.getLocalizedMessage());
                hashMap.put("status", "-1");
                j = System.currentTimeMillis() - currentTimeMillis;
                e.b(th.getMessage(), th);
            }
            hashMap.put("latency", Long.toString(j));
            if (uri != null) {
                hashMap.put("res", uri.toString());
            } else {
                hashMap.put("res", "");
            }
            StringBuilder sb2 = new StringBuilder("ESP deeplink results: ");
            sb2.append(new JSONObject(hashMap).toString());
            e.e(sb2.toString());
            synchronized (this.f2068c) {
                this.f2068c.put("af_deeplink_r", hashMap);
                this.f2068c.put("af_deeplink", this.f2067b.toString());
            }
            a.f2062c = false;
            if (uri == null) {
                uri = this.f2067b;
            }
            i.e().f(this.f2069d, this.f2068c, uri);
        }
    }

    private a() {
    }

    public static a b() {
        if (f2064e == null) {
            f2064e = new a();
        }
        return f2064e;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0089  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void d(android.content.Context r7, java.util.Map<java.lang.String, java.lang.Object> r8, android.net.Uri r9) {
        /*
            r6 = this;
            java.lang.String r0 = r9.toString()
            java.lang.String[] r1 = f2063d
            r2 = 1
            if (r1 == 0) goto L_0x005e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Validate ESP deeplinks : "
            r1.<init>(r3)
            java.lang.String[] r3 = f2063d
            java.util.List r3 = java.util.Arrays.asList(r3)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            b.b.e.e(r1)
            java.lang.String r1 = "af_tranid="
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L_0x005e
            java.lang.String[] r1 = f2063d
            java.util.List r1 = java.util.Arrays.asList(r1)
            java.util.Iterator r1 = r1.iterator()
        L_0x0032:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x005e
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = java.lang.String.valueOf(r3)
            java.lang.String r5 = "://"
            java.lang.String r4 = r5.concat(r4)
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L_0x0050
            r0 = 1
            goto L_0x005f
        L_0x0050:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "Validate ESP: reject "
            java.lang.String r3 = r4.concat(r3)
            b.b.e.e(r3)
            goto L_0x0032
        L_0x005e:
            r0 = 0
        L_0x005f:
            if (r0 == 0) goto L_0x0089
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Validation ESP succeeded for: "
            r0.<init>(r1)
            java.lang.String r1 = r9.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            b.b.e.e(r0)
            f2062c = r2
            b.b.b r0 = b.b.b.a()
            java.util.concurrent.ScheduledExecutorService r0 = r0.b()
            b.b.a$a r1 = new b.b.a$a
            r1.<init>(r6, r9, r8, r7)
            r0.execute(r1)
            return
        L_0x0089:
            b.b.i r0 = b.b.i.e()
            r0.f(r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.a.d(android.content.Context, java.util.Map, android.net.Uri):void");
    }

    /* access modifiers changed from: protected */
    public void a(Intent intent) {
        if (((intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) ? null : intent.getData()) != null && intent.getData() != g) {
            g = intent.getData();
        }
    }

    /* access modifiers changed from: protected */
    public void c(Intent intent, Context context, Map<String, Object> map) {
        Uri data = (intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) ? null : intent.getData();
        if (data != null) {
            boolean a2 = j.b().a("consumeAfDeepLink", false);
            boolean z = (intent.getFlags() & 4194304) == 0;
            if (intent.hasExtra("appsflyer_click_ts") && !a2) {
                long longExtra = intent.getLongExtra("appsflyer_click_ts", 0);
                long d2 = j.b().d("appsflyer_click_consumed_ts", 0);
                if (longExtra == 0 || longExtra == d2) {
                    StringBuilder sb = new StringBuilder("skipping re-use of previously consumed deep link: ");
                    sb.append(data.toString());
                    sb.append(" w/Ex: ");
                    sb.append(String.valueOf(longExtra));
                    e.c(sb.toString());
                    return;
                }
                d(context, map, data);
                j.b().m("appsflyer_click_consumed_ts", longExtra);
            } else if (a2 || z) {
                Boolean valueOf = Boolean.valueOf(z);
                Uri uri = f2065f;
                if (uri == null || !data.equals(uri)) {
                    d(context, map, data);
                    f2065f = data;
                    return;
                }
                StringBuilder sb2 = new StringBuilder("skipping re-use of previously consumed deep link: ");
                sb2.append(data.toString());
                sb2.append(valueOf.booleanValue() ? " w/sT" : " w/cAPI");
                e.c(sb2.toString());
            } else {
                if (this.f2066a != j.b().c("lastActivityHash", 0)) {
                    d(context, map, data);
                    j.b().l("lastActivityHash", this.f2066a);
                    return;
                }
                StringBuilder sb3 = new StringBuilder("skipping re-use of previously consumed deep link: ");
                sb3.append(data.toString());
                sb3.append(" w/hC: ");
                sb3.append(String.valueOf(this.f2066a));
                e.c(sb3.toString());
            }
        } else {
            Uri uri2 = g;
            if (uri2 != null) {
                d(context, map, uri2);
                StringBuilder sb4 = new StringBuilder("using trampoline Intent fallback with URI : ");
                sb4.append(g.toString());
                e.c(sb4.toString());
                g = null;
            } else if (i.e().n != null) {
                d(context, map, i.e().n);
            }
        }
    }
}
