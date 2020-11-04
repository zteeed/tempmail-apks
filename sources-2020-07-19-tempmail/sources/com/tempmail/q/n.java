package com.tempmail.q;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdCallback;
import com.tempmail.R;
import com.tempmail.api.models.answers.ExtendedMail;
import com.tempmail.db.e;
import com.tempmail.db.f;
import com.tempmail.i.w;
import com.tempmail.m.e0;
import com.tempmail.n.k;
import com.tempmail.utils.g;
import com.tempmail.utils.m;
import com.tempmail.utils.s;
import com.tempmail.utils.z.h;
import java.util.List;

/* compiled from: InboxFragment */
public class n extends com.tempmail.p.c implements m, com.tempmail.utils.z.d {
    private static final Integer A0 = 2;
    private static final Integer B0 = 3;
    /* access modifiers changed from: private */
    public static final String C0 = n.class.getSimpleName();
    /* access modifiers changed from: private */
    public boolean i0 = false;
    /* access modifiers changed from: private */
    public e0 j0;
    private h k0;
    AdView l0;
    private w m0;
    private List<f> n0;
    private f o0;
    w.c p0;
    private com.google.firebase.remoteconfig.f q0;
    /* access modifiers changed from: private */
    public f r0 = null;
    private Handler s0 = new Handler();
    private Runnable t0;
    private e u0;
    InterstitialAd v0;
    private Handler w0 = new Handler(Looper.getMainLooper());
    private Runnable x0;
    RecyclerView.LayoutManager y0;
    MediaPlayer z0;

    /* compiled from: InboxFragment */
    class a extends AdListener {
        a() {
        }

        public void onAdClosed() {
            m.b(n.C0, "interstitialAd onAdClosed");
            n.this.v0.loadAd(new AdRequest.Builder().build());
        }

        public void onAdFailedToLoad(int i) {
            super.onAdFailedToLoad(i);
            String i2 = n.C0;
            m.b(i2, "interstitialAd onAdFailedToLoad " + i);
            n.this.U2();
        }

        public void onAdLoaded() {
            super.onAdLoaded();
            m.b(n.C0, "interstitialAd onAdLoaded ");
        }
    }

    /* compiled from: InboxFragment */
    class b extends RewardedAdCallback {
        b() {
        }

        public void onRewardedAdClosed() {
            m.b(n.C0, "onRewardedAdClosed ");
            String i2 = n.C0;
            m.b(i2, "onRewardedAdClosed is first loaded " + n.this.e0.q().isLoaded());
            String i22 = n.C0;
            m.b(i22, "onRewardedAdClosed is second loaded " + n.this.e0.a0().isLoaded());
            if (n.this.r0 != null && n.this.i0) {
                n nVar = n.this;
                nVar.I2(nVar.r0);
            }
            n.this.e0.r();
        }

        public void onRewardedAdFailedToShow(int i) {
            String i2 = n.C0;
            m.b(i2, "onRewardedAdFailedToShow " + i);
            boolean unused = n.this.i0 = true;
            if (n.this.r0 != null) {
                n nVar = n.this;
                nVar.I2(nVar.r0);
            }
        }

        public void onRewardedAdOpened() {
            boolean unused = n.this.i0 = false;
            m.b(n.C0, "onRewardedAdOpened ");
        }

        public void onUserEarnedReward(RewardItem rewardItem) {
            String i2 = n.C0;
            m.b(i2, "onUserEarnedReward " + rewardItem.getAmount());
            s.o(n.this.H(), rewardItem.getAmount());
            boolean unused = n.this.i0 = true;
        }
    }

    /* compiled from: InboxFragment */
    class c extends AdListener {
        c() {
        }

        public void onAdFailedToLoad(int i) {
            super.onAdFailedToLoad(i);
            String i2 = n.C0;
            m.b(i2, "banner onAdFailedToLoad " + i);
            n.this.t2();
            n.this.L2();
            n.this.j0.s.setVisibility(8);
        }

        public void onAdLoaded() {
            super.onAdLoaded();
            m.b(n.C0, "banner onAdLoaded");
            n.this.t2();
            n.this.j0.s.setVisibility(0);
        }
    }

    /* compiled from: InboxFragment */
    class d extends AnimatorListenerAdapter {
        d() {
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            n.this.K2();
        }
    }

    public static n H2() {
        return new n();
    }

    private void T2(RewardedAd rewardedAd) {
        rewardedAd.show(this.a0, new b());
    }

    /* access modifiers changed from: private */
    public void U2() {
        Handler handler = this.w0;
        e eVar = new e(this);
        this.x0 = eVar;
        handler.postDelayed(eVar, 20000);
    }

    /* access modifiers changed from: private */
    public void W2(int i) {
        m.b(C0, "open email");
        int h = (int) this.q0.h(h0(R.string.remote_config_inbox_flow_android));
        if (!com.tempmail.utils.e.O(this.c0)) {
            I2(this.n0.get(i));
        } else if (((double) h) == 2.0d) {
            V2(this.n0.get(i));
        } else {
            s.V(this.c0, true);
            this.m0.C(i);
            com.tempmail.utils.e.U(this.a0, this.n0.get(i));
        }
        this.k0.K(com.tempmail.utils.e.q(this.c0, this.a0.H0()));
    }

    private void p2() {
        this.w0.removeCallbacks(this.x0);
    }

    private void r2() {
        this.u0 = g.t(this.a0.H0());
        if (x2()) {
            N2();
        } else if (this.e0.O()) {
            P2();
        } else if (this.n0.size() > 0) {
            O2();
        } else {
            M2();
        }
    }

    private void w2() {
        InterstitialAd c2 = com.tempmail.utils.b.c(H());
        this.v0 = c2;
        c2.setAdListener(new a());
    }

    private boolean x2() {
        return com.tempmail.utils.e.P() && this.u0.v();
    }

    public /* synthetic */ void A2() {
        X2(this.p0, this.o0);
    }

    public /* synthetic */ void B2(View view) {
        J2();
    }

    public /* synthetic */ void C2(View view) {
        J2();
    }

    public /* synthetic */ void D2(f fVar) {
        this.m0.C(this.n0.indexOf(fVar));
        this.k0.K(com.tempmail.utils.e.q(this.c0, this.a0.H0()));
        this.Z.M(com.tempmail.r.e.s2(fVar.d()), true);
    }

    public void E0(int i, int i2, Intent intent) {
        super.E0(i, i2, intent);
        if (i == A0.intValue() && i2 == -1) {
            m.b(C0, "REQUEST_REMOVE_EMAIL");
            this.w0.postDelayed(new j(this), 400);
        } else if (i != B0.intValue()) {
        } else {
            if (i2 == -1) {
                RewardedAd g = com.tempmail.utils.b.g(H(), this.e0.q(), this.e0.a0());
                if (g != null) {
                    T2(g);
                    return;
                }
                I2(this.r0);
                this.e0.r();
                return;
            }
            this.Z.M(com.tempmail.p.e.r2(), true);
        }
    }

    public /* synthetic */ void E2() {
        try {
            m.b(C0, "remove view");
            this.j0.s.removeViewAt(1);
            this.l0 = null;
        } catch (Exception unused) {
        }
    }

    public /* synthetic */ void F2() {
        this.v0.loadAd(new AdRequest.Builder().build());
    }

    public void G0(Context context) {
        super.G0(context);
        m.b(C0, "onAttach");
        com.tempmail.s.m P = this.e0.P();
        if (P != null) {
            P.g(this);
        } else {
            o2();
        }
        if (context instanceof h) {
            this.k0 = (h) context;
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnEmailsCountListener");
    }

    public /* synthetic */ void G2() {
        m.b(C0, "timeout fired");
        t2();
    }

    public void I2(f fVar) {
        new Handler(Looper.getMainLooper()).post(new d(this, fVar));
    }

    public void J0(Bundle bundle) {
        super.J0(bundle);
    }

    public void J2() {
        if (com.tempmail.utils.b.j(this.c0)) {
            com.tempmail.utils.b.r(H(), this.v0);
        }
        if (com.tempmail.utils.e.O(this.c0)) {
            h2(h0(R.string.analytics_inbox_refresh_free));
        } else {
            h2(h0(R.string.analytics_inbox_refresh_premium));
        }
        this.e0.E().c(this.e0.V());
    }

    public void K2() {
        g.m(this.a0.H0(), this.o0);
        Toast.makeText(this.c0, R.string.message_email_deleted, 1).show();
        this.n0.remove(this.o0);
        Z2();
        this.k0.K(com.tempmail.utils.e.q(this.c0, this.a0.H0()));
    }

    public void L2() {
        try {
            if (this.a0 != null && !this.a0.isFinishing()) {
                this.a0.runOnUiThread(new c(this));
            }
        } catch (Exception unused) {
        }
    }

    public void M2() {
        Context context = this.c0;
        if (context != null && com.tempmail.utils.b.i(context) && this.l0 == null) {
            try {
                this.w0.post(new a(this));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        m.b(C0, "showEmptyList");
        this.j0.C.setVisibility(8);
        this.j0.z.setVisibility(8);
        this.j0.y.setVisibility(0);
        this.j0.H.setText(R.string.inbox_view_is_empty);
        this.j0.K.setText(R.string.inbox_view_refresh_click_refresh);
        this.j0.x.setVisibility(0);
    }

    public View N0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        m.b(C0, "onCreateView");
        this.j0 = (e0) androidx.databinding.f.d(layoutInflater, R.layout.fragment_inbox, viewGroup, false);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(u());
        this.y0 = linearLayoutManager;
        this.j0.C.setLayoutManager(linearLayoutManager);
        this.j0.C.setHasFixedSize(false);
        this.n0 = g.u(this.a0.H0(), com.tempmail.utils.e.H(this.c0));
        this.q0 = com.google.firebase.remoteconfig.f.f();
        w wVar = new w(this.c0, this.Z, this, this.a0.H0(), this.n0);
        this.m0 = wVar;
        wVar.A(new h(this));
        this.j0.C.setAdapter(this.m0);
        r2();
        MediaPlayer create = MediaPlayer.create(H(), R.raw.data_delete_ding);
        this.z0 = create;
        create.setVolume(0.3f, 0.3f);
        this.j0.D.setOnRefreshListener(new k(this));
        this.j0.w.setOnClickListener(new i(this));
        this.j0.x.setOnClickListener(new b(this));
        this.e0.P().g(this);
        int h = (int) this.q0.h(h0(R.string.remote_config_ir_interstitial_inbox_refresh));
        if (com.tempmail.utils.b.j(this.c0) && h != 0) {
            w2();
        }
        return this.j0.n();
    }

    public void N2() {
        m.b(C0, "showExpiredEmailAddress");
        this.j0.C.setVisibility(8);
        this.j0.z.setVisibility(8);
        this.j0.y.setVisibility(0);
        this.j0.H.setText(R.string.inbox_view_address_not_active);
        this.j0.K.setText(R.string.inbox_view_address_not_active_description);
        this.j0.x.setVisibility(8);
        Context context = this.c0;
        if (context != null && com.tempmail.utils.b.i(context) && this.l0 == null) {
            try {
                this.w0.post(new a(this));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void O0() {
        super.O0();
        m.b(C0, "onDestroy");
        q2();
        s2();
    }

    public void O2() {
        m.b(C0, "showMailsList");
        this.j0.C.setVisibility(0);
        this.j0.z.setVisibility(8);
        this.j0.y.setVisibility(8);
    }

    public void P2() {
        m.b(C0, "showNetworkError");
        this.j0.C.setVisibility(8);
        this.j0.z.setVisibility(0);
        this.j0.y.setVisibility(8);
    }

    public void Q(String str, List<ExtendedMail> list) {
        String str2 = C0;
        m.b(str2, "onInboxLoaded " + list.size());
        this.j0.D.setRefreshing(false);
        Z2();
    }

    public void Q2(boolean z) {
        String str = C0;
        m.b(str, "showProgressBar " + z);
        if (z) {
            this.j0.z.setVisibility(8);
            this.j0.y.setVisibility(8);
            this.j0.A.setVisibility(0);
            return;
        }
        this.j0.A.setVisibility(8);
    }

    public void R0() {
        m.b(C0, "onDetach");
        this.e0.P().h(this);
        super.R0();
        p2();
    }

    public void R2() {
        k N2 = k.N2(this.a0, h0(R.string.message_you_sure), (String) null, u2() != null);
        N2.Z1(this, A0.intValue());
        N2.r2(this.a0.k0(), k.class.getSimpleName());
    }

    public void S2() {
        com.tempmail.n.s N2 = com.tempmail.n.s.N2(this.b0, h0(R.string.rewarded_dialog_title_free_version_ads), h0(R.string.rewarded_dialog_watch_video_or_premium), false);
        N2.Z1(this, B0.intValue());
        N2.n2(false);
        N2.r2(this.a0.k0(), com.tempmail.n.s.class.getSimpleName());
    }

    public void V2(f fVar) {
        boolean z = false;
        if (s.q(this.c0) - (com.tempmail.utils.b.k(this.c0) ? (int) this.q0.h(h0(R.string.remote_config_ir_rewarded_read_email)) : 0) >= 0) {
            I2(fVar);
            return;
        }
        RewardedAd g = com.tempmail.utils.b.g(H(), this.e0.q(), this.e0.a0());
        String str = C0;
        StringBuilder sb = new StringBuilder();
        sb.append("isAvailable ");
        if (g != null) {
            z = true;
        }
        sb.append(z);
        m.b(str, sb.toString());
        if (g != null) {
            this.r0 = fVar;
            S2();
            return;
        }
        I2(fVar);
    }

    public boolean X0(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            this.a0.onBackPressed();
        }
        return super.X0(menuItem);
    }

    public void X2(w.c cVar, f fVar) {
        int indexOf = this.n0.indexOf(fVar);
        String str = C0;
        m.b(str, "index " + indexOf);
        if (indexOf >= 0) {
            w.c cVar2 = (w.c) this.j0.C.Y(indexOf);
            cVar.B.A.setVisibility(4);
            cVar2.B.r.setVisibility(4);
            cVar2.B.q.setVisibility(0);
            cVar2.B.q.addAnimatorListener(new d());
            this.z0.start();
            cVar2.B.q.playAnimation();
        }
    }

    public void Y2() {
        q2();
        Handler handler = this.s0;
        f fVar = new f(this);
        this.t0 = fVar;
        handler.postDelayed(fVar, 2500);
    }

    public void Z0() {
        super.Z0();
        m.b(C0, "onPause");
    }

    public void Z2() {
        this.n0 = g.u(this.a0.H0(), com.tempmail.utils.e.H(this.c0));
        if (x2()) {
            N2();
        } else if (this.n0.size() > 0) {
            O2();
            this.m0.y(this.n0);
        } else {
            M2();
        }
    }

    public void a(boolean z) {
        m.b(C0, "showLoading");
        try {
            if (!this.j0.D.o()) {
                Q2(z);
            }
        } catch (NullPointerException e2) {
            e2.printStackTrace();
        }
    }

    public void f1() {
        super.f1();
        m.b(C0, "onResume");
        com.tempmail.utils.z.a aVar = this.f0;
        if (aVar != null) {
            aVar.Y(0);
        }
        androidx.appcompat.app.a v02 = this.a0.v0();
        if (v02 != null) {
            v02.y();
        }
    }

    public void i1() {
        super.i1();
        this.l0 = null;
        m.b(C0, "onStop");
    }

    public void j(Throwable th) {
        m.b(C0, "onInboxError");
        this.j0.D.setRefreshing(false);
        if (x2()) {
            N2();
        } else if (this.n0.size() > 0) {
            O2();
        } else {
            M2();
        }
    }

    public void o2() {
        new Handler(Looper.getMainLooper()).post(new g(this));
    }

    public void p(f fVar, w.c cVar) {
        this.p0 = cVar;
        this.o0 = fVar;
        R2();
    }

    public void q2() {
        this.s0.removeCallbacks(this.t0);
    }

    public void s2() {
    }

    public void t2() {
        q2();
        Z2();
        Q2(false);
    }

    public AdView u2() {
        return this.l0;
    }

    public void v2() {
        try {
            m.b(C0, "Load inbox ad");
            Q2(true);
            float height = ((float) this.e0.z().getHeight()) / a0().getDisplayMetrics().density;
            String str = C0;
            m.b(str, " container height dp" + height);
            int measuredWidth = this.j0.y.getMeasuredWidth();
            String str2 = C0;
            m.b(str2, "width ad container " + measuredWidth);
            AdView b2 = com.tempmail.utils.b.b(H(), com.tempmail.utils.b.f(u(), measuredWidth, (int) height));
            this.l0 = b2;
            b2.setAdListener(new c());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            if (this.j0.s.getChildCount() < 2) {
                m.b(C0, "inbox addView");
                this.j0.s.addView(this.l0, 1, layoutParams);
            } else {
                m.b(C0, "inbox child >2");
            }
            Y2();
            com.tempmail.utils.b.l(this.l0);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void y() {
        this.j0.D.setRefreshing(false);
        if (x2()) {
            N2();
        } else {
            P2();
        }
    }

    public /* synthetic */ void y2() {
        com.tempmail.utils.z.c cVar = this.e0;
        if (cVar != null) {
            cVar.P().g(this);
        }
    }
}
