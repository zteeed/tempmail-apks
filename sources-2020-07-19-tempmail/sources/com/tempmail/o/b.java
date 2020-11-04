package com.tempmail.o;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Toast;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdCallback;
import com.google.firebase.remoteconfig.f;
import com.tempmail.R;
import com.tempmail.api.models.answers.ApiError;
import com.tempmail.n.s;
import com.tempmail.p.c;
import com.tempmail.utils.e;
import com.tempmail.utils.g;
import com.tempmail.utils.i;
import com.tempmail.utils.r;
import com.tempmail.utils.z.m;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BaseMailboxFragment */
public abstract class b extends c implements View.OnClickListener, com.tempmail.l.b {
    /* access modifiers changed from: private */
    public static final String o0 = b.class.getSimpleName();
    public int i0 = 0;
    /* access modifiers changed from: private */
    public boolean j0 = false;
    protected m k0;
    private c l0;
    public f m0 = f.f();
    private s n0;

    /* compiled from: BaseMailboxFragment */
    class a extends RewardedAdCallback {
        a() {
        }

        public void onRewardedAdClosed() {
            com.tempmail.utils.m.b(b.o0, "onRewardedAdClosed ");
            if (b.this.j0) {
                b.this.w2();
            }
            String k2 = b.o0;
            com.tempmail.utils.m.b(k2, "onRewardedAdClosed is first loaded " + b.this.e0.q().isLoaded());
            String k22 = b.o0;
            com.tempmail.utils.m.b(k22, "onRewardedAdClosed is second loaded " + b.this.e0.a0().isLoaded());
            b.this.e0.r();
        }

        public void onRewardedAdFailedToShow(int i) {
            String k2 = b.o0;
            com.tempmail.utils.m.b(k2, "onRewardedAdFailedToShow " + i);
        }

        public void onRewardedAdOpened() {
            boolean unused = b.this.j0 = false;
            com.tempmail.utils.m.b(b.o0, "onRewardedAdOpened ");
        }

        public void onUserEarnedReward(RewardItem rewardItem) {
            String k2 = b.o0;
            com.tempmail.utils.m.b(k2, "onUserEarnedReward " + rewardItem.getAmount());
            com.tempmail.utils.s.o(b.this.H(), rewardItem.getAmount());
            boolean unused = b.this.j0 = true;
        }
    }

    private void n2(Intent intent) {
        this.l0.a(true, intent.getStringExtra("extra_email"), intent.getStringExtra("extra_domain"), (String) null);
        h2(h0(R.string.analytics_email_created_premium));
    }

    private void s2() {
        if (this.c0 != null) {
            com.tempmail.utils.s.w0(this.c0, (int) this.m0.h(h0(R.string.remote_config_ir_rewarded_copy)));
            e.j(this.c0, this.e0.V());
            try {
                if (this.n0 != null) {
                    this.n0.i2();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private void t2(com.tempmail.db.e eVar) {
        com.tempmail.utils.m.b(o0, "generateNewEmail ");
        List<String> x = g.x(this.a0.H0());
        if (x.isEmpty()) {
            Toast.makeText(this.c0, R.string.message_no_domains, 1).show();
            return;
        }
        boolean f2 = r.f(this.a0.H0(), x, eVar);
        String str = o0;
        com.tempmail.utils.m.b(str, "isGenerated " + f2);
        if (f2) {
            this.k0.w(eVar);
            this.h0.W();
        }
    }

    /* access modifiers changed from: private */
    public void w2() {
        new Handler(Looper.getMainLooper()).post(new a(this));
    }

    public void A2(int i) {
        try {
            s N2 = s.N2(this.b0, h0(R.string.rewarded_dialog_title_free_version_ads), h0(R.string.rewarded_dialog_watch_video_or_premium), false);
            this.n0 = N2;
            N2.Z1(this, i);
            this.n0.n2(false);
            this.n0.r2(this.a0.k0(), s.class.getSimpleName());
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
    }

    public void B2(RewardedAd rewardedAd) {
        rewardedAd.show(this.a0, new a());
    }

    public void C2() {
    }

    public void D2() {
        if (e.O(this.c0)) {
            h2(this.c0.getString(R.string.analytics_email_change_free));
            x2();
            return;
        }
        r2();
    }

    public void E0(int i, int i2, Intent intent) {
        super.E0(i, i2, intent);
        this.i0 = i;
        if (i != 2) {
            if (i != 3 && i != 4) {
                return;
            }
            if (i2 == -1) {
                RewardedAd g = com.tempmail.utils.b.g(H(), this.e0.q(), this.e0.a0());
                if (g != null) {
                    B2(g);
                    return;
                }
                this.e0.r();
                if (i == 4) {
                    q2();
                } else {
                    s2();
                }
            } else if (intent != null) {
                String stringExtra = intent.getStringExtra("extra_next_screen");
                if (this.Z != null && "Premium".equalsIgnoreCase(stringExtra)) {
                    this.Z.M(com.tempmail.p.e.r2(), true);
                } else if ("RemoveAd".equalsIgnoreCase(stringExtra)) {
                    this.g0.v().l("remove_ad_purchase", "inapp");
                }
            }
        } else if (i2 == -1) {
            n2(intent);
        }
    }

    public void E2() {
        int q = com.tempmail.utils.s.q(this.c0);
        boolean z = false;
        int h = com.tempmail.utils.b.k(this.c0) ? (int) this.m0.h(h0(R.string.remote_config_ir_rewarded_copy)) : 0;
        String str = o0;
        StringBuilder sb = new StringBuilder();
        sb.append("points left ");
        int i = q - h;
        sb.append(i);
        com.tempmail.utils.m.b(str, sb.toString());
        if (i >= 0) {
            com.tempmail.utils.m.b(o0, "copy email ");
            s2();
            return;
        }
        RewardedAd g = com.tempmail.utils.b.g(H(), this.e0.q(), this.e0.a0());
        String str2 = o0;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(" isAvailable ");
        if (g != null) {
            z = true;
        }
        sb2.append(z);
        com.tempmail.utils.m.b(str2, sb2.toString());
        if (g != null) {
            A2(3);
            return;
        }
        s2();
        this.e0.r();
    }

    public void G0(Context context) {
        super.G0(context);
        if (context instanceof m) {
            this.k0 = (m) context;
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnNewMailbox");
    }

    public void R0() {
        super.R0();
        this.k0 = null;
    }

    public void a(boolean z) {
        if (z) {
            this.a0.O0();
        } else {
            this.a0.F0();
        }
    }

    public void b(boolean z, String str, String str2) {
        e.W(this.a0, this.k0, this.h0, z, str, str2);
        C2();
    }

    public void i(ApiError apiError) {
        e.Z(this.a0, apiError);
    }

    public void m2() {
    }

    public void o2() {
        if (e.S()) {
            t2(this.e0.l());
            C2();
            return;
        }
        p2();
    }

    public void p2() {
    }

    public void q2() {
        if (this.c0 != null) {
            com.tempmail.utils.s.w0(this.c0, (int) this.m0.h(h0(R.string.remote_config_ir_rewarded_change)));
            o2();
            try {
                if (this.n0 != null) {
                    this.n0.i2();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void r2() {
        int i;
        h2(this.c0.getString(R.string.analytics_email_change_premium));
        List<com.tempmail.db.e> z = g.z(this.a0.H0());
        if (e.S()) {
            i = z.size();
        } else {
            ArrayList arrayList = new ArrayList();
            for (com.tempmail.db.e next : z) {
                if (!next.v()) {
                    arrayList.add(next);
                }
            }
            i = arrayList.size();
        }
        if (i < i.a(this.c0)) {
            List<String> x = g.x(this.a0.H0());
            if (x.size() == 0) {
                Toast.makeText(this.c0, R.string.message_no_domains, 1).show();
                this.a0.finish();
            }
            com.tempmail.db.e m = e.m(x, (String) null);
            this.l0.a(true, m.p(), m.k(), (String) null);
            return;
        }
        this.a0.P0(i.b(this.c0));
    }

    /* access modifiers changed from: protected */
    public void u2() {
        Context context = this.c0;
        this.l0 = new e(context, com.tempmail.j.b.a(context), this, this.a0.J0());
    }

    public /* synthetic */ void v2() {
        if (this.j0) {
            int i = this.i0;
            if (i == 3) {
                s2();
            } else if (i == 4) {
                q2();
            } else if (i == 5) {
                m2();
            } else if (i == com.tempmail.utils.y.c.f12601b.intValue()) {
                z2();
            }
        }
    }

    public void x2() {
        int q = com.tempmail.utils.s.q(this.c0);
        int h = com.tempmail.utils.b.k(this.c0) ? (int) this.m0.h(h0(R.string.remote_config_ir_rewarded_change)) : 0;
        RewardedAd g = com.tempmail.utils.b.g(H(), this.e0.q(), this.e0.a0());
        if (g == null) {
            this.e0.r();
        }
        int i = q - h;
        boolean z = true;
        boolean z2 = i < 0 && g != null;
        String str = o0;
        StringBuilder sb = new StringBuilder();
        sb.append("pointsLeft ");
        sb.append(i);
        sb.append(" isAvailable ");
        sb.append(g != null);
        com.tempmail.utils.m.b(str, sb.toString());
        String str2 = o0;
        com.tempmail.utils.m.b(str2, "is show video " + z2);
        if (z2) {
            A2(4);
            return;
        }
        if (e.S()) {
            z = this.m0.d(h0(R.string.remote_config_disable_confirmation_windows));
        }
        if (!z) {
            this.e0.R(false);
        } else {
            q2();
        }
    }

    public void y2() {
    }

    public void z2() {
    }
}
