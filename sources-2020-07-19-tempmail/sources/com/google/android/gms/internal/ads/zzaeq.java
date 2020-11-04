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
    private final zzaep f5665a;

    /* renamed from: b  reason: collision with root package name */
    private final MediaView f5666b;

    /* renamed from: c  reason: collision with root package name */
    private final VideoController f5667c = new VideoController();

    /* renamed from: d  reason: collision with root package name */
    private NativeCustomTemplateAd.DisplayOpenMeasurement f5668d;

    @VisibleForTesting
    public zzaeq(zzaep zzaep) {
        Context context;
        this.f5665a = zzaep;
        MediaView mediaView = null;
        try {
            context = (Context) ObjectWrapper.P(zzaep.N5());
        } catch (RemoteException | NullPointerException e2) {
            zzbba.c("", e2);
            context = null;
        }
        if (context != null) {
            MediaView mediaView2 = new MediaView(context);
            try {
                if (this.f5665a.r3(ObjectWrapper.b0(mediaView2))) {
                    mediaView = mediaView2;
                }
            } catch (RemoteException e3) {
                zzbba.c("", e3);
            }
        }
        this.f5666b = mediaView;
    }

    public final zzaep a() {
        return this.f5665a;
    }

    public final void destroy() {
        try {
            this.f5665a.destroy();
        } catch (RemoteException e2) {
            zzbba.c("", e2);
        }
    }

    public final List<String> getAvailableAssetNames() {
        try {
            return this.f5665a.getAvailableAssetNames();
        } catch (RemoteException e2) {
            zzbba.c("", e2);
            return null;
        }
    }

    public final String getCustomTemplateId() {
        try {
            return this.f5665a.getCustomTemplateId();
        } catch (RemoteException e2) {
            zzbba.c("", e2);
            return null;
        }
    }

    public final NativeCustomTemplateAd.DisplayOpenMeasurement getDisplayOpenMeasurement() {
        try {
            if (this.f5668d == null && this.f5665a.e5()) {
                this.f5668d = new zzadp(this.f5665a);
            }
        } catch (RemoteException e2) {
            zzbba.c("", e2);
        }
        return this.f5668d;
    }

    public final NativeAd.Image getImage(String str) {
        try {
            zzadt W4 = this.f5665a.W4(str);
            if (W4 != null) {
                return new zzadu(W4);
            }
            return null;
        } catch (RemoteException e2) {
            zzbba.c("", e2);
            return null;
        }
    }

    public final CharSequence getText(String str) {
        try {
            return this.f5665a.T3(str);
        } catch (RemoteException e2) {
            zzbba.c("", e2);
            return null;
        }
    }

    public final VideoController getVideoController() {
        try {
            zzyi videoController = this.f5665a.getVideoController();
            if (videoController != null) {
                this.f5667c.zza(videoController);
            }
        } catch (RemoteException e2) {
            zzbba.c("Exception occurred while getting video controller", e2);
        }
        return this.f5667c;
    }

    public final MediaView getVideoMediaView() {
        return this.f5666b;
    }

    public final void performClick(String str) {
        try {
            this.f5665a.performClick(str);
        } catch (RemoteException e2) {
            zzbba.c("", e2);
        }
    }

    public final void recordImpression() {
        try {
            this.f5665a.recordImpression();
        } catch (RemoteException e2) {
            zzbba.c("", e2);
        }
    }
}
