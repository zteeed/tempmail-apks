package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final /* synthetic */ class x3 implements zzbbc {

    /* renamed from: a  reason: collision with root package name */
    static final zzbbc f5277a = new x3();

    private x3() {
    }

    public final Object apply(Object obj) {
        IBinder iBinder = (IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
        if (queryLocalInterface instanceof zzauo) {
            return (zzauo) queryLocalInterface;
        }
        return new zzaun(iBinder);
    }
}
