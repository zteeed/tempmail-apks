package com.google.android.gms.iid;

import android.util.Log;

final class j implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ h f3278b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzi f3279c;

    j(zzi zzi, h hVar) {
        this.f3279c = zzi;
        this.f3278b = hVar;
    }

    public final void run() {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "bg processing of the intent starting now");
        }
        this.f3279c.f3316b.handleIntent(this.f3278b.f3272a);
        this.f3278b.a();
    }
}
