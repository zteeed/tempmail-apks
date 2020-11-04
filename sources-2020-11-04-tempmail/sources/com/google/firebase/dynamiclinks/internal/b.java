package com.google.firebase.dynamiclinks.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;

/* compiled from: com.google.firebase:firebase-dynamic-links@@19.1.0 */
final class b extends Api.AbstractClientBuilder<d, Api.ApiOptions.NoOptions> {
    b() {
    }

    public final /* synthetic */ Api.Client b(Context context, Looper looper, ClientSettings clientSettings, Object obj, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Api.ApiOptions.NoOptions noOptions = (Api.ApiOptions.NoOptions) obj;
        return new d(context, looper, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }
}
