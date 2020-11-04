package com.android.billingclient.api;

import android.os.Bundle;
import com.android.billingclient.api.g;
import com.google.android.gms.internal.play_billing.zzb;
import java.util.ArrayList;

/* compiled from: com.android.billingclient:billing@@3.0.0 */
final class c0 {
    static g a(Bundle bundle, String str, String str2) {
        g gVar = a0.k;
        if (bundle == null) {
            zzb.l(str, String.format("%s got null owned items list", new Object[]{str2}));
            return gVar;
        }
        int b2 = zzb.b(bundle, str);
        String k = zzb.k(bundle, str);
        g.a c2 = g.c();
        c2.c(b2);
        c2.b(k);
        g a2 = c2.a();
        if (b2 != 0) {
            zzb.l(str, String.format("%s failed. Response code: %s", new Object[]{str2, Integer.valueOf(b2)}));
            return a2;
        } else if (!bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundle.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
            zzb.l(str, String.format("Bundle returned from %s doesn't contain required fields.", new Object[]{str2}));
            return gVar;
        } else {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
            ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
            ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
            if (stringArrayList == null) {
                zzb.l(str, String.format("Bundle returned from %s contains null SKUs list.", new Object[]{str2}));
                return gVar;
            } else if (stringArrayList2 == null) {
                zzb.l(str, String.format("Bundle returned from %s contains null purchases list.", new Object[]{str2}));
                return gVar;
            } else if (stringArrayList3 != null) {
                return a0.l;
            } else {
                zzb.l(str, String.format("Bundle returned from %s contains null signatures list.", new Object[]{str2}));
                return gVar;
            }
        }
    }
}
