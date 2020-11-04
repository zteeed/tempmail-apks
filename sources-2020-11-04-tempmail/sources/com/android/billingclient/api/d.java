package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.text.TextUtils;
import com.android.billingclient.api.g;
import com.android.billingclient.api.j;
import com.android.billingclient.api.n;
import com.google.android.gms.internal.play_billing.zza;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzd;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;

/* compiled from: com.android.billingclient:billing@@3.0.0 */
class d extends c {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public int f2492a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final String f2493b;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f2494c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public f0 f2495d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public Context f2496e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public zza f2497f;
    private a g;
    /* access modifiers changed from: private */
    public boolean h;
    /* access modifiers changed from: private */
    public boolean i;
    /* access modifiers changed from: private */
    public boolean j;
    /* access modifiers changed from: private */
    public boolean k;
    /* access modifiers changed from: private */
    public boolean l;
    /* access modifiers changed from: private */
    public boolean m;
    /* access modifiers changed from: private */
    public boolean n;
    /* access modifiers changed from: private */
    public boolean o;
    private boolean p;
    private ExecutorService q;
    private String r;
    private final ResultReceiver s;

    /* compiled from: com.android.billingclient:billing@@3.0.0 */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        private final List<k> f2502a;

        /* renamed from: b  reason: collision with root package name */
        private final g f2503b;

        b(g gVar, List<k> list) {
            this.f2502a = list;
            this.f2503b = gVar;
        }

        /* access modifiers changed from: package-private */
        public final g a() {
            return this.f2503b;
        }

        /* access modifiers changed from: package-private */
        public final List<k> b() {
            return this.f2502a;
        }
    }

    d(String str, boolean z, Context context, m mVar) {
        this(context, z, mVar, s(), (String) null);
    }

    /* access modifiers changed from: private */
    public final g D() {
        int i2 = this.f2492a;
        if (i2 == 0 || i2 == 3) {
            return a0.m;
        }
        return a0.k;
    }

    /* access modifiers changed from: private */
    public final j.a E(String str) {
        Bundle bundle;
        String valueOf = String.valueOf(str);
        zzb.i("BillingClient", valueOf.length() != 0 ? "Querying owned items, item type: ".concat(valueOf) : new String("Querying owned items, item type: "));
        ArrayList arrayList = new ArrayList();
        Bundle f2 = zzb.f(this.l, this.p, this.f2493b);
        String str2 = null;
        do {
            try {
                if (this.l) {
                    bundle = this.f2497f.n4(9, this.f2496e.getPackageName(), str, str2, f2);
                } else {
                    bundle = this.f2497f.y1(3, this.f2496e.getPackageName(), str, str2);
                }
                g a2 = c0.a(bundle, "BillingClient", "getPurchase()");
                if (a2 != a0.l) {
                    return new j.a(a2, (List<j>) null);
                }
                ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                int i2 = 0;
                while (i2 < stringArrayList2.size()) {
                    String str3 = stringArrayList2.get(i2);
                    String str4 = stringArrayList3.get(i2);
                    String valueOf2 = String.valueOf(stringArrayList.get(i2));
                    zzb.i("BillingClient", valueOf2.length() != 0 ? "Sku is owned: ".concat(valueOf2) : new String("Sku is owned: "));
                    try {
                        j jVar = new j(str3, str4);
                        if (TextUtils.isEmpty(jVar.e())) {
                            zzb.l("BillingClient", "BUG: empty/null token!");
                        }
                        arrayList.add(jVar);
                        i2++;
                    } catch (JSONException e2) {
                        String valueOf3 = String.valueOf(e2);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 48);
                        sb.append("Got an exception trying to decode the purchase: ");
                        sb.append(valueOf3);
                        zzb.l("BillingClient", sb.toString());
                        return new j.a(a0.k, (List<j>) null);
                    }
                }
                str2 = bundle.getString("INAPP_CONTINUATION_TOKEN");
                String valueOf4 = String.valueOf(str2);
                zzb.i("BillingClient", valueOf4.length() != 0 ? "Continuation token: ".concat(valueOf4) : new String("Continuation token: "));
            } catch (Exception e3) {
                String valueOf5 = String.valueOf(e3);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf5).length() + 57);
                sb2.append("Got exception trying to get purchases: ");
                sb2.append(valueOf5);
                sb2.append("; try to reconnect");
                zzb.l("BillingClient", sb2.toString());
                return new j.a(a0.m, (List<j>) null);
            }
        } while (!TextUtils.isEmpty(str2));
        return new j.a(a0.l, arrayList);
    }

    private void k(Context context, m mVar, boolean z) {
        Context applicationContext = context.getApplicationContext();
        this.f2496e = applicationContext;
        this.f2495d = new f0(applicationContext, mVar);
        this.p = z;
    }

    /* access modifiers changed from: private */
    public final b m(String str) {
        String valueOf = String.valueOf(str);
        zzb.i("BillingClient", valueOf.length() != 0 ? "Querying purchase history, item type: ".concat(valueOf) : new String("Querying purchase history, item type: "));
        ArrayList arrayList = new ArrayList();
        Bundle f2 = zzb.f(this.l, this.p, this.f2493b);
        String str2 = null;
        while (this.j) {
            try {
                Bundle s6 = this.f2497f.s6(6, this.f2496e.getPackageName(), str, str2, f2);
                g a2 = c0.a(s6, "BillingClient", "getPurchaseHistory()");
                if (a2 != a0.l) {
                    return new b(a2, (List<k>) null);
                }
                ArrayList<String> stringArrayList = s6.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = s6.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = s6.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                int i2 = 0;
                while (i2 < stringArrayList2.size()) {
                    String str3 = stringArrayList2.get(i2);
                    String str4 = stringArrayList3.get(i2);
                    String valueOf2 = String.valueOf(stringArrayList.get(i2));
                    zzb.i("BillingClient", valueOf2.length() != 0 ? "Purchase record found for sku : ".concat(valueOf2) : new String("Purchase record found for sku : "));
                    try {
                        k kVar = new k(str3, str4);
                        if (TextUtils.isEmpty(kVar.b())) {
                            zzb.l("BillingClient", "BUG: empty/null token!");
                        }
                        arrayList.add(kVar);
                        i2++;
                    } catch (JSONException e2) {
                        String valueOf3 = String.valueOf(e2);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 48);
                        sb.append("Got an exception trying to decode the purchase: ");
                        sb.append(valueOf3);
                        zzb.l("BillingClient", sb.toString());
                        return new b(a0.k, (List<k>) null);
                    }
                }
                str2 = s6.getString("INAPP_CONTINUATION_TOKEN");
                String valueOf4 = String.valueOf(str2);
                zzb.i("BillingClient", valueOf4.length() != 0 ? "Continuation token: ".concat(valueOf4) : new String("Continuation token: "));
                if (TextUtils.isEmpty(str2)) {
                    return new b(a0.l, arrayList);
                }
            } catch (RemoteException e3) {
                String valueOf5 = String.valueOf(e3);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf5).length() + 64);
                sb2.append("Got exception trying to get purchase history: ");
                sb2.append(valueOf5);
                sb2.append("; try to reconnect");
                zzb.l("BillingClient", sb2.toString());
                return new b(a0.m, (List<k>) null);
            }
        }
        zzb.l("BillingClient", "getPurchaseHistory is not supported on current device");
        return new b(a0.i, (List<k>) null);
    }

    private final g n(g gVar) {
        this.f2495d.c().h(gVar, (List<j>) null);
        return gVar;
    }

    private static String s() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get((Object) null);
        } catch (Exception unused) {
            return "3.0.0";
        }
    }

    /* access modifiers changed from: private */
    public final <T> Future<T> u(Callable<T> callable, long j2, Runnable runnable) {
        long j3 = (long) (((double) j2) * 0.95d);
        if (this.q == null) {
            this.q = Executors.newFixedThreadPool(zzb.f10008a);
        }
        try {
            Future<T> submit = this.q.submit(callable);
            this.f2494c.postDelayed(new t0(this, submit, runnable), j3);
            return submit;
        } catch (Exception e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb.append("Async task throws exception ");
            sb.append(valueOf);
            zzb.l("BillingClient", sb.toString());
            return null;
        }
    }

    /* access modifiers changed from: private */
    public final void x(h hVar, i iVar) {
        String str;
        int i2;
        String a2 = hVar.a();
        try {
            String valueOf = String.valueOf(a2);
            zzb.i("BillingClient", valueOf.length() != 0 ? "Consuming purchase with token: ".concat(valueOf) : new String("Consuming purchase with token: "));
            if (this.l) {
                Bundle j6 = this.f2497f.j6(9, this.f2496e.getPackageName(), a2, zzb.e(hVar, this.l, this.f2493b));
                int i3 = j6.getInt("RESPONSE_CODE");
                str = zzb.k(j6, "BillingClient");
                i2 = i3;
            } else {
                i2 = this.f2497f.t3(3, this.f2496e.getPackageName(), a2);
                str = "";
            }
            g.a c2 = g.c();
            c2.c(i2);
            c2.b(str);
            g a3 = c2.a();
            if (i2 == 0) {
                y(new w0(this, iVar, a3, a2));
            } else {
                y(new v0(this, i2, iVar, a3, a2));
            }
        } catch (Exception e2) {
            y(new x0(this, e2, iVar, a2));
        }
    }

    /* access modifiers changed from: private */
    public final void y(Runnable runnable) {
        if (!Thread.interrupted()) {
            this.f2494c.post(runnable);
        }
    }

    public void a(a aVar, b bVar) {
        if (!d()) {
            bVar.a(a0.m);
        } else if (TextUtils.isEmpty(aVar.a())) {
            zzb.l("BillingClient", "Please provide a valid purchase token.");
            bVar.a(a0.j);
        } else if (!this.l) {
            bVar.a(a0.f2484b);
        } else if (u(new p0(this, aVar, bVar), 30000, new u0(this, bVar)) == null) {
            bVar.a(D());
        }
    }

    public void b(h hVar, i iVar) {
        if (!d()) {
            iVar.a(a0.m, hVar.a());
        } else if (u(new m0(this, hVar, iVar), 30000, new l0(this, iVar, hVar)) == null) {
            iVar.a(D(), hVar.a());
        }
    }

    public void c() {
        try {
            this.f2495d.d();
            if (this.g != null) {
                this.g.b();
            }
            if (!(this.g == null || this.f2497f == null)) {
                zzb.i("BillingClient", "Unbinding from service.");
                this.f2496e.unbindService(this.g);
                this.g = null;
            }
            this.f2497f = null;
            if (this.q != null) {
                this.q.shutdownNow();
                this.q = null;
            }
        } catch (Exception e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
            sb.append("There was an exception while ending connection: ");
            sb.append(valueOf);
            zzb.l("BillingClient", sb.toString());
        } finally {
            this.f2492a = 3;
        }
    }

    public boolean d() {
        return (this.f2492a != 2 || this.f2497f == null || this.g == null) ? false : true;
    }

    public g e(Activity activity, f fVar) {
        long j2;
        Future future;
        int i2;
        Activity activity2 = activity;
        f fVar2 = fVar;
        if (!d()) {
            g gVar = a0.m;
            n(gVar);
            return gVar;
        }
        ArrayList<n> i3 = fVar.i();
        n nVar = i3.get(0);
        String g2 = nVar.g();
        if (!g2.equals("subs") || this.h) {
            boolean z = fVar.a() != null;
            if (z && !this.i) {
                zzb.l("BillingClient", "Current client doesn't support subscriptions update.");
                g gVar2 = a0.p;
                n(gVar2);
                return gVar2;
            } else if (!fVar.o() || this.j) {
                String str = "";
                for (int i4 = 0; i4 < i3.size(); i4++) {
                    String valueOf = String.valueOf(str);
                    String valueOf2 = String.valueOf(i3.get(i4));
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
                    sb.append(valueOf);
                    sb.append(valueOf2);
                    str = sb.toString();
                    if (i4 < i3.size() - 1) {
                        str = String.valueOf(str).concat(", ");
                    }
                }
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 41 + String.valueOf(g2).length());
                sb2.append("Constructing buy intent for ");
                sb2.append(str);
                sb2.append(", item type: ");
                sb2.append(g2);
                zzb.i("BillingClient", sb2.toString());
                if (this.j) {
                    Bundle d2 = zzb.d(fVar2, this.l, this.p, this.f2493b);
                    if (!nVar.i().isEmpty()) {
                        d2.putString("skuDetailsToken", nVar.i());
                    }
                    if (!TextUtils.isEmpty(nVar.h())) {
                        d2.putString("skuPackageName", nVar.h());
                    }
                    if (!TextUtils.isEmpty(this.r)) {
                        d2.putString("accountName", this.r);
                    }
                    if (i3.size() > 1) {
                        ArrayList arrayList = new ArrayList(i3.size() - 1);
                        for (int i5 = 1; i5 < i3.size(); i5++) {
                            arrayList.add(i3.get(i5).f());
                        }
                        d2.putStringArrayList("additionalSkus", arrayList);
                    }
                    if (this.l) {
                        i2 = 9;
                    } else {
                        i2 = fVar.e() ? 7 : 6;
                    }
                    s sVar = r0;
                    s sVar2 = new s(this, i2, nVar, g2, fVar, d2);
                    future = u(sVar, 5000, (Runnable) null);
                    j2 = 5000;
                } else {
                    j2 = 5000;
                    if (z) {
                        future = u(new r(this, fVar2, nVar), 5000, (Runnable) null);
                    } else {
                        future = u(new u(this, nVar, g2), 5000, (Runnable) null);
                    }
                }
                try {
                    Bundle bundle = (Bundle) future.get(j2, TimeUnit.MILLISECONDS);
                    int b2 = zzb.b(bundle, "BillingClient");
                    String k2 = zzb.k(bundle, "BillingClient");
                    if (b2 != 0) {
                        StringBuilder sb3 = new StringBuilder(52);
                        sb3.append("Unable to buy item, Error response code: ");
                        sb3.append(b2);
                        zzb.l("BillingClient", sb3.toString());
                        g.a c2 = g.c();
                        c2.c(b2);
                        c2.b(k2);
                        g a2 = c2.a();
                        n(a2);
                        return a2;
                    }
                    Intent intent = new Intent(activity2, ProxyBillingActivity.class);
                    intent.putExtra("result_receiver", this.s);
                    intent.putExtra("BUY_INTENT", (PendingIntent) bundle.getParcelable("BUY_INTENT"));
                    activity2.startActivity(intent);
                    return a0.l;
                } catch (CancellationException | TimeoutException unused) {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 68);
                    sb4.append("Time out while launching billing flow: ; for sku: ");
                    sb4.append(str);
                    sb4.append("; try to reconnect");
                    zzb.l("BillingClient", sb4.toString());
                    g gVar3 = a0.n;
                    n(gVar3);
                    return gVar3;
                } catch (Exception unused2) {
                    StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 69);
                    sb5.append("Exception while launching billing flow: ; for sku: ");
                    sb5.append(str);
                    sb5.append("; try to reconnect");
                    zzb.l("BillingClient", sb5.toString());
                    g gVar4 = a0.m;
                    n(gVar4);
                    return gVar4;
                }
            } else {
                zzb.l("BillingClient", "Current client doesn't support extra params for buy intent.");
                g gVar5 = a0.h;
                n(gVar5);
                return gVar5;
            }
        } else {
            zzb.l("BillingClient", "Current client doesn't support subscriptions.");
            g gVar6 = a0.o;
            n(gVar6);
            return gVar6;
        }
    }

    public void g(String str, l lVar) {
        if (!d()) {
            lVar.a(a0.m, (List<k>) null);
        } else if (u(new o0(this, str, lVar), 30000, new q0(this, lVar)) == null) {
            lVar.a(D(), (List<k>) null);
        }
    }

    public j.a h(String str) {
        if (!d()) {
            return new j.a(a0.m, (List<j>) null);
        }
        if (TextUtils.isEmpty(str)) {
            zzb.l("BillingClient", "Please provide a valid SKU type.");
            return new j.a(a0.g, (List<j>) null);
        }
        try {
            return (j.a) u(new t(this, str), 5000, (Runnable) null).get(5000, TimeUnit.MILLISECONDS);
        } catch (CancellationException | TimeoutException unused) {
            return new j.a(a0.n, (List<j>) null);
        } catch (Exception unused2) {
            return new j.a(a0.k, (List<j>) null);
        }
    }

    public void i(o oVar, p pVar) {
        if (!d()) {
            pVar.e(a0.m, (List<n>) null);
            return;
        }
        String a2 = oVar.a();
        List<String> b2 = oVar.b();
        String d2 = oVar.d();
        if (TextUtils.isEmpty(a2)) {
            zzb.l("BillingClient", "Please fix the input params. SKU type can't be empty.");
            pVar.e(a0.g, (List<n>) null);
        } else if (b2 == null) {
            zzb.l("BillingClient", "Please fix the input params. The list of SKUs can't be empty.");
            pVar.e(a0.f2488f, (List<n>) null);
        } else if (!this.o && d2 != null) {
            zzb.l("BillingClient", "The user's client is too old to handle skuPackageName from SkuDetails.");
            pVar.e(a0.f2487e, (List<n>) null);
        } else if (u(new i0(this, a2, b2, d2, pVar), 30000, new j0(this, pVar)) == null) {
            pVar.e(D(), (List<n>) null);
        }
    }

    public void j(e eVar) {
        ServiceInfo serviceInfo;
        if (d()) {
            zzb.i("BillingClient", "Service connection is valid. No need to re-initialize.");
            eVar.j(a0.l);
            return;
        }
        int i2 = this.f2492a;
        if (i2 == 1) {
            zzb.l("BillingClient", "Client is already in the process of connecting to billing service.");
            eVar.j(a0.f2486d);
        } else if (i2 == 3) {
            zzb.l("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            eVar.j(a0.m);
        } else {
            this.f2492a = 1;
            this.f2495d.b();
            zzb.i("BillingClient", "Starting in-app billing setup.");
            this.g = new a(this, eVar, (zzh) null);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            List<ResolveInfo> queryIntentServices = this.f2496e.getPackageManager().queryIntentServices(intent, 0);
            if (!(queryIntentServices == null || queryIntentServices.isEmpty() || (serviceInfo = queryIntentServices.get(0).serviceInfo) == null)) {
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if (!"com.android.vending".equals(str) || str2 == null) {
                    zzb.l("BillingClient", "The device doesn't have valid Play Store.");
                } else {
                    ComponentName componentName = new ComponentName(str, str2);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    intent2.putExtra("playBillingLibraryVersion", this.f2493b);
                    if (this.f2496e.bindService(intent2, this.g, 1)) {
                        zzb.i("BillingClient", "Service was bonded successfully.");
                        return;
                    }
                    zzb.l("BillingClient", "Connection to Billing service is blocked.");
                }
            }
            this.f2492a = 0;
            zzb.i("BillingClient", "Billing service unavailable on device.");
            eVar.j(a0.f2485c);
        }
    }

    /* access modifiers changed from: package-private */
    public final n.a p(String str, List<String> list, String str2) {
        Bundle bundle;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 20;
            ArrayList arrayList2 = new ArrayList(list.subList(i2, i3 > size ? size : i3));
            Bundle bundle2 = new Bundle();
            bundle2.putStringArrayList("ITEM_ID_LIST", arrayList2);
            bundle2.putString("playBillingLibraryVersion", this.f2493b);
            try {
                if (this.m) {
                    bundle = this.f2497f.U5(10, this.f2496e.getPackageName(), str, bundle2, zzb.g(this.l, this.o, this.p, this.f2493b, str2));
                    String str3 = str;
                } else {
                    String str4 = str2;
                    bundle = this.f2497f.o4(3, this.f2496e.getPackageName(), str, bundle2);
                }
                if (bundle == null) {
                    zzb.l("BillingClient", "querySkuDetailsAsync got null sku details list");
                    return new n.a(4, "Null sku details list", (List<n>) null);
                } else if (!bundle.containsKey("DETAILS_LIST")) {
                    int b2 = zzb.b(bundle, "BillingClient");
                    String k2 = zzb.k(bundle, "BillingClient");
                    if (b2 != 0) {
                        StringBuilder sb = new StringBuilder(50);
                        sb.append("getSkuDetails() failed. Response code: ");
                        sb.append(b2);
                        zzb.l("BillingClient", sb.toString());
                        return new n.a(b2, k2, arrayList);
                    }
                    zzb.l("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a detail list.");
                    return new n.a(6, k2, arrayList);
                } else {
                    ArrayList<String> stringArrayList = bundle.getStringArrayList("DETAILS_LIST");
                    if (stringArrayList == null) {
                        zzb.l("BillingClient", "querySkuDetailsAsync got null response list");
                        return new n.a(4, "querySkuDetailsAsync got null response list", (List<n>) null);
                    }
                    int i4 = 0;
                    while (i4 < stringArrayList.size()) {
                        try {
                            n nVar = new n(stringArrayList.get(i4));
                            String valueOf = String.valueOf(nVar);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 17);
                            sb2.append("Got sku details: ");
                            sb2.append(valueOf);
                            zzb.i("BillingClient", sb2.toString());
                            arrayList.add(nVar);
                            i4++;
                        } catch (JSONException unused) {
                            zzb.l("BillingClient", "Got a JSON exception trying to decode SkuDetails.");
                            return new n.a(6, "Error trying to decode SkuDetails.", (List<n>) null);
                        }
                    }
                    i2 = i3;
                }
            } catch (Exception e2) {
                String valueOf2 = String.valueOf(e2);
                StringBuilder sb3 = new StringBuilder("querySkuDetailsAsync got a remote exception (try to reconnect).".length() + String.valueOf(valueOf2).length());
                sb3.append("querySkuDetailsAsync got a remote exception (try to reconnect).");
                sb3.append(valueOf2);
                zzb.l("BillingClient", sb3.toString());
                return new n.a(-1, "Service connection is disconnected.", (List<n>) null);
            }
        }
        return new n.a(0, "", arrayList);
    }

    private d(Context context, boolean z, m mVar, String str, String str2) {
        this.f2492a = 0;
        this.f2494c = new Handler(Looper.getMainLooper());
        this.s = new zzh(this, this.f2494c);
        this.r = str2;
        this.f2493b = str;
        k(context, mVar, z);
    }

    /* compiled from: com.android.billingclient:billing@@3.0.0 */
    private final class a implements ServiceConnection {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final Object f2498a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public boolean f2499b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public e f2500c;

        private a(e eVar) {
            this.f2498a = new Object();
            this.f2499b = false;
            this.f2500c = eVar;
        }

        /* access modifiers changed from: private */
        public final void d(g gVar) {
            d.this.y(new v(this, gVar));
        }

        /* access modifiers changed from: package-private */
        public final void b() {
            synchronized (this.f2498a) {
                this.f2500c = null;
                this.f2499b = true;
            }
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            zzb.i("BillingClient", "Billing service connected.");
            zza unused = d.this.f2497f = zzd.B(iBinder);
            if (d.this.u(new x(this), 30000, new w(this)) == null) {
                d(d.this.D());
            }
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            zzb.l("BillingClient", "Billing service disconnected.");
            zza unused = d.this.f2497f = null;
            int unused2 = d.this.f2492a = 0;
            synchronized (this.f2498a) {
                if (this.f2500c != null) {
                    this.f2500c.k();
                }
            }
        }

        /* synthetic */ a(d dVar, e eVar, zzh zzh) {
            this(eVar);
        }
    }
}
