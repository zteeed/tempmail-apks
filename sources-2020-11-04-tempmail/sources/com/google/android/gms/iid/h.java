package com.google.android.gms.iid;

import android.content.BroadcastReceiver;
import android.content.Intent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class h {

    /* renamed from: a  reason: collision with root package name */
    final Intent f3455a;

    /* renamed from: b  reason: collision with root package name */
    private final BroadcastReceiver.PendingResult f3456b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f3457c = false;

    /* renamed from: d  reason: collision with root package name */
    private final ScheduledFuture<?> f3458d;

    h(Intent intent, BroadcastReceiver.PendingResult pendingResult, ScheduledExecutorService scheduledExecutorService) {
        this.f3455a = intent;
        this.f3456b = pendingResult;
        this.f3458d = scheduledExecutorService.schedule(new i(this, intent), 9500, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a() {
        if (!this.f3457c) {
            this.f3456b.finish();
            this.f3458d.cancel(false);
            this.f3457c = true;
        }
    }
}
