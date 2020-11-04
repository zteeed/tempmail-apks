package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import b.c.a.b.i.m;
import b.c.a.b.i.r;
import b.c.a.b.i.y.a;

public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    static /* synthetic */ void a() {
    }

    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        r.f(context);
        m.a a2 = m.a();
        a2.b(queryParameter);
        a2.d(a.b(intValue));
        if (queryParameter2 != null) {
            a2.c(Base64.decode(queryParameter2, 0));
        }
        r.c().e().g(a2.a(), i, b.a());
    }
}
