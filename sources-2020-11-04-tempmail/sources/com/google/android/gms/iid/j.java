package com.google.android.gms.iid;

import android.util.Log;

final class j implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ h f3461b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzi f3462c;

    j(zzi zzi, h hVar) {
        this.f3462c = zzi;
        this.f3461b = hVar;
    }

    public final void run() {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "bg processing of the intent starting now");
        }
        this.f3462c.f3499b.handleIntent(this.f3461b.f3455a);
        this.f3461b.a();
    }
}
