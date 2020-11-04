package com.tempmail.o;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.RatingBar;
import androidx.databinding.f;
import com.tempmail.R;
import com.tempmail.n.o0;
import com.tempmail.utils.s;
import com.tempmail.utils.x;
import java.util.Objects;

/* compiled from: RatingDialog */
public class q extends l implements View.OnClickListener {
    float p0 = 0.0f;
    boolean q0 = false;
    int r0 = 3;
    o0 s0;

    public static q A2(boolean z) {
        q qVar = new q();
        Bundle bundle = new Bundle();
        bundle.putBoolean("isFromMenu", z);
        qVar.V1(bundle);
        return qVar;
    }

    public void M0(Bundle bundle) {
        super.M0(bundle);
        v2(1, 2131820552);
        Bundle J = J();
        if (J != null) {
            this.q0 = J.getBoolean("isFromMenu");
        }
    }

    public View Q0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ((Window) Objects.requireNonNull(q2().getWindow())).requestFeature(1);
        q2().setCanceledOnTouchOutside(this.q0);
        o0 o0Var = (o0) f.d(layoutInflater, R.layout.fragment_rating_dialog_new, viewGroup, false);
        this.s0 = o0Var;
        o0Var.s.setOnRatingBarChangeListener(new i(this));
        this.s0.t.setOnClickListener(this);
        this.s0.w.setOnClickListener(this);
        this.r0 = (int) com.google.firebase.remoteconfig.f.f().h(k0(R.string.remote_config_rating_flow_limit));
        return this.s0.n();
    }

    @SuppressLint({"CommitPrefEdits"})
    public void onClick(View view) {
        if (view.getId() == R.id.tvYes) {
            if (this.p0 <= 3.0f) {
                y2(k0(R.string.analytics_stars_bad));
                try {
                    n.z2().x2(this.m0.k0(), "improve");
                } catch (IllegalStateException e2) {
                    e2.printStackTrace();
                }
            } else {
                y2(k0(R.string.analytics_stars_good));
                s.c0(this.l0, false);
                x.q(this.l0);
            }
        } else if (!this.q0) {
            int K = s.K(this.l0) + 1;
            s.p0(this.l0, K);
            if (K >= this.r0) {
                s.c0(this.l0, false);
            }
        }
        o2();
    }

    public /* synthetic */ void z2(RatingBar ratingBar, float f2, boolean z) {
        this.p0 = f2;
    }
}
