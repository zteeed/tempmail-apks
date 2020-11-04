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
    private View f7178b;

    /* renamed from: c  reason: collision with root package name */
    private zzyi f7179c;

    /* renamed from: d  reason: collision with root package name */
    private zzccd f7180d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f7181e = false;

    /* renamed from: f  reason: collision with root package name */
    private boolean f7182f = false;

    public zzcgd(zzccd zzccd, zzcck zzcck) {
        this.f7178b = zzcck.E();
        this.f7179c = zzcck.n();
        this.f7180d = zzccd;
        if (zzcck.F() != null) {
            zzcck.F().G(this);
        }
    }

    private static void e7(zzaiv zzaiv, int i) {
        try {
            zzaiv.N4(i);
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    private final void f7() {
        View view = this.f7178b;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f7178b);
            }
        }
    }

    private final void g7() {
        View view;
        zzccd zzccd = this.f7180d;
        if (zzccd != null && (view = this.f7178b) != null) {
            zzccd.z(view, Collections.emptyMap(), Collections.emptyMap(), zzccd.I(this.f7178b));
        }
    }

    public final void R4(IObjectWrapper iObjectWrapper) throws RemoteException {
        Preconditions.f("#008 Must be called on the main UI thread.");
        z5(iObjectWrapper, new ui(this));
    }

    public final void destroy() throws RemoteException {
        Preconditions.f("#008 Must be called on the main UI thread.");
        f7();
        zzccd zzccd = this.f7180d;
        if (zzccd != null) {
            zzccd.a();
        }
        this.f7180d = null;
        this.f7178b = null;
        this.f7179c = null;
        this.f7181e = true;
    }

    public final zzyi getVideoController() throws RemoteException {
        Preconditions.f("#008 Must be called on the main UI thread.");
        if (!this.f7181e) {
            return this.f7179c;
        }
        zzbba.g("getVideoController: Instream ad should not be used after destroyed");
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void h7() {
        try {
            destroy();
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final zzado l0() {
        Preconditions.f("#008 Must be called on the main UI thread.");
        if (this.f7181e) {
            zzbba.g("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        zzccd zzccd = this.f7180d;
        if (zzccd == null || zzccd.w() == null) {
            return null;
        }
        return this.f7180d.w().b();
    }

    public final void onGlobalLayout() {
        g7();
    }

    public final void onScrollChanged() {
        g7();
    }

    public final void z3() {
        zzaye.h.post(new ti(this));
    }

    public final void z5(IObjectWrapper iObjectWrapper, zzaiv zzaiv) throws RemoteException {
        Preconditions.f("#008 Must be called on the main UI thread.");
        if (this.f7181e) {
            zzbba.g("Instream ad can not be shown after destroy().");
            e7(zzaiv, 2);
        } else if (this.f7178b == null || this.f7179c == null) {
            String str = this.f7178b == null ? "can not get video view." : "can not get video controller.";
            zzbba.g(str.length() != 0 ? "Instream internal error: ".concat(str) : new String("Instream internal error: "));
            e7(zzaiv, 0);
        } else if (this.f7182f) {
            zzbba.g("Instream ad should not be used again.");
            e7(zzaiv, 1);
        } else {
            this.f7182f = true;
            f7();
            ((ViewGroup) ObjectWrapper.V(iObjectWrapper)).addView(this.f7178b, new ViewGroup.LayoutParams(-1, -1));
            zzq.zzlt();
            zzbbv.a(this.f7178b, this);
            zzq.zzlt();
            zzbbv.b(this.f7178b, this);
            g7();
            try {
                zzaiv.f1();
            } catch (RemoteException e2) {
                zzbba.e("#007 Could not call remote method.", e2);
            }
        }
    }
}
