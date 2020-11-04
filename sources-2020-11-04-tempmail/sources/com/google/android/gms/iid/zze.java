package com.google.android.gms.iid;

import a.m.a.a;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.internal.gcm.zzg;
import java.util.concurrent.ExecutorService;

public abstract class zze extends Service {

    /* renamed from: b  reason: collision with root package name */
    final ExecutorService f3494b = zzg.a().c(new NamedThreadFactory("EnhancedIntentService"), 9);

    /* renamed from: c  reason: collision with root package name */
    private Binder f3495c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f3496d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private int f3497e;

    /* renamed from: f  reason: collision with root package name */
    private int f3498f = 0;

    /* access modifiers changed from: private */
    public final void b(Intent intent) {
        if (intent != null) {
            a.b(intent);
        }
        synchronized (this.f3496d) {
            int i = this.f3498f - 1;
            this.f3498f = i;
            if (i == 0) {
                stopSelfResult(this.f3497e);
            }
        }
    }

    public abstract void handleIntent(Intent intent);

    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.f3495c == null) {
            this.f3495c = new zzi(this);
        }
        return this.f3495c;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.f3496d) {
            this.f3497e = i2;
            this.f3498f++;
        }
        if (intent == null) {
            b(intent);
            return 2;
        }
        this.f3494b.execute(new g(this, intent, intent));
        return 3;
    }
}
