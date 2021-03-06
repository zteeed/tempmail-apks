package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
import javax.annotation.Nullable;

@VisibleForTesting
/* compiled from: com.google.firebase:firebase-iid@@20.2.1 */
final class d0 extends BroadcastReceiver {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    private e0 f11725a;

    public d0(e0 e0Var) {
        this.f11725a = e0Var;
    }

    public final void a() {
        if (FirebaseInstanceId.w()) {
            Log.d("FirebaseInstanceId", "Connectivity change received registered");
        }
        this.f11725a.a().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public final void onReceive(Context context, Intent intent) {
        e0 e0Var = this.f11725a;
        if (e0Var != null && e0Var.b()) {
            if (FirebaseInstanceId.w()) {
                Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
            }
            FirebaseInstanceId.o(this.f11725a, 0);
            this.f11725a.a().unregisterReceiver(this);
            this.f11725a = null;
        }
    }
}
