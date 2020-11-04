package com.google.android.gms.location;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.internal.location.zzaf;
import com.google.android.gms.internal.location.zzaz;
import com.google.android.gms.internal.location.zzbk;
import com.google.android.gms.internal.location.zzq;

public class LocationServices {

    /* renamed from: a  reason: collision with root package name */
    private static final Api.ClientKey<zzaz> f10046a = new Api.ClientKey<>();

    /* renamed from: b  reason: collision with root package name */
    private static final Api.AbstractClientBuilder<zzaz, Api.ApiOptions.NoOptions> f10047b;

    public static abstract class zza<R extends Result> extends BaseImplementation.ApiMethodImpl<R, zzaz> {
    }

    static {
        b bVar = new b();
        f10047b = bVar;
        new Api("LocationServices.API", bVar, f10046a);
        new zzq();
        new zzaf();
        new zzbk();
    }

    private LocationServices() {
    }
}
