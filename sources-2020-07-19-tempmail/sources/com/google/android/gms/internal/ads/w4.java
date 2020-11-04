package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class w4 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f5181b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzbbn f5182c;

    w4(zzaxb zzaxb, Context context, zzbbn zzbbn) {
        this.f5181b = context;
        this.f5182c = zzbbn;
    }

    public final void run() {
        try {
            this.f5182c.a(AdvertisingIdClient.getAdvertisingIdInfo(this.f5181b));
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e2) {
            this.f5182c.c(e2);
            zzbba.c("Exception while getting advertising Id info", e2);
        }
    }
}
