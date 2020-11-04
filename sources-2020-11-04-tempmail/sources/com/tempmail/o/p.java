package com.tempmail.o;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.f;
import com.google.zxing.a;
import com.journeyapps.barcodescanner.b;
import com.tempmail.R;
import com.tempmail.n.m0;
import com.tempmail.utils.m;
import com.tempmail.utils.x;

/* compiled from: QrCodeDialog */
public class p extends l implements View.OnClickListener {
    private static final String q0 = p.class.getSimpleName();
    String p0;

    public static p z2(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("extra_link", str);
        p pVar = new p();
        pVar.V1(bundle);
        return pVar;
    }

    public void M0(Bundle bundle) {
        super.M0(bundle);
        Bundle J = J();
        if (J != null) {
            this.p0 = J.getString("extra_link");
        }
        v2(1, 2131820552);
    }

    public View Q0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        m.b(q0, "onCreateView");
        m0 m0Var = (m0) f.d(layoutInflater, R.layout.fragment_qr_code, viewGroup, false);
        m0Var.q.setOnClickListener(this);
        m0Var.r.setOnClickListener(this);
        try {
            b bVar = new b();
            int d2 = (int) x.d(this.l0, 200.0f);
            m0Var.r.setImageBitmap(bVar.c(this.p0, a.QR_CODE, d2, d2));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return m0Var.n();
    }

    public void onClick(View view) {
        o2();
    }

    public Dialog s2(Bundle bundle) {
        return super.s2(bundle);
    }
}
