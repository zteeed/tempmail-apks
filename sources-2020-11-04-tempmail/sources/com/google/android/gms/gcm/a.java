package com.google.android.gms.gcm;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;

final class a {

    /* renamed from: d  reason: collision with root package name */
    static a f3427d;

    /* renamed from: a  reason: collision with root package name */
    private final Context f3428a;

    /* renamed from: b  reason: collision with root package name */
    private String f3429b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicInteger f3430c = new AtomicInteger((int) SystemClock.elapsedRealtime());

    private a(Context context) {
        this.f3428a = context.getApplicationContext();
    }

    static synchronized a a(Context context) {
        a aVar;
        synchronized (a.class) {
            if (f3427d == null) {
                f3427d = new a(context);
            }
            aVar = f3427d;
        }
        return aVar;
    }

    static String b(Bundle bundle, String str) {
        String string = bundle.getString(str);
        return string == null ? bundle.getString(str.replace("gcm.n.", "gcm.notification.")) : string;
    }

    private final String c(Bundle bundle, String str) {
        Bundle bundle2 = bundle;
        String b2 = b(bundle, str);
        if (!TextUtils.isEmpty(b2)) {
            return b2;
        }
        String valueOf = String.valueOf(str);
        String b3 = b(bundle2, "_loc_key".length() != 0 ? valueOf.concat("_loc_key") : new String(valueOf));
        if (TextUtils.isEmpty(b3)) {
            return null;
        }
        Resources resources = this.f3428a.getResources();
        int identifier = resources.getIdentifier(b3, "string", this.f3428a.getPackageName());
        if (identifier == 0) {
            String valueOf2 = String.valueOf(str);
            String substring = ("_loc_key".length() != 0 ? valueOf2.concat("_loc_key") : new String(valueOf2)).substring(6);
            StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 49 + String.valueOf(b3).length());
            sb.append(substring);
            sb.append(" resource not found: ");
            sb.append(b3);
            sb.append(" Default value will be used.");
            Log.w("GcmNotification", sb.toString());
            return null;
        }
        String valueOf3 = String.valueOf(str);
        String b4 = b(bundle2, "_loc_args".length() != 0 ? valueOf3.concat("_loc_args") : new String(valueOf3));
        if (TextUtils.isEmpty(b4)) {
            return resources.getString(identifier);
        }
        try {
            JSONArray jSONArray = new JSONArray(b4);
            int length = jSONArray.length();
            Object[] objArr = new String[length];
            for (int i = 0; i < length; i++) {
                objArr[i] = jSONArray.opt(i);
            }
            return resources.getString(identifier, objArr);
        } catch (JSONException unused) {
            String valueOf4 = String.valueOf(str);
            String substring2 = ("_loc_args".length() != 0 ? valueOf4.concat("_loc_args") : new String(valueOf4)).substring(6);
            StringBuilder sb2 = new StringBuilder(String.valueOf(substring2).length() + 41 + String.valueOf(b4).length());
            sb2.append("Malformed ");
            sb2.append(substring2);
            sb2.append(": ");
            sb2.append(b4);
            sb2.append("  Default value will be used.");
            Log.w("GcmNotification", sb2.toString());
            return null;
        } catch (MissingFormatArgumentException e2) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(b3).length() + 58 + String.valueOf(b4).length());
            sb3.append("Missing format argument for ");
            sb3.append(b3);
            sb3.append(": ");
            sb3.append(b4);
            sb3.append(" Default value will be used.");
            Log.w("GcmNotification", sb3.toString(), e2);
            return null;
        }
    }

    private final Bundle e() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            applicationInfo = this.f3428a.getPackageManager().getApplicationInfo(this.f3428a.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException unused) {
            applicationInfo = null;
        }
        if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
            return Bundle.EMPTY;
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x027a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(android.os.Bundle r14) {
        /*
            r13 = this;
            java.lang.String r0 = "gcm.n.title"
            java.lang.String r0 = r13.c(r14, r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x001c
            android.content.Context r0 = r13.f3428a
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            android.content.Context r1 = r13.f3428a
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.CharSequence r0 = r0.loadLabel(r1)
        L_0x001c:
            java.lang.String r1 = "gcm.n.body"
            java.lang.String r1 = r13.c(r14, r1)
            java.lang.String r2 = "gcm.n.icon"
            java.lang.String r2 = b(r14, r2)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            java.lang.String r4 = "GcmNotification"
            if (r3 != 0) goto L_0x0077
            android.content.Context r3 = r13.f3428a
            android.content.res.Resources r3 = r3.getResources()
            android.content.Context r5 = r13.f3428a
            java.lang.String r5 = r5.getPackageName()
            java.lang.String r6 = "drawable"
            int r5 = r3.getIdentifier(r2, r6, r5)
            if (r5 == 0) goto L_0x0045
            goto L_0x0089
        L_0x0045:
            android.content.Context r5 = r13.f3428a
            java.lang.String r5 = r5.getPackageName()
            java.lang.String r6 = "mipmap"
            int r5 = r3.getIdentifier(r2, r6, r5)
            if (r5 == 0) goto L_0x0054
            goto L_0x0089
        L_0x0054:
            java.lang.String r3 = java.lang.String.valueOf(r2)
            int r3 = r3.length()
            int r3 = r3 + 57
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r3)
            java.lang.String r3 = "Icon resource "
            r5.append(r3)
            r5.append(r2)
            java.lang.String r2 = " not found. Notification will use app icon."
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            android.util.Log.w(r4, r2)
        L_0x0077:
            android.content.Context r2 = r13.f3428a
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()
            int r2 = r2.icon
            if (r2 != 0) goto L_0x0088
            r2 = 17301651(0x1080093, float:2.4979667E-38)
            r5 = 17301651(0x1080093, float:2.4979667E-38)
            goto L_0x0089
        L_0x0088:
            r5 = r2
        L_0x0089:
            java.lang.String r2 = "gcm.n.color"
            java.lang.String r2 = b(r14, r2)
            java.lang.String r3 = "gcm.n.sound2"
            java.lang.String r3 = b(r14, r3)
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            r7 = 0
            if (r6 == 0) goto L_0x009e
            r3 = r7
            goto L_0x00f6
        L_0x009e:
            java.lang.String r6 = "default"
            boolean r6 = r6.equals(r3)
            if (r6 != 0) goto L_0x00f1
            android.content.Context r6 = r13.f3428a
            android.content.res.Resources r6 = r6.getResources()
            android.content.Context r8 = r13.f3428a
            java.lang.String r8 = r8.getPackageName()
            java.lang.String r9 = "raw"
            int r6 = r6.getIdentifier(r3, r9, r8)
            if (r6 == 0) goto L_0x00f1
            android.content.Context r6 = r13.f3428a
            java.lang.String r6 = r6.getPackageName()
            java.lang.String r8 = java.lang.String.valueOf(r6)
            int r8 = r8.length()
            int r8 = r8 + 24
            java.lang.String r9 = java.lang.String.valueOf(r3)
            int r9 = r9.length()
            int r8 = r8 + r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r8)
            java.lang.String r8 = "android.resource://"
            r9.append(r8)
            r9.append(r6)
            java.lang.String r6 = "/raw/"
            r9.append(r6)
            r9.append(r3)
            java.lang.String r3 = r9.toString()
            android.net.Uri r3 = android.net.Uri.parse(r3)
            goto L_0x00f6
        L_0x00f1:
            r3 = 2
            android.net.Uri r3 = android.media.RingtoneManager.getDefaultUri(r3)
        L_0x00f6:
            java.lang.String r6 = "gcm.n.click_action"
            java.lang.String r6 = b(r14, r6)
            boolean r8 = android.text.TextUtils.isEmpty(r6)
            if (r8 != 0) goto L_0x0116
            android.content.Intent r8 = new android.content.Intent
            r8.<init>(r6)
            android.content.Context r6 = r13.f3428a
            java.lang.String r6 = r6.getPackageName()
            r8.setPackage(r6)
            r6 = 268435456(0x10000000, float:2.5243549E-29)
            r8.setFlags(r6)
            goto L_0x012f
        L_0x0116:
            android.content.Context r6 = r13.f3428a
            android.content.pm.PackageManager r6 = r6.getPackageManager()
            android.content.Context r8 = r13.f3428a
            java.lang.String r8 = r8.getPackageName()
            android.content.Intent r8 = r6.getLaunchIntentForPackage(r8)
            if (r8 != 0) goto L_0x012f
            java.lang.String r6 = "No activity found to launch app"
            android.util.Log.w(r4, r6)
            r6 = r7
            goto L_0x0170
        L_0x012f:
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>(r14)
            com.google.android.gms.gcm.GcmListenerService.g(r6)
            r8.putExtras(r6)
            java.util.Set r6 = r6.keySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x0142:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x0162
            java.lang.Object r9 = r6.next()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r10 = "gcm.n."
            boolean r10 = r9.startsWith(r10)
            if (r10 != 0) goto L_0x015e
            java.lang.String r10 = "gcm.notification."
            boolean r10 = r9.startsWith(r10)
            if (r10 == 0) goto L_0x0142
        L_0x015e:
            r8.removeExtra(r9)
            goto L_0x0142
        L_0x0162:
            android.content.Context r6 = r13.f3428a
            java.util.concurrent.atomic.AtomicInteger r9 = r13.f3430c
            int r9 = r9.getAndIncrement()
            r10 = 1073741824(0x40000000, float:2.0)
            android.app.PendingIntent r6 = android.app.PendingIntent.getActivity(r6, r9, r8, r10)
        L_0x0170:
            java.lang.String r8 = "gcm.n.android_channel_id"
            java.lang.String r8 = b(r14, r8)
            boolean r9 = com.google.android.gms.common.util.PlatformVersion.k()
            r10 = 3
            java.lang.String r11 = "fcm_fallback_notification_channel"
            if (r9 == 0) goto L_0x020e
            android.content.Context r9 = r13.f3428a
            android.content.pm.ApplicationInfo r9 = r9.getApplicationInfo()
            int r9 = r9.targetSdkVersion
            r12 = 26
            if (r9 >= r12) goto L_0x018d
            goto L_0x020e
        L_0x018d:
            android.content.Context r7 = r13.f3428a
            java.lang.Class<android.app.NotificationManager> r9 = android.app.NotificationManager.class
            java.lang.Object r7 = r7.getSystemService(r9)
            android.app.NotificationManager r7 = (android.app.NotificationManager) r7
            boolean r9 = android.text.TextUtils.isEmpty(r8)
            if (r9 != 0) goto L_0x01c7
            android.app.NotificationChannel r9 = r7.getNotificationChannel(r8)
            if (r9 == 0) goto L_0x01a4
            goto L_0x01cb
        L_0x01a4:
            java.lang.String r9 = java.lang.String.valueOf(r8)
            int r9 = r9.length()
            int r9 = r9 + 122
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r9)
            java.lang.String r9 = "Notification Channel requested ("
            r12.append(r9)
            r12.append(r8)
            java.lang.String r8 = ") has not been created by the app. Manifest configuration, or default, value will be used."
            r12.append(r8)
            java.lang.String r8 = r12.toString()
            android.util.Log.w(r4, r8)
        L_0x01c7:
            java.lang.String r8 = r13.f3429b
            if (r8 == 0) goto L_0x01cd
        L_0x01cb:
            r7 = r8
            goto L_0x020e
        L_0x01cd:
            android.os.Bundle r8 = r13.e()
            java.lang.String r9 = "com.google.android.gms.gcm.default_notification_channel_id"
            java.lang.String r8 = r8.getString(r9)
            r13.f3429b = r8
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L_0x01f0
            java.lang.String r8 = r13.f3429b
            android.app.NotificationChannel r8 = r7.getNotificationChannel(r8)
            if (r8 == 0) goto L_0x01ea
            java.lang.String r7 = r13.f3429b
            goto L_0x020e
        L_0x01ea:
            java.lang.String r8 = "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used."
            android.util.Log.w(r4, r8)
            goto L_0x01f5
        L_0x01f0:
            java.lang.String r8 = "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used."
            android.util.Log.w(r4, r8)
        L_0x01f5:
            android.app.NotificationChannel r8 = r7.getNotificationChannel(r11)
            if (r8 != 0) goto L_0x020b
            android.app.NotificationChannel r8 = new android.app.NotificationChannel
            android.content.Context r9 = r13.f3428a
            int r12 = com.google.android.gms.gcm.R.string.gcm_fallback_notification_channel_label
            java.lang.String r9 = r9.getString(r12)
            r8.<init>(r11, r9, r10)
            r7.createNotificationChannel(r8)
        L_0x020b:
            r13.f3429b = r11
            r7 = r11
        L_0x020e:
            androidx.core.app.g$d r8 = new androidx.core.app.g$d
            android.content.Context r9 = r13.f3428a
            r8.<init>(r9)
            r9 = 1
            r8.f(r9)
            r8.u(r5)
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 != 0) goto L_0x0225
            r8.k(r0)
        L_0x0225:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0239
            r8.j(r1)
            androidx.core.app.g$c r0 = new androidx.core.app.g$c
            r0.<init>()
            r0.g(r1)
            r8.w(r0)
        L_0x0239:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0246
            int r0 = android.graphics.Color.parseColor(r2)
            r8.h(r0)
        L_0x0246:
            if (r3 == 0) goto L_0x024b
            r8.v(r3)
        L_0x024b:
            if (r6 == 0) goto L_0x0250
            r8.i(r6)
        L_0x0250:
            if (r7 == 0) goto L_0x0255
            r8.g(r7)
        L_0x0255:
            android.app.Notification r0 = r8.b()
            java.lang.String r1 = "gcm.n.tag"
            java.lang.String r14 = b(r14, r1)
            boolean r1 = android.util.Log.isLoggable(r4, r10)
            if (r1 == 0) goto L_0x026a
            java.lang.String r1 = "Showing notification"
            android.util.Log.d(r4, r1)
        L_0x026a:
            android.content.Context r1 = r13.f3428a
            java.lang.String r2 = "notification"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.app.NotificationManager r1 = (android.app.NotificationManager) r1
            boolean r2 = android.text.TextUtils.isEmpty(r14)
            if (r2 == 0) goto L_0x0291
            long r2 = android.os.SystemClock.uptimeMillis()
            r14 = 37
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r14)
            java.lang.String r14 = "GCM-Notification:"
            r4.append(r14)
            r4.append(r2)
            java.lang.String r14 = r4.toString()
        L_0x0291:
            r2 = 0
            r1.notify(r14, r2, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.gcm.a.d(android.os.Bundle):boolean");
    }
}
