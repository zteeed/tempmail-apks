package com.tempmail.n;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.appcompat.app.d;
import androidx.fragment.app.Fragment;
import com.tempmail.utils.z.f;

/* compiled from: SimpleAlertDialog */
public class t extends m {
    String o0;
    String p0;
    String q0;
    String r0;
    f s0;
    int t0;

    /* compiled from: SimpleAlertDialog */
    class a implements DialogInterface.OnClickListener {
        a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            t.this.h2();
            Fragment j0 = t.this.j0();
            if (j0 != null) {
                j0.E0(t.this.k0(), -1, (Intent) null);
                return;
            }
            t tVar = t.this;
            f fVar = tVar.s0;
            if (fVar != null) {
                fVar.a(tVar.t0);
            }
        }
    }

    /* compiled from: SimpleAlertDialog */
    class b implements DialogInterface.OnClickListener {
        b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            t.this.h2();
        }
    }

    public static t t2(String str, String str2) {
        return u2((String) null, (String) null, str, str2);
    }

    public static t u2(String str, String str2, String str3, String str4) {
        t tVar = new t();
        Bundle bundle = new Bundle();
        bundle.putString("dialog_title", str3);
        bundle.putString("dialog_message", str4);
        bundle.putString("ok_text", str);
        bundle.putString("cancel_text", str2);
        tVar.O1(bundle);
        return tVar;
    }

    public void J0(Bundle bundle) {
        super.J0(bundle);
        Bundle D = D();
        if (D != null) {
            this.o0 = D.getString("dialog_title");
            this.p0 = D.getString("dialog_message");
            this.q0 = D.getString("ok_text");
            this.r0 = D.getString("cancel_text");
        }
    }

    public Dialog m2(Bundle bundle) {
        d.a aVar = new d.a(u());
        if (!TextUtils.isEmpty(this.o0)) {
            aVar.l(this.o0);
        }
        aVar.f(this.p0);
        if (this.q0 == null) {
            this.q0 = h0(17039370);
        }
        aVar.k(this.q0, new a());
        String str = this.r0;
        if (str != null) {
            aVar.h(str, new b());
        }
        return aVar.a();
    }

    public void v2(int i, f fVar) {
        this.s0 = fVar;
        this.t0 = i;
    }
}
