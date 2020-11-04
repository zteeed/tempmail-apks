package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzehl;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public abstract class zzdwm<KeyFormatProtoT extends zzehl, KeyT> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<KeyFormatProtoT> f8426a;

    public zzdwm(Class<KeyFormatProtoT> cls) {
        this.f8426a = cls;
    }

    public final Class<KeyFormatProtoT> a() {
        return this.f8426a;
    }

    public abstract void b(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException;

    public abstract KeyT c(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException;

    public abstract KeyFormatProtoT d(zzeer zzeer) throws zzegl;
}
