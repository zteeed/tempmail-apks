package com.google.android.gms.gcm;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.GooglePlayServicesUtilLight;

final class g implements h {

    /* renamed from: a  reason: collision with root package name */
    private final Context f3250a;

    /* renamed from: b  reason: collision with root package name */
    private final PendingIntent f3251b;

    g(Context context) {
        this.f3250a = context;
        this.f3251b = PendingIntent.getBroadcast(context, 0, new Intent().setPackage("com.google.example.invalidpackage"), 0);
    }

    private final Intent c(String str) {
        Intent intent = new Intent("com.google.android.gms.gcm.ACTION_SCHEDULE");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("app", this.f3251b);
        intent.putExtra("source", 4);
        intent.putExtra("source_version", GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        intent.putExtra("scheduler_action", str);
        return intent;
    }

    public final boolean a(ComponentName componentName, String str) {
        Intent c2 = c("CANCEL_TASK");
        c2.putExtra("component", componentName);
        c2.putExtra("tag", str);
        this.f3250a.sendBroadcast(c2);
        return true;
    }

    public final boolean b(Task task) {
        Intent c2 = c("SCHEDULE_TASK");
        Bundle bundle = new Bundle();
        task.c(bundle);
        c2.putExtras(bundle);
        this.f3250a.sendBroadcast(c2);
        return true;
    }
}
