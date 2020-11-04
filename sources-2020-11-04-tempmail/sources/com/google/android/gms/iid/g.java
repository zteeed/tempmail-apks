package com.google.android.gms.iid;

import android.content.Intent;

final class g implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Intent f3452b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Intent f3453c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zze f3454d;

    g(zze zze, Intent intent, Intent intent2) {
        this.f3454d = zze;
        this.f3452b = intent;
        this.f3453c = intent2;
    }

    public final void run() {
        this.f3454d.handleIntent(this.f3452b);
        this.f3454d.b(this.f3453c);
    }
}
