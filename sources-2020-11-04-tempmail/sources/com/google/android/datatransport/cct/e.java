package com.google.android.datatransport.cct;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import b.c.a.b.i.h;
import com.google.android.datatransport.cct.b.a;
import com.google.android.datatransport.cct.b.j;
import com.google.android.datatransport.cct.b.k;
import com.google.android.datatransport.cct.b.l;
import com.google.android.datatransport.cct.b.m;
import com.google.android.datatransport.cct.b.o;
import com.google.android.datatransport.cct.b.p;
import com.google.android.datatransport.runtime.backends.f;
import com.google.android.datatransport.runtime.backends.g;
import com.google.android.datatransport.runtime.backends.m;
import com.google.firebase.encoders.g.d;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

final class e implements m {

    /* renamed from: a  reason: collision with root package name */
    private final com.google.firebase.encoders.a f2713a;

    /* renamed from: b  reason: collision with root package name */
    private final ConnectivityManager f2714b;

    /* renamed from: c  reason: collision with root package name */
    final URL f2715c = f(a.f2635c);

    /* renamed from: d  reason: collision with root package name */
    private final b.c.a.b.i.x.a f2716d;

    /* renamed from: e  reason: collision with root package name */
    private final b.c.a.b.i.x.a f2717e;

    /* renamed from: f  reason: collision with root package name */
    private final int f2718f;

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        final URL f2719a;

        /* renamed from: b  reason: collision with root package name */
        final j f2720b;

        /* renamed from: c  reason: collision with root package name */
        final String f2721c;

        a(URL url, j jVar, String str) {
            this.f2719a = url;
            this.f2720b = jVar;
            this.f2721c = str;
        }

        /* access modifiers changed from: package-private */
        public a a(URL url) {
            return new a(url, this.f2720b, this.f2721c);
        }
    }

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        final int f2722a;

        /* renamed from: b  reason: collision with root package name */
        final URL f2723b;

        /* renamed from: c  reason: collision with root package name */
        final long f2724c;

        b(int i, URL url, long j) {
            this.f2722a = i;
            this.f2723b = url;
            this.f2724c = j;
        }
    }

    e(Context context, b.c.a.b.i.x.a aVar, b.c.a.b.i.x.a aVar2) {
        d dVar = new d();
        dVar.g(com.google.android.datatransport.cct.b.b.f2641a);
        dVar.h(true);
        this.f2713a = dVar.f();
        this.f2714b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f2716d = aVar2;
        this.f2717e = aVar;
        this.f2718f = 40000;
    }

    static /* synthetic */ a c(a aVar, b bVar) {
        URL url = bVar.f2723b;
        if (url == null) {
            return null;
        }
        b.c.a.b.i.u.a.a("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.a(bVar.f2723b);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x0116 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x0133 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:62:0x013a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.datatransport.cct.e.b d(com.google.android.datatransport.cct.e.a r14) throws java.io.IOException {
        /*
            r13 = this;
            java.net.URL r0 = r14.f2719a
            java.lang.String r1 = "CctTransportBackend"
            java.lang.String r2 = "Making request to: %s"
            b.c.a.b.i.u.a.a(r1, r2, r0)
            java.net.URL r0 = r14.f2719a
            java.net.URLConnection r0 = r0.openConnection()
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0
            r2 = 30000(0x7530, float:4.2039E-41)
            r0.setConnectTimeout(r2)
            int r2 = r13.f2718f
            r0.setReadTimeout(r2)
            r2 = 1
            r0.setDoOutput(r2)
            r3 = 0
            r0.setInstanceFollowRedirects(r3)
            java.lang.String r4 = "POST"
            r0.setRequestMethod(r4)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r4 = "2.2.3"
            r2[r3] = r4
            java.lang.String r3 = "datatransport/%s android/"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            java.lang.String r3 = "User-Agent"
            r0.setRequestProperty(r3, r2)
            java.lang.String r2 = "Content-Encoding"
            java.lang.String r3 = "gzip"
            r0.setRequestProperty(r2, r3)
            java.lang.String r4 = "Content-Type"
            java.lang.String r5 = "application/json"
            r0.setRequestProperty(r4, r5)
            java.lang.String r5 = "Accept-Encoding"
            r0.setRequestProperty(r5, r3)
            java.lang.String r5 = r14.f2721c
            if (r5 == 0) goto L_0x0055
            java.lang.String r6 = "X-Goog-Api-Key"
            r0.setRequestProperty(r6, r5)
        L_0x0055:
            r5 = 0
            r7 = 0
            java.io.OutputStream r8 = r0.getOutputStream()     // Catch:{ EncodingException -> 0x013d, IOException -> 0x013b }
            java.util.zip.GZIPOutputStream r9 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x0134 }
            r9.<init>(r8)     // Catch:{ all -> 0x0134 }
            com.google.firebase.encoders.a r10 = r13.f2713a     // Catch:{ all -> 0x012f }
            com.google.android.datatransport.cct.b.j r14 = r14.f2720b     // Catch:{ all -> 0x012f }
            java.io.BufferedWriter r11 = new java.io.BufferedWriter     // Catch:{ all -> 0x012f }
            java.io.OutputStreamWriter r12 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x012f }
            r12.<init>(r9)     // Catch:{ all -> 0x012f }
            r11.<init>(r12)     // Catch:{ all -> 0x012f }
            r10.a(r14, r11)     // Catch:{ all -> 0x012f }
            r9.close()     // Catch:{ all -> 0x0134 }
            if (r8 == 0) goto L_0x007a
            r8.close()     // Catch:{ EncodingException -> 0x013d, IOException -> 0x013b }
        L_0x007a:
            int r14 = r0.getResponseCode()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Status Code: "
            r8.append(r9)
            r8.append(r14)
            java.lang.String r8 = r8.toString()
            b.c.a.b.i.u.a.e(r1, r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Content-Type: "
            r8.append(r9)
            java.lang.String r4 = r0.getHeaderField(r4)
            r8.append(r4)
            java.lang.String r4 = r8.toString()
            b.c.a.b.i.u.a.e(r1, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "Content-Encoding: "
            r4.append(r8)
            java.lang.String r8 = r0.getHeaderField(r2)
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            b.c.a.b.i.u.a.e(r1, r4)
            r1 = 302(0x12e, float:4.23E-43)
            if (r14 == r1) goto L_0x011e
            r1 = 301(0x12d, float:4.22E-43)
            if (r14 == r1) goto L_0x011e
            r1 = 307(0x133, float:4.3E-43)
            if (r14 != r1) goto L_0x00cf
            goto L_0x011e
        L_0x00cf:
            r1 = 200(0xc8, float:2.8E-43)
            if (r14 == r1) goto L_0x00d9
            com.google.android.datatransport.cct.e$b r0 = new com.google.android.datatransport.cct.e$b
            r0.<init>(r14, r7, r5)
            return r0
        L_0x00d9:
            java.io.InputStream r1 = r0.getInputStream()
            java.lang.String r0 = r0.getHeaderField(r2)     // Catch:{ all -> 0x0117 }
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x0117 }
            if (r0 == 0) goto L_0x00ed
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x0117 }
            r0.<init>(r1)     // Catch:{ all -> 0x0117 }
            goto L_0x00ee
        L_0x00ed:
            r0 = r1
        L_0x00ee:
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x0110 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x0110 }
            r3.<init>(r0)     // Catch:{ all -> 0x0110 }
            r2.<init>(r3)     // Catch:{ all -> 0x0110 }
            com.google.android.datatransport.cct.b.n r2 = com.google.android.datatransport.cct.b.n.b(r2)     // Catch:{ all -> 0x0110 }
            long r2 = r2.a()     // Catch:{ all -> 0x0110 }
            com.google.android.datatransport.cct.e$b r4 = new com.google.android.datatransport.cct.e$b     // Catch:{ all -> 0x0110 }
            r4.<init>(r14, r7, r2)     // Catch:{ all -> 0x0110 }
            if (r0 == 0) goto L_0x010a
            r0.close()     // Catch:{ all -> 0x0117 }
        L_0x010a:
            if (r1 == 0) goto L_0x010f
            r1.close()
        L_0x010f:
            return r4
        L_0x0110:
            r14 = move-exception
            if (r0 == 0) goto L_0x0116
            r0.close()     // Catch:{ all -> 0x0116 }
        L_0x0116:
            throw r14     // Catch:{ all -> 0x0117 }
        L_0x0117:
            r14 = move-exception
            if (r1 == 0) goto L_0x011d
            r1.close()     // Catch:{ all -> 0x011d }
        L_0x011d:
            throw r14
        L_0x011e:
            java.lang.String r1 = "Location"
            java.lang.String r0 = r0.getHeaderField(r1)
            com.google.android.datatransport.cct.e$b r1 = new com.google.android.datatransport.cct.e$b
            java.net.URL r2 = new java.net.URL
            r2.<init>(r0)
            r1.<init>(r14, r2, r5)
            return r1
        L_0x012f:
            r14 = move-exception
            r9.close()     // Catch:{ all -> 0x0133 }
        L_0x0133:
            throw r14     // Catch:{ all -> 0x0134 }
        L_0x0134:
            r14 = move-exception
            if (r8 == 0) goto L_0x013a
            r8.close()     // Catch:{ all -> 0x013a }
        L_0x013a:
            throw r14     // Catch:{ EncodingException -> 0x013d, IOException -> 0x013b }
        L_0x013b:
            r14 = move-exception
            goto L_0x013e
        L_0x013d:
            r14 = move-exception
        L_0x013e:
            java.lang.String r0 = "Couldn't encode request, returning with 400"
            b.c.a.b.i.u.a.c(r1, r0, r14)
            com.google.android.datatransport.cct.e$b r14 = new com.google.android.datatransport.cct.e$b
            r0 = 400(0x190, float:5.6E-43)
            r14.<init>(r0, r7, r5)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.cct.e.d(com.google.android.datatransport.cct.e$a):com.google.android.datatransport.cct.e$b");
    }

    private static URL f(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e2) {
            throw new IllegalArgumentException("Invalid url: " + str, e2);
        }
    }

    public g a(f fVar) {
        l.a aVar;
        HashMap hashMap = new HashMap();
        for (h next : fVar.b()) {
            String j = next.j();
            if (!hashMap.containsKey(j)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                hashMap.put(j, arrayList);
            } else {
                ((List) hashMap.get(j)).add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            h hVar = (h) ((List) entry.getValue()).get(0);
            m.a a2 = com.google.android.datatransport.cct.b.m.a();
            a2.d(p.DEFAULT);
            a2.b(this.f2717e.a());
            a2.i(this.f2716d.a());
            k.a a3 = k.a();
            a3.b(k.b.ANDROID_FIREBASE);
            a.C0066a a4 = com.google.android.datatransport.cct.b.a.a();
            a4.a(Integer.valueOf(hVar.g("sdk-version")));
            a4.g(hVar.b("model"));
            a4.e(hVar.b("hardware"));
            a4.b(hVar.b("device"));
            a4.i(hVar.b("product"));
            a4.h(hVar.b("os-uild"));
            a4.f(hVar.b("manufacturer"));
            a4.d(hVar.b("fingerprint"));
            a3.a(a4.c());
            a2.c(a3.c());
            try {
                a2.a(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                a2.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (h hVar2 : (List) entry.getValue()) {
                b.c.a.b.i.g e2 = hVar2.e();
                b.c.a.b.b b2 = e2.b();
                if (b2.equals(b.c.a.b.b.b("proto"))) {
                    aVar = l.b(e2.a());
                } else if (b2.equals(b.c.a.b.b.b("json"))) {
                    aVar = l.a(new String(e2.a(), Charset.forName("UTF-8")));
                } else {
                    b.c.a.b.i.u.a.f("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", b2);
                }
                aVar.a(hVar2.f());
                aVar.e(hVar2.k());
                aVar.f(hVar2.h("tz-offset"));
                o.a a5 = o.a();
                a5.b(o.c.f(hVar2.g("net-type")));
                a5.a(o.b.f(hVar2.g("mobile-subtype")));
                aVar.b(a5.c());
                if (hVar2.d() != null) {
                    aVar.c(hVar2.d());
                }
                arrayList3.add(aVar.d());
            }
            a2.g(arrayList3);
            arrayList2.add(a2.h());
        }
        j a6 = j.a(arrayList2);
        String str = null;
        URL url = this.f2715c;
        if (fVar.c() != null) {
            try {
                a c2 = a.c(fVar.c());
                if (c2.d() != null) {
                    str = c2.d();
                }
                if (c2.e() != null) {
                    url = f(c2.e());
                }
            } catch (IllegalArgumentException unused2) {
                return g.a();
            }
        }
        try {
            b bVar = (b) b.c.a.b.i.v.b.a(5, new a(url, a6, str), c.a(this), d.b());
            if (bVar.f2722a == 200) {
                return g.d(bVar.f2724c);
            }
            int i = bVar.f2722a;
            if (i < 500) {
                if (i != 404) {
                    return g.a();
                }
            }
            return g.e();
        } catch (IOException e3) {
            b.c.a.b.i.u.a.c("CctTransportBackend", "Could not make request to the backend", e3);
            return g.e();
        }
    }

    public h b(h hVar) {
        int i;
        int i2;
        NetworkInfo activeNetworkInfo = this.f2714b.getActiveNetworkInfo();
        h.a l = hVar.l();
        l.a("sdk-version", Build.VERSION.SDK_INT);
        l.c("model", Build.MODEL);
        l.c("hardware", Build.HARDWARE);
        l.c("device", Build.DEVICE);
        l.c("product", Build.PRODUCT);
        l.c("os-uild", Build.ID);
        l.c("manufacturer", Build.MANUFACTURER);
        l.c("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        l.b("tz-offset", (long) (TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000));
        if (activeNetworkInfo == null) {
            i = o.c.NONE.a();
        } else {
            i = activeNetworkInfo.getType();
        }
        l.a("net-type", i);
        if (activeNetworkInfo == null) {
            i2 = o.b.UNKNOWN_MOBILE_SUBTYPE.a();
        } else {
            i2 = activeNetworkInfo.getSubtype();
            if (i2 == -1) {
                i2 = o.b.COMBINED.a();
            } else if (o.b.f(i2) == null) {
                i2 = 0;
            }
        }
        l.a("mobile-subtype", i2);
        return l.d();
    }
}
