package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.net.URL;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class t5 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final URL f10251b;

    /* renamed from: c  reason: collision with root package name */
    private final r5 f10252c;

    /* renamed from: d  reason: collision with root package name */
    private final String f10253d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, String> f10254e = null;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ zzid f10255f;

    public t5(zzid zzid, String str, URL url, byte[] bArr, Map<String, String> map, r5 r5Var) {
        this.f10255f = zzid;
        Preconditions.g(str);
        Preconditions.k(url);
        Preconditions.k(r5Var);
        this.f10251b = url;
        this.f10252c = r5Var;
        this.f10253d = str;
    }

    private final void b(int i, Exception exc, byte[] bArr, Map<String, List<String>> map) {
        this.f10255f.g().z(new s5(this, i, exc, bArr, map));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(int i, Exception exc, byte[] bArr, Map map) {
        this.f10252c.a(this.f10253d, i, exc, bArr, map);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            com.google.android.gms.measurement.internal.zzid r0 = r7.f10255f
            r0.b()
            r0 = 0
            r1 = 0
            com.google.android.gms.measurement.internal.zzid r2 = r7.f10255f     // Catch:{ IOException -> 0x006c, all -> 0x0060 }
            java.net.URL r3 = r7.f10251b     // Catch:{ IOException -> 0x006c, all -> 0x0060 }
            java.net.HttpURLConnection r2 = r2.u(r3)     // Catch:{ IOException -> 0x006c, all -> 0x0060 }
            java.util.Map<java.lang.String, java.lang.String> r3 = r7.f10254e     // Catch:{ IOException -> 0x005d, all -> 0x005a }
            if (r3 == 0) goto L_0x0039
            java.util.Map<java.lang.String, java.lang.String> r3 = r7.f10254e     // Catch:{ IOException -> 0x005d, all -> 0x005a }
            java.util.Set r3 = r3.entrySet()     // Catch:{ IOException -> 0x005d, all -> 0x005a }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ IOException -> 0x005d, all -> 0x005a }
        L_0x001d:
            boolean r4 = r3.hasNext()     // Catch:{ IOException -> 0x005d, all -> 0x005a }
            if (r4 == 0) goto L_0x0039
            java.lang.Object r4 = r3.next()     // Catch:{ IOException -> 0x005d, all -> 0x005a }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ IOException -> 0x005d, all -> 0x005a }
            java.lang.Object r5 = r4.getKey()     // Catch:{ IOException -> 0x005d, all -> 0x005a }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x005d, all -> 0x005a }
            java.lang.Object r4 = r4.getValue()     // Catch:{ IOException -> 0x005d, all -> 0x005a }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ IOException -> 0x005d, all -> 0x005a }
            r2.addRequestProperty(r5, r4)     // Catch:{ IOException -> 0x005d, all -> 0x005a }
            goto L_0x001d
        L_0x0039:
            int r1 = r2.getResponseCode()     // Catch:{ IOException -> 0x005d, all -> 0x005a }
            java.util.Map r3 = r2.getHeaderFields()     // Catch:{ IOException -> 0x005d, all -> 0x005a }
            com.google.android.gms.measurement.internal.zzid r4 = r7.f10255f     // Catch:{ IOException -> 0x0055, all -> 0x0050 }
            byte[] r4 = com.google.android.gms.measurement.internal.zzid.w(r2)     // Catch:{ IOException -> 0x0055, all -> 0x0050 }
            if (r2 == 0) goto L_0x004c
            r2.disconnect()
        L_0x004c:
            r7.b(r1, r0, r4, r3)
            return
        L_0x0050:
            r4 = move-exception
            r6 = r4
            r4 = r3
            r3 = r6
            goto L_0x0063
        L_0x0055:
            r4 = move-exception
            r6 = r4
            r4 = r3
            r3 = r6
            goto L_0x006f
        L_0x005a:
            r3 = move-exception
            r4 = r0
            goto L_0x0063
        L_0x005d:
            r3 = move-exception
            r4 = r0
            goto L_0x006f
        L_0x0060:
            r3 = move-exception
            r2 = r0
            r4 = r2
        L_0x0063:
            if (r2 == 0) goto L_0x0068
            r2.disconnect()
        L_0x0068:
            r7.b(r1, r0, r0, r4)
            throw r3
        L_0x006c:
            r3 = move-exception
            r2 = r0
            r4 = r2
        L_0x006f:
            if (r2 == 0) goto L_0x0074
            r2.disconnect()
        L_0x0074:
            r7.b(r1, r3, r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.t5.run():void");
    }
}
