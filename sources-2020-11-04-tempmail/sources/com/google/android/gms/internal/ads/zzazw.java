package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzazw extends zzaa<zzy> {
    private final zzbbn<zzy> o;
    private final zzbau p;

    public zzazw(String str, zzbbn<zzy> zzbbn) {
        this(str, (Map<String, String>) null, zzbbn);
    }

    /* access modifiers changed from: protected */
    public final zzaj<zzy> o(zzy zzy) {
        return zzaj.a(zzy, zzbc.a(zzy));
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void r(Object obj) {
        zzy zzy = (zzy) obj;
        this.p.j(zzy.f9409c, zzy.f9407a);
        zzbau zzbau = this.p;
        byte[] bArr = zzy.f9408b;
        if (zzbau.a() && bArr != null) {
            zzbau.s(bArr);
        }
        this.o.a(zzy);
    }

    private zzazw(String str, Map<String, String> map, zzbbn<zzy> zzbbn) {
        super(0, str, new d6(zzbbn));
        this.o = zzbbn;
        zzbau zzbau = new zzbau();
        this.p = zzbau;
        zzbau.f(str, "GET", (Map<String, ?>) null, (byte[]) null);
    }
}
