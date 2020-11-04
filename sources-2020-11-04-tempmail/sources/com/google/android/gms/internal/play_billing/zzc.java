package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* compiled from: com.android.billingclient:billing@@3.0.0 */
public final class zzc extends zzf implements zza {
    zzc(IBinder iBinder) {
        super(iBinder, "com.android.vending.billing.IInAppBillingService");
    }

    public final Bundle F2(int i, String str, List<String> list, String str2, String str3, String str4) throws RemoteException {
        Parcel B = B();
        B.writeInt(5);
        B.writeString(str);
        B.writeStringList(list);
        B.writeString(str2);
        B.writeString(str3);
        B.writeString((String) null);
        Parcel H = H(7, B);
        Bundle bundle = (Bundle) zzh.a(H, Bundle.CREATOR);
        H.recycle();
        return bundle;
    }

    public final int M0(int i, String str, String str2) throws RemoteException {
        Parcel B = B();
        B.writeInt(i);
        B.writeString(str);
        B.writeString(str2);
        Parcel H = H(1, B);
        int readInt = H.readInt();
        H.recycle();
        return readInt;
    }

    public final Bundle T6(int i, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel B = B();
        B.writeInt(9);
        B.writeString(str);
        B.writeString(str2);
        zzh.b(B, bundle);
        Parcel H = H(902, B);
        Bundle bundle2 = (Bundle) zzh.a(H, Bundle.CREATOR);
        H.recycle();
        return bundle2;
    }

    public final Bundle U5(int i, String str, String str2, Bundle bundle, Bundle bundle2) throws RemoteException {
        Parcel B = B();
        B.writeInt(10);
        B.writeString(str);
        B.writeString(str2);
        zzh.b(B, bundle);
        zzh.b(B, bundle2);
        Parcel H = H(901, B);
        Bundle bundle3 = (Bundle) zzh.a(H, Bundle.CREATOR);
        H.recycle();
        return bundle3;
    }

    public final Bundle d7(int i, String str, String str2, String str3, String str4, Bundle bundle) throws RemoteException {
        Parcel B = B();
        B.writeInt(i);
        B.writeString(str);
        B.writeString(str2);
        B.writeString(str3);
        B.writeString(str4);
        zzh.b(B, bundle);
        Parcel H = H(8, B);
        Bundle bundle2 = (Bundle) zzh.a(H, Bundle.CREATOR);
        H.recycle();
        return bundle2;
    }

    public final Bundle j6(int i, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel B = B();
        B.writeInt(9);
        B.writeString(str);
        B.writeString(str2);
        zzh.b(B, bundle);
        Parcel H = H(12, B);
        Bundle bundle2 = (Bundle) zzh.a(H, Bundle.CREATOR);
        H.recycle();
        return bundle2;
    }

    public final Bundle n4(int i, String str, String str2, String str3, Bundle bundle) throws RemoteException {
        Parcel B = B();
        B.writeInt(9);
        B.writeString(str);
        B.writeString(str2);
        B.writeString(str3);
        zzh.b(B, bundle);
        Parcel H = H(11, B);
        Bundle bundle2 = (Bundle) zzh.a(H, Bundle.CREATOR);
        H.recycle();
        return bundle2;
    }

    public final Bundle o4(int i, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel B = B();
        B.writeInt(3);
        B.writeString(str);
        B.writeString(str2);
        zzh.b(B, bundle);
        Parcel H = H(2, B);
        Bundle bundle2 = (Bundle) zzh.a(H, Bundle.CREATOR);
        H.recycle();
        return bundle2;
    }

    public final Bundle p6(int i, String str, String str2, String str3, String str4) throws RemoteException {
        Parcel B = B();
        B.writeInt(3);
        B.writeString(str);
        B.writeString(str2);
        B.writeString(str3);
        B.writeString((String) null);
        Parcel H = H(3, B);
        Bundle bundle = (Bundle) zzh.a(H, Bundle.CREATOR);
        H.recycle();
        return bundle;
    }

    public final Bundle s6(int i, String str, String str2, String str3, Bundle bundle) throws RemoteException {
        Parcel B = B();
        B.writeInt(6);
        B.writeString(str);
        B.writeString(str2);
        B.writeString(str3);
        zzh.b(B, bundle);
        Parcel H = H(9, B);
        Bundle bundle2 = (Bundle) zzh.a(H, Bundle.CREATOR);
        H.recycle();
        return bundle2;
    }

    public final int t3(int i, String str, String str2) throws RemoteException {
        Parcel B = B();
        B.writeInt(3);
        B.writeString(str);
        B.writeString(str2);
        Parcel H = H(5, B);
        int readInt = H.readInt();
        H.recycle();
        return readInt;
    }

    public final Bundle y1(int i, String str, String str2, String str3) throws RemoteException {
        Parcel B = B();
        B.writeInt(3);
        B.writeString(str);
        B.writeString(str2);
        B.writeString(str3);
        Parcel H = H(4, B);
        Bundle bundle = (Bundle) zzh.a(H, Bundle.CREATOR);
        H.recycle();
        return bundle;
    }
}
