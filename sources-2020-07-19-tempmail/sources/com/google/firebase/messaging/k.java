package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.internal.firebase_messaging.zza;
import com.google.android.gms.internal.firebase_messaging.zzf;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.f0;
import com.google.firebase.iid.g0;
import java.util.concurrent.ExecutorService;

@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
/* compiled from: com.google.firebase:firebase-messaging@@20.2.0 */
public abstract class k extends Service {

    /* renamed from: b  reason: collision with root package name */
    private final ExecutorService f11419b = zza.a().a(new NamedThreadFactory("Firebase-Messaging-Intent-Handle"), zzf.f9301a);

    /* renamed from: c  reason: collision with root package name */
    private Binder f11420c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f11421d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private int f11422e;

    /* renamed from: f  reason: collision with root package name */
    private int f11423f = 0;

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final Task<Void> e(Intent intent) {
        if (c(intent)) {
            return Tasks.e(null);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f11419b.execute(new m(this, intent, taskCompletionSource));
        return taskCompletionSource.a();
    }

    private final void g(Intent intent) {
        if (intent != null) {
            g0.b(intent);
        }
        synchronized (this.f11421d) {
            int i = this.f11423f - 1;
            this.f11423f = i;
            if (i == 0) {
                stopSelfResult(this.f11422e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract Intent a(Intent intent);

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(Intent intent, Task task) {
        g(intent);
    }

    public abstract boolean c(Intent intent);

    public abstract void d(Intent intent);

    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.f11420c == null) {
            this.f11420c = new f0(new j(this));
        }
        return this.f11420c;
    }

    public void onDestroy() {
        this.f11419b.shutdown();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.f11421d) {
            this.f11422e = i2;
            this.f11423f++;
        }
        Intent a2 = a(intent);
        if (a2 == null) {
            g(intent);
            return 2;
        }
        Task<Void> f2 = e(a2);
        if (f2.q()) {
            g(intent);
            return 2;
        }
        f2.d(l.f11424b, new o(this, intent));
        return 3;
    }
}
