package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzaeq implements NativeCustomTemplateAd {

    /* renamed from: a  reason: collision with root package name */
    private final zzaep f5848a;

    /* renamed from: b  reason: collision with root package name */
    private final MediaView f5849b;

    /* renamed from: c  reason: collision with root package name */
    private final VideoController f5850c = new VideoController();

    /* renamed from: d  reason: collision with root package name */
    private NativeCustomTemplateAd.DisplayOpenMeasurement f5851d;

    @VisibleForTesting
    public zzaeq(zzaep zzaep) {
        Context context;
        this.f5848a = zzaep;
        MediaView mediaView = null;
        try {
            context = (Context) ObjectWrapper.V(zzaep.m6());
        } catch (RemoteException | NullPointerException e2) {
            zzbba.c("", e2);
            context = null;
        }
        if (context != null) {
            MediaView mediaView2 = new MediaView(context);
            try {
                if (this.f5848a.G3(ObjectWrapper.h0(mediaView2))) {
                    mediaView = mediaView2;
                }
            } catch (RemoteException e3) {
                zzbba.c("", e3);
            }
        }
        this.f5849b = mediaView;
    }

    public final zzaep a() {
        return this.f5848a;
    }

    public final void destroy() {
        try {
            this.f5848a.destroy();
        } catch (RemoteException e2) {
            zzbba.c("", e2);
        }
    }

    public final List<String> getAvailableAssetNames() {
        try {
            return this.f5848a.getAvailableAssetNames();
        } catch (RemoteException e2) {
            zzbba.c("", e2);
            return null;
        }
    }

    public final String getCustomTemplateId() {
        try {
            return this.f5848a.getCustomTemplateId();
        } catch (RemoteException e2) {
            zzbba.c("", e2);
            return null;
        }
    }

    public final NativeCustomTemplateAd.DisplayOpenMeasurement getDisplayOpenMeasurement() {
        try {
            if (this.f5851d == null && this.f5848a.A5()) {
                this.f5851d = new zzadp(this.f5848a);
            }
        } catch (RemoteException e2) {
            zzbba.c("", e2);
        }
        return this.f5851d;
    }

    public final NativeAd.Image getImage(String str) {
        try {
            zzadt r5 = this.f5848a.r5(str);
            if (r5 != null) {
                return new zzadu(r5);
            }
            return null;
        } catch (RemoteException e2) {
            zzbba.c("", e2);
            return null;
        }
    }

    public final CharSequence getText(String str) {
        try {
            return this.f5848a.l4(str);
        } catch (RemoteException e2) {
            zzbba.c("", e2);
            return null;
        }
    }

    public final VideoController getVideoController() {
        try {
            zzyi videoController = this.f5848a.getVideoController();
            if (videoController != null) {
                this.f5850c.zza(videoController);
            }
        } catch (RemoteException e2) {
            zzbba.c("Exception occurred while getting video controller", e2);
        }
        return this.f5850c;
    }

    public final MediaView getVideoMediaView() {
        return this.f5849b;
    }

    public final void performClick(String str) {
        try {
            this.f5848a.performClick(str);
        } catch (RemoteException e2) {
            zzbba.c("", e2);
        }
    }

    public final void recordImpression() {
        try {
            this.f5848a.recordImpression();
        } catch (RemoteException e2) {
            zzbba.c("", e2);
        }
    }
}
