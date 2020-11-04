package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcnp implements zzcom {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final Pattern f7284f = Pattern.compile("Received error HTTP response code: (.*)");

    /* renamed from: a  reason: collision with root package name */
    private final zzcml f7285a;

    /* renamed from: b  reason: collision with root package name */
    private final zzdvi f7286b;

    /* renamed from: c  reason: collision with root package name */
    private final zzdla f7287c;

    /* renamed from: d  reason: collision with root package name */
    private final ScheduledExecutorService f7288d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final zzcqf f7289e;

    zzcnp(zzdla zzdla, zzcml zzcml, zzdvi zzdvi, ScheduledExecutorService scheduledExecutorService, zzcqf zzcqf) {
        this.f7287c = zzdla;
        this.f7285a = zzcml;
        this.f7286b = zzdvi;
        this.f7288d = scheduledExecutorService;
        this.f7289e = zzcqf;
    }

    public final zzdvf<zzdkw> a(zzasm zzasm) {
        zzdvf<zzdkw> j = zzdux.j(this.f7285a.b(zzasm), new ol(this), this.f7286b);
        if (((Boolean) zzwg.e().c(zzaav.x2)).booleanValue()) {
            j = zzdux.k(zzdux.d(j, (long) ((Integer) zzwg.e().c(zzaav.y2)).intValue(), TimeUnit.SECONDS, this.f7288d), TimeoutException.class, ql.f4740a, zzbbf.f6142f);
        }
        zzdux.f(j, new pl(this), zzbbf.f6142f);
        return j;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvf d(InputStream inputStream) throws Exception {
        return zzdux.g(new zzdkw(new zzdkr(this.f7287c), zzdku.a(new InputStreamReader(inputStream))));
    }
}
