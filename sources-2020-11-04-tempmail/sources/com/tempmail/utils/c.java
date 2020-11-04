package com.tempmail.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.tempmail.receivers.ExpireSoonReceiver;
import com.tempmail.utils.y.b;
import java.util.Calendar;
import java.util.Date;

/* compiled from: AlarmUtils */
public class c {

    /* renamed from: c  reason: collision with root package name */
    public static final String f13107c = (b.f13136a + ".email_expiring");

    /* renamed from: d  reason: collision with root package name */
    public static final String f13108d = (b.f13136a + ".email_expired");

    /* renamed from: e  reason: collision with root package name */
    public static final Integer f13109e = 2;

    /* renamed from: f  reason: collision with root package name */
    private static final String f13110f = c.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    private Context f13111a;

    /* renamed from: b  reason: collision with root package name */
    private AlarmManager f13112b;

    static {
        b.f13136a + ".update_service";
    }

    public c(Context context) {
        this.f13111a = context;
        this.f13112b = (AlarmManager) context.getSystemService("alarm");
    }

    private void a(PendingIntent pendingIntent, long j) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            this.f13112b.setAndAllowWhileIdle(0, j, pendingIntent);
        } else if (i >= 19) {
            this.f13112b.setExact(0, j, pendingIntent);
        } else {
            this.f13112b.set(0, j, pendingIntent);
        }
    }

    public PendingIntent b(boolean z, String str, long j) {
        Intent intent = new Intent(this.f13111a, ExpireSoonReceiver.class);
        intent.setAction(str);
        intent.putExtra("extra_end_time", j);
        if (PendingIntent.getBroadcast(this.f13111a, f13109e.intValue(), intent, 536870912) == null || z) {
            return PendingIntent.getBroadcast(this.f13111a, f13109e.intValue(), intent, 134217728);
        }
        m.b("UpdateAlarmUtils", "alarm not null");
        return null;
    }

    public void c(boolean z, long j, String str, long j2) {
        PendingIntent b2;
        String str2 = f13110f;
        m.b(str2, "setExpireSoonAlarm " + new Date(j).toString());
        if (Calendar.getInstance().getTimeInMillis() < j2 && (b2 = b(z, str, j2)) != null) {
            m.b(f13110f, "setExpireSoonAlarm intent not null ");
            a(b2, j);
        }
    }
}
