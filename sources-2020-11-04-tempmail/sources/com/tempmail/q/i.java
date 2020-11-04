package com.tempmail.q;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.x;
import com.android.billingclient.api.j;
import com.android.billingclient.api.n;
import com.google.firebase.remoteconfig.f;
import com.tempmail.ApplicationClass;
import com.tempmail.R;
import com.tempmail.billing.BillingClientLifecycle;
import com.tempmail.n.k0;
import com.tempmail.t.o;
import com.tempmail.u.d;
import com.tempmail.utils.e;
import com.tempmail.utils.m;
import com.tempmail.utils.s;
import com.tempmail.utils.u;
import com.tempmail.utils.w;
import com.tempmail.w.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PremiumFragment */
public class i extends g implements View.OnClickListener {
    private static final String z0 = i.class.getSimpleName();
    private k0 i0;
    private n j0;
    private n k0;
    private n l0;
    private n m0;
    private n n0;
    private n o0;
    private boolean p0 = false;
    private List<RadioButton> q0 = new ArrayList();
    private List<ConstraintLayout> r0 = new ArrayList();
    private f s0;
    private boolean t0 = false;
    private double u0 = 0.0d;
    private String v0;
    private a w0;
    private BillingClientLifecycle x0;
    private j y0;

    private void A2() {
        androidx.constraintlayout.widget.a aVar = new androidx.constraintlayout.widget.a();
        aVar.d(this.i0.E);
        y2(aVar);
        aVar.g(R.id.btnSecond, 3, R.id.tvTrialTip, 4, w.a(this.i0.w).topMargin);
        aVar.g(R.id.tvWhyPremium, 3, R.id.btnFirst, 4, w.a(this.i0.l1).topMargin);
        aVar.a(this.i0.E);
        z2();
    }

    private void B2() {
        BillingClientLifecycle f2 = ((ApplicationClass) z().getApplication()).f();
        this.x0 = f2;
        f2.f12827e.f(O1(), new c(this));
        this.w0 = (a) new x(n2()).a(a.class);
        this.x0.f12825c.f(O1(), new b(this));
    }

    public static i G2() {
        return new i();
    }

    public static i H2(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("extra_deep_link_ots", str);
        i iVar = new i();
        iVar.V1(bundle);
        return iVar;
    }

    public static i I2(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_ad_screen", z);
        i iVar = new i();
        iVar.V1(bundle);
        return iVar;
    }

    /* access modifiers changed from: private */
    public void K2(List<j> list) {
        if (list != null) {
            String str = z0;
            m.b(str, "registerPurchases " + list.size());
            this.y0 = e.E(list);
        }
        if (this.y0 != null) {
            J2();
            String str2 = z0;
            m.b(str2, "purchaseToRestore " + this.y0.toString());
            String str3 = z0;
            m.b(str3, "purchaseToRestore date" + new Date(this.y0.d()).toString());
        }
        this.x0.f12825c.k(O1());
    }

    /* access modifiers changed from: private */
    public void L2(Map<String, n> map) {
        for (Map.Entry next : map.entrySet()) {
            String str = z0;
            m.b(str, "Register registerSku: " + ((String) next.getKey()) + ", token: " + next.getValue());
        }
        this.f0.post(new f(this));
    }

    private void w2() {
        androidx.constraintlayout.widget.a aVar = new androidx.constraintlayout.widget.a();
        aVar.d(this.i0.E);
        y2(aVar);
        aVar.g(R.id.tvWhyPremium, 3, R.id.ivLogo, 4, w.a(this.i0.l1).topMargin);
        aVar.g(R.id.tvTrialTitle, 3, R.id.tvReasonSeven, 4, w.a(this.i0.k1).topMargin);
        aVar.g(R.id.tvTos, 3, R.id.btnFirst, 4, w.a(this.i0.d1).topMargin);
        aVar.a(this.i0.E);
        z2();
    }

    public /* synthetic */ void E2(CompoundButton compoundButton, boolean z) {
        m.b(z0, "rb selected");
        if (z) {
            switch (compoundButton.getId()) {
                case R.id.rbThreeMonth /*2131296571*/:
                    m.b(z0, "rbThreeMonth selected");
                    o2(k0(R.string.analytics_premium_price_3m_click));
                    q2(2);
                    return;
                case R.id.rbWeek /*2131296572*/:
                    m.b(z0, "rbWeek selected");
                    o2(k0(R.string.analytics_premium_price_1w_click));
                    q2(0);
                    return;
                case R.id.rb_month /*2131296573*/:
                    m.b(z0, "rbMonth selected");
                    o2(k0(R.string.analytics_premium_price_1m_click));
                    q2(1);
                    return;
                case R.id.rb_six_month /*2131296574*/:
                    m.b(z0, "rbSixMonth selected");
                    o2(k0(R.string.analytics_premium_price_6m_click));
                    q2(3);
                    return;
                case R.id.rb_year /*2131296575*/:
                    m.b(z0, "rbYear selected");
                    o2(k0(R.string.analytics_premium_price_12m_click));
                    q2(4);
                    return;
                default:
                    return;
            }
        }
    }

    public /* synthetic */ void F2() {
        Integer valueOf = Integer.valueOf(this.i0.P0.getMeasuredWidth());
        Integer valueOf2 = Integer.valueOf(this.i0.I0.getMeasuredWidth());
        Integer valueOf3 = Integer.valueOf(this.i0.L0.getMeasuredWidth());
        Integer valueOf4 = Integer.valueOf(this.i0.F0.getMeasuredWidth());
        Integer valueOf5 = Integer.valueOf(this.i0.H0.getMeasuredWidth());
        ArrayList arrayList = new ArrayList();
        arrayList.add(valueOf);
        arrayList.add(valueOf2);
        arrayList.add(valueOf3);
        arrayList.add(valueOf4);
        arrayList.add(valueOf5);
        int intValue = ((Integer) Collections.max(arrayList)).intValue();
        String str = z0;
        m.b(str, "priceYearWidth " + valueOf + " priceSixMonthWidth " + valueOf2);
        this.i0.H0.setWidth(intValue);
        this.i0.F0.setWidth(intValue);
        this.i0.L0.setWidth(intValue);
        this.i0.I0.setWidth(intValue);
        this.i0.P0.setWidth(intValue);
    }

    public void H0(int i, int i2, Intent intent) {
        String str;
        super.H0(i, i2, intent);
        if (i == 1 && i2 == -1) {
            this.h0.E = true;
            if (!(this.y0 == null || (str = this.v0) == null)) {
                s.j0(this.b0, str);
            }
            this.a0.v1();
        }
    }

    public void J2() {
        com.tempmail.o.s A2 = com.tempmail.o.s.A2(k0(R.string.menu_restore_purchases), k0(R.string.message_button_cancel), k0(R.string.menu_restore_purchases), k0(R.string.already_subscribed));
        A2.f2(this, 1);
        A2.x2(this.Z.k0(), "Restore propose");
    }

    public void M2() {
        String str = z0;
        StringBuilder sb = new StringBuilder();
        sb.append("context null ");
        sb.append(this.b0 == null);
        m.b(str, sb.toString());
        Context context = this.b0;
        if (context != null) {
            this.j0 = s.E(context);
            this.l0 = s.D(this.b0);
            this.k0 = s.C(this.b0);
            this.m0 = s.O(this.b0);
            this.n0 = s.M(this.b0);
            this.o0 = s.R(this.b0);
            if (s.y(this.b0)) {
                this.i0.w.setVisibility(8);
                this.i0.b0.setVisibility(8);
                this.i0.j1.setVisibility(8);
                this.i0.k1.setVisibility(8);
            }
            n nVar = this.j0;
            if (nVar != null) {
                this.i0.H0.setText(nVar.c());
                this.u0 = (((double) this.j0.d()) / 1000000.0d) / 7.0d;
                this.i0.O0.setText(this.j0.c());
            }
            if (this.k0 != null) {
                O2();
            }
            n nVar2 = this.l0;
            if (nVar2 != null) {
                this.i0.k1.setText(u.a(this.b0, R.string.premium_free_days_amount, String.valueOf(e.N(nVar2))));
                this.i0.j1.setText(u.b(L(), R.string.premium_billed, String.valueOf(e.N(this.l0)), this.l0.c()));
            } else {
                this.i0.k1.setText(u.a(this.b0, R.string.premium_free_days_amount, "..."));
                this.i0.j1.setText(u.b(L(), R.string.premium_billed, "...", "..."));
            }
            if (!(this.m0 == null || this.u0 == 0.0d)) {
                R2();
            }
            if (!(this.n0 == null || this.u0 == 0.0d)) {
                Q2();
            }
            if (!(this.o0 == null || this.u0 == 0.0d)) {
                S2();
            }
            P2();
        }
    }

    public void N2() {
        TextView textView = this.i0.m0;
        Context context = this.b0;
        textView.setText(u.a(context, R.string.premium_purchase_format_saving, context.getString(R.string.default_premium_values)));
        TextView textView2 = this.i0.n0;
        Context context2 = this.b0;
        textView2.setText(u.a(context2, R.string.premium_purchase_format_saving, context2.getString(R.string.default_premium_values)));
        TextView textView3 = this.i0.q0;
        Context context3 = this.b0;
        textView3.setText(u.a(context3, R.string.premium_purchase_format_saving, context3.getString(R.string.default_premium_values)));
        TextView textView4 = this.i0.r0;
        Context context4 = this.b0;
        textView4.setText(u.a(context4, R.string.premium_purchase_format_saving, context4.getString(R.string.default_premium_values)));
    }

    public void O2() {
        this.i0.F0.setText(this.k0.c());
        this.i0.G0.setText(this.k0.c());
        if (this.t0) {
            int G = e.G(this.u0, this.k0, 30.0d);
            this.i0.k0.setText(u.a(this.b0, R.string.premium_purchase_format_saving, String.valueOf(G)));
            this.i0.l0.setText(u.a(this.b0, R.string.premium_purchase_format_saving_two, String.valueOf(G)));
            return;
        }
        this.i0.N.setVisibility(8);
        this.i0.k0.setVisibility(8);
        this.i0.l0.setVisibility(8);
    }

    public void P2() {
        new Handler().post(new e(this));
    }

    public View Q0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        this.i0 = (k0) androidx.databinding.f.d(layoutInflater, R.layout.fragment_premium, viewGroup, false);
        Bundle J = J();
        if (J != null) {
            J.getBoolean("is_ad_screen", false);
            this.v0 = J.getString("extra_deep_link_ots", (String) null);
        }
        this.i0.u.setOnClickListener(this);
        this.i0.s.setOnClickListener(this);
        this.i0.z.setOnClickListener(this);
        this.i0.x.setOnClickListener(this);
        this.i0.B.setOnClickListener(this);
        this.i0.v.setOnClickListener(this);
        this.i0.t.setOnClickListener(this);
        this.i0.A.setOnClickListener(this);
        this.i0.y.setOnClickListener(this);
        this.i0.C.setOnClickListener(this);
        this.i0.r.setOnClickListener(this);
        this.i0.w.setOnClickListener(this);
        this.i0.Z0.setOnClickListener(this);
        this.i0.M.setOnClickListener(this);
        this.i0.d1.setMovementMethod(LinkMovementMethod.getInstance());
        f f2 = f.f();
        this.s0 = f2;
        long h = f2.h(k0(R.string.remote_config_buy_premium_screen_var));
        String str = z0;
        m.b(str, "premiumScreenVariant " + h);
        int i = (int) h;
        if (i != 2) {
            z = true;
        }
        this.p0 = z;
        if (i == 1) {
            v2();
        } else if (i == 2) {
            x2();
        } else if (i == 3) {
            v2();
            A2();
        } else if (i != 4) {
            v2();
        } else {
            v2();
            w2();
        }
        t2();
        N2();
        M2();
        B2();
        return this.i0.n();
    }

    public void Q2() {
        String str;
        int i;
        if (this.t0) {
            i = e.G(this.u0, this.n0, 182.0d);
            str = e.H(this.n0, 6.0d);
        } else {
            d B = e.B(this.k0, this.n0, 6.0d);
            int a2 = B.a();
            str = B.b();
            i = a2;
        }
        this.i0.K0.setText(u.a(this.b0, R.string.premium_purchase_format_per_month, str));
        this.i0.m0.setText(u.a(this.b0, R.string.premium_purchase_format_saving, String.valueOf(i)));
        this.i0.n0.setText(u.a(this.b0, R.string.premium_purchase_format_saving_two, String.valueOf(i)));
        this.i0.I0.setText(this.n0.c());
        this.i0.J0.setText(this.n0.c());
    }

    public void R0() {
        super.R0();
        s.j0(this.b0, (String) null);
    }

    public void R2() {
        String str;
        int i;
        if (this.t0) {
            i = e.G(this.u0, this.m0, 91.0d);
            str = e.H(this.m0, 3.0d);
        } else {
            d B = e.B(this.k0, this.m0, 3.0d);
            int a2 = B.a();
            str = B.b();
            i = a2;
        }
        this.i0.N0.setText(u.a(this.b0, R.string.premium_purchase_format_per_month, str));
        this.i0.o0.setText(u.a(this.b0, R.string.premium_purchase_format_saving, String.valueOf(i)));
        this.i0.p0.setText(u.a(this.b0, R.string.premium_purchase_format_saving_two, String.valueOf(i)));
        this.i0.L0.setText(this.m0.c());
        this.i0.M0.setText(this.m0.c());
    }

    public void S2() {
        String str;
        int i;
        if (this.t0) {
            i = e.G(this.u0, this.o0, 365.0d);
            str = e.H(this.o0, 12.0d);
        } else {
            d B = e.B(this.k0, this.o0, 12.0d);
            int a2 = B.a();
            str = B.b();
            i = a2;
        }
        this.i0.Q0.setText(u.a(this.b0, R.string.premium_purchase_format_per_month, str));
        this.i0.q0.setText(u.a(this.b0, R.string.premium_purchase_format_saving, String.valueOf(i)));
        this.i0.r0.setText(u.a(this.b0, R.string.premium_purchase_format_saving_two, String.valueOf(i)));
        this.i0.P0.setText(this.o0.c());
        this.i0.R0.setText(this.o0.c());
    }

    public void T2() {
        Toast.makeText(this.b0, R.string.message_purchase_data_error, 1).show();
    }

    public void U2() {
        if (this.i0.f0.isChecked()) {
            p2(this.j0);
        } else if (this.i0.c0.isChecked()) {
            p2(this.k0);
        } else if (this.i0.e0.isChecked()) {
            p2(this.m0);
        } else if (this.i0.d0.isChecked()) {
            p2(this.n0);
        } else if (this.i0.g0.isChecked()) {
            p2(this.o0);
        }
    }

    public void i1() {
        super.i1();
        com.tempmail.utils.z.a aVar = this.d0;
        if (aVar != null) {
            aVar.X(8);
        }
        this.c0.k(false);
        androidx.appcompat.app.a u02 = this.Z.u0();
        if (u02 != null) {
            u02.l();
        }
    }

    public void m1() {
        super.m1();
        androidx.appcompat.app.a u02 = this.Z.u0();
        if (u02 != null) {
            u02.y();
        }
    }

    public o n2() {
        return this.h0;
    }

    public void onClick(View view) {
        String str;
        int id = view.getId();
        if (id == R.id.btnFirst) {
            U2();
        } else if (id == R.id.ivClose) {
            this.Z.onBackPressed();
        } else if (id != R.id.tvRestorePurchase) {
            switch (id) {
                case R.id.btnOneMonth /*2131296350*/:
                    p2(this.k0);
                    o2(k0(R.string.analytics_premium_price_1m_click));
                    return;
                case R.id.btnOneMonthSecond /*2131296351*/:
                    o2(k0(R.string.analytics_premium_price_1m_click));
                    q2(1);
                    return;
                case R.id.btnOneWeek /*2131296352*/:
                    p2(this.j0);
                    o2(k0(R.string.analytics_premium_price_1w_click));
                    return;
                case R.id.btnOneWeekSecond /*2131296353*/:
                    o2(k0(R.string.analytics_premium_price_1w_click));
                    q2(0);
                    return;
                default:
                    switch (id) {
                        case R.id.btnSecond /*2131296355*/:
                            m.b(z0, "btnSecond");
                            p2(this.l0);
                            o2(k0(R.string.analytics_premium_price_trial_click));
                            return;
                        case R.id.btnSixMonth /*2131296356*/:
                            p2(this.n0);
                            o2(k0(R.string.analytics_premium_price_6m_click));
                            return;
                        case R.id.btnSixMonthSecond /*2131296357*/:
                            o2(k0(R.string.analytics_premium_price_6m_click));
                            q2(3);
                            return;
                        case R.id.btnThreeMonth /*2131296358*/:
                            p2(this.m0);
                            o2(k0(R.string.analytics_premium_price_3m_click));
                            return;
                        case R.id.btnThreeMonthSecond /*2131296359*/:
                            o2(k0(R.string.analytics_premium_price_3m_click));
                            q2(2);
                            return;
                        default:
                            switch (id) {
                                case R.id.btnYear /*2131296361*/:
                                    p2(this.o0);
                                    o2(k0(R.string.analytics_premium_price_12m_click));
                                    return;
                                case R.id.btnYearSecond /*2131296362*/:
                                    o2(k0(R.string.analytics_premium_price_12m_click));
                                    q2(4);
                                    return;
                                default:
                                    return;
                            }
                    }
            }
        } else {
            if (!(this.y0 == null || (str = this.v0) == null)) {
                s.j0(this.b0, str);
            }
            o oVar = this.h0;
            oVar.E = true;
            oVar.v1();
        }
    }

    public void p2(n nVar) {
        if (nVar != null) {
            String str = z0;
            m.b(str, "skuDetails not null " + nVar.f());
            s.m0(this.b0, true);
            this.w0.g(nVar.f());
            String str2 = this.v0;
            if (str2 != null) {
                s.j0(this.b0, str2);
                return;
            }
            return;
        }
        m.b(z0, "skuDetails null");
        T2();
    }

    public void q2(int i) {
        String str = z0;
        m.b(str, "choose plan " + i);
        if (i == 0) {
            r2(this.i0.v);
            s2(this.i0.f0);
        } else if (i == 1) {
            r2(this.i0.t);
            s2(this.i0.c0);
        } else if (i == 2) {
            r2(this.i0.A);
            s2(this.i0.e0);
        } else if (i == 3) {
            r2(this.i0.y);
            s2(this.i0.d0);
        } else if (i == 4) {
            r2(this.i0.C);
            s2(this.i0.g0);
        }
    }

    public void r2(ConstraintLayout constraintLayout) {
        constraintLayout.setBackgroundResource(R.drawable.rect_blue);
        for (ConstraintLayout next : this.r0) {
            if (next.getId() != constraintLayout.getId()) {
                next.setBackgroundResource(R.drawable.rect_premium_not_selected);
            }
        }
    }

    public void s2(RadioButton radioButton) {
        radioButton.setChecked(true);
        for (RadioButton next : this.q0) {
            if (next.getId() != radioButton.getId()) {
                next.setChecked(false);
            }
        }
    }

    public void t2() {
        List asList = Arrays.asList(this.b0.getResources().getStringArray(R.array.billing_periods));
        String i = this.s0.i(this.b0.getString(R.string.remote_config_payment_var));
        m.b(z0, "paymentVarStr " + i);
        ArrayList arrayList = new ArrayList();
        for (String trim : i.split(",")) {
            String trim2 = trim.trim();
            if (trim2.length() > 0 && asList.contains(trim2)) {
                arrayList.add(trim2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (arrayList.size() > 1) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                m.b(z0, "paymentVarArrayList item " + str);
                char c2 = 65535;
                int hashCode = str.hashCode();
                if (hashCode != 1628) {
                    if (hashCode != 1638) {
                        if (hashCode != 1690) {
                            if (hashCode != 1783) {
                                if (hashCode == 48748 && str.equals("12m")) {
                                    c2 = 4;
                                }
                            } else if (str.equals("6m")) {
                                c2 = 3;
                            }
                        } else if (str.equals("3m")) {
                            c2 = 2;
                        }
                    } else if (str.equals("1w")) {
                        c2 = 0;
                    }
                } else if (str.equals("1m")) {
                    c2 = 1;
                }
                if (c2 == 0) {
                    this.t0 = true;
                    if (this.p0) {
                        arrayList2.add(this.i0.v);
                    } else {
                        arrayList2.add(this.i0.u);
                    }
                } else if (c2 != 1) {
                    if (c2 != 2) {
                        if (c2 != 3) {
                            if (c2 == 4) {
                                if (this.p0) {
                                    arrayList2.add(this.i0.C);
                                } else {
                                    arrayList2.add(this.i0.B);
                                    arrayList2.add(this.i0.q0);
                                    arrayList3.add(this.i0.q0);
                                }
                            }
                        } else if (this.p0) {
                            arrayList2.add(this.i0.y);
                        } else {
                            arrayList2.add(this.i0.x);
                            arrayList2.add(this.i0.m0);
                            arrayList3.add(this.i0.m0);
                        }
                    } else if (this.p0) {
                        arrayList2.add(this.i0.A);
                    } else {
                        arrayList2.add(this.i0.z);
                        arrayList2.add(this.i0.o0);
                        arrayList3.add(this.i0.o0);
                    }
                } else if (this.p0) {
                    arrayList2.add(this.i0.t);
                } else {
                    arrayList2.add(this.i0.s);
                    arrayList2.add(this.i0.k0);
                    arrayList3.add(this.i0.k0);
                }
            }
        } else if (this.p0) {
            arrayList2.add(this.i0.t);
            arrayList2.add(this.i0.y);
            arrayList2.add(this.i0.C);
        } else {
            arrayList2.add(this.i0.s);
            arrayList2.add(this.i0.x);
            arrayList2.add(this.i0.B);
        }
        switch (((View) arrayList2.get(0)).getId()) {
            case R.id.btnOneMonthSecond /*2131296351*/:
                m.b(z0, "rbMonth selected");
                q2(1);
                break;
            case R.id.btnOneWeekSecond /*2131296353*/:
                m.b(z0, "rbWeek selected");
                q2(0);
                break;
            case R.id.btnSixMonthSecond /*2131296357*/:
                m.b(z0, "rbSixMonth selected");
                q2(3);
                break;
            case R.id.btnThreeMonthSecond /*2131296359*/:
                m.b(z0, "rbThreeMonth selected");
                q2(2);
                break;
            case R.id.btnYearSecond /*2131296362*/:
                m.b(z0, "rbYear selected");
                q2(4);
                break;
        }
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(this.i0.u);
        arrayList4.add(this.i0.s);
        arrayList4.add(this.i0.k0);
        arrayList4.add(this.i0.z);
        arrayList4.add(this.i0.x);
        arrayList4.add(this.i0.B);
        arrayList4.add(this.i0.v);
        arrayList4.add(this.i0.t);
        arrayList4.add(this.i0.A);
        arrayList4.add(this.i0.o0);
        arrayList4.add(this.i0.y);
        arrayList4.add(this.i0.m0);
        arrayList4.add(this.i0.C);
        arrayList4.add(this.i0.q0);
        int size = arrayList2.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            iArr[i2] = ((View) arrayList2.get(i2)).getId();
        }
        androidx.constraintlayout.widget.a aVar = new androidx.constraintlayout.widget.a();
        aVar.d(this.i0.E);
        aVar.f(R.id.btnFirst, 3, iArr[size - 1], 4);
        aVar.f(R.id.btnOneWeekSecond, 3, R.id.tvChoose, 4);
        aVar.a(this.i0.E);
        u2(arrayList2, arrayList4, arrayList3);
    }

    public void u2(List<View> list, ArrayList<View> arrayList, List<View> list2) {
        int i = 0;
        while (i < list.size()) {
            View view = list.get(i);
            arrayList.remove(view);
            if (!list2.contains(view)) {
                int i2 = i == 0 ? R.dimen.premium_first_button_margin_top : R.dimen.premium_button_margin_top;
                ConstraintLayout.a aVar = (ConstraintLayout.a) view.getLayoutParams();
                aVar.setMargins(aVar.leftMargin, (int) e0().getDimension(i2), aVar.g, aVar.bottomMargin);
                view.setLayoutParams(aVar);
            }
            i++;
        }
        Iterator<View> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().setVisibility(8);
        }
    }

    public void v2() {
        this.p0 = true;
        this.q0.clear();
        this.q0.add(this.i0.f0);
        this.q0.add(this.i0.c0);
        this.q0.add(this.i0.e0);
        this.q0.add(this.i0.d0);
        this.q0.add(this.i0.g0);
        for (RadioButton onCheckedChangeListener : this.q0) {
            onCheckedChangeListener.setOnCheckedChangeListener(new d(this));
        }
        this.r0.clear();
        this.r0.add(this.i0.v);
        this.r0.add(this.i0.t);
        this.r0.add(this.i0.A);
        this.r0.add(this.i0.y);
        this.r0.add(this.i0.C);
        androidx.constraintlayout.widget.a aVar = new androidx.constraintlayout.widget.a();
        aVar.d(this.i0.E);
        aVar.g(R.id.btnFirst, 3, R.id.btnYearSecond, 4, ((ConstraintLayout.a) this.i0.r.getLayoutParams()).topMargin);
        aVar.a(this.i0.E);
        this.i0.r.setVisibility(0);
        this.i0.w.setBackgroundResource(R.drawable.rect_premium_second_btn);
        this.i0.d1.setGravity(8388611);
        TextView textView = this.i0.d1;
        textView.setText(u.d(this.b0, R.string.premium_terms_and_conditions_text_android, textView.getCurrentTextColor()));
    }

    public void x2() {
        this.p0 = false;
        this.i0.d1.setGravity(17);
        TextView textView = this.i0.d1;
        textView.setText(u.d(this.b0, R.string.premium_terms_and_conditions_text_android, textView.getCurrentTextColor()));
    }

    public void y2(androidx.constraintlayout.widget.a aVar) {
        this.i0.Z0.setTextSize(0, e0().getDimension(R.dimen.tv_restore_purchase_text_size_second));
        TextView textView = this.i0.Z0;
        textView.setTypeface(textView.getTypeface(), 0);
        this.i0.Z0.setTextColor(e0().getColor(R.color.restore_purchase_second));
        androidx.constraintlayout.widget.a aVar2 = aVar;
        aVar2.g(R.id.tvTrialTip, 3, R.id.tvTrialTitle, 4, w.a(this.i0.j1).topMargin);
        aVar2.g(R.id.tvOr, 3, R.id.btnSecond, 4, w.a(this.i0.u0).topMargin * 2);
        aVar2.g(R.id.tvTitle, 3, R.id.tvOr, 4, w.a(this.i0.c1).topMargin);
        aVar.g(R.id.leftGuideLineWhyPremium, 6, R.id.leftGuideLine, 6, 0);
        aVar.g(R.id.leftGuideLineWhyPremium, 7, R.id.tvWhyPremium, 6, 0);
        aVar.g(R.id.ivClose, 6, 0, 6, com.tempmail.utils.x.o(L(), R.dimen.premium_screen_btn_close_side_margin));
        aVar.c(R.id.ivClose, 7);
    }

    public void z2() {
        ConstraintLayout.a a2 = w.a(this.i0.Z0);
        int i = a2.topMargin / 2;
        String str = z0;
        m.b(str, "newRestoreTopMargin " + i);
        a2.topMargin = i;
        this.i0.Z0.setLayoutParams(a2);
        TextView textView = this.i0.d1;
        Context context = this.b0;
        textView.setText(u.e(context, u.c(context), this.i0.d1.getCurrentTextColor()));
        this.i0.d1.setGravity(17);
        this.i0.k1.setVisibility(0);
        this.i0.j1.setVisibility(0);
        this.i0.q.setVisibility(0);
        this.i0.K.setVisibility(8);
        this.i0.X0.setVisibility(8);
    }
}
