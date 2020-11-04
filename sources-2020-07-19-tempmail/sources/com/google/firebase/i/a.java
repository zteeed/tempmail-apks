package com.google.firebase.i;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.firebase.f.c;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.firebase:firebase-common@@19.3.0 */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f11137a;

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences f11138b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f11139c = new AtomicBoolean(c());

    public a(Context context, String str, c cVar) {
        this.f11137a = a(context);
        this.f11138b = context.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
    }

    private static Context a(Context context) {
        return (Build.VERSION.SDK_INT < 24 || androidx.core.content.a.j(context)) ? context : androidx.core.content.a.b(context);
    }

    private boolean c() {
        ApplicationInfo applicationInfo;
        if (this.f11138b.contains("firebase_data_collection_default_enabled")) {
            return this.f11138b.getBoolean("firebase_data_collection_default_enabled", true);
        }
        try {
            PackageManager packageManager = this.f11137a.getPackageManager();
            if (!(packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f11137a.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_data_collection_default_enabled"))) {
                return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return true;
    }

    public boolean b() {
        return this.f11139c.get();
    }
}
