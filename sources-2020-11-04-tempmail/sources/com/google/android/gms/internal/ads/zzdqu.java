package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
public final class zzdqu extends zzb<zzdqx> {

    /* renamed from: a  reason: collision with root package name */
    private final int f8507a;

    public zzdqu(Context context, Looper looper, BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener, int i) {
        super(context, looper, 116, baseConnectionCallbacks, baseOnConnectionFailedListener, (String) null);
        this.f8507a = i;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        if (queryLocalInterface instanceof zzdqx) {
            return (zzdqx) queryLocalInterface;
        }
        return new zzdra(iBinder);
    }

    public final zzdqx e() throws DeadObjectException {
        return (zzdqx) super.getService();
    }

    public final int getMinApkVersion() {
        return this.f8507a;
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.gass.START";
    }
}
