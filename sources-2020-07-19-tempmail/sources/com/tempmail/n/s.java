package com.tempmail.n;

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
import com.tempmail.m.o0;
import com.tempmail.utils.b;
import com.tempmail.utils.i;
import com.tempmail.utils.m;

/* compiled from: RewardedAdDialog */
public class s extends l implements View.OnClickListener {
    private static final String C0 = s.class.getSimpleName();
    o0 B0;

    public static s N2(e eVar, String str, String str2, boolean z) {
        Bundle y2 = l.y2(eVar, str, str2, z);
        s sVar = new s();
        sVar.O1(y2);
        return sVar;
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

    public void J0(Bundle bundle) {
        super.J0(bundle);
        p2(1, R.style.RewardedDialog);
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
        this.B0 = (o0) f.d(layoutInflater, R.layout.fragment_rewarded_ad_dialog, viewGroup, false);
        if (!this.p0) {
            P2();
        }
        D2();
        if (!this.q0) {
            m.b(C0, "without gap");
            if (Build.VERSION.SDK_INT >= 16) {
                this.B0.r.setBackground(a0().getDrawable(R.drawable.rect_white_rounded_borders));
            } else {
                this.B0.r.setBackgroundDrawable(a0().getDrawable(R.drawable.rect_white_rounded_borders));
            }
            if (this.r0) {
                this.B0.t.setVisibility(0);
            }
        } else {
            m.b(C0, "with gap");
        }
        if (TextUtils.isEmpty(this.u0)) {
            this.B0.x.setVisibility(8);
        } else {
            this.B0.x.setText(this.u0);
        }
        this.B0.B.setText(this.t0);
        this.B0.z.setOnClickListener(this);
        this.B0.y.setOnClickListener(this);
        this.B0.C.setOnClickListener(this);
        this.B0.D.setOnClickListener(this);
        if (i.d(H())) {
            this.B0.A.setVisibility(0);
        }
        this.B0.A.setOnClickListener(this);
        if (b.i(H())) {
            L2(true);
        }
        return this.B0.n();
    }

    public void O2(Intent intent) {
        if (j0() != null) {
            j0().E0(k0(), 0, intent);
            return;
        }
        com.tempmail.utils.z.f fVar = this.v0;
        if (fVar != null) {
            fVar.b(0);
            this.v0 = null;
        }
    }

    public void P2() {
        this.B0.v.setVisibility(0);
        this.B0.u.setVisibility(8);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tvNo /*2131296692*/:
            case R.id.tvNoVertical /*2131296695*/:
                x2();
                Intent intent = new Intent();
                intent.putExtra("extra_next_screen", "Premium");
                O2(intent);
                i2();
                return;
            case R.id.tvRemoveAds /*2131296733*/:
                x2();
                Intent intent2 = new Intent();
                intent2.putExtra("extra_next_screen", "RemoveAd");
                O2(intent2);
                i2();
                return;
            case R.id.tvYes /*2131296759*/:
            case R.id.tvYesVertical /*2131296760*/:
                x2();
                if (j0() != null) {
                    j0().E0(k0(), -1, (Intent) null);
                } else {
                    com.tempmail.utils.z.f fVar = this.v0;
                    if (fVar != null) {
                        fVar.a(0);
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
