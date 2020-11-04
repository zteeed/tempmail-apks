package com.tempmail.utils;

import android.content.Context;
import com.google.firebase.remoteconfig.f;
import com.tempmail.R;

/* compiled from: FirebaseUtils */
public class i {

    /* renamed from: a  reason: collision with root package name */
    public static final String f13118a = "i";

    public static int a(Context context) {
        if (!e.S()) {
            return 10;
        }
        int h = (int) f.f().h(context.getString(R.string.remote_config_max_mailbox));
        String str = f13118a;
        m.b(str, "mailboxPremiumLimitation " + h);
        return h;
    }

    public static String b(Context context) {
        return u.a(context, R.string.message_mailbox_limitation, String.valueOf(a(context)));
    }

    public static int c(Context context) {
        int h = (int) f.f().h(context.getString(R.string.remote_config_remove_ads_plan));
        if (h <= 0 || h > 3) {
            h = 1;
        }
        String str = f13118a;
        m.b(str, "removeAdPlan " + h);
        return h;
    }

    public static String d(Context context) {
        String i = f.f().i(context.getString(R.string.remote_config_remove_ads));
        String str = f13118a;
        m.b(str, "removeAdPolitics " + i);
        return i;
    }

    public static boolean e(Context context) {
        String d2 = d(context);
        if ("TRIAL".equalsIgnoreCase(d2)) {
            return s.y(context);
        }
        if ("ALL".equalsIgnoreCase(d2)) {
            return true;
        }
        try {
            int parseInt = Integer.parseInt(d2);
            String str = f13118a;
            m.b(str, "ad points " + parseInt);
            if (parseInt == 0) {
                return false;
            }
            int P = s.P(context);
            String str2 = f13118a;
            m.b(str2, "totalSpend points " + P);
            return P >= parseInt;
        } catch (NumberFormatException e2) {
            e2.printStackTrace();
        }
    }
}
