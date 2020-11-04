package com.tempmail.o;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.databinding.f;
import com.tempmail.R;
import com.tempmail.n.e1;
import com.tempmail.utils.e;
import com.tempmail.utils.u;
import java.util.Objects;

/* compiled from: TellWhatThinkDialog */
public class t extends l implements View.OnClickListener {
    e1 p0;

    public static t z2() {
        return new t();
    }

    public void A2() {
        try {
            n.z2().x2(this.m0.k0(), n.class.getSimpleName());
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
    }

    public void B2() {
        try {
            q.A2(false).x2(this.m0.k0(), q.class.getSimpleName());
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
    }

    public void M0(Bundle bundle) {
        super.M0(bundle);
        v2(1, 2131820552);
    }

    public View Q0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.p0 = (e1) f.d(layoutInflater, R.layout.fragment_tell_what_think_dialog_new, viewGroup, false);
        ((Window) Objects.requireNonNull(q2().getWindow())).requestFeature(1);
        q2().setCanceledOnTouchOutside(false);
        this.p0.v.setOnClickListener(this);
        this.p0.s.setOnClickListener(this);
        if (e.Q()) {
            this.p0.t.setText(u.a(this.l0, R.string.tell_dialog_question_new, k0(R.string.app_name)));
        } else {
            this.p0.t.setText(k0(R.string.tell_dialog_question));
        }
        return this.p0.n();
    }

    public void onClick(View view) {
        if (view.getId() == R.id.tvNo) {
            y2(k0(R.string.analytics_works_bad));
            A2();
        } else {
            y2(k0(R.string.analytics_works_good));
            B2();
        }
        o2();
    }
}
