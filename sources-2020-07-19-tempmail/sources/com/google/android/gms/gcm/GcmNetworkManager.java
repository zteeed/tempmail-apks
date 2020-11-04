package com.google.android.gms.gcm;

import a.e.a;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.internal.gcm.zzq;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

public class GcmNetworkManager {
    @GuardedBy("GcmNetworkManager.class")

    /* renamed from: c  reason: collision with root package name */
    private static GcmNetworkManager f3211c;

    /* renamed from: a  reason: collision with root package name */
    private final Context f3212a;
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, Map<String, Boolean>> f3213b = new a();

    private GcmNetworkManager(Context context) {
        this.f3212a = context;
    }

    public static GcmNetworkManager b(Context context) {
        GcmNetworkManager gcmNetworkManager;
        synchronized (GcmNetworkManager.class) {
            if (f3211c == null) {
                f3211c = new GcmNetworkManager(context.getApplicationContext());
            }
            gcmNetworkManager = f3211c;
        }
        return gcmNetworkManager;
    }

    static void d(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must provide a valid tag.");
        } else if (100 < str.length()) {
            throw new IllegalArgumentException("Tag is larger than max permissible tag length (100)");
        }
    }

    private static /* synthetic */ void e(Throwable th, zzp zzp) {
        if (th != null) {
            try {
                zzp.close();
            } catch (Throwable th2) {
                zzq.b(th, th2);
            }
        } else {
            zzp.close();
        }
    }

    private final h g() {
        if (GoogleCloudMessaging.e(this.f3212a) >= 5000000) {
            return new g(this.f3212a);
        }
        Log.e("GcmNetworkManager", "Google Play services is not available, dropping all GcmNetworkManager requests");
        return new i();
    }

    private final boolean i(String str) {
        List<ResolveInfo> list;
        Intent intent;
        Preconditions.l(str, "GcmTaskService must not be null.");
        PackageManager packageManager = this.f3212a.getPackageManager();
        if (packageManager == null) {
            list = Collections.emptyList();
        } else {
            if (str != null) {
                intent = new Intent("com.google.android.gms.gcm.ACTION_TASK_READY").setClassName(this.f3212a, str);
            } else {
                intent = new Intent("com.google.android.gms.gcm.ACTION_TASK_READY").setPackage(this.f3212a.getPackageName());
            }
            list = packageManager.queryIntentServices(intent, 0);
        }
        if (CollectionUtils.a(list)) {
            Log.e("GcmNetworkManager", String.valueOf(str).concat(" is not available. This may cause the task to be lost."));
            return true;
        }
        for (ResolveInfo resolveInfo : list) {
            ServiceInfo serviceInfo = resolveInfo.serviceInfo;
            if (serviceInfo != null && serviceInfo.enabled) {
                return true;
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 118);
        sb.append("The GcmTaskService class you provided ");
        sb.append(str);
        sb.append(" does not seem to support receiving com.google.android.gms.gcm.ACTION_TASK_READY");
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
        e(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.String r5, java.lang.Class<? extends com.google.android.gms.gcm.GcmTaskService> r6) {
        /*
            r4 = this;
            android.content.ComponentName r0 = new android.content.ComponentName
            android.content.Context r1 = r4.f3212a
            r0.<init>(r1, r6)
            com.google.android.gms.gcm.zzp r6 = new com.google.android.gms.gcm.zzp
            java.lang.String r1 = java.lang.String.valueOf(r5)
            int r2 = r1.length()
            java.lang.String r3 = "nts:client:cancel:"
            if (r2 == 0) goto L_0x001a
            java.lang.String r1 = r3.concat(r1)
            goto L_0x001f
        L_0x001a:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r3)
        L_0x001f:
            r6.<init>(r1)
            d(r5)     // Catch:{ all -> 0x0038 }
            java.lang.String r1 = r0.getClassName()     // Catch:{ all -> 0x0038 }
            r4.i(r1)     // Catch:{ all -> 0x0038 }
            com.google.android.gms.gcm.h r1 = r4.g()     // Catch:{ all -> 0x0038 }
            r1.a(r0, r5)     // Catch:{ all -> 0x0038 }
            r5 = 0
            e(r5, r6)
            return
        L_0x0038:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x003a }
        L_0x003a:
            r0 = move-exception
            e(r5, r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.gcm.GcmNetworkManager.a(java.lang.String, java.lang.Class):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        e(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005f, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void c(com.google.android.gms.gcm.Task r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.google.android.gms.gcm.zzp r0 = new com.google.android.gms.gcm.zzp     // Catch:{ all -> 0x0060 }
            java.lang.String r1 = "nts:client:schedule:"
            java.lang.String r2 = r5.b()     // Catch:{ all -> 0x0060 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0060 }
            int r3 = r2.length()     // Catch:{ all -> 0x0060 }
            if (r3 == 0) goto L_0x0018
            java.lang.String r1 = r1.concat(r2)     // Catch:{ all -> 0x0060 }
            goto L_0x001e
        L_0x0018:
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x0060 }
            r2.<init>(r1)     // Catch:{ all -> 0x0060 }
            r1 = r2
        L_0x001e:
            r0.<init>(r1)     // Catch:{ all -> 0x0060 }
            java.lang.String r1 = r5.a()     // Catch:{ all -> 0x0059 }
            r4.i(r1)     // Catch:{ all -> 0x0059 }
            com.google.android.gms.gcm.h r1 = r4.g()     // Catch:{ all -> 0x0059 }
            boolean r1 = r1.b(r5)     // Catch:{ all -> 0x0059 }
            if (r1 == 0) goto L_0x0053
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Boolean>> r1 = r4.f3213b     // Catch:{ all -> 0x0059 }
            java.lang.String r2 = r5.a()     // Catch:{ all -> 0x0059 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x0059 }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x0059 }
            if (r1 == 0) goto L_0x0053
            java.lang.String r2 = r5.b()     // Catch:{ all -> 0x0059 }
            boolean r2 = r1.containsKey(r2)     // Catch:{ all -> 0x0059 }
            if (r2 == 0) goto L_0x0053
            java.lang.String r5 = r5.b()     // Catch:{ all -> 0x0059 }
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0059 }
            r1.put(r5, r2)     // Catch:{ all -> 0x0059 }
        L_0x0053:
            r5 = 0
            e(r5, r0)     // Catch:{ all -> 0x0060 }
            monitor-exit(r4)
            return
        L_0x0059:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x005b }
        L_0x005b:
            r1 = move-exception
            e(r5, r0)     // Catch:{ all -> 0x0060 }
            throw r1     // Catch:{ all -> 0x0060 }
        L_0x0060:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.gcm.GcmNetworkManager.c(com.google.android.gms.gcm.Task):void");
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean f(String str, String str2) {
        Map map;
        map = this.f3213b.get(str2);
        if (map == null) {
            map = new a();
            this.f3213b.put(str2, map);
        }
        return map.put(str, Boolean.FALSE) == null;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void h(String str, String str2) {
        Map map = this.f3213b.get(str2);
        if (map != null) {
            if ((map.remove(str) != null) && map.isEmpty()) {
                this.f3213b.remove(str2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean j(String str) {
        return this.f3213b.containsKey(str);
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean k(String str, String str2) {
        Map map = this.f3213b.get(str2);
        if (map == null) {
            return false;
        }
        Boolean bool = (Boolean) map.get(str);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }
}
