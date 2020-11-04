package com.google.android.play.core.assetpacks;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.play.core.internal.a;

public class AssetPackExtractionService extends Service {

    /* renamed from: b  reason: collision with root package name */
    private final a f11187b = new a("AssetPackExtractionService");

    /* renamed from: c  reason: collision with root package name */
    Context f11188c;

    /* renamed from: d  reason: collision with root package name */
    u2 f11189d;

    /* renamed from: e  reason: collision with root package name */
    b0 f11190e;

    /* renamed from: f  reason: collision with root package name */
    private y f11191f;
    private NotificationManager g;

    private final synchronized void c(Bundle bundle) {
        String string = bundle.getString("notification_title");
        String string2 = bundle.getString("notification_subtext");
        long j = bundle.getLong("notification_timeout");
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("notification_on_click_intent");
        Notification.Builder timeoutAfter = Build.VERSION.SDK_INT >= 26 ? new Notification.Builder(this.f11188c, "playcore-assetpacks-service-notification-channel").setTimeoutAfter(j) : new Notification.Builder(this.f11188c).setPriority(-2);
        if (pendingIntent != null) {
            timeoutAfter.setContentIntent(pendingIntent);
        }
        timeoutAfter.setSmallIcon(17301633).setOngoing(false).setContentTitle(string).setSubText(string2);
        if (Build.VERSION.SDK_INT >= 21) {
            timeoutAfter.setColor(bundle.getInt("notification_color")).setVisibility(-1);
        }
        Notification build = timeoutAfter.build();
        this.f11187b.f("Starting foreground service.", new Object[0]);
        this.f11189d.b(true);
        if (Build.VERSION.SDK_INT >= 26) {
            this.g.createNotificationChannel(new NotificationChannel("playcore-assetpacks-service-notification-channel", bundle.getString("notification_channel_name"), 2));
        }
        startForeground(-1883842196, build);
    }

    public final synchronized Bundle a(Bundle bundle) {
        int i = bundle.getInt("action_type");
        a aVar = this.f11187b;
        Integer valueOf = Integer.valueOf(i);
        aVar.c("updateServiceState: %d", valueOf);
        if (i == 1) {
            c(bundle);
        } else if (i != 2) {
            this.f11187b.e("Unknown action type received: %d", valueOf);
        } else {
            b();
        }
        return new Bundle();
    }

    /* access modifiers changed from: package-private */
    public final synchronized void b() {
        this.f11187b.f("Stopping service.", new Object[0]);
        this.f11189d.b(false);
        stopForeground(true);
        stopSelf();
    }

    public final IBinder onBind(Intent intent) {
        return this.f11191f;
    }

    public final void onCreate() {
        super.onCreate();
        this.f11187b.c("onCreate", new Object[0]);
        w1.a(getApplicationContext()).a(this);
        this.f11191f = new y(this.f11188c, this, this.f11190e);
        this.g = (NotificationManager) this.f11188c.getSystemService("notification");
    }
}
