package com.google.android.gms.iid;

import a.l.a.a;
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
    final ExecutorService f3311b = zzg.a().c(new NamedThreadFactory("EnhancedIntentService"), 9);

    /* renamed from: c  reason: collision with root package name */
    private Binder f3312c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f3313d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private int f3314e;

    /* renamed from: f  reason: collision with root package name */
    private int f3315f = 0;

    /* access modifiers changed from: private */
    public final void b(Intent intent) {
        if (intent != null) {
            a.b(intent);
        }
        synchronized (this.f3313d) {
            int i = this.f3315f - 1;
            this.f3315f = i;
            if (i == 0) {
                stopSelfResult(this.f3314e);
            }
        }
    }

    public abstract void handleIntent(Intent intent);

    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.f3312c == null) {
            this.f3312c = new zzi(this);
        }
        return this.f3312c;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.f3313d) {
            this.f3314e = i2;
            this.f3315f++;
        }
        if (intent == null) {
            b(intent);
            return 2;
        }
        this.f3311b.execute(new g(this, intent, intent));
        return 3;
    }
}
