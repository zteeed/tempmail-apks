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

    public static zzatx e7(IBinder iBinder) {
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
                v3(IObjectWrapper.Stub.H(parcel.readStrongBinder()));
                break;
            case 2:
                o1(IObjectWrapper.Stub.H(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 3:
                I0(IObjectWrapper.Stub.H(parcel.readStrongBinder()));
                break;
            case 4:
                R1(IObjectWrapper.Stub.H(parcel.readStrongBinder()));
                break;
            case 5:
                h6(IObjectWrapper.Stub.H(parcel.readStrongBinder()));
                break;
            case 6:
                K6(IObjectWrapper.Stub.H(parcel.readStrongBinder()));
                break;
            case 7:
                Y6(IObjectWrapper.Stub.H(parcel.readStrongBinder()), (zzaub) zzgw.b(parcel, zzaub.CREATOR));
                break;
            case 8:
                Z3(IObjectWrapper.Stub.H(parcel.readStrongBinder()));
                break;
            case 9:
                j2(IObjectWrapper.Stub.H(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 10:
                h5(IObjectWrapper.Stub.H(parcel.readStrongBinder()));
                break;
            case 11:
                r2(IObjectWrapper.Stub.H(parcel.readStrongBinder()));
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
