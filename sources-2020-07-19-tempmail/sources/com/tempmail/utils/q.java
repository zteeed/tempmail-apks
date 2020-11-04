package com.tempmail.utils;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import androidx.core.app.g;
import androidx.core.app.l;
import com.google.firebase.remoteconfig.f;
import com.tempmail.R;
import com.tempmail.utils.y.b;
import java.util.Date;

/* compiled from: NotificationUtils */
public class q {

    /* renamed from: a  reason: collision with root package name */
    private static final String f12587a = "q";

    /* renamed from: b  reason: collision with root package name */
    public static final Uri f12588b = RingtoneManager.getDefaultUri(2);

    public static void a(Context context, int i) {
        ((NotificationManager) context.getSystemService("notification")).cancel(i);
    }

    public static void b(Context context, long j, String str) {
        int h = (int) f.f().h(context.getString(R.string.remote_config_expire_soon_notification));
        String str2 = f12587a;
        m.b(str2, "expireSoonTime " + h);
        if (h > 0) {
            long j2 = j - (((long) h) * 60000);
            m.b(f12587a, new Date(j2).toString());
            c cVar = new c(context);
            long j3 = j;
            cVar.c(true, j2, c.f12565d, j3);
            cVar.c(true, j, c.f12566e, j3);
        }
    }

    public static void c(Context context, Uri uri, String str, String str2, String str3) {
        g.d dVar = new g.d(context, context.getString(R.string.others_channel));
        dVar.u(R.drawable.ic_baseline_cloud_download_24px);
        dVar.k(str);
        dVar.j(str2);
        dVar.f(true);
        dVar.v(f12588b);
        g.c cVar = new g.c();
        cVar.g(str2);
        dVar.w(cVar);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(uri, str3);
        intent.addFlags(268435456);
        intent.addFlags(1);
        l j = l.j(context);
        j.c(intent);
        dVar.i(j.l(0, 134217728));
        ((NotificationManager) context.getSystemService("notification")).notify((int) System.currentTimeMillis(), dVar.b());
    }

    public static void d(Context context, int i, String str, String str2) {
        g.d dVar = new g.d(context, context.getString(R.string.others_channel));
        dVar.u(R.drawable.ic_baseline_notification_important_24px);
        dVar.k(str);
        dVar.j(str2);
        dVar.f(true);
        dVar.v(f12588b);
        g.c cVar = new g.c();
        cVar.g(str2);
        dVar.w(cVar);
        Intent intent = new Intent(context, e.o(context, ".MainActivity"));
        l j = l.j(context);
        j.c(intent);
        dVar.i(j.l(0, 134217728));
        ((NotificationManager) context.getSystemService("notification")).notify(i, dVar.b());
    }

    public static void e(Context context, Uri uri, String str, String str2) {
        g.d dVar = new g.d(context, context.getString(R.string.others_channel));
        dVar.u(R.drawable.ic_baseline_cloud_download_24px);
        dVar.k(str);
        dVar.j(str2);
        dVar.f(false);
        dVar.v(f12588b);
        g.c cVar = new g.c();
        cVar.g(str2);
        dVar.w(cVar);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(uri, "message/rfc822");
        intent.addFlags(268435456);
        intent.addFlags(1);
        l j = l.j(context);
        j.c(intent);
        dVar.i(j.l(0, 134217728));
        ((NotificationManager) context.getSystemService("notification")).notify(b.f12598e.intValue(), dVar.b());
    }

    public static void f(Context context) {
        if (s.w(context).booleanValue()) {
            g(context, context.getString(R.string.new_mail));
        }
    }

    public static void g(Context context, String str) {
        g.d dVar = new g.d(context, context.getString(R.string.mail_channel));
        dVar.u(R.drawable.ic_email_black_24dp);
        dVar.k(context.getString(R.string.app_name));
        dVar.j(str);
        dVar.f(true);
        dVar.v(f12588b);
        g.c cVar = new g.c();
        cVar.g(str);
        dVar.w(cVar);
        Intent intent = new Intent(context, e.o(context, ".MainActivity"));
        l j = l.j(context);
        j.c(intent);
        dVar.i(j.l(0, 134217728));
        ((NotificationManager) context.getSystemService("notification")).notify(b.f12597d.intValue(), dVar.b());
    }

    public static void h(Context context, String str, String str2, String str3) {
        g.d dVar = new g.d(context, context.getString(R.string.others_channel));
        dVar.u(R.mipmap.ic_launcher);
        dVar.k(str);
        dVar.j(str2);
        dVar.f(true);
        dVar.v(f12588b);
        g.c cVar = new g.c();
        cVar.g(str2);
        dVar.w(cVar);
        dVar.i(PendingIntent.getActivity(context, 0, new Intent("android.intent.action.VIEW", Uri.parse(str3)), 0));
        ((NotificationManager) context.getSystemService("notification")).notify(b.f12598e.intValue(), dVar.b());
    }
}
