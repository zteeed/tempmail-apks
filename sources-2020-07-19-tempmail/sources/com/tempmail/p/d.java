package com.tempmail.p;

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
import androidx.appcompat.app.a;
import androidx.databinding.f;
import com.android.billingclient.api.g;
import com.tempmail.R;
import com.tempmail.m.u;
import com.tempmail.n.m;
import com.tempmail.s.i;
import com.tempmail.utils.e;
import com.tempmail.utils.s;

/* compiled from: PremiumAdFragment */
public class d extends m implements View.OnClickListener {
    private static final String r0 = d.class.getSimpleName();
    private u o0;
    private g p0;
    private i q0;

    private void A2() {
        Toast.makeText(this.i0, R.string.message_purchase_data_error, 1).show();
        this.l0.t(true);
    }

    private void t2() {
        s2(h0(R.string.analytics_promo_trial_click));
        if (this.p0 != null) {
            s.k0(this.i0, true);
            this.n0.v().k(this.p0);
            return;
        }
        A2();
    }

    private void u2() {
        this.o0.Q.setGravity(8388611);
    }

    private void v2() {
        Window window = k2().getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        window.setFlags(1024, 1024);
        window.setAttributes(attributes);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        u().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        window.setLayout(displayMetrics.widthPixels, attributes.height);
    }

    private void w2() {
        this.o0.Q.setGravity(17);
    }

    public static d x2() {
        return new d();
    }

    private void z2() {
        this.o0.Q.setMovementMethod(LinkMovementMethod.getInstance());
        TextView textView = this.o0.Q;
        textView.setText(com.tempmail.utils.u.c(this.i0, R.string.premium_terms_and_conditions_text_android, textView.getCurrentTextColor()));
    }

    public void G0(Context context) {
        super.G0(context);
        if (context instanceof i) {
            this.q0 = (i) context;
        }
    }

    public void J0(Bundle bundle) {
        super.J0(bundle);
        p2(1, 2131820748);
    }

    public View N0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            this.o0 = (u) f.d(layoutInflater, R.layout.fragment_ad_premium, viewGroup, false);
            y2();
            v2();
            this.o0.P.setText(com.tempmail.utils.u.a(this.i0, R.string.premium_free_days_amount, "3"));
            this.o0.q.setOnClickListener(this);
            this.o0.A.setOnClickListener(this);
            this.o0.O.setOnClickListener(this);
            long h = com.google.firebase.remoteconfig.f.f().h(h0(R.string.remote_config_buy_premium_screen_var));
            String str = r0;
            com.tempmail.utils.m.b(str, "premiumScreenVariant " + h);
            int i = (int) h;
            if (i == 1) {
                u2();
            } else if (i != 2) {
                u2();
            } else {
                w2();
            }
            return this.o0.n();
        } catch (Resources.NotFoundException | InflateException e2) {
            e2.printStackTrace();
            i2();
            return null;
        }
    }

    public void R0() {
        super.R0();
        this.q0 = null;
    }

    public void f1() {
        super.f1();
    }

    public void i1() {
        super.i1();
        a v0 = this.j0.v0();
        if (v0 != null) {
            v0.y();
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.btnSecond) {
            t2();
        } else if (id == R.id.ivClose) {
            i2();
        } else if (id == R.id.tvRestorePurchase) {
            this.q0.j1();
        }
    }

    public void y2() {
        z2();
        g C = s.C(this.i0);
        this.p0 = C;
        if (C != null) {
            this.o0.P.setText(com.tempmail.utils.u.a(this.i0, R.string.premium_free_days_amount, String.valueOf(e.M(C))));
            this.o0.G.setText(com.tempmail.utils.u.b(this.i0, R.string.premium_billed, String.valueOf(e.M(this.p0)), this.p0.c()));
            this.o0.S.setText(com.tempmail.utils.u.b(H(), R.string.premium_billed, String.valueOf(e.M(this.p0)), this.p0.c()));
            this.o0.R.setText(com.tempmail.utils.u.a(H(), R.string.premium_trial_charge, this.p0.c()));
            return;
        }
        this.o0.G.setText(com.tempmail.utils.u.b(this.i0, R.string.premium_billed, "...", "..."));
        this.o0.S.setText(com.tempmail.utils.u.b(H(), R.string.premium_billed, "...", "..."));
        this.o0.R.setText(com.tempmail.utils.u.a(H(), R.string.premium_trial_charge, "..."));
    }
}
