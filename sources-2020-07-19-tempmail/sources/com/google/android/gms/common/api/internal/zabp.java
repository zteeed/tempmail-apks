package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.GoogleApi;

public final class zabp<O extends Api.ApiOptions> extends zaag {

    /* renamed from: b  reason: collision with root package name */
    private final GoogleApi<O> f2856b;

    public zabp(GoogleApi<O> googleApi) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f2856b = googleApi;
    }

    public final void h(zacm zacm) {
    }
}
