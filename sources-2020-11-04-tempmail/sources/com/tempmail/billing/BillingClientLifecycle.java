package com.tempmail.billing;

import android.app.Activity;
import android.app.Application;
import androidx.lifecycle.g;
import androidx.lifecycle.j;
import androidx.lifecycle.r;
import com.android.billingclient.api.a;
import com.android.billingclient.api.c;
import com.android.billingclient.api.e;
import com.android.billingclient.api.f;
import com.android.billingclient.api.g;
import com.android.billingclient.api.h;
import com.android.billingclient.api.i;
import com.android.billingclient.api.j;
import com.android.billingclient.api.m;
import com.android.billingclient.api.n;
import com.android.billingclient.api.o;
import com.android.billingclient.api.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BillingClientLifecycle implements j, m, e, p {
    private static volatile BillingClientLifecycle j;

    /* renamed from: a  reason: collision with root package name */
    public f<List<com.android.billingclient.api.j>> f12823a = new f<>();

    /* renamed from: b  reason: collision with root package name */
    public f<List<com.android.billingclient.api.j>> f12824b = new f<>();

    /* renamed from: c  reason: collision with root package name */
    public androidx.lifecycle.p<List<com.android.billingclient.api.j>> f12825c = new androidx.lifecycle.p<>();

    /* renamed from: d  reason: collision with root package name */
    public androidx.lifecycle.p<List<com.android.billingclient.api.j>> f12826d = new androidx.lifecycle.p<>();

    /* renamed from: e  reason: collision with root package name */
    public androidx.lifecycle.p<Map<String, n>> f12827e = new androidx.lifecycle.p<>();

    /* renamed from: f  reason: collision with root package name */
    public androidx.lifecycle.p<Map<String, n>> f12828f = new androidx.lifecycle.p<>();
    public androidx.lifecycle.p<Void> g = new androidx.lifecycle.p<>();
    private Application h;
    private c i;

    private BillingClientLifecycle(Application application) {
        this.h = application;
    }

    public static BillingClientLifecycle n(Application application) {
        if (j == null) {
            synchronized (BillingClientLifecycle.class) {
                if (j == null) {
                    j = new BillingClientLifecycle(application);
                }
            }
        }
        return j;
    }

    public static com.android.billingclient.api.j o(List<com.android.billingclient.api.j> list) {
        for (com.android.billingclient.api.j next : list) {
            com.tempmail.utils.m.b("BillingLifecycle", "getRemoveAdPurchase " + next.toString());
            if (e.c(next)) {
                return next;
            }
        }
        return null;
    }

    private boolean p(List<com.android.billingclient.api.j> list) {
        return false;
    }

    static /* synthetic */ void q(g gVar) {
        int b2 = gVar.b();
        String a2 = gVar.a();
        com.tempmail.utils.m.b("BillingLifecycle", "acknowledgePurchase: " + b2 + " " + a2);
    }

    static /* synthetic */ void r(g gVar, List list) {
        if (gVar == null) {
            com.tempmail.utils.m.d("BillingLifecycle", "queryPurchaseHistoryAsync: null purchase result");
        } else if (list == null) {
            com.tempmail.utils.m.d("BillingLifecycle", "queryPurchaseHistoryAsync: null purchase list");
        } else {
            com.tempmail.utils.m.d("BillingLifecycle", "queryPurchaseHistoryAsync: not null purchase list");
        }
    }

    private void u(List<com.android.billingclient.api.j> list) {
        int i2 = 0;
        int i3 = 0;
        for (com.android.billingclient.api.j h2 : list) {
            if (h2.h()) {
                i2++;
            } else {
                i3++;
            }
        }
        com.tempmail.utils.m.b("BillingLifecycle", "logAcknowledgementStatus: acknowledged=" + i2 + " unacknowledged=" + i3);
    }

    private void v(List<com.android.billingclient.api.j> list) {
        if (list != null) {
            com.tempmail.utils.m.b("BillingLifecycle", "processPurchases: " + list.size() + " purchase(s)");
        } else {
            com.tempmail.utils.m.b("BillingLifecycle", "processPurchases: with no purchases");
        }
        if (p(list)) {
            com.tempmail.utils.m.b("BillingLifecycle", "processPurchases: Purchase list has not changed");
            return;
        }
        this.f12823a.i(list);
        this.f12825c.i(list);
        this.g.i(null);
        if (list != null) {
            u(list);
        }
    }

    private void w(List<com.android.billingclient.api.j> list) {
        if (list != null) {
            com.tempmail.utils.m.b("BillingLifecycle", "processPurchases: " + list.size() + " purchase(s)");
        } else {
            com.tempmail.utils.m.b("BillingLifecycle", "processPurchases: with no purchases");
        }
        if (p(list)) {
            com.tempmail.utils.m.b("BillingLifecycle", "processPurchases: Purchase list has not changed");
            return;
        }
        this.f12824b.i(list);
        this.f12826d.i(list);
        this.g.i(null);
        if (list != null) {
            u(list);
        }
    }

    public void A() {
        if (!this.i.d()) {
            com.tempmail.utils.m.c("BillingLifecycle", ": BillingClient is not ready");
        }
        com.tempmail.utils.m.b("BillingLifecycle", "queryPurchases: SUBS");
        j.a h2 = this.i.h("subs");
        if (h2 == null) {
            com.tempmail.utils.m.d("BillingLifecycle", "queryPurchases: null purchase result");
            v((List<com.android.billingclient.api.j>) null);
        } else if (h2.a() == null) {
            com.tempmail.utils.m.d("BillingLifecycle", "queryPurchases: null purchase list");
            v((List<com.android.billingclient.api.j>) null);
        } else {
            com.tempmail.utils.m.d("BillingLifecycle", "queryPurchases: not null purchase list");
            v(h2.a());
        }
    }

    public void B() {
        if (!this.i.d()) {
            com.tempmail.utils.m.c("BillingLifecycle", ": BillingClient is not ready");
        }
        com.tempmail.utils.m.b("BillingLifecycle", "queryPurchases: INAPP");
        j.a h2 = this.i.h("inapp");
        if (h2 == null) {
            com.tempmail.utils.m.d("BillingLifecycle", "queryPurchases: null purchase result");
            w((List<com.android.billingclient.api.j>) null);
        } else if (h2.a() == null) {
            com.tempmail.utils.m.d("BillingLifecycle", "queryPurchases: null purchase list");
            w((List<com.android.billingclient.api.j>) null);
        } else {
            com.tempmail.utils.m.d("BillingLifecycle", "queryPurchases: not null purchase list");
            w(h2.a());
        }
    }

    public void C() {
        com.tempmail.utils.m.b("BillingLifecycle", "querySkuDetails");
        List<String> b2 = d.b();
        o.a c2 = o.c();
        c2.c("subs");
        c2.b(b2);
        o a2 = c2.a();
        com.tempmail.utils.m.d("BillingLifecycle", "querySkuDetailsAsync");
        this.i.i(a2, this);
    }

    public void D() {
        com.tempmail.utils.m.b("BillingLifecycle", "querySkuDetails INAPP");
        List<String> a2 = d.a();
        o.a c2 = o.c();
        c2.c("inapp");
        c2.b(a2);
        o a3 = c2.a();
        com.tempmail.utils.m.d("BillingLifecycle", "querySkuDetailsAsync INAPP");
        this.i.i(a3, new a(this));
    }

    @r(g.a.ON_CREATE)
    public void create() {
        com.tempmail.utils.m.b("BillingLifecycle", "ON_CREATE");
        c.a f2 = c.f(this.h);
        f2.c(this);
        f2.b();
        c a2 = f2.a();
        this.i = a2;
        if (!a2.d()) {
            com.tempmail.utils.m.b("BillingLifecycle", "BillingClient: Start connection...");
            this.i.j(this);
        }
    }

    @r(g.a.ON_DESTROY)
    public void destroy() {
        com.tempmail.utils.m.b("BillingLifecycle", "ON_DESTROY");
        if (this.i.d()) {
            com.tempmail.utils.m.b("BillingLifecycle", "BillingClient can only be used once -- closing connection");
            this.i.c();
        }
    }

    public void e(com.android.billingclient.api.g gVar, List<n> list) {
        x(gVar, list, this.f12827e);
    }

    public void h(com.android.billingclient.api.g gVar, List<com.android.billingclient.api.j> list) {
        if (gVar == null) {
            com.tempmail.utils.m.g("BillingLifecycle", "onPurchasesUpdated: null BillingResult");
            return;
        }
        int b2 = gVar.b();
        gVar.a();
        com.tempmail.utils.m.b("BillingLifecycle", "onPurchasesUpdated: $responseCode $debugMessage");
        if (b2 != 0) {
            if (b2 == 1) {
                com.tempmail.utils.m.d("BillingLifecycle", "onPurchasesUpdated: User canceled the purchase");
            } else if (b2 == 5) {
                com.tempmail.utils.m.c("BillingLifecycle", "onPurchasesUpdated: Developer error means that Google Play does not recognize the configuration. If you are just getting started, make sure you have configured the application correctly in the Google Play Console. The SKU product ID must match and the APK you are using must be signed with release keys.");
            } else if (b2 == 7) {
                com.tempmail.utils.m.d("BillingLifecycle", "onPurchasesUpdated: The user already owns this item");
            }
        } else if (list == null) {
            com.tempmail.utils.m.b("BillingLifecycle", "onPurchasesUpdated: null purchase list");
            v((List<com.android.billingclient.api.j>) null);
        } else {
            y(list);
        }
    }

    public void j(com.android.billingclient.api.g gVar) {
        int b2 = gVar.b();
        String a2 = gVar.a();
        com.tempmail.utils.m.b("BillingLifecycle", "onBillingSetupFinished: " + b2 + " " + a2);
        if (b2 == 0) {
            C();
            D();
            A();
            B();
            z();
        }
    }

    public void k() {
        com.tempmail.utils.m.b("BillingLifecycle", "onBillingServiceDisconnected");
    }

    public void l(String str) {
        com.tempmail.utils.m.b("BillingLifecycle", "acknowledgePurchase");
        a.C0065a b2 = a.b();
        b2.b(str);
        this.i.a(b2.a(), b.f12830a);
    }

    public void m(String str, i iVar) {
        com.tempmail.utils.m.b("BillingLifecycle", "consumePurchase " + str);
        h.a b2 = h.b();
        b2.b(str);
        this.i.b(b2.a(), iVar);
    }

    public /* synthetic */ void s(com.android.billingclient.api.g gVar, List list) {
        x(gVar, list, this.f12828f);
    }

    public int t(Activity activity, f fVar) {
        String d2 = fVar.d();
        String a2 = fVar.a();
        com.tempmail.utils.m.d("BillingLifecycle", "launchBillingFlow: sku: " + d2 + ", oldSku: " + a2);
        if (!this.i.d()) {
            com.tempmail.utils.m.c("BillingLifecycle", "launchBillingFlow: BillingClient is not ready");
        }
        com.android.billingclient.api.g e2 = this.i.e(activity, fVar);
        int b2 = e2.b();
        String a3 = e2.a();
        com.tempmail.utils.m.b("BillingLifecycle", "launchBillingFlow: BillingResponse " + b2 + " " + a3);
        return b2;
    }

    public void x(com.android.billingclient.api.g gVar, List<n> list, androidx.lifecycle.p<Map<String, n>> pVar) {
        if (gVar == null) {
            com.tempmail.utils.m.g("BillingLifecycle", "onSkuDetailsResponse: null BillingResult");
            return;
        }
        int b2 = gVar.b();
        String a2 = gVar.a();
        switch (b2) {
            case -1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                com.tempmail.utils.m.c("BillingLifecycle", "onSkuDetailsResponse: " + b2 + " " + a2);
                return;
            case 0:
                com.tempmail.utils.m.d("BillingLifecycle", "onSkuDetailsResponse: " + b2 + " " + a2);
                if (list == null) {
                    com.tempmail.utils.m.f("BillingLifecycle", "onSkuDetailsResponse: null SkuDetails list");
                    pVar.i(Collections.emptyMap());
                    return;
                }
                HashMap hashMap = new HashMap();
                for (n next : list) {
                    hashMap.put(next.f(), next);
                }
                pVar.i(hashMap);
                com.tempmail.utils.m.d("BillingLifecycle", "onSkuDetailsResponse: count " + hashMap.size());
                return;
            case 1:
                com.tempmail.utils.m.d("BillingLifecycle", "onSkuDetailsResponse: " + b2 + " " + a2);
                return;
            default:
                com.tempmail.utils.m.g("BillingLifecycle", "onSkuDetailsResponse: " + b2 + " " + a2);
                return;
        }
    }

    public void y(List<com.android.billingclient.api.j> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (com.android.billingclient.api.j next : list) {
            if (e.c(next)) {
                arrayList.add(next);
            } else {
                arrayList2.add(next);
            }
        }
        v(arrayList2);
        w(arrayList);
    }

    public void z() {
        if (!this.i.d()) {
            com.tempmail.utils.m.c("BillingLifecycle", ": BillingClient is not ready");
        }
        com.tempmail.utils.m.b("BillingLifecycle", "queryPurchaseHistoryAsync: SUBS");
        this.i.g("subs", c.f12831a);
    }
}
