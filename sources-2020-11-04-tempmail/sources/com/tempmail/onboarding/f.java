package com.tempmail.onboarding;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.tempmail.R;

/* compiled from: SecondOnBoardingFragmentThree */
public class f extends Fragment {
    SecondOnBoardingActivity Y;

    public static f n2() {
        return new f();
    }

    public void J0(Context context) {
        super.J0(context);
        if (context instanceof SecondOnBoardingActivity) {
            this.Y = (SecondOnBoardingActivity) context;
        }
    }

    public View Q0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_second_on_boarding_three, viewGroup, false);
    }

    public void U0() {
        super.U0();
    }
}
