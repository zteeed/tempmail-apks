package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzaqf {

    /* renamed from: b  reason: collision with root package name */
    private static final Object f5871b = new Object();
    @GuardedBy("lock")
    @VisibleForTesting

    /* renamed from: c  reason: collision with root package name */
    private static boolean f5872c = false;
    @GuardedBy("lock")
    @VisibleForTesting

    /* renamed from: d  reason: collision with root package name */
    private static boolean f5873d = false;
    @VisibleForTesting

    /* renamed from: a  reason: collision with root package name */
    private zzdpi f5874a;

    @VisibleForTesting
    private final void i(Context context) {
        synchronized (f5871b) {
            if (((Boolean) zzwg.e().c(zzaav.o2)).booleanValue() && !f5873d) {
                try {
                    f5873d = true;
                    this.f5874a = (zzdpi) zzbaz.a(context, "com.google.android.gms.ads.omid.DynamiteOmid", l3.f4257a);
                } catch (zzbbb e2) {
                    zzbba.e("#007 Could not call remote method.", e2);
                }
            }
        }
    }

    public final String a(Context context) {
        if (!((Boolean) zzwg.e().c(zzaav.o2)).booleanValue()) {
            return null;
        }
        try {
            i(context);
            String valueOf = String.valueOf(this.f5874a.e6());
            return valueOf.length() != 0 ? "a.".concat(valueOf) : new String("a.");
        } catch (RemoteException | NullPointerException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
            return null;
        }
    }

    public final IObjectWrapper b(String str, WebView webView, String str2, String str3, String str4) {
        return c(str, webView, str2, str3, str4, "Google");
    }

    public final IObjectWrapper c(String str, WebView webView, String str2, String str3, String str4, String str5) {
        synchronized (f5871b) {
            try {
                if (((Boolean) zzwg.e().c(zzaav.o2)).booleanValue()) {
                    if (f5872c) {
                        try {
                            return this.f5874a.I2(str, ObjectWrapper.b0(webView), str2, str3, str4, str5);
                        } catch (RemoteException | NullPointerException e2) {
                            zzbba.e("#007 Could not call remote method.", e2);
                            return null;
                        }
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        }
    }

    public final void d(IObjectWrapper iObjectWrapper, View view) {
        synchronized (f5871b) {
            if (((Boolean) zzwg.e().c(zzaav.o2)).booleanValue()) {
                if (f5872c) {
                    try {
                        this.f5874a.N1(iObjectWrapper, ObjectWrapper.b0(view));
                    } catch (RemoteException | NullPointerException e2) {
                        zzbba.e("#007 Could not call remote method.", e2);
                    }
                }
            }
        }
    }

    public final void e(IObjectWrapper iObjectWrapper) {
        synchronized (f5871b) {
            if (((Boolean) zzwg.e().c(zzaav.o2)).booleanValue()) {
                if (f5872c) {
                    try {
                        this.f5874a.t6(iObjectWrapper);
                    } catch (RemoteException | NullPointerException e2) {
                        zzbba.e("#007 Could not call remote method.", e2);
                    }
                }
            }
        }
    }

    public final void f(IObjectWrapper iObjectWrapper) {
        synchronized (f5871b) {
            if (((Boolean) zzwg.e().c(zzaav.o2)).booleanValue()) {
                if (f5872c) {
                    try {
                        this.f5874a.h4(iObjectWrapper);
                    } catch (RemoteException | NullPointerException e2) {
                        zzbba.e("#007 Could not call remote method.", e2);
                    }
                }
            }
        }
    }

    public final void g(IObjectWrapper iObjectWrapper, View view) {
        synchronized (f5871b) {
            if (((Boolean) zzwg.e().c(zzaav.o2)).booleanValue()) {
                if (f5872c) {
                    try {
                        this.f5874a.M0(iObjectWrapper, ObjectWrapper.b0(view));
                    } catch (RemoteException | NullPointerException e2) {
                        zzbba.e("#007 Could not call remote method.", e2);
                    }
                }
            }
        }
    }

    public final boolean h(Context context) {
        synchronized (f5871b) {
            if (!((Boolean) zzwg.e().c(zzaav.o2)).booleanValue()) {
                return false;
            }
            if (f5872c) {
                return true;
            }
            try {
                i(context);
                boolean i5 = this.f5874a.i5(ObjectWrapper.b0(context));
                f5872c = i5;
                return i5;
            } catch (RemoteException e2) {
                e = e2;
                zzbba.e("#007 Could not call remote method.", e);
                return false;
            } catch (NullPointerException e3) {
                e = e3;
                zzbba.e("#007 Could not call remote method.", e);
                return false;
            }
        }
    }
}
