package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzczc implements zzddz<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final zzdla f7730a;

    public zzczc(zzdla zzdla) {
        Preconditions.l(zzdla, "the targeting must not be null");
        this.f7730a = zzdla;
    }

    public final /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzdla zzdla = this.f7730a;
        zzve zzve = zzdla.f8166d;
        bundle.putString("slotname", zzdla.f8168f);
        boolean z = true;
        int i = fr.f3830a[this.f7730a.n.f8143a - 1];
        if (i == 1) {
            bundle.putBoolean("is_new_rewarded", true);
        } else if (i == 2) {
            bundle.putBoolean("is_rewarded_interstitial", true);
        }
        zzdlf.f(bundle, "cust_age", new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(zzve.f9184c)), zzve.f9184c != -1);
        zzdlf.b(bundle, "extras", zzve.f9185d);
        zzdlf.d(bundle, "cust_gender", Integer.valueOf(zzve.f9186e), zzve.f9186e != -1);
        zzdlf.g(bundle, "kw", zzve.f9187f);
        zzdlf.d(bundle, "tag_for_child_directed_treatment", Integer.valueOf(zzve.h), zzve.h != -1);
        boolean z2 = zzve.g;
        if (z2) {
            bundle.putBoolean("test_request", z2);
        }
        zzdlf.d(bundle, "d_imp_hdr", 1, zzve.f9183b >= 2 && zzve.i);
        String str = zzve.j;
        zzdlf.f(bundle, "ppid", str, zzve.f9183b >= 2 && !TextUtils.isEmpty(str));
        Location location = zzve.l;
        if (location != null) {
            Float valueOf = Float.valueOf(location.getAccuracy() * 1000.0f);
            Long valueOf2 = Long.valueOf(location.getTime() * 1000);
            Long valueOf3 = Long.valueOf((long) (location.getLatitude() * 1.0E7d));
            Long valueOf4 = Long.valueOf((long) (location.getLongitude() * 1.0E7d));
            Bundle bundle2 = new Bundle();
            bundle2.putFloat("radius", valueOf.floatValue());
            bundle2.putLong("lat", valueOf3.longValue());
            bundle2.putLong("long", valueOf4.longValue());
            bundle2.putLong("time", valueOf2.longValue());
            bundle.putBundle("uule", bundle2);
        }
        zzdlf.e(bundle, "url", zzve.m);
        zzdlf.g(bundle, "neighboring_content_urls", zzve.w);
        zzdlf.b(bundle, "custom_targeting", zzve.o);
        zzdlf.g(bundle, "category_exclusions", zzve.p);
        zzdlf.e(bundle, "request_agent", zzve.q);
        zzdlf.e(bundle, "request_pkg", zzve.r);
        zzdlf.c(bundle, "is_designed_for_families", Boolean.valueOf(zzve.s), zzve.f9183b >= 7);
        if (zzve.f9183b >= 8) {
            Integer valueOf5 = Integer.valueOf(zzve.u);
            if (zzve.u == -1) {
                z = false;
            }
            zzdlf.d(bundle, "tag_for_under_age_of_consent", valueOf5, z);
            zzdlf.e(bundle, "max_ad_content_rating", zzve.v);
        }
    }
}
