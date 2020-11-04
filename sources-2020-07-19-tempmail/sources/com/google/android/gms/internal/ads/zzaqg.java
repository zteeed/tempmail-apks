package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzaqg extends RemoteCreator<zzaqj> {
    public zzaqg() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        if (queryLocalInterface instanceof zzaqj) {
            return (zzaqj) queryLocalInterface;
        }
        return new zzaqm(iBinder);
    }

    public final zzaqi c(Activity activity) {
        try {
            IBinder H2 = ((zzaqj) b(activity)).H2(ObjectWrapper.b0(activity));
            if (H2 == null) {
                return null;
            }
            IInterface queryLocalInterface = H2.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            if (queryLocalInterface instanceof zzaqi) {
                return (zzaqi) queryLocalInterface;
            }
            return new zzaqk(H2);
        } catch (RemoteException e2) {
            zzbba.d("Could not create remote AdOverlay.", e2);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e3) {
            zzbba.d("Could not create remote AdOverlay.", e3);
            return null;
        }
    }
}
