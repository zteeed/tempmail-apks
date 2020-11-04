package com.tempmail.w;

import android.app.Application;
import androidx.lifecycle.p;
import com.android.billingclient.api.j;
import com.android.billingclient.api.n;
import com.tempmail.ApplicationClass;
import com.tempmail.billing.f;
import com.tempmail.utils.i;
import java.util.List;
import java.util.Map;

/* compiled from: BillingViewModel */
public class a extends androidx.lifecycle.a {

    /* renamed from: d  reason: collision with root package name */
    public f<com.android.billingclient.api.f> f13158d = new f<>();

    /* renamed from: e  reason: collision with root package name */
    public p<Map<String, n>> f13159e;

    /* renamed from: f  reason: collision with root package name */
    private p<List<j>> f13160f;
    private p<Map<String, n>> g;

    public a(Application application) {
        super(application);
        new f();
        this.f13159e = new p<>();
        ApplicationClass applicationClass = (ApplicationClass) application;
        this.f13160f = applicationClass.f().f12825c;
        this.g = applicationClass.f().f12827e;
        this.f13159e = applicationClass.f().f12828f;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: com.android.billingclient.api.n} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void h(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            androidx.lifecycle.p<java.util.List<com.android.billingclient.api.j>> r7 = r5.f13160f
            java.lang.Object r7 = r7.d()
            java.util.List r7 = (java.util.List) r7
            boolean r7 = com.tempmail.billing.e.a(r7, r6)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r1 = " - isSkuOnServer: "
            r0.append(r1)
            r1 = 0
            r0.append(r1)
            java.lang.String r2 = ", isSkuOnDevice: "
            r0.append(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "Billing"
            android.util.Log.d(r2, r0)
            r0 = 1
            if (r7 == 0) goto L_0x004a
            android.app.Application r6 = r5.f()
            android.content.Context r6 = r6.getApplicationContext()
            r7 = 2131755307(0x7f10012b, float:1.914149E38)
            android.widget.Toast r6 = android.widget.Toast.makeText(r6, r7, r0)
            r6.show()
            java.lang.String r6 = "The Google Play Billing Library APIs indicate thatthis SKU is already owned, but the purchase token is not registered with the server. There might be an issue registering the purchase token."
            android.util.Log.e(r2, r6)
            goto L_0x00f3
        L_0x004a:
            r7 = 0
            boolean r3 = r6.equals(r7)
            if (r3 == 0) goto L_0x0057
            java.lang.String r3 = "Re-subscribe."
            android.util.Log.i(r2, r3)
            goto L_0x0080
        L_0x0057:
            boolean r3 = com.tempmail.billing.d.d(r6)
            if (r3 == 0) goto L_0x0069
            boolean r3 = com.tempmail.billing.d.c(r7)
            if (r3 == 0) goto L_0x0069
            java.lang.String r3 = "Upgrade!"
            android.util.Log.i(r2, r3)
            goto L_0x0080
        L_0x0069:
            boolean r3 = com.tempmail.billing.d.c(r6)
            if (r3 == 0) goto L_0x007b
            boolean r3 = com.tempmail.billing.d.d(r7)
            if (r3 == 0) goto L_0x007b
            java.lang.String r3 = "Downgrade..."
            android.util.Log.i(r2, r3)
            goto L_0x0080
        L_0x007b:
            java.lang.String r3 = "Regular purchase."
            android.util.Log.i(r2, r3)
        L_0x0080:
            androidx.lifecycle.p<java.util.Map<java.lang.String, com.android.billingclient.api.n>> r3 = r5.g
            java.lang.Object r3 = r3.d()
            if (r3 == 0) goto L_0x0096
            androidx.lifecycle.p<java.util.Map<java.lang.String, com.android.billingclient.api.n>> r7 = r5.g
            java.lang.Object r7 = r7.d()
            java.util.Map r7 = (java.util.Map) r7
            java.lang.Object r7 = r7.get(r6)
            com.android.billingclient.api.n r7 = (com.android.billingclient.api.n) r7
        L_0x0096:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "skusWithSkuDetailsInApp ."
            r3.append(r4)
            androidx.lifecycle.p<java.util.Map<java.lang.String, com.android.billingclient.api.n>> r4 = r5.f13159e
            java.lang.Object r4 = r4.d()
            if (r4 != 0) goto L_0x00a9
            r1 = 1
        L_0x00a9:
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            android.util.Log.i(r2, r0)
            androidx.lifecycle.p<java.util.Map<java.lang.String, com.android.billingclient.api.n>> r0 = r5.f13159e
            java.lang.Object r0 = r0.d()
            if (r0 == 0) goto L_0x00d1
            if (r7 != 0) goto L_0x00d1
            java.lang.String r7 = "Check sku regular."
            android.util.Log.i(r2, r7)
            androidx.lifecycle.p<java.util.Map<java.lang.String, com.android.billingclient.api.n>> r7 = r5.f13159e
            java.lang.Object r7 = r7.d()
            java.util.Map r7 = (java.util.Map) r7
            java.lang.Object r6 = r7.get(r6)
            r7 = r6
            com.android.billingclient.api.n r7 = (com.android.billingclient.api.n) r7
        L_0x00d1:
            if (r7 != 0) goto L_0x00d9
            java.lang.String r6 = "Could not find SkuDetails to make purchase."
            android.util.Log.e(r2, r6)
            return
        L_0x00d9:
            com.android.billingclient.api.f$a r6 = com.android.billingclient.api.f.f()
            r6.b(r7)
            com.android.billingclient.api.f r6 = r6.a()
            java.lang.String r7 = "buyEvent 1"
            android.util.Log.i(r2, r7)
            com.tempmail.billing.f<com.android.billingclient.api.f> r7 = r5.f13158d
            r7.i(r6)
            java.lang.String r6 = "buyEvent 2"
            android.util.Log.i(r2, r6)
        L_0x00f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tempmail.w.a.h(java.lang.String, java.lang.String):void");
    }

    public void g(String str) {
        h(str, (String) null);
    }

    public void i() {
        int c2 = i.c(f().getApplicationContext());
        if (c2 == 1) {
            g("remove_ad_purchase");
        } else if (c2 == 2) {
            g("remove_ad_purchase_second");
        } else if (c2 == 3) {
            g("remove_ad_subscription");
        }
    }
}
