package com.tempmail.onboarding;

import android.os.Bundle;
import android.view.View;
import androidx.databinding.f;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.k;
import androidx.fragment.app.n;
import androidx.viewpager.widget.ViewPager;
import com.tempmail.R;
import com.tempmail.n.e;
import com.tempmail.utils.m;
import com.tempmail.utils.z.j;

public class SecondOnBoardingActivity extends c implements j, View.OnClickListener {
    /* access modifiers changed from: private */
    public static final String c0 = SecondOnBoardingActivity.class.getSimpleName();
    e b0;

    class a implements ViewPager.j {
        a() {
        }

        public void a(int i, float f2, int i2) {
        }

        public void c(int i) {
        }

        public void d(int i) {
            String K1 = SecondOnBoardingActivity.c0;
            m.b(K1, "onPageSelected, position = " + i);
            if (i == 0) {
                SecondOnBoardingActivity.this.O1();
                SecondOnBoardingActivity secondOnBoardingActivity = SecondOnBoardingActivity.this;
                secondOnBoardingActivity.setSelectedDot(secondOnBoardingActivity.b0.v);
                SecondOnBoardingActivity.this.P1();
            } else if (i == 1) {
                SecondOnBoardingActivity.this.O1();
                SecondOnBoardingActivity secondOnBoardingActivity2 = SecondOnBoardingActivity.this;
                secondOnBoardingActivity2.setSelectedDot(secondOnBoardingActivity2.b0.x);
                SecondOnBoardingActivity.this.P1();
            } else if (i == 2) {
                SecondOnBoardingActivity.this.O1();
                SecondOnBoardingActivity secondOnBoardingActivity3 = SecondOnBoardingActivity.this;
                secondOnBoardingActivity3.setSelectedDot(secondOnBoardingActivity3.b0.w);
                SecondOnBoardingActivity.this.P1();
            } else {
                SecondOnBoardingActivity.this.b0.A.setVisibility(0);
                SecondOnBoardingActivity secondOnBoardingActivity4 = SecondOnBoardingActivity.this;
                secondOnBoardingActivity4.b0.A.setOnClickListener(secondOnBoardingActivity4);
                SecondOnBoardingActivity.this.b0.y.setVisibility(8);
                SecondOnBoardingActivity.this.L1();
                SecondOnBoardingActivity secondOnBoardingActivity5 = SecondOnBoardingActivity.this;
                secondOnBoardingActivity5.setSelectedDot(secondOnBoardingActivity5.b0.u);
            }
        }
    }

    private class b extends n {
        public b(k kVar) {
            super(kVar);
        }

        public int e() {
            return 4;
        }

        public Fragment u(int i) {
            if (i == 0) {
                return e.n2();
            }
            if (i == 1) {
                return g.n2();
            }
            if (i == 2) {
                return f.n2();
            }
            return d.o2();
        }
    }

    public void L1() {
        this.b0.r.setVisibility(4);
    }

    public /* synthetic */ void M1() {
        F1(this.b0.s, 0.6f);
    }

    public void N1() {
        ViewPager viewPager = this.b0.z;
        viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
    }

    public void O1() {
        this.b0.A.setVisibility(4);
        this.b0.A.setOnClickListener((View.OnClickListener) null);
        this.b0.y.setVisibility(0);
    }

    public void P1() {
        this.b0.r.setVisibility(0);
    }

    public void h1() {
        super.h1();
        G1(this.b0.B);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnNext /*2131296349*/:
                D1();
                return;
            case R.id.ivSkip /*2131296492*/:
            case R.id.tvSkip /*2131296756*/:
                N1();
                return;
            case R.id.tvCancel /*2131296680*/:
                J1();
                return;
            case R.id.tvRestorePurchase /*2131296752*/:
                w1();
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.b0 = (e) f.f(this, R.layout.activity_second_on_boarding);
        b bVar = new b(k0());
        this.X = bVar;
        this.b0.z.setAdapter(bVar);
        this.V.add(this.b0.v);
        this.V.add(this.b0.x);
        this.V.add(this.b0.w);
        this.V.add(this.b0.u);
        this.b0.v.setSelected(true);
        this.b0.C.setOnClickListener(this);
        this.b0.y.setOnClickListener(this);
        G1(this.b0.B);
        this.b0.z.c(new a());
        this.b0.q.setOnClickListener(this);
        H1(this.b0.E);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.B.post(new a(this));
    }
}
