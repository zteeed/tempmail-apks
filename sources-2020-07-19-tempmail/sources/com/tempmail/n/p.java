package com.tempmail.n;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tempmail.R;
import com.tempmail.m.y;
import com.tempmail.utils.m;
import com.tempmail.utils.z.f;

/* compiled from: PremiumActiveDialog */
public class p extends m implements View.OnClickListener {
    private static final String r0 = p.class.getSimpleName();
    f o0;
    String p0;
    String q0;

    public static p t2() {
        return new p();
    }

    public static p u2(String str, String str2) {
        p pVar = new p();
        Bundle bundle = new Bundle();
        bundle.putString("dialog_title", str);
        bundle.putString("dialog_message", str2);
        pVar.O1(bundle);
        return pVar;
    }

    public void J0(Bundle bundle) {
        super.J0(bundle);
        Bundle D = D();
        if (D != null) {
            this.p0 = D.getString("dialog_title");
            this.q0 = D.getString("dialog_message");
            String str = r0;
            m.b(str, "title " + this.p0);
        }
        p2(1, 2131820552);
    }

    public View N0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        m.b(r0, "onCreateView");
        y yVar = (y) androidx.databinding.f.d(layoutInflater, R.layout.fragment_dialog_premium, viewGroup, false);
        if (!(this.p0 == null || this.q0 == null)) {
            m.b(r0, "itle!=null && message!=null");
            yVar.v.setText(this.p0);
            yVar.u.setText(this.q0);
        }
        yVar.w.setOnClickListener(this);
        return yVar.n();
    }

    public Dialog m2(Bundle bundle) {
        return super.m2(bundle);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tvYes /*2131296759*/:
            case R.id.tvYesVertical /*2131296760*/:
                if (j0() != null) {
                    j0().E0(k0(), -1, (Intent) null);
                } else {
                    f fVar = this.o0;
                    if (fVar != null) {
                        fVar.a(0);
                    }
                }
                h2();
                return;
            default:
                return;
        }
    }

    public void v2(f fVar) {
        this.o0 = fVar;
    }
}
