package com.google.android.play.core.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

final class k implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ l f11491a;

    /* synthetic */ k(l lVar) {
        this.f11491a = lVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f11491a.f11493b.f("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f11491a.h(new i(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f11491a.f11493b.f("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f11491a.h(new j(this));
    }
}
