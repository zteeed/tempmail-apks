package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public abstract class zzaek extends zzgt implements zzael {
    public zzaek() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                IObjectWrapper m = m();
                parcel2.writeNoException();
                zzgw.c(parcel2, m);
                return true;
            case 3:
                String d2 = d();
                parcel2.writeNoException();
                parcel2.writeString(d2);
                return true;
            case 4:
                List j = j();
                parcel2.writeNoException();
                parcel2.writeList(j);
                return true;
            case 5:
                String i3 = i();
                parcel2.writeNoException();
                parcel2.writeString(i3);
                return true;
            case 6:
                zzadt h0 = h0();
                parcel2.writeNoException();
                zzgw.c(parcel2, h0);
                return true;
            case 7:
                String h = h();
                parcel2.writeNoException();
                parcel2.writeString(h);
                return true;
            case 8:
                String o = o();
                parcel2.writeNoException();
                parcel2.writeString(o);
                return true;
            case 9:
                Bundle extras = getExtras();
                parcel2.writeNoException();
                zzgw.g(parcel2, extras);
                return true;
            case 10:
                destroy();
                parcel2.writeNoException();
                return true;
            case 11:
                zzyi videoController = getVideoController();
                parcel2.writeNoException();
                zzgw.c(parcel2, videoController);
                return true;
            case 12:
                s((Bundle) zzgw.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                boolean x = x((Bundle) zzgw.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                zzgw.a(parcel2, x);
                return true;
            case 14:
                C((Bundle) zzgw.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                zzadl f2 = f();
                parcel2.writeNoException();
                zzgw.c(parcel2, f2);
                return true;
            case 16:
                IObjectWrapper e2 = e();
                parcel2.writeNoException();
                zzgw.c(parcel2, e2);
                return true;
            case 17:
                String mediationAdapterClassName = getMediationAdapterClassName();
                parcel2.writeNoException();
                parcel2.writeString(mediationAdapterClassName);
                return true;
            default:
                return false;
        }
    }
}
