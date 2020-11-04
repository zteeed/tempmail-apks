package com.tempmail.n;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.f;
import com.google.zxing.a;
import com.journeyapps.barcodescanner.b;
import com.tempmail.R;
import com.tempmail.m.k0;
import com.tempmail.utils.m;
import com.tempmail.utils.w;

/* compiled from: QrCodeDialog */
public class q extends m implements View.OnClickListener {
    private static final String p0 = q.class.getSimpleName();
    String o0;

    public static q t2(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("extra_link", str);
        q qVar = new q();
        qVar.O1(bundle);
        return qVar;
    }

    public void J0(Bundle bundle) {
        super.J0(bundle);
        Bundle D = D();
        if (D != null) {
            this.o0 = D.getString("extra_link");
        }
        p2(1, 2131820552);
    }

    public View N0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        m.b(p0, "onCreateView");
        k0 k0Var = (k0) f.d(layoutInflater, R.layout.fragment_qr_code, viewGroup, false);
        k0Var.q.setOnClickListener(this);
        k0Var.r.setOnClickListener(this);
        try {
            b bVar = new b();
            int d2 = (int) w.d(this.i0, 200.0f);
            k0Var.r.setImageBitmap(bVar.c(this.o0, a.QR_CODE, d2, d2));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return k0Var.n();
    }

    public Dialog m2(Bundle bundle) {
        return super.m2(bundle);
    }

    public void onClick(View view) {
        i2();
    }
}
