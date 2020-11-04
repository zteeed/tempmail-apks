package b.a.a.a;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.android.billingclient.api.e;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

/* compiled from: BillingHelper */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static int f1953a = Runtime.getRuntime().availableProcessors();

    private static e a(String str, String str2) {
        if (str == null || str2 == null) {
            f("BillingHelper", "Received a bad purchase data.");
            return null;
        }
        try {
            return new e(str, str2);
        } catch (JSONException e2) {
            f("BillingHelper", "Got JSONException while parsing purchase data: " + e2);
            return null;
        }
    }

    public static List<e> b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            f("BillingHelper", "Couldn't find purchase lists, trying to find single data.");
            e a2 = a(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (a2 == null) {
                f("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(a2);
        } else {
            int i = 0;
            while (i < stringArrayList.size() && i < stringArrayList2.size()) {
                e a3 = a(stringArrayList.get(i), stringArrayList2.get(i));
                if (a3 != null) {
                    arrayList.add(a3);
                }
                i++;
            }
        }
        return arrayList;
    }

    public static int c(Bundle bundle, String str) {
        if (bundle == null) {
            f(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            e(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        } else if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        } else {
            f(str, "Unexpected type for bundle response code: " + obj.getClass().getName());
            return 6;
        }
    }

    public static int d(Intent intent, String str) {
        if (intent != null) {
            return c(intent.getExtras(), str);
        }
        f("BillingHelper", "Got null intent!");
        return 6;
    }

    public static void e(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            Log.v(str, str2);
        }
    }

    public static void f(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }
}
