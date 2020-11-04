package com.google.android.gms.common.internal;

import android.os.IInterface;
import com.google.android.gms.common.ConnectionResult;

@Deprecated
public abstract class LegacyInternalGmsClient<T extends IInterface> extends GmsClient<T> {

    /* renamed from: c  reason: collision with root package name */
    private final GmsClientEventManager f3201c;

    public void checkAvailabilityAndConnect() {
        this.f3201c.b();
        super.checkAvailabilityAndConnect();
    }

    public void disconnect() {
        this.f3201c.a();
        super.disconnect();
    }

    public int getMinApkVersion() {
        return super.getMinApkVersion();
    }

    public void onConnectedLocked(T t) {
        super.onConnectedLocked(t);
        this.f3201c.d(getConnectionHint());
    }

    public void onConnectionFailed(ConnectionResult connectionResult) {
        super.onConnectionFailed(connectionResult);
        this.f3201c.c(connectionResult);
    }

    public void onConnectionSuspended(int i) {
        super.onConnectionSuspended(i);
        this.f3201c.e(i);
    }
}
