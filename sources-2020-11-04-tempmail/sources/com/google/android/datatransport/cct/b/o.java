package com.google.android.datatransport.cct.b;

import android.util.SparseArray;
import com.google.android.datatransport.cct.b.i;

public abstract class o {

    public static abstract class a {
        public abstract a a(b bVar);

        public abstract a b(c cVar);

        public abstract o c();
    }

    public enum b {
        UNKNOWN_MOBILE_SUBTYPE(0),
        GPRS(1),
        EDGE(2),
        UMTS(3),
        CDMA(4),
        EVDO_0(5),
        EVDO_A(6),
        RTT(7),
        HSDPA(8),
        HSUPA(9),
        HSPA(10),
        IDEN(11),
        EVDO_B(12),
        LTE(13),
        EHRPD(14),
        HSPAP(15),
        GSM(16),
        TD_SCDMA(17),
        IWLAN(18),
        LTE_CA(19),
        COMBINED(100);
        
        private static final SparseArray<b> x = null;

        /* renamed from: b  reason: collision with root package name */
        private final int f2700b;

        static {
            UNKNOWN_MOBILE_SUBTYPE = new b("UNKNOWN_MOBILE_SUBTYPE", 0, 0);
            GPRS = new b("GPRS", 1, 1);
            EDGE = new b("EDGE", 2, 2);
            UMTS = new b("UMTS", 3, 3);
            CDMA = new b("CDMA", 4, 4);
            EVDO_0 = new b("EVDO_0", 5, 5);
            EVDO_A = new b("EVDO_A", 6, 6);
            RTT = new b("RTT", 7, 7);
            HSDPA = new b("HSDPA", 8, 8);
            HSUPA = new b("HSUPA", 9, 9);
            HSPA = new b("HSPA", 10, 10);
            IDEN = new b("IDEN", 11, 11);
            EVDO_B = new b("EVDO_B", 12, 12);
            LTE = new b("LTE", 13, 13);
            EHRPD = new b("EHRPD", 14, 14);
            HSPAP = new b("HSPAP", 15, 15);
            GSM = new b("GSM", 16, 16);
            TD_SCDMA = new b("TD_SCDMA", 17, 17);
            IWLAN = new b("IWLAN", 18, 18);
            LTE_CA = new b("LTE_CA", 19, 19);
            COMBINED = new b("COMBINED", 20, 100);
            SparseArray<b> sparseArray = new SparseArray<>();
            x = sparseArray;
            sparseArray.put(0, UNKNOWN_MOBILE_SUBTYPE);
            x.put(1, GPRS);
            x.put(2, EDGE);
            x.put(3, UMTS);
            x.put(4, CDMA);
            x.put(5, EVDO_0);
            x.put(6, EVDO_A);
            x.put(7, RTT);
            x.put(8, HSDPA);
            x.put(9, HSUPA);
            x.put(10, HSPA);
            x.put(11, IDEN);
            x.put(12, EVDO_B);
            x.put(13, LTE);
            x.put(14, EHRPD);
            x.put(15, HSPAP);
            x.put(16, GSM);
            x.put(17, TD_SCDMA);
            x.put(18, IWLAN);
            x.put(19, LTE_CA);
        }

        private b(int i) {
            this.f2700b = i;
        }

        public static b f(int i) {
            return x.get(i);
        }

        public int a() {
            return this.f2700b;
        }
    }

    public enum c {
        MOBILE(0),
        WIFI(1),
        MOBILE_MMS(2),
        MOBILE_SUPL(3),
        MOBILE_DUN(4),
        MOBILE_HIPRI(5),
        WIMAX(6),
        BLUETOOTH(7),
        DUMMY(8),
        ETHERNET(9),
        MOBILE_FOTA(10),
        MOBILE_IMS(11),
        MOBILE_CBS(12),
        WIFI_P2P(13),
        MOBILE_IA(14),
        MOBILE_EMERGENCY(15),
        PROXY(16),
        VPN(17),
        NONE(-1);
        
        private static final SparseArray<c> v = null;

        /* renamed from: b  reason: collision with root package name */
        private final int f2705b;

        static {
            MOBILE = new c("MOBILE", 0, 0);
            WIFI = new c("WIFI", 1, 1);
            MOBILE_MMS = new c("MOBILE_MMS", 2, 2);
            MOBILE_SUPL = new c("MOBILE_SUPL", 3, 3);
            MOBILE_DUN = new c("MOBILE_DUN", 4, 4);
            MOBILE_HIPRI = new c("MOBILE_HIPRI", 5, 5);
            WIMAX = new c("WIMAX", 6, 6);
            BLUETOOTH = new c("BLUETOOTH", 7, 7);
            DUMMY = new c("DUMMY", 8, 8);
            ETHERNET = new c("ETHERNET", 9, 9);
            MOBILE_FOTA = new c("MOBILE_FOTA", 10, 10);
            MOBILE_IMS = new c("MOBILE_IMS", 11, 11);
            MOBILE_CBS = new c("MOBILE_CBS", 12, 12);
            WIFI_P2P = new c("WIFI_P2P", 13, 13);
            MOBILE_IA = new c("MOBILE_IA", 14, 14);
            MOBILE_EMERGENCY = new c("MOBILE_EMERGENCY", 15, 15);
            PROXY = new c("PROXY", 16, 16);
            VPN = new c("VPN", 17, 17);
            NONE = new c("NONE", 18, -1);
            SparseArray<c> sparseArray = new SparseArray<>();
            v = sparseArray;
            sparseArray.put(0, MOBILE);
            v.put(1, WIFI);
            v.put(2, MOBILE_MMS);
            v.put(3, MOBILE_SUPL);
            v.put(4, MOBILE_DUN);
            v.put(5, MOBILE_HIPRI);
            v.put(6, WIMAX);
            v.put(7, BLUETOOTH);
            v.put(8, DUMMY);
            v.put(9, ETHERNET);
            v.put(10, MOBILE_FOTA);
            v.put(11, MOBILE_IMS);
            v.put(12, MOBILE_CBS);
            v.put(13, WIFI_P2P);
            v.put(14, MOBILE_IA);
            v.put(15, MOBILE_EMERGENCY);
            v.put(16, PROXY);
            v.put(17, VPN);
            v.put(-1, NONE);
        }

        private c(int i) {
            this.f2705b = i;
        }

        public static c f(int i) {
            return v.get(i);
        }

        public int a() {
            return this.f2705b;
        }
    }

    public static a a() {
        return new i.b();
    }

    public abstract b b();

    public abstract c c();
}
