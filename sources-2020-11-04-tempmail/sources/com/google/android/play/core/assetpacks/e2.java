package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.internal.a;

final class e2 {

    /* renamed from: c  reason: collision with root package name */
    private static final a f11235c = new a("PackageStateCache");

    /* renamed from: a  reason: collision with root package name */
    private final Context f11236a;

    /* renamed from: b  reason: collision with root package name */
    private int f11237b = -1;

    e2(Context context) {
        this.f11236a = context;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:5|6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int a() {
        /*
            r3 = this;
            monitor-enter(r3)
            int r0 = r3.f11237b     // Catch:{ all -> 0x0029 }
            r1 = -1
            if (r0 != r1) goto L_0x0025
            r0 = 0
            android.content.Context r1 = r3.f11236a     // Catch:{ NameNotFoundException -> 0x001c }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ NameNotFoundException -> 0x001c }
            android.content.Context r2 = r3.f11236a     // Catch:{ NameNotFoundException -> 0x001c }
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ NameNotFoundException -> 0x001c }
            android.content.pm.PackageInfo r1 = r2.getPackageInfo(r1, r0)     // Catch:{ NameNotFoundException -> 0x001c }
            int r1 = r1.versionCode     // Catch:{ NameNotFoundException -> 0x001c }
            r3.f11237b = r1     // Catch:{ NameNotFoundException -> 0x001c }
            goto L_0x0025
        L_0x001c:
            com.google.android.play.core.internal.a r1 = f11235c     // Catch:{ all -> 0x0029 }
            java.lang.String r2 = "The current version of the app could not be retrieved"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0029 }
            r1.e(r2, r0)     // Catch:{ all -> 0x0029 }
        L_0x0025:
            int r0 = r3.f11237b     // Catch:{ all -> 0x0029 }
            monitor-exit(r3)
            return r0
        L_0x0029:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.e2.a():int");
    }
}