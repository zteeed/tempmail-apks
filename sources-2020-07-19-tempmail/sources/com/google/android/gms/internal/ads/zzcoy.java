package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzq;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcoy extends zzasc {

    /* renamed from: b  reason: collision with root package name */
    private final Context f7315b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f7316c;

    /* renamed from: d  reason: collision with root package name */
    private final zzasz f7317d;

    /* renamed from: e  reason: collision with root package name */
    private final zzata f7318e;

    /* renamed from: f  reason: collision with root package name */
    private final zzblb f7319f;
    private final HashMap<String, zzcpn> g;

    public zzcoy(Context context, Executor executor, zzasz zzasz, zzblb zzblb, zzata zzata, HashMap<String, zzcpn> hashMap) {
        zzaav.a(context);
        this.f7315b = context;
        this.f7316c = executor;
        this.f7317d = zzasz;
        this.f7318e = zzata;
        this.f7319f = zzblb;
        this.g = hashMap;
    }

    private static zzdvf<zzass> A6(zzdvf<JSONObject> zzdvf, zzdou zzdou, zzalr zzalr) {
        return zzdou.b(zzdor.BUILD_URL, zzdvf).b(zzalr.a("AFMA_getAdDictionary", zzalm.f5772b, rm.f4839a)).f();
    }

    private final void C6(zzdvf<InputStream> zzdvf, zzasg zzasg) {
        zzdux.f(zzdux.j(zzdvf, new vm(this), zzbbf.f6137a), new xm(this, zzasg), zzbbf.f6142f);
    }

    private static zzdvf<JSONObject> z6(zzasm zzasm, zzdou zzdou, zzdeu zzdeu) {
        pm pmVar = new pm(zzdeu);
        return zzdou.b(zzdor.GMS_SIGNALS, zzdux.g(zzasm.f5909b)).b(pmVar).g(sm.f4918a).f();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ InputStream B6(zzdvf zzdvf, zzdvf zzdvf2) throws Exception {
        String h = ((zzass) zzdvf.get()).h();
        this.g.put(h, new zzcpn((zzass) zzdvf.get(), (JSONObject) zzdvf2.get()));
        return new ByteArrayInputStream(h.getBytes(zzdrv.f8356a));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void D6() {
        zzbbj.a(this.f7318e.a(), "persistFlags");
    }

    public final zzdvf<InputStream> E6(zzasm zzasm, int i) {
        zzalr a2 = zzq.zzlj().a(this.f7315b, zzbbd.u());
        zzdeu a3 = this.f7319f.a(zzasm, i);
        zzalj<I, O> a4 = a2.a("google.afma.response.normalize", zzcpm.f7320d, zzalm.f5773c);
        zzcpr zzcpr = new zzcpr(this.f7315b, zzasm.f5910c.f6131b, this.f7317d, zzasm.h, zzasm.f5911d);
        zzdou c2 = a3.c();
        zzcpn zzcpn = null;
        if (!zzacp.f5604a.a().booleanValue()) {
            String str = zzasm.l;
            if (str != null && !str.isEmpty()) {
                zzaxv.m("Request contained a PoolKey but split request is disabled.");
            }
        } else {
            String str2 = zzasm.l;
            if (str2 != null && !str2.isEmpty() && (zzcpn = this.g.remove(zzasm.l)) == null) {
                zzaxv.m("Request contained a PoolKey but no matching parameters were found.");
            }
        }
        if (zzcpn == null) {
            zzdvf<JSONObject> z6 = z6(zzasm, c2, a3);
            zzdvf<zzass> A6 = A6(z6, c2, a2);
            zzdod f2 = c2.a(zzdor.HTTP, A6, z6).a(new om(z6, A6)).g(zzcpr).f();
            return c2.a(zzdor.PRE_PROCESS, z6, A6, f2).a(new nm(f2, z6, A6)).b(a4).f();
        }
        zzdod f3 = c2.b(zzdor.HTTP, zzdux.g(new zzcpq(zzcpn.f7325b, zzcpn.f7324a))).g(zzcpr).f();
        zzdvf g2 = zzdux.g(zzcpn);
        return c2.a(zzdor.PRE_PROCESS, f3, g2).a(new qm(f3, g2)).b(a4).f();
    }

    public final zzdvf<InputStream> F6(zzasm zzasm, int i) {
        if (!zzacp.f5604a.a().booleanValue()) {
            return zzdux.a(new Exception("Split request is disabled."));
        }
        zzdms zzdms = zzasm.k;
        if (zzdms == null) {
            return zzdux.a(new Exception("Pool configuration missing from request."));
        }
        if (zzdms.h == 0 || zzdms.i == 0) {
            return zzdux.a(new Exception("Caching is disabled."));
        }
        zzalr a2 = zzq.zzlj().a(this.f7315b, zzbbd.u());
        zzdeu a3 = this.f7319f.a(zzasm, i);
        zzdou c2 = a3.c();
        zzdvf<JSONObject> z6 = z6(zzasm, c2, a3);
        zzdvf<zzass> A6 = A6(z6, c2, a2);
        return c2.a(zzdor.GET_URL_AND_CACHE_KEY, z6, A6).a(new tm(this, A6, z6)).f();
    }

    public final void G0(zzasm zzasm, zzasg zzasg) {
        C6(G6(zzasm, Binder.getCallingUid()), zzasg);
    }

    public final void G1(zzasm zzasm, zzasg zzasg) {
        C6(F6(zzasm, Binder.getCallingUid()), zzasg);
    }

    public final zzdvf<InputStream> G6(zzasm zzasm, int i) {
        zzalr a2 = zzq.zzlj().a(this.f7315b, zzbbd.u());
        if (!zzacv.f5615a.a().booleanValue()) {
            return zzdux.a(new Exception("Signal collection disabled."));
        }
        zzdeu a3 = this.f7319f.a(zzasm, i);
        zzdeb<JSONObject> b2 = a3.b();
        return a3.c().b(zzdor.GET_SIGNALS, zzdux.g(zzasm.f5909b)).b(new wm(b2)).j(zzdor.JS_SIGNALS).b(a2.a("google.afma.request.getSignals", zzalm.f5772b, zzalm.f5773c)).f();
    }

    public final zzdvf<InputStream> H6(String str) {
        if (!zzacp.f5604a.a().booleanValue()) {
            return zzdux.a(new Exception("Split request is disabled."));
        }
        ym ymVar = new ym(this);
        if (this.g.remove(str) != null) {
            return zzdux.g(ymVar);
        }
        String valueOf = String.valueOf(str);
        return zzdux.a(new Exception(valueOf.length() != 0 ? "URL to be removed not found for cache key: ".concat(valueOf) : new String("URL to be removed not found for cache key: ")));
    }

    public final void X3(String str, zzasg zzasg) {
        C6(H6(str), zzasg);
    }

    public final zzarv Y2(zzart zzart) throws RemoteException {
        return null;
    }

    public final void m3(zzart zzart, zzase zzase) throws RemoteException {
    }

    public final void n6(zzasm zzasm, zzasg zzasg) {
        zzdvf<InputStream> E6 = E6(zzasm, Binder.getCallingUid());
        C6(E6, zzasg);
        E6.f(new um(this), this.f7316c);
    }
}
