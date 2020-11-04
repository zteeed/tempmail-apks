package b.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.io.File;
import java.lang.ref.WeakReference;
import java.security.SecureRandom;
import java.util.UUID;

final class g0 {

    /* renamed from: a  reason: collision with root package name */
    private static String f2111a;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: java.io.RandomAccessFile} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0033 A[SYNTHETIC, Splitter:B:20:0x0033] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x004a A[SYNTHETIC, Splitter:B:31:0x004a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(java.io.File r6) {
        /*
            java.lang.String r0 = "Exception while trying to close the InstallationFile"
            r1 = 0
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x002a }
            java.lang.String r3 = "r"
            r2.<init>(r6, r3)     // Catch:{ IOException -> 0x002a }
            long r3 = r2.length()     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
            int r6 = (int) r3     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
            byte[] r1 = new byte[r6]     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
            r2.readFully(r1)     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
            r2.close()     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
            r2.close()     // Catch:{ IOException -> 0x001b }
            goto L_0x003c
        L_0x001b:
            r6 = move-exception
            b.b.e.b(r0, r6)
            goto L_0x003c
        L_0x0020:
            r6 = move-exception
            r1 = r2
            goto L_0x0048
        L_0x0023:
            r6 = move-exception
            r5 = r2
            r2 = r1
            r1 = r5
            goto L_0x002c
        L_0x0028:
            r6 = move-exception
            goto L_0x0048
        L_0x002a:
            r6 = move-exception
            r2 = r1
        L_0x002c:
            java.lang.String r3 = "Exception while reading InstallationFile: "
            b.b.e.b(r3, r6)     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x003b
            r1.close()     // Catch:{ IOException -> 0x0037 }
            goto L_0x003b
        L_0x0037:
            r6 = move-exception
            b.b.e.b(r0, r6)
        L_0x003b:
            r1 = r2
        L_0x003c:
            java.lang.String r6 = new java.lang.String
            if (r1 == 0) goto L_0x0041
            goto L_0x0044
        L_0x0041:
            r0 = 0
            byte[] r1 = new byte[r0]
        L_0x0044:
            r6.<init>(r1)
            return r6
        L_0x0048:
            if (r1 == 0) goto L_0x0052
            r1.close()     // Catch:{ IOException -> 0x004e }
            goto L_0x0052
        L_0x004e:
            r1 = move-exception
            b.b.e.b(r0, r1)
        L_0x0052:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.g0.a(java.io.File):java.lang.String");
    }

    public static synchronized String b(WeakReference<Context> weakReference) {
        String str;
        synchronized (g0.class) {
            if (weakReference.get() == null) {
                String str2 = f2111a;
                return str2;
            }
            if (f2111a == null) {
                String str3 = null;
                if (weakReference.get() != null) {
                    str3 = i.M(weakReference.get()).getString("AF_INSTALLATION", (String) null);
                }
                if (str3 != null) {
                    f2111a = str3;
                } else {
                    try {
                        File file = new File(weakReference.get().getFilesDir(), "AF_INSTALLATION");
                        if (!file.exists()) {
                            if (Build.VERSION.SDK_INT >= 9) {
                                long currentTimeMillis = System.currentTimeMillis();
                                StringBuilder sb = new StringBuilder();
                                sb.append(currentTimeMillis);
                                sb.append("-");
                                sb.append(Math.abs(new SecureRandom().nextLong()));
                                str = sb.toString();
                            } else {
                                str = UUID.randomUUID().toString();
                            }
                            f2111a = str;
                        } else {
                            f2111a = a(file);
                            file.delete();
                        }
                        String str4 = f2111a;
                        SharedPreferences.Editor edit = i.M(weakReference.get()).edit();
                        edit.putString("AF_INSTALLATION", str4);
                        if (Build.VERSION.SDK_INT >= 9) {
                            edit.apply();
                        } else {
                            edit.commit();
                        }
                    } catch (Exception e2) {
                        e.b("Error getting AF unique ID", e2);
                    }
                }
                if (f2111a != null) {
                    j.b().n("uid", f2111a);
                }
            }
            String str5 = f2111a;
            return str5;
        }
    }
}
