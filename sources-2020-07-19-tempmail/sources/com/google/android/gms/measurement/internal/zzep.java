package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzb;
import com.google.android.gms.internal.measurement.zzc;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public abstract class zzep extends zzc implements zzem {
    public zzep() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                d4((zzao) zzb.a(parcel, zzao.CREATOR), (zzn) zzb.a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                i3((zzkq) zzb.a(parcel, zzkq.CREATOR), (zzn) zzb.a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                F3((zzn) zzb.a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                q4((zzao) zzb.a(parcel, zzao.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                y4((zzn) zzb.a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                List<zzkq> C3 = C3((zzn) zzb.a(parcel, zzn.CREATOR), zzb.e(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(C3);
                return true;
            case 9:
                byte[] H5 = H5((zzao) zzb.a(parcel, zzao.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(H5);
                return true;
            case 10:
                O2(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                String c2 = c2((zzn) zzb.a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(c2);
                return true;
            case 12:
                l0((zzw) zzb.a(parcel, zzw.CREATOR), (zzn) zzb.a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                c4((zzw) zzb.a(parcel, zzw.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                List<zzkq> B3 = B3(parcel.readString(), parcel.readString(), zzb.e(parcel), (zzn) zzb.a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(B3);
                return true;
            case 15:
                List<zzkq> o1 = o1(parcel.readString(), parcel.readString(), parcel.readString(), zzb.e(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(o1);
                return true;
            case 16:
                List<zzw> Z2 = Z2(parcel.readString(), parcel.readString(), (zzn) zzb.a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(Z2);
                return true;
            case 17:
                List<zzw> X2 = X2(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(X2);
                return true;
            case 18:
                W2((zzn) zzb.a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                return true;
            case 19:
                A5((Bundle) zzb.a(parcel, Bundle.CREATOR), (zzn) zzb.a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
