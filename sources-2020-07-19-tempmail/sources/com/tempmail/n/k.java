package com.tempmail.n;

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
import com.tempmail.m.s;
import com.tempmail.utils.b;
import com.tempmail.utils.m;

/* compiled from: AdDialog */
public class k extends l implements View.OnClickListener {
    private static final String C0 = k.class.getSimpleName();
    s B0;

    public static k N2(e eVar, String str, String str2, boolean z) {
        int i = b.i(eVar) ? 2 : 0;
        String str3 = C0;
        m.b(str3, "banner size " + i);
        return O2(str, str2, false, false, true, false, 17, z);
    }

    public static k O2(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i, boolean z5) {
        Bundle z22 = l.z2(str, str2, z, z2, z3, z4, i, z5);
        k kVar = new k();
        kVar.O1(z22);
        return kVar;
    }

    public int A2() {
        return this.B0.q.getMeasuredWidth();
    }

    public void B2() {
        this.B0.s.q.setVisibility(8);
    }

    public void H2() {
        this.B0.s.q.removeAllViews();
    }

    public void K2() {
        this.B0.s.q.setVisibility(0);
    }

    public void L2(boolean z) {
        if (z) {
            this.B0.w.setVisibility(0);
            this.w0 = this.B0.t.getVisibility();
            this.B0.t.setVisibility(8);
            this.B0.q.setVisibility(4);
            this.B0.s.q.setVisibility(8);
            return;
        }
        this.B0.w.setVisibility(8);
        this.B0.t.setVisibility(this.w0);
        this.B0.q.setVisibility(0);
    }

    public View N0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        m.b(C0, "onCreateView");
        this.B0 = (s) f.d(layoutInflater, R.layout.fragment_ad_dialog, viewGroup, false);
        if (!this.p0) {
            P2();
        }
        D2();
        if (!this.q0) {
            m.b(C0, "without gap");
            this.B0.r.setBackground(a0().getDrawable(R.drawable.rect_white_rounded_borders));
            if (this.r0) {
                this.B0.t.setVisibility(0);
            }
        }
        if (TextUtils.isEmpty(this.u0)) {
            this.B0.x.setVisibility(8);
        } else {
            this.B0.x.setText(this.u0);
        }
        this.B0.A.setText(this.t0);
        this.B0.z.setOnClickListener(this);
        this.B0.y.setOnClickListener(this);
        this.B0.B.setOnClickListener(this);
        this.B0.C.setOnClickListener(this);
        if (b.i(H())) {
            L2(true);
        }
        return this.B0.n();
    }

    public void P2() {
        this.B0.v.setVisibility(0);
        this.B0.u.setVisibility(8);
    }

    public Dialog m2(Bundle bundle) {
        return super.m2(bundle);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tvNo /*2131296692*/:
            case R.id.tvNoVertical /*2131296695*/:
                s2(h0(R.string.analytics_are_you_sure_no));
                x2();
                if (j0() != null) {
                    j0().E0(k0(), 0, (Intent) null);
                } else {
                    com.tempmail.utils.z.f fVar = this.v0;
                    if (fVar != null) {
                        fVar.b(0);
                        this.v0 = null;
                    }
                }
                i2();
                return;
            case R.id.tvYes /*2131296759*/:
            case R.id.tvYesVertical /*2131296760*/:
                s2(h0(R.string.analytics_are_you_sure_yes));
                x2();
                if (j0() != null) {
                    j0().E0(k0(), -1, (Intent) null);
                } else {
                    com.tempmail.utils.z.f fVar2 = this.v0;
                    if (fVar2 != null) {
                        fVar2.a(0);
                        this.v0 = null;
                    }
                }
                i2();
                return;
            default:
                return;
        }
    }

    public void v2(AdView adView) {
        if (this.B0.s.q.getChildCount() < 2) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 17;
            this.B0.s.q.addView(adView, 1, layoutParams);
        }
    }
}
