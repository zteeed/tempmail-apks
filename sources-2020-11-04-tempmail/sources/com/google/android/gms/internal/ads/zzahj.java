package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.view.View;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzahj {

    /* renamed from: a  reason: collision with root package name */
    private final Context f5888a;

    /* renamed from: b  reason: collision with root package name */
    private final zzeg f5889b;

    /* renamed from: c  reason: collision with root package name */
    private final View f5890c;

    public zzahj(Context context, zzeg zzeg, View view) {
        this.f5888a = context;
        this.f5889b = zzeg;
        this.f5890c = view;
    }

    private static Intent a(Intent intent, ResolveInfo resolveInfo) {
        Intent intent2 = new Intent(intent);
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent2.setClassName(activityInfo.packageName, activityInfo.name);
        return intent2;
    }

    @VisibleForTesting
    private final ResolveInfo b(Intent intent, ArrayList<ResolveInfo> arrayList) {
        ResolveInfo resolveInfo = null;
        try {
            PackageManager packageManager = this.f5888a.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 65536);
            if (queryIntentActivities != null && resolveActivity != null) {
                int i = 0;
                while (true) {
                    if (i >= queryIntentActivities.size()) {
                        break;
                    }
                    ResolveInfo resolveInfo2 = queryIntentActivities.get(i);
                    if (resolveActivity != null && resolveActivity.activityInfo.name.equals(resolveInfo2.activityInfo.name)) {
                        resolveInfo = resolveActivity;
                        break;
                    }
                    i++;
                }
            }
            arrayList.addAll(queryIntentActivities);
            return resolveInfo;
        } catch (Throwable th) {
            zzq.zzla().e(th, "OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent");
        }
    }

    @VisibleForTesting
    private final ResolveInfo c(Intent intent) {
        return b(intent, new ArrayList());
    }

    private static Intent e(Uri uri) {
        if (uri == null) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.setData(uri);
        intent.setAction("android.intent.action.VIEW");
        return intent;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00c4 A[ADDED_TO_REGION] */
    @com.google.android.gms.common.util.VisibleForTesting
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.Intent d(java.util.Map<java.lang.String, java.lang.String> r11) {
        /*
            r10 = this;
            android.content.Context r0 = r10.f5888a
            java.lang.String r1 = "activity"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            java.lang.String r1 = "u"
            java.lang.Object r1 = r11.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            r3 = 0
            if (r2 == 0) goto L_0x001a
            return r3
        L_0x001a:
            android.net.Uri r1 = android.net.Uri.parse(r1)
            android.content.Context r2 = r10.f5888a
            com.google.android.gms.internal.ads.zzeg r4 = r10.f5889b
            android.view.View r5 = r10.f5890c
            android.net.Uri r1 = com.google.android.gms.internal.ads.zzahg.b(r2, r4, r1, r5, r3)
            android.net.Uri r1 = com.google.android.gms.internal.ads.zzahg.f(r1)
            java.lang.String r2 = "use_first_package"
            java.lang.Object r2 = r11.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = java.lang.Boolean.parseBoolean(r2)
            java.lang.String r4 = "use_running_process"
            java.lang.Object r4 = r11.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
            java.lang.String r5 = "use_custom_tabs"
            java.lang.Object r11 = r11.get(r5)
            java.lang.String r11 = (java.lang.String) r11
            boolean r11 = java.lang.Boolean.parseBoolean(r11)
            r5 = 0
            if (r11 != 0) goto L_0x0068
            com.google.android.gms.internal.ads.zzaag<java.lang.Boolean> r11 = com.google.android.gms.internal.ads.zzaav.V1
            com.google.android.gms.internal.ads.zzaar r6 = com.google.android.gms.internal.ads.zzwg.e()
            java.lang.Object r11 = r6.c(r11)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x0066
            goto L_0x0068
        L_0x0066:
            r11 = 0
            goto L_0x0069
        L_0x0068:
            r11 = 1
        L_0x0069:
            java.lang.String r6 = r1.getScheme()
            java.lang.String r7 = "http"
            boolean r6 = r7.equalsIgnoreCase(r6)
            java.lang.String r8 = "https"
            if (r6 == 0) goto L_0x0084
            android.net.Uri$Builder r3 = r1.buildUpon()
            android.net.Uri$Builder r3 = r3.scheme(r8)
            android.net.Uri r3 = r3.build()
            goto L_0x009a
        L_0x0084:
            java.lang.String r6 = r1.getScheme()
            boolean r6 = r8.equalsIgnoreCase(r6)
            if (r6 == 0) goto L_0x009a
            android.net.Uri$Builder r3 = r1.buildUpon()
            android.net.Uri$Builder r3 = r3.scheme(r7)
            android.net.Uri r3 = r3.build()
        L_0x009a:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            android.content.Intent r1 = e(r1)
            android.content.Intent r3 = e(r3)
            if (r11 == 0) goto L_0x00b9
            com.google.android.gms.ads.internal.zzq.zzkw()
            android.content.Context r11 = r10.f5888a
            com.google.android.gms.internal.ads.zzaye.F(r11, r1)
            com.google.android.gms.ads.internal.zzq.zzkw()
            android.content.Context r11 = r10.f5888a
            com.google.android.gms.internal.ads.zzaye.F(r11, r3)
        L_0x00b9:
            android.content.pm.ResolveInfo r11 = r10.b(r1, r6)
            if (r11 == 0) goto L_0x00c4
            android.content.Intent r11 = a(r1, r11)
            return r11
        L_0x00c4:
            if (r3 == 0) goto L_0x00d7
            android.content.pm.ResolveInfo r11 = r10.c(r3)
            if (r11 == 0) goto L_0x00d7
            android.content.Intent r11 = a(r1, r11)
            android.content.pm.ResolveInfo r3 = r10.c(r11)
            if (r3 == 0) goto L_0x00d7
            return r11
        L_0x00d7:
            int r11 = r6.size()
            if (r11 != 0) goto L_0x00de
            return r1
        L_0x00de:
            if (r4 == 0) goto L_0x0118
            if (r0 == 0) goto L_0x0118
            java.util.List r11 = r0.getRunningAppProcesses()
            if (r11 == 0) goto L_0x0118
            int r0 = r6.size()
            r3 = 0
        L_0x00ed:
            if (r3 >= r0) goto L_0x0118
            java.lang.Object r4 = r6.get(r3)
            int r3 = r3 + 1
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            java.util.Iterator r7 = r11.iterator()
        L_0x00fb:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00ed
            java.lang.Object r8 = r7.next()
            android.app.ActivityManager$RunningAppProcessInfo r8 = (android.app.ActivityManager.RunningAppProcessInfo) r8
            java.lang.String r8 = r8.processName
            android.content.pm.ActivityInfo r9 = r4.activityInfo
            java.lang.String r9 = r9.packageName
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x00fb
            android.content.Intent r11 = a(r1, r4)
            return r11
        L_0x0118:
            if (r2 == 0) goto L_0x0125
            java.lang.Object r11 = r6.get(r5)
            android.content.pm.ResolveInfo r11 = (android.content.pm.ResolveInfo) r11
            android.content.Intent r11 = a(r1, r11)
            return r11
        L_0x0125:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahj.d(java.util.Map):android.content.Intent");
    }
}
