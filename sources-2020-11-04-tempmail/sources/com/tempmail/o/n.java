package com.tempmail.o;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.firebase.remoteconfig.f;
import com.tempmail.R;
import com.tempmail.n.e0;
import com.tempmail.utils.s;
import com.tempmail.utils.x;
import com.tempmail.utils.z.a;
import java.util.Objects;

/* compiled from: HelpImproveDialog */
public class n extends l implements View.OnClickListener {
    f p0;
    int q0 = 3;
    e0 r0;

    static {
        Class<n> cls = n.class;
    }

    public static n z2() {
        return new n();
    }

    public void M0(Bundle bundle) {
        super.M0(bundle);
        v2(1, 2131820552);
    }

    public View Q0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ((Window) Objects.requireNonNull(q2().getWindow())).requestFeature(1);
        q2().setCanceledOnTouchOutside(false);
        e0 e0Var = (e0) androidx.databinding.f.d(layoutInflater, R.layout.fragment_help_improve_dialog_new, viewGroup, false);
        this.r0 = e0Var;
        e0Var.v.setOnClickListener(this);
        this.r0.s.setOnClickListener(this);
        f f2 = f.f();
        this.p0 = f2;
        this.q0 = (int) f2.h(k0(R.string.remote_config_rating_flow_limit));
        return this.r0.n();
    }

    @SuppressLint({"CommitPrefEdits"})
    public void onClick(View view) {
        if (view.getId() == R.id.tvNo) {
            int K = s.K(this.l0) + 1;
            s.p0(this.l0, K);
            if (K >= this.q0) {
                s.c0(this.l0, false);
            }
        } else {
            s.c0(this.l0, false);
            a aVar = this.n0;
            x.E(this.l0, k0(R.string.support_email), aVar != null ? aVar.t() : "");
        }
        o2();
    }
}
