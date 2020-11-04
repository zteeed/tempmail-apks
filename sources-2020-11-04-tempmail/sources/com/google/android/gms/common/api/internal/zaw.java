package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zad;

public final class zaw<O extends Api.ApiOptions> extends GoogleApi<O> {
    private final Api.Client i;
    private final zaq j;
    private final ClientSettings k;
    private final Api.AbstractClientBuilder<? extends zad, SignInOptions> l;

    public zaw(Context context, Api<O> api, Looper looper, Api.Client client, zaq zaq, ClientSettings clientSettings, Api.AbstractClientBuilder<? extends zad, SignInOptions> abstractClientBuilder) {
        super(context, api, looper);
        this.i = client;
        this.j = zaq;
        this.k = clientSettings;
        this.l = abstractClientBuilder;
        this.h.e(this);
    }

    public final Api.Client f(Looper looper, GoogleApiManager.zaa<O> zaa) {
        this.j.a(zaa);
        return this.i;
    }

    public final zace h(Context context, Handler handler) {
        return new zace(context, handler, this.k, this.l);
    }

    public final Api.Client k() {
        return this.i;
    }
}
