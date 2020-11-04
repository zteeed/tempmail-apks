package com.google.android.gms.common.internal.service;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;

public final class Common {
    @KeepForSdk

    /* renamed from: a  reason: collision with root package name */
    public static final Api.ClientKey<zai> f3242a = new Api.ClientKey<>();

    /* renamed from: b  reason: collision with root package name */
    private static final Api.AbstractClientBuilder<zai, Api.ApiOptions.NoOptions> f3243b;

    static {
        a aVar = new a();
        f3243b = aVar;
        new Api("Common.API", aVar, f3242a);
        new zad();
    }
}
