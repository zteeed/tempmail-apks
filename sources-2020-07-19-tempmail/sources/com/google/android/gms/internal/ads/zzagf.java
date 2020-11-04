package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.formats.OnPublisherAdViewLoadedListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzagf extends zzafg {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final OnPublisherAdViewLoadedListener f5685b;

    public zzagf(OnPublisherAdViewLoadedListener onPublisherAdViewLoadedListener) {
        this.f5685b = onPublisherAdViewLoadedListener;
    }

    public final void k6(zzww zzww, IObjectWrapper iObjectWrapper) {
        if (zzww != null && iObjectWrapper != null) {
            PublisherAdView publisherAdView = new PublisherAdView((Context) ObjectWrapper.P(iObjectWrapper));
            AppEventListener appEventListener = null;
            try {
                if (zzww.zzkl() instanceof zzva) {
                    zzva zzva = (zzva) zzww.zzkl();
                    publisherAdView.setAdListener(zzva != null ? zzva.z6() : null);
                }
            } catch (RemoteException e2) {
                zzbba.c("", e2);
            }
            try {
                if (zzww.zzkk() instanceof zzvl) {
                    zzvl zzvl = (zzvl) zzww.zzkk();
                    if (zzvl != null) {
                        appEventListener = zzvl.A6();
                    }
                    publisherAdView.setAppEventListener(appEventListener);
                }
            } catch (RemoteException e3) {
                zzbba.c("", e3);
            }
            zzbaq.f6115b.post(new x(this, publisherAdView, zzww));
        }
    }
}
