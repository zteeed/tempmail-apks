package b.b.s;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static a f2170a = new a();

    private a() {
    }

    public static a d() {
        return f2170a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0026 A[SYNTHETIC, Splitter:B:13:0x0026] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002d A[SYNTHETIC, Splitter:B:21:0x002d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static b.b.s.b f(java.io.File r4) {
        /*
            r0 = 0
            java.io.FileReader r1 = new java.io.FileReader     // Catch:{ Exception -> 0x002a, all -> 0x0023 }
            r1.<init>(r4)     // Catch:{ Exception -> 0x002a, all -> 0x0023 }
            long r2 = r4.length()     // Catch:{ Exception -> 0x002b, all -> 0x0020 }
            int r3 = (int) r2     // Catch:{ Exception -> 0x002b, all -> 0x0020 }
            char[] r2 = new char[r3]     // Catch:{ Exception -> 0x002b, all -> 0x0020 }
            r1.read(r2)     // Catch:{ Exception -> 0x002b, all -> 0x0020 }
            b.b.s.b r3 = new b.b.s.b     // Catch:{ Exception -> 0x002b, all -> 0x0020 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x002b, all -> 0x0020 }
            java.lang.String r4 = r4.getName()     // Catch:{ Exception -> 0x002b, all -> 0x0020 }
            r3.e(r4)     // Catch:{ Exception -> 0x002b, all -> 0x0020 }
            r1.close()     // Catch:{ IOException -> 0x001f }
        L_0x001f:
            return r3
        L_0x0020:
            r4 = move-exception
            r0 = r1
            goto L_0x0024
        L_0x0023:
            r4 = move-exception
        L_0x0024:
            if (r0 == 0) goto L_0x0029
            r0.close()     // Catch:{ IOException -> 0x0029 }
        L_0x0029:
            throw r4
        L_0x002a:
            r1 = r0
        L_0x002b:
            if (r1 == 0) goto L_0x0030
            r1.close()     // Catch:{ IOException -> 0x0030 }
        L_0x0030:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.s.a.f(java.io.File):b.b.s.b");
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x009a A[SYNTHETIC, Splitter:B:29:0x009a] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a1 A[SYNTHETIC, Splitter:B:33:0x00a1] */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(b.b.s.b r8, android.content.Context r9) {
        /*
            r7 = this;
            java.lang.String r0 = "AFRequestCache"
            java.lang.String r1 = "AppsFlyer_4.9.0"
            r2 = 0
            java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x0093 }
            java.io.File r4 = r9.getFilesDir()     // Catch:{ Exception -> 0x0093 }
            r3.<init>(r4, r0)     // Catch:{ Exception -> 0x0093 }
            boolean r4 = r3.exists()     // Catch:{ Exception -> 0x0093 }
            if (r4 != 0) goto L_0x0018
            r3.mkdir()     // Catch:{ Exception -> 0x0093 }
            return
        L_0x0018:
            java.io.File[] r3 = r3.listFiles()     // Catch:{ Exception -> 0x0093 }
            if (r3 == 0) goto L_0x0029
            int r3 = r3.length     // Catch:{ Exception -> 0x0093 }
            r4 = 40
            if (r3 <= r4) goto L_0x0029
            java.lang.String r8 = "reached cache limit, not caching request"
            android.util.Log.i(r1, r8)     // Catch:{ Exception -> 0x0093 }
            return
        L_0x0029:
            java.lang.String r3 = "caching request..."
            android.util.Log.i(r1, r3)     // Catch:{ Exception -> 0x0093 }
            java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x0093 }
            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x0093 }
            java.io.File r9 = r9.getFilesDir()     // Catch:{ Exception -> 0x0093 }
            r4.<init>(r9, r0)     // Catch:{ Exception -> 0x0093 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0093 }
            java.lang.String r9 = java.lang.Long.toString(r5)     // Catch:{ Exception -> 0x0093 }
            r3.<init>(r4, r9)     // Catch:{ Exception -> 0x0093 }
            r3.createNewFile()     // Catch:{ Exception -> 0x0093 }
            java.io.OutputStreamWriter r9 = new java.io.OutputStreamWriter     // Catch:{ Exception -> 0x0093 }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0093 }
            java.lang.String r3 = r3.getPath()     // Catch:{ Exception -> 0x0093 }
            r4 = 1
            r0.<init>(r3, r4)     // Catch:{ Exception -> 0x0093 }
            r9.<init>(r0)     // Catch:{ Exception -> 0x0093 }
            java.lang.String r0 = "version="
            r9.write(r0)     // Catch:{ Exception -> 0x008f, all -> 0x008c }
            java.lang.String r0 = r8.d()     // Catch:{ Exception -> 0x008f, all -> 0x008c }
            r9.write(r0)     // Catch:{ Exception -> 0x008f, all -> 0x008c }
            r0 = 10
            r9.write(r0)     // Catch:{ Exception -> 0x008f, all -> 0x008c }
            java.lang.String r2 = "url="
            r9.write(r2)     // Catch:{ Exception -> 0x008f, all -> 0x008c }
            java.lang.String r2 = r8.c()     // Catch:{ Exception -> 0x008f, all -> 0x008c }
            r9.write(r2)     // Catch:{ Exception -> 0x008f, all -> 0x008c }
            r9.write(r0)     // Catch:{ Exception -> 0x008f, all -> 0x008c }
            java.lang.String r2 = "data="
            r9.write(r2)     // Catch:{ Exception -> 0x008f, all -> 0x008c }
            java.lang.String r8 = r8.b()     // Catch:{ Exception -> 0x008f, all -> 0x008c }
            r9.write(r8)     // Catch:{ Exception -> 0x008f, all -> 0x008c }
            r9.write(r0)     // Catch:{ Exception -> 0x008f, all -> 0x008c }
            r9.flush()     // Catch:{ Exception -> 0x008f, all -> 0x008c }
            r9.close()     // Catch:{ IOException -> 0x008b }
        L_0x008b:
            return
        L_0x008c:
            r8 = move-exception
            r2 = r9
            goto L_0x009f
        L_0x008f:
            r2 = r9
            goto L_0x0093
        L_0x0091:
            r8 = move-exception
            goto L_0x009f
        L_0x0093:
            java.lang.String r8 = "Could not cache request"
            android.util.Log.i(r1, r8)     // Catch:{ all -> 0x0091 }
            if (r2 == 0) goto L_0x009e
            r2.close()     // Catch:{ IOException -> 0x009e }
        L_0x009e:
            return
        L_0x009f:
            if (r2 == 0) goto L_0x00a4
            r2.close()     // Catch:{ IOException -> 0x00a4 }
        L_0x00a4:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.s.a.a(b.b.s.b, android.content.Context):void");
    }

    public void b(String str, Context context) {
        File file = new File(new File(context.getFilesDir(), "AFRequestCache"), str);
        StringBuilder sb = new StringBuilder("Deleting ");
        sb.append(str);
        sb.append(" from cache");
        Log.i("AppsFlyer_4.9.0", sb.toString());
        if (file.exists()) {
            try {
                file.delete();
            } catch (Exception e2) {
                StringBuilder sb2 = new StringBuilder("Could not delete ");
                sb2.append(str);
                sb2.append(" from cache");
                Log.i("AppsFlyer_4.9.0", sb2.toString(), e2);
            }
        }
    }

    public List<b> c(Context context) {
        ArrayList arrayList = new ArrayList();
        try {
            File file = new File(context.getFilesDir(), "AFRequestCache");
            if (!file.exists()) {
                file.mkdir();
            } else {
                for (File file2 : file.listFiles()) {
                    StringBuilder sb = new StringBuilder("Found cached request");
                    sb.append(file2.getName());
                    Log.i("AppsFlyer_4.9.0", sb.toString());
                    arrayList.add(f(file2));
                }
            }
        } catch (Exception unused) {
            Log.i("AppsFlyer_4.9.0", "Could not cache request");
        }
        return arrayList;
    }

    public void e(Context context) {
        try {
            if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
                new File(context.getFilesDir(), "AFRequestCache").mkdir();
            }
        } catch (Exception unused) {
            Log.i("AppsFlyer_4.9.0", "Could not create cache directory");
        }
    }
}
