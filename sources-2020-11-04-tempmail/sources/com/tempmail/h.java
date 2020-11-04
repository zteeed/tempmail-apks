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
import com.tempmail.db.DaoMaster;
import com.tempmail.db.DaoSession;
import com.tempmail.db.DbOpenHelper;
import com.tempmail.o.s;
import com.tempmail.utils.l;
import com.tempmail.utils.m;
import com.tempmail.utils.o;
import com.tempmail.utils.y.b;
import com.tempmail.utils.y.d;
import d.a.y.a;

@SuppressLint({"Registered"})
/* compiled from: BaseActivity */
public class h extends e {
    private static final String D = h.class.getSimpleName();
    public FirebaseAnalytics A;
    public Handler B = new Handler(Looper.getMainLooper());
    ProgressDialog C;
    public a w = new a();
    public DaoMaster x;
    public DaoSession y;
    public SQLiteDatabase z;

    public void D0() {
        DaoSession daoSession = this.y;
        if (daoSession != null) {
            daoSession.clear();
        }
        SQLiteDatabase sQLiteDatabase = this.z;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
        }
        this.x = null;
    }

    public void E0() {
        ProgressDialog progressDialog = this.C;
        if (progressDialog != null) {
            try {
                progressDialog.dismiss();
            } catch (IllegalArgumentException e2) {
                e2.printStackTrace();
            }
        }
    }

    public Context F0() {
        return this;
    }

    public DaoSession G0() {
        return this.y;
    }

    public a H0() {
        return this.w;
    }

    public FirebaseAnalytics I0() {
        return this.A;
    }

    public void J0() {
        SQLiteDatabase writableDatabase = new DbOpenHelper(this, b.f13137b).getWritableDatabase();
        this.z = writableDatabase;
        DaoMaster daoMaster = new DaoMaster(writableDatabase);
        this.x = daoMaster;
        this.y = daoMaster.newSession();
    }

    public /* synthetic */ void K0(String str, String str2) {
        try {
            s.z2(str, str2).x2(k0(), s.class.getSimpleName());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void L0(android.content.Context r7, com.android.billingclient.api.j r8) {
        /*
            r6 = this;
            java.lang.String r8 = r8.g()
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
            r8 = 2131755093(0x7f100055, float:1.9141056E38)
            java.lang.String r8 = r6.getString(r8)
            com.android.billingclient.api.n r0 = com.tempmail.utils.s.R(r7)
            goto L_0x00a5
        L_0x006a:
            r8 = 2131755101(0x7f10005d, float:1.9141072E38)
            java.lang.String r8 = r6.getString(r8)
            com.android.billingclient.api.n r0 = com.tempmail.utils.s.M(r7)
            goto L_0x00a5
        L_0x0076:
            r8 = 2131755099(0x7f10005b, float:1.9141068E38)
            java.lang.String r8 = r6.getString(r8)
            com.android.billingclient.api.n r0 = com.tempmail.utils.s.C(r7)
            goto L_0x00a5
        L_0x0082:
            r8 = 2131755095(0x7f100057, float:1.914106E38)
            java.lang.String r8 = r6.getString(r8)
            com.android.billingclient.api.n r0 = com.tempmail.utils.s.C(r7)
            goto L_0x00a5
        L_0x008e:
            r8 = 2131755113(0x7f100069, float:1.9141096E38)
            java.lang.String r8 = r6.getString(r8)
            com.android.billingclient.api.n r0 = com.tempmail.utils.s.D(r7)
            goto L_0x00a5
        L_0x009a:
            r8 = 2131755097(0x7f100059, float:1.9141064E38)
            java.lang.String r8 = r6.getString(r8)
            com.android.billingclient.api.n r0 = com.tempmail.utils.s.E(r7)
        L_0x00a5:
            java.lang.String r1 = D
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
        throw new UnsupportedOperationException("Method not decompiled: com.tempmail.h.L0(android.content.Context, com.android.billingclient.api.j):void");
    }

    public void M0() {
        m.b(D, "showProgressDialog ");
        if (!isFinishing()) {
            try {
                if (this.C == null || !this.C.isShowing()) {
                    ProgressDialog show = ProgressDialog.show(this, getString(R.string.progress_dialog_title), getString(R.string.progress_dialog_message));
                    this.C = show;
                    show.setCancelable(false);
                }
                String str = D;
                m.b(str, "showProgressDialog " + this.C.hashCode());
            } catch (WindowManager.BadTokenException | IllegalArgumentException e2) {
                e2.printStackTrace();
            }
        }
    }

    public void N0(String str) {
        O0((String) null, str);
    }

    public void O0(String str, String str2) {
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
        String str = D;
        m.b(str, "onCreate " + hashCode());
        setRequestedOrientation(1);
        getSharedPreferences(d.f13145a, 0);
        J0();
        this.A = FirebaseAnalytics.getInstance(this);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        m.b(D, "onDestroy ");
        E0();
        this.w.d();
        D0();
        this.B.removeCallbacks((Runnable) null);
    }
}
