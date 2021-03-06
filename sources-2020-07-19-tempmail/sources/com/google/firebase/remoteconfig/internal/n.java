package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-config@@19.1.4 */
public class n {

    /* renamed from: c  reason: collision with root package name */
    private static final Map<String, n> f11517c = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private final Context f11518a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11519b;

    private n(Context context, String str) {
        this.f11518a = context;
        this.f11519b = str;
    }

    public static synchronized n c(Context context, String str) {
        n nVar;
        synchronized (n.class) {
            if (!f11517c.containsKey(str)) {
                f11517c.put(str, new n(context, str));
            }
            nVar = f11517c.get(str);
        }
        return nVar;
    }

    public synchronized Void a() {
        this.f11518a.deleteFile(this.f11519b);
        return null;
    }

    /* access modifiers changed from: package-private */
    public String b() {
        return this.f11519b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033 A[SYNTHETIC, Splitter:B:15:0x0033] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003a A[Catch:{ FileNotFoundException | JSONException -> 0x0037, all -> 0x002d }] */
    @javax.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.google.firebase.remoteconfig.internal.f d() throws java.io.IOException {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = 0
            android.content.Context r1 = r6.f11518a     // Catch:{ FileNotFoundException | JSONException -> 0x0037, all -> 0x002d }
            java.lang.String r2 = r6.f11519b     // Catch:{ FileNotFoundException | JSONException -> 0x0037, all -> 0x002d }
            java.io.FileInputStream r1 = r1.openFileInput(r2)     // Catch:{ FileNotFoundException | JSONException -> 0x0037, all -> 0x002d }
            int r2 = r1.available()     // Catch:{ FileNotFoundException | JSONException -> 0x0038, all -> 0x002b }
            byte[] r3 = new byte[r2]     // Catch:{ FileNotFoundException | JSONException -> 0x0038, all -> 0x002b }
            r4 = 0
            r1.read(r3, r4, r2)     // Catch:{ FileNotFoundException | JSONException -> 0x0038, all -> 0x002b }
            java.lang.String r2 = new java.lang.String     // Catch:{ FileNotFoundException | JSONException -> 0x0038, all -> 0x002b }
            java.lang.String r4 = "UTF-8"
            r2.<init>(r3, r4)     // Catch:{ FileNotFoundException | JSONException -> 0x0038, all -> 0x002b }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ FileNotFoundException | JSONException -> 0x0038, all -> 0x002b }
            r3.<init>(r2)     // Catch:{ FileNotFoundException | JSONException -> 0x0038, all -> 0x002b }
            com.google.firebase.remoteconfig.internal.f r0 = com.google.firebase.remoteconfig.internal.f.b(r3)     // Catch:{ FileNotFoundException | JSONException -> 0x0038, all -> 0x002b }
            if (r1 == 0) goto L_0x0029
            r1.close()     // Catch:{ all -> 0x003e }
        L_0x0029:
            monitor-exit(r6)
            return r0
        L_0x002b:
            r0 = move-exception
            goto L_0x0031
        L_0x002d:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L_0x0031:
            if (r1 == 0) goto L_0x0036
            r1.close()     // Catch:{ all -> 0x003e }
        L_0x0036:
            throw r0     // Catch:{ all -> 0x003e }
        L_0x0037:
            r1 = r0
        L_0x0038:
            if (r1 == 0) goto L_0x0041
            r1.close()     // Catch:{ all -> 0x003e }
            goto L_0x0041
        L_0x003e:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0041:
            monitor-exit(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.n.d():com.google.firebase.remoteconfig.internal.f");
    }

    public synchronized Void e(f fVar) throws IOException {
        FileOutputStream openFileOutput = this.f11518a.openFileOutput(this.f11519b, 0);
        try {
            openFileOutput.write(fVar.toString().getBytes("UTF-8"));
        } finally {
            openFileOutput.close();
        }
        return null;
    }
}
