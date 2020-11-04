package com.tempmail.n;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.RatingBar;
import androidx.databinding.f;
import com.tempmail.R;
import com.tempmail.m.m0;
import com.tempmail.utils.s;
import com.tempmail.utils.w;
import java.util.Objects;

/* compiled from: RatingDialog */
public class r extends m implements View.OnClickListener {
    float o0 = 0.0f;
    boolean p0 = false;
    int q0 = 3;
    m0 r0;

    public static r u2(boolean z) {
        r rVar = new r();
        Bundle bundle = new Bundle();
        bundle.putBoolean("isFromMenu", z);
        rVar.O1(bundle);
        return rVar;
    }

    public void J0(Bundle bundle) {
        super.J0(bundle);
        p2(1, 2131820552);
        Bundle D = D();
        if (D != null) {
            this.p0 = D.getBoolean("isFromMenu");
        }
    }

    public View N0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ((Window) Objects.requireNonNull(k2().getWindow())).requestFeature(1);
        k2().setCanceledOnTouchOutside(this.p0);
        m0 m0Var = (m0) f.d(layoutInflater, R.layout.fragment_rating_dialog_new, viewGroup, false);
        this.r0 = m0Var;
        m0Var.s.setOnRatingBarChangeListener(new j(this));
        this.r0.t.setOnClickListener(this);
        this.r0.w.setOnClickListener(this);
        this.q0 = (int) com.google.firebase.remoteconfig.f.f().h(h0(R.string.remote_config_rating_flow_limit));
        return this.r0.n();
    }

    @SuppressLint({"CommitPrefEdits"})
    public void onClick(View view) {
        if (view.getId() == R.id.tvYes) {
            if (this.o0 <= 3.0f) {
                s2(h0(R.string.analytics_stars_bad));
                try {
                    o.t2().r2(this.j0.k0(), "improve");
                } catch (IllegalStateException e2) {
                    e2.printStackTrace();
                }
            } else {
                s2(h0(R.string.analytics_stars_good));
                s.a0(this.i0, false);
                w.o(this.i0);
            }
        } else if (!this.p0) {
            int K = s.K(this.i0) + 1;
            s.n0(this.i0, K);
            if (K >= this.q0) {
                s.a0(this.i0, false);
            }
        }
        i2();
    }

    public /* synthetic */ void t2(RatingBar ratingBar, float f2, boolean z) {
        this.o0 = f2;
    }
}
