package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzazf extends zzau {

    /* renamed from: d  reason: collision with root package name */
    private final Context f6069d;

    private zzazf(Context context, zzar zzar) {
        super(zzar);
        this.f6069d = context;
    }

    public static zzae d(Context context) {
        zzae zzae = new zzae(new zzav(new File(context.getCacheDir(), "admob_volley"), 20971520), new zzazf(context, new zzbd()));
        zzae.a();
        return zzae;
    }

    public final zzy a(zzaa<?> zzaa) throws zzao {
        if (zzaa.I() && zzaa.g() == 0) {
            if (Pattern.matches((String) zzwg.e().c(zzaav.T1), zzaa.h())) {
                zzwg.a();
                if (zzbaq.t(this.f6069d, 13400000)) {
                    zzy a2 = new zzahw(this.f6069d).a(zzaa);
                    if (a2 != null) {
                        String valueOf = String.valueOf(zzaa.h());
                        zzaxv.m(valueOf.length() != 0 ? "Got gmscore asset response: ".concat(valueOf) : new String("Got gmscore asset response: "));
                        return a2;
                    }
                    String valueOf2 = String.valueOf(zzaa.h());
                    zzaxv.m(valueOf2.length() != 0 ? "Failed to get gmscore asset response: ".concat(valueOf2) : new String("Failed to get gmscore asset response: "));
                }
            }
        }
        return super.a(zzaa);
    }
}
