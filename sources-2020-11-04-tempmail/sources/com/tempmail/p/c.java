package com.tempmail.p;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Toast;
import androidx.lifecycle.x;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdCallback;
import com.google.firebase.remoteconfig.f;
import com.tempmail.R;
import com.tempmail.api.models.answers.ApiError;
import com.tempmail.api.models.requests.NewMailboxBody;
import com.tempmail.db.EmailAddressTable;
import com.tempmail.o.r;
import com.tempmail.q.g;
import com.tempmail.q.i;
import com.tempmail.utils.e;
import com.tempmail.utils.s;
import com.tempmail.utils.z.m;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BaseMailboxFragment */
public abstract class c extends g implements View.OnClickListener, com.tempmail.m.b {
    /* access modifiers changed from: private */
    public static final String p0 = c.class.getSimpleName();
    public int i0 = 0;
    public f j0 = f.f();
    protected m k0;
    /* access modifiers changed from: private */
    public boolean l0 = false;
    /* access modifiers changed from: private */
    public d m0;
    private r n0;
    private com.tempmail.w.a o0;

    /* compiled from: BaseMailboxFragment */
    class a extends RewardedAdCallback {
        a() {
        }

        public void onRewardedAdClosed() {
            com.tempmail.utils.m.b(c.p0, "onRewardedAdClosed ");
            if (c.this.l0) {
                c.this.H2();
            }
            String r2 = c.p0;
            com.tempmail.utils.m.b(r2, "onRewardedAdClosed is first loaded " + c.this.c0.q().isLoaded());
            String r22 = c.p0;
            com.tempmail.utils.m.b(r22, "onRewardedAdClosed is second loaded " + c.this.c0.Z().isLoaded());
            c.this.c0.r();
        }

        public void onRewardedAdFailedToShow(int i) {
            String r2 = c.p0;
            com.tempmail.utils.m.b(r2, "onRewardedAdFailedToShow " + i);
        }

        public void onRewardedAdOpened() {
            boolean unused = c.this.l0 = false;
            com.tempmail.utils.m.b(c.p0, "onRewardedAdOpened ");
        }

        public void onUserEarnedReward(RewardItem rewardItem) {
            String r2 = c.p0;
            com.tempmail.utils.m.b(r2, "onUserEarnedReward " + rewardItem.getAmount());
            s.o(c.this.L(), rewardItem.getAmount());
            boolean unused = c.this.l0 = true;
        }
    }

    /* compiled from: BaseMailboxFragment */
    class b implements com.tempmail.utils.z.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ NewMailboxBody f12955a;

        b(NewMailboxBody newMailboxBody) {
            this.f12955a = newMailboxBody;
        }

        public void a(int i) {
            c.this.m0.a(com.tempmail.l.b.l(true), this.f12955a);
        }

        public void b(int i) {
        }
    }

    private void A2() {
        if (this.b0 != null) {
            this.f0.post(new a(this, (int) this.j0.h(k0(R.string.remote_config_ir_rewarded_copy))));
            try {
                if (this.n0 != null) {
                    this.n0.o2();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private void B2(EmailAddressTable emailAddressTable) {
        com.tempmail.utils.m.b(p0, "generateNewEmail ");
        List<String> w = com.tempmail.utils.g.w(this.Z.G0());
        if (w.isEmpty()) {
            Toast.makeText(this.b0, R.string.message_no_domains, 1).show();
            return;
        }
        boolean f2 = com.tempmail.utils.r.f(this.Z.G0(), w, emailAddressTable);
        String str = p0;
        com.tempmail.utils.m.b(str, "isGenerated " + f2);
        if (f2) {
            this.k0.v(emailAddressTable);
            this.e0.U();
        }
    }

    /* access modifiers changed from: private */
    public void H2() {
        new Handler(Looper.getMainLooper()).post(new b(this));
    }

    private void v2(Intent intent) {
        this.m0.b(true, intent.getStringExtra("extra_email"), intent.getStringExtra("extra_domain"), (String) null);
        o2(k0(R.string.analytics_email_created_premium));
    }

    public void C2() {
        this.o0 = (com.tempmail.w.a) new x(n2()).a(com.tempmail.w.a.class);
    }

    /* access modifiers changed from: protected */
    public void D2() {
        Context context = this.b0;
        this.m0 = new f(context, com.tempmail.l.b.a(context), this, this.Z.H0());
    }

    public /* synthetic */ void E2(int i) {
        s.y0(this.b0, i);
        e.j(this.b0, this.c0.T());
    }

    public /* synthetic */ void F2() {
        if (this.l0) {
            int i = this.i0;
            if (i == 3) {
                A2();
            } else if (i == 4) {
                y2();
            } else if (i == 5) {
                u2();
            } else if (i == com.tempmail.utils.y.c.f13143b.intValue()) {
                L2();
            }
        }
    }

    public void G2() {
        if (e.S()) {
            P2();
        } else {
            I2();
        }
    }

    public void H0(int i, int i2, Intent intent) {
        super.H0(i, i2, intent);
        this.i0 = i;
        if (i != 2) {
            if (i != 3 && i != 4) {
                return;
            }
            if (i2 == -1) {
                if (this.c0 != null) {
                    RewardedAd g = com.tempmail.utils.b.g(L(), this.c0.q(), this.c0.Z());
                    if (g != null) {
                        N2(g);
                        return;
                    }
                    this.c0.r();
                    if (i == 4) {
                        y2();
                    } else {
                        A2();
                    }
                }
            } else if (intent != null) {
                String stringExtra = intent.getStringExtra("extra_next_screen");
                if (this.Y != null && "Premium".equalsIgnoreCase(stringExtra)) {
                    this.Y.L(i.G2(), true);
                } else if ("RemoveAd".equalsIgnoreCase(stringExtra)) {
                    this.o0.i();
                }
            }
        } else if (i2 == -1) {
            v2(intent);
        }
    }

    public abstract void I2();

    public void J0(Context context) {
        super.J0(context);
        if (context instanceof m) {
            this.k0 = (m) context;
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnNewMailbox");
    }

    public void J2() {
        int q = s.q(this.b0);
        int h = com.tempmail.utils.b.k(this.b0) ? (int) this.j0.h(k0(R.string.remote_config_ir_rewarded_change)) : 0;
        RewardedAd g = com.tempmail.utils.b.g(L(), this.c0.q(), this.c0.Z());
        if (g == null) {
            this.c0.r();
        }
        int i = q - h;
        boolean z = true;
        boolean z2 = i < 0 && g != null;
        String str = p0;
        StringBuilder sb = new StringBuilder();
        sb.append("pointsLeft ");
        sb.append(i);
        sb.append(" isAvailable ");
        sb.append(g != null);
        com.tempmail.utils.m.b(str, sb.toString());
        String str2 = p0;
        com.tempmail.utils.m.b(str2, "is show video " + z2);
        if (z2) {
            M2(4);
            return;
        }
        if (e.S()) {
            z = this.j0.d(k0(R.string.remote_config_disable_confirmation_windows));
        }
        if (!z) {
            this.c0.Q(false);
        } else {
            y2();
        }
    }

    public void K2() {
    }

    public void L2() {
    }

    public void M2(int i) {
        try {
            r R2 = r.R2(this.a0, k0(R.string.rewarded_dialog_title_free_version_ads), k0(R.string.rewarded_dialog_watch_video_or_premium), false);
            this.n0 = R2;
            R2.f2(this, i);
            this.n0.t2(false);
            this.n0.x2(this.Z.k0(), r.class.getSimpleName());
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
    }

    public void N2(RewardedAd rewardedAd) {
        rewardedAd.show(this.Z, new a());
    }

    public void O2(NewMailboxBody newMailboxBody) {
        String str;
        if (e.R()) {
            str = k0(R.string.message_network_error_message) + "\nError details: \nFailed with " + "Create email";
        } else {
            str = k0(R.string.message_network_error_message);
        }
        com.tempmail.o.s A2 = com.tempmail.o.s.A2(k0(R.string.message_try_again), k0(17039360), (String) null, str);
        A2.t2(true);
        A2.B2(0, new b(newMailboxBody));
        try {
            A2.x2(this.Z.k0(), com.tempmail.o.s.class.getSimpleName());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void P2() {
    }

    public void Q2() {
        if (e.P(this.b0)) {
            o2(this.b0.getString(R.string.analytics_email_change_free));
            J2();
            return;
        }
        z2();
    }

    public void R2() {
        int q = s.q(this.b0);
        boolean z = false;
        int h = com.tempmail.utils.b.k(this.b0) ? (int) this.j0.h(k0(R.string.remote_config_ir_rewarded_copy)) : 0;
        String str = p0;
        StringBuilder sb = new StringBuilder();
        sb.append("points left ");
        int i = q - h;
        sb.append(i);
        com.tempmail.utils.m.b(str, sb.toString());
        if (i >= 0) {
            com.tempmail.utils.m.b(p0, "copy email ");
            A2();
            return;
        }
        RewardedAd g = com.tempmail.utils.b.g(L(), this.c0.q(), this.c0.Z());
        String str2 = p0;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(" isAvailable ");
        if (g != null) {
            z = true;
        }
        sb2.append(z);
        com.tempmail.utils.m.b(str2, sb2.toString());
        if (g != null) {
            M2(3);
            return;
        }
        A2();
        this.c0.r();
    }

    public void U0() {
        super.U0();
        this.k0 = null;
    }

    public void a(boolean z) {
        if (z) {
            this.Z.M0();
        } else {
            this.Z.E0();
        }
    }

    public void d(boolean z, String str, String str2) {
        e.W(this.Z, this.k0, this.e0, z, str, str2);
        G2();
    }

    public void k(ApiError apiError) {
        e.Z(this.Z, apiError, k0(R.string.analytics_screen_name_mailbox), "mailbox.new");
    }

    public void l(NewMailboxBody newMailboxBody) {
        O2(newMailboxBody);
    }

    public void u2() {
    }

    public void w2() {
        if (e.S()) {
            B2(this.c0.j());
            P2();
            return;
        }
        x2();
    }

    public void x2() {
    }

    public void y2() {
        if (this.b0 != null) {
            s.y0(this.b0, (int) this.j0.h(k0(R.string.remote_config_ir_rewarded_change)));
            w2();
            try {
                if (this.n0 != null) {
                    this.n0.o2();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void z2() {
        int i;
        o2(this.b0.getString(R.string.analytics_email_change_premium));
        List<EmailAddressTable> y = com.tempmail.utils.g.y(this.Z.G0());
        if (e.S()) {
            i = y.size();
        } else {
            ArrayList arrayList = new ArrayList();
            for (EmailAddressTable next : y) {
                if (!next.isExpired()) {
                    arrayList.add(next);
                }
            }
            i = arrayList.size();
        }
        if (i < com.tempmail.utils.i.a(this.b0)) {
            List<String> w = com.tempmail.utils.g.w(this.Z.G0());
            if (w.size() == 0) {
                Toast.makeText(this.b0, R.string.message_no_domains, 1).show();
                this.Z.finish();
            }
            EmailAddressTable m = e.m(w, (String) null);
            this.m0.b(true, m.getFullEmailAddress(), m.getDomain(), (String) null);
            return;
        }
        this.Z.N0(com.tempmail.utils.i.b(this.b0));
    }
}
