package com.tempmail.n;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.e;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import com.tempmail.utils.b;
import com.tempmail.utils.m;
import com.tempmail.utils.z.f;

/* compiled from: BaseAdDialog */
public abstract class l extends m implements View.OnClickListener {
    public static final String A0 = l.class.getSimpleName();
    boolean o0;
    boolean p0;
    boolean q0;
    boolean r0;
    private int s0;
    String t0;
    String u0;
    f v0;
    int w0;
    Handler x0 = new Handler(Looper.getMainLooper());
    private Runnable y0;
    private AdView z0;

    /* compiled from: BaseAdDialog */
    class a extends AdListener {
        a() {
        }

        public /* synthetic */ void a() {
            l.this.w2();
            l.this.I2();
            l.this.L2(false);
            l.this.B2();
        }

        public /* synthetic */ void b() {
            l.this.w2();
            l.this.L2(false);
            l.this.K2();
        }

        public void onAdFailedToLoad(int i) {
            super.onAdFailedToLoad(i);
            String str = l.A0;
            m.b(str, "onBannerAdLoadFailed " + i);
            try {
                l.this.x0.post(new a(this));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        public void onAdLoaded() {
            super.onAdLoaded();
            m.b(l.A0, "onBannerAdLoaded");
            try {
                l.this.x0.post(new b(this));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:1|2|3|4|5|6) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0029 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean C2() {
        /*
            r3 = this;
            r0 = 1
            androidx.fragment.app.c r1 = r3.u()     // Catch:{ Exception -> 0x0039 }
            int r2 = r3.A2()     // Catch:{ Exception -> 0x0039 }
            java.util.List r1 = com.tempmail.utils.b.e(r1, r2)     // Catch:{ Exception -> 0x0039 }
            r3.L2(r0)     // Catch:{ Exception -> 0x0039 }
            r3.M2()     // Catch:{ Exception -> 0x0039 }
            android.content.Context r2 = r3.H()     // Catch:{ Exception -> 0x0039 }
            com.google.android.gms.ads.AdView r1 = com.tempmail.utils.b.b(r2, r1)     // Catch:{ Exception -> 0x0039 }
            r3.z0 = r1     // Catch:{ Exception -> 0x0039 }
            java.lang.String r1 = A0     // Catch:{ IllegalStateException -> 0x0029 }
            java.lang.String r2 = "addView "
            com.tempmail.utils.m.b(r1, r2)     // Catch:{ IllegalStateException -> 0x0029 }
            com.google.android.gms.ads.AdView r1 = r3.z0     // Catch:{ IllegalStateException -> 0x0029 }
            r3.v2(r1)     // Catch:{ IllegalStateException -> 0x0029 }
        L_0x0029:
            com.google.android.gms.ads.AdView r1 = r3.z0     // Catch:{ Exception -> 0x0039 }
            com.tempmail.n.l$a r2 = new com.tempmail.n.l$a     // Catch:{ Exception -> 0x0039 }
            r2.<init>()     // Catch:{ Exception -> 0x0039 }
            r1.setAdListener(r2)     // Catch:{ Exception -> 0x0039 }
            com.google.android.gms.ads.AdView r1 = r3.z0     // Catch:{ Exception -> 0x0039 }
            com.tempmail.utils.b.l(r1)     // Catch:{ Exception -> 0x0039 }
            goto L_0x003d
        L_0x0039:
            r1 = move-exception
            r1.printStackTrace()
        L_0x003d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tempmail.n.l.C2():boolean");
    }

    /* access modifiers changed from: private */
    public void I2() {
        try {
            if (this.j0 != null && !this.j0.isFinishing()) {
                this.j0.runOnUiThread(new e(this));
            }
        } catch (Exception unused) {
        }
    }

    private void M2() {
        w2();
        Handler handler = this.x0;
        c cVar = new c(this);
        this.y0 = cVar;
        handler.postDelayed(cVar, 2500);
    }

    /* access modifiers changed from: private */
    public void w2() {
        this.x0.removeCallbacks(this.y0);
    }

    public static Bundle y2(e eVar, String str, String str2, boolean z) {
        return z2(str, str2, false, false, true, false, 17, z);
    }

    public static Bundle z2(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i, boolean z5) {
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

    public abstract int A2();

    public abstract void B2();

    /* access modifiers changed from: package-private */
    public void D2() {
        Window window = k2().getWindow();
        window.setGravity(this.s0 | 1);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        window.setAttributes(attributes);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        u().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels * 1;
        window.setLayout(i, attributes.height);
        String str = A0;
        m.b(str, "width " + i);
    }

    public /* synthetic */ void E2() {
        if (b.i(H())) {
            C2();
        }
    }

    public /* synthetic */ void F2() {
        try {
            m.b(A0, "remove view");
            H2();
        } catch (Exception unused) {
        }
    }

    public void G0(Context context) {
        super.G0(context);
        m.b(A0, "onAttach");
    }

    public /* synthetic */ void G2() {
        m.b(A0, "timeout fired");
        L2(false);
    }

    public abstract void H2();

    public void J0(Bundle bundle) {
        super.J0(bundle);
        Bundle D = D();
        this.o0 = D.getBoolean("extra_is_full_width");
        this.p0 = D.getBoolean("extra_is_buttons_horizontal");
        this.q0 = D.getBoolean("extra_is_gap");
        this.r0 = D.getBoolean("extra_is_line");
        this.s0 = D.getInt("extra_gravity");
        this.t0 = D.getString("extra_title");
        this.u0 = D.getString("extra_message");
        D.getBoolean("extra_inbox_with_ad");
        p2(1, this.o0 ? 2131820748 : 2131820552);
    }

    public void J2(f fVar) {
        this.v0 = fVar;
    }

    public abstract void K2();

    public abstract void L2(boolean z);

    public void Z0() {
        super.Z0();
        m.b(A0, "onPause");
        w2();
        x2();
    }

    public void f1() {
        super.f1();
        m.b(A0, "onResume");
        try {
            this.x0.post(new d(this));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        f fVar = this.v0;
        if (fVar != null) {
            fVar.b(0);
        }
    }

    public abstract void v2(AdView adView);

    /* access modifiers changed from: package-private */
    public void x2() {
        try {
            b.n(this.z0);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
