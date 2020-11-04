package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public abstract class zzaeo extends zzgt implements zzaep {
    public zzaeo() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public static zzaep z6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        if (queryLocalInterface instanceof zzaep) {
            return (zzaep) queryLocalInterface;
        }
        return new zzaer(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                String T3 = T3(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(T3);
                return true;
            case 2:
                zzadt W4 = W4(parcel.readString());
                parcel2.writeNoException();
                zzgw.c(parcel2, W4);
                return true;
            case 3:
                List<String> availableAssetNames = getAvailableAssetNames();
                parcel2.writeNoException();
                parcel2.writeStringList(availableAssetNames);
                return true;
            case 4:
                String customTemplateId = getCustomTemplateId();
                parcel2.writeNoException();
                parcel2.writeString(customTemplateId);
                return true;
            case 5:
                performClick(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                recordImpression();
                parcel2.writeNoException();
                return true;
            case 7:
                zzyi videoController = getVideoController();
                parcel2.writeNoException();
                zzgw.c(parcel2, videoController);
                return true;
            case 8:
                destroy();
                parcel2.writeNoException();
                return true;
            case 9:
                IObjectWrapper N5 = N5();
                parcel2.writeNoException();
                zzgw.c(parcel2, N5);
                return true;
            case 10:
                boolean r3 = r3(IObjectWrapper.Stub.E(parcel.readStrongBinder()));
                parcel2.writeNoException();
                zzgw.a(parcel2, r3);
                return true;
            case 11:
                IObjectWrapper m = m();
                parcel2.writeNoException();
                zzgw.c(parcel2, m);
                return true;
            case 12:
                boolean e5 = e5();
                parcel2.writeNoException();
                zzgw.a(parcel2, e5);
                return true;
            case 13:
                boolean b4 = b4();
                parcel2.writeNoException();
                zzgw.a(parcel2, b4);
                return true;
            case 14:
                E2(IObjectWrapper.Stub.E(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 15:
                g3();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
