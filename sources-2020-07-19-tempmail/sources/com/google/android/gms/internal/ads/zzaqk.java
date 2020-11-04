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
        Parcel y = y();
        y.writeInt(i);
        y.writeInt(i2);
        zzgw.d(y, intent);
        P(12, y);
    }

    public final void onBackPressed() throws RemoteException {
        P(10, y());
    }

    public final void onCreate(Bundle bundle) throws RemoteException {
        Parcel y = y();
        zzgw.d(y, bundle);
        P(1, y);
    }

    public final void onDestroy() throws RemoteException {
        P(8, y());
    }

    public final void onPause() throws RemoteException {
        P(5, y());
    }

    public final void onRestart() throws RemoteException {
        P(2, y());
    }

    public final void onResume() throws RemoteException {
        P(4, y());
    }

    public final void onSaveInstanceState(Bundle bundle) throws RemoteException {
        Parcel y = y();
        zzgw.d(y, bundle);
        Parcel E = E(6, y);
        if (E.readInt() != 0) {
            bundle.readFromParcel(E);
        }
        E.recycle();
    }

    public final void onStart() throws RemoteException {
        P(3, y());
    }

    public final void onStop() throws RemoteException {
        P(7, y());
    }

    public final void zzad(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        P(13, y);
    }

    public final void zzdp() throws RemoteException {
        P(9, y());
    }

    public final boolean zzul() throws RemoteException {
        Parcel E = E(11, y());
        boolean e2 = zzgw.e(E);
        E.recycle();
        return e2;
    }
}
