package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public abstract class zzctn<AdT> implements zzcqt<AdT> {
    private static Bundle d(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    public final zzdvf<AdT> a(zzdkw zzdkw, zzdkk zzdkk) {
        zzdkk zzdkk2 = zzdkk;
        String optString = zzdkk2.s.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        zzdla zzdla = zzdkw.f8161a.f8149a;
        zzdlc zzdlc = new zzdlc();
        zzdlc.n(zzdla);
        zzdlc.y(optString);
        Bundle d2 = d(zzdla.f8166d.n);
        Bundle d3 = d(d2.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        d3.putInt("gw", 1);
        String optString2 = zzdkk2.s.optString("mad_hac", (String) null);
        if (optString2 != null) {
            d3.putString("mad_hac", optString2);
        }
        String optString3 = zzdkk2.s.optString("adJson", (String) null);
        if (optString3 != null) {
            d3.putString("_ad", optString3);
        }
        d3.putBoolean("_noRefresh", true);
        Iterator<String> keys = zzdkk2.A.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString4 = zzdkk2.A.optString(next, (String) null);
            if (next != null) {
                d3.putString(next, optString4);
            }
        }
        d2.putBundle("com.google.ads.mediation.admob.AdMobAdapter", d3);
        zzve zzve = zzdla.f8166d;
        zzve zzve2 = r5;
        zzve zzve3 = new zzve(zzve.f9183b, zzve.f9184c, d3, zzve.f9186e, zzve.f9187f, zzve.g, zzve.h, zzve.i, zzve.j, zzve.k, zzve.l, zzve.m, d2, zzve.o, zzve.p, zzve.q, zzve.r, zzve.s, zzve.t, zzve.u, zzve.v, zzve.w);
        zzdlc.A(zzve2);
        zzdla e2 = zzdlc.e();
        Bundle bundle = new Bundle();
        zzdkw zzdkw2 = zzdkw;
        zzdkm zzdkm = zzdkw2.f8162b.f8157b;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList(zzdkm.f8137a));
        bundle2.putInt("refresh_interval", zzdkm.f8139c);
        bundle2.putString("gws_query_id", zzdkm.f8138b);
        bundle.putBundle("parent_common_config", bundle2);
        String str = zzdkw2.f8161a.f8149a.f8168f;
        Bundle bundle3 = new Bundle();
        bundle3.putString("initial_ad_unit_id", str);
        zzdkk zzdkk3 = zzdkk;
        bundle3.putString("allocation_id", zzdkk3.t);
        bundle3.putStringArrayList("click_urls", new ArrayList(zzdkk3.f8133c));
        bundle3.putStringArrayList("imp_urls", new ArrayList(zzdkk3.f8134d));
        bundle3.putStringArrayList("manual_tracking_urls", new ArrayList(zzdkk3.n));
        bundle3.putStringArrayList("fill_urls", new ArrayList(zzdkk3.m));
        bundle3.putStringArrayList("video_start_urls", new ArrayList(zzdkk3.g));
        bundle3.putStringArrayList("video_reward_urls", new ArrayList(zzdkk3.h));
        bundle3.putStringArrayList("video_complete_urls", new ArrayList(zzdkk3.i));
        bundle3.putString("transaction_id", zzdkk3.j);
        bundle3.putString("valid_from_timestamp", zzdkk3.k);
        bundle3.putBoolean("is_closable_area_disabled", zzdkk3.H);
        if (zzdkk3.l != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("rb_amount", zzdkk3.l.f5962c);
            bundle4.putString("rb_type", zzdkk3.l.f5961b);
            bundle3.putParcelableArray("rewards", new Bundle[]{bundle4});
        }
        bundle.putBundle("parent_ad_config", bundle3);
        return c(e2, bundle);
    }

    public final boolean b(zzdkw zzdkw, zzdkk zzdkk) {
        return !TextUtils.isEmpty(zzdkk.s.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    /* access modifiers changed from: protected */
    public abstract zzdvf<AdT> c(zzdla zzdla, Bundle bundle);
}
