package com.google.android.gms.signin;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.signin.internal.SignInClientImpl;

final class a extends Api.AbstractClientBuilder<SignInClientImpl, SignInOptions> {
    a() {
    }

    public final /* synthetic */ Api.Client b(Context context, Looper looper, ClientSettings clientSettings, Object obj, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        SignInOptions signInOptions = (SignInOptions) obj;
        if (signInOptions == null) {
            signInOptions = SignInOptions.j;
        }
        return new SignInClientImpl(context, looper, true, clientSettings, signInOptions, connectionCallbacks, onConnectionFailedListener);
    }
}
