package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class zabq extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private Context f2857a;

    /* renamed from: b  reason: collision with root package name */
    private final zabr f2858b;

    public zabq(zabr zabr) {
        this.f2858b = zabr;
    }

    public final synchronized void a() {
        if (this.f2857a != null) {
            this.f2857a.unregisterReceiver(this);
        }
        this.f2857a = null;
    }

    public final void b(Context context) {
        this.f2857a = context;
    }

    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f2858b.a();
            a();
        }
    }
}
