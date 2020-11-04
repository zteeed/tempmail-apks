package com.tempmail.n;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.firebase.remoteconfig.f;
import com.tempmail.R;
import com.tempmail.m.c0;
import com.tempmail.utils.s;
import com.tempmail.utils.w;
import com.tempmail.utils.z.a;
import java.util.Objects;

/* compiled from: HelpImproveDialog */
public class o extends m implements View.OnClickListener {
    f o0;
    int p0 = 3;
    c0 q0;

    static {
        Class<o> cls = o.class;
    }

    public static o t2() {
        return new o();
    }

    public void J0(Bundle bundle) {
        super.J0(bundle);
        p2(1, 2131820552);
    }

    public View N0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ((Window) Objects.requireNonNull(k2().getWindow())).requestFeature(1);
        k2().setCanceledOnTouchOutside(false);
        c0 c0Var = (c0) androidx.databinding.f.d(layoutInflater, R.layout.fragment_help_improve_dialog_new, viewGroup, false);
        this.q0 = c0Var;
        c0Var.v.setOnClickListener(this);
        this.q0.s.setOnClickListener(this);
        f f2 = f.f();
        this.o0 = f2;
        this.p0 = (int) f2.h(h0(R.string.remote_config_rating_flow_limit));
        return this.q0.n();
    }

    @SuppressLint({"CommitPrefEdits"})
    public void onClick(View view) {
        if (view.getId() == R.id.tvNo) {
            int K = s.K(this.i0) + 1;
            s.n0(this.i0, K);
            if (K >= this.p0) {
                s.a0(this.i0, false);
            }
        } else {
            s.a0(this.i0, false);
            a aVar = this.m0;
            w.C(this.i0, h0(R.string.support_email), aVar != null ? aVar.u() : "");
        }
        i2();
    }
}
