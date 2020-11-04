package com.tempmail;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import androidx.appcompat.app.g;
import b.b.h;
import b.b.i;
import com.tempmail.billing.BillingClientLifecycle;
import com.tempmail.utils.e;
import com.tempmail.utils.l;
import com.tempmail.utils.m;
import com.tempmail.utils.o;
import com.tempmail.utils.s;
import io.reactivex.exceptions.UndeliverableException;
import java.io.IOException;
import java.net.SocketException;
import java.util.Map;

public class ApplicationClass extends Application {
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final String f12814c = ApplicationClass.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    boolean f12815b = false;

    class a implements h {
        a(ApplicationClass applicationClass) {
        }

        public void a(Map<String, String> map) {
            m.b(ApplicationClass.f12814c, "onInstallConversionDataLoaded ");
            for (Map.Entry next : map.entrySet()) {
                String a2 = ApplicationClass.f12814c;
                m.b(a2, "onInstallConversionDataLoaded entry " + ((String) next.getKey()) + " value " + ((String) next.getValue()));
            }
        }

        public void b(Map<String, String> map) {
            m.b(ApplicationClass.f12814c, "onAppOpenAttribution");
            for (Map.Entry next : map.entrySet()) {
                String a2 = ApplicationClass.f12814c;
                m.b(a2, "onInstallConversionDataLoaded entry " + ((String) next.getKey()) + " value " + ((String) next.getValue()));
            }
        }

        public void c(String str) {
            String a2 = ApplicationClass.f12814c;
            m.b(a2, "onAttributionFailure " + str);
        }

        public void d(String str) {
            String a2 = ApplicationClass.f12814c;
            m.b(a2, "onInstallConversionFailure " + str);
        }
    }

    static {
        Class<ApplicationClass> cls = ApplicationClass.class;
    }

    private void b() {
        if (Build.VERSION.SDK_INT >= 26) {
            String string = getString(R.string.foreground_channel_name);
            String string2 = getString(R.string.foreground_channel_description);
            String string3 = getString(R.string.foreground_channel);
            String str = f12814c;
            m.b(str, "foreground_channel " + string3);
            NotificationChannel notificationChannel = new NotificationChannel(string3, string, 3);
            notificationChannel.setDescription(string2);
            notificationChannel.setSound((Uri) null, (AudioAttributes) null);
            ((NotificationManager) getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
        }
    }

    private void c() {
        if (Build.VERSION.SDK_INT >= 26) {
            String string = getString(R.string.notification_channel_name);
            String string2 = getString(R.string.notification_channel_description);
            String string3 = getString(R.string.mail_channel);
            String str = f12814c;
            m.b(str, "mail channel " + string3);
            NotificationChannel notificationChannel = new NotificationChannel(string3, string, 4);
            notificationChannel.setDescription(string2);
            ((NotificationManager) getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
        }
    }

    private void d() {
        if (Build.VERSION.SDK_INT >= 26) {
            String string = getString(R.string.notification_other_channel_name);
            String string2 = getString(R.string.notification_other_channel_description);
            String string3 = getString(R.string.others_channel);
            String str = f12814c;
            m.b(str, "other channel " + string3);
            NotificationChannel notificationChannel = new NotificationChannel(string3, string, 3);
            notificationChannel.setDescription(string2);
            ((NotificationManager) getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
        }
    }

    static /* synthetic */ void h(Throwable th) throws Exception {
        if (th instanceof UndeliverableException) {
            th = th.getCause();
        }
        if ((th instanceof IOException) || (th instanceof SocketException) || (th instanceof InterruptedException)) {
        }
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        String a2 = Build.VERSION.SDK_INT >= 21 ? l.a(context) : null;
        if (a2 != null) {
            try {
                super.attachBaseContext(o.e(context, a2).getBaseContext());
            } catch (Exception e2) {
                e2.printStackTrace();
                super.attachBaseContext(context);
            }
        } else {
            super.attachBaseContext(context);
        }
        a.o.a.l(this);
    }

    public void e() {
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) getSystemService(NotificationManager.class)).deleteNotificationChannel(getString(R.string.mail_channel_old));
        }
    }

    public BillingClientLifecycle f() {
        return BillingClientLifecycle.n(this);
    }

    public boolean g() {
        return this.f12815b;
    }

    public void i(boolean z) {
        this.f12815b = z;
    }

    public void j() {
        i.e().h("rouWPmoS2cwA4C2GrofpEb", new a(this), getApplicationContext());
        i.e().k(this);
    }

    public void onCreate() {
        super.onCreate();
        e.c0(this);
        e.b0(this);
        b();
        c();
        d();
        e();
        b.d.a.a.a(this);
        if (!e.Q()) {
            j();
        }
        Boolean S = s.S(this);
        if (S != null && S.booleanValue()) {
            g.z(2);
        }
        d.a.d0.a.A(a.f12819b);
        androidx.lifecycle.s.j().c().a(f());
    }
}
