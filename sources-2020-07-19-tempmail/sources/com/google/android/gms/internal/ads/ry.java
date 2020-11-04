package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzcf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.UUID;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
final class ry implements ty {

    /* renamed from: a  reason: collision with root package name */
    private static final zzcf.zza f4849a = zzcf.zza.y0();

    ry() {
    }

    public final zzcf.zza a() {
        return f4849a;
    }

    public final zzcf.zza b(Context context) throws IOException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        zzcf.zza.C0074zza w0 = zzcf.zza.w0();
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context);
        advertisingIdClient.start();
        AdvertisingIdClient.Info info = advertisingIdClient.getInfo();
        String id = info.getId();
        if (id != null && id.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID fromString = UUID.fromString(id);
            byte[] bArr = new byte[16];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.putLong(fromString.getMostSignificantBits());
            wrap.putLong(fromString.getLeastSignificantBits());
            id = Base64.encodeToString(bArr, 11);
        }
        if (id != null) {
            w0.H(id);
            w0.C(info.isLimitAdTrackingEnabled());
            w0.w(zzcf.zza.zzc.DEVICE_IDENTIFIER_ANDROID_AD_ID);
        }
        return (zzcf.zza) ((zzegb) w0.O());
    }
}
