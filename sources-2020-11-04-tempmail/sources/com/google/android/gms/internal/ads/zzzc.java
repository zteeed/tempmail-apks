package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzzc implements MediaContent {

    /* renamed from: a  reason: collision with root package name */
    private final zzado f9447a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoController f9448b = new VideoController();

    public zzzc(zzado zzado) {
        this.f9447a = zzado;
    }

    public final zzado a() {
        return this.f9447a;
    }

    public final float getAspectRatio() {
        try {
            return this.f9447a.getAspectRatio();
        } catch (RemoteException e2) {
            zzbba.c("", e2);
            return 0.0f;
        }
    }

    public final float getCurrentTime() {
        try {
            return this.f9447a.getCurrentTime();
        } catch (RemoteException e2) {
            zzbba.c("", e2);
            return 0.0f;
        }
    }

    public final float getDuration() {
        try {
            return this.f9447a.getDuration();
        } catch (RemoteException e2) {
            zzbba.c("", e2);
            return 0.0f;
        }
    }

    public final Drawable getMainImage() {
        try {
            IObjectWrapper Z2 = this.f9447a.Z2();
            if (Z2 != null) {
                return (Drawable) ObjectWrapper.V(Z2);
            }
            return null;
        } catch (RemoteException e2) {
            zzbba.c("", e2);
            return null;
        }
    }

    public final VideoController getVideoController() {
        try {
            if (this.f9447a.getVideoController() != null) {
                this.f9448b.zza(this.f9447a.getVideoController());
            }
        } catch (RemoteException e2) {
            zzbba.c("Exception occurred while getting video controller", e2);
        }
        return this.f9448b;
    }

    public final boolean hasVideoContent() {
        try {
            return this.f9447a.hasVideoContent();
        } catch (RemoteException e2) {
            zzbba.c("", e2);
            return false;
        }
    }

    public final void setMainImage(Drawable drawable) {
        try {
            this.f9447a.d1(ObjectWrapper.h0(drawable));
        } catch (RemoteException e2) {
            zzbba.c("", e2);
        }
    }
}
