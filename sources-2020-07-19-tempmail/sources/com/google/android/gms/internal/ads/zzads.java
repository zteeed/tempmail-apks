package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public abstract class zzads extends zzgt implements zzadt {
    public zzads() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public static zzadt z6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        if (queryLocalInterface instanceof zzadt) {
            return (zzadt) queryLocalInterface;
        }
        return new zzadv(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            IObjectWrapper s2 = s2();
            parcel2.writeNoException();
            zzgw.c(parcel2, s2);
        } else if (i == 2) {
            Uri e0 = e0();
            parcel2.writeNoException();
            zzgw.g(parcel2, e0);
        } else if (i == 3) {
            double E3 = E3();
            parcel2.writeNoException();
            parcel2.writeDouble(E3);
        } else if (i == 4) {
            int width = getWidth();
            parcel2.writeNoException();
            parcel2.writeInt(width);
        } else if (i != 5) {
            return false;
        } else {
            int height = getHeight();
            parcel2.writeNoException();
            parcel2.writeInt(height);
        }
        return true;
    }
}
