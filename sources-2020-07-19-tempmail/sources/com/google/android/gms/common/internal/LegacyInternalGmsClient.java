package com.google.android.gms.common.internal;

import android.os.IInterface;
import com.google.android.gms.common.ConnectionResult;

@Deprecated
public abstract class LegacyInternalGmsClient<T extends IInterface> extends GmsClient<T> {

    /* renamed from: c  reason: collision with root package name */
    private final GmsClientEventManager f3015c;

    public void checkAvailabilityAndConnect() {
        this.f3015c.b();
        super.checkAvailabilityAndConnect();
    }

    public void disconnect() {
        this.f3015c.a();
        super.disconnect();
    }

    public int getMinApkVersion() {
        return super.getMinApkVersion();
    }

    public void onConnectedLocked(T t) {
        super.onConnectedLocked(t);
        this.f3015c.d(getConnectionHint());
    }

    public void onConnectionFailed(ConnectionResult connectionResult) {
        super.onConnectionFailed(connectionResult);
        this.f3015c.c(connectionResult);
    }

    public void onConnectionSuspended(int i) {
        super.onConnectionSuspended(i);
        this.f3015c.e(i);
    }
}
