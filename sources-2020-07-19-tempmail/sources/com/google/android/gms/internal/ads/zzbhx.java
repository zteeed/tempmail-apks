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
                A0((Bundle) zzgw.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                Bundle d2 = d2((Bundle) zzgw.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                zzgw.g(parcel2, d2);
                return true;
            case 3:
                Q(parcel.readString(), parcel.readString(), (Bundle) zzgw.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                C5(parcel.readString(), parcel.readString(), IObjectWrapper.Stub.E(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5:
                Map K3 = K3(parcel.readString(), parcel.readString(), zzgw.e(parcel));
                parcel2.writeNoException();
                parcel2.writeMap(K3);
                return true;
            case 6:
                int T = T(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(T);
                return true;
            case 7:
                z4((Bundle) zzgw.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                clearConditionalUserProperty(parcel.readString(), parcel.readString(), (Bundle) zzgw.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 9:
                List X = X(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeList(X);
                return true;
            case 10:
                String S1 = S1();
                parcel2.writeNoException();
                parcel2.writeString(S1);
                return true;
            case 11:
                String V3 = V3();
                parcel2.writeNoException();
                parcel2.writeString(V3);
                return true;
            case 12:
                long p2 = p2();
                parcel2.writeNoException();
                parcel2.writeLong(p2);
                return true;
            case 13:
                D5(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 14:
                r6(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 15:
                l4(IObjectWrapper.Stub.E(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 16:
                String u2 = u2();
                parcel2.writeNoException();
                parcel2.writeString(u2);
                return true;
            case 17:
                String w4 = w4();
                parcel2.writeNoException();
                parcel2.writeString(w4);
                return true;
            case 18:
                String Q3 = Q3();
                parcel2.writeNoException();
                parcel2.writeString(Q3);
                return true;
            default:
                return false;
        }
    }
}
