package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.measurement.zzag;

@KeepForSdk
@Deprecated
/* compiled from: com.google.android.gms:play-services-measurement-api@@17.4.3 */
public final class AppMeasurementInstallReferrerReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        zzag.b(context).i(5, "Install Referrer Broadcast deprecated", (Object) null, (Object) null, (Object) null);
    }
}
