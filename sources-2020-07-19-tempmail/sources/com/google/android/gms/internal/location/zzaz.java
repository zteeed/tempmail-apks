package com.google.android.gms.internal.location;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import javax.annotation.Nullable;

public final class zzaz extends zzk {

    /* renamed from: e  reason: collision with root package name */
    private final zzas f9330e;

    public zzaz(Context context, Looper looper, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, String str) {
        this(context, looper, connectionCallbacks, onConnectionFailedListener, str, ClientSettings.a(context));
    }

    public zzaz(Context context, Looper looper, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, String str, @Nullable ClientSettings clientSettings) {
        super(context, looper, connectionCallbacks, onConnectionFailedListener, str, clientSettings);
        this.f9330e = new zzas(context, this.f9347d);
    }

    public final void disconnect() {
        synchronized (this.f9330e) {
            if (isConnected()) {
                try {
                    this.f9330e.a();
                    this.f9330e.c();
                } catch (Exception e2) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e2);
                }
            }
            super.disconnect();
        }
    }
}
