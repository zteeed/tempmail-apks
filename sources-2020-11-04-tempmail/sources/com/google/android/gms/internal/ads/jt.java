package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.LocaleList;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class jt implements zzdec<zzdef> {

    /* renamed from: a  reason: collision with root package name */
    private final zzdvi f4345a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f4346b;

    public jt(zzdvi zzdvi, Context context) {
        this.f4345a = zzdvi;
        this.f4346b = context;
    }

    private static ResolveInfo a(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    private static String c(Context context, PackageManager packageManager) {
        ActivityInfo activityInfo;
        ResolveInfo a2 = a(packageManager, "market://details?id=com.google.android.gms.ads");
        if (a2 == null || (activityInfo = a2.activityInfo) == null) {
            return null;
        }
        try {
            PackageInfo e2 = Wrappers.a(context).e(activityInfo.packageName, 0);
            if (e2 != null) {
                int i = e2.versionCode;
                String str = activityInfo.packageName;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                sb.append(i);
                sb.append(".");
                sb.append(str);
                return sb.toString();
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    private static String e(Context context) {
        try {
            PackageInfo e2 = Wrappers.a(context).e("com.android.vending", 128);
            if (e2 != null) {
                int i = e2.versionCode;
                String str = e2.packageName;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                sb.append(i);
                sb.append(".");
                sb.append(str);
                return sb.toString();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final zzdvf<zzdef> b() {
        return this.f4345a.f(new it(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdef d() throws Exception {
        boolean z;
        PackageManager packageManager = this.f4346b.getPackageManager();
        Locale locale = Locale.getDefault();
        boolean z2 = a(packageManager, "geo:0,0?q=donuts") != null;
        boolean z3 = a(packageManager, "http://www.google.com") != null;
        String country = locale.getCountry();
        boolean startsWith = Build.DEVICE.startsWith("generic");
        boolean a2 = DeviceProperties.a(this.f4346b);
        boolean b2 = DeviceProperties.b(this.f4346b);
        String language = locale.getLanguage();
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            LocaleList localeList = LocaleList.getDefault();
            for (int i = 0; i < localeList.size(); i++) {
                arrayList.add(localeList.get(i).getLanguage());
            }
        }
        String c2 = c(this.f4346b, packageManager);
        String e2 = e(this.f4346b);
        String str = Build.FINGERPRINT;
        Context context = this.f4346b;
        if (packageManager != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (queryIntentActivities != null && resolveActivity != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= queryIntentActivities.size()) {
                        break;
                    } else if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i2).activityInfo.name)) {
                        z = resolveActivity.activityInfo.packageName.equals(zzell.a(context));
                        break;
                    } else {
                        i2++;
                    }
                }
                return new zzdef(z2, z3, country, startsWith, a2, b2, language, arrayList, c2, e2, str, z, Build.MODEL, zzq.zzky().u());
            }
        }
        z = false;
        return new zzdef(z2, z3, country, startsWith, a2, b2, language, arrayList, c2, e2, str, z, Build.MODEL, zzq.zzky().u());
    }
}
