package com.tempmail.onboarding;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.f;
import androidx.fragment.app.Fragment;
import com.android.billingclient.api.n;
import com.tempmail.R;
import com.tempmail.n.s0;
import com.tempmail.utils.e;
import com.tempmail.utils.s;
import com.tempmail.utils.u;

/* compiled from: SecondOnBoardingFragmentFour */
public class d extends Fragment {
    SecondOnBoardingActivity Y;

    public static d o2() {
        return new d();
    }

    public void J0(Context context) {
        super.J0(context);
        if (context instanceof SecondOnBoardingActivity) {
            this.Y = (SecondOnBoardingActivity) context;
        }
    }

    public View Q0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        s0 s0Var = (s0) f.d(layoutInflater, R.layout.fragment_second_on_boarding_four, viewGroup, false);
        s0Var.q.setOnClickListener(new b(this));
        p2(s0Var.t);
        return s0Var.n();
    }

    public void U0() {
        super.U0();
        this.Y = null;
    }

    public /* synthetic */ void n2(View view) {
        this.Y.J1();
    }

    public void p2(TextView textView) {
        n D = s.D(L());
        if (D != null) {
            textView.setText(u.a(L(), R.string.second_onboarding_page_4_title, String.valueOf(e.N(D))));
        } else {
            textView.setText(u.a(L(), R.string.second_onboarding_page_4_title, "..."));
        }
    }
}
