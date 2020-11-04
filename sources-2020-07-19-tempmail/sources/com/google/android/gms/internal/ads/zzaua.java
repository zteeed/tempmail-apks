package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public abstract class zzaua extends zzgt implements zzatx {
    public zzaua() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public static zzatx z6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        if (queryLocalInterface instanceof zzatx) {
            return (zzatx) queryLocalInterface;
        }
        return new zzatz(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                f3(IObjectWrapper.Stub.E(parcel.readStrongBinder()));
                break;
            case 2:
                i1(IObjectWrapper.Stub.E(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 3:
                C0(IObjectWrapper.Stub.E(parcel.readStrongBinder()));
                break;
            case 4:
                I1(IObjectWrapper.Stub.E(parcel.readStrongBinder()));
                break;
            case 5:
                J5(IObjectWrapper.Stub.E(parcel.readStrongBinder()));
                break;
            case 6:
                i6(IObjectWrapper.Stub.E(parcel.readStrongBinder()));
                break;
            case 7:
                u6(IObjectWrapper.Stub.E(parcel.readStrongBinder()), (zzaub) zzgw.b(parcel, zzaub.CREATOR));
                break;
            case 8:
                L3(IObjectWrapper.Stub.E(parcel.readStrongBinder()));
                break;
            case 9:
                Z1(IObjectWrapper.Stub.E(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 10:
                N4(IObjectWrapper.Stub.E(parcel.readStrongBinder()));
                break;
            case 11:
                h2(IObjectWrapper.Stub.E(parcel.readStrongBinder()));
                break;
            case 12:
                zzb((Bundle) zzgw.b(parcel, Bundle.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
