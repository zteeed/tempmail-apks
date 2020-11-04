package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public abstract class zzane extends zzgt implements zzanf {
    public zzane() {
        super("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                String e2 = e();
                parcel2.writeNoException();
                parcel2.writeString(e2);
                return true;
            case 3:
                List k = k();
                parcel2.writeNoException();
                parcel2.writeList(k);
                return true;
            case 4:
                String j = j();
                parcel2.writeNoException();
                parcel2.writeString(j);
                return true;
            case 5:
                zzadt n0 = n0();
                parcel2.writeNoException();
                zzgw.c(parcel2, n0);
                return true;
            case 6:
                String i3 = i();
                parcel2.writeNoException();
                parcel2.writeString(i3);
                return true;
            case 7:
                String q = q();
                parcel2.writeNoException();
                parcel2.writeString(q);
                return true;
            case 8:
                recordImpression();
                parcel2.writeNoException();
                return true;
            case 9:
                D(IObjectWrapper.Stub.H(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 10:
                O(IObjectWrapper.Stub.H(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 11:
                boolean v = v();
                parcel2.writeNoException();
                zzgw.a(parcel2, v);
                return true;
            case 12:
                boolean G = G();
                parcel2.writeNoException();
                zzgw.a(parcel2, G);
                return true;
            case 13:
                Bundle extras = getExtras();
                parcel2.writeNoException();
                zzgw.g(parcel2, extras);
                return true;
            case 14:
                t(IObjectWrapper.Stub.H(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 15:
                IObjectWrapper z = z();
                parcel2.writeNoException();
                zzgw.c(parcel2, z);
                return true;
            case 16:
                zzyi videoController = getVideoController();
                parcel2.writeNoException();
                zzgw.c(parcel2, videoController);
                return true;
            case 19:
                zzadl g = g();
                parcel2.writeNoException();
                zzgw.c(parcel2, g);
                return true;
            case 20:
                IObjectWrapper x = x();
                parcel2.writeNoException();
                zzgw.c(parcel2, x);
                return true;
            case 21:
                IObjectWrapper f2 = f();
                parcel2.writeNoException();
                zzgw.c(parcel2, f2);
                return true;
            case 22:
                w(IObjectWrapper.Stub.H(parcel.readStrongBinder()), IObjectWrapper.Stub.H(parcel.readStrongBinder()), IObjectWrapper.Stub.H(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
