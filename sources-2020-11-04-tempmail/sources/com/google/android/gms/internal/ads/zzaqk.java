package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzaqk extends zzgu implements zzaqi {
    zzaqk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public final void onActivityResult(int i, int i2, Intent intent) throws RemoteException {
        Parcel B = B();
        B.writeInt(i);
        B.writeInt(i2);
        zzgw.d(B, intent);
        V(12, B);
    }

    public final void onBackPressed() throws RemoteException {
        V(10, B());
    }

    public final void onCreate(Bundle bundle) throws RemoteException {
        Parcel B = B();
        zzgw.d(B, bundle);
        V(1, B);
    }

    public final void onDestroy() throws RemoteException {
        V(8, B());
    }

    public final void onPause() throws RemoteException {
        V(5, B());
    }

    public final void onRestart() throws RemoteException {
        V(2, B());
    }

    public final void onResume() throws RemoteException {
        V(4, B());
    }

    public final void onSaveInstanceState(Bundle bundle) throws RemoteException {
        Parcel B = B();
        zzgw.d(B, bundle);
        Parcel H = H(6, B);
        if (H.readInt() != 0) {
            bundle.readFromParcel(H);
        }
        H.recycle();
    }

    public final void onStart() throws RemoteException {
        V(3, B());
    }

    public final void onStop() throws RemoteException {
        V(7, B());
    }

    public final void zzad(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        V(13, B);
    }

    public final void zzdp() throws RemoteException {
        V(9, B());
    }

    public final boolean zzul() throws RemoteException {
        Parcel H = H(11, B());
        boolean e2 = zzgw.e(H);
        H.recycle();
        return e2;
    }
}
