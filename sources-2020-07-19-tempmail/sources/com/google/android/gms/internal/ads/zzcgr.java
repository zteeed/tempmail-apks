package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzc;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcgr {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final bj f7031a = new bj((xi) null);

    /* renamed from: b  reason: collision with root package name */
    private final zza f7032b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f7033c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f7034d;

    /* renamed from: e  reason: collision with root package name */
    private final zzeg f7035e;

    /* renamed from: f  reason: collision with root package name */
    private final zzbbd f7036f;
    private final zzahi g;
    private zzdvf<zzbfn> h;

    zzcgr(zzchb zzchb) {
        this.f7033c = zzchb.f7044d;
        this.f7034d = zzchb.f7045e;
        this.f7035e = zzchb.f7046f;
        this.f7036f = zzchb.g;
        this.f7032b = zzchb.f7042b;
        zzbfv unused = zzchb.f7043c;
        this.g = new zzahi();
    }

    public final synchronized void a() {
        if (this.h != null) {
            zzdux.f(this.h, new xi(this), this.f7034d);
            this.h = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvf c(String str, JSONObject jSONObject, zzbfn zzbfn) throws Exception {
        return this.g.b(zzbfn, str, jSONObject);
    }

    public final synchronized void d(String str, zzahc<Object> zzahc) {
        if (this.h != null) {
            zzdux.f(this.h, new aj(this, str, zzahc), this.f7034d);
        }
    }

    public final synchronized void e(String str, Map<String, ?> map) {
        if (this.h != null) {
            zzdux.f(this.h, new cj(this, str, map), this.f7034d);
        }
    }

    public final <T> void f(WeakReference<T> weakReference, String str, zzahc<T> zzahc) {
        d(str, new fj(this, weakReference, str, zzahc, (xi) null));
    }

    public final synchronized void g() {
        zzdvf<zzbfn> i = zzdux.i(zzbfv.b(this.f7033c, this.f7036f, (String) zzwg.e().c(zzaav.u1), this.f7035e, this.f7032b), new wi(this), this.f7034d);
        this.h = i;
        zzbbj.a(i, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void h(String str, zzahc<Object> zzahc) {
        if (this.h != null) {
            zzdux.f(this.h, new zi(this, str, zzahc), this.f7034d);
        }
    }

    public final synchronized zzdvf<JSONObject> i(String str, JSONObject jSONObject) {
        if (this.h == null) {
            return zzdux.g(null);
        }
        return zzdux.j(this.h, new yi(this, str, jSONObject), this.f7034d);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzbfn j(zzbfn zzbfn) {
        zzbfn.c("/result", this.g);
        zzbgz q = zzbfn.q();
        bj bjVar = this.f7031a;
        q.f((zzuu) null, bjVar, bjVar, bjVar, bjVar, false, (zzahf) null, new zzc(this.f7033c, (zzavr) null, (zzarx) null), (zzaqc) null, (zzavr) null);
        return zzbfn;
    }
}
