package com.tempmail;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.WindowManager;
import androidx.appcompat.app.e;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tempmail.db.b;
import com.tempmail.db.c;
import com.tempmail.db.d;
import com.tempmail.n.t;
import com.tempmail.utils.l;
import com.tempmail.utils.m;
import com.tempmail.utils.o;
import d.a.y.a;

@SuppressLint({"Registered"})
/* compiled from: BaseActivity */
public class f extends e {
    private static final String x = f.class.getSimpleName();
    public a r = new a();
    public b s;
    public c t;
    public SQLiteDatabase u;
    public FirebaseAnalytics v;
    ProgressDialog w;

    public void E0() {
        c cVar = this.t;
        if (cVar != null) {
            cVar.d();
        }
        SQLiteDatabase sQLiteDatabase = this.u;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
        }
        this.s = null;
    }

    public void F0() {
        ProgressDialog progressDialog = this.w;
        if (progressDialog != null) {
            try {
                progressDialog.dismiss();
            } catch (IllegalArgumentException e2) {
                e2.printStackTrace();
            }
        }
    }

    public Context G0() {
        return this;
    }

    public c H0() {
        return this.t;
    }

    public SQLiteDatabase I0() {
        return this.u;
    }

    public a J0() {
        return this.r;
    }

    public FirebaseAnalytics K0() {
        return this.v;
    }

    public void L0() {
        SQLiteDatabase writableDatabase = new d(this, com.tempmail.utils.y.b.f12595b).getWritableDatabase();
        this.u = writableDatabase;
        b bVar = new b(writableDatabase);
        this.s = bVar;
        this.t = bVar.c();
    }

    public /* synthetic */ void M0(String str, String str2) {
        try {
            t.t2(str, str2).r2(k0(), t.class.getSimpleName());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void N0(android.content.Context r7, com.android.billingclient.api.e r8) {
        /*
            r6 = this;
            java.lang.String r8 = r8.f()
            int r0 = r8.hashCode()
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r0) {
                case -890035477: goto L_0x0043;
                case -763763647: goto L_0x0039;
                case -650278079: goto L_0x002f;
                case -101441642: goto L_0x0025;
                case 500204303: goto L_0x001b;
                case 1419671746: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x004d
        L_0x0011:
            java.lang.String r0 = "subscription_monthly_trial"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x004d
            r8 = 1
            goto L_0x004e
        L_0x001b:
            java.lang.String r0 = "subscription_one_week"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x004d
            r8 = 0
            goto L_0x004e
        L_0x0025:
            java.lang.String r0 = "subscription_three_months"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x004d
            r8 = 3
            goto L_0x004e
        L_0x002f:
            java.lang.String r0 = "subscription_annual"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x004d
            r8 = 5
            goto L_0x004e
        L_0x0039:
            java.lang.String r0 = "subscription_six_month"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x004d
            r8 = 4
            goto L_0x004e
        L_0x0043:
            java.lang.String r0 = "subscription_monthly"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x004d
            r8 = 2
            goto L_0x004e
        L_0x004d:
            r8 = -1
        L_0x004e:
            if (r8 == 0) goto L_0x009a
            if (r8 == r5) goto L_0x008e
            if (r8 == r4) goto L_0x0082
            if (r8 == r3) goto L_0x0076
            if (r8 == r2) goto L_0x006a
            if (r8 == r1) goto L_0x005e
            java.lang.String r8 = ""
            r0 = 0
            goto L_0x00a5
        L_0x005e:
            r8 = 2131755088(0x7f100050, float:1.9141045E38)
            java.lang.String r8 = r6.getString(r8)
            com.android.billingclient.api.g r0 = com.tempmail.utils.s.Q(r7)
            goto L_0x00a5
        L_0x006a:
            r8 = 2131755096(0x7f100058, float:1.9141062E38)
            java.lang.String r8 = r6.getString(r8)
            com.android.billingclient.api.g r0 = com.tempmail.utils.s.M(r7)
            goto L_0x00a5
        L_0x0076:
            r8 = 2131755094(0x7f100056, float:1.9141058E38)
            java.lang.String r8 = r6.getString(r8)
            com.android.billingclient.api.g r0 = com.tempmail.utils.s.B(r7)
            goto L_0x00a5
        L_0x0082:
            r8 = 2131755090(0x7f100052, float:1.914105E38)
            java.lang.String r8 = r6.getString(r8)
            com.android.billingclient.api.g r0 = com.tempmail.utils.s.B(r7)
            goto L_0x00a5
        L_0x008e:
            r8 = 2131755103(0x7f10005f, float:1.9141076E38)
            java.lang.String r8 = r6.getString(r8)
            com.android.billingclient.api.g r0 = com.tempmail.utils.s.C(r7)
            goto L_0x00a5
        L_0x009a:
            r8 = 2131755092(0x7f100054, float:1.9141054E38)
            java.lang.String r8 = r6.getString(r8)
            com.android.billingclient.api.g r0 = com.tempmail.utils.s.D(r7)
        L_0x00a5:
            java.lang.String r1 = x
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "logPurchaseEventAppsFlyer "
            r2.append(r3)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            com.tempmail.utils.m.b(r1, r2)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.String r2 = "af_content_id"
            r1.put(r2, r8)
            if (r0 == 0) goto L_0x00ed
            long r2 = r0.d()
            double r2 = (double) r2
            r4 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r2 = r2 / r4
            java.lang.Double r8 = java.lang.Double.valueOf(r2)
            java.lang.String r2 = "af_revenue"
            r1.put(r2, r8)
            java.lang.String r8 = r0.e()
            java.lang.String r2 = "af_currency"
            r1.put(r2, r8)
            java.lang.String r8 = r0.c()
            java.lang.String r0 = "af_price"
            r1.put(r0, r8)
        L_0x00ed:
            b.b.i r8 = b.b.i.e()
            java.lang.String r0 = "af_purchase"
            r8.n(r7, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tempmail.f.N0(android.content.Context, com.android.billingclient.api.e):void");
    }

    public void O0() {
        m.b(x, "showProgressDialog ");
        if (!isFinishing()) {
            try {
                if (this.w == null || !this.w.isShowing()) {
                    ProgressDialog show = ProgressDialog.show(this, getString(R.string.progress_dialog_title), getString(R.string.progress_dialog_message));
                    this.w = show;
                    show.setCancelable(false);
                }
                String str = x;
                m.b(str, "showProgressDialog " + this.w.hashCode());
            } catch (WindowManager.BadTokenException | IllegalArgumentException e2) {
                e2.printStackTrace();
            }
        }
    }

    public void P0(String str) {
        Q0((String) null, str);
    }

    public void Q0(String str, String str2) {
        new Handler(Looper.getMainLooper()).post(new b(this, str, str2));
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        String a2 = Build.VERSION.SDK_INT >= 21 ? l.a(context) : null;
        if (a2 != null) {
            super.attachBaseContext(o.e(context, a2));
        } else {
            super.attachBaseContext(context);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String str = x;
        m.b(str, "onCreate " + hashCode());
        setRequestedOrientation(1);
        getSharedPreferences(com.tempmail.utils.y.d.f12602a, 0);
        L0();
        this.v = FirebaseAnalytics.getInstance(this);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        m.b(x, "onDestroy ");
        F0();
        this.r.d();
        E0();
    }
}
