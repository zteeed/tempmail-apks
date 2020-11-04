package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public abstract class zzand extends zzgt implements zzana {
    public zzand() {
        super("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                String d2 = d();
                parcel2.writeNoException();
                parcel2.writeString(d2);
                return true;
            case 3:
                List j = j();
                parcel2.writeNoException();
                parcel2.writeList(j);
                return true;
            case 4:
                String i3 = i();
                parcel2.writeNoException();
                parcel2.writeString(i3);
                return true;
            case 5:
                zzadt k = k();
                parcel2.writeNoException();
                zzgw.c(parcel2, k);
                return true;
            case 6:
                String h = h();
                parcel2.writeNoException();
                parcel2.writeString(h);
                return true;
            case 7:
                double n = n();
                parcel2.writeNoException();
                parcel2.writeDouble(n);
                return true;
            case 8:
                String p = p();
                parcel2.writeNoException();
                parcel2.writeString(p);
                return true;
            case 9:
                String l = l();
                parcel2.writeNoException();
                parcel2.writeString(l);
                return true;
            case 10:
                recordImpression();
                parcel2.writeNoException();
                return true;
            case 11:
                A(IObjectWrapper.Stub.E(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 12:
                K(IObjectWrapper.Stub.E(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 13:
                boolean t = t();
                parcel2.writeNoException();
                zzgw.a(parcel2, t);
                return true;
            case 14:
                boolean D = D();
                parcel2.writeNoException();
                zzgw.a(parcel2, D);
                return true;
            case 15:
                Bundle extras = getExtras();
                parcel2.writeNoException();
                zzgw.g(parcel2, extras);
                return true;
            case 16:
                r(IObjectWrapper.Stub.E(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 17:
                zzyi videoController = getVideoController();
                parcel2.writeNoException();
                zzgw.c(parcel2, videoController);
                return true;
            case 18:
                IObjectWrapper w = w();
                parcel2.writeNoException();
                zzgw.c(parcel2, w);
                return true;
            case 19:
                zzadl f2 = f();
                parcel2.writeNoException();
                zzgw.c(parcel2, f2);
                return true;
            case 20:
                IObjectWrapper v = v();
                parcel2.writeNoException();
                zzgw.c(parcel2, v);
                return true;
            case 21:
                IObjectWrapper e2 = e();
                parcel2.writeNoException();
                zzgw.c(parcel2, e2);
                return true;
            case 22:
                u(IObjectWrapper.Stub.E(parcel.readStrongBinder()), IObjectWrapper.Stub.E(parcel.readStrongBinder()), IObjectWrapper.Stub.E(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
