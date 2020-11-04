package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public abstract class zzaeg extends zzgt implements zzaeh {
    public zzaeg() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                IObjectWrapper o = o();
                parcel2.writeNoException();
                zzgw.c(parcel2, o);
                return true;
            case 3:
                String e2 = e();
                parcel2.writeNoException();
                parcel2.writeString(e2);
                return true;
            case 4:
                List k = k();
                parcel2.writeNoException();
                parcel2.writeList(k);
                return true;
            case 5:
                String j = j();
                parcel2.writeNoException();
                parcel2.writeString(j);
                return true;
            case 6:
                zzadt m = m();
                parcel2.writeNoException();
                zzgw.c(parcel2, m);
                return true;
            case 7:
                String i3 = i();
                parcel2.writeNoException();
                parcel2.writeString(i3);
                return true;
            case 8:
                double p = p();
                parcel2.writeNoException();
                parcel2.writeDouble(p);
                return true;
            case 9:
                String r = r();
                parcel2.writeNoException();
                parcel2.writeString(r);
                return true;
            case 10:
                String n = n();
                parcel2.writeNoException();
                parcel2.writeString(n);
                return true;
            case 11:
                Bundle extras = getExtras();
                parcel2.writeNoException();
                zzgw.g(parcel2, extras);
                return true;
            case 12:
                destroy();
                parcel2.writeNoException();
                return true;
            case 13:
                zzyi videoController = getVideoController();
                parcel2.writeNoException();
                zzgw.c(parcel2, videoController);
                return true;
            case 14:
                u((Bundle) zzgw.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                boolean A = A((Bundle) zzgw.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                zzgw.a(parcel2, A);
                return true;
            case 16:
                F((Bundle) zzgw.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 17:
                zzadl g = g();
                parcel2.writeNoException();
                zzgw.c(parcel2, g);
                return true;
            case 18:
                IObjectWrapper f2 = f();
                parcel2.writeNoException();
                zzgw.c(parcel2, f2);
                return true;
            case 19:
                String mediationAdapterClassName = getMediationAdapterClassName();
                parcel2.writeNoException();
                parcel2.writeString(mediationAdapterClassName);
                return true;
            default:
                return false;
        }
    }
}
