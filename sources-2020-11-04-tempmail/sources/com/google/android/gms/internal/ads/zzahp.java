package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzahp extends zzb<zzahu> {
    zzahp(Context context, Looper looper, BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        super(zzatd.c(context), looper, 166, baseConnectionCallbacks, baseOnConnectionFailedListener, (String) null);
    }

    /* access modifiers changed from: protected */
    @VisibleForTesting
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
        if (queryLocalInterface instanceof zzahu) {
            return (zzahu) queryLocalInterface;
        }
        return new zzahx(iBinder);
    }

    public final zzahu e() throws DeadObjectException {
        return (zzahu) super.getService();
    }

    /* access modifiers changed from: protected */
    @VisibleForTesting
    public final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
    }

    /* access modifiers changed from: protected */
    @VisibleForTesting
    public final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.HTTP";
    }
}
