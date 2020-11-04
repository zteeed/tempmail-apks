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
import android.os.ResultReceiver;
import android.text.TextUtils;
import b.a.c.a.a;
import com.android.billingclient.api.e;
import com.android.billingclient.api.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;

class BillingClientImpl extends b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public int f2342a = 0;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f2343b = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final a f2344c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final Context f2345d;

    /* renamed from: e  reason: collision with root package name */
    private final int f2346e;

    /* renamed from: f  reason: collision with root package name */
    private final int f2347f;
    /* access modifiers changed from: private */
    public b.a.c.a.a g;
    private ServiceConnection h;
    /* access modifiers changed from: private */
    public boolean i;
    /* access modifiers changed from: private */
    public boolean j;
    /* access modifiers changed from: private */
    public boolean k;
    /* access modifiers changed from: private */
    public boolean l;
    private ExecutorService m;
    private final ResultReceiver n = new ResultReceiver(this.f2343b) {
        public void onReceiveResult(int i, Bundle bundle) {
            f b2 = BillingClientImpl.this.f2344c.b();
            if (b2 == null) {
                b.a.a.a.a.f("BillingClient", "PurchasesUpdatedListener is null - no way to return the response.");
            } else {
                b2.a(i, b.a.a.a.a.b(bundle));
            }
        }
    };

    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Future f2349b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Runnable f2350c;

        a(BillingClientImpl billingClientImpl, Future future, Runnable runnable) {
            this.f2349b = future;
            this.f2350c = runnable;
        }

        public void run() {
            if (!this.f2349b.isDone() && !this.f2349b.isCancelled()) {
                this.f2349b.cancel(true);
                b.a.a.a.a.f("BillingClient", "Async task is taking too long, cancel it!");
                Runnable runnable = this.f2350c;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
    }

    class b implements Callable<Integer> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f2351b;

        b(String str) {
            this.f2351b = str;
        }

        /* renamed from: a */
        public Integer call() throws Exception {
            return Integer.valueOf(BillingClientImpl.this.g.A2(7, BillingClientImpl.this.f2345d.getPackageName(), this.f2351b, BillingClientImpl.this.w()));
        }
    }

    class c implements Callable<Bundle> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f2353b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f2354c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f2355d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Bundle f2356e;

        c(int i, String str, String str2, Bundle bundle) {
            this.f2353b = i;
            this.f2354c = str;
            this.f2355d = str2;
            this.f2356e = bundle;
        }

        /* renamed from: a */
        public Bundle call() throws Exception {
            return BillingClientImpl.this.g.y2(this.f2353b, BillingClientImpl.this.f2345d.getPackageName(), this.f2354c, this.f2355d, (String) null, this.f2356e);
        }
    }

    class d implements Callable<Bundle> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f2358b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f2359c;

        d(d dVar, String str) {
            this.f2358b = dVar;
            this.f2359c = str;
        }

        /* renamed from: a */
        public Bundle call() throws Exception {
            return BillingClientImpl.this.g.h5(5, BillingClientImpl.this.f2345d.getPackageName(), Arrays.asList(new String[]{this.f2358b.i()}), this.f2359c, "subs", (String) null);
        }
    }

    class e implements Callable<Bundle> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f2361b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f2362c;

        e(String str, String str2) {
            this.f2361b = str;
            this.f2362c = str2;
        }

        /* renamed from: a */
        public Bundle call() throws Exception {
            return BillingClientImpl.this.g.t2(3, BillingClientImpl.this.f2345d.getPackageName(), this.f2361b, this.f2362c, (String) null);
        }
    }

    class f implements Callable<e.a> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f2364b;

        f(String str) {
            this.f2364b = str;
        }

        /* renamed from: a */
        public e.a call() throws Exception {
            return BillingClientImpl.this.A(this.f2364b, false);
        }
    }

    class g implements Callable<Void> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f2366b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f2367c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ i f2368d;

        class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ g.a f2370b;

            a(g.a aVar) {
                this.f2370b = aVar;
            }

            public void run() {
                g.this.f2368d.a(this.f2370b.a(), this.f2370b.b());
            }
        }

        g(String str, List list, i iVar) {
            this.f2366b = str;
            this.f2367c = list;
            this.f2368d = iVar;
        }

        /* renamed from: a */
        public Void call() {
            BillingClientImpl.this.z(new a(BillingClientImpl.this.B(this.f2366b, this.f2367c)));
            return null;
        }
    }

    class h implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f2372b;

        h(BillingClientImpl billingClientImpl, i iVar) {
            this.f2372b = iVar;
        }

        public void run() {
            this.f2372b.a(-3, (List<g>) null);
        }
    }

    private final class i implements ServiceConnection {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final c f2373a;

        class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f2375b;

            a(int i) {
                this.f2375b = i;
            }

            public void run() {
                i.this.f2373a.a(this.f2375b);
            }
        }

        class b implements Callable<Void> {
            b() {
            }

            /* renamed from: a */
            public Void call() {
                int i;
                int i2 = 3;
                try {
                    String packageName = BillingClientImpl.this.f2345d.getPackageName();
                    int i3 = 8;
                    i = 3;
                    while (true) {
                        if (i3 < 3) {
                            i3 = 0;
                            break;
                        }
                        try {
                            i = BillingClientImpl.this.g.Q5(i3, packageName, "subs");
                            if (i == 0) {
                                break;
                            }
                            i3--;
                        } catch (Exception unused) {
                            i2 = i;
                            b.a.a.a.a.f("BillingClient", "Exception while checking if billing is supported; try to reconnect");
                            int unused2 = BillingClientImpl.this.f2342a = 0;
                            b.a.c.a.a unused3 = BillingClientImpl.this.g = null;
                            i = i2;
                            i.this.c(i);
                            return null;
                        }
                    }
                    boolean z = true;
                    boolean unused4 = BillingClientImpl.this.j = i3 >= 5;
                    boolean unused5 = BillingClientImpl.this.i = i3 >= 3;
                    if (i3 < 3) {
                        b.a.a.a.a.e("BillingClient", "In-app billing API does not support subscription on this device.");
                    }
                    int i4 = 8;
                    while (true) {
                        if (i4 < 3) {
                            i4 = 0;
                            break;
                        }
                        i = BillingClientImpl.this.g.Q5(i4, packageName, "inapp");
                        if (i == 0) {
                            break;
                        }
                        i4--;
                    }
                    boolean unused6 = BillingClientImpl.this.l = i4 >= 8;
                    BillingClientImpl billingClientImpl = BillingClientImpl.this;
                    if (i4 < 6) {
                        z = false;
                    }
                    boolean unused7 = billingClientImpl.k = z;
                    if (i4 < 3) {
                        b.a.a.a.a.f("BillingClient", "In-app billing API version 3 is not supported on this device.");
                    }
                    if (i == 0) {
                        int unused8 = BillingClientImpl.this.f2342a = 2;
                    } else {
                        int unused9 = BillingClientImpl.this.f2342a = 0;
                        b.a.c.a.a unused10 = BillingClientImpl.this.g = null;
                    }
                } catch (Exception unused11) {
                    b.a.a.a.a.f("BillingClient", "Exception while checking if billing is supported; try to reconnect");
                    int unused12 = BillingClientImpl.this.f2342a = 0;
                    b.a.c.a.a unused13 = BillingClientImpl.this.g = null;
                    i = i2;
                    i.this.c(i);
                    return null;
                }
                i.this.c(i);
                return null;
            }
        }

        class c implements Runnable {
            c() {
            }

            public void run() {
                int unused = BillingClientImpl.this.f2342a = 0;
                b.a.c.a.a unused2 = BillingClientImpl.this.g = null;
                i.this.c(-3);
            }
        }

        /* access modifiers changed from: private */
        public void c(int i) {
            BillingClientImpl.this.z(new a(i));
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            b.a.a.a.a.e("BillingClient", "Billing service connected.");
            b.a.c.a.a unused = BillingClientImpl.this.g = a.C0055a.y(iBinder);
            Future unused2 = BillingClientImpl.this.v(new b(), 30000, new c());
        }

        public void onServiceDisconnected(ComponentName componentName) {
            b.a.a.a.a.f("BillingClient", "Billing service disconnected.");
            b.a.c.a.a unused = BillingClientImpl.this.g = null;
            int unused2 = BillingClientImpl.this.f2342a = 0;
            this.f2373a.b();
        }

        private i(c cVar) {
            this.f2373a = cVar;
        }
    }

    BillingClientImpl(Context context, int i2, int i3, f fVar) {
        Context applicationContext = context.getApplicationContext();
        this.f2345d = applicationContext;
        this.f2346e = i2;
        this.f2347f = i3;
        this.f2344c = new a(applicationContext, fVar);
    }

    /* access modifiers changed from: private */
    public e.a A(String str, boolean z) {
        Bundle bundle;
        String str2 = str;
        boolean z2 = z;
        b.a.a.a.a.e("BillingClient", "Querying owned items, item type: " + str2 + "; history: " + z2);
        ArrayList arrayList = new ArrayList();
        String str3 = null;
        do {
            if (z2) {
                try {
                    if (!this.k) {
                        b.a.a.a.a.f("BillingClient", "getPurchaseHistory is not supported on current device");
                        return new e.a(-2, (List<e>) null);
                    }
                    bundle = this.g.q1(6, this.f2345d.getPackageName(), str, str3, (Bundle) null);
                } catch (Exception e2) {
                    b.a.a.a.a.f("BillingClient", "Got exception trying to get purchases: " + e2 + "; try to reconnect");
                    return new e.a(-1, (List<e>) null);
                }
            } else {
                bundle = this.g.v3(3, this.f2345d.getPackageName(), str2, str3);
            }
            if (bundle == null) {
                b.a.a.a.a.f("BillingClient", "queryPurchases got null owned items list");
                return new e.a(6, (List<e>) null);
            }
            int c2 = b.a.a.a.a.c(bundle, "BillingClient");
            if (c2 != 0) {
                b.a.a.a.a.f("BillingClient", "getPurchases() failed. Response code: " + c2);
                return new e.a(c2, (List<e>) null);
            } else if (!bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundle.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                b.a.a.a.a.f("BillingClient", "Bundle returned from getPurchases() doesn't contain required fields.");
                return new e.a(6, (List<e>) null);
            } else {
                ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                if (stringArrayList == null) {
                    b.a.a.a.a.f("BillingClient", "Bundle returned from getPurchases() contains null SKUs list.");
                    return new e.a(6, (List<e>) null);
                } else if (stringArrayList2 == null) {
                    b.a.a.a.a.f("BillingClient", "Bundle returned from getPurchases() contains null purchases list.");
                    return new e.a(6, (List<e>) null);
                } else if (stringArrayList3 == null) {
                    b.a.a.a.a.f("BillingClient", "Bundle returned from getPurchases() contains null signatures list.");
                    return new e.a(6, (List<e>) null);
                } else {
                    int i2 = 0;
                    while (i2 < stringArrayList2.size()) {
                        String str4 = stringArrayList2.get(i2);
                        String str5 = stringArrayList3.get(i2);
                        b.a.a.a.a.e("BillingClient", "Sku is owned: " + stringArrayList.get(i2));
                        try {
                            e eVar = new e(str4, str5);
                            if (TextUtils.isEmpty(eVar.d())) {
                                b.a.a.a.a.f("BillingClient", "BUG: empty/null token!");
                            }
                            arrayList.add(eVar);
                            i2++;
                        } catch (JSONException e3) {
                            b.a.a.a.a.f("BillingClient", "Got an exception trying to decode the purchase: " + e3);
                            return new e.a(6, (List<e>) null);
                        }
                    }
                    str3 = bundle.getString("INAPP_CONTINUATION_TOKEN");
                    b.a.a.a.a.e("BillingClient", "Continuation token: " + str3);
                }
            }
        } while (!TextUtils.isEmpty(str3));
        return new e.a(0, arrayList);
    }

    private int t(int i2) {
        this.f2344c.b().a(i2, (List<e>) null);
        return i2;
    }

    private Bundle u(d dVar) {
        Bundle bundle = new Bundle();
        if (dVar.j() != 0) {
            bundle.putInt("prorationMode", dVar.j());
        }
        if (dVar.h() != null) {
            bundle.putString("accountId", dVar.h());
        }
        if (dVar.n()) {
            bundle.putBoolean("vr", true);
        }
        if (dVar.i() != null) {
            bundle.putStringArrayList("skusToReplace", new ArrayList(Arrays.asList(new String[]{dVar.i()})));
        }
        return bundle;
    }

    /* access modifiers changed from: private */
    public <T> Future<T> v(Callable<T> callable, long j2, Runnable runnable) {
        long j3 = (long) (((double) j2) * 0.95d);
        if (this.m == null) {
            this.m = Executors.newFixedThreadPool(b.a.a.a.a.f1953a);
        }
        try {
            Future<T> submit = this.m.submit(callable);
            this.f2343b.postDelayed(new a(this, submit, runnable), j3);
            return submit;
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public Bundle w() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("vr", true);
        return bundle;
    }

    private int x(String str) {
        try {
            return ((Integer) v(new b(str), 5000, (Runnable) null).get(5000, TimeUnit.MILLISECONDS)).intValue() == 0 ? 0 : -2;
        } catch (Exception unused) {
            b.a.a.a.a.f("BillingClient", "Exception while checking if billing is supported; try to reconnect");
            return -1;
        }
    }

    /* access modifiers changed from: private */
    public void z(Runnable runnable) {
        if (!Thread.interrupted()) {
            this.f2343b.post(runnable);
        }
    }

    /* access modifiers changed from: package-private */
    public g.a B(String str, List<String> list) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 20;
            ArrayList arrayList2 = new ArrayList(list.subList(i2, i3 > size ? size : i3));
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList2);
            bundle.putString("libraryVersion", "1.2.2");
            try {
                Bundle p3 = this.g.p3(3, this.f2345d.getPackageName(), str, bundle);
                if (p3 == null) {
                    b.a.a.a.a.f("BillingClient", "querySkuDetailsAsync got null sku details list");
                    return new g.a(4, (List<g>) null);
                } else if (!p3.containsKey("DETAILS_LIST")) {
                    int c2 = b.a.a.a.a.c(p3, "BillingClient");
                    if (c2 != 0) {
                        b.a.a.a.a.f("BillingClient", "getSkuDetails() failed. Response code: " + c2);
                        return new g.a(c2, arrayList);
                    }
                    b.a.a.a.a.f("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a detail list.");
                    return new g.a(6, arrayList);
                } else {
                    ArrayList<String> stringArrayList = p3.getStringArrayList("DETAILS_LIST");
                    if (stringArrayList == null) {
                        b.a.a.a.a.f("BillingClient", "querySkuDetailsAsync got null response list");
                        return new g.a(4, (List<g>) null);
                    }
                    int i4 = 0;
                    while (i4 < stringArrayList.size()) {
                        try {
                            g gVar = new g(stringArrayList.get(i4));
                            b.a.a.a.a.e("BillingClient", "Got sku details: " + gVar);
                            arrayList.add(gVar);
                            i4++;
                        } catch (JSONException unused) {
                            b.a.a.a.a.f("BillingClient", "Got a JSON exception trying to decode SkuDetails");
                            return new g.a(6, (List<g>) null);
                        }
                    }
                    i2 = i3;
                }
            } catch (Exception e2) {
                b.a.a.a.a.f("BillingClient", "Got exception trying to query skuDetails: " + e2 + "; try to reconnect");
                return new g.a(-1, (List<g>) null);
            }
        }
        return new g.a(0, arrayList);
    }

    public int a(String str) {
        char c2 = 65535;
        if (!y()) {
            return -1;
        }
        switch (str.hashCode()) {
            case -422092961:
                if (str.equals("subscriptionsUpdate")) {
                    c2 = 1;
                    break;
                }
                break;
            case 207616302:
                if (str.equals("priceChangeConfirmation")) {
                    c2 = 4;
                    break;
                }
                break;
            case 292218239:
                if (str.equals("inAppItemsOnVr")) {
                    c2 = 2;
                    break;
                }
                break;
            case 1219490065:
                if (str.equals("subscriptionsOnVr")) {
                    c2 = 3;
                    break;
                }
                break;
            case 1987365622:
                if (str.equals("subscriptions")) {
                    c2 = 0;
                    break;
                }
                break;
        }
        if (c2 != 0) {
            if (c2 != 1) {
                if (c2 == 2) {
                    return x("inapp");
                }
                if (c2 == 3) {
                    return x("subs");
                }
                if (c2 != 4) {
                    b.a.a.a.a.f("BillingClient", "Unsupported feature: " + str);
                    return 5;
                } else if (this.l) {
                    return 0;
                } else {
                    return -2;
                }
            } else if (this.j) {
                return 0;
            } else {
                return -2;
            }
        } else if (this.i) {
            return 0;
        } else {
            return -2;
        }
    }

    public int b(Activity activity, d dVar) {
        Future future;
        String str;
        Activity activity2 = activity;
        d dVar2 = dVar;
        if (!y()) {
            t(-1);
            return -1;
        }
        String m2 = dVar.m();
        String k2 = dVar.k();
        g l2 = dVar.l();
        boolean z = true;
        boolean z2 = l2 != null && l2.h();
        if (k2 == null) {
            b.a.a.a.a.f("BillingClient", "Please fix the input params. SKU can't be null.");
            t(5);
            return 5;
        } else if (m2 == null) {
            b.a.a.a.a.f("BillingClient", "Please fix the input params. SkuType can't be null.");
            t(5);
            return 5;
        } else if (!m2.equals("subs") || this.i) {
            if (dVar.i() == null) {
                z = false;
            }
            if (z && !this.j) {
                b.a.a.a.a.f("BillingClient", "Current client doesn't support subscriptions update.");
                t(-2);
                return -2;
            } else if (dVar.o() && !this.k) {
                b.a.a.a.a.f("BillingClient", "Current client doesn't support extra params for buy intent.");
                t(-2);
                return -2;
            } else if (!z2 || this.k) {
                b.a.a.a.a.e("BillingClient", "Constructing buy intent for " + k2 + ", item type: " + m2);
                String str2 = "BillingClient";
                if (this.k) {
                    Bundle u = u(dVar2);
                    u.putString("libraryVersion", "1.2.2");
                    if (z2) {
                        u.putString("rewardToken", l2.i());
                        int i2 = this.f2346e;
                        if (i2 != 0) {
                            u.putInt("childDirected", i2);
                        }
                        int i3 = this.f2347f;
                        if (i3 != 0) {
                            u.putInt("underAgeOfConsent", i3);
                        }
                    }
                    future = v(new c(dVar.n() ? 7 : 6, k2, m2, u), 5000, (Runnable) null);
                } else if (z) {
                    future = v(new d(dVar2, k2), 5000, (Runnable) null);
                } else {
                    future = v(new e(k2, m2), 5000, (Runnable) null);
                }
                try {
                    Bundle bundle = (Bundle) future.get(5000, TimeUnit.MILLISECONDS);
                    str = str2;
                    try {
                        int c2 = b.a.a.a.a.c(bundle, str);
                        if (c2 != 0) {
                            b.a.a.a.a.f(str, "Unable to buy item, Error response code: " + c2);
                            t(c2);
                            return c2;
                        }
                        Intent intent = new Intent(activity2, ProxyBillingActivity.class);
                        intent.putExtra("result_receiver", this.n);
                        intent.putExtra("BUY_INTENT", (PendingIntent) bundle.getParcelable("BUY_INTENT"));
                        activity2.startActivity(intent);
                        return 0;
                    } catch (CancellationException | TimeoutException unused) {
                        b.a.a.a.a.f(str, "Time out while launching billing flow: ; for sku: " + k2 + "; try to reconnect");
                        t(-3);
                        return -3;
                    } catch (Exception unused2) {
                        b.a.a.a.a.f(str, "Exception while launching billing flow: ; for sku: " + k2 + "; try to reconnect");
                        t(-1);
                        return -1;
                    }
                } catch (CancellationException | TimeoutException unused3) {
                    str = str2;
                    b.a.a.a.a.f(str, "Time out while launching billing flow: ; for sku: " + k2 + "; try to reconnect");
                    t(-3);
                    return -3;
                } catch (Exception unused4) {
                    str = str2;
                    b.a.a.a.a.f(str, "Exception while launching billing flow: ; for sku: " + k2 + "; try to reconnect");
                    t(-1);
                    return -1;
                }
            } else {
                b.a.a.a.a.f("BillingClient", "Current client doesn't support extra params for buy intent.");
                t(-2);
                return -2;
            }
        } else {
            b.a.a.a.a.f("BillingClient", "Current client doesn't support subscriptions.");
            t(-2);
            return -2;
        }
    }

    public e.a d(String str) {
        if (!y()) {
            return new e.a(-1, (List<e>) null);
        }
        if (TextUtils.isEmpty(str)) {
            b.a.a.a.a.f("BillingClient", "Please provide a valid SKU type.");
            return new e.a(5, (List<e>) null);
        }
        try {
            return (e.a) v(new f(str), 5000, (Runnable) null).get(5000, TimeUnit.MILLISECONDS);
        } catch (CancellationException | TimeoutException unused) {
            return new e.a(-3, (List<e>) null);
        } catch (Exception unused2) {
            return new e.a(6, (List<e>) null);
        }
    }

    public void e(h hVar, i iVar) {
        if (!y()) {
            iVar.a(-1, (List<g>) null);
            return;
        }
        String c2 = hVar.c();
        List<String> d2 = hVar.d();
        if (TextUtils.isEmpty(c2)) {
            b.a.a.a.a.f("BillingClient", "Please fix the input params. SKU type can't be empty.");
            iVar.a(5, (List<g>) null);
        } else if (d2 == null) {
            b.a.a.a.a.f("BillingClient", "Please fix the input params. The list of SKUs can't be empty.");
            iVar.a(5, (List<g>) null);
        } else {
            v(new g(c2, d2, iVar), 30000, new h(this, iVar));
        }
    }

    public void f(c cVar) {
        ServiceInfo serviceInfo;
        if (y()) {
            b.a.a.a.a.e("BillingClient", "Service connection is valid. No need to re-initialize.");
            cVar.a(0);
            return;
        }
        int i2 = this.f2342a;
        if (i2 == 1) {
            b.a.a.a.a.f("BillingClient", "Client is already in the process of connecting to billing service.");
            cVar.a(5);
        } else if (i2 == 3) {
            b.a.a.a.a.f("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            cVar.a(5);
        } else {
            this.f2342a = 1;
            this.f2344c.c();
            b.a.a.a.a.e("BillingClient", "Starting in-app billing setup.");
            this.h = new i(cVar);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            List<ResolveInfo> queryIntentServices = this.f2345d.getPackageManager().queryIntentServices(intent, 0);
            if (!(queryIntentServices == null || queryIntentServices.isEmpty() || (serviceInfo = queryIntentServices.get(0).serviceInfo) == null)) {
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if (!"com.android.vending".equals(str) || str2 == null) {
                    b.a.a.a.a.f("BillingClient", "The device doesn't have valid Play Store.");
                } else {
                    ComponentName componentName = new ComponentName(str, str2);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    intent2.putExtra("libraryVersion", "1.2.2");
                    if (this.f2345d.bindService(intent2, this.h, 1)) {
                        b.a.a.a.a.e("BillingClient", "Service was bonded successfully.");
                        return;
                    }
                    b.a.a.a.a.f("BillingClient", "Connection to Billing service is blocked.");
                }
            }
            this.f2342a = 0;
            b.a.a.a.a.e("BillingClient", "Billing service unavailable on device.");
            cVar.a(3);
        }
    }

    public boolean y() {
        return (this.f2342a != 2 || this.g == null || this.h == null) ? false : true;
    }
}
