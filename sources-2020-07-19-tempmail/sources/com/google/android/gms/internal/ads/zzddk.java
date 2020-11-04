package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzddk implements zzddz<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final String f7901a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7902b;

    /* renamed from: c  reason: collision with root package name */
    private final String f7903c;

    /* renamed from: d  reason: collision with root package name */
    private final String f7904d;

    /* renamed from: e  reason: collision with root package name */
    private final Long f7905e;

    public zzddk(String str, String str2, String str3, String str4, Long l) {
        this.f7901a = str;
        this.f7902b = str2;
        this.f7903c = str3;
        this.f7904d = str4;
        this.f7905e = l;
    }

    public final /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzdlf.e(bundle, "gmp_app_id", this.f7901a);
        zzdlf.e(bundle, "fbs_aiid", this.f7902b);
        zzdlf.e(bundle, "fbs_aeid", this.f7903c);
        zzdlf.e(bundle, "apm_id_origin", this.f7904d);
        Long l = this.f7905e;
        if (l != null) {
            bundle.putLong("sai_timeout", l.longValue());
        }
    }
}
