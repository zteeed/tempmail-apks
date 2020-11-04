package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public abstract class zzbhx extends zzgt implements zzbhy {
    public zzbhx() {
        super("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                G0((Bundle) zzgw.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                Bundle n2 = n2((Bundle) zzgw.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                zzgw.g(parcel2, n2);
                return true;
            case 3:
                W(parcel.readString(), parcel.readString(), (Bundle) zzgw.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                a6(parcel.readString(), parcel.readString(), IObjectWrapper.Stub.H(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5:
                Map Y3 = Y3(parcel.readString(), parcel.readString(), zzgw.e(parcel));
                parcel2.writeNoException();
                parcel2.writeMap(Y3);
                return true;
            case 6:
                int Z = Z(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(Z);
                return true;
            case 7:
                T4((Bundle) zzgw.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                clearConditionalUserProperty(parcel.readString(), parcel.readString(), (Bundle) zzgw.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 9:
                List d0 = d0(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeList(d0);
                return true;
            case 10:
                String b2 = b2();
                parcel2.writeNoException();
                parcel2.writeString(b2);
                return true;
            case 11:
                String p4 = p4();
                parcel2.writeNoException();
                parcel2.writeString(p4);
                return true;
            case 12:
                long A2 = A2();
                parcel2.writeNoException();
                parcel2.writeLong(A2);
                return true;
            case 13:
                b6(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 14:
                V6(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 15:
                F4(IObjectWrapper.Stub.H(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 16:
                String H2 = H2();
                parcel2.writeNoException();
                parcel2.writeString(H2);
                return true;
            case 17:
                String Q4 = Q4();
                parcel2.writeNoException();
                parcel2.writeString(Q4);
                return true;
            case 18:
                String h4 = h4();
                parcel2.writeNoException();
                parcel2.writeString(h4);
                return true;
            default:
                return false;
        }
    }
}
