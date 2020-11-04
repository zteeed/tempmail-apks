package com.tempmail.onboarding;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.q;
import com.android.billingclient.api.n;
import com.tempmail.R;
import com.tempmail.api.models.answers.DomainExpired;
import com.tempmail.t.o;
import com.tempmail.utils.e;
import com.tempmail.utils.g;
import com.tempmail.utils.m;
import com.tempmail.utils.r;
import com.tempmail.utils.s;
import com.tempmail.utils.u;
import com.tempmail.utils.w;
import com.tempmail.utils.z.f;
import com.tempmail.utils.z.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: BaseOnBoardingActivity */
public abstract class c extends o implements j, View.OnClickListener {
    private static final String a0 = c.class.getSimpleName();
    public ArrayList<View> V = new ArrayList<>();
    n W;
    androidx.viewpager.widget.a X;
    public String Y = null;
    public String Z;

    /* compiled from: BaseOnBoardingActivity */
    class a implements f {
        a() {
        }

        public void a(int i) {
            c.this.J1();
        }

        public void b(int i) {
            c.this.J1();
        }
    }

    public void C1(n nVar) {
        if (nVar != null) {
            m.b(a0, "skuDetails not null");
            s.m0(this, true);
            this.K.g(nVar.f());
            return;
        }
        m.b(a0, "skuDetails null");
        I1();
    }

    public void D1() {
        n D = s.D(this);
        this.W = D;
        C1(D);
    }

    public int E1() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public void F1(Guideline guideline, float f2) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) guideline.getLayoutParams();
        aVar.f1242a = (int) (((float) E1()) * f2);
        guideline.setLayoutParams(aVar);
    }

    public void G1(TextView textView) {
        F0();
        n D = s.D(this);
        this.W = D;
        if (D != null) {
            F0();
            textView.setText(u.b(this, R.string.onboarding_buy_premium_tip, String.valueOf(e.N(this.W)), this.W.c()));
            return;
        }
        F0();
        textView.setText(u.b(this, R.string.onboarding_buy_premium_tip, "...", "..."));
    }

    public void H1(TextView textView) {
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        F0();
        F0();
        textView.setText(u.e(this, u.c(this), textView.getCurrentTextColor()));
    }

    public void I1() {
        F0();
        Toast.makeText(this, R.string.message_purchase_data_error, 1).show();
    }

    public void J1() {
        w.b(this, this.N, this.Y, this.Z);
    }

    public void L(Fragment fragment, boolean z) {
        try {
            String str = a0;
            m.b(str, "navigateToFragment " + fragment.toString());
            q j = k0().j();
            j.o(R.id.container, fragment);
            if (z) {
                j.f(fragment.getClass().getSimpleName());
            }
            j.s(4097);
            j.h();
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
    }

    public void a(boolean z) {
        String str = a0;
        m.b(str, "showLoadingMain " + z);
        if (z) {
            M0();
        } else {
            E0();
        }
    }

    public void b(List<DomainExpired> list) {
        m.b(a0, "onDomainLoaded");
        r.c(this.y, list);
        this.F.c(g.s(this.y).getFullEmailAddress());
        s1(new a());
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null) {
            this.Z = intent.getStringExtra("extra_deep_link_ots");
            this.Y = intent.getStringExtra("extra_deep_link_email");
        }
    }

    public void q1(int i) {
    }

    public void setSelectedDot(View view) {
        String str = a0;
        m.b(str, "setSelectedDot " + view);
        view.setSelected(true);
        Iterator<View> it = this.V.iterator();
        while (it.hasNext()) {
            View next = it.next();
            String str2 = a0;
            m.b(str2, "view  " + view);
            if (next.getId() != view.getId()) {
                String str3 = a0;
                m.b(str3, "unselect dot " + view);
                next.setSelected(false);
            }
        }
    }
}
