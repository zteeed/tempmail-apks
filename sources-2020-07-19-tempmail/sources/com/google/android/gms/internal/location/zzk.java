package com.google.android.gms.internal.location;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;

public class zzk extends GmsClient<zzao> {

    /* renamed from: c  reason: collision with root package name */
    private final String f9346c;

    /* renamed from: d  reason: collision with root package name */
    protected final zzbj<zzao> f9347d = new g(this);

    public zzk(Context context, Looper looper, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, String str, ClientSettings clientSettings) {
        super(context, looper, 23, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.f9346c = str;
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof zzao ? (zzao) queryLocalInterface : new zzap(iBinder);
    }

    /* access modifiers changed from: protected */
    public Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.f9346c);
        return bundle;
    }

    public int getMinApkVersion() {
        return 11925000;
    }

    /* access modifiers changed from: protected */
    public String getServiceDescriptor() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    /* access modifiers changed from: protected */
    public String getStartServiceAction() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }
}
