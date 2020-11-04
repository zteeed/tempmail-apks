package com.google.firebase.installations.p;

import com.google.firebase.installations.p.d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PersistedInstallation */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final File f11324a;

    /* renamed from: b  reason: collision with root package name */
    private final com.google.firebase.c f11325b;

    /* compiled from: PersistedInstallation */
    public enum a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public c(com.google.firebase.c cVar) {
        File filesDir = cVar.g().getFilesDir();
        this.f11324a = new File(filesDir, "PersistedInstallation." + cVar.k() + ".json");
        this.f11325b = cVar;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x002c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.json.JSONObject b() {
        /*
            r6 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 16384(0x4000, float:2.2959E-41)
            byte[] r2 = new byte[r1]
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException | JSONException -> 0x002d }
            java.io.File r4 = r6.f11324a     // Catch:{ IOException | JSONException -> 0x002d }
            r3.<init>(r4)     // Catch:{ IOException | JSONException -> 0x002d }
        L_0x0010:
            r4 = 0
            int r5 = r3.read(r2, r4, r1)     // Catch:{ all -> 0x0028 }
            if (r5 >= 0) goto L_0x0024
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x0028 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0028 }
            r1.<init>(r0)     // Catch:{ all -> 0x0028 }
            r3.close()     // Catch:{ IOException | JSONException -> 0x002d }
            return r1
        L_0x0024:
            r0.write(r2, r4, r5)     // Catch:{ all -> 0x0028 }
            goto L_0x0010
        L_0x0028:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x002c }
        L_0x002c:
            throw r0     // Catch:{ IOException | JSONException -> 0x002d }
        L_0x002d:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.p.c.b():org.json.JSONObject");
    }

    public d a(d dVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", dVar.d());
            jSONObject.put("Status", dVar.g().ordinal());
            jSONObject.put("AuthToken", dVar.b());
            jSONObject.put("RefreshToken", dVar.f());
            jSONObject.put("TokenCreationEpochInSecs", dVar.h());
            jSONObject.put("ExpiresInSecs", dVar.c());
            jSONObject.put("FisError", dVar.e());
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", this.f11325b.g().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (createTempFile.renameTo(this.f11324a)) {
                return dVar;
            }
            throw new IOException("unable to rename the tmpfile to PersistedInstallation");
        } catch (IOException | JSONException unused) {
        }
    }

    public d c() {
        JSONObject b2 = b();
        String optString = b2.optString("Fid", (String) null);
        int optInt = b2.optInt("Status", a.ATTEMPT_MIGRATION.ordinal());
        String optString2 = b2.optString("AuthToken", (String) null);
        String optString3 = b2.optString("RefreshToken", (String) null);
        long optLong = b2.optLong("TokenCreationEpochInSecs", 0);
        long optLong2 = b2.optLong("ExpiresInSecs", 0);
        String optString4 = b2.optString("FisError", (String) null);
        d.a a2 = d.a();
        a2.d(optString);
        a2.g(a.values()[optInt]);
        a2.b(optString2);
        a2.f(optString3);
        a2.h(optLong);
        a2.c(optLong2);
        a2.e(optString4);
        return a2.a();
    }
}
