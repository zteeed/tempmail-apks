package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

public final class l0 extends d0 implements n0 {
    l0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
    }

    public final void B5(String str, Bundle bundle, Bundle bundle2, p0 p0Var) throws RemoteException {
        Parcel B = B();
        B.writeString(str);
        f0.c(B, bundle);
        f0.c(B, bundle2);
        f0.b(B, p0Var);
        H(11, B);
    }

    public final void D2(String str, Bundle bundle, p0 p0Var) throws RemoteException {
        Parcel B = B();
        B.writeString(str);
        f0.c(B, bundle);
        f0.b(B, p0Var);
        H(10, B);
    }

    public final void S2(String str, Bundle bundle, Bundle bundle2, p0 p0Var) throws RemoteException {
        Parcel B = B();
        B.writeString(str);
        f0.c(B, bundle);
        f0.c(B, bundle2);
        f0.b(B, p0Var);
        H(6, B);
    }

    public final void T5(String str, List<Bundle> list, Bundle bundle, p0 p0Var) throws RemoteException {
        Parcel B = B();
        B.writeString(str);
        B.writeTypedList(list);
        f0.c(B, bundle);
        f0.b(B, p0Var);
        H(14, B);
    }

    public final void j4(String str, Bundle bundle, Bundle bundle2, p0 p0Var) throws RemoteException {
        Parcel B = B();
        B.writeString(str);
        f0.c(B, bundle);
        f0.c(B, bundle2);
        f0.b(B, p0Var);
        H(9, B);
    }

    public final void q3(String str, Bundle bundle, p0 p0Var) throws RemoteException {
        Parcel B = B();
        B.writeString(str);
        f0.c(B, bundle);
        f0.b(B, p0Var);
        H(5, B);
    }

    public final void u3(String str, Bundle bundle, Bundle bundle2, p0 p0Var) throws RemoteException {
        Parcel B = B();
        B.writeString(str);
        f0.c(B, bundle);
        f0.c(B, bundle2);
        f0.b(B, p0Var);
        H(7, B);
    }
}
