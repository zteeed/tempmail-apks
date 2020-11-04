package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.zzi;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaav;
import com.google.android.gms.internal.ads.zzabi;
import com.google.android.gms.internal.ads.zzagi;
import com.google.android.gms.internal.ads.zzagk;
import com.google.android.gms.internal.ads.zzahf;
import com.google.android.gms.internal.ads.zzaqc;
import com.google.android.gms.internal.ads.zzaqh;
import com.google.android.gms.internal.ads.zzavr;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzayj;
import com.google.android.gms.internal.ads.zzbba;
import com.google.android.gms.internal.ads.zzbfn;
import com.google.android.gms.internal.ads.zzbfv;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzeg;
import com.google.android.gms.internal.ads.zzso;
import com.google.android.gms.internal.ads.zztm;
import com.google.android.gms.internal.ads.zzuu;
import com.google.android.gms.internal.ads.zzwg;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public class zzc extends zzaqh implements zzy {
    @VisibleForTesting
    private static final int zzdna = Color.argb(0, 0, 0, 0);
    protected final Activity zzaar;
    @VisibleForTesting
    private boolean zzboj = false;
    @VisibleForTesting
    zzbfn zzdfp;
    @VisibleForTesting
    AdOverlayInfoParcel zzdnb;
    @VisibleForTesting
    private zzi zzdnc;
    @VisibleForTesting
    private zzq zzdnd;
    @VisibleForTesting
    private boolean zzdne = false;
    @VisibleForTesting
    private FrameLayout zzdnf;
    @VisibleForTesting
    private WebChromeClient.CustomViewCallback zzdng;
    @VisibleForTesting
    private boolean zzdnh = false;
    @VisibleForTesting
    private zzj zzdni;
    @VisibleForTesting
    private boolean zzdnj = false;
    @VisibleForTesting
    int zzdnk = 0;
    private final Object zzdnl = new Object();
    private Runnable zzdnm;
    private boolean zzdnn;
    private boolean zzdno;
    private boolean zzdnp = false;
    private boolean zzdnq = false;
    private boolean zzdnr = true;

    public zzc(Activity activity) {
        this.zzaar = activity;
    }

    private final void zzai(boolean z) {
        int intValue = ((Integer) zzwg.e().c(zzaav.h2)).intValue();
        zzp zzp = new zzp();
        zzp.size = 50;
        zzp.paddingLeft = z ? intValue : 0;
        zzp.paddingRight = z ? 0 : intValue;
        zzp.paddingTop = 0;
        zzp.paddingBottom = intValue;
        this.zzdnd = new zzq(this.zzaar, zzp, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(z ? 11 : 9);
        zza(z, this.zzdnb.zzdog);
        this.zzdni.addView(this.zzdnd, layoutParams);
    }

    private final void zzaj(boolean z) throws zzg {
        if (!this.zzdno) {
            this.zzaar.requestWindowFeature(1);
        }
        Window window = this.zzaar.getWindow();
        if (window != null) {
            zzbfn zzbfn = this.zzdnb.zzdfp;
            zzbgz q = zzbfn != null ? zzbfn.q() : null;
            boolean z2 = false;
            boolean z3 = q != null && q.o();
            this.zzdnj = false;
            if (z3) {
                int i = this.zzdnb.orientation;
                zzq.zzky();
                if (i == 6) {
                    if (this.zzaar.getResources().getConfiguration().orientation == 1) {
                        z2 = true;
                    }
                    this.zzdnj = z2;
                } else {
                    int i2 = this.zzdnb.orientation;
                    zzq.zzky();
                    if (i2 == 7) {
                        if (this.zzaar.getResources().getConfiguration().orientation == 2) {
                            z2 = true;
                        }
                        this.zzdnj = z2;
                    }
                }
            }
            boolean z4 = this.zzdnj;
            StringBuilder sb = new StringBuilder(46);
            sb.append("Delay onShow to next orientation change: ");
            sb.append(z4);
            zzbba.f(sb.toString());
            setRequestedOrientation(this.zzdnb.orientation);
            zzq.zzky();
            window.setFlags(16777216, 16777216);
            zzbba.f("Hardware acceleration on the AdActivity window enabled.");
            if (!this.zzboj) {
                this.zzdni.setBackgroundColor(-16777216);
            } else {
                this.zzdni.setBackgroundColor(zzdna);
            }
            this.zzaar.setContentView(this.zzdni);
            this.zzdno = true;
            if (z) {
                try {
                    zzq.zzkx();
                    zzbfn a2 = zzbfv.a(this.zzaar, this.zzdnb.zzdfp != null ? this.zzdnb.zzdfp.o() : null, this.zzdnb.zzdfp != null ? this.zzdnb.zzdfp.v0() : null, true, z3, (zzeg) null, this.zzdnb.zzboy, (zzabi) null, (zzi) null, this.zzdnb.zzdfp != null ? this.zzdnb.zzdfp.j() : null, zztm.f(), (zzso) null, false);
                    this.zzdfp = a2;
                    zzbgz q2 = a2.q();
                    AdOverlayInfoParcel adOverlayInfoParcel = this.zzdnb;
                    zzagi zzagi = adOverlayInfoParcel.zzddi;
                    zzagk zzagk = adOverlayInfoParcel.zzddj;
                    zzt zzt = adOverlayInfoParcel.zzdoi;
                    zzbfn zzbfn2 = adOverlayInfoParcel.zzdfp;
                    q2.f((zzuu) null, zzagi, (zzo) null, zzagk, zzt, true, (zzahf) null, zzbfn2 != null ? zzbfn2.q().l() : null, (zzaqc) null, (zzavr) null);
                    this.zzdfp.q().b(new zzf(this));
                    AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzdnb;
                    String str = adOverlayInfoParcel2.url;
                    if (str != null) {
                        this.zzdfp.loadUrl(str);
                    } else {
                        String str2 = adOverlayInfoParcel2.zzdoh;
                        if (str2 != null) {
                            this.zzdfp.loadDataWithBaseURL(adOverlayInfoParcel2.zzdof, str2, "text/html", "UTF-8", (String) null);
                        } else {
                            throw new zzg("No URL or HTML to display in ad overlay.");
                        }
                    }
                    zzbfn zzbfn3 = this.zzdnb.zzdfp;
                    if (zzbfn3 != null) {
                        zzbfn3.l0(this);
                    }
                } catch (Exception e2) {
                    zzbba.c("Error obtaining webview.", e2);
                    throw new zzg("Could not obtain webview for the overlay.");
                }
            } else {
                zzbfn zzbfn4 = this.zzdnb.zzdfp;
                this.zzdfp = zzbfn4;
                zzbfn4.b0(this.zzaar);
            }
            this.zzdfp.M(this);
            zzbfn zzbfn5 = this.zzdnb.zzdfp;
            if (zzbfn5 != null) {
                zzc(zzbfn5.D(), this.zzdni);
            }
            ViewParent parent = this.zzdfp.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(this.zzdfp.getView());
            }
            if (this.zzboj) {
                this.zzdfp.p();
            }
            zzbfn zzbfn6 = this.zzdfp;
            Activity activity = this.zzaar;
            AdOverlayInfoParcel adOverlayInfoParcel3 = this.zzdnb;
            zzbfn6.x0((ViewGroup) null, activity, adOverlayInfoParcel3.zzdof, adOverlayInfoParcel3.zzdoh);
            this.zzdni.addView(this.zzdfp.getView(), -1, -1);
            if (!z && !this.zzdnj) {
                zzuq();
            }
            zzai(z3);
            if (this.zzdfp.z0()) {
                zza(z3, true);
                return;
            }
            return;
        }
        throw new zzg("Invalid activity, no window available.");
    }

    private static void zzc(IObjectWrapper iObjectWrapper, View view) {
        if (iObjectWrapper != null && view != null) {
            zzq.zzll().d(iObjectWrapper, view);
        }
    }

    private final void zzun() {
        if (this.zzaar.isFinishing() && !this.zzdnp) {
            this.zzdnp = true;
            zzbfn zzbfn = this.zzdfp;
            if (zzbfn != null) {
                zzbfn.f0(this.zzdnk);
                synchronized (this.zzdnl) {
                    if (!this.zzdnn && this.zzdfp.n0()) {
                        zze zze = new zze(this);
                        this.zzdnm = zze;
                        zzaye.h.postDelayed(zze, ((Long) zzwg.e().c(zzaav.v0)).longValue());
                        return;
                    }
                }
            }
            zzuo();
        }
    }

    private final void zzuq() {
        this.zzdfp.J();
    }

    public final void close() {
        this.zzdnk = 2;
        this.zzaar.finish();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    public final void onBackPressed() {
        this.zzdnk = 0;
    }

    public void onCreate(Bundle bundle) {
        this.zzaar.requestWindowFeature(1);
        this.zzdnh = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            AdOverlayInfoParcel zzc = AdOverlayInfoParcel.zzc(this.zzaar.getIntent());
            this.zzdnb = zzc;
            if (zzc != null) {
                if (zzc.zzboy.f6133d > 7500000) {
                    this.zzdnk = 3;
                }
                if (this.zzaar.getIntent() != null) {
                    this.zzdnr = this.zzaar.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
                }
                if (this.zzdnb.zzdol != null) {
                    this.zzboj = this.zzdnb.zzdol.zzboj;
                } else {
                    this.zzboj = false;
                }
                if (this.zzboj && this.zzdnb.zzdol.zzboo != -1) {
                    new zzl(this).zzwq();
                }
                if (bundle == null) {
                    if (this.zzdnb.zzdoe != null && this.zzdnr) {
                        this.zzdnb.zzdoe.zzue();
                    }
                    if (!(this.zzdnb.zzdoj == 1 || this.zzdnb.zzcgl == null)) {
                        this.zzdnb.zzcgl.onAdClicked();
                    }
                }
                zzj zzj = new zzj(this.zzaar, this.zzdnb.zzdok, this.zzdnb.zzboy.f6131b);
                this.zzdni = zzj;
                zzj.setId(1000);
                zzq.zzky().p(this.zzaar);
                int i = this.zzdnb.zzdoj;
                if (i == 1) {
                    zzaj(false);
                } else if (i == 2) {
                    this.zzdnc = new zzi(this.zzdnb.zzdfp);
                    zzaj(false);
                } else if (i == 3) {
                    zzaj(true);
                } else {
                    throw new zzg("Could not determine ad overlay type.");
                }
            } else {
                throw new zzg("Could not get info for ad overlay.");
            }
        } catch (zzg e2) {
            zzbba.i(e2.getMessage());
            this.zzdnk = 3;
            this.zzaar.finish();
        }
    }

    public final void onDestroy() {
        zzbfn zzbfn = this.zzdfp;
        if (zzbfn != null) {
            try {
                this.zzdni.removeView(zzbfn.getView());
            } catch (NullPointerException unused) {
            }
        }
        zzun();
    }

    public final void onPause() {
        zzuj();
        zzo zzo = this.zzdnb.zzdoe;
        if (zzo != null) {
            zzo.onPause();
        }
        if (!((Boolean) zzwg.e().c(zzaav.f2)).booleanValue() && this.zzdfp != null && (!this.zzaar.isFinishing() || this.zzdnc == null)) {
            zzq.zzky();
            zzayj.j(this.zzdfp);
        }
        zzun();
    }

    public final void onRestart() {
    }

    public final void onResume() {
        zzo zzo = this.zzdnb.zzdoe;
        if (zzo != null) {
            zzo.onResume();
        }
        zza(this.zzaar.getResources().getConfiguration());
        if (!((Boolean) zzwg.e().c(zzaav.f2)).booleanValue()) {
            zzbfn zzbfn = this.zzdfp;
            if (zzbfn == null || zzbfn.l()) {
                zzbba.i("The webview does not exist. Ignoring action.");
                return;
            }
            zzq.zzky();
            zzayj.l(this.zzdfp);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzdnh);
    }

    public final void onStart() {
        if (((Boolean) zzwg.e().c(zzaav.f2)).booleanValue()) {
            zzbfn zzbfn = this.zzdfp;
            if (zzbfn == null || zzbfn.l()) {
                zzbba.i("The webview does not exist. Ignoring action.");
                return;
            }
            zzq.zzky();
            zzayj.l(this.zzdfp);
        }
    }

    public final void onStop() {
        if (((Boolean) zzwg.e().c(zzaav.f2)).booleanValue() && this.zzdfp != null && (!this.zzaar.isFinishing() || this.zzdnc == null)) {
            zzq.zzky();
            zzayj.j(this.zzdfp);
        }
        zzun();
    }

    public final void setRequestedOrientation(int i) {
        if (this.zzaar.getApplicationInfo().targetSdkVersion >= ((Integer) zzwg.e().c(zzaav.Q2)).intValue()) {
            if (this.zzaar.getApplicationInfo().targetSdkVersion <= ((Integer) zzwg.e().c(zzaav.R2)).intValue()) {
                if (Build.VERSION.SDK_INT >= ((Integer) zzwg.e().c(zzaav.S2)).intValue()) {
                    if (Build.VERSION.SDK_INT <= ((Integer) zzwg.e().c(zzaav.T2)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.zzaar.setRequestedOrientation(i);
        } catch (Throwable th) {
            zzq.zzla().h(th, "AdOverlay.setRequestedOrientation");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0018, code lost:
        r0 = (r0 = r6.zzdnb).zzdol;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(boolean r7, boolean r8) {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzaag<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzaav.w0
            com.google.android.gms.internal.ads.zzaar r1 = com.google.android.gms.internal.ads.zzwg.e()
            java.lang.Object r0 = r1.c(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0022
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r6.zzdnb
            if (r0 == 0) goto L_0x0022
            com.google.android.gms.ads.internal.zzg r0 = r0.zzdol
            if (r0 == 0) goto L_0x0022
            boolean r0 = r0.zzboq
            if (r0 == 0) goto L_0x0022
            r0 = 1
            goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            com.google.android.gms.internal.ads.zzaag<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.zzaav.x0
            com.google.android.gms.internal.ads.zzaar r4 = com.google.android.gms.internal.ads.zzwg.e()
            java.lang.Object r3 = r4.c(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0043
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r6.zzdnb
            if (r3 == 0) goto L_0x0043
            com.google.android.gms.ads.internal.zzg r3 = r3.zzdol
            if (r3 == 0) goto L_0x0043
            boolean r3 = r3.zzbor
            if (r3 == 0) goto L_0x0043
            r3 = 1
            goto L_0x0044
        L_0x0043:
            r3 = 0
        L_0x0044:
            if (r7 == 0) goto L_0x005a
            if (r8 == 0) goto L_0x005a
            if (r0 == 0) goto L_0x005a
            if (r3 != 0) goto L_0x005a
            com.google.android.gms.internal.ads.zzaqd r7 = new com.google.android.gms.internal.ads.zzaqd
            com.google.android.gms.internal.ads.zzbfn r4 = r6.zzdfp
            java.lang.String r5 = "useCustomClose"
            r7.<init>(r4, r5)
            java.lang.String r4 = "Custom close has been disabled for interstitial ads in this ad slot."
            r7.e(r4)
        L_0x005a:
            com.google.android.gms.ads.internal.overlay.zzq r7 = r6.zzdnd
            if (r7 == 0) goto L_0x0069
            if (r3 != 0) goto L_0x0066
            if (r8 == 0) goto L_0x0065
            if (r0 != 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r1 = 0
        L_0x0066:
            r7.zzal(r1)
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzc.zza(boolean, boolean):void");
    }

    public final void zzad(IObjectWrapper iObjectWrapper) {
        zza((Configuration) ObjectWrapper.P(iObjectWrapper));
    }

    public final void zzdp() {
        this.zzdno = true;
    }

    public final void zzuj() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzdnb;
        if (adOverlayInfoParcel != null && this.zzdne) {
            setRequestedOrientation(adOverlayInfoParcel.orientation);
        }
        if (this.zzdnf != null) {
            this.zzaar.setContentView(this.zzdni);
            this.zzdno = true;
            this.zzdnf.removeAllViews();
            this.zzdnf = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.zzdng;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.zzdng = null;
        }
        this.zzdne = false;
    }

    public final void zzuk() {
        this.zzdnk = 1;
        this.zzaar.finish();
    }

    public final boolean zzul() {
        this.zzdnk = 0;
        zzbfn zzbfn = this.zzdfp;
        if (zzbfn == null) {
            return true;
        }
        boolean c0 = zzbfn.c0();
        if (!c0) {
            this.zzdfp.z("onbackblocked", Collections.emptyMap());
        }
        return c0;
    }

    public final void zzum() {
        this.zzdni.removeView(this.zzdnd);
        zzai(true);
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final void zzuo() {
        zzbfn zzbfn;
        zzo zzo;
        if (!this.zzdnq) {
            this.zzdnq = true;
            zzbfn zzbfn2 = this.zzdfp;
            if (zzbfn2 != null) {
                this.zzdni.removeView(zzbfn2.getView());
                zzi zzi = this.zzdnc;
                if (zzi != null) {
                    this.zzdfp.b0(zzi.zzvr);
                    this.zzdfp.w0(false);
                    ViewGroup viewGroup = this.zzdnc.parent;
                    View view = this.zzdfp.getView();
                    zzi zzi2 = this.zzdnc;
                    viewGroup.addView(view, zzi2.index, zzi2.zzdnx);
                    this.zzdnc = null;
                } else if (this.zzaar.getApplicationContext() != null) {
                    this.zzdfp.b0(this.zzaar.getApplicationContext());
                }
                this.zzdfp = null;
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.zzdnb;
            if (!(adOverlayInfoParcel == null || (zzo = adOverlayInfoParcel.zzdoe) == null)) {
                zzo.zzud();
            }
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzdnb;
            if (adOverlayInfoParcel2 != null && (zzbfn = adOverlayInfoParcel2.zzdfp) != null) {
                zzc(zzbfn.D(), this.zzdnb.zzdfp.getView());
            }
        }
    }

    public final void zzup() {
        if (this.zzdnj) {
            this.zzdnj = false;
            zzuq();
        }
    }

    public final void zzur() {
        this.zzdni.zzdnz = true;
    }

    public final void zzus() {
        synchronized (this.zzdnl) {
            this.zzdnn = true;
            if (this.zzdnm != null) {
                zzaye.h.removeCallbacks(this.zzdnm);
                zzaye.h.post(this.zzdnm);
            }
        }
    }

    public final void zza(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        FrameLayout frameLayout = new FrameLayout(this.zzaar);
        this.zzdnf = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.zzdnf.addView(view, -1, -1);
        this.zzaar.setContentView(this.zzdnf);
        this.zzdno = true;
        this.zzdng = customViewCallback;
        this.zzdne = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.zzdol;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zza(android.content.res.Configuration r6) {
        /*
            r5 = this;
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r5.zzdnb
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0010
            com.google.android.gms.ads.internal.zzg r0 = r0.zzdol
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.zzbok
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            com.google.android.gms.internal.ads.zzayj r3 = com.google.android.gms.ads.internal.zzq.zzky()
            android.app.Activity r4 = r5.zzaar
            boolean r6 = r3.h(r4, r6)
            boolean r3 = r5.zzboj
            r4 = 19
            if (r3 == 0) goto L_0x0023
            if (r0 == 0) goto L_0x0037
        L_0x0023:
            if (r6 != 0) goto L_0x0037
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r4) goto L_0x0038
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r6 = r5.zzdnb
            if (r6 == 0) goto L_0x0038
            com.google.android.gms.ads.internal.zzg r6 = r6.zzdol
            if (r6 == 0) goto L_0x0038
            boolean r6 = r6.zzbop
            if (r6 == 0) goto L_0x0038
            r2 = 1
            goto L_0x0038
        L_0x0037:
            r1 = 0
        L_0x0038:
            android.app.Activity r6 = r5.zzaar
            android.view.Window r6 = r6.getWindow()
            com.google.android.gms.internal.ads.zzaag<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzaav.y0
            com.google.android.gms.internal.ads.zzaar r3 = com.google.android.gms.internal.ads.zzwg.e()
            java.lang.Object r0 = r3.c(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0066
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r4) goto L_0x0066
            android.view.View r6 = r6.getDecorView()
            r0 = 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0062
            r0 = 5380(0x1504, float:7.539E-42)
            if (r2 == 0) goto L_0x0062
            r0 = 5894(0x1706, float:8.259E-42)
        L_0x0062:
            r6.setSystemUiVisibility(r0)
            return
        L_0x0066:
            r0 = 1024(0x400, float:1.435E-42)
            r3 = 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0082
            r6.addFlags(r0)
            r6.clearFlags(r3)
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r4) goto L_0x0088
            if (r2 == 0) goto L_0x0088
            android.view.View r6 = r6.getDecorView()
            r0 = 4098(0x1002, float:5.743E-42)
            r6.setSystemUiVisibility(r0)
            return
        L_0x0082:
            r6.addFlags(r3)
            r6.clearFlags(r0)
        L_0x0088:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzc.zza(android.content.res.Configuration):void");
    }
}
