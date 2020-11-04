package com.tempmail.o;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tempmail.R;
import com.tempmail.n.a0;
import com.tempmail.utils.m;
import com.tempmail.utils.z.f;

/* compiled from: PremiumActiveDialog */
public class o extends l implements View.OnClickListener {
    private static final String s0 = o.class.getSimpleName();
    f p0;
    String q0;
    String r0;

    public static o A2(String str, String str2) {
        o oVar = new o();
        Bundle bundle = new Bundle();
        bundle.putString("dialog_title", str);
        bundle.putString("dialog_message", str2);
        oVar.V1(bundle);
        return oVar;
    }

    public static o z2() {
        return new o();
    }

    public void B2(f fVar) {
        this.p0 = fVar;
    }

    public void M0(Bundle bundle) {
        super.M0(bundle);
        Bundle J = J();
        if (J != null) {
            this.q0 = J.getString("dialog_title");
            this.r0 = J.getString("dialog_message");
            String str = s0;
            m.b(str, "title " + this.q0);
        }
        v2(1, 2131820552);
    }

    public View Q0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        m.b(s0, "onCreateView");
        a0 a0Var = (a0) androidx.databinding.f.d(layoutInflater, R.layout.fragment_dialog_premium, viewGroup, false);
        if (!(this.q0 == null || this.r0 == null)) {
            m.b(s0, "itle!=null && message!=null");
            a0Var.v.setText(this.q0);
            a0Var.u.setText(this.r0);
        }
        a0Var.w.setOnClickListener(this);
        return a0Var.n();
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tvYes /*2131296778*/:
            case R.id.tvYesVertical /*2131296779*/:
                if (m0() != null) {
                    m0().H0(n0(), -1, (Intent) null);
                } else {
                    f fVar = this.p0;
                    if (fVar != null) {
                        fVar.a(0);
                    }
                }
                n2();
                return;
            default:
                return;
        }
    }

    public Dialog s2(Bundle bundle) {
        return super.s2(bundle);
    }
}
