package com.tempmail.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tempmail.R;
import com.tempmail.utils.c;
import com.tempmail.utils.m;
import com.tempmail.utils.q;
import com.tempmail.utils.s;
import com.tempmail.utils.y.b;
import java.util.Calendar;
import java.util.Date;

public class ExpireSoonReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static final String f12478a = ExpireSoonReceiver.class.getSimpleName();

    public void onReceive(Context context, Intent intent) {
        m.b(f12478a, "onReceive");
        if (intent != null) {
            String action = intent.getAction();
            String str = f12478a;
            m.b(str, "action " + action);
            if (action.equals(c.f12565d)) {
                if (s.w(context).booleanValue()) {
                    long longExtra = intent.getLongExtra("extra_end_time", 0);
                    String str2 = f12478a;
                    m.b(str2, "endTime " + new Date(longExtra));
                    String str3 = f12478a;
                    m.b(str3, "current time " + Calendar.getInstance().getTime().toString());
                    if (Calendar.getInstance().getTimeInMillis() < longExtra) {
                        q.d(context, b.g.intValue(), context.getString(R.string.app_name), context.getString(R.string.notification_address_expires_soon));
                    }
                }
            } else if (action.equals(c.f12566e)) {
                q.a(context, b.g.intValue());
            }
        }
    }
}
