package com.tempmail.o;

import android.content.Intent;
import android.os.Build;
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
import com.tempmail.n.q0;
import com.tempmail.utils.i;
import com.tempmail.utils.m;

/* compiled from: RewardedAdDialog */
public class r extends k implements View.OnClickListener {
    private static final String D0 = r.class.getSimpleName();
    q0 C0;

    public static r R2(e eVar, String str, String str2, boolean z) {
        Bundle E2 = k.E2(eVar, str, str2, z);
        r rVar = new r();
        rVar.V1(E2);
        return rVar;
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

    public void M0(Bundle bundle) {
        super.M0(bundle);
        v2(1, R.style.RewardedDialog);
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
        this.C0 = (q0) f.d(layoutInflater, R.layout.fragment_rewarded_ad_dialog, viewGroup, false);
        super.Q0(layoutInflater, viewGroup, bundle);
        if (!this.q0) {
            T2();
        }
        I2();
        if (!this.r0) {
            m.b(D0, "without gap");
            if (Build.VERSION.SDK_INT >= 16) {
                this.C0.r.setBackground(e0().getDrawable(R.drawable.rect_white_rounded_borders));
            } else {
                this.C0.r.setBackgroundDrawable(e0().getDrawable(R.drawable.rect_white_rounded_borders));
            }
            if (this.s0) {
                this.C0.t.setVisibility(0);
            }
        } else {
            m.b(D0, "with gap");
        }
        if (TextUtils.isEmpty(this.u0)) {
            this.C0.x.setVisibility(8);
        } else {
            this.C0.x.setText(this.u0);
        }
        this.C0.B.setText(this.t0);
        this.C0.z.setOnClickListener(this);
        this.C0.y.setOnClickListener(this);
        this.C0.C.setOnClickListener(this);
        this.C0.D.setOnClickListener(this);
        if (i.e(L())) {
            this.C0.A.setVisibility(0);
        }
        this.C0.A.setOnClickListener(this);
        return this.C0.n();
    }

    public void S2(Intent intent) {
        if (m0() != null) {
            m0().H0(n0(), 0, intent);
            return;
        }
        com.tempmail.utils.z.f fVar = this.v0;
        if (fVar != null) {
            fVar.b(0);
            this.v0 = null;
        }
    }

    public void T2() {
        this.C0.v.setVisibility(0);
        this.C0.u.setVisibility(8);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tvNo /*2131296709*/:
            case R.id.tvNoVertical /*2131296712*/:
                D2();
                Intent intent = new Intent();
                intent.putExtra("extra_next_screen", "Premium");
                S2(intent);
                o2();
                return;
            case R.id.tvRemoveAds /*2131296751*/:
                D2();
                Intent intent2 = new Intent();
                intent2.putExtra("extra_next_screen", "RemoveAd");
                S2(intent2);
                o2();
                return;
            case R.id.tvYes /*2131296778*/:
            case R.id.tvYesVertical /*2131296779*/:
                D2();
                if (m0() != null) {
                    m0().H0(n0(), -1, (Intent) null);
                } else {
                    com.tempmail.utils.z.f fVar = this.v0;
                    if (fVar != null) {
                        fVar.a(0);
                        this.v0 = null;
                    }
                }
                o2();
                return;
            default:
                return;
        }
    }
}
