package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class cr implements zzduh {

    /* renamed from: a  reason: collision with root package name */
    private final zzasm f3758a;

    cr(zzasm zzasm) {
        this.f3758a = zzasm;
    }

    public final zzdvf zzf(Object obj) {
        zzasm zzasm = this.f3758a;
        zzcyv zzcyv = new zzcyv(new JsonReader(new InputStreamReader((InputStream) obj)));
        zzcyv.a(zzasm.f6092b);
        return zzdux.g(zzcyv);
    }
}
