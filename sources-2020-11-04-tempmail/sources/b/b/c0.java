package b.b;

import android.content.ContentResolver;
import android.os.Build;
import android.provider.Settings;
import b.b.a0;

final class c0 {

    static class a extends IllegalStateException {
        a(String str) {
            super(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        if (r8.length() == 0) goto L_0x0047;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0091 A[SYNTHETIC, Splitter:B:34:0x0091] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0139 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void a(android.content.Context r13, java.util.Map<java.lang.String, java.lang.Object> r14) {
        /*
            java.lang.String r0 = "advertiserIdEnabled"
            java.lang.String r1 = "advertiserId"
            java.lang.String r2 = "Trying to fetch GAID.."
            b.b.e.c(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.google.android.gms.common.GoogleApiAvailability r3 = com.google.android.gms.common.GoogleApiAvailability.q()     // Catch:{ all -> 0x0017 }
            int r3 = r3.i(r13)     // Catch:{ all -> 0x0017 }
            goto L_0x0020
        L_0x0017:
            r3 = move-exception
            java.lang.String r4 = r3.getMessage()
            b.b.e.b(r4, r3)
            r3 = -1
        L_0x0020:
            r4 = 0
            r5 = 0
            r6 = 1
            java.lang.String r7 = "com.google.android.gms.ads.identifier.AdvertisingIdClient"
            java.lang.Class.forName(r7)     // Catch:{ all -> 0x0065 }
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r7 = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(r13)     // Catch:{ all -> 0x0065 }
            if (r7 == 0) goto L_0x0058
            java.lang.String r8 = r7.getId()     // Catch:{ all -> 0x0065 }
            boolean r7 = r7.isLimitAdTrackingEnabled()     // Catch:{ all -> 0x0051 }
            if (r7 != 0) goto L_0x003a
            r7 = 1
            goto L_0x003b
        L_0x003a:
            r7 = 0
        L_0x003b:
            java.lang.String r4 = java.lang.Boolean.toString(r7)     // Catch:{ all -> 0x0051 }
            if (r8 == 0) goto L_0x0047
            int r7 = r8.length()     // Catch:{ all -> 0x004e }
            if (r7 != 0) goto L_0x00f3
        L_0x0047:
            java.lang.String r7 = "emptyOrNull |"
            r2.append(r7)     // Catch:{ all -> 0x004e }
            goto L_0x00f3
        L_0x004e:
            r7 = move-exception
            r9 = 1
            goto L_0x0053
        L_0x0051:
            r7 = move-exception
            r9 = 0
        L_0x0053:
            r12 = r7
            r7 = r4
            r4 = r8
            r8 = r12
            goto L_0x0069
        L_0x0058:
            java.lang.String r7 = "gpsAdInfo-null |"
            r2.append(r7)     // Catch:{ all -> 0x0065 }
            b.b.c0$a r7 = new b.b.c0$a     // Catch:{ all -> 0x0065 }
            java.lang.String r8 = "GpsAdIndo is null"
            r7.<init>(r8)     // Catch:{ all -> 0x0065 }
            throw r7     // Catch:{ all -> 0x0065 }
        L_0x0065:
            r7 = move-exception
            r8 = r7
            r9 = 0
            r7 = r4
        L_0x0069:
            java.lang.String r10 = r8.getMessage()
            b.b.e.b(r10, r8)
            java.lang.Class r8 = r8.getClass()
            java.lang.String r8 = r8.getSimpleName()
            r2.append(r8)
            java.lang.String r8 = " |"
            r2.append(r8)
            java.lang.String r10 = "WARNING: Google Play Services is missing."
            b.b.e.c(r10)
            b.b.j r10 = b.b.j.b()
            java.lang.String r11 = "enableGpsFallback"
            boolean r10 = r10.a(r11, r6)
            if (r10 == 0) goto L_0x00f0
            b.b.v$a r4 = b.b.v.a(r13)     // Catch:{ all -> 0x00b3 }
            java.lang.String r7 = r4.a()     // Catch:{ all -> 0x00b3 }
            boolean r4 = r4.b()     // Catch:{ all -> 0x00b3 }
            if (r4 != 0) goto L_0x00a0
            r5 = 1
        L_0x00a0:
            java.lang.String r4 = java.lang.Boolean.toString(r5)     // Catch:{ all -> 0x00b3 }
            if (r7 == 0) goto L_0x00ac
            int r5 = r7.length()     // Catch:{ all -> 0x00b3 }
            if (r5 != 0) goto L_0x00b1
        L_0x00ac:
            java.lang.String r5 = "emptyOrNull (bypass) |"
            r2.append(r5)     // Catch:{ all -> 0x00b3 }
        L_0x00b1:
            r8 = r7
            goto L_0x00f2
        L_0x00b3:
            r4 = move-exception
            java.lang.String r5 = r4.getMessage()
            b.b.e.b(r5, r4)
            java.lang.Class r5 = r4.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r2.append(r5)
            r2.append(r8)
            b.b.j r5 = b.b.j.b()
            java.lang.String r8 = r5.g(r1)
            b.b.j r5 = b.b.j.b()
            java.lang.String r5 = r5.g(r0)
            java.lang.String r6 = r4.getLocalizedMessage()
            if (r6 == 0) goto L_0x00e7
            java.lang.String r4 = r4.getLocalizedMessage()
            b.b.e.c(r4)
            goto L_0x00ee
        L_0x00e7:
            java.lang.String r4 = r4.toString()
            b.b.e.c(r4)
        L_0x00ee:
            r4 = r5
            goto L_0x00f2
        L_0x00f0:
            r8 = r4
            r4 = r7
        L_0x00f2:
            r6 = r9
        L_0x00f3:
            java.lang.Class r13 = r13.getClass()
            java.lang.String r13 = r13.getName()
            java.lang.String r5 = "android.app.ReceiverRestrictedContext"
            boolean r13 = r13.equals(r5)
            if (r13 == 0) goto L_0x0118
            b.b.j r13 = b.b.j.b()
            java.lang.String r8 = r13.g(r1)
            b.b.j r13 = b.b.j.b()
            java.lang.String r4 = r13.g(r0)
            java.lang.String r13 = "context = android.app.ReceiverRestrictedContext |"
            r2.append(r13)
        L_0x0118:
            int r13 = r2.length()
            if (r13 <= 0) goto L_0x0137
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r3)
            java.lang.String r3 = ": "
            r13.append(r3)
            r13.append(r2)
            java.lang.String r13 = r13.toString()
            java.lang.String r2 = "gaidError"
            r14.put(r2, r13)
        L_0x0137:
            if (r8 == 0) goto L_0x0158
            if (r4 == 0) goto L_0x0158
            r14.put(r1, r8)
            r14.put(r0, r4)
            b.b.j r13 = b.b.j.b()
            r13.n(r1, r8)
            b.b.j r13 = b.b.j.b()
            r13.n(r0, r4)
            java.lang.String r13 = java.lang.String.valueOf(r6)
            java.lang.String r0 = "isGaidWithGps"
            r14.put(r0, r13)
        L_0x0158:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.c0.a(android.content.Context, java.util.Map):void");
    }

    static a0 b(ContentResolver contentResolver) {
        String str;
        if (contentResolver == null || j.b().g("amazon_aid") != null || !"Amazon".equals(Build.MANUFACTURER)) {
            return null;
        }
        int i = Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 2);
        if (i == 0) {
            return new a0(a0.a.AMAZON, Settings.Secure.getString(contentResolver, "advertising_id"), false);
        } else if (i == 2) {
            return null;
        } else {
            try {
                str = Settings.Secure.getString(contentResolver, "advertising_id");
            } catch (Throwable th) {
                e.b("Couldn't fetch Amazon Advertising ID (Ad-Tracking is limited!)", th);
                str = "";
            }
            return new a0(a0.a.AMAZON, str, true);
        }
    }
}
