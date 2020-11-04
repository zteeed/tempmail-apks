package b.b;

import android.content.Context;
import android.content.pm.PackageManager;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

final class h0 {
    private static h0 h;

    /* renamed from: a  reason: collision with root package name */
    private boolean f2112a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f2113b;

    /* renamed from: c  reason: collision with root package name */
    private JSONObject f2114c;

    /* renamed from: d  reason: collision with root package name */
    private JSONArray f2115d;

    /* renamed from: e  reason: collision with root package name */
    private int f2116e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f2117f;
    private String g;

    private h0() {
        this.f2112a = true;
        this.f2113b = true;
        this.f2116e = 0;
        this.g = "-1";
        this.f2115d = new JSONArray();
        this.f2116e = 0;
        this.f2117f = false;
    }

    private synchronized void b() {
        this.f2115d = null;
        this.f2115d = new JSONArray();
        this.f2116e = 0;
    }

    static void g(String str, PackageManager packageManager) {
        try {
            if (h == null) {
                h = new h0();
            }
            h.o(str, packageManager);
            if (h == null) {
                h = new h0();
            }
            String t = h.t();
            d0 d0Var = new d0((Context) null, i.e().j());
            d0Var.f2095c = t;
            d0Var.c();
            StringBuilder sb = new StringBuilder();
            sb.append(o.a("https://%smonitorsdk.%s/remote-debug?app_id="));
            sb.append(str);
            d0Var.execute(new String[]{sb.toString()});
        } catch (Throwable unused) {
        }
    }

    private synchronized void i(String str, String str2, String str3, String str4) {
        try {
            this.f2114c.put("sdk_version", str);
            if (str2 != null && str2.length() > 0) {
                this.f2114c.put("devkey", str2);
            }
            if (str3 != null && str3.length() > 0) {
                this.f2114c.put("originalAppsFlyerId", str3);
            }
            if (str4 != null && str4.length() > 0) {
                this.f2114c.put("uid", str4);
            }
        } catch (Throwable unused) {
        }
    }

    private synchronized void l(String str, String str2, String str3, String str4) {
        if (str != null) {
            try {
                if (str.length() > 0) {
                    this.f2114c.put("app_id", str);
                }
            } catch (Throwable unused) {
                return;
            }
        }
        if (str2 != null && str2.length() > 0) {
            this.f2114c.put("app_version", str2);
        }
        if (str3 != null && str3.length() > 0) {
            this.f2114c.put("channel", str3);
        }
        if (str4 != null && str4.length() > 0) {
            this.f2114c.put("preInstall", str4);
        }
    }

    static h0 m() {
        if (h == null) {
            h = new h0();
        }
        return h;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0070 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void o(java.lang.String r11, android.content.pm.PackageManager r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            b.b.j r0 = b.b.j.b()     // Catch:{ all -> 0x0081 }
            b.b.i r1 = b.b.i.e()     // Catch:{ all -> 0x0081 }
            java.lang.String r2 = "remote_debug_static_data"
            java.lang.String r2 = r0.g(r2)     // Catch:{ all -> 0x0081 }
            if (r2 == 0) goto L_0x0019
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ all -> 0x0070 }
            r11.<init>(r2)     // Catch:{ all -> 0x0070 }
            r10.f2114c = r11     // Catch:{ all -> 0x0070 }
            goto L_0x0070
        L_0x0019:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x0081 }
            r2.<init>()     // Catch:{ all -> 0x0081 }
            r10.f2114c = r2     // Catch:{ all -> 0x0081 }
            java.lang.String r4 = android.os.Build.BRAND     // Catch:{ all -> 0x0081 }
            java.lang.String r5 = android.os.Build.MODEL     // Catch:{ all -> 0x0081 }
            java.lang.String r6 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x0081 }
            java.lang.String r2 = "advertiserId"
            java.lang.String r7 = r0.g(r2)     // Catch:{ all -> 0x0081 }
            java.lang.String r8 = r1.l     // Catch:{ all -> 0x0081 }
            java.lang.String r9 = r1.m     // Catch:{ all -> 0x0081 }
            r3 = r10
            r3.p(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0081 }
            java.lang.String r1 = "4.9.0.184"
            java.lang.String r2 = "AppsFlyerKey"
            java.lang.String r2 = r0.g(r2)     // Catch:{ all -> 0x0081 }
            java.lang.String r3 = "KSAppsFlyerId"
            java.lang.String r3 = r0.g(r3)     // Catch:{ all -> 0x0081 }
            java.lang.String r4 = "uid"
            java.lang.String r4 = r0.g(r4)     // Catch:{ all -> 0x0081 }
            r10.i(r1, r2, r3, r4)     // Catch:{ all -> 0x0081 }
            r1 = 0
            android.content.pm.PackageInfo r12 = r12.getPackageInfo(r11, r1)     // Catch:{ all -> 0x0065 }
            int r12 = r12.versionCode     // Catch:{ all -> 0x0065 }
            java.lang.String r1 = "channel"
            java.lang.String r1 = r0.g(r1)     // Catch:{ all -> 0x0065 }
            java.lang.String r2 = "preInstallName"
            java.lang.String r2 = r0.g(r2)     // Catch:{ all -> 0x0065 }
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x0065 }
            r10.l(r11, r12, r1, r2)     // Catch:{ all -> 0x0065 }
        L_0x0065:
            java.lang.String r11 = "remote_debug_static_data"
            org.json.JSONObject r12 = r10.f2114c     // Catch:{ all -> 0x0081 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0081 }
            r0.n(r11, r12)     // Catch:{ all -> 0x0081 }
        L_0x0070:
            org.json.JSONObject r11 = r10.f2114c     // Catch:{ JSONException -> 0x007b }
            java.lang.String r12 = "launch_counter"
            java.lang.String r0 = r10.g     // Catch:{ JSONException -> 0x007b }
            r11.put(r12, r0)     // Catch:{ JSONException -> 0x007b }
            monitor-exit(r10)
            return
        L_0x007b:
            r11 = move-exception
            r11.printStackTrace()     // Catch:{ all -> 0x0081 }
            monitor-exit(r10)
            return
        L_0x0081:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.h0.o(java.lang.String, android.content.pm.PackageManager):void");
    }

    private synchronized void p(String str, String str2, String str3, String str4, String str5, String str6) {
        try {
            this.f2114c.put("brand", str);
            this.f2114c.put("model", str2);
            this.f2114c.put("platform", "Android");
            this.f2114c.put("platform_version", str3);
            if (str4 != null && str4.length() > 0) {
                this.f2114c.put("advertiserId", str4);
            }
            if (str5 != null && str5.length() > 0) {
                this.f2114c.put("imei", str5);
            }
            if (str6 != null && str6.length() > 0) {
                this.f2114c.put("android_id", str6);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b4, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void s(java.lang.String r12, java.lang.String r13, java.lang.String... r14) {
        /*
            r11 = this;
            monitor-enter(r11)
            boolean r0 = r11.f2113b     // Catch:{ all -> 0x00b5 }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0011
            boolean r0 = r11.f2112a     // Catch:{ all -> 0x00b5 }
            if (r0 != 0) goto L_0x000f
            boolean r0 = r11.f2117f     // Catch:{ all -> 0x00b5 }
            if (r0 == 0) goto L_0x0011
        L_0x000f:
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            if (r0 == 0) goto L_0x00b3
            int r0 = r11.f2116e     // Catch:{ all -> 0x00b5 }
            r3 = 98304(0x18000, float:1.37753E-40)
            if (r0 < r3) goto L_0x001d
            goto L_0x00b3
        L_0x001d:
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00b1 }
            java.lang.String r0 = ""
            int r5 = r14.length     // Catch:{ all -> 0x00b1 }
            if (r5 <= 0) goto L_0x0045
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b1 }
            r0.<init>()     // Catch:{ all -> 0x00b1 }
            int r5 = r14.length     // Catch:{ all -> 0x00b1 }
            int r5 = r5 - r1
        L_0x002d:
            if (r5 <= 0) goto L_0x003c
            r6 = r14[r5]     // Catch:{ all -> 0x00b1 }
            r0.append(r6)     // Catch:{ all -> 0x00b1 }
            java.lang.String r6 = ", "
            r0.append(r6)     // Catch:{ all -> 0x00b1 }
            int r5 = r5 + -1
            goto L_0x002d
        L_0x003c:
            r14 = r14[r2]     // Catch:{ all -> 0x00b1 }
            r0.append(r14)     // Catch:{ all -> 0x00b1 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00b1 }
        L_0x0045:
            java.text.SimpleDateFormat r14 = new java.text.SimpleDateFormat     // Catch:{ all -> 0x00b1 }
            java.lang.String r5 = "MM-dd HH:mm:ss.SSS"
            java.util.Locale r6 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x00b1 }
            r14.<init>(r5, r6)     // Catch:{ all -> 0x00b1 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x00b1 }
            java.lang.String r14 = r14.format(r3)     // Catch:{ all -> 0x00b1 }
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 5
            if (r12 == 0) goto L_0x0080
            java.lang.String r7 = "%18s %5s _/%s [%s] %s %s"
            r8 = 6
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x00b1 }
            r8[r2] = r14     // Catch:{ all -> 0x00b1 }
            java.lang.Thread r14 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00b1 }
            long r9 = r14.getId()     // Catch:{ all -> 0x00b1 }
            java.lang.Long r14 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x00b1 }
            r8[r1] = r14     // Catch:{ all -> 0x00b1 }
            java.lang.String r14 = "AppsFlyer_4.9.0"
            r8[r5] = r14     // Catch:{ all -> 0x00b1 }
            r8[r4] = r12     // Catch:{ all -> 0x00b1 }
            r8[r3] = r13     // Catch:{ all -> 0x00b1 }
            r8[r6] = r0     // Catch:{ all -> 0x00b1 }
            java.lang.String r12 = java.lang.String.format(r7, r8)     // Catch:{ all -> 0x00b1 }
            goto L_0x00a0
        L_0x0080:
            java.lang.String r12 = "%18s %5s %s/%s %s"
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x00b1 }
            r6[r2] = r14     // Catch:{ all -> 0x00b1 }
            java.lang.Thread r14 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00b1 }
            long r7 = r14.getId()     // Catch:{ all -> 0x00b1 }
            java.lang.Long r14 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x00b1 }
            r6[r1] = r14     // Catch:{ all -> 0x00b1 }
            r6[r5] = r13     // Catch:{ all -> 0x00b1 }
            java.lang.String r13 = "AppsFlyer_4.9.0"
            r6[r4] = r13     // Catch:{ all -> 0x00b1 }
            r6[r3] = r0     // Catch:{ all -> 0x00b1 }
            java.lang.String r12 = java.lang.String.format(r12, r6)     // Catch:{ all -> 0x00b1 }
        L_0x00a0:
            org.json.JSONArray r13 = r11.f2115d     // Catch:{ all -> 0x00b1 }
            r13.put(r12)     // Catch:{ all -> 0x00b1 }
            int r13 = r11.f2116e     // Catch:{ all -> 0x00b1 }
            byte[] r12 = r12.getBytes()     // Catch:{ all -> 0x00b1 }
            int r12 = r12.length     // Catch:{ all -> 0x00b1 }
            int r13 = r13 + r12
            r11.f2116e = r13     // Catch:{ all -> 0x00b1 }
            monitor-exit(r11)
            return
        L_0x00b1:
            monitor-exit(r11)
            return
        L_0x00b3:
            monitor-exit(r11)
            return
        L_0x00b5:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.h0.s(java.lang.String, java.lang.String, java.lang.String[]):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r0 = null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized java.lang.String t() {
        /*
            r3 = this;
            monitor-enter(r3)
            org.json.JSONObject r0 = r3.f2114c     // Catch:{ JSONException -> 0x0017, all -> 0x0014 }
            java.lang.String r1 = "data"
            org.json.JSONArray r2 = r3.f2115d     // Catch:{ JSONException -> 0x0017, all -> 0x0014 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0017, all -> 0x0014 }
            org.json.JSONObject r0 = r3.f2114c     // Catch:{ JSONException -> 0x0017, all -> 0x0014 }
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x0017, all -> 0x0014 }
            r3.b()     // Catch:{ JSONException -> 0x0018, all -> 0x0014 }
            goto L_0x0018
        L_0x0014:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0017:
            r0 = 0
        L_0x0018:
            monitor-exit(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.h0.t():java.lang.String");
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        return this.f2117f;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void c() {
        s("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        this.f2117f = false;
        this.f2112a = false;
    }

    /* access modifiers changed from: package-private */
    public final void d(String str, String str2) {
        s("server_request", str, str2);
    }

    /* access modifiers changed from: package-private */
    public final void e(String str, String... strArr) {
        s("public_api_call", str, strArr);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void f() {
        this.f2112a = false;
        b();
    }

    /* access modifiers changed from: package-private */
    public final void h(String str, String str2) {
        s((String) null, str, str2);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void j() {
        this.f2117f = true;
        s("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void k(String str) {
        this.g = str;
    }

    /* access modifiers changed from: package-private */
    public final void n(String str, int i, String str2) {
        s("server_response", str, String.valueOf(i), str2);
    }

    /* access modifiers changed from: package-private */
    public final void q(Throwable th) {
        String[] strArr;
        Throwable cause = th.getCause();
        String simpleName = th.getClass().getSimpleName();
        String message = cause == null ? th.getMessage() : cause.getMessage();
        StackTraceElement[] stackTrace = cause == null ? th.getStackTrace() : cause.getStackTrace();
        if (stackTrace == null) {
            strArr = new String[]{message};
        } else {
            String[] strArr2 = new String[(stackTrace.length + 1)];
            strArr2[0] = message;
            for (int i = 1; i < stackTrace.length; i++) {
                strArr2[i] = stackTrace[i].toString();
            }
            strArr = strArr2;
        }
        s("exception", simpleName, strArr);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void r() {
        this.f2114c = null;
        this.f2115d = null;
        h = null;
    }
}
