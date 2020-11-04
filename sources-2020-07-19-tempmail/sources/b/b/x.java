package b.b;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;

final class x {

    static final class a {

        /* renamed from: d  reason: collision with root package name */
        private static String f2090d;

        /* renamed from: e  reason: collision with root package name */
        private static String f2091e;

        /* renamed from: a  reason: collision with root package name */
        private final String f2092a;

        /* renamed from: b  reason: collision with root package name */
        private final String f2093b;

        /* renamed from: c  reason: collision with root package name */
        private final String f2094c;

        a(String str, String str2, String str3) {
            this.f2092a = str;
            this.f2093b = str2;
            this.f2094c = str3;
        }

        static void b(String str) {
            if (f2090d == null) {
                d(j.b().g("AppsFlyerKey"));
            }
            String str2 = f2090d;
            if (str2 != null && str.contains(str2)) {
                e.c(str.replace(f2090d, f2091e));
            }
        }

        static void d(String str) {
            f2090d = str;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                if (i == 0 || i == str.length() - 1) {
                    sb.append(str.charAt(i));
                } else {
                    sb.append("*");
                }
            }
            f2091e = sb.toString();
        }

        /* access modifiers changed from: package-private */
        public final String a() {
            return this.f2092a;
        }

        /* access modifiers changed from: package-private */
        public final String c() {
            return this.f2094c;
        }

        /* access modifiers changed from: package-private */
        public final String e() {
            return this.f2093b;
        }
    }

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        static final x f2095a = new x();
    }

    x() {
    }

    static a a(Context context) {
        String str;
        String str2;
        String str3;
        String str4 = "unknown";
        String str5 = null;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                boolean z = false;
                if (21 <= Build.VERSION.SDK_INT) {
                    Network[] allNetworks = connectivityManager.getAllNetworks();
                    int length = allNetworks.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(allNetworks[i]);
                        if (!(networkInfo != null && networkInfo.isConnectedOrConnecting())) {
                            i++;
                        } else if (1 != networkInfo.getType()) {
                            if (networkInfo.getType() == 0) {
                            }
                        }
                    }
                } else {
                    NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(1);
                    if (!(networkInfo2 != null && networkInfo2.isConnectedOrConnecting())) {
                        NetworkInfo networkInfo3 = connectivityManager.getNetworkInfo(0);
                        if (!(networkInfo3 != null && networkInfo3.isConnectedOrConnecting())) {
                            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                            if (activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting()) {
                                z = true;
                            }
                            if (z) {
                                if (1 != activeNetworkInfo.getType()) {
                                    if (activeNetworkInfo.getType() == 0) {
                                    }
                                }
                            }
                        }
                        str4 = "MOBILE";
                    }
                }
                str4 = "WIFI";
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            str = telephonyManager.getSimOperatorName();
            try {
                str2 = telephonyManager.getNetworkOperatorName();
                if ((str2 == null || str2.isEmpty()) && 2 == telephonyManager.getPhoneType()) {
                    str2 = "CDMA";
                }
            } catch (Throwable th) {
                th = th;
                String str6 = str;
                str3 = null;
                str5 = str6;
                e.b("Exception while collecting network info. ", th);
                String str7 = str3;
                str = str5;
                str2 = str7;
                return new a(str4, str2, str);
            }
        } catch (Throwable th2) {
            th = th2;
            str3 = null;
            e.b("Exception while collecting network info. ", th);
            String str72 = str3;
            str = str5;
            str2 = str72;
            return new a(str4, str2, str);
        }
        return new a(str4, str2, str);
    }
}
