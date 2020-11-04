package com.google.android.gms.location;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.internal.location.zzaz;
import com.google.android.gms.internal.location.zze;

public class ActivityRecognition {

    /* renamed from: a  reason: collision with root package name */
    private static final Api.ClientKey<zzaz> f9825a = new Api.ClientKey<>();

    /* renamed from: b  reason: collision with root package name */
    private static final Api.AbstractClientBuilder<zzaz, Api.ApiOptions.NoOptions> f9826b;

    public static abstract class zza<R extends Result> extends BaseImplementation.ApiMethodImpl<R, zzaz> {
    }

    static {
        a aVar = new a();
        f9826b = aVar;
        new Api("ActivityRecognition.API", aVar, f9825a);
        new zze();
    }

    private ActivityRecognition() {
    }
}
