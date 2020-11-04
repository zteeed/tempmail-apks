package com.tempmail.k;

import android.util.Log;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tempmail.R;
import com.tempmail.db.j;
import com.tempmail.f;
import com.tempmail.k.e;
import com.tempmail.utils.g;
import com.tempmail.utils.s;
import java.util.List;

/* compiled from: BillingController */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final b f12397a = new b();

    /* renamed from: b  reason: collision with root package name */
    f f12398b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public f f12399c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public boolean f12400d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public boolean f12401e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public boolean f12402f;
    /* access modifiers changed from: private */
    public boolean g;
    /* access modifiers changed from: private */
    public boolean h;
    /* access modifiers changed from: private */
    public FirebaseAnalytics i;

    /* compiled from: BillingController */
    private class b implements e.f {
        private b() {
        }

        public void a() {
            d.this.f12398b.G();
        }

        public void b() {
            Log.d("MainViewController", "onBillingClientSetupFailed");
            d.this.f12398b.d((com.android.billingclient.api.e) null);
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0075, code lost:
            if (r3.equals("subscription_annual") != false) goto L_0x008d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void c(java.util.List<com.android.billingclient.api.e> r12) {
            /*
                r11 = this;
                if (r12 != 0) goto L_0x0003
                return
            L_0x0003:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "onPurchasesUpdated "
                r0.append(r1)
                int r1 = r12.size()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "MainViewController"
                android.util.Log.d(r1, r0)
                com.tempmail.k.d r0 = com.tempmail.k.d.this
                r2 = 0
                boolean unused = r0.f12401e = r2
                com.tempmail.k.d r0 = com.tempmail.k.d.this
                boolean unused = r0.h = r2
                com.tempmail.k.d r0 = com.tempmail.k.d.this
                boolean unused = r0.g = r2
                com.tempmail.k.d r0 = com.tempmail.k.d.this
                boolean unused = r0.f12400d = r2
                com.tempmail.k.d r0 = com.tempmail.k.d.this
                boolean unused = r0.f12402f = r2
                com.tempmail.k.d r0 = com.tempmail.k.d.this
                com.android.billingclient.api.e r0 = r0.l(r12)
                if (r0 == 0) goto L_0x00d4
                java.lang.String r3 = r0.f()
                r4 = -1
                int r5 = r3.hashCode()
                r6 = 5
                r7 = 4
                r8 = 3
                r9 = 2
                r10 = 1
                switch(r5) {
                    case -890035477: goto L_0x0082;
                    case -763763647: goto L_0x0078;
                    case -650278079: goto L_0x006f;
                    case -101441642: goto L_0x0065;
                    case 500204303: goto L_0x005b;
                    case 1419671746: goto L_0x0051;
                    default: goto L_0x0050;
                }
            L_0x0050:
                goto L_0x008c
            L_0x0051:
                java.lang.String r2 = "subscription_monthly_trial"
                boolean r2 = r3.equals(r2)
                if (r2 == 0) goto L_0x008c
                r2 = 4
                goto L_0x008d
            L_0x005b:
                java.lang.String r2 = "subscription_one_week"
                boolean r2 = r3.equals(r2)
                if (r2 == 0) goto L_0x008c
                r2 = 5
                goto L_0x008d
            L_0x0065:
                java.lang.String r2 = "subscription_three_months"
                boolean r2 = r3.equals(r2)
                if (r2 == 0) goto L_0x008c
                r2 = 2
                goto L_0x008d
            L_0x006f:
                java.lang.String r5 = "subscription_annual"
                boolean r3 = r3.equals(r5)
                if (r3 == 0) goto L_0x008c
                goto L_0x008d
            L_0x0078:
                java.lang.String r2 = "subscription_six_month"
                boolean r2 = r3.equals(r2)
                if (r2 == 0) goto L_0x008c
                r2 = 1
                goto L_0x008d
            L_0x0082:
                java.lang.String r2 = "subscription_monthly"
                boolean r2 = r3.equals(r2)
                if (r2 == 0) goto L_0x008c
                r2 = 3
                goto L_0x008d
            L_0x008c:
                r2 = -1
            L_0x008d:
                if (r2 == 0) goto L_0x00b2
                if (r2 == r10) goto L_0x00ac
                if (r2 == r9) goto L_0x00a6
                if (r2 == r8) goto L_0x00a0
                if (r2 == r7) goto L_0x00a0
                if (r2 == r6) goto L_0x009a
                goto L_0x00b7
            L_0x009a:
                com.tempmail.k.d r2 = com.tempmail.k.d.this
                boolean unused = r2.f12400d = r10
                goto L_0x00b7
            L_0x00a0:
                com.tempmail.k.d r2 = com.tempmail.k.d.this
                boolean unused = r2.f12401e = r10
                goto L_0x00b7
            L_0x00a6:
                com.tempmail.k.d r2 = com.tempmail.k.d.this
                boolean unused = r2.f12402f = r10
                goto L_0x00b7
            L_0x00ac:
                com.tempmail.k.d r2 = com.tempmail.k.d.this
                boolean unused = r2.g = r10
                goto L_0x00b7
            L_0x00b2:
                com.tempmail.k.d r2 = com.tempmail.k.d.this
                boolean unused = r2.h = r10
            L_0x00b7:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "max purchase "
                r2.append(r3)
                java.lang.String r3 = r0.toString()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                android.util.Log.d(r1, r2)
                com.tempmail.k.d r2 = com.tempmail.k.d.this
                r2.k(r0)
            L_0x00d4:
                com.tempmail.k.d r0 = com.tempmail.k.d.this
                com.android.billingclient.api.e r12 = r0.m(r12)
                if (r12 == 0) goto L_0x00fa
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "removeAdPurchase "
                r0.append(r2)
                java.lang.String r2 = r12.toString()
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                android.util.Log.d(r1, r0)
                com.tempmail.k.d r0 = com.tempmail.k.d.this
                r0.j(r12)
                goto L_0x0107
            L_0x00fa:
                com.tempmail.k.d r12 = com.tempmail.k.d.this
                com.tempmail.k.f r12 = r12.f12398b
                r0 = 0
                r12.d(r0)
                java.lang.String r12 = "removeAdPurchase null"
                android.util.Log.d(r1, r12)
            L_0x0107:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tempmail.k.d.b.c(java.util.List):void");
        }

        public void d() {
            Log.d("MainViewController", "onPurchasesFailed");
            com.tempmail.utils.d.a(d.this.i, "select_content", d.this.f12399c.getString(R.string.analytics_event_type_error), d.this.f12399c.getString(R.string.analytics_premium_payment_failed));
        }
    }

    public d(f fVar, f fVar2) {
        this.f12399c = fVar;
        this.i = FirebaseAnalytics.getInstance(fVar);
        this.f12398b = fVar2;
    }

    /* access modifiers changed from: private */
    public com.android.billingclient.api.e l(List<com.android.billingclient.api.e> list) {
        com.android.billingclient.api.e eVar = null;
        for (com.android.billingclient.api.e next : list) {
            Log.d("MainViewController", "purchase " + next.toString());
            if (c.b().contains(next.f()) && (eVar == null || eVar.c() < next.c())) {
                eVar = next;
            }
        }
        return eVar;
    }

    /* access modifiers changed from: private */
    public com.android.billingclient.api.e m(List<com.android.billingclient.api.e> list) {
        for (com.android.billingclient.api.e next : list) {
            Log.d("MainViewController", "getRemoveAdPurchase " + next.toString());
            if (next.f().equals("remove_ad_purchase")) {
                return next;
            }
        }
        return null;
    }

    public void j(com.android.billingclient.api.e eVar) {
        p();
        g.C(this.f12399c.H0(), eVar.b());
        this.f12398b.d(eVar);
    }

    public void k(com.android.billingclient.api.e eVar) {
        if (!s.H(this.f12399c)) {
            Log.d("MainViewController", "purchase not started");
            return;
        }
        p();
        if (g.C(this.f12399c.H0(), eVar.b()) == null) {
            g.g(this.f12399c.H0(), new j(eVar.b(), eVar.e()));
            this.f12398b.b(eVar);
            s.k0(this.f12399c, false);
            return;
        }
        Log.d("MainViewController", "purchase saved not null");
    }

    public b n() {
        return this.f12397a;
    }

    public boolean o() {
        return this.f12401e || this.g || this.h || this.f12400d || this.f12402f;
    }

    public void p() {
        if (this.f12399c.H0() == null || !this.f12399c.I0().isOpen()) {
            Log.d("MainViewController", "reopen db");
            this.f12399c.L0();
        }
    }
}
