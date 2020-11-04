package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class o0 extends e0 implements p0 {
    public o0() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetModuleServiceCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean B(int i, Parcel parcel) throws RemoteException {
        switch (i) {
            case 2:
                p5(parcel.readInt(), (Bundle) f0.a(parcel, Bundle.CREATOR));
                return true;
            case 3:
                int readInt = parcel.readInt();
                Bundle bundle = (Bundle) f0.a(parcel, Bundle.CREATOR);
                S(readInt);
                return true;
            case 4:
                int readInt2 = parcel.readInt();
                Bundle bundle2 = (Bundle) f0.a(parcel, Bundle.CREATOR);
                d4(readInt2);
                return true;
            case 5:
                K(parcel.createTypedArrayList(Bundle.CREATOR));
                return true;
            case 6:
                Bundle bundle3 = (Bundle) f0.a(parcel, Bundle.CREATOR);
                y((Bundle) f0.a(parcel, Bundle.CREATOR));
                return true;
            case 7:
                l((Bundle) f0.a(parcel, Bundle.CREATOR));
                return true;
            case 8:
                Bundle bundle4 = (Bundle) f0.a(parcel, Bundle.CREATOR);
                y2((Bundle) f0.a(parcel, Bundle.CREATOR));
                return true;
            case 10:
                Bundle bundle5 = (Bundle) f0.a(parcel, Bundle.CREATOR);
                x5((Bundle) f0.a(parcel, Bundle.CREATOR));
                return true;
            case 11:
                P((Bundle) f0.a(parcel, Bundle.CREATOR), (Bundle) f0.a(parcel, Bundle.CREATOR));
                return true;
            case 12:
                s3((Bundle) f0.a(parcel, Bundle.CREATOR), (Bundle) f0.a(parcel, Bundle.CREATOR));
                return true;
            case 13:
                f4((Bundle) f0.a(parcel, Bundle.CREATOR), (Bundle) f0.a(parcel, Bundle.CREATOR));
                return true;
            case 14:
                Bundle bundle6 = (Bundle) f0.a(parcel, Bundle.CREATOR);
                Bundle bundle7 = (Bundle) f0.a(parcel, Bundle.CREATOR);
                u1();
                return true;
            case 15:
                Bundle bundle8 = (Bundle) f0.a(parcel, Bundle.CREATOR);
                d();
                return true;
            default:
                return false;
        }
    }
}
