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
    private final zzado f9264a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoController f9265b = new VideoController();

    public zzzc(zzado zzado) {
        this.f9264a = zzado;
    }

    public final zzado a() {
        return this.f9264a;
    }

    public final float getAspectRatio() {
        try {
            return this.f9264a.getAspectRatio();
        } catch (RemoteException e2) {
            zzbba.c("", e2);
            return 0.0f;
        }
    }

    public final float getCurrentTime() {
        try {
            return this.f9264a.getCurrentTime();
        } catch (RemoteException e2) {
            zzbba.c("", e2);
            return 0.0f;
        }
    }

    public final float getDuration() {
        try {
            return this.f9264a.getDuration();
        } catch (RemoteException e2) {
            zzbba.c("", e2);
            return 0.0f;
        }
    }

    public final Drawable getMainImage() {
        try {
            IObjectWrapper N2 = this.f9264a.N2();
            if (N2 != null) {
                return (Drawable) ObjectWrapper.P(N2);
            }
            return null;
        } catch (RemoteException e2) {
            zzbba.c("", e2);
            return null;
        }
    }

    public final VideoController getVideoController() {
        try {
            if (this.f9264a.getVideoController() != null) {
                this.f9265b.zza(this.f9264a.getVideoController());
            }
        } catch (RemoteException e2) {
            zzbba.c("Exception occurred while getting video controller", e2);
        }
        return this.f9265b;
    }

    public final boolean hasVideoContent() {
        try {
            return this.f9264a.hasVideoContent();
        } catch (RemoteException e2) {
            zzbba.c("", e2);
            return false;
        }
    }

    public final void setMainImage(Drawable drawable) {
        try {
            this.f9264a.X0(ObjectWrapper.b0(drawable));
        } catch (RemoteException e2) {
            zzbba.c("", e2);
        }
    }
}
