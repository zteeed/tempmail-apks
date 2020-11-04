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
                I();
                parcel2.writeNoException();
                return true;
            case 2:
                J5(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 3:
                t5(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 4:
                S1(zzgw.e(parcel));
                parcel2.writeNoException();
                return true;
            case 5:
                s0(IObjectWrapper.Stub.H(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                M3(parcel.readString(), IObjectWrapper.Stub.H(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 7:
                float E4 = E4();
                parcel2.writeNoException();
                parcel2.writeFloat(E4);
                return true;
            case 8:
                boolean F3 = F3();
                parcel2.writeNoException();
                zzgw.a(parcel2, F3);
                return true;
            case 9:
                String I3 = I3();
                parcel2.writeNoException();
                parcel2.writeString(I3);
                return true;
            case 10:
                L2(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                Q5(zzamq.e7(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 12:
                e2(zzaii.e7(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 13:
                List<zzaic> M2 = M2();
                parcel2.writeNoException();
                parcel2.writeTypedList(M2);
                return true;
            case 14:
                H1((zzzu) zzgw.b(parcel, zzzu.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                L1();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
