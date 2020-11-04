package com.google.android.gms.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

final class f extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzaf f3268a;

    f(zzaf zzaf) {
        this.f3268a = zzaf;
    }

    public final void onReceive(Context context, Intent intent) {
        if (Log.isLoggable("InstanceID", 3)) {
            Log.d("InstanceID", "Received GSF callback via dynamic receiver");
        }
        this.f3268a.h(intent);
    }
}
