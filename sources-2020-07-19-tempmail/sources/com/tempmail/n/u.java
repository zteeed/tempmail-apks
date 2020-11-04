package com.tempmail.n;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.databinding.f;
import com.tempmail.R;
import com.tempmail.m.u0;
import com.tempmail.utils.e;
import java.util.Objects;

/* compiled from: TellWhatThinkDialog */
public class u extends m implements View.OnClickListener {
    u0 o0;

    public static u t2() {
        return new u();
    }

    public void J0(Bundle bundle) {
        super.J0(bundle);
        p2(1, 2131820552);
    }

    public View N0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.o0 = (u0) f.d(layoutInflater, R.layout.fragment_tell_what_think_dialog_new, viewGroup, false);
        ((Window) Objects.requireNonNull(k2().getWindow())).requestFeature(1);
        k2().setCanceledOnTouchOutside(false);
        this.o0.v.setOnClickListener(this);
        this.o0.s.setOnClickListener(this);
        if (e.P()) {
            this.o0.t.setText(com.tempmail.utils.u.a(this.i0, R.string.tell_dialog_question_new, h0(R.string.app_name)));
        } else {
            this.o0.t.setText(h0(R.string.tell_dialog_question));
        }
        return this.o0.n();
    }

    public void onClick(View view) {
        if (view.getId() == R.id.tvNo) {
            s2(h0(R.string.analytics_works_bad));
            u2();
        } else {
            s2(h0(R.string.analytics_works_good));
            v2();
        }
        i2();
    }

    public void u2() {
        try {
            o.t2().r2(this.j0.k0(), o.class.getSimpleName());
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
    }

    public void v2() {
        try {
            r.u2(false).r2(this.j0.k0(), r.class.getSimpleName());
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
    }
}
