package com.tempmail.q;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.util.DisplayMetrics;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.a;
import androidx.databinding.f;
import com.android.billingclient.api.n;
import com.tempmail.ApplicationClass;
import com.tempmail.R;
import com.tempmail.n.w;
import com.tempmail.o.l;
import com.tempmail.t.o;
import com.tempmail.utils.e;
import com.tempmail.utils.m;
import com.tempmail.utils.s;
import com.tempmail.utils.u;
import com.tempmail.utils.x;
import java.util.Map;

/* compiled from: PremiumAdFragment */
public class h extends l implements View.OnClickListener {
    private static final String s0 = h.class.getSimpleName();
    private w p0;
    private n q0;
    private o r0;

    private void A2() {
        TextView textView = this.p0.P;
        textView.setText(u.d(this.l0, R.string.premium_terms_and_conditions_text_android, textView.getCurrentTextColor()));
        this.p0.P.setGravity(8388611);
    }

    private void B2() {
        Window window = q2().getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        window.setFlags(1024, 1024);
        window.setAttributes(attributes);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        z().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        window.setLayout(displayMetrics.widthPixels, attributes.height);
    }

    private void C2() {
        this.p0.P.setGravity(17);
        a aVar = new a();
        aVar.d(this.p0.s);
        a aVar2 = aVar;
        aVar2.g(R.id.tvTrialTip, 3, R.id.tvTitle, 4, com.tempmail.utils.w.a(this.p0.Q).topMargin);
        aVar2.g(R.id.tvWhyPremium, 3, R.id.btnSecond, 4, com.tempmail.utils.w.a(this.p0.R).topMargin);
        aVar2.g(R.id.tvTos, 3, R.id.tvReasonSeven, 4, com.tempmail.utils.w.a(this.p0.P).topMargin);
        D2(aVar);
        aVar.a(this.p0.s);
        E2();
    }

    private void F2() {
        a aVar = new a();
        aVar.d(this.p0.s);
        D2(aVar);
        aVar.g(R.id.btnSecond, 3, R.id.tvReasonSeven, 4, com.tempmail.utils.w.a(this.p0.r).topMargin);
        aVar.g(R.id.tvTrialTip, 3, R.id.btnSecond, 4, com.tempmail.utils.w.a(this.p0.Q).topMargin);
        aVar.g(R.id.tvTos, 3, R.id.tvTrialTip, 4, com.tempmail.utils.w.a(this.p0.P).topMargin * 2);
        aVar.a(this.p0.s);
        E2();
    }

    private void G2() {
        ((ApplicationClass) z().getApplication()).f().f12827e.f(O1(), new a(this));
    }

    public static h I2() {
        return new h();
    }

    /* access modifiers changed from: private */
    public void J2(Map<String, n> map) {
        for (Map.Entry next : map.entrySet()) {
            String str = s0;
            m.b(str, "Register registerSku: " + ((String) next.getKey()) + ", token: " + next.getValue());
        }
    }

    private void L2() {
        Toast.makeText(this.l0, R.string.message_purchase_data_error, 1).show();
    }

    private void z2() {
        y2(k0(R.string.analytics_promo_trial_click));
        if (this.q0 != null) {
            m.b("BillingLifecycle", "buyOneMonthTrial");
            s.m0(this.l0, true);
            this.r0.K.g(this.q0.f());
            return;
        }
        L2();
    }

    public void D2(a aVar) {
        this.p0.N.setTextSize(0, e0().getDimension(R.dimen.tv_restore_purchase_text_size_second));
        TextView textView = this.p0.N;
        textView.setTypeface(textView.getTypeface(), 0);
        this.p0.N.setTextColor(e0().getColor(R.color.restore_purchase_second));
        a aVar2 = aVar;
        aVar2.g(R.id.leftGuideLineWhyPremium, 6, R.id.leftGuideLine, 6, 0);
        aVar.g(R.id.leftGuideLineWhyPremium, 7, R.id.tvWhyPremium, 6, 0);
        aVar2.g(R.id.ivClose, 6, 0, 6, x.o(L(), R.dimen.premium_screen_btn_close_side_margin));
        aVar.c(R.id.ivClose, 7);
    }

    public void E2() {
        ConstraintLayout.a a2 = com.tempmail.utils.w.a(this.p0.N);
        int i = a2.topMargin / 2;
        String str = s0;
        m.b(str, "newRestoreTopMargin " + i);
        a2.topMargin = i;
        this.p0.N.setLayoutParams(a2);
        ConstraintLayout.a a3 = com.tempmail.utils.w.a(this.p0.O);
        a3.topMargin = x.o(L(), R.dimen.premiumTitleMarginTopSecond);
        this.p0.O.setLayoutParams(a3);
        this.p0.q.setVisibility(0);
        this.p0.y.setVisibility(8);
        this.p0.L.setVisibility(8);
        TextView textView = this.p0.P;
        Context context = this.l0;
        textView.setText(u.e(context, u.c(context), this.p0.P.getCurrentTextColor()));
    }

    public void J0(Context context) {
        super.J0(context);
        if (context instanceof o) {
            this.r0 = (o) context;
        }
    }

    public void K2() {
        n D = s.D(this.l0);
        this.q0 = D;
        if (D != null) {
            this.p0.O.setText(u.a(this.l0, R.string.premium_free_days_amount, String.valueOf(e.N(D))));
            this.p0.Q.setText(u.b(L(), R.string.premium_billed, String.valueOf(e.N(this.q0)), this.q0.c()));
            return;
        }
        this.p0.Q.setText(u.b(L(), R.string.premium_billed, "...", "..."));
    }

    public void M0(Bundle bundle) {
        super.M0(bundle);
        v2(1, 2131820748);
    }

    public View Q0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            this.p0 = (w) f.d(layoutInflater, R.layout.fragment_ad_premium, viewGroup, false);
            K2();
            B2();
            this.p0.O.setText(u.a(this.l0, R.string.premium_free_days_amount, "3"));
            this.p0.r.setOnClickListener(this);
            this.p0.A.setOnClickListener(this);
            this.p0.N.setOnClickListener(this);
            this.p0.P.setMovementMethod(LinkMovementMethod.getInstance());
            long h = com.google.firebase.remoteconfig.f.f().h(k0(R.string.remote_config_trial_screen_var));
            String str = s0;
            m.b(str, "trialScreenVar " + h);
            int i = (int) h;
            if (i == 1) {
                A2();
            } else if (i == 2) {
                C2();
            } else if (i != 3) {
                A2();
            } else {
                F2();
            }
            G2();
            return this.p0.n();
        } catch (Resources.NotFoundException | InflateException e2) {
            e2.printStackTrace();
            o2();
            return null;
        }
    }

    public void U0() {
        super.U0();
        this.r0 = null;
    }

    public void i1() {
        super.i1();
    }

    public void m1() {
        super.m1();
        androidx.appcompat.app.a u0 = this.m0.u0();
        if (u0 != null) {
            u0.y();
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.btnSecond) {
            z2();
        } else if (id == R.id.ivClose) {
            o2();
        } else if (id == R.id.tvRestorePurchase) {
            o oVar = this.r0;
            oVar.E = true;
            oVar.w1();
        }
    }
}
