package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.google.android.play.core.internal.a;
import com.google.android.play.core.internal.l;
import com.google.android.play.core.internal.n0;
import com.google.android.play.core.internal.o;
import com.google.android.play.core.tasks.c;
import com.google.android.play.core.tasks.e;
import com.google.android.play.core.tasks.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

final class q implements j3 {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final a f11360f = new a("AssetPackServiceImpl");
    private static final Intent g = new Intent("com.google.android.play.core.assetmoduleservice.BIND_ASSET_MODULE_SERVICE").setPackage("com.android.vending");
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final String f11361a;

    /* renamed from: b  reason: collision with root package name */
    private final y0 f11362b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public l<n0> f11363c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public l<n0> f11364d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f11365e = new AtomicBoolean();

    q(Context context, y0 y0Var) {
        this.f11361a = context.getPackageName();
        this.f11362b = y0Var;
        if (o.a(context)) {
            this.f11363c = new l(com.google.android.play.core.splitinstall.a.a(context), f11360f, "AssetPackService", g, k3.f11319a);
            this.f11364d = new l(com.google.android.play.core.splitinstall.a.a(context), f11360f, "AssetPackService-keepAlive", g, l3.f11324a);
        }
        f11360f.c("AssetPackService initiated.", new Object[0]);
    }

    static /* synthetic */ ArrayList c(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Bundle bundle = new Bundle();
            bundle.putString("module_name", (String) it.next());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    static /* synthetic */ List e(q qVar, List list) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            b next = c.b((Bundle) list.get(i), qVar.f11362b).e().values().iterator().next();
            if (next == null) {
                f11360f.e("onGetSessionStates: Bundle contained no pack.", new Object[0]);
            }
            if (w1.c(next.f())) {
                arrayList.add(next.e());
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public final void f(int i, String str, int i2) {
        if (this.f11363c != null) {
            f11360f.f("notifyModuleCompleted", new Object[0]);
            m mVar = new m();
            this.f11363c.c(new h(this, mVar, i, str, mVar, i2));
            return;
        }
        throw new v0("The Play Store app is not installed or is an unofficial version.", i);
    }

    static /* synthetic */ Bundle j(Map map) {
        Bundle s = s();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle = new Bundle();
            bundle.putString("installed_asset_module_name", (String) entry.getKey());
            bundle.putLong("installed_asset_module_version", ((Long) entry.getValue()).longValue());
            arrayList.add(bundle);
        }
        s.putParcelableArrayList("installed_asset_module", arrayList);
        return s;
    }

    /* access modifiers changed from: private */
    public static Bundle m(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", i);
        return bundle;
    }

    /* access modifiers changed from: private */
    public static Bundle n(int i, String str) {
        Bundle m = m(i);
        m.putString("module_name", str);
        return m;
    }

    static /* synthetic */ Bundle o(int i, String str, String str2, int i2) {
        Bundle n = n(i, str);
        n.putString("slice_id", str2);
        n.putInt("chunk_number", i2);
        return n;
    }

    private static <T> c<T> r() {
        f11360f.e("onError(%d)", -11);
        return e.a(new AssetPackException(-11));
    }

    /* access modifiers changed from: private */
    public static Bundle s() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 10703);
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        arrayList.add(1);
        bundle.putIntegerArrayList("supported_compression_formats", arrayList);
        bundle.putIntegerArrayList("supported_patch_formats", new ArrayList());
        return bundle;
    }

    public final void K(List<String> list) {
        if (this.f11363c != null) {
            f11360f.f("cancelDownloads(%s)", list);
            m mVar = new m();
            this.f11363c.c(new e(this, mVar, list, mVar));
        }
    }

    public final void S(int i) {
        if (this.f11363c != null) {
            f11360f.f("notifySessionFailed", new Object[0]);
            m mVar = new m();
            this.f11363c.c(new i(this, mVar, i, mVar));
            return;
        }
        throw new v0("The Play Store app is not installed or is an unofficial version.", i);
    }

    public final c<List<String>> T(Map<String, Long> map) {
        if (this.f11363c == null) {
            return r();
        }
        f11360f.f("syncPacks", new Object[0]);
        m mVar = new m();
        this.f11363c.c(new f(this, mVar, map, mVar));
        return mVar.a();
    }

    public final c<ParcelFileDescriptor> U(int i, String str, String str2, int i2) {
        if (this.f11363c == null) {
            return r();
        }
        f11360f.f("getChunkFileDescriptor(%s, %s, %d, session=%d)", str, str2, Integer.valueOf(i2), Integer.valueOf(i));
        m mVar = new m();
        this.f11363c.c(new j(this, mVar, i, str, str2, i2, mVar));
        return mVar.a();
    }

    public final void V(int i, String str, String str2, int i2) {
        if (this.f11363c != null) {
            f11360f.f("notifyChunkTransferred", new Object[0]);
            m mVar = new m();
            this.f11363c.c(new g(this, mVar, i, str, str2, i2, mVar));
            return;
        }
        throw new v0("The Play Store app is not installed or is an unofficial version.", i);
    }

    public final void a(int i, String str) {
        f(i, str, 10);
    }

    public final synchronized void d() {
        if (this.f11364d != null) {
            f11360f.f("keepAlive", new Object[0]);
            if (!this.f11365e.compareAndSet(false, true)) {
                f11360f.f("Service is already kept alive.", new Object[0]);
                return;
            }
            m mVar = new m();
            this.f11364d.c(new k(this, mVar, mVar));
            return;
        }
        f11360f.g("Keep alive connection manager is not initialized.", new Object[0]);
    }
}
