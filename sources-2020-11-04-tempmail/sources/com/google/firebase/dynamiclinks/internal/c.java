package com.google.firebase.dynamiclinks.internal;

import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.firebase:firebase-dynamic-links@@19.1.0 */
public final class c extends GoogleApi<Api.ApiOptions.NoOptions> {
    private static final Api.ClientKey<d> i = new Api.ClientKey<>();
    private static final Api.AbstractClientBuilder<d, Api.ApiOptions.NoOptions> j;
    private static final Api<Api.ApiOptions.NoOptions> k;

    static {
        b bVar = new b();
        j = bVar;
        k = new Api<>("DynamicLinks.API", bVar, i);
    }

    @VisibleForTesting
    public c(Context context) {
        super(context, k, null, GoogleApi.Settings.f2881c);
    }
}
