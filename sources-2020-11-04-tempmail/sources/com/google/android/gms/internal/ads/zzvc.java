package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzvc extends RemoteCreator<zzwx> {
    @VisibleForTesting
    public zzvc() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        if (queryLocalInterface instanceof zzwx) {
            return (zzwx) queryLocalInterface;
        }
        return new zzxa(iBinder);
    }

    public final zzww c(Context context, zzvh zzvh, String str, zzamr zzamr, int i) {
        try {
            IBinder M5 = ((zzwx) b(context)).M5(ObjectWrapper.h0(context), zzvh, str, zzamr, 201604000, i);
            if (M5 == null) {
                return null;
            }
            IInterface queryLocalInterface = M5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof zzww) {
                return (zzww) queryLocalInterface;
            }
            return new zzwy(M5);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e2) {
            zzbba.b("Could not create remote AdManager.", e2);
            return null;
        }
    }
}
