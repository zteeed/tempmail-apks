package com.tempmail.r;

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
import com.google.firebase.remoteconfig.f;
import com.tempmail.R;
import com.tempmail.api.models.answers.ExtendedMail;
import com.tempmail.db.EmailAddressTable;
import com.tempmail.db.EmailTable;
import com.tempmail.k.w;
import com.tempmail.n.g0;
import com.tempmail.o.j;
import com.tempmail.o.r;
import com.tempmail.q.g;
import com.tempmail.q.i;
import com.tempmail.utils.e;
import com.tempmail.utils.m;
import com.tempmail.utils.s;
import com.tempmail.utils.z.h;
import java.util.List;

/* compiled from: InboxFragment */
public class n extends g implements m, com.tempmail.utils.z.d {
    private static final Integer A0 = 2;
    private static final Integer B0 = 3;
    /* access modifiers changed from: private */
    public static final String C0 = n.class.getSimpleName();
    AdView i0;
    w.c j0;
    InterstitialAd k0;
    RecyclerView.LayoutManager l0;
    MediaPlayer m0;
    /* access modifiers changed from: private */
    public boolean n0 = false;
    /* access modifiers changed from: private */
    public g0 o0;
    private h p0;
    private w q0;
    private List<EmailTable> r0;
    private EmailTable s0;
    private f t0;
    /* access modifiers changed from: private */
    public EmailTable u0 = null;
    private Handler v0 = new Handler();
    private Runnable w0;
    private EmailAddressTable x0;
    private Handler y0 = new Handler(Looper.getMainLooper());
    private Runnable z0;

    /* compiled from: InboxFragment */
    class a extends AdListener {
        a() {
        }

        public void onAdClosed() {
            m.b(n.C0, "interstitialAd onAdClosed");
            n.this.k0.loadAd(new AdRequest.Builder().build());
        }

        public void onAdFailedToLoad(int i) {
            super.onAdFailedToLoad(i);
            String p2 = n.C0;
            m.b(p2, "interstitialAd onAdFailedToLoad " + i);
            n.this.b3();
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
            String p2 = n.C0;
            m.b(p2, "onRewardedAdClosed is first loaded " + n.this.c0.q().isLoaded());
            String p22 = n.C0;
            m.b(p22, "onRewardedAdClosed is second loaded " + n.this.c0.Z().isLoaded());
            if (n.this.u0 != null && n.this.n0) {
                n nVar = n.this;
                nVar.P2(nVar.u0);
            }
            n.this.c0.r();
        }

        public void onRewardedAdFailedToShow(int i) {
            String p2 = n.C0;
            m.b(p2, "onRewardedAdFailedToShow " + i);
            boolean unused = n.this.n0 = true;
            if (n.this.u0 != null) {
                n nVar = n.this;
                nVar.P2(nVar.u0);
            }
        }

        public void onRewardedAdOpened() {
            boolean unused = n.this.n0 = false;
            m.b(n.C0, "onRewardedAdOpened ");
        }

        public void onUserEarnedReward(RewardItem rewardItem) {
            String p2 = n.C0;
            m.b(p2, "onUserEarnedReward " + rewardItem.getAmount());
            s.o(n.this.L(), rewardItem.getAmount());
            boolean unused = n.this.n0 = true;
        }
    }

    /* compiled from: InboxFragment */
    class c extends AdListener {
        c() {
        }

        public void onAdFailedToLoad(int i) {
            super.onAdFailedToLoad(i);
            String p2 = n.C0;
            m.b(p2, "banner onAdFailedToLoad " + i);
            n.this.A2();
            n.this.S2();
        }

        public void onAdLoaded() {
            super.onAdLoaded();
            m.b(n.C0, "banner onAdLoaded");
            n.this.A2();
            n.this.o0.s.setVisibility(0);
        }
    }

    /* compiled from: InboxFragment */
    class d extends AnimatorListenerAdapter {
        d() {
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            n.this.R2();
        }
    }

    private void D2() {
        InterstitialAd c2 = com.tempmail.utils.b.c(L());
        this.k0 = c2;
        c2.setAdListener(new a());
    }

    private boolean E2() {
        return e.Q() && this.x0.isExpired();
    }

    public static n O2() {
        return new n();
    }

    private void a3(RewardedAd rewardedAd) {
        rewardedAd.show(this.Z, new b());
    }

    /* access modifiers changed from: private */
    public void b3() {
        Handler handler = this.y0;
        d dVar = new d(this);
        this.z0 = dVar;
        handler.postDelayed(dVar, 20000);
    }

    /* access modifiers changed from: private */
    public void d3(int i) {
        m.b(C0, "open email");
        int h = (int) this.t0.h(k0(R.string.remote_config_inbox_flow_android));
        if (!e.P(this.b0)) {
            P2(this.r0.get(i));
        } else if (((double) h) == 2.0d) {
            c3(this.r0.get(i));
        } else {
            s.X(this.b0, true);
            this.q0.C(i);
            e.U(this.Z, this.r0.get(i));
        }
        this.p0.J(e.q(this.b0, this.Z.G0()));
    }

    private void w2() {
        this.y0.removeCallbacks(this.z0);
    }

    private void y2() {
        this.x0 = com.tempmail.utils.g.s(this.Z.G0());
        if (E2()) {
            U2();
        } else if (this.c0.N()) {
            W2();
        } else if (this.r0.size() > 0) {
            V2();
        } else {
            T2();
        }
    }

    public void A2() {
        x2();
        g3();
        X2(false);
    }

    public AdView B2() {
        return this.i0;
    }

    public void C2() {
        try {
            m.b(C0, "Load inbox ad");
            X2(true);
            float height = ((float) this.c0.y().getHeight()) / e0().getDisplayMetrics().density;
            String str = C0;
            m.b(str, " container height dp" + height);
            int measuredWidth = this.o0.y.getMeasuredWidth();
            String str2 = C0;
            m.b(str2, "width ad container " + measuredWidth);
            AdView b2 = com.tempmail.utils.b.b(L(), com.tempmail.utils.b.f(z(), measuredWidth, (int) height));
            this.i0 = b2;
            b2.setAdListener(new c());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            if (this.o0.s.getChildCount() < 2) {
                m.b(C0, "inbox addView");
                this.o0.s.addView(this.i0, 1, layoutParams);
            } else {
                m.b(C0, "inbox child >2");
            }
            f3();
            com.tempmail.utils.b.l(this.i0);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public /* synthetic */ void F2() {
        com.tempmail.utils.z.c cVar = this.c0;
        if (cVar != null) {
            cVar.P().g(this);
        }
    }

    public void H0(int i, int i2, Intent intent) {
        super.H0(i, i2, intent);
        if (i == A0.intValue() && i2 == -1) {
            m.b(C0, "REQUEST_REMOVE_EMAIL");
            this.y0.postDelayed(new i(this), 400);
        } else if (i != B0.intValue()) {
        } else {
            if (i2 != -1) {
                this.Y.L(i.G2(), true);
            } else if (this.c0 != null) {
                RewardedAd g = com.tempmail.utils.b.g(L(), this.c0.q(), this.c0.Z());
                if (g != null) {
                    a3(g);
                    return;
                }
                P2(this.u0);
                this.c0.r();
            }
        }
    }

    public /* synthetic */ void H2() {
        e3(this.j0, this.s0);
    }

    public /* synthetic */ void I2(View view) {
        Q2();
    }

    public void J0(Context context) {
        super.J0(context);
        m.b(C0, "onAttach");
        com.tempmail.t.s P = this.c0.P();
        if (P != null) {
            P.g(this);
        } else {
            v2();
        }
        if (context instanceof h) {
            this.p0 = (h) context;
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnEmailsCountListener");
    }

    public /* synthetic */ void J2(View view) {
        Q2();
    }

    public /* synthetic */ void K2(EmailTable emailTable) {
        this.q0.C(this.r0.indexOf(emailTable));
        this.p0.J(e.q(this.b0, this.Z.G0()));
        this.Y.L(com.tempmail.s.e.z2(emailTable.getEid()), true);
    }

    public /* synthetic */ void L2() {
        try {
            m.b(C0, "remove view");
            this.o0.s.removeViewAt(1);
            this.i0 = null;
            this.o0.s.setVisibility(8);
        } catch (Exception unused) {
        }
    }

    public void M0(Bundle bundle) {
        super.M0(bundle);
    }

    public /* synthetic */ void M2() {
        this.k0.loadAd(new AdRequest.Builder().build());
    }

    public /* synthetic */ void N2() {
        m.b(C0, "timeout fired");
        A2();
    }

    public void O(String str, List<ExtendedMail> list) {
        String str2 = C0;
        m.b(str2, "onInboxLoaded " + list.size());
        this.o0.D.setRefreshing(false);
        g3();
    }

    public void P2(EmailTable emailTable) {
        new Handler(Looper.getMainLooper()).post(new c(this, emailTable));
    }

    public View Q0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        m.b(C0, "onCreateView");
        this.o0 = (g0) androidx.databinding.f.d(layoutInflater, R.layout.fragment_inbox, viewGroup, false);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(z());
        this.l0 = linearLayoutManager;
        this.o0.C.setLayoutManager(linearLayoutManager);
        this.o0.C.setHasFixedSize(false);
        this.r0 = com.tempmail.utils.g.t(this.Z.G0(), e.I(this.b0));
        this.t0 = f.f();
        w wVar = new w(this.b0, this.Y, this, this.Z.G0(), this.r0);
        this.q0 = wVar;
        wVar.A(new g(this));
        this.o0.C.setAdapter(this.q0);
        y2();
        MediaPlayer create = MediaPlayer.create(L(), R.raw.data_delete_ding);
        this.m0 = create;
        if (create != null) {
            create.setVolume(0.3f, 0.3f);
        }
        this.o0.D.setOnRefreshListener(new j(this));
        this.o0.w.setOnClickListener(new h(this));
        this.o0.x.setOnClickListener(new a(this));
        this.c0.P().g(this);
        int h = (int) this.t0.h(k0(R.string.remote_config_ir_interstitial_inbox_refresh));
        if (com.tempmail.utils.b.j(this.b0) && h != 0) {
            D2();
        }
        return this.o0.n();
    }

    public void Q2() {
        if (com.tempmail.utils.b.j(this.b0)) {
            com.tempmail.utils.b.r(L(), this.k0);
        }
        if (e.P(this.b0)) {
            o2(k0(R.string.analytics_inbox_refresh_free));
        } else {
            o2(k0(R.string.analytics_inbox_refresh_premium));
        }
        this.c0.D().c(this.c0.T());
    }

    public void R0() {
        super.R0();
        m.b(C0, "onDestroy");
        x2();
        z2();
    }

    public void R2() {
        com.tempmail.utils.g.l(this.Z.G0(), this.s0);
        Toast.makeText(this.b0, R.string.message_email_deleted, 1).show();
        this.r0.remove(this.s0);
        g3();
        this.p0.J(e.q(this.b0, this.Z.G0()));
    }

    public void S2() {
        try {
            if (this.Z != null && !this.Z.isFinishing()) {
                this.Z.runOnUiThread(new b(this));
            }
        } catch (Exception unused) {
        }
    }

    public void T2() {
        Context context = this.b0;
        if (context != null && com.tempmail.utils.b.i(context) && this.i0 == null) {
            try {
                this.y0.post(new k(this));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        m.b(C0, "showEmptyList");
        this.o0.C.setVisibility(8);
        this.o0.z.setVisibility(8);
        this.o0.y.setVisibility(0);
        this.o0.H.setText(R.string.inbox_view_is_empty);
        this.o0.K.setText(R.string.inbox_view_refresh_click_refresh);
        this.o0.x.setVisibility(0);
    }

    public void U0() {
        m.b(C0, "onDetach");
        this.c0.P().h(this);
        super.U0();
        w2();
    }

    public void U2() {
        m.b(C0, "showExpiredEmailAddress");
        this.o0.C.setVisibility(8);
        this.o0.z.setVisibility(8);
        this.o0.y.setVisibility(0);
        this.o0.H.setText(R.string.inbox_view_address_not_active);
        this.o0.K.setText(R.string.inbox_view_address_not_active_description);
        this.o0.x.setVisibility(8);
        Context context = this.b0;
        if (context != null && com.tempmail.utils.b.i(context) && this.i0 == null) {
            try {
                this.y0.post(new k(this));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void V2() {
        m.b(C0, "showMailsList");
        this.o0.C.setVisibility(0);
        this.o0.z.setVisibility(8);
        this.o0.y.setVisibility(8);
    }

    public void W2() {
        m.b(C0, "showNetworkError");
        this.o0.C.setVisibility(8);
        this.o0.z.setVisibility(0);
        this.o0.y.setVisibility(8);
    }

    public void X2(boolean z) {
        String str = C0;
        m.b(str, "showProgressBar " + z);
        if (z) {
            this.o0.z.setVisibility(8);
            this.o0.y.setVisibility(8);
            this.o0.A.setVisibility(0);
            return;
        }
        this.o0.A.setVisibility(8);
    }

    public void Y2() {
        j R2 = j.R2(this.Z, k0(R.string.message_you_sure), (String) null, B2() != null);
        R2.f2(this, A0.intValue());
        R2.x2(this.Z.k0(), j.class.getSimpleName());
    }

    public void Z2() {
        r R2 = r.R2(this.a0, k0(R.string.rewarded_dialog_title_free_version_ads), k0(R.string.rewarded_dialog_watch_video_or_premium), false);
        R2.f2(this, B0.intValue());
        R2.t2(false);
        R2.x2(this.Z.k0(), r.class.getSimpleName());
    }

    public void a(boolean z) {
        m.b(C0, "showLoading");
        try {
            if (!this.o0.D.o()) {
                X2(z);
            }
        } catch (NullPointerException e2) {
            e2.printStackTrace();
        }
    }

    public boolean a1(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            this.Z.onBackPressed();
        }
        return super.a1(menuItem);
    }

    public void c1() {
        super.c1();
        m.b(C0, "onPause");
    }

    public void c3(EmailTable emailTable) {
        boolean z = false;
        if (s.q(this.b0) - (com.tempmail.utils.b.k(this.b0) ? (int) this.t0.h(k0(R.string.remote_config_ir_rewarded_read_email)) : 0) >= 0) {
            P2(emailTable);
            return;
        }
        RewardedAd g = com.tempmail.utils.b.g(L(), this.c0.q(), this.c0.Z());
        String str = C0;
        StringBuilder sb = new StringBuilder();
        sb.append("isAvailable ");
        if (g != null) {
            z = true;
        }
        sb.append(z);
        m.b(str, sb.toString());
        if (g != null) {
            this.u0 = emailTable;
            Z2();
            return;
        }
        P2(emailTable);
    }

    public void e3(w.c cVar, EmailTable emailTable) {
        int indexOf = this.r0.indexOf(emailTable);
        String str = C0;
        m.b(str, "index " + indexOf);
        if (indexOf >= 0) {
            w.c cVar2 = (w.c) this.o0.C.Y(indexOf);
            cVar.t.A.setVisibility(4);
            cVar2.t.r.setVisibility(4);
            cVar2.t.q.setVisibility(0);
            cVar2.t.q.addAnimatorListener(new d());
            MediaPlayer mediaPlayer = this.m0;
            if (mediaPlayer != null) {
                mediaPlayer.start();
            }
            cVar2.t.q.playAnimation();
        }
    }

    public void f3() {
        x2();
        Handler handler = this.v0;
        e eVar = new e(this);
        this.w0 = eVar;
        handler.postDelayed(eVar, 2500);
    }

    public void g3() {
        com.tempmail.h hVar = this.Z;
        if (hVar != null && hVar.G0() != null) {
            this.r0 = com.tempmail.utils.g.t(this.Z.G0(), e.I(this.b0));
            if (E2()) {
                U2();
            } else if (this.r0.size() > 0) {
                V2();
                this.q0.y(this.r0);
            } else {
                T2();
            }
        }
    }

    public void h(Throwable th) {
        m.b(C0, "onInboxError");
        this.o0.D.setRefreshing(false);
        if (E2()) {
            U2();
        } else if (this.r0.size() > 0) {
            V2();
        } else {
            T2();
        }
    }

    public void i1() {
        super.i1();
        m.b(C0, "onResume");
        com.tempmail.utils.z.a aVar = this.d0;
        if (aVar != null) {
            aVar.X(0);
        }
        this.c0.k(false);
        androidx.appcompat.app.a u02 = this.Z.u0();
        if (u02 != null) {
            u02.y();
        }
    }

    public void m1() {
        super.m1();
        this.i0 = null;
        m.b(C0, "onStop");
    }

    public void r(EmailTable emailTable, w.c cVar) {
        this.j0 = cVar;
        this.s0 = emailTable;
        Y2();
    }

    public void v2() {
        new Handler(Looper.getMainLooper()).post(new f(this));
    }

    public void x() {
        this.o0.D.setRefreshing(false);
        if (E2()) {
            U2();
        } else {
            W2();
        }
    }

    public void x2() {
        this.v0.removeCallbacks(this.w0);
    }

    public void z2() {
    }
}
