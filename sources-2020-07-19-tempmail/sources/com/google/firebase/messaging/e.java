package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* compiled from: com.google.firebase:firebase-messaging@@20.2.0 */
final class e extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private f f11406a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ f f11407b;

    public e(f fVar, f fVar2) {
        this.f11407b = fVar;
        this.f11406a = fVar2;
    }

    public final synchronized void onReceive(Context context, Intent intent) {
        if (this.f11406a != null) {
            if (this.f11406a.f()) {
                if (f.h()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f11406a.f11411e.f(this.f11406a, 0);
                context.unregisterReceiver(this);
                this.f11406a = null;
            }
        }
    }
}
