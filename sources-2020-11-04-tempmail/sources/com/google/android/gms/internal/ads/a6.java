package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class a6 extends zzbh {
    private final /* synthetic */ byte[] q;
    private final /* synthetic */ Map r;
    private final /* synthetic */ zzbau s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    a6(zzazq zzazq, int i, String str, zzal zzal, zzai zzai, byte[] bArr, Map map, zzbau zzbau) {
        super(i, str, zzal, zzai);
        this.q = bArr;
        this.r = map;
        this.s = zzbau;
    }

    public final byte[] H() throws zzl {
        byte[] bArr = this.q;
        return bArr == null ? super.H() : bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public final void r(String str) {
        this.s.p(str);
        super.r(str);
    }

    public final Map<String, String> f() throws zzl {
        Map<String, String> map = this.r;
        return map == null ? super.f() : map;
    }
}
