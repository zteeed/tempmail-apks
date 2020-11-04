package com.tempmail.p;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tempmail.f;
import com.tempmail.s.h;
import com.tempmail.utils.d;
import com.tempmail.utils.z.a;
import com.tempmail.utils.z.j;
import com.tempmail.utils.z.o;

/* compiled from: BaseFragment */
public class c extends Fragment {
    public j Z;
    public f a0;
    public h b0;
    public Context c0;
    FirebaseAnalytics d0;
    public com.tempmail.utils.z.c e0;
    public a f0;
    public com.tempmail.k.f g0;
    public o h0;

    public c() {
        new Handler(Looper.getMainLooper());
    }

    public void G0(Context context) {
        super.G0(context);
        if (context instanceof j) {
            this.Z = (j) context;
            if (context instanceof f) {
                this.a0 = (f) context;
            }
            if (context instanceof h) {
                this.b0 = (h) context;
            }
            if (context instanceof com.tempmail.utils.z.c) {
                this.e0 = (com.tempmail.utils.z.c) context;
            }
            if (context instanceof a) {
                this.f0 = (a) context;
            }
            if (context instanceof com.tempmail.k.f) {
                this.g0 = (com.tempmail.k.f) context;
            }
            if (context instanceof o) {
                this.h0 = (o) context;
            }
            this.c0 = context;
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    public void J0(Bundle bundle) {
        super.J0(bundle);
        this.d0 = FirebaseAnalytics.getInstance(this.c0);
    }

    public void R0() {
        super.R0();
        this.Z = null;
        this.a0 = null;
        this.b0 = null;
        this.c0 = null;
        this.e0 = null;
        this.f0 = null;
        this.g0 = null;
        this.h0 = null;
    }

    public void f1() {
        super.f1();
        this.e0.m();
    }

    public void h2(String str) {
        d.a(this.d0, "select_content", "content_type", str);
    }
}
