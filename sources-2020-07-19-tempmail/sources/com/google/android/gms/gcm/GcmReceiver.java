package com.google.android.gms.gcm;

import a.l.a.a;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.iid.zzk;

@Deprecated
public class GcmReceiver extends a {

    /* renamed from: c  reason: collision with root package name */
    private static zzk f3214c;

    /* renamed from: d  reason: collision with root package name */
    private static zzk f3215d;

    private final int d(Context context, Intent intent) {
        if (Log.isLoggable("GcmReceiver", 3)) {
            Log.d("GcmReceiver", "Binding to service");
        }
        if (isOrderedBroadcast()) {
            setResultCode(-1);
        }
        e(context, intent.getAction()).a(intent, goAsync());
        return -1;
    }

    private final synchronized zzk e(Context context, String str) {
        if ("com.google.android.c2dm.intent.RECEIVE".equals(str)) {
            if (f3215d == null) {
                f3215d = new zzk(context, str);
            }
            return f3215d;
        }
        if (f3214c == null) {
            f3214c = new zzk(context, str);
        }
        return f3214c;
    }

    private static int f(Context context, Intent intent) {
        ComponentName componentName;
        ServiceInfo serviceInfo;
        String str;
        if (Log.isLoggable("GcmReceiver", 3)) {
            Log.d("GcmReceiver", "Starting service");
        }
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveService == null || (serviceInfo = resolveService.serviceInfo) == null) {
            Log.e("GcmReceiver", "Failed to resolve target intent service, skipping classname enforcement");
        } else if (!context.getPackageName().equals(serviceInfo.packageName) || (str = serviceInfo.name) == null) {
            String str2 = serviceInfo.packageName;
            String str3 = serviceInfo.name;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 94 + String.valueOf(str3).length());
            sb.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
            sb.append(str2);
            sb.append("/");
            sb.append(str3);
            Log.e("GcmReceiver", sb.toString());
        } else {
            if (str.startsWith(".")) {
                String valueOf = String.valueOf(context.getPackageName());
                String valueOf2 = String.valueOf(str);
                str = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
            }
            if (Log.isLoggable("GcmReceiver", 3)) {
                String valueOf3 = String.valueOf(str);
                Log.d("GcmReceiver", valueOf3.length() != 0 ? "Restricting intent to a specific service: ".concat(valueOf3) : new String("Restricting intent to a specific service: "));
            }
            intent.setClassName(context.getPackageName(), str);
        }
        try {
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                componentName = a.c(context, intent);
            } else {
                componentName = context.startService(intent);
                Log.d("GcmReceiver", "Missing wake lock permission, service start may be delayed");
            }
            if (componentName != null) {
                return -1;
            }
            Log.e("GcmReceiver", "Error while delivering the message: ServiceIntent not found.");
            return 404;
        } catch (SecurityException e2) {
            Log.e("GcmReceiver", "Error while delivering the message to the serviceIntent", e2);
            return 401;
        } catch (IllegalStateException e3) {
            String valueOf4 = String.valueOf(e3);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf4).length() + 45);
            sb2.append("Failed to start service while in background: ");
            sb2.append(valueOf4);
            Log.e("GcmReceiver", sb2.toString());
            return 402;
        }
    }

    public void onReceive(Context context, Intent intent) {
        int i;
        int i2;
        if (Log.isLoggable("GcmReceiver", 3)) {
            Log.d("GcmReceiver", "received new intent");
        }
        intent.setComponent((ComponentName) null);
        intent.setPackage(context.getPackageName());
        if (Build.VERSION.SDK_INT <= 18) {
            intent.removeCategory(context.getPackageName());
        }
        if ("google.com/iid".equals(intent.getStringExtra("from"))) {
            intent.setAction("com.google.android.gms.iid.InstanceID");
        }
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        boolean z = false;
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        if (isOrderedBroadcast()) {
            setResultCode(500);
        }
        boolean z2 = PlatformVersion.k() && context.getApplicationInfo().targetSdkVersion >= 26;
        if ((intent.getFlags() & 268435456) != 0) {
            z = true;
        }
        if (!z2 || z) {
            if ("com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction())) {
                i2 = f(context, intent);
            } else {
                i2 = f(context, intent);
            }
            if (!PlatformVersion.k() || i2 != 402) {
                i = i2;
            } else {
                d(context, intent);
                i = 403;
            }
        } else {
            i = d(context, intent);
        }
        if (isOrderedBroadcast()) {
            setResultCode(i);
        }
    }
}
