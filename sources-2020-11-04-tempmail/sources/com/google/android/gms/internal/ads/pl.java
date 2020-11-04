package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class pl implements zzduu<zzdkw> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzcnp f4832a;

    pl(zzcnp zzcnp) {
        this.f4832a = zzcnp;
    }

    public final void a(Throwable th) {
        if (((Boolean) zzwg.e().c(zzaav.b3)).booleanValue()) {
            Matcher matcher = zzcnp.f7467f.matcher(th.getMessage());
            if (matcher.matches()) {
                this.f4832a.f7472e.e(Integer.parseInt(matcher.group(1)));
            }
        }
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        zzdkw zzdkw = (zzdkw) obj;
        if (((Boolean) zzwg.e().c(zzaav.b3)).booleanValue()) {
            this.f4832a.f7472e.e(zzdkw.f8345b.f8340b.f8324e);
            this.f4832a.f7472e.f(zzdkw.f8345b.f8340b.f8325f);
        }
    }
}
