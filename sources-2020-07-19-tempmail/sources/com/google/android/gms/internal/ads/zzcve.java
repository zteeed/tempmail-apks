package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.zzbtt;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcve<AdT, AdapterT, ListenerT extends zzbtt> implements zzcqt<AdT> {

    /* renamed from: a  reason: collision with root package name */
    private final zzcqu<AdapterT, ListenerT> f7581a;

    /* renamed from: b  reason: collision with root package name */
    private final zzcqw<AdT, AdapterT, ListenerT> f7582b;

    /* renamed from: c  reason: collision with root package name */
    private final zzdou f7583c;

    /* renamed from: d  reason: collision with root package name */
    private final zzdvi f7584d;

    public zzcve(zzdou zzdou, zzdvi zzdvi, zzcqu<AdapterT, ListenerT> zzcqu, zzcqw<AdT, AdapterT, ListenerT> zzcqw) {
        this.f7583c = zzdou;
        this.f7584d = zzdvi;
        this.f7582b = zzcqw;
        this.f7581a = zzcqu;
    }

    public final zzdvf<AdT> a(zzdkw zzdkw, zzdkk zzdkk) {
        zzcqv<AdapterT, ListenerT> zzcqv;
        Class<AdMobAdapter> cls = AdMobAdapter.class;
        Iterator<String> it = zzdkk.q.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzcqv = null;
                break;
            }
            try {
                zzcqv = this.f7581a.a(it.next(), zzdkk.s);
                break;
            } catch (zzdlg unused) {
            }
        }
        if (zzcqv == null) {
            return zzdux.a(new zzcti("unable to instantiate mediation adapter class"));
        }
        zzbbn zzbbn = new zzbbn();
        zzcqv.f7384c.y(new lp(this, zzbbn));
        if (zzdkk.E) {
            Bundle bundle = zzdkw.f8161a.f8149a.f8166d.n;
            Bundle bundle2 = bundle.getBundle(cls.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(cls.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        return this.f7583c.g(zzdor.ADAPTER_LOAD_AD_SYN).a(new kp(this, zzdkw, zzdkk, zzcqv), this.f7584d).j(zzdor.ADAPTER_LOAD_AD_ACK).h(zzbbn).j(zzdor.ADAPTER_WRAP_ADAPTER).g(new jp(this, zzdkw, zzdkk, zzcqv)).f();
    }

    public final boolean b(zzdkw zzdkw, zzdkk zzdkk) {
        return !zzdkk.q.isEmpty();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object c(zzdkw zzdkw, zzdkk zzdkk, zzcqv zzcqv, Void voidR) throws Exception {
        return this.f7582b.a(zzdkw, zzdkk, zzcqv);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d(zzdkw zzdkw, zzdkk zzdkk, zzcqv zzcqv) throws Exception {
        this.f7582b.b(zzdkw, zzdkk, zzcqv);
    }
}
