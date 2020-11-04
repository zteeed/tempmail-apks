package com.tempmail.billing;

import com.android.billingclient.api.j;
import java.util.List;

/* compiled from: BillingUtilities */
public class e {
    public static boolean a(List<j> list, String str) {
        return b(list, str) != null;
    }

    public static j b(List<j> list, String str) {
        if (list == null) {
            return null;
        }
        for (j next : list) {
            if (str.equals(next.g())) {
                return next;
            }
        }
        return null;
    }

    public static boolean c(j jVar) {
        return d(jVar.g());
    }

    public static boolean d(String str) {
        return str.equals("remove_ad_purchase") || str.equals("remove_ad_purchase_second");
    }

    public static boolean e(j jVar) {
        return jVar.g().equals("remove_ad_subscription");
    }
}
