package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* compiled from: com.google.firebase:firebase-messaging@@20.2.1 */
final class e extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private f f11955a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ f f11956b;

    public e(f fVar, f fVar2) {
        this.f11956b = fVar;
        this.f11955a = fVar2;
    }

    public final synchronized void onReceive(Context context, Intent intent) {
        if (this.f11955a != null) {
            if (this.f11955a.f()) {
                if (f.h()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f11955a.f11960e.f(this.f11955a, 0);
                context.unregisterReceiver(this);
                this.f11955a = null;
            }
        }
    }
}
