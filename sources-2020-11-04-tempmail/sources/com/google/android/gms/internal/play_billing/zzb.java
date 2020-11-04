package com.google.android.gms.internal.play_billing;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.a;
import com.android.billingclient.api.f;
import com.android.billingclient.api.g;
import com.android.billingclient.api.h;
import com.android.billingclient.api.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;

/* compiled from: com.android.billingclient:billing@@3.0.0 */
public final class zzb {

    /* renamed from: a  reason: collision with root package name */
    public static int f10008a = Runtime.getRuntime().availableProcessors();

    public static int a(Intent intent, String str) {
        return j(intent, str).b();
    }

    public static int b(Bundle bundle, String str) {
        if (bundle == null) {
            l(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            i(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        } else if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        } else {
            String valueOf = String.valueOf(obj.getClass().getName());
            l(str, valueOf.length() != 0 ? "Unexpected type for bundle response code: ".concat(valueOf) : new String("Unexpected type for bundle response code: "));
            return 6;
        }
    }

    public static Bundle c(a aVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        return bundle;
    }

    public static Bundle d(f fVar, boolean z, boolean z2, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (fVar.c() != 0) {
            bundle.putInt("prorationMode", fVar.c());
        }
        if (!TextUtils.isEmpty(fVar.l())) {
            bundle.putString("accountId", fVar.l());
        }
        if (!TextUtils.isEmpty(fVar.p())) {
            bundle.putString("obfuscatedProfileId", fVar.p());
        }
        if (fVar.e()) {
            bundle.putBoolean("vr", true);
        }
        if (!TextUtils.isEmpty(fVar.a())) {
            bundle.putStringArrayList("skusToReplace", new ArrayList(Arrays.asList(new String[]{fVar.a()})));
        }
        if (!TextUtils.isEmpty(fVar.b())) {
            bundle.putString("oldSkuPurchaseToken", fVar.b());
        }
        if (z && z2) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        return bundle;
    }

    public static Bundle e(h hVar, boolean z, String str) {
        Bundle bundle = new Bundle();
        if (z) {
            bundle.putString("playBillingLibraryVersion", str);
        }
        return bundle;
    }

    public static Bundle f(boolean z, boolean z2, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (z && z2) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        return bundle;
    }

    public static Bundle g(boolean z, boolean z2, boolean z3, String str, String str2) {
        Bundle bundle = new Bundle();
        if (z) {
            bundle.putString("playBillingLibraryVersion", str);
        }
        if (z && z3) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (z2 && str2 != null) {
            bundle.putString("SKU_PACKAGE_NAME", str2);
        }
        return bundle;
    }

    public static List<j> h(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            l("BillingHelper", "Couldn't find purchase lists, trying to find single data.");
            j m = m(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (m == null) {
                l("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(m);
        } else {
            int i = 0;
            while (i < stringArrayList.size() && i < stringArrayList2.size()) {
                j m2 = m(stringArrayList.get(i), stringArrayList2.get(i));
                if (m2 != null) {
                    arrayList.add(m2);
                }
                i++;
            }
        }
        return arrayList;
    }

    public static void i(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            Log.v(str, str2);
        }
    }

    public static g j(Intent intent, String str) {
        if (intent == null) {
            l("BillingHelper", "Got null intent!");
            g.a c2 = g.c();
            c2.c(6);
            c2.b("An internal error occurred.");
            return c2.a();
        }
        g.a c3 = g.c();
        c3.c(b(intent.getExtras(), str));
        c3.b(k(intent.getExtras(), str));
        return c3.a();
    }

    public static String k(Bundle bundle, String str) {
        if (bundle == null) {
            l(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            i(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        } else if (obj instanceof String) {
            return (String) obj;
        } else {
            String valueOf = String.valueOf(obj.getClass().getName());
            l(str, valueOf.length() != 0 ? "Unexpected type for debug message: ".concat(valueOf) : new String("Unexpected type for debug message: "));
            return "";
        }
    }

    public static void l(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    private static j m(String str, String str2) {
        if (str == null || str2 == null) {
            l("BillingHelper", "Received a bad purchase data.");
            return null;
        }
        try {
            return new j(str, str2);
        } catch (JSONException e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
            sb.append("Got JSONException while parsing purchase data: ");
            sb.append(valueOf);
            l("BillingHelper", sb.toString());
            return null;
        }
    }
}
