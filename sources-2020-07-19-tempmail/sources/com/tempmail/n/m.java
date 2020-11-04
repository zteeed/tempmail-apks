package com.tempmail.n;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.b;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tempmail.f;
import com.tempmail.utils.d;
import com.tempmail.utils.z.a;
import com.tempmail.utils.z.c;
import com.tempmail.utils.z.j;

/* compiled from: BaseDialogFragment */
public class m extends b {
    public Context i0;
    public f j0;
    FirebaseAnalytics k0;
    public c l0;
    public a m0;
    public com.tempmail.k.f n0;

    public void G0(Context context) {
        super.G0(context);
        if (context instanceof j) {
            j jVar = (j) context;
        }
        if (context instanceof c) {
            this.l0 = (c) context;
        }
        if (context instanceof a) {
            this.m0 = (a) context;
        }
        if (context instanceof com.tempmail.k.f) {
            this.n0 = (com.tempmail.k.f) context;
        }
        if (context instanceof f) {
            this.j0 = (f) context;
        }
        this.i0 = context;
    }

    public void J0(Bundle bundle) {
        super.J0(bundle);
        this.k0 = FirebaseAnalytics.getInstance(this.i0);
    }

    public void R0() {
        super.R0();
        this.j0 = null;
        this.i0 = null;
        this.l0 = null;
        this.m0 = null;
        this.n0 = null;
    }

    public void s2(String str) {
        d.a(this.k0, "select_content", "content_type", str);
    }
}
