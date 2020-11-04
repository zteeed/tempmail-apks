package com.google.android.gms.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.core.content.a;
import com.google.android.gms.internal.gcm.zzq;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

final class k {
    k() {
    }

    private static l a(SharedPreferences sharedPreferences, String str) throws m {
        String string = sharedPreferences.getString(zzak.h(str, "|P|"), (String) null);
        String string2 = sharedPreferences.getString(zzak.h(str, "|K|"), (String) null);
        if (string == null || string2 == null) {
            return null;
        }
        return new l(j(string, string2), f(sharedPreferences, str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0044, code lost:
        d(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.iid.l b(java.io.File r6) throws com.google.android.gms.iid.m, java.io.IOException {
        /*
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r6)
            java.util.Properties r6 = new java.util.Properties     // Catch:{ all -> 0x0041 }
            r6.<init>()     // Catch:{ all -> 0x0041 }
            r6.load(r0)     // Catch:{ all -> 0x0041 }
            java.lang.String r1 = "pub"
            java.lang.String r1 = r6.getProperty(r1)     // Catch:{ all -> 0x0041 }
            java.lang.String r2 = "pri"
            java.lang.String r2 = r6.getProperty(r2)     // Catch:{ all -> 0x0041 }
            r3 = 0
            if (r1 == 0) goto L_0x003d
            if (r2 != 0) goto L_0x001f
            goto L_0x003d
        L_0x001f:
            java.security.KeyPair r1 = j(r1, r2)     // Catch:{ all -> 0x0041 }
            java.lang.String r2 = "cre"
            java.lang.String r6 = r6.getProperty(r2)     // Catch:{ NumberFormatException -> 0x0036 }
            long r4 = java.lang.Long.parseLong(r6)     // Catch:{ NumberFormatException -> 0x0036 }
            com.google.android.gms.iid.l r6 = new com.google.android.gms.iid.l     // Catch:{ all -> 0x0041 }
            r6.<init>(r1, r4)     // Catch:{ all -> 0x0041 }
            d(r3, r0)
            return r6
        L_0x0036:
            r6 = move-exception
            com.google.android.gms.iid.m r1 = new com.google.android.gms.iid.m     // Catch:{ all -> 0x0041 }
            r1.<init>(r6)     // Catch:{ all -> 0x0041 }
            throw r1     // Catch:{ all -> 0x0041 }
        L_0x003d:
            d(r3, r0)
            return r3
        L_0x0041:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r1 = move-exception
            d(r6, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.iid.k.b(java.io.File):com.google.android.gms.iid.l");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        e(r4, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        throw r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void c(android.content.Context r4, java.lang.String r5, com.google.android.gms.iid.l r6) {
        /*
            java.lang.String r0 = "InstanceID"
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch:{ IOException -> 0x004d }
            if (r1 == 0) goto L_0x000e
            java.lang.String r1 = "Writing key to properties file"
            android.util.Log.d(r0, r1)     // Catch:{ IOException -> 0x004d }
        L_0x000e:
            java.io.File r4 = p(r4, r5)     // Catch:{ IOException -> 0x004d }
            r4.createNewFile()     // Catch:{ IOException -> 0x004d }
            java.util.Properties r5 = new java.util.Properties     // Catch:{ IOException -> 0x004d }
            r5.<init>()     // Catch:{ IOException -> 0x004d }
            java.lang.String r1 = "pub"
            java.lang.String r2 = r6.e()     // Catch:{ IOException -> 0x004d }
            r5.setProperty(r1, r2)     // Catch:{ IOException -> 0x004d }
            java.lang.String r1 = "pri"
            java.lang.String r2 = r6.f()     // Catch:{ IOException -> 0x004d }
            r5.setProperty(r1, r2)     // Catch:{ IOException -> 0x004d }
            java.lang.String r1 = "cre"
            long r2 = r6.f3464b     // Catch:{ IOException -> 0x004d }
            java.lang.String r6 = java.lang.String.valueOf(r2)     // Catch:{ IOException -> 0x004d }
            r5.setProperty(r1, r6)     // Catch:{ IOException -> 0x004d }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x004d }
            r6.<init>(r4)     // Catch:{ IOException -> 0x004d }
            r4 = 0
            r5.store(r6, r4)     // Catch:{ all -> 0x0046 }
            e(r4, r6)     // Catch:{ IOException -> 0x004d }
            return
        L_0x0046:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r5 = move-exception
            e(r4, r6)     // Catch:{ IOException -> 0x004d }
            throw r5     // Catch:{ IOException -> 0x004d }
        L_0x004d:
            r4 = move-exception
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = java.lang.String.valueOf(r4)
            int r5 = r5.length()
            int r5 = r5 + 21
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            java.lang.String r5 = "Failed to write key: "
            r6.append(r5)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            android.util.Log.w(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.iid.k.c(android.content.Context, java.lang.String, com.google.android.gms.iid.l):void");
    }

    private static /* synthetic */ void d(Throwable th, FileInputStream fileInputStream) {
        if (th != null) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                zzq.b(th, th2);
            }
        } else {
            fileInputStream.close();
        }
    }

    private static /* synthetic */ void e(Throwable th, FileOutputStream fileOutputStream) {
        if (th != null) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                zzq.b(th, th2);
            }
        } else {
            fileOutputStream.close();
        }
    }

    private static long f(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(zzak.h(str, "cre"), (String) null);
        if (string == null) {
            return 0;
        }
        try {
            return Long.parseLong(string);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    private final void h(Context context, String str, l lVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        try {
            if (lVar.equals(a(sharedPreferences, str))) {
                return;
            }
        } catch (m unused) {
        }
        if (Log.isLoggable("InstanceID", 3)) {
            Log.d("InstanceID", "Writing key to shared preferences");
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(zzak.h(str, "|P|"), lVar.e());
        edit.putString(zzak.h(str, "|K|"), lVar.f());
        edit.putString(zzak.h(str, "cre"), String.valueOf(lVar.f3464b));
        edit.commit();
    }

    private static KeyPair j(String str, String str2) throws m {
        try {
            byte[] decode = Base64.decode(str, 8);
            byte[] decode2 = Base64.decode(str2, 8);
            try {
                KeyFactory instance = KeyFactory.getInstance("RSA");
                return new KeyPair(instance.generatePublic(new X509EncodedKeySpec(decode)), instance.generatePrivate(new PKCS8EncodedKeySpec(decode2)));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e2) {
                String valueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
                sb.append("Invalid key stored ");
                sb.append(valueOf);
                Log.w("InstanceID", sb.toString());
                throw new m(e2);
            }
        } catch (IllegalArgumentException e3) {
            throw new m(e3);
        }
    }

    static void k(Context context, String str) {
        File p = p(context, str);
        if (p.exists()) {
            p.delete();
        }
    }

    private final l l(Context context, String str) throws m {
        try {
            l m = m(context, str);
            if (m != null) {
                h(context, str, m);
                return m;
            }
            e = null;
            try {
                l a2 = a(context.getSharedPreferences("com.google.android.gms.appid", 0), str);
                if (a2 != null) {
                    c(context, str, a2);
                    return a2;
                }
            } catch (m e2) {
                e = e2;
            }
            if (e == null) {
                return null;
            }
            throw e;
        } catch (m e3) {
            e = e3;
        }
    }

    private final l m(Context context, String str) throws m {
        File p = p(context, str);
        if (!p.exists()) {
            return null;
        }
        try {
            return b(p);
        } catch (IOException e2) {
            if (Log.isLoggable("InstanceID", 3)) {
                String valueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
                sb.append("Failed to read key from file, retrying: ");
                sb.append(valueOf);
                Log.d("InstanceID", sb.toString());
            }
            try {
                return b(p);
            } catch (IOException e3) {
                String valueOf2 = String.valueOf(e3);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 45);
                sb2.append("IID file exists, but failed to read from it: ");
                sb2.append(valueOf2);
                Log.w("InstanceID", sb2.toString());
                throw new m(e3);
            }
        }
    }

    static void n(Context context) {
        for (File file : o(context).listFiles()) {
            if (file.getName().startsWith("com.google.InstanceId")) {
                file.delete();
            }
        }
    }

    private static File o(Context context) {
        File i = a.i(context);
        if (i != null && i.isDirectory()) {
            return i;
        }
        Log.w("InstanceID", "noBackupFilesDir doesn't exist, using regular files directory instead");
        return context.getFilesDir();
    }

    private static File p(Context context, String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "com.google.InstanceId.properties";
        } else {
            try {
                String encodeToString = Base64.encodeToString(str.getBytes("UTF-8"), 11);
                StringBuilder sb = new StringBuilder(String.valueOf(encodeToString).length() + 33);
                sb.append("com.google.InstanceId_");
                sb.append(encodeToString);
                sb.append(".properties");
                str2 = sb.toString();
            } catch (UnsupportedEncodingException e2) {
                throw new AssertionError(e2);
            }
        }
        return new File(o(context), str2);
    }

    /* access modifiers changed from: package-private */
    public final l g(Context context, String str) throws m {
        l l = l(context, str);
        if (l != null) {
            return l;
        }
        return i(context, str);
    }

    /* access modifiers changed from: package-private */
    public final l i(Context context, String str) {
        l lVar = new l(zzd.a(), System.currentTimeMillis());
        try {
            l l = l(context, str);
            if (l != null) {
                if (Log.isLoggable("InstanceID", 3)) {
                    Log.d("InstanceID", "Loaded key after generating new one, using loaded one");
                }
                return l;
            }
        } catch (m unused) {
        }
        if (Log.isLoggable("InstanceID", 3)) {
            Log.d("InstanceID", "Generated new key");
        }
        c(context, str, lVar);
        h(context, str, lVar);
        return lVar;
    }
}
