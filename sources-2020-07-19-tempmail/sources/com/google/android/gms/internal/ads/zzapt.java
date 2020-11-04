package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.common.util.CollectionUtils;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzapt extends zzaqd {

    /* renamed from: c  reason: collision with root package name */
    private String f5840c = "top-right";

    /* renamed from: d  reason: collision with root package name */
    private boolean f5841d = true;

    /* renamed from: e  reason: collision with root package name */
    private int f5842e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f5843f = 0;
    private int g = -1;
    private int h = 0;
    private int i = 0;
    private int j = -1;
    private final Object k = new Object();
    private final zzbfn l;
    private final Activity m;
    private zzbhg n;
    private ImageView o;
    private LinearLayout p;
    private zzaqc q;
    private PopupWindow r;
    private RelativeLayout s;
    private ViewGroup t;

    static {
        CollectionUtils.h("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
    }

    public zzapt(zzbfn zzbfn, zzaqc zzaqc) {
        super(zzbfn, "resize");
        this.l = zzbfn;
        this.m = zzbfn.b();
        this.q = zzaqc;
    }

    public final void h(int i2, int i3, boolean z) {
        synchronized (this.k) {
            this.f5842e = i2;
            this.f5843f = i3;
            PopupWindow popupWindow = this.r;
        }
    }

    public final void i(boolean z) {
        synchronized (this.k) {
            if (this.r != null) {
                this.r.dismiss();
                this.s.removeView(this.l.getView());
                if (this.t != null) {
                    this.t.removeView(this.o);
                    this.t.addView(this.l.getView());
                    this.l.X(this.n);
                }
                if (z) {
                    g("default");
                    if (this.q != null) {
                        this.q.b();
                    }
                }
                this.r = null;
                this.s = null;
                this.t = null;
                this.p = null;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01a8, code lost:
        if (r5 == 5) goto L_0x01b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01aa, code lost:
        r5 = ((r1.f5842e + r1.h) + r1.j) - 50;
        r8 = r1.f5843f;
        r15 = r1.i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01b8, code lost:
        r5 = ((r1.f5842e + r1.h) + r1.j) - 50;
        r8 = r1.f5843f + r1.i;
        r15 = r1.g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01c9, code lost:
        r5 = ((r1.f5842e + r1.h) + (r1.j / 2)) - 25;
        r8 = r1.f5843f + r1.i;
        r15 = r1.g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01dc, code lost:
        r5 = r1.f5842e + r1.h;
        r8 = r1.f5843f + r1.i;
        r15 = r1.g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01e8, code lost:
        r8 = (r8 + r15) - 50;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01eb, code lost:
        r5 = ((r1.f5842e + r1.h) + (r1.j / 2)) - 25;
        r8 = ((r1.f5843f + r1.i) + (r1.g / 2)) - 25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0202, code lost:
        r5 = ((r1.f5842e + r1.h) + (r1.j / 2)) - 25;
        r8 = r1.f5843f;
        r15 = r1.i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0212, code lost:
        r5 = r1.f5842e + r1.h;
        r8 = r1.f5843f;
        r15 = r1.i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x021b, code lost:
        r8 = r8 + r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x021c, code lost:
        if (r5 < 0) goto L_0x0238;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x021f, code lost:
        if ((r5 + 50) > r7) goto L_0x0238;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0223, code lost:
        if (r8 < r6[0]) goto L_0x0238;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0228, code lost:
        if ((r8 + 50) <= r6[1]) goto L_0x022b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x019d, code lost:
        r5 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x019e, code lost:
        if (r5 == 0) goto L_0x0212;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01a0, code lost:
        if (r5 == 1) goto L_0x0202;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01a2, code lost:
        if (r5 == 2) goto L_0x01eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01a4, code lost:
        if (r5 == 3) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01a6, code lost:
        if (r5 == 4) goto L_0x01c9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x023b A[Catch:{ RuntimeException -> 0x0465 }] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x023d A[Catch:{ RuntimeException -> 0x0465 }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x029b A[Catch:{ RuntimeException -> 0x0465 }] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02a2 A[Catch:{ RuntimeException -> 0x0465 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(java.util.Map<java.lang.String, java.lang.String> r17) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            java.lang.Object r2 = r1.k
            monitor-enter(r2)
            android.app.Activity r3 = r1.m     // Catch:{ all -> 0x04bb }
            if (r3 != 0) goto L_0x0012
            java.lang.String r0 = "Not an activity context. Cannot resize."
            r1.e(r0)     // Catch:{ all -> 0x04bb }
            monitor-exit(r2)     // Catch:{ all -> 0x04bb }
            return
        L_0x0012:
            com.google.android.gms.internal.ads.zzbfn r3 = r1.l     // Catch:{ all -> 0x04bb }
            com.google.android.gms.internal.ads.zzbhg r3 = r3.o()     // Catch:{ all -> 0x04bb }
            if (r3 != 0) goto L_0x0021
            java.lang.String r0 = "Webview is not yet available, size is not set."
            r1.e(r0)     // Catch:{ all -> 0x04bb }
            monitor-exit(r2)     // Catch:{ all -> 0x04bb }
            return
        L_0x0021:
            com.google.android.gms.internal.ads.zzbfn r3 = r1.l     // Catch:{ all -> 0x04bb }
            com.google.android.gms.internal.ads.zzbhg r3 = r3.o()     // Catch:{ all -> 0x04bb }
            boolean r3 = r3.e()     // Catch:{ all -> 0x04bb }
            if (r3 == 0) goto L_0x0034
            java.lang.String r0 = "Is interstitial. Cannot resize an interstitial."
            r1.e(r0)     // Catch:{ all -> 0x04bb }
            monitor-exit(r2)     // Catch:{ all -> 0x04bb }
            return
        L_0x0034:
            com.google.android.gms.internal.ads.zzbfn r3 = r1.l     // Catch:{ all -> 0x04bb }
            boolean r3 = r3.h()     // Catch:{ all -> 0x04bb }
            if (r3 == 0) goto L_0x0043
            java.lang.String r0 = "Cannot resize an expanded banner."
            r1.e(r0)     // Catch:{ all -> 0x04bb }
            monitor-exit(r2)     // Catch:{ all -> 0x04bb }
            return
        L_0x0043:
            java.lang.String r3 = "width"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x04bb }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ all -> 0x04bb }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x04bb }
            if (r3 != 0) goto L_0x0062
            com.google.android.gms.ads.internal.zzq.zzkw()     // Catch:{ all -> 0x04bb }
            java.lang.String r3 = "width"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x04bb }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x04bb }
            int r3 = com.google.android.gms.internal.ads.zzaye.V(r3)     // Catch:{ all -> 0x04bb }
            r1.j = r3     // Catch:{ all -> 0x04bb }
        L_0x0062:
            java.lang.String r3 = "height"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x04bb }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ all -> 0x04bb }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x04bb }
            if (r3 != 0) goto L_0x0081
            com.google.android.gms.ads.internal.zzq.zzkw()     // Catch:{ all -> 0x04bb }
            java.lang.String r3 = "height"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x04bb }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x04bb }
            int r3 = com.google.android.gms.internal.ads.zzaye.V(r3)     // Catch:{ all -> 0x04bb }
            r1.g = r3     // Catch:{ all -> 0x04bb }
        L_0x0081:
            java.lang.String r3 = "offsetX"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x04bb }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ all -> 0x04bb }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x04bb }
            if (r3 != 0) goto L_0x00a0
            com.google.android.gms.ads.internal.zzq.zzkw()     // Catch:{ all -> 0x04bb }
            java.lang.String r3 = "offsetX"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x04bb }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x04bb }
            int r3 = com.google.android.gms.internal.ads.zzaye.V(r3)     // Catch:{ all -> 0x04bb }
            r1.h = r3     // Catch:{ all -> 0x04bb }
        L_0x00a0:
            java.lang.String r3 = "offsetY"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x04bb }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ all -> 0x04bb }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x04bb }
            if (r3 != 0) goto L_0x00bf
            com.google.android.gms.ads.internal.zzq.zzkw()     // Catch:{ all -> 0x04bb }
            java.lang.String r3 = "offsetY"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x04bb }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x04bb }
            int r3 = com.google.android.gms.internal.ads.zzaye.V(r3)     // Catch:{ all -> 0x04bb }
            r1.i = r3     // Catch:{ all -> 0x04bb }
        L_0x00bf:
            java.lang.String r3 = "allowOffscreen"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x04bb }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ all -> 0x04bb }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x04bb }
            if (r3 != 0) goto L_0x00db
            java.lang.String r3 = "allowOffscreen"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x04bb }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x04bb }
            boolean r3 = java.lang.Boolean.parseBoolean(r3)     // Catch:{ all -> 0x04bb }
            r1.f5841d = r3     // Catch:{ all -> 0x04bb }
        L_0x00db:
            java.lang.String r3 = "customClosePosition"
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x04bb }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x04bb }
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x04bb }
            if (r3 != 0) goto L_0x00eb
            r1.f5840c = r0     // Catch:{ all -> 0x04bb }
        L_0x00eb:
            int r0 = r1.j     // Catch:{ all -> 0x04bb }
            r3 = 1
            r4 = 0
            if (r0 < 0) goto L_0x00f7
            int r0 = r1.g     // Catch:{ all -> 0x04bb }
            if (r0 < 0) goto L_0x00f7
            r0 = 1
            goto L_0x00f8
        L_0x00f7:
            r0 = 0
        L_0x00f8:
            if (r0 != 0) goto L_0x0101
            java.lang.String r0 = "Invalid width and height options. Cannot resize."
            r1.e(r0)     // Catch:{ all -> 0x04bb }
            monitor-exit(r2)     // Catch:{ all -> 0x04bb }
            return
        L_0x0101:
            android.app.Activity r0 = r1.m     // Catch:{ all -> 0x04bb }
            android.view.Window r0 = r0.getWindow()     // Catch:{ all -> 0x04bb }
            if (r0 == 0) goto L_0x04b4
            android.view.View r5 = r0.getDecorView()     // Catch:{ all -> 0x04bb }
            if (r5 != 0) goto L_0x0111
            goto L_0x04b4
        L_0x0111:
            com.google.android.gms.internal.ads.zzaye r5 = com.google.android.gms.ads.internal.zzq.zzkw()     // Catch:{ all -> 0x04bb }
            android.app.Activity r6 = r1.m     // Catch:{ all -> 0x04bb }
            int[] r5 = r5.U(r6)     // Catch:{ all -> 0x04bb }
            com.google.android.gms.internal.ads.zzaye r6 = com.google.android.gms.ads.internal.zzq.zzkw()     // Catch:{ all -> 0x04bb }
            android.app.Activity r7 = r1.m     // Catch:{ all -> 0x04bb }
            int[] r6 = r6.a0(r7)     // Catch:{ all -> 0x04bb }
            r7 = r5[r4]     // Catch:{ all -> 0x04bb }
            r5 = r5[r3]     // Catch:{ all -> 0x04bb }
            int r8 = r1.j     // Catch:{ all -> 0x04bb }
            r9 = 5
            r10 = 4
            r11 = 3
            r12 = -1
            r13 = 2
            r14 = 50
            if (r8 < r14) goto L_0x0233
            int r8 = r1.j     // Catch:{ all -> 0x04bb }
            if (r8 <= r7) goto L_0x013a
            goto L_0x0233
        L_0x013a:
            int r8 = r1.g     // Catch:{ all -> 0x04bb }
            if (r8 < r14) goto L_0x022d
            int r8 = r1.g     // Catch:{ all -> 0x04bb }
            if (r8 <= r5) goto L_0x0144
            goto L_0x022d
        L_0x0144:
            int r8 = r1.g     // Catch:{ all -> 0x04bb }
            if (r8 != r5) goto L_0x0153
            int r5 = r1.j     // Catch:{ all -> 0x04bb }
            if (r5 != r7) goto L_0x0153
            java.lang.String r5 = "Cannot resize to a full-screen ad."
            com.google.android.gms.internal.ads.zzbba.i(r5)     // Catch:{ all -> 0x04bb }
            goto L_0x0238
        L_0x0153:
            boolean r5 = r1.f5841d     // Catch:{ all -> 0x04bb }
            if (r5 == 0) goto L_0x022b
            java.lang.String r5 = r1.f5840c     // Catch:{ all -> 0x04bb }
            int r8 = r5.hashCode()     // Catch:{ all -> 0x04bb }
            switch(r8) {
                case -1364013995: goto L_0x0193;
                case -1012429441: goto L_0x0189;
                case -655373719: goto L_0x017f;
                case 1163912186: goto L_0x0175;
                case 1288627767: goto L_0x016b;
                case 1755462605: goto L_0x0161;
                default: goto L_0x0160;
            }     // Catch:{ all -> 0x04bb }
        L_0x0160:
            goto L_0x019d
        L_0x0161:
            java.lang.String r8 = "top-center"
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x04bb }
            if (r5 == 0) goto L_0x019d
            r5 = 1
            goto L_0x019e
        L_0x016b:
            java.lang.String r8 = "bottom-center"
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x04bb }
            if (r5 == 0) goto L_0x019d
            r5 = 4
            goto L_0x019e
        L_0x0175:
            java.lang.String r8 = "bottom-right"
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x04bb }
            if (r5 == 0) goto L_0x019d
            r5 = 5
            goto L_0x019e
        L_0x017f:
            java.lang.String r8 = "bottom-left"
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x04bb }
            if (r5 == 0) goto L_0x019d
            r5 = 3
            goto L_0x019e
        L_0x0189:
            java.lang.String r8 = "top-left"
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x04bb }
            if (r5 == 0) goto L_0x019d
            r5 = 0
            goto L_0x019e
        L_0x0193:
            java.lang.String r8 = "center"
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x04bb }
            if (r5 == 0) goto L_0x019d
            r5 = 2
            goto L_0x019e
        L_0x019d:
            r5 = -1
        L_0x019e:
            if (r5 == 0) goto L_0x0212
            if (r5 == r3) goto L_0x0202
            if (r5 == r13) goto L_0x01eb
            if (r5 == r11) goto L_0x01dc
            if (r5 == r10) goto L_0x01c9
            if (r5 == r9) goto L_0x01b8
            int r5 = r1.f5842e     // Catch:{ all -> 0x04bb }
            int r8 = r1.h     // Catch:{ all -> 0x04bb }
            int r5 = r5 + r8
            int r8 = r1.j     // Catch:{ all -> 0x04bb }
            int r5 = r5 + r8
            int r5 = r5 - r14
            int r8 = r1.f5843f     // Catch:{ all -> 0x04bb }
            int r15 = r1.i     // Catch:{ all -> 0x04bb }
            goto L_0x021b
        L_0x01b8:
            int r5 = r1.f5842e     // Catch:{ all -> 0x04bb }
            int r8 = r1.h     // Catch:{ all -> 0x04bb }
            int r5 = r5 + r8
            int r8 = r1.j     // Catch:{ all -> 0x04bb }
            int r5 = r5 + r8
            int r5 = r5 - r14
            int r8 = r1.f5843f     // Catch:{ all -> 0x04bb }
            int r15 = r1.i     // Catch:{ all -> 0x04bb }
            int r8 = r8 + r15
            int r15 = r1.g     // Catch:{ all -> 0x04bb }
            goto L_0x01e8
        L_0x01c9:
            int r5 = r1.f5842e     // Catch:{ all -> 0x04bb }
            int r8 = r1.h     // Catch:{ all -> 0x04bb }
            int r5 = r5 + r8
            int r8 = r1.j     // Catch:{ all -> 0x04bb }
            int r8 = r8 / r13
            int r5 = r5 + r8
            int r5 = r5 + -25
            int r8 = r1.f5843f     // Catch:{ all -> 0x04bb }
            int r15 = r1.i     // Catch:{ all -> 0x04bb }
            int r8 = r8 + r15
            int r15 = r1.g     // Catch:{ all -> 0x04bb }
            goto L_0x01e8
        L_0x01dc:
            int r5 = r1.f5842e     // Catch:{ all -> 0x04bb }
            int r8 = r1.h     // Catch:{ all -> 0x04bb }
            int r5 = r5 + r8
            int r8 = r1.f5843f     // Catch:{ all -> 0x04bb }
            int r15 = r1.i     // Catch:{ all -> 0x04bb }
            int r8 = r8 + r15
            int r15 = r1.g     // Catch:{ all -> 0x04bb }
        L_0x01e8:
            int r8 = r8 + r15
            int r8 = r8 - r14
            goto L_0x021c
        L_0x01eb:
            int r5 = r1.f5842e     // Catch:{ all -> 0x04bb }
            int r8 = r1.h     // Catch:{ all -> 0x04bb }
            int r5 = r5 + r8
            int r8 = r1.j     // Catch:{ all -> 0x04bb }
            int r8 = r8 / r13
            int r5 = r5 + r8
            int r5 = r5 + -25
            int r8 = r1.f5843f     // Catch:{ all -> 0x04bb }
            int r15 = r1.i     // Catch:{ all -> 0x04bb }
            int r8 = r8 + r15
            int r15 = r1.g     // Catch:{ all -> 0x04bb }
            int r15 = r15 / r13
            int r8 = r8 + r15
            int r8 = r8 + -25
            goto L_0x021c
        L_0x0202:
            int r5 = r1.f5842e     // Catch:{ all -> 0x04bb }
            int r8 = r1.h     // Catch:{ all -> 0x04bb }
            int r5 = r5 + r8
            int r8 = r1.j     // Catch:{ all -> 0x04bb }
            int r8 = r8 / r13
            int r5 = r5 + r8
            int r5 = r5 + -25
            int r8 = r1.f5843f     // Catch:{ all -> 0x04bb }
            int r15 = r1.i     // Catch:{ all -> 0x04bb }
            goto L_0x021b
        L_0x0212:
            int r5 = r1.f5842e     // Catch:{ all -> 0x04bb }
            int r8 = r1.h     // Catch:{ all -> 0x04bb }
            int r5 = r5 + r8
            int r8 = r1.f5843f     // Catch:{ all -> 0x04bb }
            int r15 = r1.i     // Catch:{ all -> 0x04bb }
        L_0x021b:
            int r8 = r8 + r15
        L_0x021c:
            if (r5 < 0) goto L_0x0238
            int r5 = r5 + r14
            if (r5 > r7) goto L_0x0238
            r5 = r6[r4]     // Catch:{ all -> 0x04bb }
            if (r8 < r5) goto L_0x0238
            int r8 = r8 + r14
            r5 = r6[r3]     // Catch:{ all -> 0x04bb }
            if (r8 <= r5) goto L_0x022b
            goto L_0x0238
        L_0x022b:
            r5 = 1
            goto L_0x0239
        L_0x022d:
            java.lang.String r5 = "Height is too small or too large."
            com.google.android.gms.internal.ads.zzbba.i(r5)     // Catch:{ all -> 0x04bb }
            goto L_0x0238
        L_0x0233:
            java.lang.String r5 = "Width is too small or too large."
            com.google.android.gms.internal.ads.zzbba.i(r5)     // Catch:{ all -> 0x04bb }
        L_0x0238:
            r5 = 0
        L_0x0239:
            if (r5 != 0) goto L_0x023d
            r5 = 0
            goto L_0x0299
        L_0x023d:
            boolean r5 = r1.f5841d     // Catch:{ all -> 0x04bb }
            if (r5 == 0) goto L_0x0252
            int[] r5 = new int[r13]     // Catch:{ all -> 0x04bb }
            int r6 = r1.f5842e     // Catch:{ all -> 0x04bb }
            int r7 = r1.h     // Catch:{ all -> 0x04bb }
            int r6 = r6 + r7
            r5[r4] = r6     // Catch:{ all -> 0x04bb }
            int r6 = r1.f5843f     // Catch:{ all -> 0x04bb }
            int r7 = r1.i     // Catch:{ all -> 0x04bb }
            int r6 = r6 + r7
            r5[r3] = r6     // Catch:{ all -> 0x04bb }
            goto L_0x0299
        L_0x0252:
            com.google.android.gms.internal.ads.zzaye r5 = com.google.android.gms.ads.internal.zzq.zzkw()     // Catch:{ all -> 0x04bb }
            android.app.Activity r6 = r1.m     // Catch:{ all -> 0x04bb }
            int[] r5 = r5.U(r6)     // Catch:{ all -> 0x04bb }
            com.google.android.gms.internal.ads.zzaye r6 = com.google.android.gms.ads.internal.zzq.zzkw()     // Catch:{ all -> 0x04bb }
            android.app.Activity r7 = r1.m     // Catch:{ all -> 0x04bb }
            int[] r6 = r6.a0(r7)     // Catch:{ all -> 0x04bb }
            r5 = r5[r4]     // Catch:{ all -> 0x04bb }
            int r7 = r1.f5842e     // Catch:{ all -> 0x04bb }
            int r8 = r1.h     // Catch:{ all -> 0x04bb }
            int r7 = r7 + r8
            int r8 = r1.f5843f     // Catch:{ all -> 0x04bb }
            int r15 = r1.i     // Catch:{ all -> 0x04bb }
            int r8 = r8 + r15
            if (r7 >= 0) goto L_0x0276
            r7 = 0
            goto L_0x027f
        L_0x0276:
            int r15 = r1.j     // Catch:{ all -> 0x04bb }
            int r15 = r15 + r7
            if (r15 <= r5) goto L_0x027f
            int r7 = r1.j     // Catch:{ all -> 0x04bb }
            int r7 = r5 - r7
        L_0x027f:
            r5 = r6[r4]     // Catch:{ all -> 0x04bb }
            if (r8 >= r5) goto L_0x0286
            r8 = r6[r4]     // Catch:{ all -> 0x04bb }
            goto L_0x0293
        L_0x0286:
            int r5 = r1.g     // Catch:{ all -> 0x04bb }
            int r5 = r5 + r8
            r15 = r6[r3]     // Catch:{ all -> 0x04bb }
            if (r5 <= r15) goto L_0x0293
            r5 = r6[r3]     // Catch:{ all -> 0x04bb }
            int r6 = r1.g     // Catch:{ all -> 0x04bb }
            int r8 = r5 - r6
        L_0x0293:
            int[] r5 = new int[r13]     // Catch:{ all -> 0x04bb }
            r5[r4] = r7     // Catch:{ all -> 0x04bb }
            r5[r3] = r8     // Catch:{ all -> 0x04bb }
        L_0x0299:
            if (r5 != 0) goto L_0x02a2
            java.lang.String r0 = "Resize location out of screen or close button is not visible."
            r1.e(r0)     // Catch:{ all -> 0x04bb }
            monitor-exit(r2)     // Catch:{ all -> 0x04bb }
            return
        L_0x02a2:
            com.google.android.gms.internal.ads.zzwg.a()     // Catch:{ all -> 0x04bb }
            android.app.Activity r6 = r1.m     // Catch:{ all -> 0x04bb }
            int r7 = r1.j     // Catch:{ all -> 0x04bb }
            int r6 = com.google.android.gms.internal.ads.zzbaq.r(r6, r7)     // Catch:{ all -> 0x04bb }
            com.google.android.gms.internal.ads.zzwg.a()     // Catch:{ all -> 0x04bb }
            android.app.Activity r7 = r1.m     // Catch:{ all -> 0x04bb }
            int r8 = r1.g     // Catch:{ all -> 0x04bb }
            int r7 = com.google.android.gms.internal.ads.zzbaq.r(r7, r8)     // Catch:{ all -> 0x04bb }
            com.google.android.gms.internal.ads.zzbfn r8 = r1.l     // Catch:{ all -> 0x04bb }
            android.view.View r8 = r8.getView()     // Catch:{ all -> 0x04bb }
            android.view.ViewParent r8 = r8.getParent()     // Catch:{ all -> 0x04bb }
            if (r8 == 0) goto L_0x04ad
            boolean r15 = r8 instanceof android.view.ViewGroup     // Catch:{ all -> 0x04bb }
            if (r15 == 0) goto L_0x04ad
            r15 = r8
            android.view.ViewGroup r15 = (android.view.ViewGroup) r15     // Catch:{ all -> 0x04bb }
            com.google.android.gms.internal.ads.zzbfn r9 = r1.l     // Catch:{ all -> 0x04bb }
            android.view.View r9 = r9.getView()     // Catch:{ all -> 0x04bb }
            r15.removeView(r9)     // Catch:{ all -> 0x04bb }
            android.widget.PopupWindow r9 = r1.r     // Catch:{ all -> 0x04bb }
            if (r9 != 0) goto L_0x0305
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8     // Catch:{ all -> 0x04bb }
            r1.t = r8     // Catch:{ all -> 0x04bb }
            com.google.android.gms.ads.internal.zzq.zzkw()     // Catch:{ all -> 0x04bb }
            com.google.android.gms.internal.ads.zzbfn r8 = r1.l     // Catch:{ all -> 0x04bb }
            android.view.View r8 = r8.getView()     // Catch:{ all -> 0x04bb }
            android.graphics.Bitmap r8 = com.google.android.gms.internal.ads.zzaye.f0(r8)     // Catch:{ all -> 0x04bb }
            android.widget.ImageView r9 = new android.widget.ImageView     // Catch:{ all -> 0x04bb }
            android.app.Activity r15 = r1.m     // Catch:{ all -> 0x04bb }
            r9.<init>(r15)     // Catch:{ all -> 0x04bb }
            r1.o = r9     // Catch:{ all -> 0x04bb }
            r9.setImageBitmap(r8)     // Catch:{ all -> 0x04bb }
            com.google.android.gms.internal.ads.zzbfn r8 = r1.l     // Catch:{ all -> 0x04bb }
            com.google.android.gms.internal.ads.zzbhg r8 = r8.o()     // Catch:{ all -> 0x04bb }
            r1.n = r8     // Catch:{ all -> 0x04bb }
            android.view.ViewGroup r8 = r1.t     // Catch:{ all -> 0x04bb }
            android.widget.ImageView r9 = r1.o     // Catch:{ all -> 0x04bb }
            r8.addView(r9)     // Catch:{ all -> 0x04bb }
            goto L_0x030a
        L_0x0305:
            android.widget.PopupWindow r8 = r1.r     // Catch:{ all -> 0x04bb }
            r8.dismiss()     // Catch:{ all -> 0x04bb }
        L_0x030a:
            android.widget.RelativeLayout r8 = new android.widget.RelativeLayout     // Catch:{ all -> 0x04bb }
            android.app.Activity r9 = r1.m     // Catch:{ all -> 0x04bb }
            r8.<init>(r9)     // Catch:{ all -> 0x04bb }
            r1.s = r8     // Catch:{ all -> 0x04bb }
            r8.setBackgroundColor(r4)     // Catch:{ all -> 0x04bb }
            android.widget.RelativeLayout r8 = r1.s     // Catch:{ all -> 0x04bb }
            android.view.ViewGroup$LayoutParams r9 = new android.view.ViewGroup$LayoutParams     // Catch:{ all -> 0x04bb }
            r9.<init>(r6, r7)     // Catch:{ all -> 0x04bb }
            r8.setLayoutParams(r9)     // Catch:{ all -> 0x04bb }
            com.google.android.gms.ads.internal.zzq.zzkw()     // Catch:{ all -> 0x04bb }
            android.widget.RelativeLayout r8 = r1.s     // Catch:{ all -> 0x04bb }
            android.widget.PopupWindow r8 = com.google.android.gms.internal.ads.zzaye.c(r8, r6, r7, r4)     // Catch:{ all -> 0x04bb }
            r1.r = r8     // Catch:{ all -> 0x04bb }
            r8.setOutsideTouchable(r3)     // Catch:{ all -> 0x04bb }
            android.widget.PopupWindow r8 = r1.r     // Catch:{ all -> 0x04bb }
            r8.setTouchable(r3)     // Catch:{ all -> 0x04bb }
            android.widget.PopupWindow r8 = r1.r     // Catch:{ all -> 0x04bb }
            boolean r9 = r1.f5841d     // Catch:{ all -> 0x04bb }
            if (r9 != 0) goto L_0x033b
            r9 = 1
            goto L_0x033c
        L_0x033b:
            r9 = 0
        L_0x033c:
            r8.setClippingEnabled(r9)     // Catch:{ all -> 0x04bb }
            android.widget.RelativeLayout r8 = r1.s     // Catch:{ all -> 0x04bb }
            com.google.android.gms.internal.ads.zzbfn r9 = r1.l     // Catch:{ all -> 0x04bb }
            android.view.View r9 = r9.getView()     // Catch:{ all -> 0x04bb }
            r8.addView(r9, r12, r12)     // Catch:{ all -> 0x04bb }
            android.widget.LinearLayout r8 = new android.widget.LinearLayout     // Catch:{ all -> 0x04bb }
            android.app.Activity r9 = r1.m     // Catch:{ all -> 0x04bb }
            r8.<init>(r9)     // Catch:{ all -> 0x04bb }
            r1.p = r8     // Catch:{ all -> 0x04bb }
            android.widget.RelativeLayout$LayoutParams r8 = new android.widget.RelativeLayout$LayoutParams     // Catch:{ all -> 0x04bb }
            com.google.android.gms.internal.ads.zzwg.a()     // Catch:{ all -> 0x04bb }
            android.app.Activity r9 = r1.m     // Catch:{ all -> 0x04bb }
            int r9 = com.google.android.gms.internal.ads.zzbaq.r(r9, r14)     // Catch:{ all -> 0x04bb }
            com.google.android.gms.internal.ads.zzwg.a()     // Catch:{ all -> 0x04bb }
            android.app.Activity r15 = r1.m     // Catch:{ all -> 0x04bb }
            int r14 = com.google.android.gms.internal.ads.zzbaq.r(r15, r14)     // Catch:{ all -> 0x04bb }
            r8.<init>(r9, r14)     // Catch:{ all -> 0x04bb }
            java.lang.String r9 = r1.f5840c     // Catch:{ all -> 0x04bb }
            int r14 = r9.hashCode()     // Catch:{ all -> 0x04bb }
            switch(r14) {
                case -1364013995: goto L_0x03a6;
                case -1012429441: goto L_0x039c;
                case -655373719: goto L_0x0392;
                case 1163912186: goto L_0x0388;
                case 1288627767: goto L_0x037e;
                case 1755462605: goto L_0x0374;
                default: goto L_0x0373;
            }     // Catch:{ all -> 0x04bb }
        L_0x0373:
            goto L_0x03af
        L_0x0374:
            java.lang.String r14 = "top-center"
            boolean r9 = r9.equals(r14)     // Catch:{ all -> 0x04bb }
            if (r9 == 0) goto L_0x03af
            r12 = 1
            goto L_0x03af
        L_0x037e:
            java.lang.String r14 = "bottom-center"
            boolean r9 = r9.equals(r14)     // Catch:{ all -> 0x04bb }
            if (r9 == 0) goto L_0x03af
            r12 = 4
            goto L_0x03af
        L_0x0388:
            java.lang.String r14 = "bottom-right"
            boolean r9 = r9.equals(r14)     // Catch:{ all -> 0x04bb }
            if (r9 == 0) goto L_0x03af
            r12 = 5
            goto L_0x03af
        L_0x0392:
            java.lang.String r14 = "bottom-left"
            boolean r9 = r9.equals(r14)     // Catch:{ all -> 0x04bb }
            if (r9 == 0) goto L_0x03af
            r12 = 3
            goto L_0x03af
        L_0x039c:
            java.lang.String r14 = "top-left"
            boolean r9 = r9.equals(r14)     // Catch:{ all -> 0x04bb }
            if (r9 == 0) goto L_0x03af
            r12 = 0
            goto L_0x03af
        L_0x03a6:
            java.lang.String r14 = "center"
            boolean r9 = r9.equals(r14)     // Catch:{ all -> 0x04bb }
            if (r9 == 0) goto L_0x03af
            r12 = 2
        L_0x03af:
            r9 = 9
            r14 = 10
            if (r12 == 0) goto L_0x03ef
            r15 = 14
            if (r12 == r3) goto L_0x03e8
            if (r12 == r13) goto L_0x03e2
            r13 = 12
            if (r12 == r11) goto L_0x03db
            if (r12 == r10) goto L_0x03d4
            r9 = 11
            r10 = 5
            if (r12 == r10) goto L_0x03cd
            r8.addRule(r14)     // Catch:{ all -> 0x04bb }
            r8.addRule(r9)     // Catch:{ all -> 0x04bb }
            goto L_0x03f5
        L_0x03cd:
            r8.addRule(r13)     // Catch:{ all -> 0x04bb }
            r8.addRule(r9)     // Catch:{ all -> 0x04bb }
            goto L_0x03f5
        L_0x03d4:
            r8.addRule(r13)     // Catch:{ all -> 0x04bb }
            r8.addRule(r15)     // Catch:{ all -> 0x04bb }
            goto L_0x03f5
        L_0x03db:
            r8.addRule(r13)     // Catch:{ all -> 0x04bb }
            r8.addRule(r9)     // Catch:{ all -> 0x04bb }
            goto L_0x03f5
        L_0x03e2:
            r9 = 13
            r8.addRule(r9)     // Catch:{ all -> 0x04bb }
            goto L_0x03f5
        L_0x03e8:
            r8.addRule(r14)     // Catch:{ all -> 0x04bb }
            r8.addRule(r15)     // Catch:{ all -> 0x04bb }
            goto L_0x03f5
        L_0x03ef:
            r8.addRule(r14)     // Catch:{ all -> 0x04bb }
            r8.addRule(r9)     // Catch:{ all -> 0x04bb }
        L_0x03f5:
            android.widget.LinearLayout r9 = r1.p     // Catch:{ all -> 0x04bb }
            com.google.android.gms.internal.ads.h3 r10 = new com.google.android.gms.internal.ads.h3     // Catch:{ all -> 0x04bb }
            r10.<init>(r1)     // Catch:{ all -> 0x04bb }
            r9.setOnClickListener(r10)     // Catch:{ all -> 0x04bb }
            android.widget.LinearLayout r9 = r1.p     // Catch:{ all -> 0x04bb }
            java.lang.String r10 = "Close button"
            r9.setContentDescription(r10)     // Catch:{ all -> 0x04bb }
            android.widget.RelativeLayout r9 = r1.s     // Catch:{ all -> 0x04bb }
            android.widget.LinearLayout r10 = r1.p     // Catch:{ all -> 0x04bb }
            r9.addView(r10, r8)     // Catch:{ all -> 0x04bb }
            android.widget.PopupWindow r8 = r1.r     // Catch:{ RuntimeException -> 0x0465 }
            android.view.View r0 = r0.getDecorView()     // Catch:{ RuntimeException -> 0x0465 }
            com.google.android.gms.internal.ads.zzwg.a()     // Catch:{ RuntimeException -> 0x0465 }
            android.app.Activity r9 = r1.m     // Catch:{ RuntimeException -> 0x0465 }
            r10 = r5[r4]     // Catch:{ RuntimeException -> 0x0465 }
            int r9 = com.google.android.gms.internal.ads.zzbaq.r(r9, r10)     // Catch:{ RuntimeException -> 0x0465 }
            com.google.android.gms.internal.ads.zzwg.a()     // Catch:{ RuntimeException -> 0x0465 }
            android.app.Activity r10 = r1.m     // Catch:{ RuntimeException -> 0x0465 }
            r11 = r5[r3]     // Catch:{ RuntimeException -> 0x0465 }
            int r10 = com.google.android.gms.internal.ads.zzbaq.r(r10, r11)     // Catch:{ RuntimeException -> 0x0465 }
            r8.showAtLocation(r0, r4, r9, r10)     // Catch:{ RuntimeException -> 0x0465 }
            r0 = r5[r4]     // Catch:{ all -> 0x04bb }
            r8 = r5[r3]     // Catch:{ all -> 0x04bb }
            com.google.android.gms.internal.ads.zzaqc r9 = r1.q     // Catch:{ all -> 0x04bb }
            if (r9 == 0) goto L_0x043d
            com.google.android.gms.internal.ads.zzaqc r9 = r1.q     // Catch:{ all -> 0x04bb }
            int r10 = r1.j     // Catch:{ all -> 0x04bb }
            int r11 = r1.g     // Catch:{ all -> 0x04bb }
            r9.c(r0, r8, r10, r11)     // Catch:{ all -> 0x04bb }
        L_0x043d:
            com.google.android.gms.internal.ads.zzbfn r0 = r1.l     // Catch:{ all -> 0x04bb }
            com.google.android.gms.internal.ads.zzbhg r6 = com.google.android.gms.internal.ads.zzbhg.j(r6, r7)     // Catch:{ all -> 0x04bb }
            r0.X(r6)     // Catch:{ all -> 0x04bb }
            r0 = r5[r4]     // Catch:{ all -> 0x04bb }
            r3 = r5[r3]     // Catch:{ all -> 0x04bb }
            com.google.android.gms.internal.ads.zzaye r5 = com.google.android.gms.ads.internal.zzq.zzkw()     // Catch:{ all -> 0x04bb }
            android.app.Activity r6 = r1.m     // Catch:{ all -> 0x04bb }
            int[] r5 = r5.a0(r6)     // Catch:{ all -> 0x04bb }
            r4 = r5[r4]     // Catch:{ all -> 0x04bb }
            int r3 = r3 - r4
            int r4 = r1.j     // Catch:{ all -> 0x04bb }
            int r5 = r1.g     // Catch:{ all -> 0x04bb }
            r1.c(r0, r3, r4, r5)     // Catch:{ all -> 0x04bb }
            java.lang.String r0 = "resized"
            r1.g(r0)     // Catch:{ all -> 0x04bb }
            monitor-exit(r2)     // Catch:{ all -> 0x04bb }
            return
        L_0x0465:
            r0 = move-exception
            java.lang.String r3 = "Cannot show popup window: "
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x04bb }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x04bb }
            int r4 = r0.length()     // Catch:{ all -> 0x04bb }
            if (r4 == 0) goto L_0x047b
            java.lang.String r0 = r3.concat(r0)     // Catch:{ all -> 0x04bb }
            goto L_0x0480
        L_0x047b:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x04bb }
            r0.<init>(r3)     // Catch:{ all -> 0x04bb }
        L_0x0480:
            r1.e(r0)     // Catch:{ all -> 0x04bb }
            android.widget.RelativeLayout r0 = r1.s     // Catch:{ all -> 0x04bb }
            com.google.android.gms.internal.ads.zzbfn r3 = r1.l     // Catch:{ all -> 0x04bb }
            android.view.View r3 = r3.getView()     // Catch:{ all -> 0x04bb }
            r0.removeView(r3)     // Catch:{ all -> 0x04bb }
            android.view.ViewGroup r0 = r1.t     // Catch:{ all -> 0x04bb }
            if (r0 == 0) goto L_0x04ab
            android.view.ViewGroup r0 = r1.t     // Catch:{ all -> 0x04bb }
            android.widget.ImageView r3 = r1.o     // Catch:{ all -> 0x04bb }
            r0.removeView(r3)     // Catch:{ all -> 0x04bb }
            android.view.ViewGroup r0 = r1.t     // Catch:{ all -> 0x04bb }
            com.google.android.gms.internal.ads.zzbfn r3 = r1.l     // Catch:{ all -> 0x04bb }
            android.view.View r3 = r3.getView()     // Catch:{ all -> 0x04bb }
            r0.addView(r3)     // Catch:{ all -> 0x04bb }
            com.google.android.gms.internal.ads.zzbfn r0 = r1.l     // Catch:{ all -> 0x04bb }
            com.google.android.gms.internal.ads.zzbhg r3 = r1.n     // Catch:{ all -> 0x04bb }
            r0.X(r3)     // Catch:{ all -> 0x04bb }
        L_0x04ab:
            monitor-exit(r2)     // Catch:{ all -> 0x04bb }
            return
        L_0x04ad:
            java.lang.String r0 = "Webview is detached, probably in the middle of a resize or expand."
            r1.e(r0)     // Catch:{ all -> 0x04bb }
            monitor-exit(r2)     // Catch:{ all -> 0x04bb }
            return
        L_0x04b4:
            java.lang.String r0 = "Activity context is not ready, cannot get window or decor view."
            r1.e(r0)     // Catch:{ all -> 0x04bb }
            monitor-exit(r2)     // Catch:{ all -> 0x04bb }
            return
        L_0x04bb:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x04bb }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzapt.j(java.util.Map):void");
    }

    public final void k(int i2, int i3) {
        this.f5842e = i2;
        this.f5843f = i3;
    }

    public final boolean l() {
        boolean z;
        synchronized (this.k) {
            z = this.r != null;
        }
        return z;
    }
}
