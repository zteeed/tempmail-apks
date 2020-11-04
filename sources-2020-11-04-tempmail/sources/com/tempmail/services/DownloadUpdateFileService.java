package com.tempmail.services;

import android.app.IntentService;
import android.content.Intent;
import android.os.Binder;
import com.tempmail.R;
import com.tempmail.utils.m;
import com.tempmail.utils.s;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DownloadUpdateFileService extends IntentService {

    /* renamed from: b  reason: collision with root package name */
    public static final String f13002b = DownloadUpdateFileService.class.getSimpleName();

    /* renamed from: c  reason: collision with root package name */
    public static String f13003c = "extra_url";

    public class a extends Binder {
        public a(DownloadUpdateFileService downloadUpdateFileService) {
        }
    }

    public DownloadUpdateFileService() {
        super("DownloadUpdateFileService");
        new a(this);
    }

    private String a() {
        File file = new File(getFilesDir(), getString(R.string.download_apk_update_local_file_name));
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
            bufferedReader.close();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        return sb.toString();
    }

    public void b(String str) {
        float f2;
        if (str != null) {
            String str2 = f13002b;
            m.c(str2, "Download error: " + str);
            return;
        }
        String a2 = a();
        String str3 = f13002b;
        m.b(str3, "File download successfully " + a2);
        try {
            f2 = Float.valueOf(a2).floatValue();
        } catch (NumberFormatException e2) {
            e2.printStackTrace();
            f2 = 0.0f;
        }
        if (f2 != 0.0f) {
            s.k0(this, f2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c9 A[SYNTHETIC, Splitter:B:48:0x00c9] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d1 A[Catch:{ IOException -> 0x00cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00dd A[SYNTHETIC, Splitter:B:59:0x00dd] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00e5 A[Catch:{ IOException -> 0x00e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00ea  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String c(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r9)
            java.lang.String r9 = "?"
            r0.append(r9)
            long r1 = java.lang.System.currentTimeMillis()
            r0.append(r1)
            java.lang.String r9 = r0.toString()
            java.lang.String r0 = f13002b
            com.tempmail.utils.m.b(r0, r9)
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x00bf, all -> 0x00ba }
            r1.<init>(r9)     // Catch:{ Exception -> 0x00bf, all -> 0x00ba }
            java.net.URLConnection r9 = r1.openConnection()     // Catch:{ Exception -> 0x00bf, all -> 0x00ba }
            java.net.HttpURLConnection r9 = (java.net.HttpURLConnection) r9     // Catch:{ Exception -> 0x00bf, all -> 0x00ba }
            r1 = 10000(0x2710, float:1.4013E-41)
            r9.setConnectTimeout(r1)     // Catch:{ Exception -> 0x00b6, all -> 0x00b2 }
            r9.setReadTimeout(r1)     // Catch:{ Exception -> 0x00b6, all -> 0x00b2 }
            java.lang.Thread r1 = new java.lang.Thread     // Catch:{ Exception -> 0x00b6, all -> 0x00b2 }
            com.tempmail.utils.k r2 = new com.tempmail.utils.k     // Catch:{ Exception -> 0x00b6, all -> 0x00b2 }
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch:{ Exception -> 0x00b6, all -> 0x00b2 }
            r2.<init>(r3, r9)     // Catch:{ Exception -> 0x00b6, all -> 0x00b2 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x00b6, all -> 0x00b2 }
            r1.start()     // Catch:{ Exception -> 0x00b6, all -> 0x00b2 }
            r9.connect()     // Catch:{ Exception -> 0x00b6, all -> 0x00b2 }
            int r1 = r9.getResponseCode()     // Catch:{ Exception -> 0x00b6, all -> 0x00b2 }
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 == r2) goto L_0x0074
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b6, all -> 0x00b2 }
            r1.<init>()     // Catch:{ Exception -> 0x00b6, all -> 0x00b2 }
            java.lang.String r2 = "Server returned HTTP "
            r1.append(r2)     // Catch:{ Exception -> 0x00b6, all -> 0x00b2 }
            int r2 = r9.getResponseCode()     // Catch:{ Exception -> 0x00b6, all -> 0x00b2 }
            r1.append(r2)     // Catch:{ Exception -> 0x00b6, all -> 0x00b2 }
            java.lang.String r2 = " "
            r1.append(r2)     // Catch:{ Exception -> 0x00b6, all -> 0x00b2 }
            java.lang.String r2 = r9.getResponseMessage()     // Catch:{ Exception -> 0x00b6, all -> 0x00b2 }
            r1.append(r2)     // Catch:{ Exception -> 0x00b6, all -> 0x00b2 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x00b6, all -> 0x00b2 }
            if (r9 == 0) goto L_0x0073
            r9.disconnect()
        L_0x0073:
            return r0
        L_0x0074:
            java.io.InputStream r1 = r9.getInputStream()     // Catch:{ Exception -> 0x00b6, all -> 0x00b2 }
            r2 = 2131755165(0x7f10009d, float:1.9141202E38)
            java.lang.String r2 = r8.getString(r2)     // Catch:{ Exception -> 0x00b0 }
            r3 = 0
            java.io.FileOutputStream r2 = r8.openFileOutput(r2, r3)     // Catch:{ Exception -> 0x00b0 }
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r4 = new byte[r4]     // Catch:{ Exception -> 0x00ab, all -> 0x00a6 }
        L_0x0088:
            int r5 = r1.read(r4)     // Catch:{ Exception -> 0x00ab, all -> 0x00a6 }
            r6 = -1
            if (r5 == r6) goto L_0x0093
            r2.write(r4, r3, r5)     // Catch:{ Exception -> 0x00ab, all -> 0x00a6 }
            goto L_0x0088
        L_0x0093:
            if (r2 == 0) goto L_0x009b
            r2.close()     // Catch:{ IOException -> 0x0099 }
            goto L_0x009b
        L_0x0099:
            goto L_0x00a0
        L_0x009b:
            if (r1 == 0) goto L_0x00a0
            r1.close()     // Catch:{ IOException -> 0x0099 }
        L_0x00a0:
            if (r9 == 0) goto L_0x00a5
            r9.disconnect()
        L_0x00a5:
            return r0
        L_0x00a6:
            r0 = move-exception
            r7 = r2
            r2 = r0
            r0 = r7
            goto L_0x00db
        L_0x00ab:
            r0 = move-exception
            r7 = r2
            r2 = r0
            r0 = r7
            goto L_0x00c3
        L_0x00b0:
            r2 = move-exception
            goto L_0x00c3
        L_0x00b2:
            r1 = move-exception
            r2 = r1
            r1 = r0
            goto L_0x00db
        L_0x00b6:
            r1 = move-exception
            r2 = r1
            r1 = r0
            goto L_0x00c3
        L_0x00ba:
            r1 = move-exception
            r9 = r0
            r2 = r1
            r1 = r9
            goto L_0x00db
        L_0x00bf:
            r1 = move-exception
            r9 = r0
            r2 = r1
            r1 = r9
        L_0x00c3:
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x00cf
            r0.close()     // Catch:{ IOException -> 0x00cd }
            goto L_0x00cf
        L_0x00cd:
            goto L_0x00d4
        L_0x00cf:
            if (r1 == 0) goto L_0x00d4
            r1.close()     // Catch:{ IOException -> 0x00cd }
        L_0x00d4:
            if (r9 == 0) goto L_0x00d9
            r9.disconnect()
        L_0x00d9:
            return r2
        L_0x00da:
            r2 = move-exception
        L_0x00db:
            if (r0 == 0) goto L_0x00e3
            r0.close()     // Catch:{ IOException -> 0x00e1 }
            goto L_0x00e3
        L_0x00e1:
            goto L_0x00e8
        L_0x00e3:
            if (r1 == 0) goto L_0x00e8
            r1.close()     // Catch:{ IOException -> 0x00e1 }
        L_0x00e8:
            if (r9 == 0) goto L_0x00ed
            r9.disconnect()
        L_0x00ed:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tempmail.services.DownloadUpdateFileService.c(java.lang.String):java.lang.String");
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        if (intent != null) {
            String stringExtra = intent.getStringExtra(f13003c);
            String str = f13002b;
            m.b(str, "url " + stringExtra);
            b(c(stringExtra));
        }
    }
}
