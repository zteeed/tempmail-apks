package com.google.android.gms.common.internal.service;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;

public final class Common {
    @KeepForSdk

    /* renamed from: a  reason: collision with root package name */
    public static final Api.ClientKey<zai> f3059a = new Api.ClientKey<>();

    /* renamed from: b  reason: collision with root package name */
    private static final Api.AbstractClientBuilder<zai, Api.ApiOptions.NoOptions> f3060b;

    static {
        a aVar = new a();
        f3060b = aVar;
        new Api("Common.API", aVar, f3059a);
        new zad();
    }
}
