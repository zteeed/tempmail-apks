package com.tempmail.o;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.app.e;
import androidx.databinding.f;
import com.google.android.gms.ads.AdView;
import com.tempmail.R;
import com.tempmail.n.u;
import com.tempmail.utils.b;
import com.tempmail.utils.m;

/* compiled from: AdDialog */
public class j extends k implements View.OnClickListener {
    private static final String D0 = j.class.getSimpleName();
    u C0;

    public static j R2(e eVar, String str, String str2, boolean z) {
        int i = b.i(eVar) ? 2 : 0;
        String str3 = D0;
        m.b(str3, "banner size " + i);
        return S2(str, str2, false, false, true, false, 17, z);
    }

    public static j S2(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i, boolean z5) {
        Bundle F2 = k.F2(str, str2, z, z2, z3, z4, i, z5);
        j jVar = new j();
        jVar.V1(F2);
        return jVar;
    }

    public void B2(AdView adView) {
        if (this.C0.s.q.getChildCount() < 2) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 17;
            this.C0.s.q.addView(adView, 1, layoutParams);
        }
    }

    public void G2() {
        this.C0.s.q.setVisibility(8);
    }

    public void L2() {
        this.C0.s.q.removeAllViews();
    }

    public void O2() {
        this.C0.s.q.setVisibility(0);
    }

    public void P2(boolean z) {
        if (z) {
            this.C0.w.setVisibility(0);
            this.w0 = this.C0.t.getVisibility();
            this.C0.t.setVisibility(8);
            this.C0.q.setVisibility(4);
            this.C0.s.q.setVisibility(8);
            return;
        }
        this.C0.w.setVisibility(8);
        this.C0.t.setVisibility(this.w0);
        this.C0.q.setVisibility(0);
    }

    public View Q0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        m.b(D0, "onCreateView");
        this.C0 = (u) f.d(layoutInflater, R.layout.fragment_ad_dialog, viewGroup, false);
        super.Q0(layoutInflater, viewGroup, bundle);
        if (!this.q0) {
            T2();
        }
        I2();
        if (!this.r0) {
            m.b(D0, "without gap");
            this.C0.r.setBackground(e0().getDrawable(R.drawable.rect_white_rounded_borders));
            if (this.s0) {
                this.C0.t.setVisibility(0);
            }
        }
        if (TextUtils.isEmpty(this.u0)) {
            this.C0.x.setVisibility(8);
        } else {
            this.C0.x.setText(this.u0);
        }
        this.C0.A.setText(this.t0);
        this.C0.z.setOnClickListener(this);
        this.C0.y.setOnClickListener(this);
        this.C0.B.setOnClickListener(this);
        this.C0.C.setOnClickListener(this);
        return this.C0.n();
    }

    public void T2() {
        this.C0.v.setVisibility(0);
        this.C0.u.setVisibility(8);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tvNo /*2131296709*/:
            case R.id.tvNoVertical /*2131296712*/:
                y2(k0(R.string.analytics_are_you_sure_no));
                D2();
                if (m0() != null) {
                    m0().H0(n0(), 0, (Intent) null);
                } else {
                    com.tempmail.utils.z.f fVar = this.v0;
                    if (fVar != null) {
                        fVar.b(0);
                        this.v0 = null;
                    }
                }
                o2();
                return;
            case R.id.tvYes /*2131296778*/:
            case R.id.tvYesVertical /*2131296779*/:
                y2(k0(R.string.analytics_are_you_sure_yes));
                D2();
                if (m0() != null) {
                    m0().H0(n0(), -1, (Intent) null);
                } else {
                    com.tempmail.utils.z.f fVar2 = this.v0;
                    if (fVar2 != null) {
                        fVar2.a(0);
                        this.v0 = null;
                    }
                }
                o2();
                return;
            default:
                return;
        }
    }

    public Dialog s2(Bundle bundle) {
        return super.s2(bundle);
    }
}
