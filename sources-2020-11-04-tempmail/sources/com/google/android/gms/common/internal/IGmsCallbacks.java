package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

public interface IGmsCallbacks extends IInterface {

    public static abstract class zza extends zzb implements IGmsCallbacks {
        public zza() {
            super("com.google.android.gms.common.internal.IGmsCallbacks");
        }

        /* access modifiers changed from: protected */
        public final boolean B(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                L3(parcel.readInt(), parcel.readStrongBinder(), (Bundle) zzc.b(parcel, Bundle.CREATOR));
            } else if (i == 2) {
                m3(parcel.readInt(), (Bundle) zzc.b(parcel, Bundle.CREATOR));
            } else if (i != 3) {
                return false;
            } else {
                V2(parcel.readInt(), parcel.readStrongBinder(), (zzb) zzc.b(parcel, zzb.CREATOR));
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void L3(int i, IBinder iBinder, Bundle bundle) throws RemoteException;

    void V2(int i, IBinder iBinder, zzb zzb) throws RemoteException;

    void m3(int i, Bundle bundle) throws RemoteException;
}
