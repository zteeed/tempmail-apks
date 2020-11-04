package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.firebase.remoteconfig.internal.f;
import com.google.firebase.remoteconfig.j;
import com.google.firebase.remoteconfig.l.c;
import com.google.firebase.remoteconfig.l.e;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.d;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-config@@19.1.4 */
public class p {

    /* renamed from: d  reason: collision with root package name */
    private static final Charset f12069d = Charset.forName("UTF-8");

    /* renamed from: e  reason: collision with root package name */
    static final ThreadLocal<DateFormat> f12070e = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Context f12071a;

    /* renamed from: b  reason: collision with root package name */
    private final String f12072b;

    /* renamed from: c  reason: collision with root package name */
    private final SharedPreferences f12073c;

    /* compiled from: com.google.firebase:firebase-config@@19.1.4 */
    class a extends ThreadLocal<DateFormat> {
        a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public DateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
        }
    }

    /* compiled from: com.google.firebase:firebase-config@@19.1.4 */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        private f f12074a;

        /* renamed from: b  reason: collision with root package name */
        private f f12075b;

        /* renamed from: c  reason: collision with root package name */
        private f f12076c;

        /* synthetic */ b(a aVar) {
            this();
        }

        /* access modifiers changed from: private */
        public f g() {
            return this.f12075b;
        }

        /* access modifiers changed from: private */
        public f h() {
            return this.f12076c;
        }

        /* access modifiers changed from: private */
        public f i() {
            return this.f12074a;
        }

        /* access modifiers changed from: private */
        public void j(f fVar) {
            this.f12075b = fVar;
        }

        /* access modifiers changed from: private */
        public void k(f fVar) {
            this.f12076c = fVar;
        }

        /* access modifiers changed from: private */
        public void l(f fVar) {
            this.f12074a = fVar;
        }

        private b() {
        }
    }

    public p(Context context, String str) {
        this.f12071a = context;
        this.f12072b = str;
        this.f12073c = context.getSharedPreferences("com.google.firebase.remoteconfig_legacy_settings", 0);
    }

    private Map<String, f> a(com.google.firebase.remoteconfig.l.b bVar) {
        HashMap hashMap = new HashMap();
        Date date = new Date(bVar.F());
        JSONArray d2 = d(bVar.D());
        for (e next : bVar.E()) {
            String D = next.D();
            if (D.startsWith("configns:")) {
                D = D.substring(9);
            }
            f.b f2 = f.f();
            f2.b(b(next.C()));
            f2.e(date);
            if (D.equals("firebase")) {
                f2.d(d2);
            }
            try {
                hashMap.put(D, f2.a());
            } catch (JSONException unused) {
                Log.d("FirebaseRemoteConfig", "A set of legacy configs could not be converted.");
            }
        }
        return hashMap;
    }

    private Map<String, String> b(List<c> list) {
        HashMap hashMap = new HashMap();
        for (c next : list) {
            hashMap.put(next.C(), next.D().z(f12069d));
        }
        return hashMap;
    }

    private JSONObject c(c.a.a.c cVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("experimentId", cVar.C());
        jSONObject.put("variantId", cVar.I());
        jSONObject.put("experimentStartTime", f12070e.get().format(new Date(cVar.D())));
        jSONObject.put("triggerEvent", cVar.F());
        jSONObject.put("triggerTimeoutMillis", cVar.H());
        jSONObject.put("timeToLiveMillis", cVar.E());
        return jSONObject;
    }

    private JSONArray d(List<d> list) {
        JSONArray jSONArray = new JSONArray();
        for (d e2 : list) {
            c.a.a.c e3 = e(e2);
            if (e3 != null) {
                try {
                    jSONArray.put(c(e3));
                } catch (JSONException e4) {
                    Log.d("FirebaseRemoteConfig", "A legacy ABT experiment could not be parsed.", e4);
                }
            }
        }
        return jSONArray;
    }

    private c.a.a.c e(d dVar) {
        try {
            d.e q = dVar.iterator();
            int size = dVar.size();
            byte[] bArr = new byte[size];
            for (int i = 0; i < size; i++) {
                bArr[i] = ((Byte) q.next()).byteValue();
            }
            return c.a.a.c.J(bArr);
        } catch (InvalidProtocolBufferException e2) {
            Log.d("FirebaseRemoteConfig", "Payload was not defined or could not be deserialized.", e2);
            return null;
        }
    }

    private Map<String, b> g() {
        com.google.firebase.remoteconfig.l.f h = h();
        HashMap hashMap = new HashMap();
        if (h == null) {
            return hashMap;
        }
        Map<String, f> a2 = a(h.C());
        Map<String, f> a3 = a(h.E());
        Map<String, f> a4 = a(h.D());
        HashSet<String> hashSet = new HashSet<>();
        hashSet.addAll(a2.keySet());
        hashSet.addAll(a3.keySet());
        hashSet.addAll(a4.keySet());
        for (String str : hashSet) {
            b bVar = new b((a) null);
            if (a2.containsKey(str)) {
                bVar.j(a2.get(str));
            }
            if (a3.containsKey(str)) {
                bVar.l(a3.get(str));
            }
            if (a4.containsKey(str)) {
                bVar.k(a4.get(str));
            }
            hashMap.put(str, bVar);
        }
        return hashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0031 A[SYNTHETIC, Splitter:B:24:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0043 A[SYNTHETIC, Splitter:B:35:0x0043] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x004f A[SYNTHETIC, Splitter:B:42:0x004f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.google.firebase.remoteconfig.l.f h() {
        /*
            r7 = this;
            java.lang.String r0 = "Failed to close persisted config file."
            java.lang.String r1 = "FirebaseRemoteConfig"
            android.content.Context r2 = r7.f12071a
            r3 = 0
            if (r2 != 0) goto L_0x000a
            return r3
        L_0x000a:
            java.lang.String r4 = "persisted_config"
            java.io.FileInputStream r2 = r2.openFileInput(r4)     // Catch:{ FileNotFoundException -> 0x003a, IOException -> 0x0028, all -> 0x0023 }
            com.google.firebase.remoteconfig.l.f r3 = com.google.firebase.remoteconfig.l.f.F(r2)     // Catch:{ FileNotFoundException -> 0x0021, IOException -> 0x001f }
            if (r2 == 0) goto L_0x001e
            r2.close()     // Catch:{ IOException -> 0x001a }
            goto L_0x001e
        L_0x001a:
            r2 = move-exception
            android.util.Log.d(r1, r0, r2)
        L_0x001e:
            return r3
        L_0x001f:
            r4 = move-exception
            goto L_0x002a
        L_0x0021:
            r4 = move-exception
            goto L_0x003c
        L_0x0023:
            r2 = move-exception
            r6 = r3
            r3 = r2
            r2 = r6
            goto L_0x004d
        L_0x0028:
            r4 = move-exception
            r2 = r3
        L_0x002a:
            java.lang.String r5 = "Cannot initialize from persisted config."
            android.util.Log.d(r1, r5, r4)     // Catch:{ all -> 0x004c }
            if (r2 == 0) goto L_0x0039
            r2.close()     // Catch:{ IOException -> 0x0035 }
            goto L_0x0039
        L_0x0035:
            r2 = move-exception
            android.util.Log.d(r1, r0, r2)
        L_0x0039:
            return r3
        L_0x003a:
            r4 = move-exception
            r2 = r3
        L_0x003c:
            java.lang.String r5 = "Persisted config file was not found."
            android.util.Log.d(r1, r5, r4)     // Catch:{ all -> 0x004c }
            if (r2 == 0) goto L_0x004b
            r2.close()     // Catch:{ IOException -> 0x0047 }
            goto L_0x004b
        L_0x0047:
            r2 = move-exception
            android.util.Log.d(r1, r0, r2)
        L_0x004b:
            return r3
        L_0x004c:
            r3 = move-exception
        L_0x004d:
            if (r2 == 0) goto L_0x0057
            r2.close()     // Catch:{ IOException -> 0x0053 }
            goto L_0x0057
        L_0x0053:
            r2 = move-exception
            android.util.Log.d(r1, r0, r2)
        L_0x0057:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.p.h():com.google.firebase.remoteconfig.l.f");
    }

    private void i(Map<String, b> map) {
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            b bVar = (b) next.getValue();
            e f2 = f(str, "fetch");
            e f3 = f(str, "activate");
            e f4 = f(str, "defaults");
            if (bVar.i() != null) {
                f2.i(bVar.i());
            }
            if (bVar.g() != null) {
                f3.i(bVar.g());
            }
            if (bVar.h() != null) {
                f4.i(bVar.h());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public e f(String str, String str2) {
        return j.c(this.f12071a, this.f12072b, str, str2);
    }

    public boolean j() {
        if (!this.f12073c.getBoolean("save_legacy_configs", true)) {
            return false;
        }
        i(g());
        this.f12073c.edit().putBoolean("save_legacy_configs", false).commit();
        return true;
    }
}
