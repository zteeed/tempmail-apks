package com.google.android.gms.iid;

import android.content.Intent;
import android.util.Log;

final class i implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Intent f3276b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ h f3277c;

    i(h hVar, Intent intent) {
        this.f3277c = hVar;
        this.f3276b = intent;
    }

    public final void run() {
        String action = this.f3276b.getAction();
        StringBuilder sb = new StringBuilder(String.valueOf(action).length() + 61);
        sb.append("Service took too long to process intent: ");
        sb.append(action);
        sb.append(" App may get closed.");
        Log.w("EnhancedIntentService", sb.toString());
        this.f3277c.a();
    }
}
