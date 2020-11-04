package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public abstract class zzxl extends zzgt implements zzxm {
    public zzxl() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                F();
                parcel2.writeNoException();
                return true;
            case 2:
                n5(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 3:
                Y4(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 4:
                J1(zzgw.e(parcel));
                parcel2.writeNoException();
                return true;
            case 5:
                m0(IObjectWrapper.Stub.E(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                y3(parcel.readString(), IObjectWrapper.Stub.E(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 7:
                float k4 = k4();
                parcel2.writeNoException();
                parcel2.writeFloat(k4);
                return true;
            case 8:
                boolean q3 = q3();
                parcel2.writeNoException();
                zzgw.a(parcel2, q3);
                return true;
            case 9:
                String t3 = t3();
                parcel2.writeNoException();
                parcel2.writeString(t3);
                return true;
            case 10:
                z2(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                u5(zzamq.z6(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 12:
                V1(zzaii.z6(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 13:
                List<zzaic> B2 = B2();
                parcel2.writeNoException();
                parcel2.writeTypedList(B2);
                return true;
            case 14:
                y1((zzzu) zzgw.b(parcel, zzzu.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                C1();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
