package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzq;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzclx {

    /* renamed from: a  reason: collision with root package name */
    private boolean f7227a = false;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public boolean f7228b = false;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final long f7229c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final zzbbn<Boolean> f7230d = new zzbbn<>();

    /* renamed from: e  reason: collision with root package name */
    private final Context f7231e;

    /* renamed from: f  reason: collision with root package name */
    private final WeakReference<Context> f7232f;
    private final zzcix g;
    /* access modifiers changed from: private */
    public final Executor h;
    private final Executor i;
    private final ScheduledExecutorService j;
    /* access modifiers changed from: private */
    public final zzclh k;
    private final zzbbd l;
    private Map<String, zzaic> m = new ConcurrentHashMap();
    private boolean n = true;

    public zzclx(Executor executor, Context context, WeakReference<Context> weakReference, Executor executor2, zzcix zzcix, ScheduledExecutorService scheduledExecutorService, zzclh zzclh, zzbbd zzbbd) {
        this.g = zzcix;
        this.f7231e = context;
        this.f7232f = weakReference;
        this.h = executor2;
        this.j = scheduledExecutorService;
        this.i = executor;
        this.k = zzclh;
        this.l = zzbbd;
        this.f7229c = zzq.zzld().b();
        h("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    /* access modifiers changed from: private */
    public final void h(String str, boolean z, String str2, int i2) {
        this.m.put(str, new zzaic(str, z, i2, str2));
    }

    private final synchronized zzdvf<String> l() {
        String c2 = zzq.zzla().r().C().c();
        if (!TextUtils.isEmpty(c2)) {
            return zzdux.g(c2);
        }
        zzbbn zzbbn = new zzbbn();
        zzq.zzla().r().y(new rk(this, zzbbn));
        return zzbbn;
    }

    /* access modifiers changed from: private */
    public final void u(String str) {
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = new Object();
                zzbbn zzbbn = new zzbbn();
                zzdvf d2 = zzdux.d(zzbbn, ((Long) zzwg.e().c(zzaav.Q0)).longValue(), TimeUnit.SECONDS, this.j);
                this.k.d(next);
                long b2 = zzq.zzld().b();
                Iterator<String> it = keys;
                tk tkVar = r1;
                tk tkVar2 = new tk(this, obj, zzbbn, next, b2);
                d2.f(tkVar, this.h);
                arrayList.add(d2);
                zk zkVar = new zk(this, obj, next, b2, zzbbn);
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                ArrayList arrayList2 = new ArrayList();
                if (optJSONObject != null) {
                    try {
                        JSONArray jSONArray = optJSONObject.getJSONArray("data");
                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                            String optString = jSONObject2.optString("format", "");
                            JSONObject optJSONObject2 = jSONObject2.optJSONObject("data");
                            Bundle bundle = new Bundle();
                            if (optJSONObject2 != null) {
                                Iterator<String> keys2 = optJSONObject2.keys();
                                while (keys2.hasNext()) {
                                    String next2 = keys2.next();
                                    bundle.putString(next2, optJSONObject2.optString(next2, ""));
                                }
                            }
                            arrayList2.add(new zzaim(optString, bundle));
                        }
                    } catch (JSONException unused) {
                    }
                }
                h(next, false, "", 0);
                try {
                    this.i.execute(new vk(this, this.g.d(next, new JSONObject()), zkVar, arrayList2, next));
                } catch (zzdlg unused2) {
                    try {
                        zkVar.onInitializationFailed("Failed to create Adapter.");
                    } catch (RemoteException e2) {
                        zzbba.c("", e2);
                    }
                }
                keys = it;
            }
            zzdux.n(arrayList).a(new wk(this), this.h);
        } catch (JSONException e3) {
            zzaxv.l("Malformed CLD response", e3);
        }
    }

    public final void a() {
        this.n = false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c(zzbbn zzbbn) {
        this.h.execute(new yk(this, zzbbn));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0035, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
        com.google.android.gms.internal.ads.zzbba.c("", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r4 = new java.lang.StringBuilder(java.lang.String.valueOf(r5).length() + 74);
        r4.append("Failed to initialize adapter. ");
        r4.append(r5);
        r4.append(" does not implement the initialize() method.");
        r3.onInitializationFailed(r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0011 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void f(com.google.android.gms.internal.ads.zzdlm r2, com.google.android.gms.internal.ads.zzaie r3, java.util.List r4, java.lang.String r5) {
        /*
            r1 = this;
            java.lang.ref.WeakReference<android.content.Context> r0 = r1.f7232f     // Catch:{ zzdlg -> 0x0011 }
            java.lang.Object r0 = r0.get()     // Catch:{ zzdlg -> 0x0011 }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ zzdlg -> 0x0011 }
            if (r0 == 0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            android.content.Context r0 = r1.f7231e     // Catch:{ zzdlg -> 0x0011 }
        L_0x000d:
            r2.k(r0, r3, r4)     // Catch:{ zzdlg -> 0x0011 }
            return
        L_0x0011:
            java.lang.String r2 = java.lang.String.valueOf(r5)     // Catch:{ RemoteException -> 0x0035 }
            int r2 = r2.length()     // Catch:{ RemoteException -> 0x0035 }
            int r2 = r2 + 74
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x0035 }
            r4.<init>(r2)     // Catch:{ RemoteException -> 0x0035 }
            java.lang.String r2 = "Failed to initialize adapter. "
            r4.append(r2)     // Catch:{ RemoteException -> 0x0035 }
            r4.append(r5)     // Catch:{ RemoteException -> 0x0035 }
            java.lang.String r2 = " does not implement the initialize() method."
            r4.append(r2)     // Catch:{ RemoteException -> 0x0035 }
            java.lang.String r2 = r4.toString()     // Catch:{ RemoteException -> 0x0035 }
            r3.onInitializationFailed(r2)     // Catch:{ RemoteException -> 0x0035 }
            return
        L_0x0035:
            r2 = move-exception
            java.lang.String r3 = ""
            com.google.android.gms.internal.ads.zzbba.c(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzclx.f(com.google.android.gms.internal.ads.zzdlm, com.google.android.gms.internal.ads.zzaie, java.util.List, java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void g(Object obj, zzbbn zzbbn, String str, long j2) {
        synchronized (obj) {
            if (!zzbbn.isDone()) {
                h(str, false, "Timeout.", (int) (zzq.zzld().b() - j2));
                this.k.f(str, "timeout");
                zzbbn.a(Boolean.FALSE);
            }
        }
    }

    public final void j() {
        if (((Boolean) zzwg.e().c(zzaav.O0)).booleanValue() && !zzacm.f5598a.a().booleanValue()) {
            if (this.l.f6133d >= ((Integer) zzwg.e().c(zzaav.P0)).intValue() && this.n) {
                if (!this.f7227a) {
                    synchronized (this) {
                        if (!this.f7227a) {
                            this.k.a();
                            this.f7230d.f(new sk(this), this.h);
                            this.f7227a = true;
                            zzdvf<String> l2 = l();
                            this.j.schedule(new uk(this), ((Long) zzwg.e().c(zzaav.R0)).longValue(), TimeUnit.SECONDS);
                            zzdux.f(l2, new xk(this), this.h);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
        if (!this.f7227a) {
            h("com.google.android.gms.ads.MobileAds", true, "", 0);
            this.f7230d.a(Boolean.FALSE);
            this.f7227a = true;
        }
    }

    public final List<zzaic> k() {
        ArrayList arrayList = new ArrayList();
        for (String next : this.m.keySet()) {
            zzaic zzaic = this.m.get(next);
            arrayList.add(new zzaic(next, zzaic.f5720c, zzaic.f5721d, zzaic.f5722e));
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object m() throws Exception {
        this.f7230d.a(Boolean.TRUE);
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void n() {
        synchronized (this) {
            if (!this.f7228b) {
                h("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (zzq.zzld().b() - this.f7229c));
                this.f7230d.c(new Exception());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void o() {
        this.k.b();
    }

    public final void q(zzaij zzaij) {
        this.f7230d.f(new qk(this, zzaij), this.i);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void s(zzaij zzaij) {
        try {
            zzaij.c0(k());
        } catch (RemoteException e2) {
            zzbba.c("", e2);
        }
    }
}
