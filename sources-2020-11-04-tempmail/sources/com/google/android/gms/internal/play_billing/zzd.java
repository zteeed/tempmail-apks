package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.android.billingclient:billing@@3.0.0 */
public abstract class zzd extends zze implements zza {
    public static zza B(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
        if (queryLocalInterface instanceof zza) {
            return (zza) queryLocalInterface;
        }
        return new zzc(iBinder);
    }
}
