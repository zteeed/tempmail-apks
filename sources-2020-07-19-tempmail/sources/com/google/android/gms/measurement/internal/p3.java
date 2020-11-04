package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.net.URL;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
final class p3 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final URL f10166b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f10167c;

    /* renamed from: d  reason: collision with root package name */
    private final n3 f10168d;

    /* renamed from: e  reason: collision with root package name */
    private final String f10169e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, String> f10170f;
    private final /* synthetic */ zzfb g;

    public p3(zzfb zzfb, String str, URL url, byte[] bArr, Map<String, String> map, n3 n3Var) {
        this.g = zzfb;
        Preconditions.g(str);
        Preconditions.k(url);
        Preconditions.k(n3Var);
        this.f10166b = url;
        this.f10167c = bArr;
        this.f10168d = n3Var;
        this.f10169e = str;
        this.f10170f = map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d1 A[SYNTHETIC, Splitter:B:47:0x00d1] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x010c A[SYNTHETIC, Splitter:B:60:0x010c] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0126  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            java.lang.String r0 = "Error closing HTTP compressed POST connection output stream. appId"
            com.google.android.gms.measurement.internal.zzfb r1 = r13.g
            r1.b()
            r1 = 0
            r2 = 0
            com.google.android.gms.measurement.internal.zzfb r3 = r13.g     // Catch:{ IOException -> 0x0105, all -> 0x00ca }
            java.net.URL r4 = r13.f10166b     // Catch:{ IOException -> 0x0105, all -> 0x00ca }
            java.net.HttpURLConnection r3 = r3.v(r4)     // Catch:{ IOException -> 0x0105, all -> 0x00ca }
            java.util.Map<java.lang.String, java.lang.String> r4 = r13.f10170f     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            if (r4 == 0) goto L_0x003b
            java.util.Map<java.lang.String, java.lang.String> r4 = r13.f10170f     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            java.util.Set r4 = r4.entrySet()     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
        L_0x001f:
            boolean r5 = r4.hasNext()     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            if (r5 == 0) goto L_0x003b
            java.lang.Object r5 = r4.next()     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            java.lang.Object r6 = r5.getKey()     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            java.lang.Object r5 = r5.getValue()     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            r3.addRequestProperty(r6, r5)     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            goto L_0x001f
        L_0x003b:
            byte[] r4 = r13.f10167c     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            if (r4 == 0) goto L_0x0088
            com.google.android.gms.measurement.internal.zzfb r4 = r13.g     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            com.google.android.gms.measurement.internal.zzkn r4 = r4.o()     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            byte[] r5 = r13.f10167c     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            byte[] r4 = r4.X(r5)     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            com.google.android.gms.measurement.internal.zzfb r5 = r13.g     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            com.google.android.gms.measurement.internal.zzeu r5 = r5.h()     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            com.google.android.gms.measurement.internal.zzew r5 = r5.O()     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            java.lang.String r6 = "Uploading data. size"
            int r7 = r4.length     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            r5.b(r6, r7)     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            r5 = 1
            r3.setDoOutput(r5)     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            java.lang.String r5 = "Content-Encoding"
            java.lang.String r6 = "gzip"
            r3.addRequestProperty(r5, r6)     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            int r5 = r4.length     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            r3.setFixedLengthStreamingMode(r5)     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            r3.connect()     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            java.io.OutputStream r5 = r3.getOutputStream()     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            r5.write(r4)     // Catch:{ IOException -> 0x0082, all -> 0x007c }
            r5.close()     // Catch:{ IOException -> 0x0082, all -> 0x007c }
            goto L_0x0088
        L_0x007c:
            r4 = move-exception
            r10 = r1
            r2 = r4
            r1 = r5
            goto L_0x00ce
        L_0x0082:
            r4 = move-exception
            r10 = r1
            r8 = r4
            r1 = r5
            goto L_0x0109
        L_0x0088:
            int r8 = r3.getResponseCode()     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            java.util.Map r11 = r3.getHeaderFields()     // Catch:{ IOException -> 0x00bf, all -> 0x00ba }
            com.google.android.gms.measurement.internal.zzfb r2 = r13.g     // Catch:{ IOException -> 0x00b6, all -> 0x00b1 }
            byte[] r10 = com.google.android.gms.measurement.internal.zzfb.x(r3)     // Catch:{ IOException -> 0x00b6, all -> 0x00b1 }
            if (r3 == 0) goto L_0x009b
            r3.disconnect()
        L_0x009b:
            com.google.android.gms.measurement.internal.zzfb r0 = r13.g
            com.google.android.gms.measurement.internal.zzfv r0 = r0.g()
            com.google.android.gms.measurement.internal.m3 r1 = new com.google.android.gms.measurement.internal.m3
            java.lang.String r6 = r13.f10169e
            com.google.android.gms.measurement.internal.n3 r7 = r13.f10168d
            r9 = 0
            r12 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0.z(r1)
            return
        L_0x00b1:
            r4 = move-exception
            r2 = r4
            r7 = r8
            r10 = r11
            goto L_0x00cf
        L_0x00b6:
            r4 = move-exception
            r7 = r8
            r10 = r11
            goto L_0x00c2
        L_0x00ba:
            r4 = move-exception
            r10 = r1
            r2 = r4
            r7 = r8
            goto L_0x00cf
        L_0x00bf:
            r4 = move-exception
            r10 = r1
            r7 = r8
        L_0x00c2:
            r8 = r4
            goto L_0x010a
        L_0x00c4:
            r4 = move-exception
            r10 = r1
            goto L_0x00cd
        L_0x00c7:
            r4 = move-exception
            r10 = r1
            goto L_0x0108
        L_0x00ca:
            r4 = move-exception
            r3 = r1
            r10 = r3
        L_0x00cd:
            r2 = r4
        L_0x00ce:
            r7 = 0
        L_0x00cf:
            if (r1 == 0) goto L_0x00e9
            r1.close()     // Catch:{ IOException -> 0x00d5 }
            goto L_0x00e9
        L_0x00d5:
            r1 = move-exception
            com.google.android.gms.measurement.internal.zzfb r4 = r13.g
            com.google.android.gms.measurement.internal.zzeu r4 = r4.h()
            com.google.android.gms.measurement.internal.zzew r4 = r4.G()
            java.lang.String r5 = r13.f10169e
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzeu.x(r5)
            r4.c(r0, r5, r1)
        L_0x00e9:
            if (r3 == 0) goto L_0x00ee
            r3.disconnect()
        L_0x00ee:
            com.google.android.gms.measurement.internal.zzfb r0 = r13.g
            com.google.android.gms.measurement.internal.zzfv r0 = r0.g()
            com.google.android.gms.measurement.internal.m3 r1 = new com.google.android.gms.measurement.internal.m3
            java.lang.String r5 = r13.f10169e
            com.google.android.gms.measurement.internal.n3 r6 = r13.f10168d
            r8 = 0
            r9 = 0
            r11 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.z(r1)
            throw r2
        L_0x0105:
            r4 = move-exception
            r3 = r1
            r10 = r3
        L_0x0108:
            r8 = r4
        L_0x0109:
            r7 = 0
        L_0x010a:
            if (r1 == 0) goto L_0x0124
            r1.close()     // Catch:{ IOException -> 0x0110 }
            goto L_0x0124
        L_0x0110:
            r1 = move-exception
            com.google.android.gms.measurement.internal.zzfb r2 = r13.g
            com.google.android.gms.measurement.internal.zzeu r2 = r2.h()
            com.google.android.gms.measurement.internal.zzew r2 = r2.G()
            java.lang.String r4 = r13.f10169e
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzeu.x(r4)
            r2.c(r0, r4, r1)
        L_0x0124:
            if (r3 == 0) goto L_0x0129
            r3.disconnect()
        L_0x0129:
            com.google.android.gms.measurement.internal.zzfb r0 = r13.g
            com.google.android.gms.measurement.internal.zzfv r0 = r0.g()
            com.google.android.gms.measurement.internal.m3 r1 = new com.google.android.gms.measurement.internal.m3
            java.lang.String r5 = r13.f10169e
            com.google.android.gms.measurement.internal.n3 r6 = r13.f10168d
            r9 = 0
            r11 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.z(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.p3.run():void");
    }
}
