package com.google.android.gms.ads.formats;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaea;
import com.google.android.gms.internal.ads.zzbba;
import com.google.android.gms.internal.ads.zzwg;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class NativeAdViewHolder {
    public static WeakHashMap<View, NativeAdViewHolder> zzbnp = new WeakHashMap<>();
    private zzaea zzbno;
    private WeakReference<View> zzbnq;

    public NativeAdViewHolder(View view, Map<String, View> map, Map<String, View> map2) {
        Preconditions.l(view, "ContainerView must not be null");
        if ((view instanceof NativeAdView) || (view instanceof UnifiedNativeAdView)) {
            zzbba.g("The provided containerView is of type of NativeAdView, which cannot be usedwith NativeAdViewHolder.");
        } else if (zzbnp.get(view) != null) {
            zzbba.g("The provided containerView is already in use with another NativeAdViewHolder.");
        } else {
            zzbnp.put(view, this);
            this.zzbnq = new WeakReference<>(view);
            this.zzbno = zzwg.b().b(view, zzb(map), zzb(map2));
        }
    }

    private final void zza(IObjectWrapper iObjectWrapper) {
        WeakReference<View> weakReference = this.zzbnq;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null) {
            zzbba.i("NativeAdViewHolder.setNativeAd containerView doesn't exist, returning");
            return;
        }
        if (!zzbnp.containsKey(view)) {
            zzbnp.put(view, this);
        }
        zzaea zzaea = this.zzbno;
        if (zzaea != null) {
            try {
                zzaea.z(iObjectWrapper);
            } catch (RemoteException e2) {
                zzbba.c("Unable to call setNativeAd on delegate", e2);
            }
        }
    }

    private static HashMap<String, View> zzb(Map<String, View> map) {
        if (map == null) {
            return new HashMap<>();
        }
        return new HashMap<>(map);
    }

    public final void setClickConfirmingView(View view) {
        try {
            this.zzbno.I(ObjectWrapper.b0(view));
        } catch (RemoteException e2) {
            zzbba.c("Unable to call setClickConfirmingView on delegate", e2);
        }
    }

    public final void setNativeAd(NativeAd nativeAd) {
        zza((IObjectWrapper) nativeAd.zzjr());
    }

    public final void unregisterNativeAd() {
        zzaea zzaea = this.zzbno;
        if (zzaea != null) {
            try {
                zzaea.p5();
            } catch (RemoteException e2) {
                zzbba.c("Unable to call unregisterNativeAd on delegate", e2);
            }
        }
        WeakReference<View> weakReference = this.zzbnq;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null) {
            zzbnp.remove(view);
        }
    }

    public final void setNativeAd(UnifiedNativeAd unifiedNativeAd) {
        zza((IObjectWrapper) unifiedNativeAd.zzjr());
    }
}
