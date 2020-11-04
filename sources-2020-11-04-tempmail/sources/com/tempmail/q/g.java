package com.tempmail.q;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tempmail.h;
import com.tempmail.t.n;
import com.tempmail.utils.d;
import com.tempmail.utils.z.a;
import com.tempmail.utils.z.c;
import com.tempmail.utils.z.j;
import com.tempmail.utils.z.o;

/* compiled from: BaseFragment */
public class g extends Fragment {
    public j Y;
    public h Z;
    public n a0;
    public Context b0;
    public c c0;
    public a d0;
    public o e0;
    public Handler f0 = new Handler(Looper.getMainLooper());
    FirebaseAnalytics g0;
    com.tempmail.t.o h0;

    public void J0(Context context) {
        super.J0(context);
        if (context instanceof j) {
            this.Y = (j) context;
            if (context instanceof h) {
                this.Z = (h) context;
            }
            if (context instanceof n) {
                this.a0 = (n) context;
            }
            if (context instanceof c) {
                this.c0 = (c) context;
            }
            if (context instanceof a) {
                this.d0 = (a) context;
            }
            if (context instanceof com.tempmail.t.o) {
                this.h0 = (com.tempmail.t.o) context;
            }
            if (context instanceof o) {
                this.e0 = (o) context;
            }
            this.b0 = context;
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    public void M0(Bundle bundle) {
        super.M0(bundle);
        this.g0 = FirebaseAnalytics.getInstance(this.b0);
    }

    public void R0() {
        super.R0();
        this.f0.removeCallbacks((Runnable) null);
    }

    public void U0() {
        super.U0();
        this.Y = null;
        this.Z = null;
        this.a0 = null;
        this.b0 = null;
        this.c0 = null;
        this.d0 = null;
        this.e0 = null;
        this.h0 = null;
    }

    public void i1() {
        super.i1();
        this.c0.l();
    }

    public com.tempmail.t.o n2() {
        return this.h0;
    }

    public void o2(String str) {
        d.d(this.g0, "select_content", "content_type", str);
    }
}
