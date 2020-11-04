package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzehl;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class q10<KeyFormatProtoT extends zzehl, KeyProtoT extends zzehl> {

    /* renamed from: a  reason: collision with root package name */
    private final zzdwm<KeyFormatProtoT, KeyProtoT> f4678a;

    q10(zzdwm<KeyFormatProtoT, KeyProtoT> zzdwm) {
        this.f4678a = zzdwm;
    }

    /* access modifiers changed from: package-private */
    public final KeyProtoT a(zzeer zzeer) throws GeneralSecurityException, zzegl {
        KeyFormatProtoT d2 = this.f4678a.d(zzeer);
        this.f4678a.b(d2);
        return (zzehl) this.f4678a.c(d2);
    }
}