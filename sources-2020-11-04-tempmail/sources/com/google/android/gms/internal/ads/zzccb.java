package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzccb extends zzadr {

    /* renamed from: b  reason: collision with root package name */
    private final zzcck f7004b;

    /* renamed from: c  reason: collision with root package name */
    private IObjectWrapper f7005c;

    public zzccb(zzcck zzcck) {
        this.f7004b = zzcck;
    }

    private final float f7() {
        try {
            return this.f7004b.n().getAspectRatio();
        } catch (RemoteException e2) {
            zzbba.c("Remote exception getting video controller aspect ratio.", e2);
            return 0.0f;
        }
    }

    private static float g7(IObjectWrapper iObjectWrapper) {
        Drawable drawable;
        if (iObjectWrapper == null || (drawable = (Drawable) ObjectWrapper.V(iObjectWrapper)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return ((float) drawable.getIntrinsicWidth()) / ((float) drawable.getIntrinsicHeight());
    }

    public final void P4(zzaff zzaff) {
        if (((Boolean) zzwg.e().c(zzaav.f3)).booleanValue() && (this.f7004b.n() instanceof zzbgh)) {
            ((zzbgh) this.f7004b.n()).P4(zzaff);
        }
    }

    public final IObjectWrapper Z2() throws RemoteException {
        IObjectWrapper iObjectWrapper = this.f7005c;
        if (iObjectWrapper != null) {
            return iObjectWrapper;
        }
        zzadt C = this.f7004b.C();
        if (C == null) {
            return null;
        }
        return C.E2();
    }

    public final void d1(IObjectWrapper iObjectWrapper) {
        if (((Boolean) zzwg.e().c(zzaav.y1)).booleanValue()) {
            this.f7005c = iObjectWrapper;
        }
    }

    public final float getAspectRatio() throws RemoteException {
        if (!((Boolean) zzwg.e().c(zzaav.e3)).booleanValue()) {
            return 0.0f;
        }
        if (this.f7004b.i() != 0.0f) {
            return this.f7004b.i();
        }
        if (this.f7004b.n() != null) {
            return f7();
        }
        IObjectWrapper iObjectWrapper = this.f7005c;
        if (iObjectWrapper != null) {
            return g7(iObjectWrapper);
        }
        zzadt C = this.f7004b.C();
        if (C == null) {
            return 0.0f;
        }
        float width = (C == null || C.getWidth() == -1 || C.getHeight() == -1) ? 0.0f : ((float) C.getWidth()) / ((float) C.getHeight());
        if (width != 0.0f) {
            return width;
        }
        return g7(C.E2());
    }

    public final float getCurrentTime() throws RemoteException {
        if (((Boolean) zzwg.e().c(zzaav.f3)).booleanValue() && this.f7004b.n() != null) {
            return this.f7004b.n().getCurrentTime();
        }
        return 0.0f;
    }

    public final float getDuration() throws RemoteException {
        if (((Boolean) zzwg.e().c(zzaav.f3)).booleanValue() && this.f7004b.n() != null) {
            return this.f7004b.n().getDuration();
        }
        return 0.0f;
    }

    public final zzyi getVideoController() throws RemoteException {
        if (!((Boolean) zzwg.e().c(zzaav.f3)).booleanValue()) {
            return null;
        }
        return this.f7004b.n();
    }

    public final boolean hasVideoContent() throws RemoteException {
        if (((Boolean) zzwg.e().c(zzaav.f3)).booleanValue() && this.f7004b.n() != null) {
            return true;
        }
        return false;
    }
}
