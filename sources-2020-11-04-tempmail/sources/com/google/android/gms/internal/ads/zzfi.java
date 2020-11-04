package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzfi implements Application.ActivityLifecycleCallbacks, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    private static final Handler n = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    private final Context f8869b;

    /* renamed from: c  reason: collision with root package name */
    private Application f8870c;

    /* renamed from: d  reason: collision with root package name */
    private final PowerManager f8871d;

    /* renamed from: e  reason: collision with root package name */
    private final KeyguardManager f8872e;

    /* renamed from: f  reason: collision with root package name */
    private BroadcastReceiver f8873f;
    private final zzev g;
    private WeakReference<ViewTreeObserver> h;
    private WeakReference<View> i;
    private s80 j;
    private byte k = -1;
    private int l = -1;
    private long m = -3;

    public zzfi(Context context, zzev zzev) {
        Context applicationContext = context.getApplicationContext();
        this.f8869b = applicationContext;
        this.g = zzev;
        this.f8871d = (PowerManager) applicationContext.getSystemService("power");
        this.f8872e = (KeyguardManager) this.f8869b.getSystemService("keyguard");
        Context context2 = this.f8869b;
        if (context2 instanceof Application) {
            this.f8870c = (Application) context2;
            this.j = new s80((Application) context2, this);
        }
        g((View) null);
    }

    private final View a() {
        WeakReference<View> weakReference = this.i;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    private final void b(Activity activity, int i2) {
        Window window;
        if (this.i != null && (window = activity.getWindow()) != null) {
            View peekDecorView = window.peekDecorView();
            View a2 = a();
            if (a2 != null && peekDecorView != null && a2.getRootView() == peekDecorView.getRootView()) {
                this.l = i2;
            }
        }
    }

    private final void d() {
        n.post(new ia0(this));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0064, code lost:
        if (r7 == false) goto L_0x0067;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f() {
        /*
            r9 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r9.i
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            android.view.View r0 = r9.a()
            r1 = -1
            r2 = -3
            if (r0 != 0) goto L_0x0013
            r9.m = r2
            r9.k = r1
            return
        L_0x0013:
            int r4 = r0.getVisibility()
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x001d
            r4 = 1
            goto L_0x001e
        L_0x001d:
            r4 = 0
        L_0x001e:
            boolean r7 = r0.isShown()
            if (r7 != 0) goto L_0x0027
            r4 = r4 | 2
            byte r4 = (byte) r4
        L_0x0027:
            android.os.PowerManager r7 = r9.f8871d
            if (r7 == 0) goto L_0x0034
            boolean r7 = r7.isScreenOn()
            if (r7 != 0) goto L_0x0034
            r4 = r4 | 4
            byte r4 = (byte) r4
        L_0x0034:
            com.google.android.gms.internal.ads.zzev r7 = r9.g
            boolean r7 = r7.a()
            if (r7 != 0) goto L_0x0068
            android.app.KeyguardManager r7 = r9.f8872e
            if (r7 == 0) goto L_0x0067
            boolean r7 = r7.inKeyguardRestrictedInputMode()
            if (r7 == 0) goto L_0x0067
            android.app.Activity r7 = com.google.android.gms.internal.ads.zzfg.g(r0)
            if (r7 == 0) goto L_0x0063
            android.view.Window r7 = r7.getWindow()
            if (r7 != 0) goto L_0x0054
            r7 = 0
            goto L_0x0058
        L_0x0054:
            android.view.WindowManager$LayoutParams r7 = r7.getAttributes()
        L_0x0058:
            if (r7 == 0) goto L_0x0063
            int r7 = r7.flags
            r8 = 524288(0x80000, float:7.34684E-40)
            r7 = r7 & r8
            if (r7 == 0) goto L_0x0063
            r7 = 1
            goto L_0x0064
        L_0x0063:
            r7 = 0
        L_0x0064:
            if (r7 == 0) goto L_0x0067
            goto L_0x0068
        L_0x0067:
            r5 = 0
        L_0x0068:
            if (r5 != 0) goto L_0x006d
            r4 = r4 | 8
            byte r4 = (byte) r4
        L_0x006d:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r0.getGlobalVisibleRect(r5)
            if (r5 != 0) goto L_0x007b
            r4 = r4 | 16
            byte r4 = (byte) r4
        L_0x007b:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r0.getLocalVisibleRect(r5)
            if (r5 != 0) goto L_0x0089
            r4 = r4 | 32
            byte r4 = (byte) r4
        L_0x0089:
            int r0 = r0.getWindowVisibility()
            int r5 = r9.l
            if (r5 == r1) goto L_0x0092
            r0 = r5
        L_0x0092:
            if (r0 == 0) goto L_0x0097
            r0 = r4 | 64
            byte r4 = (byte) r0
        L_0x0097:
            byte r0 = r9.k
            if (r0 == r4) goto L_0x00a9
            r9.k = r4
            if (r4 != 0) goto L_0x00a4
            long r0 = android.os.SystemClock.elapsedRealtime()
            goto L_0x00a7
        L_0x00a4:
            long r0 = (long) r4
            long r0 = r2 - r0
        L_0x00a7:
            r9.m = r0
        L_0x00a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfi.f():void");
    }

    private final void h(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.h = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f8873f == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            ja0 ja0 = new ja0(this);
            this.f8873f = ja0;
            this.f8869b.registerReceiver(ja0, intentFilter);
        }
        Application application = this.f8870c;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.j);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|(3:4|(1:8)|9)|10|11|(1:13)|15|(3:17|18|19)|21|(3:23|24|26)(1:28)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001d */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0027 A[Catch:{ Exception -> 0x002e }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0033 A[SYNTHETIC, Splitter:B:17:0x0033] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003e A[SYNTHETIC, Splitter:B:23:0x003e] */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void i(android.view.View r4) {
        /*
            r3 = this;
            r0 = 0
            java.lang.ref.WeakReference<android.view.ViewTreeObserver> r1 = r3.h     // Catch:{ Exception -> 0x001d }
            if (r1 == 0) goto L_0x001d
            java.lang.ref.WeakReference<android.view.ViewTreeObserver> r1 = r3.h     // Catch:{ Exception -> 0x001d }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x001d }
            android.view.ViewTreeObserver r1 = (android.view.ViewTreeObserver) r1     // Catch:{ Exception -> 0x001d }
            if (r1 == 0) goto L_0x001b
            boolean r2 = r1.isAlive()     // Catch:{ Exception -> 0x001d }
            if (r2 == 0) goto L_0x001b
            r1.removeOnScrollChangedListener(r3)     // Catch:{ Exception -> 0x001d }
            r1.removeGlobalOnLayoutListener(r3)     // Catch:{ Exception -> 0x001d }
        L_0x001b:
            r3.h = r0     // Catch:{ Exception -> 0x001d }
        L_0x001d:
            android.view.ViewTreeObserver r4 = r4.getViewTreeObserver()     // Catch:{ Exception -> 0x002e }
            boolean r1 = r4.isAlive()     // Catch:{ Exception -> 0x002e }
            if (r1 == 0) goto L_0x002f
            r4.removeOnScrollChangedListener(r3)     // Catch:{ Exception -> 0x002e }
            r4.removeGlobalOnLayoutListener(r3)     // Catch:{ Exception -> 0x002e }
            goto L_0x002f
        L_0x002e:
        L_0x002f:
            android.content.BroadcastReceiver r4 = r3.f8873f
            if (r4 == 0) goto L_0x003a
            android.content.Context r1 = r3.f8869b     // Catch:{ Exception -> 0x0038 }
            r1.unregisterReceiver(r4)     // Catch:{ Exception -> 0x0038 }
        L_0x0038:
            r3.f8873f = r0
        L_0x003a:
            android.app.Application r4 = r3.f8870c
            if (r4 == 0) goto L_0x0043
            com.google.android.gms.internal.ads.s80 r0 = r3.j     // Catch:{ Exception -> 0x0043 }
            r4.unregisterActivityLifecycleCallbacks(r0)     // Catch:{ Exception -> 0x0043 }
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfi.i(android.view.View):void");
    }

    public final long e() {
        if (this.m <= -2 && a() == null) {
            this.m = -3;
        }
        return this.m;
    }

    /* access modifiers changed from: package-private */
    public final void g(View view) {
        View a2 = a();
        if (a2 != null) {
            a2.removeOnAttachStateChangeListener(this);
            i(a2);
        }
        this.i = new WeakReference<>(view);
        if (view != null) {
            if ((view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true) {
                h(view);
            }
            view.addOnAttachStateChangeListener(this);
            this.m = -2;
            return;
        }
        this.m = -3;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        b(activity, 0);
        f();
    }

    public final void onActivityDestroyed(Activity activity) {
        f();
    }

    public final void onActivityPaused(Activity activity) {
        b(activity, 4);
        f();
    }

    public final void onActivityResumed(Activity activity) {
        b(activity, 0);
        f();
        d();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        f();
    }

    public final void onActivityStarted(Activity activity) {
        b(activity, 0);
        f();
    }

    public final void onActivityStopped(Activity activity) {
        f();
    }

    public final void onGlobalLayout() {
        f();
    }

    public final void onScrollChanged() {
        f();
    }

    public final void onViewAttachedToWindow(View view) {
        this.l = -1;
        h(view);
        f();
    }

    public final void onViewDetachedFromWindow(View view) {
        this.l = -1;
        f();
        d();
        i(view);
    }
}
