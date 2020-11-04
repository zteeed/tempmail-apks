package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class nl implements zzduu<zzdkw> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzcni f4678a;

    nl(zzcni zzcni) {
        this.f4678a = zzcni;
    }

    public final void a(Throwable th) {
        if (((Boolean) zzwg.e().c(zzaav.b3)).booleanValue()) {
            Matcher matcher = zzcni.g.matcher(th.getMessage());
            if (matcher.matches()) {
                this.f4678a.f7466f.e(Integer.parseInt(matcher.group(1)));
            }
        }
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        zzdkw zzdkw = (zzdkw) obj;
        if (((Boolean) zzwg.e().c(zzaav.b3)).booleanValue()) {
            this.f4678a.f7466f.e(zzdkw.f8345b.f8340b.f8324e);
            this.f4678a.f7466f.f(zzdkw.f8345b.f8340b.f8325f);
        }
    }
}
