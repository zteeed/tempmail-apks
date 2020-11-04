package com.tempmail.o;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.e;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import com.tempmail.utils.b;
import com.tempmail.utils.m;
import com.tempmail.utils.z.f;

/* compiled from: BaseAdDialog */
public abstract class k extends l implements View.OnClickListener {
    public static final String B0 = k.class.getSimpleName();
    private AdView A0;
    boolean p0;
    boolean q0;
    boolean r0;
    boolean s0;
    String t0;
    String u0;
    f v0;
    int w0;
    Handler x0 = new Handler(Looper.getMainLooper());
    private int y0;
    private Runnable z0;

    /* compiled from: BaseAdDialog */
    class a extends AdListener {
        a() {
        }

        public /* synthetic */ void a() {
            k.this.C2();
            k.this.M2();
            k.this.P2(false);
            k.this.G2();
        }

        public /* synthetic */ void b() {
            k.this.C2();
            k.this.P2(false);
            k.this.O2();
        }

        public void onAdFailedToLoad(int i) {
            super.onAdFailedToLoad(i);
            String str = k.B0;
            m.b(str, "onBannerAdLoadFailed " + i);
            try {
                k.this.x0.post(new a(this));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        public void onAdLoaded() {
            super.onAdLoaded();
            m.b(k.B0, "onBannerAdLoaded");
            try {
                k.this.x0.post(new b(this));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: private */
    public void C2() {
        this.x0.removeCallbacks(this.z0);
    }

    public static Bundle E2(e eVar, String str, String str2, boolean z) {
        return F2(str, str2, false, false, true, false, 17, z);
    }

    public static Bundle F2(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i, boolean z5) {
        Bundle bundle = new Bundle();
        bundle.putString("extra_title", str);
        bundle.putString("extra_message", str2);
        bundle.putBoolean("extra_is_full_width", z);
        bundle.putBoolean("extra_is_buttons_horizontal", z2);
        bundle.putBoolean("extra_is_gap", z3);
        bundle.putBoolean("extra_is_line", z4);
        bundle.putInt("extra_gravity", i);
        bundle.putBoolean("extra_inbox_with_ad", z5);
        return bundle;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:1|2|3|4|5|6) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0026 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean H2() {
        /*
            r3 = this;
            java.lang.String r0 = B0
            java.lang.String r1 = "initBannerAd"
            com.tempmail.utils.m.b(r0, r1)
            r0 = 1
            r3.P2(r0)     // Catch:{ Exception -> 0x0036 }
            r3.Q2()     // Catch:{ Exception -> 0x0036 }
            android.content.Context r1 = r3.L()     // Catch:{ Exception -> 0x0036 }
            com.google.android.gms.ads.AdSize r2 = com.google.android.gms.ads.AdSize.MEDIUM_RECTANGLE     // Catch:{ Exception -> 0x0036 }
            com.google.android.gms.ads.AdView r1 = com.tempmail.utils.b.b(r1, r2)     // Catch:{ Exception -> 0x0036 }
            r3.A0 = r1     // Catch:{ Exception -> 0x0036 }
            java.lang.String r1 = B0     // Catch:{ IllegalStateException -> 0x0026 }
            java.lang.String r2 = "addView "
            com.tempmail.utils.m.b(r1, r2)     // Catch:{ IllegalStateException -> 0x0026 }
            com.google.android.gms.ads.AdView r1 = r3.A0     // Catch:{ IllegalStateException -> 0x0026 }
            r3.B2(r1)     // Catch:{ IllegalStateException -> 0x0026 }
        L_0x0026:
            com.google.android.gms.ads.AdView r1 = r3.A0     // Catch:{ Exception -> 0x0036 }
            com.tempmail.o.k$a r2 = new com.tempmail.o.k$a     // Catch:{ Exception -> 0x0036 }
            r2.<init>()     // Catch:{ Exception -> 0x0036 }
            r1.setAdListener(r2)     // Catch:{ Exception -> 0x0036 }
            com.google.android.gms.ads.AdView r1 = r3.A0     // Catch:{ Exception -> 0x0036 }
            com.tempmail.utils.b.l(r1)     // Catch:{ Exception -> 0x0036 }
            goto L_0x003a
        L_0x0036:
            r1 = move-exception
            r1.printStackTrace()
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tempmail.o.k.H2():boolean");
    }

    /* access modifiers changed from: private */
    public void M2() {
        try {
            if (this.m0 != null && !this.m0.isFinishing()) {
                this.m0.runOnUiThread(new d(this));
            }
        } catch (Exception unused) {
        }
    }

    private void Q2() {
        C2();
        Handler handler = this.x0;
        c cVar = new c(this);
        this.z0 = cVar;
        handler.postDelayed(cVar, 2500);
    }

    public abstract void B2(AdView adView);

    /* access modifiers changed from: package-private */
    public void D2() {
        try {
            b.n(this.A0);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public abstract void G2();

    /* access modifiers changed from: package-private */
    public void I2() {
        Window window = q2().getWindow();
        window.setGravity(this.y0 | 1);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        window.setAttributes(attributes);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        z().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels * 1;
        window.setLayout(i, attributes.height);
        String str = B0;
        m.b(str, "width " + i);
    }

    public void J0(Context context) {
        super.J0(context);
        m.b(B0, "onAttach");
    }

    public /* synthetic */ void J2() {
        try {
            m.b(B0, "remove view");
            L2();
        } catch (Exception unused) {
        }
    }

    public /* synthetic */ void K2() {
        m.b(B0, "timeout fired");
        P2(false);
    }

    public abstract void L2();

    public void M0(Bundle bundle) {
        super.M0(bundle);
        Bundle J = J();
        this.p0 = J.getBoolean("extra_is_full_width");
        this.q0 = J.getBoolean("extra_is_buttons_horizontal");
        this.r0 = J.getBoolean("extra_is_gap");
        this.s0 = J.getBoolean("extra_is_line");
        this.y0 = J.getInt("extra_gravity");
        this.t0 = J.getString("extra_title");
        this.u0 = J.getString("extra_message");
        J.getBoolean("extra_inbox_with_ad");
        v2(1, this.p0 ? 2131820748 : 2131820552);
    }

    public void N2(f fVar) {
        this.v0 = fVar;
    }

    public abstract void O2();

    public abstract void P2(boolean z);

    public View Q0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        m.b(B0, "onCreateView");
        if (b.i(L())) {
            H2();
        }
        return super.Q0(layoutInflater, viewGroup, bundle);
    }

    public void c1() {
        super.c1();
        m.b(B0, "onPause");
        C2();
        D2();
    }

    public void i1() {
        super.i1();
        m.b(B0, "onResume");
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        f fVar = this.v0;
        if (fVar != null) {
            fVar.b(0);
        }
    }
}
