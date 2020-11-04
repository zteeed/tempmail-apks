package me.leolin.shortcutbadger.impl;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import java.util.Arrays;
import java.util.List;
import me.leolin.shortcutbadger.ShortcutBadgeException;
import me.leolin.shortcutbadger.a;

@Deprecated
public class XiaomiHomeBadger implements a {

    /* renamed from: a  reason: collision with root package name */
    private ResolveInfo f14243a;

    @TargetApi(16)
    private void c(Context context, int i) throws ShortcutBadgeException {
        if (this.f14243a == null) {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            this.f14243a = context.getPackageManager().resolveActivity(intent, 65536);
        }
        if (this.f14243a != null) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            Notification build = new Notification.Builder(context).setContentTitle("").setContentText("").setSmallIcon(this.f14243a.getIconResource()).build();
            try {
                Object obj = build.getClass().getDeclaredField("extraNotification").get(build);
                obj.getClass().getDeclaredMethod("setMessageCount", new Class[]{Integer.TYPE}).invoke(obj, new Object[]{Integer.valueOf(i)});
                notificationManager.notify(0, build);
            } catch (Exception e2) {
                throw new ShortcutBadgeException("not able to set badge", e2);
            }
        }
    }

    public List<String> a() {
        return Arrays.asList(new String[]{"com.miui.miuilite", "com.miui.home", "com.miui.miuihome", "com.miui.miuihome2", "com.miui.mihome", "com.miui.mihome2", "com.i.miui.launcher"});
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r2.set(r1, java.lang.Integer.valueOf(r7));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x002a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(android.content.Context r5, android.content.ComponentName r6, int r7) throws me.leolin.shortcutbadger.ShortcutBadgeException {
        /*
            r4 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "android.app.MiuiNotification"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Exception -> 0x0032 }
            java.lang.Object r1 = r1.newInstance()     // Catch:{ Exception -> 0x0032 }
            java.lang.Class r2 = r1.getClass()     // Catch:{ Exception -> 0x0032 }
            java.lang.String r3 = "messageCount"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch:{ Exception -> 0x0032 }
            r3 = 1
            r2.setAccessible(r3)     // Catch:{ Exception -> 0x0032 }
            if (r7 != 0) goto L_0x001e
            r3 = r0
            goto L_0x0022
        L_0x001e:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x002a }
        L_0x0022:
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x002a }
            r2.set(r1, r3)     // Catch:{ Exception -> 0x002a }
            goto L_0x0070
        L_0x002a:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x0032 }
            r2.set(r1, r3)     // Catch:{ Exception -> 0x0032 }
            goto L_0x0070
        L_0x0032:
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.APPLICATION_MESSAGE_UPDATE"
            r1.<init>(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r6.getPackageName()
            r2.append(r3)
            java.lang.String r3 = "/"
            r2.append(r3)
            java.lang.String r6 = r6.getClassName()
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            java.lang.String r2 = "android.intent.extra.update_application_component_name"
            r1.putExtra(r2, r6)
            if (r7 != 0) goto L_0x005e
            goto L_0x0062
        L_0x005e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
        L_0x0062:
            java.lang.String r6 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "android.intent.extra.update_application_message_text"
            r1.putExtra(r0, r6)
            me.leolin.shortcutbadger.c.a.c(r5, r1)     // Catch:{ ShortcutBadgeException -> 0x006f }
            goto L_0x0070
        L_0x006f:
        L_0x0070:
            java.lang.String r6 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "Xiaomi"
            boolean r6 = r6.equalsIgnoreCase(r0)
            if (r6 == 0) goto L_0x007d
            r4.c(r5, r7)
        L_0x007d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: me.leolin.shortcutbadger.impl.XiaomiHomeBadger.b(android.content.Context, android.content.ComponentName, int):void");
    }
}
