package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.zzacb;
import com.google.android.gms.internal.ads.zzbba;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.internal.ads.zzddt;
import com.google.android.gms.internal.ads.zzve;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class zzo {
    private final String zzbpg;
    private final Map<String, String> zzbph = new TreeMap();
    private String zzbpi;
    private String zzbpj;
    private final Context zzvr;

    public zzo(Context context, String str) {
        this.zzvr = context.getApplicationContext();
        this.zzbpg = str;
    }

    public final String getQuery() {
        return this.zzbpi;
    }

    public final void zza(zzve zzve, zzbbd zzbbd) {
        this.zzbpi = zzve.k.f9459b;
        Bundle bundle = zzve.n;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 != null) {
            String a2 = zzacb.f5754c.a();
            for (String str : bundle2.keySet()) {
                if (a2.equals(str)) {
                    this.zzbpj = bundle2.getString(str);
                } else if (str.startsWith("csa_")) {
                    this.zzbph.put(str.substring(4), bundle2.getString(str));
                }
            }
            this.zzbph.put("SDKVersion", zzbbd.f6314b);
            if (zzacb.f5752a.a().booleanValue()) {
                try {
                    Bundle a3 = zzddt.a(this.zzvr, new JSONArray(zzacb.f5753b.a()));
                    for (String str2 : a3.keySet()) {
                        this.zzbph.put(str2, a3.get(str2).toString());
                    }
                } catch (JSONException e2) {
                    zzbba.c("Flag gads:afs:csa_tcf_data_to_collect not a valid JSON array", e2);
                }
            }
        }
    }

    public final String zzko() {
        return this.zzbpj;
    }

    public final String zzkp() {
        return this.zzbpg;
    }

    public final Map<String, String> zzkq() {
        return this.zzbph;
    }
}
