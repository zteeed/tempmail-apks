package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzddk implements zzddz<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final String f8084a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8085b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8086c;

    /* renamed from: d  reason: collision with root package name */
    private final String f8087d;

    /* renamed from: e  reason: collision with root package name */
    private final Long f8088e;

    public zzddk(String str, String str2, String str3, String str4, Long l) {
        this.f8084a = str;
        this.f8085b = str2;
        this.f8086c = str3;
        this.f8087d = str4;
        this.f8088e = l;
    }

    public final /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzdlf.e(bundle, "gmp_app_id", this.f8084a);
        zzdlf.e(bundle, "fbs_aiid", this.f8085b);
        zzdlf.e(bundle, "fbs_aeid", this.f8086c);
        zzdlf.e(bundle, "apm_id_origin", this.f8087d);
        Long l = this.f8088e;
        if (l != null) {
            bundle.putLong("sai_timeout", l.longValue());
        }
    }
}
