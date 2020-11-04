package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@TargetApi(14)
@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzri extends Thread {

    /* renamed from: b  reason: collision with root package name */
    private boolean f9241b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f9242c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f9243d;

    /* renamed from: e  reason: collision with root package name */
    private final zzrf f9244e;

    /* renamed from: f  reason: collision with root package name */
    private final int f9245f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final String n;
    private final boolean o;
    private final boolean p;
    private final boolean q;

    public zzri() {
        this(new zzrf());
    }

    @VisibleForTesting
    private final ve0 b(View view, zzrc zzrc) {
        boolean z;
        if (view == null) {
            return new ve0(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new ve0(this, 0, 0);
            }
            zzrc.d(text.toString(), globalVisibleRect, view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
            return new ve0(this, 1, 0);
        } else if ((view instanceof WebView) && !(view instanceof zzbfn)) {
            WebView webView = (WebView) view;
            if (!PlatformVersion.f()) {
                z = false;
            } else {
                zzrc.n();
                webView.post(new te0(this, zzrc, webView, globalVisibleRect));
                z = true;
            }
            if (z) {
                return new ve0(this, 0, 1);
            }
            return new ve0(this, 0, 0);
        } else if (!(view instanceof ViewGroup)) {
            return new ve0(this, 0, 0);
        } else {
            ViewGroup viewGroup = (ViewGroup) view;
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                ve0 b2 = b(viewGroup.getChildAt(i4), zzrc);
                i2 += b2.f5323a;
                i3 += b2.f5324b;
            }
            return new ve0(this, i2, i3);
        }
    }

    @VisibleForTesting
    private static boolean f() {
        boolean z;
        try {
            Context b2 = zzq.zzkz().b();
            if (b2 == null) {
                return false;
            }
            ActivityManager activityManager = (ActivityManager) b2.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) b2.getSystemService("keyguard");
            if (activityManager == null) {
                return false;
            }
            if (keyguardManager == null) {
                return false;
            }
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (Process.myPid() == next.pid) {
                    if (next.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode()) {
                        return false;
                    }
                    PowerManager powerManager = (PowerManager) b2.getSystemService("power");
                    if (powerManager == null) {
                        z = false;
                    } else {
                        z = powerManager.isScreenOn();
                    }
                    if (z) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        } catch (Throwable th) {
            zzq.zzla().e(th, "ContentFetchTask.isInForeground");
            return false;
        }
    }

    private final void h() {
        synchronized (this.f9243d) {
            this.f9242c = true;
            StringBuilder sb = new StringBuilder(42);
            sb.append("ContentFetchThread: paused, mPause = ");
            sb.append(true);
            zzbba.f(sb.toString());
        }
    }

    public final void a() {
        synchronized (this.f9243d) {
            this.f9242c = false;
            this.f9243d.notifyAll();
            zzbba.f("ContentFetchThread: wakeup");
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final void c(zzrc zzrc, WebView webView, String str, boolean z) {
        zzrc.m();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (this.o || TextUtils.isEmpty(webView.getTitle())) {
                    zzrc.c(optString, z, webView.getX(), webView.getY(), (float) webView.getWidth(), (float) webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    StringBuilder sb = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(optString).length());
                    sb.append(title);
                    sb.append("\n");
                    sb.append(optString);
                    zzrc.c(sb.toString(), z, webView.getX(), webView.getY(), (float) webView.getWidth(), (float) webView.getHeight());
                }
            }
            if (zzrc.h()) {
                this.f9244e.b(zzrc);
            }
        } catch (JSONException unused) {
            zzbba.f("Json string may be malformed.");
        } catch (Throwable th) {
            zzbba.b("Failed to get webview content.", th);
            zzq.zzla().e(th, "ContentFetchTask.processWebViewContent");
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final void d(View view) {
        try {
            zzrc zzrc = new zzrc(this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.p);
            Context b2 = zzq.zzkz().b();
            if (b2 != null && !TextUtils.isEmpty(this.n)) {
                String str = (String) view.getTag(b2.getResources().getIdentifier((String) zzwg.e().c(zzaav.M), "id", b2.getPackageName()));
                if (str != null && str.equals(this.n)) {
                    return;
                }
            }
            ve0 b3 = b(view, zzrc);
            zzrc.p();
            if (b3.f5323a != 0 || b3.f5324b != 0) {
                if (b3.f5324b != 0 || zzrc.q() != 0) {
                    if (b3.f5324b != 0 || !this.f9244e.a(zzrc)) {
                        this.f9244e.c(zzrc);
                    }
                }
            }
        } catch (Exception e2) {
            zzbba.c("Exception in fetchContentOnUIThread", e2);
            zzq.zzla().e(e2, "ContentFetchTask.fetchContent");
        }
    }

    public final void e() {
        synchronized (this.f9243d) {
            if (this.f9241b) {
                zzbba.f("Content hash thread already started, quiting...");
                return;
            }
            this.f9241b = true;
            start();
        }
    }

    public final zzrc g() {
        return this.f9244e.d(this.q);
    }

    public final boolean i() {
        return this.f9242c;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0084 */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0084 A[LOOP:1: B:30:0x0084->B:42:0x0084, LOOP_START, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
        L_0x0000:
            boolean r0 = f()     // Catch:{ InterruptedException -> 0x007b, Exception -> 0x006b }
            if (r0 == 0) goto L_0x005a
            com.google.android.gms.internal.ads.zzre r0 = com.google.android.gms.ads.internal.zzq.zzkz()     // Catch:{ InterruptedException -> 0x007b, Exception -> 0x006b }
            android.app.Activity r0 = r0.a()     // Catch:{ InterruptedException -> 0x007b, Exception -> 0x006b }
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = "ContentFetchThread: no activity. Sleeping."
            com.google.android.gms.internal.ads.zzbba.f(r0)     // Catch:{ InterruptedException -> 0x007b, Exception -> 0x006b }
            r4.h()     // Catch:{ InterruptedException -> 0x007b, Exception -> 0x006b }
            goto L_0x0062
        L_0x0019:
            if (r0 == 0) goto L_0x0062
            r1 = 0
            android.view.Window r2 = r0.getWindow()     // Catch:{ Exception -> 0x003d }
            if (r2 == 0) goto L_0x004c
            android.view.Window r2 = r0.getWindow()     // Catch:{ Exception -> 0x003d }
            android.view.View r2 = r2.getDecorView()     // Catch:{ Exception -> 0x003d }
            if (r2 == 0) goto L_0x004c
            android.view.Window r0 = r0.getWindow()     // Catch:{ Exception -> 0x003d }
            android.view.View r0 = r0.getDecorView()     // Catch:{ Exception -> 0x003d }
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r2)     // Catch:{ Exception -> 0x003d }
            r1 = r0
            goto L_0x004c
        L_0x003d:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzaxh r2 = com.google.android.gms.ads.internal.zzq.zzla()     // Catch:{ InterruptedException -> 0x007b, Exception -> 0x006b }
            java.lang.String r3 = "ContentFetchTask.extractContent"
            r2.e(r0, r3)     // Catch:{ InterruptedException -> 0x007b, Exception -> 0x006b }
            java.lang.String r0 = "Failed getting root view of activity. Content not extracted."
            com.google.android.gms.internal.ads.zzbba.f(r0)     // Catch:{ InterruptedException -> 0x007b, Exception -> 0x006b }
        L_0x004c:
            if (r1 == 0) goto L_0x0062
            if (r1 != 0) goto L_0x0051
            goto L_0x0062
        L_0x0051:
            com.google.android.gms.internal.ads.ue0 r0 = new com.google.android.gms.internal.ads.ue0     // Catch:{ InterruptedException -> 0x007b, Exception -> 0x006b }
            r0.<init>(r4, r1)     // Catch:{ InterruptedException -> 0x007b, Exception -> 0x006b }
            r1.post(r0)     // Catch:{ InterruptedException -> 0x007b, Exception -> 0x006b }
            goto L_0x0062
        L_0x005a:
            java.lang.String r0 = "ContentFetchTask: sleeping"
            com.google.android.gms.internal.ads.zzbba.f(r0)     // Catch:{ InterruptedException -> 0x007b, Exception -> 0x006b }
            r4.h()     // Catch:{ InterruptedException -> 0x007b, Exception -> 0x006b }
        L_0x0062:
            int r0 = r4.f9245f     // Catch:{ InterruptedException -> 0x007b, Exception -> 0x006b }
            int r0 = r0 * 1000
            long r0 = (long) r0     // Catch:{ InterruptedException -> 0x007b, Exception -> 0x006b }
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x007b, Exception -> 0x006b }
            goto L_0x0081
        L_0x006b:
            r0 = move-exception
            java.lang.String r1 = "Error in ContentFetchTask"
            com.google.android.gms.internal.ads.zzbba.c(r1, r0)
            com.google.android.gms.internal.ads.zzaxh r1 = com.google.android.gms.ads.internal.zzq.zzla()
            java.lang.String r2 = "ContentFetchTask.run"
            r1.e(r0, r2)
            goto L_0x0081
        L_0x007b:
            r0 = move-exception
            java.lang.String r1 = "Error in ContentFetchTask"
            com.google.android.gms.internal.ads.zzbba.c(r1, r0)
        L_0x0081:
            java.lang.Object r0 = r4.f9243d
            monitor-enter(r0)
        L_0x0084:
            boolean r1 = r4.f9242c     // Catch:{ all -> 0x0096 }
            if (r1 == 0) goto L_0x0093
            java.lang.String r1 = "ContentFetchTask: waiting"
            com.google.android.gms.internal.ads.zzbba.f(r1)     // Catch:{ InterruptedException -> 0x0084 }
            java.lang.Object r1 = r4.f9243d     // Catch:{ InterruptedException -> 0x0084 }
            r1.wait()     // Catch:{ InterruptedException -> 0x0084 }
            goto L_0x0084
        L_0x0093:
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            goto L_0x0000
        L_0x0096:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzri.run():void");
    }

    @VisibleForTesting
    private zzri(zzrf zzrf) {
        this.f9241b = false;
        this.f9242c = false;
        this.f9244e = zzrf;
        this.f9243d = new Object();
        this.g = zzacf.f5763d.a().intValue();
        this.h = zzacf.f5760a.a().intValue();
        this.i = zzacf.f5764e.a().intValue();
        this.j = zzacf.f5762c.a().intValue();
        this.k = ((Integer) zzwg.e().c(zzaav.J)).intValue();
        this.l = ((Integer) zzwg.e().c(zzaav.K)).intValue();
        this.m = ((Integer) zzwg.e().c(zzaav.L)).intValue();
        this.f9245f = zzacf.f5765f.a().intValue();
        this.n = (String) zzwg.e().c(zzaav.N);
        this.o = ((Boolean) zzwg.e().c(zzaav.O)).booleanValue();
        this.p = ((Boolean) zzwg.e().c(zzaav.P)).booleanValue();
        this.q = ((Boolean) zzwg.e().c(zzaav.Q)).booleanValue();
        setName("ContentFetchTask");
    }
}
