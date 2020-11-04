package com.google.android.gms.iid;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public final class zzk implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    private final Context f3500a;

    /* renamed from: b  reason: collision with root package name */
    private final Intent f3501b;

    /* renamed from: c  reason: collision with root package name */
    private final ScheduledExecutorService f3502c;

    /* renamed from: d  reason: collision with root package name */
    private final Queue<h> f3503d;

    /* renamed from: e  reason: collision with root package name */
    private zzi f3504e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f3505f;

    public zzk(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new NamedThreadFactory("EnhancedIntentService")));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a8, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void b() {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.String r0 = "EnhancedIntentService"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00ab }
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = "EnhancedIntentService"
            java.lang.String r2 = "flush queue called"
            android.util.Log.d(r0, r2)     // Catch:{ all -> 0x00ab }
        L_0x0011:
            java.util.Queue<com.google.android.gms.iid.h> r0 = r6.f3503d     // Catch:{ all -> 0x00ab }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00ab }
            if (r0 != 0) goto L_0x00a9
            java.lang.String r0 = "EnhancedIntentService"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00ab }
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = "EnhancedIntentService"
            java.lang.String r2 = "found intent to be delivered"
            android.util.Log.d(r0, r2)     // Catch:{ all -> 0x00ab }
        L_0x0028:
            com.google.android.gms.iid.zzi r0 = r6.f3504e     // Catch:{ all -> 0x00ab }
            if (r0 == 0) goto L_0x0051
            com.google.android.gms.iid.zzi r0 = r6.f3504e     // Catch:{ all -> 0x00ab }
            boolean r0 = r0.isBinderAlive()     // Catch:{ all -> 0x00ab }
            if (r0 == 0) goto L_0x0051
            java.lang.String r0 = "EnhancedIntentService"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00ab }
            if (r0 == 0) goto L_0x0043
            java.lang.String r0 = "EnhancedIntentService"
            java.lang.String r2 = "binder is alive, sending the intent."
            android.util.Log.d(r0, r2)     // Catch:{ all -> 0x00ab }
        L_0x0043:
            java.util.Queue<com.google.android.gms.iid.h> r0 = r6.f3503d     // Catch:{ all -> 0x00ab }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x00ab }
            com.google.android.gms.iid.h r0 = (com.google.android.gms.iid.h) r0     // Catch:{ all -> 0x00ab }
            com.google.android.gms.iid.zzi r2 = r6.f3504e     // Catch:{ all -> 0x00ab }
            r2.b(r0)     // Catch:{ all -> 0x00ab }
            goto L_0x0011
        L_0x0051:
            java.lang.String r0 = "EnhancedIntentService"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00ab }
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x007a
            java.lang.String r0 = "EnhancedIntentService"
            boolean r3 = r6.f3505f     // Catch:{ all -> 0x00ab }
            if (r3 != 0) goto L_0x0063
            r3 = 1
            goto L_0x0064
        L_0x0063:
            r3 = 0
        L_0x0064:
            r4 = 39
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ab }
            r5.<init>(r4)     // Catch:{ all -> 0x00ab }
            java.lang.String r4 = "binder is dead. start connection? "
            r5.append(r4)     // Catch:{ all -> 0x00ab }
            r5.append(r3)     // Catch:{ all -> 0x00ab }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x00ab }
            android.util.Log.d(r0, r3)     // Catch:{ all -> 0x00ab }
        L_0x007a:
            boolean r0 = r6.f3505f     // Catch:{ all -> 0x00ab }
            if (r0 != 0) goto L_0x00a7
            r6.f3505f = r2     // Catch:{ all -> 0x00ab }
            com.google.android.gms.common.stats.ConnectionTracker r0 = com.google.android.gms.common.stats.ConnectionTracker.b()     // Catch:{ SecurityException -> 0x009a }
            android.content.Context r2 = r6.f3500a     // Catch:{ SecurityException -> 0x009a }
            android.content.Intent r3 = r6.f3501b     // Catch:{ SecurityException -> 0x009a }
            r4 = 65
            boolean r0 = r0.a(r2, r3, r6, r4)     // Catch:{ SecurityException -> 0x009a }
            if (r0 == 0) goto L_0x0092
            monitor-exit(r6)
            return
        L_0x0092:
            java.lang.String r0 = "EnhancedIntentService"
            java.lang.String r2 = "binding to the service failed"
            android.util.Log.e(r0, r2)     // Catch:{ SecurityException -> 0x009a }
            goto L_0x00a2
        L_0x009a:
            r0 = move-exception
            java.lang.String r2 = "EnhancedIntentService"
            java.lang.String r3 = "Exception while binding the service"
            android.util.Log.e(r2, r3, r0)     // Catch:{ all -> 0x00ab }
        L_0x00a2:
            r6.f3505f = r1     // Catch:{ all -> 0x00ab }
            r6.c()     // Catch:{ all -> 0x00ab }
        L_0x00a7:
            monitor-exit(r6)
            return
        L_0x00a9:
            monitor-exit(r6)
            return
        L_0x00ab:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.iid.zzk.b():void");
    }

    private final void c() {
        while (!this.f3503d.isEmpty()) {
            this.f3503d.poll().a();
        }
    }

    public final synchronized void a(Intent intent, BroadcastReceiver.PendingResult pendingResult) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "new intent queued in the bind-strategy delivery");
        }
        this.f3503d.add(new h(intent, pendingResult, this.f3502c));
        b();
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this) {
            this.f3505f = false;
            this.f3504e = (zzi) iBinder;
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                String valueOf = String.valueOf(componentName);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
                sb.append("onServiceConnected: ");
                sb.append(valueOf);
                Log.d("EnhancedIntentService", sb.toString());
            }
            if (iBinder == null) {
                Log.e("EnhancedIntentService", "Null service connection");
                c();
            } else {
                b();
            }
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("onServiceDisconnected: ");
            sb.append(valueOf);
            Log.d("EnhancedIntentService", sb.toString());
        }
        b();
    }

    private zzk(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f3503d = new ArrayDeque();
        this.f3505f = false;
        this.f3500a = context.getApplicationContext();
        this.f3501b = new Intent(str).setPackage(this.f3500a.getPackageName());
        this.f3502c = scheduledExecutorService;
    }
}
