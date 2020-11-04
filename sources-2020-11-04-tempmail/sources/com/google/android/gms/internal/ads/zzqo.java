package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

@TargetApi(14)
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzqo implements Application.ActivityLifecycleCallbacks, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    private static final long q = ((Long) zzwg.e().c(zzaav.E0)).longValue();

    /* renamed from: b  reason: collision with root package name */
    private final Context f9217b;

    /* renamed from: c  reason: collision with root package name */
    private Application f9218c;

    /* renamed from: d  reason: collision with root package name */
    private final WindowManager f9219d;

    /* renamed from: e  reason: collision with root package name */
    private final PowerManager f9220e;

    /* renamed from: f  reason: collision with root package name */
    private final KeyguardManager f9221f;
    @VisibleForTesting
    private BroadcastReceiver g;
    private WeakReference<ViewTreeObserver> h;
    private WeakReference<View> i;
    private ke0 j;
    private zzbag k = new zzbag(q);
    private boolean l = false;
    private int m = -1;
    private final HashSet<zzqs> n = new HashSet<>();
    private final DisplayMetrics o;
    private final Rect p;

    public zzqo(Context context, View view) {
        this.f9217b = context.getApplicationContext();
        this.f9219d = (WindowManager) context.getSystemService("window");
        this.f9220e = (PowerManager) this.f9217b.getSystemService("power");
        this.f9221f = (KeyguardManager) context.getSystemService("keyguard");
        Context context2 = this.f9217b;
        if (context2 instanceof Application) {
            this.f9218c = (Application) context2;
            this.j = new ke0((Application) context2, this);
        }
        this.o = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.p = rect;
        rect.right = this.f9219d.getDefaultDisplay().getWidth();
        this.p.bottom = this.f9219d.getDefaultDisplay().getHeight();
        WeakReference<View> weakReference = this.i;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            k(view2);
        }
        this.i = new WeakReference<>(view);
        if (view != null) {
            if (zzq.zzky().b(view)) {
                j(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    private final Rect a(Rect rect) {
        return new Rect(g(rect.left), g(rect.top), g(rect.right), g(rect.bottom));
    }

    private final void b(Activity activity, int i2) {
        Window window;
        if (this.i != null && (window = activity.getWindow()) != null) {
            View peekDecorView = window.peekDecorView();
            View view = (View) this.i.get();
            if (view != null && peekDecorView != null && view.getRootView() == peekDecorView.getRootView()) {
                this.m = i2;
            }
        }
    }

    /* access modifiers changed from: private */
    public final void f(int i2) {
        WeakReference<View> weakReference;
        boolean z;
        boolean z2;
        List<Rect> list;
        int i3 = i2;
        if (this.n.size() != 0 && (weakReference = this.i) != null) {
            View view = (View) weakReference.get();
            boolean z3 = i3 == 1;
            boolean z4 = view == null;
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            Rect rect3 = new Rect();
            Rect rect4 = new Rect();
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            if (view != null) {
                boolean globalVisibleRect = view.getGlobalVisibleRect(rect2);
                boolean localVisibleRect = view.getLocalVisibleRect(rect3);
                view.getHitRect(rect4);
                try {
                    view.getLocationOnScreen(iArr);
                    view.getLocationInWindow(iArr2);
                } catch (Exception e2) {
                    zzbba.c("Failure getting view location.", e2);
                }
                int i4 = iArr[0];
                rect.left = i4;
                rect.top = iArr[1];
                rect.right = i4 + view.getWidth();
                rect.bottom = rect.top + view.getHeight();
                z2 = globalVisibleRect;
                z = localVisibleRect;
            } else {
                z2 = false;
                z = false;
            }
            if (!((Boolean) zzwg.e().c(zzaav.H0)).booleanValue() || view == null) {
                list = Collections.emptyList();
            } else {
                list = l(view);
            }
            List<Rect> list2 = list;
            int windowVisibility = view != null ? view.getWindowVisibility() : 8;
            int i5 = this.m;
            if (i5 != -1) {
                windowVisibility = i5;
            }
            boolean z5 = !z4 && zzq.zzkw().r(view, this.f9220e, this.f9221f) && z2 && z && windowVisibility == 0;
            if (z3 && !this.k.a() && z5 == this.l) {
                return;
            }
            if (z5 || this.l || i3 != 1) {
                zzqt zzqt = new zzqt(zzq.zzld().b(), this.f9220e.isScreenOn(), view != null && zzq.zzky().b(view), view != null ? view.getWindowVisibility() : 8, a(this.p), a(rect), a(rect2), z2, a(rect3), z, a(rect4), this.o.density, z5, list2);
                Iterator<zzqs> it = this.n.iterator();
                while (it.hasNext()) {
                    it.next().R(zzqt);
                }
                this.l = z5;
            }
        }
    }

    private final int g(int i2) {
        return (int) (((float) i2) / this.o.density);
    }

    private final void h() {
        zzaye.h.post(new ie0(this));
    }

    private final void j(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.h = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.g == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.g = new he0(this);
            zzq.zzlr().c(this.f9217b, this.g, intentFilter);
        }
        Application application = this.f9218c;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.j);
            } catch (Exception e2) {
                zzbba.c("Error registering activity lifecycle callbacks.", e2);
            }
        }
    }

    private final void k(View view) {
        try {
            if (this.h != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.h.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.h = null;
            }
        } catch (Exception e2) {
            zzbba.c("Error while unregistering listeners from the last ViewTreeObserver.", e2);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e3) {
            zzbba.c("Error while unregistering listeners from the ViewTreeObserver.", e3);
        }
        if (this.g != null) {
            try {
                zzq.zzlr().b(this.f9217b, this.g);
            } catch (IllegalStateException e4) {
                zzbba.c("Failed trying to unregister the receiver", e4);
            } catch (Exception e5) {
                zzq.zzla().e(e5, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.g = null;
        }
        Application application = this.f9218c;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.j);
            } catch (Exception e6) {
                zzbba.c("Error registering activity lifecycle callbacks.", e6);
            }
        }
    }

    private final List<Rect> l(View view) {
        try {
            ArrayList arrayList = new ArrayList();
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                View view2 = (View) parent;
                Rect rect = new Rect();
                if (view2.isScrollContainer() && view2.getGlobalVisibleRect(rect)) {
                    arrayList.add(a(rect));
                }
            }
            return arrayList;
        } catch (Exception e2) {
            zzq.zzla().e(e2, "PositionWatcher.getParentScrollViewRects");
            return Collections.emptyList();
        }
    }

    public final void d(zzqs zzqs) {
        this.n.add(zzqs);
        f(3);
    }

    public final void e(zzqs zzqs) {
        this.n.remove(zzqs);
    }

    public final void i(long j2) {
        this.k.b(j2);
    }

    public final void m() {
        this.k.b(q);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void n() {
        f(3);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        b(activity, 0);
        f(3);
        h();
    }

    public final void onActivityDestroyed(Activity activity) {
        f(3);
        h();
    }

    public final void onActivityPaused(Activity activity) {
        b(activity, 4);
        f(3);
        h();
    }

    public final void onActivityResumed(Activity activity) {
        b(activity, 0);
        f(3);
        h();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        f(3);
        h();
    }

    public final void onActivityStarted(Activity activity) {
        b(activity, 0);
        f(3);
        h();
    }

    public final void onActivityStopped(Activity activity) {
        f(3);
        h();
    }

    public final void onGlobalLayout() {
        f(2);
        h();
    }

    public final void onScrollChanged() {
        f(1);
    }

    public final void onViewAttachedToWindow(View view) {
        this.m = -1;
        j(view);
        f(3);
    }

    public final void onViewDetachedFromWindow(View view) {
        this.m = -1;
        f(3);
        h();
        k(view);
    }
}
