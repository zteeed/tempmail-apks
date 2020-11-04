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
                x4((zzao) zzb.a(parcel, zzao.CREATOR), (zzn) zzb.a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                y3((zzkq) zzb.a(parcel, zzkq.CREATOR), (zzn) zzb.a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                T3((zzn) zzb.a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                K4((zzao) zzb.a(parcel, zzao.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                S4((zzn) zzb.a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                List<zzkq> Q3 = Q3((zzn) zzb.a(parcel, zzn.CREATOR), zzb.e(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(Q3);
                return true;
            case 9:
                byte[] f6 = f6((zzao) zzb.a(parcel, zzao.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(f6);
                return true;
            case 10:
                a3(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                String m2 = m2((zzn) zzb.a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(m2);
                return true;
            case 12:
                r0((zzw) zzb.a(parcel, zzw.CREATOR), (zzn) zzb.a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                w4((zzw) zzb.a(parcel, zzw.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                List<zzkq> P3 = P3(parcel.readString(), parcel.readString(), zzb.e(parcel), (zzn) zzb.a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(P3);
                return true;
            case 15:
                List<zzkq> v1 = v1(parcel.readString(), parcel.readString(), parcel.readString(), zzb.e(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(v1);
                return true;
            case 16:
                List<zzw> l3 = l3(parcel.readString(), parcel.readString(), (zzn) zzb.a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(l3);
                return true;
            case 17:
                List<zzw> j3 = j3(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(j3);
                return true;
            case 18:
                i3((zzn) zzb.a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                return true;
            case 19:
                Y5((Bundle) zzb.a(parcel, Bundle.CREATOR), (zzn) zzb.a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
