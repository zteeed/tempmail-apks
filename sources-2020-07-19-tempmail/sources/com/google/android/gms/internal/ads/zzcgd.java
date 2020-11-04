package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcgd extends zzait implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzadc {

    /* renamed from: b  reason: collision with root package name */
    private View f6995b;

    /* renamed from: c  reason: collision with root package name */
    private zzyi f6996c;

    /* renamed from: d  reason: collision with root package name */
    private zzccd f6997d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f6998e = false;

    /* renamed from: f  reason: collision with root package name */
    private boolean f6999f = false;

    public zzcgd(zzccd zzccd, zzcck zzcck) {
        this.f6995b = zzcck.E();
        this.f6996c = zzcck.n();
        this.f6997d = zzccd;
        if (zzcck.F() != null) {
            zzcck.F().G(this);
        }
    }

    private final void A6() {
        View view = this.f6995b;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f6995b);
            }
        }
    }

    private final void B6() {
        View view;
        zzccd zzccd = this.f6997d;
        if (zzccd != null && (view = this.f6995b) != null) {
            zzccd.z(view, Collections.emptyMap(), Collections.emptyMap(), zzccd.I(this.f6995b));
        }
    }

    private static void z6(zzaiv zzaiv, int i) {
        try {
            zzaiv.t4(i);
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void C6() {
        try {
            destroy();
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void d5(IObjectWrapper iObjectWrapper, zzaiv zzaiv) throws RemoteException {
        Preconditions.f("#008 Must be called on the main UI thread.");
        if (this.f6998e) {
            zzbba.g("Instream ad can not be shown after destroy().");
            z6(zzaiv, 2);
        } else if (this.f6995b == null || this.f6996c == null) {
            String str = this.f6995b == null ? "can not get video view." : "can not get video controller.";
            zzbba.g(str.length() != 0 ? "Instream internal error: ".concat(str) : new String("Instream internal error: "));
            z6(zzaiv, 0);
        } else if (this.f6999f) {
            zzbba.g("Instream ad should not be used again.");
            z6(zzaiv, 1);
        } else {
            this.f6999f = true;
            A6();
            ((ViewGroup) ObjectWrapper.P(iObjectWrapper)).addView(this.f6995b, new ViewGroup.LayoutParams(-1, -1));
            zzq.zzlt();
            zzbbv.a(this.f6995b, this);
            zzq.zzlt();
            zzbbv.b(this.f6995b, this);
            B6();
            try {
                zzaiv.Z0();
            } catch (RemoteException e2) {
                zzbba.e("#007 Could not call remote method.", e2);
            }
        }
    }

    public final void destroy() throws RemoteException {
        Preconditions.f("#008 Must be called on the main UI thread.");
        A6();
        zzccd zzccd = this.f6997d;
        if (zzccd != null) {
            zzccd.a();
        }
        this.f6997d = null;
        this.f6995b = null;
        this.f6996c = null;
        this.f6998e = true;
    }

    public final zzado f0() {
        Preconditions.f("#008 Must be called on the main UI thread.");
        if (this.f6998e) {
            zzbba.g("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        zzccd zzccd = this.f6997d;
        if (zzccd == null || zzccd.w() == null) {
            return null;
        }
        return this.f6997d.w().b();
    }

    public final zzyi getVideoController() throws RemoteException {
        Preconditions.f("#008 Must be called on the main UI thread.");
        if (!this.f6998e) {
            return this.f6996c;
        }
        zzbba.g("getVideoController: Instream ad should not be used after destroyed");
        return null;
    }

    public final void j3() {
        zzaye.h.post(new ti(this));
    }

    public final void onGlobalLayout() {
        B6();
    }

    public final void onScrollChanged() {
        B6();
    }

    public final void x4(IObjectWrapper iObjectWrapper) throws RemoteException {
        Preconditions.f("#008 Must be called on the main UI thread.");
        d5(iObjectWrapper, new ui(this));
    }
}
