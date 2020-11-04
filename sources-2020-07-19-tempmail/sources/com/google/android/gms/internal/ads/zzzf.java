package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzzf extends RemoteCreator<zzxn> {
    public zzzf() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        if (queryLocalInterface instanceof zzxn) {
            return (zzxn) queryLocalInterface;
        }
        return new zzxq(iBinder);
    }

    public final zzxm c(Context context) {
        try {
            IBinder f6 = ((zzxn) b(context)).f6(ObjectWrapper.b0(context), 201604000);
            if (f6 == null) {
                return null;
            }
            IInterface queryLocalInterface = f6.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            if (queryLocalInterface instanceof zzxm) {
                return (zzxm) queryLocalInterface;
            }
            return new zzxo(f6);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e2) {
            zzbba.d("Could not get remote MobileAdsSettingManager.", e2);
            return null;
        }
    }
}
