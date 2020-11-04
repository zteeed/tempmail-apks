package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzauy {
    public static zzaui a(Context context, String str, zzamr zzamr) {
        try {
            IBinder M1 = ((zzauo) zzbaz.a(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", x3.f5277a)).M1(ObjectWrapper.b0(context), str, zzamr, 201604000);
            if (M1 == null) {
                return null;
            }
            IInterface queryLocalInterface = M1.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            if (queryLocalInterface instanceof zzaui) {
                return (zzaui) queryLocalInterface;
            }
            return new zzauk(M1);
        } catch (RemoteException | zzbbb e2) {
            zzbba.e("#007 Could not call remote method.", e2);
            return null;
        }
    }
}
