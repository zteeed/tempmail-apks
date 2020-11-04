package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.formats.ShouldDelayBannerRenderingListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzzy extends zzafm {

    /* renamed from: b  reason: collision with root package name */
    private final ShouldDelayBannerRenderingListener f9460b;

    public zzzy(ShouldDelayBannerRenderingListener shouldDelayBannerRenderingListener) {
        this.f9460b = shouldDelayBannerRenderingListener;
    }

    public final boolean e6(IObjectWrapper iObjectWrapper) throws RemoteException {
        return this.f9460b.shouldDelayBannerRendering((Runnable) ObjectWrapper.V(iObjectWrapper));
    }
}
