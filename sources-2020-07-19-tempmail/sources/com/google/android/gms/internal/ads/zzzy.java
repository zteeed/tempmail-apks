package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.formats.ShouldDelayBannerRenderingListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzzy extends zzafm {

    /* renamed from: b  reason: collision with root package name */
    private final ShouldDelayBannerRenderingListener f9277b;

    public zzzy(ShouldDelayBannerRenderingListener shouldDelayBannerRenderingListener) {
        this.f9277b = shouldDelayBannerRenderingListener;
    }

    public final boolean G5(IObjectWrapper iObjectWrapper) throws RemoteException {
        return this.f9277b.shouldDelayBannerRendering((Runnable) ObjectWrapper.P(iObjectWrapper));
    }
}
