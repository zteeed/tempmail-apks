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
    private final Context f7498b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f7499c;

    /* renamed from: d  reason: collision with root package name */
    private final zzasz f7500d;

    /* renamed from: e  reason: collision with root package name */
    private final zzata f7501e;

    /* renamed from: f  reason: collision with root package name */
    private final zzblb f7502f;
    private final HashMap<String, zzcpn> g;

    public zzcoy(Context context, Executor executor, zzasz zzasz, zzblb zzblb, zzata zzata, HashMap<String, zzcpn> hashMap) {
        zzaav.a(context);
        this.f7498b = context;
        this.f7499c = executor;
        this.f7500d = zzasz;
        this.f7501e = zzata;
        this.f7502f = zzblb;
        this.g = hashMap;
    }

    private static zzdvf<JSONObject> e7(zzasm zzasm, zzdou zzdou, zzdeu zzdeu) {
        pm pmVar = new pm(zzdeu);
        return zzdou.b(zzdor.GMS_SIGNALS, zzdux.g(zzasm.f6092b)).b(pmVar).g(sm.f5101a).f();
    }

    private static zzdvf<zzass> f7(zzdvf<JSONObject> zzdvf, zzdou zzdou, zzalr zzalr) {
        return zzdou.b(zzdor.BUILD_URL, zzdvf).b(zzalr.a("AFMA_getAdDictionary", zzalm.f5955b, rm.f5022a)).f();
    }

    private final void h7(zzdvf<InputStream> zzdvf, zzasg zzasg) {
        zzdux.f(zzdux.j(zzdvf, new vm(this), zzbbf.f6320a), new xm(this, zzasg), zzbbf.f6325f);
    }

    public final void C3(zzart zzart, zzase zzase) throws RemoteException {
    }

    public final void N0(zzasm zzasm, zzasg zzasg) {
        h7(l7(zzasm, Binder.getCallingUid()), zzasg);
    }

    public final void P1(zzasm zzasm, zzasg zzasg) {
        h7(k7(zzasm, Binder.getCallingUid()), zzasg);
    }

    public final void P6(zzasm zzasm, zzasg zzasg) {
        zzdvf<InputStream> j7 = j7(zzasm, Binder.getCallingUid());
        h7(j7, zzasg);
        j7.f(new um(this), this.f7499c);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ InputStream g7(zzdvf zzdvf, zzdvf zzdvf2) throws Exception {
        String h = ((zzass) zzdvf.get()).h();
        this.g.put(h, new zzcpn((zzass) zzdvf.get(), (JSONObject) zzdvf2.get()));
        return new ByteArrayInputStream(h.getBytes(zzdrv.f8539a));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void i7() {
        zzbbj.a(this.f7501e.a(), "persistFlags");
    }

    public final zzdvf<InputStream> j7(zzasm zzasm, int i) {
        zzalr a2 = zzq.zzlj().a(this.f7498b, zzbbd.u());
        zzdeu a3 = this.f7502f.a(zzasm, i);
        zzalj<I, O> a4 = a2.a("google.afma.response.normalize", zzcpm.f7503d, zzalm.f5956c);
        zzcpr zzcpr = new zzcpr(this.f7498b, zzasm.f6093c.f6314b, this.f7500d, zzasm.h, zzasm.f6094d);
        zzdou c2 = a3.c();
        zzcpn zzcpn = null;
        if (!zzacp.f5787a.a().booleanValue()) {
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
            zzdvf<JSONObject> e7 = e7(zzasm, c2, a3);
            zzdvf<zzass> f7 = f7(e7, c2, a2);
            zzdod f2 = c2.a(zzdor.HTTP, f7, e7).a(new om(e7, f7)).g(zzcpr).f();
            return c2.a(zzdor.PRE_PROCESS, e7, f7, f2).a(new nm(f2, e7, f7)).b(a4).f();
        }
        zzdod f3 = c2.b(zzdor.HTTP, zzdux.g(new zzcpq(zzcpn.f7508b, zzcpn.f7507a))).g(zzcpr).f();
        zzdvf g2 = zzdux.g(zzcpn);
        return c2.a(zzdor.PRE_PROCESS, f3, g2).a(new qm(f3, g2)).b(a4).f();
    }

    public final zzarv k3(zzart zzart) throws RemoteException {
        return null;
    }

    public final zzdvf<InputStream> k7(zzasm zzasm, int i) {
        if (!zzacp.f5787a.a().booleanValue()) {
            return zzdux.a(new Exception("Split request is disabled."));
        }
        zzdms zzdms = zzasm.k;
        if (zzdms == null) {
            return zzdux.a(new Exception("Pool configuration missing from request."));
        }
        if (zzdms.h == 0 || zzdms.i == 0) {
            return zzdux.a(new Exception("Caching is disabled."));
        }
        zzalr a2 = zzq.zzlj().a(this.f7498b, zzbbd.u());
        zzdeu a3 = this.f7502f.a(zzasm, i);
        zzdou c2 = a3.c();
        zzdvf<JSONObject> e7 = e7(zzasm, c2, a3);
        zzdvf<zzass> f7 = f7(e7, c2, a2);
        return c2.a(zzdor.GET_URL_AND_CACHE_KEY, e7, f7).a(new tm(this, f7, e7)).f();
    }

    public final zzdvf<InputStream> l7(zzasm zzasm, int i) {
        zzalr a2 = zzq.zzlj().a(this.f7498b, zzbbd.u());
        if (!zzacv.f5798a.a().booleanValue()) {
            return zzdux.a(new Exception("Signal collection disabled."));
        }
        zzdeu a3 = this.f7502f.a(zzasm, i);
        zzdeb<JSONObject> b2 = a3.b();
        return a3.c().b(zzdor.GET_SIGNALS, zzdux.g(zzasm.f6092b)).b(new wm(b2)).j(zzdor.JS_SIGNALS).b(a2.a("google.afma.request.getSignals", zzalm.f5955b, zzalm.f5956c)).f();
    }

    public final zzdvf<InputStream> m7(String str) {
        if (!zzacp.f5787a.a().booleanValue()) {
            return zzdux.a(new Exception("Split request is disabled."));
        }
        ym ymVar = new ym(this);
        if (this.g.remove(str) != null) {
            return zzdux.g(ymVar);
        }
        String valueOf = String.valueOf(str);
        return zzdux.a(new Exception(valueOf.length() != 0 ? "URL to be removed not found for cache key: ".concat(valueOf) : new String("URL to be removed not found for cache key: ")));
    }

    public final void r4(String str, zzasg zzasg) {
        h7(m7(str), zzasg);
    }
}
