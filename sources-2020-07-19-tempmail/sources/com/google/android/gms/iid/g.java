package com.google.android.gms.iid;

import android.content.Intent;

final class g implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Intent f3269b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Intent f3270c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zze f3271d;

    g(zze zze, Intent intent, Intent intent2) {
        this.f3271d = zze;
        this.f3269b = intent;
        this.f3270c = intent2;
    }

    public final void run() {
        this.f3271d.handleIntent(this.f3269b);
        this.f3271d.b(this.f3270c);
    }
}
