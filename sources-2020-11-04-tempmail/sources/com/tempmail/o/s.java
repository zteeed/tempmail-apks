package com.tempmail.o;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.appcompat.app.d;
import androidx.fragment.app.Fragment;
import com.tempmail.utils.z.f;

/* compiled from: SimpleAlertDialog */
public class s extends l {
    String p0;
    String q0;
    String r0;
    String s0;
    f t0;
    int u0;

    /* compiled from: SimpleAlertDialog */
    class a implements DialogInterface.OnClickListener {
        a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            s.this.n2();
            Fragment m0 = s.this.m0();
            if (m0 != null) {
                m0.H0(s.this.n0(), -1, (Intent) null);
                return;
            }
            s sVar = s.this;
            f fVar = sVar.t0;
            if (fVar != null) {
                fVar.a(sVar.u0);
            }
        }
    }

    /* compiled from: SimpleAlertDialog */
    class b implements DialogInterface.OnClickListener {
        b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            s.this.n2();
        }
    }

    public static s A2(String str, String str2, String str3, String str4) {
        s sVar = new s();
        Bundle bundle = new Bundle();
        bundle.putString("dialog_title", str3);
        bundle.putString("dialog_message", str4);
        bundle.putString("ok_text", str);
        bundle.putString("cancel_text", str2);
        sVar.V1(bundle);
        return sVar;
    }

    public static s z2(String str, String str2) {
        return A2((String) null, (String) null, str, str2);
    }

    public void B2(int i, f fVar) {
        this.t0 = fVar;
        this.u0 = i;
    }

    public void M0(Bundle bundle) {
        super.M0(bundle);
        Bundle J = J();
        if (J != null) {
            this.p0 = J.getString("dialog_title");
            this.q0 = J.getString("dialog_message");
            this.r0 = J.getString("ok_text");
            this.s0 = J.getString("cancel_text");
        }
    }

    public Dialog s2(Bundle bundle) {
        d.a aVar = new d.a(z());
        if (!TextUtils.isEmpty(this.p0)) {
            aVar.l(this.p0);
        }
        aVar.f(this.q0);
        if (this.r0 == null) {
            this.r0 = k0(17039370);
        }
        aVar.k(this.r0, new a());
        String str = this.s0;
        if (str != null) {
            aVar.h(str, new b());
        }
        return aVar.a();
    }
}
