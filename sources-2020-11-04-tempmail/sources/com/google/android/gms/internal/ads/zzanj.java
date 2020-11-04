package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public abstract class zzanj extends zzgt implements zzang {
    public zzanj() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    public static zzang e7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        if (queryLocalInterface instanceof zzang) {
            return (zzang) queryLocalInterface;
        }
        return new zzani(iBinder);
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
                zzadt m = m();
                parcel2.writeNoException();
                zzgw.c(parcel2, m);
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
                zzyi videoController = getVideoController();
                parcel2.writeNoException();
                zzgw.c(parcel2, videoController);
                return true;
            case 12:
                zzadl g = g();
                parcel2.writeNoException();
                zzgw.c(parcel2, g);
                return true;
            case 13:
                IObjectWrapper z = z();
                parcel2.writeNoException();
                zzgw.c(parcel2, z);
                return true;
            case 14:
                IObjectWrapper x = x();
                parcel2.writeNoException();
                zzgw.c(parcel2, x);
                return true;
            case 15:
                IObjectWrapper f2 = f();
                parcel2.writeNoException();
                zzgw.c(parcel2, f2);
                return true;
            case 16:
                Bundle extras = getExtras();
                parcel2.writeNoException();
                zzgw.g(parcel2, extras);
                return true;
            case 17:
                boolean v = v();
                parcel2.writeNoException();
                zzgw.a(parcel2, v);
                return true;
            case 18:
                boolean G = G();
                parcel2.writeNoException();
                zzgw.a(parcel2, G);
                return true;
            case 19:
                recordImpression();
                parcel2.writeNoException();
                return true;
            case 20:
                D(IObjectWrapper.Stub.H(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 21:
                w(IObjectWrapper.Stub.H(parcel.readStrongBinder()), IObjectWrapper.Stub.H(parcel.readStrongBinder()), IObjectWrapper.Stub.H(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 22:
                t(IObjectWrapper.Stub.H(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 23:
                float W0 = W0();
                parcel2.writeNoException();
                parcel2.writeFloat(W0);
                return true;
            case 24:
                float c2 = c2();
                parcel2.writeNoException();
                parcel2.writeFloat(c2);
                return true;
            case 25:
                float K1 = K1();
                parcel2.writeNoException();
                parcel2.writeFloat(K1);
                return true;
            default:
                return false;
        }
    }
}
