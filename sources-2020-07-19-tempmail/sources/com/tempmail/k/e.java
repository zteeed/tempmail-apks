package com.tempmail.k;

import android.app.Activity;
import com.android.billingclient.api.b;
import com.android.billingclient.api.d;
import com.android.billingclient.api.e;
import com.android.billingclient.api.g;
import com.android.billingclient.api.h;
import com.android.billingclient.api.i;
import com.tempmail.utils.m;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BillingManager */
public class e implements com.android.billingclient.api.f {
    private static final String g = (com.tempmail.utils.e.S() ? "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAsrwVoMP+3JFxYaQB1sVjVoriW9vsSrJ5Ft6QJ04aOUTJbwbE7kePsg7l0q5C0aJA9C5LBNB05gwuk75sm17MSF8VNhnR2ufralU8qQwWhACOvVD6XtzkRWmsoRaAjj0OuacbAObxuEbvyXsk+LFrZ8ij5KB+nbKlAfOh1c0Cm1x98lfGIK6d61Qbe/RT1vbQHjBrgOVmM9elmnKKweqbFkI8DzEV40biNTk+62vQlhMmxKBmwpJFUoF8/d0xabzWyqiIZYJht7jy7eVLOP56PKcwwfHiF482AOlrIiUOCXvspBVyaKxzIDy/x5J3sJgMSgqtrh1CKdPC+CBu0NI4tQIDAQAB" : "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAhq5ssfpxl4wx4BfxdS2lORbkzBwp9oFqeaBUepRr+SH5JkfHH2ostM7raekqt1ZQ5qdC9EnNNOAzNiNzTKhNs2y4Eei8RYwWNZgfaNv4zgSY9lPCEmqsuWafcqpcytJK8MOfn0CtbOGMTm1ICyblLg/b1c9IAwuBmnVP9PTXzr1tZAy6ogAALhW8vBuyUpCxoWAkYLsOmHZNQVMGEL1hm+ZXcdZxvztTz84++wkqpNcwZrONmWYXFL/XIQIX+hR+IWm/+ZAeX/JLcxVLyMUI97/tVBWLOIANgvgL1NvtxdXMKeJGrrsU2vkmV5Eym7ICLFwh1kbsZkT5Fob/SBFm8wIDAQAB");

    /* renamed from: a  reason: collision with root package name */
    private final f f12404a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Activity f12405b;

    /* renamed from: c  reason: collision with root package name */
    private final List<com.android.billingclient.api.e> f12406c = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public com.android.billingclient.api.b f12407d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public boolean f12408e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public int f12409f = -1;

    /* compiled from: BillingManager */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f12410b;

        a(g gVar) {
            this.f12410b = gVar;
        }

        public void run() {
            d.b p = com.android.billingclient.api.d.p();
            p.d(this.f12410b);
            e.this.f12407d.b(e.this.f12405b, p.a());
        }
    }

    /* compiled from: BillingManager */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f12412b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f12413c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f12414d;

        b(ArrayList arrayList, String str, String str2) {
            this.f12412b = arrayList;
            this.f12413c = str;
            this.f12414d = str2;
        }

        public void run() {
            StringBuilder sb = new StringBuilder();
            sb.append("Launching in-app purchase flow. Replace old SKU? ");
            sb.append(this.f12412b != null);
            m.b("BillingManager", sb.toString());
            d.b p = com.android.billingclient.api.d.p();
            p.c(this.f12413c);
            p.e(this.f12414d);
            p.b(this.f12412b);
            e.this.f12407d.b(e.this.f12405b, p.a());
        }
    }

    /* compiled from: BillingManager */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f12416b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f12417c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ i f12418d;

        /* compiled from: BillingManager */
        class a implements i {
            a() {
            }

            public void a(int i, List<g> list) {
                c.this.f12418d.a(i, list);
            }
        }

        c(List list, String str, i iVar) {
            this.f12416b = list;
            this.f12417c = str;
            this.f12418d = iVar;
        }

        public void run() {
            h.b e2 = h.e();
            e2.b(this.f12416b);
            e2.c(this.f12417c);
            e.this.f12407d.e(e2.a(), new a());
        }
    }

    /* compiled from: BillingManager */
    class d implements Runnable {
        d() {
        }

        public void run() {
            long currentTimeMillis = System.currentTimeMillis();
            e.a d2 = e.this.f12407d.d("inapp");
            m.d("BillingManager", "Querying purchases elapsed time: " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
            if (e.this.g()) {
                e.a d3 = e.this.f12407d.d("subs");
                List a2 = d3.a();
                if (a2 == null) {
                    a2 = new ArrayList();
                }
                m.d("BillingManager", "Querying purchases and subscriptions elapsed time: " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
                m.d("BillingManager", "Querying subscriptions result code: " + d3.b() + " res: " + a2.size());
                if (d3.b() != 0) {
                    m.c("BillingManager", "Got an error response trying to query subscription purchases");
                } else if (d2.a() != null) {
                    d2.a().addAll(a2);
                }
            } else if (d2.b() == 0) {
                m.d("BillingManager", "Skipped subscription purchases query since they are not supported");
            } else {
                m.f("BillingManager", "queryPurchases() got an error response code: " + d2.b());
            }
            e.this.o(d2);
        }
    }

    /* renamed from: com.tempmail.k.e$e  reason: collision with other inner class name */
    /* compiled from: BillingManager */
    class C0124e implements com.android.billingclient.api.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f12422a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Runnable f12423b;

        C0124e(Runnable runnable, Runnable runnable2) {
            this.f12422a = runnable;
            this.f12423b = runnable2;
        }

        public void a(int i) {
            m.b("BillingManager", "Setup finished. Response code: " + i);
            if (i == 0) {
                boolean unused = e.this.f12408e = true;
                Runnable runnable = this.f12422a;
                if (runnable != null) {
                    runnable.run();
                }
            } else {
                Runnable runnable2 = this.f12423b;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
            int unused2 = e.this.f12409f = i;
        }

        public void b() {
            boolean unused = e.this.f12408e = false;
        }
    }

    /* compiled from: BillingManager */
    public interface f {
        void a();

        void b();

        void c(List<com.android.billingclient.api.e> list);

        void d();
    }

    public e(Activity activity, f fVar) {
        m.b("BillingManager", "Creating Billing client.");
        this.f12405b = activity;
        this.f12404a = fVar;
        b.C0066b c2 = com.android.billingclient.api.b.c(activity);
        c2.b(this);
        this.f12407d = c2.a();
        m.b("BillingManager", "Starting setup.");
        a aVar = new a(this);
        f fVar2 = this.f12404a;
        fVar2.getClass();
        r(aVar, new b(fVar2));
    }

    private void h(Runnable runnable) {
        if (this.f12408e) {
            runnable.run();
            return;
        }
        f fVar = this.f12404a;
        fVar.getClass();
        r(runnable, new b(fVar));
    }

    private void j(com.android.billingclient.api.e eVar) {
        if (!s(eVar.b(), eVar.e())) {
            m.d("BillingManager", "Got a purchase: " + eVar + "; but signature is bad. Skipping...");
            return;
        }
        m.b("BillingManager", "Got a verified purchase: " + eVar);
        this.f12406c.add(eVar);
    }

    /* access modifiers changed from: private */
    public void o(e.a aVar) {
        if (this.f12407d == null || aVar.b() != 0) {
            m.f("BillingManager", "Billing client was null or result code (" + aVar.b() + ") was bad - quitting");
            return;
        }
        m.b("BillingManager", "Query inventory was successful.");
        this.f12406c.clear();
        a(0, aVar.a());
    }

    private boolean s(String str, String str2) {
        if (!g.contains("CONSTRUCT_YOUR")) {
            try {
                return g.c(g, str, str2);
            } catch (IOException e2) {
                m.c("BillingManager", "Got an exception trying to validate a purchase: " + e2);
                return false;
            }
        } else {
            throw new RuntimeException("Please update your app's public key at: BASE_64_ENCODED_PUBLIC_KEY");
        }
    }

    public void a(int i, List<com.android.billingclient.api.e> list) {
        if (i == 0) {
            if (list != null) {
                for (com.android.billingclient.api.e j : list) {
                    j(j);
                }
            }
            this.f12404a.c(this.f12406c);
        } else if (i == 1) {
            m.d("BillingManager", "onPurchasesUpdated() - user cancelled the purchase flow - skipping");
        } else {
            this.f12404a.d();
            m.f("BillingManager", "onPurchasesUpdated() got unknown resultCode: " + i);
        }
    }

    public boolean g() {
        int a2 = this.f12407d.a("subscriptions");
        if (a2 != 0) {
            m.f("BillingManager", "areSubscriptionsSupported() got an error response: " + a2);
        }
        return a2 == 0;
    }

    public int i() {
        return this.f12409f;
    }

    public void k(g gVar) {
        h(new a(gVar));
    }

    public void l(String str, String str2) {
        m(str, (ArrayList<String>) null, str2);
    }

    public void m(String str, ArrayList<String> arrayList, String str2) {
        h(new b(arrayList, str, str2));
    }

    public /* synthetic */ void n() {
        this.f12404a.a();
        m.b("BillingManager", "Setup successful. Querying inventory.");
        p();
    }

    public void p() {
        h(new d());
    }

    public void q(String str, List<String> list, i iVar) {
        h(new c(list, str, iVar));
    }

    public void r(Runnable runnable, Runnable runnable2) {
        this.f12407d.f(new C0124e(runnable, runnable2));
    }
}
