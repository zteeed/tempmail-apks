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
    private static final Object f6054b = new Object();
    @GuardedBy("lock")
    @VisibleForTesting

    /* renamed from: c  reason: collision with root package name */
    private static boolean f6055c = false;
    @GuardedBy("lock")
    @VisibleForTesting

    /* renamed from: d  reason: collision with root package name */
    private static boolean f6056d = false;
    @VisibleForTesting

    /* renamed from: a  reason: collision with root package name */
    private zzdpi f6057a;

    @VisibleForTesting
    private final void i(Context context) {
        synchronized (f6054b) {
            if (((Boolean) zzwg.e().c(zzaav.o2)).booleanValue() && !f6056d) {
                try {
                    f6056d = true;
                    this.f6057a = (zzdpi) zzbaz.a(context, "com.google.android.gms.ads.omid.DynamiteOmid", l3.f4440a);
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
            String valueOf = String.valueOf(this.f6057a.F6());
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
        synchronized (f6054b) {
            try {
                if (((Boolean) zzwg.e().c(zzaav.o2)).booleanValue()) {
                    if (f6055c) {
                        try {
                            return this.f6057a.U2(str, ObjectWrapper.h0(webView), str2, str3, str4, str5);
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
        synchronized (f6054b) {
            if (((Boolean) zzwg.e().c(zzaav.o2)).booleanValue()) {
                if (f6055c) {
                    try {
                        this.f6057a.W1(iObjectWrapper, ObjectWrapper.h0(view));
                    } catch (RemoteException | NullPointerException e2) {
                        zzbba.e("#007 Could not call remote method.", e2);
                    }
                }
            }
        }
    }

    public final void e(IObjectWrapper iObjectWrapper) {
        synchronized (f6054b) {
            if (((Boolean) zzwg.e().c(zzaav.o2)).booleanValue()) {
                if (f6055c) {
                    try {
                        this.f6057a.X6(iObjectWrapper);
                    } catch (RemoteException | NullPointerException e2) {
                        zzbba.e("#007 Could not call remote method.", e2);
                    }
                }
            }
        }
    }

    public final void f(IObjectWrapper iObjectWrapper) {
        synchronized (f6054b) {
            if (((Boolean) zzwg.e().c(zzaav.o2)).booleanValue()) {
                if (f6055c) {
                    try {
                        this.f6057a.B4(iObjectWrapper);
                    } catch (RemoteException | NullPointerException e2) {
                        zzbba.e("#007 Could not call remote method.", e2);
                    }
                }
            }
        }
    }

    public final void g(IObjectWrapper iObjectWrapper, View view) {
        synchronized (f6054b) {
            if (((Boolean) zzwg.e().c(zzaav.o2)).booleanValue()) {
                if (f6055c) {
                    try {
                        this.f6057a.T0(iObjectWrapper, ObjectWrapper.h0(view));
                    } catch (RemoteException | NullPointerException e2) {
                        zzbba.e("#007 Could not call remote method.", e2);
                    }
                }
            }
        }
    }

    public final boolean h(Context context) {
        synchronized (f6054b) {
            if (!((Boolean) zzwg.e().c(zzaav.o2)).booleanValue()) {
                return false;
            }
            if (f6055c) {
                return true;
            }
            try {
                i(context);
                boolean E5 = this.f6057a.E5(ObjectWrapper.h0(context));
                f6055c = E5;
                return E5;
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
