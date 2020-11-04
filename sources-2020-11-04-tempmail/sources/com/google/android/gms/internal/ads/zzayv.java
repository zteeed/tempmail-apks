package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.os.Handler;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzq;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzayv {

    /* renamed from: a  reason: collision with root package name */
    private final Context f6239a;

    /* renamed from: b  reason: collision with root package name */
    private String f6240b;

    /* renamed from: c  reason: collision with root package name */
    private String f6241c;

    /* renamed from: d  reason: collision with root package name */
    private String f6242d;

    /* renamed from: e  reason: collision with root package name */
    private String f6243e;

    /* renamed from: f  reason: collision with root package name */
    private int f6244f;
    private int g;
    private PointF h;
    private PointF i;
    private Handler j;
    private Runnable k;

    public zzayv(Context context) {
        this.f6244f = 0;
        this.k = new r5(this);
        this.f6239a = context;
        this.g = ViewConfiguration.get(context).getScaledTouchSlop();
        zzq.zzlk().b();
        this.j = zzq.zzlk().a();
    }

    private static int c(List<String> list, String str, boolean z) {
        list.add(str);
        return list.size() - 1;
    }

    private final boolean f(float f2, float f3, float f4, float f5) {
        return Math.abs(this.h.x - f2) < ((float) this.g) && Math.abs(this.h.y - f3) < ((float) this.g) && Math.abs(this.i.x - f4) < ((float) this.g) && Math.abs(this.i.y - f5) < ((float) this.g);
    }

    public final void a(String str) {
        this.f6241c = str;
    }

    public final void b() {
        try {
            if (!(this.f6239a instanceof Activity)) {
                zzbba.h("Can not create dialog without Activity Context");
                return;
            }
            String str = !TextUtils.isEmpty(zzq.zzlg().l()) ? "Creative Preview (Enabled)" : "Creative Preview";
            String str2 = zzq.zzlg().m() ? "Troubleshooting (Enabled)" : "Troubleshooting";
            ArrayList arrayList = new ArrayList();
            int c2 = c(arrayList, "Ad Information", true);
            int c3 = c(arrayList, str, true);
            int c4 = c(arrayList, str2, true);
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f6239a, zzq.zzky().t());
            builder.setTitle("Select a Debug Mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new q5(this, c2, c3, c4));
            builder.create().show();
        } catch (WindowManager.BadTokenException e2) {
            zzaxv.l("", e2);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x006e, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x0073;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void d(int r1, int r2, int r3, android.content.DialogInterface r4, int r5) {
        /*
            r0 = this;
            if (r5 != r1) goto L_0x009b
            android.content.Context r1 = r0.f6239a
            boolean r1 = r1 instanceof android.app.Activity
            if (r1 != 0) goto L_0x000e
            java.lang.String r1 = "Can not create dialog without Activity Context"
            com.google.android.gms.internal.ads.zzbba.h(r1)
            return
        L_0x000e:
            java.lang.String r1 = r0.f6240b
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0071
            java.lang.String r2 = "\\+"
            java.lang.String r3 = "%20"
            java.lang.String r1 = r1.replaceAll(r2, r3)
            android.net.Uri$Builder r2 = new android.net.Uri$Builder
            r2.<init>()
            android.net.Uri$Builder r1 = r2.encodedQuery(r1)
            android.net.Uri r1 = r1.build()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.google.android.gms.ads.internal.zzq.zzkw()
            java.util.Map r1 = com.google.android.gms.internal.ads.zzaye.d0(r1)
            java.util.Set r3 = r1.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x003f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0062
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            r2.append(r4)
            java.lang.String r5 = " = "
            r2.append(r5)
            java.lang.Object r4 = r1.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            r2.append(r4)
            java.lang.String r4 = "\n\n"
            r2.append(r4)
            goto L_0x003f
        L_0x0062:
            java.lang.String r1 = r2.toString()
            java.lang.String r1 = r1.trim()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0071
            goto L_0x0073
        L_0x0071:
            java.lang.String r1 = "No debug information"
        L_0x0073:
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
            android.content.Context r3 = r0.f6239a
            r2.<init>(r3)
            r2.setMessage(r1)
            java.lang.String r3 = "Ad Information"
            r2.setTitle(r3)
            com.google.android.gms.internal.ads.t5 r3 = new com.google.android.gms.internal.ads.t5
            r3.<init>(r0, r1)
            java.lang.String r1 = "Share"
            r2.setPositiveButton(r1, r3)
            android.content.DialogInterface$OnClickListener r1 = com.google.android.gms.internal.ads.s5.f5047b
            java.lang.String r3 = "Close"
            r2.setNegativeButton(r3, r1)
            android.app.AlertDialog r1 = r2.create()
            r1.show()
            return
        L_0x009b:
            if (r5 != r2) goto L_0x00ad
            java.lang.String r1 = "Debug mode [Creative Preview] selected."
            com.google.android.gms.internal.ads.zzbba.f(r1)
            com.google.android.gms.internal.ads.zzdvi r1 = com.google.android.gms.internal.ads.zzbbf.f6320a
            com.google.android.gms.internal.ads.v5 r2 = new com.google.android.gms.internal.ads.v5
            r2.<init>(r0)
            r1.execute(r2)
            return
        L_0x00ad:
            if (r5 != r3) goto L_0x00be
            java.lang.String r1 = "Debug mode [Troubleshooting] selected."
            com.google.android.gms.internal.ads.zzbba.f(r1)
            com.google.android.gms.internal.ads.zzdvi r1 = com.google.android.gms.internal.ads.zzbbf.f6320a
            com.google.android.gms.internal.ads.u5 r2 = new com.google.android.gms.internal.ads.u5
            r2.<init>(r0)
            r1.execute(r2)
        L_0x00be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzayv.d(int, int, int, android.content.DialogInterface, int):void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void e(String str, DialogInterface dialogInterface, int i2) {
        zzq.zzkw();
        zzaye.i(this.f6239a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    public final void g(String str) {
        this.f6242d = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(android.view.MotionEvent r11) {
        /*
            r10 = this;
            int r0 = r11.getActionMasked()
            int r1 = r11.getHistorySize()
            int r2 = r11.getPointerCount()
            r3 = 0
            if (r0 != 0) goto L_0x0021
            r10.f6244f = r3
            android.graphics.PointF r0 = new android.graphics.PointF
            float r1 = r11.getX(r3)
            float r11 = r11.getY(r3)
            r0.<init>(r1, r11)
            r10.h = r0
            return
        L_0x0021:
            int r4 = r10.f6244f
            r5 = -1
            if (r4 != r5) goto L_0x0027
            return
        L_0x0027:
            r6 = 5
            r7 = 1
            if (r4 != 0) goto L_0x0056
            if (r0 != r6) goto L_0x0056
            r10.f6244f = r6
            android.graphics.PointF r0 = new android.graphics.PointF
            float r1 = r11.getX(r7)
            float r11 = r11.getY(r7)
            r0.<init>(r1, r11)
            r10.i = r0
            android.os.Handler r11 = r10.j
            java.lang.Runnable r0 = r10.k
            com.google.android.gms.internal.ads.zzaag<java.lang.Long> r1 = com.google.android.gms.internal.ads.zzaav.X1
            com.google.android.gms.internal.ads.zzaar r2 = com.google.android.gms.internal.ads.zzwg.e()
            java.lang.Object r1 = r2.c(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r11.postDelayed(r0, r1)
            return
        L_0x0056:
            int r4 = r10.f6244f
            if (r4 != r6) goto L_0x00a2
            r4 = 2
            if (r2 == r4) goto L_0x005f
        L_0x005d:
            r3 = 1
            goto L_0x0097
        L_0x005f:
            if (r0 != r4) goto L_0x0097
            r0 = 0
            r2 = 0
        L_0x0063:
            if (r0 >= r1) goto L_0x007f
            float r4 = r11.getHistoricalX(r3, r0)
            float r6 = r11.getHistoricalY(r3, r0)
            float r8 = r11.getHistoricalX(r7, r0)
            float r9 = r11.getHistoricalY(r7, r0)
            boolean r4 = r10.f(r4, r6, r8, r9)
            if (r4 != 0) goto L_0x007c
            r2 = 1
        L_0x007c:
            int r0 = r0 + 1
            goto L_0x0063
        L_0x007f:
            float r0 = r11.getX()
            float r1 = r11.getY()
            float r3 = r11.getX(r7)
            float r11 = r11.getY(r7)
            boolean r11 = r10.f(r0, r1, r3, r11)
            if (r11 != 0) goto L_0x0096
            goto L_0x005d
        L_0x0096:
            r3 = r2
        L_0x0097:
            if (r3 == 0) goto L_0x00a2
            r10.f6244f = r5
            android.os.Handler r11 = r10.j
            java.lang.Runnable r0 = r10.k
            r11.removeCallbacks(r0)
        L_0x00a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzayv.h(android.view.MotionEvent):void");
    }

    public final void i(String str) {
        this.f6240b = str;
    }

    public final void j(String str) {
        this.f6243e = str;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void k() {
        zzq.zzlg().a(this.f6239a, this.f6241c, this.f6242d, this.f6243e);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void l() {
        zzq.zzlg().g(this.f6239a, this.f6241c, this.f6242d);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void m() {
        this.f6244f = 4;
        b();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.f6240b);
        sb.append(",DebugSignal: ");
        sb.append(this.f6243e);
        sb.append(",AFMA Version: ");
        sb.append(this.f6242d);
        sb.append(",Ad Unit ID: ");
        sb.append(this.f6241c);
        sb.append("}");
        return sb.toString();
    }

    public zzayv(Context context, String str) {
        this(context);
        this.f6240b = str;
    }
}
