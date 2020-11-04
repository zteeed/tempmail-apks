package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcni extends zzcng {
    /* access modifiers changed from: private */
    public static final Pattern g = Pattern.compile("Received error HTTP response code: (.*)");

    /* renamed from: b  reason: collision with root package name */
    private final zzcml f7279b;

    /* renamed from: c  reason: collision with root package name */
    private final zzdvi f7280c;

    /* renamed from: d  reason: collision with root package name */
    private final zzdla f7281d;

    /* renamed from: e  reason: collision with root package name */
    private final ScheduledExecutorService f7282e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final zzcqf f7283f;

    zzcni(zzbuv zzbuv, zzdla zzdla, zzcml zzcml, zzdvi zzdvi, ScheduledExecutorService scheduledExecutorService, zzcqf zzcqf) {
        super(zzbuv);
        this.f7281d = zzdla;
        this.f7279b = zzcml;
        this.f7280c = zzdvi;
        this.f7282e = scheduledExecutorService;
        this.f7283f = zzcqf;
    }

    public final zzdvf<zzdkw> c(zzasm zzasm) throws zzcmi {
        zzdvf<zzdkw> j = zzdux.j(this.f7279b.b(zzasm), new ml(this), this.f7280c);
        if (((Boolean) zzwg.e().c(zzaav.x2)).booleanValue()) {
            j = zzdux.k(zzdux.d(j, (long) ((Integer) zzwg.e().c(zzaav.y2)).intValue(), TimeUnit.SECONDS, this.f7282e), TimeoutException.class, ll.f4317a, zzbbf.f6142f);
        }
        zzdux.f(j, new nl(this), zzbbf.f6142f);
        return j;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvf f(InputStream inputStream) throws Exception {
        return zzdux.g(new zzdkw(new zzdkr(this.f7281d), zzdku.a(new InputStreamReader(inputStream))));
    }
}
