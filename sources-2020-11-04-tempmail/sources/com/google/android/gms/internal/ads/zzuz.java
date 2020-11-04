package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzuz extends RemoteCreator<zzwu> {
    public zzuz() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        if (queryLocalInterface instanceof zzwu) {
            return (zzwu) queryLocalInterface;
        }
        return new zzwt(iBinder);
    }

    public final zzwp c(Context context, String str, zzamr zzamr) {
        try {
            IBinder R0 = ((zzwu) b(context)).R0(ObjectWrapper.h0(context), str, zzamr, 201604000);
            if (R0 == null) {
                return null;
            }
            IInterface queryLocalInterface = R0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            if (queryLocalInterface instanceof zzwp) {
                return (zzwp) queryLocalInterface;
            }
            return new zzwr(R0);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e2) {
            zzbba.d("Could not create remote builder for AdLoader.", e2);
            return null;
        }
    }
}
