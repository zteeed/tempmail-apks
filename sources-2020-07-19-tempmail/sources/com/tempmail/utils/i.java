package com.tempmail.utils;

import android.content.Context;
import com.google.firebase.remoteconfig.f;
import com.tempmail.R;

/* compiled from: FirebaseUtils */
public class i {

    /* renamed from: a  reason: collision with root package name */
    public static final String f12574a = "i";

    public static int a(Context context) {
        if (!e.S()) {
            return 10;
        }
        int h = (int) f.f().h(context.getString(R.string.remote_config_max_mailbox));
        String str = f12574a;
        m.b(str, "mailboxPremiumLimitation " + h);
        return h;
    }

    public static String b(Context context) {
        return u.a(context, R.string.message_mailbox_limitation, String.valueOf(a(context)));
    }

    public static String c(Context context) {
        String i = f.f().i(context.getString(R.string.remote_config_remove_ads));
        String str = f12574a;
        m.b(str, "removeAdPolitics " + i);
        return i;
    }

    public static boolean d(Context context) {
        String c2 = c(context);
        if ("TRIAL".equalsIgnoreCase(c2)) {
            return s.x(context);
        }
        if ("ALL".equalsIgnoreCase(c2)) {
            return true;
        }
        try {
            int parseInt = Integer.parseInt(c2);
            String str = f12574a;
            m.b(str, "ad points " + parseInt);
            if (parseInt == 0) {
                return false;
            }
            int O = s.O(context);
            String str2 = f12574a;
            m.b(str2, "totalSpend points " + O);
            return O >= parseInt;
        } catch (NumberFormatException e2) {
            e2.printStackTrace();
        }
    }
}
