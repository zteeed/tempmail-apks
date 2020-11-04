package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class zabq extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private Context f3045a;

    /* renamed from: b  reason: collision with root package name */
    private final zabr f3046b;

    public zabq(zabr zabr) {
        this.f3046b = zabr;
    }

    public final synchronized void a() {
        if (this.f3045a != null) {
            this.f3045a.unregisterReceiver(this);
        }
        this.f3045a = null;
    }

    public final void b(Context context) {
        this.f3045a = context;
    }

    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f3046b.a();
            a();
        }
    }
}
