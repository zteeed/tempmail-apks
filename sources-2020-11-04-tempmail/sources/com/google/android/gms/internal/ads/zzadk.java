package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public abstract class zzadk extends zzgt implements zzadl {
    public zzadk() {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    public static zzadl e7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        if (queryLocalInterface instanceof zzadl) {
            return (zzadl) queryLocalInterface;
        }
        return new zzadn(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            String O0 = O0();
            parcel2.writeNoException();
            parcel2.writeString(O0);
            return true;
        } else if (i != 3) {
            return false;
        } else {
            List<zzadt> Z6 = Z6();
            parcel2.writeNoException();
            parcel2.writeList(Z6);
            return true;
        }
    }
}
