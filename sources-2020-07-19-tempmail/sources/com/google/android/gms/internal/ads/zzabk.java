package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.doubleclick.CustomRenderedAd;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzabk implements CustomRenderedAd {

    /* renamed from: a  reason: collision with root package name */
    private final zzabn f5559a;

    public zzabk(zzabn zzabn) {
        this.f5559a = zzabn;
    }

    public final String getBaseUrl() {
        try {
            return this.f5559a.f1();
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
            return null;
        }
    }

    public final String getContent() {
        try {
            return this.f5559a.getContent();
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
            return null;
        }
    }

    public final void onAdRendered(View view) {
        try {
            this.f5559a.P1(view != null ? ObjectWrapper.b0(view) : null);
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void recordClick() {
        try {
            this.f5559a.recordClick();
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void recordImpression() {
        try {
            this.f5559a.recordImpression();
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }
}
