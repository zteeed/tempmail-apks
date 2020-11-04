package com.tempmail.o;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.b;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tempmail.h;
import com.tempmail.utils.d;
import com.tempmail.utils.z.a;
import com.tempmail.utils.z.c;
import com.tempmail.utils.z.j;

/* compiled from: BaseDialogFragment */
public class l extends b {
    public Context l0;
    public h m0;
    public a n0;
    FirebaseAnalytics o0;

    public void J0(Context context) {
        super.J0(context);
        if (context instanceof j) {
            j jVar = (j) context;
        }
        if (context instanceof c) {
            c cVar = (c) context;
        }
        if (context instanceof a) {
            this.n0 = (a) context;
        }
        if (context instanceof h) {
            this.m0 = (h) context;
        }
        this.l0 = context;
    }

    public void M0(Bundle bundle) {
        super.M0(bundle);
        this.o0 = FirebaseAnalytics.getInstance(this.l0);
    }

    public void U0() {
        super.U0();
        this.m0 = null;
        this.l0 = null;
        this.n0 = null;
    }

    public void y2(String str) {
        d.d(this.o0, "select_content", "content_type", str);
    }
}
