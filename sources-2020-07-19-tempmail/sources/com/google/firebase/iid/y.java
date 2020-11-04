package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.firebase:firebase-iid@@20.2.0 */
public final class y {

    /* renamed from: e  reason: collision with root package name */
    private static y f11260e;
    @GuardedBy("this")

    /* renamed from: a  reason: collision with root package name */
    private String f11261a = null;

    /* renamed from: b  reason: collision with root package name */
    private Boolean f11262b = null;

    /* renamed from: c  reason: collision with root package name */
    private Boolean f11263c = null;

    /* renamed from: d  reason: collision with root package name */
    private final Queue<Intent> f11264d = new ArrayDeque();

    private y() {
    }

    public static synchronized y b() {
        y yVar;
        synchronized (y.class) {
            if (f11260e == null) {
                f11260e = new y();
            }
            yVar = f11260e;
        }
        return yVar;
    }

    private final int d(Context context, Intent intent) {
        ComponentName componentName;
        String g = g(context, intent);
        if (g != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(g);
                Log.d("FirebaseInstanceId", valueOf.length() != 0 ? "Restricting intent to a specific service: ".concat(valueOf) : new String("Restricting intent to a specific service: "));
            }
            intent.setClassName(context.getPackageName(), g);
        }
        try {
            if (c(context)) {
                componentName = g0.a(context, intent);
            } else {
                componentName = context.startService(intent);
                Log.d("FirebaseInstanceId", "Missing wake lock permission, service start may be delayed");
            }
            if (componentName != null) {
                return -1;
            }
            Log.e("FirebaseInstanceId", "Error while delivering the message: ServiceIntent not found.");
            return 404;
        } catch (SecurityException e2) {
            Log.e("FirebaseInstanceId", "Error while delivering the message to the serviceIntent", e2);
            return 401;
        } catch (IllegalStateException e3) {
            String valueOf2 = String.valueOf(e3);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 45);
            sb.append("Failed to start service while in background: ");
            sb.append(valueOf2);
            Log.e("FirebaseInstanceId", sb.toString());
            return 402;
        }
    }

    private final synchronized String g(Context context, Intent intent) {
        if (this.f11261a != null) {
            return this.f11261a;
        }
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveService != null) {
            if (resolveService.serviceInfo != null) {
                ServiceInfo serviceInfo = resolveService.serviceInfo;
                if (context.getPackageName().equals(serviceInfo.packageName)) {
                    if (serviceInfo.name != null) {
                        if (serviceInfo.name.startsWith(".")) {
                            String valueOf = String.valueOf(context.getPackageName());
                            String valueOf2 = String.valueOf(serviceInfo.name);
                            this.f11261a = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                        } else {
                            this.f11261a = serviceInfo.name;
                        }
                        return this.f11261a;
                    }
                }
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 94 + String.valueOf(str2).length());
                sb.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
                sb.append(str);
                sb.append("/");
                sb.append(str2);
                Log.e("FirebaseInstanceId", sb.toString());
                return null;
            }
        }
        Log.e("FirebaseInstanceId", "Failed to resolve target intent service, skipping classname enforcement");
        return null;
    }

    public final int a(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Starting service");
        }
        this.f11264d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return d(context, intent2);
    }

    /* access modifiers changed from: package-private */
    public final boolean c(Context context) {
        if (this.f11262b == null) {
            this.f11262b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f11262b.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f11262b.booleanValue();
    }

    public final Intent e() {
        return this.f11264d.poll();
    }

    /* access modifiers changed from: package-private */
    public final boolean f(Context context) {
        if (this.f11263c == null) {
            this.f11263c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f11262b.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f11263c.booleanValue();
    }
}
