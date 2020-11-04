package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzct {

    /* renamed from: a  reason: collision with root package name */
    private static volatile zzdi<Boolean> f9772a = zzdi.d();

    /* renamed from: b  reason: collision with root package name */
    private static final Object f9773b = new Object();

    private static boolean a(Context context) {
        try {
            if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static boolean b(Context context, Uri uri) {
        boolean z;
        String authority = uri.getAuthority();
        boolean z2 = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            StringBuilder sb = new StringBuilder(String.valueOf(authority).length() + 91);
            sb.append(authority);
            sb.append(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            Log.e("PhenotypeClientHelper", sb.toString());
            return false;
        } else if (f9772a.b()) {
            return f9772a.c().booleanValue();
        } else {
            synchronized (f9773b) {
                if (f9772a.b()) {
                    boolean booleanValue = f9772a.c().booleanValue();
                    return booleanValue;
                }
                if (!"com.google.android.gms".equals(context.getPackageName())) {
                    ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", 0);
                    if (resolveContentProvider == null || !"com.google.android.gms".equals(resolveContentProvider.packageName)) {
                        z = false;
                        if (z && a(context)) {
                            z2 = true;
                        }
                        f9772a = zzdi.a(Boolean.valueOf(z2));
                        return f9772a.c().booleanValue();
                    }
                }
                z = true;
                z2 = true;
                f9772a = zzdi.a(Boolean.valueOf(z2));
                return f9772a.c().booleanValue();
            }
        }
    }
}
