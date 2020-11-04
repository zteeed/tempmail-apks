package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzatu extends RemoteCreator<zzato> {
    public zzatu() {
        super("com.google.android.gms.ads.reward.RewardedVideoAdCreatorImpl");
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
        if (queryLocalInterface instanceof zzato) {
            return (zzato) queryLocalInterface;
        }
        return new zzatn(iBinder);
    }

    public final zzatj c(Context context, zzamr zzamr) {
        try {
            IBinder C5 = ((zzato) b(context)).C5(ObjectWrapper.h0(context), zzamr, 201604000);
            if (C5 == null) {
                return null;
            }
            IInterface queryLocalInterface = C5.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
            if (queryLocalInterface instanceof zzatj) {
                return (zzatj) queryLocalInterface;
            }
            return new zzatl(C5);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e2) {
            zzbba.d("Could not get remote RewardedVideoAd.", e2);
            return null;
        }
    }
}
