package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.instream.InstreamAd;
import com.google.android.gms.ads.instream.InstreamAdView;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzajb extends InstreamAd {

    /* renamed from: a  reason: collision with root package name */
    private final zzaiq f5922a;

    /* renamed from: b  reason: collision with root package name */
    private VideoController f5923b = a();

    /* renamed from: c  reason: collision with root package name */
    private MediaContent f5924c = b();

    public zzajb(zzaiq zzaiq) {
        this.f5922a = zzaiq;
    }

    private final VideoController a() {
        VideoController videoController = new VideoController();
        try {
            videoController.zza(this.f5922a.getVideoController());
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
        return videoController;
    }

    private final MediaContent b() {
        try {
            if (this.f5922a.l0() != null) {
                return new zzzc(this.f5922a.l0());
            }
            return null;
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
            return null;
        }
    }

    public final void destroy() {
        try {
            this.f5922a.destroy();
            this.f5923b = null;
            this.f5924c = null;
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final float getAspectRatio() {
        VideoController videoController = this.f5923b;
        if (videoController == null) {
            return 0.0f;
        }
        return videoController.getAspectRatio();
    }

    public final MediaContent getMediaContent() {
        return this.f5924c;
    }

    public final VideoController getVideoController() {
        return this.f5923b;
    }

    public final float getVideoCurrentTime() {
        VideoController videoController = this.f5923b;
        if (videoController == null) {
            return 0.0f;
        }
        return videoController.getVideoCurrentTime();
    }

    public final float getVideoDuration() {
        VideoController videoController = this.f5923b;
        if (videoController == null) {
            return 0.0f;
        }
        return videoController.getVideoDuration();
    }

    public final void zza(InstreamAdView instreamAdView) {
        if (instreamAdView == null) {
            zzbba.g("showInView: parameter view must not be null.");
            return;
        }
        try {
            this.f5922a.R4(ObjectWrapper.h0(instreamAdView));
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }
}
