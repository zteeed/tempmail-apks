package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class pl implements zzduu<zzdkw> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzcnp f4649a;

    pl(zzcnp zzcnp) {
        this.f4649a = zzcnp;
    }

    public final void a(Throwable th) {
        if (((Boolean) zzwg.e().c(zzaav.b3)).booleanValue()) {
            Matcher matcher = zzcnp.f7284f.matcher(th.getMessage());
            if (matcher.matches()) {
                this.f4649a.f7289e.e(Integer.parseInt(matcher.group(1)));
            }
        }
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        zzdkw zzdkw = (zzdkw) obj;
        if (((Boolean) zzwg.e().c(zzaav.b3)).booleanValue()) {
            this.f4649a.f7289e.e(zzdkw.f8162b.f8157b.f8141e);
            this.f4649a.f7289e.f(zzdkw.f8162b.f8157b.f8142f);
        }
    }
}
