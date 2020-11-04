package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.firebase.c;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.firebase:firebase-iid@@20.2.0 */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    private final Context f11234a;
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    private String f11235b;
    @GuardedBy("this")

    /* renamed from: c  reason: collision with root package name */
    private String f11236c;
    @GuardedBy("this")

    /* renamed from: d  reason: collision with root package name */
    private int f11237d;
    @GuardedBy("this")

    /* renamed from: e  reason: collision with root package name */
    private int f11238e = 0;

    public q(Context context) {
        this.f11234a = context;
    }

    private final PackageInfo a(String str) {
        try {
            return this.f11234a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("Failed to find package ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    public static String b(c cVar) {
        String d2 = cVar.j().d();
        if (d2 != null) {
            return d2;
        }
        String c2 = cVar.j().c();
        if (!c2.startsWith("1:")) {
            return c2;
        }
        String[] split = c2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private final synchronized void h() {
        PackageInfo a2 = a(this.f11234a.getPackageName());
        if (a2 != null) {
            this.f11235b = Integer.toString(a2.versionCode);
            this.f11236c = a2.versionName;
        }
    }

    public final boolean c() {
        return d() != 0;
    }

    public final synchronized int d() {
        if (this.f11238e != 0) {
            return this.f11238e;
        }
        PackageManager packageManager = this.f11234a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!PlatformVersion.k()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f11238e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
            if (PlatformVersion.k()) {
                this.f11238e = 2;
            } else {
                this.f11238e = 1;
            }
            return this.f11238e;
        }
        this.f11238e = 2;
        return 2;
    }

    public final synchronized String e() {
        if (this.f11235b == null) {
            h();
        }
        return this.f11235b;
    }

    public final synchronized String f() {
        if (this.f11236c == null) {
            h();
        }
        return this.f11236c;
    }

    public final synchronized int g() {
        PackageInfo a2;
        if (this.f11237d == 0 && (a2 = a("com.google.android.gms")) != null) {
            this.f11237d = a2.versionCode;
        }
        return this.f11237d;
    }
}
