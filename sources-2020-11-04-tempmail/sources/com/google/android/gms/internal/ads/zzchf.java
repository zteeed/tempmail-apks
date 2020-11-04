package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzchf extends VideoController.VideoLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    private final zzcck f7242a;

    public zzchf(zzcck zzcck) {
        this.f7242a = zzcck;
    }

    private static zzyj a(zzcck zzcck) {
        zzyi n = zzcck.n();
        if (n == null) {
            return null;
        }
        try {
            return n.c6();
        } catch (RemoteException unused) {
            return null;
        }
    }

    public final void onVideoEnd() {
        zzyj a2 = a(this.f7242a);
        if (a2 != null) {
            try {
                a2.Y();
            } catch (RemoteException e2) {
                zzbba.d("Unable to call onVideoEnd()", e2);
            }
        }
    }

    public final void onVideoPause() {
        zzyj a2 = a(this.f7242a);
        if (a2 != null) {
            try {
                a2.onVideoPause();
            } catch (RemoteException e2) {
                zzbba.d("Unable to call onVideoEnd()", e2);
            }
        }
    }

    public final void onVideoStart() {
        zzyj a2 = a(this.f7242a);
        if (a2 != null) {
            try {
                a2.onVideoStart();
            } catch (RemoteException e2) {
                zzbba.d("Unable to call onVideoEnd()", e2);
            }
        }
    }
}
