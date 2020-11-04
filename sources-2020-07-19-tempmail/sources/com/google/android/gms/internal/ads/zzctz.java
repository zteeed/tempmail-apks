package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzctz<AdT> implements zzduh<zzdkw, AdT> {

    /* renamed from: a  reason: collision with root package name */
    private final zzdou f7536a;

    /* renamed from: b  reason: collision with root package name */
    private final zzbso f7537b;

    /* renamed from: c  reason: collision with root package name */
    private final zzdpd f7538c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f7539d;

    /* renamed from: e  reason: collision with root package name */
    private final ScheduledExecutorService f7540e;

    /* renamed from: f  reason: collision with root package name */
    private final zzbpc<AdT> f7541f;
    private final zzcts g;

    public zzctz(zzdou zzdou, zzcts zzcts, zzbso zzbso, zzdpd zzdpd, zzbpc<AdT> zzbpc, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f7536a = zzdou;
        this.g = zzcts;
        this.f7537b = zzbso;
        this.f7538c = zzdpd;
        this.f7541f = zzbpc;
        this.f7539d = executor;
        this.f7540e = scheduledExecutorService;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvf b(zzdkw zzdkw, zzdkk zzdkk, zzcqt zzcqt, Throwable th) throws Exception {
        zzcts zzcts = this.g;
        zzdkm zzdkm = zzdkw.f8162b.f8157b;
        zzdvf d2 = zzdux.d(zzcqt.a(zzdkw, zzdkk), (long) zzdkk.J, TimeUnit.MILLISECONDS, this.f7540e);
        zzcts.b(zzdkm, zzdkk, d2);
        return d2;
    }

    public final /* synthetic */ zzdvf zzf(Object obj) throws Exception {
        zzdkw zzdkw = (zzdkw) obj;
        zzdod<E, I> f2 = this.f7536a.g(zzdor.RENDER_CONFIG_INIT).d(zzdux.a(new zzctw(zzdls.f8182c, "No ad config."))).f();
        this.f7537b.p0(new zzbll(zzdkw, this.f7538c), this.f7539d);
        int i = 0;
        for (zzdkk next : zzdkw.f8162b.f8156a) {
            Iterator<String> it = next.f8131a.iterator();
            while (true) {
                if (it.hasNext()) {
                    String next2 = it.next();
                    zzcqt<AdT> a2 = this.f7541f.a(next.f8132b, next2);
                    if (a2 != null && a2.b(zzdkw, next)) {
                        zzdom<I> b2 = this.f7536a.b(zzdor.RENDER_CONFIG_WATERFALL, f2);
                        StringBuilder sb = new StringBuilder(String.valueOf(next2).length() + 26);
                        sb.append("render-config-");
                        sb.append(i);
                        sb.append("-");
                        sb.append(next2);
                        f2 = b2.i(sb.toString()).e(Throwable.class, new to(this, zzdkw, next, a2)).f();
                        break;
                    }
                } else {
                    break;
                }
            }
            i++;
        }
        return f2;
    }
}
