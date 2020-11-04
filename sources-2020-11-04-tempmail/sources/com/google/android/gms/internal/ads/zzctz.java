package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzctz<AdT> implements zzduh<zzdkw, AdT> {

    /* renamed from: a  reason: collision with root package name */
    private final zzdou f7719a;

    /* renamed from: b  reason: collision with root package name */
    private final zzbso f7720b;

    /* renamed from: c  reason: collision with root package name */
    private final zzdpd f7721c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f7722d;

    /* renamed from: e  reason: collision with root package name */
    private final ScheduledExecutorService f7723e;

    /* renamed from: f  reason: collision with root package name */
    private final zzbpc<AdT> f7724f;
    private final zzcts g;

    public zzctz(zzdou zzdou, zzcts zzcts, zzbso zzbso, zzdpd zzdpd, zzbpc<AdT> zzbpc, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f7719a = zzdou;
        this.g = zzcts;
        this.f7720b = zzbso;
        this.f7721c = zzdpd;
        this.f7724f = zzbpc;
        this.f7722d = executor;
        this.f7723e = scheduledExecutorService;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvf b(zzdkw zzdkw, zzdkk zzdkk, zzcqt zzcqt, Throwable th) throws Exception {
        zzcts zzcts = this.g;
        zzdkm zzdkm = zzdkw.f8345b.f8340b;
        zzdvf d2 = zzdux.d(zzcqt.a(zzdkw, zzdkk), (long) zzdkk.J, TimeUnit.MILLISECONDS, this.f7723e);
        zzcts.b(zzdkm, zzdkk, d2);
        return d2;
    }

    public final /* synthetic */ zzdvf zzf(Object obj) throws Exception {
        zzdkw zzdkw = (zzdkw) obj;
        zzdod<E, I> f2 = this.f7719a.g(zzdor.RENDER_CONFIG_INIT).d(zzdux.a(new zzctw(zzdls.f8365c, "No ad config."))).f();
        this.f7720b.p0(new zzbll(zzdkw, this.f7721c), this.f7722d);
        int i = 0;
        for (zzdkk next : zzdkw.f8345b.f8339a) {
            Iterator<String> it = next.f8314a.iterator();
            while (true) {
                if (it.hasNext()) {
                    String next2 = it.next();
                    zzcqt<AdT> a2 = this.f7724f.a(next.f8315b, next2);
                    if (a2 != null && a2.b(zzdkw, next)) {
                        zzdom<I> b2 = this.f7719a.b(zzdor.RENDER_CONFIG_WATERFALL, f2);
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
