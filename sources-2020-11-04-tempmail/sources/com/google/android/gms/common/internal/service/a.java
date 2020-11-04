package com.google.android.gms.common.internal.service;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;

final class a extends Api.AbstractClientBuilder<zai, Api.ApiOptions.NoOptions> {
    a() {
    }

    public final /* synthetic */ Api.Client b(Context context, Looper looper, ClientSettings clientSettings, Object obj, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return new zai(context, looper, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }
}
