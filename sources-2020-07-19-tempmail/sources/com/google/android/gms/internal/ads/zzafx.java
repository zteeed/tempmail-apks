package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzafx extends RemoteCreator<zzady> {
    @VisibleForTesting
    public zzafx() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        if (queryLocalInterface instanceof zzady) {
            return (zzady) queryLocalInterface;
        }
        return new zzaeb(iBinder);
    }

    public final zzadx c(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        try {
            IBinder c3 = ((zzady) b(context)).c3(ObjectWrapper.b0(context), ObjectWrapper.b0(frameLayout), ObjectWrapper.b0(frameLayout2), 201604000);
            if (c3 == null) {
                return null;
            }
            IInterface queryLocalInterface = c3.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            if (queryLocalInterface instanceof zzadx) {
                return (zzadx) queryLocalInterface;
            }
            return new zzadz(c3);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e2) {
            zzbba.d("Could not create remote NativeAdViewDelegate.", e2);
            return null;
        }
    }
}
