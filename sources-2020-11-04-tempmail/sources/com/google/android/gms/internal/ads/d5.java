package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class d5 extends zzaxr {

    /* renamed from: a  reason: collision with root package name */
    private Context f3787a;

    d5(Context context) {
        this.f3787a = context;
    }

    public final void zzut() {
        boolean z;
        try {
            z = AdvertisingIdClient.getIsAdIdFakeForDebugLogging(this.f3787a);
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e2) {
            zzbba.c("Fail to get isAdIdFakeForDebugLogging", e2);
            z = false;
        }
        zzbau.l(z);
        StringBuilder sb = new StringBuilder(43);
        sb.append("Update ad debug logging enablement as ");
        sb.append(z);
        zzbba.i(sb.toString());
    }
}
