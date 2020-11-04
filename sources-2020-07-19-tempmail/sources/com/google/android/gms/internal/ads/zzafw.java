package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzafw extends RemoteCreator<zzaef> {
    @VisibleForTesting
    public zzafw() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        if (queryLocalInterface instanceof zzaef) {
            return (zzaef) queryLocalInterface;
        }
        return new zzaee(iBinder);
    }

    public final zzaea c(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        try {
            IBinder o5 = ((zzaef) b(view.getContext())).o5(ObjectWrapper.b0(view), ObjectWrapper.b0(hashMap), ObjectWrapper.b0(hashMap2));
            if (o5 == null) {
                return null;
            }
            IInterface queryLocalInterface = o5.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
            if (queryLocalInterface instanceof zzaea) {
                return (zzaea) queryLocalInterface;
            }
            return new zzaec(o5);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e2) {
            zzbba.d("Could not create remote NativeAdViewHolderDelegate.", e2);
            return null;
        }
    }
}
