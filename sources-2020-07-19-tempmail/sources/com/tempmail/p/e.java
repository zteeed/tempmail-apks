package com.tempmail.p;

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
import com.android.billingclient.api.g;
import com.google.firebase.remoteconfig.f;
import com.tempmail.R;
import com.tempmail.m.i0;
import com.tempmail.n.t;
import com.tempmail.s.i;
import com.tempmail.t.d;
import com.tempmail.utils.m;
import com.tempmail.utils.s;
import com.tempmail.utils.u;
import com.tempmail.utils.z.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PremiumFragment */
public class e extends c implements View.OnClickListener {
    private static final String x0 = e.class.getSimpleName();
    private i0 i0;
    private g j0;
    private g k0;
    private g l0;
    private g m0;
    private g n0;
    private g o0;
    private boolean p0 = false;
    private List<RadioButton> q0 = new ArrayList();
    private List<ConstraintLayout> r0 = new ArrayList();
    private f s0;
    private boolean t0 = false;
    private double u0 = 0.0d;
    private i v0;
    private String w0;

    public static e r2() {
        return new e();
    }

    public static e s2(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("extra_deep_link_ots", str);
        e eVar = new e();
        eVar.O1(bundle);
        return eVar;
    }

    public static e t2(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_ad_screen", z);
        e eVar = new e();
        eVar.O1(bundle);
        return eVar;
    }

    public void A2() {
        String str;
        int i;
        if (this.t0) {
            i = com.tempmail.utils.e.F(this.u0, this.m0, 91.0d);
            str = com.tempmail.utils.e.G(this.m0, 3.0d);
        } else {
            d B = com.tempmail.utils.e.B(this.k0, this.m0, 3.0d);
            int a2 = B.a();
            str = B.b();
            i = a2;
        }
        this.i0.L0.setText(u.a(this.c0, R.string.premium_purchase_format_per_month, str));
        this.i0.m0.setText(u.a(this.c0, R.string.premium_purchase_format_saving, String.valueOf(i)));
        this.i0.n0.setText(u.a(this.c0, R.string.premium_purchase_format_saving_two, String.valueOf(i)));
        this.i0.J0.setText(this.m0.c());
        this.i0.K0.setText(this.m0.c());
    }

    public void B2() {
        this.i0.b1.setMovementMethod(LinkMovementMethod.getInstance());
        TextView textView = this.i0.b1;
        textView.setText(u.c(this.c0, R.string.premium_terms_and_conditions_text_android, textView.getCurrentTextColor()));
    }

    public void C2() {
        String str;
        int i;
        if (this.t0) {
            i = com.tempmail.utils.e.F(this.u0, this.o0, 365.0d);
            str = com.tempmail.utils.e.G(this.o0, 12.0d);
        } else {
            d B = com.tempmail.utils.e.B(this.k0, this.o0, 12.0d);
            int a2 = B.a();
            str = B.b();
            i = a2;
        }
        this.i0.O0.setText(u.a(this.c0, R.string.premium_purchase_format_per_month, str));
        this.i0.o0.setText(u.a(this.c0, R.string.premium_purchase_format_saving, String.valueOf(i)));
        this.i0.p0.setText(u.a(this.c0, R.string.premium_purchase_format_saving_two, String.valueOf(i)));
        this.i0.N0.setText(this.o0.c());
        this.i0.P0.setText(this.o0.c());
    }

    public void D2() {
        Toast.makeText(this.c0, R.string.message_purchase_data_error, 1).show();
        this.e0.t(true);
    }

    public void E0(int i, int i2, Intent intent) {
        super.E0(i, i2, intent);
        if (i == 1 && i2 == -1) {
            this.b0.j1();
        }
    }

    public void E2() {
        if (this.i0.d0.isChecked()) {
            i2(this.j0);
        } else if (this.i0.a0.isChecked()) {
            i2(this.k0);
        } else if (this.i0.c0.isChecked()) {
            i2(this.m0);
        } else if (this.i0.b0.isChecked()) {
            i2(this.n0);
        } else if (this.i0.e0.isChecked()) {
            i2(this.o0);
        }
    }

    public void G0(Context context) {
        super.G0(context);
        if (context instanceof i) {
            this.v0 = (i) context;
        }
    }

    public View N0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.i0 = (i0) androidx.databinding.f.d(layoutInflater, R.layout.fragment_premium, viewGroup, false);
        Bundle D = D();
        if (D != null) {
            D.getBoolean("is_ad_screen", false);
            this.w0 = D.getString("extra_deep_link_ots", (String) null);
        }
        this.i0.t.setOnClickListener(this);
        this.i0.r.setOnClickListener(this);
        this.i0.y.setOnClickListener(this);
        this.i0.w.setOnClickListener(this);
        this.i0.A.setOnClickListener(this);
        this.i0.u.setOnClickListener(this);
        this.i0.s.setOnClickListener(this);
        this.i0.z.setOnClickListener(this);
        this.i0.x.setOnClickListener(this);
        this.i0.B.setOnClickListener(this);
        this.i0.q.setOnClickListener(this);
        this.i0.v.setOnClickListener(this);
        this.i0.X0.setOnClickListener(this);
        this.i0.L.setOnClickListener(this);
        f f2 = f.f();
        this.s0 = f2;
        long h = f2.h(h0(R.string.remote_config_buy_premium_screen_var));
        String str = x0;
        m.b(str, "premiumScreenVariant " + h);
        if (((int) h) == 2) {
            o2();
        } else {
            n2();
        }
        m2();
        w2();
        v2();
        if (this.g0.k() && this.g0.d0().o()) {
            u2();
        }
        return this.i0.n();
    }

    public void O0() {
        super.O0();
        s.h0(this.c0, (String) null);
    }

    public void R0() {
        super.R0();
        this.v0 = null;
    }

    public void f1() {
        super.f1();
        a aVar = this.f0;
        if (aVar != null) {
            aVar.Y(8);
        }
        androidx.appcompat.app.a v02 = this.a0.v0();
        if (v02 != null) {
            v02.l();
        }
    }

    public void i1() {
        super.i1();
        androidx.appcompat.app.a v02 = this.a0.v0();
        if (v02 != null) {
            v02.y();
        }
    }

    public void i2(g gVar) {
        if (gVar != null) {
            String str = x0;
            m.b(str, "skuDetails not null " + gVar.f());
            s.k0(this.c0, true);
            this.g0.v().k(gVar);
            String str2 = this.w0;
            if (str2 != null) {
                s.h0(this.c0, str2);
                return;
            }
            return;
        }
        m.b(x0, "skuDetails null");
        D2();
    }

    public void j2(int i) {
        String str = x0;
        m.b(str, "choose plan " + i);
        if (i == 0) {
            k2(this.i0.u);
            l2(this.i0.d0);
        } else if (i == 1) {
            k2(this.i0.s);
            l2(this.i0.a0);
        } else if (i == 2) {
            k2(this.i0.z);
            l2(this.i0.c0);
        } else if (i == 3) {
            k2(this.i0.x);
            l2(this.i0.b0);
        } else if (i == 4) {
            k2(this.i0.B);
            l2(this.i0.e0);
        }
    }

    public void k2(ConstraintLayout constraintLayout) {
        constraintLayout.setBackgroundResource(R.drawable.rect_blue);
        for (ConstraintLayout next : this.r0) {
            if (next.getId() != constraintLayout.getId()) {
                next.setBackgroundResource(R.drawable.rect_premium_not_selected);
            }
        }
    }

    public void l2(RadioButton radioButton) {
        radioButton.setChecked(true);
        for (RadioButton next : this.q0) {
            if (next.getId() != radioButton.getId()) {
                next.setChecked(false);
            }
        }
    }

    public void m2() {
        List asList = Arrays.asList(this.c0.getResources().getStringArray(R.array.billing_periods));
        String i = this.s0.i(this.c0.getString(R.string.remote_config_payment_var));
        m.b(x0, "paymentVarStr " + i);
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
                m.b(x0, "paymentVarArrayList item " + str);
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
                        arrayList2.add(this.i0.u);
                    } else {
                        arrayList2.add(this.i0.t);
                    }
                } else if (c2 != 1) {
                    if (c2 != 2) {
                        if (c2 != 3) {
                            if (c2 == 4) {
                                if (this.p0) {
                                    arrayList2.add(this.i0.B);
                                } else {
                                    arrayList2.add(this.i0.A);
                                    arrayList2.add(this.i0.o0);
                                    arrayList3.add(this.i0.o0);
                                }
                            }
                        } else if (this.p0) {
                            arrayList2.add(this.i0.x);
                        } else {
                            arrayList2.add(this.i0.w);
                            arrayList2.add(this.i0.k0);
                            arrayList3.add(this.i0.k0);
                        }
                    } else if (this.p0) {
                        arrayList2.add(this.i0.z);
                    } else {
                        arrayList2.add(this.i0.y);
                        arrayList2.add(this.i0.m0);
                        arrayList3.add(this.i0.m0);
                    }
                } else if (this.p0) {
                    arrayList2.add(this.i0.s);
                } else {
                    arrayList2.add(this.i0.r);
                    arrayList2.add(this.i0.i0);
                    arrayList3.add(this.i0.i0);
                }
            }
        } else if (this.p0) {
            arrayList2.add(this.i0.s);
            arrayList2.add(this.i0.x);
            arrayList2.add(this.i0.B);
        } else {
            arrayList2.add(this.i0.r);
            arrayList2.add(this.i0.w);
            arrayList2.add(this.i0.A);
        }
        switch (((View) arrayList2.get(0)).getId()) {
            case R.id.btnOneMonthSecond /*2131296349*/:
                m.b(x0, "rbMonth selected");
                j2(1);
                break;
            case R.id.btnOneWeekSecond /*2131296351*/:
                m.b(x0, "rbWeek selected");
                j2(0);
                break;
            case R.id.btnSixMonthSecond /*2131296355*/:
                m.b(x0, "rbSixMonth selected");
                j2(3);
                break;
            case R.id.btnThreeMonthSecond /*2131296357*/:
                m.b(x0, "rbThreeMonth selected");
                j2(2);
                break;
            case R.id.btnYearSecond /*2131296360*/:
                m.b(x0, "rbYear selected");
                j2(4);
                break;
        }
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(this.i0.t);
        arrayList4.add(this.i0.r);
        arrayList4.add(this.i0.i0);
        arrayList4.add(this.i0.y);
        arrayList4.add(this.i0.w);
        arrayList4.add(this.i0.A);
        arrayList4.add(this.i0.u);
        arrayList4.add(this.i0.s);
        arrayList4.add(this.i0.z);
        arrayList4.add(this.i0.m0);
        arrayList4.add(this.i0.x);
        arrayList4.add(this.i0.k0);
        arrayList4.add(this.i0.B);
        arrayList4.add(this.i0.o0);
        int size = arrayList2.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            iArr[i2] = ((View) arrayList2.get(i2)).getId();
        }
        androidx.constraintlayout.widget.a aVar = new androidx.constraintlayout.widget.a();
        aVar.c(this.i0.D);
        androidx.constraintlayout.widget.a aVar2 = aVar;
        aVar.h(R.id.tvChoose, 4, R.id.btnFirst, 3, iArr, (float[]) null, 1);
        aVar2.e(R.id.btnFirst, 3, iArr[size - 1], 4);
        aVar2.a(this.i0.D);
        int i3 = 0;
        while (i3 < arrayList2.size()) {
            View view = (View) arrayList2.get(i3);
            arrayList4.remove(view);
            if (!arrayList3.contains(view)) {
                int i4 = i3 == 0 ? R.dimen.premium_first_button_margin_top : R.dimen.premium_button_margin_top;
                ConstraintLayout.a aVar3 = (ConstraintLayout.a) view.getLayoutParams();
                aVar3.setMargins(aVar3.leftMargin, (int) a0().getDimension(i4), aVar3.g, aVar3.bottomMargin);
                view.setLayoutParams(aVar3);
            }
            i3++;
        }
        Iterator it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).setVisibility(8);
        }
    }

    public void n2() {
        this.p0 = true;
        this.q0.clear();
        this.q0.add(this.i0.d0);
        this.q0.add(this.i0.a0);
        this.q0.add(this.i0.c0);
        this.q0.add(this.i0.b0);
        this.q0.add(this.i0.e0);
        for (RadioButton onCheckedChangeListener : this.q0) {
            onCheckedChangeListener.setOnCheckedChangeListener(new a(this));
        }
        this.r0.clear();
        this.r0.add(this.i0.u);
        this.r0.add(this.i0.s);
        this.r0.add(this.i0.z);
        this.r0.add(this.i0.x);
        this.r0.add(this.i0.B);
        androidx.constraintlayout.widget.a aVar = new androidx.constraintlayout.widget.a();
        aVar.c(this.i0.D);
        aVar.f(R.id.btnFirst, 3, R.id.btnYearSecond, 4, ((ConstraintLayout.a) this.i0.q.getLayoutParams()).topMargin);
        aVar.a(this.i0.D);
        this.i0.q.setVisibility(0);
        this.i0.v.setBackgroundResource(R.drawable.rect_premium_second_btn);
        this.i0.b1.setGravity(8388611);
    }

    public void o2() {
        this.p0 = false;
        this.i0.b1.setGravity(17);
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.ivClose) {
            this.a0.onBackPressed();
        } else if (id != R.id.tvRestorePurchase) {
            switch (id) {
                case R.id.btnFirst /*2131296347*/:
                    E2();
                    return;
                case R.id.btnOneMonth /*2131296348*/:
                    i2(this.k0);
                    h2(h0(R.string.analytics_premium_price_1m_click));
                    return;
                case R.id.btnOneMonthSecond /*2131296349*/:
                    h2(h0(R.string.analytics_premium_price_1m_click));
                    j2(1);
                    return;
                case R.id.btnOneWeek /*2131296350*/:
                    i2(this.j0);
                    h2(h0(R.string.analytics_premium_price_1w_click));
                    return;
                case R.id.btnOneWeekSecond /*2131296351*/:
                    h2(h0(R.string.analytics_premium_price_1w_click));
                    j2(0);
                    return;
                default:
                    switch (id) {
                        case R.id.btnSecond /*2131296353*/:
                            m.b(x0, "btnSecond");
                            i2(this.l0);
                            h2(h0(R.string.analytics_premium_price_trial_click));
                            return;
                        case R.id.btnSixMonth /*2131296354*/:
                            i2(this.n0);
                            h2(h0(R.string.analytics_premium_price_6m_click));
                            return;
                        case R.id.btnSixMonthSecond /*2131296355*/:
                            h2(h0(R.string.analytics_premium_price_6m_click));
                            j2(3);
                            return;
                        case R.id.btnThreeMonth /*2131296356*/:
                            i2(this.m0);
                            h2(h0(R.string.analytics_premium_price_3m_click));
                            return;
                        case R.id.btnThreeMonthSecond /*2131296357*/:
                            h2(h0(R.string.analytics_premium_price_3m_click));
                            j2(2);
                            return;
                        default:
                            switch (id) {
                                case R.id.btnYear /*2131296359*/:
                                    i2(this.o0);
                                    h2(h0(R.string.analytics_premium_price_12m_click));
                                    return;
                                case R.id.btnYearSecond /*2131296360*/:
                                    h2(h0(R.string.analytics_premium_price_12m_click));
                                    j2(4);
                                    return;
                                default:
                                    return;
                            }
                    }
            }
        } else {
            this.v0.j1();
        }
    }

    public /* synthetic */ void p2(CompoundButton compoundButton, boolean z) {
        m.b(x0, "rb selected");
        if (z) {
            switch (compoundButton.getId()) {
                case R.id.rbThreeMonth /*2131296554*/:
                    m.b(x0, "rbThreeMonth selected");
                    h2(h0(R.string.analytics_premium_price_3m_click));
                    j2(2);
                    return;
                case R.id.rbWeek /*2131296555*/:
                    m.b(x0, "rbWeek selected");
                    h2(h0(R.string.analytics_premium_price_1w_click));
                    j2(0);
                    return;
                case R.id.rb_month /*2131296556*/:
                    m.b(x0, "rbMonth selected");
                    h2(h0(R.string.analytics_premium_price_1m_click));
                    j2(1);
                    return;
                case R.id.rb_six_month /*2131296557*/:
                    m.b(x0, "rbSixMonth selected");
                    h2(h0(R.string.analytics_premium_price_6m_click));
                    j2(3);
                    return;
                case R.id.rb_year /*2131296558*/:
                    m.b(x0, "rbYear selected");
                    h2(h0(R.string.analytics_premium_price_12m_click));
                    j2(4);
                    return;
                default:
                    return;
            }
        }
    }

    public /* synthetic */ void q2() {
        Integer valueOf = Integer.valueOf(this.i0.N0.getMeasuredWidth());
        Integer valueOf2 = Integer.valueOf(this.i0.G0.getMeasuredWidth());
        Integer valueOf3 = Integer.valueOf(this.i0.J0.getMeasuredWidth());
        Integer valueOf4 = Integer.valueOf(this.i0.D0.getMeasuredWidth());
        Integer valueOf5 = Integer.valueOf(this.i0.F0.getMeasuredWidth());
        ArrayList arrayList = new ArrayList();
        arrayList.add(valueOf);
        arrayList.add(valueOf2);
        arrayList.add(valueOf3);
        arrayList.add(valueOf4);
        arrayList.add(valueOf5);
        int intValue = ((Integer) Collections.max(arrayList)).intValue();
        String str = x0;
        m.b(str, "priceYearWidth " + valueOf + " priceSixMonthWidth " + valueOf2);
        this.i0.F0.setWidth(intValue);
        this.i0.D0.setWidth(intValue);
        this.i0.J0.setWidth(intValue);
        this.i0.G0.setWidth(intValue);
        this.i0.N0.setWidth(intValue);
    }

    public void u2() {
        t u2 = t.u2(h0(R.string.menu_restore_purchases), h0(R.string.message_button_cancel), h0(R.string.menu_restore_purchases), h0(R.string.already_subscribed));
        u2.Z1(this, 1);
        u2.r2(this.a0.k0(), "Restore propose");
    }

    public void v2() {
        B2();
        this.j0 = s.D(this.c0);
        this.l0 = s.C(this.c0);
        this.k0 = s.B(this.c0);
        this.m0 = s.N(this.c0);
        this.n0 = s.M(this.c0);
        this.o0 = s.Q(this.c0);
        if (s.x(this.c0)) {
            this.i0.v.setVisibility(8);
            this.i0.Z.setVisibility(8);
            this.i0.i1.setVisibility(8);
            this.i0.h1.setVisibility(8);
        }
        g gVar = this.j0;
        if (gVar != null) {
            this.i0.F0.setText(gVar.c());
            this.u0 = (((double) this.j0.d()) / 1000000.0d) / 7.0d;
            this.i0.M0.setText(this.j0.c());
        }
        if (this.k0 != null) {
            x2();
        }
        if (this.l0 != null) {
            this.i0.g0.setText(u.a(H(), R.string.premium_billed, this.l0.c()));
            this.i0.i1.setText(u.b(H(), R.string.premium_billed, String.valueOf(com.tempmail.utils.e.M(this.l0)), this.l0.c()));
            this.i0.h1.setText(u.a(H(), R.string.premium_trial_charge, this.l0.c()));
        } else {
            this.i0.g0.setText(u.a(H(), R.string.premium_billed, "..."));
            this.i0.i1.setText(u.b(H(), R.string.premium_billed, "...", "..."));
            this.i0.h1.setText(u.a(H(), R.string.premium_trial_charge, "..."));
        }
        if (!(this.m0 == null || this.u0 == 0.0d)) {
            A2();
        }
        if (!(this.n0 == null || this.u0 == 0.0d)) {
            z2();
        }
        if (!(this.o0 == null || this.u0 == 0.0d)) {
            C2();
        }
        y2();
    }

    public void w2() {
        TextView textView = this.i0.k0;
        Context context = this.c0;
        textView.setText(u.a(context, R.string.premium_purchase_format_saving, context.getString(R.string.default_premium_values)));
        TextView textView2 = this.i0.l0;
        Context context2 = this.c0;
        textView2.setText(u.a(context2, R.string.premium_purchase_format_saving, context2.getString(R.string.default_premium_values)));
        TextView textView3 = this.i0.o0;
        Context context3 = this.c0;
        textView3.setText(u.a(context3, R.string.premium_purchase_format_saving, context3.getString(R.string.default_premium_values)));
        TextView textView4 = this.i0.p0;
        Context context4 = this.c0;
        textView4.setText(u.a(context4, R.string.premium_purchase_format_saving, context4.getString(R.string.default_premium_values)));
        TextView textView5 = this.i0.g0;
        Context context5 = this.c0;
        textView5.setText(u.a(context5, R.string.premium_billed, context5.getString(R.string.default_premium_values)));
    }

    public void x2() {
        this.i0.g0.setText(u.a(this.c0, R.string.premium_billed, this.k0.c()));
        this.i0.D0.setText(this.k0.c());
        this.i0.E0.setText(this.k0.c());
        if (this.t0) {
            int F = com.tempmail.utils.e.F(this.u0, this.k0, 30.0d);
            this.i0.i0.setText(u.a(this.c0, R.string.premium_purchase_format_saving, String.valueOf(F)));
            this.i0.j0.setText(u.a(this.c0, R.string.premium_purchase_format_saving_two, String.valueOf(F)));
            return;
        }
        this.i0.M.setVisibility(8);
        this.i0.i0.setVisibility(8);
        this.i0.j0.setVisibility(8);
    }

    public void y2() {
        new Handler().post(new b(this));
    }

    public void z2() {
        String str;
        int i;
        if (this.t0) {
            i = com.tempmail.utils.e.F(this.u0, this.n0, 182.0d);
            str = com.tempmail.utils.e.G(this.n0, 6.0d);
        } else {
            d B = com.tempmail.utils.e.B(this.k0, this.n0, 6.0d);
            int a2 = B.a();
            str = B.b();
            i = a2;
        }
        this.i0.I0.setText(u.a(this.c0, R.string.premium_purchase_format_per_month, str));
        this.i0.k0.setText(u.a(this.c0, R.string.premium_purchase_format_saving, String.valueOf(i)));
        this.i0.l0.setText(u.a(this.c0, R.string.premium_purchase_format_saving_two, String.valueOf(i)));
        this.i0.G0.setText(this.n0.c());
        this.i0.H0.setText(this.n0.c());
    }
}
